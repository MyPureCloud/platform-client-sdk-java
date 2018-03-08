---
title: WorkforceManagementApi
---
## WorkforceManagementApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**getWorkforcemanagementAdherence**](WorkforceManagementApi.html#getWorkforcemanagementAdherence) | Get a list of UserScheduleAdherence records for the requested users |
| [**getWorkforcemanagementManagementunitActivitycodes**](WorkforceManagementApi.html#getWorkforcemanagementManagementunitActivitycodes) | Get activity codes |
| [**getWorkforcemanagementManagementunitIntradayQueues**](WorkforceManagementApi.html#getWorkforcemanagementManagementunitIntradayQueues) | Get intraday queues for the given date |
| [**getWorkforcemanagementManagementunitUserTimeoffrequest**](WorkforceManagementApi.html#getWorkforcemanagementManagementunitUserTimeoffrequest) | Get a time off request by id |
| [**getWorkforcemanagementManagementunitUserTimeoffrequests**](WorkforceManagementApi.html#getWorkforcemanagementManagementunitUserTimeoffrequests) | Get a list of time off requests for any user |
| [**getWorkforcemanagementManagementunitUsers**](WorkforceManagementApi.html#getWorkforcemanagementManagementunitUsers) | Get agents in the management unit |
| [**getWorkforcemanagementManagementunits**](WorkforceManagementApi.html#getWorkforcemanagementManagementunits) | Get management units |
| [**postWorkforcemanagementManagementunitActivitycodes**](WorkforceManagementApi.html#postWorkforcemanagementManagementunitActivitycodes) | Create a new activity code |
| [**postWorkforcemanagementManagementunitHistoricaladherencequery**](WorkforceManagementApi.html#postWorkforcemanagementManagementunitHistoricaladherencequery) | Request a historical adherence report |
| [**postWorkforcemanagementManagementunitIntraday**](WorkforceManagementApi.html#postWorkforcemanagementManagementunitIntraday) | Get intraday data for the given date for the requested queueIds |
| [**postWorkforcemanagementManagementunitSchedulesSearch**](WorkforceManagementApi.html#postWorkforcemanagementManagementunitSchedulesSearch) | Get user schedules within the given time range |
{: class="table table-striped"}

<a name="getWorkforcemanagementAdherence"></a>

# **getWorkforcemanagementAdherence**

> [List&lt;UserScheduleAdherence&gt;](UserScheduleAdherence.html) getWorkforcemanagementAdherence(userId)

Get a list of UserScheduleAdherence records for the requested users



Wraps GET /api/v2/workforcemanagement/adherence  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
List<String> userId = Arrays.asList("userId_example"); // List<String> | User Id(s) for which to fetch current schedule adherence information.  Min 1, Max of 100 userIds per request
try {
    List<UserScheduleAdherence> result = apiInstance.getWorkforcemanagementAdherence(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#getWorkforcemanagementAdherence");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | [**List&lt;String&gt;**](String.html)| User Id(s) for which to fetch current schedule adherence information.  Min 1, Max of 100 userIds per request | |
{: class="table table-striped"}

### Return type

[**List&lt;UserScheduleAdherence&gt;**](UserScheduleAdherence.html)

<a name="getWorkforcemanagementManagementunitActivitycodes"></a>

# **getWorkforcemanagementManagementunitActivitycodes**

> [ActivityCodeContainer](ActivityCodeContainer.html) getWorkforcemanagementManagementunitActivitycodes(muId)

Get activity codes



Wraps GET /api/v2/workforcemanagement/managementunits/{muId}/activitycodes  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String muId = "muId_example"; // String | The muId of the management unit, or 'mine' for the management unit of the logged-in user.
try {
    ActivityCodeContainer result = apiInstance.getWorkforcemanagementManagementunitActivitycodes(muId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#getWorkforcemanagementManagementunitActivitycodes");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **muId** | **String**| The muId of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. | |
{: class="table table-striped"}

### Return type

[**ActivityCodeContainer**](ActivityCodeContainer.html)

<a name="getWorkforcemanagementManagementunitIntradayQueues"></a>

# **getWorkforcemanagementManagementunitIntradayQueues**

> [WfmIntradayQueueListing](WfmIntradayQueueListing.html) getWorkforcemanagementManagementunitIntradayQueues(muId, date)

Get intraday queues for the given date



Wraps GET /api/v2/workforcemanagement/managementunits/{muId}/intraday/queues  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String muId = "muId_example"; // String | The muId of the management unit, or 'mine' for the management unit of the logged-in user.
String date = "date_example"; // String | ISO-8601 date string with no time or timezone component, interpreted in the configured management unit time zone, e.g. 2017-01-23
try {
    WfmIntradayQueueListing result = apiInstance.getWorkforcemanagementManagementunitIntradayQueues(muId, date);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#getWorkforcemanagementManagementunitIntradayQueues");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **muId** | **String**| The muId of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. | |
| **date** | **String**| ISO-8601 date string with no time or timezone component, interpreted in the configured management unit time zone, e.g. 2017-01-23 | |
{: class="table table-striped"}

### Return type

[**WfmIntradayQueueListing**](WfmIntradayQueueListing.html)

<a name="getWorkforcemanagementManagementunitUserTimeoffrequest"></a>

# **getWorkforcemanagementManagementunitUserTimeoffrequest**

> [TimeOffRequest](TimeOffRequest.html) getWorkforcemanagementManagementunitUserTimeoffrequest(muId, userId, timeOffRequestId)

Get a time off request by id



Wraps GET /api/v2/workforcemanagement/managementunits/{muId}/users/{userId}/timeoffrequests/{timeOffRequestId}  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String muId = "muId_example"; // String | The muId of the management unit, or 'mine' for the management unit of the logged-in user.
String userId = "userId_example"; // String | The userId to whom the Time Off Request applies.
String timeOffRequestId = "timeOffRequestId_example"; // String | Time Off Request Id
try {
    TimeOffRequest result = apiInstance.getWorkforcemanagementManagementunitUserTimeoffrequest(muId, userId, timeOffRequestId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#getWorkforcemanagementManagementunitUserTimeoffrequest");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **muId** | **String**| The muId of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. | |
| **userId** | **String**| The userId to whom the Time Off Request applies. | |
| **timeOffRequestId** | **String**| Time Off Request Id | |
{: class="table table-striped"}

### Return type

[**TimeOffRequest**](TimeOffRequest.html)

<a name="getWorkforcemanagementManagementunitUserTimeoffrequests"></a>

# **getWorkforcemanagementManagementunitUserTimeoffrequests**

> [TimeOffRequestList](TimeOffRequestList.html) getWorkforcemanagementManagementunitUserTimeoffrequests(muId, userId, recentlyReviewed)

Get a list of time off requests for any user



Wraps GET /api/v2/workforcemanagement/managementunits/{muId}/users/{userId}/timeoffrequests  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String muId = "muId_example"; // String | The muId of the management unit, or 'mine' for the management unit of the logged-in user.
String userId = "userId_example"; // String | The userId to whom the Time Off Request applies.
Boolean recentlyReviewed = false; // Boolean | Limit results to requests that have been reviewed within the preceding 30 days
try {
    TimeOffRequestList result = apiInstance.getWorkforcemanagementManagementunitUserTimeoffrequests(muId, userId, recentlyReviewed);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#getWorkforcemanagementManagementunitUserTimeoffrequests");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **muId** | **String**| The muId of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. | |
| **userId** | **String**| The userId to whom the Time Off Request applies. | |
| **recentlyReviewed** | **Boolean**| Limit results to requests that have been reviewed within the preceding 30 days | [optional] [default to false] |
{: class="table table-striped"}

### Return type

[**TimeOffRequestList**](TimeOffRequestList.html)

<a name="getWorkforcemanagementManagementunitUsers"></a>

# **getWorkforcemanagementManagementunitUsers**

> [WfmUserEntityListing](WfmUserEntityListing.html) getWorkforcemanagementManagementunitUsers(muId)

Get agents in the management unit



Wraps GET /api/v2/workforcemanagement/managementunits/{muId}/users  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String muId = "muId_example"; // String | The muId of the management unit, or 'mine' for the management unit of the logged-in user.
try {
    WfmUserEntityListing result = apiInstance.getWorkforcemanagementManagementunitUsers(muId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#getWorkforcemanagementManagementunitUsers");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **muId** | **String**| The muId of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. | |
{: class="table table-striped"}

### Return type

[**WfmUserEntityListing**](WfmUserEntityListing.html)

<a name="getWorkforcemanagementManagementunits"></a>

# **getWorkforcemanagementManagementunits**

> [ManagementUnitListing](ManagementUnitListing.html) getWorkforcemanagementManagementunits(pageSize, pageNumber, expand)

Get management units



Wraps GET /api/v2/workforcemanagement/managementunits  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
Integer pageSize = 56; // Integer | 
Integer pageNumber = 1; // Integer | 
String expand = "expand_example"; // String | 
try {
    ManagementUnitListing result = apiInstance.getWorkforcemanagementManagementunits(pageSize, pageNumber, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#getWorkforcemanagementManagementunits");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**|  | [optional] |
| **pageNumber** | **Integer**|  | [optional] [default to 1] |
| **expand** | **String**|  | [optional]<br />**Values**: details |
{: class="table table-striped"}

### Return type

[**ManagementUnitListing**](ManagementUnitListing.html)

<a name="postWorkforcemanagementManagementunitActivitycodes"></a>

# **postWorkforcemanagementManagementunitActivitycodes**

> [ActivityCode](ActivityCode.html) postWorkforcemanagementManagementunitActivitycodes(muId, body)

Create a new activity code



Wraps POST /api/v2/workforcemanagement/managementunits/{muId}/activitycodes  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String muId = "muId_example"; // String | The muId of the management unit, or 'mine' for the management unit of the logged-in user.
CreateActivityCodeRequest body = new CreateActivityCodeRequest(); // CreateActivityCodeRequest | body
try {
    ActivityCode result = apiInstance.postWorkforcemanagementManagementunitActivitycodes(muId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#postWorkforcemanagementManagementunitActivitycodes");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **muId** | **String**| The muId of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. | |
| **body** | [**CreateActivityCodeRequest**](CreateActivityCodeRequest.html)| body | [optional] |
{: class="table table-striped"}

### Return type

[**ActivityCode**](ActivityCode.html)

<a name="postWorkforcemanagementManagementunitHistoricaladherencequery"></a>

# **postWorkforcemanagementManagementunitHistoricaladherencequery**

> [WfmHistoricalAdherenceResponse](WfmHistoricalAdherenceResponse.html) postWorkforcemanagementManagementunitHistoricaladherencequery(muId, body)

Request a historical adherence report



Wraps POST /api/v2/workforcemanagement/managementunits/{muId}/historicaladherencequery  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String muId = "muId_example"; // String | The muId of the management unit, or 'mine' for the management unit of the logged-in user.
WfmHistoricalAdherenceQuery body = new WfmHistoricalAdherenceQuery(); // WfmHistoricalAdherenceQuery | body
try {
    WfmHistoricalAdherenceResponse result = apiInstance.postWorkforcemanagementManagementunitHistoricaladherencequery(muId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#postWorkforcemanagementManagementunitHistoricaladherencequery");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **muId** | **String**| The muId of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. | |
| **body** | [**WfmHistoricalAdherenceQuery**](WfmHistoricalAdherenceQuery.html)| body | [optional] |
{: class="table table-striped"}

### Return type

[**WfmHistoricalAdherenceResponse**](WfmHistoricalAdherenceResponse.html)

<a name="postWorkforcemanagementManagementunitIntraday"></a>

# **postWorkforcemanagementManagementunitIntraday**

> [IntradayResponse](IntradayResponse.html) postWorkforcemanagementManagementunitIntraday(muId, body)

Get intraday data for the given date for the requested queueIds



Wraps POST /api/v2/workforcemanagement/managementunits/{muId}/intraday  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String muId = "muId_example"; // String | The muId of the management unit, or 'mine' for the management unit of the logged-in user.
IntradayQueryDataCommand body = new IntradayQueryDataCommand(); // IntradayQueryDataCommand | body
try {
    IntradayResponse result = apiInstance.postWorkforcemanagementManagementunitIntraday(muId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#postWorkforcemanagementManagementunitIntraday");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **muId** | **String**| The muId of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. | |
| **body** | [**IntradayQueryDataCommand**](IntradayQueryDataCommand.html)| body | [optional] |
{: class="table table-striped"}

### Return type

[**IntradayResponse**](IntradayResponse.html)

<a name="postWorkforcemanagementManagementunitSchedulesSearch"></a>

# **postWorkforcemanagementManagementunitSchedulesSearch**

> [UserScheduleContainer](UserScheduleContainer.html) postWorkforcemanagementManagementunitSchedulesSearch(muId, body)

Get user schedules within the given time range



Wraps POST /api/v2/workforcemanagement/managementunits/{muId}/schedules/search  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String muId = "muId_example"; // String | The muId of the management unit, or 'mine' for the management unit of the logged-in user.
UserListScheduleRequestBody body = new UserListScheduleRequestBody(); // UserListScheduleRequestBody | body
try {
    UserScheduleContainer result = apiInstance.postWorkforcemanagementManagementunitSchedulesSearch(muId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#postWorkforcemanagementManagementunitSchedulesSearch");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **muId** | **String**| The muId of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. | |
| **body** | [**UserListScheduleRequestBody**](UserListScheduleRequestBody.html)| body | [optional] |
{: class="table table-striped"}

### Return type

[**UserScheduleContainer**](UserScheduleContainer.html)

