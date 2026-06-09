# CampaignDiagnosticCampaignHealthState


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **state** | [**StateEnum**](#Enum--StateEnum) | Campaign health state name |  [optional] |
| **dateStart** | [**Date**](Date) | Start datetime of the health state. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateEnd** | [**Date**](Date) | End datetime of the health state. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |


## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| HEALTHY | &quot;healthy&quot; | 
| WAITINGFORAGENTS | &quot;WaitingForAgents&quot; | 
| WAITINGFORCONTACTS | &quot;WaitingForContacts&quot; | 
| WAITINGFORLINES | &quot;WaitingForLines&quot; | 
| WARNTHRESHOLDCPS | &quot;WarnThresholdCPS&quot; | 
| WARNMAXCPAALARM | &quot;WarnMaxCPAalarm&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:255.0.0_
