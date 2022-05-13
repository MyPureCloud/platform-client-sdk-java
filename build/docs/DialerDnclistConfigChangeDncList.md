---
title: DialerDnclistConfigChangeDncList
---
## DialerDnclistConfigChangeDncList


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **importStatus** | <!----><!---->[**DialerDnclistConfigChangeImportStatus**](DialerDnclistConfigChangeImportStatus.html)<!----> |  |  [optional] |
| **size** | <!----><!---->**Integer**<!----> | the number of phone numbers in the do not call list |  [optional] |
| **dncSourceType** | [**DncSourceTypeEnum**](#DncSourceTypeEnum)<!----> | the type of dnc list being created, rds (csv file), gryphon, or dnc.com |  [optional] |
| **loginId** | <!----><!---->**String**<!----> | the loginId if the dncSourceType is dnc.com |  [optional] |
| **dncCodes** | <!----><!---->**List&lt;String&gt;**<!----> | the list of dnc.com codes to be treated as DNC |  [optional] |
| **licenseId** | <!----><!---->**String**<!----> | the license number if the dncSourceType is gryphon |  [optional] |
| **contactMethod** | [**ContactMethodEnum**](#ContactMethodEnum)<!----> |  |  [optional] |
| **division** | <!----><!---->[**DialerDnclistConfigChangeUriReference**](DialerDnclistConfigChangeUriReference.html)<!----> |  |  [optional] |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> | The UI-visible name of the object |  [optional] |
| **dateCreated** | <!----><!---->[**Date**](Date.html)<!----> | Creation time of the entity |  [optional] |
| **dateModified** | <!----><!---->[**Date**](Date.html)<!----> | Last modified time of the entity |  [optional] |
| **version** | <!----><!---->**Integer**<!----> | Required for updates, must match the version number of the most recent update |  [optional] |
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
| EMAIL | &quot;EMAIL&quot; | 
| PHONE | &quot;PHONE&quot; | 
{: class="table table-striped"}



