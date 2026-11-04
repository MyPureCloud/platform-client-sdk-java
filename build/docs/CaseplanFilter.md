# CaseplanFilter


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **String** | Attribute name. Valid values: id, name, divisionId, published. The published filter requires the EQ operator and exactly one value: 'true' (Caseplans that have a published version) or 'false' (Caseplans that have never been published). |  |
| **operator** | [**OperatorEnum**](#Enum--OperatorEnum) | Filter operator. |  |
| **values** | **List&lt;String&gt;** | List of values to be used in the filter. |  |


## Enum: OperatorEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| EQ | &quot;EQ&quot; | 
| IN | &quot;IN&quot; | 
| CONTAINS | &quot;CONTAINS&quot; | 
| BEGINS_WITH | &quot;BEGINS_WITH&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:267.0.0_
