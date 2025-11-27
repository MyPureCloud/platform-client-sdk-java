# PhoneStatus


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** |  |  [optional] |
| **operationalStatus** | [**OperationalStatusEnum**](#Enum--OperationalStatusEnum) | The Operational Status of this phone |  [optional] |
| **edgesStatus** | [**EdgesStatusEnum**](#Enum--EdgesStatusEnum) | The status of the primary or secondary Edges assigned to the phone lines. |  [optional] |
| **eventCreationTime** | **String** | Event Creation Time represents an ISO-8601 string. For example: UTC, UTC+01:00, or Europe/London |  [optional] |
| **provision** | [**ProvisionInfo**](ProvisionInfo) | Provision information for this phone |  [optional] |
| **lineStatuses** | [**List&lt;LineStatus&gt;**](LineStatus) | A list of LineStatus information for each of the lines of this phone |  [optional] |
| **phoneAssignmentToEdgeType** | [**PhoneAssignmentToEdgeTypeEnum**](#Enum--PhoneAssignmentToEdgeTypeEnum) | The phone status's edge assignment type. |  [optional] |
| **edge** | [**DomainEntityRef**](DomainEntityRef) | The URI of the edge that provided this status information. |  [optional] |
| **selfUri** | **String** | The URI for this object. Deprecated. Do not use. |  [optional] |


## Enum: OperationalStatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| OPERATIONAL | &quot;OPERATIONAL&quot; | 
| DEGRADED | &quot;DEGRADED&quot; | 
| OFFLINE | &quot;OFFLINE&quot; | 
| UNKNOWN | &quot;UNKNOWN&quot; | 


## Enum: EdgesStatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| IN_SERVICE | &quot;IN_SERVICE&quot; | 
| MIXED_SERVICE | &quot;MIXED_SERVICE&quot; | 
| OUT_OF_SERVICE | &quot;OUT_OF_SERVICE&quot; | 
| NO_EDGES | &quot;NO_EDGES&quot; | 


## Enum: PhoneAssignmentToEdgeTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PRIMARY | &quot;PRIMARY&quot; | 
| SECONDARY | &quot;SECONDARY&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:239.0.0_
