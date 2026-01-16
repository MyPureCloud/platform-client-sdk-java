# UsersRulesRule


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **description** | **String** | The description of the rule |  [optional] |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | The type of the rule |  [optional] |
| **criteria** | [**List&lt;UsersRulesCriteria&gt;**](UsersRulesCriteria) | The criteria of the rule |  [optional] |
| **createdDate** | [**Date**](Date) | The date/time the rule was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **createdBy** | [**UserReference**](UserReference) | The user who created the rule |  [optional] |
| **modifiedDate** | [**Date**](Date) | The date/time the rule was last modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **modifiedBy** | [**UserReference**](UserReference) | The last user to modify the rule |  [optional] |
| **lastRun** | [**UsersRulesLastRunMetadata**](UsersRulesLastRunMetadata) | Information on the last run of the rule |  [optional] |
| **recentRunCount** | **Long** | The number of times the rule has run |  [optional] |
| **dependentCount** | **Long** | The number of dependents this rule has |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| LEARNING | &quot;Learning&quot; | 
| ACTIVITYPLAN | &quot;ActivityPlan&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:244.0.0_
