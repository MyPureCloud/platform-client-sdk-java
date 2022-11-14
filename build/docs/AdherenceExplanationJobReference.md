---
title: AdherenceExplanationJobReference
---
## AdherenceExplanationJobReference


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **type** | [**TypeEnum**](#TypeEnum)<!----> | The type of the adherence explanation job |  [optional] |
| **status** | [**StatusEnum**](#StatusEnum)<!----> | The status of the adherence explanation job |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ADDEXPLANATION | &quot;AddExplanation&quot; | 
| UPDATEEXPLANATION | &quot;UpdateExplanation&quot; | 
| QUERYAGENTEXPLANATIONS | &quot;QueryAgentExplanations&quot; | 
| QUERYBUEXPLANATIONS | &quot;QueryBuExplanations&quot; | 
{: class="table table-striped"}


<a name="StatusEnum"></a>

## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PROCESSING | &quot;Processing&quot; | 
| COMPLETE | &quot;Complete&quot; | 
| ERROR | &quot;Error&quot; | 
{: class="table table-striped"}



