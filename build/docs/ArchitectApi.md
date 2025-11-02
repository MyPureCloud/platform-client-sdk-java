# ArchitectApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**deleteArchitectEmergencygroup**](ArchitectApi#deleteArchitectEmergencygroup) | Deletes a emergency group by ID |
| [**deleteArchitectGrammar**](ArchitectApi#deleteArchitectGrammar) | Delete a grammar. |
| [**deleteArchitectGrammarLanguage**](ArchitectApi#deleteArchitectGrammarLanguage) | Delete specified grammar language |
| [**deleteArchitectGrammarLanguageFilesDtmf**](ArchitectApi#deleteArchitectGrammarLanguageFilesDtmf) | Clear the DTMF mode file for the grammar language if there is one |
| [**deleteArchitectGrammarLanguageFilesVoice**](ArchitectApi#deleteArchitectGrammarLanguageFilesVoice) | Clear the voice mode file for the grammar language if there is one |
| [**deleteArchitectIvr**](ArchitectApi#deleteArchitectIvr) | Delete an IVR Config. |
| [**deleteArchitectPrompt**](ArchitectApi#deleteArchitectPrompt) | Delete specified user prompt |
| [**deleteArchitectPromptResource**](ArchitectApi#deleteArchitectPromptResource) | Delete specified user prompt resource |
| [**deleteArchitectPromptResourceAudio**](ArchitectApi#deleteArchitectPromptResourceAudio) | Delete specified user prompt resource audio |
| [**deleteArchitectPrompts**](ArchitectApi#deleteArchitectPrompts) | Batch-delete a list of prompts |
| [**deleteArchitectSchedule**](ArchitectApi#deleteArchitectSchedule) | Delete a schedule by id |
| [**deleteArchitectSchedulegroup**](ArchitectApi#deleteArchitectSchedulegroup) | Deletes a schedule group by ID |
| [**deleteArchitectSystempromptResource**](ArchitectApi#deleteArchitectSystempromptResource) | Delete a system prompt resource override. |
| [**deleteFlow**](ArchitectApi#deleteFlow) | Delete flow |
| [**deleteFlowInstancesSettingsLoglevels**](ArchitectApi#deleteFlowInstancesSettingsLoglevels) | Deletes a log level for a flow by flow id. |
| [**deleteFlows**](ArchitectApi#deleteFlows) | Batch-delete a list of flows |
| [**deleteFlowsDatatable**](ArchitectApi#deleteFlowsDatatable) | deletes a specific datatable by id |
| [**deleteFlowsDatatableRow**](ArchitectApi#deleteFlowsDatatableRow) | Delete a row entry |
| [**deleteFlowsInstancesSettingsLoglevelsDefault**](ArchitectApi#deleteFlowsInstancesSettingsLoglevelsDefault) | Resets the org log level to default, base |
| [**deleteFlowsMilestone**](ArchitectApi#deleteFlowsMilestone) | Delete a flow milestone. |
| [**getArchitectDependencytracking**](ArchitectApi#getArchitectDependencytracking) | Get Dependency Tracking objects that have a given display name |
| [**getArchitectDependencytrackingBuild**](ArchitectApi#getArchitectDependencytrackingBuild) | Get Dependency Tracking build status for an organization |
| [**getArchitectDependencytrackingConsumedresources**](ArchitectApi#getArchitectDependencytrackingConsumedresources) | Get resources that are consumed by a given Dependency Tracking object |
| [**getArchitectDependencytrackingConsumingresources**](ArchitectApi#getArchitectDependencytrackingConsumingresources) | Get resources that consume a given Dependency Tracking object |
| [**getArchitectDependencytrackingDeletedresourceconsumers**](ArchitectApi#getArchitectDependencytrackingDeletedresourceconsumers) | Get Dependency Tracking objects that consume deleted resources |
| [**getArchitectDependencytrackingObject**](ArchitectApi#getArchitectDependencytrackingObject) | Get a Dependency Tracking object |
| [**getArchitectDependencytrackingType**](ArchitectApi#getArchitectDependencytrackingType) | Get a Dependency Tracking type. |
| [**getArchitectDependencytrackingTypes**](ArchitectApi#getArchitectDependencytrackingTypes) | Get Dependency Tracking types. |
| [**getArchitectDependencytrackingUpdatedresourceconsumers**](ArchitectApi#getArchitectDependencytrackingUpdatedresourceconsumers) | Get Dependency Tracking objects that depend on updated resources |
| [**getArchitectEmergencygroup**](ArchitectApi#getArchitectEmergencygroup) | Gets a emergency group by ID |
| [**getArchitectEmergencygroups**](ArchitectApi#getArchitectEmergencygroups) | Get a list of emergency groups. |
| [**getArchitectEmergencygroupsDivisionviews**](ArchitectApi#getArchitectEmergencygroupsDivisionviews) | Get a pageable list of basic emergency group objects filterable by query parameters. |
| [**getArchitectGrammar**](ArchitectApi#getArchitectGrammar) | Get a grammar |
| [**getArchitectGrammarLanguage**](ArchitectApi#getArchitectGrammarLanguage) | Get a grammar language. |
| [**getArchitectGrammars**](ArchitectApi#getArchitectGrammars) | Get a pageable list of grammars, filtered by query parameters |
| [**getArchitectIvr**](ArchitectApi#getArchitectIvr) | Get an IVR config. |
| [**getArchitectIvrIdentityresolution**](ArchitectApi#getArchitectIvrIdentityresolution) | Get an IVR IdentityResolutionConfig. |
| [**getArchitectIvrs**](ArchitectApi#getArchitectIvrs) | Get IVR configs. |
| [**getArchitectIvrsDivisionviews**](ArchitectApi#getArchitectIvrsDivisionviews) | Get a pageable list of basic ivr configuration information objects filterable by query parameters. |
| [**getArchitectPrompt**](ArchitectApi#getArchitectPrompt) | Get specified user prompt |
| [**getArchitectPromptHistoryHistoryId**](ArchitectApi#getArchitectPromptHistoryHistoryId) | Get generated prompt history |
| [**getArchitectPromptResource**](ArchitectApi#getArchitectPromptResource) | Get specified user prompt resource |
| [**getArchitectPromptResources**](ArchitectApi#getArchitectPromptResources) | Get a pageable list of user prompt resources |
| [**getArchitectPrompts**](ArchitectApi#getArchitectPrompts) | Get a pageable list of user prompts |
| [**getArchitectSchedule**](ArchitectApi#getArchitectSchedule) | Get a schedule by ID |
| [**getArchitectSchedulegroup**](ArchitectApi#getArchitectSchedulegroup) | Gets a schedule group by ID |
| [**getArchitectSchedulegroups**](ArchitectApi#getArchitectSchedulegroups) | Get a list of schedule groups. |
| [**getArchitectSchedulegroupsDivisionviews**](ArchitectApi#getArchitectSchedulegroupsDivisionviews) | Get a pageable list of basic schedule group configuration information objects filterable by query parameters. |
| [**getArchitectSchedules**](ArchitectApi#getArchitectSchedules) | Get a list of schedules. |
| [**getArchitectSchedulesDivisionviews**](ArchitectApi#getArchitectSchedulesDivisionviews) | Get a pageable list of basic schedule configuration information objects filterable by query parameters. |
| [**getArchitectSystemprompt**](ArchitectApi#getArchitectSystemprompt) | Get a system prompt |
| [**getArchitectSystempromptHistoryHistoryId**](ArchitectApi#getArchitectSystempromptHistoryHistoryId) | Get generated prompt history |
| [**getArchitectSystempromptResource**](ArchitectApi#getArchitectSystempromptResource) | Get a system prompt resource. |
| [**getArchitectSystempromptResources**](ArchitectApi#getArchitectSystempromptResources) | Get system prompt resources. |
| [**getArchitectSystemprompts**](ArchitectApi#getArchitectSystemprompts) | Get System Prompts |
| [**getFlow**](ArchitectApi#getFlow) | Get flow |
| [**getFlowHistoryHistoryId**](ArchitectApi#getFlowHistoryHistoryId) | Get generated flow history |
| [**getFlowInstancesSettingsLoglevels**](ArchitectApi#getFlowInstancesSettingsLoglevels) | Retrieves the log level for a flow by flow id. |
| [**getFlowLatestconfiguration**](ArchitectApi#getFlowLatestconfiguration) | Get the latest configuration for flow |
| [**getFlowVersion**](ArchitectApi#getFlowVersion) | Get flow version |
| [**getFlowVersionConfiguration**](ArchitectApi#getFlowVersionConfiguration) | Get flow version configuration |
| [**getFlowVersionHealth**](ArchitectApi#getFlowVersionHealth) | Get overall health scores for all intents present in the NLU domain version associated with the bot flow version. |
| [**getFlowVersionIntentHealth**](ArchitectApi#getFlowVersionIntentHealth) | Get health scores and other health metrics for a specific intent. This includes the health metrics for each utterance in an intent. |
| [**getFlowVersionIntentUtteranceHealth**](ArchitectApi#getFlowVersionIntentUtteranceHealth) | Get health metrics associated with a specific utterance of an intent. |
| [**getFlowVersions**](ArchitectApi#getFlowVersions) | Get flow version list |
| [**getFlows**](ArchitectApi#getFlows) | Get a pageable list of flows, filtered by query parameters |
| [**getFlowsDatatable**](ArchitectApi#getFlowsDatatable) | Returns a specific datatable by id |
| [**getFlowsDatatableExportJob**](ArchitectApi#getFlowsDatatableExportJob) | Returns the state information about an export job |
| [**getFlowsDatatableImportJob**](ArchitectApi#getFlowsDatatableImportJob) | Returns the state information about an import job |
| [**getFlowsDatatableImportJobs**](ArchitectApi#getFlowsDatatableImportJobs) | Get all recent import jobs |
| [**getFlowsDatatableRow**](ArchitectApi#getFlowsDatatableRow) | Returns a specific row for the datatable |
| [**getFlowsDatatableRows**](ArchitectApi#getFlowsDatatableRows) | Returns the rows for the datatable with the given id |
| [**getFlowsDatatables**](ArchitectApi#getFlowsDatatables) | Retrieve a list of datatables for the org |
| [**getFlowsDatatablesDivisionview**](ArchitectApi#getFlowsDatatablesDivisionview) | Returns a specific datatable by id |
| [**getFlowsDatatablesDivisionviews**](ArchitectApi#getFlowsDatatablesDivisionviews) | Retrieve a list of datatables for the org |
| [**getFlowsDivisionviews**](ArchitectApi#getFlowsDivisionviews) | Get a pageable list of basic flow information objects filterable by query parameters. |
| [**getFlowsExecution**](ArchitectApi#getFlowsExecution) | Get a flow execution's details. Flow execution details are available for several days after the flow is started. |
| [**getFlowsExportJob**](ArchitectApi#getFlowsExportJob) | Fetch Architect Export Job Status |
| [**getFlowsInstance**](ArchitectApi#getFlowsInstance) | Start a process (job) to prepare a download of a singular flow execution data instance by Id |
| [**getFlowsInstancesJob**](ArchitectApi#getFlowsInstancesJob) | Get the status and/or results of an asynchronous flow execution data retrieval job |
| [**getFlowsInstancesQuerycapabilities**](ArchitectApi#getFlowsInstancesQuerycapabilities) | Retrieve a list of capabilities that the org can use to query for execution data |
| [**getFlowsInstancesSettingsExecutiondata**](ArchitectApi#getFlowsInstancesSettingsExecutiondata) | Get the execution history enabled setting. |
| [**getFlowsInstancesSettingsLoglevels**](ArchitectApi#getFlowsInstancesSettingsLoglevels) | Retrieve a list of LogLevels for the organization. |
| [**getFlowsInstancesSettingsLoglevelsCharacteristics**](ArchitectApi#getFlowsInstancesSettingsLoglevelsCharacteristics) | Gets the available flow log level characteristics for this organization. |
| [**getFlowsInstancesSettingsLoglevelsDefault**](ArchitectApi#getFlowsInstancesSettingsLoglevelsDefault) | Returns the flow default log level. |
| [**getFlowsJob**](ArchitectApi#getFlowsJob) | Fetch Architect Job Status |
| [**getFlowsMilestone**](ArchitectApi#getFlowsMilestone) | Get a flow milestone |
| [**getFlowsMilestones**](ArchitectApi#getFlowsMilestones) | Get a pageable list of flow milestones, filtered by query parameters |
| [**getFlowsMilestonesDivisionviews**](ArchitectApi#getFlowsMilestonesDivisionviews) | Get a pageable list of basic flow milestone information objects filterable by query parameters. |
| [**getFlowsOutcome**](ArchitectApi#getFlowsOutcome) | Get a flow outcome |
| [**getFlowsOutcomes**](ArchitectApi#getFlowsOutcomes) | Get a pageable list of flow outcomes, filtered by query parameters |
| [**getFlowsOutcomesDivisionviews**](ArchitectApi#getFlowsOutcomesDivisionviews) | Get a pageable list of basic flow outcome information objects filterable by query parameters. |
| [**patchArchitectGrammar**](ArchitectApi#patchArchitectGrammar) | Updates a grammar |
| [**patchArchitectGrammarLanguage**](ArchitectApi#patchArchitectGrammarLanguage) | Updates a grammar language |
| [**patchFlowsInstancesSettingsExecutiondata**](ArchitectApi#patchFlowsInstancesSettingsExecutiondata) | Edit the execution history enabled setting. |
| [**postArchitectDependencytrackingBuild**](ArchitectApi#postArchitectDependencytrackingBuild) | Rebuild Dependency Tracking data for an organization |
| [**postArchitectEmergencygroups**](ArchitectApi#postArchitectEmergencygroups) | Creates a new emergency group |
| [**postArchitectGrammarLanguageFilesDtmf**](ArchitectApi#postArchitectGrammarLanguageFilesDtmf) | Creates a presigned URL for uploading a grammar DTMF mode file |
| [**postArchitectGrammarLanguageFilesVoice**](ArchitectApi#postArchitectGrammarLanguageFilesVoice) | Creates a presigned URL for uploading a grammar voice mode file |
| [**postArchitectGrammarLanguages**](ArchitectApi#postArchitectGrammarLanguages) | Create a new language for a given grammar |
| [**postArchitectGrammars**](ArchitectApi#postArchitectGrammars) | Create a new grammar |
| [**postArchitectIvrs**](ArchitectApi#postArchitectIvrs) | Create IVR config. |
| [**postArchitectPromptHistory**](ArchitectApi#postArchitectPromptHistory) | Generate prompt history |
| [**postArchitectPromptResourceUploads**](ArchitectApi#postArchitectPromptResourceUploads) | Creates a presigned URL for uploading a user prompt file |
| [**postArchitectPromptResources**](ArchitectApi#postArchitectPromptResources) | Create a new user prompt resource |
| [**postArchitectPrompts**](ArchitectApi#postArchitectPrompts) | Create a new user prompt |
| [**postArchitectSchedulegroups**](ArchitectApi#postArchitectSchedulegroups) | Creates a new schedule group |
| [**postArchitectSchedules**](ArchitectApi#postArchitectSchedules) | Create a new schedule. |
| [**postArchitectSystempromptHistory**](ArchitectApi#postArchitectSystempromptHistory) | Generate system prompt history |
| [**postArchitectSystempromptResourceUploads**](ArchitectApi#postArchitectSystempromptResourceUploads) | Creates a presigned URL for uploading a system prompt file |
| [**postArchitectSystempromptResources**](ArchitectApi#postArchitectSystempromptResources) | Create system prompt resource override. |
| [**postFlowHistory**](ArchitectApi#postFlowHistory) | Generate flow history |
| [**postFlowInstancesSettingsLoglevels**](ArchitectApi#postFlowInstancesSettingsLoglevels) | Set the logLevel for a particular flow id |
| [**postFlowVersions**](ArchitectApi#postFlowVersions) | Create flow version |
| [**postFlows**](ArchitectApi#postFlows) | Create flow |
| [**postFlowsActionsCheckin**](ArchitectApi#postFlowsActionsCheckin) | Check-in flow |
| [**postFlowsActionsCheckout**](ArchitectApi#postFlowsActionsCheckout) | Check-out flow |
| [**postFlowsActionsDeactivate**](ArchitectApi#postFlowsActionsDeactivate) | Deactivate flow |
| [**postFlowsActionsPublish**](ArchitectApi#postFlowsActionsPublish) | Publish flow |
| [**postFlowsActionsRevert**](ArchitectApi#postFlowsActionsRevert) | Revert flow |
| [**postFlowsActionsUnlock**](ArchitectApi#postFlowsActionsUnlock) | Unlock flow |
| [**postFlowsDatatableExportJobs**](ArchitectApi#postFlowsDatatableExportJobs) | Begin an export process for exporting all rows from a datatable |
| [**postFlowsDatatableImportJobs**](ArchitectApi#postFlowsDatatableImportJobs) | Begin an import process for importing rows into a datatable |
| [**postFlowsDatatableRows**](ArchitectApi#postFlowsDatatableRows) | Create a new row entry for the datatable. |
| [**postFlowsDatatables**](ArchitectApi#postFlowsDatatables) | Create a new datatable with the specified json-schema definition |
| [**postFlowsExecutions**](ArchitectApi#postFlowsExecutions) | Launch an instance of a flow definition, for flow types that support it such as the 'workflow' type. |
| [**postFlowsExportJobs**](ArchitectApi#postFlowsExportJobs) | Register Architect Export Job |
| [**postFlowsInstancesJobs**](ArchitectApi#postFlowsInstancesJobs) | Start a process (job) that will prepare a list of execution data IDs for download. |
| [**postFlowsInstancesQuery**](ArchitectApi#postFlowsInstancesQuery) | Query the database of existing flow histories to look for particular flow criteria |
| [**postFlowsJobs**](ArchitectApi#postFlowsJobs) | Register Architect Job. Returns a URL where a file, such as an Architect flow YAML file, can be PUT which will then initiate the job. |
| [**postFlowsMilestones**](ArchitectApi#postFlowsMilestones) | Create a flow milestone |
| [**postFlowsOutcomes**](ArchitectApi#postFlowsOutcomes) | Create a flow outcome |
| [**putArchitectEmergencygroup**](ArchitectApi#putArchitectEmergencygroup) | Updates a emergency group by ID |
| [**putArchitectIvr**](ArchitectApi#putArchitectIvr) | Update an IVR Config. |
| [**putArchitectIvrIdentityresolution**](ArchitectApi#putArchitectIvrIdentityresolution) | Update an IVR IdentityResolutionConfig. |
| [**putArchitectPrompt**](ArchitectApi#putArchitectPrompt) | Update specified user prompt |
| [**putArchitectPromptResource**](ArchitectApi#putArchitectPromptResource) | Update specified user prompt resource |
| [**putArchitectSchedule**](ArchitectApi#putArchitectSchedule) | Update schedule by ID |
| [**putArchitectSchedulegroup**](ArchitectApi#putArchitectSchedulegroup) | Updates a schedule group by ID |
| [**putArchitectSystempromptResource**](ArchitectApi#putArchitectSystempromptResource) | Updates a system prompt resource override. |
| [**putFlow**](ArchitectApi#putFlow) | Update flow |
| [**putFlowInstancesSettingsLoglevels**](ArchitectApi#putFlowInstancesSettingsLoglevels) | Edit the logLevel for a particular flow id |
| [**putFlowsDatatable**](ArchitectApi#putFlowsDatatable) | Updates a specific datatable by id |
| [**putFlowsDatatableRow**](ArchitectApi#putFlowsDatatableRow) | Update a row entry |
| [**putFlowsInstancesSettingsLoglevelsDefault**](ArchitectApi#putFlowsInstancesSettingsLoglevelsDefault) | Edit the flow default log level. |
| [**putFlowsMilestone**](ArchitectApi#putFlowsMilestone) | Updates a flow milestone |
| [**putFlowsOutcome**](ArchitectApi#putFlowsOutcome) | Updates a flow outcome |
{: class="table-striped"}


# **deleteArchitectEmergencygroup**


> Void deleteArchitectEmergencygroup(emergencyGroupId)

Deletes a emergency group by ID

Wraps DELETE /api/v2/architect/emergencygroups/{emergencyGroupId}  

Requires ALL permissions: 

* routing:emergencyGroup:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String emergencyGroupId = "emergencyGroupId_example"; // String | Emergency group ID
try {
    apiInstance.deleteArchitectEmergencygroup(emergencyGroupId);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#deleteArchitectEmergencygroup");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **emergencyGroupId** | **String**| Emergency group ID | 
{: class="table-striped"}


### Return type

null (empty response body)


# **deleteArchitectGrammar**


> Empty deleteArchitectGrammar(grammarId)

Delete a grammar.

Wraps DELETE /api/v2/architect/grammars/{grammarId}  

Requires ALL permissions: 

* architect:grammar:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String grammarId = "grammarId_example"; // String | grammar ID
try {
    Empty result = apiInstance.deleteArchitectGrammar(grammarId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#deleteArchitectGrammar");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **grammarId** | **String**| grammar ID | 
{: class="table-striped"}


### Return type

**Empty**


# **deleteArchitectGrammarLanguage**


> Void deleteArchitectGrammarLanguage(grammarId, languageCode)

Delete specified grammar language

Wraps DELETE /api/v2/architect/grammars/{grammarId}/languages/{languageCode}  

Requires ALL permissions: 

* architect:grammar:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String grammarId = "grammarId_example"; // String | Grammar ID
String languageCode = "languageCode_example"; // String | Language
try {
    apiInstance.deleteArchitectGrammarLanguage(grammarId, languageCode);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#deleteArchitectGrammarLanguage");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **grammarId** | **String**| Grammar ID | 
| **languageCode** | **String**| Language | 
{: class="table-striped"}


### Return type

null (empty response body)


# **deleteArchitectGrammarLanguageFilesDtmf**


> Void deleteArchitectGrammarLanguageFilesDtmf(grammarId, languageCode)

Clear the DTMF mode file for the grammar language if there is one

Wraps DELETE /api/v2/architect/grammars/{grammarId}/languages/{languageCode}/files/dtmf  

Requires ALL permissions: 

* architect:grammar:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String grammarId = "grammarId_example"; // String | Grammar ID
String languageCode = "languageCode_example"; // String | Language
try {
    apiInstance.deleteArchitectGrammarLanguageFilesDtmf(grammarId, languageCode);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#deleteArchitectGrammarLanguageFilesDtmf");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **grammarId** | **String**| Grammar ID | 
| **languageCode** | **String**| Language | 
{: class="table-striped"}


### Return type

null (empty response body)


# **deleteArchitectGrammarLanguageFilesVoice**


> Void deleteArchitectGrammarLanguageFilesVoice(grammarId, languageCode)

Clear the voice mode file for the grammar language if there is one

Wraps DELETE /api/v2/architect/grammars/{grammarId}/languages/{languageCode}/files/voice  

Requires ALL permissions: 

* architect:grammar:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String grammarId = "grammarId_example"; // String | Grammar ID
String languageCode = "languageCode_example"; // String | Language
try {
    apiInstance.deleteArchitectGrammarLanguageFilesVoice(grammarId, languageCode);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#deleteArchitectGrammarLanguageFilesVoice");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **grammarId** | **String**| Grammar ID | 
| **languageCode** | **String**| Language | 
{: class="table-striped"}


### Return type

null (empty response body)


# **deleteArchitectIvr**


> Void deleteArchitectIvr(ivrId)

Delete an IVR Config.

Wraps DELETE /api/v2/architect/ivrs/{ivrId}  

Requires ALL permissions: 

* routing:callRoute:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String ivrId = "ivrId_example"; // String | IVR id
try {
    apiInstance.deleteArchitectIvr(ivrId);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#deleteArchitectIvr");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ivrId** | **String**| IVR id | 
{: class="table-striped"}


### Return type

null (empty response body)


# **deleteArchitectPrompt**


> Void deleteArchitectPrompt(promptId, allResources)

Delete specified user prompt

Wraps DELETE /api/v2/architect/prompts/{promptId}  

Requires ALL permissions: 

* architect:userPrompt:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String promptId = "promptId_example"; // String | Prompt ID
Boolean allResources = true; // Boolean | Whether or not to delete all the prompt resources
try {
    apiInstance.deleteArchitectPrompt(promptId, allResources);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#deleteArchitectPrompt");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **promptId** | **String**| Prompt ID | 
| **allResources** | **Boolean**| Whether or not to delete all the prompt resources | [optional] 
{: class="table-striped"}


### Return type

null (empty response body)


# **deleteArchitectPromptResource**


> Void deleteArchitectPromptResource(promptId, languageCode)

Delete specified user prompt resource

Wraps DELETE /api/v2/architect/prompts/{promptId}/resources/{languageCode}  

Requires ALL permissions: 

* architect:userPrompt:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String promptId = "promptId_example"; // String | Prompt ID
String languageCode = "languageCode_example"; // String | Language
try {
    apiInstance.deleteArchitectPromptResource(promptId, languageCode);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#deleteArchitectPromptResource");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **promptId** | **String**| Prompt ID | 
| **languageCode** | **String**| Language | 
{: class="table-striped"}


### Return type

null (empty response body)


# **deleteArchitectPromptResourceAudio**


> Void deleteArchitectPromptResourceAudio(promptId, languageCode)

Delete specified user prompt resource audio

Wraps DELETE /api/v2/architect/prompts/{promptId}/resources/{languageCode}/audio  

Requires ALL permissions: 

* architect:userPrompt:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String promptId = "promptId_example"; // String | Prompt ID
String languageCode = "languageCode_example"; // String | Language
try {
    apiInstance.deleteArchitectPromptResourceAudio(promptId, languageCode);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#deleteArchitectPromptResourceAudio");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **promptId** | **String**| Prompt ID | 
| **languageCode** | **String**| Language | 
{: class="table-striped"}


### Return type

null (empty response body)


# **deleteArchitectPrompts**


> [Operation](Operation) deleteArchitectPrompts(id)

Batch-delete a list of prompts

Multiple IDs can be specified, in which case all specified prompts will be deleted.  Asynchronous.  Notification topic: v2.architect.prompts.{promptId}

Wraps DELETE /api/v2/architect/prompts  

Requires ALL permissions: 

* architect:userPrompt:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
List<String> id = Arrays.asList(null); // List<String> | List of Prompt IDs
try {
    Operation result = apiInstance.deleteArchitectPrompts(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#deleteArchitectPrompts");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | [**List&lt;String&gt;**](String)| List of Prompt IDs | 
{: class="table-striped"}


### Return type

[**Operation**](Operation)


# **deleteArchitectSchedule**


> Void deleteArchitectSchedule(scheduleId)

Delete a schedule by id

Wraps DELETE /api/v2/architect/schedules/{scheduleId}  

Requires ALL permissions: 

* routing:schedule:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String scheduleId = "scheduleId_example"; // String | Schedule ID
try {
    apiInstance.deleteArchitectSchedule(scheduleId);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#deleteArchitectSchedule");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **scheduleId** | **String**| Schedule ID | 
{: class="table-striped"}


### Return type

null (empty response body)


# **deleteArchitectSchedulegroup**


> Void deleteArchitectSchedulegroup(scheduleGroupId)

Deletes a schedule group by ID

Wraps DELETE /api/v2/architect/schedulegroups/{scheduleGroupId}  

Requires ALL permissions: 

* routing:scheduleGroup:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String scheduleGroupId = "scheduleGroupId_example"; // String | Schedule group ID
try {
    apiInstance.deleteArchitectSchedulegroup(scheduleGroupId);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#deleteArchitectSchedulegroup");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **scheduleGroupId** | **String**| Schedule group ID | 
{: class="table-striped"}


### Return type

null (empty response body)


# **deleteArchitectSystempromptResource**


> Void deleteArchitectSystempromptResource(promptId, languageCode)

Delete a system prompt resource override.

Wraps DELETE /api/v2/architect/systemprompts/{promptId}/resources/{languageCode}  

Requires ALL permissions: 

* architect:systemPrompt:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String promptId = "promptId_example"; // String | Prompt ID
String languageCode = "languageCode_example"; // String | Language
try {
    apiInstance.deleteArchitectSystempromptResource(promptId, languageCode);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#deleteArchitectSystempromptResource");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **promptId** | **String**| Prompt ID | 
| **languageCode** | **String**| Language | 
{: class="table-striped"}


### Return type

null (empty response body)


# **deleteFlow**


> Void deleteFlow(flowId)

Delete flow

Wraps DELETE /api/v2/flows/{flowId}  

Requires ANY permissions: 

* architect:flow:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String flowId = "flowId_example"; // String | Flow ID
try {
    apiInstance.deleteFlow(flowId);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#deleteFlow");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **flowId** | **String**| Flow ID | 
{: class="table-striped"}


### Return type

null (empty response body)


# **deleteFlowInstancesSettingsLoglevels**


> Void deleteFlowInstancesSettingsLoglevels(flowId)

Deletes a log level for a flow by flow id.

Deletes the associated log level for a flow by flow id

Wraps DELETE /api/v2/flows/{flowId}/instances/settings/loglevels  

Requires ALL permissions: 

* architect:flowLogLevel:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String flowId = "flowId_example"; // String | The flow id to delete the loglevel for
try {
    apiInstance.deleteFlowInstancesSettingsLoglevels(flowId);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#deleteFlowInstancesSettingsLoglevels");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **flowId** | **String**| The flow id to delete the loglevel for | 
{: class="table-striped"}


### Return type

null (empty response body)


# **deleteFlows**


> [Operation](Operation) deleteFlows(id)

Batch-delete a list of flows

Multiple IDs can be specified, in which case all specified flows will be deleted.  Asynchronous.  Notification topic: v2.flows.{flowId}

Wraps DELETE /api/v2/flows  

Requires ANY permissions: 

* architect:flow:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
List<String> id = Arrays.asList(null); // List<String> | List of Flow IDs
try {
    Operation result = apiInstance.deleteFlows(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#deleteFlows");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | [**List&lt;String&gt;**](String)| List of Flow IDs | 
{: class="table-striped"}


### Return type

[**Operation**](Operation)


# **deleteFlowsDatatable**


> Void deleteFlowsDatatable(datatableId, force)

deletes a specific datatable by id

Deletes an entire datatable (including the schema and data) with a given datatableId

Wraps DELETE /api/v2/flows/datatables/{datatableId}  

Requires ANY permissions: 

* architect:datatable:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String datatableId = "datatableId_example"; // String | id of datatable
Boolean force = false; // Boolean | force delete, even if in use
try {
    apiInstance.deleteFlowsDatatable(datatableId, force);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#deleteFlowsDatatable");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datatableId** | **String**| id of datatable | 
| **force** | **Boolean**| force delete, even if in use | [optional] [default to false] 
{: class="table-striped"}


### Return type

null (empty response body)


# **deleteFlowsDatatableRow**


> Void deleteFlowsDatatableRow(datatableId, rowId)

Delete a row entry

Deletes a row with a given rowId (the value of the key field).

Wraps DELETE /api/v2/flows/datatables/{datatableId}/rows/{rowId}  

Requires ANY permissions: 

* architect:datatable:delete
* architect:datatableRow:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String datatableId = "datatableId_example"; // String | id of datatable
String rowId = "rowId_example"; // String | the key for the row
try {
    apiInstance.deleteFlowsDatatableRow(datatableId, rowId);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#deleteFlowsDatatableRow");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datatableId** | **String**| id of datatable | 
| **rowId** | **String**| the key for the row | 
{: class="table-striped"}


### Return type

null (empty response body)


# **deleteFlowsInstancesSettingsLoglevelsDefault**


> Void deleteFlowsInstancesSettingsLoglevelsDefault()

Resets the org log level to default, base

Resets the org log level to default, base

Wraps DELETE /api/v2/flows/instances/settings/loglevels/default  

Requires ANY permissions: 

* architect:flowLogLevelDefault:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
try {
    apiInstance.deleteFlowsInstancesSettingsLoglevelsDefault();
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#deleteFlowsInstancesSettingsLoglevelsDefault");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

null (empty response body)


# **deleteFlowsMilestone**


> Empty deleteFlowsMilestone(milestoneId)

Delete a flow milestone.

Wraps DELETE /api/v2/flows/milestones/{milestoneId}  

Requires ALL permissions: 

* architect:flowMilestone:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String milestoneId = "milestoneId_example"; // String | flow milestone ID
try {
    Empty result = apiInstance.deleteFlowsMilestone(milestoneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#deleteFlowsMilestone");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **milestoneId** | **String**| flow milestone ID | 
{: class="table-striped"}


### Return type

**Empty**


# **getArchitectDependencytracking**


> [DependencyObjectEntityListing](DependencyObjectEntityListing) getArchitectDependencytracking(name, pageNumber, pageSize, objectType, consumedResources, consumingResources, consumedResourceType, consumingResourceType)

Get Dependency Tracking objects that have a given display name

Wraps GET /api/v2/architect/dependencytracking  

Requires ALL permissions: 

* architect:dependencyTracking:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String name = "name_example"; // String | Object name to search for
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
List<String> objectType = Arrays.asList(null); // List<String> | Object type(s) to search for
Boolean consumedResources = true; // Boolean | Include resources each result item consumes
Boolean consumingResources = true; // Boolean | Include resources that consume each result item
List<String> consumedResourceType = Arrays.asList(null); // List<String> | Types of consumed resources to return, if consumed resources are requested
List<String> consumingResourceType = Arrays.asList(null); // List<String> | Types of consuming resources to return, if consuming resources are requested
try {
    DependencyObjectEntityListing result = apiInstance.getArchitectDependencytracking(name, pageNumber, pageSize, objectType, consumedResources, consumingResources, consumedResourceType, consumingResourceType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getArchitectDependencytracking");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **name** | **String**| Object name to search for | 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **objectType** | [**List&lt;String&gt;**](String)| Object type(s) to search for | [optional]<br />**Values**: ACDLANGUAGE, ACDSKILL, ACDWRAPUPCODE, AUDIOCONNECTORBOT, BOTCONNECTORBOT, BOTCONNECTORINTEGRATION, BOTFLOW, BRIDGEACTION, COMMONMODULEFLOW, COMPOSERSCRIPT, CONTACTLIST, CONVERSATIONCUSTOMATTRIBUTESCHEMA, DATAACTION, DATATABLE, DECISIONTABLE, DIALOGENGINEBOT, DIALOGENGINEBOTVERSION, DIALOGFLOWAGENT, DIALOGFLOWCXAGENT, DIGITALBOTCONNECTOR, DIGITALBOTCONNECTORINTEGRATION, DIGITALBOTFLOW, DIVISION, EMAILROUTE, EMERGENCYGROUP, FLOWACTION, FLOWDATATYPE, FLOWMILESTONE, FLOWOUTCOME, GRAMMAR, GROUP, GUIDE, GUIDEVERSION, IMAGE, INBOUNDCALLFLOW, INBOUNDCHATFLOW, INBOUNDEMAILFLOW, INBOUNDSHORTMESSAGEFLOW, INQUEUECALLFLOW, INQUEUEEMAILFLOW, INQUEUESHORTMESSAGEFLOW, IVRCONFIGURATION, KNOWLEDGEBASE, KNOWLEDGEBASEDOCUMENT, LANGUAGE, LEXBOT, LEXBOTALIAS, LEXV2BOT, LEXV2BOTALIAS, NLUDOMAIN, NUANCEMIXBOT, NUANCEMIXINTEGRATION, OAUTHCLIENT, OUTBOUNDCALLFLOW, QUEUE, RECORDINGPOLICY, RESPONSE, SCHEDULE, SCHEDULEGROUP, SECUREACTION, SECURECALLFLOW, SMSPHONENUMBER, STTENGINE, SURVEYFORM, SURVEYINVITEFLOW, SYSTEMPROMPT, TTSENGINE, TTSVOICE, USER, USERPROMPT, UTILIZATIONLABEL, VOICEFLOW, VOICEMAILFLOW, VOICESURVEYFLOW, WIDGET, WORKFLOW, WORKITEMFLOW, WORKTYPE 
| **consumedResources** | **Boolean**| Include resources each result item consumes | [optional] 
| **consumingResources** | **Boolean**| Include resources that consume each result item | [optional] 
| **consumedResourceType** | [**List&lt;String&gt;**](String)| Types of consumed resources to return, if consumed resources are requested | [optional]<br />**Values**: ACDLANGUAGE, ACDSKILL, ACDWRAPUPCODE, AUDIOCONNECTORBOT, BOTCONNECTORBOT, BOTCONNECTORINTEGRATION, BOTFLOW, BRIDGEACTION, COMMONMODULEFLOW, COMPOSERSCRIPT, CONTACTLIST, CONVERSATIONCUSTOMATTRIBUTESCHEMA, DATAACTION, DATATABLE, DECISIONTABLE, DIALOGENGINEBOT, DIALOGENGINEBOTVERSION, DIALOGFLOWAGENT, DIALOGFLOWCXAGENT, DIGITALBOTCONNECTOR, DIGITALBOTCONNECTORINTEGRATION, DIGITALBOTFLOW, DIVISION, EMAILROUTE, EMERGENCYGROUP, FLOWACTION, FLOWDATATYPE, FLOWMILESTONE, FLOWOUTCOME, GRAMMAR, GROUP, GUIDE, GUIDEVERSION, IMAGE, INBOUNDCALLFLOW, INBOUNDCHATFLOW, INBOUNDEMAILFLOW, INBOUNDSHORTMESSAGEFLOW, INQUEUECALLFLOW, INQUEUEEMAILFLOW, INQUEUESHORTMESSAGEFLOW, IVRCONFIGURATION, KNOWLEDGEBASE, KNOWLEDGEBASEDOCUMENT, LANGUAGE, LEXBOT, LEXBOTALIAS, LEXV2BOT, LEXV2BOTALIAS, NLUDOMAIN, NUANCEMIXBOT, NUANCEMIXINTEGRATION, OAUTHCLIENT, OUTBOUNDCALLFLOW, QUEUE, RECORDINGPOLICY, RESPONSE, SCHEDULE, SCHEDULEGROUP, SECUREACTION, SECURECALLFLOW, SMSPHONENUMBER, STTENGINE, SURVEYFORM, SURVEYINVITEFLOW, SYSTEMPROMPT, TTSENGINE, TTSVOICE, USER, USERPROMPT, UTILIZATIONLABEL, VOICEFLOW, VOICEMAILFLOW, VOICESURVEYFLOW, WIDGET, WORKFLOW, WORKITEMFLOW, WORKTYPE 
| **consumingResourceType** | [**List&lt;String&gt;**](String)| Types of consuming resources to return, if consuming resources are requested | [optional]<br />**Values**: ACDLANGUAGE, ACDSKILL, ACDWRAPUPCODE, AUDIOCONNECTORBOT, BOTCONNECTORBOT, BOTCONNECTORINTEGRATION, BOTFLOW, BRIDGEACTION, COMMONMODULEFLOW, COMPOSERSCRIPT, CONTACTLIST, CONVERSATIONCUSTOMATTRIBUTESCHEMA, DATAACTION, DATATABLE, DECISIONTABLE, DIALOGENGINEBOT, DIALOGENGINEBOTVERSION, DIALOGFLOWAGENT, DIALOGFLOWCXAGENT, DIGITALBOTCONNECTOR, DIGITALBOTCONNECTORINTEGRATION, DIGITALBOTFLOW, DIVISION, EMAILROUTE, EMERGENCYGROUP, FLOWACTION, FLOWDATATYPE, FLOWMILESTONE, FLOWOUTCOME, GRAMMAR, GROUP, GUIDE, GUIDEVERSION, IMAGE, INBOUNDCALLFLOW, INBOUNDCHATFLOW, INBOUNDEMAILFLOW, INBOUNDSHORTMESSAGEFLOW, INQUEUECALLFLOW, INQUEUEEMAILFLOW, INQUEUESHORTMESSAGEFLOW, IVRCONFIGURATION, KNOWLEDGEBASE, KNOWLEDGEBASEDOCUMENT, LANGUAGE, LEXBOT, LEXBOTALIAS, LEXV2BOT, LEXV2BOTALIAS, NLUDOMAIN, NUANCEMIXBOT, NUANCEMIXINTEGRATION, OAUTHCLIENT, OUTBOUNDCALLFLOW, QUEUE, RECORDINGPOLICY, RESPONSE, SCHEDULE, SCHEDULEGROUP, SECUREACTION, SECURECALLFLOW, SMSPHONENUMBER, STTENGINE, SURVEYFORM, SURVEYINVITEFLOW, SYSTEMPROMPT, TTSENGINE, TTSVOICE, USER, USERPROMPT, UTILIZATIONLABEL, VOICEFLOW, VOICEMAILFLOW, VOICESURVEYFLOW, WIDGET, WORKFLOW, WORKITEMFLOW, WORKTYPE 
{: class="table-striped"}


### Return type

[**DependencyObjectEntityListing**](DependencyObjectEntityListing)


# **getArchitectDependencytrackingBuild**


> [DependencyStatus](DependencyStatus) getArchitectDependencytrackingBuild()

Get Dependency Tracking build status for an organization

Wraps GET /api/v2/architect/dependencytracking/build  

Requires ALL permissions: 

* architect:dependencyTracking:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
try {
    DependencyStatus result = apiInstance.getArchitectDependencytrackingBuild();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getArchitectDependencytrackingBuild");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**DependencyStatus**](DependencyStatus)


# **getArchitectDependencytrackingConsumedresources**


> [ConsumedResourcesEntityListing](ConsumedResourcesEntityListing) getArchitectDependencytrackingConsumedresources(id, version, objectType, resourceType, pageNumber, pageSize)

Get resources that are consumed by a given Dependency Tracking object

Wraps GET /api/v2/architect/dependencytracking/consumedresources  

Requires ALL permissions: 

* architect:dependencyTracking:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String id = "id_example"; // String | Consuming object ID
String version = "version_example"; // String | Consuming object version
String objectType = "objectType_example"; // String | Consuming object type.  Only versioned types are allowed here.
List<String> resourceType = Arrays.asList(null); // List<String> | Types of consumed resources to show
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
try {
    ConsumedResourcesEntityListing result = apiInstance.getArchitectDependencytrackingConsumedresources(id, version, objectType, resourceType, pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getArchitectDependencytrackingConsumedresources");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **String**| Consuming object ID | 
| **version** | **String**| Consuming object version | 
| **objectType** | **String**| Consuming object type.  Only versioned types are allowed here. |<br />**Values**: ACDLANGUAGE, ACDSKILL, ACDWRAPUPCODE, AUDIOCONNECTORBOT, BOTCONNECTORBOT, BOTCONNECTORINTEGRATION, BOTFLOW, BRIDGEACTION, COMMONMODULEFLOW, COMPOSERSCRIPT, CONTACTLIST, CONVERSATIONCUSTOMATTRIBUTESCHEMA, DATAACTION, DATATABLE, DECISIONTABLE, DIALOGENGINEBOT, DIALOGENGINEBOTVERSION, DIALOGFLOWAGENT, DIALOGFLOWCXAGENT, DIGITALBOTCONNECTOR, DIGITALBOTCONNECTORINTEGRATION, DIGITALBOTFLOW, DIVISION, EMAILROUTE, EMERGENCYGROUP, FLOWACTION, FLOWDATATYPE, FLOWMILESTONE, FLOWOUTCOME, GRAMMAR, GROUP, GUIDE, GUIDEVERSION, IMAGE, INBOUNDCALLFLOW, INBOUNDCHATFLOW, INBOUNDEMAILFLOW, INBOUNDSHORTMESSAGEFLOW, INQUEUECALLFLOW, INQUEUEEMAILFLOW, INQUEUESHORTMESSAGEFLOW, IVRCONFIGURATION, KNOWLEDGEBASE, KNOWLEDGEBASEDOCUMENT, LANGUAGE, LEXBOT, LEXBOTALIAS, LEXV2BOT, LEXV2BOTALIAS, NLUDOMAIN, NUANCEMIXBOT, NUANCEMIXINTEGRATION, OAUTHCLIENT, OUTBOUNDCALLFLOW, QUEUE, RECORDINGPOLICY, RESPONSE, SCHEDULE, SCHEDULEGROUP, SECUREACTION, SECURECALLFLOW, SMSPHONENUMBER, STTENGINE, SURVEYFORM, SURVEYINVITEFLOW, SYSTEMPROMPT, TTSENGINE, TTSVOICE, USER, USERPROMPT, UTILIZATIONLABEL, VOICEFLOW, VOICEMAILFLOW, VOICESURVEYFLOW, WIDGET, WORKFLOW, WORKITEMFLOW, WORKTYPE 
| **resourceType** | [**List&lt;String&gt;**](String)| Types of consumed resources to show | [optional]<br />**Values**: ACDLANGUAGE, ACDSKILL, ACDWRAPUPCODE, AUDIOCONNECTORBOT, BOTCONNECTORBOT, BOTCONNECTORINTEGRATION, BOTFLOW, BRIDGEACTION, COMMONMODULEFLOW, COMPOSERSCRIPT, CONTACTLIST, CONVERSATIONCUSTOMATTRIBUTESCHEMA, DATAACTION, DATATABLE, DECISIONTABLE, DIALOGENGINEBOT, DIALOGENGINEBOTVERSION, DIALOGFLOWAGENT, DIALOGFLOWCXAGENT, DIGITALBOTCONNECTOR, DIGITALBOTCONNECTORINTEGRATION, DIGITALBOTFLOW, DIVISION, EMAILROUTE, EMERGENCYGROUP, FLOWACTION, FLOWDATATYPE, FLOWMILESTONE, FLOWOUTCOME, GRAMMAR, GROUP, GUIDE, GUIDEVERSION, IMAGE, INBOUNDCALLFLOW, INBOUNDCHATFLOW, INBOUNDEMAILFLOW, INBOUNDSHORTMESSAGEFLOW, INQUEUECALLFLOW, INQUEUEEMAILFLOW, INQUEUESHORTMESSAGEFLOW, IVRCONFIGURATION, KNOWLEDGEBASE, KNOWLEDGEBASEDOCUMENT, LANGUAGE, LEXBOT, LEXBOTALIAS, LEXV2BOT, LEXV2BOTALIAS, NLUDOMAIN, NUANCEMIXBOT, NUANCEMIXINTEGRATION, OAUTHCLIENT, OUTBOUNDCALLFLOW, QUEUE, RECORDINGPOLICY, RESPONSE, SCHEDULE, SCHEDULEGROUP, SECUREACTION, SECURECALLFLOW, SMSPHONENUMBER, STTENGINE, SURVEYFORM, SURVEYINVITEFLOW, SYSTEMPROMPT, TTSENGINE, TTSVOICE, USER, USERPROMPT, UTILIZATIONLABEL, VOICEFLOW, VOICEMAILFLOW, VOICESURVEYFLOW, WIDGET, WORKFLOW, WORKITEMFLOW, WORKTYPE 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
{: class="table-striped"}


### Return type

[**ConsumedResourcesEntityListing**](ConsumedResourcesEntityListing)


# **getArchitectDependencytrackingConsumingresources**


> [ConsumingResourcesEntityListing](ConsumingResourcesEntityListing) getArchitectDependencytrackingConsumingresources(id, objectType, resourceType, version, pageNumber, pageSize, flowFilter)

Get resources that consume a given Dependency Tracking object

Wraps GET /api/v2/architect/dependencytracking/consumingresources  

Requires ALL permissions: 

* architect:dependencyTracking:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String id = "id_example"; // String | Consumed object ID
String objectType = "objectType_example"; // String | Consumed object type
List<String> resourceType = Arrays.asList(null); // List<String> | Types of consuming resources to show.  Only versioned types are allowed here.
String version = "version_example"; // String | Object version
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
String flowFilter = "flowFilter_example"; // String | Show only checkedIn or published flows
try {
    ConsumingResourcesEntityListing result = apiInstance.getArchitectDependencytrackingConsumingresources(id, objectType, resourceType, version, pageNumber, pageSize, flowFilter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getArchitectDependencytrackingConsumingresources");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **String**| Consumed object ID | 
| **objectType** | **String**| Consumed object type |<br />**Values**: ACDLANGUAGE, ACDSKILL, ACDWRAPUPCODE, AUDIOCONNECTORBOT, BOTCONNECTORBOT, BOTCONNECTORINTEGRATION, BOTFLOW, BRIDGEACTION, COMMONMODULEFLOW, COMPOSERSCRIPT, CONTACTLIST, CONVERSATIONCUSTOMATTRIBUTESCHEMA, DATAACTION, DATATABLE, DECISIONTABLE, DIALOGENGINEBOT, DIALOGENGINEBOTVERSION, DIALOGFLOWAGENT, DIALOGFLOWCXAGENT, DIGITALBOTCONNECTOR, DIGITALBOTCONNECTORINTEGRATION, DIGITALBOTFLOW, DIVISION, EMAILROUTE, EMERGENCYGROUP, FLOWACTION, FLOWDATATYPE, FLOWMILESTONE, FLOWOUTCOME, GRAMMAR, GROUP, GUIDE, GUIDEVERSION, IMAGE, INBOUNDCALLFLOW, INBOUNDCHATFLOW, INBOUNDEMAILFLOW, INBOUNDSHORTMESSAGEFLOW, INQUEUECALLFLOW, INQUEUEEMAILFLOW, INQUEUESHORTMESSAGEFLOW, IVRCONFIGURATION, KNOWLEDGEBASE, KNOWLEDGEBASEDOCUMENT, LANGUAGE, LEXBOT, LEXBOTALIAS, LEXV2BOT, LEXV2BOTALIAS, NLUDOMAIN, NUANCEMIXBOT, NUANCEMIXINTEGRATION, OAUTHCLIENT, OUTBOUNDCALLFLOW, QUEUE, RECORDINGPOLICY, RESPONSE, SCHEDULE, SCHEDULEGROUP, SECUREACTION, SECURECALLFLOW, SMSPHONENUMBER, STTENGINE, SURVEYFORM, SURVEYINVITEFLOW, SYSTEMPROMPT, TTSENGINE, TTSVOICE, USER, USERPROMPT, UTILIZATIONLABEL, VOICEFLOW, VOICEMAILFLOW, VOICESURVEYFLOW, WIDGET, WORKFLOW, WORKITEMFLOW, WORKTYPE 
| **resourceType** | [**List&lt;String&gt;**](String)| Types of consuming resources to show.  Only versioned types are allowed here. | [optional]<br />**Values**: ACDLANGUAGE, ACDSKILL, ACDWRAPUPCODE, AUDIOCONNECTORBOT, BOTCONNECTORBOT, BOTCONNECTORINTEGRATION, BOTFLOW, BRIDGEACTION, COMMONMODULEFLOW, COMPOSERSCRIPT, CONTACTLIST, CONVERSATIONCUSTOMATTRIBUTESCHEMA, DATAACTION, DATATABLE, DECISIONTABLE, DIALOGENGINEBOT, DIALOGENGINEBOTVERSION, DIALOGFLOWAGENT, DIALOGFLOWCXAGENT, DIGITALBOTCONNECTOR, DIGITALBOTCONNECTORINTEGRATION, DIGITALBOTFLOW, DIVISION, EMAILROUTE, EMERGENCYGROUP, FLOWACTION, FLOWDATATYPE, FLOWMILESTONE, FLOWOUTCOME, GRAMMAR, GROUP, GUIDE, GUIDEVERSION, IMAGE, INBOUNDCALLFLOW, INBOUNDCHATFLOW, INBOUNDEMAILFLOW, INBOUNDSHORTMESSAGEFLOW, INQUEUECALLFLOW, INQUEUEEMAILFLOW, INQUEUESHORTMESSAGEFLOW, IVRCONFIGURATION, KNOWLEDGEBASE, KNOWLEDGEBASEDOCUMENT, LANGUAGE, LEXBOT, LEXBOTALIAS, LEXV2BOT, LEXV2BOTALIAS, NLUDOMAIN, NUANCEMIXBOT, NUANCEMIXINTEGRATION, OAUTHCLIENT, OUTBOUNDCALLFLOW, QUEUE, RECORDINGPOLICY, RESPONSE, SCHEDULE, SCHEDULEGROUP, SECUREACTION, SECURECALLFLOW, SMSPHONENUMBER, STTENGINE, SURVEYFORM, SURVEYINVITEFLOW, SYSTEMPROMPT, TTSENGINE, TTSVOICE, USER, USERPROMPT, UTILIZATIONLABEL, VOICEFLOW, VOICEMAILFLOW, VOICESURVEYFLOW, WIDGET, WORKFLOW, WORKITEMFLOW, WORKTYPE 
| **version** | **String**| Object version | [optional] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **flowFilter** | **String**| Show only checkedIn or published flows | [optional]<br />**Values**: checkedIn, published 
{: class="table-striped"}


### Return type

[**ConsumingResourcesEntityListing**](ConsumingResourcesEntityListing)


# **getArchitectDependencytrackingDeletedresourceconsumers**


> [DependencyObjectEntityListing](DependencyObjectEntityListing) getArchitectDependencytrackingDeletedresourceconsumers(name, objectType, flowFilter, consumedResources, consumedResourceType, pageNumber, pageSize)

Get Dependency Tracking objects that consume deleted resources

Wraps GET /api/v2/architect/dependencytracking/deletedresourceconsumers  

Requires ALL permissions: 

* architect:dependencyTracking:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String name = "name_example"; // String | Name to search for
List<String> objectType = Arrays.asList(null); // List<String> | Object type(s) to search for
String flowFilter = "flowFilter_example"; // String | Show only checkedIn or published flows
Boolean consumedResources = false; // Boolean | Return consumed resources?
List<String> consumedResourceType = Arrays.asList(null); // List<String> | Resource type(s) to return
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
try {
    DependencyObjectEntityListing result = apiInstance.getArchitectDependencytrackingDeletedresourceconsumers(name, objectType, flowFilter, consumedResources, consumedResourceType, pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getArchitectDependencytrackingDeletedresourceconsumers");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **name** | **String**| Name to search for | [optional] 
| **objectType** | [**List&lt;String&gt;**](String)| Object type(s) to search for | [optional]<br />**Values**: ACDLANGUAGE, ACDSKILL, ACDWRAPUPCODE, AUDIOCONNECTORBOT, BOTCONNECTORBOT, BOTCONNECTORINTEGRATION, BOTFLOW, BRIDGEACTION, COMMONMODULEFLOW, COMPOSERSCRIPT, CONTACTLIST, CONVERSATIONCUSTOMATTRIBUTESCHEMA, DATAACTION, DATATABLE, DECISIONTABLE, DIALOGENGINEBOT, DIALOGENGINEBOTVERSION, DIALOGFLOWAGENT, DIALOGFLOWCXAGENT, DIGITALBOTCONNECTOR, DIGITALBOTCONNECTORINTEGRATION, DIGITALBOTFLOW, DIVISION, EMAILROUTE, EMERGENCYGROUP, FLOWACTION, FLOWDATATYPE, FLOWMILESTONE, FLOWOUTCOME, GRAMMAR, GROUP, GUIDE, GUIDEVERSION, IMAGE, INBOUNDCALLFLOW, INBOUNDCHATFLOW, INBOUNDEMAILFLOW, INBOUNDSHORTMESSAGEFLOW, INQUEUECALLFLOW, INQUEUEEMAILFLOW, INQUEUESHORTMESSAGEFLOW, IVRCONFIGURATION, KNOWLEDGEBASE, KNOWLEDGEBASEDOCUMENT, LANGUAGE, LEXBOT, LEXBOTALIAS, LEXV2BOT, LEXV2BOTALIAS, NLUDOMAIN, NUANCEMIXBOT, NUANCEMIXINTEGRATION, OAUTHCLIENT, OUTBOUNDCALLFLOW, QUEUE, RECORDINGPOLICY, RESPONSE, SCHEDULE, SCHEDULEGROUP, SECUREACTION, SECURECALLFLOW, SMSPHONENUMBER, STTENGINE, SURVEYFORM, SURVEYINVITEFLOW, SYSTEMPROMPT, TTSENGINE, TTSVOICE, USER, USERPROMPT, UTILIZATIONLABEL, VOICEFLOW, VOICEMAILFLOW, VOICESURVEYFLOW, WIDGET, WORKFLOW, WORKITEMFLOW, WORKTYPE 
| **flowFilter** | **String**| Show only checkedIn or published flows | [optional]<br />**Values**: checkedIn, published 
| **consumedResources** | **Boolean**| Return consumed resources? | [optional] [default to false] 
| **consumedResourceType** | [**List&lt;String&gt;**](String)| Resource type(s) to return | [optional]<br />**Values**: ACDLANGUAGE, ACDSKILL, ACDWRAPUPCODE, AUDIOCONNECTORBOT, BOTCONNECTORBOT, BOTCONNECTORINTEGRATION, BOTFLOW, BRIDGEACTION, COMMONMODULEFLOW, COMPOSERSCRIPT, CONTACTLIST, CONVERSATIONCUSTOMATTRIBUTESCHEMA, DATAACTION, DATATABLE, DECISIONTABLE, DIALOGENGINEBOT, DIALOGENGINEBOTVERSION, DIALOGFLOWAGENT, DIALOGFLOWCXAGENT, DIGITALBOTCONNECTOR, DIGITALBOTCONNECTORINTEGRATION, DIGITALBOTFLOW, DIVISION, EMAILROUTE, EMERGENCYGROUP, FLOWACTION, FLOWDATATYPE, FLOWMILESTONE, FLOWOUTCOME, GRAMMAR, GROUP, GUIDE, GUIDEVERSION, IMAGE, INBOUNDCALLFLOW, INBOUNDCHATFLOW, INBOUNDEMAILFLOW, INBOUNDSHORTMESSAGEFLOW, INQUEUECALLFLOW, INQUEUEEMAILFLOW, INQUEUESHORTMESSAGEFLOW, IVRCONFIGURATION, KNOWLEDGEBASE, KNOWLEDGEBASEDOCUMENT, LANGUAGE, LEXBOT, LEXBOTALIAS, LEXV2BOT, LEXV2BOTALIAS, NLUDOMAIN, NUANCEMIXBOT, NUANCEMIXINTEGRATION, OAUTHCLIENT, OUTBOUNDCALLFLOW, QUEUE, RECORDINGPOLICY, RESPONSE, SCHEDULE, SCHEDULEGROUP, SECUREACTION, SECURECALLFLOW, SMSPHONENUMBER, STTENGINE, SURVEYFORM, SURVEYINVITEFLOW, SYSTEMPROMPT, TTSENGINE, TTSVOICE, USER, USERPROMPT, UTILIZATIONLABEL, VOICEFLOW, VOICEMAILFLOW, VOICESURVEYFLOW, WIDGET, WORKFLOW, WORKITEMFLOW, WORKTYPE 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
{: class="table-striped"}


### Return type

[**DependencyObjectEntityListing**](DependencyObjectEntityListing)


# **getArchitectDependencytrackingObject**


> [DependencyObject](DependencyObject) getArchitectDependencytrackingObject(id, version, objectType, consumedResources, consumingResources, consumedResourceType, consumingResourceType, consumedResourceRequest)

Get a Dependency Tracking object

Wraps GET /api/v2/architect/dependencytracking/object  

Requires ALL permissions: 

* architect:dependencyTracking:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String id = "id_example"; // String | Object ID
String version = "version_example"; // String | Object version
String objectType = "objectType_example"; // String | Object type
Boolean consumedResources = true; // Boolean | Include resources this item consumes
Boolean consumingResources = true; // Boolean | Include resources that consume this item
List<String> consumedResourceType = Arrays.asList(null); // List<String> | Types of consumed resources to return, if consumed resources are requested
List<String> consumingResourceType = Arrays.asList(null); // List<String> | Types of consuming resources to return, if consuming resources are requested
Boolean consumedResourceRequest = true; // Boolean | Indicate that this is going to look up a consumed resource object
try {
    DependencyObject result = apiInstance.getArchitectDependencytrackingObject(id, version, objectType, consumedResources, consumingResources, consumedResourceType, consumingResourceType, consumedResourceRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getArchitectDependencytrackingObject");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **String**| Object ID | 
| **version** | **String**| Object version | [optional] 
| **objectType** | **String**| Object type | [optional]<br />**Values**: ACDLANGUAGE, ACDSKILL, ACDWRAPUPCODE, AUDIOCONNECTORBOT, BOTCONNECTORBOT, BOTCONNECTORINTEGRATION, BOTFLOW, BRIDGEACTION, COMMONMODULEFLOW, COMPOSERSCRIPT, CONTACTLIST, CONVERSATIONCUSTOMATTRIBUTESCHEMA, DATAACTION, DATATABLE, DECISIONTABLE, DIALOGENGINEBOT, DIALOGENGINEBOTVERSION, DIALOGFLOWAGENT, DIALOGFLOWCXAGENT, DIGITALBOTCONNECTOR, DIGITALBOTCONNECTORINTEGRATION, DIGITALBOTFLOW, DIVISION, EMAILROUTE, EMERGENCYGROUP, FLOWACTION, FLOWDATATYPE, FLOWMILESTONE, FLOWOUTCOME, GRAMMAR, GROUP, GUIDE, GUIDEVERSION, IMAGE, INBOUNDCALLFLOW, INBOUNDCHATFLOW, INBOUNDEMAILFLOW, INBOUNDSHORTMESSAGEFLOW, INQUEUECALLFLOW, INQUEUEEMAILFLOW, INQUEUESHORTMESSAGEFLOW, IVRCONFIGURATION, KNOWLEDGEBASE, KNOWLEDGEBASEDOCUMENT, LANGUAGE, LEXBOT, LEXBOTALIAS, LEXV2BOT, LEXV2BOTALIAS, NLUDOMAIN, NUANCEMIXBOT, NUANCEMIXINTEGRATION, OAUTHCLIENT, OUTBOUNDCALLFLOW, QUEUE, RECORDINGPOLICY, RESPONSE, SCHEDULE, SCHEDULEGROUP, SECUREACTION, SECURECALLFLOW, SMSPHONENUMBER, STTENGINE, SURVEYFORM, SURVEYINVITEFLOW, SYSTEMPROMPT, TTSENGINE, TTSVOICE, USER, USERPROMPT, UTILIZATIONLABEL, VOICEFLOW, VOICEMAILFLOW, VOICESURVEYFLOW, WIDGET, WORKFLOW, WORKITEMFLOW, WORKTYPE 
| **consumedResources** | **Boolean**| Include resources this item consumes | [optional] 
| **consumingResources** | **Boolean**| Include resources that consume this item | [optional] 
| **consumedResourceType** | [**List&lt;String&gt;**](String)| Types of consumed resources to return, if consumed resources are requested | [optional]<br />**Values**: ACDLANGUAGE, ACDSKILL, ACDWRAPUPCODE, AUDIOCONNECTORBOT, BOTCONNECTORBOT, BOTCONNECTORINTEGRATION, BOTFLOW, BRIDGEACTION, COMMONMODULEFLOW, COMPOSERSCRIPT, CONTACTLIST, CONVERSATIONCUSTOMATTRIBUTESCHEMA, DATAACTION, DATATABLE, DECISIONTABLE, DIALOGENGINEBOT, DIALOGENGINEBOTVERSION, DIALOGFLOWAGENT, DIALOGFLOWCXAGENT, DIGITALBOTCONNECTOR, DIGITALBOTCONNECTORINTEGRATION, DIGITALBOTFLOW, DIVISION, EMAILROUTE, EMERGENCYGROUP, FLOWACTION, FLOWDATATYPE, FLOWMILESTONE, FLOWOUTCOME, GRAMMAR, GROUP, GUIDE, GUIDEVERSION, IMAGE, INBOUNDCALLFLOW, INBOUNDCHATFLOW, INBOUNDEMAILFLOW, INBOUNDSHORTMESSAGEFLOW, INQUEUECALLFLOW, INQUEUEEMAILFLOW, INQUEUESHORTMESSAGEFLOW, IVRCONFIGURATION, KNOWLEDGEBASE, KNOWLEDGEBASEDOCUMENT, LANGUAGE, LEXBOT, LEXBOTALIAS, LEXV2BOT, LEXV2BOTALIAS, NLUDOMAIN, NUANCEMIXBOT, NUANCEMIXINTEGRATION, OAUTHCLIENT, OUTBOUNDCALLFLOW, QUEUE, RECORDINGPOLICY, RESPONSE, SCHEDULE, SCHEDULEGROUP, SECUREACTION, SECURECALLFLOW, SMSPHONENUMBER, STTENGINE, SURVEYFORM, SURVEYINVITEFLOW, SYSTEMPROMPT, TTSENGINE, TTSVOICE, USER, USERPROMPT, UTILIZATIONLABEL, VOICEFLOW, VOICEMAILFLOW, VOICESURVEYFLOW, WIDGET, WORKFLOW, WORKITEMFLOW, WORKTYPE 
| **consumingResourceType** | [**List&lt;String&gt;**](String)| Types of consuming resources to return, if consuming resources are requested | [optional]<br />**Values**: ACDLANGUAGE, ACDSKILL, ACDWRAPUPCODE, AUDIOCONNECTORBOT, BOTCONNECTORBOT, BOTCONNECTORINTEGRATION, BOTFLOW, BRIDGEACTION, COMMONMODULEFLOW, COMPOSERSCRIPT, CONTACTLIST, CONVERSATIONCUSTOMATTRIBUTESCHEMA, DATAACTION, DATATABLE, DECISIONTABLE, DIALOGENGINEBOT, DIALOGENGINEBOTVERSION, DIALOGFLOWAGENT, DIALOGFLOWCXAGENT, DIGITALBOTCONNECTOR, DIGITALBOTCONNECTORINTEGRATION, DIGITALBOTFLOW, DIVISION, EMAILROUTE, EMERGENCYGROUP, FLOWACTION, FLOWDATATYPE, FLOWMILESTONE, FLOWOUTCOME, GRAMMAR, GROUP, GUIDE, GUIDEVERSION, IMAGE, INBOUNDCALLFLOW, INBOUNDCHATFLOW, INBOUNDEMAILFLOW, INBOUNDSHORTMESSAGEFLOW, INQUEUECALLFLOW, INQUEUEEMAILFLOW, INQUEUESHORTMESSAGEFLOW, IVRCONFIGURATION, KNOWLEDGEBASE, KNOWLEDGEBASEDOCUMENT, LANGUAGE, LEXBOT, LEXBOTALIAS, LEXV2BOT, LEXV2BOTALIAS, NLUDOMAIN, NUANCEMIXBOT, NUANCEMIXINTEGRATION, OAUTHCLIENT, OUTBOUNDCALLFLOW, QUEUE, RECORDINGPOLICY, RESPONSE, SCHEDULE, SCHEDULEGROUP, SECUREACTION, SECURECALLFLOW, SMSPHONENUMBER, STTENGINE, SURVEYFORM, SURVEYINVITEFLOW, SYSTEMPROMPT, TTSENGINE, TTSVOICE, USER, USERPROMPT, UTILIZATIONLABEL, VOICEFLOW, VOICEMAILFLOW, VOICESURVEYFLOW, WIDGET, WORKFLOW, WORKITEMFLOW, WORKTYPE 
| **consumedResourceRequest** | **Boolean**| Indicate that this is going to look up a consumed resource object | [optional] 
{: class="table-striped"}


### Return type

[**DependencyObject**](DependencyObject)


# **getArchitectDependencytrackingType**


> [DependencyType](DependencyType) getArchitectDependencytrackingType(typeId)

Get a Dependency Tracking type.

Wraps GET /api/v2/architect/dependencytracking/types/{typeId}  

Requires ALL permissions: 

* architect:dependencyTracking:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String typeId = "typeId_example"; // String | Type ID
try {
    DependencyType result = apiInstance.getArchitectDependencytrackingType(typeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getArchitectDependencytrackingType");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **typeId** | **String**| Type ID | 
{: class="table-striped"}


### Return type

[**DependencyType**](DependencyType)


# **getArchitectDependencytrackingTypes**


> [DependencyTypeEntityListing](DependencyTypeEntityListing) getArchitectDependencytrackingTypes(pageNumber, pageSize)

Get Dependency Tracking types.

Wraps GET /api/v2/architect/dependencytracking/types  

Requires ALL permissions: 

* architect:dependencyTracking:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
try {
    DependencyTypeEntityListing result = apiInstance.getArchitectDependencytrackingTypes(pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getArchitectDependencytrackingTypes");
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

[**DependencyTypeEntityListing**](DependencyTypeEntityListing)


# **getArchitectDependencytrackingUpdatedresourceconsumers**


> [DependencyObjectEntityListing](DependencyObjectEntityListing) getArchitectDependencytrackingUpdatedresourceconsumers(name, objectType, consumedResources, consumedResourceType, pageNumber, pageSize)

Get Dependency Tracking objects that depend on updated resources

Wraps GET /api/v2/architect/dependencytracking/updatedresourceconsumers  

Requires ALL permissions: 

* architect:dependencyTracking:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String name = "name_example"; // String | Name to search for
List<String> objectType = Arrays.asList(null); // List<String> | Object type(s) to search for
Boolean consumedResources = false; // Boolean | Return consumed resources?
List<String> consumedResourceType = Arrays.asList(null); // List<String> | Resource type(s) to return
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
try {
    DependencyObjectEntityListing result = apiInstance.getArchitectDependencytrackingUpdatedresourceconsumers(name, objectType, consumedResources, consumedResourceType, pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getArchitectDependencytrackingUpdatedresourceconsumers");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **name** | **String**| Name to search for | [optional] 
| **objectType** | [**List&lt;String&gt;**](String)| Object type(s) to search for | [optional]<br />**Values**: ACDLANGUAGE, ACDSKILL, ACDWRAPUPCODE, AUDIOCONNECTORBOT, BOTCONNECTORBOT, BOTCONNECTORINTEGRATION, BOTFLOW, BRIDGEACTION, COMMONMODULEFLOW, COMPOSERSCRIPT, CONTACTLIST, CONVERSATIONCUSTOMATTRIBUTESCHEMA, DATAACTION, DATATABLE, DECISIONTABLE, DIALOGENGINEBOT, DIALOGENGINEBOTVERSION, DIALOGFLOWAGENT, DIALOGFLOWCXAGENT, DIGITALBOTCONNECTOR, DIGITALBOTCONNECTORINTEGRATION, DIGITALBOTFLOW, DIVISION, EMAILROUTE, EMERGENCYGROUP, FLOWACTION, FLOWDATATYPE, FLOWMILESTONE, FLOWOUTCOME, GRAMMAR, GROUP, GUIDE, GUIDEVERSION, IMAGE, INBOUNDCALLFLOW, INBOUNDCHATFLOW, INBOUNDEMAILFLOW, INBOUNDSHORTMESSAGEFLOW, INQUEUECALLFLOW, INQUEUEEMAILFLOW, INQUEUESHORTMESSAGEFLOW, IVRCONFIGURATION, KNOWLEDGEBASE, KNOWLEDGEBASEDOCUMENT, LANGUAGE, LEXBOT, LEXBOTALIAS, LEXV2BOT, LEXV2BOTALIAS, NLUDOMAIN, NUANCEMIXBOT, NUANCEMIXINTEGRATION, OAUTHCLIENT, OUTBOUNDCALLFLOW, QUEUE, RECORDINGPOLICY, RESPONSE, SCHEDULE, SCHEDULEGROUP, SECUREACTION, SECURECALLFLOW, SMSPHONENUMBER, STTENGINE, SURVEYFORM, SURVEYINVITEFLOW, SYSTEMPROMPT, TTSENGINE, TTSVOICE, USER, USERPROMPT, UTILIZATIONLABEL, VOICEFLOW, VOICEMAILFLOW, VOICESURVEYFLOW, WIDGET, WORKFLOW, WORKITEMFLOW, WORKTYPE 
| **consumedResources** | **Boolean**| Return consumed resources? | [optional] [default to false] 
| **consumedResourceType** | [**List&lt;String&gt;**](String)| Resource type(s) to return | [optional]<br />**Values**: ACDLANGUAGE, ACDSKILL, ACDWRAPUPCODE, AUDIOCONNECTORBOT, BOTCONNECTORBOT, BOTCONNECTORINTEGRATION, BOTFLOW, BRIDGEACTION, COMMONMODULEFLOW, COMPOSERSCRIPT, CONTACTLIST, CONVERSATIONCUSTOMATTRIBUTESCHEMA, DATAACTION, DATATABLE, DECISIONTABLE, DIALOGENGINEBOT, DIALOGENGINEBOTVERSION, DIALOGFLOWAGENT, DIALOGFLOWCXAGENT, DIGITALBOTCONNECTOR, DIGITALBOTCONNECTORINTEGRATION, DIGITALBOTFLOW, DIVISION, EMAILROUTE, EMERGENCYGROUP, FLOWACTION, FLOWDATATYPE, FLOWMILESTONE, FLOWOUTCOME, GRAMMAR, GROUP, GUIDE, GUIDEVERSION, IMAGE, INBOUNDCALLFLOW, INBOUNDCHATFLOW, INBOUNDEMAILFLOW, INBOUNDSHORTMESSAGEFLOW, INQUEUECALLFLOW, INQUEUEEMAILFLOW, INQUEUESHORTMESSAGEFLOW, IVRCONFIGURATION, KNOWLEDGEBASE, KNOWLEDGEBASEDOCUMENT, LANGUAGE, LEXBOT, LEXBOTALIAS, LEXV2BOT, LEXV2BOTALIAS, NLUDOMAIN, NUANCEMIXBOT, NUANCEMIXINTEGRATION, OAUTHCLIENT, OUTBOUNDCALLFLOW, QUEUE, RECORDINGPOLICY, RESPONSE, SCHEDULE, SCHEDULEGROUP, SECUREACTION, SECURECALLFLOW, SMSPHONENUMBER, STTENGINE, SURVEYFORM, SURVEYINVITEFLOW, SYSTEMPROMPT, TTSENGINE, TTSVOICE, USER, USERPROMPT, UTILIZATIONLABEL, VOICEFLOW, VOICEMAILFLOW, VOICESURVEYFLOW, WIDGET, WORKFLOW, WORKITEMFLOW, WORKTYPE 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
{: class="table-striped"}


### Return type

[**DependencyObjectEntityListing**](DependencyObjectEntityListing)


# **getArchitectEmergencygroup**


> [EmergencyGroup](EmergencyGroup) getArchitectEmergencygroup(emergencyGroupId)

Gets a emergency group by ID

Wraps GET /api/v2/architect/emergencygroups/{emergencyGroupId}  

Requires ALL permissions: 

* routing:emergencyGroup:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String emergencyGroupId = "emergencyGroupId_example"; // String | Emergency group ID
try {
    EmergencyGroup result = apiInstance.getArchitectEmergencygroup(emergencyGroupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getArchitectEmergencygroup");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **emergencyGroupId** | **String**| Emergency group ID | 
{: class="table-striped"}


### Return type

[**EmergencyGroup**](EmergencyGroup)


# **getArchitectEmergencygroups**


> [EmergencyGroupListing](EmergencyGroupListing) getArchitectEmergencygroups(pageNumber, pageSize, sortBy, sortOrder, name)

Get a list of emergency groups.

Wraps GET /api/v2/architect/emergencygroups  

Requires ALL permissions: 

* routing:emergencyGroup:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
String sortBy = "name"; // String | Sort by
String sortOrder = "ASC"; // String | Sort order
String name = "name_example"; // String | Name of the Emergency Group to filter by.
try {
    EmergencyGroupListing result = apiInstance.getArchitectEmergencygroups(pageNumber, pageSize, sortBy, sortOrder, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getArchitectEmergencygroups");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **sortBy** | **String**| Sort by | [optional] [default to name] 
| **sortOrder** | **String**| Sort order | [optional] [default to ASC] 
| **name** | **String**| Name of the Emergency Group to filter by. | [optional] 
{: class="table-striped"}


### Return type

[**EmergencyGroupListing**](EmergencyGroupListing)


# **getArchitectEmergencygroupsDivisionviews**


> [EmergencyGroupDivisionViewEntityListing](EmergencyGroupDivisionViewEntityListing) getArchitectEmergencygroupsDivisionviews(pageNumber, pageSize, sortBy, sortOrder, id, name, divisionId)

Get a pageable list of basic emergency group objects filterable by query parameters.

This returns emergency groups consisting of name and division. If one or more IDs are specified, the search will fetch emergency groups that match the given ID(s) and not use any additional supplied query parameters in the search.

Wraps GET /api/v2/architect/emergencygroups/divisionviews  

Requires ALL permissions: 

* routing:emergencyGroup:search

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
String sortBy = "name"; // String | Sort by
String sortOrder = "ASC"; // String | Sort order
List<String> id = Arrays.asList(null); // List<String> | ID of the Emergency Groups to filter by.
String name = "name_example"; // String | Name of the Emergency Group to filter by.
List<String> divisionId = Arrays.asList(null); // List<String> | List of divisionIds on which to filter.
try {
    EmergencyGroupDivisionViewEntityListing result = apiInstance.getArchitectEmergencygroupsDivisionviews(pageNumber, pageSize, sortBy, sortOrder, id, name, divisionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getArchitectEmergencygroupsDivisionviews");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **sortBy** | **String**| Sort by | [optional] [default to name] 
| **sortOrder** | **String**| Sort order | [optional] [default to ASC] 
| **id** | [**List&lt;String&gt;**](String)| ID of the Emergency Groups to filter by. | [optional] 
| **name** | **String**| Name of the Emergency Group to filter by. | [optional] 
| **divisionId** | [**List&lt;String&gt;**](String)| List of divisionIds on which to filter. | [optional] 
{: class="table-striped"}


### Return type

[**EmergencyGroupDivisionViewEntityListing**](EmergencyGroupDivisionViewEntityListing)


# **getArchitectGrammar**


> [Grammar](Grammar) getArchitectGrammar(grammarId, includeFileUrls)

Get a grammar

Returns a specified grammar

Wraps GET /api/v2/architect/grammars/{grammarId}  

Requires ALL permissions: 

* architect:grammar:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String grammarId = "grammarId_example"; // String | grammar ID
Boolean includeFileUrls = true; // Boolean | Include grammar language file URLs
try {
    Grammar result = apiInstance.getArchitectGrammar(grammarId, includeFileUrls);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getArchitectGrammar");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **grammarId** | **String**| grammar ID | 
| **includeFileUrls** | **Boolean**| Include grammar language file URLs | [optional] 
{: class="table-striped"}


### Return type

[**Grammar**](Grammar)


# **getArchitectGrammarLanguage**


> [GrammarLanguage](GrammarLanguage) getArchitectGrammarLanguage(grammarId, languageCode)

Get a grammar language.

Wraps GET /api/v2/architect/grammars/{grammarId}/languages/{languageCode}  

Requires ALL permissions: 

* architect:grammar:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String grammarId = "grammarId_example"; // String | Grammar ID
String languageCode = "languageCode_example"; // String | Language
try {
    GrammarLanguage result = apiInstance.getArchitectGrammarLanguage(grammarId, languageCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getArchitectGrammarLanguage");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **grammarId** | **String**| Grammar ID | 
| **languageCode** | **String**| Language | 
{: class="table-striped"}


### Return type

[**GrammarLanguage**](GrammarLanguage)


# **getArchitectGrammars**


> [GrammarListing](GrammarListing) getArchitectGrammars(pageNumber, pageSize, sortBy, sortOrder, id, name, description, nameOrDescription, includeFileUrls)

Get a pageable list of grammars, filtered by query parameters

Multiple IDs can be specified, in which case all matching grammars will be returned, and no other parameters will be evaluated.

Wraps GET /api/v2/architect/grammars  

Requires ALL permissions: 

* architect:grammar:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
String sortBy = "id"; // String | Sort by
String sortOrder = "asc"; // String | Sort order
List<String> id = Arrays.asList(null); // List<String> | ID
String name = "name_example"; // String | Name
String description = "description_example"; // String | Description
String nameOrDescription = "nameOrDescription_example"; // String | Name or description
Boolean includeFileUrls = true; // Boolean | Include grammar language file URLs
try {
    GrammarListing result = apiInstance.getArchitectGrammars(pageNumber, pageSize, sortBy, sortOrder, id, name, description, nameOrDescription, includeFileUrls);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getArchitectGrammars");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **sortBy** | **String**| Sort by | [optional] [default to id]<br />**Values**: description, id, name 
| **sortOrder** | **String**| Sort order | [optional] [default to asc]<br />**Values**: asc, desc 
| **id** | [**List&lt;String&gt;**](String)| ID | [optional] 
| **name** | **String**| Name | [optional] 
| **description** | **String**| Description | [optional] 
| **nameOrDescription** | **String**| Name or description | [optional] 
| **includeFileUrls** | **Boolean**| Include grammar language file URLs | [optional] 
{: class="table-striped"}


### Return type

[**GrammarListing**](GrammarListing)


# **getArchitectIvr**


> [IVR](IVR) getArchitectIvr(ivrId)

Get an IVR config.

Wraps GET /api/v2/architect/ivrs/{ivrId}  

Requires ALL permissions: 

* routing:callRoute:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String ivrId = "ivrId_example"; // String | IVR id
try {
    IVR result = apiInstance.getArchitectIvr(ivrId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getArchitectIvr");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ivrId** | **String**| IVR id | 
{: class="table-striped"}


### Return type

[**IVR**](IVR)


# **getArchitectIvrIdentityresolution**


> [IVRIdentityResolutionConfig](IVRIdentityResolutionConfig) getArchitectIvrIdentityresolution(ivrId)

Get an IVR IdentityResolutionConfig.

Wraps GET /api/v2/architect/ivrs/{ivrId}/identityresolution  

Requires ALL permissions: 

* routing:callRoute:view
* routing:identityResolutionIvr:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String ivrId = "ivrId_example"; // String | IVR id
try {
    IVRIdentityResolutionConfig result = apiInstance.getArchitectIvrIdentityresolution(ivrId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getArchitectIvrIdentityresolution");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ivrId** | **String**| IVR id | 
{: class="table-striped"}


### Return type

[**IVRIdentityResolutionConfig**](IVRIdentityResolutionConfig)


# **getArchitectIvrs**


> [IVREntityListing](IVREntityListing) getArchitectIvrs(pageNumber, pageSize, sortBy, sortOrder, name, dnis, scheduleGroup, expand)

Get IVR configs.

Wraps GET /api/v2/architect/ivrs  

Requires ALL permissions: 

* routing:callRoute:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
String sortBy = "name"; // String | Sort by
String sortOrder = "ASC"; // String | Sort order
String name = "name_example"; // String | Name of the IVR to filter by.
String dnis = "dnis_example"; // String | The phone number of the IVR to filter by.
String scheduleGroup = "scheduleGroup_example"; // String | The Schedule Group of the IVR to filter by.
List<String> expand = Arrays.asList(null); // List<String> | Which fields, if any, to expand
try {
    IVREntityListing result = apiInstance.getArchitectIvrs(pageNumber, pageSize, sortBy, sortOrder, name, dnis, scheduleGroup, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getArchitectIvrs");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **sortBy** | **String**| Sort by | [optional] [default to name] 
| **sortOrder** | **String**| Sort order | [optional] [default to ASC] 
| **name** | **String**| Name of the IVR to filter by. | [optional] 
| **dnis** | **String**| The phone number of the IVR to filter by. | [optional] 
| **scheduleGroup** | **String**| The Schedule Group of the IVR to filter by. | [optional] 
| **expand** | [**List&lt;String&gt;**](String)| Which fields, if any, to expand | [optional]<br />**Values**: identityresolution 
{: class="table-striped"}


### Return type

[**IVREntityListing**](IVREntityListing)


# **getArchitectIvrsDivisionviews**


> [IVRDivisionViewEntityListing](IVRDivisionViewEntityListing) getArchitectIvrsDivisionviews(pageNumber, pageSize, sortBy, sortOrder, id, name, divisionId)

Get a pageable list of basic ivr configuration information objects filterable by query parameters.

Wraps GET /api/v2/architect/ivrs/divisionviews  

Requires ALL permissions: 

* routing:callRoute:search

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
String sortBy = "name"; // String | Sort by
String sortOrder = "ASC"; // String | Sort order
List<String> id = Arrays.asList(null); // List<String> | ID of the IVR to filter by.
String name = "name_example"; // String | Name of the IVR to filter by.
List<String> divisionId = Arrays.asList(null); // List<String> | List of divisionIds on which to filter.
try {
    IVRDivisionViewEntityListing result = apiInstance.getArchitectIvrsDivisionviews(pageNumber, pageSize, sortBy, sortOrder, id, name, divisionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getArchitectIvrsDivisionviews");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **sortBy** | **String**| Sort by | [optional] [default to name] 
| **sortOrder** | **String**| Sort order | [optional] [default to ASC] 
| **id** | [**List&lt;String&gt;**](String)| ID of the IVR to filter by. | [optional] 
| **name** | **String**| Name of the IVR to filter by. | [optional] 
| **divisionId** | [**List&lt;String&gt;**](String)| List of divisionIds on which to filter. | [optional] 
{: class="table-striped"}


### Return type

[**IVRDivisionViewEntityListing**](IVRDivisionViewEntityListing)


# **getArchitectPrompt**


> [Prompt](Prompt) getArchitectPrompt(promptId, includeMediaUris, includeResources, language)

Get specified user prompt

Wraps GET /api/v2/architect/prompts/{promptId}  

Requires ALL permissions: 

* architect:userPrompt:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String promptId = "promptId_example"; // String | Prompt ID
Boolean includeMediaUris = true; // Boolean | Include the media URIs for each resource
Boolean includeResources = true; // Boolean | Include the resources for each system prompt
List<String> language = Arrays.asList(null); // List<String> | Filter the resources down to the provided languages
try {
    Prompt result = apiInstance.getArchitectPrompt(promptId, includeMediaUris, includeResources, language);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getArchitectPrompt");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **promptId** | **String**| Prompt ID | 
| **includeMediaUris** | **Boolean**| Include the media URIs for each resource | [optional] [default to true] 
| **includeResources** | **Boolean**| Include the resources for each system prompt | [optional] [default to true] 
| **language** | [**List&lt;String&gt;**](String)| Filter the resources down to the provided languages | [optional] 
{: class="table-striped"}


### Return type

[**Prompt**](Prompt)


# **getArchitectPromptHistoryHistoryId**


> [HistoryListing](HistoryListing) getArchitectPromptHistoryHistoryId(promptId, historyId, pageNumber, pageSize, sortOrder, sortBy, action)

Get generated prompt history

Wraps GET /api/v2/architect/prompts/{promptId}/history/{historyId}  

Requires ALL permissions: 

* architect:userPrompt:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String promptId = "promptId_example"; // String | Prompt ID
String historyId = "historyId_example"; // String | History request ID
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
String sortOrder = "desc"; // String | Sort order
String sortBy = "timestamp"; // String | Sort by
List<String> action = Arrays.asList(null); // List<String> | Flow actions to include (omit to include all)
try {
    HistoryListing result = apiInstance.getArchitectPromptHistoryHistoryId(promptId, historyId, pageNumber, pageSize, sortOrder, sortBy, action);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getArchitectPromptHistoryHistoryId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **promptId** | **String**| Prompt ID | 
| **historyId** | **String**| History request ID | 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **sortOrder** | **String**| Sort order | [optional] [default to desc] 
| **sortBy** | **String**| Sort by | [optional] [default to timestamp]<br />**Values**: action, timestamp, user 
| **action** | [**List&lt;String&gt;**](String)| Flow actions to include (omit to include all) | [optional]<br />**Values**: checkin, checkout, create, deactivate, debug, delete, publish, revert, save 
{: class="table-striped"}


### Return type

[**HistoryListing**](HistoryListing)


# **getArchitectPromptResource**


> [PromptAsset](PromptAsset) getArchitectPromptResource(promptId, languageCode)

Get specified user prompt resource

Wraps GET /api/v2/architect/prompts/{promptId}/resources/{languageCode}  

Requires ALL permissions: 

* architect:userPrompt:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String promptId = "promptId_example"; // String | Prompt ID
String languageCode = "languageCode_example"; // String | Language
try {
    PromptAsset result = apiInstance.getArchitectPromptResource(promptId, languageCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getArchitectPromptResource");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **promptId** | **String**| Prompt ID | 
| **languageCode** | **String**| Language | 
{: class="table-striped"}


### Return type

[**PromptAsset**](PromptAsset)


# **getArchitectPromptResources**


> [PromptAssetEntityListing](PromptAssetEntityListing) getArchitectPromptResources(promptId, pageNumber, pageSize)

Get a pageable list of user prompt resources

The returned list is pageable, and query parameters can be used for filtering.

Wraps GET /api/v2/architect/prompts/{promptId}/resources  

Requires ALL permissions: 

* architect:userPrompt:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String promptId = "promptId_example"; // String | Prompt ID
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
try {
    PromptAssetEntityListing result = apiInstance.getArchitectPromptResources(promptId, pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getArchitectPromptResources");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **promptId** | **String**| Prompt ID | 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
{: class="table-striped"}


### Return type

[**PromptAssetEntityListing**](PromptAssetEntityListing)


# **getArchitectPrompts**


> [PromptEntityListing](PromptEntityListing) getArchitectPrompts(pageNumber, pageSize, name, description, nameOrDescription, sortBy, sortOrder, includeMediaUris, includeResources, language)

Get a pageable list of user prompts

The returned list is pageable, and query parameters can be used for filtering.  Multiple names can be specified, in which case all matching prompts will be returned, and no other filters will be evaluated.

Wraps GET /api/v2/architect/prompts  

Requires ALL permissions: 

* architect:userPrompt:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
List<String> name = Arrays.asList(null); // List<String> | Name
String description = "description_example"; // String | Description
String nameOrDescription = "nameOrDescription_example"; // String | Name or description
String sortBy = "id"; // String | Sort by
String sortOrder = "asc"; // String | Sort order
Boolean includeMediaUris = true; // Boolean | Include the media URIs for each resource
Boolean includeResources = true; // Boolean | Include the resources for each system prompt
List<String> language = Arrays.asList(null); // List<String> | Filter the resources down to the provided languages
try {
    PromptEntityListing result = apiInstance.getArchitectPrompts(pageNumber, pageSize, name, description, nameOrDescription, sortBy, sortOrder, includeMediaUris, includeResources, language);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getArchitectPrompts");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **name** | [**List&lt;String&gt;**](String)| Name | [optional] 
| **description** | **String**| Description | [optional] 
| **nameOrDescription** | **String**| Name or description | [optional] 
| **sortBy** | **String**| Sort by | [optional] [default to id] 
| **sortOrder** | **String**| Sort order | [optional] [default to asc] 
| **includeMediaUris** | **Boolean**| Include the media URIs for each resource | [optional] [default to true] 
| **includeResources** | **Boolean**| Include the resources for each system prompt | [optional] [default to true] 
| **language** | [**List&lt;String&gt;**](String)| Filter the resources down to the provided languages | [optional] 
{: class="table-striped"}


### Return type

[**PromptEntityListing**](PromptEntityListing)


# **getArchitectSchedule**


> [Schedule](Schedule) getArchitectSchedule(scheduleId)

Get a schedule by ID

Wraps GET /api/v2/architect/schedules/{scheduleId}  

Requires ALL permissions: 

* routing:schedule:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String scheduleId = "scheduleId_example"; // String | Schedule ID
try {
    Schedule result = apiInstance.getArchitectSchedule(scheduleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getArchitectSchedule");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **scheduleId** | **String**| Schedule ID | 
{: class="table-striped"}


### Return type

[**Schedule**](Schedule)


# **getArchitectSchedulegroup**


> [ScheduleGroup](ScheduleGroup) getArchitectSchedulegroup(scheduleGroupId)

Gets a schedule group by ID

Wraps GET /api/v2/architect/schedulegroups/{scheduleGroupId}  

Requires ALL permissions: 

* routing:scheduleGroup:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String scheduleGroupId = "scheduleGroupId_example"; // String | Schedule group ID
try {
    ScheduleGroup result = apiInstance.getArchitectSchedulegroup(scheduleGroupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getArchitectSchedulegroup");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **scheduleGroupId** | **String**| Schedule group ID | 
{: class="table-striped"}


### Return type

[**ScheduleGroup**](ScheduleGroup)


# **getArchitectSchedulegroups**


> [ScheduleGroupEntityListing](ScheduleGroupEntityListing) getArchitectSchedulegroups(pageNumber, pageSize, sortBy, sortOrder, name, scheduleIds, divisionId)

Get a list of schedule groups.

Wraps GET /api/v2/architect/schedulegroups  

Requires ALL permissions: 

* routing:scheduleGroup:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
String sortBy = "name"; // String | Sort by
String sortOrder = "ASC"; // String | Sort order
String name = "name_example"; // String | Name of the Schedule Group to filter by.
String scheduleIds = "scheduleIds_example"; // String | A comma-delimited list of Schedule IDs to filter by.
List<String> divisionId = Arrays.asList(null); // List<String> | List of divisionIds on which to filter.
try {
    ScheduleGroupEntityListing result = apiInstance.getArchitectSchedulegroups(pageNumber, pageSize, sortBy, sortOrder, name, scheduleIds, divisionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getArchitectSchedulegroups");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **sortBy** | **String**| Sort by | [optional] [default to name] 
| **sortOrder** | **String**| Sort order | [optional] [default to ASC] 
| **name** | **String**| Name of the Schedule Group to filter by. | [optional] 
| **scheduleIds** | **String**| A comma-delimited list of Schedule IDs to filter by. | [optional] 
| **divisionId** | [**List&lt;String&gt;**](String)| List of divisionIds on which to filter. | [optional] 
{: class="table-striped"}


### Return type

[**ScheduleGroupEntityListing**](ScheduleGroupEntityListing)


# **getArchitectSchedulegroupsDivisionviews**


> [ScheduleGroupDivisionViewEntityListing](ScheduleGroupDivisionViewEntityListing) getArchitectSchedulegroupsDivisionviews(pageNumber, pageSize, sortBy, sortOrder, id, name, divisionId)

Get a pageable list of basic schedule group configuration information objects filterable by query parameters.

Wraps GET /api/v2/architect/schedulegroups/divisionviews  

Requires ALL permissions: 

* routing:scheduleGroup:search

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
String sortBy = "name"; // String | Sort by
String sortOrder = "ASC"; // String | Sort order
List<String> id = Arrays.asList(null); // List<String> | ID of the schedule group to filter by.
String name = "name_example"; // String | Name of the schedule group to filter by.
List<String> divisionId = Arrays.asList(null); // List<String> | List of divisionIds on which to filter.
try {
    ScheduleGroupDivisionViewEntityListing result = apiInstance.getArchitectSchedulegroupsDivisionviews(pageNumber, pageSize, sortBy, sortOrder, id, name, divisionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getArchitectSchedulegroupsDivisionviews");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **sortBy** | **String**| Sort by | [optional] [default to name] 
| **sortOrder** | **String**| Sort order | [optional] [default to ASC] 
| **id** | [**List&lt;String&gt;**](String)| ID of the schedule group to filter by. | [optional] 
| **name** | **String**| Name of the schedule group to filter by. | [optional] 
| **divisionId** | [**List&lt;String&gt;**](String)| List of divisionIds on which to filter. | [optional] 
{: class="table-striped"}


### Return type

[**ScheduleGroupDivisionViewEntityListing**](ScheduleGroupDivisionViewEntityListing)


# **getArchitectSchedules**


> [ScheduleEntityListing](ScheduleEntityListing) getArchitectSchedules(pageNumber, pageSize, sortBy, sortOrder, name, divisionId)

Get a list of schedules.

Wraps GET /api/v2/architect/schedules  

Requires ALL permissions: 

* routing:schedule:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
String sortBy = "name"; // String | Sort by
String sortOrder = "asc"; // String | Sort order
String name = "name_example"; // String | Name of the Schedule to filter by.
List<String> divisionId = Arrays.asList(null); // List<String> | List of divisionIds on which to filter.
try {
    ScheduleEntityListing result = apiInstance.getArchitectSchedules(pageNumber, pageSize, sortBy, sortOrder, name, divisionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getArchitectSchedules");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **sortBy** | **String**| Sort by | [optional] [default to name] 
| **sortOrder** | **String**| Sort order | [optional] [default to asc] 
| **name** | **String**| Name of the Schedule to filter by. | [optional] 
| **divisionId** | [**List&lt;String&gt;**](String)| List of divisionIds on which to filter. | [optional] 
{: class="table-striped"}


### Return type

[**ScheduleEntityListing**](ScheduleEntityListing)


# **getArchitectSchedulesDivisionviews**


> [ScheduleDivisionViewEntityListing](ScheduleDivisionViewEntityListing) getArchitectSchedulesDivisionviews(pageNumber, pageSize, sortBy, sortOrder, id, name, divisionId)

Get a pageable list of basic schedule configuration information objects filterable by query parameters.

Wraps GET /api/v2/architect/schedules/divisionviews  

Requires ALL permissions: 

* routing:schedule:search

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
String sortBy = "name"; // String | Sort by
String sortOrder = "ASC"; // String | Sort order
List<String> id = Arrays.asList(null); // List<String> | ID of the schedule group to filter by.
String name = "name_example"; // String | Name of the schedule group to filter by.
List<String> divisionId = Arrays.asList(null); // List<String> | List of divisionIds on which to filter.
try {
    ScheduleDivisionViewEntityListing result = apiInstance.getArchitectSchedulesDivisionviews(pageNumber, pageSize, sortBy, sortOrder, id, name, divisionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getArchitectSchedulesDivisionviews");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **sortBy** | **String**| Sort by | [optional] [default to name] 
| **sortOrder** | **String**| Sort order | [optional] [default to ASC] 
| **id** | [**List&lt;String&gt;**](String)| ID of the schedule group to filter by. | [optional] 
| **name** | **String**| Name of the schedule group to filter by. | [optional] 
| **divisionId** | [**List&lt;String&gt;**](String)| List of divisionIds on which to filter. | [optional] 
{: class="table-striped"}


### Return type

[**ScheduleDivisionViewEntityListing**](ScheduleDivisionViewEntityListing)


# **getArchitectSystemprompt**


> [SystemPrompt](SystemPrompt) getArchitectSystemprompt(promptId, includeMediaUris, includeResources, language)

Get a system prompt

Wraps GET /api/v2/architect/systemprompts/{promptId}  

Requires ALL permissions: 

* architect:systemPrompt:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String promptId = "promptId_example"; // String | promptId
Boolean includeMediaUris = true; // Boolean | Include the media URIs for each resource
Boolean includeResources = true; // Boolean | Include the resources for each system prompt
List<String> language = Arrays.asList(null); // List<String> | Filter the resources down to the provided languages
try {
    SystemPrompt result = apiInstance.getArchitectSystemprompt(promptId, includeMediaUris, includeResources, language);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getArchitectSystemprompt");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **promptId** | **String**| promptId | 
| **includeMediaUris** | **Boolean**| Include the media URIs for each resource | [optional] [default to true] 
| **includeResources** | **Boolean**| Include the resources for each system prompt | [optional] [default to true] 
| **language** | [**List&lt;String&gt;**](String)| Filter the resources down to the provided languages | [optional] 
{: class="table-striped"}


### Return type

[**SystemPrompt**](SystemPrompt)


# **getArchitectSystempromptHistoryHistoryId**


> [HistoryListing](HistoryListing) getArchitectSystempromptHistoryHistoryId(promptId, historyId, pageNumber, pageSize, sortOrder, sortBy, action)

Get generated prompt history

Wraps GET /api/v2/architect/systemprompts/{promptId}/history/{historyId}  

Requires ALL permissions: 

* architect:systemPrompt:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String promptId = "promptId_example"; // String | promptId
String historyId = "historyId_example"; // String | History request ID
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
String sortOrder = "desc"; // String | Sort order
String sortBy = "timestamp"; // String | Sort by
List<String> action = Arrays.asList(null); // List<String> | Flow actions to include (omit to include all)
try {
    HistoryListing result = apiInstance.getArchitectSystempromptHistoryHistoryId(promptId, historyId, pageNumber, pageSize, sortOrder, sortBy, action);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getArchitectSystempromptHistoryHistoryId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **promptId** | **String**| promptId | 
| **historyId** | **String**| History request ID | 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **sortOrder** | **String**| Sort order | [optional] [default to desc] 
| **sortBy** | **String**| Sort by | [optional] [default to timestamp]<br />**Values**: action, timestamp, user 
| **action** | [**List&lt;String&gt;**](String)| Flow actions to include (omit to include all) | [optional]<br />**Values**: checkin, checkout, create, deactivate, debug, delete, publish, revert, save 
{: class="table-striped"}


### Return type

[**HistoryListing**](HistoryListing)


# **getArchitectSystempromptResource**


> [SystemPromptAsset](SystemPromptAsset) getArchitectSystempromptResource(promptId, languageCode)

Get a system prompt resource.

Wraps GET /api/v2/architect/systemprompts/{promptId}/resources/{languageCode}  

Requires ALL permissions: 

* architect:systemPrompt:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String promptId = "promptId_example"; // String | Prompt ID
String languageCode = "languageCode_example"; // String | Language
try {
    SystemPromptAsset result = apiInstance.getArchitectSystempromptResource(promptId, languageCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getArchitectSystempromptResource");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **promptId** | **String**| Prompt ID | 
| **languageCode** | **String**| Language | 
{: class="table-striped"}


### Return type

[**SystemPromptAsset**](SystemPromptAsset)


# **getArchitectSystempromptResources**


> [SystemPromptAssetEntityListing](SystemPromptAssetEntityListing) getArchitectSystempromptResources(promptId, pageNumber, pageSize, sortBy, sortOrder)

Get system prompt resources.

Wraps GET /api/v2/architect/systemprompts/{promptId}/resources  

Requires ALL permissions: 

* architect:systemPrompt:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String promptId = "promptId_example"; // String | Prompt ID
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
String sortBy = "id"; // String | Sort by
String sortOrder = "asc"; // String | Sort order
try {
    SystemPromptAssetEntityListing result = apiInstance.getArchitectSystempromptResources(promptId, pageNumber, pageSize, sortBy, sortOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getArchitectSystempromptResources");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **promptId** | **String**| Prompt ID | 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **sortBy** | **String**| Sort by | [optional] [default to id] 
| **sortOrder** | **String**| Sort order | [optional] [default to asc] 
{: class="table-striped"}


### Return type

[**SystemPromptAssetEntityListing**](SystemPromptAssetEntityListing)


# **getArchitectSystemprompts**


> [SystemPromptEntityListing](SystemPromptEntityListing) getArchitectSystemprompts(pageNumber, pageSize, sortBy, sortOrder, name, description, nameOrDescription, includeMediaUris, includeResources, language)

Get System Prompts

Wraps GET /api/v2/architect/systemprompts  

Requires ALL permissions: 

* architect:systemPrompt:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
String sortBy = "id"; // String | Sort by
String sortOrder = "asc"; // String | Sort order
String name = "name_example"; // String | Name
String description = "description_example"; // String | Description
String nameOrDescription = "nameOrDescription_example"; // String | Name or description
Boolean includeMediaUris = true; // Boolean | Include the media URIs for each resource
Boolean includeResources = true; // Boolean | Include the resources for each system prompt
List<String> language = Arrays.asList(null); // List<String> | Filter the resources down to the provided languages
try {
    SystemPromptEntityListing result = apiInstance.getArchitectSystemprompts(pageNumber, pageSize, sortBy, sortOrder, name, description, nameOrDescription, includeMediaUris, includeResources, language);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getArchitectSystemprompts");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **sortBy** | **String**| Sort by | [optional] [default to id] 
| **sortOrder** | **String**| Sort order | [optional] [default to asc] 
| **name** | **String**| Name | [optional] 
| **description** | **String**| Description | [optional] 
| **nameOrDescription** | **String**| Name or description | [optional] 
| **includeMediaUris** | **Boolean**| Include the media URIs for each resource | [optional] [default to true] 
| **includeResources** | **Boolean**| Include the resources for each system prompt | [optional] [default to true] 
| **language** | [**List&lt;String&gt;**](String)| Filter the resources down to the provided languages | [optional] 
{: class="table-striped"}


### Return type

[**SystemPromptEntityListing**](SystemPromptEntityListing)


# **getFlow**


> [Flow](Flow) getFlow(flowId, deleted)

Get flow

Wraps GET /api/v2/flows/{flowId}  

Requires ANY permissions: 

* architect:flow:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String flowId = "flowId_example"; // String | Flow ID
Boolean deleted = false; // Boolean | Deleted flows
try {
    Flow result = apiInstance.getFlow(flowId, deleted);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getFlow");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **flowId** | **String**| Flow ID | 
| **deleted** | **Boolean**| Deleted flows | [optional] [default to false] 
{: class="table-striped"}


### Return type

[**Flow**](Flow)


# **getFlowHistoryHistoryId**


> [HistoryListing](HistoryListing) getFlowHistoryHistoryId(flowId, historyId, pageNumber, pageSize, sortOrder, sortBy, action)

Get generated flow history

Wraps GET /api/v2/flows/{flowId}/history/{historyId}  

Requires ANY permissions: 

* architect:flow:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String flowId = "flowId_example"; // String | Flow ID
String historyId = "historyId_example"; // String | History request ID
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
String sortOrder = "desc"; // String | Sort order
String sortBy = "timestamp"; // String | Sort by
List<String> action = Arrays.asList(null); // List<String> | Flow actions to include (omit to include all)
try {
    HistoryListing result = apiInstance.getFlowHistoryHistoryId(flowId, historyId, pageNumber, pageSize, sortOrder, sortBy, action);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getFlowHistoryHistoryId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **flowId** | **String**| Flow ID | 
| **historyId** | **String**| History request ID | 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **sortOrder** | **String**| Sort order | [optional] [default to desc] 
| **sortBy** | **String**| Sort by | [optional] [default to timestamp]<br />**Values**: action, timestamp, user 
| **action** | [**List&lt;String&gt;**](String)| Flow actions to include (omit to include all) | [optional]<br />**Values**: checkin, checkout, create, deactivate, debug, delete, publish, revert, save 
{: class="table-striped"}


### Return type

[**HistoryListing**](HistoryListing)


# **getFlowInstancesSettingsLoglevels**


> [FlowSettingsResponse](FlowSettingsResponse) getFlowInstancesSettingsLoglevels(flowId, expand)

Retrieves the log level for a flow by flow id.

Retrieves the log level for a flow by flow id.

Wraps GET /api/v2/flows/{flowId}/instances/settings/loglevels  

Requires ALL permissions: 

* architect:flowLogLevel:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String flowId = "flowId_example"; // String | The flow id to get the loglevel for
List<String> expand = Arrays.asList(null); // List<String> | Expand instructions for the result
try {
    FlowSettingsResponse result = apiInstance.getFlowInstancesSettingsLoglevels(flowId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getFlowInstancesSettingsLoglevels");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **flowId** | **String**| The flow id to get the loglevel for | 
| **expand** | [**List&lt;String&gt;**](String)| Expand instructions for the result | [optional]<br />**Values**: name, type, logLevelCharacteristics.characteristics 
{: class="table-striped"}


### Return type

[**FlowSettingsResponse**](FlowSettingsResponse)


# **getFlowLatestconfiguration**


> Object getFlowLatestconfiguration(flowId, deleted)

Get the latest configuration for flow

Wraps GET /api/v2/flows/{flowId}/latestconfiguration  

Requires ANY permissions: 

* architect:flow:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String flowId = "flowId_example"; // String | Flow ID
Boolean deleted = false; // Boolean | Deleted flows
try {
    Object result = apiInstance.getFlowLatestconfiguration(flowId, deleted);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getFlowLatestconfiguration");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **flowId** | **String**| Flow ID | 
| **deleted** | **Boolean**| Deleted flows | [optional] [default to false] 
{: class="table-striped"}


### Return type

**Object**


# **getFlowVersion**


> [FlowVersion](FlowVersion) getFlowVersion(flowId, versionId, deleted)

Get flow version

Wraps GET /api/v2/flows/{flowId}/versions/{versionId}  

Requires ANY permissions: 

* architect:flow:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String flowId = "flowId_example"; // String | Flow ID
String versionId = "versionId_example"; // String | Version ID
String deleted = "deleted_example"; // String | Deleted flows
try {
    FlowVersion result = apiInstance.getFlowVersion(flowId, versionId, deleted);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getFlowVersion");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **flowId** | **String**| Flow ID | 
| **versionId** | **String**| Version ID | 
| **deleted** | **String**| Deleted flows | [optional] 
{: class="table-striped"}


### Return type

[**FlowVersion**](FlowVersion)


# **getFlowVersionConfiguration**


> Object getFlowVersionConfiguration(flowId, versionId, deleted)

Get flow version configuration

Wraps GET /api/v2/flows/{flowId}/versions/{versionId}/configuration  

Requires ANY permissions: 

* architect:flow:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String flowId = "flowId_example"; // String | Flow ID
String versionId = "versionId_example"; // String | Version ID
String deleted = "deleted_example"; // String | Deleted flows
try {
    Object result = apiInstance.getFlowVersionConfiguration(flowId, versionId, deleted);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getFlowVersionConfiguration");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **flowId** | **String**| Flow ID | 
| **versionId** | **String**| Version ID | 
| **deleted** | **String**| Deleted flows | [optional] 
{: class="table-striped"}


### Return type

**Object**


# **getFlowVersionHealth**


> [FlowHealth](FlowHealth) getFlowVersionHealth(flowId, versionId, language)

Get overall health scores for all intents present in the NLU domain version associated with the bot flow version.

Wraps GET /api/v2/flows/{flowId}/versions/{versionId}/health  

Requires ANY permissions: 

* architect:flow:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String flowId = "flowId_example"; // String | Flow ID.
String versionId = "versionId_example"; // String | Version ID.
String language = "language_example"; // String | Language to filter for
try {
    FlowHealth result = apiInstance.getFlowVersionHealth(flowId, versionId, language);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getFlowVersionHealth");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **flowId** | **String**| Flow ID. | 
| **versionId** | **String**| Version ID. | 
| **language** | **String**| Language to filter for | [optional]<br />**Values**: en-us, en-gb, en-au, en-za, en-nz, en-ie, fr-ca, fr-fr, es-us, es-es, es-mx, de-de, it-it, pt-br, pt-pt, nl-nl 
{: class="table-striped"}


### Return type

[**FlowHealth**](FlowHealth)


# **getFlowVersionIntentHealth**


> [FlowHealthIntent](FlowHealthIntent) getFlowVersionIntentHealth(flowId, versionId, intentId, language)

Get health scores and other health metrics for a specific intent. This includes the health metrics for each utterance in an intent.

Wraps GET /api/v2/flows/{flowId}/versions/{versionId}/intents/{intentId}/health  

Requires ANY permissions: 

* architect:flow:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String flowId = "flowId_example"; // String | Flow ID.
String versionId = "versionId_example"; // String | Version ID.
String intentId = "intentId_example"; // String | Intent ID.
String language = "language_example"; // String | Language to filter for
try {
    FlowHealthIntent result = apiInstance.getFlowVersionIntentHealth(flowId, versionId, intentId, language);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getFlowVersionIntentHealth");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **flowId** | **String**| Flow ID. | 
| **versionId** | **String**| Version ID. | 
| **intentId** | **String**| Intent ID. | 
| **language** | **String**| Language to filter for |<br />**Values**: en-us, en-gb, en-au, en-za, en-nz, en-ie, fr-ca, fr-fr, es-us, es-es, es-mx, de-de, it-it, pt-br, pt-pt, nl-nl 
{: class="table-striped"}


### Return type

[**FlowHealthIntent**](FlowHealthIntent)


# **getFlowVersionIntentUtteranceHealth**


> [FlowHealthUtterance](FlowHealthUtterance) getFlowVersionIntentUtteranceHealth(flowId, versionId, intentId, utteranceId, language)

Get health metrics associated with a specific utterance of an intent.

Wraps GET /api/v2/flows/{flowId}/versions/{versionId}/intents/{intentId}/utterances/{utteranceId}/health  

Requires ANY permissions: 

* architect:flow:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String flowId = "flowId_example"; // String | Flow ID.
String versionId = "versionId_example"; // String | Version ID.
String intentId = "intentId_example"; // String | Intent ID.
String utteranceId = "utteranceId_example"; // String | Utterance ID.
String language = "language_example"; // String | Language to filter for
try {
    FlowHealthUtterance result = apiInstance.getFlowVersionIntentUtteranceHealth(flowId, versionId, intentId, utteranceId, language);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getFlowVersionIntentUtteranceHealth");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **flowId** | **String**| Flow ID. | 
| **versionId** | **String**| Version ID. | 
| **intentId** | **String**| Intent ID. | 
| **utteranceId** | **String**| Utterance ID. | 
| **language** | **String**| Language to filter for |<br />**Values**: en-us, en-gb, en-au, en-za, en-nz, en-ie, fr-ca, fr-fr, es-us, es-es, es-mx, de-de, it-it, pt-br, pt-pt, nl-nl 
{: class="table-striped"}


### Return type

[**FlowHealthUtterance**](FlowHealthUtterance)


# **getFlowVersions**


> [FlowVersionEntityListing](FlowVersionEntityListing) getFlowVersions(flowId, pageNumber, pageSize, deleted)

Get flow version list

Wraps GET /api/v2/flows/{flowId}/versions  

Requires ANY permissions: 

* architect:flow:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String flowId = "flowId_example"; // String | Flow ID
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
Boolean deleted = true; // Boolean | Include Deleted flows
try {
    FlowVersionEntityListing result = apiInstance.getFlowVersions(flowId, pageNumber, pageSize, deleted);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getFlowVersions");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **flowId** | **String**| Flow ID | 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **deleted** | **Boolean**| Include Deleted flows | [optional] 
{: class="table-striped"}


### Return type

[**FlowVersionEntityListing**](FlowVersionEntityListing)


# **getFlows**


> [FlowEntityListing](FlowEntityListing) getFlows(type, pageNumber, pageSize, sortBy, sortOrder, id, name, description, nameOrDescription, publishVersionId, editableBy, lockedBy, lockedByClientId, secure, deleted, includeSchemas, virtualAgentEnabled, publishedAfter, publishedBefore, divisionId)

Get a pageable list of flows, filtered by query parameters

If one or more IDs are specified, the search will fetch flows that match the given ID(s) and not use any additional supplied query parameters in the search.

Wraps GET /api/v2/flows  

Requires ANY permissions: 

* architect:flow:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
List<String> type = Arrays.asList(null); // List<String> | Type
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
String sortBy = "id"; // String | Sort by
String sortOrder = "asc"; // String | Sort order
List<String> id = Arrays.asList(null); // List<String> | ID
String name = "name_example"; // String | Name
String description = "description_example"; // String | Description
String nameOrDescription = "nameOrDescription_example"; // String | Name or description
String publishVersionId = "publishVersionId_example"; // String | Publish version ID
String editableBy = "editableBy_example"; // String | Editable by
String lockedBy = "lockedBy_example"; // String | Locked by
String lockedByClientId = "lockedByClientId_example"; // String | Locked by client ID
String secure = "secure_example"; // String | Secure
Boolean deleted = false; // Boolean | Include deleted
Boolean includeSchemas = false; // Boolean | Include variable schemas
Boolean virtualAgentEnabled = true; // Boolean | Include/exclude virtual agent flows
String publishedAfter = 2015-01-01T12:00:00-0600, 2015-01-01T18:00:00Z, 2015-01-01T12:00:00.000-0600, 2015-01-01T18:00:00.000Z, 2015-01-01; // String | Published after
String publishedBefore = 2015-01-01T12:00:00-0600, 2015-01-01T18:00:00Z, 2015-01-01T12:00:00.000-0600, 2015-01-01T18:00:00.000Z, 2015-01-01; // String | Published before
List<String> divisionId = Arrays.asList(null); // List<String> | division ID(s)
try {
    FlowEntityListing result = apiInstance.getFlows(type, pageNumber, pageSize, sortBy, sortOrder, id, name, description, nameOrDescription, publishVersionId, editableBy, lockedBy, lockedByClientId, secure, deleted, includeSchemas, virtualAgentEnabled, publishedAfter, publishedBefore, divisionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getFlows");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **type** | [**List&lt;String&gt;**](String)| Type | [optional]<br />**Values**: bot, commonmodule, digitalbot, inboundcall, inboundchat, inboundemail, inboundshortmessage, outboundcall, inqueuecall, inqueueemail, inqueueshortmessage, speech, securecall, surveyinvite, voice, voicemail, voicesurvey, workflow, workitem 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **sortBy** | **String**| Sort by | [optional] [default to id] 
| **sortOrder** | **String**| Sort order | [optional] [default to asc] 
| **id** | [**List&lt;String&gt;**](String)| ID | [optional] 
| **name** | **String**| Name | [optional] 
| **description** | **String**| Description | [optional] 
| **nameOrDescription** | **String**| Name or description | [optional] 
| **publishVersionId** | **String**| Publish version ID | [optional] 
| **editableBy** | **String**| Editable by | [optional] 
| **lockedBy** | **String**| Locked by | [optional] 
| **lockedByClientId** | **String**| Locked by client ID | [optional] 
| **secure** | **String**| Secure | [optional]<br />**Values**: any, checkedin, published 
| **deleted** | **Boolean**| Include deleted | [optional] [default to false] 
| **includeSchemas** | **Boolean**| Include variable schemas | [optional] [default to false] 
| **virtualAgentEnabled** | **Boolean**| Include/exclude virtual agent flows | [optional] 
| **publishedAfter** | **String**| Published after | [optional] [default to null] 
| **publishedBefore** | **String**| Published before | [optional] [default to null] 
| **divisionId** | [**List&lt;String&gt;**](String)| division ID(s) | [optional] 
{: class="table-striped"}


### Return type

[**FlowEntityListing**](FlowEntityListing)


# **getFlowsDatatable**


> [DataTable](DataTable) getFlowsDatatable(datatableId, expand)

Returns a specific datatable by id

Given a datatableId returns the datatable object and schema associated with it.

Wraps GET /api/v2/flows/datatables/{datatableId}  

Requires ANY permissions: 

* architect:datatable:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String datatableId = "datatableId_example"; // String | id of datatable
String expand = "expand_example"; // String | Expand instructions for the result
try {
    DataTable result = apiInstance.getFlowsDatatable(datatableId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getFlowsDatatable");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datatableId** | **String**| id of datatable | 
| **expand** | **String**| Expand instructions for the result | [optional]<br />**Values**: schema 
{: class="table-striped"}


### Return type

[**DataTable**](DataTable)


# **getFlowsDatatableExportJob**


> [DataTableExportJob](DataTableExportJob) getFlowsDatatableExportJob(datatableId, exportJobId)

Returns the state information about an export job

Returns the state information about an export job.

Wraps GET /api/v2/flows/datatables/{datatableId}/export/jobs/{exportJobId}  

Requires ANY permissions: 

* architect:datatable:view
* architect:datatableRow:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String datatableId = "datatableId_example"; // String | id of datatable
String exportJobId = "exportJobId_example"; // String | id of export job
try {
    DataTableExportJob result = apiInstance.getFlowsDatatableExportJob(datatableId, exportJobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getFlowsDatatableExportJob");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datatableId** | **String**| id of datatable | 
| **exportJobId** | **String**| id of export job | 
{: class="table-striped"}


### Return type

[**DataTableExportJob**](DataTableExportJob)


# **getFlowsDatatableImportJob**


> [DataTableImportJob](DataTableImportJob) getFlowsDatatableImportJob(datatableId, importJobId)

Returns the state information about an import job

Returns the state information about an import job.

Wraps GET /api/v2/flows/datatables/{datatableId}/import/jobs/{importJobId}  

Requires ANY permissions: 

* architect:datatable:view
* architect:datatableRow:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String datatableId = "datatableId_example"; // String | id of datatable
String importJobId = "importJobId_example"; // String | id of import job
try {
    DataTableImportJob result = apiInstance.getFlowsDatatableImportJob(datatableId, importJobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getFlowsDatatableImportJob");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datatableId** | **String**| id of datatable | 
| **importJobId** | **String**| id of import job | 
{: class="table-striped"}


### Return type

[**DataTableImportJob**](DataTableImportJob)


# **getFlowsDatatableImportJobs**


> [DataTableImportEntityListing](DataTableImportEntityListing) getFlowsDatatableImportJobs(datatableId, pageNumber, pageSize)

Get all recent import jobs

Get all recent import jobs

Wraps GET /api/v2/flows/datatables/{datatableId}/import/jobs  

Requires ANY permissions: 

* architect:datatable:edit
* architect:datatableRow:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String datatableId = "datatableId_example"; // String | id of datatable
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
try {
    DataTableImportEntityListing result = apiInstance.getFlowsDatatableImportJobs(datatableId, pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getFlowsDatatableImportJobs");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datatableId** | **String**| id of datatable | 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
{: class="table-striped"}


### Return type

[**DataTableImportEntityListing**](DataTableImportEntityListing)


# **getFlowsDatatableRow**


> Map&lt;String, Object&gt; getFlowsDatatableRow(datatableId, rowId, showbrief)

Returns a specific row for the datatable

Given a datatableId and a rowId (the value of the key field) this will return the full row contents for that rowId.

Wraps GET /api/v2/flows/datatables/{datatableId}/rows/{rowId}  

Requires ANY permissions: 

* architect:datatable:view
* architect:datatableRow:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String datatableId = "datatableId_example"; // String | id of datatable
String rowId = "rowId_example"; // String | The key for the row
Boolean showbrief = true; // Boolean | if true returns just the key field for the row
try {
    Map<String, Object> result = apiInstance.getFlowsDatatableRow(datatableId, rowId, showbrief);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getFlowsDatatableRow");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datatableId** | **String**| id of datatable | 
| **rowId** | **String**| The key for the row | 
| **showbrief** | **Boolean**| if true returns just the key field for the row | [optional] [default to true] 
{: class="table-striped"}


### Return type

**Map&lt;String, Object&gt;**


# **getFlowsDatatableRows**


> [DataTableRowEntityListing](DataTableRowEntityListing) getFlowsDatatableRows(datatableId, pageNumber, pageSize, showbrief, sortOrder)

Returns the rows for the datatable with the given id

Returns all of the rows for the datatable with the given datatableId.  By default this will just be a truncated list returning the key for each row. Set showBrief to false to return all of the row contents.

Wraps GET /api/v2/flows/datatables/{datatableId}/rows  

Requires ANY permissions: 

* architect:datatable:view
* architect:datatableRow:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String datatableId = "datatableId_example"; // String | id of datatable
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
Boolean showbrief = true; // Boolean | If true returns just the key value of the row
String sortOrder = "ascending"; // String | Sort order
try {
    DataTableRowEntityListing result = apiInstance.getFlowsDatatableRows(datatableId, pageNumber, pageSize, showbrief, sortOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getFlowsDatatableRows");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datatableId** | **String**| id of datatable | 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **showbrief** | **Boolean**| If true returns just the key value of the row | [optional] [default to true] 
| **sortOrder** | **String**| Sort order | [optional] [default to ascending]<br />**Values**: ascending, descending 
{: class="table-striped"}


### Return type

[**DataTableRowEntityListing**](DataTableRowEntityListing)


# **getFlowsDatatables**


> [DataTablesDomainEntityListing](DataTablesDomainEntityListing) getFlowsDatatables(expand, pageNumber, pageSize, sortBy, sortOrder, divisionId, name)

Retrieve a list of datatables for the org

Returns a metadata list of the datatables associated with this org, including datatableId, name and description.

Wraps GET /api/v2/flows/datatables  

Requires ANY permissions: 

* architect:datatable:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String expand = "expand_example"; // String | Expand instructions for the result
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
String sortBy = "id"; // String | Sort by
String sortOrder = "ascending"; // String | Sort order
List<String> divisionId = Arrays.asList(null); // List<String> | division ID(s)
String name = exactMatch, beginsWith*, *endsWith, *contains*; // String | Filter by Name. The wildcard character * is supported within the filter. Matches are case-insensitive.
try {
    DataTablesDomainEntityListing result = apiInstance.getFlowsDatatables(expand, pageNumber, pageSize, sortBy, sortOrder, divisionId, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getFlowsDatatables");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **expand** | **String**| Expand instructions for the result | [optional]<br />**Values**: schema 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **sortBy** | **String**| Sort by | [optional] [default to id]<br />**Values**: id, name 
| **sortOrder** | **String**| Sort order | [optional] [default to ascending] 
| **divisionId** | [**List&lt;String&gt;**](String)| division ID(s) | [optional] 
| **name** | **String**| Filter by Name. The wildcard character * is supported within the filter. Matches are case-insensitive. | [optional] [default to null] 
{: class="table-striped"}


### Return type

[**DataTablesDomainEntityListing**](DataTablesDomainEntityListing)


# **getFlowsDatatablesDivisionview**


> [DataTable](DataTable) getFlowsDatatablesDivisionview(datatableId, expand)

Returns a specific datatable by id

Given a datatableId returns the datatable object and schema associated with it.

Wraps GET /api/v2/flows/datatables/divisionviews/{datatableId}  

Requires ALL permissions: 

* architect:datatable:search

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String datatableId = "datatableId_example"; // String | id of datatable
String expand = "expand_example"; // String | Expand instructions for the result
try {
    DataTable result = apiInstance.getFlowsDatatablesDivisionview(datatableId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getFlowsDatatablesDivisionview");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datatableId** | **String**| id of datatable | 
| **expand** | **String**| Expand instructions for the result | [optional]<br />**Values**: schema 
{: class="table-striped"}


### Return type

[**DataTable**](DataTable)


# **getFlowsDatatablesDivisionviews**


> [DataTablesDomainEntityListing](DataTablesDomainEntityListing) getFlowsDatatablesDivisionviews(expand, pageNumber, pageSize, sortBy, sortOrder, divisionId, name)

Retrieve a list of datatables for the org

Returns a metadata list of the datatables associated with this org, including datatableId, name and description.

Wraps GET /api/v2/flows/datatables/divisionviews  

Requires ALL permissions: 

* architect:datatable:search

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String expand = "expand_example"; // String | Expand instructions for the result
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
String sortBy = "id"; // String | Sort by
String sortOrder = "ascending"; // String | Sort order
List<String> divisionId = Arrays.asList(null); // List<String> | division ID(s)
String name = exactMatch, beginsWith*, *endsWith, *contains*; // String | Filter by Name. The wildcard character * is supported within the filter. Matches are case-insensitive.
try {
    DataTablesDomainEntityListing result = apiInstance.getFlowsDatatablesDivisionviews(expand, pageNumber, pageSize, sortBy, sortOrder, divisionId, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getFlowsDatatablesDivisionviews");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **expand** | **String**| Expand instructions for the result | [optional]<br />**Values**: schema 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **sortBy** | **String**| Sort by | [optional] [default to id]<br />**Values**: id, name 
| **sortOrder** | **String**| Sort order | [optional] [default to ascending] 
| **divisionId** | [**List&lt;String&gt;**](String)| division ID(s) | [optional] 
| **name** | **String**| Filter by Name. The wildcard character * is supported within the filter. Matches are case-insensitive. | [optional] [default to null] 
{: class="table-striped"}


### Return type

[**DataTablesDomainEntityListing**](DataTablesDomainEntityListing)


# **getFlowsDivisionviews**


> [FlowDivisionViewEntityListing](FlowDivisionViewEntityListing) getFlowsDivisionviews(type, pageNumber, pageSize, sortBy, sortOrder, id, name, publishVersionId, publishedAfter, publishedBefore, divisionId, includeSchemas)

Get a pageable list of basic flow information objects filterable by query parameters.

This returns a simplified version of /flow consisting of name and type. If one or more IDs are specified, the search will fetch flows that match the given ID(s) and not use any additional supplied query parameters in the search.

Wraps GET /api/v2/flows/divisionviews  

Requires ALL permissions: 

* architect:flow:search

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
List<String> type = Arrays.asList(null); // List<String> | Type
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
String sortBy = "id"; // String | Sort by
String sortOrder = "asc"; // String | Sort order
List<String> id = Arrays.asList(null); // List<String> | ID
String name = "name_example"; // String | Name
String publishVersionId = "publishVersionId_example"; // String | Publish version ID
String publishedAfter = 2015-01-01T12:00:00-0600, 2015-01-01T18:00:00Z, 2015-01-01T12:00:00.000-0600, 2015-01-01T18:00:00.000Z, 2015-01-01; // String | Published after
String publishedBefore = 2015-01-01T12:00:00-0600, 2015-01-01T18:00:00Z, 2015-01-01T12:00:00.000-0600, 2015-01-01T18:00:00.000Z, 2015-01-01; // String | Published before
List<String> divisionId = Arrays.asList(null); // List<String> | division ID(s)
Boolean includeSchemas = false; // Boolean | Include variable schemas
try {
    FlowDivisionViewEntityListing result = apiInstance.getFlowsDivisionviews(type, pageNumber, pageSize, sortBy, sortOrder, id, name, publishVersionId, publishedAfter, publishedBefore, divisionId, includeSchemas);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getFlowsDivisionviews");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **type** | [**List&lt;String&gt;**](String)| Type | [optional]<br />**Values**: bot, commonmodule, digitalbot, inboundcall, inboundchat, inboundemail, inboundshortmessage, outboundcall, inqueuecall, inqueueemail, inqueueshortmessage, speech, securecall, surveyinvite, voice, voicemail, voicesurvey, workflow, workitem 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **sortBy** | **String**| Sort by | [optional] [default to id] 
| **sortOrder** | **String**| Sort order | [optional] [default to asc] 
| **id** | [**List&lt;String&gt;**](String)| ID | [optional] 
| **name** | **String**| Name | [optional] 
| **publishVersionId** | **String**| Publish version ID | [optional] 
| **publishedAfter** | **String**| Published after | [optional] [default to null] 
| **publishedBefore** | **String**| Published before | [optional] [default to null] 
| **divisionId** | [**List&lt;String&gt;**](String)| division ID(s) | [optional] 
| **includeSchemas** | **Boolean**| Include variable schemas | [optional] [default to false] 
{: class="table-striped"}


### Return type

[**FlowDivisionViewEntityListing**](FlowDivisionViewEntityListing)


# **getFlowsExecution**


> [FlowRuntimeExecution](FlowRuntimeExecution) getFlowsExecution(flowExecutionId)

Get a flow execution's details. Flow execution details are available for several days after the flow is started.

Wraps GET /api/v2/flows/executions/{flowExecutionId}  

Requires ANY permissions: 

* architect:flowExecution:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String flowExecutionId = "flowExecutionId_example"; // String | flow execution ID
try {
    FlowRuntimeExecution result = apiInstance.getFlowsExecution(flowExecutionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getFlowsExecution");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **flowExecutionId** | **String**| flow execution ID | 
{: class="table-striped"}


### Return type

[**FlowRuntimeExecution**](FlowRuntimeExecution)


# **getFlowsExportJob**


> [ArchitectExportJobStateResponse](ArchitectExportJobStateResponse) getFlowsExportJob(jobId, expand)

Fetch Architect Export Job Status

Wraps GET /api/v2/flows/export/jobs/{jobId}  

Requires ALL permissions: 

* architect:jobExport:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String jobId = "jobId_example"; // String | Job ID
List<String> expand = Arrays.asList(null); // List<String> | Which fields, if any, to expand.
try {
    ArchitectExportJobStateResponse result = apiInstance.getFlowsExportJob(jobId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getFlowsExportJob");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **jobId** | **String**| Job ID | 
| **expand** | [**List&lt;String&gt;**](String)| Which fields, if any, to expand. | [optional]<br />**Values**: messages 
{: class="table-striped"}


### Return type

[**ArchitectExportJobStateResponse**](ArchitectExportJobStateResponse)


# **getFlowsInstance**


> [GetFlowExecutionDataJobResult](GetFlowExecutionDataJobResult) getFlowsInstance(instanceId, expand)

Start a process (job) to prepare a download of a singular flow execution data instance by Id

Returns a JobResult object that contains an ID that can be used to check status and/or download links when the process (job) is complete.

Wraps GET /api/v2/flows/instances/{instanceId}  

Requires ANY permissions: 

* architect:flowInstance:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String instanceId = "instanceId_example"; // String | Instance ID
String expand = "expand_example"; // String | Expand various details.
try {
    GetFlowExecutionDataJobResult result = apiInstance.getFlowsInstance(instanceId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getFlowsInstance");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **instanceId** | **String**| Instance ID | 
| **expand** | **String**| Expand various details. | [optional]<br />**Values**: bots, dataActions 
{: class="table-striped"}


### Return type

[**GetFlowExecutionDataJobResult**](GetFlowExecutionDataJobResult)


# **getFlowsInstancesJob**


> [GetFlowExecutionDataJobResult](GetFlowExecutionDataJobResult) getFlowsInstancesJob(jobId)

Get the status and/or results of an asynchronous flow execution data retrieval job

Wraps GET /api/v2/flows/instances/jobs/{jobId}  

Requires ANY permissions: 

* architect:flowInstance:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String jobId = "jobId_example"; // String | The asynchronous job ID
try {
    GetFlowExecutionDataJobResult result = apiInstance.getFlowsInstancesJob(jobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getFlowsInstancesJob");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **jobId** | **String**| The asynchronous job ID | 
{: class="table-striped"}


### Return type

[**GetFlowExecutionDataJobResult**](GetFlowExecutionDataJobResult)


# **getFlowsInstancesQuerycapabilities**


> [FlowsQueryCriteriaResponse](FlowsQueryCriteriaResponse) getFlowsInstancesQuerycapabilities(expand)

Retrieve a list of capabilities that the org can use to query for execution data

Returns the queryable parameters that can be used to build a query for execution data.

Wraps GET /api/v2/flows/instances/querycapabilities  

Requires ANY permissions: 

* architect:flowInstance:search

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String expand = "expand_example"; // String | Expand various query types.
try {
    FlowsQueryCriteriaResponse result = apiInstance.getFlowsInstancesQuerycapabilities(expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getFlowsInstancesQuerycapabilities");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **expand** | **String**| Expand various query types. | [optional]<br />**Values**: flow, action 
{: class="table-striped"}


### Return type

[**FlowsQueryCriteriaResponse**](FlowsQueryCriteriaResponse)


# **getFlowsInstancesSettingsExecutiondata**


> [ExecutionDataFlowSettingsResponse](ExecutionDataFlowSettingsResponse) getFlowsInstancesSettingsExecutiondata()

Get the execution history enabled setting.

Get the execution history enabled setting.

Wraps GET /api/v2/flows/instances/settings/executiondata  

Requires ANY permissions: 

* architect:flowinstanceexecutiondata:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
try {
    ExecutionDataFlowSettingsResponse result = apiInstance.getFlowsInstancesSettingsExecutiondata();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getFlowsInstancesSettingsExecutiondata");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**ExecutionDataFlowSettingsResponse**](ExecutionDataFlowSettingsResponse)


# **getFlowsInstancesSettingsLoglevels**


> [FlowSettingsResponseEntityListing](FlowSettingsResponseEntityListing) getFlowsInstancesSettingsLoglevels(expand, pageNumber, pageSize)

Retrieve a list of LogLevels for the organization.

Returns a paged set of LogLevels per flow id

Wraps GET /api/v2/flows/instances/settings/loglevels  

Requires ALL permissions: 

* architect:flowLogLevel:view
* architect:flow:search

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
List<String> expand = Arrays.asList(null); // List<String> | Expand instructions for the result
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Number of entities to return. Maximum of 200.
try {
    FlowSettingsResponseEntityListing result = apiInstance.getFlowsInstancesSettingsLoglevels(expand, pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getFlowsInstancesSettingsLoglevels");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **expand** | [**List&lt;String&gt;**](String)| Expand instructions for the result | [optional]<br />**Values**: name, type, logLevelCharacteristics.characteristics 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **pageSize** | **Integer**| Number of entities to return. Maximum of 200. | [optional] [default to 25] 
{: class="table-striped"}


### Return type

[**FlowSettingsResponseEntityListing**](FlowSettingsResponseEntityListing)


# **getFlowsInstancesSettingsLoglevelsCharacteristics**


> [FlowLogLevelCharacteristicsDefinitions](FlowLogLevelCharacteristicsDefinitions) getFlowsInstancesSettingsLoglevelsCharacteristics()

Gets the available flow log level characteristics for this organization.

Log levels can be customized and this returns the set of available characteristics that can be enabled/disabled.

Wraps GET /api/v2/flows/instances/settings/loglevels/characteristics  

Requires ANY permissions: 

* architect:flowLogLevel:view
* architect:flowLogLevelDefault:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
try {
    FlowLogLevelCharacteristicsDefinitions result = apiInstance.getFlowsInstancesSettingsLoglevelsCharacteristics();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getFlowsInstancesSettingsLoglevelsCharacteristics");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**FlowLogLevelCharacteristicsDefinitions**](FlowLogLevelCharacteristicsDefinitions)


# **getFlowsInstancesSettingsLoglevelsDefault**


> [FlowSettingsResponse](FlowSettingsResponse) getFlowsInstancesSettingsLoglevelsDefault(expand)

Returns the flow default log level.

Returns the flow default log level which will be used if no specific flow id log level is found.

Wraps GET /api/v2/flows/instances/settings/loglevels/default  

Requires ANY permissions: 

* architect:flowLogLevelDefault:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
List<String> expand = Arrays.asList(null); // List<String> | Expand instructions for the result
try {
    FlowSettingsResponse result = apiInstance.getFlowsInstancesSettingsLoglevelsDefault(expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getFlowsInstancesSettingsLoglevelsDefault");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **expand** | [**List&lt;String&gt;**](String)| Expand instructions for the result | [optional]<br />**Values**: logLevelCharacteristics.characteristics 
{: class="table-striped"}


### Return type

[**FlowSettingsResponse**](FlowSettingsResponse)


# **getFlowsJob**


> [ArchitectJobStateResponse](ArchitectJobStateResponse) getFlowsJob(jobId, expand)

Fetch Architect Job Status

Wraps GET /api/v2/flows/jobs/{jobId}  

Requires ALL permissions: 

* architect:job:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String jobId = "jobId_example"; // String | Job ID
List<String> expand = Arrays.asList(null); // List<String> | Which fields, if any, to expand.
try {
    ArchitectJobStateResponse result = apiInstance.getFlowsJob(jobId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getFlowsJob");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **jobId** | **String**| Job ID | 
| **expand** | [**List&lt;String&gt;**](String)| Which fields, if any, to expand. | [optional]<br />**Values**: messages 
{: class="table-striped"}


### Return type

[**ArchitectJobStateResponse**](ArchitectJobStateResponse)


# **getFlowsMilestone**


> [FlowMilestone](FlowMilestone) getFlowsMilestone(milestoneId)

Get a flow milestone

Returns a specified flow milestone

Wraps GET /api/v2/flows/milestones/{milestoneId}  

Requires ALL permissions: 

* architect:flowMilestone:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String milestoneId = "milestoneId_example"; // String | flow milestone ID
try {
    FlowMilestone result = apiInstance.getFlowsMilestone(milestoneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getFlowsMilestone");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **milestoneId** | **String**| flow milestone ID | 
{: class="table-striped"}


### Return type

[**FlowMilestone**](FlowMilestone)


# **getFlowsMilestones**


> [FlowMilestoneListing](FlowMilestoneListing) getFlowsMilestones(pageNumber, pageSize, sortBy, sortOrder, id, name, description, nameOrDescription, divisionId)

Get a pageable list of flow milestones, filtered by query parameters

Multiple IDs can be specified, in which case all matching flow milestones will be returned, and no other parameters will be evaluated.

Wraps GET /api/v2/flows/milestones  

Requires ALL permissions: 

* architect:flowMilestone:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
String sortBy = "id"; // String | Sort by
String sortOrder = "asc"; // String | Sort order
List<String> id = Arrays.asList(null); // List<String> | ID
String name = "name_example"; // String | Name
String description = "description_example"; // String | Description
String nameOrDescription = "nameOrDescription_example"; // String | Name or description
List<String> divisionId = Arrays.asList(null); // List<String> | division ID(s)
try {
    FlowMilestoneListing result = apiInstance.getFlowsMilestones(pageNumber, pageSize, sortBy, sortOrder, id, name, description, nameOrDescription, divisionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getFlowsMilestones");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **sortBy** | **String**| Sort by | [optional] [default to id] 
| **sortOrder** | **String**| Sort order | [optional] [default to asc] 
| **id** | [**List&lt;String&gt;**](String)| ID | [optional] 
| **name** | **String**| Name | [optional] 
| **description** | **String**| Description | [optional] 
| **nameOrDescription** | **String**| Name or description | [optional] 
| **divisionId** | [**List&lt;String&gt;**](String)| division ID(s) | [optional] 
{: class="table-striped"}


### Return type

[**FlowMilestoneListing**](FlowMilestoneListing)


# **getFlowsMilestonesDivisionviews**


> [FlowMilestoneDivisionViewEntityListing](FlowMilestoneDivisionViewEntityListing) getFlowsMilestonesDivisionviews(pageNumber, pageSize, sortBy, sortOrder, id, name, divisionId)

Get a pageable list of basic flow milestone information objects filterable by query parameters.

This returns flow milestones consisting of name and division. If one or more IDs are specified, the search will fetch flow milestones that match the given ID(s) and not use any additional supplied query parameters in the search.

Wraps GET /api/v2/flows/milestones/divisionviews  

Requires ALL permissions: 

* architect:flowMilestone:search

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
String sortBy = "id"; // String | Sort by
String sortOrder = "asc"; // String | Sort order
List<String> id = Arrays.asList(null); // List<String> | ID
String name = "name_example"; // String | Name
List<String> divisionId = Arrays.asList(null); // List<String> | division ID(s)
try {
    FlowMilestoneDivisionViewEntityListing result = apiInstance.getFlowsMilestonesDivisionviews(pageNumber, pageSize, sortBy, sortOrder, id, name, divisionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getFlowsMilestonesDivisionviews");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **sortBy** | **String**| Sort by | [optional] [default to id] 
| **sortOrder** | **String**| Sort order | [optional] [default to asc] 
| **id** | [**List&lt;String&gt;**](String)| ID | [optional] 
| **name** | **String**| Name | [optional] 
| **divisionId** | [**List&lt;String&gt;**](String)| division ID(s) | [optional] 
{: class="table-striped"}


### Return type

[**FlowMilestoneDivisionViewEntityListing**](FlowMilestoneDivisionViewEntityListing)


# **getFlowsOutcome**


> [FlowOutcome](FlowOutcome) getFlowsOutcome(flowOutcomeId)

Get a flow outcome

Returns a specified flow outcome

Wraps GET /api/v2/flows/outcomes/{flowOutcomeId}  

Requires ALL permissions: 

* architect:flowOutcome:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String flowOutcomeId = "flowOutcomeId_example"; // String | flow outcome ID
try {
    FlowOutcome result = apiInstance.getFlowsOutcome(flowOutcomeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getFlowsOutcome");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **flowOutcomeId** | **String**| flow outcome ID | 
{: class="table-striped"}


### Return type

[**FlowOutcome**](FlowOutcome)


# **getFlowsOutcomes**


> [FlowOutcomeListing](FlowOutcomeListing) getFlowsOutcomes(pageNumber, pageSize, sortBy, sortOrder, id, name, description, nameOrDescription, divisionId)

Get a pageable list of flow outcomes, filtered by query parameters

Multiple IDs can be specified, in which case all matching flow outcomes will be returned, and no other parameters will be evaluated.

Wraps GET /api/v2/flows/outcomes  

Requires ALL permissions: 

* architect:flowOutcome:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
String sortBy = "id"; // String | Sort by
String sortOrder = "asc"; // String | Sort order
List<String> id = Arrays.asList(null); // List<String> | ID
String name = "name_example"; // String | Name
String description = "description_example"; // String | Description
String nameOrDescription = "nameOrDescription_example"; // String | Name or description
List<String> divisionId = Arrays.asList(null); // List<String> | division ID(s)
try {
    FlowOutcomeListing result = apiInstance.getFlowsOutcomes(pageNumber, pageSize, sortBy, sortOrder, id, name, description, nameOrDescription, divisionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getFlowsOutcomes");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **sortBy** | **String**| Sort by | [optional] [default to id] 
| **sortOrder** | **String**| Sort order | [optional] [default to asc] 
| **id** | [**List&lt;String&gt;**](String)| ID | [optional] 
| **name** | **String**| Name | [optional] 
| **description** | **String**| Description | [optional] 
| **nameOrDescription** | **String**| Name or description | [optional] 
| **divisionId** | [**List&lt;String&gt;**](String)| division ID(s) | [optional] 
{: class="table-striped"}


### Return type

[**FlowOutcomeListing**](FlowOutcomeListing)


# **getFlowsOutcomesDivisionviews**


> [FlowOutcomeDivisionViewEntityListing](FlowOutcomeDivisionViewEntityListing) getFlowsOutcomesDivisionviews(pageNumber, pageSize, sortBy, sortOrder, id, name, divisionId)

Get a pageable list of basic flow outcome information objects filterable by query parameters.

This returns flow outcomes consisting of name and division. If one or more IDs are specified, the search will fetch flow outcomes that match the given ID(s) and not use any additional supplied query parameters in the search.

Wraps GET /api/v2/flows/outcomes/divisionviews  

Requires ALL permissions: 

* architect:flowOutcome:search

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
String sortBy = "id"; // String | Sort by
String sortOrder = "asc"; // String | Sort order
List<String> id = Arrays.asList(null); // List<String> | ID
String name = "name_example"; // String | Name
List<String> divisionId = Arrays.asList(null); // List<String> | division ID(s)
try {
    FlowOutcomeDivisionViewEntityListing result = apiInstance.getFlowsOutcomesDivisionviews(pageNumber, pageSize, sortBy, sortOrder, id, name, divisionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getFlowsOutcomesDivisionviews");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **sortBy** | **String**| Sort by | [optional] [default to id] 
| **sortOrder** | **String**| Sort order | [optional] [default to asc] 
| **id** | [**List&lt;String&gt;**](String)| ID | [optional] 
| **name** | **String**| Name | [optional] 
| **divisionId** | [**List&lt;String&gt;**](String)| division ID(s) | [optional] 
{: class="table-striped"}


### Return type

[**FlowOutcomeDivisionViewEntityListing**](FlowOutcomeDivisionViewEntityListing)


# **patchArchitectGrammar**


> [Grammar](Grammar) patchArchitectGrammar(grammarId, body)

Updates a grammar

Wraps PATCH /api/v2/architect/grammars/{grammarId}  

Requires ALL permissions: 

* architect:grammar:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String grammarId = "grammarId_example"; // String | grammar ID
Grammar body = new Grammar(); // Grammar | 
try {
    Grammar result = apiInstance.patchArchitectGrammar(grammarId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#patchArchitectGrammar");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **grammarId** | **String**| grammar ID | 
| **body** | [**Grammar**](Grammar)|  | [optional] 
{: class="table-striped"}


### Return type

[**Grammar**](Grammar)


# **patchArchitectGrammarLanguage**


> [GrammarLanguage](GrammarLanguage) patchArchitectGrammarLanguage(grammarId, languageCode, body)

Updates a grammar language

Wraps PATCH /api/v2/architect/grammars/{grammarId}/languages/{languageCode}  

Requires ALL permissions: 

* architect:grammar:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String grammarId = "grammarId_example"; // String | Grammar ID
String languageCode = "languageCode_example"; // String | Language
GrammarLanguageUpdate body = new GrammarLanguageUpdate(); // GrammarLanguageUpdate | 
try {
    GrammarLanguage result = apiInstance.patchArchitectGrammarLanguage(grammarId, languageCode, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#patchArchitectGrammarLanguage");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **grammarId** | **String**| Grammar ID | 
| **languageCode** | **String**| Language | 
| **body** | [**GrammarLanguageUpdate**](GrammarLanguageUpdate)|  | [optional] 
{: class="table-striped"}


### Return type

[**GrammarLanguage**](GrammarLanguage)


# **patchFlowsInstancesSettingsExecutiondata**


> [ExecutionDataFlowSettingsResponse](ExecutionDataFlowSettingsResponse) patchFlowsInstancesSettingsExecutiondata(body)

Edit the execution history enabled setting.

Edit the execution history enabled setting.

Wraps PATCH /api/v2/flows/instances/settings/executiondata  

Requires ANY permissions: 

* architect:flowinstanceexecutiondata:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
ExecutionDataSettingsRequest body = new ExecutionDataSettingsRequest(); // ExecutionDataSettingsRequest | New Execution Data Setting
try {
    ExecutionDataFlowSettingsResponse result = apiInstance.patchFlowsInstancesSettingsExecutiondata(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#patchFlowsInstancesSettingsExecutiondata");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**ExecutionDataSettingsRequest**](ExecutionDataSettingsRequest)| New Execution Data Setting | 
{: class="table-striped"}


### Return type

[**ExecutionDataFlowSettingsResponse**](ExecutionDataFlowSettingsResponse)


# **postArchitectDependencytrackingBuild**


> Void postArchitectDependencytrackingBuild()

Rebuild Dependency Tracking data for an organization

Asynchronous.  Notification topic: v2.architect.dependencytracking.build

Wraps POST /api/v2/architect/dependencytracking/build  

Requires ALL permissions: 

* architect:dependencyTracking:rebuild

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
try {
    apiInstance.postArchitectDependencytrackingBuild();
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#postArchitectDependencytrackingBuild");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

null (empty response body)


# **postArchitectEmergencygroups**


> [EmergencyGroup](EmergencyGroup) postArchitectEmergencygroups(body)

Creates a new emergency group

Wraps POST /api/v2/architect/emergencygroups  

Requires ALL permissions: 

* routing:emergencyGroup:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
EmergencyGroup body = new EmergencyGroup(); // EmergencyGroup | 
try {
    EmergencyGroup result = apiInstance.postArchitectEmergencygroups(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#postArchitectEmergencygroups");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**EmergencyGroup**](EmergencyGroup)|  | 
{: class="table-striped"}


### Return type

[**EmergencyGroup**](EmergencyGroup)


# **postArchitectGrammarLanguageFilesDtmf**


> [UploadUrlResponse](UploadUrlResponse) postArchitectGrammarLanguageFilesDtmf(grammarId, languageCode, body)

Creates a presigned URL for uploading a grammar DTMF mode file

Wraps POST /api/v2/architect/grammars/{grammarId}/languages/{languageCode}/files/dtmf  

Requires ALL permissions: 

* architect:grammar:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String grammarId = "grammarId_example"; // String | Grammar ID
String languageCode = "languageCode_example"; // String | Language
GrammarFileUploadRequest body = new GrammarFileUploadRequest(); // GrammarFileUploadRequest | query
try {
    UploadUrlResponse result = apiInstance.postArchitectGrammarLanguageFilesDtmf(grammarId, languageCode, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#postArchitectGrammarLanguageFilesDtmf");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **grammarId** | **String**| Grammar ID | 
| **languageCode** | **String**| Language | 
| **body** | [**GrammarFileUploadRequest**](GrammarFileUploadRequest)| query | 
{: class="table-striped"}


### Return type

[**UploadUrlResponse**](UploadUrlResponse)


# **postArchitectGrammarLanguageFilesVoice**


> [UploadUrlResponse](UploadUrlResponse) postArchitectGrammarLanguageFilesVoice(grammarId, languageCode, body)

Creates a presigned URL for uploading a grammar voice mode file

Wraps POST /api/v2/architect/grammars/{grammarId}/languages/{languageCode}/files/voice  

Requires ALL permissions: 

* architect:grammar:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String grammarId = "grammarId_example"; // String | Grammar ID
String languageCode = "languageCode_example"; // String | Language
GrammarFileUploadRequest body = new GrammarFileUploadRequest(); // GrammarFileUploadRequest | query
try {
    UploadUrlResponse result = apiInstance.postArchitectGrammarLanguageFilesVoice(grammarId, languageCode, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#postArchitectGrammarLanguageFilesVoice");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **grammarId** | **String**| Grammar ID | 
| **languageCode** | **String**| Language | 
| **body** | [**GrammarFileUploadRequest**](GrammarFileUploadRequest)| query | 
{: class="table-striped"}


### Return type

[**UploadUrlResponse**](UploadUrlResponse)


# **postArchitectGrammarLanguages**


> [GrammarLanguage](GrammarLanguage) postArchitectGrammarLanguages(grammarId, body)

Create a new language for a given grammar

Wraps POST /api/v2/architect/grammars/{grammarId}/languages  

Requires ALL permissions: 

* architect:grammar:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String grammarId = "grammarId_example"; // String | Grammar ID
GrammarLanguage body = new GrammarLanguage(); // GrammarLanguage | 
try {
    GrammarLanguage result = apiInstance.postArchitectGrammarLanguages(grammarId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#postArchitectGrammarLanguages");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **grammarId** | **String**| Grammar ID | 
| **body** | [**GrammarLanguage**](GrammarLanguage)|  | 
{: class="table-striped"}


### Return type

[**GrammarLanguage**](GrammarLanguage)


# **postArchitectGrammars**


> [Grammar](Grammar) postArchitectGrammars(body)

Create a new grammar

Wraps POST /api/v2/architect/grammars  

Requires ALL permissions: 

* architect:grammar:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
Grammar body = new Grammar(); // Grammar | 
try {
    Grammar result = apiInstance.postArchitectGrammars(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#postArchitectGrammars");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**Grammar**](Grammar)|  | 
{: class="table-striped"}


### Return type

[**Grammar**](Grammar)


# **postArchitectIvrs**


> [IVR](IVR) postArchitectIvrs(body)

Create IVR config.

Wraps POST /api/v2/architect/ivrs  

Requires ALL permissions: 

* routing:callRoute:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
IVR body = new IVR(); // IVR | 
try {
    IVR result = apiInstance.postArchitectIvrs(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#postArchitectIvrs");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**IVR**](IVR)|  | 
{: class="table-striped"}


### Return type

[**IVR**](IVR)


# **postArchitectPromptHistory**


> [Operation](Operation) postArchitectPromptHistory(promptId)

Generate prompt history

Asynchronous.  Notification topic: v2.architect.prompts.{promptId}

Wraps POST /api/v2/architect/prompts/{promptId}/history  

Requires ALL permissions: 

* architect:userPrompt:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String promptId = "promptId_example"; // String | Prompt ID
try {
    Operation result = apiInstance.postArchitectPromptHistory(promptId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#postArchitectPromptHistory");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **promptId** | **String**| Prompt ID | 
{: class="table-striped"}


### Return type

[**Operation**](Operation)


# **postArchitectPromptResourceUploads**


> [PromptAssetUpload](PromptAssetUpload) postArchitectPromptResourceUploads(promptId, languageCode)

Creates a presigned URL for uploading a user prompt file

postArchitectPromptResourceUploads is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps POST /api/v2/architect/prompts/{promptId}/resources/{languageCode}/uploads  

Requires ALL permissions: 

* architect:userPrompt:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String promptId = "promptId_example"; // String | Prompt ID
String languageCode = "languageCode_example"; // String | Language
try {
    PromptAssetUpload result = apiInstance.postArchitectPromptResourceUploads(promptId, languageCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#postArchitectPromptResourceUploads");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **promptId** | **String**| Prompt ID | 
| **languageCode** | **String**| Language | 
{: class="table-striped"}


### Return type

[**PromptAssetUpload**](PromptAssetUpload)


# **postArchitectPromptResources**


> [PromptAsset](PromptAsset) postArchitectPromptResources(promptId, body)

Create a new user prompt resource

Wraps POST /api/v2/architect/prompts/{promptId}/resources  

Requires ALL permissions: 

* architect:userPrompt:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String promptId = "promptId_example"; // String | Prompt ID
PromptAssetCreate body = new PromptAssetCreate(); // PromptAssetCreate | 
try {
    PromptAsset result = apiInstance.postArchitectPromptResources(promptId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#postArchitectPromptResources");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **promptId** | **String**| Prompt ID | 
| **body** | [**PromptAssetCreate**](PromptAssetCreate)|  | 
{: class="table-striped"}


### Return type

[**PromptAsset**](PromptAsset)


# **postArchitectPrompts**


> [Prompt](Prompt) postArchitectPrompts(body)

Create a new user prompt

Wraps POST /api/v2/architect/prompts  

Requires ALL permissions: 

* architect:userPrompt:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
Prompt body = new Prompt(); // Prompt | 
try {
    Prompt result = apiInstance.postArchitectPrompts(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#postArchitectPrompts");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**Prompt**](Prompt)|  | 
{: class="table-striped"}


### Return type

[**Prompt**](Prompt)


# **postArchitectSchedulegroups**


> [ScheduleGroup](ScheduleGroup) postArchitectSchedulegroups(body)

Creates a new schedule group

Wraps POST /api/v2/architect/schedulegroups  

Requires ALL permissions: 

* routing:scheduleGroup:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
ScheduleGroup body = new ScheduleGroup(); // ScheduleGroup | 
try {
    ScheduleGroup result = apiInstance.postArchitectSchedulegroups(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#postArchitectSchedulegroups");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**ScheduleGroup**](ScheduleGroup)|  | 
{: class="table-striped"}


### Return type

[**ScheduleGroup**](ScheduleGroup)


# **postArchitectSchedules**


> [Schedule](Schedule) postArchitectSchedules(body)

Create a new schedule.

Wraps POST /api/v2/architect/schedules  

Requires ALL permissions: 

* routing:schedule:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
Schedule body = new Schedule(); // Schedule | 
try {
    Schedule result = apiInstance.postArchitectSchedules(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#postArchitectSchedules");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**Schedule**](Schedule)|  | 
{: class="table-striped"}


### Return type

[**Schedule**](Schedule)


# **postArchitectSystempromptHistory**


> [Operation](Operation) postArchitectSystempromptHistory(promptId)

Generate system prompt history

Asynchronous.  Notification topic: v2.architect.systemprompts.{systemPromptId}

Wraps POST /api/v2/architect/systemprompts/{promptId}/history  

Requires ALL permissions: 

* architect:systemPrompt:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String promptId = "promptId_example"; // String | promptId
try {
    Operation result = apiInstance.postArchitectSystempromptHistory(promptId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#postArchitectSystempromptHistory");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **promptId** | **String**| promptId | 
{: class="table-striped"}


### Return type

[**Operation**](Operation)


# **postArchitectSystempromptResourceUploads**


> [PromptAssetUpload](PromptAssetUpload) postArchitectSystempromptResourceUploads(promptId, languageCode)

Creates a presigned URL for uploading a system prompt file

postArchitectSystempromptResourceUploads is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps POST /api/v2/architect/systemprompts/{promptId}/resources/{languageCode}/uploads  

Requires ALL permissions: 

* architect:systemPrompt:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String promptId = "promptId_example"; // String | Prompt ID
String languageCode = "languageCode_example"; // String | Language
try {
    PromptAssetUpload result = apiInstance.postArchitectSystempromptResourceUploads(promptId, languageCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#postArchitectSystempromptResourceUploads");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **promptId** | **String**| Prompt ID | 
| **languageCode** | **String**| Language | 
{: class="table-striped"}


### Return type

[**PromptAssetUpload**](PromptAssetUpload)


# **postArchitectSystempromptResources**


> [SystemPromptAsset](SystemPromptAsset) postArchitectSystempromptResources(promptId, body)

Create system prompt resource override.

Wraps POST /api/v2/architect/systemprompts/{promptId}/resources  

Requires ALL permissions: 

* architect:systemPrompt:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String promptId = "promptId_example"; // String | Prompt ID
SystemPromptAsset body = new SystemPromptAsset(); // SystemPromptAsset | 
try {
    SystemPromptAsset result = apiInstance.postArchitectSystempromptResources(promptId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#postArchitectSystempromptResources");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **promptId** | **String**| Prompt ID | 
| **body** | [**SystemPromptAsset**](SystemPromptAsset)|  | 
{: class="table-striped"}


### Return type

[**SystemPromptAsset**](SystemPromptAsset)


# **postFlowHistory**


> [Operation](Operation) postFlowHistory(flowId)

Generate flow history

Asynchronous.  Notification topic: v2.flows.{flowId}

Wraps POST /api/v2/flows/{flowId}/history  

Requires ANY permissions: 

* architect:flow:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String flowId = "flowId_example"; // String | Flow ID
try {
    Operation result = apiInstance.postFlowHistory(flowId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#postFlowHistory");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **flowId** | **String**| Flow ID | 
{: class="table-striped"}


### Return type

[**Operation**](Operation)


# **postFlowInstancesSettingsLoglevels**


> [FlowSettingsResponse](FlowSettingsResponse) postFlowInstancesSettingsLoglevels(flowId, body, expand)

Set the logLevel for a particular flow id

Assigns a new loglevel to a flow id

Wraps POST /api/v2/flows/{flowId}/instances/settings/loglevels  

Requires ALL permissions: 

* architect:flowLogLevel:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String flowId = "flowId_example"; // String | The flow id to set the loglevel for
FlowLogLevelRequest body = new FlowLogLevelRequest(); // FlowLogLevelRequest | New LogLevel settings
List<String> expand = Arrays.asList(null); // List<String> | Expand instructions for the result
try {
    FlowSettingsResponse result = apiInstance.postFlowInstancesSettingsLoglevels(flowId, body, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#postFlowInstancesSettingsLoglevels");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **flowId** | **String**| The flow id to set the loglevel for | 
| **body** | [**FlowLogLevelRequest**](FlowLogLevelRequest)| New LogLevel settings | 
| **expand** | [**List&lt;String&gt;**](String)| Expand instructions for the result | [optional]<br />**Values**: name, type, logLevelCharacteristics.characteristics 
{: class="table-striped"}


### Return type

[**FlowSettingsResponse**](FlowSettingsResponse)


# **postFlowVersions**


> [FlowVersion](FlowVersion) postFlowVersions(flowId, body)

Create flow version

Wraps POST /api/v2/flows/{flowId}/versions  

Requires ANY permissions: 

* architect:flow:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String flowId = "flowId_example"; // String | Flow ID
Object body = new HashMap(); // Object | 
try {
    FlowVersion result = apiInstance.postFlowVersions(flowId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#postFlowVersions");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **flowId** | **String**| Flow ID | 
| **body** | [**Object**](Object)|  | 
{: class="table-striped"}


### Return type

[**FlowVersion**](FlowVersion)


# **postFlows**


> [Flow](Flow) postFlows(body, language)

Create flow

Wraps POST /api/v2/flows  

Requires ANY permissions: 

* architect:flow:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
Flow body = new Flow(); // Flow | 
String language = "language_example"; // String | Language
try {
    Flow result = apiInstance.postFlows(body, language);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#postFlows");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**Flow**](Flow)|  | 
| **language** | **String**| Language | [optional] 
{: class="table-striped"}


### Return type

[**Flow**](Flow)


# **postFlowsActionsCheckin**


> [Operation](Operation) postFlowsActionsCheckin(flow)

Check-in flow

Asynchronous.  Notification topic: v2.flows.{flowId}

Wraps POST /api/v2/flows/actions/checkin  

Requires ANY permissions: 

* architect:flow:edit
* architect:flow:unlock

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String flow = "flow_example"; // String | Flow ID
try {
    Operation result = apiInstance.postFlowsActionsCheckin(flow);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#postFlowsActionsCheckin");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **flow** | **String**| Flow ID | 
{: class="table-striped"}


### Return type

[**Operation**](Operation)


# **postFlowsActionsCheckout**


> [Flow](Flow) postFlowsActionsCheckout(flow)

Check-out flow

Wraps POST /api/v2/flows/actions/checkout  

Requires ANY permissions: 

* architect:flow:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String flow = "flow_example"; // String | Flow ID
try {
    Flow result = apiInstance.postFlowsActionsCheckout(flow);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#postFlowsActionsCheckout");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **flow** | **String**| Flow ID | 
{: class="table-striped"}


### Return type

[**Flow**](Flow)


# **postFlowsActionsDeactivate**


> [Flow](Flow) postFlowsActionsDeactivate(flow)

Deactivate flow

Wraps POST /api/v2/flows/actions/deactivate  

Requires ANY permissions: 

* architect:flow:publish

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String flow = "flow_example"; // String | Flow ID
try {
    Flow result = apiInstance.postFlowsActionsDeactivate(flow);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#postFlowsActionsDeactivate");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **flow** | **String**| Flow ID | 
{: class="table-striped"}


### Return type

[**Flow**](Flow)


# **postFlowsActionsPublish**


> [Operation](Operation) postFlowsActionsPublish(flow, version)

Publish flow

Asynchronous.  Notification topic: v2.flows.{flowId}

Wraps POST /api/v2/flows/actions/publish  

Requires ANY permissions: 

* architect:flow:unlock
* architect:flow:publish

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String flow = "flow_example"; // String | Flow ID
String version = "version_example"; // String | version
try {
    Operation result = apiInstance.postFlowsActionsPublish(flow, version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#postFlowsActionsPublish");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **flow** | **String**| Flow ID | 
| **version** | **String**| version | [optional] 
{: class="table-striped"}


### Return type

[**Operation**](Operation)


# **postFlowsActionsRevert**


> [Flow](Flow) postFlowsActionsRevert(flow)

Revert flow

Wraps POST /api/v2/flows/actions/revert  

Requires ANY permissions: 

* architect:flow:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String flow = "flow_example"; // String | Flow ID
try {
    Flow result = apiInstance.postFlowsActionsRevert(flow);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#postFlowsActionsRevert");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **flow** | **String**| Flow ID | 
{: class="table-striped"}


### Return type

[**Flow**](Flow)


# **postFlowsActionsUnlock**


> [Flow](Flow) postFlowsActionsUnlock(flow)

Unlock flow

Allows for unlocking a flow in the case where there is no flow configuration available, and thus a check-in will not unlock the flow. The user must have Architect Admin permissions to perform this action.

Wraps POST /api/v2/flows/actions/unlock  

Requires ANY permissions: 

* architect:flow:unlock

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String flow = "flow_example"; // String | Flow ID
try {
    Flow result = apiInstance.postFlowsActionsUnlock(flow);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#postFlowsActionsUnlock");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **flow** | **String**| Flow ID | 
{: class="table-striped"}


### Return type

[**Flow**](Flow)


# **postFlowsDatatableExportJobs**


> [DataTableExportJob](DataTableExportJob) postFlowsDatatableExportJobs(datatableId)

Begin an export process for exporting all rows from a datatable

Create an export job for exporting rows. The caller can then poll for status of the export using the token returned in the response

Wraps POST /api/v2/flows/datatables/{datatableId}/export/jobs  

Requires ANY permissions: 

* architect:datatable:view
* architect:datatableRow:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String datatableId = "datatableId_example"; // String | id of datatable
try {
    DataTableExportJob result = apiInstance.postFlowsDatatableExportJobs(datatableId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#postFlowsDatatableExportJobs");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datatableId** | **String**| id of datatable | 
{: class="table-striped"}


### Return type

[**DataTableExportJob**](DataTableExportJob)


# **postFlowsDatatableImportJobs**


> [DataTableImportJob](DataTableImportJob) postFlowsDatatableImportJobs(datatableId, body)

Begin an import process for importing rows into a datatable

Create an import job for importing rows. The caller can then poll for status of the import using the token returned in the response

Wraps POST /api/v2/flows/datatables/{datatableId}/import/jobs  

Requires ANY permissions: 

* architect:datatable:edit
* architect:datatableRow:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String datatableId = "datatableId_example"; // String | id of datatable
DataTableImportJob body = new DataTableImportJob(); // DataTableImportJob | import job information
try {
    DataTableImportJob result = apiInstance.postFlowsDatatableImportJobs(datatableId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#postFlowsDatatableImportJobs");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datatableId** | **String**| id of datatable | 
| **body** | [**DataTableImportJob**](DataTableImportJob)| import job information | 
{: class="table-striped"}


### Return type

[**DataTableImportJob**](DataTableImportJob)


# **postFlowsDatatableRows**


> Map&lt;String, Object&gt; postFlowsDatatableRows(datatableId, dataTableRow)

Create a new row entry for the datatable.

Will add the passed in row entry to the datatable with the given datatableId after verifying it against the schema.  When building the request body within API Explorer, Pro mode should be used. The DataTableRow should be a json-ized' stream of key -> value pairs {      \"Field1\": \"XYZZY\",      \"Field2\": false,      \"KEY\": \"27272\"  }

Wraps POST /api/v2/flows/datatables/{datatableId}/rows  

Requires ANY permissions: 

* architect:datatable:add
* architect:datatableRow:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String datatableId = "datatableId_example"; // String | id of datatable
Object dataTableRow = new HashMap(); // Object | 
try {
    Map<String, Object> result = apiInstance.postFlowsDatatableRows(datatableId, dataTableRow);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#postFlowsDatatableRows");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datatableId** | **String**| id of datatable | 
| **dataTableRow** | [**Object**](Object)|  | 
{: class="table-striped"}


### Return type

**Map&lt;String, Object&gt;**


# **postFlowsDatatables**


> [DataTable](DataTable) postFlowsDatatables(body)

Create a new datatable with the specified json-schema definition

This will create a new datatable with fields that match the property definitions in the JSON schema.  The schema's title field will be overridden by the name field in the DataTable object.  See also http://json-schema.org/

Wraps POST /api/v2/flows/datatables  

Requires ANY permissions: 

* architect:datatable:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
DataTable body = new DataTable(); // DataTable | datatable json-schema
try {
    DataTable result = apiInstance.postFlowsDatatables(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#postFlowsDatatables");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**DataTable**](DataTable)| datatable json-schema | 
{: class="table-striped"}


### Return type

[**DataTable**](DataTable)


# **postFlowsExecutions**


> [FlowExecutionLaunchResponse](FlowExecutionLaunchResponse) postFlowsExecutions(flowLaunchRequest)

Launch an instance of a flow definition, for flow types that support it such as the 'workflow' type.

The launch is asynchronous, it returns as soon as the flow starts. You can use the returned ID to query its status if you need.

Wraps POST /api/v2/flows/executions  

Requires ANY permissions: 

* architect:flow:launch

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
FlowExecutionLaunchRequest flowLaunchRequest = new FlowExecutionLaunchRequest(); // FlowExecutionLaunchRequest | 
try {
    FlowExecutionLaunchResponse result = apiInstance.postFlowsExecutions(flowLaunchRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#postFlowsExecutions");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **flowLaunchRequest** | [**FlowExecutionLaunchRequest**](FlowExecutionLaunchRequest)|  | 
{: class="table-striped"}


### Return type

[**FlowExecutionLaunchResponse**](FlowExecutionLaunchResponse)


# **postFlowsExportJobs**


> [RegisterArchitectExportJobResponse](RegisterArchitectExportJobResponse) postFlowsExportJobs(body)

Register Architect Export Job

Wraps POST /api/v2/flows/export/jobs  

Requires ALL permissions: 

* architect:jobExport:create

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
RegisterArchitectExportJob body = new RegisterArchitectExportJob(); // RegisterArchitectExportJob | 
try {
    RegisterArchitectExportJobResponse result = apiInstance.postFlowsExportJobs(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#postFlowsExportJobs");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**RegisterArchitectExportJob**](RegisterArchitectExportJob)|  | 
{: class="table-striped"}


### Return type

[**RegisterArchitectExportJobResponse**](RegisterArchitectExportJobResponse)


# **postFlowsInstancesJobs**


> [GetFlowExecutionDataJobResult](GetFlowExecutionDataJobResult) postFlowsInstancesJobs(body, expand)

Start a process (job) that will prepare a list of execution data IDs for download.

Returns a JobResult object that contains an ID that can be used to check status and/or download links when the process (job) is complete.

Wraps POST /api/v2/flows/instances/jobs  

Requires ANY permissions: 

* architect:flowInstance:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
ExecutionDataRequest body = new ExecutionDataRequest(); // ExecutionDataRequest | Requested Flow Ids
String expand = "expand_example"; // String | Expand various query types.
try {
    GetFlowExecutionDataJobResult result = apiInstance.postFlowsInstancesJobs(body, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#postFlowsInstancesJobs");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**ExecutionDataRequest**](ExecutionDataRequest)| Requested Flow Ids | 
| **expand** | **String**| Expand various query types. | [optional]<br />**Values**: bots, dataActions 
{: class="table-striped"}


### Return type

[**GetFlowExecutionDataJobResult**](GetFlowExecutionDataJobResult)


# **postFlowsInstancesQuery**


> [FlowResultEntityListing](FlowResultEntityListing) postFlowsInstancesQuery(body, indexOnly, pageSize)

Query the database of existing flow histories to look for particular flow criteria

Returns a list of matching flow histories up to 200 max.

Wraps POST /api/v2/flows/instances/query  

Requires ANY permissions: 

* architect:flowInstance:search

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
CriteriaQuery body = new CriteriaQuery(); // CriteriaQuery | query
Boolean indexOnly = true; // Boolean | indexes only
Integer pageSize = 50; // Integer | number of results to return
try {
    FlowResultEntityListing result = apiInstance.postFlowsInstancesQuery(body, indexOnly, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#postFlowsInstancesQuery");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**CriteriaQuery**](CriteriaQuery)| query | 
| **indexOnly** | **Boolean**| indexes only | [optional] 
| **pageSize** | **Integer**| number of results to return | [optional] [default to 50] 
{: class="table-striped"}


### Return type

[**FlowResultEntityListing**](FlowResultEntityListing)


# **postFlowsJobs**


> [RegisterArchitectJobResponse](RegisterArchitectJobResponse) postFlowsJobs()

Register Architect Job. Returns a URL where a file, such as an Architect flow YAML file, can be PUT which will then initiate the job.

Wraps POST /api/v2/flows/jobs  

Requires ALL permissions: 

* architect:job:create

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
try {
    RegisterArchitectJobResponse result = apiInstance.postFlowsJobs();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#postFlowsJobs");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**RegisterArchitectJobResponse**](RegisterArchitectJobResponse)


# **postFlowsMilestones**


> [FlowMilestone](FlowMilestone) postFlowsMilestones(body)

Create a flow milestone

Wraps POST /api/v2/flows/milestones  

Requires ALL permissions: 

* architect:flowMilestone:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
FlowMilestone body = new FlowMilestone(); // FlowMilestone | 
try {
    FlowMilestone result = apiInstance.postFlowsMilestones(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#postFlowsMilestones");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**FlowMilestone**](FlowMilestone)|  | [optional] 
{: class="table-striped"}


### Return type

[**FlowMilestone**](FlowMilestone)


# **postFlowsOutcomes**


> [FlowOutcome](FlowOutcome) postFlowsOutcomes(body)

Create a flow outcome

Asynchronous.  Notification topic: v2.flows.outcomes.{flowOutcomeId}

Wraps POST /api/v2/flows/outcomes  

Requires ALL permissions: 

* architect:flowOutcome:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
FlowOutcome body = new FlowOutcome(); // FlowOutcome | 
try {
    FlowOutcome result = apiInstance.postFlowsOutcomes(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#postFlowsOutcomes");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**FlowOutcome**](FlowOutcome)|  | [optional] 
{: class="table-striped"}


### Return type

[**FlowOutcome**](FlowOutcome)


# **putArchitectEmergencygroup**


> [EmergencyGroup](EmergencyGroup) putArchitectEmergencygroup(emergencyGroupId, body)

Updates a emergency group by ID

Wraps PUT /api/v2/architect/emergencygroups/{emergencyGroupId}  

Requires ALL permissions: 

* routing:emergencyGroup:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String emergencyGroupId = "emergencyGroupId_example"; // String | Emergency group ID
EmergencyGroup body = new EmergencyGroup(); // EmergencyGroup | 
try {
    EmergencyGroup result = apiInstance.putArchitectEmergencygroup(emergencyGroupId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#putArchitectEmergencygroup");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **emergencyGroupId** | **String**| Emergency group ID | 
| **body** | [**EmergencyGroup**](EmergencyGroup)|  | 
{: class="table-striped"}


### Return type

[**EmergencyGroup**](EmergencyGroup)


# **putArchitectIvr**


> [IVR](IVR) putArchitectIvr(ivrId, body)

Update an IVR Config.

Wraps PUT /api/v2/architect/ivrs/{ivrId}  

Requires ALL permissions: 

* routing:callRoute:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String ivrId = "ivrId_example"; // String | IVR id
IVR body = new IVR(); // IVR | 
try {
    IVR result = apiInstance.putArchitectIvr(ivrId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#putArchitectIvr");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ivrId** | **String**| IVR id | 
| **body** | [**IVR**](IVR)|  | 
{: class="table-striped"}


### Return type

[**IVR**](IVR)


# **putArchitectIvrIdentityresolution**


> [IVRIdentityResolutionConfig](IVRIdentityResolutionConfig) putArchitectIvrIdentityresolution(ivrId, body)

Update an IVR IdentityResolutionConfig.

Wraps PUT /api/v2/architect/ivrs/{ivrId}/identityresolution  

Requires ALL permissions: 

* routing:callRoute:edit
* routing:identityResolutionIvr:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String ivrId = "ivrId_example"; // String | IVR id
IVRIdentityResolutionConfig body = new IVRIdentityResolutionConfig(); // IVRIdentityResolutionConfig | 
try {
    IVRIdentityResolutionConfig result = apiInstance.putArchitectIvrIdentityresolution(ivrId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#putArchitectIvrIdentityresolution");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ivrId** | **String**| IVR id | 
| **body** | [**IVRIdentityResolutionConfig**](IVRIdentityResolutionConfig)|  | 
{: class="table-striped"}


### Return type

[**IVRIdentityResolutionConfig**](IVRIdentityResolutionConfig)


# **putArchitectPrompt**


> [Prompt](Prompt) putArchitectPrompt(promptId, body)

Update specified user prompt

Wraps PUT /api/v2/architect/prompts/{promptId}  

Requires ALL permissions: 

* architect:userPrompt:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String promptId = "promptId_example"; // String | Prompt ID
Prompt body = new Prompt(); // Prompt | 
try {
    Prompt result = apiInstance.putArchitectPrompt(promptId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#putArchitectPrompt");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **promptId** | **String**| Prompt ID | 
| **body** | [**Prompt**](Prompt)|  | 
{: class="table-striped"}


### Return type

[**Prompt**](Prompt)


# **putArchitectPromptResource**


> [PromptAsset](PromptAsset) putArchitectPromptResource(promptId, languageCode, body)

Update specified user prompt resource

Wraps PUT /api/v2/architect/prompts/{promptId}/resources/{languageCode}  

Requires ALL permissions: 

* architect:userPrompt:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String promptId = "promptId_example"; // String | Prompt ID
String languageCode = "languageCode_example"; // String | Language
PromptAsset body = new PromptAsset(); // PromptAsset | 
try {
    PromptAsset result = apiInstance.putArchitectPromptResource(promptId, languageCode, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#putArchitectPromptResource");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **promptId** | **String**| Prompt ID | 
| **languageCode** | **String**| Language | 
| **body** | [**PromptAsset**](PromptAsset)|  | 
{: class="table-striped"}


### Return type

[**PromptAsset**](PromptAsset)


# **putArchitectSchedule**


> [Schedule](Schedule) putArchitectSchedule(scheduleId, body)

Update schedule by ID

Wraps PUT /api/v2/architect/schedules/{scheduleId}  

Requires ALL permissions: 

* routing:schedule:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String scheduleId = "scheduleId_example"; // String | Schedule ID
Schedule body = new Schedule(); // Schedule | 
try {
    Schedule result = apiInstance.putArchitectSchedule(scheduleId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#putArchitectSchedule");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **scheduleId** | **String**| Schedule ID | 
| **body** | [**Schedule**](Schedule)|  | 
{: class="table-striped"}


### Return type

[**Schedule**](Schedule)


# **putArchitectSchedulegroup**


> [ScheduleGroup](ScheduleGroup) putArchitectSchedulegroup(scheduleGroupId, body)

Updates a schedule group by ID

Wraps PUT /api/v2/architect/schedulegroups/{scheduleGroupId}  

Requires ALL permissions: 

* routing:scheduleGroup:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String scheduleGroupId = "scheduleGroupId_example"; // String | Schedule group ID
ScheduleGroup body = new ScheduleGroup(); // ScheduleGroup | 
try {
    ScheduleGroup result = apiInstance.putArchitectSchedulegroup(scheduleGroupId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#putArchitectSchedulegroup");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **scheduleGroupId** | **String**| Schedule group ID | 
| **body** | [**ScheduleGroup**](ScheduleGroup)|  | 
{: class="table-striped"}


### Return type

[**ScheduleGroup**](ScheduleGroup)


# **putArchitectSystempromptResource**


> [SystemPromptAsset](SystemPromptAsset) putArchitectSystempromptResource(promptId, languageCode, body)

Updates a system prompt resource override.

Wraps PUT /api/v2/architect/systemprompts/{promptId}/resources/{languageCode}  

Requires ALL permissions: 

* architect:systemPrompt:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String promptId = "promptId_example"; // String | Prompt ID
String languageCode = "languageCode_example"; // String | Language
SystemPromptAsset body = new SystemPromptAsset(); // SystemPromptAsset | 
try {
    SystemPromptAsset result = apiInstance.putArchitectSystempromptResource(promptId, languageCode, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#putArchitectSystempromptResource");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **promptId** | **String**| Prompt ID | 
| **languageCode** | **String**| Language | 
| **body** | [**SystemPromptAsset**](SystemPromptAsset)|  | 
{: class="table-striped"}


### Return type

[**SystemPromptAsset**](SystemPromptAsset)


# **putFlow**


> [Flow](Flow) putFlow(flowId, body)

Update flow

Wraps PUT /api/v2/flows/{flowId}  

Requires ANY permissions: 

* architect:flow:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String flowId = "flowId_example"; // String | Flow ID
Flow body = new Flow(); // Flow | 
try {
    Flow result = apiInstance.putFlow(flowId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#putFlow");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **flowId** | **String**| Flow ID | 
| **body** | [**Flow**](Flow)|  | 
{: class="table-striped"}


### Return type

[**Flow**](Flow)


# **putFlowInstancesSettingsLoglevels**


> [FlowSettingsResponse](FlowSettingsResponse) putFlowInstancesSettingsLoglevels(flowId, body, expand)

Edit the logLevel for a particular flow id

Updates the loglevel for a flow id

Wraps PUT /api/v2/flows/{flowId}/instances/settings/loglevels  

Requires ALL permissions: 

* architect:flowLogLevel:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String flowId = "flowId_example"; // String | The flow id to edit the loglevel for
FlowLogLevelRequest body = new FlowLogLevelRequest(); // FlowLogLevelRequest | New LogLevel settings
List<String> expand = Arrays.asList(null); // List<String> | Expand instructions for the result
try {
    FlowSettingsResponse result = apiInstance.putFlowInstancesSettingsLoglevels(flowId, body, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#putFlowInstancesSettingsLoglevels");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **flowId** | **String**| The flow id to edit the loglevel for | 
| **body** | [**FlowLogLevelRequest**](FlowLogLevelRequest)| New LogLevel settings | 
| **expand** | [**List&lt;String&gt;**](String)| Expand instructions for the result | [optional]<br />**Values**: name, type, logLevelCharacteristics.characteristics 
{: class="table-striped"}


### Return type

[**FlowSettingsResponse**](FlowSettingsResponse)


# **putFlowsDatatable**


> [DataTable](DataTable) putFlowsDatatable(datatableId, body, expand)

Updates a specific datatable by id

Updates a schema for a datatable with the given datatableId -updates allow only new fields to be added in the schema, no changes or removals of existing fields.

Wraps PUT /api/v2/flows/datatables/{datatableId}  

Requires ANY permissions: 

* architect:datatable:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String datatableId = "datatableId_example"; // String | id of datatable
DataTable body = new DataTable(); // DataTable | datatable json-schema
String expand = "expand_example"; // String | Expand instructions for the result
try {
    DataTable result = apiInstance.putFlowsDatatable(datatableId, body, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#putFlowsDatatable");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datatableId** | **String**| id of datatable | 
| **body** | [**DataTable**](DataTable)| datatable json-schema | 
| **expand** | **String**| Expand instructions for the result | [optional]<br />**Values**: schema 
{: class="table-striped"}


### Return type

[**DataTable**](DataTable)


# **putFlowsDatatableRow**


> Map&lt;String, Object&gt; putFlowsDatatableRow(datatableId, rowId, body)

Update a row entry

Updates a row with the given rowId (the value of the key field) to the new values.  When building the request body within API Explorer, Pro mode should be used. The DataTableRow should be a json-ized' stream of key -> value pairs {     \"Field1\": \"XYZZY\",     \"Field2\": false,     \"KEY\": \"27272\" }

Wraps PUT /api/v2/flows/datatables/{datatableId}/rows/{rowId}  

Requires ANY permissions: 

* architect:datatable:edit
* architect:datatableRow:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String datatableId = "datatableId_example"; // String | id of datatable
String rowId = "rowId_example"; // String | the key for the row
Object body = new HashMap(); // Object | datatable row
try {
    Map<String, Object> result = apiInstance.putFlowsDatatableRow(datatableId, rowId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#putFlowsDatatableRow");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datatableId** | **String**| id of datatable | 
| **rowId** | **String**| the key for the row | 
| **body** | [**Object**](Object)| datatable row | [optional] 
{: class="table-striped"}


### Return type

**Map&lt;String, Object&gt;**


# **putFlowsInstancesSettingsLoglevelsDefault**


> [FlowSettingsResponse](FlowSettingsResponse) putFlowsInstancesSettingsLoglevelsDefault(body, expand)

Edit the flow default log level.

Edit the flow default log level.

Wraps PUT /api/v2/flows/instances/settings/loglevels/default  

Requires ANY permissions: 

* architect:flowLogLevelDefault:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
FlowLogLevelRequest body = new FlowLogLevelRequest(); // FlowLogLevelRequest | New LogLevel settings
List<String> expand = Arrays.asList(null); // List<String> | Expand instructions for the result
try {
    FlowSettingsResponse result = apiInstance.putFlowsInstancesSettingsLoglevelsDefault(body, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#putFlowsInstancesSettingsLoglevelsDefault");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**FlowLogLevelRequest**](FlowLogLevelRequest)| New LogLevel settings | 
| **expand** | [**List&lt;String&gt;**](String)| Expand instructions for the result | [optional]<br />**Values**: logLevelCharacteristics.characteristics 
{: class="table-striped"}


### Return type

[**FlowSettingsResponse**](FlowSettingsResponse)


# **putFlowsMilestone**


> [FlowMilestone](FlowMilestone) putFlowsMilestone(milestoneId, body)

Updates a flow milestone

Wraps PUT /api/v2/flows/milestones/{milestoneId}  

Requires ALL permissions: 

* architect:flowMilestone:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String milestoneId = "milestoneId_example"; // String | flow milestone ID
FlowMilestone body = new FlowMilestone(); // FlowMilestone | 
try {
    FlowMilestone result = apiInstance.putFlowsMilestone(milestoneId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#putFlowsMilestone");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **milestoneId** | **String**| flow milestone ID | 
| **body** | [**FlowMilestone**](FlowMilestone)|  | [optional] 
{: class="table-striped"}


### Return type

[**FlowMilestone**](FlowMilestone)


# **putFlowsOutcome**


> [Operation](Operation) putFlowsOutcome(flowOutcomeId, body)

Updates a flow outcome

Updates a flow outcome.  Asynchronous.  Notification topic: v2.flowoutcomes.{flowoutcomeId}

Wraps PUT /api/v2/flows/outcomes/{flowOutcomeId}  

Requires ALL permissions: 

* architect:flowOutcome:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String flowOutcomeId = "flowOutcomeId_example"; // String | flow outcome ID
FlowOutcome body = new FlowOutcome(); // FlowOutcome | 
try {
    Operation result = apiInstance.putFlowsOutcome(flowOutcomeId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#putFlowsOutcome");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **flowOutcomeId** | **String**| flow outcome ID | 
| **body** | [**FlowOutcome**](FlowOutcome)|  | [optional] 
{: class="table-striped"}


### Return type

[**Operation**](Operation)


_com.mypurecloud.sdk.v2:platform-client-v2:236.0.0_
