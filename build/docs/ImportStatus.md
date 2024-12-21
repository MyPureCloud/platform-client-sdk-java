# ImportStatus


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **state** | [**StateEnum**](#Enum--StateEnum) | current status of the import |  |
| **totalRecords** | **Long** | total number of records to be imported |  |
| **completedRecords** | **Long** | number of records finished importing |  |
| **percentComplete** | **Integer** | percentage of records finished importing |  |
| **failureReason** | **String** | if the import has failed, the reason for the failure |  [optional] |
| **targetContactListIds** | **List&lt;String&gt;** | The contact list Ids for target contact lists. |  [optional] |
| **listNamePrefix** | **String** | The prefix for the contact list name |  [optional] |


## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| IN_PROGRESS | &quot;IN_PROGRESS&quot; | 
| FAILED | &quot;FAILED&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:217.0.0_
