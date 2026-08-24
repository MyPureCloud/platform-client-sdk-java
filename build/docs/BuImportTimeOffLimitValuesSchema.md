# BuImportTimeOffLimitValuesSchema


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **limitValues** | [**List&lt;BuImportTimeOffLimitValue&gt;**](BuImportTimeOffLimitValue) | Time-off limit values to import. The list is collection of date and time interval for which allocated limit in minutes is imported.For a time-off limit with daily granularity, the only time interval that should be set for a given date is '00:00'For a time-off limit with fifteen minutes granularity, minimum of one time interval must be specified |  |
| **metadata** | [**WfmVersionedEntityMetadata**](WfmVersionedEntityMetadata) | Version metadata for the time-off limit |  |




_com.mypurecloud.sdk.v2:platform-client-v2:260.1.0_
