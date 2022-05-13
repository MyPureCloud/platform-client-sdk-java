---
title: ScimError
---
## ScimError


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **schemas** | <!----><!---->**List&lt;String&gt;**<!----> | The list of schemas for the SCIM error. |  [optional] |
| **status** | <!----><!---->**String**<!----> | The HTTP status code returned for the SCIM error. |  [optional] |
| **scimType** | [**ScimTypeEnum**](#ScimTypeEnum)<!----> | The type of SCIM error when httpStatus is a \"400\" error. |  [optional] |
| **detail** | <!----><!---->**String**<!----> | The detailed description of the SCIM error. |  [optional] |
{: class="table table-striped"}


<a name="ScimTypeEnum"></a>

## Enum: ScimTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| INVALIDFILTER | &quot;invalidFilter&quot; | 
| TOOMANY | &quot;tooMany&quot; | 
| UNIQUENESS | &quot;uniqueness&quot; | 
| MUTABILITY | &quot;mutability&quot; | 
| INVALIDSYNTAX | &quot;invalidSyntax&quot; | 
| INVALIDPATH | &quot;invalidPath&quot; | 
| NOTARGET | &quot;noTarget&quot; | 
| INVALIDVALUE | &quot;invalidValue&quot; | 
| INVALIDVERS | &quot;invalidVers&quot; | 
| SENSITIVE | &quot;sensitive&quot; | 
{: class="table table-striped"}



