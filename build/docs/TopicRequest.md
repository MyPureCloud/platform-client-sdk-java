---
title: TopicRequest
---
## TopicRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | <!----><!---->**String**<!----> | The topic name |  |
| **description** | <!----><!---->**String**<!----> | The topic description |  [optional] |
| **strictness** | [**StrictnessEnum**](#StrictnessEnum)<!----> | The topic strictness, default value is 72 |  [optional] |
| **programIds** | <!----><!---->**List&lt;String&gt;**<!----> | The ids of programs associated to the topic |  [optional] |
| **tags** | <!----><!---->**List&lt;String&gt;**<!----> | The topic tags |  [optional] |
| **dialect** | <!----><!---->**String**<!----> | The topic dialect |  |
| **participants** | [**ParticipantsEnum**](#ParticipantsEnum)<!----> | The topic participants, default value is All |  [optional] |
| **phrases** | <!----><!---->[**List&lt;Phrase&gt;**](Phrase.html)<!----> | The topic phrases |  [optional] |
{: class="table table-striped"}


<a name="StrictnessEnum"></a>

## Enum: StrictnessEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| _1 | &quot;1&quot; | 
| _55 | &quot;55&quot; | 
| _65 | &quot;65&quot; | 
| _72 | &quot;72&quot; | 
| _85 | &quot;85&quot; | 
| _90 | &quot;90&quot; | 
{: class="table table-striped"}


<a name="ParticipantsEnum"></a>

## Enum: ParticipantsEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| EXTERNAL | &quot;External&quot; | 
| INTERNAL | &quot;Internal&quot; | 
| ALL | &quot;All&quot; | 
{: class="table table-striped"}



