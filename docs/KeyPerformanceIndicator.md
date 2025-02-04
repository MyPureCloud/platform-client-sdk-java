# KeyPerformanceIndicator


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** | The name of the Key Performance Indicator. |  [optional] |
| **optimizationType** | [**OptimizationTypeEnum**](#Enum--OptimizationTypeEnum) | The optimization type of the Key Performance Indicator. |  [optional] |
| **problemType** | [**ProblemTypeEnum**](#Enum--ProblemTypeEnum) | The problem type of the Key Performance Indicator. |  [optional] |
| **dateCreated** | [**Date**](Date) | DateTime indicating when the Key Performance Indicator was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | [**Date**](Date) | DateTime indicating when the Key Performance Indicator was modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **description** | **String** | The description of the Key Performance Indicator. |  [optional] |
| **kpiType** | [**KpiTypeEnum**](#Enum--KpiTypeEnum) | The type of Key Performance Indicator. |  [optional] |
| **source** | [**SourceEnum**](#Enum--SourceEnum) | Source of values for Key Performance Indicator. |  [optional] |
| **wrapUpCodeConfig** | [**WrapUpCodeConfig**](WrapUpCodeConfig) | Defines what wrap up codes are mapped to Key Performance Indicator. |  [optional] |
| **outcomeConfig** | [**OutcomeConfig**](OutcomeConfig) | Defines what outcome ids are mapped to Key Performance Indicator. |  [optional] |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | The status of the Key Performance Indicator. |  [optional] |
| **kpiGroup** | [**KpiGroupEnum**](#Enum--KpiGroupEnum) | The group the Key Performance Indicator belongs to. |  [optional] |
| **queues** | **List&lt;String&gt;** | Queue IDs on which KPI specification is used. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: OptimizationTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| MAXIMIZATION | &quot;Maximization&quot; | 
| MINIMIZATION | &quot;Minimization&quot; | 


## Enum: ProblemTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CLASSIFICATION | &quot;Classification&quot; | 
| REGRESSION | &quot;Regression&quot; | 


## Enum: KpiTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| SALESCONVERSION | &quot;SalesConversion&quot; | 
| CHURN | &quot;Churn&quot; | 
| RETENTION | &quot;Retention&quot; | 
| SALESVALUE | &quot;SalesValue&quot; | 
| HANDLETIME | &quot;HandleTime&quot; | 
| NEXTCONTACTAVOIDANCE | &quot;NextContactAvoidance&quot; | 


## Enum: SourceEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| WRAPUPCODE | &quot;WrapUpCode&quot; | 
| OUTCOME | &quot;Outcome&quot; | 
| NONE | &quot;None&quot; | 


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ENABLED | &quot;Enabled&quot; | 
| DISABLED | &quot;Disabled&quot; | 


## Enum: KpiGroupEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| STANDARD | &quot;Standard&quot; | 
| CUSTOM | &quot;Custom&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:219.0.0_
