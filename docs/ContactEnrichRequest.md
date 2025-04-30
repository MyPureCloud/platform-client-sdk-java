# ContactEnrichRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | A user-specified tracker string, only useful in the Bulk-Enrich API. If one Bulk-Enrich operation in a request fails, the requested operation will be repeated in the Bulk API response, including this id field, allowing associating of request and response operations. |  [optional] |
| **division** | [**WritableStarrableDivision**](WritableStarrableDivision) | The division to which this entity belongs. |  [optional] |
| **matchingIdentifiers** | [**List&lt;ContactIdentifier&gt;**](ContactIdentifier) | An ordered list of one or more Identifiers which might each be claimed by a Contact. `action` describes what to do with any possibly matching Contacts. Identifier lookups will occur in the order specified here. |  |
| **action** | [**ActionEnum**](#Enum--ActionEnum) | The action that should be taken based on any Contacts found by `matchingIdentifiers`. |  |
| **contact** | [**ExternalContact**](ExternalContact) | Data to be added, either as an update to an existing Contact or the body of a new Contact. Omitting a field in this contract means that it will be treated as null in the `fieldRules` logic. |  [optional] |
| **fieldRules** | [**EnrichFieldRules**](EnrichFieldRules) | Logic describing how to combine data from the submitted request with data found in the database. |  [optional] |
| **options** | [**ContactEnrichOptions**](ContactEnrichOptions) | Additional options modifying the behavior of the API operation. |  [optional] |


## Enum: ActionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| MERGE | &quot;Merge&quot; | 
| UPSERT | &quot;Upsert&quot; | 
| UPDATE | &quot;Update&quot; | 
| INSERT | &quot;Insert&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:224.0.0_
