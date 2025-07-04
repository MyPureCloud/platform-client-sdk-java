# EventLog


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **errorEntity** | [**DomainEntityRef**](DomainEntityRef) |  |  [optional] |
| **relatedEntity** | [**DomainEntityRef**](DomainEntityRef) |  |  [optional] |
| **timestamp** | [**Date**](Date) | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **level** | [**LevelEnum**](#Enum--LevelEnum) |  |  [optional] |
| **category** | [**CategoryEnum**](#Enum--CategoryEnum) |  |  [optional] |
| **correlationId** | **String** |  |  [optional] |
| **eventMessage** | [**EventMessage**](EventMessage) |  |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: LevelEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| INFO | &quot;INFO&quot; | 
| WARNING | &quot;WARNING&quot; | 
| ERROR | &quot;ERROR&quot; | 


## Enum: CategoryEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CALLBACK | &quot;CALLBACK&quot; | 
| CALL_RESTRICTION | &quot;CALL_RESTRICTION&quot; | 
| CALL_RULE | &quot;CALL_RULE&quot; | 
| CAMPAIGN | &quot;CAMPAIGN&quot; | 
| CAMPAIGN_RULE | &quot;CAMPAIGN_RULE&quot; | 
| CONTACT | &quot;CONTACT&quot; | 
| CONTACT_LIST_FILTER | &quot;CONTACT_LIST_FILTER&quot; | 
| DIGITAL_RULE | &quot;DIGITAL_RULE&quot; | 
| DNC_LIST | &quot;DNC_LIST&quot; | 
| ENTITY_LIMIT | &quot;ENTITY_LIMIT&quot; | 
| IMPORT_ERROR | &quot;IMPORT_ERROR&quot; | 
| MESSAGE_RESTRICTION | &quot;MESSAGE_RESTRICTION&quot; | 
| MESSAGING_CAMPAIGN | &quot;MESSAGING_CAMPAIGN&quot; | 
| IMPORT_TEMPLATE | &quot;IMPORT_TEMPLATE&quot; | 
| ORGANIZATION_CONFIGURATION | &quot;ORGANIZATION_CONFIGURATION&quot; | 
| SCHEDULE | &quot;SCHEDULE&quot; | 
| MESSAGING_CAMPAIGN_SCHEDULE | &quot;MESSAGING_CAMPAIGN_SCHEDULE&quot; | 
| EMAIL_CAMPAIGN_SCHEDULE | &quot;EMAIL_CAMPAIGN_SCHEDULE&quot; | 
| WHATSAPP_CAMPAIGN_SCHEDULE | &quot;WHATSAPP_CAMPAIGN_SCHEDULE&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
