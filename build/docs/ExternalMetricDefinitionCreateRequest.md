# ExternalMetricDefinitionCreateRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **String** | The name of the External Metric Definition |  |
| **unit** | [**UnitEnum**](#Enum--UnitEnum) | The unit of the External Metric Definition |  |
| **unitDefinition** | **String** | The unit definition of the External Metric Definition |  [optional] |
| **precision** | **Integer** | The decimal precision of the External Metric Definition. Must be at least 0 and at most 5 |  |
| **defaultObjectiveType** | [**DefaultObjectiveTypeEnum**](#Enum--DefaultObjectiveTypeEnum) | The default objective type of the External Metric Definition |  |
| **enabled** | **Boolean** | True if the External Metric Definition is enabled |  |


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




_com.mypurecloud.sdk.v2:platform-client-v2:235.0.0_
