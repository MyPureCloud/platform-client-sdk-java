---
title: DialerDnclistConfigChangeDncList
---
## DialerDnclistConfigChangeDncList


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> |  |  [optional] |
| **name** | <!----><!---->**String**<!----> |  |  [optional] |
| **dateCreated** | <!----><!---->[**Date**](Date.html)<!----> |  |  [optional] |
| **dateModified** | <!----><!---->[**Date**](Date.html)<!----> |  |  [optional] |
| **version** | <!----><!---->**Integer**<!----> |  |  [optional] |
| **importStatus** | <!----><!---->[**DialerDnclistConfigChangeImportStatus**](DialerDnclistConfigChangeImportStatus.html)<!----> |  |  [optional] |
| **size** | <!----><!---->**Integer**<!----> |  |  [optional] |
| **dncSourceType** | [**DncSourceTypeEnum**](#DncSourceTypeEnum)<!----> |  |  [optional] |
| **loginId** | <!----><!---->**String**<!----> |  |  [optional] |
| **dncCodes** | <!----><!---->**List&lt;String&gt;**<!----> |  |  [optional] |
| **licenseId** | <!----><!---->**String**<!----> |  |  [optional] |
| **contactMethod** | [**ContactMethodEnum**](#ContactMethodEnum)<!----> |  |  [optional] |
| **division** | <!----><!---->[**DialerDnclistConfigChangeUriReference**](DialerDnclistConfigChangeUriReference.html)<!----> |  |  [optional] |
| **additionalProperties** | <!----><!---->**Object**<!----> |  |  [optional] |
{: class="table table-striped"}


<a name="DncSourceTypeEnum"></a>

## Enum: DncSourceTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| RDS | &quot;RDS&quot; |
| DNC_COM | &quot;DNC_COM&quot; |
| GRYPHON | &quot;GRYPHON&quot; |
{: class="table table-striped"}


<a name="ContactMethodEnum"></a>

## Enum: ContactMethodEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| EMAIL | &quot;EMAIL&quot; |
| PHONE | &quot;PHONE&quot; |
{: class="table table-striped"}



