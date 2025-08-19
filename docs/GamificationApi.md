# GamificationApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**deleteEmployeeperformanceExternalmetricsDefinition**](GamificationApi#deleteEmployeeperformanceExternalmetricsDefinition) | Delete an External Metric Definition |
| [**deleteGamificationContest**](GamificationApi#deleteGamificationContest) | Delete a Contest by Id |
| [**getEmployeeperformanceExternalmetricsDefinition**](GamificationApi#getEmployeeperformanceExternalmetricsDefinition) | Get an External Metric Definition |
| [**getEmployeeperformanceExternalmetricsDefinitions**](GamificationApi#getEmployeeperformanceExternalmetricsDefinitions) | Get a list of External Metric Definitions of an organization, sorted by name in ascending order |
| [**getGamificationContest**](GamificationApi#getGamificationContest) | Get a Contest by Id |
| [**getGamificationContestAgentsScores**](GamificationApi#getGamificationContestAgentsScores) | Get Contest Scores (Admin) |
| [**getGamificationContestAgentsScoresMe**](GamificationApi#getGamificationContestAgentsScoresMe) | Get Contest Scores for the requesting Agent/Supervisor |
| [**getGamificationContestAgentsScoresTrends**](GamificationApi#getGamificationContestAgentsScoresTrends) | Get a Contest Score Trend (Average Trend) |
| [**getGamificationContestAgentsScoresTrendsMe**](GamificationApi#getGamificationContestAgentsScoresTrendsMe) | Get a Contest Score Trend for the requesting Agent |
| [**getGamificationContestPrizeimage**](GamificationApi#getGamificationContestPrizeimage) | Get a Contest Prize Image by Id |
| [**getGamificationContests**](GamificationApi#getGamificationContests) | Get a List of Contests (Admin) |
| [**getGamificationContestsMe**](GamificationApi#getGamificationContestsMe) | Get a List of Contests (Agent/Supervisor) |
| [**getGamificationInsights**](GamificationApi#getGamificationInsights) | Get insights summary |
| [**getGamificationInsightsDetails**](GamificationApi#getGamificationInsightsDetails) | Get insights details for the current user |
| [**getGamificationInsightsGroupsTrends**](GamificationApi#getGamificationInsightsGroupsTrends) | Get insights overall trend for the current user |
| [**getGamificationInsightsGroupsTrendsAll**](GamificationApi#getGamificationInsightsGroupsTrendsAll) | Get insights overall trend |
| [**getGamificationInsightsMembers**](GamificationApi#getGamificationInsightsMembers) | Query users in a profile during a period of time |
| [**getGamificationInsightsRankings**](GamificationApi#getGamificationInsightsRankings) | Get insights rankings |
| [**getGamificationInsightsTrends**](GamificationApi#getGamificationInsightsTrends) | Get insights user trend for the current user |
| [**getGamificationInsightsUserDetails**](GamificationApi#getGamificationInsightsUserDetails) | Get insights details for the user |
| [**getGamificationInsightsUserTrends**](GamificationApi#getGamificationInsightsUserTrends) | Get insights user trend for the user |
| [**getGamificationLeaderboard**](GamificationApi#getGamificationLeaderboard) | Leaderboard of the requesting user's division or performance profile |
| [**getGamificationLeaderboardAll**](GamificationApi#getGamificationLeaderboardAll) | Leaderboard by filter type |
| [**getGamificationLeaderboardAllBestpoints**](GamificationApi#getGamificationLeaderboardAllBestpoints) | Best Points by division or performance profile |
| [**getGamificationLeaderboardBestpoints**](GamificationApi#getGamificationLeaderboardBestpoints) | Best Points of the requesting user's current performance profile or division |
| [**getGamificationMetricdefinition**](GamificationApi#getGamificationMetricdefinition) | Metric definition by id |
| [**getGamificationMetricdefinitions**](GamificationApi#getGamificationMetricdefinitions) | All metric definitions |
| [**getGamificationProfile**](GamificationApi#getGamificationProfile) | Performance profile by id |
| [**getGamificationProfileMembers**](GamificationApi#getGamificationProfileMembers) | Members of a given performance profile |
| [**getGamificationProfileMetric**](GamificationApi#getGamificationProfileMetric) | Performance profile gamified metric by id |
| [**getGamificationProfileMetrics**](GamificationApi#getGamificationProfileMetrics) | All gamified metrics for a given performance profile |
| [**getGamificationProfileMetricsObjectivedetails**](GamificationApi#getGamificationProfileMetricsObjectivedetails) | All metrics for a given performance profile with objective details such as order and maxPoints |
| [**getGamificationProfiles**](GamificationApi#getGamificationProfiles) | All performance profiles |
| [**getGamificationProfilesUser**](GamificationApi#getGamificationProfilesUser) | Performance profile of a user |
| [**getGamificationProfilesUsersMe**](GamificationApi#getGamificationProfilesUsersMe) | Performance profile of the requesting user |
| [**getGamificationScorecards**](GamificationApi#getGamificationScorecards) | Workday performance metrics of the requesting user |
| [**getGamificationScorecardsAttendance**](GamificationApi#getGamificationScorecardsAttendance) | Attendance status metrics of the requesting user |
| [**getGamificationScorecardsBestpoints**](GamificationApi#getGamificationScorecardsBestpoints) | Best points of the requesting user |
| [**getGamificationScorecardsPointsAlltime**](GamificationApi#getGamificationScorecardsPointsAlltime) | All-time points of the requesting user |
| [**getGamificationScorecardsPointsAverage**](GamificationApi#getGamificationScorecardsPointsAverage) | Average points of the requesting user's division or performance profile |
| [**getGamificationScorecardsPointsTrends**](GamificationApi#getGamificationScorecardsPointsTrends) | Points trends of the requesting user |
| [**getGamificationScorecardsProfileMetricUserValuesTrends**](GamificationApi#getGamificationScorecardsProfileMetricUserValuesTrends) | Average performance values trends by metric of a user |
| [**getGamificationScorecardsProfileMetricUsersValuesTrends**](GamificationApi#getGamificationScorecardsProfileMetricUsersValuesTrends) | Average performance values trends by metric of a division or a performance profile |
| [**getGamificationScorecardsProfileMetricValuesTrends**](GamificationApi#getGamificationScorecardsProfileMetricValuesTrends) | Average performance values trends by metric of the requesting user |
| [**getGamificationScorecardsUser**](GamificationApi#getGamificationScorecardsUser) | Workday performance metrics for a user |
| [**getGamificationScorecardsUserAttendance**](GamificationApi#getGamificationScorecardsUserAttendance) | Attendance status metrics for a user |
| [**getGamificationScorecardsUserBestpoints**](GamificationApi#getGamificationScorecardsUserBestpoints) | Best points of a user |
| [**getGamificationScorecardsUserPointsAlltime**](GamificationApi#getGamificationScorecardsUserPointsAlltime) | All-time points for a user |
| [**getGamificationScorecardsUserPointsTrends**](GamificationApi#getGamificationScorecardsUserPointsTrends) | Points trend for a user |
| [**getGamificationScorecardsUserValuesTrends**](GamificationApi#getGamificationScorecardsUserValuesTrends) | Values trends of a user |
| [**getGamificationScorecardsUsersPointsAverage**](GamificationApi#getGamificationScorecardsUsersPointsAverage) | Workday average points by target group |
| [**getGamificationScorecardsUsersValuesAverage**](GamificationApi#getGamificationScorecardsUsersValuesAverage) | Workday average values by target group |
| [**getGamificationScorecardsUsersValuesTrends**](GamificationApi#getGamificationScorecardsUsersValuesTrends) | Values trend by target group |
| [**getGamificationScorecardsValuesAverage**](GamificationApi#getGamificationScorecardsValuesAverage) | Average values of the requesting user's division or performance profile |
| [**getGamificationScorecardsValuesTrends**](GamificationApi#getGamificationScorecardsValuesTrends) | Values trends of the requesting user or group |
| [**getGamificationStatus**](GamificationApi#getGamificationStatus) | Gamification activation status |
| [**getGamificationTemplate**](GamificationApi#getGamificationTemplate) | Objective template by id |
| [**getGamificationTemplates**](GamificationApi#getGamificationTemplates) | All objective templates |
| [**patchEmployeeperformanceExternalmetricsDefinition**](GamificationApi#patchEmployeeperformanceExternalmetricsDefinition) | Update External Metric Definition |
| [**patchGamificationContest**](GamificationApi#patchGamificationContest) | Finalize a Contest by Id |
| [**postEmployeeperformanceExternalmetricsData**](GamificationApi#postEmployeeperformanceExternalmetricsData) | Write External Metric Data |
| [**postEmployeeperformanceExternalmetricsDefinitions**](GamificationApi#postEmployeeperformanceExternalmetricsDefinitions) | Create External Metric Definition |
| [**postGamificationContests**](GamificationApi#postGamificationContests) | Creates a Contest |
| [**postGamificationContestsUploadsPrizeimages**](GamificationApi#postGamificationContestsUploadsPrizeimages) | Generates pre-signed URL to upload a prize image for gamification contests |
| [**postGamificationProfileActivate**](GamificationApi#postGamificationProfileActivate) | Activate a performance profile |
| [**postGamificationProfileDeactivate**](GamificationApi#postGamificationProfileDeactivate) | Deactivate a performance profile |
| [**postGamificationProfileMembers**](GamificationApi#postGamificationProfileMembers) | Assign members to a given performance profile |
| [**postGamificationProfileMembersValidate**](GamificationApi#postGamificationProfileMembersValidate) | Validate member assignment |
| [**postGamificationProfileMetricLink**](GamificationApi#postGamificationProfileMetricLink) | Creates a linked metric |
| [**postGamificationProfileMetrics**](GamificationApi#postGamificationProfileMetrics) | Creates a gamified metric with a given metric definition and metric objective under in a performance profile |
| [**postGamificationProfiles**](GamificationApi#postGamificationProfiles) | Create a new custom performance profile |
| [**postGamificationProfilesUserQuery**](GamificationApi#postGamificationProfilesUserQuery) | Query performance profiles in date range for a user |
| [**postGamificationProfilesUsersMeQuery**](GamificationApi#postGamificationProfilesUsersMeQuery) | Query performance profiles in date range for the current user |
| [**putGamificationContest**](GamificationApi#putGamificationContest) | Update a Contest by Id |
| [**putGamificationProfile**](GamificationApi#putGamificationProfile) | Updates a performance profile |
| [**putGamificationProfileMetric**](GamificationApi#putGamificationProfileMetric) | Updates a metric in performance profile |
| [**putGamificationStatus**](GamificationApi#putGamificationStatus) | Update gamification activation status |
{: class="table-striped"}


# **deleteEmployeeperformanceExternalmetricsDefinition**


> Void deleteEmployeeperformanceExternalmetricsDefinition(metricId)

Delete an External Metric Definition

Wraps DELETE /api/v2/employeeperformance/externalmetrics/definitions/{metricId}  

Requires ANY permissions: 

* employeePerformance:externalMetricDefinition:delete

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
String metricId = "metricId_example"; // String | Specifies the External Metric Definition ID
try {
    apiInstance.deleteEmployeeperformanceExternalmetricsDefinition(metricId);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#deleteEmployeeperformanceExternalmetricsDefinition");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **metricId** | **String**| Specifies the External Metric Definition ID | 
{: class="table-striped"}


### Return type

null (empty response body)


# **deleteGamificationContest**


> Void deleteGamificationContest(contestId)

Delete a Contest by Id

Wraps DELETE /api/v2/gamification/contests/{contestId}  

Requires ANY permissions: 

* gamification:contest:delete
* gamification:contest:deleteAll

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
String contestId = "contestId_example"; // String | The ID of the contest
try {
    apiInstance.deleteGamificationContest(contestId);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#deleteGamificationContest");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **contestId** | **String**| The ID of the contest | 
{: class="table-striped"}


### Return type

null (empty response body)


# **getEmployeeperformanceExternalmetricsDefinition**


> [ExternalMetricDefinition](ExternalMetricDefinition) getEmployeeperformanceExternalmetricsDefinition(metricId)

Get an External Metric Definition

Wraps GET /api/v2/employeeperformance/externalmetrics/definitions/{metricId}  

Requires ANY permissions: 

* employeePerformance:externalMetricDefinition:view

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
String metricId = "metricId_example"; // String | Specifies the External Metric Definition ID
try {
    ExternalMetricDefinition result = apiInstance.getEmployeeperformanceExternalmetricsDefinition(metricId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#getEmployeeperformanceExternalmetricsDefinition");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **metricId** | **String**| Specifies the External Metric Definition ID | 
{: class="table-striped"}


### Return type

[**ExternalMetricDefinition**](ExternalMetricDefinition)


# **getEmployeeperformanceExternalmetricsDefinitions**


> [ExternalMetricDefinitionListing](ExternalMetricDefinitionListing) getEmployeeperformanceExternalmetricsDefinitions(pageSize, pageNumber)

Get a list of External Metric Definitions of an organization, sorted by name in ascending order

Wraps GET /api/v2/employeeperformance/externalmetrics/definitions  

Requires ANY permissions: 

* employeePerformance:externalMetricDefinition:view

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
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
try {
    ExternalMetricDefinitionListing result = apiInstance.getEmployeeperformanceExternalmetricsDefinitions(pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#getEmployeeperformanceExternalmetricsDefinitions");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
{: class="table-striped"}


### Return type

[**ExternalMetricDefinitionListing**](ExternalMetricDefinitionListing)


# **getGamificationContest**


> [ContestsResponse](ContestsResponse) getGamificationContest(contestId)

Get a Contest by Id

Wraps GET /api/v2/gamification/contests/{contestId}  

Requires ANY permissions: 

* gamification:contest:view

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
String contestId = "contestId_example"; // String | The ID of the contest
try {
    ContestsResponse result = apiInstance.getGamificationContest(contestId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#getGamificationContest");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **contestId** | **String**| The ID of the contest | 
{: class="table-striped"}


### Return type

[**ContestsResponse**](ContestsResponse)


# **getGamificationContestAgentsScores**


> [ContestScoresAgentsPagedList](ContestScoresAgentsPagedList) getGamificationContestAgentsScores(contestId, pageNumber, pageSize, workday, returnsView)

Get Contest Scores (Admin)

Wraps GET /api/v2/gamification/contests/{contestId}/agents/scores  

Requires ANY permissions: 

* gamification:contest:viewAll

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
String contestId = "contestId_example"; // String | The ID of the contest
Integer pageNumber = 1; // Integer | 
Integer pageSize = 25; // Integer | 
LocalDate workday = new LocalDate(); // LocalDate | Target querying workday. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
String returnsView = "All"; // String | Desired response results
try {
    ContestScoresAgentsPagedList result = apiInstance.getGamificationContestAgentsScores(contestId, pageNumber, pageSize, workday, returnsView);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#getGamificationContestAgentsScores");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **contestId** | **String**| The ID of the contest | 
| **pageNumber** | **Integer**|  | [optional] [default to 1] 
| **pageSize** | **Integer**|  | [optional] [default to 25] 
| **workday** | **LocalDate**| Target querying workday. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd | [optional] 
| **returnsView** | **String**| Desired response results | [optional] [default to All]<br />**Values**: All, TopAndBottom 
{: class="table-striped"}


### Return type

[**ContestScoresAgentsPagedList**](ContestScoresAgentsPagedList)


# **getGamificationContestAgentsScoresMe**


> [ContestScoresAgentsPagedList](ContestScoresAgentsPagedList) getGamificationContestAgentsScoresMe(contestId, pageNumber, pageSize, workday, returnsView)

Get Contest Scores for the requesting Agent/Supervisor

Wraps GET /api/v2/gamification/contests/{contestId}/agents/scores/me  

Requires ALL permissions: 

* gamification:contest:view

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
String contestId = "contestId_example"; // String | The ID of the contest
Integer pageNumber = 1; // Integer | 
Integer pageSize = 25; // Integer | 
LocalDate workday = new LocalDate(); // LocalDate | Target querying workday. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
String returnsView = "All"; // String | Desired response results (Supervisor Only)
try {
    ContestScoresAgentsPagedList result = apiInstance.getGamificationContestAgentsScoresMe(contestId, pageNumber, pageSize, workday, returnsView);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#getGamificationContestAgentsScoresMe");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **contestId** | **String**| The ID of the contest | 
| **pageNumber** | **Integer**|  | [optional] [default to 1] 
| **pageSize** | **Integer**|  | [optional] [default to 25] 
| **workday** | **LocalDate**| Target querying workday. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd | [optional] 
| **returnsView** | **String**| Desired response results (Supervisor Only) | [optional] [default to All]<br />**Values**: All, TopAndBottom 
{: class="table-striped"}


### Return type

[**ContestScoresAgentsPagedList**](ContestScoresAgentsPagedList)


# **getGamificationContestAgentsScoresTrends**


> [ContestScoresGroupTrendList](ContestScoresGroupTrendList) getGamificationContestAgentsScoresTrends(contestId)

Get a Contest Score Trend (Average Trend)

Wraps GET /api/v2/gamification/contests/{contestId}/agents/scores/trends  

Requires ANY permissions: 

* gamification:contest:view

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
String contestId = "contestId_example"; // String | The ID of the contest
try {
    ContestScoresGroupTrendList result = apiInstance.getGamificationContestAgentsScoresTrends(contestId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#getGamificationContestAgentsScoresTrends");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **contestId** | **String**| The ID of the contest | 
{: class="table-striped"}


### Return type

[**ContestScoresGroupTrendList**](ContestScoresGroupTrendList)


# **getGamificationContestAgentsScoresTrendsMe**


> [ContestScoresAgentTrendList](ContestScoresAgentTrendList) getGamificationContestAgentsScoresTrendsMe(contestId)

Get a Contest Score Trend for the requesting Agent

Wraps GET /api/v2/gamification/contests/{contestId}/agents/scores/trends/me  

Requires ANY permissions: 

* gamification:contest:view

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
String contestId = "contestId_example"; // String | The ID of the contest
try {
    ContestScoresAgentTrendList result = apiInstance.getGamificationContestAgentsScoresTrendsMe(contestId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#getGamificationContestAgentsScoresTrendsMe");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **contestId** | **String**| The ID of the contest | 
{: class="table-striped"}


### Return type

[**ContestScoresAgentTrendList**](ContestScoresAgentTrendList)


# **getGamificationContestPrizeimage**


> [PrizeImages](PrizeImages) getGamificationContestPrizeimage(contestId, prizeImageId)

Get a Contest Prize Image by Id

Wraps GET /api/v2/gamification/contests/{contestId}/prizeimages/{prizeImageId}  

Requires ANY permissions: 

* gamification:contest:view
* gamification:contest:viewAll

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
String contestId = "contestId_example"; // String | The ID of the contest
String prizeImageId = "prizeImageId_example"; // String | The ID of the prize image
try {
    PrizeImages result = apiInstance.getGamificationContestPrizeimage(contestId, prizeImageId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#getGamificationContestPrizeimage");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **contestId** | **String**| The ID of the contest | 
| **prizeImageId** | **String**| The ID of the prize image | 
{: class="table-striped"}


### Return type

[**PrizeImages**](PrizeImages)


# **getGamificationContests**


> [GetContestsEssentialsListing](GetContestsEssentialsListing) getGamificationContests(pageNumber, pageSize, dateStart, dateEnd, status, sortBy, sortOrder)

Get a List of Contests (Admin)

Wraps GET /api/v2/gamification/contests  

Requires ANY permissions: 

* gamification:contest:viewAll

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
Integer pageNumber = 1; // Integer | 
Integer pageSize = 25; // Integer | 
LocalDate dateStart = new LocalDate(); // LocalDate | Start date for the query. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
LocalDate dateEnd = new LocalDate(); // LocalDate | End date for the query. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
List<String> status = Arrays.asList(null); // List<String> | 
String sortBy = "dateStart"; // String | 
String sortOrder = "desc"; // String | 
try {
    GetContestsEssentialsListing result = apiInstance.getGamificationContests(pageNumber, pageSize, dateStart, dateEnd, status, sortBy, sortOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#getGamificationContests");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageNumber** | **Integer**|  | [optional] [default to 1] 
| **pageSize** | **Integer**|  | [optional] [default to 25] 
| **dateStart** | **LocalDate**| Start date for the query. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd | [optional] 
| **dateEnd** | **LocalDate**| End date for the query. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd | [optional] 
| **status** | [**List&lt;String&gt;**](String)|  | [optional]<br />**Values**: Upcoming, Ongoing, Pending, RecentlyCompleted, Completed, Cancelled 
| **sortBy** | **String**|  | [optional] [default to dateStart]<br />**Values**: title, dateStart, dateEnd, dateFinalized, status, profile, participantCount 
| **sortOrder** | **String**|  | [optional] [default to desc]<br />**Values**: asc, desc 
{: class="table-striped"}


### Return type

[**GetContestsEssentialsListing**](GetContestsEssentialsListing)


# **getGamificationContestsMe**


> [GetContestsEssentialsListing](GetContestsEssentialsListing) getGamificationContestsMe(pageNumber, pageSize, dateStart, dateEnd, status, sortBy, sortOrder, view)

Get a List of Contests (Agent/Supervisor)

Wraps GET /api/v2/gamification/contests/me  

Requires ALL permissions: 

* gamification:contest:view

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
Integer pageNumber = 1; // Integer | 
Integer pageSize = 25; // Integer | 
LocalDate dateStart = new LocalDate(); // LocalDate | Start date for the query. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
LocalDate dateEnd = new LocalDate(); // LocalDate | End date for the query. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
List<String> status = Arrays.asList(null); // List<String> | 
String sortBy = "dateStart"; // String | 
String sortOrder = "desc"; // String | 
String view = "participant"; // String | 
try {
    GetContestsEssentialsListing result = apiInstance.getGamificationContestsMe(pageNumber, pageSize, dateStart, dateEnd, status, sortBy, sortOrder, view);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#getGamificationContestsMe");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageNumber** | **Integer**|  | [optional] [default to 1] 
| **pageSize** | **Integer**|  | [optional] [default to 25] 
| **dateStart** | **LocalDate**| Start date for the query. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd | [optional] 
| **dateEnd** | **LocalDate**| End date for the query. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd | [optional] 
| **status** | [**List&lt;String&gt;**](String)|  | [optional]<br />**Values**: Upcoming, Ongoing, Pending, RecentlyCompleted, Completed, Cancelled 
| **sortBy** | **String**|  | [optional] [default to dateStart]<br />**Values**: title, dateStart, dateEnd, dateFinalized, status, profile, participantCount 
| **sortOrder** | **String**|  | [optional] [default to desc]<br />**Values**: asc, desc 
| **view** | **String**|  | [optional] [default to participant]<br />**Values**: participant, creator 
{: class="table-striped"}


### Return type

[**GetContestsEssentialsListing**](GetContestsEssentialsListing)


# **getGamificationInsights**


> [InsightsSummary](InsightsSummary) getGamificationInsights(filterType, filterId, granularity, comparativePeriodStartWorkday, primaryPeriodStartWorkday, pageSize, pageNumber, sortKey, sortMetricId, sortOrder, userIds)

Get insights summary

Wraps GET /api/v2/gamification/insights  

Requires ANY permissions: 

* gamification:insights:viewAll

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
String granularity = "granularity_example"; // String | Granularity
LocalDate comparativePeriodStartWorkday = new LocalDate(); // LocalDate | The start work day of comparative period. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
LocalDate primaryPeriodStartWorkday = new LocalDate(); // LocalDate | The start work day of primary period. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String sortKey = "sortKey_example"; // String | Sort key
String sortMetricId = "sortMetricId_example"; // String | Sort Metric Id
String sortOrder = "asc"; // String | Sort order
String userIds = "userIds_example"; // String | A list of up to 100 comma-separated user Ids
try {
    InsightsSummary result = apiInstance.getGamificationInsights(filterType, filterId, granularity, comparativePeriodStartWorkday, primaryPeriodStartWorkday, pageSize, pageNumber, sortKey, sortMetricId, sortOrder, userIds);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#getGamificationInsights");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **filterType** | **String**| Filter type for the query request. |<br />**Values**: PerformanceProfile, Division 
| **filterId** | **String**| ID for the filter type. | 
| **granularity** | **String**| Granularity |<br />**Values**: Weekly, Monthly 
| **comparativePeriodStartWorkday** | **LocalDate**| The start work day of comparative period. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd | 
| **primaryPeriodStartWorkday** | **LocalDate**| The start work day of primary period. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd | 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **sortKey** | **String**| Sort key | [optional]<br />**Values**: percentOfGoal, percentOfGoalChange, overallPercentOfGoal, overallPercentOfGoalChange, value, valueChange 
| **sortMetricId** | **String**| Sort Metric Id | [optional] 
| **sortOrder** | **String**| Sort order | [optional] [default to asc]<br />**Values**: asc, desc 
| **userIds** | **String**| A list of up to 100 comma-separated user Ids | [optional] 
{: class="table-striped"}


### Return type

[**InsightsSummary**](InsightsSummary)


# **getGamificationInsightsDetails**


> [InsightsDetails](InsightsDetails) getGamificationInsightsDetails(filterType, filterId, granularity, comparativePeriodStartWorkday, primaryPeriodStartWorkday)

Get insights details for the current user

Wraps GET /api/v2/gamification/insights/details  

Requires ANY permissions: 

* gamification:insights:view

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
String granularity = "granularity_example"; // String | Granularity
LocalDate comparativePeriodStartWorkday = new LocalDate(); // LocalDate | The start work day of comparative period. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
LocalDate primaryPeriodStartWorkday = new LocalDate(); // LocalDate | The start work day of primary period. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
try {
    InsightsDetails result = apiInstance.getGamificationInsightsDetails(filterType, filterId, granularity, comparativePeriodStartWorkday, primaryPeriodStartWorkday);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#getGamificationInsightsDetails");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **filterType** | **String**| Filter type for the query request. |<br />**Values**: PerformanceProfile, Division 
| **filterId** | **String**| ID for the filter type. | 
| **granularity** | **String**| Granularity |<br />**Values**: Weekly, Monthly 
| **comparativePeriodStartWorkday** | **LocalDate**| The start work day of comparative period. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd | 
| **primaryPeriodStartWorkday** | **LocalDate**| The start work day of primary period. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd | 
{: class="table-striped"}


### Return type

[**InsightsDetails**](InsightsDetails)


# **getGamificationInsightsGroupsTrends**


> [InsightsTrend](InsightsTrend) getGamificationInsightsGroupsTrends(filterType, filterId, granularity, comparativePeriodStartWorkday, comparativePeriodEndWorkday, primaryPeriodStartWorkday, primaryPeriodEndWorkday)

Get insights overall trend for the current user

Wraps GET /api/v2/gamification/insights/groups/trends  

Requires ANY permissions: 

* gamification:insights:view

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
String granularity = "granularity_example"; // String | Granularity
LocalDate comparativePeriodStartWorkday = new LocalDate(); // LocalDate | The start work day of comparative period. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
LocalDate comparativePeriodEndWorkday = new LocalDate(); // LocalDate | The end work day of comparative period. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
LocalDate primaryPeriodStartWorkday = new LocalDate(); // LocalDate | The start work day of primary period. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
LocalDate primaryPeriodEndWorkday = new LocalDate(); // LocalDate | The end work day of primary period. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
try {
    InsightsTrend result = apiInstance.getGamificationInsightsGroupsTrends(filterType, filterId, granularity, comparativePeriodStartWorkday, comparativePeriodEndWorkday, primaryPeriodStartWorkday, primaryPeriodEndWorkday);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#getGamificationInsightsGroupsTrends");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **filterType** | **String**| Filter type for the query request. |<br />**Values**: PerformanceProfile, Division 
| **filterId** | **String**| ID for the filter type. | 
| **granularity** | **String**| Granularity |<br />**Values**: Daily, Weekly, Monthly 
| **comparativePeriodStartWorkday** | **LocalDate**| The start work day of comparative period. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd | 
| **comparativePeriodEndWorkday** | **LocalDate**| The end work day of comparative period. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd | 
| **primaryPeriodStartWorkday** | **LocalDate**| The start work day of primary period. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd | 
| **primaryPeriodEndWorkday** | **LocalDate**| The end work day of primary period. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd | 
{: class="table-striped"}


### Return type

[**InsightsTrend**](InsightsTrend)


# **getGamificationInsightsGroupsTrendsAll**


> [InsightsTrend](InsightsTrend) getGamificationInsightsGroupsTrendsAll(filterType, filterId, granularity, comparativePeriodStartWorkday, comparativePeriodEndWorkday, primaryPeriodStartWorkday, primaryPeriodEndWorkday)

Get insights overall trend

Wraps GET /api/v2/gamification/insights/groups/trends/all  

Requires ANY permissions: 

* gamification:insights:viewAll

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
String granularity = "granularity_example"; // String | Granularity
LocalDate comparativePeriodStartWorkday = new LocalDate(); // LocalDate | The start work day of comparative period. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
LocalDate comparativePeriodEndWorkday = new LocalDate(); // LocalDate | The end work day of comparative period. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
LocalDate primaryPeriodStartWorkday = new LocalDate(); // LocalDate | The start work day of primary period. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
LocalDate primaryPeriodEndWorkday = new LocalDate(); // LocalDate | The end work day of primary period. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
try {
    InsightsTrend result = apiInstance.getGamificationInsightsGroupsTrendsAll(filterType, filterId, granularity, comparativePeriodStartWorkday, comparativePeriodEndWorkday, primaryPeriodStartWorkday, primaryPeriodEndWorkday);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#getGamificationInsightsGroupsTrendsAll");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **filterType** | **String**| Filter type for the query request. |<br />**Values**: PerformanceProfile, Division 
| **filterId** | **String**| ID for the filter type. | 
| **granularity** | **String**| Granularity |<br />**Values**: Daily, Weekly, Monthly 
| **comparativePeriodStartWorkday** | **LocalDate**| The start work day of comparative period. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd | 
| **comparativePeriodEndWorkday** | **LocalDate**| The end work day of comparative period. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd | 
| **primaryPeriodStartWorkday** | **LocalDate**| The start work day of primary period. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd | 
| **primaryPeriodEndWorkday** | **LocalDate**| The end work day of primary period. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd | 
{: class="table-striped"}


### Return type

[**InsightsTrend**](InsightsTrend)


# **getGamificationInsightsMembers**


> [InsightsAgents](InsightsAgents) getGamificationInsightsMembers(filterType, filterId, granularity, startWorkday)

Query users in a profile during a period of time

Wraps GET /api/v2/gamification/insights/members  

Requires ANY permissions: 

* gamification:insights:viewAll

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
String granularity = "granularity_example"; // String | Granularity
LocalDate startWorkday = new LocalDate(); // LocalDate | The start work day. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
try {
    InsightsAgents result = apiInstance.getGamificationInsightsMembers(filterType, filterId, granularity, startWorkday);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#getGamificationInsightsMembers");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **filterType** | **String**| Filter type for the query request. |<br />**Values**: PerformanceProfile, Division 
| **filterId** | **String**| ID for the filter type. | 
| **granularity** | **String**| Granularity |<br />**Values**: Weekly, Monthly 
| **startWorkday** | **LocalDate**| The start work day. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd | 
{: class="table-striped"}


### Return type

[**InsightsAgents**](InsightsAgents)


# **getGamificationInsightsRankings**


> [InsightsRankings](InsightsRankings) getGamificationInsightsRankings(filterType, filterId, granularity, comparativePeriodStartWorkday, primaryPeriodStartWorkday, sortKey, sortMetricId, sectionSize, userIds)

Get insights rankings

Wraps GET /api/v2/gamification/insights/rankings  

Requires ANY permissions: 

* gamification:insights:viewAll

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
String granularity = "granularity_example"; // String | Granularity
LocalDate comparativePeriodStartWorkday = new LocalDate(); // LocalDate | The start work day of comparative period. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
LocalDate primaryPeriodStartWorkday = new LocalDate(); // LocalDate | The start work day of primary period. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
String sortKey = "sortKey_example"; // String | Sort key
String sortMetricId = "sortMetricId_example"; // String | Sort Metric Id
Integer sectionSize = 56; // Integer | The number of top and bottom users to return before ties
String userIds = "userIds_example"; // String | A list of up to 100 comma-separated user Ids
try {
    InsightsRankings result = apiInstance.getGamificationInsightsRankings(filterType, filterId, granularity, comparativePeriodStartWorkday, primaryPeriodStartWorkday, sortKey, sortMetricId, sectionSize, userIds);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#getGamificationInsightsRankings");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **filterType** | **String**| Filter type for the query request. |<br />**Values**: PerformanceProfile, Division 
| **filterId** | **String**| ID for the filter type. | 
| **granularity** | **String**| Granularity |<br />**Values**: Weekly, Monthly 
| **comparativePeriodStartWorkday** | **LocalDate**| The start work day of comparative period. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd | 
| **primaryPeriodStartWorkday** | **LocalDate**| The start work day of primary period. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd | 
| **sortKey** | **String**| Sort key |<br />**Values**: percentOfGoal, percentOfGoalChange, overallPercentOfGoal, overallPercentOfGoalChange, value, valueChange 
| **sortMetricId** | **String**| Sort Metric Id | [optional] 
| **sectionSize** | **Integer**| The number of top and bottom users to return before ties | [optional] 
| **userIds** | **String**| A list of up to 100 comma-separated user Ids | [optional] 
{: class="table-striped"}


### Return type

[**InsightsRankings**](InsightsRankings)


# **getGamificationInsightsTrends**


> [UserInsightsTrend](UserInsightsTrend) getGamificationInsightsTrends(filterType, filterId, granularity, comparativePeriodStartWorkday, comparativePeriodEndWorkday, primaryPeriodStartWorkday, primaryPeriodEndWorkday)

Get insights user trend for the current user

Wraps GET /api/v2/gamification/insights/trends  

Requires ANY permissions: 

* gamification:insights:view

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
String granularity = "granularity_example"; // String | Granularity
LocalDate comparativePeriodStartWorkday = new LocalDate(); // LocalDate | The start work day of comparative period. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
LocalDate comparativePeriodEndWorkday = new LocalDate(); // LocalDate | The end work day of comparative period. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
LocalDate primaryPeriodStartWorkday = new LocalDate(); // LocalDate | The start work day of primary period. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
LocalDate primaryPeriodEndWorkday = new LocalDate(); // LocalDate | The end work day of primary period. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
try {
    UserInsightsTrend result = apiInstance.getGamificationInsightsTrends(filterType, filterId, granularity, comparativePeriodStartWorkday, comparativePeriodEndWorkday, primaryPeriodStartWorkday, primaryPeriodEndWorkday);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#getGamificationInsightsTrends");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **filterType** | **String**| Filter type for the query request. |<br />**Values**: PerformanceProfile, Division 
| **filterId** | **String**| ID for the filter type. | 
| **granularity** | **String**| Granularity |<br />**Values**: Daily, Weekly 
| **comparativePeriodStartWorkday** | **LocalDate**| The start work day of comparative period. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd | 
| **comparativePeriodEndWorkday** | **LocalDate**| The end work day of comparative period. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd | 
| **primaryPeriodStartWorkday** | **LocalDate**| The start work day of primary period. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd | 
| **primaryPeriodEndWorkday** | **LocalDate**| The end work day of primary period. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd | 
{: class="table-striped"}


### Return type

[**UserInsightsTrend**](UserInsightsTrend)


# **getGamificationInsightsUserDetails**


> [InsightsDetails](InsightsDetails) getGamificationInsightsUserDetails(userId, filterType, filterId, granularity, comparativePeriodStartWorkday, primaryPeriodStartWorkday)

Get insights details for the user

Wraps GET /api/v2/gamification/insights/users/{userId}/details  

Requires ANY permissions: 

* gamification:insights:viewAll

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
String userId = "userId_example"; // String | The ID of a user.
String filterType = "filterType_example"; // String | Filter type for the query request.
String filterId = "filterId_example"; // String | ID for the filter type.
String granularity = "granularity_example"; // String | Granularity
LocalDate comparativePeriodStartWorkday = new LocalDate(); // LocalDate | The start work day of comparative period. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
LocalDate primaryPeriodStartWorkday = new LocalDate(); // LocalDate | The start work day of primary period. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
try {
    InsightsDetails result = apiInstance.getGamificationInsightsUserDetails(userId, filterType, filterId, granularity, comparativePeriodStartWorkday, primaryPeriodStartWorkday);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#getGamificationInsightsUserDetails");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| The ID of a user. | 
| **filterType** | **String**| Filter type for the query request. |<br />**Values**: PerformanceProfile, Division 
| **filterId** | **String**| ID for the filter type. | 
| **granularity** | **String**| Granularity |<br />**Values**: Weekly, Monthly 
| **comparativePeriodStartWorkday** | **LocalDate**| The start work day of comparative period. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd | 
| **primaryPeriodStartWorkday** | **LocalDate**| The start work day of primary period. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd | 
{: class="table-striped"}


### Return type

[**InsightsDetails**](InsightsDetails)


# **getGamificationInsightsUserTrends**


> [UserInsightsTrend](UserInsightsTrend) getGamificationInsightsUserTrends(userId, filterType, filterId, granularity, comparativePeriodStartWorkday, comparativePeriodEndWorkday, primaryPeriodStartWorkday, primaryPeriodEndWorkday)

Get insights user trend for the user

Wraps GET /api/v2/gamification/insights/users/{userId}/trends  

Requires ANY permissions: 

* gamification:insights:viewAll

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
String userId = "userId_example"; // String | The ID of a user.
String filterType = "filterType_example"; // String | Filter type for the query request.
String filterId = "filterId_example"; // String | ID for the filter type.
String granularity = "granularity_example"; // String | Granularity
LocalDate comparativePeriodStartWorkday = new LocalDate(); // LocalDate | The start work day of comparative period. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
LocalDate comparativePeriodEndWorkday = new LocalDate(); // LocalDate | The end work day of comparative period. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
LocalDate primaryPeriodStartWorkday = new LocalDate(); // LocalDate | The start work day of primary period. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
LocalDate primaryPeriodEndWorkday = new LocalDate(); // LocalDate | The end work day of primary period. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
try {
    UserInsightsTrend result = apiInstance.getGamificationInsightsUserTrends(userId, filterType, filterId, granularity, comparativePeriodStartWorkday, comparativePeriodEndWorkday, primaryPeriodStartWorkday, primaryPeriodEndWorkday);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#getGamificationInsightsUserTrends");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| The ID of a user. | 
| **filterType** | **String**| Filter type for the query request. |<br />**Values**: PerformanceProfile, Division 
| **filterId** | **String**| ID for the filter type. | 
| **granularity** | **String**| Granularity |<br />**Values**: Daily, Weekly 
| **comparativePeriodStartWorkday** | **LocalDate**| The start work day of comparative period. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd | 
| **comparativePeriodEndWorkday** | **LocalDate**| The end work day of comparative period. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd | 
| **primaryPeriodStartWorkday** | **LocalDate**| The start work day of primary period. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd | 
| **primaryPeriodEndWorkday** | **LocalDate**| The end work day of primary period. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd | 
{: class="table-striped"}


### Return type

[**UserInsightsTrend**](UserInsightsTrend)


# **getGamificationLeaderboard**


> [Leaderboard](Leaderboard) getGamificationLeaderboard(startWorkday, endWorkday, metricId)

Leaderboard of the requesting user's division or performance profile

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

[**Leaderboard**](Leaderboard)


# **getGamificationLeaderboardAll**


> [Leaderboard](Leaderboard) getGamificationLeaderboardAll(filterType, filterId, startWorkday, endWorkday, metricId)

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

[**Leaderboard**](Leaderboard)


# **getGamificationLeaderboardAllBestpoints**


> [OverallBestPoints](OverallBestPoints) getGamificationLeaderboardAllBestpoints(filterType, filterId)

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

[**OverallBestPoints**](OverallBestPoints)


# **getGamificationLeaderboardBestpoints**


> [OverallBestPoints](OverallBestPoints) getGamificationLeaderboardBestpoints()

Best Points of the requesting user's current performance profile or division

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

[**OverallBestPoints**](OverallBestPoints)


# **getGamificationMetricdefinition**


> [MetricDefinition](MetricDefinition) getGamificationMetricdefinition(metricDefinitionId)

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

[**MetricDefinition**](MetricDefinition)


# **getGamificationMetricdefinitions**


> [GetMetricDefinitionsResponse](GetMetricDefinitionsResponse) getGamificationMetricdefinitions()

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

[**GetMetricDefinitionsResponse**](GetMetricDefinitionsResponse)


# **getGamificationProfile**


> [PerformanceProfile](PerformanceProfile) getGamificationProfile(profileId)

Performance profile by id

Wraps GET /api/v2/gamification/profiles/{profileId}  

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
String profileId = "profileId_example"; // String | performanceProfileId
try {
    PerformanceProfile result = apiInstance.getGamificationProfile(profileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#getGamificationProfile");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **profileId** | **String**| performanceProfileId | 
{: class="table-striped"}


### Return type

[**PerformanceProfile**](PerformanceProfile)


# **getGamificationProfileMembers**


> [MemberListing](MemberListing) getGamificationProfileMembers(profileId)

Members of a given performance profile

Wraps GET /api/v2/gamification/profiles/{profileId}/members  

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
String profileId = "profileId_example"; // String | Profile Id
try {
    MemberListing result = apiInstance.getGamificationProfileMembers(profileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#getGamificationProfileMembers");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **profileId** | **String**| Profile Id | 
{: class="table-striped"}


### Return type

[**MemberListing**](MemberListing)


# **getGamificationProfileMetric**


> [Metric](Metric) getGamificationProfileMetric(profileId, metricId, workday)

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

[**Metric**](Metric)


# **getGamificationProfileMetrics**


> [GetMetricResponse](GetMetricResponse) getGamificationProfileMetrics(profileId, expand, workday, metricIds)

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
List<String> expand = Arrays.asList(null); // List<String> | Which fields, if any, to expand.
LocalDate workday = new LocalDate(); // LocalDate | The objective query workday. If not specified, then it retrieves the current objective. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
String metricIds = "metricIds_example"; // String | List of metric ids to filter the response (Optional, comma-separated).
try {
    GetMetricResponse result = apiInstance.getGamificationProfileMetrics(profileId, expand, workday, metricIds);
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
| **expand** | [**List&lt;String&gt;**](String)| Which fields, if any, to expand. | [optional]<br />**Values**: objective 
| **workday** | **LocalDate**| The objective query workday. If not specified, then it retrieves the current objective. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd | [optional] 
| **metricIds** | **String**| List of metric ids to filter the response (Optional, comma-separated). | [optional] 
{: class="table-striped"}


### Return type

[**GetMetricResponse**](GetMetricResponse)


# **getGamificationProfileMetricsObjectivedetails**


> [GetMetricsResponse](GetMetricsResponse) getGamificationProfileMetricsObjectivedetails(profileId, workday)

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

[**GetMetricsResponse**](GetMetricsResponse)


# **getGamificationProfiles**


> [GetProfilesResponse](GetProfilesResponse) getGamificationProfiles()

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

[**GetProfilesResponse**](GetProfilesResponse)


# **getGamificationProfilesUser**


> [PerformanceProfile](PerformanceProfile) getGamificationProfilesUser(userId, workday)

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

[**PerformanceProfile**](PerformanceProfile)


# **getGamificationProfilesUsersMe**


> [PerformanceProfile](PerformanceProfile) getGamificationProfilesUsersMe(workday)

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

[**PerformanceProfile**](PerformanceProfile)


# **getGamificationScorecards**


> [WorkdayMetricListing](WorkdayMetricListing) getGamificationScorecards(workday, expand)

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
List<String> expand = Arrays.asList(null); // List<String> | Which fields, if any, to expand.
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
| **expand** | [**List&lt;String&gt;**](String)| Which fields, if any, to expand. | [optional]<br />**Values**: objective 
{: class="table-striped"}


### Return type

[**WorkdayMetricListing**](WorkdayMetricListing)


# **getGamificationScorecardsAttendance**


> [AttendanceStatusListing](AttendanceStatusListing) getGamificationScorecardsAttendance(startWorkday, endWorkday)

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

[**AttendanceStatusListing**](AttendanceStatusListing)


# **getGamificationScorecardsBestpoints**


> [UserBestPoints](UserBestPoints) getGamificationScorecardsBestpoints()

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

[**UserBestPoints**](UserBestPoints)


# **getGamificationScorecardsPointsAlltime**


> [AllTimePoints](AllTimePoints) getGamificationScorecardsPointsAlltime(endWorkday)

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

[**AllTimePoints**](AllTimePoints)


# **getGamificationScorecardsPointsAverage**


> [SingleWorkdayAveragePoints](SingleWorkdayAveragePoints) getGamificationScorecardsPointsAverage(workday)

Average points of the requesting user's division or performance profile

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

[**SingleWorkdayAveragePoints**](SingleWorkdayAveragePoints)


# **getGamificationScorecardsPointsTrends**


> [WorkdayPointsTrend](WorkdayPointsTrend) getGamificationScorecardsPointsTrends(startWorkday, endWorkday, dayOfWeek)

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

[**WorkdayPointsTrend**](WorkdayPointsTrend)


# **getGamificationScorecardsProfileMetricUserValuesTrends**


> [MetricValueTrendAverage](MetricValueTrendAverage) getGamificationScorecardsProfileMetricUserValuesTrends(profileId, metricId, userId, startWorkday, endWorkday, referenceWorkday, timeZone)

Average performance values trends by metric of a user

Wraps GET /api/v2/gamification/scorecards/profiles/{profileId}/metrics/{metricId}/users/{userId}/values/trends  

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
String profileId = "profileId_example"; // String | performanceProfileId
String metricId = "metricId_example"; // String | metricId
String userId = "userId_example"; // String | 
LocalDate startWorkday = new LocalDate(); // LocalDate | Start workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
LocalDate endWorkday = new LocalDate(); // LocalDate | End workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
LocalDate referenceWorkday = new LocalDate(); // LocalDate | Reference workday for the trend. Used to determine the associated metric definition. If not set, then the value of endWorkday is used. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
String timeZone = "UTC"; // String | Timezone for the workday. Defaults to UTC
try {
    MetricValueTrendAverage result = apiInstance.getGamificationScorecardsProfileMetricUserValuesTrends(profileId, metricId, userId, startWorkday, endWorkday, referenceWorkday, timeZone);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#getGamificationScorecardsProfileMetricUserValuesTrends");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **profileId** | **String**| performanceProfileId | 
| **metricId** | **String**| metricId | 
| **userId** | **String**|  | 
| **startWorkday** | **LocalDate**| Start workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd | 
| **endWorkday** | **LocalDate**| End workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd | 
| **referenceWorkday** | **LocalDate**| Reference workday for the trend. Used to determine the associated metric definition. If not set, then the value of endWorkday is used. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd | [optional] 
| **timeZone** | **String**| Timezone for the workday. Defaults to UTC | [optional] [default to UTC] 
{: class="table-striped"}


### Return type

[**MetricValueTrendAverage**](MetricValueTrendAverage)


# **getGamificationScorecardsProfileMetricUsersValuesTrends**


> [MetricValueTrendAverage](MetricValueTrendAverage) getGamificationScorecardsProfileMetricUsersValuesTrends(profileId, metricId, filterType, startWorkday, endWorkday, filterId, referenceWorkday, timeZone)

Average performance values trends by metric of a division or a performance profile

Wraps GET /api/v2/gamification/scorecards/profiles/{profileId}/metrics/{metricId}/users/values/trends  

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
String profileId = "profileId_example"; // String | performanceProfileId
String metricId = "metricId_example"; // String | metricId
String filterType = "filterType_example"; // String | Filter type for the query request.
LocalDate startWorkday = new LocalDate(); // LocalDate | Start workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
LocalDate endWorkday = new LocalDate(); // LocalDate | End workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
String filterId = "filterId_example"; // String | ID for the filter type. Only required when filterType is Division.
LocalDate referenceWorkday = new LocalDate(); // LocalDate | Reference workday for the trend. Used to determine the associated metric definition. If not set, then the value of endWorkday is used. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
String timeZone = "UTC"; // String | Timezone for the workday. Defaults to UTC
try {
    MetricValueTrendAverage result = apiInstance.getGamificationScorecardsProfileMetricUsersValuesTrends(profileId, metricId, filterType, startWorkday, endWorkday, filterId, referenceWorkday, timeZone);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#getGamificationScorecardsProfileMetricUsersValuesTrends");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **profileId** | **String**| performanceProfileId | 
| **metricId** | **String**| metricId | 
| **filterType** | **String**| Filter type for the query request. |<br />**Values**: PerformanceProfile, Division 
| **startWorkday** | **LocalDate**| Start workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd | 
| **endWorkday** | **LocalDate**| End workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd | 
| **filterId** | **String**| ID for the filter type. Only required when filterType is Division. | [optional] 
| **referenceWorkday** | **LocalDate**| Reference workday for the trend. Used to determine the associated metric definition. If not set, then the value of endWorkday is used. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd | [optional] 
| **timeZone** | **String**| Timezone for the workday. Defaults to UTC | [optional] [default to UTC] 
{: class="table-striped"}


### Return type

[**MetricValueTrendAverage**](MetricValueTrendAverage)


# **getGamificationScorecardsProfileMetricValuesTrends**


> [MetricValueTrendAverage](MetricValueTrendAverage) getGamificationScorecardsProfileMetricValuesTrends(profileId, metricId, startWorkday, endWorkday, filterType, referenceWorkday, timeZone)

Average performance values trends by metric of the requesting user

Wraps GET /api/v2/gamification/scorecards/profiles/{profileId}/metrics/{metricId}/values/trends  

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
String profileId = "profileId_example"; // String | performanceProfileId
String metricId = "metricId_example"; // String | metricId
LocalDate startWorkday = new LocalDate(); // LocalDate | Start workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
LocalDate endWorkday = new LocalDate(); // LocalDate | End workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
String filterType = "filterType_example"; // String | Filter type for the query request. If not set, returns the values trends of the requesting user
LocalDate referenceWorkday = new LocalDate(); // LocalDate | Reference workday for the trend. Used to determine the associated metric definition. If not set, then the value of endWorkday is used. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
String timeZone = "UTC"; // String | Timezone for the workday. Defaults to UTC
try {
    MetricValueTrendAverage result = apiInstance.getGamificationScorecardsProfileMetricValuesTrends(profileId, metricId, startWorkday, endWorkday, filterType, referenceWorkday, timeZone);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#getGamificationScorecardsProfileMetricValuesTrends");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **profileId** | **String**| performanceProfileId | 
| **metricId** | **String**| metricId | 
| **startWorkday** | **LocalDate**| Start workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd | 
| **endWorkday** | **LocalDate**| End workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd | 
| **filterType** | **String**| Filter type for the query request. If not set, returns the values trends of the requesting user | [optional]<br />**Values**: PerformanceProfile, Division 
| **referenceWorkday** | **LocalDate**| Reference workday for the trend. Used to determine the associated metric definition. If not set, then the value of endWorkday is used. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd | [optional] 
| **timeZone** | **String**| Timezone for the workday. Defaults to UTC | [optional] [default to UTC] 
{: class="table-striped"}


### Return type

[**MetricValueTrendAverage**](MetricValueTrendAverage)


# **getGamificationScorecardsUser**


> [WorkdayMetricListing](WorkdayMetricListing) getGamificationScorecardsUser(userId, workday, expand)

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
List<String> expand = Arrays.asList(null); // List<String> | Which fields, if any, to expand.
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
| **expand** | [**List&lt;String&gt;**](String)| Which fields, if any, to expand. | [optional]<br />**Values**: objective 
{: class="table-striped"}


### Return type

[**WorkdayMetricListing**](WorkdayMetricListing)


# **getGamificationScorecardsUserAttendance**


> [AttendanceStatusListing](AttendanceStatusListing) getGamificationScorecardsUserAttendance(userId, startWorkday, endWorkday)

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

[**AttendanceStatusListing**](AttendanceStatusListing)


# **getGamificationScorecardsUserBestpoints**


> [UserBestPoints](UserBestPoints) getGamificationScorecardsUserBestpoints(userId)

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

[**UserBestPoints**](UserBestPoints)


# **getGamificationScorecardsUserPointsAlltime**


> [AllTimePoints](AllTimePoints) getGamificationScorecardsUserPointsAlltime(userId, endWorkday)

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

[**AllTimePoints**](AllTimePoints)


# **getGamificationScorecardsUserPointsTrends**


> [WorkdayPointsTrend](WorkdayPointsTrend) getGamificationScorecardsUserPointsTrends(userId, startWorkday, endWorkday, dayOfWeek)

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

[**WorkdayPointsTrend**](WorkdayPointsTrend)


# **getGamificationScorecardsUserValuesTrends**


> [WorkdayValuesTrend](WorkdayValuesTrend) getGamificationScorecardsUserValuesTrends(userId, startWorkday, endWorkday, timeZone)

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

[**WorkdayValuesTrend**](WorkdayValuesTrend)


# **getGamificationScorecardsUsersPointsAverage**


> [SingleWorkdayAveragePoints](SingleWorkdayAveragePoints) getGamificationScorecardsUsersPointsAverage(filterType, filterId, workday)

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

[**SingleWorkdayAveragePoints**](SingleWorkdayAveragePoints)


# **getGamificationScorecardsUsersValuesAverage**


> [SingleWorkdayAverageValues](SingleWorkdayAverageValues) getGamificationScorecardsUsersValuesAverage(filterType, filterId, workday, timeZone)

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

[**SingleWorkdayAverageValues**](SingleWorkdayAverageValues)


# **getGamificationScorecardsUsersValuesTrends**


> [WorkdayValuesTrend](WorkdayValuesTrend) getGamificationScorecardsUsersValuesTrends(filterType, filterId, startWorkday, endWorkday, timeZone)

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

[**WorkdayValuesTrend**](WorkdayValuesTrend)


# **getGamificationScorecardsValuesAverage**


> [SingleWorkdayAverageValues](SingleWorkdayAverageValues) getGamificationScorecardsValuesAverage(workday, timeZone)

Average values of the requesting user's division or performance profile

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

[**SingleWorkdayAverageValues**](SingleWorkdayAverageValues)


# **getGamificationScorecardsValuesTrends**


> [WorkdayValuesTrend](WorkdayValuesTrend) getGamificationScorecardsValuesTrends(startWorkday, endWorkday, filterType, referenceWorkday, timeZone)

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

[**WorkdayValuesTrend**](WorkdayValuesTrend)


# **getGamificationStatus**


> [GamificationStatus](GamificationStatus) getGamificationStatus()

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

[**GamificationStatus**](GamificationStatus)


# **getGamificationTemplate**


> [ObjectiveTemplate](ObjectiveTemplate) getGamificationTemplate(templateId)

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

[**ObjectiveTemplate**](ObjectiveTemplate)


# **getGamificationTemplates**


> [GetTemplatesResponse](GetTemplatesResponse) getGamificationTemplates()

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

[**GetTemplatesResponse**](GetTemplatesResponse)


# **patchEmployeeperformanceExternalmetricsDefinition**


> [ExternalMetricDefinition](ExternalMetricDefinition) patchEmployeeperformanceExternalmetricsDefinition(metricId, body)

Update External Metric Definition

Wraps PATCH /api/v2/employeeperformance/externalmetrics/definitions/{metricId}  

Requires ANY permissions: 

* employeePerformance:externalMetricDefinition:edit

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
String metricId = "metricId_example"; // String | Specifies the metric definition ID
ExternalMetricDefinitionUpdateRequest body = new ExternalMetricDefinitionUpdateRequest(); // ExternalMetricDefinitionUpdateRequest | The External Metric Definition parameters to be updated
try {
    ExternalMetricDefinition result = apiInstance.patchEmployeeperformanceExternalmetricsDefinition(metricId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#patchEmployeeperformanceExternalmetricsDefinition");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **metricId** | **String**| Specifies the metric definition ID | 
| **body** | [**ExternalMetricDefinitionUpdateRequest**](ExternalMetricDefinitionUpdateRequest)| The External Metric Definition parameters to be updated | 
{: class="table-striped"}


### Return type

[**ExternalMetricDefinition**](ExternalMetricDefinition)


# **patchGamificationContest**


> [ContestsResponse](ContestsResponse) patchGamificationContest(contestId, body)

Finalize a Contest by Id

Wraps PATCH /api/v2/gamification/contests/{contestId}  

Requires ANY permissions: 

* gamification:contestStatus:edit
* gamification:contestStatus:editAll

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
String contestId = "contestId_example"; // String | The ID of the contest
ContestsFinalizeRequest body = new ContestsFinalizeRequest(); // ContestsFinalizeRequest | Finalize Contest
try {
    ContestsResponse result = apiInstance.patchGamificationContest(contestId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#patchGamificationContest");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **contestId** | **String**| The ID of the contest | 
| **body** | [**ContestsFinalizeRequest**](ContestsFinalizeRequest)| Finalize Contest | 
{: class="table-striped"}


### Return type

[**ContestsResponse**](ContestsResponse)


# **postEmployeeperformanceExternalmetricsData**


> [ExternalMetricDataWriteResponse](ExternalMetricDataWriteResponse) postEmployeeperformanceExternalmetricsData(body)

Write External Metric Data

Wraps POST /api/v2/employeeperformance/externalmetrics/data  

Requires ANY permissions: 

* employeePerformance:externalMetricData:add

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
ExternalMetricDataWriteRequest body = new ExternalMetricDataWriteRequest(); // ExternalMetricDataWriteRequest | The External Metric Data to be added
try {
    ExternalMetricDataWriteResponse result = apiInstance.postEmployeeperformanceExternalmetricsData(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#postEmployeeperformanceExternalmetricsData");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**ExternalMetricDataWriteRequest**](ExternalMetricDataWriteRequest)| The External Metric Data to be added | [optional] 
{: class="table-striped"}


### Return type

[**ExternalMetricDataWriteResponse**](ExternalMetricDataWriteResponse)


# **postEmployeeperformanceExternalmetricsDefinitions**


> [ExternalMetricDefinition](ExternalMetricDefinition) postEmployeeperformanceExternalmetricsDefinitions(body)

Create External Metric Definition

Wraps POST /api/v2/employeeperformance/externalmetrics/definitions  

Requires ANY permissions: 

* employeePerformance:externalMetricDefinition:add

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
ExternalMetricDefinitionCreateRequest body = new ExternalMetricDefinitionCreateRequest(); // ExternalMetricDefinitionCreateRequest | The External Metric Definition to be created
try {
    ExternalMetricDefinition result = apiInstance.postEmployeeperformanceExternalmetricsDefinitions(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#postEmployeeperformanceExternalmetricsDefinitions");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**ExternalMetricDefinitionCreateRequest**](ExternalMetricDefinitionCreateRequest)| The External Metric Definition to be created | [optional] 
{: class="table-striped"}


### Return type

[**ExternalMetricDefinition**](ExternalMetricDefinition)


# **postGamificationContests**


> [ContestsResponse](ContestsResponse) postGamificationContests(body)

Creates a Contest

Wraps POST /api/v2/gamification/contests  

Requires ANY permissions: 

* gamification:contest:add

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
ContestsCreateRequest body = new ContestsCreateRequest(); // ContestsCreateRequest | Create Contest
try {
    ContestsResponse result = apiInstance.postGamificationContests(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#postGamificationContests");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**ContestsCreateRequest**](ContestsCreateRequest)| Create Contest | 
{: class="table-striped"}


### Return type

[**ContestsResponse**](ContestsResponse)


# **postGamificationContestsUploadsPrizeimages**


> [UploadUrlResponse](UploadUrlResponse) postGamificationContestsUploadsPrizeimages(body)

Generates pre-signed URL to upload a prize image for gamification contests

Wraps POST /api/v2/gamification/contests/uploads/prizeimages  

Requires ALL permissions: 

* gamification:contestPrizeImage:upload

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
GamificationContestPrizeImageUploadUrlRequest body = new GamificationContestPrizeImageUploadUrlRequest(); // GamificationContestPrizeImageUploadUrlRequest | query
try {
    UploadUrlResponse result = apiInstance.postGamificationContestsUploadsPrizeimages(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#postGamificationContestsUploadsPrizeimages");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**GamificationContestPrizeImageUploadUrlRequest**](GamificationContestPrizeImageUploadUrlRequest)| query | 
{: class="table-striped"}


### Return type

[**UploadUrlResponse**](UploadUrlResponse)


# **postGamificationProfileActivate**


> [PerformanceProfile](PerformanceProfile) postGamificationProfileActivate(profileId)

Activate a performance profile

Wraps POST /api/v2/gamification/profiles/{profileId}/activate  

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
String profileId = "profileId_example"; // String | performanceProfileId
try {
    PerformanceProfile result = apiInstance.postGamificationProfileActivate(profileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#postGamificationProfileActivate");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **profileId** | **String**| performanceProfileId | 
{: class="table-striped"}


### Return type

[**PerformanceProfile**](PerformanceProfile)


# **postGamificationProfileDeactivate**


> [PerformanceProfile](PerformanceProfile) postGamificationProfileDeactivate(profileId)

Deactivate a performance profile

Wraps POST /api/v2/gamification/profiles/{profileId}/deactivate  

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
String profileId = "profileId_example"; // String | performanceProfileId
try {
    PerformanceProfile result = apiInstance.postGamificationProfileDeactivate(profileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#postGamificationProfileDeactivate");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **profileId** | **String**| performanceProfileId | 
{: class="table-striped"}


### Return type

[**PerformanceProfile**](PerformanceProfile)


# **postGamificationProfileMembers**


> [Assignment](Assignment) postGamificationProfileMembers(profileId, body)

Assign members to a given performance profile

Wraps POST /api/v2/gamification/profiles/{profileId}/members  

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
String profileId = "profileId_example"; // String | Profile Id
AssignUsers body = new AssignUsers(); // AssignUsers | assignUsers
try {
    Assignment result = apiInstance.postGamificationProfileMembers(profileId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#postGamificationProfileMembers");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **profileId** | **String**| Profile Id | 
| **body** | [**AssignUsers**](AssignUsers)| assignUsers | 
{: class="table-striped"}


### Return type

[**Assignment**](Assignment)


# **postGamificationProfileMembersValidate**


> [AssignmentValidation](AssignmentValidation) postGamificationProfileMembersValidate(profileId, body)

Validate member assignment

Wraps POST /api/v2/gamification/profiles/{profileId}/members/validate  

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
String profileId = "profileId_example"; // String | Profile Id
ValidateAssignUsers body = new ValidateAssignUsers(); // ValidateAssignUsers | memberAssignments
try {
    AssignmentValidation result = apiInstance.postGamificationProfileMembersValidate(profileId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#postGamificationProfileMembersValidate");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **profileId** | **String**| Profile Id | 
| **body** | [**ValidateAssignUsers**](ValidateAssignUsers)| memberAssignments | 
{: class="table-striped"}


### Return type

[**AssignmentValidation**](AssignmentValidation)


# **postGamificationProfileMetricLink**


> [Metric](Metric) postGamificationProfileMetricLink(sourceProfileId, sourceMetricId, body)

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
| **body** | [**TargetPerformanceProfile**](TargetPerformanceProfile)| linkedMetric | 
{: class="table-striped"}


### Return type

[**Metric**](Metric)


# **postGamificationProfileMetrics**


> [Metric](Metric) postGamificationProfileMetrics(profileId, body)

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
| **body** | [**CreateMetric**](CreateMetric)| Metric | 
{: class="table-striped"}


### Return type

[**Metric**](Metric)


# **postGamificationProfiles**


> [PerformanceProfile](PerformanceProfile) postGamificationProfiles(body, copyMetrics)

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
| **body** | [**CreatePerformanceProfile**](CreatePerformanceProfile)| performanceProfile | 
| **copyMetrics** | **Boolean**| Flag to copy metrics. If set to false, there will be no metrics associated with the new profile. If set to true or is absent (the default behavior), all metrics from the default profile will be copied over into the new profile. | [optional] [default to true] 
{: class="table-striped"}


### Return type

[**PerformanceProfile**](PerformanceProfile)


# **postGamificationProfilesUserQuery**


> [UserProfilesInDateRange](UserProfilesInDateRange) postGamificationProfilesUserQuery(userId, body)

Query performance profiles in date range for a user

Wraps POST /api/v2/gamification/profiles/users/{userId}/query  

Requires ANY permissions: 

* gamification:agentProfileMembership:view

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
String userId = "userId_example"; // String | The ID of a user.
UserProfilesInDateRangeRequest body = new UserProfilesInDateRangeRequest(); // UserProfilesInDateRangeRequest | The date range of work day.
try {
    UserProfilesInDateRange result = apiInstance.postGamificationProfilesUserQuery(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#postGamificationProfilesUserQuery");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| The ID of a user. | 
| **body** | [**UserProfilesInDateRangeRequest**](UserProfilesInDateRangeRequest)| The date range of work day. | 
{: class="table-striped"}


### Return type

[**UserProfilesInDateRange**](UserProfilesInDateRange)


# **postGamificationProfilesUsersMeQuery**


> [UserProfilesInDateRange](UserProfilesInDateRange) postGamificationProfilesUsersMeQuery(body)

Query performance profiles in date range for the current user

Wraps POST /api/v2/gamification/profiles/users/me/query  

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
UserProfilesInDateRangeRequest body = new UserProfilesInDateRangeRequest(); // UserProfilesInDateRangeRequest | The date range of work day.
try {
    UserProfilesInDateRange result = apiInstance.postGamificationProfilesUsersMeQuery(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#postGamificationProfilesUsersMeQuery");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**UserProfilesInDateRangeRequest**](UserProfilesInDateRangeRequest)| The date range of work day. | 
{: class="table-striped"}


### Return type

[**UserProfilesInDateRange**](UserProfilesInDateRange)


# **putGamificationContest**


> [ContestsResponse](ContestsResponse) putGamificationContest(contestId, body)

Update a Contest by Id

Wraps PUT /api/v2/gamification/contests/{contestId}  

Requires ANY permissions: 

* gamification:contest:edit
* gamification:contest:editAll

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
String contestId = "contestId_example"; // String | The ID of the contest
ContestsCreateRequest body = new ContestsCreateRequest(); // ContestsCreateRequest | Contest
try {
    ContestsResponse result = apiInstance.putGamificationContest(contestId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#putGamificationContest");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **contestId** | **String**| The ID of the contest | 
| **body** | [**ContestsCreateRequest**](ContestsCreateRequest)| Contest | 
{: class="table-striped"}


### Return type

[**ContestsResponse**](ContestsResponse)


# **putGamificationProfile**


> [PerformanceProfile](PerformanceProfile) putGamificationProfile(profileId, body)

Updates a performance profile

Wraps PUT /api/v2/gamification/profiles/{profileId}  

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
String profileId = "profileId_example"; // String | performanceProfileId
PerformanceProfile body = new PerformanceProfile(); // PerformanceProfile | performanceProfile
try {
    PerformanceProfile result = apiInstance.putGamificationProfile(profileId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#putGamificationProfile");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **profileId** | **String**| performanceProfileId | 
| **body** | [**PerformanceProfile**](PerformanceProfile)| performanceProfile | [optional] 
{: class="table-striped"}


### Return type

[**PerformanceProfile**](PerformanceProfile)


# **putGamificationProfileMetric**


> [Metric](Metric) putGamificationProfileMetric(profileId, metricId, body)

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
| **body** | [**CreateMetric**](CreateMetric)| Metric | 
{: class="table-striped"}


### Return type

[**Metric**](Metric)


# **putGamificationStatus**


> [GamificationStatus](GamificationStatus) putGamificationStatus(status)

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
| **status** | [**GamificationStatus**](GamificationStatus)| Gamification status | 
{: class="table-striped"}


### Return type

[**GamificationStatus**](GamificationStatus)


_com.mypurecloud.sdk.v2:platform-client-v2:229.1.0_
