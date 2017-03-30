# platform-client-v2

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>com.mypurecloud</groupId>
    <artifactId>platform-client-v2</artifactId>
    <version>1.9.1</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.mypurecloud:platform-client-v2:1.9.1"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/platform-client-v2-1.9.1.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.mypurecloud.sdk.v2.*;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.model.*;
import com.mypurecloud.sdk.v2.api.AlertingApi;

import java.io.File;
import java.util.*;

public class AlertingApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure OAuth2 access token for authorization: PureCloud Auth
        OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
        PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

        AlertingApi apiInstance = new AlertingApi();
        String alertId = "alertId_example"; // String | Alert ID
        try {
            apiInstance.deleteAlertingHeartbeatAlert(alertId);
        } catch (ApiException e) {
            System.err.println("Exception when calling AlertingApi#deleteAlertingHeartbeatAlert");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.mypurecloud.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AlertingApi* | [**deleteAlertingHeartbeatAlert**](docs/AlertingApi.md#deleteAlertingHeartbeatAlert) | **DELETE** /api/v2/alerting/heartbeat/alerts/{alertId} | Delete a heart beat alert
*AlertingApi* | [**deleteAlertingHeartbeatRule**](docs/AlertingApi.md#deleteAlertingHeartbeatRule) | **DELETE** /api/v2/alerting/heartbeat/rules/{ruleId} | Delete a heart beat rule.
*AlertingApi* | [**deleteAlertingInteractionstatsAlert**](docs/AlertingApi.md#deleteAlertingInteractionstatsAlert) | **DELETE** /api/v2/alerting/interactionstats/alerts/{alertId} | Delete an interaction stats alert
*AlertingApi* | [**deleteAlertingInteractionstatsRule**](docs/AlertingApi.md#deleteAlertingInteractionstatsRule) | **DELETE** /api/v2/alerting/interactionstats/rules/{ruleId} | Delete an interaction stats rule.
*AlertingApi* | [**deleteAlertingRoutingstatusAlert**](docs/AlertingApi.md#deleteAlertingRoutingstatusAlert) | **DELETE** /api/v2/alerting/routingstatus/alerts/{alertId} | Delete a routing status alert
*AlertingApi* | [**deleteAlertingRoutingstatusRule**](docs/AlertingApi.md#deleteAlertingRoutingstatusRule) | **DELETE** /api/v2/alerting/routingstatus/rules/{ruleId} | Delete a routing status rule.
*AlertingApi* | [**deleteAlertingUserpresenceAlert**](docs/AlertingApi.md#deleteAlertingUserpresenceAlert) | **DELETE** /api/v2/alerting/userpresence/alerts/{alertId} | Delete a user presence alert
*AlertingApi* | [**deleteAlertingUserpresenceRule**](docs/AlertingApi.md#deleteAlertingUserpresenceRule) | **DELETE** /api/v2/alerting/userpresence/rules/{ruleId} | Delete a user presence rule.
*AlertingApi* | [**getAlertingHeartbeatAlert**](docs/AlertingApi.md#getAlertingHeartbeatAlert) | **GET** /api/v2/alerting/heartbeat/alerts/{alertId} | Get a heart beat alert
*AlertingApi* | [**getAlertingHeartbeatAlerts**](docs/AlertingApi.md#getAlertingHeartbeatAlerts) | **GET** /api/v2/alerting/heartbeat/alerts | Get heart beat alert list.
*AlertingApi* | [**getAlertingHeartbeatRule**](docs/AlertingApi.md#getAlertingHeartbeatRule) | **GET** /api/v2/alerting/heartbeat/rules/{ruleId} | Get a heart beat rule.
*AlertingApi* | [**getAlertingHeartbeatRules**](docs/AlertingApi.md#getAlertingHeartbeatRules) | **GET** /api/v2/alerting/heartbeat/rules | Get a heart beat rule list.
*AlertingApi* | [**getAlertingInteractionstatsAlert**](docs/AlertingApi.md#getAlertingInteractionstatsAlert) | **GET** /api/v2/alerting/interactionstats/alerts/{alertId} | Get an interaction stats alert
*AlertingApi* | [**getAlertingInteractionstatsAlerts**](docs/AlertingApi.md#getAlertingInteractionstatsAlerts) | **GET** /api/v2/alerting/interactionstats/alerts | Get interaction stats alert list.
*AlertingApi* | [**getAlertingInteractionstatsAlertsUnread**](docs/AlertingApi.md#getAlertingInteractionstatsAlertsUnread) | **GET** /api/v2/alerting/interactionstats/alerts/unread | Gets user unread count of interaction stats alerts.
*AlertingApi* | [**getAlertingInteractionstatsRule**](docs/AlertingApi.md#getAlertingInteractionstatsRule) | **GET** /api/v2/alerting/interactionstats/rules/{ruleId} | Get an interaction stats rule.
*AlertingApi* | [**getAlertingInteractionstatsRules**](docs/AlertingApi.md#getAlertingInteractionstatsRules) | **GET** /api/v2/alerting/interactionstats/rules | Get an interaction stats rule list.
*AlertingApi* | [**getAlertingRoutingstatusAlert**](docs/AlertingApi.md#getAlertingRoutingstatusAlert) | **GET** /api/v2/alerting/routingstatus/alerts/{alertId} | Get a routing status alert
*AlertingApi* | [**getAlertingRoutingstatusAlerts**](docs/AlertingApi.md#getAlertingRoutingstatusAlerts) | **GET** /api/v2/alerting/routingstatus/alerts | Get routing status alert list.
*AlertingApi* | [**getAlertingRoutingstatusRule**](docs/AlertingApi.md#getAlertingRoutingstatusRule) | **GET** /api/v2/alerting/routingstatus/rules/{ruleId} | Get a routing status rule.
*AlertingApi* | [**getAlertingRoutingstatusRules**](docs/AlertingApi.md#getAlertingRoutingstatusRules) | **GET** /api/v2/alerting/routingstatus/rules | Get a routing status rule list.
*AlertingApi* | [**getAlertingUserpresenceAlert**](docs/AlertingApi.md#getAlertingUserpresenceAlert) | **GET** /api/v2/alerting/userpresence/alerts/{alertId} | Get a user presence alert
*AlertingApi* | [**getAlertingUserpresenceAlerts**](docs/AlertingApi.md#getAlertingUserpresenceAlerts) | **GET** /api/v2/alerting/userpresence/alerts | Get user presence alert list.
*AlertingApi* | [**getAlertingUserpresenceRule**](docs/AlertingApi.md#getAlertingUserpresenceRule) | **GET** /api/v2/alerting/userpresence/rules/{ruleId} | Get a user presence rule.
*AlertingApi* | [**getAlertingUserpresenceRules**](docs/AlertingApi.md#getAlertingUserpresenceRules) | **GET** /api/v2/alerting/userpresence/rules | Get a user presence rule list.
*AlertingApi* | [**postAlertingHeartbeatRules**](docs/AlertingApi.md#postAlertingHeartbeatRules) | **POST** /api/v2/alerting/heartbeat/rules | Create a heart beat rule.
*AlertingApi* | [**postAlertingInteractionstatsRules**](docs/AlertingApi.md#postAlertingInteractionstatsRules) | **POST** /api/v2/alerting/interactionstats/rules | Create an interaction stats rule.
*AlertingApi* | [**postAlertingRoutingstatusRules**](docs/AlertingApi.md#postAlertingRoutingstatusRules) | **POST** /api/v2/alerting/routingstatus/rules | Create a routing status rule.
*AlertingApi* | [**postAlertingUserpresenceRules**](docs/AlertingApi.md#postAlertingUserpresenceRules) | **POST** /api/v2/alerting/userpresence/rules | Create a user presence rule.
*AlertingApi* | [**putAlertingHeartbeatRule**](docs/AlertingApi.md#putAlertingHeartbeatRule) | **PUT** /api/v2/alerting/heartbeat/rules/{ruleId} | Update a heart beat rule
*AlertingApi* | [**putAlertingInteractionstatsAlert**](docs/AlertingApi.md#putAlertingInteractionstatsAlert) | **PUT** /api/v2/alerting/interactionstats/alerts/{alertId} | Update an interaction stats alert read status
*AlertingApi* | [**putAlertingInteractionstatsRule**](docs/AlertingApi.md#putAlertingInteractionstatsRule) | **PUT** /api/v2/alerting/interactionstats/rules/{ruleId} | Update an interaction stats rule
*AlertingApi* | [**putAlertingRoutingstatusRule**](docs/AlertingApi.md#putAlertingRoutingstatusRule) | **PUT** /api/v2/alerting/routingstatus/rules/{ruleId} | Update a routing status rule
*AlertingApi* | [**putAlertingUserpresenceRule**](docs/AlertingApi.md#putAlertingUserpresenceRule) | **PUT** /api/v2/alerting/userpresence/rules/{ruleId} | Update a user presence rule
*AnalyticsApi* | [**deleteAnalyticsReportingSchedule**](docs/AnalyticsApi.md#deleteAnalyticsReportingSchedule) | **DELETE** /api/v2/analytics/reporting/schedules/{scheduleId} | Delete a scheduled report job.
*AnalyticsApi* | [**getAnalyticsConversationDetails**](docs/AnalyticsApi.md#getAnalyticsConversationDetails) | **GET** /api/v2/analytics/conversations/{conversationId}/details | Get a conversation by id
*AnalyticsApi* | [**getAnalyticsReportingMetadata**](docs/AnalyticsApi.md#getAnalyticsReportingMetadata) | **GET** /api/v2/analytics/reporting/metadata | Get list of reporting metadata.
*AnalyticsApi* | [**getAnalyticsReportingReportIdMetadata**](docs/AnalyticsApi.md#getAnalyticsReportingReportIdMetadata) | **GET** /api/v2/analytics/reporting/{reportId}/metadata | Get a reporting metadata.
*AnalyticsApi* | [**getAnalyticsReportingReportformats**](docs/AnalyticsApi.md#getAnalyticsReportingReportformats) | **GET** /api/v2/analytics/reporting/reportformats | Get a list of report formats
*AnalyticsApi* | [**getAnalyticsReportingSchedule**](docs/AnalyticsApi.md#getAnalyticsReportingSchedule) | **GET** /api/v2/analytics/reporting/schedules/{scheduleId} | Get a scheduled report job.
*AnalyticsApi* | [**getAnalyticsReportingScheduleHistory**](docs/AnalyticsApi.md#getAnalyticsReportingScheduleHistory) | **GET** /api/v2/analytics/reporting/schedules/{scheduleId}/history | Get list of completed scheduled report jobs.
*AnalyticsApi* | [**getAnalyticsReportingScheduleHistoryLatest**](docs/AnalyticsApi.md#getAnalyticsReportingScheduleHistoryLatest) | **GET** /api/v2/analytics/reporting/schedules/{scheduleId}/history/latest | Get most recently completed scheduled report job.
*AnalyticsApi* | [**getAnalyticsReportingScheduleHistoryRunId**](docs/AnalyticsApi.md#getAnalyticsReportingScheduleHistoryRunId) | **GET** /api/v2/analytics/reporting/schedules/{scheduleId}/history/{runId} | A completed scheduled report job
*AnalyticsApi* | [**getAnalyticsReportingSchedules**](docs/AnalyticsApi.md#getAnalyticsReportingSchedules) | **GET** /api/v2/analytics/reporting/schedules | Get a list of scheduled report jobs
*AnalyticsApi* | [**getAnalyticsReportingTimeperiods**](docs/AnalyticsApi.md#getAnalyticsReportingTimeperiods) | **GET** /api/v2/analytics/reporting/timeperiods | Get a list of report time periods.
*AnalyticsApi* | [**postAnalyticsConversationDetailsProperties**](docs/AnalyticsApi.md#postAnalyticsConversationDetailsProperties) | **POST** /api/v2/analytics/conversations/{conversationId}/details/properties | Index conversation properties
*AnalyticsApi* | [**postAnalyticsConversationsAggregatesQuery**](docs/AnalyticsApi.md#postAnalyticsConversationsAggregatesQuery) | **POST** /api/v2/analytics/conversations/aggregates/query | Query for conversation aggregates
*AnalyticsApi* | [**postAnalyticsConversationsDetailsQuery**](docs/AnalyticsApi.md#postAnalyticsConversationsDetailsQuery) | **POST** /api/v2/analytics/conversations/details/query | Query for conversation details
*AnalyticsApi* | [**postAnalyticsEvaluationsAggregatesQuery**](docs/AnalyticsApi.md#postAnalyticsEvaluationsAggregatesQuery) | **POST** /api/v2/analytics/evaluations/aggregates/query | Query for evaluation aggregates
*AnalyticsApi* | [**postAnalyticsQueuesObservationsQuery**](docs/AnalyticsApi.md#postAnalyticsQueuesObservationsQuery) | **POST** /api/v2/analytics/queues/observations/query | Query for queue observations
*AnalyticsApi* | [**postAnalyticsReportingScheduleRunreport**](docs/AnalyticsApi.md#postAnalyticsReportingScheduleRunreport) | **POST** /api/v2/analytics/reporting/schedules/{scheduleId}/runreport | Place a scheduled report immediately into the reporting queue
*AnalyticsApi* | [**postAnalyticsReportingSchedules**](docs/AnalyticsApi.md#postAnalyticsReportingSchedules) | **POST** /api/v2/analytics/reporting/schedules | Create a scheduled report job
*AnalyticsApi* | [**postAnalyticsUsersAggregatesQuery**](docs/AnalyticsApi.md#postAnalyticsUsersAggregatesQuery) | **POST** /api/v2/analytics/users/aggregates/query | Query for user aggregates
*AnalyticsApi* | [**postAnalyticsUsersDetailsQuery**](docs/AnalyticsApi.md#postAnalyticsUsersDetailsQuery) | **POST** /api/v2/analytics/users/details/query | Query for user details
*AnalyticsApi* | [**postAnalyticsUsersObservationsQuery**](docs/AnalyticsApi.md#postAnalyticsUsersObservationsQuery) | **POST** /api/v2/analytics/users/observations/query | Query for user observations
*AnalyticsApi* | [**putAnalyticsReportingSchedule**](docs/AnalyticsApi.md#putAnalyticsReportingSchedule) | **PUT** /api/v2/analytics/reporting/schedules/{scheduleId} | Update a scheduled report job.
*ArchitectApi* | [**deleteArchitectPrompt**](docs/ArchitectApi.md#deleteArchitectPrompt) | **DELETE** /api/v2/architect/prompts/{promptId} | Delete specified user prompt
*ArchitectApi* | [**deleteArchitectPromptResource**](docs/ArchitectApi.md#deleteArchitectPromptResource) | **DELETE** /api/v2/architect/prompts/{promptId}/resources/{languageCode} | Delete specified user prompt resource
*ArchitectApi* | [**deleteArchitectPrompts**](docs/ArchitectApi.md#deleteArchitectPrompts) | **DELETE** /api/v2/architect/prompts | Batch-delete a list of prompts asynchronously
*ArchitectApi* | [**deleteArchitectSystempromptResource**](docs/ArchitectApi.md#deleteArchitectSystempromptResource) | **DELETE** /api/v2/architect/systemprompts/{promptId}/resources/{languageCode} | Delete a system prompt resource override.
*ArchitectApi* | [**getArchitectPrompt**](docs/ArchitectApi.md#getArchitectPrompt) | **GET** /api/v2/architect/prompts/{promptId} | Get specified user prompt
*ArchitectApi* | [**getArchitectPromptResource**](docs/ArchitectApi.md#getArchitectPromptResource) | **GET** /api/v2/architect/prompts/{promptId}/resources/{languageCode} | Get specified user prompt resource
*ArchitectApi* | [**getArchitectPromptResources**](docs/ArchitectApi.md#getArchitectPromptResources) | **GET** /api/v2/architect/prompts/{promptId}/resources | Get a pageable list of user prompt resources
*ArchitectApi* | [**getArchitectPrompts**](docs/ArchitectApi.md#getArchitectPrompts) | **GET** /api/v2/architect/prompts | Get a pageable list of user prompts
*ArchitectApi* | [**getArchitectSystemprompt**](docs/ArchitectApi.md#getArchitectSystemprompt) | **GET** /api/v2/architect/systemprompts/{promptId} | Get a system prompt
*ArchitectApi* | [**getArchitectSystempromptResource**](docs/ArchitectApi.md#getArchitectSystempromptResource) | **GET** /api/v2/architect/systemprompts/{promptId}/resources/{languageCode} | Get a system prompt resource.
*ArchitectApi* | [**getArchitectSystempromptResources**](docs/ArchitectApi.md#getArchitectSystempromptResources) | **GET** /api/v2/architect/systemprompts/{promptId}/resources | Get IVR System Prompt resources.
*ArchitectApi* | [**getArchitectSystemprompts**](docs/ArchitectApi.md#getArchitectSystemprompts) | **GET** /api/v2/architect/systemprompts | Get System Prompts
*ArchitectApi* | [**getFlows**](docs/ArchitectApi.md#getFlows) | **GET** /api/v2/flows | Get a pageable list of flows, filtered by query parameters
*ArchitectApi* | [**postArchitectPromptResources**](docs/ArchitectApi.md#postArchitectPromptResources) | **POST** /api/v2/architect/prompts/{promptId}/resources | Create a new user prompt resource
*ArchitectApi* | [**postArchitectPrompts**](docs/ArchitectApi.md#postArchitectPrompts) | **POST** /api/v2/architect/prompts | Create a new user prompt
*ArchitectApi* | [**postArchitectSystempromptResources**](docs/ArchitectApi.md#postArchitectSystempromptResources) | **POST** /api/v2/architect/systemprompts/{promptId}/resources | Create system prompt resource override.
*ArchitectApi* | [**putArchitectPrompt**](docs/ArchitectApi.md#putArchitectPrompt) | **PUT** /api/v2/architect/prompts/{promptId} | Update specified user prompt
*ArchitectApi* | [**putArchitectPromptResource**](docs/ArchitectApi.md#putArchitectPromptResource) | **PUT** /api/v2/architect/prompts/{promptId}/resources/{languageCode} | Update specified user prompt resource
*ArchitectApi* | [**putArchitectSystempromptResource**](docs/ArchitectApi.md#putArchitectSystempromptResource) | **PUT** /api/v2/architect/systemprompts/{promptId}/resources/{languageCode} | Updates a system prompt resource override.
*AttributesApi* | [**deleteAttribute**](docs/AttributesApi.md#deleteAttribute) | **DELETE** /api/v2/attributes/{attributeId} | Delete an existing Attribute.
*AttributesApi* | [**getAttribute**](docs/AttributesApi.md#getAttribute) | **GET** /api/v2/attributes/{attributeId} | Get details about an existing attribute.
*AttributesApi* | [**getAttributes**](docs/AttributesApi.md#getAttributes) | **GET** /api/v2/attributes | Gets a list of existing attributes.
*AttributesApi* | [**postAttributes**](docs/AttributesApi.md#postAttributes) | **POST** /api/v2/attributes | Create an attribute.
*AttributesApi* | [**postAttributesQuery**](docs/AttributesApi.md#postAttributesQuery) | **POST** /api/v2/attributes/query | Query attributes
*AttributesApi* | [**putAttribute**](docs/AttributesApi.md#putAttribute) | **PUT** /api/v2/attributes/{attributeId} | Update an existing attribute.
*AuthorizationApi* | [**deleteAuthorizationRole**](docs/AuthorizationApi.md#deleteAuthorizationRole) | **DELETE** /api/v2/authorization/roles/{roleId} | Delete an organization role.
*AuthorizationApi* | [**deleteUserRoles**](docs/AuthorizationApi.md#deleteUserRoles) | **DELETE** /api/v2/users/{userId}/roles | Removes all the roles from the user.
*AuthorizationApi* | [**getAuthorizationPermissions**](docs/AuthorizationApi.md#getAuthorizationPermissions) | **GET** /api/v2/authorization/permissions | Get all permissions.
*AuthorizationApi* | [**getAuthorizationProducts**](docs/AuthorizationApi.md#getAuthorizationProducts) | **GET** /api/v2/authorization/products | Get the list of enabled products
*AuthorizationApi* | [**getAuthorizationRole**](docs/AuthorizationApi.md#getAuthorizationRole) | **GET** /api/v2/authorization/roles/{roleId} | Get a single organization role.
*AuthorizationApi* | [**getAuthorizationRoleComparedefaultRightRoleId**](docs/AuthorizationApi.md#getAuthorizationRoleComparedefaultRightRoleId) | **GET** /api/v2/authorization/roles/{leftRoleId}/comparedefault/{rightRoleId} | Get an org role to default role comparison comparison
*AuthorizationApi* | [**getAuthorizationRoles**](docs/AuthorizationApi.md#getAuthorizationRoles) | **GET** /api/v2/authorization/roles | Retrieve a list of all roles defined for the organization
*AuthorizationApi* | [**getUserRoles**](docs/AuthorizationApi.md#getUserRoles) | **GET** /api/v2/users/{userId}/roles | Returns a listing of roles and permissions for a user.
*AuthorizationApi* | [**patchAuthorizationRole**](docs/AuthorizationApi.md#patchAuthorizationRole) | **PATCH** /api/v2/authorization/roles/{roleId} | Patch Organization Role for needsUpdate Field
*AuthorizationApi* | [**postAuthorizationRoleComparedefaultRightRoleId**](docs/AuthorizationApi.md#postAuthorizationRoleComparedefaultRightRoleId) | **POST** /api/v2/authorization/roles/{leftRoleId}/comparedefault/{rightRoleId} | Get an unsaved org role to default role comparison
*AuthorizationApi* | [**postAuthorizationRoles**](docs/AuthorizationApi.md#postAuthorizationRoles) | **POST** /api/v2/authorization/roles | Create an organization role.
*AuthorizationApi* | [**postAuthorizationRolesDefault**](docs/AuthorizationApi.md#postAuthorizationRolesDefault) | **POST** /api/v2/authorization/roles/default | Restores all default roles
*AuthorizationApi* | [**putAuthorizationRole**](docs/AuthorizationApi.md#putAuthorizationRole) | **PUT** /api/v2/authorization/roles/{roleId} | Update an organization role.
*AuthorizationApi* | [**putAuthorizationRoleUsersAdd**](docs/AuthorizationApi.md#putAuthorizationRoleUsersAdd) | **PUT** /api/v2/authorization/roles/{roleId}/users/add | Sets the users for the role
*AuthorizationApi* | [**putAuthorizationRoleUsersRemove**](docs/AuthorizationApi.md#putAuthorizationRoleUsersRemove) | **PUT** /api/v2/authorization/roles/{roleId}/users/remove | Removes the users from the role
*AuthorizationApi* | [**putAuthorizationRolesDefault**](docs/AuthorizationApi.md#putAuthorizationRolesDefault) | **PUT** /api/v2/authorization/roles/default | Restore specified default roles
*AuthorizationApi* | [**putUserRoles**](docs/AuthorizationApi.md#putUserRoles) | **PUT** /api/v2/users/{userId}/roles | Sets the user&#39;s roles
*ContentManagementApi* | [**deleteContentmanagementDocument**](docs/ContentManagementApi.md#deleteContentmanagementDocument) | **DELETE** /api/v2/contentmanagement/documents/{documentId} | Delete a document.
*ContentManagementApi* | [**deleteContentmanagementShare**](docs/ContentManagementApi.md#deleteContentmanagementShare) | **DELETE** /api/v2/contentmanagement/shares/{shareId} | Deletes an existing share.
*ContentManagementApi* | [**deleteContentmanagementStatusStatusId**](docs/ContentManagementApi.md#deleteContentmanagementStatusStatusId) | **DELETE** /api/v2/contentmanagement/status/{statusId} | Cancel the command for this status
*ContentManagementApi* | [**deleteContentmanagementWorkspace**](docs/ContentManagementApi.md#deleteContentmanagementWorkspace) | **DELETE** /api/v2/contentmanagement/workspaces/{workspaceId} | Delete a workspace
*ContentManagementApi* | [**deleteContentmanagementWorkspaceMember**](docs/ContentManagementApi.md#deleteContentmanagementWorkspaceMember) | **DELETE** /api/v2/contentmanagement/workspaces/{workspaceId}/members/{memberId} | Delete a member from a workspace
*ContentManagementApi* | [**deleteContentmanagementWorkspaceTagvalue**](docs/ContentManagementApi.md#deleteContentmanagementWorkspaceTagvalue) | **DELETE** /api/v2/contentmanagement/workspaces/{workspaceId}/tagvalues/{tagId} | Delete workspace tag
*ContentManagementApi* | [**getContentmanagementDocument**](docs/ContentManagementApi.md#getContentmanagementDocument) | **GET** /api/v2/contentmanagement/documents/{documentId} | Get a document.
*ContentManagementApi* | [**getContentmanagementDocumentAudits**](docs/ContentManagementApi.md#getContentmanagementDocumentAudits) | **GET** /api/v2/contentmanagement/documents/{documentId}/audits | Get a list of audits for a document.
*ContentManagementApi* | [**getContentmanagementDocumentContent**](docs/ContentManagementApi.md#getContentmanagementDocumentContent) | **GET** /api/v2/contentmanagement/documents/{documentId}/content | Download a document.
*ContentManagementApi* | [**getContentmanagementDocuments**](docs/ContentManagementApi.md#getContentmanagementDocuments) | **GET** /api/v2/contentmanagement/documents | Get a list of documents.
*ContentManagementApi* | [**getContentmanagementQuery**](docs/ContentManagementApi.md#getContentmanagementQuery) | **GET** /api/v2/contentmanagement/query | Query content
*ContentManagementApi* | [**getContentmanagementSecurityprofile**](docs/ContentManagementApi.md#getContentmanagementSecurityprofile) | **GET** /api/v2/contentmanagement/securityprofiles/{securityProfileId} | Get a Security Profile
*ContentManagementApi* | [**getContentmanagementSecurityprofiles**](docs/ContentManagementApi.md#getContentmanagementSecurityprofiles) | **GET** /api/v2/contentmanagement/securityprofiles | Get a List of Security Profiles
*ContentManagementApi* | [**getContentmanagementShare**](docs/ContentManagementApi.md#getContentmanagementShare) | **GET** /api/v2/contentmanagement/shares/{shareId} | Retrieve details about an existing share.
*ContentManagementApi* | [**getContentmanagementSharedSharedId**](docs/ContentManagementApi.md#getContentmanagementSharedSharedId) | **GET** /api/v2/contentmanagement/shared/{sharedId} | Get shared documents. Securely download a shared document.
*ContentManagementApi* | [**getContentmanagementShares**](docs/ContentManagementApi.md#getContentmanagementShares) | **GET** /api/v2/contentmanagement/shares | Gets a list of shares.  You must specify at least one filter (e.g. entityId).
*ContentManagementApi* | [**getContentmanagementStatus**](docs/ContentManagementApi.md#getContentmanagementStatus) | **GET** /api/v2/contentmanagement/status | Get a list of statuses for pending operations
*ContentManagementApi* | [**getContentmanagementStatusStatusId**](docs/ContentManagementApi.md#getContentmanagementStatusStatusId) | **GET** /api/v2/contentmanagement/status/{statusId} | Get a status.
*ContentManagementApi* | [**getContentmanagementUsage**](docs/ContentManagementApi.md#getContentmanagementUsage) | **GET** /api/v2/contentmanagement/usage | Get usage details.
*ContentManagementApi* | [**getContentmanagementWorkspace**](docs/ContentManagementApi.md#getContentmanagementWorkspace) | **GET** /api/v2/contentmanagement/workspaces/{workspaceId} | Get a workspace.
*ContentManagementApi* | [**getContentmanagementWorkspaceDocuments**](docs/ContentManagementApi.md#getContentmanagementWorkspaceDocuments) | **GET** /api/v2/contentmanagement/workspaces/{workspaceId}/documents | Get a list of documents.
*ContentManagementApi* | [**getContentmanagementWorkspaceMember**](docs/ContentManagementApi.md#getContentmanagementWorkspaceMember) | **GET** /api/v2/contentmanagement/workspaces/{workspaceId}/members/{memberId} | Get a workspace member
*ContentManagementApi* | [**getContentmanagementWorkspaceMembers**](docs/ContentManagementApi.md#getContentmanagementWorkspaceMembers) | **GET** /api/v2/contentmanagement/workspaces/{workspaceId}/members | Get a list workspace members
*ContentManagementApi* | [**getContentmanagementWorkspaceTagvalue**](docs/ContentManagementApi.md#getContentmanagementWorkspaceTagvalue) | **GET** /api/v2/contentmanagement/workspaces/{workspaceId}/tagvalues/{tagId} | Get a workspace tag
*ContentManagementApi* | [**getContentmanagementWorkspaceTagvalues**](docs/ContentManagementApi.md#getContentmanagementWorkspaceTagvalues) | **GET** /api/v2/contentmanagement/workspaces/{workspaceId}/tagvalues | Get a list of workspace tags
*ContentManagementApi* | [**getContentmanagementWorkspaces**](docs/ContentManagementApi.md#getContentmanagementWorkspaces) | **GET** /api/v2/contentmanagement/workspaces | Get a list of workspaces.
*ContentManagementApi* | [**postContentmanagementAuditquery**](docs/ContentManagementApi.md#postContentmanagementAuditquery) | **POST** /api/v2/contentmanagement/auditquery | Query audits
*ContentManagementApi* | [**postContentmanagementDocument**](docs/ContentManagementApi.md#postContentmanagementDocument) | **POST** /api/v2/contentmanagement/documents/{documentId} | Update a document.
*ContentManagementApi* | [**postContentmanagementDocumentContent**](docs/ContentManagementApi.md#postContentmanagementDocumentContent) | **POST** /api/v2/contentmanagement/documents/{documentId}/content | Replace the contents of a document.
*ContentManagementApi* | [**postContentmanagementDocuments**](docs/ContentManagementApi.md#postContentmanagementDocuments) | **POST** /api/v2/contentmanagement/documents | Add a document.
*ContentManagementApi* | [**postContentmanagementQuery**](docs/ContentManagementApi.md#postContentmanagementQuery) | **POST** /api/v2/contentmanagement/query | Query content
*ContentManagementApi* | [**postContentmanagementShares**](docs/ContentManagementApi.md#postContentmanagementShares) | **POST** /api/v2/contentmanagement/shares | Creates a new share or updates an existing share if the entity has already been shared
*ContentManagementApi* | [**postContentmanagementWorkspaceTagvalues**](docs/ContentManagementApi.md#postContentmanagementWorkspaceTagvalues) | **POST** /api/v2/contentmanagement/workspaces/{workspaceId}/tagvalues | Create a workspace tag
*ContentManagementApi* | [**postContentmanagementWorkspaceTagvaluesQuery**](docs/ContentManagementApi.md#postContentmanagementWorkspaceTagvaluesQuery) | **POST** /api/v2/contentmanagement/workspaces/{workspaceId}/tagvalues/query | Perform a prefix query on tags in the workspace
*ContentManagementApi* | [**postContentmanagementWorkspaces**](docs/ContentManagementApi.md#postContentmanagementWorkspaces) | **POST** /api/v2/contentmanagement/workspaces | Create a group workspace
*ContentManagementApi* | [**putContentmanagementWorkspace**](docs/ContentManagementApi.md#putContentmanagementWorkspace) | **PUT** /api/v2/contentmanagement/workspaces/{workspaceId} | Update a workspace
*ContentManagementApi* | [**putContentmanagementWorkspaceMember**](docs/ContentManagementApi.md#putContentmanagementWorkspaceMember) | **PUT** /api/v2/contentmanagement/workspaces/{workspaceId}/members/{memberId} | Add a member to a workspace
*ContentManagementApi* | [**putContentmanagementWorkspaceTagvalue**](docs/ContentManagementApi.md#putContentmanagementWorkspaceTagvalue) | **PUT** /api/v2/contentmanagement/workspaces/{workspaceId}/tagvalues/{tagId} | Update a workspace tag. Will update all documents with the new tag value.
*ConversationsApi* | [**deleteConversationParticipantCode**](docs/ConversationsApi.md#deleteConversationParticipantCode) | **DELETE** /api/v2/conversations/{conversationId}/participants/{participantId}/codes/{addCommunicationCode} | Delete a code used to add a communication to this participant
*ConversationsApi* | [**deleteConversationsCallParticipantConsult**](docs/ConversationsApi.md#deleteConversationsCallParticipantConsult) | **DELETE** /api/v2/conversations/calls/{callId}/participants/{participantId}/consult | Cancel the transfer
*ConversationsApi* | [**deleteConversationsEmailMessagesDraftAttachment**](docs/ConversationsApi.md#deleteConversationsEmailMessagesDraftAttachment) | **DELETE** /api/v2/conversations/emails/{emailId}/messages/draft/attachments/{attachmentId} | Delete attachment from draft
*ConversationsApi* | [**getAnalyticsConversationDetails**](docs/ConversationsApi.md#getAnalyticsConversationDetails) | **GET** /api/v2/analytics/conversations/{conversationId}/details | Get a conversation by id
*ConversationsApi* | [**getConversation**](docs/ConversationsApi.md#getConversation) | **GET** /api/v2/conversations/{conversationId} | Get conversation
*ConversationsApi* | [**getConversationParticipantWrapup**](docs/ConversationsApi.md#getConversationParticipantWrapup) | **GET** /api/v2/conversations/{conversationId}/participants/{participantId}/wrapup | Get the wrap-up for this conversation participant. 
*ConversationsApi* | [**getConversationParticipantWrapupcodes**](docs/ConversationsApi.md#getConversationParticipantWrapupcodes) | **GET** /api/v2/conversations/{conversationId}/participants/{participantId}/wrapupcodes | Get list of wrapup codes for this conversation participant
*ConversationsApi* | [**getConversations**](docs/ConversationsApi.md#getConversations) | **GET** /api/v2/conversations | Get conversations
*ConversationsApi* | [**getConversationsCall**](docs/ConversationsApi.md#getConversationsCall) | **GET** /api/v2/conversations/calls/{callId} | Get call conversation
*ConversationsApi* | [**getConversationsCallParticipantWrapup**](docs/ConversationsApi.md#getConversationsCallParticipantWrapup) | **GET** /api/v2/conversations/calls/{callId}/participants/{participantId}/wrapup | Get the wrap-up for this conversation participant. 
*ConversationsApi* | [**getConversationsCallParticipantWrapupcodes**](docs/ConversationsApi.md#getConversationsCallParticipantWrapupcodes) | **GET** /api/v2/conversations/calls/{callId}/participants/{participantId}/wrapupcodes | Get list of wrapup codes for this conversation participant
*ConversationsApi* | [**getConversationsCallback**](docs/ConversationsApi.md#getConversationsCallback) | **GET** /api/v2/conversations/callbacks/{callbackId} | Get callback conversation
*ConversationsApi* | [**getConversationsCallbackParticipantWrapup**](docs/ConversationsApi.md#getConversationsCallbackParticipantWrapup) | **GET** /api/v2/conversations/callbacks/{callbackId}/participants/{participantId}/wrapup | Get the wrap-up for this conversation participant. 
*ConversationsApi* | [**getConversationsCallbackParticipantWrapupcodes**](docs/ConversationsApi.md#getConversationsCallbackParticipantWrapupcodes) | **GET** /api/v2/conversations/callbacks/{callbackId}/participants/{participantId}/wrapupcodes | Get list of wrapup codes for this conversation participant
*ConversationsApi* | [**getConversationsCallbacks**](docs/ConversationsApi.md#getConversationsCallbacks) | **GET** /api/v2/conversations/callbacks | Get callback conversations
*ConversationsApi* | [**getConversationsCalls**](docs/ConversationsApi.md#getConversationsCalls) | **GET** /api/v2/conversations/calls | Get recent conversations
*ConversationsApi* | [**getConversationsCallsHistory**](docs/ConversationsApi.md#getConversationsCallsHistory) | **GET** /api/v2/conversations/calls/history | Get call history
*ConversationsApi* | [**getConversationsCallsMaximumconferenceparties**](docs/ConversationsApi.md#getConversationsCallsMaximumconferenceparties) | **GET** /api/v2/conversations/calls/maximumconferenceparties | Get the maximum number of participants that this user can have on a conference
*ConversationsApi* | [**getConversationsChat**](docs/ConversationsApi.md#getConversationsChat) | **GET** /api/v2/conversations/chats/{chatId} | Get chat conversation
*ConversationsApi* | [**getConversationsChatParticipantWrapup**](docs/ConversationsApi.md#getConversationsChatParticipantWrapup) | **GET** /api/v2/conversations/chats/{chatId}/participants/{participantId}/wrapup | Get the wrap-up for this conversation participant. 
*ConversationsApi* | [**getConversationsChatParticipantWrapupcodes**](docs/ConversationsApi.md#getConversationsChatParticipantWrapupcodes) | **GET** /api/v2/conversations/chats/{chatId}/participants/{participantId}/wrapupcodes | Get list of wrapup codes for this conversation participant
*ConversationsApi* | [**getConversationsChats**](docs/ConversationsApi.md#getConversationsChats) | **GET** /api/v2/conversations/chats | Get recent chat conversations
*ConversationsApi* | [**getConversationsCobrowsesession**](docs/ConversationsApi.md#getConversationsCobrowsesession) | **GET** /api/v2/conversations/cobrowsesessions/{cobrowseId} | Get cobrowse conversation
*ConversationsApi* | [**getConversationsCobrowsesessionParticipantWrapup**](docs/ConversationsApi.md#getConversationsCobrowsesessionParticipantWrapup) | **GET** /api/v2/conversations/cobrowsesessions/{cobrowseId}/participants/{participantId}/wrapup | Get the wrap-up for this conversation participant. 
*ConversationsApi* | [**getConversationsCobrowsesessionParticipantWrapupcodes**](docs/ConversationsApi.md#getConversationsCobrowsesessionParticipantWrapupcodes) | **GET** /api/v2/conversations/cobrowsesessions/{cobrowseId}/participants/{participantId}/wrapupcodes | Get list of wrapup codes for this conversation participant
*ConversationsApi* | [**getConversationsCobrowsesessions**](docs/ConversationsApi.md#getConversationsCobrowsesessions) | **GET** /api/v2/conversations/cobrowsesessions | Get recent cobrowse conversations
*ConversationsApi* | [**getConversationsEmail**](docs/ConversationsApi.md#getConversationsEmail) | **GET** /api/v2/conversations/emails/{emailId} | Get email conversation
*ConversationsApi* | [**getConversationsEmailMessage**](docs/ConversationsApi.md#getConversationsEmailMessage) | **GET** /api/v2/conversations/emails/{emailId}/messages/{messageId} | Get conversation message
*ConversationsApi* | [**getConversationsEmailMessages**](docs/ConversationsApi.md#getConversationsEmailMessages) | **GET** /api/v2/conversations/emails/{emailId}/messages | Get conversation messages
*ConversationsApi* | [**getConversationsEmailMessagesDraft**](docs/ConversationsApi.md#getConversationsEmailMessagesDraft) | **GET** /api/v2/conversations/emails/{emailId}/messages/draft | Get conversation draft reply
*ConversationsApi* | [**getConversationsEmailParticipantWrapup**](docs/ConversationsApi.md#getConversationsEmailParticipantWrapup) | **GET** /api/v2/conversations/emails/{emailId}/participants/{participantId}/wrapup | Get the wrap-up for this conversation participant. 
*ConversationsApi* | [**getConversationsEmailParticipantWrapupcodes**](docs/ConversationsApi.md#getConversationsEmailParticipantWrapupcodes) | **GET** /api/v2/conversations/emails/{emailId}/participants/{participantId}/wrapupcodes | Get list of wrapup codes for this conversation participant
*ConversationsApi* | [**getConversationsEmails**](docs/ConversationsApi.md#getConversationsEmails) | **GET** /api/v2/conversations/emails | Get recent email conversations
*ConversationsApi* | [**patchConversationParticipant**](docs/ConversationsApi.md#patchConversationParticipant) | **PATCH** /api/v2/conversations/{conversationId}/participants/{participantId} | Update a participant.
*ConversationsApi* | [**patchConversationParticipantAttributes**](docs/ConversationsApi.md#patchConversationParticipantAttributes) | **PATCH** /api/v2/conversations/{conversationId}/participants/{participantId}/attributes | Update the attributes on a conversation participant.
*ConversationsApi* | [**patchConversationsCall**](docs/ConversationsApi.md#patchConversationsCall) | **PATCH** /api/v2/conversations/calls/{callId} | Update a conversation by setting it&#39;s recording state, merging in other conversations to create a conference, or disconnecting all of the participants
*ConversationsApi* | [**patchConversationsCallParticipant**](docs/ConversationsApi.md#patchConversationsCallParticipant) | **PATCH** /api/v2/conversations/calls/{callId}/participants/{participantId} | Update conversation participant
*ConversationsApi* | [**patchConversationsCallParticipantAttributes**](docs/ConversationsApi.md#patchConversationsCallParticipantAttributes) | **PATCH** /api/v2/conversations/calls/{callId}/participants/{participantId}/attributes | Update the attributes on a conversation participant.
*ConversationsApi* | [**patchConversationsCallParticipantCommunication**](docs/ConversationsApi.md#patchConversationsCallParticipantCommunication) | **PATCH** /api/v2/conversations/calls/{callId}/participants/{participantId}/communications/{communicationId} | Update conversation participant&#39;s communication by disconnecting it.
*ConversationsApi* | [**patchConversationsCallParticipantConsult**](docs/ConversationsApi.md#patchConversationsCallParticipantConsult) | **PATCH** /api/v2/conversations/calls/{callId}/participants/{participantId}/consult | Change who can speak
*ConversationsApi* | [**patchConversationsCallback**](docs/ConversationsApi.md#patchConversationsCallback) | **PATCH** /api/v2/conversations/callbacks/{callbackId} | Update a conversation by disconnecting all of the participants
*ConversationsApi* | [**patchConversationsCallbackParticipant**](docs/ConversationsApi.md#patchConversationsCallbackParticipant) | **PATCH** /api/v2/conversations/callbacks/{callbackId}/participants/{participantId} | Update conversation participant
*ConversationsApi* | [**patchConversationsCallbackParticipantAttributes**](docs/ConversationsApi.md#patchConversationsCallbackParticipantAttributes) | **PATCH** /api/v2/conversations/callbacks/{callbackId}/participants/{participantId}/attributes | Update the attributes on a conversation participant.
*ConversationsApi* | [**patchConversationsCallbackParticipantCommunication**](docs/ConversationsApi.md#patchConversationsCallbackParticipantCommunication) | **PATCH** /api/v2/conversations/callbacks/{callbackId}/participants/{participantId}/communications/{communicationId} | Update conversation participant&#39;s communication by disconnecting it.
*ConversationsApi* | [**patchConversationsChat**](docs/ConversationsApi.md#patchConversationsChat) | **PATCH** /api/v2/conversations/chats/{chatId} | Update a conversation by disconnecting all of the participants
*ConversationsApi* | [**patchConversationsChatParticipant**](docs/ConversationsApi.md#patchConversationsChatParticipant) | **PATCH** /api/v2/conversations/chats/{chatId}/participants/{participantId} | Update conversation participant
*ConversationsApi* | [**patchConversationsChatParticipantAttributes**](docs/ConversationsApi.md#patchConversationsChatParticipantAttributes) | **PATCH** /api/v2/conversations/chats/{chatId}/participants/{participantId}/attributes | Update the attributes on a conversation participant.
*ConversationsApi* | [**patchConversationsChatParticipantCommunication**](docs/ConversationsApi.md#patchConversationsChatParticipantCommunication) | **PATCH** /api/v2/conversations/chats/{chatId}/participants/{participantId}/communications/{communicationId} | Update conversation participant&#39;s communication by disconnecting it.
*ConversationsApi* | [**patchConversationsCobrowsesession**](docs/ConversationsApi.md#patchConversationsCobrowsesession) | **PATCH** /api/v2/conversations/cobrowsesessions/{cobrowseId} | Update a conversation by disconnecting all of the participants
*ConversationsApi* | [**patchConversationsCobrowsesessionParticipant**](docs/ConversationsApi.md#patchConversationsCobrowsesessionParticipant) | **PATCH** /api/v2/conversations/cobrowsesessions/{cobrowseId}/participants/{participantId} | Update conversation participant
*ConversationsApi* | [**patchConversationsCobrowsesessionParticipantAttributes**](docs/ConversationsApi.md#patchConversationsCobrowsesessionParticipantAttributes) | **PATCH** /api/v2/conversations/cobrowsesessions/{cobrowseId}/participants/{participantId}/attributes | Update the attributes on a conversation participant.
*ConversationsApi* | [**patchConversationsCobrowsesessionParticipantCommunication**](docs/ConversationsApi.md#patchConversationsCobrowsesessionParticipantCommunication) | **PATCH** /api/v2/conversations/cobrowsesessions/{cobrowseId}/participants/{participantId}/communications/{communicationId} | Update conversation participant&#39;s communication by disconnecting it.
*ConversationsApi* | [**patchConversationsEmail**](docs/ConversationsApi.md#patchConversationsEmail) | **PATCH** /api/v2/conversations/emails/{emailId} | Update a conversation by disconnecting all of the participants
*ConversationsApi* | [**patchConversationsEmailParticipant**](docs/ConversationsApi.md#patchConversationsEmailParticipant) | **PATCH** /api/v2/conversations/emails/{emailId}/participants/{participantId} | Update conversation participant
*ConversationsApi* | [**patchConversationsEmailParticipantAttributes**](docs/ConversationsApi.md#patchConversationsEmailParticipantAttributes) | **PATCH** /api/v2/conversations/emails/{emailId}/participants/{participantId}/attributes | Update the attributes on a conversation participant.
*ConversationsApi* | [**patchConversationsEmailParticipantCommunication**](docs/ConversationsApi.md#patchConversationsEmailParticipantCommunication) | **PATCH** /api/v2/conversations/emails/{emailId}/participants/{participantId}/communications/{communicationId} | Update conversation participant&#39;s communication by disconnecting it.
*ConversationsApi* | [**postAnalyticsConversationDetailsProperties**](docs/ConversationsApi.md#postAnalyticsConversationDetailsProperties) | **POST** /api/v2/analytics/conversations/{conversationId}/details/properties | Index conversation properties
*ConversationsApi* | [**postAnalyticsConversationsAggregatesQuery**](docs/ConversationsApi.md#postAnalyticsConversationsAggregatesQuery) | **POST** /api/v2/analytics/conversations/aggregates/query | Query for conversation aggregates
*ConversationsApi* | [**postAnalyticsConversationsDetailsQuery**](docs/ConversationsApi.md#postAnalyticsConversationsDetailsQuery) | **POST** /api/v2/analytics/conversations/details/query | Query for conversation details
*ConversationsApi* | [**postConversationParticipantCallbacks**](docs/ConversationsApi.md#postConversationParticipantCallbacks) | **POST** /api/v2/conversations/{conversationId}/participants/{participantId}/callbacks | Create a new callback for the specified participant on the conversation.
*ConversationsApi* | [**postConversationParticipantReplace**](docs/ConversationsApi.md#postConversationParticipantReplace) | **POST** /api/v2/conversations/{conversationId}/participants/{participantId}/replace | Replace this participant with the specified user and/or address
*ConversationsApi* | [**postConversationsCall**](docs/ConversationsApi.md#postConversationsCall) | **POST** /api/v2/conversations/calls/{callId} | Add a new call to a conversation
*ConversationsApi* | [**postConversationsCallParticipantConsult**](docs/ConversationsApi.md#postConversationsCallParticipantConsult) | **POST** /api/v2/conversations/calls/{callId}/participants/{participantId}/consult | Initiate and update consult transfer
*ConversationsApi* | [**postConversationsCallParticipantMonitor**](docs/ConversationsApi.md#postConversationsCallParticipantMonitor) | **POST** /api/v2/conversations/calls/{callId}/participants/{participantId}/monitor | Listen in on the conversation from the point of view of a given participant.
*ConversationsApi* | [**postConversationsCallParticipantReplace**](docs/ConversationsApi.md#postConversationsCallParticipantReplace) | **POST** /api/v2/conversations/calls/{callId}/participants/{participantId}/replace | Replace this participant with the specified user and/or address
*ConversationsApi* | [**postConversationsCallParticipants**](docs/ConversationsApi.md#postConversationsCallParticipants) | **POST** /api/v2/conversations/calls/{callId}/participants | Add participants to a conversation
*ConversationsApi* | [**postConversationsCallbackParticipantReplace**](docs/ConversationsApi.md#postConversationsCallbackParticipantReplace) | **POST** /api/v2/conversations/callbacks/{callbackId}/participants/{participantId}/replace | Replace this participant with the specified user and/or address
*ConversationsApi* | [**postConversationsCallbacks**](docs/ConversationsApi.md#postConversationsCallbacks) | **POST** /api/v2/conversations/callbacks | Create a Callback
*ConversationsApi* | [**postConversationsCalls**](docs/ConversationsApi.md#postConversationsCalls) | **POST** /api/v2/conversations/calls | Create a call conversation
*ConversationsApi* | [**postConversationsChatParticipantReplace**](docs/ConversationsApi.md#postConversationsChatParticipantReplace) | **POST** /api/v2/conversations/chats/{chatId}/participants/{participantId}/replace | Replace this participant with the specified user and/or address
*ConversationsApi* | [**postConversationsChats**](docs/ConversationsApi.md#postConversationsChats) | **POST** /api/v2/conversations/chats | Create a web chat conversation
*ConversationsApi* | [**postConversationsCobrowsesessionParticipantReplace**](docs/ConversationsApi.md#postConversationsCobrowsesessionParticipantReplace) | **POST** /api/v2/conversations/cobrowsesessions/{cobrowseId}/participants/{participantId}/replace | Replace this participant with the specified user and/or address
*ConversationsApi* | [**postConversationsEmailMessages**](docs/ConversationsApi.md#postConversationsEmailMessages) | **POST** /api/v2/conversations/emails/{emailId}/messages | Send an email reply
*ConversationsApi* | [**postConversationsEmailParticipantReplace**](docs/ConversationsApi.md#postConversationsEmailParticipantReplace) | **POST** /api/v2/conversations/emails/{emailId}/participants/{participantId}/replace | Replace this participant with the specified user and/or address
*ConversationsApi* | [**postConversationsEmails**](docs/ConversationsApi.md#postConversationsEmails) | **POST** /api/v2/conversations/emails | Create an email conversation
*ConversationsApi* | [**postConversationsFaxes**](docs/ConversationsApi.md#postConversationsFaxes) | **POST** /api/v2/conversations/faxes | Create Fax Conversation
*ConversationsApi* | [**putConversationsEmailMessagesDraft**](docs/ConversationsApi.md#putConversationsEmailMessagesDraft) | **PUT** /api/v2/conversations/emails/{emailId}/messages/draft | Update conversation draft reply
*ExternalContactsApi* | [**deleteExternalcontactsContact**](docs/ExternalContactsApi.md#deleteExternalcontactsContact) | **DELETE** /api/v2/externalcontacts/contacts/{contactId} | Delete an external contact
*ExternalContactsApi* | [**deleteExternalcontactsContactNote**](docs/ExternalContactsApi.md#deleteExternalcontactsContactNote) | **DELETE** /api/v2/externalcontacts/contacts/{contactId}/notes/{noteId} | Delete a note for an external contact
*ExternalContactsApi* | [**deleteExternalcontactsOrganization**](docs/ExternalContactsApi.md#deleteExternalcontactsOrganization) | **DELETE** /api/v2/externalcontacts/organizations/{externalOrganizationId} | Delete an external organization
*ExternalContactsApi* | [**deleteExternalcontactsOrganizationNote**](docs/ExternalContactsApi.md#deleteExternalcontactsOrganizationNote) | **DELETE** /api/v2/externalcontacts/organizations/{externalOrganizationId}/notes/{noteId} | Delete a note for an external organization
*ExternalContactsApi* | [**deleteExternalcontactsRelationship**](docs/ExternalContactsApi.md#deleteExternalcontactsRelationship) | **DELETE** /api/v2/externalcontacts/relationships/{relationshipId} | Delete a relationship
*ExternalContactsApi* | [**getExternalcontactsContact**](docs/ExternalContactsApi.md#getExternalcontactsContact) | **GET** /api/v2/externalcontacts/contacts/{contactId} | Fetch an external contact
*ExternalContactsApi* | [**getExternalcontactsContactNote**](docs/ExternalContactsApi.md#getExternalcontactsContactNote) | **GET** /api/v2/externalcontacts/contacts/{contactId}/notes/{noteId} | Fetch a note for an external contact
*ExternalContactsApi* | [**getExternalcontactsContactNotes**](docs/ExternalContactsApi.md#getExternalcontactsContactNotes) | **GET** /api/v2/externalcontacts/contacts/{contactId}/notes | List notes for an external contact
*ExternalContactsApi* | [**getExternalcontactsContacts**](docs/ExternalContactsApi.md#getExternalcontactsContacts) | **GET** /api/v2/externalcontacts/contacts | Search for external contacts
*ExternalContactsApi* | [**getExternalcontactsOrganization**](docs/ExternalContactsApi.md#getExternalcontactsOrganization) | **GET** /api/v2/externalcontacts/organizations/{externalOrganizationId} | Fetch an external organization
*ExternalContactsApi* | [**getExternalcontactsOrganizationContacts**](docs/ExternalContactsApi.md#getExternalcontactsOrganizationContacts) | **GET** /api/v2/externalcontacts/organizations/{externalOrganizationId}/contacts | Search for external contacts in an external organization
*ExternalContactsApi* | [**getExternalcontactsOrganizationNote**](docs/ExternalContactsApi.md#getExternalcontactsOrganizationNote) | **GET** /api/v2/externalcontacts/organizations/{externalOrganizationId}/notes/{noteId} | Fetch a note for an external organization
*ExternalContactsApi* | [**getExternalcontactsOrganizationNotes**](docs/ExternalContactsApi.md#getExternalcontactsOrganizationNotes) | **GET** /api/v2/externalcontacts/organizations/{externalOrganizationId}/notes | List notes for an external organization
*ExternalContactsApi* | [**getExternalcontactsOrganizationRelationships**](docs/ExternalContactsApi.md#getExternalcontactsOrganizationRelationships) | **GET** /api/v2/externalcontacts/organizations/{externalOrganizationId}/relationships | Fetch a relationship for an external organization
*ExternalContactsApi* | [**getExternalcontactsOrganizations**](docs/ExternalContactsApi.md#getExternalcontactsOrganizations) | **GET** /api/v2/externalcontacts/organizations | Search for external organizations
*ExternalContactsApi* | [**getExternalcontactsRelationship**](docs/ExternalContactsApi.md#getExternalcontactsRelationship) | **GET** /api/v2/externalcontacts/relationships/{relationshipId} | Fetch a relationship
*ExternalContactsApi* | [**getExternalcontactsReversewhitepageslookup**](docs/ExternalContactsApi.md#getExternalcontactsReversewhitepageslookup) | **GET** /api/v2/externalcontacts/reversewhitepageslookup | Lookup contacts and externalOrganizations based on an attribute
*ExternalContactsApi* | [**postExternalcontactsContactAssociateconversation**](docs/ExternalContactsApi.md#postExternalcontactsContactAssociateconversation) | **POST** /api/v2/externalcontacts/contacts/{contactId}/associateconversation | Associate an external contact with a conversation
*ExternalContactsApi* | [**postExternalcontactsContactNotes**](docs/ExternalContactsApi.md#postExternalcontactsContactNotes) | **POST** /api/v2/externalcontacts/contacts/{contactId}/notes | Create a note for an external contact
*ExternalContactsApi* | [**postExternalcontactsContacts**](docs/ExternalContactsApi.md#postExternalcontactsContacts) | **POST** /api/v2/externalcontacts/contacts | Create an external contact
*ExternalContactsApi* | [**postExternalcontactsOrganizationNotes**](docs/ExternalContactsApi.md#postExternalcontactsOrganizationNotes) | **POST** /api/v2/externalcontacts/organizations/{externalOrganizationId}/notes | Create a note for an external organization
*ExternalContactsApi* | [**postExternalcontactsOrganizations**](docs/ExternalContactsApi.md#postExternalcontactsOrganizations) | **POST** /api/v2/externalcontacts/organizations | Create an external organization
*ExternalContactsApi* | [**postExternalcontactsRelationships**](docs/ExternalContactsApi.md#postExternalcontactsRelationships) | **POST** /api/v2/externalcontacts/relationships | Create a relationship
*ExternalContactsApi* | [**putExternalcontactsContact**](docs/ExternalContactsApi.md#putExternalcontactsContact) | **PUT** /api/v2/externalcontacts/contacts/{contactId} | Update an external contact
*ExternalContactsApi* | [**putExternalcontactsContactNote**](docs/ExternalContactsApi.md#putExternalcontactsContactNote) | **PUT** /api/v2/externalcontacts/contacts/{contactId}/notes/{noteId} | Update a note for an external contact
*ExternalContactsApi* | [**putExternalcontactsConversation**](docs/ExternalContactsApi.md#putExternalcontactsConversation) | **PUT** /api/v2/externalcontacts/conversations/{conversationId} | Associate an external contact with a conversation
*ExternalContactsApi* | [**putExternalcontactsOrganization**](docs/ExternalContactsApi.md#putExternalcontactsOrganization) | **PUT** /api/v2/externalcontacts/organizations/{externalOrganizationId} | Update an external organization
*ExternalContactsApi* | [**putExternalcontactsOrganizationNote**](docs/ExternalContactsApi.md#putExternalcontactsOrganizationNote) | **PUT** /api/v2/externalcontacts/organizations/{externalOrganizationId}/notes/{noteId} | Update a note for an external organization
*ExternalContactsApi* | [**putExternalcontactsRelationship**](docs/ExternalContactsApi.md#putExternalcontactsRelationship) | **PUT** /api/v2/externalcontacts/relationships/{relationshipId} | Update a relationship
*FaxApi* | [**deleteFaxDocument**](docs/FaxApi.md#deleteFaxDocument) | **DELETE** /api/v2/fax/documents/{documentId} | Delete a fax document.
*FaxApi* | [**getFaxDocument**](docs/FaxApi.md#getFaxDocument) | **GET** /api/v2/fax/documents/{documentId} | Get a document.
*FaxApi* | [**getFaxDocumentContent**](docs/FaxApi.md#getFaxDocumentContent) | **GET** /api/v2/fax/documents/{documentId}/content | Download a fax document.
*FaxApi* | [**getFaxDocuments**](docs/FaxApi.md#getFaxDocuments) | **GET** /api/v2/fax/documents | Get a list of fax documents.
*FaxApi* | [**getFaxSummary**](docs/FaxApi.md#getFaxSummary) | **GET** /api/v2/fax/summary | Get fax summary
*FaxApi* | [**putFaxDocument**](docs/FaxApi.md#putFaxDocument) | **PUT** /api/v2/fax/documents/{documentId} | Update a fax document.
*GeolocationApi* | [**getGeolocationsSettings**](docs/GeolocationApi.md#getGeolocationsSettings) | **GET** /api/v2/geolocations/settings | Get a organization&#39;s GeolocationSettings
*GeolocationApi* | [**getUserGeolocation**](docs/GeolocationApi.md#getUserGeolocation) | **GET** /api/v2/users/{userId}/geolocations/{clientId} | Get a user&#39;s Geolocation
*GeolocationApi* | [**patchGeolocationsSettings**](docs/GeolocationApi.md#patchGeolocationsSettings) | **PATCH** /api/v2/geolocations/settings | Patch a organization&#39;s GeolocationSettings
*GeolocationApi* | [**patchUserGeolocation**](docs/GeolocationApi.md#patchUserGeolocation) | **PATCH** /api/v2/users/{userId}/geolocations/{clientId} | Patch a user&#39;s Geolocation
*GreetingsApi* | [**deleteGreeting**](docs/GreetingsApi.md#deleteGreeting) | **DELETE** /api/v2/greetings/{greetingId} | Deletes a Greeting with the given GreetingId
*GreetingsApi* | [**getGreeting**](docs/GreetingsApi.md#getGreeting) | **GET** /api/v2/greetings/{greetingId} | Get a Greeting with the given GreetingId
*GreetingsApi* | [**getGreetingMedia**](docs/GreetingsApi.md#getGreetingMedia) | **GET** /api/v2/greetings/{greetingId}/media | Get media playback URI for this greeting
*GreetingsApi* | [**getGreetings**](docs/GreetingsApi.md#getGreetings) | **GET** /api/v2/greetings | Gets an Organization&#39;s Greetings
*GreetingsApi* | [**getGreetingsDefaults**](docs/GreetingsApi.md#getGreetingsDefaults) | **GET** /api/v2/greetings/defaults | Get an Organization&#39;s DefaultGreetingList
*GreetingsApi* | [**getGroupGreetings**](docs/GreetingsApi.md#getGroupGreetings) | **GET** /api/v2/groups/{groupId}/greetings | Get a list of the Group&#39;s Greetings
*GreetingsApi* | [**getGroupGreetingsDefaults**](docs/GreetingsApi.md#getGroupGreetingsDefaults) | **GET** /api/v2/groups/{groupId}/greetings/defaults | Grabs the list of Default Greetings given a Group&#39;s ID
*GreetingsApi* | [**getUserGreetings**](docs/GreetingsApi.md#getUserGreetings) | **GET** /api/v2/users/{userId}/greetings | Get a list of the User&#39;s Greetings
*GreetingsApi* | [**getUserGreetingsDefaults**](docs/GreetingsApi.md#getUserGreetingsDefaults) | **GET** /api/v2/users/{userId}/greetings/defaults | Grabs the list of Default Greetings given a User&#39;s ID
*GreetingsApi* | [**postGreetings**](docs/GreetingsApi.md#postGreetings) | **POST** /api/v2/greetings | Create a Greeting for an Organization
*GreetingsApi* | [**postGroupGreetings**](docs/GreetingsApi.md#postGroupGreetings) | **POST** /api/v2/groups/{groupId}/greetings | Creates a Greeting for a Group
*GreetingsApi* | [**postUserGreetings**](docs/GreetingsApi.md#postUserGreetings) | **POST** /api/v2/users/{userId}/greetings | Creates a Greeting for a User
*GreetingsApi* | [**putGreeting**](docs/GreetingsApi.md#putGreeting) | **PUT** /api/v2/greetings/{greetingId} | Updates the Greeting with the given GreetingId
*GreetingsApi* | [**putGreetingsDefaults**](docs/GreetingsApi.md#putGreetingsDefaults) | **PUT** /api/v2/greetings/defaults | Update an Organization&#39;s DefaultGreetingList
*GreetingsApi* | [**putGroupGreetingsDefaults**](docs/GreetingsApi.md#putGroupGreetingsDefaults) | **PUT** /api/v2/groups/{groupId}/greetings/defaults | Updates the DefaultGreetingList of the specified Group
*GreetingsApi* | [**putUserGreetingsDefaults**](docs/GreetingsApi.md#putUserGreetingsDefaults) | **PUT** /api/v2/users/{userId}/greetings/defaults | Updates the DefaultGreetingList of the specified User
*GroupsApi* | [**deleteGroup**](docs/GroupsApi.md#deleteGroup) | **DELETE** /api/v2/groups/{groupId} | Delete group
*GroupsApi* | [**deleteGroupMembers**](docs/GroupsApi.md#deleteGroupMembers) | **DELETE** /api/v2/groups/{groupId}/members | Remove members
*GroupsApi* | [**getFieldconfig**](docs/GroupsApi.md#getFieldconfig) | **GET** /api/v2/fieldconfig | Fetch field config for an entity type
*GroupsApi* | [**getGroup**](docs/GroupsApi.md#getGroup) | **GET** /api/v2/groups/{groupId} | Get group
*GroupsApi* | [**getGroupMembers**](docs/GroupsApi.md#getGroupMembers) | **GET** /api/v2/groups/{groupId}/members | Get group members
*GroupsApi* | [**getGroups**](docs/GroupsApi.md#getGroups) | **GET** /api/v2/groups | Get a group list
*GroupsApi* | [**getGroupsSearch**](docs/GroupsApi.md#getGroupsSearch) | **GET** /api/v2/groups/search | Search groups using the q64 value returned from a previous search
*GroupsApi* | [**postGroupMembers**](docs/GroupsApi.md#postGroupMembers) | **POST** /api/v2/groups/{groupId}/members | Add members
*GroupsApi* | [**postGroups**](docs/GroupsApi.md#postGroups) | **POST** /api/v2/groups | Create a group
*GroupsApi* | [**postGroupsSearch**](docs/GroupsApi.md#postGroupsSearch) | **POST** /api/v2/groups/search | Search groups
*GroupsApi* | [**putGroup**](docs/GroupsApi.md#putGroup) | **PUT** /api/v2/groups/{groupId} | Update group
*IdentityProviderApi* | [**deleteIdentityprovidersAdfs**](docs/IdentityProviderApi.md#deleteIdentityprovidersAdfs) | **DELETE** /api/v2/identityproviders/adfs | Delete ADFS Identity Provider
*IdentityProviderApi* | [**deleteIdentityprovidersCic**](docs/IdentityProviderApi.md#deleteIdentityprovidersCic) | **DELETE** /api/v2/identityproviders/cic | Delete Customer Interaction Center (CIC) Identity Provider
*IdentityProviderApi* | [**deleteIdentityprovidersGsuite**](docs/IdentityProviderApi.md#deleteIdentityprovidersGsuite) | **DELETE** /api/v2/identityproviders/gsuite | Delete G Suite Identity Provider
*IdentityProviderApi* | [**deleteIdentityprovidersIdentitynow**](docs/IdentityProviderApi.md#deleteIdentityprovidersIdentitynow) | **DELETE** /api/v2/identityproviders/identitynow | Delete IdentityNow Provider
*IdentityProviderApi* | [**deleteIdentityprovidersOkta**](docs/IdentityProviderApi.md#deleteIdentityprovidersOkta) | **DELETE** /api/v2/identityproviders/okta | Delete Okta Identity Provider
*IdentityProviderApi* | [**deleteIdentityprovidersOnelogin**](docs/IdentityProviderApi.md#deleteIdentityprovidersOnelogin) | **DELETE** /api/v2/identityproviders/onelogin | Delete OneLogin Identity Provider
*IdentityProviderApi* | [**deleteIdentityprovidersPing**](docs/IdentityProviderApi.md#deleteIdentityprovidersPing) | **DELETE** /api/v2/identityproviders/ping | Delete Ping Identity Provider
*IdentityProviderApi* | [**deleteIdentityprovidersPurecloud**](docs/IdentityProviderApi.md#deleteIdentityprovidersPurecloud) | **DELETE** /api/v2/identityproviders/purecloud | Delete PureCloud Identity Provider
*IdentityProviderApi* | [**deleteIdentityprovidersSalesforce**](docs/IdentityProviderApi.md#deleteIdentityprovidersSalesforce) | **DELETE** /api/v2/identityproviders/salesforce | Delete Salesforce Identity Provider
*IdentityProviderApi* | [**getIdentityproviders**](docs/IdentityProviderApi.md#getIdentityproviders) | **GET** /api/v2/identityproviders | The list of identity providers
*IdentityProviderApi* | [**getIdentityprovidersAdfs**](docs/IdentityProviderApi.md#getIdentityprovidersAdfs) | **GET** /api/v2/identityproviders/adfs | Get ADFS Identity Provider
*IdentityProviderApi* | [**getIdentityprovidersCic**](docs/IdentityProviderApi.md#getIdentityprovidersCic) | **GET** /api/v2/identityproviders/cic | Get Customer Interaction Center (CIC) Identity Provider
*IdentityProviderApi* | [**getIdentityprovidersGsuite**](docs/IdentityProviderApi.md#getIdentityprovidersGsuite) | **GET** /api/v2/identityproviders/gsuite | Get G Suite Identity Provider
*IdentityProviderApi* | [**getIdentityprovidersIdentitynow**](docs/IdentityProviderApi.md#getIdentityprovidersIdentitynow) | **GET** /api/v2/identityproviders/identitynow | Get IdentityNow Provider
*IdentityProviderApi* | [**getIdentityprovidersOkta**](docs/IdentityProviderApi.md#getIdentityprovidersOkta) | **GET** /api/v2/identityproviders/okta | Get Okta Identity Provider
*IdentityProviderApi* | [**getIdentityprovidersOnelogin**](docs/IdentityProviderApi.md#getIdentityprovidersOnelogin) | **GET** /api/v2/identityproviders/onelogin | Get OneLogin Identity Provider
*IdentityProviderApi* | [**getIdentityprovidersPing**](docs/IdentityProviderApi.md#getIdentityprovidersPing) | **GET** /api/v2/identityproviders/ping | Get Ping Identity Provider
*IdentityProviderApi* | [**getIdentityprovidersPurecloud**](docs/IdentityProviderApi.md#getIdentityprovidersPurecloud) | **GET** /api/v2/identityproviders/purecloud | Get PureCloud Identity Provider
*IdentityProviderApi* | [**getIdentityprovidersSalesforce**](docs/IdentityProviderApi.md#getIdentityprovidersSalesforce) | **GET** /api/v2/identityproviders/salesforce | Get Salesforce Identity Provider
*IdentityProviderApi* | [**putIdentityprovidersAdfs**](docs/IdentityProviderApi.md#putIdentityprovidersAdfs) | **PUT** /api/v2/identityproviders/adfs | Update/Create ADFS Identity Provider
*IdentityProviderApi* | [**putIdentityprovidersCic**](docs/IdentityProviderApi.md#putIdentityprovidersCic) | **PUT** /api/v2/identityproviders/cic | Update/Create Customer Interaction Center (CIC) Identity Provider
*IdentityProviderApi* | [**putIdentityprovidersGsuite**](docs/IdentityProviderApi.md#putIdentityprovidersGsuite) | **PUT** /api/v2/identityproviders/gsuite | Update/Create G Suite Identity Provider
*IdentityProviderApi* | [**putIdentityprovidersIdentitynow**](docs/IdentityProviderApi.md#putIdentityprovidersIdentitynow) | **PUT** /api/v2/identityproviders/identitynow | Update/Create IdentityNow Provider
*IdentityProviderApi* | [**putIdentityprovidersOkta**](docs/IdentityProviderApi.md#putIdentityprovidersOkta) | **PUT** /api/v2/identityproviders/okta | Update/Create Okta Identity Provider
*IdentityProviderApi* | [**putIdentityprovidersOnelogin**](docs/IdentityProviderApi.md#putIdentityprovidersOnelogin) | **PUT** /api/v2/identityproviders/onelogin | Update/Create OneLogin Identity Provider
*IdentityProviderApi* | [**putIdentityprovidersPing**](docs/IdentityProviderApi.md#putIdentityprovidersPing) | **PUT** /api/v2/identityproviders/ping | Update/Create Ping Identity Provider
*IdentityProviderApi* | [**putIdentityprovidersPurecloud**](docs/IdentityProviderApi.md#putIdentityprovidersPurecloud) | **PUT** /api/v2/identityproviders/purecloud | Update/Create PureCloud Identity Provider
*IdentityProviderApi* | [**putIdentityprovidersSalesforce**](docs/IdentityProviderApi.md#putIdentityprovidersSalesforce) | **PUT** /api/v2/identityproviders/salesforce | Update/Create Salesforce Identity Provider
*LanguagesApi* | [**deleteLanguage**](docs/LanguagesApi.md#deleteLanguage) | **DELETE** /api/v2/languages/{languageId} | Delete Language (Deprecated)
*LanguagesApi* | [**deleteRoutingLanguage**](docs/LanguagesApi.md#deleteRoutingLanguage) | **DELETE** /api/v2/routing/languages/{languageId} | Delete Language
*LanguagesApi* | [**getLanguage**](docs/LanguagesApi.md#getLanguage) | **GET** /api/v2/languages/{languageId} | Get language (Deprecated)
*LanguagesApi* | [**getLanguages**](docs/LanguagesApi.md#getLanguages) | **GET** /api/v2/languages | Get the list of supported languages. (Deprecated)
*LanguagesApi* | [**getLanguagesTranslations**](docs/LanguagesApi.md#getLanguagesTranslations) | **GET** /api/v2/languages/translations | Get all available languages for translation
*LanguagesApi* | [**getLanguagesTranslationsBuiltin**](docs/LanguagesApi.md#getLanguagesTranslationsBuiltin) | **GET** /api/v2/languages/translations/builtin | Get the builtin translation for a language
*LanguagesApi* | [**getLanguagesTranslationsOrganization**](docs/LanguagesApi.md#getLanguagesTranslationsOrganization) | **GET** /api/v2/languages/translations/organization | Get effective translation for an organization by language
*LanguagesApi* | [**getLanguagesTranslationsUser**](docs/LanguagesApi.md#getLanguagesTranslationsUser) | **GET** /api/v2/languages/translations/users/{userId} | Get effective language translation for a user
*LanguagesApi* | [**getRoutingLanguage**](docs/LanguagesApi.md#getRoutingLanguage) | **GET** /api/v2/routing/languages/{languageId} | Get language
*LanguagesApi* | [**postLanguages**](docs/LanguagesApi.md#postLanguages) | **POST** /api/v2/languages | Create Language (Deprecated)
*LocationsApi* | [**getLocation**](docs/LocationsApi.md#getLocation) | **GET** /api/v2/locations/{locationId} | Get Location by ID.
*LocationsApi* | [**getLocations**](docs/LocationsApi.md#getLocations) | **GET** /api/v2/locations | Get a list of all locations.
*LocationsApi* | [**getLocationsSearch**](docs/LocationsApi.md#getLocationsSearch) | **GET** /api/v2/locations/search | Search locations using the q64 value returned from a previous search
*LocationsApi* | [**postLocationsSearch**](docs/LocationsApi.md#postLocationsSearch) | **POST** /api/v2/locations/search | Search locations
*NotificationsApi* | [**deleteNotificationsChannelSubscriptions**](docs/NotificationsApi.md#deleteNotificationsChannelSubscriptions) | **DELETE** /api/v2/notifications/channels/{channelId}/subscriptions | Remove all subscriptions
*NotificationsApi* | [**getNotificationsAvailabletopics**](docs/NotificationsApi.md#getNotificationsAvailabletopics) | **GET** /api/v2/notifications/availabletopics | Get available notification topics.
*NotificationsApi* | [**getNotificationsChannelSubscriptions**](docs/NotificationsApi.md#getNotificationsChannelSubscriptions) | **GET** /api/v2/notifications/channels/{channelId}/subscriptions | The list of all subscriptions for this channel
*NotificationsApi* | [**getNotificationsChannels**](docs/NotificationsApi.md#getNotificationsChannels) | **GET** /api/v2/notifications/channels | The list of existing channels
*NotificationsApi* | [**postNotificationsChannelSubscriptions**](docs/NotificationsApi.md#postNotificationsChannelSubscriptions) | **POST** /api/v2/notifications/channels/{channelId}/subscriptions | Add a list of subscriptions to the existing list of subscriptions
*NotificationsApi* | [**postNotificationsChannels**](docs/NotificationsApi.md#postNotificationsChannels) | **POST** /api/v2/notifications/channels | Create a new channel
*NotificationsApi* | [**putNotificationsChannelSubscriptions**](docs/NotificationsApi.md#putNotificationsChannelSubscriptions) | **PUT** /api/v2/notifications/channels/{channelId}/subscriptions | Replace the current list of subscriptions with a new list.
*OAuthApi* | [**deleteOauthClient**](docs/OAuthApi.md#deleteOauthClient) | **DELETE** /api/v2/oauth/clients/{clientId} | Delete OAuth Client
*OAuthApi* | [**getOauthClient**](docs/OAuthApi.md#getOauthClient) | **GET** /api/v2/oauth/clients/{clientId} | Get OAuth Client
*OAuthApi* | [**getOauthClients**](docs/OAuthApi.md#getOauthClients) | **GET** /api/v2/oauth/clients | The list of OAuth clients
*OAuthApi* | [**postOauthClientSecret**](docs/OAuthApi.md#postOauthClientSecret) | **POST** /api/v2/oauth/clients/{clientId}/secret | Regenerate Client Secret
*OAuthApi* | [**postOauthClients**](docs/OAuthApi.md#postOauthClients) | **POST** /api/v2/oauth/clients | Create OAuth client
*OAuthApi* | [**putOauthClient**](docs/OAuthApi.md#putOauthClient) | **PUT** /api/v2/oauth/clients/{clientId} | Update OAuth Client
*OrganizationApi* | [**getFieldconfig**](docs/OrganizationApi.md#getFieldconfig) | **GET** /api/v2/fieldconfig | Fetch field config for an entity type
*OrganizationApi* | [**getOrganizationsMe**](docs/OrganizationApi.md#getOrganizationsMe) | **GET** /api/v2/organizations/me | Get organization.
*OrganizationApi* | [**patchOrganizationsFeature**](docs/OrganizationApi.md#patchOrganizationsFeature) | **PATCH** /api/v2/organizations/features/{featureName} | Update organization
*OrganizationApi* | [**putOrganizationsMe**](docs/OrganizationApi.md#putOrganizationsMe) | **PUT** /api/v2/organizations/me | Update organization.
*OutboundApi* | [**deleteOutboundAttemptlimit**](docs/OutboundApi.md#deleteOutboundAttemptlimit) | **DELETE** /api/v2/outbound/attemptlimits/{attemptLimitsId} | Delete attempt limits
*OutboundApi* | [**deleteOutboundCallabletimeset**](docs/OutboundApi.md#deleteOutboundCallabletimeset) | **DELETE** /api/v2/outbound/callabletimesets/{callableTimeSetId} | Delete callable time set
*OutboundApi* | [**deleteOutboundCallanalysisresponseset**](docs/OutboundApi.md#deleteOutboundCallanalysisresponseset) | **DELETE** /api/v2/outbound/callanalysisresponsesets/{callAnalysisSetId} | Delete a dialer call analysis response set.
*OutboundApi* | [**deleteOutboundCampaign**](docs/OutboundApi.md#deleteOutboundCampaign) | **DELETE** /api/v2/outbound/campaigns/{campaignId} | Delete a campaign.
*OutboundApi* | [**deleteOutboundCampaignProgress**](docs/OutboundApi.md#deleteOutboundCampaignProgress) | **DELETE** /api/v2/outbound/campaigns/{campaignId}/progress | Reset campaign progress and recycle the campaign
*OutboundApi* | [**deleteOutboundCampaignrule**](docs/OutboundApi.md#deleteOutboundCampaignrule) | **DELETE** /api/v2/outbound/campaignrules/{campaignRuleId} | Delete Campaign Rule
*OutboundApi* | [**deleteOutboundContactlist**](docs/OutboundApi.md#deleteOutboundContactlist) | **DELETE** /api/v2/outbound/contactlists/{contactListId} | Delete a contact list.
*OutboundApi* | [**deleteOutboundContactlistContact**](docs/OutboundApi.md#deleteOutboundContactlistContact) | **DELETE** /api/v2/outbound/contactlists/{contactListId}/contacts/{contactId} | Delete a contact.
*OutboundApi* | [**deleteOutboundDnclist**](docs/OutboundApi.md#deleteOutboundDnclist) | **DELETE** /api/v2/outbound/dnclists/{dncListId} | Delete dialer DNC list
*OutboundApi* | [**deleteOutboundRuleset**](docs/OutboundApi.md#deleteOutboundRuleset) | **DELETE** /api/v2/outbound/rulesets/{ruleSetId} | Delete a Rule set.
*OutboundApi* | [**deleteOutboundSchedulesCampaign**](docs/OutboundApi.md#deleteOutboundSchedulesCampaign) | **DELETE** /api/v2/outbound/schedules/campaigns/{campaignId} | Delete a dialer campaign schedule.
*OutboundApi* | [**deleteOutboundSchedulesSequence**](docs/OutboundApi.md#deleteOutboundSchedulesSequence) | **DELETE** /api/v2/outbound/schedules/sequences/{sequenceId} | Delete a dialer sequence schedule.
*OutboundApi* | [**deleteOutboundSequence**](docs/OutboundApi.md#deleteOutboundSequence) | **DELETE** /api/v2/outbound/sequences/{sequenceId} | Delete a dialer campaign sequence.
*OutboundApi* | [**getOutboundAttemptlimit**](docs/OutboundApi.md#getOutboundAttemptlimit) | **GET** /api/v2/outbound/attemptlimits/{attemptLimitsId} | Get attempt limits
*OutboundApi* | [**getOutboundAttemptlimits**](docs/OutboundApi.md#getOutboundAttemptlimits) | **GET** /api/v2/outbound/attemptlimits | Query attempt limits list
*OutboundApi* | [**getOutboundCallabletimeset**](docs/OutboundApi.md#getOutboundCallabletimeset) | **GET** /api/v2/outbound/callabletimesets/{callableTimeSetId} | Get callable time set
*OutboundApi* | [**getOutboundCallabletimesets**](docs/OutboundApi.md#getOutboundCallabletimesets) | **GET** /api/v2/outbound/callabletimesets | Query callable time set list
*OutboundApi* | [**getOutboundCallanalysisresponseset**](docs/OutboundApi.md#getOutboundCallanalysisresponseset) | **GET** /api/v2/outbound/callanalysisresponsesets/{callAnalysisSetId} | Get a dialer call analysis response set.
*OutboundApi* | [**getOutboundCallanalysisresponsesets**](docs/OutboundApi.md#getOutboundCallanalysisresponsesets) | **GET** /api/v2/outbound/callanalysisresponsesets | Query a list of dialer call analysis response sets.
*OutboundApi* | [**getOutboundCampaign**](docs/OutboundApi.md#getOutboundCampaign) | **GET** /api/v2/outbound/campaigns/{campaignId} | Get dialer campaign.
*OutboundApi* | [**getOutboundCampaignDiagnostics**](docs/OutboundApi.md#getOutboundCampaignDiagnostics) | **GET** /api/v2/outbound/campaigns/{campaignId}/diagnostics | Get campaign diagnostics
*OutboundApi* | [**getOutboundCampaignInteractions**](docs/OutboundApi.md#getOutboundCampaignInteractions) | **GET** /api/v2/outbound/campaigns/{campaignId}/interactions | Get dialer campaign interactions.
*OutboundApi* | [**getOutboundCampaignProgress**](docs/OutboundApi.md#getOutboundCampaignProgress) | **GET** /api/v2/outbound/campaigns/{campaignId}/progress | Get campaign progress
*OutboundApi* | [**getOutboundCampaignStats**](docs/OutboundApi.md#getOutboundCampaignStats) | **GET** /api/v2/outbound/campaigns/{campaignId}/stats | Get statistics about a Dialer Campaign
*OutboundApi* | [**getOutboundCampaignrule**](docs/OutboundApi.md#getOutboundCampaignrule) | **GET** /api/v2/outbound/campaignrules/{campaignRuleId} | Get Campaign Rule
*OutboundApi* | [**getOutboundCampaignrules**](docs/OutboundApi.md#getOutboundCampaignrules) | **GET** /api/v2/outbound/campaignrules | Query Campaign Rule list
*OutboundApi* | [**getOutboundCampaigns**](docs/OutboundApi.md#getOutboundCampaigns) | **GET** /api/v2/outbound/campaigns | Query a list of dialer campaigns.
*OutboundApi* | [**getOutboundContactlist**](docs/OutboundApi.md#getOutboundContactlist) | **GET** /api/v2/outbound/contactlists/{contactListId} | Get a dialer contact list.
*OutboundApi* | [**getOutboundContactlistContact**](docs/OutboundApi.md#getOutboundContactlistContact) | **GET** /api/v2/outbound/contactlists/{contactListId}/contacts/{contactId} | Get a contact.
*OutboundApi* | [**getOutboundContactlistExport**](docs/OutboundApi.md#getOutboundContactlistExport) | **GET** /api/v2/outbound/contactlists/{contactListId}/export | Get the URI of a contact list export.
*OutboundApi* | [**getOutboundContactlistImportstatus**](docs/OutboundApi.md#getOutboundContactlistImportstatus) | **GET** /api/v2/outbound/contactlists/{contactListId}/importstatus | Get dialer contactList import status.
*OutboundApi* | [**getOutboundContactlists**](docs/OutboundApi.md#getOutboundContactlists) | **GET** /api/v2/outbound/contactlists | Query a list of contact lists.
*OutboundApi* | [**getOutboundDnclist**](docs/OutboundApi.md#getOutboundDnclist) | **GET** /api/v2/outbound/dnclists/{dncListId} | Get dialer DNC list
*OutboundApi* | [**getOutboundDnclistExport**](docs/OutboundApi.md#getOutboundDnclistExport) | **GET** /api/v2/outbound/dnclists/{dncListId}/export | Get the URI of a DNC list export.
*OutboundApi* | [**getOutboundDnclistImportstatus**](docs/OutboundApi.md#getOutboundDnclistImportstatus) | **GET** /api/v2/outbound/dnclists/{dncListId}/importstatus | Get dialer dncList import status.
*OutboundApi* | [**getOutboundDnclists**](docs/OutboundApi.md#getOutboundDnclists) | **GET** /api/v2/outbound/dnclists | Query dialer DNC lists
*OutboundApi* | [**getOutboundRuleset**](docs/OutboundApi.md#getOutboundRuleset) | **GET** /api/v2/outbound/rulesets/{ruleSetId} | Get a Rule Set by ID.
*OutboundApi* | [**getOutboundRulesets**](docs/OutboundApi.md#getOutboundRulesets) | **GET** /api/v2/outbound/rulesets | Query a list of Rule Sets.
*OutboundApi* | [**getOutboundSchedulesCampaign**](docs/OutboundApi.md#getOutboundSchedulesCampaign) | **GET** /api/v2/outbound/schedules/campaigns/{campaignId} | Get a dialer campaign schedule.
*OutboundApi* | [**getOutboundSchedulesCampaigns**](docs/OutboundApi.md#getOutboundSchedulesCampaigns) | **GET** /api/v2/outbound/schedules/campaigns | Query for a list of dialer campaign schedules.
*OutboundApi* | [**getOutboundSchedulesSequence**](docs/OutboundApi.md#getOutboundSchedulesSequence) | **GET** /api/v2/outbound/schedules/sequences/{sequenceId} | Get a dialer sequence schedule.
*OutboundApi* | [**getOutboundSchedulesSequences**](docs/OutboundApi.md#getOutboundSchedulesSequences) | **GET** /api/v2/outbound/schedules/sequences | Query for a list of dialer sequence schedules.
*OutboundApi* | [**getOutboundSequence**](docs/OutboundApi.md#getOutboundSequence) | **GET** /api/v2/outbound/sequences/{sequenceId} | Get a dialer campaign sequence.
*OutboundApi* | [**getOutboundSequences**](docs/OutboundApi.md#getOutboundSequences) | **GET** /api/v2/outbound/sequences | Query a list of dialer campaign sequences.
*OutboundApi* | [**getOutboundWrapupcodemappings**](docs/OutboundApi.md#getOutboundWrapupcodemappings) | **GET** /api/v2/outbound/wrapupcodemappings | Get the Dialer wrap up code mapping.
*OutboundApi* | [**postOutboundAttemptlimits**](docs/OutboundApi.md#postOutboundAttemptlimits) | **POST** /api/v2/outbound/attemptlimits | Create attempt limits
*OutboundApi* | [**postOutboundAudits**](docs/OutboundApi.md#postOutboundAudits) | **POST** /api/v2/outbound/audits | Retrieves audits for dialer.
*OutboundApi* | [**postOutboundCallabletimesets**](docs/OutboundApi.md#postOutboundCallabletimesets) | **POST** /api/v2/outbound/callabletimesets | Create callable time set
*OutboundApi* | [**postOutboundCallanalysisresponsesets**](docs/OutboundApi.md#postOutboundCallanalysisresponsesets) | **POST** /api/v2/outbound/callanalysisresponsesets | Create a dialer call analysis response set.
*OutboundApi* | [**postOutboundCampaignCallbackSchedule**](docs/OutboundApi.md#postOutboundCampaignCallbackSchedule) | **POST** /api/v2/outbound/campaigns/{campaignId}/callback/schedule | Schedule a Callback for a Dialer Campaign (Deprecated)
*OutboundApi* | [**postOutboundCampaignrules**](docs/OutboundApi.md#postOutboundCampaignrules) | **POST** /api/v2/outbound/campaignrules | Create Campaign Rule
*OutboundApi* | [**postOutboundCampaigns**](docs/OutboundApi.md#postOutboundCampaigns) | **POST** /api/v2/outbound/campaigns | Create a campaign.
*OutboundApi* | [**postOutboundCampaignsProgress**](docs/OutboundApi.md#postOutboundCampaignsProgress) | **POST** /api/v2/outbound/campaigns/progress | Get progress for a list of campaigns
*OutboundApi* | [**postOutboundContactlistContacts**](docs/OutboundApi.md#postOutboundContactlistContacts) | **POST** /api/v2/outbound/contactlists/{contactListId}/contacts | Add contacts to a contact list.
*OutboundApi* | [**postOutboundContactlistExport**](docs/OutboundApi.md#postOutboundContactlistExport) | **POST** /api/v2/outbound/contactlists/{contactListId}/export | Initiate the export of a contact list.
*OutboundApi* | [**postOutboundContactlists**](docs/OutboundApi.md#postOutboundContactlists) | **POST** /api/v2/outbound/contactlists | Create a contact List.
*OutboundApi* | [**postOutboundConversationDnc**](docs/OutboundApi.md#postOutboundConversationDnc) | **POST** /api/v2/outbound/conversations/{conversationId}/dnc | Add phone numbers to a Dialer DNC list.
*OutboundApi* | [**postOutboundDnclistExport**](docs/OutboundApi.md#postOutboundDnclistExport) | **POST** /api/v2/outbound/dnclists/{dncListId}/export | Initiate the export of a dnc list.
*OutboundApi* | [**postOutboundDnclistPhonenumbers**](docs/OutboundApi.md#postOutboundDnclistPhonenumbers) | **POST** /api/v2/outbound/dnclists/{dncListId}/phonenumbers | Add phone numbers to a Dialer DNC list.
*OutboundApi* | [**postOutboundDnclists**](docs/OutboundApi.md#postOutboundDnclists) | **POST** /api/v2/outbound/dnclists | Create dialer DNC list
*OutboundApi* | [**postOutboundRulesets**](docs/OutboundApi.md#postOutboundRulesets) | **POST** /api/v2/outbound/rulesets | Create a Dialer Call Analysis Response Set.
*OutboundApi* | [**postOutboundSequences**](docs/OutboundApi.md#postOutboundSequences) | **POST** /api/v2/outbound/sequences | Create a new campaign sequence.
*OutboundApi* | [**putOutboundAttemptlimit**](docs/OutboundApi.md#putOutboundAttemptlimit) | **PUT** /api/v2/outbound/attemptlimits/{attemptLimitsId} | Update attempt limits
*OutboundApi* | [**putOutboundCallabletimeset**](docs/OutboundApi.md#putOutboundCallabletimeset) | **PUT** /api/v2/outbound/callabletimesets/{callableTimeSetId} | Update callable time set
*OutboundApi* | [**putOutboundCallanalysisresponseset**](docs/OutboundApi.md#putOutboundCallanalysisresponseset) | **PUT** /api/v2/outbound/callanalysisresponsesets/{callAnalysisSetId} | Update a dialer call analysis response set.
*OutboundApi* | [**putOutboundCampaign**](docs/OutboundApi.md#putOutboundCampaign) | **PUT** /api/v2/outbound/campaigns/{campaignId} | Update a campaign.
*OutboundApi* | [**putOutboundCampaignAgent**](docs/OutboundApi.md#putOutboundCampaignAgent) | **PUT** /api/v2/outbound/campaigns/{campaignId}/agents/{userId} | Send notification that an agent&#39;s state changed 
*OutboundApi* | [**putOutboundCampaignrule**](docs/OutboundApi.md#putOutboundCampaignrule) | **PUT** /api/v2/outbound/campaignrules/{campaignRuleId} | Update Campaign Rule
*OutboundApi* | [**putOutboundContactlist**](docs/OutboundApi.md#putOutboundContactlist) | **PUT** /api/v2/outbound/contactlists/{contactListId} | Update a contact list.
*OutboundApi* | [**putOutboundContactlistContact**](docs/OutboundApi.md#putOutboundContactlistContact) | **PUT** /api/v2/outbound/contactlists/{contactListId}/contacts/{contactId} | Update a contact.
*OutboundApi* | [**putOutboundDnclist**](docs/OutboundApi.md#putOutboundDnclist) | **PUT** /api/v2/outbound/dnclists/{dncListId} | Update dialer DNC list
*OutboundApi* | [**putOutboundRuleset**](docs/OutboundApi.md#putOutboundRuleset) | **PUT** /api/v2/outbound/rulesets/{ruleSetId} | Update a RuleSet.
*OutboundApi* | [**putOutboundSchedulesCampaign**](docs/OutboundApi.md#putOutboundSchedulesCampaign) | **PUT** /api/v2/outbound/schedules/campaigns/{campaignId} | Update a new campaign schedule.
*OutboundApi* | [**putOutboundSchedulesSequence**](docs/OutboundApi.md#putOutboundSchedulesSequence) | **PUT** /api/v2/outbound/schedules/sequences/{sequenceId} | Update a new sequence schedule.
*OutboundApi* | [**putOutboundSequence**](docs/OutboundApi.md#putOutboundSequence) | **PUT** /api/v2/outbound/sequences/{sequenceId} | Update a new campaign sequence.
*OutboundApi* | [**putOutboundWrapupcodemappings**](docs/OutboundApi.md#putOutboundWrapupcodemappings) | **PUT** /api/v2/outbound/wrapupcodemappings | Update the Dialer wrap up code mapping.
*PresenceApi* | [**deletePresencedefinition**](docs/PresenceApi.md#deletePresencedefinition) | **DELETE** /api/v2/presencedefinitions/{presenceId} | Delete a Presence Definition
*PresenceApi* | [**getPresencedefinition**](docs/PresenceApi.md#getPresencedefinition) | **GET** /api/v2/presencedefinitions/{presenceId} | Get a Presence Definition
*PresenceApi* | [**getPresencedefinitions**](docs/PresenceApi.md#getPresencedefinitions) | **GET** /api/v2/presencedefinitions | Get an Organization&#39;s list of Presence Definitions
*PresenceApi* | [**getSystempresences**](docs/PresenceApi.md#getSystempresences) | **GET** /api/v2/systempresences | Get the list of SystemPresences
*PresenceApi* | [**getUserPresence**](docs/PresenceApi.md#getUserPresence) | **GET** /api/v2/users/{userId}/presences/{sourceId} | Get a user&#39;s Presence
*PresenceApi* | [**patchUserPresence**](docs/PresenceApi.md#patchUserPresence) | **PATCH** /api/v2/users/{userId}/presences/{sourceId} | Patch a user&#39;s Presence
*PresenceApi* | [**postPresencedefinitions**](docs/PresenceApi.md#postPresencedefinitions) | **POST** /api/v2/presencedefinitions | Create a Presence Definition
*PresenceApi* | [**putPresencedefinition**](docs/PresenceApi.md#putPresencedefinition) | **PUT** /api/v2/presencedefinitions/{presenceId} | Update a Presence Definition
*QualityApi* | [**deleteQualityCalibration**](docs/QualityApi.md#deleteQualityCalibration) | **DELETE** /api/v2/quality/calibrations/{calibrationId} | Delete a calibration by id.
*QualityApi* | [**deleteQualityConversationEvaluation**](docs/QualityApi.md#deleteQualityConversationEvaluation) | **DELETE** /api/v2/quality/conversations/{conversationId}/evaluations/{evaluationId} | Delete an evaluation
*QualityApi* | [**deleteQualityForm**](docs/QualityApi.md#deleteQualityForm) | **DELETE** /api/v2/quality/forms/{formId} | Delete an evaluation form.
*QualityApi* | [**deleteQualityKeywordset**](docs/QualityApi.md#deleteQualityKeywordset) | **DELETE** /api/v2/quality/keywordsets/{keywordSetId} | Delete a keywordSet by id.
*QualityApi* | [**deleteQualityKeywordsets**](docs/QualityApi.md#deleteQualityKeywordsets) | **DELETE** /api/v2/quality/keywordsets | Delete keyword sets
*QualityApi* | [**getQualityAgentsActivity**](docs/QualityApi.md#getQualityAgentsActivity) | **GET** /api/v2/quality/agents/activity | Gets a list of Agent Activities
*QualityApi* | [**getQualityCalibration**](docs/QualityApi.md#getQualityCalibration) | **GET** /api/v2/quality/calibrations/{calibrationId} | Get a calibration by id.
*QualityApi* | [**getQualityCalibrations**](docs/QualityApi.md#getQualityCalibrations) | **GET** /api/v2/quality/calibrations | Get the list of calibrations
*QualityApi* | [**getQualityConversationAudits**](docs/QualityApi.md#getQualityConversationAudits) | **GET** /api/v2/quality/conversations/{conversationId}/audits | Get audits for conversation or recording
*QualityApi* | [**getQualityConversationEvaluation**](docs/QualityApi.md#getQualityConversationEvaluation) | **GET** /api/v2/quality/conversations/{conversationId}/evaluations/{evaluationId} | Get an evaluation
*QualityApi* | [**getQualityEvaluationsQuery**](docs/QualityApi.md#getQualityEvaluationsQuery) | **GET** /api/v2/quality/evaluations/query | Queries Evaluations and returns a paged list
*QualityApi* | [**getQualityEvaluatorsActivity**](docs/QualityApi.md#getQualityEvaluatorsActivity) | **GET** /api/v2/quality/evaluators/activity | Get an evaluator activity
*QualityApi* | [**getQualityForm**](docs/QualityApi.md#getQualityForm) | **GET** /api/v2/quality/forms/{formId} | Get an evaluation form
*QualityApi* | [**getQualityFormVersions**](docs/QualityApi.md#getQualityFormVersions) | **GET** /api/v2/quality/forms/{formId}/versions | Gets all the revisions for a specific evaluation.
*QualityApi* | [**getQualityForms**](docs/QualityApi.md#getQualityForms) | **GET** /api/v2/quality/forms | Get the list of evaluation forms
*QualityApi* | [**getQualityKeywordset**](docs/QualityApi.md#getQualityKeywordset) | **GET** /api/v2/quality/keywordsets/{keywordSetId} | Get a keywordSet by id.
*QualityApi* | [**getQualityKeywordsets**](docs/QualityApi.md#getQualityKeywordsets) | **GET** /api/v2/quality/keywordsets | Get the list of keyword sets
*QualityApi* | [**getQualityPublishedform**](docs/QualityApi.md#getQualityPublishedform) | **GET** /api/v2/quality/publishedforms/{formId} | Get the published evaluation forms.
*QualityApi* | [**getQualityPublishedforms**](docs/QualityApi.md#getQualityPublishedforms) | **GET** /api/v2/quality/publishedforms | Get the published evaluation forms.
*QualityApi* | [**postAnalyticsEvaluationsAggregatesQuery**](docs/QualityApi.md#postAnalyticsEvaluationsAggregatesQuery) | **POST** /api/v2/analytics/evaluations/aggregates/query | Query for evaluation aggregates
*QualityApi* | [**postQualityCalibrations**](docs/QualityApi.md#postQualityCalibrations) | **POST** /api/v2/quality/calibrations | Create a calibration
*QualityApi* | [**postQualityConversationEvaluations**](docs/QualityApi.md#postQualityConversationEvaluations) | **POST** /api/v2/quality/conversations/{conversationId}/evaluations | Create an evaluation
*QualityApi* | [**postQualityEvaluationsScoring**](docs/QualityApi.md#postQualityEvaluationsScoring) | **POST** /api/v2/quality/evaluations/scoring | Score evaluation
*QualityApi* | [**postQualityForms**](docs/QualityApi.md#postQualityForms) | **POST** /api/v2/quality/forms | Create an evaluation form.
*QualityApi* | [**postQualityKeywordsets**](docs/QualityApi.md#postQualityKeywordsets) | **POST** /api/v2/quality/keywordsets | Create a Keyword Set
*QualityApi* | [**postQualityPublishedforms**](docs/QualityApi.md#postQualityPublishedforms) | **POST** /api/v2/quality/publishedforms | Publish an evaluation form.
*QualityApi* | [**postQualitySpotability**](docs/QualityApi.md#postQualitySpotability) | **POST** /api/v2/quality/spotability | Retrieve the spotability statistic
*QualityApi* | [**putQualityCalibration**](docs/QualityApi.md#putQualityCalibration) | **PUT** /api/v2/quality/calibrations/{calibrationId} | Update a calibration to the specified calibration via PUT.  Editable fields include: evaluators, expertEvaluator, and scoringIndex
*QualityApi* | [**putQualityConversationEvaluation**](docs/QualityApi.md#putQualityConversationEvaluation) | **PUT** /api/v2/quality/conversations/{conversationId}/evaluations/{evaluationId} | Update an evaluation
*QualityApi* | [**putQualityForm**](docs/QualityApi.md#putQualityForm) | **PUT** /api/v2/quality/forms/{formId} | Update an evaluation form.
*QualityApi* | [**putQualityKeywordset**](docs/QualityApi.md#putQualityKeywordset) | **PUT** /api/v2/quality/keywordsets/{keywordSetId} | Update a keywordSet to the specified keywordSet via PUT.
*RecordingApi* | [**deleteConversationRecordingAnnotation**](docs/RecordingApi.md#deleteConversationRecordingAnnotation) | **DELETE** /api/v2/conversations/{conversationId}/recordings/{recordingId}/annotations/{annotationId} | Delete annotation
*RecordingApi* | [**deleteOrphanrecording**](docs/RecordingApi.md#deleteOrphanrecording) | **DELETE** /api/v2/orphanrecordings/{orphanId} | Deletes a single orphan recording
*RecordingApi* | [**deleteRecordingMediaretentionpolicies**](docs/RecordingApi.md#deleteRecordingMediaretentionpolicies) | **DELETE** /api/v2/recording/mediaretentionpolicies | Delete media retention policies
*RecordingApi* | [**deleteRecordingMediaretentionpolicy**](docs/RecordingApi.md#deleteRecordingMediaretentionpolicy) | **DELETE** /api/v2/recording/mediaretentionpolicies/{policyId} | Delete a media retention policy
*RecordingApi* | [**getConversationRecording**](docs/RecordingApi.md#getConversationRecording) | **GET** /api/v2/conversations/{conversationId}/recordings/{recordingId} | Gets a specific recording.
*RecordingApi* | [**getConversationRecordingAnnotation**](docs/RecordingApi.md#getConversationRecordingAnnotation) | **GET** /api/v2/conversations/{conversationId}/recordings/{recordingId}/annotations/{annotationId} | Get annotation
*RecordingApi* | [**getConversationRecordingAnnotations**](docs/RecordingApi.md#getConversationRecordingAnnotations) | **GET** /api/v2/conversations/{conversationId}/recordings/{recordingId}/annotations | Get annotations for recording
*RecordingApi* | [**getConversationRecordings**](docs/RecordingApi.md#getConversationRecordings) | **GET** /api/v2/conversations/{conversationId}/recordings | Get all of a Conversation&#39;s Recordings.
*RecordingApi* | [**getOrphanrecording**](docs/RecordingApi.md#getOrphanrecording) | **GET** /api/v2/orphanrecordings/{orphanId} | Gets a single orphan recording
*RecordingApi* | [**getOrphanrecordingMedia**](docs/RecordingApi.md#getOrphanrecordingMedia) | **GET** /api/v2/orphanrecordings/{orphanId}/media | Gets the media of a single orphan recording
*RecordingApi* | [**getOrphanrecordings**](docs/RecordingApi.md#getOrphanrecordings) | **GET** /api/v2/orphanrecordings | Gets all orphan recordings
*RecordingApi* | [**getRecordingLocalkeysSetting**](docs/RecordingApi.md#getRecordingLocalkeysSetting) | **GET** /api/v2/recording/localkeys/settings/{settingsId} | Get the local encryption settings
*RecordingApi* | [**getRecordingLocalkeysSettings**](docs/RecordingApi.md#getRecordingLocalkeysSettings) | **GET** /api/v2/recording/localkeys/settings | gets a list local key settings data
*RecordingApi* | [**getRecordingMediaretentionpolicies**](docs/RecordingApi.md#getRecordingMediaretentionpolicies) | **GET** /api/v2/recording/mediaretentionpolicies | Gets media retention policy list with query options to filter on name and enabled.
*RecordingApi* | [**getRecordingMediaretentionpolicy**](docs/RecordingApi.md#getRecordingMediaretentionpolicy) | **GET** /api/v2/recording/mediaretentionpolicies/{policyId} | Get a media retention policy
*RecordingApi* | [**getRecordingRecordingkeys**](docs/RecordingApi.md#getRecordingRecordingkeys) | **GET** /api/v2/recording/recordingkeys | Get encryption key list
*RecordingApi* | [**getRecordingRecordingkeysRotationschedule**](docs/RecordingApi.md#getRecordingRecordingkeysRotationschedule) | **GET** /api/v2/recording/recordingkeys/rotationschedule | Get key rotation schedule
*RecordingApi* | [**getRecordingSettings**](docs/RecordingApi.md#getRecordingSettings) | **GET** /api/v2/recording/settings | Get the Recording Settings for the Organization
*RecordingApi* | [**getRecordingsScreensessions**](docs/RecordingApi.md#getRecordingsScreensessions) | **GET** /api/v2/recordings/screensessions | Retrieves a paged listing of screen recording sessions
*RecordingApi* | [**patchRecordingMediaretentionpolicy**](docs/RecordingApi.md#patchRecordingMediaretentionpolicy) | **PATCH** /api/v2/recording/mediaretentionpolicies/{policyId} | Patch a media retention policy
*RecordingApi* | [**patchRecordingsScreensession**](docs/RecordingApi.md#patchRecordingsScreensession) | **PATCH** /api/v2/recordings/screensessions/{recordingSessionId} | Update a screen recording session
*RecordingApi* | [**postConversationRecordingAnnotations**](docs/RecordingApi.md#postConversationRecordingAnnotations) | **POST** /api/v2/conversations/{conversationId}/recordings/{recordingId}/annotations | Create annotation
*RecordingApi* | [**postRecordingLocalkeys**](docs/RecordingApi.md#postRecordingLocalkeys) | **POST** /api/v2/recording/localkeys | create a local recording key
*RecordingApi* | [**postRecordingLocalkeysSettings**](docs/RecordingApi.md#postRecordingLocalkeysSettings) | **POST** /api/v2/recording/localkeys/settings | create settings for local key creation
*RecordingApi* | [**postRecordingMediaretentionpolicies**](docs/RecordingApi.md#postRecordingMediaretentionpolicies) | **POST** /api/v2/recording/mediaretentionpolicies | Create media retention policy
*RecordingApi* | [**postRecordingRecordingkeys**](docs/RecordingApi.md#postRecordingRecordingkeys) | **POST** /api/v2/recording/recordingkeys | Create encryption key
*RecordingApi* | [**putConversationRecording**](docs/RecordingApi.md#putConversationRecording) | **PUT** /api/v2/conversations/{conversationId}/recordings/{recordingId} | Updates the retention records on a recording.
*RecordingApi* | [**putConversationRecordingAnnotation**](docs/RecordingApi.md#putConversationRecordingAnnotation) | **PUT** /api/v2/conversations/{conversationId}/recordings/{recordingId}/annotations/{annotationId} | Update annotation
*RecordingApi* | [**putOrphanrecording**](docs/RecordingApi.md#putOrphanrecording) | **PUT** /api/v2/orphanrecordings/{orphanId} | Updates an orphan recording to a regular recording with retention values
*RecordingApi* | [**putRecordingLocalkeysSetting**](docs/RecordingApi.md#putRecordingLocalkeysSetting) | **PUT** /api/v2/recording/localkeys/settings/{settingsId} | Update the local encryption settings
*RecordingApi* | [**putRecordingMediaretentionpolicy**](docs/RecordingApi.md#putRecordingMediaretentionpolicy) | **PUT** /api/v2/recording/mediaretentionpolicies/{policyId} | Update a media retention policy
*RecordingApi* | [**putRecordingRecordingkeysRotationschedule**](docs/RecordingApi.md#putRecordingRecordingkeysRotationschedule) | **PUT** /api/v2/recording/recordingkeys/rotationschedule | Update key rotation schedule
*RecordingApi* | [**putRecordingSettings**](docs/RecordingApi.md#putRecordingSettings) | **PUT** /api/v2/recording/settings | Update the Recording Settings for the Organization
*ResponseManagementApi* | [**deleteResponsemanagementLibrary**](docs/ResponseManagementApi.md#deleteResponsemanagementLibrary) | **DELETE** /api/v2/responsemanagement/libraries/{libraryId} | Delete an existing response library.
*ResponseManagementApi* | [**deleteResponsemanagementResponse**](docs/ResponseManagementApi.md#deleteResponsemanagementResponse) | **DELETE** /api/v2/responsemanagement/responses/{responseId} | Delete an existing response.
*ResponseManagementApi* | [**getResponsemanagementLibraries**](docs/ResponseManagementApi.md#getResponsemanagementLibraries) | **GET** /api/v2/responsemanagement/libraries | Gets a list of existing response libraries.
*ResponseManagementApi* | [**getResponsemanagementLibrary**](docs/ResponseManagementApi.md#getResponsemanagementLibrary) | **GET** /api/v2/responsemanagement/libraries/{libraryId} | Get details about an existing response library.
*ResponseManagementApi* | [**getResponsemanagementResponse**](docs/ResponseManagementApi.md#getResponsemanagementResponse) | **GET** /api/v2/responsemanagement/responses/{responseId} | Get details about an existing response.
*ResponseManagementApi* | [**getResponsemanagementResponses**](docs/ResponseManagementApi.md#getResponsemanagementResponses) | **GET** /api/v2/responsemanagement/responses | Gets a list of existing responses.
*ResponseManagementApi* | [**postResponsemanagementLibraries**](docs/ResponseManagementApi.md#postResponsemanagementLibraries) | **POST** /api/v2/responsemanagement/libraries | Create a response library.
*ResponseManagementApi* | [**postResponsemanagementResponses**](docs/ResponseManagementApi.md#postResponsemanagementResponses) | **POST** /api/v2/responsemanagement/responses | Create a response.
*ResponseManagementApi* | [**postResponsemanagementResponsesQuery**](docs/ResponseManagementApi.md#postResponsemanagementResponsesQuery) | **POST** /api/v2/responsemanagement/responses/query | Query responses
*ResponseManagementApi* | [**putResponsemanagementLibrary**](docs/ResponseManagementApi.md#putResponsemanagementLibrary) | **PUT** /api/v2/responsemanagement/libraries/{libraryId} | Update an existing response library.
*ResponseManagementApi* | [**putResponsemanagementResponse**](docs/ResponseManagementApi.md#putResponsemanagementResponse) | **PUT** /api/v2/responsemanagement/responses/{responseId} | Update an existing response.
*RoutingApi* | [**deleteRoutingEmailDomain**](docs/RoutingApi.md#deleteRoutingEmailDomain) | **DELETE** /api/v2/routing/email/domains/{domainId} | Delete a domain
*RoutingApi* | [**deleteRoutingEmailDomainRoute**](docs/RoutingApi.md#deleteRoutingEmailDomainRoute) | **DELETE** /api/v2/routing/email/domains/{domainName}/routes/{routeId} | Delete a route
*RoutingApi* | [**deleteRoutingQueue**](docs/RoutingApi.md#deleteRoutingQueue) | **DELETE** /api/v2/routing/queues/{queueId} | Delete a queue
*RoutingApi* | [**deleteRoutingQueueUser**](docs/RoutingApi.md#deleteRoutingQueueUser) | **DELETE** /api/v2/routing/queues/{queueId}/users/{memberId} | Delete queue member
*RoutingApi* | [**deleteRoutingQueueWrapupcode**](docs/RoutingApi.md#deleteRoutingQueueWrapupcode) | **DELETE** /api/v2/routing/queues/{queueId}/wrapupcodes/{codeId} | Delete a wrap-up code from a queue
*RoutingApi* | [**deleteRoutingSkill**](docs/RoutingApi.md#deleteRoutingSkill) | **DELETE** /api/v2/routing/skills/{skillId} | Delete Routing Skill
*RoutingApi* | [**deleteRoutingUtilization**](docs/RoutingApi.md#deleteRoutingUtilization) | **DELETE** /api/v2/routing/utilization | Delete utilization settings and revert to system defaults.
*RoutingApi* | [**deleteRoutingWrapupcode**](docs/RoutingApi.md#deleteRoutingWrapupcode) | **DELETE** /api/v2/routing/wrapupcodes/{codeId} | Delete wrap-up code
*RoutingApi* | [**deleteUserRoutingskill**](docs/RoutingApi.md#deleteUserRoutingskill) | **DELETE** /api/v2/users/{userId}/routingskills/{skillId} | Remove routing skill from user
*RoutingApi* | [**getRoutingEmailDomain**](docs/RoutingApi.md#getRoutingEmailDomain) | **GET** /api/v2/routing/email/domains/{domainId} | Get domain
*RoutingApi* | [**getRoutingEmailDomainRoute**](docs/RoutingApi.md#getRoutingEmailDomainRoute) | **GET** /api/v2/routing/email/domains/{domainName}/routes/{routeId} | Get a route
*RoutingApi* | [**getRoutingEmailDomainRoutes**](docs/RoutingApi.md#getRoutingEmailDomainRoutes) | **GET** /api/v2/routing/email/domains/{domainName}/routes | Get routes
*RoutingApi* | [**getRoutingEmailDomains**](docs/RoutingApi.md#getRoutingEmailDomains) | **GET** /api/v2/routing/email/domains | Get domains
*RoutingApi* | [**getRoutingEmailSetup**](docs/RoutingApi.md#getRoutingEmailSetup) | **GET** /api/v2/routing/email/setup | Get email setup
*RoutingApi* | [**getRoutingLanguages**](docs/RoutingApi.md#getRoutingLanguages) | **GET** /api/v2/routing/languages | Get the list of supported languages.
*RoutingApi* | [**getRoutingQueue**](docs/RoutingApi.md#getRoutingQueue) | **GET** /api/v2/routing/queues/{queueId} | Get details about this queue.
*RoutingApi* | [**getRoutingQueueEstimatedwaittime**](docs/RoutingApi.md#getRoutingQueueEstimatedwaittime) | **GET** /api/v2/routing/queues/{queueId}/estimatedwaittime | Get Estimated Wait Time
*RoutingApi* | [**getRoutingQueueMediatypeEstimatedwaittime**](docs/RoutingApi.md#getRoutingQueueMediatypeEstimatedwaittime) | **GET** /api/v2/routing/queues/{queueId}/mediatypes/{mediaType}/estimatedwaittime | Get Estimated Wait Time
*RoutingApi* | [**getRoutingQueueUsers**](docs/RoutingApi.md#getRoutingQueueUsers) | **GET** /api/v2/routing/queues/{queueId}/users | Get the members of this queue
*RoutingApi* | [**getRoutingQueueWrapupcodes**](docs/RoutingApi.md#getRoutingQueueWrapupcodes) | **GET** /api/v2/routing/queues/{queueId}/wrapupcodes | Get the wrap-up codes for a queue
*RoutingApi* | [**getRoutingQueues**](docs/RoutingApi.md#getRoutingQueues) | **GET** /api/v2/routing/queues | Get list of queues.
*RoutingApi* | [**getRoutingSkill**](docs/RoutingApi.md#getRoutingSkill) | **GET** /api/v2/routing/skills/{skillId} | Get Routing Skill
*RoutingApi* | [**getRoutingSkills**](docs/RoutingApi.md#getRoutingSkills) | **GET** /api/v2/routing/skills | Get the list of routing skills.
*RoutingApi* | [**getRoutingUtilization**](docs/RoutingApi.md#getRoutingUtilization) | **GET** /api/v2/routing/utilization | Get the utilization settings.
*RoutingApi* | [**getRoutingWrapupcode**](docs/RoutingApi.md#getRoutingWrapupcode) | **GET** /api/v2/routing/wrapupcodes/{codeId} | Get details about this wrap-up code.
*RoutingApi* | [**getRoutingWrapupcodes**](docs/RoutingApi.md#getRoutingWrapupcodes) | **GET** /api/v2/routing/wrapupcodes | Get list of wrapup codes.
*RoutingApi* | [**getUserRoutingskills**](docs/RoutingApi.md#getUserRoutingskills) | **GET** /api/v2/users/{userId}/routingskills | List routing skills for user
*RoutingApi* | [**patchRoutingQueueUser**](docs/RoutingApi.md#patchRoutingQueueUser) | **PATCH** /api/v2/routing/queues/{queueId}/users/{memberId} | Update the ring number of joined status for a User in a Queue
*RoutingApi* | [**patchRoutingQueueUsers**](docs/RoutingApi.md#patchRoutingQueueUsers) | **PATCH** /api/v2/routing/queues/{queueId}/users | Join or unjoin a set of users for a queue
*RoutingApi* | [**postAnalyticsQueuesObservationsQuery**](docs/RoutingApi.md#postAnalyticsQueuesObservationsQuery) | **POST** /api/v2/analytics/queues/observations/query | Query for queue observations
*RoutingApi* | [**postRoutingEmailDomainRoutes**](docs/RoutingApi.md#postRoutingEmailDomainRoutes) | **POST** /api/v2/routing/email/domains/{domainName}/routes | Create a route
*RoutingApi* | [**postRoutingEmailDomains**](docs/RoutingApi.md#postRoutingEmailDomains) | **POST** /api/v2/routing/email/domains | Create a domain
*RoutingApi* | [**postRoutingLanguages**](docs/RoutingApi.md#postRoutingLanguages) | **POST** /api/v2/routing/languages | Create Language
*RoutingApi* | [**postRoutingQueueUsers**](docs/RoutingApi.md#postRoutingQueueUsers) | **POST** /api/v2/routing/queues/{queueId}/users | Bulk add or delete up to 100 queue members
*RoutingApi* | [**postRoutingQueueWrapupcodes**](docs/RoutingApi.md#postRoutingQueueWrapupcodes) | **POST** /api/v2/routing/queues/{queueId}/wrapupcodes | Add up to 100 wrap-up codes to a queue
*RoutingApi* | [**postRoutingQueues**](docs/RoutingApi.md#postRoutingQueues) | **POST** /api/v2/routing/queues | Create queue
*RoutingApi* | [**postRoutingSkills**](docs/RoutingApi.md#postRoutingSkills) | **POST** /api/v2/routing/skills | Create Skill
*RoutingApi* | [**postRoutingWrapupcodes**](docs/RoutingApi.md#postRoutingWrapupcodes) | **POST** /api/v2/routing/wrapupcodes | Create a wrap-up code
*RoutingApi* | [**postUserRoutingskills**](docs/RoutingApi.md#postUserRoutingskills) | **POST** /api/v2/users/{userId}/routingskills | Add routing skill to user
*RoutingApi* | [**putRoutingEmailDomainRoute**](docs/RoutingApi.md#putRoutingEmailDomainRoute) | **PUT** /api/v2/routing/email/domains/{domainName}/routes/{routeId} | Update a route
*RoutingApi* | [**putRoutingQueue**](docs/RoutingApi.md#putRoutingQueue) | **PUT** /api/v2/routing/queues/{queueId} | Update a queue
*RoutingApi* | [**putRoutingUtilization**](docs/RoutingApi.md#putRoutingUtilization) | **PUT** /api/v2/routing/utilization | Update the utilization settings.
*RoutingApi* | [**putRoutingWrapupcode**](docs/RoutingApi.md#putRoutingWrapupcode) | **PUT** /api/v2/routing/wrapupcodes/{codeId} | Update wrap-up code
*RoutingApi* | [**putUserRoutingskill**](docs/RoutingApi.md#putUserRoutingskill) | **PUT** /api/v2/users/{userId}/routingskills/{skillId} | Update routing skill proficiency or state.
*ScriptsApi* | [**getScript**](docs/ScriptsApi.md#getScript) | **GET** /api/v2/scripts/{scriptId} | Get a script
*ScriptsApi* | [**getScriptPage**](docs/ScriptsApi.md#getScriptPage) | **GET** /api/v2/scripts/{scriptId}/pages/{pageId} | Get a page
*ScriptsApi* | [**getScriptPages**](docs/ScriptsApi.md#getScriptPages) | **GET** /api/v2/scripts/{scriptId}/pages | Get the list of pages
*ScriptsApi* | [**getScripts**](docs/ScriptsApi.md#getScripts) | **GET** /api/v2/scripts | Get the list of scripts
*ScriptsApi* | [**getScriptsPublished**](docs/ScriptsApi.md#getScriptsPublished) | **GET** /api/v2/scripts/published | Get the published scripts.
*ScriptsApi* | [**getScriptsPublishedScriptId**](docs/ScriptsApi.md#getScriptsPublishedScriptId) | **GET** /api/v2/scripts/published/{scriptId} | Get the published script.
*ScriptsApi* | [**getScriptsPublishedScriptIdPage**](docs/ScriptsApi.md#getScriptsPublishedScriptIdPage) | **GET** /api/v2/scripts/published/{scriptId}/pages/{pageId} | Get the published page.
*ScriptsApi* | [**getScriptsPublishedScriptIdPages**](docs/ScriptsApi.md#getScriptsPublishedScriptIdPages) | **GET** /api/v2/scripts/published/{scriptId}/pages | Get the list of published pages
*ScriptsApi* | [**getScriptsPublishedScriptIdVariables**](docs/ScriptsApi.md#getScriptsPublishedScriptIdVariables) | **GET** /api/v2/scripts/published/{scriptId}/variables | Get the published variables
*SearchApi* | [**getDocumentationSearch**](docs/SearchApi.md#getDocumentationSearch) | **GET** /api/v2/documentation/search | Search documentation using the q64 value returned from a previous search
*SearchApi* | [**getGroupsSearch**](docs/SearchApi.md#getGroupsSearch) | **GET** /api/v2/groups/search | Search groups using the q64 value returned from a previous search
*SearchApi* | [**getLocationsSearch**](docs/SearchApi.md#getLocationsSearch) | **GET** /api/v2/locations/search | Search locations using the q64 value returned from a previous search
*SearchApi* | [**getSearch**](docs/SearchApi.md#getSearch) | **GET** /api/v2/search | Search using the q64 value returned from a previous search.
*SearchApi* | [**getSearchSuggest**](docs/SearchApi.md#getSearchSuggest) | **GET** /api/v2/search/suggest | Suggest resources using the q64 value returned from a previous suggest query.
*SearchApi* | [**getUsersSearch**](docs/SearchApi.md#getUsersSearch) | **GET** /api/v2/users/search | Search users using the q64 value returned from a previous search
*SearchApi* | [**getVoicemailSearch**](docs/SearchApi.md#getVoicemailSearch) | **GET** /api/v2/voicemail/search | Search voicemails using the q64 value returned from a previous search
*SearchApi* | [**postDocumentationSearch**](docs/SearchApi.md#postDocumentationSearch) | **POST** /api/v2/documentation/search | Search documentation
*SearchApi* | [**postGroupsSearch**](docs/SearchApi.md#postGroupsSearch) | **POST** /api/v2/groups/search | Search groups
*SearchApi* | [**postLocationsSearch**](docs/SearchApi.md#postLocationsSearch) | **POST** /api/v2/locations/search | Search locations
*SearchApi* | [**postSearch**](docs/SearchApi.md#postSearch) | **POST** /api/v2/search | Search resources.
*SearchApi* | [**postSearchSuggest**](docs/SearchApi.md#postSearchSuggest) | **POST** /api/v2/search/suggest | Suggest resources.
*SearchApi* | [**postUsersSearch**](docs/SearchApi.md#postUsersSearch) | **POST** /api/v2/users/search | Search users
*SearchApi* | [**postVoicemailSearch**](docs/SearchApi.md#postVoicemailSearch) | **POST** /api/v2/voicemail/search | Search voicemails
*StationsApi* | [**deleteStationAssociateduser**](docs/StationsApi.md#deleteStationAssociateduser) | **DELETE** /api/v2/stations/{stationId}/associateduser | Unassigns the user assigned to this station
*StationsApi* | [**getStation**](docs/StationsApi.md#getStation) | **GET** /api/v2/stations/{stationId} | Get station.
*StationsApi* | [**getStations**](docs/StationsApi.md#getStations) | **GET** /api/v2/stations | Get the list of available stations.
*SuggestApi* | [**getSearch**](docs/SuggestApi.md#getSearch) | **GET** /api/v2/search | Search using the q64 value returned from a previous search.
*SuggestApi* | [**getSearchSuggest**](docs/SuggestApi.md#getSearchSuggest) | **GET** /api/v2/search/suggest | Suggest resources using the q64 value returned from a previous suggest query.
*SuggestApi* | [**postSearch**](docs/SuggestApi.md#postSearch) | **POST** /api/v2/search | Search resources.
*SuggestApi* | [**postSearchSuggest**](docs/SuggestApi.md#postSearchSuggest) | **POST** /api/v2/search/suggest | Suggest resources.
*TelephonyProvidersEdgeApi* | [**deleteTelephonyProvidersEdge**](docs/TelephonyProvidersEdgeApi.md#deleteTelephonyProvidersEdge) | **DELETE** /api/v2/telephony/providers/edges/{edgeId} | Delete a edge.
*TelephonyProvidersEdgeApi* | [**deleteTelephonyProvidersEdgeLogicalinterface**](docs/TelephonyProvidersEdgeApi.md#deleteTelephonyProvidersEdgeLogicalinterface) | **DELETE** /api/v2/telephony/providers/edges/{edgeId}/logicalinterfaces/{interfaceId} | Delete an edge logical interface
*TelephonyProvidersEdgeApi* | [**deleteTelephonyProvidersEdgeSoftwareupdate**](docs/TelephonyProvidersEdgeApi.md#deleteTelephonyProvidersEdgeSoftwareupdate) | **DELETE** /api/v2/telephony/providers/edges/{edgeId}/softwareupdate | Cancels any in-progress update for this edge.
*TelephonyProvidersEdgeApi* | [**deleteTelephonyProvidersEdgesCertificateauthority**](docs/TelephonyProvidersEdgeApi.md#deleteTelephonyProvidersEdgesCertificateauthority) | **DELETE** /api/v2/telephony/providers/edges/certificateauthorities/{certificateId} | Delete a certificate authority.
*TelephonyProvidersEdgeApi* | [**deleteTelephonyProvidersEdgesDidpool**](docs/TelephonyProvidersEdgeApi.md#deleteTelephonyProvidersEdgesDidpool) | **DELETE** /api/v2/telephony/providers/edges/didpools/{didPoolId} | Delete a DID Pool by ID.
*TelephonyProvidersEdgeApi* | [**deleteTelephonyProvidersEdgesEdgegroup**](docs/TelephonyProvidersEdgeApi.md#deleteTelephonyProvidersEdgesEdgegroup) | **DELETE** /api/v2/telephony/providers/edges/edgegroups/{edgeGroupId} | Delete an edge group.
*TelephonyProvidersEdgeApi* | [**deleteTelephonyProvidersEdgesEndpoint**](docs/TelephonyProvidersEdgeApi.md#deleteTelephonyProvidersEdgesEndpoint) | **DELETE** /api/v2/telephony/providers/edges/endpoints/{endpointId} | Delete endpoint
*TelephonyProvidersEdgeApi* | [**deleteTelephonyProvidersEdgesExtensionpool**](docs/TelephonyProvidersEdgeApi.md#deleteTelephonyProvidersEdgesExtensionpool) | **DELETE** /api/v2/telephony/providers/edges/extensionpools/{extensionPoolId} | Delete an extension pool by ID
*TelephonyProvidersEdgeApi* | [**deleteTelephonyProvidersEdgesOutboundroute**](docs/TelephonyProvidersEdgeApi.md#deleteTelephonyProvidersEdgesOutboundroute) | **DELETE** /api/v2/telephony/providers/edges/outboundroutes/{outboundRouteId} | Delete Outbound Route
*TelephonyProvidersEdgeApi* | [**deleteTelephonyProvidersEdgesPhone**](docs/TelephonyProvidersEdgeApi.md#deleteTelephonyProvidersEdgesPhone) | **DELETE** /api/v2/telephony/providers/edges/phones/{phoneId} | Delete a Phone by ID
*TelephonyProvidersEdgeApi* | [**deleteTelephonyProvidersEdgesPhonebasesetting**](docs/TelephonyProvidersEdgeApi.md#deleteTelephonyProvidersEdgesPhonebasesetting) | **DELETE** /api/v2/telephony/providers/edges/phonebasesettings/{phoneBaseId} | Delete a Phone Base Settings by ID
*TelephonyProvidersEdgeApi* | [**deleteTelephonyProvidersEdgesSite**](docs/TelephonyProvidersEdgeApi.md#deleteTelephonyProvidersEdgesSite) | **DELETE** /api/v2/telephony/providers/edges/sites/{siteId} | Delete a Site by ID
*TelephonyProvidersEdgeApi* | [**deleteTelephonyProvidersEdgesSiteOutboundroute**](docs/TelephonyProvidersEdgeApi.md#deleteTelephonyProvidersEdgesSiteOutboundroute) | **DELETE** /api/v2/telephony/providers/edges/sites/{siteId}/outboundroutes/{outboundRouteId} | Delete Outbound Route
*TelephonyProvidersEdgeApi* | [**deleteTelephonyProvidersEdgesTrunkbasesetting**](docs/TelephonyProvidersEdgeApi.md#deleteTelephonyProvidersEdgesTrunkbasesetting) | **DELETE** /api/v2/telephony/providers/edges/trunkbasesettings/{trunkBaseSettingsId} | Delete a Trunk Base Settings object by ID
*TelephonyProvidersEdgeApi* | [**getConfigurationSchemasEdgesVnext**](docs/TelephonyProvidersEdgeApi.md#getConfigurationSchemasEdgesVnext) | **GET** /api/v2/configuration/schemas/edges/vnext | Lists available schema categories (Deprecated)
*TelephonyProvidersEdgeApi* | [**getConfigurationSchemasEdgesVnextSchemaCategory**](docs/TelephonyProvidersEdgeApi.md#getConfigurationSchemasEdgesVnextSchemaCategory) | **GET** /api/v2/configuration/schemas/edges/vnext/{schemaCategory} | List schemas of a specific category (Deprecated)
*TelephonyProvidersEdgeApi* | [**getConfigurationSchemasEdgesVnextSchemaCategorySchemaType**](docs/TelephonyProvidersEdgeApi.md#getConfigurationSchemasEdgesVnextSchemaCategorySchemaType) | **GET** /api/v2/configuration/schemas/edges/vnext/{schemaCategory}/{schemaType} | List schemas of a specific category (Deprecated)
*TelephonyProvidersEdgeApi* | [**getConfigurationSchemasEdgesVnextSchemaCategorySchemaTypeSchemaId**](docs/TelephonyProvidersEdgeApi.md#getConfigurationSchemasEdgesVnextSchemaCategorySchemaTypeSchemaId) | **GET** /api/v2/configuration/schemas/edges/vnext/{schemaCategory}/{schemaType}/{schemaId} | Get a json schema (Deprecated)
*TelephonyProvidersEdgeApi* | [**getConfigurationSchemasEdgesVnextSchemaCategorySchemaTypeSchemaIdExtensionTypeMetadataId**](docs/TelephonyProvidersEdgeApi.md#getConfigurationSchemasEdgesVnextSchemaCategorySchemaTypeSchemaIdExtensionTypeMetadataId) | **GET** /api/v2/configuration/schemas/edges/vnext/{schemaCategory}/{schemaType}/{schemaId}/{extensionType}/{metadataId} | Get metadata for a schema (Deprecated)
*TelephonyProvidersEdgeApi* | [**getTelephonyProvidersEdge**](docs/TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdge) | **GET** /api/v2/telephony/providers/edges/{edgeId} | Get edge.
*TelephonyProvidersEdgeApi* | [**getTelephonyProvidersEdgeLine**](docs/TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgeLine) | **GET** /api/v2/telephony/providers/edges/{edgeId}/lines/{lineId} | Get line
*TelephonyProvidersEdgeApi* | [**getTelephonyProvidersEdgeLines**](docs/TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgeLines) | **GET** /api/v2/telephony/providers/edges/{edgeId}/lines | Get the list of lines.
*TelephonyProvidersEdgeApi* | [**getTelephonyProvidersEdgeLogicalinterface**](docs/TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgeLogicalinterface) | **GET** /api/v2/telephony/providers/edges/{edgeId}/logicalinterfaces/{interfaceId} | Get an edge logical interface
*TelephonyProvidersEdgeApi* | [**getTelephonyProvidersEdgeLogicalinterfaces**](docs/TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgeLogicalinterfaces) | **GET** /api/v2/telephony/providers/edges/{edgeId}/logicalinterfaces | Get edge logical interfaces.
*TelephonyProvidersEdgeApi* | [**getTelephonyProvidersEdgeLogsJob**](docs/TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgeLogsJob) | **GET** /api/v2/telephony/providers/edges/{edgeId}/logs/jobs/{jobId} | Get an Edge logs job.
*TelephonyProvidersEdgeApi* | [**getTelephonyProvidersEdgePhysicalinterface**](docs/TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgePhysicalinterface) | **GET** /api/v2/telephony/providers/edges/{edgeId}/physicalinterfaces/{interfaceId} | Get edge physical interface.
*TelephonyProvidersEdgeApi* | [**getTelephonyProvidersEdgePhysicalinterfaces**](docs/TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgePhysicalinterfaces) | **GET** /api/v2/telephony/providers/edges/{edgeId}/physicalinterfaces | Retrieve a list of all configured physical interfaces from a specific edge.
*TelephonyProvidersEdgeApi* | [**getTelephonyProvidersEdgeSetuppackage**](docs/TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgeSetuppackage) | **GET** /api/v2/telephony/providers/edges/{edgeId}/setuppackage | Get the setup package for a locally deployed edge device. This is needed to complete the setup process for the virtual edge.
*TelephonyProvidersEdgeApi* | [**getTelephonyProvidersEdgeSoftwareupdate**](docs/TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgeSoftwareupdate) | **GET** /api/v2/telephony/providers/edges/{edgeId}/softwareupdate | Gets software update status information about any edge.
*TelephonyProvidersEdgeApi* | [**getTelephonyProvidersEdgeSoftwareversions**](docs/TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgeSoftwareversions) | **GET** /api/v2/telephony/providers/edges/{edgeId}/softwareversions | Gets all the available software versions for this edge.
*TelephonyProvidersEdgeApi* | [**getTelephonyProvidersEdges**](docs/TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdges) | **GET** /api/v2/telephony/providers/edges | Get the list of edges.
*TelephonyProvidersEdgeApi* | [**getTelephonyProvidersEdgesAvailablelanguages**](docs/TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgesAvailablelanguages) | **GET** /api/v2/telephony/providers/edges/availablelanguages | Get the list of available languages.
*TelephonyProvidersEdgeApi* | [**getTelephonyProvidersEdgesCertificateauthorities**](docs/TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgesCertificateauthorities) | **GET** /api/v2/telephony/providers/edges/certificateauthorities | Get the list of certificate authorities.
*TelephonyProvidersEdgeApi* | [**getTelephonyProvidersEdgesCertificateauthority**](docs/TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgesCertificateauthority) | **GET** /api/v2/telephony/providers/edges/certificateauthorities/{certificateId} | Get a certificate authority.
*TelephonyProvidersEdgeApi* | [**getTelephonyProvidersEdgesDid**](docs/TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgesDid) | **GET** /api/v2/telephony/providers/edges/dids/{didId} | Get a DID by ID.
*TelephonyProvidersEdgeApi* | [**getTelephonyProvidersEdgesDidpool**](docs/TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgesDidpool) | **GET** /api/v2/telephony/providers/edges/didpools/{didPoolId} | Get a DID Pool by ID.
*TelephonyProvidersEdgeApi* | [**getTelephonyProvidersEdgesDidpools**](docs/TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgesDidpools) | **GET** /api/v2/telephony/providers/edges/didpools | Get a listing of DID Pools
*TelephonyProvidersEdgeApi* | [**getTelephonyProvidersEdgesDids**](docs/TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgesDids) | **GET** /api/v2/telephony/providers/edges/dids | Get a listing of DIDs
*TelephonyProvidersEdgeApi* | [**getTelephonyProvidersEdgesEdgegroup**](docs/TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgesEdgegroup) | **GET** /api/v2/telephony/providers/edges/edgegroups/{edgeGroupId} | Get edge group.
*TelephonyProvidersEdgeApi* | [**getTelephonyProvidersEdgesEdgegroupEdgetrunkbasis**](docs/TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgesEdgegroupEdgetrunkbasis) | **GET** /api/v2/telephony/providers/edges/edgegroups/{edgegroupId}/edgetrunkbases/{edgetrunkbaseId} | Gets the edge trunk base associated with the edge group
*TelephonyProvidersEdgeApi* | [**getTelephonyProvidersEdgesEdgegroups**](docs/TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgesEdgegroups) | **GET** /api/v2/telephony/providers/edges/edgegroups | Get the list of edge groups.
*TelephonyProvidersEdgeApi* | [**getTelephonyProvidersEdgesEdgeversionreport**](docs/TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgesEdgeversionreport) | **GET** /api/v2/telephony/providers/edges/edgeversionreport | Get the edge version report.
*TelephonyProvidersEdgeApi* | [**getTelephonyProvidersEdgesEndpoint**](docs/TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgesEndpoint) | **GET** /api/v2/telephony/providers/edges/endpoints/{endpointId} | Get endpoint
*TelephonyProvidersEdgeApi* | [**getTelephonyProvidersEdgesEndpoints**](docs/TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgesEndpoints) | **GET** /api/v2/telephony/providers/edges/endpoints | Get endpoints
*TelephonyProvidersEdgeApi* | [**getTelephonyProvidersEdgesExtension**](docs/TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgesExtension) | **GET** /api/v2/telephony/providers/edges/extensions/{extensionId} | Get an extension by ID.
*TelephonyProvidersEdgeApi* | [**getTelephonyProvidersEdgesExtensionpool**](docs/TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgesExtensionpool) | **GET** /api/v2/telephony/providers/edges/extensionpools/{extensionPoolId} | Get an extension pool by ID
*TelephonyProvidersEdgeApi* | [**getTelephonyProvidersEdgesExtensionpools**](docs/TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgesExtensionpools) | **GET** /api/v2/telephony/providers/edges/extensionpools | Get a listing of extension pools
*TelephonyProvidersEdgeApi* | [**getTelephonyProvidersEdgesExtensions**](docs/TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgesExtensions) | **GET** /api/v2/telephony/providers/edges/extensions | Get a listing of extensions
*TelephonyProvidersEdgeApi* | [**getTelephonyProvidersEdgesLine**](docs/TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgesLine) | **GET** /api/v2/telephony/providers/edges/lines/{lineId} | Get a Line by ID
*TelephonyProvidersEdgeApi* | [**getTelephonyProvidersEdgesLinebasesetting**](docs/TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgesLinebasesetting) | **GET** /api/v2/telephony/providers/edges/linebasesettings/{lineBaseId} | Get a line base settings object by ID
*TelephonyProvidersEdgeApi* | [**getTelephonyProvidersEdgesLinebasesettings**](docs/TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgesLinebasesettings) | **GET** /api/v2/telephony/providers/edges/linebasesettings | Get a listing of line base settings objects
*TelephonyProvidersEdgeApi* | [**getTelephonyProvidersEdgesLines**](docs/TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgesLines) | **GET** /api/v2/telephony/providers/edges/lines | Get a list of Lines
*TelephonyProvidersEdgeApi* | [**getTelephonyProvidersEdgesLinesTemplate**](docs/TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgesLinesTemplate) | **GET** /api/v2/telephony/providers/edges/lines/template | Get a Line instance template based on a Line Base Settings object. This object can then be modified and saved as a new Line instance
*TelephonyProvidersEdgeApi* | [**getTelephonyProvidersEdgesLogicalinterfaces**](docs/TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgesLogicalinterfaces) | **GET** /api/v2/telephony/providers/edges/logicalinterfaces | Get edge logical interfaces.
*TelephonyProvidersEdgeApi* | [**getTelephonyProvidersEdgesOutboundroute**](docs/TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgesOutboundroute) | **GET** /api/v2/telephony/providers/edges/outboundroutes/{outboundRouteId} | Get outbound route
*TelephonyProvidersEdgeApi* | [**getTelephonyProvidersEdgesOutboundroutes**](docs/TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgesOutboundroutes) | **GET** /api/v2/telephony/providers/edges/outboundroutes | Get outbound routes
*TelephonyProvidersEdgeApi* | [**getTelephonyProvidersEdgesPhone**](docs/TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgesPhone) | **GET** /api/v2/telephony/providers/edges/phones/{phoneId} | Get a Phone by ID
*TelephonyProvidersEdgeApi* | [**getTelephonyProvidersEdgesPhonebasesetting**](docs/TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgesPhonebasesetting) | **GET** /api/v2/telephony/providers/edges/phonebasesettings/{phoneBaseId} | Get a Phone Base Settings object by ID
*TelephonyProvidersEdgeApi* | [**getTelephonyProvidersEdgesPhonebasesettings**](docs/TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgesPhonebasesettings) | **GET** /api/v2/telephony/providers/edges/phonebasesettings | Get a list of Phone Base Settings objects
*TelephonyProvidersEdgeApi* | [**getTelephonyProvidersEdgesPhonebasesettingsAvailablemetabases**](docs/TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgesPhonebasesettingsAvailablemetabases) | **GET** /api/v2/telephony/providers/edges/phonebasesettings/availablemetabases | Get a list of available makes and models to create a new Phone Base Settings
*TelephonyProvidersEdgeApi* | [**getTelephonyProvidersEdgesPhonebasesettingsTemplate**](docs/TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgesPhonebasesettingsTemplate) | **GET** /api/v2/telephony/providers/edges/phonebasesettings/template | Get a Phone Base Settings instance template from a given make and model. This object can then be modified and saved as a new Phone Base Settings instance
*TelephonyProvidersEdgeApi* | [**getTelephonyProvidersEdgesPhones**](docs/TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgesPhones) | **GET** /api/v2/telephony/providers/edges/phones | Get a list of Phone Instances
*TelephonyProvidersEdgeApi* | [**getTelephonyProvidersEdgesPhonesTemplate**](docs/TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgesPhonesTemplate) | **GET** /api/v2/telephony/providers/edges/phones/template | Get a Phone instance template based on a Phone Base Settings object. This object can then be modified and saved as a new Phone instance
*TelephonyProvidersEdgeApi* | [**getTelephonyProvidersEdgesSite**](docs/TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgesSite) | **GET** /api/v2/telephony/providers/edges/sites/{siteId} | Get a Site by ID.
*TelephonyProvidersEdgeApi* | [**getTelephonyProvidersEdgesSiteNumberplan**](docs/TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgesSiteNumberplan) | **GET** /api/v2/telephony/providers/edges/sites/{siteId}/numberplans/{numberPlanId} | Get a Number Plan by ID.
*TelephonyProvidersEdgeApi* | [**getTelephonyProvidersEdgesSiteNumberplans**](docs/TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgesSiteNumberplans) | **GET** /api/v2/telephony/providers/edges/sites/{siteId}/numberplans | Get the list of Number Plans for this Site.
*TelephonyProvidersEdgeApi* | [**getTelephonyProvidersEdgesSiteNumberplansClassifications**](docs/TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgesSiteNumberplansClassifications) | **GET** /api/v2/telephony/providers/edges/sites/{siteId}/numberplans/classifications | Get a list of Classifications for this Site
*TelephonyProvidersEdgeApi* | [**getTelephonyProvidersEdgesSiteOutboundroute**](docs/TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgesSiteOutboundroute) | **GET** /api/v2/telephony/providers/edges/sites/{siteId}/outboundroutes/{outboundRouteId} | Get an outbound route
*TelephonyProvidersEdgeApi* | [**getTelephonyProvidersEdgesSiteOutboundroutes**](docs/TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgesSiteOutboundroutes) | **GET** /api/v2/telephony/providers/edges/sites/{siteId}/outboundroutes | Get outbound routes
*TelephonyProvidersEdgeApi* | [**getTelephonyProvidersEdgesSites**](docs/TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgesSites) | **GET** /api/v2/telephony/providers/edges/sites | Get the list of Sites.
*TelephonyProvidersEdgeApi* | [**getTelephonyProvidersEdgesTimezones**](docs/TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgesTimezones) | **GET** /api/v2/telephony/providers/edges/timezones | Get a list of Edge-compatible time zones
*TelephonyProvidersEdgeApi* | [**getTelephonyProvidersEdgesTrunk**](docs/TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgesTrunk) | **GET** /api/v2/telephony/providers/edges/trunks/{trunkId} | Get a Trunk by ID
*TelephonyProvidersEdgeApi* | [**getTelephonyProvidersEdgesTrunkbasesetting**](docs/TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgesTrunkbasesetting) | **GET** /api/v2/telephony/providers/edges/trunkbasesettings/{trunkBaseSettingsId} | Get a Trunk Base Settings object by ID
*TelephonyProvidersEdgeApi* | [**getTelephonyProvidersEdgesTrunkbasesettings**](docs/TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgesTrunkbasesettings) | **GET** /api/v2/telephony/providers/edges/trunkbasesettings | Get Trunk Base Settings listing
*TelephonyProvidersEdgeApi* | [**getTelephonyProvidersEdgesTrunkbasesettingsAvailablemetabases**](docs/TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgesTrunkbasesettingsAvailablemetabases) | **GET** /api/v2/telephony/providers/edges/trunkbasesettings/availablemetabases | Get a list of available makes and models to create a new Trunk Base Settings
*TelephonyProvidersEdgeApi* | [**getTelephonyProvidersEdgesTrunkbasesettingsTemplate**](docs/TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgesTrunkbasesettingsTemplate) | **GET** /api/v2/telephony/providers/edges/trunkbasesettings/template | Get a Trunk Base Settings instance template from a given make and model. This object can then be modified and saved as a new Trunk Base Settings instance
*TelephonyProvidersEdgeApi* | [**getTelephonyProvidersEdgesTrunks**](docs/TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgesTrunks) | **GET** /api/v2/telephony/providers/edges/trunks | Get the list of available trunks.
*TelephonyProvidersEdgeApi* | [**getTelephonyProvidersEdgesTrunkswithrecording**](docs/TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgesTrunkswithrecording) | **GET** /api/v2/telephony/providers/edges/trunkswithrecording | Get Counts of trunks that have recording disabled or enabled
*TelephonyProvidersEdgeApi* | [**postTelephonyProvidersEdgeLogicalinterfaces**](docs/TelephonyProvidersEdgeApi.md#postTelephonyProvidersEdgeLogicalinterfaces) | **POST** /api/v2/telephony/providers/edges/{edgeId}/logicalinterfaces | Create an edge logical interface.
*TelephonyProvidersEdgeApi* | [**postTelephonyProvidersEdgeLogsJobUpload**](docs/TelephonyProvidersEdgeApi.md#postTelephonyProvidersEdgeLogsJobUpload) | **POST** /api/v2/telephony/providers/edges/{edgeId}/logs/jobs/{jobId}/upload | Request that the specified fileIds be uploaded from the Edge.
*TelephonyProvidersEdgeApi* | [**postTelephonyProvidersEdgeLogsJobs**](docs/TelephonyProvidersEdgeApi.md#postTelephonyProvidersEdgeLogsJobs) | **POST** /api/v2/telephony/providers/edges/{edgeId}/logs/jobs | Create a job to upload a list of Edge logs.
*TelephonyProvidersEdgeApi* | [**postTelephonyProvidersEdgeReboot**](docs/TelephonyProvidersEdgeApi.md#postTelephonyProvidersEdgeReboot) | **POST** /api/v2/telephony/providers/edges/{edgeId}/reboot | Reboot an Edge
*TelephonyProvidersEdgeApi* | [**postTelephonyProvidersEdgeSoftwareupdate**](docs/TelephonyProvidersEdgeApi.md#postTelephonyProvidersEdgeSoftwareupdate) | **POST** /api/v2/telephony/providers/edges/{edgeId}/softwareupdate | Starts a software update for this edge.
*TelephonyProvidersEdgeApi* | [**postTelephonyProvidersEdgeStatuscode**](docs/TelephonyProvidersEdgeApi.md#postTelephonyProvidersEdgeStatuscode) | **POST** /api/v2/telephony/providers/edges/{edgeId}/statuscode | Take an Edge in or out of service
*TelephonyProvidersEdgeApi* | [**postTelephonyProvidersEdgeUnpair**](docs/TelephonyProvidersEdgeApi.md#postTelephonyProvidersEdgeUnpair) | **POST** /api/v2/telephony/providers/edges/{edgeId}/unpair | Unpair an Edge
*TelephonyProvidersEdgeApi* | [**postTelephonyProvidersEdges**](docs/TelephonyProvidersEdgeApi.md#postTelephonyProvidersEdges) | **POST** /api/v2/telephony/providers/edges | Create an edge.
*TelephonyProvidersEdgeApi* | [**postTelephonyProvidersEdgesAddressvalidation**](docs/TelephonyProvidersEdgeApi.md#postTelephonyProvidersEdgesAddressvalidation) | **POST** /api/v2/telephony/providers/edges/addressvalidation | Validates a street address
*TelephonyProvidersEdgeApi* | [**postTelephonyProvidersEdgesCertificateauthorities**](docs/TelephonyProvidersEdgeApi.md#postTelephonyProvidersEdgesCertificateauthorities) | **POST** /api/v2/telephony/providers/edges/certificateauthorities | Create a certificate authority.
*TelephonyProvidersEdgeApi* | [**postTelephonyProvidersEdgesDidpools**](docs/TelephonyProvidersEdgeApi.md#postTelephonyProvidersEdgesDidpools) | **POST** /api/v2/telephony/providers/edges/didpools | Create a new DID pool
*TelephonyProvidersEdgeApi* | [**postTelephonyProvidersEdgesEdgegroups**](docs/TelephonyProvidersEdgeApi.md#postTelephonyProvidersEdgesEdgegroups) | **POST** /api/v2/telephony/providers/edges/edgegroups | Create an edge group.
*TelephonyProvidersEdgeApi* | [**postTelephonyProvidersEdgesEndpoints**](docs/TelephonyProvidersEdgeApi.md#postTelephonyProvidersEdgesEndpoints) | **POST** /api/v2/telephony/providers/edges/endpoints | Create endpoint
*TelephonyProvidersEdgeApi* | [**postTelephonyProvidersEdgesExtensionpools**](docs/TelephonyProvidersEdgeApi.md#postTelephonyProvidersEdgesExtensionpools) | **POST** /api/v2/telephony/providers/edges/extensionpools | Create a new extension pool
*TelephonyProvidersEdgeApi* | [**postTelephonyProvidersEdgesOutboundroutes**](docs/TelephonyProvidersEdgeApi.md#postTelephonyProvidersEdgesOutboundroutes) | **POST** /api/v2/telephony/providers/edges/outboundroutes | Create outbound rule
*TelephonyProvidersEdgeApi* | [**postTelephonyProvidersEdgesPhoneReboot**](docs/TelephonyProvidersEdgeApi.md#postTelephonyProvidersEdgesPhoneReboot) | **POST** /api/v2/telephony/providers/edges/phones/{phoneId}/reboot | Reboot a Phone
*TelephonyProvidersEdgeApi* | [**postTelephonyProvidersEdgesPhonebasesettings**](docs/TelephonyProvidersEdgeApi.md#postTelephonyProvidersEdgesPhonebasesettings) | **POST** /api/v2/telephony/providers/edges/phonebasesettings | Create a new Phone Base Settings object
*TelephonyProvidersEdgeApi* | [**postTelephonyProvidersEdgesPhones**](docs/TelephonyProvidersEdgeApi.md#postTelephonyProvidersEdgesPhones) | **POST** /api/v2/telephony/providers/edges/phones | Create a new Phone
*TelephonyProvidersEdgeApi* | [**postTelephonyProvidersEdgesPhonesReboot**](docs/TelephonyProvidersEdgeApi.md#postTelephonyProvidersEdgesPhonesReboot) | **POST** /api/v2/telephony/providers/edges/phones/reboot | Reboot Multiple Phones
*TelephonyProvidersEdgeApi* | [**postTelephonyProvidersEdgesSiteOutboundroutes**](docs/TelephonyProvidersEdgeApi.md#postTelephonyProvidersEdgesSiteOutboundroutes) | **POST** /api/v2/telephony/providers/edges/sites/{siteId}/outboundroutes | Create outbound route
*TelephonyProvidersEdgeApi* | [**postTelephonyProvidersEdgesSiteRebalance**](docs/TelephonyProvidersEdgeApi.md#postTelephonyProvidersEdgesSiteRebalance) | **POST** /api/v2/telephony/providers/edges/sites/{siteId}/rebalance | Triggers the rebalance operation.
*TelephonyProvidersEdgeApi* | [**postTelephonyProvidersEdgesSites**](docs/TelephonyProvidersEdgeApi.md#postTelephonyProvidersEdgesSites) | **POST** /api/v2/telephony/providers/edges/sites | Create a Site.
*TelephonyProvidersEdgeApi* | [**postTelephonyProvidersEdgesTrunkbasesettings**](docs/TelephonyProvidersEdgeApi.md#postTelephonyProvidersEdgesTrunkbasesettings) | **POST** /api/v2/telephony/providers/edges/trunkbasesettings | Create a Trunk Base Settings object
*TelephonyProvidersEdgeApi* | [**putTelephonyProvidersEdge**](docs/TelephonyProvidersEdgeApi.md#putTelephonyProvidersEdge) | **PUT** /api/v2/telephony/providers/edges/{edgeId} | Update a edge.
*TelephonyProvidersEdgeApi* | [**putTelephonyProvidersEdgeLine**](docs/TelephonyProvidersEdgeApi.md#putTelephonyProvidersEdgeLine) | **PUT** /api/v2/telephony/providers/edges/{edgeId}/lines/{lineId} | Update a line.
*TelephonyProvidersEdgeApi* | [**putTelephonyProvidersEdgeLogicalinterface**](docs/TelephonyProvidersEdgeApi.md#putTelephonyProvidersEdgeLogicalinterface) | **PUT** /api/v2/telephony/providers/edges/{edgeId}/logicalinterfaces/{interfaceId} | Update an edge logical interface.
*TelephonyProvidersEdgeApi* | [**putTelephonyProvidersEdgesCertificateauthority**](docs/TelephonyProvidersEdgeApi.md#putTelephonyProvidersEdgesCertificateauthority) | **PUT** /api/v2/telephony/providers/edges/certificateauthorities/{certificateId} | Update a certificate authority.
*TelephonyProvidersEdgeApi* | [**putTelephonyProvidersEdgesDid**](docs/TelephonyProvidersEdgeApi.md#putTelephonyProvidersEdgesDid) | **PUT** /api/v2/telephony/providers/edges/dids/{didId} | Update a DID by ID.
*TelephonyProvidersEdgeApi* | [**putTelephonyProvidersEdgesDidpool**](docs/TelephonyProvidersEdgeApi.md#putTelephonyProvidersEdgesDidpool) | **PUT** /api/v2/telephony/providers/edges/didpools/{didPoolId} | Update a DID Pool by ID.
*TelephonyProvidersEdgeApi* | [**putTelephonyProvidersEdgesEdgegroup**](docs/TelephonyProvidersEdgeApi.md#putTelephonyProvidersEdgesEdgegroup) | **PUT** /api/v2/telephony/providers/edges/edgegroups/{edgeGroupId} | Update an edge group.
*TelephonyProvidersEdgeApi* | [**putTelephonyProvidersEdgesEdgegroupEdgetrunkbasis**](docs/TelephonyProvidersEdgeApi.md#putTelephonyProvidersEdgesEdgegroupEdgetrunkbasis) | **PUT** /api/v2/telephony/providers/edges/edgegroups/{edgegroupId}/edgetrunkbases/{edgetrunkbaseId} | Update the edge trunk base associated with the edge group
*TelephonyProvidersEdgeApi* | [**putTelephonyProvidersEdgesEndpoint**](docs/TelephonyProvidersEdgeApi.md#putTelephonyProvidersEdgesEndpoint) | **PUT** /api/v2/telephony/providers/edges/endpoints/{endpointId} | Update endpoint
*TelephonyProvidersEdgeApi* | [**putTelephonyProvidersEdgesExtension**](docs/TelephonyProvidersEdgeApi.md#putTelephonyProvidersEdgesExtension) | **PUT** /api/v2/telephony/providers/edges/extensions/{extensionId} | Update an extension by ID.
*TelephonyProvidersEdgeApi* | [**putTelephonyProvidersEdgesExtensionpool**](docs/TelephonyProvidersEdgeApi.md#putTelephonyProvidersEdgesExtensionpool) | **PUT** /api/v2/telephony/providers/edges/extensionpools/{extensionPoolId} | Update an extension pool by ID
*TelephonyProvidersEdgeApi* | [**putTelephonyProvidersEdgesOutboundroute**](docs/TelephonyProvidersEdgeApi.md#putTelephonyProvidersEdgesOutboundroute) | **PUT** /api/v2/telephony/providers/edges/outboundroutes/{outboundRouteId} | Update outbound route
*TelephonyProvidersEdgeApi* | [**putTelephonyProvidersEdgesPhone**](docs/TelephonyProvidersEdgeApi.md#putTelephonyProvidersEdgesPhone) | **PUT** /api/v2/telephony/providers/edges/phones/{phoneId} | Update a Phone by ID
*TelephonyProvidersEdgeApi* | [**putTelephonyProvidersEdgesPhonebasesetting**](docs/TelephonyProvidersEdgeApi.md#putTelephonyProvidersEdgesPhonebasesetting) | **PUT** /api/v2/telephony/providers/edges/phonebasesettings/{phoneBaseId} | Update a Phone Base Settings by ID
*TelephonyProvidersEdgeApi* | [**putTelephonyProvidersEdgesSite**](docs/TelephonyProvidersEdgeApi.md#putTelephonyProvidersEdgesSite) | **PUT** /api/v2/telephony/providers/edges/sites/{siteId} | Update a Site by ID.
*TelephonyProvidersEdgeApi* | [**putTelephonyProvidersEdgesSiteNumberplans**](docs/TelephonyProvidersEdgeApi.md#putTelephonyProvidersEdgesSiteNumberplans) | **PUT** /api/v2/telephony/providers/edges/sites/{siteId}/numberplans | Update the list of Number Plans.
*TelephonyProvidersEdgeApi* | [**putTelephonyProvidersEdgesSiteOutboundroute**](docs/TelephonyProvidersEdgeApi.md#putTelephonyProvidersEdgesSiteOutboundroute) | **PUT** /api/v2/telephony/providers/edges/sites/{siteId}/outboundroutes/{outboundRouteId} | Update outbound route
*TelephonyProvidersEdgeApi* | [**putTelephonyProvidersEdgesTrunkbasesetting**](docs/TelephonyProvidersEdgeApi.md#putTelephonyProvidersEdgesTrunkbasesetting) | **PUT** /api/v2/telephony/providers/edges/trunkbasesettings/{trunkBaseSettingsId} | Update a Trunk Base Settings object by ID
*TokensApi* | [**deleteTokensMe**](docs/TokensApi.md#deleteTokensMe) | **DELETE** /api/v2/tokens/me | Delete  auth token used to make the request.
*UserRecordingsApi* | [**deleteUserrecording**](docs/UserRecordingsApi.md#deleteUserrecording) | **DELETE** /api/v2/userrecordings/{recordingId} | Delete a user recording.
*UserRecordingsApi* | [**getUserrecording**](docs/UserRecordingsApi.md#getUserrecording) | **GET** /api/v2/userrecordings/{recordingId} | Get a user recording.
*UserRecordingsApi* | [**getUserrecordingMedia**](docs/UserRecordingsApi.md#getUserrecordingMedia) | **GET** /api/v2/userrecordings/{recordingId}/media | Download a user recording.
*UserRecordingsApi* | [**getUserrecordings**](docs/UserRecordingsApi.md#getUserrecordings) | **GET** /api/v2/userrecordings | Get a list of user recordings.
*UserRecordingsApi* | [**getUserrecordingsSummary**](docs/UserRecordingsApi.md#getUserrecordingsSummary) | **GET** /api/v2/userrecordings/summary | Get user recording summary
*UserRecordingsApi* | [**putUserrecording**](docs/UserRecordingsApi.md#putUserrecording) | **PUT** /api/v2/userrecordings/{recordingId} | Update a user recording.
*UsersApi* | [**deleteUser**](docs/UsersApi.md#deleteUser) | **DELETE** /api/v2/users/{userId} | Delete user
*UsersApi* | [**deleteUserRoles**](docs/UsersApi.md#deleteUserRoles) | **DELETE** /api/v2/users/{userId}/roles | Removes all the roles from the user.
*UsersApi* | [**deleteUserRoutingskill**](docs/UsersApi.md#deleteUserRoutingskill) | **DELETE** /api/v2/users/{userId}/routingskills/{skillId} | Remove routing skill from user
*UsersApi* | [**deleteUserStationAssociatedstation**](docs/UsersApi.md#deleteUserStationAssociatedstation) | **DELETE** /api/v2/users/{userId}/station/associatedstation | Clear associated station
*UsersApi* | [**deleteUserStationDefaultstation**](docs/UsersApi.md#deleteUserStationDefaultstation) | **DELETE** /api/v2/users/{userId}/station/defaultstation | Clear default station
*UsersApi* | [**getFieldconfig**](docs/UsersApi.md#getFieldconfig) | **GET** /api/v2/fieldconfig | Fetch field config for an entity type
*UsersApi* | [**getUser**](docs/UsersApi.md#getUser) | **GET** /api/v2/users/{userId} | Get user.
*UsersApi* | [**getUserAdjacents**](docs/UsersApi.md#getUserAdjacents) | **GET** /api/v2/users/{userId}/adjacents | Get adjacents
*UsersApi* | [**getUserCallforwarding**](docs/UsersApi.md#getUserCallforwarding) | **GET** /api/v2/users/{userId}/callforwarding | Get a user&#39;s CallForwarding
*UsersApi* | [**getUserDirectreports**](docs/UsersApi.md#getUserDirectreports) | **GET** /api/v2/users/{userId}/directreports | Get direct reports
*UsersApi* | [**getUserFavorites**](docs/UsersApi.md#getUserFavorites) | **GET** /api/v2/users/{userId}/favorites | Get favorites
*UsersApi* | [**getUserGeolocation**](docs/UsersApi.md#getUserGeolocation) | **GET** /api/v2/users/{userId}/geolocations/{clientId} | Get a user&#39;s Geolocation
*UsersApi* | [**getUserOutofoffice**](docs/UsersApi.md#getUserOutofoffice) | **GET** /api/v2/users/{userId}/outofoffice | Get a OutOfOffice
*UsersApi* | [**getUserProfileskills**](docs/UsersApi.md#getUserProfileskills) | **GET** /api/v2/users/{userId}/profileskills | List profile skills for a user
*UsersApi* | [**getUserQueues**](docs/UsersApi.md#getUserQueues) | **GET** /api/v2/users/{userId}/queues | Get queues for user
*UsersApi* | [**getUserRoles**](docs/UsersApi.md#getUserRoles) | **GET** /api/v2/users/{userId}/roles | Returns a listing of roles and permissions for a user.
*UsersApi* | [**getUserRoutingskills**](docs/UsersApi.md#getUserRoutingskills) | **GET** /api/v2/users/{userId}/routingskills | List routing skills for user
*UsersApi* | [**getUserRoutingstatus**](docs/UsersApi.md#getUserRoutingstatus) | **GET** /api/v2/users/{userId}/routingstatus | Fetch the routing status of a user
*UsersApi* | [**getUserStation**](docs/UsersApi.md#getUserStation) | **GET** /api/v2/users/{userId}/station | Get station information for user
*UsersApi* | [**getUserSuperiors**](docs/UsersApi.md#getUserSuperiors) | **GET** /api/v2/users/{userId}/superiors | Get superiors
*UsersApi* | [**getUsers**](docs/UsersApi.md#getUsers) | **GET** /api/v2/users | Get the list of available users.
*UsersApi* | [**getUsersMe**](docs/UsersApi.md#getUsersMe) | **GET** /api/v2/users/me | Get current user details.
*UsersApi* | [**getUsersSearch**](docs/UsersApi.md#getUsersSearch) | **GET** /api/v2/users/search | Search users using the q64 value returned from a previous search
*UsersApi* | [**patchUser**](docs/UsersApi.md#patchUser) | **PATCH** /api/v2/users/{userId} | Update user
*UsersApi* | [**patchUserCallforwarding**](docs/UsersApi.md#patchUserCallforwarding) | **PATCH** /api/v2/users/{userId}/callforwarding | Patch a user&#39;s CallForwarding
*UsersApi* | [**patchUserGeolocation**](docs/UsersApi.md#patchUserGeolocation) | **PATCH** /api/v2/users/{userId}/geolocations/{clientId} | Patch a user&#39;s Geolocation
*UsersApi* | [**patchUserQueue**](docs/UsersApi.md#patchUserQueue) | **PATCH** /api/v2/users/{userId}/queues/{queueId} | Join or unjoin a queue for a user
*UsersApi* | [**patchUserQueues**](docs/UsersApi.md#patchUserQueues) | **PATCH** /api/v2/users/{userId}/queues | Join or unjoin a set of queues for a user
*UsersApi* | [**postAnalyticsUsersAggregatesQuery**](docs/UsersApi.md#postAnalyticsUsersAggregatesQuery) | **POST** /api/v2/analytics/users/aggregates/query | Query for user aggregates
*UsersApi* | [**postAnalyticsUsersDetailsQuery**](docs/UsersApi.md#postAnalyticsUsersDetailsQuery) | **POST** /api/v2/analytics/users/details/query | Query for user details
*UsersApi* | [**postAnalyticsUsersObservationsQuery**](docs/UsersApi.md#postAnalyticsUsersObservationsQuery) | **POST** /api/v2/analytics/users/observations/query | Query for user observations
*UsersApi* | [**postUserRoutingskills**](docs/UsersApi.md#postUserRoutingskills) | **POST** /api/v2/users/{userId}/routingskills | Add routing skill to user
*UsersApi* | [**postUsers**](docs/UsersApi.md#postUsers) | **POST** /api/v2/users | Create user
*UsersApi* | [**postUsersSearch**](docs/UsersApi.md#postUsersSearch) | **POST** /api/v2/users/search | Search users
*UsersApi* | [**putUserCallforwarding**](docs/UsersApi.md#putUserCallforwarding) | **PUT** /api/v2/users/{userId}/callforwarding | Update a user&#39;s CallForwarding
*UsersApi* | [**putUserOutofoffice**](docs/UsersApi.md#putUserOutofoffice) | **PUT** /api/v2/users/{userId}/outofoffice | Update an OutOfOffice
*UsersApi* | [**putUserProfileskills**](docs/UsersApi.md#putUserProfileskills) | **PUT** /api/v2/users/{userId}/profileskills | Update profile skills for a user
*UsersApi* | [**putUserRoles**](docs/UsersApi.md#putUserRoles) | **PUT** /api/v2/users/{userId}/roles | Sets the user&#39;s roles
*UsersApi* | [**putUserRoutingskill**](docs/UsersApi.md#putUserRoutingskill) | **PUT** /api/v2/users/{userId}/routingskills/{skillId} | Update routing skill proficiency or state.
*UsersApi* | [**putUserRoutingstatus**](docs/UsersApi.md#putUserRoutingstatus) | **PUT** /api/v2/users/{userId}/routingstatus | Update the routing status of a user
*UsersApi* | [**putUserStationAssociatedstationStationId**](docs/UsersApi.md#putUserStationAssociatedstationStationId) | **PUT** /api/v2/users/{userId}/station/associatedstation/{stationId} | Set associated station
*UsersApi* | [**putUserStationDefaultstationStationId**](docs/UsersApi.md#putUserStationDefaultstationStationId) | **PUT** /api/v2/users/{userId}/station/defaultstation/{stationId} | Set default station
*UtilitiesApi* | [**getDate**](docs/UtilitiesApi.md#getDate) | **GET** /api/v2/date | Get the current system date/time
*UtilitiesApi* | [**getTimezones**](docs/UtilitiesApi.md#getTimezones) | **GET** /api/v2/timezones | Get time zones list
*UtilitiesApi* | [**postCertificateDetails**](docs/UtilitiesApi.md#postCertificateDetails) | **POST** /api/v2/certificate/details | Returns the information about an X509 PEM encoded certificate or certificate chain.
*VoicemailApi* | [**deleteVoicemailMessage**](docs/VoicemailApi.md#deleteVoicemailMessage) | **DELETE** /api/v2/voicemail/messages/{messageId} | Delete a message.
*VoicemailApi* | [**deleteVoicemailMessages**](docs/VoicemailApi.md#deleteVoicemailMessages) | **DELETE** /api/v2/voicemail/messages | Delete all voicemail messages
*VoicemailApi* | [**getVoicemailGroupMailbox**](docs/VoicemailApi.md#getVoicemailGroupMailbox) | **GET** /api/v2/voicemail/groups/{groupId}/mailbox | Get the group&#39;s mailbox information
*VoicemailApi* | [**getVoicemailGroupMessages**](docs/VoicemailApi.md#getVoicemailGroupMessages) | **GET** /api/v2/voicemail/groups/{groupId}/messages | List voicemail messages
*VoicemailApi* | [**getVoicemailGroupPolicy**](docs/VoicemailApi.md#getVoicemailGroupPolicy) | **GET** /api/v2/voicemail/groups/{groupId}/policy | Get a group&#39;s voicemail policy
*VoicemailApi* | [**getVoicemailMailbox**](docs/VoicemailApi.md#getVoicemailMailbox) | **GET** /api/v2/voicemail/mailbox | Get the current user&#39;s mailbox information
*VoicemailApi* | [**getVoicemailMeMailbox**](docs/VoicemailApi.md#getVoicemailMeMailbox) | **GET** /api/v2/voicemail/me/mailbox | Get the current user&#39;s mailbox information
*VoicemailApi* | [**getVoicemailMeMessages**](docs/VoicemailApi.md#getVoicemailMeMessages) | **GET** /api/v2/voicemail/me/messages | List voicemail messages
*VoicemailApi* | [**getVoicemailMePolicy**](docs/VoicemailApi.md#getVoicemailMePolicy) | **GET** /api/v2/voicemail/me/policy | Get the current user&#39;s voicemail policy
*VoicemailApi* | [**getVoicemailMessage**](docs/VoicemailApi.md#getVoicemailMessage) | **GET** /api/v2/voicemail/messages/{messageId} | Get message.
*VoicemailApi* | [**getVoicemailMessageMedia**](docs/VoicemailApi.md#getVoicemailMessageMedia) | **GET** /api/v2/voicemail/messages/{messageId}/media | Get media playback URI for this message
*VoicemailApi* | [**getVoicemailMessages**](docs/VoicemailApi.md#getVoicemailMessages) | **GET** /api/v2/voicemail/messages | List voicemail messages
*VoicemailApi* | [**getVoicemailPolicy**](docs/VoicemailApi.md#getVoicemailPolicy) | **GET** /api/v2/voicemail/policy | Get a policy
*VoicemailApi* | [**getVoicemailSearch**](docs/VoicemailApi.md#getVoicemailSearch) | **GET** /api/v2/voicemail/search | Search voicemails using the q64 value returned from a previous search
*VoicemailApi* | [**getVoicemailUserpolicy**](docs/VoicemailApi.md#getVoicemailUserpolicy) | **GET** /api/v2/voicemail/userpolicies/{userId} | Get a user&#39;s voicemail policy
*VoicemailApi* | [**patchVoicemailGroupPolicy**](docs/VoicemailApi.md#patchVoicemailGroupPolicy) | **PATCH** /api/v2/voicemail/groups/{groupId}/policy | Update a group&#39;s voicemail policy
*VoicemailApi* | [**patchVoicemailMePolicy**](docs/VoicemailApi.md#patchVoicemailMePolicy) | **PATCH** /api/v2/voicemail/me/policy | Update the current user&#39;s voicemail policy
*VoicemailApi* | [**patchVoicemailUserpolicy**](docs/VoicemailApi.md#patchVoicemailUserpolicy) | **PATCH** /api/v2/voicemail/userpolicies/{userId} | Update a user&#39;s voicemail policy
*VoicemailApi* | [**postVoicemailMessages**](docs/VoicemailApi.md#postVoicemailMessages) | **POST** /api/v2/voicemail/messages | Copy a voicemail message to a user or group
*VoicemailApi* | [**postVoicemailSearch**](docs/VoicemailApi.md#postVoicemailSearch) | **POST** /api/v2/voicemail/search | Search voicemails
*VoicemailApi* | [**putVoicemailMessage**](docs/VoicemailApi.md#putVoicemailMessage) | **PUT** /api/v2/voicemail/messages/{messageId} | Update a message.
*VoicemailApi* | [**putVoicemailPolicy**](docs/VoicemailApi.md#putVoicemailPolicy) | **PUT** /api/v2/voicemail/policy | Update a policy
*WorkforceManagementApi* | [**getWorkforcemanagementAdherence**](docs/WorkforceManagementApi.md#getWorkforcemanagementAdherence) | **GET** /api/v2/workforcemanagement/adherence | Get a list of UserScheduleAdherence records for the requested users
*WorkforceManagementApi* | [**getWorkforcemanagementManagementunitActivitycodes**](docs/WorkforceManagementApi.md#getWorkforcemanagementManagementunitActivitycodes) | **GET** /api/v2/workforcemanagement/managementunits/{muId}/activitycodes | Get activity codes corresponding to a management unit
*WorkforceManagementApi* | [**getWorkforcemanagementManagementunitUserTimeoffrequest**](docs/WorkforceManagementApi.md#getWorkforcemanagementManagementunitUserTimeoffrequest) | **GET** /api/v2/workforcemanagement/managementunits/{muId}/users/{userId}/timeoffrequests/{timeOffRequestId} | Get a time off request by id
*WorkforceManagementApi* | [**getWorkforcemanagementManagementunitUserTimeoffrequests**](docs/WorkforceManagementApi.md#getWorkforcemanagementManagementunitUserTimeoffrequests) | **GET** /api/v2/workforcemanagement/managementunits/{muId}/users/{userId}/timeoffrequests | Get a list of time off requests for any user
*WorkforceManagementApi* | [**getWorkforcemanagementManagementunitUsers**](docs/WorkforceManagementApi.md#getWorkforcemanagementManagementunitUsers) | **GET** /api/v2/workforcemanagement/managementunits/{muId}/users | Get agents in the management unit
*WorkforceManagementApi* | [**getWorkforcemanagementManagementunits**](docs/WorkforceManagementApi.md#getWorkforcemanagementManagementunits) | **GET** /api/v2/workforcemanagement/managementunits | Get management units
*WorkforceManagementApi* | [**getWorkforcemanagementTimeoffrequest**](docs/WorkforceManagementApi.md#getWorkforcemanagementTimeoffrequest) | **GET** /api/v2/workforcemanagement/timeoffrequests/{timeOffRequestId} | Get a time off request for the current user by id
*WorkforceManagementApi* | [**getWorkforcemanagementTimeoffrequests**](docs/WorkforceManagementApi.md#getWorkforcemanagementTimeoffrequests) | **GET** /api/v2/workforcemanagement/timeoffrequests | Get a list of time off requests for the current user
*WorkforceManagementApi* | [**patchWorkforcemanagementTimeoffrequest**](docs/WorkforceManagementApi.md#patchWorkforcemanagementTimeoffrequest) | **PATCH** /api/v2/workforcemanagement/timeoffrequests/{timeOffRequestId} | Mark a time off request for the current user as read or unread
*WorkforceManagementApi* | [**postWorkforcemanagementManagementunitSchedulesSearch**](docs/WorkforceManagementApi.md#postWorkforcemanagementManagementunitSchedulesSearch) | **POST** /api/v2/workforcemanagement/managementunits/{muId}/schedules/search | Get user schedules within the given time range
*WorkforceManagementApi* | [**postWorkforcemanagementSchedules**](docs/WorkforceManagementApi.md#postWorkforcemanagementSchedules) | **POST** /api/v2/workforcemanagement/schedules | Get a schedule for the current user


## Documentation for Models

 - [ADFS](docs/ADFS.md)
 - [Actions](docs/Actions.md)
 - [ActivityCode](docs/ActivityCode.md)
 - [ActivityCodeContainer](docs/ActivityCodeContainer.md)
 - [AcwSettings](docs/AcwSettings.md)
 - [Address](docs/Address.md)
 - [Adjacents](docs/Adjacents.md)
 - [Agent](docs/Agent.md)
 - [AgentActivity](docs/AgentActivity.md)
 - [AgentActivityEntityListing](docs/AgentActivityEntityListing.md)
 - [AgentEvaluatorActivity](docs/AgentEvaluatorActivity.md)
 - [AggregateDataContainer](docs/AggregateDataContainer.md)
 - [AggregateMetricData](docs/AggregateMetricData.md)
 - [AggregateQueryResponse](docs/AggregateQueryResponse.md)
 - [AggregateViewData](docs/AggregateViewData.md)
 - [AggregationQuery](docs/AggregationQuery.md)
 - [AggregationRange](docs/AggregationRange.md)
 - [AggregationResult](docs/AggregationResult.md)
 - [AggregationResultEntry](docs/AggregationResultEntry.md)
 - [AnalyticsConversation](docs/AnalyticsConversation.md)
 - [AnalyticsConversationQueryResponse](docs/AnalyticsConversationQueryResponse.md)
 - [AnalyticsConversationSegment](docs/AnalyticsConversationSegment.md)
 - [AnalyticsEvaluation](docs/AnalyticsEvaluation.md)
 - [AnalyticsParticipant](docs/AnalyticsParticipant.md)
 - [AnalyticsProperty](docs/AnalyticsProperty.md)
 - [AnalyticsQueryAggregation](docs/AnalyticsQueryAggregation.md)
 - [AnalyticsQueryClause](docs/AnalyticsQueryClause.md)
 - [AnalyticsQueryFilter](docs/AnalyticsQueryFilter.md)
 - [AnalyticsQueryPredicate](docs/AnalyticsQueryPredicate.md)
 - [AnalyticsRoutingStatusRecord](docs/AnalyticsRoutingStatusRecord.md)
 - [AnalyticsSession](docs/AnalyticsSession.md)
 - [AnalyticsUserDetail](docs/AnalyticsUserDetail.md)
 - [AnalyticsUserDetailsQueryResponse](docs/AnalyticsUserDetailsQueryResponse.md)
 - [AnalyticsUserPresenceRecord](docs/AnalyticsUserPresenceRecord.md)
 - [AnalyticsView](docs/AnalyticsView.md)
 - [Annotation](docs/Annotation.md)
 - [AnswerOption](docs/AnswerOption.md)
 - [ArchiveRetention](docs/ArchiveRetention.md)
 - [Attachment](docs/Attachment.md)
 - [AttemptLimits](docs/AttemptLimits.md)
 - [AttemptLimitsEntityListing](docs/AttemptLimitsEntityListing.md)
 - [AttemptLimitsNotification](docs/AttemptLimitsNotification.md)
 - [AttemptLimitsNotificationRecallEntries](docs/AttemptLimitsNotificationRecallEntries.md)
 - [AttemptLimitsNotificationRecallEntry](docs/AttemptLimitsNotificationRecallEntry.md)
 - [Attribute](docs/Attribute.md)
 - [AttributeEntityListing](docs/AttributeEntityListing.md)
 - [AttributeFilterItem](docs/AttributeFilterItem.md)
 - [AttributeQueryRequest](docs/AttributeQueryRequest.md)
 - [AuditChange](docs/AuditChange.md)
 - [AuditEntity](docs/AuditEntity.md)
 - [AuditEntityReference](docs/AuditEntityReference.md)
 - [AuditFacet](docs/AuditFacet.md)
 - [AuditFilter](docs/AuditFilter.md)
 - [AuditMessage](docs/AuditMessage.md)
 - [AuditSearchResult](docs/AuditSearchResult.md)
 - [AuditUser](docs/AuditUser.md)
 - [AvailableLanguageList](docs/AvailableLanguageList.md)
 - [AvailableTopic](docs/AvailableTopic.md)
 - [AvailableTopicEntityListing](docs/AvailableTopicEntityListing.md)
 - [AvailableTranslations](docs/AvailableTranslations.md)
 - [Bullseye](docs/Bullseye.md)
 - [Calibration](docs/Calibration.md)
 - [CalibrationAssignment](docs/CalibrationAssignment.md)
 - [CalibrationCreate](docs/CalibrationCreate.md)
 - [CalibrationEntityListing](docs/CalibrationEntityListing.md)
 - [Call](docs/Call.md)
 - [CallBasic](docs/CallBasic.md)
 - [CallCommand](docs/CallCommand.md)
 - [CallConversation](docs/CallConversation.md)
 - [CallConversationEntityListing](docs/CallConversationEntityListing.md)
 - [CallConversationNotification](docs/CallConversationNotification.md)
 - [CallConversationNotificationCallMediaParticipant](docs/CallConversationNotificationCallMediaParticipant.md)
 - [CallConversationNotificationDetail](docs/CallConversationNotificationDetail.md)
 - [CallConversationNotificationErrorBody](docs/CallConversationNotificationErrorBody.md)
 - [CallConversationNotificationErrorInfo](docs/CallConversationNotificationErrorInfo.md)
 - [CallConversationNotificationFaxStatus](docs/CallConversationNotificationFaxStatus.md)
 - [CallConversationNotificationParticipants](docs/CallConversationNotificationParticipants.md)
 - [CallConversationNotificationUriReference](docs/CallConversationNotificationUriReference.md)
 - [CallConversationNotificationWrapup](docs/CallConversationNotificationWrapup.md)
 - [CallForwarding](docs/CallForwarding.md)
 - [CallMediaParticipant](docs/CallMediaParticipant.md)
 - [CallMediaPolicy](docs/CallMediaPolicy.md)
 - [CallMediaPolicyConditions](docs/CallMediaPolicyConditions.md)
 - [CallRecord](docs/CallRecord.md)
 - [CallableContactsDiagnostic](docs/CallableContactsDiagnostic.md)
 - [CallableTime](docs/CallableTime.md)
 - [CallableTimeSet](docs/CallableTimeSet.md)
 - [CallableTimeSetEntityListing](docs/CallableTimeSetEntityListing.md)
 - [CallableTimeSetNotification](docs/CallableTimeSetNotification.md)
 - [CallableTimeSetNotificationCallableTime](docs/CallableTimeSetNotificationCallableTime.md)
 - [CallableTimeSetNotificationCallableTimes](docs/CallableTimeSetNotificationCallableTimes.md)
 - [CallableTimeSetNotificationTimeSlot](docs/CallableTimeSetNotificationTimeSlot.md)
 - [CallableTimeSetNotificationTimeSlots](docs/CallableTimeSetNotificationTimeSlots.md)
 - [Callback](docs/Callback.md)
 - [CallbackBasic](docs/CallbackBasic.md)
 - [CallbackConversation](docs/CallbackConversation.md)
 - [CallbackConversationEntityListing](docs/CallbackConversationEntityListing.md)
 - [CallbackConversationNotification](docs/CallbackConversationNotification.md)
 - [CallbackConversationNotificationCallbackMediaParticipant](docs/CallbackConversationNotificationCallbackMediaParticipant.md)
 - [CallbackConversationNotificationDetail](docs/CallbackConversationNotificationDetail.md)
 - [CallbackConversationNotificationDialerPreview](docs/CallbackConversationNotificationDialerPreview.md)
 - [CallbackConversationNotificationErrorBody](docs/CallbackConversationNotificationErrorBody.md)
 - [CallbackConversationNotificationErrorInfo](docs/CallbackConversationNotificationErrorInfo.md)
 - [CallbackConversationNotificationErrorInfoDetails](docs/CallbackConversationNotificationErrorInfoDetails.md)
 - [CallbackConversationNotificationParticipants](docs/CallbackConversationNotificationParticipants.md)
 - [CallbackConversationNotificationPhoneNumberColumn](docs/CallbackConversationNotificationPhoneNumberColumn.md)
 - [CallbackConversationNotificationUriReference](docs/CallbackConversationNotificationUriReference.md)
 - [CallbackConversationNotificationWrapup](docs/CallbackConversationNotificationWrapup.md)
 - [CallbackIdentifier](docs/CallbackIdentifier.md)
 - [CallbackMediaParticipant](docs/CallbackMediaParticipant.md)
 - [Campaign](docs/Campaign.md)
 - [CampaignDiagnostics](docs/CampaignDiagnostics.md)
 - [CampaignEntityListing](docs/CampaignEntityListing.md)
 - [CampaignInteraction](docs/CampaignInteraction.md)
 - [CampaignInteractions](docs/CampaignInteractions.md)
 - [CampaignNotification](docs/CampaignNotification.md)
 - [CampaignNotificationContactSort](docs/CampaignNotificationContactSort.md)
 - [CampaignNotificationErrors](docs/CampaignNotificationErrors.md)
 - [CampaignNotificationPhoneColumn](docs/CampaignNotificationPhoneColumn.md)
 - [CampaignNotificationPhoneColumns](docs/CampaignNotificationPhoneColumns.md)
 - [CampaignNotificationRestErrorDetail](docs/CampaignNotificationRestErrorDetail.md)
 - [CampaignNotificationUriReference](docs/CampaignNotificationUriReference.md)
 - [CampaignProgress](docs/CampaignProgress.md)
 - [CampaignProgressNotification](docs/CampaignProgressNotification.md)
 - [CampaignProgressNotificationUriReference](docs/CampaignProgressNotificationUriReference.md)
 - [CampaignRule](docs/CampaignRule.md)
 - [CampaignRuleAction](docs/CampaignRuleAction.md)
 - [CampaignRuleActionEntities](docs/CampaignRuleActionEntities.md)
 - [CampaignRuleCondition](docs/CampaignRuleCondition.md)
 - [CampaignRuleEntities](docs/CampaignRuleEntities.md)
 - [CampaignRuleEntityListing](docs/CampaignRuleEntityListing.md)
 - [CampaignRuleNotification](docs/CampaignRuleNotification.md)
 - [CampaignRuleNotificationCampaignRuleAction](docs/CampaignRuleNotificationCampaignRuleAction.md)
 - [CampaignRuleNotificationCampaignRuleActionEntities](docs/CampaignRuleNotificationCampaignRuleActionEntities.md)
 - [CampaignRuleNotificationCampaignRuleActions](docs/CampaignRuleNotificationCampaignRuleActions.md)
 - [CampaignRuleNotificationCampaignRuleCondition](docs/CampaignRuleNotificationCampaignRuleCondition.md)
 - [CampaignRuleNotificationCampaignRuleConditions](docs/CampaignRuleNotificationCampaignRuleConditions.md)
 - [CampaignRuleNotificationCampaignRuleEntities](docs/CampaignRuleNotificationCampaignRuleEntities.md)
 - [CampaignRuleNotificationUriReference](docs/CampaignRuleNotificationUriReference.md)
 - [CampaignRuleParameters](docs/CampaignRuleParameters.md)
 - [CampaignSchedule](docs/CampaignSchedule.md)
 - [CampaignScheduleNotification](docs/CampaignScheduleNotification.md)
 - [CampaignScheduleNotificationIntervals](docs/CampaignScheduleNotificationIntervals.md)
 - [CampaignScheduleNotificationScheduleInterval](docs/CampaignScheduleNotificationScheduleInterval.md)
 - [CampaignScheduleNotificationUriReference](docs/CampaignScheduleNotificationUriReference.md)
 - [CampaignSequence](docs/CampaignSequence.md)
 - [CampaignSequenceEntityListing](docs/CampaignSequenceEntityListing.md)
 - [CampaignSequenceNotification](docs/CampaignSequenceNotification.md)
 - [CampaignSequenceNotificationUriReference](docs/CampaignSequenceNotificationUriReference.md)
 - [CampaignStats](docs/CampaignStats.md)
 - [CampaignTimeSlot](docs/CampaignTimeSlot.md)
 - [Certificate](docs/Certificate.md)
 - [CertificateAuthorityEntityListing](docs/CertificateAuthorityEntityListing.md)
 - [CertificateDetails](docs/CertificateDetails.md)
 - [Change](docs/Change.md)
 - [Channel](docs/Channel.md)
 - [ChannelEntityListing](docs/ChannelEntityListing.md)
 - [ChannelTopic](docs/ChannelTopic.md)
 - [ChannelTopicEntityListing](docs/ChannelTopicEntityListing.md)
 - [Chat](docs/Chat.md)
 - [ChatConversation](docs/ChatConversation.md)
 - [ChatConversationEntityListing](docs/ChatConversationEntityListing.md)
 - [ChatConversationNotification](docs/ChatConversationNotification.md)
 - [ChatConversationNotificationChatMediaParticipant](docs/ChatConversationNotificationChatMediaParticipant.md)
 - [ChatConversationNotificationDetail](docs/ChatConversationNotificationDetail.md)
 - [ChatConversationNotificationErrorBody](docs/ChatConversationNotificationErrorBody.md)
 - [ChatConversationNotificationErrorInfo](docs/ChatConversationNotificationErrorInfo.md)
 - [ChatConversationNotificationParticipants](docs/ChatConversationNotificationParticipants.md)
 - [ChatConversationNotificationUriReference](docs/ChatConversationNotificationUriReference.md)
 - [ChatConversationNotificationWrapup](docs/ChatConversationNotificationWrapup.md)
 - [ChatMediaParticipant](docs/ChatMediaParticipant.md)
 - [ChatMediaPolicy](docs/ChatMediaPolicy.md)
 - [ChatMediaPolicyConditions](docs/ChatMediaPolicyConditions.md)
 - [ChatMessage](docs/ChatMessage.md)
 - [ChatMessageUser](docs/ChatMessageUser.md)
 - [CobrowseConversation](docs/CobrowseConversation.md)
 - [CobrowseConversationEntityListing](docs/CobrowseConversationEntityListing.md)
 - [CobrowseConversationNotification](docs/CobrowseConversationNotification.md)
 - [CobrowseConversationNotificationCobrowseMediaParticipant](docs/CobrowseConversationNotificationCobrowseMediaParticipant.md)
 - [CobrowseConversationNotificationDetail](docs/CobrowseConversationNotificationDetail.md)
 - [CobrowseConversationNotificationErrorBody](docs/CobrowseConversationNotificationErrorBody.md)
 - [CobrowseConversationNotificationErrorInfo](docs/CobrowseConversationNotificationErrorInfo.md)
 - [CobrowseConversationNotificationParticipants](docs/CobrowseConversationNotificationParticipants.md)
 - [CobrowseConversationNotificationUriReference](docs/CobrowseConversationNotificationUriReference.md)
 - [CobrowseConversationNotificationWrapup](docs/CobrowseConversationNotificationWrapup.md)
 - [CobrowseMediaParticipant](docs/CobrowseMediaParticipant.md)
 - [Cobrowsesession](docs/Cobrowsesession.md)
 - [CommandStatus](docs/CommandStatus.md)
 - [CommandStatusEntityListing](docs/CommandStatusEntityListing.md)
 - [Condition](docs/Condition.md)
 - [ConnectRate](docs/ConnectRate.md)
 - [ConsultTransfer](docs/ConsultTransfer.md)
 - [ConsultTransferResponse](docs/ConsultTransferResponse.md)
 - [ConsultTransferUpdate](docs/ConsultTransferUpdate.md)
 - [Contact](docs/Contact.md)
 - [ContactAddress](docs/ContactAddress.md)
 - [ContactCallbackRequest](docs/ContactCallbackRequest.md)
 - [ContactList](docs/ContactList.md)
 - [ContactListEntityListing](docs/ContactListEntityListing.md)
 - [ContactListNotification](docs/ContactListNotification.md)
 - [ContactListNotificationContactPhoneNumberColumn](docs/ContactListNotificationContactPhoneNumberColumn.md)
 - [ContactListNotificationImportStatus](docs/ContactListNotificationImportStatus.md)
 - [ContactListNotificationPhoneColumns](docs/ContactListNotificationPhoneColumns.md)
 - [ContactListNotificationUriReference](docs/ContactListNotificationUriReference.md)
 - [ContactListing](docs/ContactListing.md)
 - [ContactPhoneNumberColumn](docs/ContactPhoneNumberColumn.md)
 - [ContactSort](docs/ContactSort.md)
 - [ContentAttributeFilterItem](docs/ContentAttributeFilterItem.md)
 - [ContentFacetFilterItem](docs/ContentFacetFilterItem.md)
 - [ContentFilterItem](docs/ContentFilterItem.md)
 - [ContentQueryRequest](docs/ContentQueryRequest.md)
 - [ContentSortItem](docs/ContentSortItem.md)
 - [Conversation](docs/Conversation.md)
 - [ConversationAssociation](docs/ConversationAssociation.md)
 - [ConversationBasic](docs/ConversationBasic.md)
 - [ConversationChat](docs/ConversationChat.md)
 - [ConversationEntityListing](docs/ConversationEntityListing.md)
 - [ConversationNotification](docs/ConversationNotification.md)
 - [ConversationNotificationAddress](docs/ConversationNotificationAddress.md)
 - [ConversationNotificationCall](docs/ConversationNotificationCall.md)
 - [ConversationNotificationCallback](docs/ConversationNotificationCallback.md)
 - [ConversationNotificationCallbacks](docs/ConversationNotificationCallbacks.md)
 - [ConversationNotificationCalls](docs/ConversationNotificationCalls.md)
 - [ConversationNotificationChat](docs/ConversationNotificationChat.md)
 - [ConversationNotificationChats](docs/ConversationNotificationChats.md)
 - [ConversationNotificationCobrowse](docs/ConversationNotificationCobrowse.md)
 - [ConversationNotificationCobrowsesessions](docs/ConversationNotificationCobrowsesessions.md)
 - [ConversationNotificationDialerPreview](docs/ConversationNotificationDialerPreview.md)
 - [ConversationNotificationDisconnectReason](docs/ConversationNotificationDisconnectReason.md)
 - [ConversationNotificationDisconnectReasons](docs/ConversationNotificationDisconnectReasons.md)
 - [ConversationNotificationEmail](docs/ConversationNotificationEmail.md)
 - [ConversationNotificationEmails](docs/ConversationNotificationEmails.md)
 - [ConversationNotificationErrorDetails](docs/ConversationNotificationErrorDetails.md)
 - [ConversationNotificationErrorInfo](docs/ConversationNotificationErrorInfo.md)
 - [ConversationNotificationFaxStatus](docs/ConversationNotificationFaxStatus.md)
 - [ConversationNotificationParticipant](docs/ConversationNotificationParticipant.md)
 - [ConversationNotificationParticipants](docs/ConversationNotificationParticipants.md)
 - [ConversationNotificationPhoneNumberColumn](docs/ConversationNotificationPhoneNumberColumn.md)
 - [ConversationNotificationScreenshare](docs/ConversationNotificationScreenshare.md)
 - [ConversationNotificationScreenshares](docs/ConversationNotificationScreenshares.md)
 - [ConversationNotificationSelf](docs/ConversationNotificationSelf.md)
 - [ConversationNotificationSocialExpression](docs/ConversationNotificationSocialExpression.md)
 - [ConversationNotificationSocialExpressions](docs/ConversationNotificationSocialExpressions.md)
 - [ConversationNotificationVideo](docs/ConversationNotificationVideo.md)
 - [ConversationNotificationVideos](docs/ConversationNotificationVideos.md)
 - [ConversationNotificationWrapup](docs/ConversationNotificationWrapup.md)
 - [ConversationQuery](docs/ConversationQuery.md)
 - [CopyVoicemailMessage](docs/CopyVoicemailMessage.md)
 - [CoverSheet](docs/CoverSheet.md)
 - [CreateCallRequest](docs/CreateCallRequest.md)
 - [CreateCallResponse](docs/CreateCallResponse.md)
 - [CreateCallbackCommand](docs/CreateCallbackCommand.md)
 - [CreateCallbackResponse](docs/CreateCallbackResponse.md)
 - [CreateEmailRequest](docs/CreateEmailRequest.md)
 - [CreateQueueRequest](docs/CreateQueueRequest.md)
 - [CreateShareRequest](docs/CreateShareRequest.md)
 - [CreateShareRequestMember](docs/CreateShareRequestMember.md)
 - [CreateShareResponse](docs/CreateShareResponse.md)
 - [CreateUser](docs/CreateUser.md)
 - [CreateWebChatRequest](docs/CreateWebChatRequest.md)
 - [CurrentUserScheduleRequestBody](docs/CurrentUserScheduleRequestBody.md)
 - [CustomerInteractionCenter](docs/CustomerInteractionCenter.md)
 - [DID](docs/DID.md)
 - [DIDEntityListing](docs/DIDEntityListing.md)
 - [DIDPool](docs/DIDPool.md)
 - [DIDPoolEntityListing](docs/DIDPoolEntityListing.md)
 - [DefaultGreetingList](docs/DefaultGreetingList.md)
 - [DeleteRetention](docs/DeleteRetention.md)
 - [Destination](docs/Destination.md)
 - [Detail](docs/Detail.md)
 - [DialerAction](docs/DialerAction.md)
 - [DialerAuditRequest](docs/DialerAuditRequest.md)
 - [DialerContact](docs/DialerContact.md)
 - [DialerPreview](docs/DialerPreview.md)
 - [DialerRule](docs/DialerRule.md)
 - [DigitLength](docs/DigitLength.md)
 - [DisconnectReason](docs/DisconnectReason.md)
 - [DncList](docs/DncList.md)
 - [DncListCreate](docs/DncListCreate.md)
 - [DncListEntityListing](docs/DncListEntityListing.md)
 - [DncListNotification](docs/DncListNotification.md)
 - [DncListNotificationImportStatus](docs/DncListNotificationImportStatus.md)
 - [Document](docs/Document.md)
 - [DocumentAttribute](docs/DocumentAttribute.md)
 - [DocumentAudit](docs/DocumentAudit.md)
 - [DocumentAuditEntityListing](docs/DocumentAuditEntityListing.md)
 - [DocumentDataV2Notification](docs/DocumentDataV2Notification.md)
 - [DocumentDataV2NotificationCreatedBy](docs/DocumentDataV2NotificationCreatedBy.md)
 - [DocumentDataV2NotificationLockData](docs/DocumentDataV2NotificationLockData.md)
 - [DocumentDataV2NotificationLockInfo](docs/DocumentDataV2NotificationLockInfo.md)
 - [DocumentDataV2NotificationUserData](docs/DocumentDataV2NotificationUserData.md)
 - [DocumentDataV2NotificationWorkspace](docs/DocumentDataV2NotificationWorkspace.md)
 - [DocumentDataV2NotificationWorkspaceData](docs/DocumentDataV2NotificationWorkspaceData.md)
 - [DocumentEntityListing](docs/DocumentEntityListing.md)
 - [DocumentThumbnail](docs/DocumentThumbnail.md)
 - [DocumentUpdate](docs/DocumentUpdate.md)
 - [DocumentUpload](docs/DocumentUpload.md)
 - [DocumentationResult](docs/DocumentationResult.md)
 - [DocumentationSearchCriteria](docs/DocumentationSearchCriteria.md)
 - [DocumentationSearchRequest](docs/DocumentationSearchRequest.md)
 - [DocumentationSearchResponse](docs/DocumentationSearchResponse.md)
 - [DomainCapabilities](docs/DomainCapabilities.md)
 - [DomainCertificateAuthority](docs/DomainCertificateAuthority.md)
 - [DomainEdgeSoftwareUpdateDto](docs/DomainEdgeSoftwareUpdateDto.md)
 - [DomainEdgeSoftwareVersionDto](docs/DomainEdgeSoftwareVersionDto.md)
 - [DomainEdgeSoftwareVersionDtoEntityListing](docs/DomainEdgeSoftwareVersionDtoEntityListing.md)
 - [DomainEntity](docs/DomainEntity.md)
 - [DomainEntityListing](docs/DomainEntityListing.md)
 - [DomainEntityListingEvaluationForm](docs/DomainEntityListingEvaluationForm.md)
 - [DomainEntityListingQueryResult](docs/DomainEntityListingQueryResult.md)
 - [DomainLogicalInterface](docs/DomainLogicalInterface.md)
 - [DomainNetworkAddress](docs/DomainNetworkAddress.md)
 - [DomainNetworkCommandResponse](docs/DomainNetworkCommandResponse.md)
 - [DomainNetworkRoute](docs/DomainNetworkRoute.md)
 - [DomainOrgRoleDifference](docs/DomainOrgRoleDifference.md)
 - [DomainOrganizationProduct](docs/DomainOrganizationProduct.md)
 - [DomainOrganizationRole](docs/DomainOrganizationRole.md)
 - [DomainOrganizationRoleCreate](docs/DomainOrganizationRoleCreate.md)
 - [DomainOrganizationRoleUpdate](docs/DomainOrganizationRoleUpdate.md)
 - [DomainPermission](docs/DomainPermission.md)
 - [DomainPermissionCollection](docs/DomainPermissionCollection.md)
 - [DomainPermissionPolicy](docs/DomainPermissionPolicy.md)
 - [DomainPhysicalCapabilities](docs/DomainPhysicalCapabilities.md)
 - [DomainPhysicalInterface](docs/DomainPhysicalInterface.md)
 - [DomainResourceConditionNode](docs/DomainResourceConditionNode.md)
 - [DomainResourceConditionValue](docs/DomainResourceConditionValue.md)
 - [DomainRole](docs/DomainRole.md)
 - [DomainSchemaReference](docs/DomainSchemaReference.md)
 - [DownloadResponse](docs/DownloadResponse.md)
 - [DurationCondition](docs/DurationCondition.md)
 - [Edge](docs/Edge.md)
 - [EdgeAutoUpdateConfig](docs/EdgeAutoUpdateConfig.md)
 - [EdgeEntityListing](docs/EdgeEntityListing.md)
 - [EdgeGroup](docs/EdgeGroup.md)
 - [EdgeGroupEntityListing](docs/EdgeGroupEntityListing.md)
 - [EdgeInterface](docs/EdgeInterface.md)
 - [EdgeLine](docs/EdgeLine.md)
 - [EdgeLineEntityListing](docs/EdgeLineEntityListing.md)
 - [EdgeLogsJob](docs/EdgeLogsJob.md)
 - [EdgeLogsJobFile](docs/EdgeLogsJobFile.md)
 - [EdgeLogsJobRequest](docs/EdgeLogsJobRequest.md)
 - [EdgeLogsJobResponse](docs/EdgeLogsJobResponse.md)
 - [EdgeLogsJobUploadRequest](docs/EdgeLogsJobUploadRequest.md)
 - [EdgeRebootParameters](docs/EdgeRebootParameters.md)
 - [EdgeServiceStateRequest](docs/EdgeServiceStateRequest.md)
 - [EdgeTrunkBase](docs/EdgeTrunkBase.md)
 - [EdgeVersionInformation](docs/EdgeVersionInformation.md)
 - [EdgeVersionReport](docs/EdgeVersionReport.md)
 - [Email](docs/Email.md)
 - [EmailAddress](docs/EmailAddress.md)
 - [EmailAttachment](docs/EmailAttachment.md)
 - [EmailConversation](docs/EmailConversation.md)
 - [EmailConversationEntityListing](docs/EmailConversationEntityListing.md)
 - [EmailConversationNotification](docs/EmailConversationNotification.md)
 - [EmailConversationNotificationDetail](docs/EmailConversationNotificationDetail.md)
 - [EmailConversationNotificationEmailMediaParticipant](docs/EmailConversationNotificationEmailMediaParticipant.md)
 - [EmailConversationNotificationErrorBody](docs/EmailConversationNotificationErrorBody.md)
 - [EmailConversationNotificationErrorInfo](docs/EmailConversationNotificationErrorInfo.md)
 - [EmailConversationNotificationParticipants](docs/EmailConversationNotificationParticipants.md)
 - [EmailConversationNotificationUriReference](docs/EmailConversationNotificationUriReference.md)
 - [EmailConversationNotificationWrapup](docs/EmailConversationNotificationWrapup.md)
 - [EmailMediaParticipant](docs/EmailMediaParticipant.md)
 - [EmailMediaPolicy](docs/EmailMediaPolicy.md)
 - [EmailMediaPolicyConditions](docs/EmailMediaPolicyConditions.md)
 - [EmailMessage](docs/EmailMessage.md)
 - [EmailMessageListing](docs/EmailMessageListing.md)
 - [EmailSetup](docs/EmailSetup.md)
 - [Empty](docs/Empty.md)
 - [EncryptionKey](docs/EncryptionKey.md)
 - [EncryptionKeyEntityListing](docs/EncryptionKeyEntityListing.md)
 - [Endpoint](docs/Endpoint.md)
 - [EndpointEntityListing](docs/EndpointEntityListing.md)
 - [Entry](docs/Entry.md)
 - [ErrorBody](docs/ErrorBody.md)
 - [ErrorDetails](docs/ErrorDetails.md)
 - [EstimatedWaitTimePredictions](docs/EstimatedWaitTimePredictions.md)
 - [Evaluation](docs/Evaluation.md)
 - [EvaluationAssignment](docs/EvaluationAssignment.md)
 - [EvaluationEntityListing](docs/EvaluationEntityListing.md)
 - [EvaluationForm](docs/EvaluationForm.md)
 - [EvaluationFormAndScoringSet](docs/EvaluationFormAndScoringSet.md)
 - [EvaluationFormEntityListing](docs/EvaluationFormEntityListing.md)
 - [EvaluationScoringSet](docs/EvaluationScoringSet.md)
 - [EvaluatorActivity](docs/EvaluatorActivity.md)
 - [EvaluatorActivityEntityListing](docs/EvaluatorActivityEntityListing.md)
 - [ExpansionCriterium](docs/ExpansionCriterium.md)
 - [ExportUri](docs/ExportUri.md)
 - [ExportUriNotification](docs/ExportUriNotification.md)
 - [Extension](docs/Extension.md)
 - [ExtensionEntityListing](docs/ExtensionEntityListing.md)
 - [ExtensionPool](docs/ExtensionPool.md)
 - [ExtensionPoolEntityListing](docs/ExtensionPoolEntityListing.md)
 - [ExternalContact](docs/ExternalContact.md)
 - [ExternalDataSource](docs/ExternalDataSource.md)
 - [ExternalOrganization](docs/ExternalOrganization.md)
 - [ExternalOrganizationListing](docs/ExternalOrganizationListing.md)
 - [FacetEntry](docs/FacetEntry.md)
 - [FacetInfo](docs/FacetInfo.md)
 - [FacetKeyAttribute](docs/FacetKeyAttribute.md)
 - [FacetStatistics](docs/FacetStatistics.md)
 - [FacetTerm](docs/FacetTerm.md)
 - [FaxDataV2Notification](docs/FaxDataV2Notification.md)
 - [FaxDataV2NotificationLockData](docs/FaxDataV2NotificationLockData.md)
 - [FaxDataV2NotificationLockInfo](docs/FaxDataV2NotificationLockInfo.md)
 - [FaxDataV2NotificationUserData](docs/FaxDataV2NotificationUserData.md)
 - [FaxDataV2NotificationWorkspaceData](docs/FaxDataV2NotificationWorkspaceData.md)
 - [FaxDocument](docs/FaxDocument.md)
 - [FaxDocumentEntityListing](docs/FaxDocumentEntityListing.md)
 - [FaxSendRequest](docs/FaxSendRequest.md)
 - [FaxSendResponse](docs/FaxSendResponse.md)
 - [FaxStatus](docs/FaxStatus.md)
 - [FaxSummary](docs/FaxSummary.md)
 - [FeatureState](docs/FeatureState.md)
 - [FieldConfig](docs/FieldConfig.md)
 - [FieldConfigs](docs/FieldConfigs.md)
 - [FieldList](docs/FieldList.md)
 - [Flow](docs/Flow.md)
 - [FlowEntityListing](docs/FlowEntityListing.md)
 - [FlowVersion](docs/FlowVersion.md)
 - [GSuite](docs/GSuite.md)
 - [Geolocation](docs/Geolocation.md)
 - [GeolocationSettings](docs/GeolocationSettings.md)
 - [Greeting](docs/Greeting.md)
 - [GreetingAudioFile](docs/GreetingAudioFile.md)
 - [GreetingListing](docs/GreetingListing.md)
 - [GreetingMediaInfo](docs/GreetingMediaInfo.md)
 - [GreetingOwner](docs/GreetingOwner.md)
 - [Group](docs/Group.md)
 - [GroupContact](docs/GroupContact.md)
 - [GroupEntityListing](docs/GroupEntityListing.md)
 - [GroupMembersUpdate](docs/GroupMembersUpdate.md)
 - [GroupSearchCriteria](docs/GroupSearchCriteria.md)
 - [GroupSearchRequest](docs/GroupSearchRequest.md)
 - [GroupUpdate](docs/GroupUpdate.md)
 - [GroupsSearchResponse](docs/GroupsSearchResponse.md)
 - [HeartBeatAlert](docs/HeartBeatAlert.md)
 - [HeartBeatAlertContainer](docs/HeartBeatAlertContainer.md)
 - [HeartBeatAlertNotification](docs/HeartBeatAlertNotification.md)
 - [HeartBeatAlertNotificationNotificationUser](docs/HeartBeatAlertNotificationNotificationUser.md)
 - [HeartBeatAlertNotificationNotificationUsers](docs/HeartBeatAlertNotificationNotificationUsers.md)
 - [HeartBeatRule](docs/HeartBeatRule.md)
 - [HeartBeatRuleContainer](docs/HeartBeatRuleContainer.md)
 - [HeartBeatRuleNotification](docs/HeartBeatRuleNotification.md)
 - [HeartBeatRuleNotificationNotificationUser](docs/HeartBeatRuleNotificationNotificationUser.md)
 - [IdentityNow](docs/IdentityNow.md)
 - [ImportStatus](docs/ImportStatus.md)
 - [ImportStatusNotification](docs/ImportStatusNotification.md)
 - [InboundDomain](docs/InboundDomain.md)
 - [InboundDomainEntityListing](docs/InboundDomainEntityListing.md)
 - [InboundRoute](docs/InboundRoute.md)
 - [InboundRouteEntityListing](docs/InboundRouteEntityListing.md)
 - [InitiateScreenRecording](docs/InitiateScreenRecording.md)
 - [InteractionStatAlertNotification](docs/InteractionStatAlertNotification.md)
 - [InteractionStatAlertNotificationNotificationUser](docs/InteractionStatAlertNotificationNotificationUser.md)
 - [InteractionStatRuleNotification](docs/InteractionStatRuleNotification.md)
 - [InteractionStatRuleNotificationNotificationUser](docs/InteractionStatRuleNotificationNotificationUser.md)
 - [InteractionStatsAlert](docs/InteractionStatsAlert.md)
 - [InteractionStatsAlertContainer](docs/InteractionStatsAlertContainer.md)
 - [InteractionStatsRule](docs/InteractionStatsRule.md)
 - [InteractionStatsRuleContainer](docs/InteractionStatsRuleContainer.md)
 - [JsonNode](docs/JsonNode.md)
 - [JsonNodeSearchResponse](docs/JsonNodeSearchResponse.md)
 - [KeyRotationSchedule](docs/KeyRotationSchedule.md)
 - [Keyword](docs/Keyword.md)
 - [KeywordSet](docs/KeywordSet.md)
 - [KeywordSetEntityListing](docs/KeywordSetEntityListing.md)
 - [Language](docs/Language.md)
 - [LanguageEntityListing](docs/LanguageEntityListing.md)
 - [Library](docs/Library.md)
 - [LibraryEntityListing](docs/LibraryEntityListing.md)
 - [Line](docs/Line.md)
 - [LineBase](docs/LineBase.md)
 - [LineBaseEntityListing](docs/LineBaseEntityListing.md)
 - [LineEntityListing](docs/LineEntityListing.md)
 - [LineStatus](docs/LineStatus.md)
 - [LocalEncryptionConfiguration](docs/LocalEncryptionConfiguration.md)
 - [LocalEncryptionConfigurationListing](docs/LocalEncryptionConfigurationListing.md)
 - [LocalEncryptionKeyRequest](docs/LocalEncryptionKeyRequest.md)
 - [Location](docs/Location.md)
 - [LocationAddress](docs/LocationAddress.md)
 - [LocationDefinition](docs/LocationDefinition.md)
 - [LocationEmergencyNumber](docs/LocationEmergencyNumber.md)
 - [LocationSearchCriteria](docs/LocationSearchCriteria.md)
 - [LocationSearchRequest](docs/LocationSearchRequest.md)
 - [LocationsSearchResponse](docs/LocationsSearchResponse.md)
 - [LockInfo](docs/LockInfo.md)
 - [LogicalInterfaceEntityListing](docs/LogicalInterfaceEntityListing.md)
 - [ManagementUnit](docs/ManagementUnit.md)
 - [MaxParticipants](docs/MaxParticipants.md)
 - [MediaParticipantRequest](docs/MediaParticipantRequest.md)
 - [MediaPolicies](docs/MediaPolicies.md)
 - [MediaResult](docs/MediaResult.md)
 - [MediaSetting](docs/MediaSetting.md)
 - [MediaSummary](docs/MediaSummary.md)
 - [MediaSummaryDetail](docs/MediaSummaryDetail.md)
 - [MemberEntity](docs/MemberEntity.md)
 - [MetaData](docs/MetaData.md)
 - [Metabase](docs/Metabase.md)
 - [MeteredEvaluationAssignment](docs/MeteredEvaluationAssignment.md)
 - [Note](docs/Note.md)
 - [NoteListing](docs/NoteListing.md)
 - [Number](docs/Number.md)
 - [NumberPlan](docs/NumberPlan.md)
 - [NumericRange](docs/NumericRange.md)
 - [OAuthClient](docs/OAuthClient.md)
 - [OAuthClientEntityListing](docs/OAuthClientEntityListing.md)
 - [OAuthClientListing](docs/OAuthClientListing.md)
 - [OAuthProvider](docs/OAuthProvider.md)
 - [OAuthProviderEntityListing](docs/OAuthProviderEntityListing.md)
 - [ObservationDataContainer](docs/ObservationDataContainer.md)
 - [ObservationQuery](docs/ObservationQuery.md)
 - [ObservationQueryResponse](docs/ObservationQueryResponse.md)
 - [Okta](docs/Okta.md)
 - [OneLogin](docs/OneLogin.md)
 - [Operation](docs/Operation.md)
 - [OrgMediaUtilization](docs/OrgMediaUtilization.md)
 - [Organization](docs/Organization.md)
 - [OrganizationFeatures](docs/OrganizationFeatures.md)
 - [OrganizationPresence](docs/OrganizationPresence.md)
 - [OrganizationPresenceEntityListing](docs/OrganizationPresenceEntityListing.md)
 - [OrganizationProductEntityListing](docs/OrganizationProductEntityListing.md)
 - [OrganizationRoleEntityListing](docs/OrganizationRoleEntityListing.md)
 - [OrphanRecording](docs/OrphanRecording.md)
 - [OrphanRecordingListing](docs/OrphanRecordingListing.md)
 - [OrphanUpdateRequest](docs/OrphanUpdateRequest.md)
 - [OutOfOffice](docs/OutOfOffice.md)
 - [OutOfOfficeNotification](docs/OutOfOfficeNotification.md)
 - [OutOfOfficeNotificationUser](docs/OutOfOfficeNotificationUser.md)
 - [OutboundRoute](docs/OutboundRoute.md)
 - [OutboundRouteBase](docs/OutboundRouteBase.md)
 - [OutboundRouteBaseEntityListing](docs/OutboundRouteBaseEntityListing.md)
 - [OutboundRouteEntityListing](docs/OutboundRouteEntityListing.md)
 - [PINConfiguration](docs/PINConfiguration.md)
 - [Page](docs/Page.md)
 - [PagingSpec](docs/PagingSpec.md)
 - [Parameter](docs/Parameter.md)
 - [ParsedCertificate](docs/ParsedCertificate.md)
 - [Participant](docs/Participant.md)
 - [ParticipantAttributes](docs/ParticipantAttributes.md)
 - [ParticipantBasic](docs/ParticipantBasic.md)
 - [PermissionCollectionEntityListing](docs/PermissionCollectionEntityListing.md)
 - [Phone](docs/Phone.md)
 - [PhoneBase](docs/PhoneBase.md)
 - [PhoneBaseEntityListing](docs/PhoneBaseEntityListing.md)
 - [PhoneCapabilities](docs/PhoneCapabilities.md)
 - [PhoneColumn](docs/PhoneColumn.md)
 - [PhoneEntityListing](docs/PhoneEntityListing.md)
 - [PhoneMetaBaseEntityListing](docs/PhoneMetaBaseEntityListing.md)
 - [PhoneNumber](docs/PhoneNumber.md)
 - [PhoneNumberColumn](docs/PhoneNumberColumn.md)
 - [PhoneNumberStatus](docs/PhoneNumberStatus.md)
 - [PhoneStatus](docs/PhoneStatus.md)
 - [PhonesReboot](docs/PhonesReboot.md)
 - [PhysicalInterfaceEntityListing](docs/PhysicalInterfaceEntityListing.md)
 - [PingIdentity](docs/PingIdentity.md)
 - [Policy](docs/Policy.md)
 - [PolicyActions](docs/PolicyActions.md)
 - [PolicyConditions](docs/PolicyConditions.md)
 - [PolicyCreate](docs/PolicyCreate.md)
 - [PolicyEntityListing](docs/PolicyEntityListing.md)
 - [PolicyErrorMessage](docs/PolicyErrorMessage.md)
 - [PolicyErrors](docs/PolicyErrors.md)
 - [PredictionResults](docs/PredictionResults.md)
 - [PresenceQueryResponse](docs/PresenceQueryResponse.md)
 - [Prompt](docs/Prompt.md)
 - [PromptAsset](docs/PromptAsset.md)
 - [PromptAssetCreate](docs/PromptAssetCreate.md)
 - [PromptAssetEntityListing](docs/PromptAssetEntityListing.md)
 - [PromptEntityListing](docs/PromptEntityListing.md)
 - [PropertyIndexRequest](docs/PropertyIndexRequest.md)
 - [ProvisionInfo](docs/ProvisionInfo.md)
 - [PureCloud](docs/PureCloud.md)
 - [QualifierMappingObservationQueryResponse](docs/QualifierMappingObservationQueryResponse.md)
 - [QualityAudit](docs/QualityAudit.md)
 - [QualityAuditPage](docs/QualityAuditPage.md)
 - [QueryFacetInfo](docs/QueryFacetInfo.md)
 - [QueryRequest](docs/QueryRequest.md)
 - [QueryResult](docs/QueryResult.md)
 - [QueryResults](docs/QueryResults.md)
 - [Question](docs/Question.md)
 - [QuestionGroup](docs/QuestionGroup.md)
 - [QuestionGroupScore](docs/QuestionGroupScore.md)
 - [QuestionScore](docs/QuestionScore.md)
 - [Queue](docs/Queue.md)
 - [QueueEmailAddress](docs/QueueEmailAddress.md)
 - [QueueEntityListing](docs/QueueEntityListing.md)
 - [QueueMember](docs/QueueMember.md)
 - [QueueMemberEntityListing](docs/QueueMemberEntityListing.md)
 - [QueueMemberNotification](docs/QueueMemberNotification.md)
 - [QueueUtilizationDiagnostic](docs/QueueUtilizationDiagnostic.md)
 - [Reaction](docs/Reaction.md)
 - [RecallEntry](docs/RecallEntry.md)
 - [Recording](docs/Recording.md)
 - [RecordingDataV2Notification](docs/RecordingDataV2Notification.md)
 - [RecordingDataV2NotificationConversationData](docs/RecordingDataV2NotificationConversationData.md)
 - [RecordingDataV2NotificationLockData](docs/RecordingDataV2NotificationLockData.md)
 - [RecordingDataV2NotificationLockInfo](docs/RecordingDataV2NotificationLockInfo.md)
 - [RecordingDataV2NotificationUserData](docs/RecordingDataV2NotificationUserData.md)
 - [RecordingDataV2NotificationWorkspaceData](docs/RecordingDataV2NotificationWorkspaceData.md)
 - [RecordingEmailMessage](docs/RecordingEmailMessage.md)
 - [RecordingSettings](docs/RecordingSettings.md)
 - [Relationship](docs/Relationship.md)
 - [RelationshipListing](docs/RelationshipListing.md)
 - [ReplaceRequest](docs/ReplaceRequest.md)
 - [ReplaceResponse](docs/ReplaceResponse.md)
 - [ReportMetaData](docs/ReportMetaData.md)
 - [ReportMetaDataEntityListing](docs/ReportMetaDataEntityListing.md)
 - [ReportRunEntry](docs/ReportRunEntry.md)
 - [ReportRunEntryEntityDomainListing](docs/ReportRunEntryEntityDomainListing.md)
 - [ReportSchedule](docs/ReportSchedule.md)
 - [ReportScheduleEntityListing](docs/ReportScheduleEntityListing.md)
 - [ResourceConditionNode](docs/ResourceConditionNode.md)
 - [ResourceConditionValue](docs/ResourceConditionValue.md)
 - [ResourcePermissionPolicy](docs/ResourcePermissionPolicy.md)
 - [Response](docs/Response.md)
 - [ResponseEntityList](docs/ResponseEntityList.md)
 - [ResponseEntityListing](docs/ResponseEntityListing.md)
 - [ResponseFilter](docs/ResponseFilter.md)
 - [ResponseQueryRequest](docs/ResponseQueryRequest.md)
 - [ResponseQueryResults](docs/ResponseQueryResults.md)
 - [ResponseSet](docs/ResponseSet.md)
 - [ResponseSetEntityListing](docs/ResponseSetEntityListing.md)
 - [ResponseSetNotification](docs/ResponseSetNotification.md)
 - [ResponseSetNotificationReaction](docs/ResponseSetNotificationReaction.md)
 - [ResponseSetNotificationResponses](docs/ResponseSetNotificationResponses.md)
 - [ResponseSubstitution](docs/ResponseSubstitution.md)
 - [ResponseText](docs/ResponseText.md)
 - [RestErrorDetail](docs/RestErrorDetail.md)
 - [RetentionDuration](docs/RetentionDuration.md)
 - [ReverseWhitepagesLookupResult](docs/ReverseWhitepagesLookupResult.md)
 - [Ring](docs/Ring.md)
 - [RoutingData](docs/RoutingData.md)
 - [RoutingSkill](docs/RoutingSkill.md)
 - [RoutingStatus](docs/RoutingStatus.md)
 - [RoutingStatusAlert](docs/RoutingStatusAlert.md)
 - [RoutingStatusAlertContainer](docs/RoutingStatusAlertContainer.md)
 - [RoutingStatusRule](docs/RoutingStatusRule.md)
 - [RoutingStatusRuleContainer](docs/RoutingStatusRuleContainer.md)
 - [RuleSet](docs/RuleSet.md)
 - [RuleSetDiagnostic](docs/RuleSetDiagnostic.md)
 - [RuleSetEntityListing](docs/RuleSetEntityListing.md)
 - [RuleSetNotification](docs/RuleSetNotification.md)
 - [RuleSetNotificationAction](docs/RuleSetNotificationAction.md)
 - [RuleSetNotificationActions](docs/RuleSetNotificationActions.md)
 - [RuleSetNotificationCondition](docs/RuleSetNotificationCondition.md)
 - [RuleSetNotificationConditions](docs/RuleSetNotificationConditions.md)
 - [RuleSetNotificationRule](docs/RuleSetNotificationRule.md)
 - [RuleSetNotificationRules](docs/RuleSetNotificationRules.md)
 - [RuleSetNotificationUriReference](docs/RuleSetNotificationUriReference.md)
 - [RunNowResponse](docs/RunNowResponse.md)
 - [Salesforce](docs/Salesforce.md)
 - [ScheduleInterval](docs/ScheduleInterval.md)
 - [SchemaCategory](docs/SchemaCategory.md)
 - [SchemaCategoryEntityListing](docs/SchemaCategoryEntityListing.md)
 - [SchemaReferenceEntityListing](docs/SchemaReferenceEntityListing.md)
 - [ScreenRecordingSession](docs/ScreenRecordingSession.md)
 - [ScreenRecordingSessionListing](docs/ScreenRecordingSessionListing.md)
 - [ScreenRecordingSessionRequest](docs/ScreenRecordingSessionRequest.md)
 - [ScreenShareConversationNotification](docs/ScreenShareConversationNotification.md)
 - [ScreenShareConversationNotificationDetail](docs/ScreenShareConversationNotificationDetail.md)
 - [ScreenShareConversationNotificationErrorBody](docs/ScreenShareConversationNotificationErrorBody.md)
 - [ScreenShareConversationNotificationErrorInfo](docs/ScreenShareConversationNotificationErrorInfo.md)
 - [ScreenShareConversationNotificationParticipants](docs/ScreenShareConversationNotificationParticipants.md)
 - [ScreenShareConversationNotificationScreenShareMediaParticipant](docs/ScreenShareConversationNotificationScreenShareMediaParticipant.md)
 - [ScreenShareConversationNotificationUriReference](docs/ScreenShareConversationNotificationUriReference.md)
 - [ScreenShareConversationNotificationWrapup](docs/ScreenShareConversationNotificationWrapup.md)
 - [Screenshare](docs/Screenshare.md)
 - [Script](docs/Script.md)
 - [ScriptEntityListing](docs/ScriptEntityListing.md)
 - [SearchAggregation](docs/SearchAggregation.md)
 - [SearchCriteria](docs/SearchCriteria.md)
 - [SearchRequest](docs/SearchRequest.md)
 - [Section](docs/Section.md)
 - [SecurityProfile](docs/SecurityProfile.md)
 - [SecurityProfileEntityListing](docs/SecurityProfileEntityListing.md)
 - [Segment](docs/Segment.md)
 - [SequenceSchedule](docs/SequenceSchedule.md)
 - [SequenceScheduleNotification](docs/SequenceScheduleNotification.md)
 - [SequenceScheduleNotificationScheduleInterval](docs/SequenceScheduleNotificationScheduleInterval.md)
 - [SequenceScheduleNotificationUriReference](docs/SequenceScheduleNotificationUriReference.md)
 - [ServerDate](docs/ServerDate.md)
 - [ServiceContext](docs/ServiceContext.md)
 - [ServiceLevel](docs/ServiceLevel.md)
 - [Share](docs/Share.md)
 - [ShareEntityListing](docs/ShareEntityListing.md)
 - [SharedEntity](docs/SharedEntity.md)
 - [SharedResponse](docs/SharedResponse.md)
 - [Site](docs/Site.md)
 - [SiteEntityListing](docs/SiteEntityListing.md)
 - [SkillEntityListing](docs/SkillEntityListing.md)
 - [SkillsToRemove](docs/SkillsToRemove.md)
 - [SocialConversationNotification](docs/SocialConversationNotification.md)
 - [SocialConversationNotificationDetail](docs/SocialConversationNotificationDetail.md)
 - [SocialConversationNotificationErrorBody](docs/SocialConversationNotificationErrorBody.md)
 - [SocialConversationNotificationErrorInfo](docs/SocialConversationNotificationErrorInfo.md)
 - [SocialConversationNotificationParticipants](docs/SocialConversationNotificationParticipants.md)
 - [SocialConversationNotificationSocialMediaParticipant](docs/SocialConversationNotificationSocialMediaParticipant.md)
 - [SocialConversationNotificationUriReference](docs/SocialConversationNotificationUriReference.md)
 - [SocialConversationNotificationWrapup](docs/SocialConversationNotificationWrapup.md)
 - [SocialExpression](docs/SocialExpression.md)
 - [SortItem](docs/SortItem.md)
 - [Station](docs/Station.md)
 - [StationEntityListing](docs/StationEntityListing.md)
 - [StatisticalResponse](docs/StatisticalResponse.md)
 - [StatisticalSummary](docs/StatisticalSummary.md)
 - [StreetAddress](docs/StreetAddress.md)
 - [SubscriberResponse](docs/SubscriberResponse.md)
 - [SuggestSearchCriteria](docs/SuggestSearchCriteria.md)
 - [SuggestSearchRequest](docs/SuggestSearchRequest.md)
 - [SystemPresence](docs/SystemPresence.md)
 - [SystemPrompt](docs/SystemPrompt.md)
 - [SystemPromptAsset](docs/SystemPromptAsset.md)
 - [SystemPromptAssetEntityListing](docs/SystemPromptAssetEntityListing.md)
 - [SystemPromptEntityListing](docs/SystemPromptEntityListing.md)
 - [TagQueryRequest](docs/TagQueryRequest.md)
 - [TagValue](docs/TagValue.md)
 - [TagValueEntityListing](docs/TagValueEntityListing.md)
 - [TermAttribute](docs/TermAttribute.md)
 - [Ticker](docs/Ticker.md)
 - [TimeAllowed](docs/TimeAllowed.md)
 - [TimeInterval](docs/TimeInterval.md)
 - [TimeOffRequest](docs/TimeOffRequest.md)
 - [TimeOffRequestList](docs/TimeOffRequestList.md)
 - [TimeOffRequestPatch](docs/TimeOffRequestPatch.md)
 - [TimeOffRequestUpdateNotification](docs/TimeOffRequestUpdateNotification.md)
 - [TimeOffRequestUpdateNotificationUser](docs/TimeOffRequestUpdateNotificationUser.md)
 - [TimeSlot](docs/TimeSlot.md)
 - [TimeZone](docs/TimeZone.md)
 - [TimeZoneEntityListing](docs/TimeZoneEntityListing.md)
 - [TransferRequest](docs/TransferRequest.md)
 - [Trunk](docs/Trunk.md)
 - [TrunkBase](docs/TrunkBase.md)
 - [TrunkBaseAssignment](docs/TrunkBaseAssignment.md)
 - [TrunkBaseEntityListing](docs/TrunkBaseEntityListing.md)
 - [TrunkEntityListing](docs/TrunkEntityListing.md)
 - [TrunkMetabaseEntityListing](docs/TrunkMetabaseEntityListing.md)
 - [TrunkRecordingEnabledCount](docs/TrunkRecordingEnabledCount.md)
 - [TwitterId](docs/TwitterId.md)
 - [UnreadMetric](docs/UnreadMetric.md)
 - [UnreadStatus](docs/UnreadStatus.md)
 - [UriReference](docs/UriReference.md)
 - [Usage](docs/Usage.md)
 - [UsageItem](docs/UsageItem.md)
 - [User](docs/User.md)
 - [UserAgentInfo](docs/UserAgentInfo.md)
 - [UserAuthorization](docs/UserAuthorization.md)
 - [UserConversationSummary](docs/UserConversationSummary.md)
 - [UserConversationSummaryNotification](docs/UserConversationSummaryNotification.md)
 - [UserConversationSummaryNotificationCall](docs/UserConversationSummaryNotificationCall.md)
 - [UserConversationSummaryNotificationCallContactCenter](docs/UserConversationSummaryNotificationCallContactCenter.md)
 - [UserConversationSummaryNotificationMediaSummary](docs/UserConversationSummaryNotificationMediaSummary.md)
 - [UserConversationSummaryNotificationMediaSummaryDetail](docs/UserConversationSummaryNotificationMediaSummaryDetail.md)
 - [UserDetailsQuery](docs/UserDetailsQuery.md)
 - [UserEntityListing](docs/UserEntityListing.md)
 - [UserImage](docs/UserImage.md)
 - [UserListScheduleRequestBody](docs/UserListScheduleRequestBody.md)
 - [UserMe](docs/UserMe.md)
 - [UserParam](docs/UserParam.md)
 - [UserPresence](docs/UserPresence.md)
 - [UserPresenceAlert](docs/UserPresenceAlert.md)
 - [UserPresenceAlertContainer](docs/UserPresenceAlertContainer.md)
 - [UserPresenceNotification](docs/UserPresenceNotification.md)
 - [UserPresenceNotificationOrganizationPresence](docs/UserPresenceNotificationOrganizationPresence.md)
 - [UserPresenceNotificationPresenceDefinition](docs/UserPresenceNotificationPresenceDefinition.md)
 - [UserPresenceRule](docs/UserPresenceRule.md)
 - [UserPresenceRuleContainer](docs/UserPresenceRuleContainer.md)
 - [UserQueue](docs/UserQueue.md)
 - [UserQueueEntityListing](docs/UserQueueEntityListing.md)
 - [UserRecording](docs/UserRecording.md)
 - [UserRecordingEntityListing](docs/UserRecordingEntityListing.md)
 - [UserRoutingSkill](docs/UserRoutingSkill.md)
 - [UserRoutingSkillPost](docs/UserRoutingSkillPost.md)
 - [UserRoutingStatusNotification](docs/UserRoutingStatusNotification.md)
 - [UserRoutingStatusNotificationRoutingStatus](docs/UserRoutingStatusNotificationRoutingStatus.md)
 - [UserSchedule](docs/UserSchedule.md)
 - [UserScheduleActivity](docs/UserScheduleActivity.md)
 - [UserScheduleAdherence](docs/UserScheduleAdherence.md)
 - [UserScheduleAdherenceUpdateNotification](docs/UserScheduleAdherenceUpdateNotification.md)
 - [UserScheduleAdherenceUpdateNotificationUser](docs/UserScheduleAdherenceUpdateNotificationUser.md)
 - [UserScheduleContainer](docs/UserScheduleContainer.md)
 - [UserScheduleFullDayTimeOffMarker](docs/UserScheduleFullDayTimeOffMarker.md)
 - [UserScheduleShift](docs/UserScheduleShift.md)
 - [UserSearchCriteria](docs/UserSearchCriteria.md)
 - [UserSearchRequest](docs/UserSearchRequest.md)
 - [UserSkillEntityListing](docs/UserSkillEntityListing.md)
 - [UserStation](docs/UserStation.md)
 - [UserStations](docs/UserStations.md)
 - [UserStationsNotification](docs/UserStationsNotification.md)
 - [UserStationsNotificationAssociatedStation](docs/UserStationsNotificationAssociatedStation.md)
 - [UserStationsNotificationUser](docs/UserStationsNotificationUser.md)
 - [UserStationsNotificationUserStation](docs/UserStationsNotificationUserStation.md)
 - [UsersSearchResponse](docs/UsersSearchResponse.md)
 - [Utilization](docs/Utilization.md)
 - [ValidateAddressRequest](docs/ValidateAddressRequest.md)
 - [ValidateAddressResponse](docs/ValidateAddressResponse.md)
 - [Video](docs/Video.md)
 - [VideoConversationNotification](docs/VideoConversationNotification.md)
 - [VideoConversationNotificationDetail](docs/VideoConversationNotificationDetail.md)
 - [VideoConversationNotificationErrorBody](docs/VideoConversationNotificationErrorBody.md)
 - [VideoConversationNotificationErrorInfo](docs/VideoConversationNotificationErrorInfo.md)
 - [VideoConversationNotificationParticipants](docs/VideoConversationNotificationParticipants.md)
 - [VideoConversationNotificationUriReference](docs/VideoConversationNotificationUriReference.md)
 - [VideoConversationNotificationVideoMediaParticipant](docs/VideoConversationNotificationVideoMediaParticipant.md)
 - [VideoConversationNotificationWrapup](docs/VideoConversationNotificationWrapup.md)
 - [VisibilityCondition](docs/VisibilityCondition.md)
 - [VmPairingInfo](docs/VmPairingInfo.md)
 - [VoicemailCopyRecord](docs/VoicemailCopyRecord.md)
 - [VoicemailGroupPolicy](docs/VoicemailGroupPolicy.md)
 - [VoicemailMailboxInfo](docs/VoicemailMailboxInfo.md)
 - [VoicemailMediaInfo](docs/VoicemailMediaInfo.md)
 - [VoicemailMessage](docs/VoicemailMessage.md)
 - [VoicemailMessageEntityListing](docs/VoicemailMessageEntityListing.md)
 - [VoicemailMessageNotification](docs/VoicemailMessageNotification.md)
 - [VoicemailOrganizationPolicy](docs/VoicemailOrganizationPolicy.md)
 - [VoicemailSearchCriteria](docs/VoicemailSearchCriteria.md)
 - [VoicemailSearchRequest](docs/VoicemailSearchRequest.md)
 - [VoicemailUserPolicy](docs/VoicemailUserPolicy.md)
 - [VoicemailsSearchResponse](docs/VoicemailsSearchResponse.md)
 - [WfmUserEntityListing](docs/WfmUserEntityListing.md)
 - [Workspace](docs/Workspace.md)
 - [WorkspaceCreate](docs/WorkspaceCreate.md)
 - [WorkspaceEntityListing](docs/WorkspaceEntityListing.md)
 - [WorkspaceMember](docs/WorkspaceMember.md)
 - [WorkspaceMemberEntityListing](docs/WorkspaceMemberEntityListing.md)
 - [WorkspaceSummary](docs/WorkspaceSummary.md)
 - [WrapUpCodeMapping](docs/WrapUpCodeMapping.md)
 - [WrapUpCodeMappingNotification](docs/WrapUpCodeMappingNotification.md)
 - [Wrapup](docs/Wrapup.md)
 - [WrapupCode](docs/WrapupCode.md)
 - [WrapupCodeEntityListing](docs/WrapupCodeEntityListing.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### PureCloud Auth

- **Type**: OAuth
- **Flow**: implicit
- **Authorizatoin URL**: https://auth.us-east-1.mypurecloud.com/authorize
- **Scopes**: 
  - all: All the scopes


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issue.

## Author

DeveloperEvangelists@inin.com

