# CaseQueryJobCreate


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **pageSize** | **Integer** | The total page size requested (default 25). |  [optional] |
| **pageNumber** | **Integer** | The requested page number. |  [optional] |
| **filters** | [**List&lt;CaseQueryJobFilter&gt;**](CaseQueryJobFilter) | List of filter objects to be used in the search. Use an empty list to run the query with no filters. |  |
| **sort** | [**CaseQueryJobSort**](CaseQueryJobSort) | Sort order for results. |  [optional] |
| **attributes** | [**List<AttributesEnum>**](#Enum--AttributesEnum) | List of entity attributes to be retrieved in the result. |  [optional] |
| **expands** | [**List<ExpandsEnum>**](#Enum--ExpandsEnum) | Attributes to expand on each case in the job results. Expands are stored on the job and enriched by PubAPI when results are fetched. |  [optional] |


## Enum: AttributesEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| ID | &quot;id&quot; |
| REFERENCE | &quot;reference&quot; |
| CASEPLANID | &quot;caseplanId&quot; |
| CASEPLANVERSION | &quot;caseplanVersion&quot; |
| OWNER | &quot;owner&quot; |
| STATUS | &quot;status&quot; |
| PRIORITY | &quot;priority&quot; |
| EXTERNALCONTACTID | &quot;externalContactId&quot; |
| CUSTOMERINTENT | &quot;customerIntent&quot; |
| DIVISION | &quot;division&quot; |
| DATEDUE | &quot;dateDue&quot; |
| DATESTARTED | &quot;dateStarted&quot; |
| DATECLOSED | &quot;dateClosed&quot; |
| DATECREATED | &quot;dateCreated&quot; |
| DATEMODIFIED | &quot;dateModified&quot; |
| MODIFIEDBY | &quot;modifiedBy&quot; |
| SUMMARY | &quot;summary&quot; |
| VERSION | &quot;version&quot; |
| TTLSECONDS | &quot;ttlSeconds&quot; |
| CREATIONSTATUS | &quot;creationStatus&quot; |


## Enum: ExpandsEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| CASEPLAN | &quot;caseplan&quot; |
| OWNER | &quot;owner&quot; |
| MODIFIEDBY | &quot;modifiedBy&quot; |
| EXTERNALCONTACT | &quot;externalContact&quot; |
| CUSTOMERINTENT | &quot;customerIntent&quot; |




_com.mypurecloud.sdk.v2:platform-client-v2:262.0.0_
