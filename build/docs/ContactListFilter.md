# ContactListFilter


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** | The name of the list. |  |
| **dateCreated** | [**Date**](Date) | Creation time of the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | [**Date**](Date) | Last modified time of the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **version** | **Integer** | Required for updates, must match the version number of the most recent update |  [optional] |
| **contactList** | [**DomainEntityRef**](DomainEntityRef) | The contact list the filter is based on. Required if sourceType is ContactList |  [optional] |
| **contactListTemplate** | [**DomainEntityRef**](DomainEntityRef) | The contact list template the filter is based on. Required if sourceType is ContactListTemplate |  [optional] |
| **sourceType** | [**SourceTypeEnum**](#Enum--SourceTypeEnum) | The source type the filter is based on. |  [optional] |
| **clauses** | [**List&lt;ContactListFilterClause&gt;**](ContactListFilterClause) | Groups of conditions to filter the contacts by. |  [optional] |
| **filterType** | [**FilterTypeEnum**](#Enum--FilterTypeEnum) | How to join clauses together. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: SourceTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CONTACTLIST | &quot;ContactList&quot; | 
| CONTACTLISTTEMPLATE | &quot;ContactListTemplate&quot; | 


## Enum: FilterTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| AND | &quot;AND&quot; | 
| OR | &quot;OR&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:210.0.0_
