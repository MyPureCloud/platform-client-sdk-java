# TaskManagementQueryMetric


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | [**NameEnum**](#Enum--NameEnum) | The requested metric name |  |
| **qualifier** | [**QualifierEnum**](#Enum--QualifierEnum) | Qualifier for duration based metrics. Required when requesting oWorkitemsDue |  [optional] |


## Enum: NameEnum

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




_com.mypurecloud.sdk.v2:platform-client-v2:249.0.0_
