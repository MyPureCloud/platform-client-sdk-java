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
{: class="table table-striped"}


## Enum: CustomerParticipationEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| YES | &quot;YES&quot; | 
| NO | &quot;NO&quot; | 
{: class="table table-striped"}




_com.mypurecloud.sdk.v2:platform-client-v2:208.0.0_
