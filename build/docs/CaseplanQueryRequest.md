# CaseplanQueryRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **String** | Filter by caseplan name (case-insensitive, partial match). Omitting name returns all caseplans (subject to pagination). |  [optional] |
| **pageSize** | **Integer** | Number of results per page. Maximum is 200. Default is 25. |  [optional] |
| **after** | **String** | Cursor for pagination. Use the \"after\" value from the previous response. |  [optional] |
| **divisionIds** | **List&lt;String&gt;** | Divisions to filter by. Accepts a list of UUIDs and/or '*'. |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:253.2.0_
