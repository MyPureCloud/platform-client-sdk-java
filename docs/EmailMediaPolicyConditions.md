# EmailMediaPolicyConditions


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
| **customerParticipation** | [**CustomerParticipationEnum**](#Enum--CustomerParticipationEnum) |  |  [optional] |


## Enum: CustomerParticipationEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| YES | &quot;YES&quot; | 
| NO | &quot;NO&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:223.1.0_
