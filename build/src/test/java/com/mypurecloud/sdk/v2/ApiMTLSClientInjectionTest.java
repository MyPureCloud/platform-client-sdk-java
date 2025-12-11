package com.mypurecloud.sdk.v2;
import com.mypurecloud.sdk.v2.connector.ApiClientConnectorProvider;
import com.mypurecloud.sdk.v2.connector.apache.ApacheHttpClientConnectorProvider;
import com.mypurecloud.sdk.v2.extensions.AuthResponse;

import org.testng.annotations.*;
import static org.testng.Assert.*;
import java.nio.file.*;

public class ApiMTLSClientInjectionTest {
    private ApiClientConnectorProvider connectorProvider;
    private ApiClient apiClient;
    private String environment;
    private PureCloudRegionHosts region;
    private String keyStorePath = "../../../resources/sdk/purecloudjava/scripts/mtls-test/clientKeystore.p12";
    private String trustStorePath = "../../../resources/sdk/purecloudjava/scripts/mtls-test/truststore.jks";
    private String keyStore = "admin";
    private String trustStore = "apples";
    private String clientId;
    private String clientSecret;

    @BeforeTest
    public void setUp() {
        // Initialize test configuration
        String cwd = Path.of("").toAbsolutePath().toString();
        System.out.println("currentPath=" + cwd);
        clientId = getClientId();
        clientSecret = getClientSecret();
        region = getEnvironment();
        connectorProvider = new ApacheHttpClientConnectorProvider();
    }

    @Test(priority = 1)
    public void testApiClientConfiguration() {
        try {
            
            apiClient = ApiClient.Builder.standard()
                .withClientProvider(connectorProvider)
                .withBasePath(region)
                .withMTLSKeyStore(keyStorePath, keyStore)
                .withMTLSTrustStore(trustStorePath, trustStore)
                .withGateway("localhost", "https", 4027, "", "")
                .build();
            Configuration.setDefaultApiClient(apiClient);

            assertNotNull(apiClient, "API client should not be null");
        } catch (Exception e) {
            fail("Failed to configure API client: " + e.getMessage());
        }
    }

    @Test(priority = 2)
    public void testAuthentication() {
        try {
            ApiClient apiClient = Configuration.getDefaultApiClient();
            ApiResponse<AuthResponse> authResponse = apiClient.authorizeClientCredentials(clientId, clientSecret);
            assertNotNull(authResponse, "Auth response should not be null");
            assertNull(authResponse.getException(), "Auth response exception should be null");
            assertEquals(authResponse.getStatusCode(), 200, "Auth response status code should be 200");
                   
        } catch (Exception e) {
            fail("Authentication failed: " + e.getMessage());
        }
    }

    private String getClientId() {
        return System.getenv("PURECLOUD_CLIENT_ID");
    }

    private String getClientSecret() {
        return System.getenv("PURECLOUD_CLIENT_SECRET");
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
            case "usw2.pure.cloud":
                return PureCloudRegionHosts.us_west_2;
            case "cac1.pure.cloud":
                return PureCloudRegionHosts.ca_central_1;
            case "apne2.pure.cloud":
                return PureCloudRegionHosts.ap_northeast_2;
            case "euw2.pure.cloud":
                return PureCloudRegionHosts.eu_west_2;
            case "aps1.pure.cloud":
                return PureCloudRegionHosts.ap_south_1;
            case "use2.us-gov-pure.cloud":
                return PureCloudRegionHosts.us_east_2;
            case "mxc1.pure.cloud":
                return PureCloudRegionHosts.mx_central_1;
            case "apse1.pure.cloud":
                return PureCloudRegionHosts.ap_southeast_1;
            default:
                System.out.println("Not in PureCloudRegionHosts using string value");
                return null;
        }
    }

    @AfterMethod
    public void tearDown() {
        // Clean up resources if needed
        apiClient = null;
    }
}
