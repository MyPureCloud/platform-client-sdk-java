# ContestsFinalizeRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | The Contest finalization status |  |
| **winners** | [**List&lt;ContestWinnersRequest&gt;**](ContestWinnersRequest) | The Contest finalization winners |  [optional] |
| **disqualifiedAgents** | [**List&lt;ContestDisqualifiedAgents&gt;**](ContestDisqualifiedAgents) | The Contest finalization disqualified agents |  [optional] |


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| COMPLETED | &quot;Completed&quot; | 
| CANCELLED | &quot;Cancelled&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:243.0.0_
