# CampaignDiagnosticCampaignState


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **state** | [**StateEnum**](#Enum--StateEnum) | Campaign status |  [optional] |
| **dateStart** | [**Date**](Date) | Start datetime of the state. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateEnd** | [**Date**](Date) | End datetime of the state. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dialingMode** | [**DialingModeEnum**](#Enum--DialingModeEnum) | Dialing mode for the campaign state (e.g., \"power\", \"preview\", \"predictive\") |  [optional] |


## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ON | &quot;on&quot; | 
| STOPPING | &quot;stopping&quot; | 
| OFF | &quot;off&quot; | 
| COMPLETE | &quot;complete&quot; | 
| INVALID | &quot;invalid&quot; | 
| FORCED_OFF | &quot;forced_off&quot; | 
| FORCED_STOPPING | &quot;forced_stopping&quot; | 


## Enum: DialingModeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| AGENTLESS | &quot;agentless&quot; | 
| PREVIEW | &quot;preview&quot; | 
| POWER | &quot;power&quot; | 
| PREDICTIVE | &quot;predictive&quot; | 
| PROGRESSIVE | &quot;progressive&quot; | 
| EXTERNAL | &quot;external&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:251.0.0_
