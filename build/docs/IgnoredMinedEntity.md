# IgnoredMinedEntity


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | Unique identifier for the ignored entity |  |
| **text** | **String** | Text of the ignored entity |  |
| **participant** | [**ParticipantEnum**](#Enum--ParticipantEnum) | Type of participant |  |
| **dateCreated** | [**Date**](Date) | Date when the ignored entity was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  |
| **dateModified** | [**Date**](Date) | Date when the ignored entity was last modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  |
| **mediaType** | [**MediaTypeEnum**](#Enum--MediaTypeEnum) | Media Type for the entity (Optional) |  [optional] |


## Enum: ParticipantEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CUSTOMER | &quot;Customer&quot; | 
| AGENT | &quot;Agent&quot; | 
| BOTH | &quot;Both&quot; | 


## Enum: MediaTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CHAT | &quot;Chat&quot; | 
| CALL | &quot;Call&quot; | 
| MESSAGE | &quot;Message&quot; | 
| EMAIL | &quot;Email&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:238.0.0_
