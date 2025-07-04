# WebChatMemberInfo


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The communicationId of this member. |  [optional] |
| **displayName** | **String** | The display name of the member. |  [optional] |
| **firstName** | **String** | The first name of the member. |  [optional] |
| **lastName** | **String** | The last name of the member. |  [optional] |
| **email** | **String** | The email address of the member. |  [optional] |
| **phoneNumber** | **String** | The phone number of the member. |  [optional] |
| **avatarImageUrl** | **String** | The url to the avatar image of the member. |  [optional] |
| **role** | [**RoleEnum**](#Enum--RoleEnum) | The role of the member, one of [agent, customer, acd, workflow] |  |
| **joinDate** | [**Date**](Date) | The time the member joined the conversation. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **leaveDate** | [**Date**](Date) | The time the member left the conversation, or null if the member is still active in the conversation. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **authenticatedGuest** | **Boolean** | If true, the guest member is an authenticated guest. |  [optional] |
| **customFields** | **Map&lt;String, String&gt;** | Any custom fields of information pertaining to this member. |  [optional] |
| **state** | [**StateEnum**](#Enum--StateEnum) | The connection state of this member. |  [optional] |


## Enum: RoleEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| AGENT | &quot;AGENT&quot; | 
| CUSTOMER | &quot;CUSTOMER&quot; | 
| WORKFLOW | &quot;WORKFLOW&quot; | 
| ACD | &quot;ACD&quot; | 


## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CONNECTED | &quot;CONNECTED&quot; | 
| DISCONNECTED | &quot;DISCONNECTED&quot; | 
| ALERTING | &quot;ALERTING&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
