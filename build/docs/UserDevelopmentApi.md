---
title: UserDevelopmentApi
---
## UserDevelopmentApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**getUsersDevelopmentActivities**](UserDevelopmentApi.html#getUsersDevelopmentActivities) | Get list of Development Activities |
| [**getUsersDevelopmentActivitiesMe**](UserDevelopmentApi.html#getUsersDevelopmentActivitiesMe) | Get list of Development Activities for current user |
| [**getUsersDevelopmentActivity**](UserDevelopmentApi.html#getUsersDevelopmentActivity) | Get a Development Activity |
| [**postUsersDevelopmentActivitiesAggregatesQuery**](UserDevelopmentApi.html#postUsersDevelopmentActivitiesAggregatesQuery) | Retrieve aggregated development activity data |
{: class="table-striped"}

<a name="getUsersDevelopmentActivities"></a>

# **getUsersDevelopmentActivities**



> [DevelopmentActivityListing](DevelopmentActivityListing.html) getUsersDevelopmentActivities(userId, moduleId, interval, completionInterval, overdue, pageSize, pageNumber, sortOrder, types, statuses, relationship)

Get list of Development Activities

Either moduleId or userId is required. Results are filtered based on the applicable permissions.

Wraps GET /api/v2/users/development/activities  

Requires ANY permissions: 

* learning:assignment:view
* coaching:appointment:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UserDevelopmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UserDevelopmentApi apiInstance = new UserDevelopmentApi();
List<String> userId = Arrays.asList("userId_example"); // List<String> | Specifies the list of user IDs to be queried, up to 100 user IDs. It searches for any relationship for the userId.
String moduleId = "moduleId_example"; // String | Specifies the ID of the learning module.
String interval = "interval_example"; // String | Specifies the dateDue range to be queried. Milliseconds will be truncated. A maximum of 1 year can be specified in the range. End date is not inclusive. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss
String completionInterval = "completionInterval_example"; // String | Specifies the range of completion dates to be used for filtering. A maximum of 1 year can be specified in the range. End date is not inclusive. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss
String overdue = "Any"; // String | Specifies if non-overdue, overdue, or all activities are returned. If not specified, all activities are returned
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String sortOrder = "Desc"; // String | Specifies result set sort order sorted by the date due; if not specified, default sort order is descending (Desc)
List<String> types = Arrays.asList("types_example"); // List<String> | Specifies the activity types.
List<String> statuses = Arrays.asList("statuses_example"); // List<String> | Specifies the activity statuses to filter by
List<String> relationship = Arrays.asList("relationship_example"); // List<String> | Specifies how the current user relation should be interpreted, and filters the activities returned to only those that have the specified relationship. If not specified, all relationships are returned.
try {
    DevelopmentActivityListing result = apiInstance.getUsersDevelopmentActivities(userId, moduleId, interval, completionInterval, overdue, pageSize, pageNumber, sortOrder, types, statuses, relationship);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserDevelopmentApi#getUsersDevelopmentActivities");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | [**List&lt;String&gt;**](String.html)| Specifies the list of user IDs to be queried, up to 100 user IDs. It searches for any relationship for the userId. | [optional] 
| **moduleId** | **String**| Specifies the ID of the learning module. | [optional] 
| **interval** | **String**| Specifies the dateDue range to be queried. Milliseconds will be truncated. A maximum of 1 year can be specified in the range. End date is not inclusive. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss | [optional] 
| **completionInterval** | **String**| Specifies the range of completion dates to be used for filtering. A maximum of 1 year can be specified in the range. End date is not inclusive. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss | [optional] 
| **overdue** | **String**| Specifies if non-overdue, overdue, or all activities are returned. If not specified, all activities are returned | [optional] [default to Any]<br />**Values**: True, False, Any 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **sortOrder** | **String**| Specifies result set sort order sorted by the date due; if not specified, default sort order is descending (Desc) | [optional] [default to Desc]<br />**Values**: Asc, Desc 
| **types** | [**List&lt;String&gt;**](String.html)| Specifies the activity types. | [optional]<br />**Values**: Informational, Coaching 
| **statuses** | [**List&lt;String&gt;**](String.html)| Specifies the activity statuses to filter by | [optional]<br />**Values**: Planned, InProgress, Completed, InvalidSchedule 
| **relationship** | [**List&lt;String&gt;**](String.html)| Specifies how the current user relation should be interpreted, and filters the activities returned to only those that have the specified relationship. If not specified, all relationships are returned. | [optional]<br />**Values**: Creator, Facilitator, Attendee 
{: class="table-striped"}


### Return type

[**DevelopmentActivityListing**](DevelopmentActivityListing.html)

<a name="getUsersDevelopmentActivitiesMe"></a>

# **getUsersDevelopmentActivitiesMe**



> [DevelopmentActivityListing](DevelopmentActivityListing.html) getUsersDevelopmentActivitiesMe(moduleId, interval, completionInterval, overdue, pageSize, pageNumber, sortOrder, types, statuses, relationship)

Get list of Development Activities for current user

Results are filtered based on the applicable permissions.

Wraps GET /api/v2/users/development/activities/me  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UserDevelopmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UserDevelopmentApi apiInstance = new UserDevelopmentApi();
String moduleId = "moduleId_example"; // String | Specifies the ID of the learning module.
String interval = "interval_example"; // String | Specifies the dateDue range to be queried. Milliseconds will be truncated. A maximum of 1 year can be specified in the range. End date is not inclusive. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss
String completionInterval = "completionInterval_example"; // String | Specifies the range of completion dates to be used for filtering. A maximum of 1 year can be specified in the range. End date is not inclusive. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss
String overdue = "Any"; // String | Specifies if non-overdue, overdue, or all activities are returned. If not specified, all activities are returned
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String sortOrder = "Desc"; // String | Specifies result set sort order sorted by the date due; if not specified, default sort order is descending (Desc)
List<String> types = Arrays.asList("types_example"); // List<String> | Specifies the activity types.
List<String> statuses = Arrays.asList("statuses_example"); // List<String> | Specifies the activity statuses to filter by
List<String> relationship = Arrays.asList("relationship_example"); // List<String> | Specifies how the current user relation should be interpreted, and filters the activities returned to only those that have the specified relationship. If not specified, all relationships are returned.
try {
    DevelopmentActivityListing result = apiInstance.getUsersDevelopmentActivitiesMe(moduleId, interval, completionInterval, overdue, pageSize, pageNumber, sortOrder, types, statuses, relationship);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserDevelopmentApi#getUsersDevelopmentActivitiesMe");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **moduleId** | **String**| Specifies the ID of the learning module. | [optional] 
| **interval** | **String**| Specifies the dateDue range to be queried. Milliseconds will be truncated. A maximum of 1 year can be specified in the range. End date is not inclusive. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss | [optional] 
| **completionInterval** | **String**| Specifies the range of completion dates to be used for filtering. A maximum of 1 year can be specified in the range. End date is not inclusive. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss | [optional] 
| **overdue** | **String**| Specifies if non-overdue, overdue, or all activities are returned. If not specified, all activities are returned | [optional] [default to Any]<br />**Values**: True, False, Any 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **sortOrder** | **String**| Specifies result set sort order sorted by the date due; if not specified, default sort order is descending (Desc) | [optional] [default to Desc]<br />**Values**: Asc, Desc 
| **types** | [**List&lt;String&gt;**](String.html)| Specifies the activity types. | [optional]<br />**Values**: Informational, Coaching 
| **statuses** | [**List&lt;String&gt;**](String.html)| Specifies the activity statuses to filter by | [optional]<br />**Values**: Planned, InProgress, Completed, InvalidSchedule 
| **relationship** | [**List&lt;String&gt;**](String.html)| Specifies how the current user relation should be interpreted, and filters the activities returned to only those that have the specified relationship. If not specified, all relationships are returned. | [optional]<br />**Values**: Creator, Facilitator, Attendee 
{: class="table-striped"}


### Return type

[**DevelopmentActivityListing**](DevelopmentActivityListing.html)

<a name="getUsersDevelopmentActivity"></a>

# **getUsersDevelopmentActivity**



> [DevelopmentActivity](DevelopmentActivity.html) getUsersDevelopmentActivity(activityId, type)

Get a Development Activity



Wraps GET /api/v2/users/development/activities/{activityId}  

Requires ANY permissions: 

* learning:assignment:view
* coaching:appointment:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UserDevelopmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UserDevelopmentApi apiInstance = new UserDevelopmentApi();
String activityId = "activityId_example"; // String | Specifies the activity ID, maps to either assignment or appointment ID
String type = "type_example"; // String | Specifies the activity type.
try {
    DevelopmentActivity result = apiInstance.getUsersDevelopmentActivity(activityId, type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserDevelopmentApi#getUsersDevelopmentActivity");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **activityId** | **String**| Specifies the activity ID, maps to either assignment or appointment ID | 
| **type** | **String**| Specifies the activity type. |<br />**Values**: Informational, Coaching 
{: class="table-striped"}


### Return type

[**DevelopmentActivity**](DevelopmentActivity.html)

<a name="postUsersDevelopmentActivitiesAggregatesQuery"></a>

# **postUsersDevelopmentActivitiesAggregatesQuery**



> [DevelopmentActivityAggregateResponse](DevelopmentActivityAggregateResponse.html) postUsersDevelopmentActivitiesAggregatesQuery(body)

Retrieve aggregated development activity data

Results are filtered based on the applicable permissions.

Wraps POST /api/v2/users/development/activities/aggregates/query  

Requires ANY permissions: 

* learning:assignment:view
* coaching:appointment:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UserDevelopmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UserDevelopmentApi apiInstance = new UserDevelopmentApi();
DevelopmentActivityAggregateParam body = new DevelopmentActivityAggregateParam(); // DevelopmentActivityAggregateParam | Aggregate Request
try {
    DevelopmentActivityAggregateResponse result = apiInstance.postUsersDevelopmentActivitiesAggregatesQuery(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserDevelopmentApi#postUsersDevelopmentActivitiesAggregatesQuery");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**DevelopmentActivityAggregateParam**](DevelopmentActivityAggregateParam.html)| Aggregate Request | 
{: class="table-striped"}


### Return type

[**DevelopmentActivityAggregateResponse**](DevelopmentActivityAggregateResponse.html)

