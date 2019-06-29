package com.mypurecloud.sdk.v2;

import com.mypurecloud.sdk.v2.api.PresenceApi;
import com.mypurecloud.sdk.v2.api.UsersApi;
import com.mypurecloud.sdk.v2.extensions.AuthResponse;
import com.mypurecloud.sdk.v2.extensions.notifications.NotificationHandler;
import com.mypurecloud.sdk.v2.model.*;
import com.mypurecloud.sdk.v2.PureCloudRegionHosts;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public class SdkTests {
    private ApiClient apiClient;
    UsersApi usersApi;
    PresenceApi presenceApi;

    private String userId;
    private String userEmail;
    private String userName = "Java SDK Tester";
    private String userDepartment = "Ministry of Testing";
    private String userProfileSkill = "Testmaster";
    private String busyPresenceId = "31fe3bac-dea6-44b7-bed7-47f91660a1a0";
    private String availablePresenceId = "6a3af858-942f-489d-9700-5f9bcdcdae9b";
    private String environment;
    private PureCloudRegionHosts region;
    private boolean useenum = true;


    @BeforeTest
    public void beforeTest() {
        System.out.println("Before test");
    }



    @Test(priority = 1)
    public void traceBasicInformation() {
        region = getEnvironment();
        if(region == null){
            useenum = false;
        }
        System.out.println("PURECLOUD_ENVIRONMENT=" + environment);
        Assert.assertNotNull(environment);

        System.out.println("PURECLOUD_CLIENT_ID=" + getClientId());
        Assert.assertNotNull(getClientId());

        Assert.assertNotNull(getClientSecret());

        userEmail = UUID.randomUUID() + "@" + environment;
        System.out.println("userEmail=" + userEmail);
    }

    @Test(priority = 2)
    public void authenticate() {
        try {
            ApiClient.Builder builder = ApiClient.Builder.standard();
            if(useenum){
                builder = builder.withBasePath(region); 
            }
            else {
                builder = builder.withBasePath("https://api." + environment);
            }

            apiClient = builder.build();

            ApiResponse<AuthResponse> authResponse = apiClient.authorizeClientCredentials(getClientId(), getClientSecret());

            Configuration.setDefaultApiClient(apiClient);

            Assert.assertNotNull(authResponse.getBody().getAccess_token());

            usersApi = new UsersApi();
            presenceApi = new PresenceApi();
        } catch (ApiException ex) {
            handleApiException(ex);
        } catch (Exception ex) {
            System.out.println(ex);
            Assert.fail();
        }
    }

    @Test(priority = 3)
    public void createUser() {
        try {
            CreateUser newUser = new CreateUser();
            newUser.name(userName).email(userEmail).password(UUID.randomUUID() + "!@#$1234asdfASDF");
            User user = usersApi.postUsers(newUser);
            userId = user.getId();
            Assert.assertEquals(user.getName(), userName);
            Assert.assertEquals(user.getEmail(), userEmail);

            System.out.println("Created user with ID " + userId);
        } catch (ApiException ex) {
            handleApiException(ex);
        } catch (Exception ex) {
            System.out.println(ex);
            Assert.fail();
        }
    }

    @Test(priority = 4)
    public void updateUser() {
        try {
            UpdateUser updateUser = new UpdateUser();
            updateUser.department(userDepartment).version(1);

            User user = usersApi.patchUser(userId, updateUser);

            Assert.assertEquals(user.getId(), userId);
            Assert.assertEquals(user.getName(), userName);
            Assert.assertEquals(user.getEmail(), userEmail);
            Assert.assertEquals(user.getDepartment(), userDepartment);
        } catch (ApiException ex) {
            handleApiException(ex);
        } catch (Exception ex) {
            System.out.println(ex);
            Assert.fail();
        }
    }

    @Test(priority = 5)
    public void setProfileSkills() {
        try {
            List<String> skills = usersApi.putUserProfileskills(userId, Collections.singletonList(userProfileSkill));

            Assert.assertEquals(skills.size(), 1);
            Assert.assertEquals(skills.get(0), userProfileSkill);
        } catch (ApiException ex) {
            handleApiException(ex);
        } catch (Exception ex) {
            System.out.println(ex);
            Assert.fail();
        }
    }

    @Test(priority = 6)
    public void testNotifications() {
        try {
            // Set up notification handler
            UserPresenceListener listener = new UserPresenceListener(userId);
            NotificationHandler notificationHandler = NotificationHandler.Builder.standard()
                    .withNotificationListener(listener)
                    .withAutoConnect(false)
                    .build();

            // Set presence to busy
            presenceApi.patchUserPresence(userId, "PURECLOUD", createUserPresence(busyPresenceId));

            // Wait for notification
            Boolean presenceSet = false;
            int c = 0;
            while (!presenceSet && c < 500) {
                c++;
                Thread.sleep(10);

                if (busyPresenceId.equals(listener.getPresenceId()))
                    presenceSet = true;
            }

            // Verify
            Assert.assertEquals(listener.getPresenceId(), busyPresenceId);

            // Set presence to available
            presenceApi.patchUserPresence(userId, "PURECLOUD", createUserPresence(availablePresenceId));

            // Wait for notification
            presenceSet = false;
            c = 0;
            while (!presenceSet && c < 500) {
                c++;
                Thread.sleep(10);

                if (availablePresenceId.equals(listener.getPresenceId()))
                    presenceSet = true;
            }

            // Verify
            Assert.assertEquals(listener.getPresenceId(), availablePresenceId);
        } catch (ApiException ex) {
            handleApiException(ex);
        } catch (Exception ex) {
            System.out.println(ex);
            Assert.fail();
        }
    }

    @Test(priority = 7)
    public void getUser() {
        try {
            User user = usersApi.getUser(userId, Collections.singletonList("profileSkills"), null);

            Assert.assertEquals(user.getId(), userId);
            Assert.assertEquals(user.getName(), userName);
            Assert.assertEquals(user.getEmail(), userEmail);
            Assert.assertEquals(user.getDepartment(), userDepartment);
            Assert.assertEquals(user.getProfileSkills().get(0), userProfileSkill);
        } catch (ApiException ex) {
            handleApiException(ex);
        } catch (Exception ex) {
            System.out.println(ex);
            Assert.fail();
        }
    }

    @Test(priority = 8)
    public void deleteUser() {
        try {
            usersApi.deleteUser(userId);
        } catch (ApiException ex) {
            handleApiException(ex);
        } catch (Exception ex) {
            System.out.println(ex);
            Assert.fail();
        }
    }



    @AfterTest
    public void afterTest() {
        System.out.println("After test");
    }



    private PureCloudRegionHosts getEnvironment() {
        environment = System.getenv("PURECLOUD_ENVIRONMENT");
        switch (environment){
            case "mypurecloud.com":
                return PureCloudRegionHosts.us_east_1;
            case "mypurecloud.ie":
                return PureCloudRegionHosts.eu_west_1;
            case "mypurecloud.com.au":
                return PureCloudRegionHosts.ap_southeast_2;
            case "mypurecloud.jp":
                return PureCloudRegionHosts.ap_northeast_1;
            case "mypurecloud.de":
                return PureCloudRegionHosts.eu_central_1;
            default:
                System.out.println("Not in PureCloudRegionHosts using string value");
                return null;
        }
    }

    private String getClientId() {
        return System.getenv("PURECLOUD_CLIENT_ID");
    }

    private String getClientSecret() {
        return System.getenv("PURECLOUD_CLIENT_SECRET");
    }

    private void handleApiException(ApiException ex) {
        System.out.println(ConsoleColors.applyTag(ConsoleColors.RED_BOLD, "API Exception") +
                "(" + ex.getCorrelationId() + ") " +
                ex.getStatusCode() + " " + ex.getStatusReasonPhrase() + " - " + ex.getRawBody());
        Assert.fail(ex.getStatusCode() + " " + ex.getStatusReasonPhrase() + " (" + ex.getCorrelationId() + ")");
    }

    private UserPresence createUserPresence(String presenceId) {
        PresenceDefinition pd = new PresenceDefinition();
        pd.setId(presenceId);
        UserPresence up = new UserPresence();
        up.setPresenceDefinition(pd);
        return up;
    }
}