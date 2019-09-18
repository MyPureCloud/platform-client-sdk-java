---
title: ScimError
---
## ScimError


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **status** | **String** | HTTP Status Code |  [optional] |
| **scimType** | [**ScimTypeEnum**](#ScimTypeEnum) | Optional SCIM Error Type when httpStatus is 400 error |  [optional] |
| **detail** | **String** | Optional detailed error description |  [optional] |
| **schemas** | **List&lt;String&gt;** | Schemas for the SCIM Error |  [optional] |
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



