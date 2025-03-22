# DialerContactlistfilterConfigChangeContactListFilter


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **contactList** | [**DialerContactlistfilterConfigChangeUriReference**](DialerContactlistfilterConfigChangeUriReference) |  |  [optional] |
| **contactListColumns** | **List&lt;String&gt;** | The list of contact list columns |  [optional] |
| **clauses** | [**List&lt;DialerContactlistfilterConfigChangeFilterClause&gt;**](DialerContactlistfilterConfigChangeFilterClause) |  |  [optional] |
| **filterType** | [**FilterTypeEnum**](#Enum--FilterTypeEnum) | Contact list filter type |  [optional] |
| **additionalProperties** | **Map&lt;String, Object&gt;** |  |  [optional] |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** | The UI-visible name of the object |  [optional] |
| **dateCreated** | [**Date**](Date) | Creation time of the entity |  [optional] |
| **dateModified** | [**Date**](Date) | Last modified time of the entity |  [optional] |
| **version** | **Integer** | Required for updates, must match the version number of the most recent update |  [optional] |


## Enum: FilterTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| AND | &quot;AND&quot; | 
| OR | &quot;OR&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:222.0.0_
