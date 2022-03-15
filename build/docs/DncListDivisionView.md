---
title: DncListDivisionView
---
## DncListDivisionView


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> |  |  [optional] |
| **division** | <!----><!---->[**Division**](Division.html)<!----> | The division to which this entity belongs. |  [optional] |
| **importStatus** | <!----><!---->[**ImportStatus**](ImportStatus.html)<!----> | The status of the import process. |  [optional] |
| **size** | <!----><!---->**Long**<!----> | The number of contacts in the DncList. |  [optional] |
| **dncSourceType** | [**DncSourceTypeEnum**](#DncSourceTypeEnum)<!----> | The type of the DncList. |  [optional] |
| **contactMethod** | [**ContactMethodEnum**](#ContactMethodEnum)<!----> | The contact method. Required if dncSourceType is rds. |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="DncSourceTypeEnum"></a>

## Enum: DncSourceTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| RDS | &quot;rds&quot; |
| DNC_COM | &quot;dnc.com&quot; |
| GRYPHON | &quot;gryphon&quot; |
{: class="table table-striped"}


<a name="ContactMethodEnum"></a>

## Enum: ContactMethodEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| EMAIL | &quot;Email&quot; |
| PHONE | &quot;Phone&quot; |
{: class="table table-striped"}



