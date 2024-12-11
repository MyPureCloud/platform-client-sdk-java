# LockInfo


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **lockedBy** | [**DomainEntityRef**](DomainEntityRef) |  |  [optional] |
| **dateCreated** | [**Date**](Date) | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateExpires** | [**Date**](Date) | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **action** | [**ActionEnum**](#Enum--ActionEnum) |  |  [optional] |


## Enum: ActionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UPDATE | &quot;UPDATE&quot; | 
| DELETE | &quot;DELETE&quot; | 
| COPY | &quot;COPY&quot; | 
| MOVE | &quot;MOVE&quot; | 
| REPLACE | &quot;REPLACE&quot; | 
| THUMBNAIL | &quot;THUMBNAIL&quot; | 
| TEXT_EXTRACTION | &quot;TEXT_EXTRACTION&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:216.0.0_
