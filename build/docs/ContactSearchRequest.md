# ContactSearchRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **pageNumber** | **Integer** | Page number (limited to fetching first 1,000 records; pageNumber * pageSize must be <= 1,000) |  [optional] |
| **pageSize** | **Integer** | Page size (limited to fetching first 1,000 records; pageNumber * pageSize must be <= 1,000) |  [optional] |
| **divisionIds** | **List&lt;String&gt;** | Which divisions to search, up to 50 |  [optional] |
| **expand** | **List&lt;String&gt;** | Which fields, if any, to expand |  [optional] |
| **operation** | [**ContactSearchOperation**](ContactSearchOperation) | Search operation to execute, currently supports {@code simpleSearch} only. |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:262.0.0_
