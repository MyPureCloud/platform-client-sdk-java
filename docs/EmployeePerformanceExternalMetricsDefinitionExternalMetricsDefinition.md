# EmployeePerformanceExternalMetricsDefinitionExternalMetricsDefinition


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** |  |  [optional] |
| **name** | **String** |  |  [optional] |
| **unit** | [**UnitEnum**](#Enum--UnitEnum) |  |  [optional] |
| **unitDefinition** | **String** |  |  [optional] |
| **precision** | **Long** |  |  [optional] |
| **defaultObjectiveType** | [**DefaultObjectiveTypeEnum**](#Enum--DefaultObjectiveTypeEnum) |  |  [optional] |
| **retentionMonths** | **Long** |  |  [optional] |
| **enabled** | **Boolean** |  |  [optional] |
| **inUse** | **Boolean** |  |  [optional] |
| **dateLastRefreshed** | [**Date**](Date) |  |  [optional] |


## Enum: UnitEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| SECONDS | &quot;Seconds&quot; | 
| PERCENT | &quot;Percent&quot; | 
| NUMBER | &quot;Number&quot; | 
| CURRENCY | &quot;Currency&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 


## Enum: DefaultObjectiveTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| HIGHERISBETTER | &quot;HigherIsBetter&quot; | 
| LOWERISBETTER | &quot;LowerIsBetter&quot; | 
| TARGETAREA | &quot;TargetArea&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:230.0.0_
