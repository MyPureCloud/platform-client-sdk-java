# IntegrationsApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**deleteIntegration**](IntegrationsApi#deleteIntegration) | Delete integration. |
| [**deleteIntegrationsAction**](IntegrationsApi#deleteIntegrationsAction) | Delete an Action |
| [**deleteIntegrationsActionDraft**](IntegrationsApi#deleteIntegrationsActionDraft) | Delete a Draft |
| [**deleteIntegrationsCredential**](IntegrationsApi#deleteIntegrationsCredential) | Delete a set of credentials |
| [**getIntegration**](IntegrationsApi#getIntegration) | Get integration. |
| [**getIntegrationConfigCurrent**](IntegrationsApi#getIntegrationConfigCurrent) | Get integration configuration. |
| [**getIntegrations**](IntegrationsApi#getIntegrations) | List integrations |
| [**getIntegrationsAction**](IntegrationsApi#getIntegrationsAction) | Retrieves a single Action matching id. |
| [**getIntegrationsActionDraft**](IntegrationsApi#getIntegrationsActionDraft) | Retrieve a Draft |
| [**getIntegrationsActionDraftFunction**](IntegrationsApi#getIntegrationsActionDraftFunction) | Get draft function settings for Action |
| [**getIntegrationsActionDraftSchema**](IntegrationsApi#getIntegrationsActionDraftSchema) | Retrieve schema for a Draft based on filename. |
| [**getIntegrationsActionDraftTemplate**](IntegrationsApi#getIntegrationsActionDraftTemplate) | Retrieve templates for a Draft based on filename. |
| [**getIntegrationsActionDraftValidation**](IntegrationsApi#getIntegrationsActionDraftValidation) | Validate current Draft configuration. |
| [**getIntegrationsActionFunction**](IntegrationsApi#getIntegrationsActionFunction) | Get published function settings for Action |
| [**getIntegrationsActionSchema**](IntegrationsApi#getIntegrationsActionSchema) | Retrieve schema for an action based on filename. |
| [**getIntegrationsActionTemplate**](IntegrationsApi#getIntegrationsActionTemplate) | Retrieve text of templates for an action based on filename. |
| [**getIntegrationsActions**](IntegrationsApi#getIntegrationsActions) | Retrieves all actions associated with filters passed in via query param. |
| [**getIntegrationsActionsCategories**](IntegrationsApi#getIntegrationsActionsCategories) | Retrieves all categories of available Actions |
| [**getIntegrationsActionsCertificates**](IntegrationsApi#getIntegrationsActionsCertificates) | Retrieves the available mTLS client certificates in use. This endpoint will return inconsistent results while a certificate rotation is in progress. |
| [**getIntegrationsActionsCertificatesTruststore**](IntegrationsApi#getIntegrationsActionsCertificatesTruststore) | Retrieves basic info about trusted root CA certificates |
| [**getIntegrationsActionsDrafts**](IntegrationsApi#getIntegrationsActionsDrafts) | Retrieves all action drafts associated with the filters passed in via query param. |
| [**getIntegrationsActionsFunctionsRuntimes**](IntegrationsApi#getIntegrationsActionsFunctionsRuntimes) | Get action function settings for Action |
| [**getIntegrationsBotconnectorBot**](IntegrationsApi#getIntegrationsBotconnectorBot) | Get a specific Bot details |
| [**getIntegrationsBotconnectorBots**](IntegrationsApi#getIntegrationsBotconnectorBots) | Get the list of bots for this integration. |
| [**getIntegrationsBotconnectorBotsSummaries**](IntegrationsApi#getIntegrationsBotconnectorBotsSummaries) | Get the summary list of bots for this integration. |
| [**getIntegrationsBotconnectorIntegrationIdBot**](IntegrationsApi#getIntegrationsBotconnectorIntegrationIdBot) | Get a specific botConnector bot, plus versions, for this integration |
| [**getIntegrationsBotconnectorIntegrationIdBotVersions**](IntegrationsApi#getIntegrationsBotconnectorIntegrationIdBotVersions) | Get a list of bot versions for a bot |
| [**getIntegrationsBotconnectorIntegrationIdBots**](IntegrationsApi#getIntegrationsBotconnectorIntegrationIdBots) | Get a list of botConnector bots for this integration |
| [**getIntegrationsBotconnectorIntegrationIdBotsSummaries**](IntegrationsApi#getIntegrationsBotconnectorIntegrationIdBotsSummaries) | Get a summary list of botConnector bots for this integration |
| [**getIntegrationsClientapps**](IntegrationsApi#getIntegrationsClientapps) | List permitted client app integrations for the logged in user |
| [**getIntegrationsClientappsUnifiedcommunications**](IntegrationsApi#getIntegrationsClientappsUnifiedcommunications) | UC integration client application configuration. |
| [**getIntegrationsCredential**](IntegrationsApi#getIntegrationsCredential) | Get a single credential with sensitive fields redacted |
| [**getIntegrationsCredentials**](IntegrationsApi#getIntegrationsCredentials) | List multiple sets of credentials |
| [**getIntegrationsCredentialsListing**](IntegrationsApi#getIntegrationsCredentialsListing) | List multiple sets of credentials using cursor-based paging |
| [**getIntegrationsCredentialsTypes**](IntegrationsApi#getIntegrationsCredentialsTypes) | List all credential types |
| [**getIntegrationsSpeechAudioconnector**](IntegrationsApi#getIntegrationsSpeechAudioconnector) | Get a list of Audio Connector integrations |
| [**getIntegrationsSpeechAudioconnectorIntegrationId**](IntegrationsApi#getIntegrationsSpeechAudioconnectorIntegrationId) | Get an Audio Connector integration |
| [**getIntegrationsSpeechDialogflowAgent**](IntegrationsApi#getIntegrationsSpeechDialogflowAgent) | Get details about a Dialogflow agent |
| [**getIntegrationsSpeechDialogflowAgents**](IntegrationsApi#getIntegrationsSpeechDialogflowAgents) | Get a list of Dialogflow agents in the customers' Google accounts |
| [**getIntegrationsSpeechDialogflowcxAgent**](IntegrationsApi#getIntegrationsSpeechDialogflowcxAgent) | Get details about a Dialogflow CX agent |
| [**getIntegrationsSpeechDialogflowcxAgents**](IntegrationsApi#getIntegrationsSpeechDialogflowcxAgents) | Get a list of Dialogflow CX agents in the customers' Google accounts |
| [**getIntegrationsSpeechLexBotAlias**](IntegrationsApi#getIntegrationsSpeechLexBotAlias) | Get details about a Lex bot alias |
| [**getIntegrationsSpeechLexBotBotIdAliases**](IntegrationsApi#getIntegrationsSpeechLexBotBotIdAliases) | Get a list of aliases for a bot in the customer's AWS accounts |
| [**getIntegrationsSpeechLexBots**](IntegrationsApi#getIntegrationsSpeechLexBots) | Get a list of Lex bots in the customers' AWS accounts |
| [**getIntegrationsSpeechLexv2BotAlias**](IntegrationsApi#getIntegrationsSpeechLexv2BotAlias) | Get details about a Lex V2 bot alias |
| [**getIntegrationsSpeechLexv2BotBotIdAliases**](IntegrationsApi#getIntegrationsSpeechLexv2BotBotIdAliases) | Get a list of aliases for a Lex V2 bot |
| [**getIntegrationsSpeechLexv2Bots**](IntegrationsApi#getIntegrationsSpeechLexv2Bots) | Get a list of Lex V2 bots |
| [**getIntegrationsSpeechNuanceNuanceIntegrationIdBot**](IntegrationsApi#getIntegrationsSpeechNuanceNuanceIntegrationIdBot) | Get a Nuance bot in the specified Integration |
| [**getIntegrationsSpeechNuanceNuanceIntegrationIdBotJob**](IntegrationsApi#getIntegrationsSpeechNuanceNuanceIntegrationIdBotJob) | Get the status of an asynchronous Nuance bot GET job |
| [**getIntegrationsSpeechNuanceNuanceIntegrationIdBotJobResults**](IntegrationsApi#getIntegrationsSpeechNuanceNuanceIntegrationIdBotJobResults) | Get the result of an asynchronous Nuance bot GET job |
| [**getIntegrationsSpeechNuanceNuanceIntegrationIdBots**](IntegrationsApi#getIntegrationsSpeechNuanceNuanceIntegrationIdBots) | Get a list of Nuance bots available in the specified Integration |
| [**getIntegrationsSpeechNuanceNuanceIntegrationIdBotsJob**](IntegrationsApi#getIntegrationsSpeechNuanceNuanceIntegrationIdBotsJob) | Get the status of an asynchronous Nuance bots GET job |
| [**getIntegrationsSpeechNuanceNuanceIntegrationIdBotsJobResults**](IntegrationsApi#getIntegrationsSpeechNuanceNuanceIntegrationIdBotsJobResults) | Get the result of an asynchronous Nuance bots GET job |
| [**getIntegrationsSpeechSttEngine**](IntegrationsApi#getIntegrationsSpeechSttEngine) | Get details about a STT engine |
| [**getIntegrationsSpeechSttEngines**](IntegrationsApi#getIntegrationsSpeechSttEngines) | Get a list of STT engines enabled for org |
| [**getIntegrationsSpeechTtsEngine**](IntegrationsApi#getIntegrationsSpeechTtsEngine) | Get details about a TTS engine |
| [**getIntegrationsSpeechTtsEngineVoice**](IntegrationsApi#getIntegrationsSpeechTtsEngineVoice) | Get details about a specific voice for a TTS engine |
| [**getIntegrationsSpeechTtsEngineVoices**](IntegrationsApi#getIntegrationsSpeechTtsEngineVoices) | Get a list of voices for a TTS engine |
| [**getIntegrationsSpeechTtsEngines**](IntegrationsApi#getIntegrationsSpeechTtsEngines) | Get a list of TTS engines enabled for org |
| [**getIntegrationsSpeechTtsSettings**](IntegrationsApi#getIntegrationsSpeechTtsSettings) | Get TTS settings for an org |
| [**getIntegrationsType**](IntegrationsApi#getIntegrationsType) | Get integration type. |
| [**getIntegrationsTypeConfigschema**](IntegrationsApi#getIntegrationsTypeConfigschema) | Get properties config schema for an integration type. |
| [**getIntegrationsTypes**](IntegrationsApi#getIntegrationsTypes) | List integration types |
| [**getIntegrationsUnifiedcommunicationsClientapp**](IntegrationsApi#getIntegrationsUnifiedcommunicationsClientapp) | UC integration client application configuration. |
| [**getIntegrationsUnifiedcommunicationsClientapps**](IntegrationsApi#getIntegrationsUnifiedcommunicationsClientapps) | List UC integration client application configurations. |
| [**getIntegrationsUserapps**](IntegrationsApi#getIntegrationsUserapps) | List permitted user app integrations for the logged in user |
| [**patchIntegration**](IntegrationsApi#patchIntegration) | Update an integration. |
| [**patchIntegrationsAction**](IntegrationsApi#patchIntegrationsAction) | Patch an Action |
| [**patchIntegrationsActionDraft**](IntegrationsApi#patchIntegrationsActionDraft) | Update an existing Draft |
| [**postIntegrations**](IntegrationsApi#postIntegrations) | Create an integration. |
| [**postIntegrationsActionDraft**](IntegrationsApi#postIntegrationsActionDraft) | Create a new Draft from existing Action |
| [**postIntegrationsActionDraftFunctionUpload**](IntegrationsApi#postIntegrationsActionDraftFunctionUpload) | Create upload presigned URL for draft function package file. |
| [**postIntegrationsActionDraftPublish**](IntegrationsApi#postIntegrationsActionDraftPublish) | Publish a Draft and make it the active Action configuration |
| [**postIntegrationsActionDraftTest**](IntegrationsApi#postIntegrationsActionDraftTest) | Test the execution of a draft. Responses will show execution steps broken out with intermediate results to help in debugging. |
| [**postIntegrationsActionExecute**](IntegrationsApi#postIntegrationsActionExecute) | Execute Action and return response from 3rd party.  Responses will follow the schemas defined on the Action for success and error. |
| [**postIntegrationsActionTest**](IntegrationsApi#postIntegrationsActionTest) | Test the execution of an action. Responses will show execution steps broken out with intermediate results to help in debugging. |
| [**postIntegrationsActions**](IntegrationsApi#postIntegrationsActions) | Create a new Action. Not supported for 'Function Integration' actions. Function integrations must be created as drafts to allow managing of uploading required ZIP function package before they may be used as a published action. |
| [**postIntegrationsActionsDrafts**](IntegrationsApi#postIntegrationsActionsDrafts) | Create a new Draft |
| [**postIntegrationsBotconnectorsIncomingMessages**](IntegrationsApi#postIntegrationsBotconnectorsIncomingMessages) | Send an incoming message to the bot. |
| [**postIntegrationsBotconnectorsOutgoingMessages**](IntegrationsApi#postIntegrationsBotconnectorsOutgoingMessages) | Send an outgoing message to the end user. |
| [**postIntegrationsCredentials**](IntegrationsApi#postIntegrationsCredentials) | Create a set of credentials |
| [**postIntegrationsSpeechNuanceNuanceIntegrationIdBotJobs**](IntegrationsApi#postIntegrationsSpeechNuanceNuanceIntegrationIdBotJobs) | Get a Nuance bot in the specified Integration asynchronously |
| [**postIntegrationsSpeechNuanceNuanceIntegrationIdBotsJobs**](IntegrationsApi#postIntegrationsSpeechNuanceNuanceIntegrationIdBotsJobs) | Get a list of Nuance bots in the specified Integration asynchronously |
| [**postIntegrationsSpeechNuanceNuanceIntegrationIdBotsLaunchValidate**](IntegrationsApi#postIntegrationsSpeechNuanceNuanceIntegrationIdBotsLaunchValidate) | Try out a single credential for a Nuance bot to know if the secret is correct |
| [**postIntegrationsWebhookEvents**](IntegrationsApi#postIntegrationsWebhookEvents) | Invoke Webhook |
| [**putIntegrationConfigCurrent**](IntegrationsApi#putIntegrationConfigCurrent) | Update integration configuration. |
| [**putIntegrationsActionDraftFunction**](IntegrationsApi#putIntegrationsActionDraftFunction) | Update draft function settings. |
| [**putIntegrationsBotconnectorIntegrationIdBots**](IntegrationsApi#putIntegrationsBotconnectorIntegrationIdBots) | Set a list of botConnector bots plus versions for this integration |
| [**putIntegrationsCredential**](IntegrationsApi#putIntegrationsCredential) | Update a set of credentials |
| [**putIntegrationsSpeechNuanceNuanceIntegrationIdBotsLaunchSettings**](IntegrationsApi#putIntegrationsSpeechNuanceNuanceIntegrationIdBotsLaunchSettings) | Update the Nuance bot list for the specific bots made available to Genesys Cloud in the specified Integration |
| [**putIntegrationsSpeechTtsSettings**](IntegrationsApi#putIntegrationsSpeechTtsSettings) | Update TTS settings for an org |
| [**putIntegrationsUnifiedcommunicationThirdpartypresences**](IntegrationsApi#putIntegrationsUnifiedcommunicationThirdpartypresences) | Bulk integration presence ingestion |
{: class="table-striped"}


# **deleteIntegration**


> [Integration](Integration) deleteIntegration(integrationId)

Delete integration.

Wraps DELETE /api/v2/integrations/{integrationId}  

Requires ANY permissions: 

* integrations:integration:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
String integrationId = "integrationId_example"; // String | Integration Id
try {
    Integration result = apiInstance.deleteIntegration(integrationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#deleteIntegration");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **integrationId** | **String**| Integration Id | 
{: class="table-striped"}


### Return type

[**Integration**](Integration)


# **deleteIntegrationsAction**


> Void deleteIntegrationsAction(actionId)

Delete an Action

Wraps DELETE /api/v2/integrations/actions/{actionId}  

Requires ANY permissions: 

* integrations:action:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
String actionId = "actionId_example"; // String | actionId
try {
    apiInstance.deleteIntegrationsAction(actionId);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#deleteIntegrationsAction");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **actionId** | **String**| actionId | 
{: class="table-striped"}


### Return type

null (empty response body)


# **deleteIntegrationsActionDraft**


> Void deleteIntegrationsActionDraft(actionId)

Delete a Draft

Wraps DELETE /api/v2/integrations/actions/{actionId}/draft  

Requires ANY permissions: 

* integrations:action:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
String actionId = "actionId_example"; // String | actionId
try {
    apiInstance.deleteIntegrationsActionDraft(actionId);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#deleteIntegrationsActionDraft");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **actionId** | **String**| actionId | 
{: class="table-striped"}


### Return type

null (empty response body)


# **deleteIntegrationsCredential**


> Void deleteIntegrationsCredential(credentialId)

Delete a set of credentials

Wraps DELETE /api/v2/integrations/credentials/{credentialId}  

Requires ANY permissions: 

* integrations:integration:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
String credentialId = "credentialId_example"; // String | Credential ID
try {
    apiInstance.deleteIntegrationsCredential(credentialId);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#deleteIntegrationsCredential");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **credentialId** | **String**| Credential ID | 
{: class="table-striped"}


### Return type

null (empty response body)


# **getIntegration**


> [Integration](Integration) getIntegration(integrationId, pageSize, pageNumber, sortBy, expand, nextPage, previousPage)

Get integration.

Wraps GET /api/v2/integrations/{integrationId}  

Requires ANY permissions: 

* integrations:integration:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
String integrationId = "integrationId_example"; // String | Integration Id
Integer pageSize = 25; // Integer | The total page size requested
Integer pageNumber = 1; // Integer | The page number requested
String sortBy = "sortBy_example"; // String | variable name requested to sort by
List<String> expand = Arrays.asList(null); // List<String> | variable name requested by expand list
String nextPage = "nextPage_example"; // String | next page token
String previousPage = "previousPage_example"; // String | Previous page token
try {
    Integration result = apiInstance.getIntegration(integrationId, pageSize, pageNumber, sortBy, expand, nextPage, previousPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegration");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **integrationId** | **String**| Integration Id | 
| **pageSize** | **Integer**| The total page size requested | [optional] [default to 25] 
| **pageNumber** | **Integer**| The page number requested | [optional] [default to 1] 
| **sortBy** | **String**| variable name requested to sort by | [optional] 
| **expand** | [**List&lt;String&gt;**](String)| variable name requested by expand list | [optional] 
| **nextPage** | **String**| next page token | [optional] 
| **previousPage** | **String**| Previous page token | [optional] 
{: class="table-striped"}


### Return type

[**Integration**](Integration)


# **getIntegrationConfigCurrent**


> [IntegrationConfiguration](IntegrationConfiguration) getIntegrationConfigCurrent(integrationId)

Get integration configuration.

Wraps GET /api/v2/integrations/{integrationId}/config/current  

Requires ANY permissions: 

* integrations:integration:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
String integrationId = "integrationId_example"; // String | Integration Id
try {
    IntegrationConfiguration result = apiInstance.getIntegrationConfigCurrent(integrationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationConfigCurrent");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **integrationId** | **String**| Integration Id | 
{: class="table-striped"}


### Return type

[**IntegrationConfiguration**](IntegrationConfiguration)


# **getIntegrations**


> [IntegrationEntityListing](IntegrationEntityListing) getIntegrations(pageSize, pageNumber, sortBy, expand, nextPage, previousPage)

List integrations

Wraps GET /api/v2/integrations  

Requires ANY permissions: 

* integrations:integration:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
Integer pageSize = 25; // Integer | The total page size requested
Integer pageNumber = 1; // Integer | The page number requested
String sortBy = "sortBy_example"; // String | variable name requested to sort by
List<String> expand = Arrays.asList(null); // List<String> | variable name requested by expand list
String nextPage = "nextPage_example"; // String | next page token
String previousPage = "previousPage_example"; // String | Previous page token
try {
    IntegrationEntityListing result = apiInstance.getIntegrations(pageSize, pageNumber, sortBy, expand, nextPage, previousPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrations");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| The total page size requested | [optional] [default to 25] 
| **pageNumber** | **Integer**| The page number requested | [optional] [default to 1] 
| **sortBy** | **String**| variable name requested to sort by | [optional] 
| **expand** | [**List&lt;String&gt;**](String)| variable name requested by expand list | [optional] 
| **nextPage** | **String**| next page token | [optional] 
| **previousPage** | **String**| Previous page token | [optional] 
{: class="table-striped"}


### Return type

[**IntegrationEntityListing**](IntegrationEntityListing)


# **getIntegrationsAction**


> [Action](Action) getIntegrationsAction(actionId, expand, flatten, includeConfig)

Retrieves a single Action matching id.

Wraps GET /api/v2/integrations/actions/{actionId}  

Requires ANY permissions: 

* integrations:action:view
* bridge:actions:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
String actionId = "actionId_example"; // String | actionId
String expand = "expand_example"; // String | Indicates a field in the response which should be expanded.
Boolean flatten = false; // Boolean | Indicates the response should be reformatted, based on Architect's flattening format.
Boolean includeConfig = false; // Boolean | Return config in response.
try {
    Action result = apiInstance.getIntegrationsAction(actionId, expand, flatten, includeConfig);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsAction");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **actionId** | **String**| actionId | 
| **expand** | **String**| Indicates a field in the response which should be expanded. | [optional]<br />**Values**: contract 
| **flatten** | **Boolean**| Indicates the response should be reformatted, based on Architect&#39;s flattening format. | [optional] [default to false]<br />**Values**: true, false 
| **includeConfig** | **Boolean**| Return config in response. | [optional] [default to false]<br />**Values**: true, false 
{: class="table-striped"}


### Return type

[**Action**](Action)


# **getIntegrationsActionDraft**


> [Action](Action) getIntegrationsActionDraft(actionId, expand, flatten, includeConfig)

Retrieve a Draft

Wraps GET /api/v2/integrations/actions/{actionId}/draft  

Requires ANY permissions: 

* integrations:action:view
* bridge:actions:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
String actionId = "actionId_example"; // String | actionId
String expand = "expand_example"; // String | Indicates a field in the response which should be expanded.
Boolean flatten = false; // Boolean | Indicates the response should be reformatted, based on Architect's flattening format.
Boolean includeConfig = false; // Boolean | Return config in response.
try {
    Action result = apiInstance.getIntegrationsActionDraft(actionId, expand, flatten, includeConfig);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsActionDraft");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **actionId** | **String**| actionId | 
| **expand** | **String**| Indicates a field in the response which should be expanded. | [optional]<br />**Values**: contract 
| **flatten** | **Boolean**| Indicates the response should be reformatted, based on Architect&#39;s flattening format. | [optional] [default to false]<br />**Values**: true, false 
| **includeConfig** | **Boolean**| Return config in response. | [optional] [default to false]<br />**Values**: true, false 
{: class="table-striped"}


### Return type

[**Action**](Action)


# **getIntegrationsActionDraftFunction**


> [FunctionConfig](FunctionConfig) getIntegrationsActionDraftFunction(actionId)

Get draft function settings for Action

Wraps GET /api/v2/integrations/actions/{actionId}/draft/function  

Requires ANY permissions: 

* integrations:actionFunction:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
String actionId = "actionId_example"; // String | actionId
try {
    FunctionConfig result = apiInstance.getIntegrationsActionDraftFunction(actionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsActionDraftFunction");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **actionId** | **String**| actionId | 
{: class="table-striped"}


### Return type

[**FunctionConfig**](FunctionConfig)


# **getIntegrationsActionDraftSchema**


> [JsonSchemaDocument](JsonSchemaDocument) getIntegrationsActionDraftSchema(actionId, fileName, flatten)

Retrieve schema for a Draft based on filename.

Wraps GET /api/v2/integrations/actions/{actionId}/draft/schemas/{fileName}  

Requires ANY permissions: 

* integrations:action:view
* bridge:actions:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
String actionId = "actionId_example"; // String | actionId
String fileName = "fileName_example"; // String | Name of schema file to be retrieved for this draft.
Boolean flatten = false; // Boolean | Indicates the response should be reformatted, based on Architect's flattening format.
try {
    JsonSchemaDocument result = apiInstance.getIntegrationsActionDraftSchema(actionId, fileName, flatten);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsActionDraftSchema");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **actionId** | **String**| actionId | 
| **fileName** | **String**| Name of schema file to be retrieved for this draft. | 
| **flatten** | **Boolean**| Indicates the response should be reformatted, based on Architect&#39;s flattening format. | [optional] [default to false] 
{: class="table-striped"}


### Return type

[**JsonSchemaDocument**](JsonSchemaDocument)


# **getIntegrationsActionDraftTemplate**


> String getIntegrationsActionDraftTemplate(actionId, fileName)

Retrieve templates for a Draft based on filename.

Wraps GET /api/v2/integrations/actions/{actionId}/draft/templates/{fileName}  

Requires ANY permissions: 

* integrations:action:view
* bridge:actions:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
String actionId = "actionId_example"; // String | actionId
String fileName = "fileName_example"; // String | Name of template file to be retrieved for this action draft.
try {
    String result = apiInstance.getIntegrationsActionDraftTemplate(actionId, fileName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsActionDraftTemplate");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **actionId** | **String**| actionId | 
| **fileName** | **String**| Name of template file to be retrieved for this action draft. | 
{: class="table-striped"}


### Return type

**String**


# **getIntegrationsActionDraftValidation**


> [DraftValidationResult](DraftValidationResult) getIntegrationsActionDraftValidation(actionId)

Validate current Draft configuration.

Wraps GET /api/v2/integrations/actions/{actionId}/draft/validation  

Requires ANY permissions: 

* integrations:action:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
String actionId = "actionId_example"; // String | actionId
try {
    DraftValidationResult result = apiInstance.getIntegrationsActionDraftValidation(actionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsActionDraftValidation");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **actionId** | **String**| actionId | 
{: class="table-striped"}


### Return type

[**DraftValidationResult**](DraftValidationResult)


# **getIntegrationsActionFunction**


> [FunctionConfig](FunctionConfig) getIntegrationsActionFunction(actionId)

Get published function settings for Action

Wraps GET /api/v2/integrations/actions/{actionId}/function  

Requires ANY permissions: 

* integrations:actionFunction:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
String actionId = "actionId_example"; // String | actionId
try {
    FunctionConfig result = apiInstance.getIntegrationsActionFunction(actionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsActionFunction");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **actionId** | **String**| actionId | 
{: class="table-striped"}


### Return type

[**FunctionConfig**](FunctionConfig)


# **getIntegrationsActionSchema**


> [JsonSchemaDocument](JsonSchemaDocument) getIntegrationsActionSchema(actionId, fileName, flatten)

Retrieve schema for an action based on filename.

Wraps GET /api/v2/integrations/actions/{actionId}/schemas/{fileName}  

Requires ANY permissions: 

* integrations:action:view
* bridge:actions:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
String actionId = "actionId_example"; // String | actionId
String fileName = "fileName_example"; // String | Name of schema file to be retrieved for this action.
Boolean flatten = false; // Boolean | Indicates the response should be reformatted, based on Architect's flattening format.
try {
    JsonSchemaDocument result = apiInstance.getIntegrationsActionSchema(actionId, fileName, flatten);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsActionSchema");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **actionId** | **String**| actionId | 
| **fileName** | **String**| Name of schema file to be retrieved for this action. | 
| **flatten** | **Boolean**| Indicates the response should be reformatted, based on Architect&#39;s flattening format. | [optional] [default to false] 
{: class="table-striped"}


### Return type

[**JsonSchemaDocument**](JsonSchemaDocument)


# **getIntegrationsActionTemplate**


> String getIntegrationsActionTemplate(actionId, fileName)

Retrieve text of templates for an action based on filename.

Wraps GET /api/v2/integrations/actions/{actionId}/templates/{fileName}  

Requires ANY permissions: 

* integrations:action:view
* bridge:actions:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
String actionId = "actionId_example"; // String | actionId
String fileName = "fileName_example"; // String | Name of template file to be retrieved for this action.
try {
    String result = apiInstance.getIntegrationsActionTemplate(actionId, fileName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsActionTemplate");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **actionId** | **String**| actionId | 
| **fileName** | **String**| Name of template file to be retrieved for this action. | 
{: class="table-striped"}


### Return type

**String**


# **getIntegrationsActions**


> [ActionEntityListing](ActionEntityListing) getIntegrationsActions(pageSize, pageNumber, nextPage, previousPage, sortBy, sortOrder, category, name, ids, secure, includeAuthActions)

Retrieves all actions associated with filters passed in via query param.

Wraps GET /api/v2/integrations/actions  

Requires ANY permissions: 

* integrations:action:view
* bridge:actions:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
Integer pageSize = 25; // Integer | The total page size requested
Integer pageNumber = 1; // Integer | The page number requested
String nextPage = "nextPage_example"; // String | next page token
String previousPage = "previousPage_example"; // String | Previous page token
String sortBy = "sortBy_example"; // String | Root level field name to sort on.
String sortOrder = "asc"; // String | Direction to sort 'sortBy' field.
String category = "category_example"; // String | Filter by category name.
String name = "name_example"; // String | Filter by partial or complete action name.
String ids = "ids_example"; // String | Filter by action Id. Can be a comma separated list to request multiple actions.  Limit of 50 Ids.
String secure = "secure_example"; // String | Filter based on 'secure' configuration option. True will only return actions marked as secure. False will return only non-secure actions. Do not use filter if you want all Actions.
String includeAuthActions = "false"; // String | Whether or not to include authentication actions in the response. These actions are not directly executable. Some integrations create them and will run them as needed to refresh authentication information for other actions.
try {
    ActionEntityListing result = apiInstance.getIntegrationsActions(pageSize, pageNumber, nextPage, previousPage, sortBy, sortOrder, category, name, ids, secure, includeAuthActions);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsActions");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| The total page size requested | [optional] [default to 25] 
| **pageNumber** | **Integer**| The page number requested | [optional] [default to 1] 
| **nextPage** | **String**| next page token | [optional] 
| **previousPage** | **String**| Previous page token | [optional] 
| **sortBy** | **String**| Root level field name to sort on. | [optional] 
| **sortOrder** | **String**| Direction to sort &#39;sortBy&#39; field. | [optional] [default to asc]<br />**Values**: ASC, DESC 
| **category** | **String**| Filter by category name. | [optional] 
| **name** | **String**| Filter by partial or complete action name. | [optional] 
| **ids** | **String**| Filter by action Id. Can be a comma separated list to request multiple actions.  Limit of 50 Ids. | [optional] 
| **secure** | **String**| Filter based on &#39;secure&#39; configuration option. True will only return actions marked as secure. False will return only non-secure actions. Do not use filter if you want all Actions. | [optional]<br />**Values**: true, false 
| **includeAuthActions** | **String**| Whether or not to include authentication actions in the response. These actions are not directly executable. Some integrations create them and will run them as needed to refresh authentication information for other actions. | [optional] [default to false]<br />**Values**: true, false 
{: class="table-striped"}


### Return type

[**ActionEntityListing**](ActionEntityListing)


# **getIntegrationsActionsCategories**


> [CategoryEntityListing](CategoryEntityListing) getIntegrationsActionsCategories(pageSize, pageNumber, nextPage, previousPage, sortBy, sortOrder, secure)

Retrieves all categories of available Actions

Wraps GET /api/v2/integrations/actions/categories  

Requires ANY permissions: 

* integrations:action:view
* bridge:actions:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
Integer pageSize = 25; // Integer | The total page size requested
Integer pageNumber = 1; // Integer | The page number requested
String nextPage = "nextPage_example"; // String | next page token
String previousPage = "previousPage_example"; // String | Previous page token
String sortBy = "sortBy_example"; // String | Root level field name to sort on.  Only 'name' is supported on this endpoint.
String sortOrder = "asc"; // String | Direction to sort 'sortBy' field.
String secure = "secure_example"; // String | Filter to only include secure actions. True will only include actions marked secured. False will include only unsecure actions. Do not use filter if you want all Actions.
try {
    CategoryEntityListing result = apiInstance.getIntegrationsActionsCategories(pageSize, pageNumber, nextPage, previousPage, sortBy, sortOrder, secure);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsActionsCategories");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| The total page size requested | [optional] [default to 25] 
| **pageNumber** | **Integer**| The page number requested | [optional] [default to 1] 
| **nextPage** | **String**| next page token | [optional] 
| **previousPage** | **String**| Previous page token | [optional] 
| **sortBy** | **String**| Root level field name to sort on.  Only &#39;name&#39; is supported on this endpoint. | [optional] 
| **sortOrder** | **String**| Direction to sort &#39;sortBy&#39; field. | [optional] [default to asc]<br />**Values**: ASC, DESC 
| **secure** | **String**| Filter to only include secure actions. True will only include actions marked secured. False will include only unsecure actions. Do not use filter if you want all Actions. | [optional]<br />**Values**: true, false 
{: class="table-striped"}


### Return type

[**CategoryEntityListing**](CategoryEntityListing)


# **getIntegrationsActionsCertificates**


> [ActionCertificateListing](ActionCertificateListing) getIntegrationsActionsCertificates(status, type)

Retrieves the available mTLS client certificates in use. This endpoint will return inconsistent results while a certificate rotation is in progress.

Wraps GET /api/v2/integrations/actions/certificates  

Requires ANY permissions: 

* integrations:actionCertificate:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
String status = "status_example"; // String | Indicates the validity of the certificate in question.
String type = "type_example"; // String | Indicates the type of the certificate.
try {
    ActionCertificateListing result = apiInstance.getIntegrationsActionsCertificates(status, type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsActionsCertificates");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **status** | **String**| Indicates the validity of the certificate in question. | [optional]<br />**Values**: Current, Upcoming 
| **type** | **String**| Indicates the type of the certificate. | [optional]<br />**Values**: Client 
{: class="table-striped"}


### Return type

[**ActionCertificateListing**](ActionCertificateListing)


# **getIntegrationsActionsCertificatesTruststore**


> [TrustedCertificates](TrustedCertificates) getIntegrationsActionsCertificatesTruststore()

Retrieves basic info about trusted root CA certificates

Wraps GET /api/v2/integrations/actions/certificates/truststore  

Requires ANY permissions: 

* integrations:actionCertificate:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
try {
    TrustedCertificates result = apiInstance.getIntegrationsActionsCertificatesTruststore();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsActionsCertificatesTruststore");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**TrustedCertificates**](TrustedCertificates)


# **getIntegrationsActionsDrafts**


> [ActionEntityListing](ActionEntityListing) getIntegrationsActionsDrafts(pageSize, pageNumber, nextPage, previousPage, sortBy, sortOrder, category, name, ids, secure, includeAuthActions)

Retrieves all action drafts associated with the filters passed in via query param.

Wraps GET /api/v2/integrations/actions/drafts  

Requires ANY permissions: 

* integrations:action:view
* bridge:actions:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
Integer pageSize = 25; // Integer | The total page size requested
Integer pageNumber = 1; // Integer | The page number requested
String nextPage = "nextPage_example"; // String | next page token
String previousPage = "previousPage_example"; // String | Previous page token
String sortBy = "sortBy_example"; // String | Root level field name to sort on.
String sortOrder = "asc"; // String | Direction to sort 'sortBy' field.
String category = "category_example"; // String | Filter by category name.
String name = "name_example"; // String | Filter by partial or complete action name.
String ids = "ids_example"; // String | Filter by action Id. Can be a comma separated list to request multiple actions.  Limit of 50 Ids.
String secure = "secure_example"; // String | Filter based on 'secure' configuration option. True will only return actions marked as secure. False will return only non-secure actions. Do not use filter if you want all Actions.
String includeAuthActions = "false"; // String | Whether or not to include authentication actions in the response. These actions are not directly executable. Some integrations create them and will run them as needed to refresh authentication information for other actions.
try {
    ActionEntityListing result = apiInstance.getIntegrationsActionsDrafts(pageSize, pageNumber, nextPage, previousPage, sortBy, sortOrder, category, name, ids, secure, includeAuthActions);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsActionsDrafts");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| The total page size requested | [optional] [default to 25] 
| **pageNumber** | **Integer**| The page number requested | [optional] [default to 1] 
| **nextPage** | **String**| next page token | [optional] 
| **previousPage** | **String**| Previous page token | [optional] 
| **sortBy** | **String**| Root level field name to sort on. | [optional] 
| **sortOrder** | **String**| Direction to sort &#39;sortBy&#39; field. | [optional] [default to asc]<br />**Values**: ASC, DESC 
| **category** | **String**| Filter by category name. | [optional] 
| **name** | **String**| Filter by partial or complete action name. | [optional] 
| **ids** | **String**| Filter by action Id. Can be a comma separated list to request multiple actions.  Limit of 50 Ids. | [optional] 
| **secure** | **String**| Filter based on &#39;secure&#39; configuration option. True will only return actions marked as secure. False will return only non-secure actions. Do not use filter if you want all Actions. | [optional]<br />**Values**: true, false 
| **includeAuthActions** | **String**| Whether or not to include authentication actions in the response. These actions are not directly executable. Some integrations create them and will run them as needed to refresh authentication information for other actions. | [optional] [default to false]<br />**Values**: true, false 
{: class="table-striped"}


### Return type

[**ActionEntityListing**](ActionEntityListing)


# **getIntegrationsActionsFunctionsRuntimes**


> [List&lt;FunctionRuntime&gt;](FunctionRuntime) getIntegrationsActionsFunctionsRuntimes()

Get action function settings for Action

Wraps GET /api/v2/integrations/actions/functions/runtimes  

Requires ANY permissions: 

* integrations:actionFunction:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
try {
    List<FunctionRuntime> result = apiInstance.getIntegrationsActionsFunctionsRuntimes();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsActionsFunctionsRuntimes");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**List&lt;FunctionRuntime&gt;**](FunctionRuntime)


# **getIntegrationsBotconnectorBot**


> [Bot](Bot) getIntegrationsBotconnectorBot(integrationId, botId, version)

Get a specific Bot details

getIntegrationsBotconnectorBot is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/integrations/botconnectors/{integrationId}/bots/{botId}  

Requires ANY permissions: 

* integration:botconnector:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
String integrationId = "integrationId_example"; // String | The integration ID for this group of bots
String botId = "botId_example"; // String | The bot ID for this bot
String version = "version_example"; // String | Specific Version
try {
    Bot result = apiInstance.getIntegrationsBotconnectorBot(integrationId, botId, version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsBotconnectorBot");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **integrationId** | **String**| The integration ID for this group of bots | 
| **botId** | **String**| The bot ID for this bot | 
| **version** | **String**| Specific Version | [optional] 
{: class="table-striped"}


### Return type

[**Bot**](Bot)


# **getIntegrationsBotconnectorBots**


> [BotListing](BotListing) getIntegrationsBotconnectorBots(integrationId, pageNumber, pageSize)

Get the list of bots for this integration.

getIntegrationsBotconnectorBots is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/integrations/botconnectors/{integrationId}/bots  

Requires ANY permissions: 

* integration:botconnector:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
String integrationId = "integrationId_example"; // String | The integration ID for this group of bots.
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
try {
    BotListing result = apiInstance.getIntegrationsBotconnectorBots(integrationId, pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsBotconnectorBots");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **integrationId** | **String**| The integration ID for this group of bots. | 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
{: class="table-striped"}


### Return type

[**BotListing**](BotListing)


# **getIntegrationsBotconnectorBotsSummaries**


> [BotSummaryEntityListing](BotSummaryEntityListing) getIntegrationsBotconnectorBotsSummaries(integrationId, pageNumber, pageSize)

Get the summary list of bots for this integration.

getIntegrationsBotconnectorBotsSummaries is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/integrations/botconnectors/{integrationId}/bots/summaries  

Requires ANY permissions: 

* integration:botconnector:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
String integrationId = "integrationId_example"; // String | The integration ID for this group of bots.
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
try {
    BotSummaryEntityListing result = apiInstance.getIntegrationsBotconnectorBotsSummaries(integrationId, pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsBotconnectorBotsSummaries");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **integrationId** | **String**| The integration ID for this group of bots. | 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
{: class="table-striped"}


### Return type

[**BotSummaryEntityListing**](BotSummaryEntityListing)


# **getIntegrationsBotconnectorIntegrationIdBot**


> [BotConnectorBot](BotConnectorBot) getIntegrationsBotconnectorIntegrationIdBot(integrationId, botId, version)

Get a specific botConnector bot, plus versions, for this integration

Wraps GET /api/v2/integrations/botconnector/{integrationId}/bots/{botId}  

Requires ANY permissions: 

* integration:botconnector:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
String integrationId = "integrationId_example"; // String | The integration ID for this group of bots
String botId = "botId_example"; // String | The botID for this bot
String version = "version_example"; // String | Specific Version
try {
    BotConnectorBot result = apiInstance.getIntegrationsBotconnectorIntegrationIdBot(integrationId, botId, version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsBotconnectorIntegrationIdBot");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **integrationId** | **String**| The integration ID for this group of bots | 
| **botId** | **String**| The botID for this bot | 
| **version** | **String**| Specific Version | [optional] 
{: class="table-striped"}


### Return type

[**BotConnectorBot**](BotConnectorBot)


# **getIntegrationsBotconnectorIntegrationIdBotVersions**


> [BotConnectorBotVersionSummaryEntityListing](BotConnectorBotVersionSummaryEntityListing) getIntegrationsBotconnectorIntegrationIdBotVersions(integrationId, botId, pageNumber, pageSize)

Get a list of bot versions for a bot

Wraps GET /api/v2/integrations/botconnector/{integrationId}/bots/{botId}/versions  

Requires ANY permissions: 

* integration:botconnector:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
String integrationId = "integrationId_example"; // String | The integration ID for this bot group
String botId = "botId_example"; // String | The botID for this bot
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
try {
    BotConnectorBotVersionSummaryEntityListing result = apiInstance.getIntegrationsBotconnectorIntegrationIdBotVersions(integrationId, botId, pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsBotconnectorIntegrationIdBotVersions");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **integrationId** | **String**| The integration ID for this bot group | 
| **botId** | **String**| The botID for this bot | 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
{: class="table-striped"}


### Return type

[**BotConnectorBotVersionSummaryEntityListing**](BotConnectorBotVersionSummaryEntityListing)


# **getIntegrationsBotconnectorIntegrationIdBots**


> [BotList](BotList) getIntegrationsBotconnectorIntegrationIdBots(integrationId)

Get a list of botConnector bots for this integration

Wraps GET /api/v2/integrations/botconnector/{integrationId}/bots  

Requires ANY permissions: 

* integration:botconnector:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
String integrationId = "integrationId_example"; // String | The integration ID for this group of bots
try {
    BotList result = apiInstance.getIntegrationsBotconnectorIntegrationIdBots(integrationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsBotconnectorIntegrationIdBots");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **integrationId** | **String**| The integration ID for this group of bots | 
{: class="table-striped"}


### Return type

[**BotList**](BotList)


# **getIntegrationsBotconnectorIntegrationIdBotsSummaries**


> [BotConnectorBotSummaryEntityListing](BotConnectorBotSummaryEntityListing) getIntegrationsBotconnectorIntegrationIdBotsSummaries(integrationId, pageNumber, pageSize)

Get a summary list of botConnector bots for this integration

Wraps GET /api/v2/integrations/botconnector/{integrationId}/bots/summaries  

Requires ANY permissions: 

* integration:botconnector:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
String integrationId = "integrationId_example"; // String | The integration ID for this group of bots
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
try {
    BotConnectorBotSummaryEntityListing result = apiInstance.getIntegrationsBotconnectorIntegrationIdBotsSummaries(integrationId, pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsBotconnectorIntegrationIdBotsSummaries");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **integrationId** | **String**| The integration ID for this group of bots | 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
{: class="table-striped"}


### Return type

[**BotConnectorBotSummaryEntityListing**](BotConnectorBotSummaryEntityListing)


# **getIntegrationsClientapps**


> [ClientAppEntityListing](ClientAppEntityListing) getIntegrationsClientapps(pageSize, pageNumber, sortBy, expand, nextPage, previousPage)

List permitted client app integrations for the logged in user

Wraps GET /api/v2/integrations/clientapps  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
Integer pageSize = 25; // Integer | The total page size requested
Integer pageNumber = 1; // Integer | The page number requested
String sortBy = "sortBy_example"; // String | variable name requested to sort by
List<String> expand = Arrays.asList(null); // List<String> | variable name requested by expand list
String nextPage = "nextPage_example"; // String | next page token
String previousPage = "previousPage_example"; // String | Previous page token
try {
    ClientAppEntityListing result = apiInstance.getIntegrationsClientapps(pageSize, pageNumber, sortBy, expand, nextPage, previousPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsClientapps");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| The total page size requested | [optional] [default to 25] 
| **pageNumber** | **Integer**| The page number requested | [optional] [default to 1] 
| **sortBy** | **String**| variable name requested to sort by | [optional] 
| **expand** | [**List&lt;String&gt;**](String)| variable name requested by expand list | [optional] 
| **nextPage** | **String**| next page token | [optional] 
| **previousPage** | **String**| Previous page token | [optional] 
{: class="table-striped"}


### Return type

[**ClientAppEntityListing**](ClientAppEntityListing)


# **getIntegrationsClientappsUnifiedcommunications**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> [UCIntegrationListing](UCIntegrationListing) getIntegrationsClientappsUnifiedcommunications(pageSize, pageNumber, sortBy, expand, nextPage, previousPage)

UC integration client application configuration.

Deprecated: Please use GET /integrations/unifiedcommunications/clientapps instead. This endpoint returns basic UI configuration data for all Unified Communications integrations client applications enabled for the current organization.

Wraps GET /api/v2/integrations/clientapps/unifiedcommunications  

Requires ANY permissions: 

* integration:unifiedCommunications:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
Integer pageSize = 25; // Integer | The total page size requested
Integer pageNumber = 1; // Integer | The page number requested
String sortBy = "sortBy_example"; // String | variable name requested to sort by
List<String> expand = Arrays.asList(null); // List<String> | variable name requested by expand list
String nextPage = "nextPage_example"; // String | next page token
String previousPage = "previousPage_example"; // String | Previous page token
try {
    UCIntegrationListing result = apiInstance.getIntegrationsClientappsUnifiedcommunications(pageSize, pageNumber, sortBy, expand, nextPage, previousPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsClientappsUnifiedcommunications");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| The total page size requested | [optional] [default to 25] 
| **pageNumber** | **Integer**| The page number requested | [optional] [default to 1] 
| **sortBy** | **String**| variable name requested to sort by | [optional] 
| **expand** | [**List&lt;String&gt;**](String)| variable name requested by expand list | [optional] 
| **nextPage** | **String**| next page token | [optional] 
| **previousPage** | **String**| Previous page token | [optional] 
{: class="table-striped"}


### Return type

[**UCIntegrationListing**](UCIntegrationListing)


# **getIntegrationsCredential**


> [Credential](Credential) getIntegrationsCredential(credentialId)

Get a single credential with sensitive fields redacted

Wraps GET /api/v2/integrations/credentials/{credentialId}  

Requires ANY permissions: 

* integrations:integration:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
String credentialId = "credentialId_example"; // String | Credential ID
try {
    Credential result = apiInstance.getIntegrationsCredential(credentialId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsCredential");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **credentialId** | **String**| Credential ID | 
{: class="table-striped"}


### Return type

[**Credential**](Credential)


# **getIntegrationsCredentials**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> [CredentialInfoListing](CredentialInfoListing) getIntegrationsCredentials(pageNumber, pageSize)

List multiple sets of credentials

This endpoint is deprecated. Please see the Listing API (GET /api/v2/integrations/credentials/listing)

Wraps GET /api/v2/integrations/credentials  

Requires ANY permissions: 

* integrations:integration:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
try {
    CredentialInfoListing result = apiInstance.getIntegrationsCredentials(pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsCredentials");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
{: class="table-striped"}


### Return type

[**CredentialInfoListing**](CredentialInfoListing)


# **getIntegrationsCredentialsListing**


> [CredentialInfoCursorListing](CredentialInfoCursorListing) getIntegrationsCredentialsListing(before, after, pageSize)

List multiple sets of credentials using cursor-based paging

Wraps GET /api/v2/integrations/credentials/listing  

Requires ANY permissions: 

* integrations:integration:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
String before = "before_example"; // String | The cursor that points to the start of the set of entities that has been returned.
String after = "after_example"; // String | The cursor that points to the end of the set of entities that has been returned.
String pageSize = "pageSize_example"; // String | Number of entities to return. Maximum of 200.
try {
    CredentialInfoCursorListing result = apiInstance.getIntegrationsCredentialsListing(before, after, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsCredentialsListing");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **before** | **String**| The cursor that points to the start of the set of entities that has been returned. | [optional] 
| **after** | **String**| The cursor that points to the end of the set of entities that has been returned. | [optional] 
| **pageSize** | **String**| Number of entities to return. Maximum of 200. | [optional] 
{: class="table-striped"}


### Return type

[**CredentialInfoCursorListing**](CredentialInfoCursorListing)


# **getIntegrationsCredentialsTypes**


> [CredentialTypeListing](CredentialTypeListing) getIntegrationsCredentialsTypes()

List all credential types

Wraps GET /api/v2/integrations/credentials/types  

Requires ANY permissions: 

* integrations:integration:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
try {
    CredentialTypeListing result = apiInstance.getIntegrationsCredentialsTypes();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsCredentialsTypes");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**CredentialTypeListing**](CredentialTypeListing)


# **getIntegrationsSpeechAudioconnector**


> [AudioConnectorIntegrationEntityListing](AudioConnectorIntegrationEntityListing) getIntegrationsSpeechAudioconnector(pageNumber, pageSize)

Get a list of Audio Connector integrations

Wraps GET /api/v2/integrations/speech/audioconnector  

Requires ANY permissions: 

* integrations:integration:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
try {
    AudioConnectorIntegrationEntityListing result = apiInstance.getIntegrationsSpeechAudioconnector(pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsSpeechAudioconnector");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
{: class="table-striped"}


### Return type

[**AudioConnectorIntegrationEntityListing**](AudioConnectorIntegrationEntityListing)


# **getIntegrationsSpeechAudioconnectorIntegrationId**


> [AudioConnectorIntegration](AudioConnectorIntegration) getIntegrationsSpeechAudioconnectorIntegrationId(integrationId)

Get an Audio Connector integration

Wraps GET /api/v2/integrations/speech/audioconnector/{integrationId}  

Requires ANY permissions: 

* integrations:integration:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
String integrationId = "integrationId_example"; // String | The integration ID
try {
    AudioConnectorIntegration result = apiInstance.getIntegrationsSpeechAudioconnectorIntegrationId(integrationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsSpeechAudioconnectorIntegrationId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **integrationId** | **String**| The integration ID | 
{: class="table-striped"}


### Return type

[**AudioConnectorIntegration**](AudioConnectorIntegration)


# **getIntegrationsSpeechDialogflowAgent**


> [DialogflowAgent](DialogflowAgent) getIntegrationsSpeechDialogflowAgent(agentId)

Get details about a Dialogflow agent

Wraps GET /api/v2/integrations/speech/dialogflow/agents/{agentId}  

Requires ANY permissions: 

* integrations:integration:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
String agentId = "agentId_example"; // String | The agent ID
try {
    DialogflowAgent result = apiInstance.getIntegrationsSpeechDialogflowAgent(agentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsSpeechDialogflowAgent");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **agentId** | **String**| The agent ID | 
{: class="table-striped"}


### Return type

[**DialogflowAgent**](DialogflowAgent)


# **getIntegrationsSpeechDialogflowAgents**


> [DialogflowAgentSummaryEntityListing](DialogflowAgentSummaryEntityListing) getIntegrationsSpeechDialogflowAgents(pageNumber, pageSize, name)

Get a list of Dialogflow agents in the customers' Google accounts

Wraps GET /api/v2/integrations/speech/dialogflow/agents  

Requires ANY permissions: 

* integrations:integration:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
String name = "name_example"; // String | Filter on agent name
try {
    DialogflowAgentSummaryEntityListing result = apiInstance.getIntegrationsSpeechDialogflowAgents(pageNumber, pageSize, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsSpeechDialogflowAgents");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **name** | **String**| Filter on agent name | [optional] 
{: class="table-striped"}


### Return type

[**DialogflowAgentSummaryEntityListing**](DialogflowAgentSummaryEntityListing)


# **getIntegrationsSpeechDialogflowcxAgent**


> [DialogflowCXAgent](DialogflowCXAgent) getIntegrationsSpeechDialogflowcxAgent(agentId)

Get details about a Dialogflow CX agent

Wraps GET /api/v2/integrations/speech/dialogflowcx/agents/{agentId}  

Requires ANY permissions: 

* integrations:integration:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
String agentId = "agentId_example"; // String | The agent ID
try {
    DialogflowCXAgent result = apiInstance.getIntegrationsSpeechDialogflowcxAgent(agentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsSpeechDialogflowcxAgent");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **agentId** | **String**| The agent ID | 
{: class="table-striped"}


### Return type

[**DialogflowCXAgent**](DialogflowCXAgent)


# **getIntegrationsSpeechDialogflowcxAgents**


> [DialogflowCXAgentSummaryEntityListing](DialogflowCXAgentSummaryEntityListing) getIntegrationsSpeechDialogflowcxAgents(pageNumber, pageSize, name)

Get a list of Dialogflow CX agents in the customers' Google accounts

Wraps GET /api/v2/integrations/speech/dialogflowcx/agents  

Requires ANY permissions: 

* integrations:integration:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
String name = "name_example"; // String | Filter on agent name
try {
    DialogflowCXAgentSummaryEntityListing result = apiInstance.getIntegrationsSpeechDialogflowcxAgents(pageNumber, pageSize, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsSpeechDialogflowcxAgents");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **name** | **String**| Filter on agent name | [optional] 
{: class="table-striped"}


### Return type

[**DialogflowCXAgentSummaryEntityListing**](DialogflowCXAgentSummaryEntityListing)


# **getIntegrationsSpeechLexBotAlias**


> [LexBotAlias](LexBotAlias) getIntegrationsSpeechLexBotAlias(aliasId)

Get details about a Lex bot alias

Wraps GET /api/v2/integrations/speech/lex/bot/alias/{aliasId}  

Requires ANY permissions: 

* integrations:integration:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
String aliasId = "aliasId_example"; // String | The alias ID
try {
    LexBotAlias result = apiInstance.getIntegrationsSpeechLexBotAlias(aliasId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsSpeechLexBotAlias");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **aliasId** | **String**| The alias ID | 
{: class="table-striped"}


### Return type

[**LexBotAlias**](LexBotAlias)


# **getIntegrationsSpeechLexBotBotIdAliases**


> [LexBotAliasEntityListing](LexBotAliasEntityListing) getIntegrationsSpeechLexBotBotIdAliases(botId, pageNumber, pageSize, status, name)

Get a list of aliases for a bot in the customer's AWS accounts

Wraps GET /api/v2/integrations/speech/lex/bot/{botId}/aliases  

Requires ANY permissions: 

* integrations:integration:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
String botId = "botId_example"; // String | The bot ID
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
String status = "status_example"; // String | Filter on alias status
String name = "name_example"; // String | Filter on alias name
try {
    LexBotAliasEntityListing result = apiInstance.getIntegrationsSpeechLexBotBotIdAliases(botId, pageNumber, pageSize, status, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsSpeechLexBotBotIdAliases");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **botId** | **String**| The bot ID | 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **status** | **String**| Filter on alias status | [optional]<br />**Values**: READY, FAILED, BUILDING, NOT_BUILT 
| **name** | **String**| Filter on alias name | [optional] 
{: class="table-striped"}


### Return type

[**LexBotAliasEntityListing**](LexBotAliasEntityListing)


# **getIntegrationsSpeechLexBots**


> [LexBotEntityListing](LexBotEntityListing) getIntegrationsSpeechLexBots(pageNumber, pageSize, name)

Get a list of Lex bots in the customers' AWS accounts

Wraps GET /api/v2/integrations/speech/lex/bots  

Requires ANY permissions: 

* integrations:integration:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
String name = "name_example"; // String | Filter on bot name
try {
    LexBotEntityListing result = apiInstance.getIntegrationsSpeechLexBots(pageNumber, pageSize, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsSpeechLexBots");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **name** | **String**| Filter on bot name | [optional] 
{: class="table-striped"}


### Return type

[**LexBotEntityListing**](LexBotEntityListing)


# **getIntegrationsSpeechLexv2BotAlias**


> [LexV2BotAlias](LexV2BotAlias) getIntegrationsSpeechLexv2BotAlias(aliasId)

Get details about a Lex V2 bot alias

Wraps GET /api/v2/integrations/speech/lexv2/bot/alias/{aliasId}  

Requires ANY permissions: 

* integrations:integration:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
String aliasId = "aliasId_example"; // String | The Alias ID
try {
    LexV2BotAlias result = apiInstance.getIntegrationsSpeechLexv2BotAlias(aliasId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsSpeechLexv2BotAlias");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **aliasId** | **String**| The Alias ID | 
{: class="table-striped"}


### Return type

[**LexV2BotAlias**](LexV2BotAlias)


# **getIntegrationsSpeechLexv2BotBotIdAliases**


> [LexV2BotAliasEntityListing](LexV2BotAliasEntityListing) getIntegrationsSpeechLexv2BotBotIdAliases(botId, pageNumber, pageSize, status, name)

Get a list of aliases for a Lex V2 bot

Wraps GET /api/v2/integrations/speech/lexv2/bot/{botId}/aliases  

Requires ANY permissions: 

* integrations:integration:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
String botId = "botId_example"; // String | The Bot ID
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
String status = "status_example"; // String | Filter on alias status
String name = "name_example"; // String | Filter on alias name
try {
    LexV2BotAliasEntityListing result = apiInstance.getIntegrationsSpeechLexv2BotBotIdAliases(botId, pageNumber, pageSize, status, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsSpeechLexv2BotBotIdAliases");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **botId** | **String**| The Bot ID | 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **status** | **String**| Filter on alias status | [optional]<br />**Values**: Creating, Available, Deleting, Failed 
| **name** | **String**| Filter on alias name | [optional] 
{: class="table-striped"}


### Return type

[**LexV2BotAliasEntityListing**](LexV2BotAliasEntityListing)


# **getIntegrationsSpeechLexv2Bots**


> [LexV2BotEntityListing](LexV2BotEntityListing) getIntegrationsSpeechLexv2Bots(pageNumber, pageSize, name)

Get a list of Lex V2 bots

Wraps GET /api/v2/integrations/speech/lexv2/bots  

Requires ANY permissions: 

* integrations:integration:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
String name = "name_example"; // String | Filter on bot name
try {
    LexV2BotEntityListing result = apiInstance.getIntegrationsSpeechLexv2Bots(pageNumber, pageSize, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsSpeechLexv2Bots");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **name** | **String**| Filter on bot name | [optional] 
{: class="table-striped"}


### Return type

[**LexV2BotEntityListing**](LexV2BotEntityListing)


# **getIntegrationsSpeechNuanceNuanceIntegrationIdBot**


> [NuanceBot](NuanceBot) getIntegrationsSpeechNuanceNuanceIntegrationIdBot(nuanceIntegrationId, botId, expand, targetChannel)

Get a Nuance bot in the specified Integration

Wraps GET /api/v2/integrations/speech/nuance/{nuanceIntegrationId}/bots/{botId}  

Requires ANY permissions: 

* integrations:integration:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
String nuanceIntegrationId = "nuanceIntegrationId_example"; // String | The integration ID for this group of bots
String botId = "botId_example"; // String | The Nuance bot ID to get
List<String> expand = Arrays.asList(null); // List<String> | expand
String targetChannel = "targetChannel_example"; // String | targetChannel
try {
    NuanceBot result = apiInstance.getIntegrationsSpeechNuanceNuanceIntegrationIdBot(nuanceIntegrationId, botId, expand, targetChannel);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsSpeechNuanceNuanceIntegrationIdBot");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **nuanceIntegrationId** | **String**| The integration ID for this group of bots | 
| **botId** | **String**| The Nuance bot ID to get | 
| **expand** | [**List&lt;String&gt;**](String)| expand | [optional]<br />**Values**: variables, transferNodes, channels, locales 
| **targetChannel** | **String**| targetChannel | [optional]<br />**Values**: digital, voice 
{: class="table-striped"}


### Return type

[**NuanceBot**](NuanceBot)


# **getIntegrationsSpeechNuanceNuanceIntegrationIdBotJob**


> [AsyncJob](AsyncJob) getIntegrationsSpeechNuanceNuanceIntegrationIdBotJob(nuanceIntegrationId, botId, jobId)

Get the status of an asynchronous Nuance bot GET job

Wraps GET /api/v2/integrations/speech/nuance/{nuanceIntegrationId}/bots/{botId}/jobs/{jobId}  

Requires ANY permissions: 

* integrations:integration:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
String nuanceIntegrationId = "nuanceIntegrationId_example"; // String | The integration ID for this group of bots
String botId = "botId_example"; // String | The Nuance bot ID
String jobId = "jobId_example"; // String | The asynchronous job ID
try {
    AsyncJob result = apiInstance.getIntegrationsSpeechNuanceNuanceIntegrationIdBotJob(nuanceIntegrationId, botId, jobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsSpeechNuanceNuanceIntegrationIdBotJob");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **nuanceIntegrationId** | **String**| The integration ID for this group of bots | 
| **botId** | **String**| The Nuance bot ID | 
| **jobId** | **String**| The asynchronous job ID | 
{: class="table-striped"}


### Return type

[**AsyncJob**](AsyncJob)


# **getIntegrationsSpeechNuanceNuanceIntegrationIdBotJobResults**


> [NuanceBot](NuanceBot) getIntegrationsSpeechNuanceNuanceIntegrationIdBotJobResults(nuanceIntegrationId, botId, jobId)

Get the result of an asynchronous Nuance bot GET job

Wraps GET /api/v2/integrations/speech/nuance/{nuanceIntegrationId}/bots/{botId}/jobs/{jobId}/results  

Requires ANY permissions: 

* integrations:integration:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
String nuanceIntegrationId = "nuanceIntegrationId_example"; // String | The integration ID for this group of bots
String botId = "botId_example"; // String | The Nuance bot ID
String jobId = "jobId_example"; // String | The asynchronous job ID
try {
    NuanceBot result = apiInstance.getIntegrationsSpeechNuanceNuanceIntegrationIdBotJobResults(nuanceIntegrationId, botId, jobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsSpeechNuanceNuanceIntegrationIdBotJobResults");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **nuanceIntegrationId** | **String**| The integration ID for this group of bots | 
| **botId** | **String**| The Nuance bot ID | 
| **jobId** | **String**| The asynchronous job ID | 
{: class="table-striped"}


### Return type

[**NuanceBot**](NuanceBot)


# **getIntegrationsSpeechNuanceNuanceIntegrationIdBots**


> [NuanceBotEntityListing](NuanceBotEntityListing) getIntegrationsSpeechNuanceNuanceIntegrationIdBots(nuanceIntegrationId, pageNumber, pageSize, onlyRegisteredBots)

Get a list of Nuance bots available in the specified Integration

If the 'onlyRegisteredBots' param is set, the returned data will only include the Nuance bots which have configured client secrets within the Integration,  otherwise all of the Nuance bots available to the Integration's configured discovery credentials are returned.

Wraps GET /api/v2/integrations/speech/nuance/{nuanceIntegrationId}/bots  

Requires ANY permissions: 

* integrations:integration:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
String nuanceIntegrationId = "nuanceIntegrationId_example"; // String | The integration ID for this group of bots
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
Boolean onlyRegisteredBots = true; // Boolean | Limit bots to the ones configured for Genesys Cloud usage
try {
    NuanceBotEntityListing result = apiInstance.getIntegrationsSpeechNuanceNuanceIntegrationIdBots(nuanceIntegrationId, pageNumber, pageSize, onlyRegisteredBots);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsSpeechNuanceNuanceIntegrationIdBots");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **nuanceIntegrationId** | **String**| The integration ID for this group of bots | 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **onlyRegisteredBots** | **Boolean**| Limit bots to the ones configured for Genesys Cloud usage | [optional] [default to true] 
{: class="table-striped"}


### Return type

[**NuanceBotEntityListing**](NuanceBotEntityListing)


# **getIntegrationsSpeechNuanceNuanceIntegrationIdBotsJob**


> [AsyncJob](AsyncJob) getIntegrationsSpeechNuanceNuanceIntegrationIdBotsJob(nuanceIntegrationId, jobId)

Get the status of an asynchronous Nuance bots GET job

Wraps GET /api/v2/integrations/speech/nuance/{nuanceIntegrationId}/bots/jobs/{jobId}  

Requires ANY permissions: 

* integrations:integration:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
String nuanceIntegrationId = "nuanceIntegrationId_example"; // String | The integration ID for this group of bots
String jobId = "jobId_example"; // String | The asynchronous job ID
try {
    AsyncJob result = apiInstance.getIntegrationsSpeechNuanceNuanceIntegrationIdBotsJob(nuanceIntegrationId, jobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsSpeechNuanceNuanceIntegrationIdBotsJob");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **nuanceIntegrationId** | **String**| The integration ID for this group of bots | 
| **jobId** | **String**| The asynchronous job ID | 
{: class="table-striped"}


### Return type

[**AsyncJob**](AsyncJob)


# **getIntegrationsSpeechNuanceNuanceIntegrationIdBotsJobResults**


> [NuanceBotEntityListing](NuanceBotEntityListing) getIntegrationsSpeechNuanceNuanceIntegrationIdBotsJobResults(nuanceIntegrationId, jobId)

Get the result of an asynchronous Nuance bots GET job

Wraps GET /api/v2/integrations/speech/nuance/{nuanceIntegrationId}/bots/jobs/{jobId}/results  

Requires ANY permissions: 

* integrations:integration:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
String nuanceIntegrationId = "nuanceIntegrationId_example"; // String | The integration ID for this group of bots
String jobId = "jobId_example"; // String | The asynchronous job ID
try {
    NuanceBotEntityListing result = apiInstance.getIntegrationsSpeechNuanceNuanceIntegrationIdBotsJobResults(nuanceIntegrationId, jobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsSpeechNuanceNuanceIntegrationIdBotsJobResults");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **nuanceIntegrationId** | **String**| The integration ID for this group of bots | 
| **jobId** | **String**| The asynchronous job ID | 
{: class="table-striped"}


### Return type

[**NuanceBotEntityListing**](NuanceBotEntityListing)


# **getIntegrationsSpeechSttEngine**


> [SttEngineEntity](SttEngineEntity) getIntegrationsSpeechSttEngine(engineId)

Get details about a STT engine

Wraps GET /api/v2/integrations/speech/stt/engines/{engineId}  

Requires ANY permissions: 

* integrations:integration:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
String engineId = "engineId_example"; // String | The engine ID
try {
    SttEngineEntity result = apiInstance.getIntegrationsSpeechSttEngine(engineId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsSpeechSttEngine");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **engineId** | **String**| The engine ID | 
{: class="table-striped"}


### Return type

[**SttEngineEntity**](SttEngineEntity)


# **getIntegrationsSpeechSttEngines**


> [SttEngineEntityListing](SttEngineEntityListing) getIntegrationsSpeechSttEngines(pageNumber, pageSize, name)

Get a list of STT engines enabled for org

Wraps GET /api/v2/integrations/speech/stt/engines  

Requires ANY permissions: 

* integrations:integration:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
String name = "name_example"; // String | Filter on engine name
try {
    SttEngineEntityListing result = apiInstance.getIntegrationsSpeechSttEngines(pageNumber, pageSize, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsSpeechSttEngines");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **name** | **String**| Filter on engine name | [optional] 
{: class="table-striped"}


### Return type

[**SttEngineEntityListing**](SttEngineEntityListing)


# **getIntegrationsSpeechTtsEngine**


> [TtsEngineEntity](TtsEngineEntity) getIntegrationsSpeechTtsEngine(engineId, includeVoices)

Get details about a TTS engine

Wraps GET /api/v2/integrations/speech/tts/engines/{engineId}  

Requires ANY permissions: 

* integrations:integration:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
String engineId = "engineId_example"; // String | The engine ID
Boolean includeVoices = false; // Boolean | Include voices for the engine
try {
    TtsEngineEntity result = apiInstance.getIntegrationsSpeechTtsEngine(engineId, includeVoices);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsSpeechTtsEngine");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **engineId** | **String**| The engine ID | 
| **includeVoices** | **Boolean**| Include voices for the engine | [optional] [default to false] 
{: class="table-striped"}


### Return type

[**TtsEngineEntity**](TtsEngineEntity)


# **getIntegrationsSpeechTtsEngineVoice**


> [TtsVoiceEntity](TtsVoiceEntity) getIntegrationsSpeechTtsEngineVoice(engineId, voiceId)

Get details about a specific voice for a TTS engine

Wraps GET /api/v2/integrations/speech/tts/engines/{engineId}/voices/{voiceId}  

Requires ANY permissions: 

* integrations:integration:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
String engineId = "engineId_example"; // String | The engine ID
String voiceId = "voiceId_example"; // String | The voice ID
try {
    TtsVoiceEntity result = apiInstance.getIntegrationsSpeechTtsEngineVoice(engineId, voiceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsSpeechTtsEngineVoice");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **engineId** | **String**| The engine ID | 
| **voiceId** | **String**| The voice ID | 
{: class="table-striped"}


### Return type

[**TtsVoiceEntity**](TtsVoiceEntity)


# **getIntegrationsSpeechTtsEngineVoices**


> [TtsVoiceEntityListing](TtsVoiceEntityListing) getIntegrationsSpeechTtsEngineVoices(engineId, pageNumber, pageSize)

Get a list of voices for a TTS engine

Wraps GET /api/v2/integrations/speech/tts/engines/{engineId}/voices  

Requires ANY permissions: 

* integrations:integration:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
String engineId = "engineId_example"; // String | The engine ID
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
try {
    TtsVoiceEntityListing result = apiInstance.getIntegrationsSpeechTtsEngineVoices(engineId, pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsSpeechTtsEngineVoices");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **engineId** | **String**| The engine ID | 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
{: class="table-striped"}


### Return type

[**TtsVoiceEntityListing**](TtsVoiceEntityListing)


# **getIntegrationsSpeechTtsEngines**


> [TtsEngineEntityListing](TtsEngineEntityListing) getIntegrationsSpeechTtsEngines(pageNumber, pageSize, includeVoices, name, language)

Get a list of TTS engines enabled for org

Wraps GET /api/v2/integrations/speech/tts/engines  

Requires ANY permissions: 

* integrations:integration:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
Boolean includeVoices = false; // Boolean | Include voices for the engine
String name = "name_example"; // String | Filter on engine name
String language = "language_example"; // String | Filter on supported language. If includeVoices=true then the voices are also filtered.
try {
    TtsEngineEntityListing result = apiInstance.getIntegrationsSpeechTtsEngines(pageNumber, pageSize, includeVoices, name, language);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsSpeechTtsEngines");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **includeVoices** | **Boolean**| Include voices for the engine | [optional] [default to false] 
| **name** | **String**| Filter on engine name | [optional] 
| **language** | **String**| Filter on supported language. If includeVoices&#x3D;true then the voices are also filtered. | [optional] 
{: class="table-striped"}


### Return type

[**TtsEngineEntityListing**](TtsEngineEntityListing)


# **getIntegrationsSpeechTtsSettings**


> [TtsSettings](TtsSettings) getIntegrationsSpeechTtsSettings()

Get TTS settings for an org

Wraps GET /api/v2/integrations/speech/tts/settings  

Requires ANY permissions: 

* integrations:integration:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
try {
    TtsSettings result = apiInstance.getIntegrationsSpeechTtsSettings();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsSpeechTtsSettings");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**TtsSettings**](TtsSettings)


# **getIntegrationsType**


> [IntegrationType](IntegrationType) getIntegrationsType(typeId)

Get integration type.

Wraps GET /api/v2/integrations/types/{typeId}  

Requires ANY permissions: 

* integrations:integration:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
String typeId = "typeId_example"; // String | Integration Type Id
try {
    IntegrationType result = apiInstance.getIntegrationsType(typeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsType");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **typeId** | **String**| Integration Type Id | 
{: class="table-striped"}


### Return type

[**IntegrationType**](IntegrationType)


# **getIntegrationsTypeConfigschema**


> [JsonSchemaDocument](JsonSchemaDocument) getIntegrationsTypeConfigschema(typeId, configType)

Get properties config schema for an integration type.

Wraps GET /api/v2/integrations/types/{typeId}/configschemas/{configType}  

Requires ANY permissions: 

* integrations:integration:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
String typeId = "typeId_example"; // String | Integration Type Id
String configType = "configType_example"; // String | Config schema type
try {
    JsonSchemaDocument result = apiInstance.getIntegrationsTypeConfigschema(typeId, configType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsTypeConfigschema");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **typeId** | **String**| Integration Type Id | 
| **configType** | **String**| Config schema type |<br />**Values**: properties, advanced 
{: class="table-striped"}


### Return type

[**JsonSchemaDocument**](JsonSchemaDocument)


# **getIntegrationsTypes**


> [IntegrationTypeEntityListing](IntegrationTypeEntityListing) getIntegrationsTypes(pageSize, pageNumber, sortBy, expand, nextPage, previousPage)

List integration types

Wraps GET /api/v2/integrations/types  

Requires ANY permissions: 

* integrations:integration:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
Integer pageSize = 25; // Integer | The total page size requested
Integer pageNumber = 1; // Integer | The page number requested
String sortBy = "sortBy_example"; // String | variable name requested to sort by
List<String> expand = Arrays.asList(null); // List<String> | variable name requested by expand list
String nextPage = "nextPage_example"; // String | next page token
String previousPage = "previousPage_example"; // String | Previous page token
try {
    IntegrationTypeEntityListing result = apiInstance.getIntegrationsTypes(pageSize, pageNumber, sortBy, expand, nextPage, previousPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsTypes");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| The total page size requested | [optional] [default to 25] 
| **pageNumber** | **Integer**| The page number requested | [optional] [default to 1] 
| **sortBy** | **String**| variable name requested to sort by | [optional] 
| **expand** | [**List&lt;String&gt;**](String)| variable name requested by expand list | [optional] 
| **nextPage** | **String**| next page token | [optional] 
| **previousPage** | **String**| Previous page token | [optional] 
{: class="table-striped"}


### Return type

[**IntegrationTypeEntityListing**](IntegrationTypeEntityListing)


# **getIntegrationsUnifiedcommunicationsClientapp**


> [UnifiedCommunicationsIntegration](UnifiedCommunicationsIntegration) getIntegrationsUnifiedcommunicationsClientapp(ucIntegrationId)

UC integration client application configuration.

This endpoint returns basic UI configuration data for the specified Unified Communications integration client application.

Wraps GET /api/v2/integrations/unifiedcommunications/clientapps/{ucIntegrationId}  

Requires ANY permissions: 

* integration:unifiedCommunications:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
String ucIntegrationId = "ucIntegrationId_example"; // String | 3rd Party Service Type
try {
    UnifiedCommunicationsIntegration result = apiInstance.getIntegrationsUnifiedcommunicationsClientapp(ucIntegrationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsUnifiedcommunicationsClientapp");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ucIntegrationId** | **String**| 3rd Party Service Type | 
{: class="table-striped"}


### Return type

[**UnifiedCommunicationsIntegration**](UnifiedCommunicationsIntegration)


# **getIntegrationsUnifiedcommunicationsClientapps**


> [UnifiedCommunicationsIntegrationListing](UnifiedCommunicationsIntegrationListing) getIntegrationsUnifiedcommunicationsClientapps(pageSize, pageNumber, sortBy, expand, nextPage, previousPage)

List UC integration client application configurations.

This endpoint returns basic UI configuration data for all Unified Communications integrations client applications enabled.

Wraps GET /api/v2/integrations/unifiedcommunications/clientapps  

Requires ANY permissions: 

* integration:unifiedCommunications:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
Integer pageSize = 25; // Integer | The total page size requested
Integer pageNumber = 1; // Integer | The page number requested
String sortBy = "sortBy_example"; // String | variable name requested to sort by
List<String> expand = Arrays.asList(null); // List<String> | variable name requested by expand list
String nextPage = "nextPage_example"; // String | next page token
String previousPage = "previousPage_example"; // String | Previous page token
try {
    UnifiedCommunicationsIntegrationListing result = apiInstance.getIntegrationsUnifiedcommunicationsClientapps(pageSize, pageNumber, sortBy, expand, nextPage, previousPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsUnifiedcommunicationsClientapps");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| The total page size requested | [optional] [default to 25] 
| **pageNumber** | **Integer**| The page number requested | [optional] [default to 1] 
| **sortBy** | **String**| variable name requested to sort by | [optional] 
| **expand** | [**List&lt;String&gt;**](String)| variable name requested by expand list | [optional] 
| **nextPage** | **String**| next page token | [optional] 
| **previousPage** | **String**| Previous page token | [optional] 
{: class="table-striped"}


### Return type

[**UnifiedCommunicationsIntegrationListing**](UnifiedCommunicationsIntegrationListing)


# **getIntegrationsUserapps**


> [UserAppEntityListing](UserAppEntityListing) getIntegrationsUserapps(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, appHost)

List permitted user app integrations for the logged in user

Wraps GET /api/v2/integrations/userapps  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
Integer pageSize = 25; // Integer | The total page size requested
Integer pageNumber = 1; // Integer | The page number requested
String sortBy = "sortBy_example"; // String | variable name requested to sort by
List<String> expand = Arrays.asList(null); // List<String> | variable name requested by expand list
String nextPage = "nextPage_example"; // String | next page token
String previousPage = "previousPage_example"; // String | Previous page token
String appHost = "appHost_example"; // String | The type of UserApp to filter by
try {
    UserAppEntityListing result = apiInstance.getIntegrationsUserapps(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, appHost);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsUserapps");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| The total page size requested | [optional] [default to 25] 
| **pageNumber** | **Integer**| The page number requested | [optional] [default to 1] 
| **sortBy** | **String**| variable name requested to sort by | [optional] 
| **expand** | [**List&lt;String&gt;**](String)| variable name requested by expand list | [optional] 
| **nextPage** | **String**| next page token | [optional] 
| **previousPage** | **String**| Previous page token | [optional] 
| **appHost** | **String**| The type of UserApp to filter by | [optional] 
{: class="table-striped"}


### Return type

[**UserAppEntityListing**](UserAppEntityListing)


# **patchIntegration**


> [Integration](Integration) patchIntegration(integrationId, pageSize, pageNumber, sortBy, expand, nextPage, previousPage, body)

Update an integration.

Wraps PATCH /api/v2/integrations/{integrationId}  

Requires ANY permissions: 

* integrations:integration:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
String integrationId = "integrationId_example"; // String | Integration Id
Integer pageSize = 25; // Integer | The total page size requested
Integer pageNumber = 1; // Integer | The page number requested
String sortBy = "sortBy_example"; // String | variable name requested to sort by
List<String> expand = Arrays.asList(null); // List<String> | variable name requested by expand list
String nextPage = "nextPage_example"; // String | next page token
String previousPage = "previousPage_example"; // String | Previous page token
Integration body = new Integration(); // Integration | Integration Update
try {
    Integration result = apiInstance.patchIntegration(integrationId, pageSize, pageNumber, sortBy, expand, nextPage, previousPage, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#patchIntegration");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **integrationId** | **String**| Integration Id | 
| **pageSize** | **Integer**| The total page size requested | [optional] [default to 25] 
| **pageNumber** | **Integer**| The page number requested | [optional] [default to 1] 
| **sortBy** | **String**| variable name requested to sort by | [optional] 
| **expand** | [**List&lt;String&gt;**](String)| variable name requested by expand list | [optional] 
| **nextPage** | **String**| next page token | [optional] 
| **previousPage** | **String**| Previous page token | [optional] 
| **body** | [**Integration**](Integration)| Integration Update | [optional] 
{: class="table-striped"}


### Return type

[**Integration**](Integration)


# **patchIntegrationsAction**


> [Action](Action) patchIntegrationsAction(actionId, body)

Patch an Action

Wraps PATCH /api/v2/integrations/actions/{actionId}  

Requires ANY permissions: 

* integrations:action:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
String actionId = "actionId_example"; // String | actionId
UpdateActionInput body = new UpdateActionInput(); // UpdateActionInput | Input used to patch the Action.
try {
    Action result = apiInstance.patchIntegrationsAction(actionId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#patchIntegrationsAction");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **actionId** | **String**| actionId | 
| **body** | [**UpdateActionInput**](UpdateActionInput)| Input used to patch the Action. | 
{: class="table-striped"}


### Return type

[**Action**](Action)


# **patchIntegrationsActionDraft**


> [Action](Action) patchIntegrationsActionDraft(actionId, body)

Update an existing Draft

Wraps PATCH /api/v2/integrations/actions/{actionId}/draft  

Requires ANY permissions: 

* integrations:action:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
String actionId = "actionId_example"; // String | actionId
UpdateDraftInput body = new UpdateDraftInput(); // UpdateDraftInput | Input used to patch the Action Draft.
try {
    Action result = apiInstance.patchIntegrationsActionDraft(actionId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#patchIntegrationsActionDraft");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **actionId** | **String**| actionId | 
| **body** | [**UpdateDraftInput**](UpdateDraftInput)| Input used to patch the Action Draft. | 
{: class="table-striped"}


### Return type

[**Action**](Action)


# **postIntegrations**


> [Integration](Integration) postIntegrations(body)

Create an integration.

Wraps POST /api/v2/integrations  

Requires ANY permissions: 

* integrations:integration:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
CreateIntegrationRequest body = new CreateIntegrationRequest(); // CreateIntegrationRequest | Integration
try {
    Integration result = apiInstance.postIntegrations(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#postIntegrations");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**CreateIntegrationRequest**](CreateIntegrationRequest)| Integration | [optional] 
{: class="table-striped"}


### Return type

[**Integration**](Integration)


# **postIntegrationsActionDraft**


> [Action](Action) postIntegrationsActionDraft(actionId)

Create a new Draft from existing Action

Wraps POST /api/v2/integrations/actions/{actionId}/draft  

Requires ANY permissions: 

* integrations:action:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
String actionId = "actionId_example"; // String | actionId
try {
    Action result = apiInstance.postIntegrationsActionDraft(actionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#postIntegrationsActionDraft");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **actionId** | **String**| actionId | 
{: class="table-striped"}


### Return type

[**Action**](Action)


# **postIntegrationsActionDraftFunctionUpload**


> [FunctionUploadResponse](FunctionUploadResponse) postIntegrationsActionDraftFunctionUpload(actionId, body)

Create upload presigned URL for draft function package file.

Wraps POST /api/v2/integrations/actions/{actionId}/draft/function/upload  

Requires ANY permissions: 

* integrations:actionFunction:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
String actionId = "actionId_example"; // String | actionId
FunctionUploadRequest body = new FunctionUploadRequest(); // FunctionUploadRequest | Input used to request URL upload.
try {
    FunctionUploadResponse result = apiInstance.postIntegrationsActionDraftFunctionUpload(actionId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#postIntegrationsActionDraftFunctionUpload");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **actionId** | **String**| actionId | 
| **body** | [**FunctionUploadRequest**](FunctionUploadRequest)| Input used to request URL upload. | 
{: class="table-striped"}


### Return type

[**FunctionUploadResponse**](FunctionUploadResponse)


# **postIntegrationsActionDraftPublish**


> [Action](Action) postIntegrationsActionDraftPublish(actionId, body)

Publish a Draft and make it the active Action configuration

Wraps POST /api/v2/integrations/actions/{actionId}/draft/publish  

Requires ANY permissions: 

* integrations:action:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
String actionId = "actionId_example"; // String | actionId
PublishDraftInput body = new PublishDraftInput(); // PublishDraftInput | Input used to patch the Action.
try {
    Action result = apiInstance.postIntegrationsActionDraftPublish(actionId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#postIntegrationsActionDraftPublish");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **actionId** | **String**| actionId | 
| **body** | [**PublishDraftInput**](PublishDraftInput)| Input used to patch the Action. | 
{: class="table-striped"}


### Return type

[**Action**](Action)


# **postIntegrationsActionDraftTest**


> [TestExecutionResult](TestExecutionResult) postIntegrationsActionDraftTest(actionId, body, flatten)

Test the execution of a draft. Responses will show execution steps broken out with intermediate results to help in debugging.

Wraps POST /api/v2/integrations/actions/{actionId}/draft/test  

Requires ANY permissions: 

* integrations:action:execute

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
String actionId = "actionId_example"; // String | actionId
Object body = new HashMap(); // Object | Map of parameters used for variable substitution.
Boolean flatten = false; // Boolean | Indicates the response should be reformatted, based on Architect's flattening format.
try {
    TestExecutionResult result = apiInstance.postIntegrationsActionDraftTest(actionId, body, flatten);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#postIntegrationsActionDraftTest");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **actionId** | **String**| actionId | 
| **body** | [**Object**](Object)| Map of parameters used for variable substitution. | 
| **flatten** | **Boolean**| Indicates the response should be reformatted, based on Architect&#39;s flattening format. | [optional] [default to false] 
{: class="table-striped"}


### Return type

[**TestExecutionResult**](TestExecutionResult)


# **postIntegrationsActionExecute**


> Object postIntegrationsActionExecute(actionId, body, flatten)

Execute Action and return response from 3rd party.  Responses will follow the schemas defined on the Action for success and error.

Wraps POST /api/v2/integrations/actions/{actionId}/execute  

Requires ANY permissions: 

* integrations:action:execute
* bridge:actions:execute

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
String actionId = "actionId_example"; // String | actionId
Object body = new HashMap(); // Object | Map of parameters used for variable substitution.
Boolean flatten = false; // Boolean | Indicates the response should be reformatted, based on Architect's flattening format.
try {
    Object result = apiInstance.postIntegrationsActionExecute(actionId, body, flatten);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#postIntegrationsActionExecute");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **actionId** | **String**| actionId | 
| **body** | [**Object**](Object)| Map of parameters used for variable substitution. | 
| **flatten** | **Boolean**| Indicates the response should be reformatted, based on Architect&#39;s flattening format. | [optional] [default to false] 
{: class="table-striped"}


### Return type

**Object**


# **postIntegrationsActionTest**


> [TestExecutionResult](TestExecutionResult) postIntegrationsActionTest(actionId, body, flatten)

Test the execution of an action. Responses will show execution steps broken out with intermediate results to help in debugging.

Wraps POST /api/v2/integrations/actions/{actionId}/test  

Requires ANY permissions: 

* integrations:action:execute
* bridge:actions:execute

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
String actionId = "actionId_example"; // String | actionId
Object body = new HashMap(); // Object | Map of parameters used for variable substitution.
Boolean flatten = false; // Boolean | Indicates the response should be reformatted, based on Architect's flattening format.
try {
    TestExecutionResult result = apiInstance.postIntegrationsActionTest(actionId, body, flatten);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#postIntegrationsActionTest");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **actionId** | **String**| actionId | 
| **body** | [**Object**](Object)| Map of parameters used for variable substitution. | 
| **flatten** | **Boolean**| Indicates the response should be reformatted, based on Architect&#39;s flattening format. | [optional] [default to false] 
{: class="table-striped"}


### Return type

[**TestExecutionResult**](TestExecutionResult)


# **postIntegrationsActions**


> [Action](Action) postIntegrationsActions(body)

Create a new Action. Not supported for 'Function Integration' actions. Function integrations must be created as drafts to allow managing of uploading required ZIP function package before they may be used as a published action.

Wraps POST /api/v2/integrations/actions  

Requires ANY permissions: 

* integrations:action:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
PostActionInput body = new PostActionInput(); // PostActionInput | Input used to create Action.
try {
    Action result = apiInstance.postIntegrationsActions(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#postIntegrationsActions");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**PostActionInput**](PostActionInput)| Input used to create Action. | 
{: class="table-striped"}


### Return type

[**Action**](Action)


# **postIntegrationsActionsDrafts**


> [Action](Action) postIntegrationsActionsDrafts(body)

Create a new Draft

Wraps POST /api/v2/integrations/actions/drafts  

Requires ANY permissions: 

* integrations:action:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
PostActionInput body = new PostActionInput(); // PostActionInput | Input used to create Action Draft.
try {
    Action result = apiInstance.postIntegrationsActionsDrafts(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#postIntegrationsActionsDrafts");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**PostActionInput**](PostActionInput)| Input used to create Action Draft. | 
{: class="table-striped"}


### Return type

[**Action**](Action)


# **postIntegrationsBotconnectorsIncomingMessages**


> [IncomingMessageResponse](IncomingMessageResponse) postIntegrationsBotconnectorsIncomingMessages(body)

Send an incoming message to the bot.

postIntegrationsBotconnectorsIncomingMessages is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps POST /api/v2/integrations/botconnectors/incoming/messages  

Requires ANY permissions: 

* integration:botconnector:send

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
IncomingMessageRequest body = new IncomingMessageRequest(); // IncomingMessageRequest | Incoming Message Request
try {
    IncomingMessageResponse result = apiInstance.postIntegrationsBotconnectorsIncomingMessages(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#postIntegrationsBotconnectorsIncomingMessages");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**IncomingMessageRequest**](IncomingMessageRequest)| Incoming Message Request | 
{: class="table-striped"}


### Return type

[**IncomingMessageResponse**](IncomingMessageResponse)


# **postIntegrationsBotconnectorsOutgoingMessages**


> [OutgoingMessageResponse](OutgoingMessageResponse) postIntegrationsBotconnectorsOutgoingMessages(body)

Send an outgoing message to the end user.

postIntegrationsBotconnectorsOutgoingMessages is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps POST /api/v2/integrations/botconnectors/outgoing/messages  

Requires ANY permissions: 

* integration:botconnector:send

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
OutgoingMessageRequest body = new OutgoingMessageRequest(); // OutgoingMessageRequest | Outgoing Message Request
try {
    OutgoingMessageResponse result = apiInstance.postIntegrationsBotconnectorsOutgoingMessages(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#postIntegrationsBotconnectorsOutgoingMessages");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**OutgoingMessageRequest**](OutgoingMessageRequest)| Outgoing Message Request | 
{: class="table-striped"}


### Return type

[**OutgoingMessageResponse**](OutgoingMessageResponse)


# **postIntegrationsCredentials**


> [CredentialInfo](CredentialInfo) postIntegrationsCredentials(body)

Create a set of credentials

Wraps POST /api/v2/integrations/credentials  

Requires ANY permissions: 

* integrations:integration:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
Credential body = new Credential(); // Credential | Credential
try {
    CredentialInfo result = apiInstance.postIntegrationsCredentials(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#postIntegrationsCredentials");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**Credential**](Credential)| Credential | [optional] 
{: class="table-striped"}


### Return type

[**CredentialInfo**](CredentialInfo)


# **postIntegrationsSpeechNuanceNuanceIntegrationIdBotJobs**


> [AsyncJob](AsyncJob) postIntegrationsSpeechNuanceNuanceIntegrationIdBotJobs(nuanceIntegrationId, botId, expand, body)

Get a Nuance bot in the specified Integration asynchronously

Wraps POST /api/v2/integrations/speech/nuance/{nuanceIntegrationId}/bots/{botId}/jobs  

Requires ANY permissions: 

* integrations:integration:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
String nuanceIntegrationId = "nuanceIntegrationId_example"; // String | The integration ID for this group of bots
String botId = "botId_example"; // String | The Nuance bot ID
List<String> expand = Arrays.asList(null); // List<String> | expand
String body = "body_example"; // String | targetChannel
try {
    AsyncJob result = apiInstance.postIntegrationsSpeechNuanceNuanceIntegrationIdBotJobs(nuanceIntegrationId, botId, expand, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#postIntegrationsSpeechNuanceNuanceIntegrationIdBotJobs");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **nuanceIntegrationId** | **String**| The integration ID for this group of bots | 
| **botId** | **String**| The Nuance bot ID | 
| **expand** | [**List&lt;String&gt;**](String)| expand | [optional]<br />**Values**: variables, transferNodes, channels, locales 
| **body** | **String**| targetChannel | [optional] 
{: class="table-striped"}


### Return type

[**AsyncJob**](AsyncJob)


# **postIntegrationsSpeechNuanceNuanceIntegrationIdBotsJobs**


> [AsyncJob](AsyncJob) postIntegrationsSpeechNuanceNuanceIntegrationIdBotsJobs(nuanceIntegrationId, pageNumber, pageSize, onlyRegisteredBots)

Get a list of Nuance bots in the specified Integration asynchronously

Wraps POST /api/v2/integrations/speech/nuance/{nuanceIntegrationId}/bots/jobs  

Requires ANY permissions: 

* integrations:integration:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
String nuanceIntegrationId = "nuanceIntegrationId_example"; // String | The integration ID for this group of bots
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
Boolean onlyRegisteredBots = true; // Boolean | Limit bots to the ones configured for Genesys Cloud usage
try {
    AsyncJob result = apiInstance.postIntegrationsSpeechNuanceNuanceIntegrationIdBotsJobs(nuanceIntegrationId, pageNumber, pageSize, onlyRegisteredBots);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#postIntegrationsSpeechNuanceNuanceIntegrationIdBotsJobs");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **nuanceIntegrationId** | **String**| The integration ID for this group of bots | 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **onlyRegisteredBots** | **Boolean**| Limit bots to the ones configured for Genesys Cloud usage | [optional] [default to true] 
{: class="table-striped"}


### Return type

[**AsyncJob**](AsyncJob)


# **postIntegrationsSpeechNuanceNuanceIntegrationIdBotsLaunchValidate**


> Void postIntegrationsSpeechNuanceNuanceIntegrationIdBotsLaunchValidate(nuanceIntegrationId, settings)

Try out a single credential for a Nuance bot to know if the secret is correct

Wraps POST /api/v2/integrations/speech/nuance/{nuanceIntegrationId}/bots/launch/validate  

Requires ANY permissions: 

* integrations:integration:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
String nuanceIntegrationId = "nuanceIntegrationId_example"; // String | The integration ID for this group of bots
BotExecutionConfiguration settings = new BotExecutionConfiguration(); // BotExecutionConfiguration | 
try {
    apiInstance.postIntegrationsSpeechNuanceNuanceIntegrationIdBotsLaunchValidate(nuanceIntegrationId, settings);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#postIntegrationsSpeechNuanceNuanceIntegrationIdBotsLaunchValidate");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **nuanceIntegrationId** | **String**| The integration ID for this group of bots | 
| **settings** | [**BotExecutionConfiguration**](BotExecutionConfiguration)|  | 
{: class="table-striped"}


### Return type

null (empty response body)


# **postIntegrationsWebhookEvents**


> [WebhookInvocationResponse](WebhookInvocationResponse) postIntegrationsWebhookEvents(tokenId, body)

Invoke Webhook

Wraps POST /api/v2/integrations/webhooks/{tokenId}/events  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;


IntegrationsApi apiInstance = new IntegrationsApi();
String tokenId = "tokenId_example"; // String | The token of the webhook to be invoked
Object body = new HashMap(); // Object | Webhook Invocation Payload
try {
    WebhookInvocationResponse result = apiInstance.postIntegrationsWebhookEvents(tokenId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#postIntegrationsWebhookEvents");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tokenId** | **String**| The token of the webhook to be invoked | 
| **body** | [**Object**](Object)| Webhook Invocation Payload | 
{: class="table-striped"}


### Return type

[**WebhookInvocationResponse**](WebhookInvocationResponse)


# **putIntegrationConfigCurrent**


> [IntegrationConfiguration](IntegrationConfiguration) putIntegrationConfigCurrent(integrationId, body)

Update integration configuration.

Wraps PUT /api/v2/integrations/{integrationId}/config/current  

Requires ANY permissions: 

* integrations:integration:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
String integrationId = "integrationId_example"; // String | Integration Id
IntegrationConfiguration body = new IntegrationConfiguration(); // IntegrationConfiguration | Integration Configuration
try {
    IntegrationConfiguration result = apiInstance.putIntegrationConfigCurrent(integrationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#putIntegrationConfigCurrent");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **integrationId** | **String**| Integration Id | 
| **body** | [**IntegrationConfiguration**](IntegrationConfiguration)| Integration Configuration | [optional] 
{: class="table-striped"}


### Return type

[**IntegrationConfiguration**](IntegrationConfiguration)


# **putIntegrationsActionDraftFunction**


> [FunctionConfig](FunctionConfig) putIntegrationsActionDraftFunction(actionId, body)

Update draft function settings.

Wraps PUT /api/v2/integrations/actions/{actionId}/draft/function  

Requires ANY permissions: 

* integrations:actionFunction:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
String actionId = "actionId_example"; // String | actionId
Function body = new Function(); // Function | Input used to update function settings.
try {
    FunctionConfig result = apiInstance.putIntegrationsActionDraftFunction(actionId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#putIntegrationsActionDraftFunction");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **actionId** | **String**| actionId | 
| **body** | [**Function**](Function)| Input used to update function settings. | 
{: class="table-striped"}


### Return type

[**FunctionConfig**](FunctionConfig)


# **putIntegrationsBotconnectorIntegrationIdBots**


> Void putIntegrationsBotconnectorIntegrationIdBots(integrationId, botList)

Set a list of botConnector bots plus versions for this integration

Wraps PUT /api/v2/integrations/botconnector/{integrationId}/bots  

Requires ANY permissions: 

* integration:botconnector:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
String integrationId = "integrationId_example"; // String | The integration ID for this group of bots
BotList botList = new BotList(); // BotList | 
try {
    apiInstance.putIntegrationsBotconnectorIntegrationIdBots(integrationId, botList);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#putIntegrationsBotconnectorIntegrationIdBots");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **integrationId** | **String**| The integration ID for this group of bots | 
| **botList** | [**BotList**](BotList)|  | 
{: class="table-striped"}


### Return type

null (empty response body)


# **putIntegrationsCredential**


> [CredentialInfo](CredentialInfo) putIntegrationsCredential(credentialId, body)

Update a set of credentials

Wraps PUT /api/v2/integrations/credentials/{credentialId}  

Requires ANY permissions: 

* integrations:integration:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
String credentialId = "credentialId_example"; // String | Credential ID
Credential body = new Credential(); // Credential | Credential
try {
    CredentialInfo result = apiInstance.putIntegrationsCredential(credentialId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#putIntegrationsCredential");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **credentialId** | **String**| Credential ID | 
| **body** | [**Credential**](Credential)| Credential | [optional] 
{: class="table-striped"}


### Return type

[**CredentialInfo**](CredentialInfo)


# **putIntegrationsSpeechNuanceNuanceIntegrationIdBotsLaunchSettings**


> Void putIntegrationsSpeechNuanceNuanceIntegrationIdBotsLaunchSettings(nuanceIntegrationId, settings)

Update the Nuance bot list for the specific bots made available to Genesys Cloud in the specified Integration

Wraps PUT /api/v2/integrations/speech/nuance/{nuanceIntegrationId}/bots/launch/settings  

Requires ANY permissions: 

* integrations:integration:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
String nuanceIntegrationId = "nuanceIntegrationId_example"; // String | The integration ID for this group of bots
NuanceBotLaunchSettings settings = new NuanceBotLaunchSettings(); // NuanceBotLaunchSettings | 
try {
    apiInstance.putIntegrationsSpeechNuanceNuanceIntegrationIdBotsLaunchSettings(nuanceIntegrationId, settings);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#putIntegrationsSpeechNuanceNuanceIntegrationIdBotsLaunchSettings");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **nuanceIntegrationId** | **String**| The integration ID for this group of bots | 
| **settings** | [**NuanceBotLaunchSettings**](NuanceBotLaunchSettings)|  | 
{: class="table-striped"}


### Return type

null (empty response body)


# **putIntegrationsSpeechTtsSettings**


> [TtsSettings](TtsSettings) putIntegrationsSpeechTtsSettings(body)

Update TTS settings for an org

Wraps PUT /api/v2/integrations/speech/tts/settings  

Requires ANY permissions: 

* integrations:integration:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
TtsSettings body = new TtsSettings(); // TtsSettings | Updated TtsSettings
try {
    TtsSettings result = apiInstance.putIntegrationsSpeechTtsSettings(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#putIntegrationsSpeechTtsSettings");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**TtsSettings**](TtsSettings)| Updated TtsSettings | 
{: class="table-striped"}


### Return type

[**TtsSettings**](TtsSettings)


# **putIntegrationsUnifiedcommunicationThirdpartypresences**


> String putIntegrationsUnifiedcommunicationThirdpartypresences(ucIntegrationId, body)

Bulk integration presence ingestion

This endpoint accepts bulk presence updates from a 3rd-party presence integration and maps the 3rd-party user to a Genesys Cloud user via the matching email address. The 3rd-party presence value will be mapped to a Genesys Cloud organization presence definition value.

Wraps PUT /api/v2/integrations/unifiedcommunications/{ucIntegrationId}/thirdpartypresences  

Requires ANY permissions: 

* integration:presence:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
String ucIntegrationId = "ucIntegrationId_example"; // String | UC Integration ID
List<UCThirdPartyPresence> body = Arrays.asList(new UCThirdPartyPresence()); // List<UCThirdPartyPresence> | List of User presences
try {
    String result = apiInstance.putIntegrationsUnifiedcommunicationThirdpartypresences(ucIntegrationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#putIntegrationsUnifiedcommunicationThirdpartypresences");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ucIntegrationId** | **String**| UC Integration ID | 
| **body** | [**List&lt;UCThirdPartyPresence&gt;**](UCThirdPartyPresence)| List of User presences | 
{: class="table-striped"}


### Return type

**String**


_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
