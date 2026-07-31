# CaseplanQueryRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **String** | Filter by Caseplan name (case-insensitive, partial match). Omitting name returns all Caseplans (subject to pagination). |  [optional] |
| **nameSearchType** | [**NameSearchTypeEnum**](#Enum--NameSearchTypeEnum) | Type of name search to perform. Default is BEGINS_WITH. |  [optional] |
| **divisionIds** | **List&lt;String&gt;** | Divisions to filter by. Accepts a list of UUIDs and/or '*'. |  [optional] |
| **filters** | [**List&lt;CaseplanFilter&gt;**](CaseplanFilter) | List of filter objects to be used in the search. Valid filter names are: 'id', 'name', 'divisionId'. Multiple filters are combined with AND logic. |  [optional] |
| **attributes** | **List&lt;String&gt;** | List of entity attributes to be retrieved in the result. |  [optional] |
| **pageSize** | **Integer** | Number of results per page. Maximum is 200. Default is 25. |  [optional] |
| **after** | **String** | Cursor for pagination. Use the \"after\" value from the previous response. |  [optional] |


## Enum: NameSearchTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| BEGINS_WITH | &quot;BEGINS_WITH&quot; | 
| CONTAINS | &quot;CONTAINS&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:259.0.0_
