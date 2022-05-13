---
title: LearningModuleInformStepRequest
---
## LearningModuleInformStepRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#TypeEnum)<!----> | The learning module inform step type |  |
| **name** | <!----><!---->**String**<!----> | The name of the inform step or content |  [optional] |
| **value** | <!----><!---->**String**<!----> | The value for inform step |  |
| **sharingUri** | <!----><!---->**String**<!----> | The sharing uri for Content type inform step |  [optional] |
| **contentType** | <!----><!---->**String**<!----> | The document type for Content type Inform step |  [optional] |
| **order** | <!----><!---->**Integer**<!----> | The order of inform step in a learning module |  |
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| URL | &quot;Url&quot; | 
| CONTENT | &quot;Content&quot; | 
| RICHTEXT | &quot;RichText&quot; | 
{: class="table table-striped"}



