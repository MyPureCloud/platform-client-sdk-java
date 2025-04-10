# AssignedLearningModule


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** | The name of learning module |  |
| **excludedFromCatalog** | **Boolean** | If true, learning module is excluded when retrieving modules for manual assignment |  [optional] |
| **createdBy** | [**UserReference**](UserReference) | The user who created learning module |  [optional] |
| **dateCreated** | [**Date**](Date) | The date/time learning module was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **modifiedBy** | [**UserReference**](UserReference) | The user who modified learning module |  [optional] |
| **dateModified** | [**Date**](Date) | The date/time learning module was modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **version** | **Integer** | The version of published learning module |  [optional] |
| **externalId** | **String** | The external ID of the learning module |  [optional] |
| **source** | [**SourceEnum**](#Enum--SourceEnum) | The source of the learning module |  [optional] |
| **rule** | [**LearningModuleRule**](LearningModuleRule) | The rule for learning module; read-only, and only populated when requested via expand param. |  [optional] |
| **enforceContentOrder** | **Boolean** | If true, learning module content should be viewed one by one in order |  [optional] |
| **reviewAssessmentResults** | [**ReviewAssessmentResults**](ReviewAssessmentResults) | Allows to view Assessment results in detail |  [optional] |
| **currentAssignments** | [**List&lt;LearningAssignment&gt;**](LearningAssignment) | The current assignments for the requested users |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |
| **isArchived** | **Boolean** | If true, learning module is archived |  [optional] |
| **isPublished** | **Boolean** | If true, learning module is published |  [optional] |
| **description** | **String** | The description of learning module |  [optional] |
| **completionTimeInDays** | **Integer** | The completion time of learning module in days |  |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | The type for the learning module |  [optional] |
| **informSteps** | [**List&lt;LearningModuleInformStep&gt;**](LearningModuleInformStep) | The list of inform steps in a learning module |  [optional] |
| **assessmentForm** | [**AssessmentForm**](AssessmentForm) | The assessment form for learning module |  [optional] |
| **summaryData** | [**LearningModuleSummary**](LearningModuleSummary) | The learning module summary data |  [optional] |
| **reassignSummaryData** | [**LearningModuleReassignSummary**](LearningModuleReassignSummary) | The learning module reassign summary data |  [optional] |
| **coverArt** | [**LearningModuleCoverArtResponse**](LearningModuleCoverArtResponse) | The cover art for the learning module |  [optional] |
| **lengthInMinutes** | **Integer** | The recommended time in minutes to complete the module |  [optional] |
| **archivalMode** | [**ArchivalModeEnum**](#Enum--ArchivalModeEnum) | The mode of archival for learning module |  [optional] |


## Enum: SourceEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| USERCREATED | &quot;UserCreated&quot; | 
| GENESYSBEYOND | &quot;GenesysBeyond&quot; | 


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| INFORMATIONAL | &quot;Informational&quot; | 
| ASSESSEDCONTENT | &quot;AssessedContent&quot; | 
| ASSESSMENT | &quot;Assessment&quot; | 
| EXTERNAL | &quot;External&quot; | 
| NATIVE | &quot;Native&quot; | 


## Enum: ArchivalModeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| GRACEFUL | &quot;Graceful&quot; | 
| IMMEDIATE | &quot;Immediate&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:223.0.0_
