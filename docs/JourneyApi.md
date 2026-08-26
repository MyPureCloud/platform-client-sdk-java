# JourneyApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**deleteAnalyticsJourneysAggregatesJob**](JourneyApi#deleteAnalyticsJourneysAggregatesJob) | Delete/cancel an async request for journey aggregates |
| [**deleteJourneyActionmap**](JourneyApi#deleteJourneyActionmap) | Delete single action map. |
| [**deleteJourneyActiontemplate**](JourneyApi#deleteJourneyActiontemplate) | Delete a single action template. |
| [**deleteJourneyExternaleventsConfiguration**](JourneyApi#deleteJourneyExternaleventsConfiguration) | Delete an external events configuration. |
| [**deleteJourneyExternaleventsSchema**](JourneyApi#deleteJourneyExternaleventsSchema) | Delete a schema |
| [**deleteJourneyOutcome**](JourneyApi#deleteJourneyOutcome) | Deprecated. Delete an outcome. |
| [**deleteJourneyOutcomesPredictor**](JourneyApi#deleteJourneyOutcomesPredictor) | Deprecated. Delete an outcome predictor. |
| [**deleteJourneySegment**](JourneyApi#deleteJourneySegment) | Delete a segment. |
| [**deleteJourneyView**](JourneyApi#deleteJourneyView) | Delete a Journey View by ID |
| [**deleteJourneyViewSchedules**](JourneyApi#deleteJourneyViewSchedules) | Delete the Schedule of a JourneyView |
| [**getAnalyticsJourneysAggregatesJob**](JourneyApi#getAnalyticsJourneysAggregatesJob) | Get status for async query for journey aggregates |
| [**getAnalyticsJourneysAggregatesJobResults**](JourneyApi#getAnalyticsJourneysAggregatesJobResults) | Fetch a page of results for an async aggregates query |
| [**getExternalcontactsContactJourneySegments**](JourneyApi#getExternalcontactsContactJourneySegments) | Retrieve segment assignments by external contact ID. |
| [**getExternalcontactsContactJourneySessions**](JourneyApi#getExternalcontactsContactJourneySessions) | Retrieve all sessions for a given external contact. |
| [**getJourneyActionmap**](JourneyApi#getJourneyActionmap) | Retrieve a single action map. |
| [**getJourneyActionmaps**](JourneyApi#getJourneyActionmaps) | Retrieve all action maps. |
| [**getJourneyActionmapsEstimatesJob**](JourneyApi#getJourneyActionmapsEstimatesJob) | Deprecated. Get status of job. |
| [**getJourneyActionmapsEstimatesJobResults**](JourneyApi#getJourneyActionmapsEstimatesJobResults) | Deprecated. Get estimates from completed job. |
| [**getJourneyActiontarget**](JourneyApi#getJourneyActiontarget) | Deprecated. Retrieve a single action target. |
| [**getJourneyActiontargets**](JourneyApi#getJourneyActiontargets) | Deprecated. Retrieve all action targets. |
| [**getJourneyActiontemplate**](JourneyApi#getJourneyActiontemplate) | Retrieve a single action template. |
| [**getJourneyActiontemplates**](JourneyApi#getJourneyActiontemplates) | Retrieve all action templates. |
| [**getJourneyDeploymentCustomerPing**](JourneyApi#getJourneyDeploymentCustomerPing) | Send a ping. |
| [**getJourneyExternaleventsConfiguration**](JourneyApi#getJourneyExternaleventsConfiguration) | Get an external events configuration |
| [**getJourneyExternaleventsConfigurations**](JourneyApi#getJourneyExternaleventsConfigurations) | Get all external event configurations. |
| [**getJourneyExternaleventsSchema**](JourneyApi#getJourneyExternaleventsSchema) | Get a schema |
| [**getJourneyExternaleventsSchemaVersion**](JourneyApi#getJourneyExternaleventsSchemaVersion) | Get a specific version of a schema |
| [**getJourneyExternaleventsSchemaVersions**](JourneyApi#getJourneyExternaleventsSchemaVersions) | Get all versions of a External Events schema |
| [**getJourneyExternaleventsSchemas**](JourneyApi#getJourneyExternaleventsSchemas) | Get a list of schemas. |
| [**getJourneyExternaleventsSchemasCoretype**](JourneyApi#getJourneyExternaleventsSchemasCoretype) | Get a core type from which all schemas are built |
| [**getJourneyExternaleventsSchemasCoretypes**](JourneyApi#getJourneyExternaleventsSchemasCoretypes) | Get the list of core types enabled for a specific namespace. |
| [**getJourneyExternaleventsSchemasLimits**](JourneyApi#getJourneyExternaleventsSchemasLimits) | Get quantitative limits on schemas |
| [**getJourneyOutcome**](JourneyApi#getJourneyOutcome) | Deprecated. Retrieve a single outcome. |
| [**getJourneyOutcomes**](JourneyApi#getJourneyOutcomes) | Deprecated. Retrieve all outcomes. |
| [**getJourneyOutcomesAttributionsJob**](JourneyApi#getJourneyOutcomesAttributionsJob) | Deprecated. Get job status. |
| [**getJourneyOutcomesAttributionsJobResults**](JourneyApi#getJourneyOutcomesAttributionsJobResults) | Deprecated. Get outcome attribution entities from completed job. |
| [**getJourneyOutcomesPredictor**](JourneyApi#getJourneyOutcomesPredictor) | Deprecated. Retrieve a single outcome predictor. |
| [**getJourneyOutcomesPredictors**](JourneyApi#getJourneyOutcomesPredictors) | Deprecated. Retrieve all outcome predictors. |
| [**getJourneySegment**](JourneyApi#getJourneySegment) | Retrieve a single segment. |
| [**getJourneySegments**](JourneyApi#getJourneySegments) | Retrieve all segments. |
| [**getJourneySession**](JourneyApi#getJourneySession) | Retrieve a single session. |
| [**getJourneySessionEvents**](JourneyApi#getJourneySessionEvents) | Retrieve all events for a given session. |
| [**getJourneySessionOutcomescores**](JourneyApi#getJourneySessionOutcomescores) | Deprecated. Retrieve latest outcome score associated with a session for all outcomes. |
| [**getJourneyView**](JourneyApi#getJourneyView) | Get a Journey View by ID |
| [**getJourneyViewSchedules**](JourneyApi#getJourneyViewSchedules) | Get the Schedule for a JourneyView |
| [**getJourneyViewVersion**](JourneyApi#getJourneyViewVersion) | Get a Journey View by ID and version |
| [**getJourneyViewVersionChart**](JourneyApi#getJourneyViewVersionChart) | Get a Chart by ID |
| [**getJourneyViewVersionChartVersion**](JourneyApi#getJourneyViewVersionChartVersion) | Get a Chart by ID and version |
| [**getJourneyViewVersionJob**](JourneyApi#getJourneyViewVersionJob) | Get the job for a journey view version. |
| [**getJourneyViewVersionJobResults**](JourneyApi#getJourneyViewVersionJobResults) | Get the result of a job for a journey view version. |
| [**getJourneyViewVersionJobResultsChart**](JourneyApi#getJourneyViewVersionJobResultsChart) | Get the chart result associated with a journey view job. |
| [**getJourneyViewVersionJobsLatest**](JourneyApi#getJourneyViewVersionJobsLatest) | Get the latest job of a journey view version. |
| [**getJourneyViews**](JourneyApi#getJourneyViews) | Get a list of Journey Views |
| [**getJourneyViewsDataDetails**](JourneyApi#getJourneyViewsDataDetails) | Get details about the data available for journey queries including oldest and newest event dates |
| [**getJourneyViewsEventdefinition**](JourneyApi#getJourneyViewsEventdefinition) | Get an Event Definition |
| [**getJourneyViewsEventdefinitions**](JourneyApi#getJourneyViewsEventdefinitions) | Get a list of Event Definitions |
| [**getJourneyViewsEventdefinitionsExternal**](JourneyApi#getJourneyViewsEventdefinitionsExternal) | Get external events for journey views |
| [**getJourneyViewsEventdefinitionsExternalChanges**](JourneyApi#getJourneyViewsEventdefinitionsExternalChanges) | Get changes in external event definitions |
| [**getJourneyViewsJobs**](JourneyApi#getJourneyViewsJobs) | Get the jobs for an organization. |
| [**getJourneyViewsJobsMe**](JourneyApi#getJourneyViewsJobsMe) | Get my jobs |
| [**getJourneyViewsSchedules**](JourneyApi#getJourneyViewsSchedules) | Get the journey schedules for an organization. |
| [**patchJourneyActionmap**](JourneyApi#patchJourneyActionmap) | Update single action map. |
| [**patchJourneyActiontarget**](JourneyApi#patchJourneyActiontarget) | Deprecated. Update a single action target. |
| [**patchJourneyActiontemplate**](JourneyApi#patchJourneyActiontemplate) | Update a single action template. |
| [**patchJourneyExternaleventsConfiguration**](JourneyApi#patchJourneyExternaleventsConfiguration) | Update an external events configuration. |
| [**patchJourneyOutcome**](JourneyApi#patchJourneyOutcome) | Deprecated. Update an outcome. |
| [**patchJourneySegment**](JourneyApi#patchJourneySegment) | Update a segment. |
| [**patchJourneyViewVersionJob**](JourneyApi#patchJourneyViewVersionJob) | Update the job for a journey view version. Only the status can be changed and only to Cancelled |
| [**postAnalyticsJourneysAggregatesJobs**](JourneyApi#postAnalyticsJourneysAggregatesJobs) | Query for journey aggregates asynchronously |
| [**postAnalyticsJourneysAggregatesQuery**](JourneyApi#postAnalyticsJourneysAggregatesQuery) | Query for journey aggregates |
| [**postExternalcontactsContactJourneySegments**](JourneyApi#postExternalcontactsContactJourneySegments) | Assign/Unassign up to 10 segments to/from an external contact or, if a segment is already assigned, update the expiry date of the segment assignment. Any unprocessed segment assignments are returned in the body for the client to retry, in the event of a partial success. |
| [**postJourneyActionmaps**](JourneyApi#postJourneyActionmaps) | Create an action map. |
| [**postJourneyActionmapsEstimatesJobs**](JourneyApi#postJourneyActionmapsEstimatesJobs) | Deprecated. Query for estimates |
| [**postJourneyActiontemplates**](JourneyApi#postJourneyActiontemplates) | Create a single action template. |
| [**postJourneyDeploymentActionevent**](JourneyApi#postJourneyDeploymentActionevent) | Sends an action event, which is used for changing the state of actions that have been offered to the user. |
| [**postJourneyDeploymentAppevents**](JourneyApi#postJourneyDeploymentAppevents) | Send a journey app event, used for tracking customer activity on an application. |
| [**postJourneyDeploymentWebevents**](JourneyApi#postJourneyDeploymentWebevents) | Send a journey web event, used for tracking customer activity on a website. |
| [**postJourneyExternaleventsConfigurationEvents**](JourneyApi#postJourneyExternaleventsConfigurationEvents) | Create external events |
| [**postJourneyExternaleventsConfigurations**](JourneyApi#postJourneyExternaleventsConfigurations) | Create an external events configuration. |
| [**postJourneyExternaleventsSchemas**](JourneyApi#postJourneyExternaleventsSchemas) | Create a schema |
| [**postJourneyFlowsPathsQuery**](JourneyApi#postJourneyFlowsPathsQuery) | Query for flow paths. |
| [**postJourneyOutcomes**](JourneyApi#postJourneyOutcomes) | Deprecated. Create an outcome. |
| [**postJourneyOutcomesAttributionsJobs**](JourneyApi#postJourneyOutcomesAttributionsJobs) | Deprecated. Create Outcome Attributions |
| [**postJourneyOutcomesPredictors**](JourneyApi#postJourneyOutcomesPredictors) | Deprecated. Create an outcome predictor. |
| [**postJourneySegments**](JourneyApi#postJourneySegments) | Create a segment. |
| [**postJourneyViewSchedules**](JourneyApi#postJourneyViewSchedules) | Add a new Schedule to a JourneyView |
| [**postJourneyViewVersionJobs**](JourneyApi#postJourneyViewVersionJobs) | Submit a job request for a journey view version. |
| [**postJourneyViewVersions**](JourneyApi#postJourneyViewVersions) | Update a Journey View by ID |
| [**postJourneyViews**](JourneyApi#postJourneyViews) | Create a new Journey View |
| [**postJourneyViewsEncodingsValidate**](JourneyApi#postJourneyViewsEncodingsValidate) | Validate whether an encoding exist for a label/value combination. |
| [**putJourneyExternaleventsSchema**](JourneyApi#putJourneyExternaleventsSchema) | Update a schema |
| [**putJourneyViewSchedules**](JourneyApi#putJourneyViewSchedules) | Update the Schedule for a JourneyView |
| [**putJourneyViewVersion**](JourneyApi#putJourneyViewVersion) | Update a Journey View by ID and version |
| [**putJourneyViewsEventdefinition**](JourneyApi#putJourneyViewsEventdefinition) | Update external event for journey views |
| [**putJourneyViewsEventdefinitionActivate**](JourneyApi#putJourneyViewsEventdefinitionActivate) | Activate external event for journey views |
{: class="table-striped"}


# **deleteAnalyticsJourneysAggregatesJob**


> Void deleteAnalyticsJourneysAggregatesJob(jobId)

Delete/cancel an async request for journey aggregates

Wraps DELETE /api/v2/analytics/journeys/aggregates/jobs/{jobId}  

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
String jobId = "jobId_example"; // String | jobId
try {
    apiInstance.deleteAnalyticsJourneysAggregatesJob(jobId);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#deleteAnalyticsJourneysAggregatesJob");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **jobId** | **String**| jobId | 
{: class="table-striped"}


### Return type

null (empty response body)


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


# **deleteJourneyExternaleventsConfiguration**


> Void deleteJourneyExternaleventsConfiguration(configId)

Delete an external events configuration.

Wraps DELETE /api/v2/journey/externalevents/configurations/{configId}  

Requires ANY permissions: 

* journey:externalEventsConfiguration:delete

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
String configId = "configId_example"; // String | The ID of the external event configuration.
try {
    apiInstance.deleteJourneyExternaleventsConfiguration(configId);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#deleteJourneyExternaleventsConfiguration");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **configId** | **String**| The ID of the external event configuration. | 
{: class="table-striped"}


### Return type

null (empty response body)


# **deleteJourneyExternaleventsSchema**


> Void deleteJourneyExternaleventsSchema(schemaId)

Delete a schema

Wraps DELETE /api/v2/journey/externalevents/schemas/{schemaId}  

Requires ANY permissions: 

* journey:externalEventsSchema:delete

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
String schemaId = "schemaId_example"; // String | Schema ID
try {
    apiInstance.deleteJourneyExternaleventsSchema(schemaId);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#deleteJourneyExternaleventsSchema");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **schemaId** | **String**| Schema ID | 
{: class="table-striped"}


### Return type

null (empty response body)


# **deleteJourneyOutcome**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> Void deleteJourneyOutcome(outcomeId)

Deprecated. Delete an outcome.

Journey Outcomes is being removed. See https://help.genesys.cloud/announcements/genesys-cloud/deprecation-journey-outcomes/

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


# **deleteJourneyOutcomesPredictor**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> Void deleteJourneyOutcomesPredictor(predictorId)

Deprecated. Delete an outcome predictor.

Journey Outcomes is being removed. See https://help.genesys.cloud/announcements/genesys-cloud/deprecation-journey-outcomes/

Wraps DELETE /api/v2/journey/outcomes/predictors/{predictorId}  

Requires ANY permissions: 

* journey:outcomepredictor:delete

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
String predictorId = "predictorId_example"; // String | ID of predictor
try {
    apiInstance.deleteJourneyOutcomesPredictor(predictorId);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#deleteJourneyOutcomesPredictor");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **predictorId** | **String**| ID of predictor | 
{: class="table-striped"}


### Return type

null (empty response body)


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


# **deleteJourneyView**


> Void deleteJourneyView(viewId)

Delete a Journey View by ID

deletes all versions

Wraps DELETE /api/v2/journey/views/{viewId}  

Requires ALL permissions: 

* journey:views:delete

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
String viewId = "viewId_example"; // String | viewId
try {
    apiInstance.deleteJourneyView(viewId);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#deleteJourneyView");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **viewId** | **String**| viewId | 
{: class="table-striped"}


### Return type

null (empty response body)


# **deleteJourneyViewSchedules**


> [JourneyViewSchedule](JourneyViewSchedule) deleteJourneyViewSchedules(viewId)

Delete the Schedule of a JourneyView

Wraps DELETE /api/v2/journey/views/{viewId}/schedules  

Requires ALL permissions: 

* journey:viewsSchedule:delete

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
String viewId = "viewId_example"; // String | Journey View Id
try {
    JourneyViewSchedule result = apiInstance.deleteJourneyViewSchedules(viewId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#deleteJourneyViewSchedules");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **viewId** | **String**| Journey View Id | 
{: class="table-striped"}


### Return type

[**JourneyViewSchedule**](JourneyViewSchedule)


# **getAnalyticsJourneysAggregatesJob**


> [AsyncQueryStatus](AsyncQueryStatus) getAnalyticsJourneysAggregatesJob(jobId)

Get status for async query for journey aggregates

Wraps GET /api/v2/analytics/journeys/aggregates/jobs/{jobId}  

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
String jobId = "jobId_example"; // String | jobId
try {
    AsyncQueryStatus result = apiInstance.getAnalyticsJourneysAggregatesJob(jobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#getAnalyticsJourneysAggregatesJob");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **jobId** | **String**| jobId | 
{: class="table-striped"}


### Return type

[**AsyncQueryStatus**](AsyncQueryStatus)


# **getAnalyticsJourneysAggregatesJobResults**


> [JourneyAsyncAggregateQueryResponse](JourneyAsyncAggregateQueryResponse) getAnalyticsJourneysAggregatesJobResults(jobId, cursor)

Fetch a page of results for an async aggregates query

Wraps GET /api/v2/analytics/journeys/aggregates/jobs/{jobId}/results  

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
String jobId = "jobId_example"; // String | jobId
String cursor = "cursor_example"; // String | Cursor token to retrieve next page
try {
    JourneyAsyncAggregateQueryResponse result = apiInstance.getAnalyticsJourneysAggregatesJobResults(jobId, cursor);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#getAnalyticsJourneysAggregatesJobResults");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **jobId** | **String**| jobId | 
| **cursor** | **String**| Cursor token to retrieve next page | [optional] 
{: class="table-striped"}


### Return type

[**JourneyAsyncAggregateQueryResponse**](JourneyAsyncAggregateQueryResponse)


# **getExternalcontactsContactJourneySegments**


> [SegmentAssignmentListing](SegmentAssignmentListing) getExternalcontactsContactJourneySegments(contactId, includeMerged, limit)

Retrieve segment assignments by external contact ID.

Wraps GET /api/v2/externalcontacts/contacts/{contactId}/journey/segments  

Requires ANY permissions: 

* externalContacts:segmentAssignment:view

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
String contactId = "contactId_example"; // String | ExternalContact ID
Boolean includeMerged = true; // Boolean | Indicates whether to return segment assignments from all external contacts in the merge-set of the given one.
Integer limit = 56; // Integer | Number of entities to return. Default of 25, maximum of 500.
try {
    SegmentAssignmentListing result = apiInstance.getExternalcontactsContactJourneySegments(contactId, includeMerged, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#getExternalcontactsContactJourneySegments");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **contactId** | **String**| ExternalContact ID | 
| **includeMerged** | **Boolean**| Indicates whether to return segment assignments from all external contacts in the merge-set of the given one. | [optional] 
| **limit** | **Integer**| Number of entities to return. Default of 25, maximum of 500. | [optional] 
{: class="table-striped"}


### Return type

[**SegmentAssignmentListing**](SegmentAssignmentListing)


# **getExternalcontactsContactJourneySessions**


> [SessionListing](SessionListing) getExternalcontactsContactJourneySessions(contactId, pageSize, after, includeMerged)

Retrieve all sessions for a given external contact.

Wraps GET /api/v2/externalcontacts/contacts/{contactId}/journey/sessions  

Requires ANY permissions: 

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
String contactId = "contactId_example"; // String | ExternalContact ID
String pageSize = "pageSize_example"; // String | Number of entities to return. Maximum of 200.
String after = "after_example"; // String | The cursor that points to the end of the set of entities that has been returned.
Boolean includeMerged = true; // Boolean | Indicates whether to return sessions from all external contacts in the merge-set of the given one.
try {
    SessionListing result = apiInstance.getExternalcontactsContactJourneySessions(contactId, pageSize, after, includeMerged);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#getExternalcontactsContactJourneySessions");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **contactId** | **String**| ExternalContact ID | 
| **pageSize** | **String**| Number of entities to return. Maximum of 200. | [optional] 
| **after** | **String**| The cursor that points to the end of the set of entities that has been returned. | [optional] 
| **includeMerged** | **Boolean**| Indicates whether to return sessions from all external contacts in the merge-set of the given one. | [optional] 
{: class="table-striped"}


### Return type

[**SessionListing**](SessionListing)


# **getJourneyActionmap**


> [ActionMap](ActionMap) getJourneyActionmap(actionMapId)

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

[**ActionMap**](ActionMap)


# **getJourneyActionmaps**


> [ActionMapListing](ActionMapListing) getJourneyActionmaps(pageNumber, pageSize, sortBy, filterField, filterValue, actionMapIds, queryFields, queryValue)

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
String queryValue = "queryValue_example"; // String | Value to query on using fuzzy matching. Requires 'queryFields' to also be set.
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
| **actionMapIds** | [**List&lt;String&gt;**](String)| IDs of action maps to return. Use of this parameter is not compatible with pagination, filtering, sorting or querying. A maximum of 100 action maps are allowed per request. | [optional] 
| **queryFields** | [**List&lt;String&gt;**](String)| Action Map field(s) to query on. Requires &#39;queryValue&#39; to also be set. | [optional] 
| **queryValue** | **String**| Value to query on using fuzzy matching. Requires &#39;queryFields&#39; to also be set. | [optional] 
{: class="table-striped"}


### Return type

[**ActionMapListing**](ActionMapListing)


# **getJourneyActionmapsEstimatesJob**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> String getJourneyActionmapsEstimatesJob(jobId)

Deprecated. Get status of job.

Journey Outcomes is being removed. See https://help.genesys.cloud/announcements/genesys-cloud/deprecation-journey-outcomes/

Wraps GET /api/v2/journey/actionmaps/estimates/jobs/{jobId}  

Requires ALL permissions: 

* journey:actionmapEstimateJob:view

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
String jobId = "jobId_example"; // String | ID of the job.
try {
    String result = apiInstance.getJourneyActionmapsEstimatesJob(jobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#getJourneyActionmapsEstimatesJob");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **jobId** | **String**| ID of the job. | 
{: class="table-striped"}


### Return type

**String**


# **getJourneyActionmapsEstimatesJobResults**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> [ActionMapEstimateResult](ActionMapEstimateResult) getJourneyActionmapsEstimatesJobResults(jobId)

Deprecated. Get estimates from completed job.

Journey Outcomes is being removed. See https://help.genesys.cloud/announcements/genesys-cloud/deprecation-journey-outcomes/

Wraps GET /api/v2/journey/actionmaps/estimates/jobs/{jobId}/results  

Requires ALL permissions: 

* journey:actionmapEstimate:view

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
String jobId = "jobId_example"; // String | ID of the job.
try {
    ActionMapEstimateResult result = apiInstance.getJourneyActionmapsEstimatesJobResults(jobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#getJourneyActionmapsEstimatesJobResults");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **jobId** | **String**| ID of the job. | 
{: class="table-striped"}


### Return type

[**ActionMapEstimateResult**](ActionMapEstimateResult)


# **getJourneyActiontarget**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> [ActionTarget](ActionTarget) getJourneyActiontarget(actionTargetId)

Deprecated. Retrieve a single action target.

ACD Chat v2.0 in Genesys Predictive Engagement is deprecated and being removed. See https://community.genesys.com/discussion/deprecation-acd-chat-v20-support-in-genesys-predictive-engagement

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

[**ActionTarget**](ActionTarget)


# **getJourneyActiontargets**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> [ActionTargetListing](ActionTargetListing) getJourneyActiontargets(pageNumber, pageSize)

Deprecated. Retrieve all action targets.

ACD Chat v2.0 in Genesys Predictive Engagement is deprecated and being removed. See https://community.genesys.com/discussion/deprecation-acd-chat-v20-support-in-genesys-predictive-engagement

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

[**ActionTargetListing**](ActionTargetListing)


# **getJourneyActiontemplate**


> [ActionTemplate](ActionTemplate) getJourneyActiontemplate(actionTemplateId)

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

[**ActionTemplate**](ActionTemplate)


# **getJourneyActiontemplates**


> [ActionTemplateListing](ActionTemplateListing) getJourneyActiontemplates(pageNumber, pageSize, sortBy, mediaType, state, queryFields, queryValue)

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
String queryValue = "queryValue_example"; // String | Value to query on using fuzzy matching. Requires 'queryFields' to also be set.
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
| **queryFields** | [**List&lt;String&gt;**](String)| ActionTemplate field(s) to query on. Requires &#39;queryValue&#39; to also be set. | [optional] 
| **queryValue** | **String**| Value to query on using fuzzy matching. Requires &#39;queryFields&#39; to also be set. | [optional] 
{: class="table-striped"}


### Return type

[**ActionTemplateListing**](ActionTemplateListing)


# **getJourneyDeploymentCustomerPing**


> [DeploymentPing](DeploymentPing) getJourneyDeploymentCustomerPing(deploymentId, customerCookieId, dl, dt, appNamespace, sessionId, sinceLastBeaconMilliseconds)

Send a ping.

Wraps GET /api/v2/journey/deployments/{deploymentId}/customers/{customerCookieId}/ping  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.api.JourneyApi;


JourneyApi apiInstance = new JourneyApi();
String deploymentId = "deploymentId_example"; // String | The ID of the deployment sending the ping.
String customerCookieId = "customerCookieId_example"; // String | ID of the customer associated with the ping.
String dl = "dl_example"; // String | Document Location: 1) Web Page URL if overridden or URL fragment identifier (window.location.hash). OR  2) Application screen name that the ping request was sent from in the app. e.g. 'home' or 'help. Pings without this parameter will not return actions.
String dt = "dt_example"; // String | Document Title.  A human readable name for the page or screen
String appNamespace = "appNamespace_example"; // String | Namespace of the application (e.g. com.genesys.bancodinero). Used for domain filtering in application sessions
String sessionId = "sessionId_example"; // String | UUID of the customer session. Use the same Session Id for all pings, AppEvents and ActionEvents in the session
Long sinceLastBeaconMilliseconds = 56L; // Long | How long (milliseconds) since the last app event or beacon was sent. The response may return a pollInternvalMilliseconds to reduce the frequency of pings.
try {
    DeploymentPing result = apiInstance.getJourneyDeploymentCustomerPing(deploymentId, customerCookieId, dl, dt, appNamespace, sessionId, sinceLastBeaconMilliseconds);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#getJourneyDeploymentCustomerPing");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **deploymentId** | **String**| The ID of the deployment sending the ping. | 
| **customerCookieId** | **String**| ID of the customer associated with the ping. | 
| **dl** | **String**| Document Location: 1) Web Page URL if overridden or URL fragment identifier (window.location.hash). OR  2) Application screen name that the ping request was sent from in the app. e.g. &#39;home&#39; or &#39;help. Pings without this parameter will not return actions. | [optional] 
| **dt** | **String**| Document Title.  A human readable name for the page or screen | [optional] 
| **appNamespace** | **String**| Namespace of the application (e.g. com.genesys.bancodinero). Used for domain filtering in application sessions | [optional] 
| **sessionId** | **String**| UUID of the customer session. Use the same Session Id for all pings, AppEvents and ActionEvents in the session | [optional] 
| **sinceLastBeaconMilliseconds** | **Long**| How long (milliseconds) since the last app event or beacon was sent. The response may return a pollInternvalMilliseconds to reduce the frequency of pings. | [optional] 
{: class="table-striped"}


### Return type

[**DeploymentPing**](DeploymentPing)


# **getJourneyExternaleventsConfiguration**


> [ExternalEventsConfiguration](ExternalEventsConfiguration) getJourneyExternaleventsConfiguration(configId)

Get an external events configuration

Wraps GET /api/v2/journey/externalevents/configurations/{configId}  

Requires ANY permissions: 

* journey:externalEventsConfiguration:view

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
String configId = "configId_example"; // String | The ID of the external event configuration.
try {
    ExternalEventsConfiguration result = apiInstance.getJourneyExternaleventsConfiguration(configId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#getJourneyExternaleventsConfiguration");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **configId** | **String**| The ID of the external event configuration. | 
{: class="table-striped"}


### Return type

[**ExternalEventsConfiguration**](ExternalEventsConfiguration)


# **getJourneyExternaleventsConfigurations**


> [ExternalEventsConfigurationListing](ExternalEventsConfigurationListing) getJourneyExternaleventsConfigurations(pageSize, pageNumber)

Get all external event configurations.

Wraps GET /api/v2/journey/externalevents/configurations  

Requires ANY permissions: 

* journey:externalEventsConfiguration:view

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
Integer pageSize = 20; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
try {
    ExternalEventsConfigurationListing result = apiInstance.getJourneyExternaleventsConfigurations(pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#getJourneyExternaleventsConfigurations");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| Page size | [optional] [default to 20] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
{: class="table-striped"}


### Return type

[**ExternalEventsConfigurationListing**](ExternalEventsConfigurationListing)


# **getJourneyExternaleventsSchema**


> [JourneyExternalEventsSchema](JourneyExternalEventsSchema) getJourneyExternaleventsSchema(schemaId)

Get a schema

Wraps GET /api/v2/journey/externalevents/schemas/{schemaId}  

Requires ANY permissions: 

* journey:externalEventsSchema:view

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
String schemaId = "schemaId_example"; // String | Schema ID
try {
    JourneyExternalEventsSchema result = apiInstance.getJourneyExternaleventsSchema(schemaId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#getJourneyExternaleventsSchema");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **schemaId** | **String**| Schema ID | 
{: class="table-striped"}


### Return type

[**JourneyExternalEventsSchema**](JourneyExternalEventsSchema)


# **getJourneyExternaleventsSchemaVersion**


> [JourneyExternalEventsSchema](JourneyExternalEventsSchema) getJourneyExternaleventsSchemaVersion(schemaId, versionId)

Get a specific version of a schema

Wraps GET /api/v2/journey/externalevents/schemas/{schemaId}/versions/{versionId}  

Requires ANY permissions: 

* journey:externalEventsSchema:view

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
String schemaId = "schemaId_example"; // String | Schema ID
String versionId = "versionId_example"; // String | Schema version
try {
    JourneyExternalEventsSchema result = apiInstance.getJourneyExternaleventsSchemaVersion(schemaId, versionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#getJourneyExternaleventsSchemaVersion");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **schemaId** | **String**| Schema ID | 
| **versionId** | **String**| Schema version | 
{: class="table-striped"}


### Return type

[**JourneyExternalEventsSchema**](JourneyExternalEventsSchema)


# **getJourneyExternaleventsSchemaVersions**


> [JourneyExternalEventsSchemaListing](JourneyExternalEventsSchemaListing) getJourneyExternaleventsSchemaVersions(schemaId)

Get all versions of a External Events schema

Wraps GET /api/v2/journey/externalevents/schemas/{schemaId}/versions  

Requires ANY permissions: 

* journey:externalEventsSchema:view

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
String schemaId = "schemaId_example"; // String | Schema ID
try {
    JourneyExternalEventsSchemaListing result = apiInstance.getJourneyExternaleventsSchemaVersions(schemaId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#getJourneyExternaleventsSchemaVersions");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **schemaId** | **String**| Schema ID | 
{: class="table-striped"}


### Return type

[**JourneyExternalEventsSchemaListing**](JourneyExternalEventsSchemaListing)


# **getJourneyExternaleventsSchemas**


> [JourneyExternalEventsSchemaListing](JourneyExternalEventsSchemaListing) getJourneyExternaleventsSchemas()

Get a list of schemas.

Wraps GET /api/v2/journey/externalevents/schemas  

Requires ANY permissions: 

* journey:externalEventsSchema:view

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
try {
    JourneyExternalEventsSchemaListing result = apiInstance.getJourneyExternaleventsSchemas();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#getJourneyExternaleventsSchemas");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**JourneyExternalEventsSchemaListing**](JourneyExternalEventsSchemaListing)


# **getJourneyExternaleventsSchemasCoretype**


> [Coretype](Coretype) getJourneyExternaleventsSchemasCoretype(coreTypeName)

Get a core type from which all schemas are built

Wraps GET /api/v2/journey/externalevents/schemas/coretypes/{coreTypeName}  

Requires ANY permissions: 

* journey:externalEventsSchema:view

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
String coreTypeName = "coreTypeName_example"; // String | Name of core type
try {
    Coretype result = apiInstance.getJourneyExternaleventsSchemasCoretype(coreTypeName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#getJourneyExternaleventsSchemasCoretype");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **coreTypeName** | **String**| Name of core type | 
{: class="table-striped"}


### Return type

[**Coretype**](Coretype)


# **getJourneyExternaleventsSchemasCoretypes**


> [CoretypeListing](CoretypeListing) getJourneyExternaleventsSchemasCoretypes()

Get the list of core types enabled for a specific namespace.

Wraps GET /api/v2/journey/externalevents/schemas/coretypes  

Requires ANY permissions: 

* journey:externalEventsSchema:view

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
try {
    CoretypeListing result = apiInstance.getJourneyExternaleventsSchemasCoretypes();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#getJourneyExternaleventsSchemasCoretypes");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**CoretypeListing**](CoretypeListing)


# **getJourneyExternaleventsSchemasLimits**


> [SchemaQuantityLimits](SchemaQuantityLimits) getJourneyExternaleventsSchemasLimits()

Get quantitative limits on schemas

Wraps GET /api/v2/journey/externalevents/schemas/limits  

Requires ANY permissions: 

* journey:externalEventsSchema:view

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
try {
    SchemaQuantityLimits result = apiInstance.getJourneyExternaleventsSchemasLimits();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#getJourneyExternaleventsSchemasLimits");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**SchemaQuantityLimits**](SchemaQuantityLimits)


# **getJourneyOutcome**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> [Outcome](Outcome) getJourneyOutcome(outcomeId)

Deprecated. Retrieve a single outcome.

Journey Outcomes is being removed. See https://help.genesys.cloud/announcements/genesys-cloud/deprecation-journey-outcomes/

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

[**Outcome**](Outcome)


# **getJourneyOutcomes**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> [OutcomeListing](OutcomeListing) getJourneyOutcomes(pageNumber, pageSize, sortBy, outcomeIds, queryFields, queryValue)

Deprecated. Retrieve all outcomes.

Journey Outcomes is being removed. See https://help.genesys.cloud/announcements/genesys-cloud/deprecation-journey-outcomes/

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
String queryValue = "queryValue_example"; // String | Value to query on using fuzzy matching. Requires 'queryFields' to also be set.
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
| **outcomeIds** | [**List&lt;String&gt;**](String)| IDs of outcomes to return. Use of this parameter is not compatible with pagination, sorting or querying. A maximum of 20 outcomes are allowed per request. | [optional] 
| **queryFields** | [**List&lt;String&gt;**](String)| Outcome field(s) to query on. Requires &#39;queryValue&#39; to also be set. | [optional] 
| **queryValue** | **String**| Value to query on using fuzzy matching. Requires &#39;queryFields&#39; to also be set. | [optional] 
{: class="table-striped"}


### Return type

[**OutcomeListing**](OutcomeListing)


# **getJourneyOutcomesAttributionsJob**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> [OutcomeAttributionJobStateResponse](OutcomeAttributionJobStateResponse) getJourneyOutcomesAttributionsJob(jobId)

Deprecated. Get job status.

Journey Outcomes is being removed. See https://help.genesys.cloud/announcements/genesys-cloud/deprecation-journey-outcomes/

getJourneyOutcomesAttributionsJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/journey/outcomes/attributions/jobs/{jobId}  

Requires ALL permissions: 

* journey:outcomeAttributionJob:view

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
String jobId = "jobId_example"; // String | ID of the job.
try {
    OutcomeAttributionJobStateResponse result = apiInstance.getJourneyOutcomesAttributionsJob(jobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#getJourneyOutcomesAttributionsJob");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **jobId** | **String**| ID of the job. | 
{: class="table-striped"}


### Return type

[**OutcomeAttributionJobStateResponse**](OutcomeAttributionJobStateResponse)


# **getJourneyOutcomesAttributionsJobResults**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> [OutcomeAttributionResponseListing](OutcomeAttributionResponseListing) getJourneyOutcomesAttributionsJobResults(jobId)

Deprecated. Get outcome attribution entities from completed job.

Journey Outcomes is being removed. See https://help.genesys.cloud/announcements/genesys-cloud/deprecation-journey-outcomes/

getJourneyOutcomesAttributionsJobResults is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/journey/outcomes/attributions/jobs/{jobId}/results  

Requires ALL permissions: 

* journey:outcomeAttribution:view

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
String jobId = "jobId_example"; // String | ID of the job.
try {
    OutcomeAttributionResponseListing result = apiInstance.getJourneyOutcomesAttributionsJobResults(jobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#getJourneyOutcomesAttributionsJobResults");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **jobId** | **String**| ID of the job. | 
{: class="table-striped"}


### Return type

[**OutcomeAttributionResponseListing**](OutcomeAttributionResponseListing)


# **getJourneyOutcomesPredictor**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> [OutcomePredictor](OutcomePredictor) getJourneyOutcomesPredictor(predictorId)

Deprecated. Retrieve a single outcome predictor.

Journey Outcomes is being removed. See https://help.genesys.cloud/announcements/genesys-cloud/deprecation-journey-outcomes/

Wraps GET /api/v2/journey/outcomes/predictors/{predictorId}  

Requires ANY permissions: 

* journey:outcomepredictor:view

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
String predictorId = "predictorId_example"; // String | ID of predictor
try {
    OutcomePredictor result = apiInstance.getJourneyOutcomesPredictor(predictorId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#getJourneyOutcomesPredictor");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **predictorId** | **String**| ID of predictor | 
{: class="table-striped"}


### Return type

[**OutcomePredictor**](OutcomePredictor)


# **getJourneyOutcomesPredictors**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> [OutcomePredictorListing](OutcomePredictorListing) getJourneyOutcomesPredictors()

Deprecated. Retrieve all outcome predictors.

Journey Outcomes is being removed. See https://help.genesys.cloud/announcements/genesys-cloud/deprecation-journey-outcomes/

Wraps GET /api/v2/journey/outcomes/predictors  

Requires ANY permissions: 

* journey:outcomepredictor:view

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
try {
    OutcomePredictorListing result = apiInstance.getJourneyOutcomesPredictors();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#getJourneyOutcomesPredictors");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**OutcomePredictorListing**](OutcomePredictorListing)


# **getJourneySegment**


> [JourneySegment](JourneySegment) getJourneySegment(segmentId)

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

[**JourneySegment**](JourneySegment)


# **getJourneySegments**


> [SegmentListing](SegmentListing) getJourneySegments(sortBy, pageSize, pageNumber, isActive, segmentIds, queryFields, queryValue)

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
String queryValue = "queryValue_example"; // String | Value to query on using fuzzy matching. Requires 'queryFields' to also be set.
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
| **segmentIds** | [**List&lt;String&gt;**](String)| IDs of segments to return. Use of this parameter is not compatible with pagination, sorting or querying. A maximum of 100 segments are allowed per request. | [optional] 
| **queryFields** | [**List&lt;String&gt;**](String)| Segment field(s) to query on. Requires &#39;queryValue&#39; to also be set. | [optional] 
| **queryValue** | **String**| Value to query on using fuzzy matching. Requires &#39;queryFields&#39; to also be set. | [optional] 
{: class="table-striped"}


### Return type

[**SegmentListing**](SegmentListing)


# **getJourneySession**


> [Session](Session) getJourneySession(sessionId)

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

[**Session**](Session)


# **getJourneySessionEvents**


> [EventListing](EventListing) getJourneySessionEvents(sessionId, pageSize, after, eventType)

Retrieve all events for a given session.

Wraps GET /api/v2/journey/sessions/{sessionId}/events  

Requires ANY permissions: 

* journey:event:view

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
String sessionId = "sessionId_example"; // String | System-generated UUID that represents the session the event is a part of.
String pageSize = "pageSize_example"; // String | Number of entities to return. Maximum of 200.
String after = "after_example"; // String | The cursor that points to the end of the set of entities that has been returned.
String eventType = "eventType_example"; // String | A comma separated list of journey event types to include in the results.
try {
    EventListing result = apiInstance.getJourneySessionEvents(sessionId, pageSize, after, eventType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#getJourneySessionEvents");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sessionId** | **String**| System-generated UUID that represents the session the event is a part of. | 
| **pageSize** | **String**| Number of entities to return. Maximum of 200. | [optional] 
| **after** | **String**| The cursor that points to the end of the set of entities that has been returned. | [optional] 
| **eventType** | **String**| A comma separated list of journey event types to include in the results. | [optional]<br />**Values**: com.genesys.journey.OutcomeAchievedEvent, com.genesys.journey.SegmentAssignmentEvent, com.genesys.journey.WebActionEvent, com.genesys.journey.WebEvent, com.genesys.journey.AppEvent 
{: class="table-striped"}


### Return type

[**EventListing**](EventListing)


# **getJourneySessionOutcomescores**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> [OutcomeScoresResult](OutcomeScoresResult) getJourneySessionOutcomescores(sessionId)

Deprecated. Retrieve latest outcome score associated with a session for all outcomes.

Journey Outcomes is being removed. See https://help.genesys.cloud/announcements/genesys-cloud/deprecation-journey-outcomes/

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

[**OutcomeScoresResult**](OutcomeScoresResult)


# **getJourneyView**


> [JourneyView](JourneyView) getJourneyView(viewId)

Get a Journey View by ID

returns the latest version

Wraps GET /api/v2/journey/views/{viewId}  

Requires ALL permissions: 

* journey:views:view

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
String viewId = "viewId_example"; // String | viewId
try {
    JourneyView result = apiInstance.getJourneyView(viewId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#getJourneyView");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **viewId** | **String**| viewId | 
{: class="table-striped"}


### Return type

[**JourneyView**](JourneyView)


# **getJourneyViewSchedules**


> [JourneyViewSchedule](JourneyViewSchedule) getJourneyViewSchedules(viewId)

Get the Schedule for a JourneyView

Wraps GET /api/v2/journey/views/{viewId}/schedules  

Requires ALL permissions: 

* journey:viewsSchedule:view

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
String viewId = "viewId_example"; // String | Journey View Id
try {
    JourneyViewSchedule result = apiInstance.getJourneyViewSchedules(viewId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#getJourneyViewSchedules");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **viewId** | **String**| Journey View Id | 
{: class="table-striped"}


### Return type

[**JourneyViewSchedule**](JourneyViewSchedule)


# **getJourneyViewVersion**


> [JourneyView](JourneyView) getJourneyViewVersion(viewId, versionId)

Get a Journey View by ID and version

Wraps GET /api/v2/journey/views/{viewId}/versions/{versionId}  

Requires ALL permissions: 

* journey:views:view

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
String viewId = "viewId_example"; // String | viewId
String versionId = "versionId_example"; // String | versionId
try {
    JourneyView result = apiInstance.getJourneyViewVersion(viewId, versionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#getJourneyViewVersion");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **viewId** | **String**| viewId | 
| **versionId** | **String**| versionId | 
{: class="table-striped"}


### Return type

[**JourneyView**](JourneyView)


# **getJourneyViewVersionChart**


> [JourneyViewChart](JourneyViewChart) getJourneyViewVersionChart(viewId, journeyViewVersion, chartId)

Get a Chart by ID

returns the latest version

Wraps GET /api/v2/journey/views/{viewId}/versions/{journeyViewVersion}/charts/{chartId}  

Requires ALL permissions: 

* journey:views:view

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
String viewId = "viewId_example"; // String | viewId
String journeyViewVersion = "journeyViewVersion_example"; // String | Journey View Version
String chartId = "chartId_example"; // String | chartId
try {
    JourneyViewChart result = apiInstance.getJourneyViewVersionChart(viewId, journeyViewVersion, chartId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#getJourneyViewVersionChart");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **viewId** | **String**| viewId | 
| **journeyViewVersion** | **String**| Journey View Version | 
| **chartId** | **String**| chartId | 
{: class="table-striped"}


### Return type

[**JourneyViewChart**](JourneyViewChart)


# **getJourneyViewVersionChartVersion**


> [JourneyViewChart](JourneyViewChart) getJourneyViewVersionChartVersion(viewId, journeyViewVersion, chartId, chartVersion)

Get a Chart by ID and version

Wraps GET /api/v2/journey/views/{viewId}/versions/{journeyViewVersion}/charts/{chartId}/versions/{chartVersion}  

Requires ALL permissions: 

* journey:views:view

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
String viewId = "viewId_example"; // String | viewId
String journeyViewVersion = "journeyViewVersion_example"; // String | Journey View Version
String chartId = "chartId_example"; // String | chartId
String chartVersion = "chartVersion_example"; // String | chartVersion
try {
    JourneyViewChart result = apiInstance.getJourneyViewVersionChartVersion(viewId, journeyViewVersion, chartId, chartVersion);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#getJourneyViewVersionChartVersion");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **viewId** | **String**| viewId | 
| **journeyViewVersion** | **String**| Journey View Version | 
| **chartId** | **String**| chartId | 
| **chartVersion** | **String**| chartVersion | 
{: class="table-striped"}


### Return type

[**JourneyViewChart**](JourneyViewChart)


# **getJourneyViewVersionJob**


> [JourneyViewJob](JourneyViewJob) getJourneyViewVersionJob(viewId, journeyVersionId, jobId)

Get the job for a journey view version.

Wraps GET /api/v2/journey/views/{viewId}/versions/{journeyVersionId}/jobs/{jobId}  

Requires ALL permissions: 

* journey:viewsJobs:view

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
String viewId = "viewId_example"; // String | Journey View Id
String journeyVersionId = "journeyVersionId_example"; // String | Journey View Version
String jobId = "jobId_example"; // String | JobId
try {
    JourneyViewJob result = apiInstance.getJourneyViewVersionJob(viewId, journeyVersionId, jobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#getJourneyViewVersionJob");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **viewId** | **String**| Journey View Id | 
| **journeyVersionId** | **String**| Journey View Version | 
| **jobId** | **String**| JobId | 
{: class="table-striped"}


### Return type

[**JourneyViewJob**](JourneyViewJob)


# **getJourneyViewVersionJobResults**


> [JourneyViewResult](JourneyViewResult) getJourneyViewVersionJobResults(viewId, journeyViewVersion, jobId)

Get the result of a job for a journey view version.

Wraps GET /api/v2/journey/views/{viewId}/versions/{journeyViewVersion}/jobs/{jobId}/results  

Requires ALL permissions: 

* journey:viewsResults:view

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
String viewId = "viewId_example"; // String | JourneyViewResult id
String journeyViewVersion = "journeyViewVersion_example"; // String | Journey View Version
String jobId = "jobId_example"; // String | Id of the executing job
try {
    JourneyViewResult result = apiInstance.getJourneyViewVersionJobResults(viewId, journeyViewVersion, jobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#getJourneyViewVersionJobResults");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **viewId** | **String**| JourneyViewResult id | 
| **journeyViewVersion** | **String**| Journey View Version | 
| **jobId** | **String**| Id of the executing job | 
{: class="table-striped"}


### Return type

[**JourneyViewResult**](JourneyViewResult)


# **getJourneyViewVersionJobResultsChart**


> [JourneyViewChartResult](JourneyViewChartResult) getJourneyViewVersionJobResultsChart(viewId, journeyVersionId, jobId, chartId)

Get the chart result associated with a journey view job.

Wraps GET /api/v2/journey/views/{viewId}/versions/{journeyVersionId}/jobs/{jobId}/results/charts/{chartId}  

Requires ALL permissions: 

* journey:viewsResults:view

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
String viewId = "viewId_example"; // String | Journey View Id
String journeyVersionId = "journeyVersionId_example"; // String | Journey View Version
String jobId = "jobId_example"; // String | JobId
String chartId = "chartId_example"; // String | ChartId
try {
    JourneyViewChartResult result = apiInstance.getJourneyViewVersionJobResultsChart(viewId, journeyVersionId, jobId, chartId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#getJourneyViewVersionJobResultsChart");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **viewId** | **String**| Journey View Id | 
| **journeyVersionId** | **String**| Journey View Version | 
| **jobId** | **String**| JobId | 
| **chartId** | **String**| ChartId | 
{: class="table-striped"}


### Return type

[**JourneyViewChartResult**](JourneyViewChartResult)


# **getJourneyViewVersionJobsLatest**


> [JourneyViewJob](JourneyViewJob) getJourneyViewVersionJobsLatest(viewId, journeyVersionId)

Get the latest job of a journey view version.

Wraps GET /api/v2/journey/views/{viewId}/versions/{journeyVersionId}/jobs/latest  

Requires ALL permissions: 

* journey:viewsJobs:view

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
String viewId = "viewId_example"; // String | Journey View Id
String journeyVersionId = "journeyVersionId_example"; // String | Journey View Version
try {
    JourneyViewJob result = apiInstance.getJourneyViewVersionJobsLatest(viewId, journeyVersionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#getJourneyViewVersionJobsLatest");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **viewId** | **String**| Journey View Id | 
| **journeyVersionId** | **String**| Journey View Version | 
{: class="table-striped"}


### Return type

[**JourneyViewJob**](JourneyViewJob)


# **getJourneyViews**


> [JourneyViewListing](JourneyViewListing) getJourneyViews(pageNumber, pageSize, nameOrCreatedBy, expand, id)

Get a list of Journey Views

Wraps GET /api/v2/journey/views  

Requires ALL permissions: 

* journey:views:view

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
String nameOrCreatedBy = "nameOrCreatedBy_example"; // String | Journey View Name or Created By
String expand = "expand_example"; // String | Parameter to request additional data to return in Journey payload
String id = "id_example"; // String | Parameter to request a list of Journey Views by id, separated by commas. Limit of 100 items.
try {
    JourneyViewListing result = apiInstance.getJourneyViews(pageNumber, pageSize, nameOrCreatedBy, expand, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#getJourneyViews");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **nameOrCreatedBy** | **String**| Journey View Name or Created By | [optional] 
| **expand** | **String**| Parameter to request additional data to return in Journey payload | [optional]<br />**Values**: charts 
| **id** | **String**| Parameter to request a list of Journey Views by id, separated by commas. Limit of 100 items. | [optional] 
{: class="table-striped"}


### Return type

[**JourneyViewListing**](JourneyViewListing)


# **getJourneyViewsDataDetails**


> [DataRange](DataRange) getJourneyViewsDataDetails()

Get details about the data available for journey queries including oldest and newest event dates

Wraps GET /api/v2/journey/views/data/details  

Requires ALL permissions: 

* journey:dataDetails:view

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
try {
    DataRange result = apiInstance.getJourneyViewsDataDetails();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#getJourneyViewsDataDetails");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**DataRange**](DataRange)


# **getJourneyViewsEventdefinition**


> [JourneyEventDefinition](JourneyEventDefinition) getJourneyViewsEventdefinition(eventDefinitionId)

Get an Event Definition

Wraps GET /api/v2/journey/views/eventdefinitions/{eventDefinitionId}  

Requires ALL permissions: 

* journey:eventDefinition:view

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
String eventDefinitionId = "eventDefinitionId_example"; // String | Event Definition ID
try {
    JourneyEventDefinition result = apiInstance.getJourneyViewsEventdefinition(eventDefinitionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#getJourneyViewsEventdefinition");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **eventDefinitionId** | **String**| Event Definition ID | 
{: class="table-striped"}


### Return type

[**JourneyEventDefinition**](JourneyEventDefinition)


# **getJourneyViewsEventdefinitions**


> [JourneyEventDefinitionListing](JourneyEventDefinitionListing) getJourneyViewsEventdefinitions()

Get a list of Event Definitions

Wraps GET /api/v2/journey/views/eventdefinitions  

Requires ALL permissions: 

* journey:eventDefinition:view

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
try {
    JourneyEventDefinitionListing result = apiInstance.getJourneyViewsEventdefinitions();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#getJourneyViewsEventdefinitions");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**JourneyEventDefinitionListing**](JourneyEventDefinitionListing)


# **getJourneyViewsEventdefinitionsExternal**


> [GetExternalEventsResponse](GetExternalEventsResponse) getJourneyViewsEventdefinitionsExternal()

Get external events for journey views

Wraps GET /api/v2/journey/views/eventdefinitions/external  

Requires ALL permissions: 

* journey:externalEvents:view

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
try {
    GetExternalEventsResponse result = apiInstance.getJourneyViewsEventdefinitionsExternal();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#getJourneyViewsEventdefinitionsExternal");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**GetExternalEventsResponse**](GetExternalEventsResponse)


# **getJourneyViewsEventdefinitionsExternalChanges**


> [ExternalEventChangesResponse](ExternalEventChangesResponse) getJourneyViewsEventdefinitionsExternalChanges()

Get changes in external event definitions

Wraps GET /api/v2/journey/views/eventdefinitions/external/changes  

Requires ALL permissions: 

* journey:externalEvents:view

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
try {
    ExternalEventChangesResponse result = apiInstance.getJourneyViewsEventdefinitionsExternalChanges();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#getJourneyViewsEventdefinitionsExternalChanges");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**ExternalEventChangesResponse**](ExternalEventChangesResponse)


# **getJourneyViewsJobs**


> [JourneyViewJobListing](JourneyViewJobListing) getJourneyViewsJobs(pageNumber, pageSize, interval, statuses)

Get the jobs for an organization.

Wraps GET /api/v2/journey/views/jobs  

Requires ALL permissions: 

* journey:viewsJobs:view

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
Integer pageNumber = 1; // Integer | The number of the page to return
Integer pageSize = 25; // Integer | Max number of entities to return
String interval = 2023-07-17T00:00:00Z/2023-07-18T00:00:00Z; // String | An absolute timeframe for filtering the jobs, expressed as an ISO 8601 interval.
String statuses = statuses=Accepted,Executing,Complete,Failed,Scheduled; // String | Job statuses to filter for
try {
    JourneyViewJobListing result = apiInstance.getJourneyViewsJobs(pageNumber, pageSize, interval, statuses);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#getJourneyViewsJobs");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageNumber** | **Integer**| The number of the page to return | [optional] [default to 1] 
| **pageSize** | **Integer**| Max number of entities to return | [optional] [default to 25] 
| **interval** | **String**| An absolute timeframe for filtering the jobs, expressed as an ISO 8601 interval. | [optional] [default to null] 
| **statuses** | **String**| Job statuses to filter for | [optional] [default to null] 
{: class="table-striped"}


### Return type

[**JourneyViewJobListing**](JourneyViewJobListing)


# **getJourneyViewsJobsMe**


> [JourneyViewJobListing](JourneyViewJobListing) getJourneyViewsJobsMe(pageNumber, pageSize, interval, statuses)

Get my jobs

Wraps GET /api/v2/journey/views/jobs/me  

Requires ALL permissions: 

* journey:viewsJobs:view

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
Integer pageNumber = 1; // Integer | The number of the page to return
Integer pageSize = 25; // Integer | Max number of entities to return
String interval = 2023-07-17T00:00:00Z/2023-07-18T00:00:00Z; // String | An absolute timeframe for filtering the jobs, expressed as an ISO 8601 interval.
String statuses = statuses=Accepted,Executing,Complete,Failed,Scheduled; // String | Job statuses to filter for
try {
    JourneyViewJobListing result = apiInstance.getJourneyViewsJobsMe(pageNumber, pageSize, interval, statuses);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#getJourneyViewsJobsMe");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageNumber** | **Integer**| The number of the page to return | [optional] [default to 1] 
| **pageSize** | **Integer**| Max number of entities to return | [optional] [default to 25] 
| **interval** | **String**| An absolute timeframe for filtering the jobs, expressed as an ISO 8601 interval. | [optional] [default to null] 
| **statuses** | **String**| Job statuses to filter for | [optional] [default to null] 
{: class="table-striped"}


### Return type

[**JourneyViewJobListing**](JourneyViewJobListing)


# **getJourneyViewsSchedules**


> [JourneyViewScheduleListing](JourneyViewScheduleListing) getJourneyViewsSchedules(pageNumber, pageSize)

Get the journey schedules for an organization.

Wraps GET /api/v2/journey/views/schedules  

Requires ALL permissions: 

* journey:viewsSchedule:view

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
Integer pageNumber = 1; // Integer | The number of the page to return
Integer pageSize = 25; // Integer | Max number of entities to return
try {
    JourneyViewScheduleListing result = apiInstance.getJourneyViewsSchedules(pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#getJourneyViewsSchedules");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageNumber** | **Integer**| The number of the page to return | [optional] [default to 1] 
| **pageSize** | **Integer**| Max number of entities to return | [optional] [default to 25] 
{: class="table-striped"}


### Return type

[**JourneyViewScheduleListing**](JourneyViewScheduleListing)


# **patchJourneyActionmap**


> [ActionMap](ActionMap) patchJourneyActionmap(actionMapId, body)

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
| **body** | [**PatchActionMap**](PatchActionMap)|  | [optional] 
{: class="table-striped"}


### Return type

[**ActionMap**](ActionMap)


# **patchJourneyActiontarget**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> [ActionTarget](ActionTarget) patchJourneyActiontarget(actionTargetId, body)

Deprecated. Update a single action target.

ACD Chat v2.0 in Genesys Predictive Engagement is deprecated and being removed. See https://community.genesys.com/discussion/deprecation-acd-chat-v20-support-in-genesys-predictive-engagement

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
| **body** | [**PatchActionTarget**](PatchActionTarget)|  | [optional] 
{: class="table-striped"}


### Return type

[**ActionTarget**](ActionTarget)


# **patchJourneyActiontemplate**


> [ActionTemplate](ActionTemplate) patchJourneyActiontemplate(actionTemplateId, body)

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
| **body** | [**PatchActionTemplate**](PatchActionTemplate)|  | [optional] 
{: class="table-striped"}


### Return type

[**ActionTemplate**](ActionTemplate)


# **patchJourneyExternaleventsConfiguration**


> [ExternalEventsConfiguration](ExternalEventsConfiguration) patchJourneyExternaleventsConfiguration(configId, body)

Update an external events configuration.

Wraps PATCH /api/v2/journey/externalevents/configurations/{configId}  

Requires ANY permissions: 

* journey:externalEventsConfiguration:edit

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
String configId = "configId_example"; // String | The ID of the external event configuration.
UpdateExternalEventsConfigurationRequest body = new UpdateExternalEventsConfigurationRequest(); // UpdateExternalEventsConfigurationRequest | 
try {
    ExternalEventsConfiguration result = apiInstance.patchJourneyExternaleventsConfiguration(configId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#patchJourneyExternaleventsConfiguration");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **configId** | **String**| The ID of the external event configuration. | 
| **body** | [**UpdateExternalEventsConfigurationRequest**](UpdateExternalEventsConfigurationRequest)|  | [optional] 
{: class="table-striped"}


### Return type

[**ExternalEventsConfiguration**](ExternalEventsConfiguration)


# **patchJourneyOutcome**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> [Outcome](Outcome) patchJourneyOutcome(outcomeId, body)

Deprecated. Update an outcome.

Journey Outcomes is being removed. See https://help.genesys.cloud/announcements/genesys-cloud/deprecation-journey-outcomes/

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
| **body** | [**PatchOutcome**](PatchOutcome)|  | [optional] 
{: class="table-striped"}


### Return type

[**Outcome**](Outcome)


# **patchJourneySegment**


> [JourneySegment](JourneySegment) patchJourneySegment(segmentId, body)

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
| **body** | [**PatchSegment**](PatchSegment)|  | [optional] 
{: class="table-striped"}


### Return type

[**JourneySegment**](JourneySegment)


# **patchJourneyViewVersionJob**


> [JourneyViewJob](JourneyViewJob) patchJourneyViewVersionJob(viewId, journeyVersionId, jobId, body)

Update the job for a journey view version. Only the status can be changed and only to Cancelled

Wraps PATCH /api/v2/journey/views/{viewId}/versions/{journeyVersionId}/jobs/{jobId}  

Requires ALL permissions: 

* journey:viewsJobs:edit

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
String viewId = "viewId_example"; // String | Journey View Id
String journeyVersionId = "journeyVersionId_example"; // String | Journey View Version
String jobId = "jobId_example"; // String | JobId
JourneyViewJob body = new JourneyViewJob(); // JourneyViewJob | journeyViewJob
try {
    JourneyViewJob result = apiInstance.patchJourneyViewVersionJob(viewId, journeyVersionId, jobId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#patchJourneyViewVersionJob");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **viewId** | **String**| Journey View Id | 
| **journeyVersionId** | **String**| Journey View Version | 
| **jobId** | **String**| JobId | 
| **body** | [**JourneyViewJob**](JourneyViewJob)| journeyViewJob | 
{: class="table-striped"}


### Return type

[**JourneyViewJob**](JourneyViewJob)


# **postAnalyticsJourneysAggregatesJobs**


> [AsyncQueryResponse](AsyncQueryResponse) postAnalyticsJourneysAggregatesJobs(body)

Query for journey aggregates asynchronously

Wraps POST /api/v2/analytics/journeys/aggregates/jobs  

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
JourneyAsyncAggregationQuery body = new JourneyAsyncAggregationQuery(); // JourneyAsyncAggregationQuery | query
try {
    AsyncQueryResponse result = apiInstance.postAnalyticsJourneysAggregatesJobs(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#postAnalyticsJourneysAggregatesJobs");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**JourneyAsyncAggregationQuery**](JourneyAsyncAggregationQuery)| query | 
{: class="table-striped"}


### Return type

[**AsyncQueryResponse**](AsyncQueryResponse)


# **postAnalyticsJourneysAggregatesQuery**


> [JourneyAggregateQueryResponse](JourneyAggregateQueryResponse) postAnalyticsJourneysAggregatesQuery(body)

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
| **body** | [**JourneyAggregationQuery**](JourneyAggregationQuery)| query | 
{: class="table-striped"}


### Return type

[**JourneyAggregateQueryResponse**](JourneyAggregateQueryResponse)


# **postExternalcontactsContactJourneySegments**


> [UpdateSegmentAssignmentResponse](UpdateSegmentAssignmentResponse) postExternalcontactsContactJourneySegments(contactId, body)

Assign/Unassign up to 10 segments to/from an external contact or, if a segment is already assigned, update the expiry date of the segment assignment. Any unprocessed segment assignments are returned in the body for the client to retry, in the event of a partial success.

Wraps POST /api/v2/externalcontacts/contacts/{contactId}/journey/segments  

Requires ANY permissions: 

* externalContacts:segmentAssignment:add
* externalContacts:segmentAssignment:delete

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
String contactId = "contactId_example"; // String | ExternalContact ID
UpdateSegmentAssignmentRequest body = new UpdateSegmentAssignmentRequest(); // UpdateSegmentAssignmentRequest | 
try {
    UpdateSegmentAssignmentResponse result = apiInstance.postExternalcontactsContactJourneySegments(contactId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#postExternalcontactsContactJourneySegments");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **contactId** | **String**| ExternalContact ID | 
| **body** | [**UpdateSegmentAssignmentRequest**](UpdateSegmentAssignmentRequest)|  | [optional] 
{: class="table-striped"}


### Return type

[**UpdateSegmentAssignmentResponse**](UpdateSegmentAssignmentResponse)


# **postJourneyActionmaps**


> [ActionMap](ActionMap) postJourneyActionmaps(body)

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
| **body** | [**ActionMap**](ActionMap)|  | [optional] 
{: class="table-striped"}


### Return type

[**ActionMap**](ActionMap)


# **postJourneyActionmapsEstimatesJobs**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> [EstimateJobAsyncResponse](EstimateJobAsyncResponse) postJourneyActionmapsEstimatesJobs(body)

Deprecated. Query for estimates

Journey Outcomes is being removed. See https://help.genesys.cloud/announcements/genesys-cloud/deprecation-journey-outcomes/

Wraps POST /api/v2/journey/actionmaps/estimates/jobs  

Requires ANY permissions: 

* journey:actionmapEstimateJob:add

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
ActionMapEstimateRequest body = new ActionMapEstimateRequest(); // ActionMapEstimateRequest | audience estimator request
try {
    EstimateJobAsyncResponse result = apiInstance.postJourneyActionmapsEstimatesJobs(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#postJourneyActionmapsEstimatesJobs");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**ActionMapEstimateRequest**](ActionMapEstimateRequest)| audience estimator request | 
{: class="table-striped"}


### Return type

[**EstimateJobAsyncResponse**](EstimateJobAsyncResponse)


# **postJourneyActiontemplates**


> [ActionTemplate](ActionTemplate) postJourneyActiontemplates(body)

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
| **body** | [**ActionTemplate**](ActionTemplate)|  | [optional] 
{: class="table-striped"}


### Return type

[**ActionTemplate**](ActionTemplate)


# **postJourneyDeploymentActionevent**


> Void postJourneyDeploymentActionevent(deploymentId, body)

Sends an action event, which is used for changing the state of actions that have been offered to the user.

Wraps POST /api/v2/journey/deployments/{deploymentId}/actionevent  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.api.JourneyApi;


JourneyApi apiInstance = new JourneyApi();
String deploymentId = "deploymentId_example"; // String | The ID of the deployment sending the beacon.
ActionEventRequest body = new ActionEventRequest(); // ActionEventRequest | 
try {
    apiInstance.postJourneyDeploymentActionevent(deploymentId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#postJourneyDeploymentActionevent");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **deploymentId** | **String**| The ID of the deployment sending the beacon. | 
| **body** | [**ActionEventRequest**](ActionEventRequest)|  | 
{: class="table-striped"}


### Return type

null (empty response body)


# **postJourneyDeploymentAppevents**


> [AppEventResponse](AppEventResponse) postJourneyDeploymentAppevents(deploymentId, body)

Send a journey app event, used for tracking customer activity on an application.

Wraps POST /api/v2/journey/deployments/{deploymentId}/appevents  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.api.JourneyApi;


JourneyApi apiInstance = new JourneyApi();
String deploymentId = "deploymentId_example"; // String | The ID of the deployment sending the app event.
AppEventRequest body = new AppEventRequest(); // AppEventRequest | 
try {
    AppEventResponse result = apiInstance.postJourneyDeploymentAppevents(deploymentId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#postJourneyDeploymentAppevents");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **deploymentId** | **String**| The ID of the deployment sending the app event. | 
| **body** | [**AppEventRequest**](AppEventRequest)|  | [optional] 
{: class="table-striped"}


### Return type

[**AppEventResponse**](AppEventResponse)


# **postJourneyDeploymentWebevents**


> [WebEventResponse](WebEventResponse) postJourneyDeploymentWebevents(deploymentId, body)

Send a journey web event, used for tracking customer activity on a website.

Wraps POST /api/v2/journey/deployments/{deploymentId}/webevents  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.api.JourneyApi;


JourneyApi apiInstance = new JourneyApi();
String deploymentId = "deploymentId_example"; // String | The ID of the deployment sending the web event.
WebEventRequest body = new WebEventRequest(); // WebEventRequest | 
try {
    WebEventResponse result = apiInstance.postJourneyDeploymentWebevents(deploymentId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#postJourneyDeploymentWebevents");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **deploymentId** | **String**| The ID of the deployment sending the web event. | 
| **body** | [**WebEventRequest**](WebEventRequest)|  | [optional] 
{: class="table-striped"}


### Return type

[**WebEventResponse**](WebEventResponse)


# **postJourneyExternaleventsConfigurationEvents**


> [ExternalEventsResponse](ExternalEventsResponse) postJourneyExternaleventsConfigurationEvents(configurationId, body)

Create external events

Wraps POST /api/v2/journey/externalevents/configurations/{configurationId}/events  

Requires ANY permissions: 

* journey:externalEventsEvent:add

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
String configurationId = "configurationId_example"; // String | The ID of the external event configuration.
ExternalEventsRequest body = new ExternalEventsRequest(); // ExternalEventsRequest | 
try {
    ExternalEventsResponse result = apiInstance.postJourneyExternaleventsConfigurationEvents(configurationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#postJourneyExternaleventsConfigurationEvents");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **configurationId** | **String**| The ID of the external event configuration. | 
| **body** | [**ExternalEventsRequest**](ExternalEventsRequest)|  | [optional] 
{: class="table-striped"}


### Return type

[**ExternalEventsResponse**](ExternalEventsResponse)


# **postJourneyExternaleventsConfigurations**


> [ExternalEventsConfiguration](ExternalEventsConfiguration) postJourneyExternaleventsConfigurations(body)

Create an external events configuration.

Wraps POST /api/v2/journey/externalevents/configurations  

Requires ANY permissions: 

* journey:externalEventsConfiguration:add

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
CreateExternalEventsConfigurationRequest body = new CreateExternalEventsConfigurationRequest(); // CreateExternalEventsConfigurationRequest | 
try {
    ExternalEventsConfiguration result = apiInstance.postJourneyExternaleventsConfigurations(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#postJourneyExternaleventsConfigurations");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**CreateExternalEventsConfigurationRequest**](CreateExternalEventsConfigurationRequest)|  | [optional] 
{: class="table-striped"}


### Return type

[**ExternalEventsConfiguration**](ExternalEventsConfiguration)


# **postJourneyExternaleventsSchemas**


> [JourneyExternalEventsSchema](JourneyExternalEventsSchema) postJourneyExternaleventsSchemas(body)

Create a schema

Wraps POST /api/v2/journey/externalevents/schemas  

Requires ANY permissions: 

* journey:externalEventsSchema:add

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
JourneyJsonSchemaRequest body = new JourneyJsonSchemaRequest(); // JourneyJsonSchemaRequest | Schema create request body
try {
    JourneyExternalEventsSchema result = apiInstance.postJourneyExternaleventsSchemas(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#postJourneyExternaleventsSchemas");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**JourneyJsonSchemaRequest**](JourneyJsonSchemaRequest)| Schema create request body | 
{: class="table-striped"}


### Return type

[**JourneyExternalEventsSchema**](JourneyExternalEventsSchema)


# **postJourneyFlowsPathsQuery**


> [FlowPaths](FlowPaths) postJourneyFlowsPathsQuery(body)

Query for flow paths.

Wraps POST /api/v2/journey/flows/paths/query  

Requires ALL permissions: 

* journey:flowpaths:view

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
FlowPathsQuery body = new FlowPathsQuery(); // FlowPathsQuery | 
try {
    FlowPaths result = apiInstance.postJourneyFlowsPathsQuery(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#postJourneyFlowsPathsQuery");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**FlowPathsQuery**](FlowPathsQuery)|  | [optional] 
{: class="table-striped"}


### Return type

[**FlowPaths**](FlowPaths)


# **postJourneyOutcomes**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> [Outcome](Outcome) postJourneyOutcomes(body)

Deprecated. Create an outcome.

Journey Outcomes is being removed. See https://help.genesys.cloud/announcements/genesys-cloud/deprecation-journey-outcomes/

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
OutcomeRequest body = new OutcomeRequest(); // OutcomeRequest | 
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
| **body** | [**OutcomeRequest**](OutcomeRequest)|  | [optional] 
{: class="table-striped"}


### Return type

[**Outcome**](Outcome)


# **postJourneyOutcomesAttributionsJobs**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> [OutcomeAttributionAsyncResponse](OutcomeAttributionAsyncResponse) postJourneyOutcomesAttributionsJobs(body)

Deprecated. Create Outcome Attributions

Journey Outcomes is being removed. See https://help.genesys.cloud/announcements/genesys-cloud/deprecation-journey-outcomes/

postJourneyOutcomesAttributionsJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps POST /api/v2/journey/outcomes/attributions/jobs  

Requires ANY permissions: 

* journey:outcomeAttributionJob:add

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
OutcomeAttributionListing body = new OutcomeAttributionListing(); // OutcomeAttributionListing | outcome attribution request
try {
    OutcomeAttributionAsyncResponse result = apiInstance.postJourneyOutcomesAttributionsJobs(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#postJourneyOutcomesAttributionsJobs");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**OutcomeAttributionListing**](OutcomeAttributionListing)| outcome attribution request | [optional] 
{: class="table-striped"}


### Return type

[**OutcomeAttributionAsyncResponse**](OutcomeAttributionAsyncResponse)


# **postJourneyOutcomesPredictors**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> [OutcomePredictor](OutcomePredictor) postJourneyOutcomesPredictors(body)

Deprecated. Create an outcome predictor.

Journey Outcomes is being removed. See https://help.genesys.cloud/announcements/genesys-cloud/deprecation-journey-outcomes/

Wraps POST /api/v2/journey/outcomes/predictors  

Requires ANY permissions: 

* journey:outcomepredictor:add

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
OutcomePredictorRequest body = new OutcomePredictorRequest(); // OutcomePredictorRequest | 
try {
    OutcomePredictor result = apiInstance.postJourneyOutcomesPredictors(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#postJourneyOutcomesPredictors");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**OutcomePredictorRequest**](OutcomePredictorRequest)|  | [optional] 
{: class="table-striped"}


### Return type

[**OutcomePredictor**](OutcomePredictor)


# **postJourneySegments**


> [JourneySegment](JourneySegment) postJourneySegments(body)

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
JourneySegmentRequest body = new JourneySegmentRequest(); // JourneySegmentRequest | 
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
| **body** | [**JourneySegmentRequest**](JourneySegmentRequest)|  | [optional] 
{: class="table-striped"}


### Return type

[**JourneySegment**](JourneySegment)


# **postJourneyViewSchedules**


> [JourneyViewSchedule](JourneyViewSchedule) postJourneyViewSchedules(viewId, body)

Add a new Schedule to a JourneyView

Wraps POST /api/v2/journey/views/{viewId}/schedules  

Requires ALL permissions: 

* journey:viewsSchedule:add

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
String viewId = "viewId_example"; // String | Journey View Id
JourneyViewSchedule body = new JourneyViewSchedule(); // JourneyViewSchedule | journeyViewSchedule
try {
    JourneyViewSchedule result = apiInstance.postJourneyViewSchedules(viewId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#postJourneyViewSchedules");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **viewId** | **String**| Journey View Id | 
| **body** | [**JourneyViewSchedule**](JourneyViewSchedule)| journeyViewSchedule | 
{: class="table-striped"}


### Return type

[**JourneyViewSchedule**](JourneyViewSchedule)


# **postJourneyViewVersionJobs**


> [JourneyViewJob](JourneyViewJob) postJourneyViewVersionJobs(viewId, journeyVersionId)

Submit a job request for a journey view version.

Wraps POST /api/v2/journey/views/{viewId}/versions/{journeyVersionId}/jobs  

Requires ALL permissions: 

* journey:viewsJobs:add

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
String viewId = "viewId_example"; // String | Journey View Id
String journeyVersionId = "journeyVersionId_example"; // String | Journey View Version
try {
    JourneyViewJob result = apiInstance.postJourneyViewVersionJobs(viewId, journeyVersionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#postJourneyViewVersionJobs");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **viewId** | **String**| Journey View Id | 
| **journeyVersionId** | **String**| Journey View Version | 
{: class="table-striped"}


### Return type

[**JourneyViewJob**](JourneyViewJob)


# **postJourneyViewVersions**


> [JourneyView](JourneyView) postJourneyViewVersions(viewId, body)

Update a Journey View by ID

creates a new version

Wraps POST /api/v2/journey/views/{viewId}/versions  

Requires ALL permissions: 

* journey:views:edit

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
String viewId = "viewId_example"; // String | viewId
JourneyView body = new JourneyView(); // JourneyView | JourneyView
try {
    JourneyView result = apiInstance.postJourneyViewVersions(viewId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#postJourneyViewVersions");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **viewId** | **String**| viewId | 
| **body** | [**JourneyView**](JourneyView)| JourneyView | 
{: class="table-striped"}


### Return type

[**JourneyView**](JourneyView)


# **postJourneyViews**


> [JourneyView](JourneyView) postJourneyViews(body)

Create a new Journey View

Wraps POST /api/v2/journey/views  

Requires ALL permissions: 

* journey:views:add

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
JourneyView body = new JourneyView(); // JourneyView | JourneyView
try {
    JourneyView result = apiInstance.postJourneyViews(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#postJourneyViews");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**JourneyView**](JourneyView)| JourneyView | 
{: class="table-striped"}


### Return type

[**JourneyView**](JourneyView)


# **postJourneyViewsEncodingsValidate**


> [EntityListing](EntityListing) postJourneyViewsEncodingsValidate(body)

Validate whether an encoding exist for a label/value combination.

True indicates a valid encoding

Wraps POST /api/v2/journey/views/encodings/validate  

Requires ALL permissions: 

* journey:viewsEncodings:view

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
List<Label> body = Arrays.asList(new Label()); // List<Label> | 
try {
    EntityListing result = apiInstance.postJourneyViewsEncodingsValidate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#postJourneyViewsEncodingsValidate");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**List&lt;Label&gt;**](Label)|  | [optional] 
{: class="table-striped"}


### Return type

[**EntityListing**](EntityListing)


# **putJourneyExternaleventsSchema**


> [JourneyExternalEventsSchema](JourneyExternalEventsSchema) putJourneyExternaleventsSchema(schemaId, body)

Update a schema

Wraps PUT /api/v2/journey/externalevents/schemas/{schemaId}  

Requires ANY permissions: 

* journey:externalEventsSchema:edit

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
String schemaId = "schemaId_example"; // String | Schema ID
JourneySchemaUpdateRequest body = new JourneySchemaUpdateRequest(); // JourneySchemaUpdateRequest | Schema update request body
try {
    JourneyExternalEventsSchema result = apiInstance.putJourneyExternaleventsSchema(schemaId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#putJourneyExternaleventsSchema");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **schemaId** | **String**| Schema ID | 
| **body** | [**JourneySchemaUpdateRequest**](JourneySchemaUpdateRequest)| Schema update request body | 
{: class="table-striped"}


### Return type

[**JourneyExternalEventsSchema**](JourneyExternalEventsSchema)


# **putJourneyViewSchedules**


> [JourneyViewSchedule](JourneyViewSchedule) putJourneyViewSchedules(viewId, body)

Update the Schedule for a JourneyView

Wraps PUT /api/v2/journey/views/{viewId}/schedules  

Requires ALL permissions: 

* journey:viewsSchedule:edit

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
String viewId = "viewId_example"; // String | Journey View Id
JourneyViewSchedule body = new JourneyViewSchedule(); // JourneyViewSchedule | journeyViewSchedule
try {
    JourneyViewSchedule result = apiInstance.putJourneyViewSchedules(viewId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#putJourneyViewSchedules");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **viewId** | **String**| Journey View Id | 
| **body** | [**JourneyViewSchedule**](JourneyViewSchedule)| journeyViewSchedule | 
{: class="table-striped"}


### Return type

[**JourneyViewSchedule**](JourneyViewSchedule)


# **putJourneyViewVersion**


> [JourneyView](JourneyView) putJourneyViewVersion(viewId, versionId, body)

Update a Journey View by ID and version

does not create a new version

Wraps PUT /api/v2/journey/views/{viewId}/versions/{versionId}  

Requires ALL permissions: 

* journey:views:edit

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
String viewId = "viewId_example"; // String | viewId
String versionId = "versionId_example"; // String | versionId
JourneyView body = new JourneyView(); // JourneyView | JourneyView
try {
    JourneyView result = apiInstance.putJourneyViewVersion(viewId, versionId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#putJourneyViewVersion");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **viewId** | **String**| viewId | 
| **versionId** | **String**| versionId | 
| **body** | [**JourneyView**](JourneyView)| JourneyView | 
{: class="table-striped"}


### Return type

[**JourneyView**](JourneyView)


# **putJourneyViewsEventdefinition**


> [UpdateExternalEventResponse](UpdateExternalEventResponse) putJourneyViewsEventdefinition(eventDefinitionId, body)

Update external event for journey views

Wraps PUT /api/v2/journey/views/eventdefinitions/{eventDefinitionId}  

Requires ALL permissions: 

* journey:externalEvents:edit

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
String eventDefinitionId = "eventDefinitionId_example"; // String | Event Definition ID
UpdateExternalEventRequest body = new UpdateExternalEventRequest(); // UpdateExternalEventRequest | 
try {
    UpdateExternalEventResponse result = apiInstance.putJourneyViewsEventdefinition(eventDefinitionId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#putJourneyViewsEventdefinition");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **eventDefinitionId** | **String**| Event Definition ID | 
| **body** | [**UpdateExternalEventRequest**](UpdateExternalEventRequest)|  | [optional] 
{: class="table-striped"}


### Return type

[**UpdateExternalEventResponse**](UpdateExternalEventResponse)


# **putJourneyViewsEventdefinitionActivate**


> [ActivateExternalEventResponse](ActivateExternalEventResponse) putJourneyViewsEventdefinitionActivate(eventDefinitionId, body)

Activate external event for journey views

Wraps PUT /api/v2/journey/views/eventdefinitions/{eventDefinitionId}/activate  

Requires ALL permissions: 

* journey:externalEvents:activate

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
String eventDefinitionId = "eventDefinitionId_example"; // String | Event Definition ID
ActivateExternalEventRequest body = new ActivateExternalEventRequest(); // ActivateExternalEventRequest | 
try {
    ActivateExternalEventResponse result = apiInstance.putJourneyViewsEventdefinitionActivate(eventDefinitionId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#putJourneyViewsEventdefinitionActivate");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **eventDefinitionId** | **String**| Event Definition ID | 
| **body** | [**ActivateExternalEventRequest**](ActivateExternalEventRequest)|  | [optional] 
{: class="table-striped"}


### Return type

[**ActivateExternalEventResponse**](ActivateExternalEventResponse)


_com.mypurecloud.sdk.v2:platform-client-v2:261.0.0_
