# AgentStateQueryRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **userFilter** | [**AgentStateUserFilter**](AgentStateUserFilter) | Filters that target user-level data |  [optional] |
| **sessionFilter** | [**AgentStateSessionFilter**](AgentStateSessionFilter) | Filters that target session-level data |  [optional] |
| **userOrderBy** | [**UserOrderByEnum**](#Enum--UserOrderByEnum) | Search user order dimension names; default to userName |  [optional] |
| **userOrder** | [**UserOrderEnum**](#Enum--UserOrderEnum) | Search user order direction; default to asc |  [optional] |
| **sessionOrderBy** | [**SessionOrderByEnum**](#Enum--SessionOrderByEnum) | Search session order dimension names; default to segmentStart |  [optional] |
| **sessionOrder** | [**SessionOrderEnum**](#Enum--SessionOrderEnum) | Search session order direction; default to asc |  [optional] |


## Enum: UserOrderByEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| USERNAME | &quot;userName&quot; | 
| SEGMENTSTART | &quot;segmentStart&quot; | 
| SESSIONSTART | &quot;sessionStart&quot; | 
| PRESENCEDATE | &quot;presenceDate&quot; | 
| ROUTINGSTATUSDATE | &quot;routingStatusDate&quot; | 
| SYSTEMPRESENCE | &quot;systemPresence&quot; | 
| ROUTINGSTATUS | &quot;routingStatus&quot; | 
| ORGANIZATIONPRESENCEID | &quot;organizationPresenceId&quot; | 


## Enum: UserOrderEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ASC | &quot;asc&quot; | 
| DESC | &quot;desc&quot; | 


## Enum: SessionOrderByEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| SEGMENTSTART | &quot;segmentStart&quot; | 
| SESSIONSTART | &quot;sessionStart&quot; | 


## Enum: SessionOrderEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ASC | &quot;asc&quot; | 
| DESC | &quot;desc&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:238.0.0_
