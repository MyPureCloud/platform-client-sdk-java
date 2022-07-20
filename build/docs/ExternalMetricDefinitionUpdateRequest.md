---
title: ExternalMetricDefinitionUpdateRequest
---
## ExternalMetricDefinitionUpdateRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | <!----><!---->**String**<!----> | The name of the External Metric Definition |  [optional] |
| **precision** | <!----><!---->**Integer**<!----> | The decimal precision of the External Metric Definition. Must be at least 0 and at most 5 |  [optional] |
| **defaultObjectiveType** | [**DefaultObjectiveTypeEnum**](#DefaultObjectiveTypeEnum)<!----> | The default objective type of the External Metric Definition |  [optional] |
| **enabled** | <!----><!---->**Boolean**<!----> | True if the External Metric Definition is enabled |  [optional] |
{: class="table table-striped"}


<a name="DefaultObjectiveTypeEnum"></a>

## Enum: DefaultObjectiveTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| HIGHERISBETTER | &quot;HigherIsBetter&quot; | 
| LOWERISBETTER | &quot;LowerIsBetter&quot; | 
| TARGETAREA | &quot;TargetArea&quot; | 
{: class="table table-striped"}



