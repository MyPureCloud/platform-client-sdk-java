---
title: ImapSettings
---
## ImapSettings


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **integration** | <!----><!---->[**DomainEntityRef**](DomainEntityRef.html)<!----> | The IMAP server integration to use for ingesting emails. |  [optional] |
| **status** | [**StatusEnum**](#StatusEnum)<!----> | Imap Server Status |  [optional] |
| **errorInfo** | <!----><!---->[**EmailErrorInfo**](EmailErrorInfo.html)<!----> | Additional Imap Server error information |  [optional] |
{: class="table table-striped"}


<a name="StatusEnum"></a>

## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ACTIVE | &quot;Active&quot; | 
| AWAITINGFOLDERS | &quot;AwaitingFolders&quot; | 
| ERROR | &quot;Error&quot; | 
| INACTIVE | &quot;Inactive&quot; | 
| INTEGRATIONDELETED | &quot;IntegrationDeleted&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
{: class="table table-striped"}



