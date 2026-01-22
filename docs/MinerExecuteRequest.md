# MinerExecuteRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **dateStart** | [**LocalDate**](LocalDate) | Start date for the date range to mine. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  [optional] |
| **dateEnd** | [**LocalDate**](LocalDate) | End date for the date range to mine. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  [optional] |
| **uploadKey** | **String** | Location of input conversations. |  [optional] |
| **mediaType** | [**MediaTypeEnum**](#Enum--MediaTypeEnum) | Media type for filtering conversations. |  [optional] |
| **participantType** | [**ParticipantTypeEnum**](#Enum--ParticipantTypeEnum) | Type of the participant, either agent, customer or both. |  [optional] |
| **queueIds** | **List&lt;String&gt;** | List of queue IDs for filtering conversations. |  [optional] |


## Enum: MediaTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CHAT | &quot;Chat&quot; | 
| CALL | &quot;Call&quot; | 
| MESSAGE | &quot;Message&quot; | 
| EMAIL | &quot;Email&quot; | 


## Enum: ParticipantTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CUSTOMER | &quot;Customer&quot; | 
| AGENT | &quot;Agent&quot; | 
| BOTH | &quot;Both&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:245.0.0_
