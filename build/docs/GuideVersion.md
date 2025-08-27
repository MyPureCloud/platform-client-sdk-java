# GuideVersion


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **selfUri** | **String** |  |  [optional] |
| **guide** | [**AddressableEntityRef**](AddressableEntityRef) | The guide this version belongs to. |  [optional] |
| **version** | **String** | Guide version. |  [optional] |
| **instruction** | **String** | The instruction given to this version of the guide, for how it should behave when interacting with a User. |  [optional] |
| **state** | [**StateEnum**](#Enum--StateEnum) | The current state of the guide version. |  [optional] |
| **dateCreated** | [**Date**](Date) | The date and time the guide version was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | [**Date**](Date) | The date and time the guide version was last modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **variables** | [**List&lt;Variable&gt;**](Variable) | The variables associated with this version of the guide. Includes input variables (provided) and output variables (captured during execution). |  [optional] |
| **resources** | [**GuideVersionResources**](GuideVersionResources) | The resources associated with this version of the guide. |  [optional] |


## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| DRAFT | &quot;Draft&quot; | 
| TESTREADY | &quot;TestReady&quot; | 
| PRODUCTIONREADY | &quot;ProductionReady&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:230.0.0_
