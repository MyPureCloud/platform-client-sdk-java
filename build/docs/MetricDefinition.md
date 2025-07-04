# MetricDefinition


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **unitType** | [**UnitTypeEnum**](#Enum--UnitTypeEnum) | The type of associated metric unit |  [optional] |
| **shortName** | **String** | An alternate name for this metric definition, often abbreviation |  [optional] |
| **dividendMetrics** | **List&lt;String&gt;** | Metric names used as dividend |  [optional] |
| **divisorMetrics** | **List&lt;String&gt;** | Metric names used as divisor |  [optional] |
| **defaultObjective** | [**DefaultObjective**](DefaultObjective) | A predefined default objective for this metric |  [optional] |
| **lockTemplateId** | **String** | An optional field to specify if this metric definition is locked to certain template. e.g. punctuality |  [optional] |
| **mediaTypeFilteringAllowed** | **Boolean** | Flag to indicate if this metricDefinition allows filter based on media types |  [optional] |
| **initialDirectionFilteringAllowed** | **Boolean** | Flag to indicate if this metricDefinition allows filter based on initial direction |  [optional] |
| **queueFilteringAllowed** | **Boolean** | Flag to indicate if this metricDefinition allows filter based on queues |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: UnitTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| NONE | &quot;None&quot; | 
| PERCENT | &quot;Percent&quot; | 
| CURRENCY | &quot;Currency&quot; | 
| SECONDS | &quot;Seconds&quot; | 
| NUMBER | &quot;Number&quot; | 
| ATTENDANCESTATUS | &quot;AttendanceStatus&quot; | 
| UNIT | &quot;Unit&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
