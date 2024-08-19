# ImapSettings


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **integration** | [**DomainEntityRef**](DomainEntityRef) | The IMAP server integration to use for ingesting emails. |  [optional] |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | Imap Server Status |  [optional] |
| **errorInfo** | [**EmailErrorInfo**](EmailErrorInfo) | Additional Imap Server error information |  [optional] |
{: class="table table-striped"}


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




_com.mypurecloud.sdk.v2:platform-client-v2:208.0.0_
