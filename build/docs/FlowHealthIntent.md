# FlowHealthIntent


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **flowVersionInfo** | [**FlowHealthIntentVersionInfo**](FlowHealthIntentVersionInfo) | Info about given flow version. |  [optional] |
| **language** | [**LanguageEnum**](#Enum--LanguageEnum) | Language provided for this intent's health. |  [optional] |
| **health** | [**HealthInfo**](HealthInfo) | Health computation details for given language. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: LanguageEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| EN_US | &quot;en-us&quot; | 
| EN_GB | &quot;en-gb&quot; | 
| EN_AU | &quot;en-au&quot; | 
| EN_ZA | &quot;en-za&quot; | 
| EN_NZ | &quot;en-nz&quot; | 
| EN_IE | &quot;en-ie&quot; | 
| FR_CA | &quot;fr-ca&quot; | 
| FR_FR | &quot;fr-fr&quot; | 
| ES_US | &quot;es-us&quot; | 
| ES_ES | &quot;es-es&quot; | 
| ES_MX | &quot;es-mx&quot; | 
| DE_DE | &quot;de-de&quot; | 
| IT_IT | &quot;it-it&quot; | 
| PT_BR | &quot;pt-br&quot; | 
| PT_PT | &quot;pt-pt&quot; | 
| NL_NL | &quot;nl-nl&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:233.0.0_
