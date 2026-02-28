# TaskManagementObservationDataContainer


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **metric** | [**MetricEnum**](#Enum--MetricEnum) | The metric for this data point |  [optional] |
| **stats** | [**TaskManagementObservationMetricStats**](TaskManagementObservationMetricStats) | The observed statistics for this metric |  [optional] |
| **qualifier** | [**QualifierEnum**](#Enum--QualifierEnum) | Qualifier for duration based metrics. |  [optional] |


## Enum: MetricEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| OWORKITEMSUNASSIGNED | &quot;oWorkitemsUnassigned&quot; | 
| OWORKITEMSASSIGNED | &quot;oWorkitemsAssigned&quot; | 
| OWORKITEMSCONNECTED | &quot;oWorkitemsConnected&quot; | 
| OWORKITEMSPARKED | &quot;oWorkitemsParked&quot; | 
| OWORKITEMSHELD | &quot;oWorkitemsHeld&quot; | 
| OWORKITEMSACDSTARTED | &quot;oWorkitemsAcdStarted&quot; | 
| OWORKITEMSDECLINED | &quot;oWorkitemsDeclined&quot; | 
| OWORKITEMSIDLE | &quot;oWorkitemsIdle&quot; | 
| OWORKITEMSDISCONNECTED | &quot;oWorkitemsDisconnected&quot; | 
| OWORKITEMSACDEXPIRED | &quot;oWorkitemsAcdExpired&quot; | 
| OWORKITEMSDUE | &quot;oWorkitemsDue&quot; | 
| OWORKITEMSOVERDUE | &quot;oWorkitemsOverDue&quot; | 
| OWORKITEMOLDESTUNASSIGNED | &quot;oWorkitemOldestUnassigned&quot; | 
| OWORKITEMOLDESTASSIGNED | &quot;oWorkitemOldestAssigned&quot; | 


## Enum: QualifierEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| HOURS24 | &quot;Hours24&quot; | 
| HOURS72 | &quot;Hours72&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:248.0.0_
