# ExternalMetricDefinition


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** | The name of the External Metric Definition |  [optional] |
| **unit** | [**UnitEnum**](#Enum--UnitEnum) | The unit of the External Metric Definition |  [optional] |
| **unitDefinition** | **String** | The unit definition of the External Metric Definition |  [optional] |
| **precision** | **Integer** | The decimal precision of the External Metric Definition |  [optional] |
| **defaultObjectiveType** | [**DefaultObjectiveTypeEnum**](#Enum--DefaultObjectiveTypeEnum) | The default objective type of the External Metric Definition |  [optional] |
| **retentionMonths** | **Integer** | The retention in months of the External Metric Definition |  [optional] |
| **enabled** | **Boolean** | True if the External Metric Definition is enabled |  [optional] |
| **inUse** | **Boolean** | True if the External Metric Definition is in use |  [optional] |
| **dateLastRefreshed** | [**Date**](Date) | The last date and time that the metric data was refreshed. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: UnitEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| SECONDS | &quot;Seconds&quot; | 
| PERCENT | &quot;Percent&quot; | 
| NUMBER | &quot;Number&quot; | 
| CURRENCY | &quot;Currency&quot; | 


## Enum: DefaultObjectiveTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| HIGHERISBETTER | &quot;HigherIsBetter&quot; | 
| LOWERISBETTER | &quot;LowerIsBetter&quot; | 
| TARGETAREA | &quot;TargetArea&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:214.0.0_
