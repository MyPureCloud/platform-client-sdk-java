# V2IntegrationPresenceEventPresenceActivityEvent


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **userId** | **String** |  |  [optional] |
| **eventType** | [**EventTypeEnum**](#Enum--EventTypeEnum) |  |  [optional] |
| **source** | **String** |  |  [optional] |
| **modifiedDate** | [**Date**](Date) |  |  [optional] |
| **presenceDefinition** | [**V2IntegrationPresenceEventOrganizationPresence**](V2IntegrationPresenceEventOrganizationPresence) |  |  [optional] |
| **message** | **String** |  |  [optional] |
| **currentDisplaySourceId** | **String** |  |  [optional] |
| **previousDisplaySourceId** | **String** |  |  [optional] |


## Enum: EventTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| USERPRESENCESTATUSCHANGED | &quot;UserPresenceStatusChanged&quot; | 
| USERPRIMARYPRESENCESOURCECHANGED | &quot;UserPrimaryPresenceSourceChanged&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:224.0.0_
