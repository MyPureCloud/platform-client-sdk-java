# QualityEvaluationScoreItem


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **evaluationId** | **String** | The id of evaluation |  [optional] |
| **conversationId** | **String** | The id of conversation |  [optional] |
| **conversationDate** | [**Date**](Date) | The date of conversation. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **conversationEndDate** | [**Date**](Date) | The end date of conversation. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **formName** | **String** | The name of form |  [optional] |
| **points** | **Integer** | Gamification points earned for this metric |  [optional] |
| **evaluationScore** | **Double** | The quality score of evaluation as a percentage |  [optional] |
| **maxPoints** | **Integer** | The maximum Gamification points a user may earn for this metric |  [optional] |
| **mediaTypes** | [**List<MediaTypesEnum>**](#Enum--MediaTypesEnum) | A list of media types for the metric |  [optional] |


## Enum: MediaTypesEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| CALLBACK | &quot;callback&quot; |
| CHAT | &quot;chat&quot; |
| COBROWSE | &quot;cobrowse&quot; |
| EMAIL | &quot;email&quot; |
| INTERNALMESSAGE | &quot;internalmessage&quot; |
| MESSAGE | &quot;message&quot; |
| SCREENSHARE | &quot;screenshare&quot; |
| UNKNOWN | &quot;unknown&quot; |
| VIDEO | &quot;video&quot; |
| VOICE | &quot;voice&quot; |




_com.mypurecloud.sdk.v2:platform-client-v2:236.0.0_
