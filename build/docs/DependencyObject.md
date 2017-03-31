---
title: DependencyObject
---

## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **version** | **String** |  |  [optional] |
| **type** | [**TypeEnum**](#TypeEnum) |  |  [optional] |
| **deleted** | **Boolean** |  |  [optional] |
| **updated** | **Boolean** |  |  [optional] |
| **consumedResources** | [**List&lt;Dependency&gt;**](Dependency.html) |  |  [optional] |
| **consumingResources** | [**List&lt;Dependency&gt;**](Dependency.html) |  |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| ACDLANGUAGE | &quot;ACDLANGUAGE&quot; |
| ACDSKILL | &quot;ACDSKILL&quot; |
| ACDWRAPUPCODE | &quot;ACDWRAPUPCODE&quot; |
| BRIDGEACTION | &quot;BRIDGEACTION&quot; |
| COMPOSERSCRIPT | &quot;COMPOSERSCRIPT&quot; |
| CONTACTLIST | &quot;CONTACTLIST&quot; |
| DATAACTION | &quot;DATAACTION&quot; |
| GROUP | &quot;GROUP&quot; |
| INBOUNDCALLFLOW | &quot;INBOUNDCALLFLOW&quot; |
| INBOUNDEMAILFLOW | &quot;INBOUNDEMAILFLOW&quot; |
| INQUEUECALLFLOW | &quot;INQUEUECALLFLOW&quot; |
| IVRCONFIGURATION | &quot;IVRCONFIGURATION&quot; |
| LANGUAGE | &quot;LANGUAGE&quot; |
| OUTBOUNDCALLFLOW | &quot;OUTBOUNDCALLFLOW&quot; |
| QUEUE | &quot;QUEUE&quot; |
| RESPONSE | &quot;RESPONSE&quot; |
| SECUREACTION | &quot;SECUREACTION&quot; |
| SECURECALLFLOW | &quot;SECURECALLFLOW&quot; |
| SYSTEMPROMPT | &quot;SYSTEMPROMPT&quot; |
| USER | &quot;USER&quot; |
| USERPROMPT | &quot;USERPROMPT&quot; |
| VOICEXML | &quot;VOICEXML&quot; |
| WORKFLOW | &quot;WORKFLOW&quot; |
{: class="table table-striped"}


