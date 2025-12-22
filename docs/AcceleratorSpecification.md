# AcceleratorSpecification


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
| **permissions** | **List&lt;String&gt;** | Genesys Cloud permissions required to install the accelerator |  [optional] |
| **products** | **List&lt;String&gt;** | Genesys Cloud products required to install the accelerator |  [optional] |
| **documentation** | [**List&lt;MetadataDocumentation&gt;**](MetadataDocumentation) | additional documentation about the artifact |  [optional] |
| **presentation** | [**List&lt;MetadataPresentation&gt;**](MetadataPresentation) | presentation of data fields to be gathered for the accelerator |  [optional] |
| **results** | [**MetadataResults**](MetadataResults) | resources created or modified as a result of running the accelerator |  [optional] |
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




_com.mypurecloud.sdk.v2:platform-client-v2:241.0.0_
