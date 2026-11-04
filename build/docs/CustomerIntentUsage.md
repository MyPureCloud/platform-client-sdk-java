# CustomerIntentUsage


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **entityType** | [**EntityTypeEnum**](#Enum--EntityTypeEnum) | Whether the usage is for a customer intent or category |  [optional] |
| **sourceType** | [**SourceTypeEnum**](#Enum--SourceTypeEnum) | Type of the source using the customer intent or category |  [optional] |
| **source** | [**DomainEntityRef**](DomainEntityRef) | Source using the customer intent or category. The selfUri is included when the source type has an addressable Public API resource. |  [optional] |
| **dateCreated** | [**Date**](Date) | Creation date of the usage. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |


## Enum: EntityTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| INTENT | &quot;Intent&quot; | 
| CATEGORY | &quot;Category&quot; | 


## Enum: SourceTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| BOT | &quot;Bot&quot; | 
| COPILOT | &quot;Copilot&quot; | 
| DIGITALBOT | &quot;Digitalbot&quot; | 
| SEGMENT | &quot;Segment&quot; | 
| TOPIC | &quot;Topic&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:267.0.0_
