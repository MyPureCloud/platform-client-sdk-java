# KnowledgeDocumentFeedbackUpdateRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **rating** | [**RatingEnum**](#Enum--RatingEnum) | Feedback rating. |  |
| **reason** | [**ReasonEnum**](#Enum--ReasonEnum) | Feedback reason |  [optional] |
| **comment** | **String** | Feedback comment |  [optional] |
| **state** | [**StateEnum**](#Enum--StateEnum) | Feedback state |  [optional] |


## Enum: RatingEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| NEGATIVE | &quot;Negative&quot; | 
| POSITIVE | &quot;Positive&quot; | 


## Enum: ReasonEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| DOCUMENTCONTENT | &quot;DocumentContent&quot; | 
| SEARCHRESULTS | &quot;SearchResults&quot; | 


## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| DRAFT | &quot;Draft&quot; | 
| FINAL | &quot;Final&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:211.0.0_
