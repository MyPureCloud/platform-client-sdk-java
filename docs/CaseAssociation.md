# CaseAssociation


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The ID of the association. |  [optional] |
| **name** | **String** |  |  [optional] |
| **associationType** | [**AssociationTypeEnum**](#Enum--AssociationTypeEnum) | The association type. |  [optional] |
| **dateAssociated** | [**Date**](Date) | The date of the interaction association. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **workitem** | [**WorkitemReference**](WorkitemReference) | The associated Workitem. |  [optional] |
| **conversation** | [**ConversationReference**](ConversationReference) | The associated Conversation. |  [optional] |
| **stage** | [**StageReference**](StageReference) | The Stage related to this association. |  [optional] |
| **step** | [**StepReference**](StepReference) | The Step related to this association. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |
| **_case** | [**CaseReference**](CaseReference) | The Case for this association. |  [optional] |


## Enum: AssociationTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ACTIVITY | &quot;Activity&quot; | 
| ENQUIRY | &quot;Enquiry&quot; | 
| INITIATION | &quot;Initiation&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:260.0.0_
