---
title: Program
---
## Program


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **description** | **String** |  |  [optional] |
| **applied** | **Boolean** |  |  [optional] |
| **status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
| **topics** | [**List&lt;BaseTopicEntitiy&gt;**](BaseTopicEntitiy.html) |  |  [optional] |
| **tags** | **List&lt;String&gt;** |  |  [optional] |
| **modifiedBy** | [**User**](User.html) |  |  [optional] |
| **dateModified** | [**Date**](Date.html) | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="StatusEnum"></a>

## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| ACTIVE | &quot;Active&quot; |
| INACTIVE | &quot;Inactive&quot; |
{: class="table table-striped"}



