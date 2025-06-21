# CallMediaPolicyConditions


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **forUsers** | [**List&lt;User&gt;**](User) |  |  [optional] |
| **dateRanges** | **List&lt;String&gt;** |  |  [optional] |
| **forQueues** | [**List&lt;Queue&gt;**](Queue) |  |  [optional] |
| **wrapupCodes** | [**List&lt;WrapupCode&gt;**](WrapupCode) |  |  [optional] |
| **languages** | [**List&lt;Language&gt;**](Language) |  |  [optional] |
| **timeAllowed** | [**TimeAllowed**](TimeAllowed) |  |  [optional] |
| **teams** | [**List&lt;Team&gt;**](Team) | Teams to match conversations against |  [optional] |
| **directions** | [**List<DirectionsEnum>**](#Enum--DirectionsEnum) |  |  [optional] |
| **duration** | [**DurationCondition**](DurationCondition) |  |  [optional] |


## Enum: DirectionsEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| INBOUND | &quot;INBOUND&quot; |
| OUTBOUND | &quot;OUTBOUND&quot; |




_com.mypurecloud.sdk.v2:platform-client-v2:227.0.0_
