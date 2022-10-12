---
title: DocumentQueryInterval
---
## DocumentQueryInterval


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **field** | [**FieldEnum**](#FieldEnum)<!----> | Specifies the date field to be used for date and time range. |  [optional] |
| **value** | <!----><!---->**String**<!----> | Specifies the date and time range for filtering the documents. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss |  [optional] |
{: class="table table-striped"}


<a name="FieldEnum"></a>

## Enum: FieldEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| DATECREATED | &quot;dateCreated&quot; | 
| DATEMODIFIED | &quot;dateModified&quot; | 
| DATEPUBLISHED | &quot;datePublished&quot; | 
{: class="table table-striped"}



