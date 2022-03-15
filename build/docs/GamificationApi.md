---
title: GamificationApi
---
## GamificationApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**getGamificationLeaderboard**](GamificationApi.html#getGamificationLeaderboard) | Leaderboard of the requesting user&#39;s division or performance profile |
| [**getGamificationLeaderboardAll**](GamificationApi.html#getGamificationLeaderboardAll) | Leaderboard by filter type |
| [**getGamificationLeaderboardAllBestpoints**](GamificationApi.html#getGamificationLeaderboardAllBestpoints) | Best Points by division or performance profile |
| [**getGamificationLeaderboardBestpoints**](GamificationApi.html#getGamificationLeaderboardBestpoints) | Best Points of the requesting user&#39;s current performance profile or division |
| [**getGamificationMetric**](GamificationApi.html#getGamificationMetric) | Gamified metric by id |
| [**getGamificationMetricdefinition**](GamificationApi.html#getGamificationMetricdefinition) | Metric definition by id |
| [**getGamificationMetricdefinitions**](GamificationApi.html#getGamificationMetricdefinitions) | All metric definitions |
| [**getGamificationMetrics**](GamificationApi.html#getGamificationMetrics) | All gamified metrics for a given profile |
| [**getGamificationProfile**](GamificationApi.html#getGamificationProfile) | Performance profile by id |
| [**getGamificationProfileMembers**](GamificationApi.html#getGamificationProfileMembers) | Members of a given performance profile |
| [**getGamificationProfileMetric**](GamificationApi.html#getGamificationProfileMetric) | Performance profile gamified metric by id |
| [**getGamificationProfileMetrics**](GamificationApi.html#getGamificationProfileMetrics) | All gamified metrics for a given performance profile |
| [**getGamificationProfileMetricsObjectivedetails**](GamificationApi.html#getGamificationProfileMetricsObjectivedetails) | All metrics for a given performance profile with objective details such as order and maxPoints |
| [**getGamificationProfiles**](GamificationApi.html#getGamificationProfiles) | All performance profiles |
| [**getGamificationProfilesUser**](GamificationApi.html#getGamificationProfilesUser) | Performance profile of a user |
| [**getGamificationProfilesUsersMe**](GamificationApi.html#getGamificationProfilesUsersMe) | Performance profile of the requesting user |
| [**getGamificationScorecards**](GamificationApi.html#getGamificationScorecards) | Workday performance metrics of the requesting user |
| [**getGamificationScorecardsAttendance**](GamificationApi.html#getGamificationScorecardsAttendance) | Attendance status metrics of the requesting user |
| [**getGamificationScorecardsBestpoints**](GamificationApi.html#getGamificationScorecardsBestpoints) | Best points of the requesting user |
| [**getGamificationScorecardsPointsAlltime**](GamificationApi.html#getGamificationScorecardsPointsAlltime) | All-time points of the requesting user |
| [**getGamificationScorecardsPointsAverage**](GamificationApi.html#getGamificationScorecardsPointsAverage) | Average points of the requesting user&#39;s division or performance profile |
| [**getGamificationScorecardsPointsTrends**](GamificationApi.html#getGamificationScorecardsPointsTrends) | Points trends of the requesting user |
| [**getGamificationScorecardsUser**](GamificationApi.html#getGamificationScorecardsUser) | Workday performance metrics for a user |
| [**getGamificationScorecardsUserAttendance**](GamificationApi.html#getGamificationScorecardsUserAttendance) | Attendance status metrics for a user |
| [**getGamificationScorecardsUserBestpoints**](GamificationApi.html#getGamificationScorecardsUserBestpoints) | Best points of a user |
| [**getGamificationScorecardsUserPointsAlltime**](GamificationApi.html#getGamificationScorecardsUserPointsAlltime) | All-time points for a user |
| [**getGamificationScorecardsUserPointsTrends**](GamificationApi.html#getGamificationScorecardsUserPointsTrends) | Points trend for a user |
| [**getGamificationScorecardsUserValuesTrends**](GamificationApi.html#getGamificationScorecardsUserValuesTrends) | Values trends of a user |
| [**getGamificationScorecardsUsersPointsAverage**](GamificationApi.html#getGamificationScorecardsUsersPointsAverage) | Workday average points by target group |
| [**getGamificationScorecardsUsersValuesAverage**](GamificationApi.html#getGamificationScorecardsUsersValuesAverage) | Workday average values by target group |
| [**getGamificationScorecardsUsersValuesTrends**](GamificationApi.html#getGamificationScorecardsUsersValuesTrends) | Values trend by target group |
| [**getGamificationScorecardsValuesAverage**](GamificationApi.html#getGamificationScorecardsValuesAverage) | Average values of the requesting user&#39;s division or performance profile |
| [**getGamificationScorecardsValuesTrends**](GamificationApi.html#getGamificationScorecardsValuesTrends) | Values trends of the requesting user or group |
| [**getGamificationStatus**](GamificationApi.html#getGamificationStatus) | Gamification activation status |
| [**getGamificationTemplate**](GamificationApi.html#getGamificationTemplate) | Objective template by id |
| [**getGamificationTemplates**](GamificationApi.html#getGamificationTemplates) | All objective templates |
| [**postGamificationMetrics**](GamificationApi.html#postGamificationMetrics) | Creates a gamified metric with a given metric definition and metric objective |
| [**postGamificationProfileActivate**](GamificationApi.html#postGamificationProfileActivate) | Activate a performance profile |
| [**postGamificationProfileDeactivate**](GamificationApi.html#postGamificationProfileDeactivate) | Deactivate a performance profile |
| [**postGamificationProfileMembers**](GamificationApi.html#postGamificationProfileMembers) | Assign members to a given performance profile |
| [**postGamificationProfileMembersValidate**](GamificationApi.html#postGamificationProfileMembersValidate) | Validate member assignment |
| [**postGamificationProfileMetricLink**](GamificationApi.html#postGamificationProfileMetricLink) | Creates a linked metric |
| [**postGamificationProfileMetrics**](GamificationApi.html#postGamificationProfileMetrics) | Creates a gamified metric with a given metric definition and metric objective under in a performance profile |
| [**postGamificationProfiles**](GamificationApi.html#postGamificationProfiles) | Create a new custom performance profile |
| [**putGamificationMetric**](GamificationApi.html#putGamificationMetric) | Updates a metric |
| [**putGamificationProfile**](GamificationApi.html#putGamificationProfile) | Updates a performance profile |
| [**putGamificationProfileMetric**](GamificationApi.html#putGamificationProfileMetric) | Updates a metric in performance profile |
| [**putGamificationStatus**](GamificationApi.html#putGamificationStatus) | Update gamification activation status |
{: class="table-striped"}

<a name="getGamificationLeaderboard"></a>

# **getGamificationLeaderboard**



> [Leaderboard](Leaderboard.html) getGamificationLeaderboard(startWorkday, endWorkday, metricId)

Leaderboard of the requesting user&#39;s division or performance profile



Wraps GET /api/v2/gamification/leaderboard  

Requires ANY permissions: 

* gamification:leaderboard:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GamificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GamificationApi apiInstance = new GamificationApi();
LocalDate startWorkday = new LocalDate(); // LocalDate | Start workday to retrieve for the leaderboard. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
LocalDate endWorkday = new LocalDate(); // LocalDate | End workday to retrieve for the leaderboard. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
String metricId = "metricId_example"; // String | Metric Id for which the leaderboard is to be generated. The total points is used if nothing is given.
try {
    Leaderboard result = apiInstance.getGamificationLeaderboard(startWorkday, endWorkday, metricId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#getGamificationLeaderboard");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **startWorkday** | **LocalDate**| Start workday to retrieve for the leaderboard. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd | 
| **endWorkday** | **LocalDate**| End workday to retrieve for the leaderboard. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd | 
| **metricId** | **String**| Metric Id for which the leaderboard is to be generated. The total points is used if nothing is given. | [optional] 
{: class="table-striped"}


### Return type

[**Leaderboard**](Leaderboard.html)

<a name="getGamificationLeaderboardAll"></a>

# **getGamificationLeaderboardAll**



> [Leaderboard](Leaderboard.html) getGamificationLeaderboardAll(filterType, filterId, startWorkday, endWorkday, metricId)

Leaderboard by filter type



Wraps GET /api/v2/gamification/leaderboard/all  

Requires ANY permissions: 

* gamification:leaderboard:viewAll

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GamificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GamificationApi apiInstance = new GamificationApi();
String filterType = "filterType_example"; // String | Filter type for the query request.
String filterId = "filterId_example"; // String | ID for the filter type. For example, division or performance profile Id
LocalDate startWorkday = new LocalDate(); // LocalDate | Start workday to retrieve for the leaderboard. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
LocalDate endWorkday = new LocalDate(); // LocalDate | End workday to retrieve for the leaderboard. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
String metricId = "metricId_example"; // String | Metric Id for which the leaderboard is to be generated. The total points is used if nothing is given.
try {
    Leaderboard result = apiInstance.getGamificationLeaderboardAll(filterType, filterId, startWorkday, endWorkday, metricId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#getGamificationLeaderboardAll");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **filterType** | **String**| Filter type for the query request. |<br />**Values**: PerformanceProfile, Division 
| **filterId** | **String**| ID for the filter type. For example, division or performance profile Id | 
| **startWorkday** | **LocalDate**| Start workday to retrieve for the leaderboard. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd | 
| **endWorkday** | **LocalDate**| End workday to retrieve for the leaderboard. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd | 
| **metricId** | **String**| Metric Id for which the leaderboard is to be generated. The total points is used if nothing is given. | [optional] 
{: class="table-striped"}


### Return type

[**Leaderboard**](Leaderboard.html)

<a name="getGamificationLeaderboardAllBestpoints"></a>

# **getGamificationLeaderboardAllBestpoints**



> [OverallBestPoints](OverallBestPoints.html) getGamificationLeaderboardAllBestpoints(filterType, filterId)

Best Points by division or performance profile



Wraps GET /api/v2/gamification/leaderboard/all/bestpoints  

Requires ANY permissions: 

* gamification:leaderboard:viewAll

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GamificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GamificationApi apiInstance = new GamificationApi();
String filterType = "filterType_example"; // String | Filter type for the query request.
String filterId = "filterId_example"; // String | ID for the filter type. For example, division or performance profile Id
try {
    OverallBestPoints result = apiInstance.getGamificationLeaderboardAllBestpoints(filterType, filterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#getGamificationLeaderboardAllBestpoints");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **filterType** | **String**| Filter type for the query request. |<br />**Values**: PerformanceProfile, Division 
| **filterId** | **String**| ID for the filter type. For example, division or performance profile Id | 
{: class="table-striped"}


### Return type

[**OverallBestPoints**](OverallBestPoints.html)

<a name="getGamificationLeaderboardBestpoints"></a>

# **getGamificationLeaderboardBestpoints**



> [OverallBestPoints](OverallBestPoints.html) getGamificationLeaderboardBestpoints()

Best Points of the requesting user&#39;s current performance profile or division



Wraps GET /api/v2/gamification/leaderboard/bestpoints  

Requires ANY permissions: 

* gamification:leaderboard:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GamificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GamificationApi apiInstance = new GamificationApi();
try {
    OverallBestPoints result = apiInstance.getGamificationLeaderboardBestpoints();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#getGamificationLeaderboardBestpoints");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**OverallBestPoints**](OverallBestPoints.html)

<a name="getGamificationMetric"></a>

# **getGamificationMetric**



> [Metric](Metric.html) getGamificationMetric(metricId, workday, performanceProfileId)

Gamified metric by id



Wraps GET /api/v2/gamification/metrics/{metricId}  

Requires ANY permissions: 

* gamification:profile:view
* gamification:leaderboard:view
* gamification:scorecard:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GamificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GamificationApi apiInstance = new GamificationApi();
String metricId = "metricId_example"; // String | metric Id
LocalDate workday = new LocalDate(); // LocalDate | The objective query workday. If not specified, then it retrieves the current objective. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
String performanceProfileId = "performanceProfileId_example"; // String | The profile id of the metrics you are trying to retrieve. The DEFAULT profile is used if nothing is given.
try {
    Metric result = apiInstance.getGamificationMetric(metricId, workday, performanceProfileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#getGamificationMetric");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **metricId** | **String**| metric Id | 
| **workday** | **LocalDate**| The objective query workday. If not specified, then it retrieves the current objective. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd | [optional] 
| **performanceProfileId** | **String**| The profile id of the metrics you are trying to retrieve. The DEFAULT profile is used if nothing is given. | [optional] 
{: class="table-striped"}


### Return type

[**Metric**](Metric.html)

<a name="getGamificationMetricdefinition"></a>

# **getGamificationMetricdefinition**



> [MetricDefinition](MetricDefinition.html) getGamificationMetricdefinition(metricDefinitionId)

Metric definition by id



Wraps GET /api/v2/gamification/metricdefinitions/{metricDefinitionId}  

Requires ANY permissions: 

* gamification:profile:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GamificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GamificationApi apiInstance = new GamificationApi();
String metricDefinitionId = "metricDefinitionId_example"; // String | metric definition id
try {
    MetricDefinition result = apiInstance.getGamificationMetricdefinition(metricDefinitionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#getGamificationMetricdefinition");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **metricDefinitionId** | **String**| metric definition id | 
{: class="table-striped"}


### Return type

[**MetricDefinition**](MetricDefinition.html)

<a name="getGamificationMetricdefinitions"></a>

# **getGamificationMetricdefinitions**



> [GetMetricDefinitionsResponse](GetMetricDefinitionsResponse.html) getGamificationMetricdefinitions()

All metric definitions

Retrieves the metric definitions and their corresponding default objectives used to create a gamified metric

Wraps GET /api/v2/gamification/metricdefinitions  

Requires ANY permissions: 

* gamification:profile:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GamificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GamificationApi apiInstance = new GamificationApi();
try {
    GetMetricDefinitionsResponse result = apiInstance.getGamificationMetricdefinitions();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#getGamificationMetricdefinitions");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**GetMetricDefinitionsResponse**](GetMetricDefinitionsResponse.html)

<a name="getGamificationMetrics"></a>

# **getGamificationMetrics**



> [GetMetricsResponse](GetMetricsResponse.html) getGamificationMetrics(performanceProfileId, workday)

All gamified metrics for a given profile



Wraps GET /api/v2/gamification/metrics  

Requires ANY permissions: 

* gamification:profile:view
* gamification:leaderboard:view
* gamification:scorecard:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GamificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GamificationApi apiInstance = new GamificationApi();
String performanceProfileId = "performanceProfileId_example"; // String | The profile id of the metrics you are trying to retrieve. The DEFAULT profile is used if nothing is given.
LocalDate workday = new LocalDate(); // LocalDate | The objective query workday. If not specified, then it retrieves the current objective. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
try {
    GetMetricsResponse result = apiInstance.getGamificationMetrics(performanceProfileId, workday);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#getGamificationMetrics");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **performanceProfileId** | **String**| The profile id of the metrics you are trying to retrieve. The DEFAULT profile is used if nothing is given. | [optional] 
| **workday** | **LocalDate**| The objective query workday. If not specified, then it retrieves the current objective. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd | [optional] 
{: class="table-striped"}


### Return type

[**GetMetricsResponse**](GetMetricsResponse.html)

<a name="getGamificationProfile"></a>

# **getGamificationProfile**



> [PerformanceProfile](PerformanceProfile.html) getGamificationProfile(performanceProfileId)

Performance profile by id



Wraps GET /api/v2/gamification/profiles/{performanceProfileId}  

Requires ANY permissions: 

* gamification:profile:view
* gamification:leaderboard:viewAll
* gamification:scorecard:viewAll

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GamificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GamificationApi apiInstance = new GamificationApi();
String performanceProfileId = "performanceProfileId_example"; // String | Performance Profile Id
try {
    PerformanceProfile result = apiInstance.getGamificationProfile(performanceProfileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#getGamificationProfile");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **performanceProfileId** | **String**| Performance Profile Id | 
{: class="table-striped"}


### Return type

[**PerformanceProfile**](PerformanceProfile.html)

<a name="getGamificationProfileMembers"></a>

# **getGamificationProfileMembers**



> [MemberListing](MemberListing.html) getGamificationProfileMembers(performanceProfileId)

Members of a given performance profile



Wraps GET /api/v2/gamification/profiles/{performanceProfileId}/members  

Requires ANY permissions: 

* gamification:profile:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GamificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GamificationApi apiInstance = new GamificationApi();
String performanceProfileId = "performanceProfileId_example"; // String | Performance Profile Id
try {
    MemberListing result = apiInstance.getGamificationProfileMembers(performanceProfileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#getGamificationProfileMembers");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **performanceProfileId** | **String**| Performance Profile Id | 
{: class="table-striped"}


### Return type

[**MemberListing**](MemberListing.html)

<a name="getGamificationProfileMetric"></a>

# **getGamificationProfileMetric**



> [Metric](Metric.html) getGamificationProfileMetric(profileId, metricId, workday)

Performance profile gamified metric by id



Wraps GET /api/v2/gamification/profiles/{profileId}/metrics/{metricId}  

Requires ANY permissions: 

* gamification:profile:view
* gamification:leaderboard:view
* gamification:scorecard:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GamificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GamificationApi apiInstance = new GamificationApi();
String profileId = "profileId_example"; // String | Performance Profile Id
String metricId = "metricId_example"; // String | Metric Id
LocalDate workday = new LocalDate(); // LocalDate | The objective query workday. If not specified, then it retrieves the current objective. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
try {
    Metric result = apiInstance.getGamificationProfileMetric(profileId, metricId, workday);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#getGamificationProfileMetric");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **profileId** | **String**| Performance Profile Id | 
| **metricId** | **String**| Metric Id | 
| **workday** | **LocalDate**| The objective query workday. If not specified, then it retrieves the current objective. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd | [optional] 
{: class="table-striped"}


### Return type

[**Metric**](Metric.html)

<a name="getGamificationProfileMetrics"></a>

# **getGamificationProfileMetrics**



> [GetMetricResponse](GetMetricResponse.html) getGamificationProfileMetrics(profileId, expand, workday)

All gamified metrics for a given performance profile



Wraps GET /api/v2/gamification/profiles/{profileId}/metrics  

Requires ANY permissions: 

* gamification:profile:view
* gamification:leaderboard:view
* gamification:scorecard:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GamificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GamificationApi apiInstance = new GamificationApi();
String profileId = "profileId_example"; // String | Performance Profile Id
List<String> expand = Arrays.asList("expand_example"); // List<String> | Which fields, if any, to expand.
LocalDate workday = new LocalDate(); // LocalDate | The objective query workday. If not specified, then it retrieves the current objective. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
try {
    GetMetricResponse result = apiInstance.getGamificationProfileMetrics(profileId, expand, workday);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#getGamificationProfileMetrics");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **profileId** | **String**| Performance Profile Id | 
| **expand** | [**List&lt;String&gt;**](String.html)| Which fields, if any, to expand. | [optional]<br />**Values**: objective 
| **workday** | **LocalDate**| The objective query workday. If not specified, then it retrieves the current objective. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd | [optional] 
{: class="table-striped"}


### Return type

[**GetMetricResponse**](GetMetricResponse.html)

<a name="getGamificationProfileMetricsObjectivedetails"></a>

# **getGamificationProfileMetricsObjectivedetails**



> [GetMetricsResponse](GetMetricsResponse.html) getGamificationProfileMetricsObjectivedetails(profileId, workday)

All metrics for a given performance profile with objective details such as order and maxPoints



Wraps GET /api/v2/gamification/profiles/{profileId}/metrics/objectivedetails  

Requires ANY permissions: 

* gamification:profile:view
* gamification:leaderboard:view
* gamification:scorecard:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GamificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GamificationApi apiInstance = new GamificationApi();
String profileId = "profileId_example"; // String | Performance Profile Id
LocalDate workday = new LocalDate(); // LocalDate | The objective query workday. If not specified, then it retrieves the current objective. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
try {
    GetMetricsResponse result = apiInstance.getGamificationProfileMetricsObjectivedetails(profileId, workday);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#getGamificationProfileMetricsObjectivedetails");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **profileId** | **String**| Performance Profile Id | 
| **workday** | **LocalDate**| The objective query workday. If not specified, then it retrieves the current objective. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd | [optional] 
{: class="table-striped"}


### Return type

[**GetMetricsResponse**](GetMetricsResponse.html)

<a name="getGamificationProfiles"></a>

# **getGamificationProfiles**



> [GetProfilesResponse](GetProfilesResponse.html) getGamificationProfiles()

All performance profiles



Wraps GET /api/v2/gamification/profiles  

Requires ANY permissions: 

* gamification:profile:view
* gamification:leaderboard:viewAll
* gamification:scorecard:viewAll

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GamificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GamificationApi apiInstance = new GamificationApi();
try {
    GetProfilesResponse result = apiInstance.getGamificationProfiles();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#getGamificationProfiles");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**GetProfilesResponse**](GetProfilesResponse.html)

<a name="getGamificationProfilesUser"></a>

# **getGamificationProfilesUser**



> [PerformanceProfile](PerformanceProfile.html) getGamificationProfilesUser(userId, workday)

Performance profile of a user



Wraps GET /api/v2/gamification/profiles/users/{userId}  

Requires ANY permissions: 

* gamification:profile:view
* gamification:scorecard:viewAll
* gamification:leaderboard:viewAll

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GamificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GamificationApi apiInstance = new GamificationApi();
String userId = "userId_example"; // String | 
LocalDate workday = new LocalDate(); // LocalDate | Target querying workday. If not provided, then queries the current performance profile. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
try {
    PerformanceProfile result = apiInstance.getGamificationProfilesUser(userId, workday);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#getGamificationProfilesUser");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**|  | 
| **workday** | **LocalDate**| Target querying workday. If not provided, then queries the current performance profile. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd | [optional] 
{: class="table-striped"}


### Return type

[**PerformanceProfile**](PerformanceProfile.html)

<a name="getGamificationProfilesUsersMe"></a>

# **getGamificationProfilesUsersMe**



> [PerformanceProfile](PerformanceProfile.html) getGamificationProfilesUsersMe(workday)

Performance profile of the requesting user



Wraps GET /api/v2/gamification/profiles/users/me  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GamificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GamificationApi apiInstance = new GamificationApi();
LocalDate workday = new LocalDate(); // LocalDate | Target querying workday. If not provided, then queries the current performance profile. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
try {
    PerformanceProfile result = apiInstance.getGamificationProfilesUsersMe(workday);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#getGamificationProfilesUsersMe");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **workday** | **LocalDate**| Target querying workday. If not provided, then queries the current performance profile. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd | [optional] 
{: class="table-striped"}


### Return type

[**PerformanceProfile**](PerformanceProfile.html)

<a name="getGamificationScorecards"></a>

# **getGamificationScorecards**



> [WorkdayMetricListing](WorkdayMetricListing.html) getGamificationScorecards(workday, expand)

Workday performance metrics of the requesting user



Wraps GET /api/v2/gamification/scorecards  

Requires ANY permissions: 

* gamification:scorecard:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GamificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GamificationApi apiInstance = new GamificationApi();
LocalDate workday = new LocalDate(); // LocalDate | Target querying workday. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
List<String> expand = Arrays.asList("expand_example"); // List<String> | Which fields, if any, to expand.
try {
    WorkdayMetricListing result = apiInstance.getGamificationScorecards(workday, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#getGamificationScorecards");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **workday** | **LocalDate**| Target querying workday. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd | 
| **expand** | [**List&lt;String&gt;**](String.html)| Which fields, if any, to expand. | [optional]<br />**Values**: objective 
{: class="table-striped"}


### Return type

[**WorkdayMetricListing**](WorkdayMetricListing.html)

<a name="getGamificationScorecardsAttendance"></a>

# **getGamificationScorecardsAttendance**



> [AttendanceStatusListing](AttendanceStatusListing.html) getGamificationScorecardsAttendance(startWorkday, endWorkday)

Attendance status metrics of the requesting user



Wraps GET /api/v2/gamification/scorecards/attendance  

Requires ANY permissions: 

* gamification:scorecard:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GamificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GamificationApi apiInstance = new GamificationApi();
LocalDate startWorkday = new LocalDate(); // LocalDate | Start workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
LocalDate endWorkday = new LocalDate(); // LocalDate | End workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
try {
    AttendanceStatusListing result = apiInstance.getGamificationScorecardsAttendance(startWorkday, endWorkday);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#getGamificationScorecardsAttendance");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **startWorkday** | **LocalDate**| Start workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd | 
| **endWorkday** | **LocalDate**| End workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd | 
{: class="table-striped"}


### Return type

[**AttendanceStatusListing**](AttendanceStatusListing.html)

<a name="getGamificationScorecardsBestpoints"></a>

# **getGamificationScorecardsBestpoints**



> [UserBestPoints](UserBestPoints.html) getGamificationScorecardsBestpoints()

Best points of the requesting user



Wraps GET /api/v2/gamification/scorecards/bestpoints  

Requires ANY permissions: 

* gamification:scorecard:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GamificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GamificationApi apiInstance = new GamificationApi();
try {
    UserBestPoints result = apiInstance.getGamificationScorecardsBestpoints();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#getGamificationScorecardsBestpoints");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**UserBestPoints**](UserBestPoints.html)

<a name="getGamificationScorecardsPointsAlltime"></a>

# **getGamificationScorecardsPointsAlltime**



> [AllTimePoints](AllTimePoints.html) getGamificationScorecardsPointsAlltime(endWorkday)

All-time points of the requesting user



Wraps GET /api/v2/gamification/scorecards/points/alltime  

Requires ANY permissions: 

* gamification:scorecard:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GamificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GamificationApi apiInstance = new GamificationApi();
LocalDate endWorkday = new LocalDate(); // LocalDate | End workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
try {
    AllTimePoints result = apiInstance.getGamificationScorecardsPointsAlltime(endWorkday);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#getGamificationScorecardsPointsAlltime");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **endWorkday** | **LocalDate**| End workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd | 
{: class="table-striped"}


### Return type

[**AllTimePoints**](AllTimePoints.html)

<a name="getGamificationScorecardsPointsAverage"></a>

# **getGamificationScorecardsPointsAverage**



> [SingleWorkdayAveragePoints](SingleWorkdayAveragePoints.html) getGamificationScorecardsPointsAverage(workday)

Average points of the requesting user&#39;s division or performance profile



Wraps GET /api/v2/gamification/scorecards/points/average  

Requires ANY permissions: 

* gamification:scorecard:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GamificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GamificationApi apiInstance = new GamificationApi();
LocalDate workday = new LocalDate(); // LocalDate | The target workday. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
try {
    SingleWorkdayAveragePoints result = apiInstance.getGamificationScorecardsPointsAverage(workday);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#getGamificationScorecardsPointsAverage");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **workday** | **LocalDate**| The target workday. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd | 
{: class="table-striped"}


### Return type

[**SingleWorkdayAveragePoints**](SingleWorkdayAveragePoints.html)

<a name="getGamificationScorecardsPointsTrends"></a>

# **getGamificationScorecardsPointsTrends**



> [WorkdayPointsTrend](WorkdayPointsTrend.html) getGamificationScorecardsPointsTrends(startWorkday, endWorkday, dayOfWeek)

Points trends of the requesting user



Wraps GET /api/v2/gamification/scorecards/points/trends  

Requires ANY permissions: 

* gamification:scorecard:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GamificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GamificationApi apiInstance = new GamificationApi();
LocalDate startWorkday = new LocalDate(); // LocalDate | Start workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
LocalDate endWorkday = new LocalDate(); // LocalDate | End workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
String dayOfWeek = "dayOfWeek_example"; // String | Optional filter to specify which day of weeks to be included in the response
try {
    WorkdayPointsTrend result = apiInstance.getGamificationScorecardsPointsTrends(startWorkday, endWorkday, dayOfWeek);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#getGamificationScorecardsPointsTrends");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **startWorkday** | **LocalDate**| Start workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd | 
| **endWorkday** | **LocalDate**| End workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd | 
| **dayOfWeek** | **String**| Optional filter to specify which day of weeks to be included in the response | [optional]<br />**Values**: Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday 
{: class="table-striped"}


### Return type

[**WorkdayPointsTrend**](WorkdayPointsTrend.html)

<a name="getGamificationScorecardsUser"></a>

# **getGamificationScorecardsUser**



> [WorkdayMetricListing](WorkdayMetricListing.html) getGamificationScorecardsUser(userId, workday, expand)

Workday performance metrics for a user



Wraps GET /api/v2/gamification/scorecards/users/{userId}  

Requires ANY permissions: 

* gamification:scorecard:viewAll

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GamificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GamificationApi apiInstance = new GamificationApi();
String userId = "userId_example"; // String | 
LocalDate workday = new LocalDate(); // LocalDate | Target querying workday. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
List<String> expand = Arrays.asList("expand_example"); // List<String> | Which fields, if any, to expand.
try {
    WorkdayMetricListing result = apiInstance.getGamificationScorecardsUser(userId, workday, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#getGamificationScorecardsUser");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**|  | 
| **workday** | **LocalDate**| Target querying workday. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd | 
| **expand** | [**List&lt;String&gt;**](String.html)| Which fields, if any, to expand. | [optional]<br />**Values**: objective 
{: class="table-striped"}


### Return type

[**WorkdayMetricListing**](WorkdayMetricListing.html)

<a name="getGamificationScorecardsUserAttendance"></a>

# **getGamificationScorecardsUserAttendance**



> [AttendanceStatusListing](AttendanceStatusListing.html) getGamificationScorecardsUserAttendance(userId, startWorkday, endWorkday)

Attendance status metrics for a user



Wraps GET /api/v2/gamification/scorecards/users/{userId}/attendance  

Requires ANY permissions: 

* gamification:scorecard:viewAll

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GamificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GamificationApi apiInstance = new GamificationApi();
String userId = "userId_example"; // String | 
LocalDate startWorkday = new LocalDate(); // LocalDate | Start workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
LocalDate endWorkday = new LocalDate(); // LocalDate | End workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
try {
    AttendanceStatusListing result = apiInstance.getGamificationScorecardsUserAttendance(userId, startWorkday, endWorkday);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#getGamificationScorecardsUserAttendance");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**|  | 
| **startWorkday** | **LocalDate**| Start workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd | 
| **endWorkday** | **LocalDate**| End workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd | 
{: class="table-striped"}


### Return type

[**AttendanceStatusListing**](AttendanceStatusListing.html)

<a name="getGamificationScorecardsUserBestpoints"></a>

# **getGamificationScorecardsUserBestpoints**



> [UserBestPoints](UserBestPoints.html) getGamificationScorecardsUserBestpoints(userId)

Best points of a user



Wraps GET /api/v2/gamification/scorecards/users/{userId}/bestpoints  

Requires ANY permissions: 

* gamification:scorecard:viewAll

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GamificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GamificationApi apiInstance = new GamificationApi();
String userId = "userId_example"; // String | 
try {
    UserBestPoints result = apiInstance.getGamificationScorecardsUserBestpoints(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#getGamificationScorecardsUserBestpoints");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**|  | 
{: class="table-striped"}


### Return type

[**UserBestPoints**](UserBestPoints.html)

<a name="getGamificationScorecardsUserPointsAlltime"></a>

# **getGamificationScorecardsUserPointsAlltime**



> [AllTimePoints](AllTimePoints.html) getGamificationScorecardsUserPointsAlltime(userId, endWorkday)

All-time points for a user



Wraps GET /api/v2/gamification/scorecards/users/{userId}/points/alltime  

Requires ANY permissions: 

* gamification:scorecard:viewAll

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GamificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GamificationApi apiInstance = new GamificationApi();
String userId = "userId_example"; // String | 
LocalDate endWorkday = new LocalDate(); // LocalDate | End workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
try {
    AllTimePoints result = apiInstance.getGamificationScorecardsUserPointsAlltime(userId, endWorkday);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#getGamificationScorecardsUserPointsAlltime");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**|  | 
| **endWorkday** | **LocalDate**| End workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd | 
{: class="table-striped"}


### Return type

[**AllTimePoints**](AllTimePoints.html)

<a name="getGamificationScorecardsUserPointsTrends"></a>

# **getGamificationScorecardsUserPointsTrends**



> [WorkdayPointsTrend](WorkdayPointsTrend.html) getGamificationScorecardsUserPointsTrends(userId, startWorkday, endWorkday, dayOfWeek)

Points trend for a user



Wraps GET /api/v2/gamification/scorecards/users/{userId}/points/trends  

Requires ANY permissions: 

* gamification:scorecard:viewAll

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GamificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GamificationApi apiInstance = new GamificationApi();
String userId = "userId_example"; // String | 
LocalDate startWorkday = new LocalDate(); // LocalDate | Start workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
LocalDate endWorkday = new LocalDate(); // LocalDate | End workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
String dayOfWeek = "dayOfWeek_example"; // String | Optional filter to specify which day of weeks to be included in the response
try {
    WorkdayPointsTrend result = apiInstance.getGamificationScorecardsUserPointsTrends(userId, startWorkday, endWorkday, dayOfWeek);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#getGamificationScorecardsUserPointsTrends");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**|  | 
| **startWorkday** | **LocalDate**| Start workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd | 
| **endWorkday** | **LocalDate**| End workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd | 
| **dayOfWeek** | **String**| Optional filter to specify which day of weeks to be included in the response | [optional]<br />**Values**: Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday 
{: class="table-striped"}


### Return type

[**WorkdayPointsTrend**](WorkdayPointsTrend.html)

<a name="getGamificationScorecardsUserValuesTrends"></a>

# **getGamificationScorecardsUserValuesTrends**



> [WorkdayValuesTrend](WorkdayValuesTrend.html) getGamificationScorecardsUserValuesTrends(userId, startWorkday, endWorkday, timeZone)

Values trends of a user



Wraps GET /api/v2/gamification/scorecards/users/{userId}/values/trends  

Requires ANY permissions: 

* gamification:scorecard:viewAll

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GamificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GamificationApi apiInstance = new GamificationApi();
String userId = "userId_example"; // String | 
LocalDate startWorkday = new LocalDate(); // LocalDate | Start workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
LocalDate endWorkday = new LocalDate(); // LocalDate | End workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
String timeZone = "UTC"; // String | Timezone for the workday. Defaults to UTC
try {
    WorkdayValuesTrend result = apiInstance.getGamificationScorecardsUserValuesTrends(userId, startWorkday, endWorkday, timeZone);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#getGamificationScorecardsUserValuesTrends");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**|  | 
| **startWorkday** | **LocalDate**| Start workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd | 
| **endWorkday** | **LocalDate**| End workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd | 
| **timeZone** | **String**| Timezone for the workday. Defaults to UTC | [optional] [default to UTC] 
{: class="table-striped"}


### Return type

[**WorkdayValuesTrend**](WorkdayValuesTrend.html)

<a name="getGamificationScorecardsUsersPointsAverage"></a>

# **getGamificationScorecardsUsersPointsAverage**



> [SingleWorkdayAveragePoints](SingleWorkdayAveragePoints.html) getGamificationScorecardsUsersPointsAverage(filterType, filterId, workday)

Workday average points by target group



Wraps GET /api/v2/gamification/scorecards/users/points/average  

Requires ANY permissions: 

* gamification:scorecard:viewAll

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GamificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GamificationApi apiInstance = new GamificationApi();
String filterType = "filterType_example"; // String | Filter type for the query request.
String filterId = "filterId_example"; // String | ID for the filter type.
LocalDate workday = new LocalDate(); // LocalDate | The target workday. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
try {
    SingleWorkdayAveragePoints result = apiInstance.getGamificationScorecardsUsersPointsAverage(filterType, filterId, workday);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#getGamificationScorecardsUsersPointsAverage");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **filterType** | **String**| Filter type for the query request. |<br />**Values**: PerformanceProfile, Division 
| **filterId** | **String**| ID for the filter type. | 
| **workday** | **LocalDate**| The target workday. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd | 
{: class="table-striped"}


### Return type

[**SingleWorkdayAveragePoints**](SingleWorkdayAveragePoints.html)

<a name="getGamificationScorecardsUsersValuesAverage"></a>

# **getGamificationScorecardsUsersValuesAverage**



> [SingleWorkdayAverageValues](SingleWorkdayAverageValues.html) getGamificationScorecardsUsersValuesAverage(filterType, filterId, workday, timeZone)

Workday average values by target group



Wraps GET /api/v2/gamification/scorecards/users/values/average  

Requires ANY permissions: 

* gamification:scorecard:viewAll

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GamificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GamificationApi apiInstance = new GamificationApi();
String filterType = "filterType_example"; // String | Filter type for the query request.
String filterId = "filterId_example"; // String | ID for the filter type. For example, division Id
LocalDate workday = new LocalDate(); // LocalDate | The target workday. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
String timeZone = "UTC"; // String | Timezone for the workday. Defaults to UTC
try {
    SingleWorkdayAverageValues result = apiInstance.getGamificationScorecardsUsersValuesAverage(filterType, filterId, workday, timeZone);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#getGamificationScorecardsUsersValuesAverage");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **filterType** | **String**| Filter type for the query request. |<br />**Values**: PerformanceProfile, Division 
| **filterId** | **String**| ID for the filter type. For example, division Id | 
| **workday** | **LocalDate**| The target workday. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd | 
| **timeZone** | **String**| Timezone for the workday. Defaults to UTC | [optional] [default to UTC] 
{: class="table-striped"}


### Return type

[**SingleWorkdayAverageValues**](SingleWorkdayAverageValues.html)

<a name="getGamificationScorecardsUsersValuesTrends"></a>

# **getGamificationScorecardsUsersValuesTrends**



> [WorkdayValuesTrend](WorkdayValuesTrend.html) getGamificationScorecardsUsersValuesTrends(filterType, filterId, startWorkday, endWorkday, timeZone)

Values trend by target group



Wraps GET /api/v2/gamification/scorecards/users/values/trends  

Requires ANY permissions: 

* gamification:scorecard:viewAll

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GamificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GamificationApi apiInstance = new GamificationApi();
String filterType = "filterType_example"; // String | Filter type for the query request.
String filterId = "filterId_example"; // String | ID for the filter type.
LocalDate startWorkday = new LocalDate(); // LocalDate | Start workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
LocalDate endWorkday = new LocalDate(); // LocalDate | End workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
String timeZone = "UTC"; // String | Timezone for the workday. Defaults to UTC
try {
    WorkdayValuesTrend result = apiInstance.getGamificationScorecardsUsersValuesTrends(filterType, filterId, startWorkday, endWorkday, timeZone);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#getGamificationScorecardsUsersValuesTrends");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **filterType** | **String**| Filter type for the query request. |<br />**Values**: PerformanceProfile, Division 
| **filterId** | **String**| ID for the filter type. | 
| **startWorkday** | **LocalDate**| Start workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd | 
| **endWorkday** | **LocalDate**| End workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd | 
| **timeZone** | **String**| Timezone for the workday. Defaults to UTC | [optional] [default to UTC] 
{: class="table-striped"}


### Return type

[**WorkdayValuesTrend**](WorkdayValuesTrend.html)

<a name="getGamificationScorecardsValuesAverage"></a>

# **getGamificationScorecardsValuesAverage**



> [SingleWorkdayAverageValues](SingleWorkdayAverageValues.html) getGamificationScorecardsValuesAverage(workday, timeZone)

Average values of the requesting user&#39;s division or performance profile



Wraps GET /api/v2/gamification/scorecards/values/average  

Requires ANY permissions: 

* gamification:scorecard:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GamificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GamificationApi apiInstance = new GamificationApi();
LocalDate workday = new LocalDate(); // LocalDate | The target workday. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
String timeZone = "UTC"; // String | Timezone for the workday. Defaults to UTC
try {
    SingleWorkdayAverageValues result = apiInstance.getGamificationScorecardsValuesAverage(workday, timeZone);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#getGamificationScorecardsValuesAverage");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **workday** | **LocalDate**| The target workday. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd | 
| **timeZone** | **String**| Timezone for the workday. Defaults to UTC | [optional] [default to UTC] 
{: class="table-striped"}


### Return type

[**SingleWorkdayAverageValues**](SingleWorkdayAverageValues.html)

<a name="getGamificationScorecardsValuesTrends"></a>

# **getGamificationScorecardsValuesTrends**



> [WorkdayValuesTrend](WorkdayValuesTrend.html) getGamificationScorecardsValuesTrends(startWorkday, endWorkday, filterType, referenceWorkday, timeZone)

Values trends of the requesting user or group



Wraps GET /api/v2/gamification/scorecards/values/trends  

Requires ANY permissions: 

* gamification:scorecard:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GamificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GamificationApi apiInstance = new GamificationApi();
LocalDate startWorkday = new LocalDate(); // LocalDate | Start workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
LocalDate endWorkday = new LocalDate(); // LocalDate | End workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
String filterType = "filterType_example"; // String | Filter type for the query request. If not set, then the request is for the requesting user.
LocalDate referenceWorkday = new LocalDate(); // LocalDate | Reference workday for the trend. Used to determine the profile of the user as of this date. If not set, then the user's current profile will be used. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
String timeZone = "UTC"; // String | Timezone for the workday. Defaults to UTC
try {
    WorkdayValuesTrend result = apiInstance.getGamificationScorecardsValuesTrends(startWorkday, endWorkday, filterType, referenceWorkday, timeZone);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#getGamificationScorecardsValuesTrends");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **startWorkday** | **LocalDate**| Start workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd | 
| **endWorkday** | **LocalDate**| End workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd | 
| **filterType** | **String**| Filter type for the query request. If not set, then the request is for the requesting user. | [optional]<br />**Values**: PerformanceProfile, Division 
| **referenceWorkday** | **LocalDate**| Reference workday for the trend. Used to determine the profile of the user as of this date. If not set, then the user&#39;s current profile will be used. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd | [optional] 
| **timeZone** | **String**| Timezone for the workday. Defaults to UTC | [optional] [default to UTC] 
{: class="table-striped"}


### Return type

[**WorkdayValuesTrend**](WorkdayValuesTrend.html)

<a name="getGamificationStatus"></a>

# **getGamificationStatus**



> [GamificationStatus](GamificationStatus.html) getGamificationStatus()

Gamification activation status



Wraps GET /api/v2/gamification/status  

Requires ANY permissions: 

* gamification:profile:view
* gamification:profile:update
* gamification:scorecard:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GamificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GamificationApi apiInstance = new GamificationApi();
try {
    GamificationStatus result = apiInstance.getGamificationStatus();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#getGamificationStatus");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**GamificationStatus**](GamificationStatus.html)

<a name="getGamificationTemplate"></a>

# **getGamificationTemplate**



> [ObjectiveTemplate](ObjectiveTemplate.html) getGamificationTemplate(templateId)

Objective template by id



Wraps GET /api/v2/gamification/templates/{templateId}  

Requires ANY permissions: 

* gamification:profile:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GamificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GamificationApi apiInstance = new GamificationApi();
String templateId = "templateId_example"; // String | template id
try {
    ObjectiveTemplate result = apiInstance.getGamificationTemplate(templateId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#getGamificationTemplate");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **templateId** | **String**| template id | 
{: class="table-striped"}


### Return type

[**ObjectiveTemplate**](ObjectiveTemplate.html)

<a name="getGamificationTemplates"></a>

# **getGamificationTemplates**



> [GetTemplatesResponse](GetTemplatesResponse.html) getGamificationTemplates()

All objective templates



Wraps GET /api/v2/gamification/templates  

Requires ANY permissions: 

* gamification:profile:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GamificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GamificationApi apiInstance = new GamificationApi();
try {
    GetTemplatesResponse result = apiInstance.getGamificationTemplates();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#getGamificationTemplates");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**GetTemplatesResponse**](GetTemplatesResponse.html)

<a name="postGamificationMetrics"></a>

# **postGamificationMetrics**



> [Metric](Metric.html) postGamificationMetrics(body)

Creates a gamified metric with a given metric definition and metric objective



Wraps POST /api/v2/gamification/metrics  

Requires ALL permissions: 

* gamification:profile:update

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GamificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GamificationApi apiInstance = new GamificationApi();
CreateMetric body = new CreateMetric(); // CreateMetric | Metric
try {
    Metric result = apiInstance.postGamificationMetrics(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#postGamificationMetrics");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**CreateMetric**](CreateMetric.html)| Metric | 
{: class="table-striped"}


### Return type

[**Metric**](Metric.html)

<a name="postGamificationProfileActivate"></a>

# **postGamificationProfileActivate**



> [PerformanceProfile](PerformanceProfile.html) postGamificationProfileActivate(performanceProfileId)

Activate a performance profile



Wraps POST /api/v2/gamification/profiles/{performanceProfileId}/activate  

Requires ANY permissions: 

* gamification:profile:update

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GamificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GamificationApi apiInstance = new GamificationApi();
String performanceProfileId = "performanceProfileId_example"; // String | Performance Profile Id
try {
    PerformanceProfile result = apiInstance.postGamificationProfileActivate(performanceProfileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#postGamificationProfileActivate");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **performanceProfileId** | **String**| Performance Profile Id | 
{: class="table-striped"}


### Return type

[**PerformanceProfile**](PerformanceProfile.html)

<a name="postGamificationProfileDeactivate"></a>

# **postGamificationProfileDeactivate**



> [PerformanceProfile](PerformanceProfile.html) postGamificationProfileDeactivate(performanceProfileId)

Deactivate a performance profile



Wraps POST /api/v2/gamification/profiles/{performanceProfileId}/deactivate  

Requires ANY permissions: 

* gamification:profile:update

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GamificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GamificationApi apiInstance = new GamificationApi();
String performanceProfileId = "performanceProfileId_example"; // String | Performance Profile Id
try {
    PerformanceProfile result = apiInstance.postGamificationProfileDeactivate(performanceProfileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#postGamificationProfileDeactivate");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **performanceProfileId** | **String**| Performance Profile Id | 
{: class="table-striped"}


### Return type

[**PerformanceProfile**](PerformanceProfile.html)

<a name="postGamificationProfileMembers"></a>

# **postGamificationProfileMembers**



> [Assignment](Assignment.html) postGamificationProfileMembers(performanceProfileId, body)

Assign members to a given performance profile



Wraps POST /api/v2/gamification/profiles/{performanceProfileId}/members  

Requires ANY permissions: 

* gamification:profile:update

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GamificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GamificationApi apiInstance = new GamificationApi();
String performanceProfileId = "performanceProfileId_example"; // String | Performance Profile Id
AssignUsers body = new AssignUsers(); // AssignUsers | assignUsers
try {
    Assignment result = apiInstance.postGamificationProfileMembers(performanceProfileId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#postGamificationProfileMembers");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **performanceProfileId** | **String**| Performance Profile Id | 
| **body** | [**AssignUsers**](AssignUsers.html)| assignUsers | 
{: class="table-striped"}


### Return type

[**Assignment**](Assignment.html)

<a name="postGamificationProfileMembersValidate"></a>

# **postGamificationProfileMembersValidate**



> [AssignmentValidation](AssignmentValidation.html) postGamificationProfileMembersValidate(performanceProfileId, body)

Validate member assignment



Wraps POST /api/v2/gamification/profiles/{performanceProfileId}/members/validate  

Requires ANY permissions: 

* gamification:profile:update

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GamificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GamificationApi apiInstance = new GamificationApi();
String performanceProfileId = "performanceProfileId_example"; // String | Performance Profile Id
ValidateAssignUsers body = new ValidateAssignUsers(); // ValidateAssignUsers | memberAssignments
try {
    AssignmentValidation result = apiInstance.postGamificationProfileMembersValidate(performanceProfileId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#postGamificationProfileMembersValidate");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **performanceProfileId** | **String**| Performance Profile Id | 
| **body** | [**ValidateAssignUsers**](ValidateAssignUsers.html)| memberAssignments | 
{: class="table-striped"}


### Return type

[**AssignmentValidation**](AssignmentValidation.html)

<a name="postGamificationProfileMetricLink"></a>

# **postGamificationProfileMetricLink**



> [Metric](Metric.html) postGamificationProfileMetricLink(sourceProfileId, sourceMetricId, body)

Creates a linked metric



Wraps POST /api/v2/gamification/profiles/{sourceProfileId}/metrics/{sourceMetricId}/link  

Requires ANY permissions: 

* gamification:profile:update

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GamificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GamificationApi apiInstance = new GamificationApi();
String sourceProfileId = "sourceProfileId_example"; // String | Source Performance Profile Id
String sourceMetricId = "sourceMetricId_example"; // String | Source Metric Id
TargetPerformanceProfile body = new TargetPerformanceProfile(); // TargetPerformanceProfile | linkedMetric
try {
    Metric result = apiInstance.postGamificationProfileMetricLink(sourceProfileId, sourceMetricId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#postGamificationProfileMetricLink");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sourceProfileId** | **String**| Source Performance Profile Id | 
| **sourceMetricId** | **String**| Source Metric Id | 
| **body** | [**TargetPerformanceProfile**](TargetPerformanceProfile.html)| linkedMetric | 
{: class="table-striped"}


### Return type

[**Metric**](Metric.html)

<a name="postGamificationProfileMetrics"></a>

# **postGamificationProfileMetrics**



> [Metric](Metric.html) postGamificationProfileMetrics(profileId, body)

Creates a gamified metric with a given metric definition and metric objective under in a performance profile



Wraps POST /api/v2/gamification/profiles/{profileId}/metrics  

Requires ALL permissions: 

* gamification:profile:update

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GamificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GamificationApi apiInstance = new GamificationApi();
String profileId = "profileId_example"; // String | Performance Profile Id
CreateMetric body = new CreateMetric(); // CreateMetric | Metric
try {
    Metric result = apiInstance.postGamificationProfileMetrics(profileId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#postGamificationProfileMetrics");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **profileId** | **String**| Performance Profile Id | 
| **body** | [**CreateMetric**](CreateMetric.html)| Metric | 
{: class="table-striped"}


### Return type

[**Metric**](Metric.html)

<a name="postGamificationProfiles"></a>

# **postGamificationProfiles**



> [PerformanceProfile](PerformanceProfile.html) postGamificationProfiles(body, copyMetrics)

Create a new custom performance profile



Wraps POST /api/v2/gamification/profiles  

Requires ANY permissions: 

* gamification:profile:update

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GamificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GamificationApi apiInstance = new GamificationApi();
CreatePerformanceProfile body = new CreatePerformanceProfile(); // CreatePerformanceProfile | performanceProfile
Boolean copyMetrics = true; // Boolean | Flag to copy metrics. If set to false, there will be no metrics associated with the new profile. If set to true or is absent (the default behavior), all metrics from the default profile will be copied over into the new profile.
try {
    PerformanceProfile result = apiInstance.postGamificationProfiles(body, copyMetrics);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#postGamificationProfiles");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**CreatePerformanceProfile**](CreatePerformanceProfile.html)| performanceProfile | 
| **copyMetrics** | **Boolean**| Flag to copy metrics. If set to false, there will be no metrics associated with the new profile. If set to true or is absent (the default behavior), all metrics from the default profile will be copied over into the new profile. | [optional] [default to true] 
{: class="table-striped"}


### Return type

[**PerformanceProfile**](PerformanceProfile.html)

<a name="putGamificationMetric"></a>

# **putGamificationMetric**



> [Metric](Metric.html) putGamificationMetric(metricId, body, performanceProfileId)

Updates a metric



Wraps PUT /api/v2/gamification/metrics/{metricId}  

Requires ALL permissions: 

* gamification:profile:update

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GamificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GamificationApi apiInstance = new GamificationApi();
String metricId = "metricId_example"; // String | metric Id
CreateMetric body = new CreateMetric(); // CreateMetric | Metric
String performanceProfileId = "performanceProfileId_example"; // String | The profile id of the metrics you are trying to retrieve. The DEFAULT profile is used if nothing is given.
try {
    Metric result = apiInstance.putGamificationMetric(metricId, body, performanceProfileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#putGamificationMetric");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **metricId** | **String**| metric Id | 
| **body** | [**CreateMetric**](CreateMetric.html)| Metric | 
| **performanceProfileId** | **String**| The profile id of the metrics you are trying to retrieve. The DEFAULT profile is used if nothing is given. | [optional] 
{: class="table-striped"}


### Return type

[**Metric**](Metric.html)

<a name="putGamificationProfile"></a>

# **putGamificationProfile**



> [PerformanceProfile](PerformanceProfile.html) putGamificationProfile(performanceProfileId, body)

Updates a performance profile



Wraps PUT /api/v2/gamification/profiles/{performanceProfileId}  

Requires ANY permissions: 

* gamification:profile:update

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GamificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GamificationApi apiInstance = new GamificationApi();
String performanceProfileId = "performanceProfileId_example"; // String | Performance Profile Id
PerformanceProfile body = new PerformanceProfile(); // PerformanceProfile | performanceProfile
try {
    PerformanceProfile result = apiInstance.putGamificationProfile(performanceProfileId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#putGamificationProfile");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **performanceProfileId** | **String**| Performance Profile Id | 
| **body** | [**PerformanceProfile**](PerformanceProfile.html)| performanceProfile | [optional] 
{: class="table-striped"}


### Return type

[**PerformanceProfile**](PerformanceProfile.html)

<a name="putGamificationProfileMetric"></a>

# **putGamificationProfileMetric**



> [Metric](Metric.html) putGamificationProfileMetric(profileId, metricId, body)

Updates a metric in performance profile



Wraps PUT /api/v2/gamification/profiles/{profileId}/metrics/{metricId}  

Requires ALL permissions: 

* gamification:profile:update

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GamificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GamificationApi apiInstance = new GamificationApi();
String profileId = "profileId_example"; // String | Performance Profile Id
String metricId = "metricId_example"; // String | Metric Id
CreateMetric body = new CreateMetric(); // CreateMetric | Metric
try {
    Metric result = apiInstance.putGamificationProfileMetric(profileId, metricId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#putGamificationProfileMetric");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **profileId** | **String**| Performance Profile Id | 
| **metricId** | **String**| Metric Id | 
| **body** | [**CreateMetric**](CreateMetric.html)| Metric | 
{: class="table-striped"}


### Return type

[**Metric**](Metric.html)

<a name="putGamificationStatus"></a>

# **putGamificationStatus**



> [GamificationStatus](GamificationStatus.html) putGamificationStatus(status)

Update gamification activation status



Wraps PUT /api/v2/gamification/status  

Requires ANY permissions: 

* gamification:profile:update

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GamificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GamificationApi apiInstance = new GamificationApi();
GamificationStatus status = new GamificationStatus(); // GamificationStatus | Gamification status
try {
    GamificationStatus result = apiInstance.putGamificationStatus(status);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#putGamificationStatus");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **status** | [**GamificationStatus**](GamificationStatus.html)| Gamification status | 
{: class="table-striped"}


### Return type

[**GamificationStatus**](GamificationStatus.html)

