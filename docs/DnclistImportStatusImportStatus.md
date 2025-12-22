# DnclistImportStatusImportStatus


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **importState** | [**ImportStateEnum**](#Enum--ImportStateEnum) | current status of the import |  [optional] |
| **totalRecords** | **Long** | total number of records to be imported |  [optional] |
| **completedRecords** | **Long** | number of records finished importing |  [optional] |
| **percentageComplete** | **Long** | percentage of records finished importing |  [optional] |
| **failureReason** | **String** | if the import has failed, the reason for the failure |  [optional] |
| **targetContactListIds** | **List&lt;String&gt;** | The ids for target contact lists |  [optional] |
| **listNamePrefix** | **String** | The prefix used for target contact list names |  [optional] |
| **additionalProperties** | **Map&lt;String, Object&gt;** |  |  [optional] |
| **getAdditionalProperties** | **Map&lt;String, Object&gt;** |  |  [optional] |


## Enum: ImportStateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| IN_PROGRESS | &quot;IN_PROGRESS&quot; | 
| FAILED | &quot;FAILED&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:241.0.0_
