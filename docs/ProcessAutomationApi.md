# ProcessAutomationApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**deleteProcessautomationTrigger**](ProcessAutomationApi#deleteProcessautomationTrigger) | Delete a Trigger |
| [**getProcessautomationTrigger**](ProcessAutomationApi#getProcessautomationTrigger) | Retrieve a single Trigger matching id |
| [**getProcessautomationTriggers**](ProcessAutomationApi#getProcessautomationTriggers) | Retrieves all triggers, optionally filtered by query parameters. |
| [**getProcessautomationTriggersTopics**](ProcessAutomationApi#getProcessautomationTriggersTopics) | Get topics available for organization |
| [**postProcessautomationTriggerTest**](ProcessAutomationApi#postProcessautomationTriggerTest) | Test the matching of a Trigger based on provided event body |
| [**postProcessautomationTriggers**](ProcessAutomationApi#postProcessautomationTriggers) | Create a Trigger |
| [**postProcessautomationTriggersTopicTest**](ProcessAutomationApi#postProcessautomationTriggersTopicTest) | Test the matching of all organization Triggers on given topic using provided event body |
| [**putProcessautomationTrigger**](ProcessAutomationApi#putProcessautomationTrigger) | Update a Trigger |
{: class="table-striped"}


# **deleteProcessautomationTrigger**


> Void deleteProcessautomationTrigger(triggerId)

Delete a Trigger

Wraps DELETE /api/v2/processautomation/triggers/{triggerId}  

Requires ANY permissions: 

* processautomation:trigger:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ProcessAutomationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ProcessAutomationApi apiInstance = new ProcessAutomationApi();
String triggerId = "triggerId_example"; // String | triggerId
try {
    apiInstance.deleteProcessautomationTrigger(triggerId);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessAutomationApi#deleteProcessautomationTrigger");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **triggerId** | **String**| triggerId | 
{: class="table-striped"}


### Return type

null (empty response body)


# **getProcessautomationTrigger**


> [Trigger](Trigger) getProcessautomationTrigger(triggerId)

Retrieve a single Trigger matching id

Wraps GET /api/v2/processautomation/triggers/{triggerId}  

Requires ANY permissions: 

* processautomation:trigger:edit
* processautomation:trigger:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ProcessAutomationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ProcessAutomationApi apiInstance = new ProcessAutomationApi();
String triggerId = "triggerId_example"; // String | triggerId
try {
    Trigger result = apiInstance.getProcessautomationTrigger(triggerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessAutomationApi#getProcessautomationTrigger");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **triggerId** | **String**| triggerId | 
{: class="table-striped"}


### Return type

[**Trigger**](Trigger)


# **getProcessautomationTriggers**


> [TriggerEntityListing](TriggerEntityListing) getProcessautomationTriggers(before, after, pageSize, topicName, enabled, hasDelayBy)

Retrieves all triggers, optionally filtered by query parameters.

Wraps GET /api/v2/processautomation/triggers  

Requires ANY permissions: 

* processautomation:trigger:edit
* processautomation:trigger:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ProcessAutomationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ProcessAutomationApi apiInstance = new ProcessAutomationApi();
String before = "before_example"; // String | The cursor that points to the start of the set of entities that has been returned.
String after = "after_example"; // String | The cursor that points to the end of the set of entities that has been returned.
String pageSize = "pageSize_example"; // String | Number of entities to return. Maximum of 200.
String topicName = "topicName_example"; // String | Topic name(s). Separated by commas
Boolean enabled = true; // Boolean | Boolean indicating desired enabled state of triggers
Boolean hasDelayBy = true; // Boolean | Boolean to filter based on delayBySeconds being set in triggers. Default returns all, true returns only those with delayBySeconds set, false returns those without delayBySeconds set.
try {
    TriggerEntityListing result = apiInstance.getProcessautomationTriggers(before, after, pageSize, topicName, enabled, hasDelayBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessAutomationApi#getProcessautomationTriggers");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **before** | **String**| The cursor that points to the start of the set of entities that has been returned. | [optional] 
| **after** | **String**| The cursor that points to the end of the set of entities that has been returned. | [optional] 
| **pageSize** | **String**| Number of entities to return. Maximum of 200. | [optional] 
| **topicName** | **String**| Topic name(s). Separated by commas | [optional] 
| **enabled** | **Boolean**| Boolean indicating desired enabled state of triggers | [optional] 
| **hasDelayBy** | **Boolean**| Boolean to filter based on delayBySeconds being set in triggers. Default returns all, true returns only those with delayBySeconds set, false returns those without delayBySeconds set. | [optional] 
{: class="table-striped"}


### Return type

[**TriggerEntityListing**](TriggerEntityListing)


# **getProcessautomationTriggersTopics**


> [TopicCursorEntityListing](TopicCursorEntityListing) getProcessautomationTriggersTopics(before, after, pageSize)

Get topics available for organization

Wraps GET /api/v2/processautomation/triggers/topics  

Requires ANY permissions: 

* processautomation:trigger:edit
* processautomation:trigger:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ProcessAutomationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ProcessAutomationApi apiInstance = new ProcessAutomationApi();
String before = "before_example"; // String | The cursor that points to the start of the set of entities that has been returned.
String after = "after_example"; // String | The cursor that points to the end of the set of entities that has been returned.
String pageSize = "pageSize_example"; // String | Number of entities to return. Maximum of 200.
try {
    TopicCursorEntityListing result = apiInstance.getProcessautomationTriggersTopics(before, after, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessAutomationApi#getProcessautomationTriggersTopics");
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

[**TopicCursorEntityListing**](TopicCursorEntityListing)


# **postProcessautomationTriggerTest**


> [TestModeResults](TestModeResults) postProcessautomationTriggerTest(triggerId, body)

Test the matching of a Trigger based on provided event body

Wraps POST /api/v2/processautomation/triggers/{triggerId}/test  

Requires ANY permissions: 

* processautomation:trigger:test

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ProcessAutomationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ProcessAutomationApi apiInstance = new ProcessAutomationApi();
String triggerId = "triggerId_example"; // String | triggerId
String body = "body_example"; // String | eventBody
try {
    TestModeResults result = apiInstance.postProcessautomationTriggerTest(triggerId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessAutomationApi#postProcessautomationTriggerTest");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **triggerId** | **String**| triggerId | 
| **body** | **String**| eventBody | [optional] 
{: class="table-striped"}


### Return type

[**TestModeResults**](TestModeResults)


# **postProcessautomationTriggers**


> [Trigger](Trigger) postProcessautomationTriggers(body)

Create a Trigger

Wraps POST /api/v2/processautomation/triggers  

Requires ANY permissions: 

* processautomation:trigger:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ProcessAutomationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ProcessAutomationApi apiInstance = new ProcessAutomationApi();
CreateTriggerRequest body = new CreateTriggerRequest(); // CreateTriggerRequest | Input used to create a Trigger.
try {
    Trigger result = apiInstance.postProcessautomationTriggers(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessAutomationApi#postProcessautomationTriggers");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**CreateTriggerRequest**](CreateTriggerRequest)| Input used to create a Trigger. | 
{: class="table-striped"}


### Return type

[**Trigger**](Trigger)


# **postProcessautomationTriggersTopicTest**


> [TestModeEventResults](TestModeEventResults) postProcessautomationTriggersTopicTest(topicName, body)

Test the matching of all organization Triggers on given topic using provided event body

Wraps POST /api/v2/processautomation/triggers/topics/{topicName}/test  

Requires ANY permissions: 

* processautomation:trigger:test

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ProcessAutomationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ProcessAutomationApi apiInstance = new ProcessAutomationApi();
String topicName = "topicName_example"; // String | topicName
String body = "body_example"; // String | eventBody
try {
    TestModeEventResults result = apiInstance.postProcessautomationTriggersTopicTest(topicName, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessAutomationApi#postProcessautomationTriggersTopicTest");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **topicName** | **String**| topicName | 
| **body** | **String**| eventBody | [optional] 
{: class="table-striped"}


### Return type

[**TestModeEventResults**](TestModeEventResults)


# **putProcessautomationTrigger**


> [Trigger](Trigger) putProcessautomationTrigger(triggerId, body)

Update a Trigger

Wraps PUT /api/v2/processautomation/triggers/{triggerId}  

Requires ANY permissions: 

* processautomation:trigger:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ProcessAutomationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ProcessAutomationApi apiInstance = new ProcessAutomationApi();
String triggerId = "triggerId_example"; // String | triggerId
UpdateTriggerRequest body = new UpdateTriggerRequest(); // UpdateTriggerRequest | Input to update Trigger. (topicName cannot be updated, a new trigger must be created to use a new topicName)
try {
    Trigger result = apiInstance.putProcessautomationTrigger(triggerId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessAutomationApi#putProcessautomationTrigger");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **triggerId** | **String**| triggerId | 
| **body** | [**UpdateTriggerRequest**](UpdateTriggerRequest)| Input to update Trigger. (topicName cannot be updated, a new trigger must be created to use a new topicName) | 
{: class="table-striped"}


### Return type

[**Trigger**](Trigger)


_com.mypurecloud.sdk.v2:platform-client-v2:214.0.0_
