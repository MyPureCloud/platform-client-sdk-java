# AgentSchedulingPreferencesTiebreaker


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **primary** | [**PrimaryEnum**](#Enum--PrimaryEnum) | The primary ranking tiebreaker used when agents have equal preference scores |  |
| **secondary** | [**SecondaryEnum**](#Enum--SecondaryEnum) | The secondary ranking tiebreaker. Omit when primary is RandomlyAssign |  [optional] |


## Enum: PrimaryEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CUSTOM | &quot;Custom&quot; | 
| HIREDATE | &quot;HireDate&quot; | 
| PERFORMANCE | &quot;Performance&quot; | 
| RANDOMLYASSIGN | &quot;RandomlyAssign&quot; | 


## Enum: SecondaryEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CUSTOM | &quot;Custom&quot; | 
| HIREDATE | &quot;HireDate&quot; | 
| PERFORMANCE | &quot;Performance&quot; | 
| RANDOMLYASSIGN | &quot;RandomlyAssign&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:267.0.0_
