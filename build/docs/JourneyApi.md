---
title: JourneyApi
---
## JourneyApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**deleteJourneyActionmap**](JourneyApi.html#deleteJourneyActionmap) | Delete single action map. |
| [**deleteJourneyActiontemplate**](JourneyApi.html#deleteJourneyActiontemplate) | Delete a single action template. |
| [**deleteJourneyOutcome**](JourneyApi.html#deleteJourneyOutcome) | Delete an outcome. |
| [**deleteJourneySegment**](JourneyApi.html#deleteJourneySegment) | Delete a segment. |
| [**getJourneyActionmap**](JourneyApi.html#getJourneyActionmap) | Retrieve a single action map. |
| [**getJourneyActionmaps**](JourneyApi.html#getJourneyActionmaps) | Retrieve all action maps. |
| [**getJourneyActiontarget**](JourneyApi.html#getJourneyActiontarget) | Retrieve a single action target. |
| [**getJourneyActiontargets**](JourneyApi.html#getJourneyActiontargets) | Retrieve all action targets. |
| [**getJourneyActiontemplate**](JourneyApi.html#getJourneyActiontemplate) | Retrieve a single action template. |
| [**getJourneyActiontemplates**](JourneyApi.html#getJourneyActiontemplates) | Retrieve all action templates. |
| [**getJourneyOutcome**](JourneyApi.html#getJourneyOutcome) | Retrieve a single outcome. |
| [**getJourneyOutcomes**](JourneyApi.html#getJourneyOutcomes) | Retrieve all outcomes. |
| [**getJourneySegment**](JourneyApi.html#getJourneySegment) | Retrieve a single segment. |
| [**getJourneySegments**](JourneyApi.html#getJourneySegments) | Retrieve all segments. |
| [**getJourneySession**](JourneyApi.html#getJourneySession) | Retrieve a single session. |
| [**getJourneySessionOutcomescores**](JourneyApi.html#getJourneySessionOutcomescores) | Retrieve latest outcome score associated with a session for all outcomes. |
| [**patchJourneyActionmap**](JourneyApi.html#patchJourneyActionmap) | Update single action map. |
| [**patchJourneyActiontarget**](JourneyApi.html#patchJourneyActiontarget) | Update a single action target. |
| [**patchJourneyActiontemplate**](JourneyApi.html#patchJourneyActiontemplate) | Update a single action template. |
| [**patchJourneyOutcome**](JourneyApi.html#patchJourneyOutcome) | Update an outcome. |
| [**patchJourneySegment**](JourneyApi.html#patchJourneySegment) | Update a segment. |
| [**postAnalyticsJourneysAggregatesQuery**](JourneyApi.html#postAnalyticsJourneysAggregatesQuery) | Query for journey aggregates |
| [**postJourneyActionmaps**](JourneyApi.html#postJourneyActionmaps) | Create an action map. |
| [**postJourneyActiontemplates**](JourneyApi.html#postJourneyActiontemplates) | Create a single action template. |
| [**postJourneyOutcomes**](JourneyApi.html#postJourneyOutcomes) | Create an outcome. |
| [**postJourneySegments**](JourneyApi.html#postJourneySegments) | Create a segment. |
{: class="table-striped"}

<a name="deleteJourneyActionmap"></a>

# **deleteJourneyActionmap**



> Void deleteJourneyActionmap(actionMapId)

Delete single action map.

Wraps DELETE /api/v2/journey/actionmaps/{actionMapId}  

Requires ANY permissions: 

* journey:actionmap:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.JourneyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

JourneyApi apiInstance = new JourneyApi();
String actionMapId = "actionMapId_example"; // String | ID of the action map.
try {
    apiInstance.deleteJourneyActionmap(actionMapId);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#deleteJourneyActionmap");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **actionMapId** | **String**| ID of the action map. | 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="deleteJourneyActiontemplate"></a>

# **deleteJourneyActiontemplate**



> Void deleteJourneyActiontemplate(actionTemplateId, hardDelete)

Delete a single action template.

Wraps DELETE /api/v2/journey/actiontemplates/{actionTemplateId}  

Requires ANY permissions: 

* journey:actiontemplate:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.JourneyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

JourneyApi apiInstance = new JourneyApi();
String actionTemplateId = "actionTemplateId_example"; // String | ID of the action template.
Boolean hardDelete = true; // Boolean | Determines whether Action Template should be soft-deleted (have it's state set to deleted) or hard-deleted (permanently removed). Set to false (soft-delete) by default.
try {
    apiInstance.deleteJourneyActiontemplate(actionTemplateId, hardDelete);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#deleteJourneyActiontemplate");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **actionTemplateId** | **String**| ID of the action template. | 
| **hardDelete** | **Boolean**| Determines whether Action Template should be soft-deleted (have it&#39;s state set to deleted) or hard-deleted (permanently removed). Set to false (soft-delete) by default. | [optional] 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="deleteJourneyOutcome"></a>

# **deleteJourneyOutcome**



> Void deleteJourneyOutcome(outcomeId)

Delete an outcome.

Wraps DELETE /api/v2/journey/outcomes/{outcomeId}  

Requires ANY permissions: 

* journey:outcome:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.JourneyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

JourneyApi apiInstance = new JourneyApi();
String outcomeId = "outcomeId_example"; // String | ID of the outcome.
try {
    apiInstance.deleteJourneyOutcome(outcomeId);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#deleteJourneyOutcome");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **outcomeId** | **String**| ID of the outcome. | 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="deleteJourneySegment"></a>

# **deleteJourneySegment**



> Void deleteJourneySegment(segmentId)

Delete a segment.

Wraps DELETE /api/v2/journey/segments/{segmentId}  

Requires ANY permissions: 

* journey:segment:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.JourneyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

JourneyApi apiInstance = new JourneyApi();
String segmentId = "segmentId_example"; // String | ID of the segment.
try {
    apiInstance.deleteJourneySegment(segmentId);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#deleteJourneySegment");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **segmentId** | **String**| ID of the segment. | 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="getJourneyActionmap"></a>

# **getJourneyActionmap**



> [ActionMap](ActionMap.html) getJourneyActionmap(actionMapId)

Retrieve a single action map.

Wraps GET /api/v2/journey/actionmaps/{actionMapId}  

Requires ANY permissions: 

* journey:actionmap:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.JourneyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

JourneyApi apiInstance = new JourneyApi();
String actionMapId = "actionMapId_example"; // String | ID of the action map.
try {
    ActionMap result = apiInstance.getJourneyActionmap(actionMapId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#getJourneyActionmap");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **actionMapId** | **String**| ID of the action map. | 
{: class="table-striped"}


### Return type

[**ActionMap**](ActionMap.html)

<a name="getJourneyActionmaps"></a>

# **getJourneyActionmaps**



> [ActionMapListing](ActionMapListing.html) getJourneyActionmaps(pageNumber, pageSize, sortBy, filterField, filterValue, actionMapIds, queryFields, queryValue)

Retrieve all action maps.

Wraps GET /api/v2/journey/actionmaps  

Requires ANY permissions: 

* journey:actionmap:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.JourneyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

JourneyApi apiInstance = new JourneyApi();
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
String sortBy = "sortBy_example"; // String | Field(s) to sort by. Prefix with '-' for descending (e.g. sortBy=displayName,-createdDate).
String filterField = "filterField_example"; // String | Field to filter by (e.g. filterField=weight or filterField=action.actionTemplate.id). Requires 'filterField' to also be set.
String filterValue = "filterValue_example"; // String | Value to filter by. Requires 'filterValue' to also be set.
List<String> actionMapIds = Arrays.asList(null); // List<String> | IDs of action maps to return. Use of this parameter is not compatible with pagination, filtering, sorting or querying. A maximum of 100 action maps are allowed per request.
List<String> queryFields = Arrays.asList(null); // List<String> | Action Map field(s) to query on. Requires 'queryValue' to also be set.
String queryValue = "queryValue_example"; // String | Value to query on. Requires 'queryFields' to also be set.
try {
    ActionMapListing result = apiInstance.getJourneyActionmaps(pageNumber, pageSize, sortBy, filterField, filterValue, actionMapIds, queryFields, queryValue);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#getJourneyActionmaps");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **sortBy** | **String**| Field(s) to sort by. Prefix with &#39;-&#39; for descending (e.g. sortBy&#x3D;displayName,-createdDate). | [optional] 
| **filterField** | **String**| Field to filter by (e.g. filterField&#x3D;weight or filterField&#x3D;action.actionTemplate.id). Requires &#39;filterField&#39; to also be set. | [optional] 
| **filterValue** | **String**| Value to filter by. Requires &#39;filterValue&#39; to also be set. | [optional] 
| **actionMapIds** | [**List&lt;String&gt;**](String.html)| IDs of action maps to return. Use of this parameter is not compatible with pagination, filtering, sorting or querying. A maximum of 100 action maps are allowed per request. | [optional] 
| **queryFields** | [**List&lt;String&gt;**](String.html)| Action Map field(s) to query on. Requires &#39;queryValue&#39; to also be set. | [optional] 
| **queryValue** | **String**| Value to query on. Requires &#39;queryFields&#39; to also be set. | [optional] 
{: class="table-striped"}


### Return type

[**ActionMapListing**](ActionMapListing.html)

<a name="getJourneyActiontarget"></a>

# **getJourneyActiontarget**



> [ActionTarget](ActionTarget.html) getJourneyActiontarget(actionTargetId)

Retrieve a single action target.

Wraps GET /api/v2/journey/actiontargets/{actionTargetId}  

Requires ANY permissions: 

* journey:actiontarget:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.JourneyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

JourneyApi apiInstance = new JourneyApi();
String actionTargetId = "actionTargetId_example"; // String | ID of the action target.
try {
    ActionTarget result = apiInstance.getJourneyActiontarget(actionTargetId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#getJourneyActiontarget");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **actionTargetId** | **String**| ID of the action target. | 
{: class="table-striped"}


### Return type

[**ActionTarget**](ActionTarget.html)

<a name="getJourneyActiontargets"></a>

# **getJourneyActiontargets**



> [ActionTargetListing](ActionTargetListing.html) getJourneyActiontargets(pageNumber, pageSize)

Retrieve all action targets.

Wraps GET /api/v2/journey/actiontargets  

Requires ANY permissions: 

* journey:actiontarget:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.JourneyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

JourneyApi apiInstance = new JourneyApi();
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
try {
    ActionTargetListing result = apiInstance.getJourneyActiontargets(pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#getJourneyActiontargets");
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

[**ActionTargetListing**](ActionTargetListing.html)

<a name="getJourneyActiontemplate"></a>

# **getJourneyActiontemplate**



> [ActionTemplate](ActionTemplate.html) getJourneyActiontemplate(actionTemplateId)

Retrieve a single action template.

Wraps GET /api/v2/journey/actiontemplates/{actionTemplateId}  

Requires ANY permissions: 

* journey:actiontemplate:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.JourneyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

JourneyApi apiInstance = new JourneyApi();
String actionTemplateId = "actionTemplateId_example"; // String | ID of the action template.
try {
    ActionTemplate result = apiInstance.getJourneyActiontemplate(actionTemplateId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#getJourneyActiontemplate");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **actionTemplateId** | **String**| ID of the action template. | 
{: class="table-striped"}


### Return type

[**ActionTemplate**](ActionTemplate.html)

<a name="getJourneyActiontemplates"></a>

# **getJourneyActiontemplates**



> [ActionTemplateListing](ActionTemplateListing.html) getJourneyActiontemplates(pageNumber, pageSize, sortBy, mediaType, state, queryFields, queryValue)

Retrieve all action templates.

Wraps GET /api/v2/journey/actiontemplates  

Requires ANY permissions: 

* journey:actiontemplate:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.JourneyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

JourneyApi apiInstance = new JourneyApi();
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
String sortBy = "sortBy_example"; // String | Field(s) to sort by. Prefix with '-' for descending (e.g. sortBy=name,-createdDate).
String mediaType = "mediaType_example"; // String | Media type
String state = "state_example"; // String | Action template state.
List<String> queryFields = Arrays.asList(null); // List<String> | ActionTemplate field(s) to query on. Requires 'queryValue' to also be set.
String queryValue = "queryValue_example"; // String | Value to query on. Requires 'queryFields' to also be set.
try {
    ActionTemplateListing result = apiInstance.getJourneyActiontemplates(pageNumber, pageSize, sortBy, mediaType, state, queryFields, queryValue);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#getJourneyActiontemplates");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **sortBy** | **String**| Field(s) to sort by. Prefix with &#39;-&#39; for descending (e.g. sortBy&#x3D;name,-createdDate). | [optional] 
| **mediaType** | **String**| Media type | [optional]<br />**Values**: webchat, webMessagingOffer, contentOffer, integrationAction, architectFlow, openAction 
| **state** | **String**| Action template state. | [optional]<br />**Values**: Active, Inactive, Deleted 
| **queryFields** | [**List&lt;String&gt;**](String.html)| ActionTemplate field(s) to query on. Requires &#39;queryValue&#39; to also be set. | [optional] 
| **queryValue** | **String**| Value to query on. Requires &#39;queryFields&#39; to also be set. | [optional] 
{: class="table-striped"}


### Return type

[**ActionTemplateListing**](ActionTemplateListing.html)

<a name="getJourneyOutcome"></a>

# **getJourneyOutcome**



> [Outcome](Outcome.html) getJourneyOutcome(outcomeId)

Retrieve a single outcome.

Wraps GET /api/v2/journey/outcomes/{outcomeId}  

Requires ANY permissions: 

* journey:outcome:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.JourneyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

JourneyApi apiInstance = new JourneyApi();
String outcomeId = "outcomeId_example"; // String | ID of the outcome.
try {
    Outcome result = apiInstance.getJourneyOutcome(outcomeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#getJourneyOutcome");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **outcomeId** | **String**| ID of the outcome. | 
{: class="table-striped"}


### Return type

[**Outcome**](Outcome.html)

<a name="getJourneyOutcomes"></a>

# **getJourneyOutcomes**



> [OutcomeListing](OutcomeListing.html) getJourneyOutcomes(pageNumber, pageSize, sortBy, outcomeIds, queryFields, queryValue)

Retrieve all outcomes.

Wraps GET /api/v2/journey/outcomes  

Requires ANY permissions: 

* journey:outcome:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.JourneyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

JourneyApi apiInstance = new JourneyApi();
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
String sortBy = "sortBy_example"; // String | Field(s) to sort by. The response can be sorted by any first level property on the Outcome response. Prefix with '-' for descending (e.g. sortBy=displayName,-createdDate).
List<String> outcomeIds = Arrays.asList(null); // List<String> | IDs of outcomes to return. Use of this parameter is not compatible with pagination, sorting or querying. A maximum of 20 outcomes are allowed per request.
List<String> queryFields = Arrays.asList(null); // List<String> | Outcome field(s) to query on. Requires 'queryValue' to also be set.
String queryValue = "queryValue_example"; // String | Value to query on. Requires 'queryFields' to also be set.
try {
    OutcomeListing result = apiInstance.getJourneyOutcomes(pageNumber, pageSize, sortBy, outcomeIds, queryFields, queryValue);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#getJourneyOutcomes");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **sortBy** | **String**| Field(s) to sort by. The response can be sorted by any first level property on the Outcome response. Prefix with &#39;-&#39; for descending (e.g. sortBy&#x3D;displayName,-createdDate). | [optional] 
| **outcomeIds** | [**List&lt;String&gt;**](String.html)| IDs of outcomes to return. Use of this parameter is not compatible with pagination, sorting or querying. A maximum of 20 outcomes are allowed per request. | [optional] 
| **queryFields** | [**List&lt;String&gt;**](String.html)| Outcome field(s) to query on. Requires &#39;queryValue&#39; to also be set. | [optional] 
| **queryValue** | **String**| Value to query on. Requires &#39;queryFields&#39; to also be set. | [optional] 
{: class="table-striped"}


### Return type

[**OutcomeListing**](OutcomeListing.html)

<a name="getJourneySegment"></a>

# **getJourneySegment**



> [JourneySegment](JourneySegment.html) getJourneySegment(segmentId)

Retrieve a single segment.

Wraps GET /api/v2/journey/segments/{segmentId}  

Requires ANY permissions: 

* journey:segment:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.JourneyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

JourneyApi apiInstance = new JourneyApi();
String segmentId = "segmentId_example"; // String | ID of the segment.
try {
    JourneySegment result = apiInstance.getJourneySegment(segmentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#getJourneySegment");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **segmentId** | **String**| ID of the segment. | 
{: class="table-striped"}


### Return type

[**JourneySegment**](JourneySegment.html)

<a name="getJourneySegments"></a>

# **getJourneySegments**



> [SegmentListing](SegmentListing.html) getJourneySegments(sortBy, pageSize, pageNumber, isActive, segmentIds, queryFields, queryValue)

Retrieve all segments.

Wraps GET /api/v2/journey/segments  

Requires ANY permissions: 

* journey:segment:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.JourneyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

JourneyApi apiInstance = new JourneyApi();
String sortBy = "sortBy_example"; // String | Field(s) to sort by. The response can be sorted by any first level property on the Outcome response. Prefix with '-' for descending (e.g. sortBy=displayName,-createdDate).
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
Boolean isActive = true; // Boolean | Determines whether or not to show only active segments.
List<String> segmentIds = Arrays.asList(null); // List<String> | IDs of segments to return. Use of this parameter is not compatible with pagination, sorting or querying. A maximum of 100 segments are allowed per request.
List<String> queryFields = Arrays.asList(null); // List<String> | Segment field(s) to query on. Requires 'queryValue' to also be set.
String queryValue = "queryValue_example"; // String | Value to query on. Requires 'queryFields' to also be set.
try {
    SegmentListing result = apiInstance.getJourneySegments(sortBy, pageSize, pageNumber, isActive, segmentIds, queryFields, queryValue);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#getJourneySegments");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sortBy** | **String**| Field(s) to sort by. The response can be sorted by any first level property on the Outcome response. Prefix with &#39;-&#39; for descending (e.g. sortBy&#x3D;displayName,-createdDate). | [optional] 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **isActive** | **Boolean**| Determines whether or not to show only active segments. | [optional] 
| **segmentIds** | [**List&lt;String&gt;**](String.html)| IDs of segments to return. Use of this parameter is not compatible with pagination, sorting or querying. A maximum of 100 segments are allowed per request. | [optional] 
| **queryFields** | [**List&lt;String&gt;**](String.html)| Segment field(s) to query on. Requires &#39;queryValue&#39; to also be set. | [optional] 
| **queryValue** | **String**| Value to query on. Requires &#39;queryFields&#39; to also be set. | [optional] 
{: class="table-striped"}


### Return type

[**SegmentListing**](SegmentListing.html)

<a name="getJourneySession"></a>

# **getJourneySession**



> [Session](Session.html) getJourneySession(sessionId)

Retrieve a single session.

Wraps GET /api/v2/journey/sessions/{sessionId}  

Requires ANY permissions: 

* journey:session:view
* externalContacts:session:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.JourneyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

JourneyApi apiInstance = new JourneyApi();
String sessionId = "sessionId_example"; // String | ID of the session.
try {
    Session result = apiInstance.getJourneySession(sessionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#getJourneySession");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sessionId** | **String**| ID of the session. | 
{: class="table-striped"}


### Return type

[**Session**](Session.html)

<a name="getJourneySessionOutcomescores"></a>

# **getJourneySessionOutcomescores**



> [OutcomeScoresResult](OutcomeScoresResult.html) getJourneySessionOutcomescores(sessionId)

Retrieve latest outcome score associated with a session for all outcomes.

Wraps GET /api/v2/journey/sessions/{sessionId}/outcomescores  

Requires ANY permissions: 

* journey:outcomescores:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.JourneyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

JourneyApi apiInstance = new JourneyApi();
String sessionId = "sessionId_example"; // String | ID of the session.
try {
    OutcomeScoresResult result = apiInstance.getJourneySessionOutcomescores(sessionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#getJourneySessionOutcomescores");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sessionId** | **String**| ID of the session. | 
{: class="table-striped"}


### Return type

[**OutcomeScoresResult**](OutcomeScoresResult.html)

<a name="patchJourneyActionmap"></a>

# **patchJourneyActionmap**



> [ActionMap](ActionMap.html) patchJourneyActionmap(actionMapId, body)

Update single action map.

Wraps PATCH /api/v2/journey/actionmaps/{actionMapId}  

Requires ANY permissions: 

* journey:actionmap:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.JourneyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

JourneyApi apiInstance = new JourneyApi();
String actionMapId = "actionMapId_example"; // String | ID of the action map.
PatchActionMap body = new PatchActionMap(); // PatchActionMap | 
try {
    ActionMap result = apiInstance.patchJourneyActionmap(actionMapId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#patchJourneyActionmap");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **actionMapId** | **String**| ID of the action map. | 
| **body** | [**PatchActionMap**](PatchActionMap.html)|  | [optional] 
{: class="table-striped"}


### Return type

[**ActionMap**](ActionMap.html)

<a name="patchJourneyActiontarget"></a>

# **patchJourneyActiontarget**



> [ActionTarget](ActionTarget.html) patchJourneyActiontarget(actionTargetId, body)

Update a single action target.

Wraps PATCH /api/v2/journey/actiontargets/{actionTargetId}  

Requires ANY permissions: 

* journey:actiontarget:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.JourneyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

JourneyApi apiInstance = new JourneyApi();
String actionTargetId = "actionTargetId_example"; // String | ID of the action target.
PatchActionTarget body = new PatchActionTarget(); // PatchActionTarget | 
try {
    ActionTarget result = apiInstance.patchJourneyActiontarget(actionTargetId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#patchJourneyActiontarget");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **actionTargetId** | **String**| ID of the action target. | 
| **body** | [**PatchActionTarget**](PatchActionTarget.html)|  | [optional] 
{: class="table-striped"}


### Return type

[**ActionTarget**](ActionTarget.html)

<a name="patchJourneyActiontemplate"></a>

# **patchJourneyActiontemplate**



> [ActionTemplate](ActionTemplate.html) patchJourneyActiontemplate(actionTemplateId, body)

Update a single action template.

Wraps PATCH /api/v2/journey/actiontemplates/{actionTemplateId}  

Requires ANY permissions: 

* journey:actiontemplate:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.JourneyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

JourneyApi apiInstance = new JourneyApi();
String actionTemplateId = "actionTemplateId_example"; // String | ID of the action template.
PatchActionTemplate body = new PatchActionTemplate(); // PatchActionTemplate | 
try {
    ActionTemplate result = apiInstance.patchJourneyActiontemplate(actionTemplateId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#patchJourneyActiontemplate");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **actionTemplateId** | **String**| ID of the action template. | 
| **body** | [**PatchActionTemplate**](PatchActionTemplate.html)|  | [optional] 
{: class="table-striped"}


### Return type

[**ActionTemplate**](ActionTemplate.html)

<a name="patchJourneyOutcome"></a>

# **patchJourneyOutcome**



> [Outcome](Outcome.html) patchJourneyOutcome(outcomeId, body)

Update an outcome.

Wraps PATCH /api/v2/journey/outcomes/{outcomeId}  

Requires ANY permissions: 

* journey:outcome:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.JourneyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

JourneyApi apiInstance = new JourneyApi();
String outcomeId = "outcomeId_example"; // String | ID of the outcome.
PatchOutcome body = new PatchOutcome(); // PatchOutcome | 
try {
    Outcome result = apiInstance.patchJourneyOutcome(outcomeId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#patchJourneyOutcome");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **outcomeId** | **String**| ID of the outcome. | 
| **body** | [**PatchOutcome**](PatchOutcome.html)|  | [optional] 
{: class="table-striped"}


### Return type

[**Outcome**](Outcome.html)

<a name="patchJourneySegment"></a>

# **patchJourneySegment**



> [JourneySegment](JourneySegment.html) patchJourneySegment(segmentId, body)

Update a segment.

Wraps PATCH /api/v2/journey/segments/{segmentId}  

Requires ANY permissions: 

* journey:segment:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.JourneyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

JourneyApi apiInstance = new JourneyApi();
String segmentId = "segmentId_example"; // String | ID of the segment.
PatchSegment body = new PatchSegment(); // PatchSegment | 
try {
    JourneySegment result = apiInstance.patchJourneySegment(segmentId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#patchJourneySegment");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **segmentId** | **String**| ID of the segment. | 
| **body** | [**PatchSegment**](PatchSegment.html)|  | [optional] 
{: class="table-striped"}


### Return type

[**JourneySegment**](JourneySegment.html)

<a name="postAnalyticsJourneysAggregatesQuery"></a>

# **postAnalyticsJourneysAggregatesQuery**



> [JourneyAggregateQueryResponse](JourneyAggregateQueryResponse.html) postAnalyticsJourneysAggregatesQuery(body)

Query for journey aggregates

Wraps POST /api/v2/analytics/journeys/aggregates/query  

Requires ANY permissions: 

* analytics:journeyAggregate:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.JourneyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

JourneyApi apiInstance = new JourneyApi();
JourneyAggregationQuery body = new JourneyAggregationQuery(); // JourneyAggregationQuery | query
try {
    JourneyAggregateQueryResponse result = apiInstance.postAnalyticsJourneysAggregatesQuery(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#postAnalyticsJourneysAggregatesQuery");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**JourneyAggregationQuery**](JourneyAggregationQuery.html)| query | 
{: class="table-striped"}


### Return type

[**JourneyAggregateQueryResponse**](JourneyAggregateQueryResponse.html)

<a name="postJourneyActionmaps"></a>

# **postJourneyActionmaps**



> [ActionMap](ActionMap.html) postJourneyActionmaps(body)

Create an action map.

Wraps POST /api/v2/journey/actionmaps  

Requires ANY permissions: 

* journey:actionmap:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.JourneyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

JourneyApi apiInstance = new JourneyApi();
ActionMap body = new ActionMap(); // ActionMap | 
try {
    ActionMap result = apiInstance.postJourneyActionmaps(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#postJourneyActionmaps");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**ActionMap**](ActionMap.html)|  | [optional] 
{: class="table-striped"}


### Return type

[**ActionMap**](ActionMap.html)

<a name="postJourneyActiontemplates"></a>

# **postJourneyActiontemplates**



> [ActionTemplate](ActionTemplate.html) postJourneyActiontemplates(body)

Create a single action template.

Wraps POST /api/v2/journey/actiontemplates  

Requires ANY permissions: 

* journey:actiontemplate:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.JourneyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

JourneyApi apiInstance = new JourneyApi();
ActionTemplate body = new ActionTemplate(); // ActionTemplate | 
try {
    ActionTemplate result = apiInstance.postJourneyActiontemplates(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#postJourneyActiontemplates");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**ActionTemplate**](ActionTemplate.html)|  | [optional] 
{: class="table-striped"}


### Return type

[**ActionTemplate**](ActionTemplate.html)

<a name="postJourneyOutcomes"></a>

# **postJourneyOutcomes**



> [Outcome](Outcome.html) postJourneyOutcomes(body)

Create an outcome.

Wraps POST /api/v2/journey/outcomes  

Requires ANY permissions: 

* journey:outcome:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.JourneyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

JourneyApi apiInstance = new JourneyApi();
Outcome body = new Outcome(); // Outcome | 
try {
    Outcome result = apiInstance.postJourneyOutcomes(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#postJourneyOutcomes");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**Outcome**](Outcome.html)|  | [optional] 
{: class="table-striped"}


### Return type

[**Outcome**](Outcome.html)

<a name="postJourneySegments"></a>

# **postJourneySegments**



> [JourneySegment](JourneySegment.html) postJourneySegments(body)

Create a segment.

Wraps POST /api/v2/journey/segments  

Requires ANY permissions: 

* journey:segment:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.JourneyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

JourneyApi apiInstance = new JourneyApi();
JourneySegment body = new JourneySegment(); // JourneySegment | 
try {
    JourneySegment result = apiInstance.postJourneySegments(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#postJourneySegments");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**JourneySegment**](JourneySegment.html)|  | [optional] 
{: class="table-striped"}


### Return type

[**JourneySegment**](JourneySegment.html)

