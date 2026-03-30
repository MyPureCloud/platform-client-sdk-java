# CaseAssociation


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The ID of the association. |  [optional] |
| **name** | **String** |  |  [optional] |
| **associationType** | [**AssociationTypeEnum**](#Enum--AssociationTypeEnum) | Association type. |  [optional] |
| **dateAssociated** | [**Date**](Date) | Interaction association date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **workitem** | [**WorkitemReference**](WorkitemReference) | Associated workitem ID. |  [optional] |
| **conversation** | [**ConversationReference**](ConversationReference) | Associated conversation ID. |  [optional] |
| **stage** | [**StageReference**](StageReference) | The stage related to this association. |  [optional] |
| **step** | [**StepReference**](StepReference) | The step related to this association. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |
| **_case** | [**CaseReference**](CaseReference) | Case ID |  [optional] |


## Enum: AssociationTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ACTIVITY | &quot;Activity&quot; | 
| ENQUIRY | &quot;Enquiry&quot; | 
| INITIATION | &quot;Initiation&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:250.1.0_
