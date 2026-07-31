# AgentTimeOffRequestPatch


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **markedAsRead** | **Boolean** | Whether this request has been read by the agent |  [optional] |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | The status of this time off request. Can only be canceled if the requested date has not already passed |  [optional] |
| **notes** | **String** | Notes about the time off request. Can only be edited while the request is still pending |  [optional] |
| **fullDayEarliestStartOffsetMinutes** | [**ListWrapperInteger**](ListWrapperInteger) | Earliest start offset in minutes for each full-day request date. Values may be null when time-off estimation is disabled or no estimate is available |  [optional] |
| **fullDayLatestEndOffsetMinutes** | [**ListWrapperInteger**](ListWrapperInteger) | Latest end offset in minutes for each full-day request date. Values may be null when time-off estimation is disabled or no estimate is available |  [optional] |


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CANCELED | &quot;CANCELED&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:259.0.0_
