# CaseplanQueryRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **String** | Filter by Caseplan name (case-insensitive, partial match). Omitting name returns all Caseplans (subject to pagination). |  [optional] |
| **nameSearchType** | [**NameSearchTypeEnum**](#Enum--NameSearchTypeEnum) | Type of name search to perform. Default is BEGINS_WITH. |  [optional] |
| **pageSize** | **Integer** | Number of results per page. Maximum is 200. Default is 25. |  [optional] |
| **after** | **String** | Cursor for pagination. Use the \"after\" value from the previous response. |  [optional] |
| **divisionIds** | **List&lt;String&gt;** | Divisions to filter by. Accepts a list of UUIDs and/or '*'. |  [optional] |


## Enum: NameSearchTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| BEGINS_WITH | &quot;BEGINS_WITH&quot; | 
| CONTAINS | &quot;CONTAINS&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:257.0.0_
