---
title: SkillGroup
---
## SkillGroup


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> | The group name. |  |
| **division** | <!----><!---->[**WritableDivision**](WritableDivision.html)<!----> | The division to which this entity belongs. |  [optional] |
| **description** | <!----><!---->**String**<!----> | Group description |  [optional] |
| **memberCount** | <!----><!---->**Long**<!----> | Estimated number of members in this group. It can take some time for the count to be updated after expressions are changed. |  [optional] |
| **dateModified** | <!----><!---->[**Date**](Date.html)<!----> | Last modified date/time of the skill group. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateCreated** | <!----><!---->[**Date**](Date.html)<!----> | Created date/time of the skill group. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **status** | [**StatusEnum**](#StatusEnum)<!----> | Group's filling status |  [optional] |
| **skillConditions** | <!----><!---->[**List&lt;SkillGroupCondition&gt;**](SkillGroupCondition.html)<!----> | Conditions for this group |  |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="StatusEnum"></a>

## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| INPROGRESS | &quot;InProgress&quot; | 
| COMPLETE | &quot;Complete&quot; | 
{: class="table table-striped"}



