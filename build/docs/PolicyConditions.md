# PolicyConditions


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **forUsers** | [**List&lt;PolicyUser&gt;**](PolicyUser) | List of users to apply this policy to. Each user object can include the 'id' field containing the user's unique identifier. Example: [{\"id\":\"<userId>\"}]. |  [optional] |
| **directions** | [**List<DirectionsEnum>**](#Enum--DirectionsEnum) |  |  [optional] |
| **dateRanges** | **List&lt;String&gt;** |  |  [optional] |
| **mediaTypes** | [**List<MediaTypesEnum>**](#Enum--MediaTypesEnum) |  |  [optional] |
| **forQueues** | [**List&lt;Queue&gt;**](Queue) |  |  [optional] |
| **duration** | [**DurationCondition**](DurationCondition) |  |  [optional] |
| **wrapupCodes** | [**List&lt;WrapupCode&gt;**](WrapupCode) |  |  [optional] |
| **timeAllowed** | [**TimeAllowed**](TimeAllowed) |  |  [optional] |
| **teams** | [**List&lt;Team&gt;**](Team) | Teams to match conversations against |  [optional] |
| **customerParticipation** | [**CustomerParticipationEnum**](#Enum--CustomerParticipationEnum) | This condition is to filter out conversation with and without customer participation. |  [optional] |


## Enum: DirectionsEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| INBOUND | &quot;INBOUND&quot; |
| OUTBOUND | &quot;OUTBOUND&quot; |


## Enum: MediaTypesEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| CALL | &quot;CALL&quot; |
| CHAT | &quot;CHAT&quot; |


## Enum: CustomerParticipationEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| YES | &quot;YES&quot; | 
| NO | &quot;NO&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:231.0.0_
