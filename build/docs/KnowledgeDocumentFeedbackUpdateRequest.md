---
title: KnowledgeDocumentFeedbackUpdateRequest
---
## KnowledgeDocumentFeedbackUpdateRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **rating** | [**RatingEnum**](#RatingEnum)<!----> | Feedback rating. |  |
| **reason** | [**ReasonEnum**](#ReasonEnum)<!----> | Feedback reason |  [optional] |
| **comment** | <!----><!---->**String**<!----> | Feedback comment |  [optional] |
| **state** | [**StateEnum**](#StateEnum)<!----> | Feedback state |  [optional] |
{: class="table table-striped"}


<a name="RatingEnum"></a>

## Enum: RatingEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| NEGATIVE | &quot;Negative&quot; | 
| POSITIVE | &quot;Positive&quot; | 
{: class="table table-striped"}


<a name="ReasonEnum"></a>

## Enum: ReasonEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| DOCUMENTCONTENT | &quot;DocumentContent&quot; | 
| SEARCHRESULTS | &quot;SearchResults&quot; | 
{: class="table table-striped"}


<a name="StateEnum"></a>

## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| DRAFT | &quot;Draft&quot; | 
| FINAL | &quot;Final&quot; | 
{: class="table table-striped"}



