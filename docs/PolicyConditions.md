# PolicyConditions


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **forUsers** | [**List&lt;User&gt;**](User) |  |  [optional] |
| **directions** | [**List<DirectionsEnum>**](#Enum--DirectionsEnum) |  |  [optional] |
| **dateRanges** | **List&lt;String&gt;** |  |  [optional] |
| **mediaTypes** | [**List<MediaTypesEnum>**](#Enum--MediaTypesEnum) |  |  [optional] |
| **forQueues** | [**List&lt;Queue&gt;**](Queue) |  |  [optional] |
| **duration** | [**DurationCondition**](DurationCondition) |  |  [optional] |
| **wrapupCodes** | [**List&lt;WrapupCode&gt;**](WrapupCode) |  |  [optional] |
| **timeAllowed** | [**TimeAllowed**](TimeAllowed) |  |  [optional] |
| **teams** | [**List&lt;Team&gt;**](Team) | Teams to match conversations against |  [optional] |
| **customerParticipation** | [**CustomerParticipationEnum**](#Enum--CustomerParticipationEnum) | This condition is to filter out conversation with and without customer participation. |  [optional] |
{: class="table table-striped"}


## Enum: DirectionsEnum

| Name | Value |
| ---- | ----- |
| INBOUND | &quot;INBOUND&quot; |
| OUTBOUND | &quot;OUTBOUND&quot; |
{: class="table table-striped"}


## Enum: MediaTypesEnum

| Name | Value |
| ---- | ----- |
| CALL | &quot;CALL&quot; |
| CHAT | &quot;CHAT&quot; |
{: class="table table-striped"}


## Enum: CustomerParticipationEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| YES | &quot;YES&quot; | 
| NO | &quot;NO&quot; | 
{: class="table table-striped"}




_com.mypurecloud.sdk.v2:platform-client-v2:208.0.0_
