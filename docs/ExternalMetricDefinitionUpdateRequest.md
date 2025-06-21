# ExternalMetricDefinitionUpdateRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **String** | The name of the External Metric Definition |  [optional] |
| **precision** | **Integer** | The decimal precision of the External Metric Definition. Must be at least 0 and at most 5 |  [optional] |
| **defaultObjectiveType** | [**DefaultObjectiveTypeEnum**](#Enum--DefaultObjectiveTypeEnum) | The default objective type of the External Metric Definition |  [optional] |
| **enabled** | **Boolean** | True if the External Metric Definition is enabled |  [optional] |


## Enum: DefaultObjectiveTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| HIGHERISBETTER | &quot;HigherIsBetter&quot; | 
| LOWERISBETTER | &quot;LowerIsBetter&quot; | 
| TARGETAREA | &quot;TargetArea&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:227.0.0_
