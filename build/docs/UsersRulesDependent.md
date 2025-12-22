# UsersRulesDependent


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **ruleId** | **String** | The id of the rule |  [optional] |
| **typeId** | **String** | The type id of the dependent |  [optional] |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | The type of the dependent |  [optional] |
| **createdDate** | [**Date**](Date) | The date/time the dependent was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **createdBy** | [**UserReference**](UserReference) | The user who created the dependent |  [optional] |
| **lastRun** | [**UsersRulesLastRunMetadata**](UsersRulesLastRunMetadata) | Information on the last run of the dependent |  [optional] |
| **recentRunCount** | **Long** | The number of times the rule has run |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| LEARNING | &quot;Learning&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:241.0.0_
