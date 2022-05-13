---
title: DocumentAudit
---
## DocumentAudit


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> |  |  [optional] |
| **user** | <!----><!---->[**DomainEntityRef**](DomainEntityRef.html)<!----> |  |  [optional] |
| **workspace** | <!----><!---->[**DomainEntityRef**](DomainEntityRef.html)<!----> |  |  [optional] |
| **transactionId** | <!----><!---->**String**<!----> |  |  [optional] |
| **transactionInitiator** | <!----><!---->**Boolean**<!----> |  |  [optional] |
| **application** | <!----><!---->**String**<!----> |  |  [optional] |
| **serviceName** | <!----><!---->**String**<!----> |  |  [optional] |
| **level** | [**LevelEnum**](#LevelEnum)<!----> |  |  [optional] |
| **timestamp** | <!----><!---->[**Date**](Date.html)<!----> | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **status** | [**StatusEnum**](#StatusEnum)<!----> |  |  [optional] |
| **actionContext** | [**ActionContextEnum**](#ActionContextEnum)<!----> |  |  [optional] |
| **action** | [**ActionEnum**](#ActionEnum)<!----> |  |  [optional] |
| **entity** | <!----><!---->[**AuditEntityReference**](AuditEntityReference.html)<!----> |  |  [optional] |
| **changes** | <!----><!---->[**List&lt;AuditChange&gt;**](AuditChange.html)<!----> |  |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="LevelEnum"></a>

## Enum: LevelEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| USER | &quot;USER&quot; | 
| SYSTEM | &quot;SYSTEM&quot; | 
{: class="table table-striped"}


<a name="StatusEnum"></a>

## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| SUCCESS | &quot;SUCCESS&quot; | 
| FAILURE | &quot;FAILURE&quot; | 
| WARNING | &quot;WARNING&quot; | 
{: class="table table-striped"}


<a name="ActionContextEnum"></a>

## Enum: ActionContextEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CREATE | &quot;CREATE&quot; | 
| READ | &quot;READ&quot; | 
| UPDATE | &quot;UPDATE&quot; | 
| DELETE | &quot;DELETE&quot; | 
| DOWNLOAD | &quot;DOWNLOAD&quot; | 
| VIEW | &quot;VIEW&quot; | 
| UPLOAD | &quot;UPLOAD&quot; | 
| SAVE | &quot;SAVE&quot; | 
| MOVE | &quot;MOVE&quot; | 
| COPY | &quot;COPY&quot; | 
| ADD | &quot;ADD&quot; | 
| REMOVE | &quot;REMOVE&quot; | 
| RECEIVE | &quot;RECEIVE&quot; | 
| CONVERT | &quot;CONVERT&quot; | 
| FAX | &quot;FAX&quot; | 
| CREATE_COVERPAGE | &quot;CREATE_COVERPAGE&quot; | 
| USER_ADD | &quot;USER_ADD&quot; | 
| USER_REMOVE | &quot;USER_REMOVE&quot; | 
| MEMBER_ADD | &quot;MEMBER_ADD&quot; | 
| MEMBER_REMOVE | &quot;MEMBER_REMOVE&quot; | 
| MEMBER_UPDATE | &quot;MEMBER_UPDATE&quot; | 
| TAG_ADD | &quot;TAG_ADD&quot; | 
| TAG_REMOVE | &quot;TAG_REMOVE&quot; | 
| TAG_UPDATE | &quot;TAG_UPDATE&quot; | 
| ATTRIBUTE_ADD | &quot;ATTRIBUTE_ADD&quot; | 
| ATTRIBUTE_REMOVE | &quot;ATTRIBUTE_REMOVE&quot; | 
| ATTRIBUTE_UPDATE | &quot;ATTRIBUTE_UPDATE&quot; | 
| ATTRIBUTE_GROUP_INSTANCE_ADD | &quot;ATTRIBUTE_GROUP_INSTANCE_ADD&quot; | 
| ATTRIBUTE_GROUP_INSTANCE_REMOVE | &quot;ATTRIBUTE_GROUP_INSTANCE_REMOVE&quot; | 
| ATTRIBUTE_GROUP_INSTANCE_UPDATE | &quot;ATTRIBUTE_GROUP_INSTANCE_UPDATE&quot; | 
| INDEX_SAVE | &quot;INDEX_SAVE&quot; | 
| INDEX_DELETE | &quot;INDEX_DELETE&quot; | 
| INDEX_CREATE | &quot;INDEX_CREATE&quot; | 
| FILE_SAVE | &quot;FILE_SAVE&quot; | 
| FILE_DELETE | &quot;FILE_DELETE&quot; | 
| FILE_READ | &quot;FILE_READ&quot; | 
| THUMBNAIL_CREATE | &quot;THUMBNAIL_CREATE&quot; | 
| TEXT_EXTRACT | &quot;TEXT_EXTRACT&quot; | 
| SHARE_ADD | &quot;SHARE_ADD&quot; | 
| SHARE_REMOVE | &quot;SHARE_REMOVE&quot; | 
| VERSION_CREATE | &quot;VERSION_CREATE&quot; | 
{: class="table table-striped"}


<a name="ActionEnum"></a>

## Enum: ActionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CREATE | &quot;CREATE&quot; | 
| READ | &quot;READ&quot; | 
| UPDATE | &quot;UPDATE&quot; | 
| DELETE | &quot;DELETE&quot; | 
| DOWNLOAD | &quot;DOWNLOAD&quot; | 
| VIEW | &quot;VIEW&quot; | 
| UPLOAD | &quot;UPLOAD&quot; | 
| SAVE | &quot;SAVE&quot; | 
| MOVE | &quot;MOVE&quot; | 
| COPY | &quot;COPY&quot; | 
| ADD | &quot;ADD&quot; | 
| REMOVE | &quot;REMOVE&quot; | 
| RECEIVE | &quot;RECEIVE&quot; | 
| CONVERT | &quot;CONVERT&quot; | 
| FAX | &quot;FAX&quot; | 
| CREATE_COVERPAGE | &quot;CREATE_COVERPAGE&quot; | 
| USER_ADD | &quot;USER_ADD&quot; | 
| USER_REMOVE | &quot;USER_REMOVE&quot; | 
| MEMBER_ADD | &quot;MEMBER_ADD&quot; | 
| MEMBER_REMOVE | &quot;MEMBER_REMOVE&quot; | 
| MEMBER_UPDATE | &quot;MEMBER_UPDATE&quot; | 
| TAG_ADD | &quot;TAG_ADD&quot; | 
| TAG_REMOVE | &quot;TAG_REMOVE&quot; | 
| TAG_UPDATE | &quot;TAG_UPDATE&quot; | 
| ATTRIBUTE_ADD | &quot;ATTRIBUTE_ADD&quot; | 
| ATTRIBUTE_REMOVE | &quot;ATTRIBUTE_REMOVE&quot; | 
| ATTRIBUTE_UPDATE | &quot;ATTRIBUTE_UPDATE&quot; | 
| ATTRIBUTE_GROUP_INSTANCE_ADD | &quot;ATTRIBUTE_GROUP_INSTANCE_ADD&quot; | 
| ATTRIBUTE_GROUP_INSTANCE_REMOVE | &quot;ATTRIBUTE_GROUP_INSTANCE_REMOVE&quot; | 
| ATTRIBUTE_GROUP_INSTANCE_UPDATE | &quot;ATTRIBUTE_GROUP_INSTANCE_UPDATE&quot; | 
| INDEX_SAVE | &quot;INDEX_SAVE&quot; | 
| INDEX_DELETE | &quot;INDEX_DELETE&quot; | 
| INDEX_CREATE | &quot;INDEX_CREATE&quot; | 
| FILE_SAVE | &quot;FILE_SAVE&quot; | 
| FILE_DELETE | &quot;FILE_DELETE&quot; | 
| FILE_READ | &quot;FILE_READ&quot; | 
| THUMBNAIL_CREATE | &quot;THUMBNAIL_CREATE&quot; | 
| TEXT_EXTRACT | &quot;TEXT_EXTRACT&quot; | 
| SHARE_ADD | &quot;SHARE_ADD&quot; | 
| SHARE_REMOVE | &quot;SHARE_REMOVE&quot; | 
| VERSION_CREATE | &quot;VERSION_CREATE&quot; | 
{: class="table table-striped"}



