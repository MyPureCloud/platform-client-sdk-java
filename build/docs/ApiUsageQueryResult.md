# ApiUsageQueryResult


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **results** | [**List&lt;ApiUsageRow&gt;**](ApiUsageRow) | Query results |  [optional] |
| **queryStatus** | [**QueryStatusEnum**](#Enum--QueryStatusEnum) | Query status |  [optional] |
| **cursors** | [**Cursors**](Cursors) | Cursor tokens to be used for navigating paginated results |  [optional] |


## Enum: QueryStatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| COMPLETE | &quot;Complete&quot; | 
| FAILED | &quot;Failed&quot; | 
| RUNNING | &quot;Running&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:229.1.0_
