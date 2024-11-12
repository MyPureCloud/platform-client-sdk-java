# OrganizationPresenceDefinition


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | The type of definition |  [optional] |
| **languageLabels** | **Map&lt;String, String&gt;** | The label used for the definition in each specified language |  |
| **systemPresence** | [**SystemPresenceEnum**](#Enum--SystemPresenceEnum) |  |  [optional] |
| **divisionId** | **String** |  |  [optional] |
| **deactivated** | **Boolean** |  |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| SYSTEM | &quot;System&quot; | 
| USER | &quot;User&quot; | 


## Enum: SystemPresenceEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| AVAILABLE | &quot;Available&quot; | 
| AWAY | &quot;Away&quot; | 
| BUSY | &quot;Busy&quot; | 
| OFFLINE | &quot;Offline&quot; | 
| IDLE | &quot;Idle&quot; | 
| ONQUEUE | &quot;OnQueue&quot; | 
| MEAL | &quot;Meal&quot; | 
| TRAINING | &quot;Training&quot; | 
| MEETING | &quot;Meeting&quot; | 
| BREAK | &quot;Break&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:214.0.0_
