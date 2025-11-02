# DomainEdgeSoftwareUpdateDto


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **version** | [**DomainEdgeSoftwareVersionDto**](DomainEdgeSoftwareVersionDto) | Version |  |
| **maxDownloadRate** | **Integer** |  |  [optional] |
| **downloadStartTime** | [**Date**](Date) | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **executeStartTime** | [**Date**](Date) | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **executeStopTime** | [**Date**](Date) | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **executeOnIdle** | **Boolean** |  |  [optional] |
| **status** | [**StatusEnum**](#Enum--StatusEnum) |  |  [optional] |
| **edgeUri** | **String** |  |  [optional] |
| **callDrainingWaitTimeSeconds** | **Long** |  |  [optional] |
| **current** | **Boolean** |  |  [optional] |


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| NONE | &quot;NONE&quot; | 
| INIT | &quot;INIT&quot; | 
| IN_PROGRESS | &quot;IN_PROGRESS&quot; | 
| EXPIRED | &quot;EXPIRED&quot; | 
| EXCEPTION | &quot;EXCEPTION&quot; | 
| ABORTED | &quot;ABORTED&quot; | 
| FAILED | &quot;FAILED&quot; | 
| SUCCEEDED | &quot;SUCCEEDED&quot; | 
| DELETE | &quot;DELETE&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:236.0.0_
