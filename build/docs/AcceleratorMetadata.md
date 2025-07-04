# AcceleratorMetadata


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** | name of this accelerator |  [optional] |
| **description** | **String** | a description of the general purpose of this accelerator |  [optional] |
| **origin** | [**OriginEnum**](#Enum--OriginEnum) | where the accelerator originated |  [optional] |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | type of the artifact |  [optional] |
| **classification** | **String** | architectural classification into which the accelerator belongs |  [optional] |
| **tags** | **List&lt;String&gt;** | tags |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: OriginEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| COMMUNITY | &quot;Community&quot; | 
| PARTNER | &quot;Partner&quot; | 
| GENESYS | &quot;Genesys&quot; | 


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| MODULE | &quot;Module&quot; | 
| ACCELERATOR | &quot;Accelerator&quot; | 
| BLUEPRINT | &quot;Blueprint&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
