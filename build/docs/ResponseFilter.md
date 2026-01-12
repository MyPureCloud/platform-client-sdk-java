# ResponseFilter


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **String** | Field to filter on. Allowed values are 'name', 'libraryId', 'text.contentType', 'messagingTemplate' and 'responseType' |  |
| **operator** | [**OperatorEnum**](#Enum--OperatorEnum) | Filter operation: IN, EQUALS, NOTEQUALS. |  |
| **values** | **List&lt;String&gt;** | Values to filter on. If name is 'responseType' then allowed values are 'CampaignSmsTemplate', 'CampaignEmailTemplate', 'Footer' and 'Signature' |  |


## Enum: OperatorEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| IN | &quot;IN&quot; | 
| EQUALS | &quot;EQUALS&quot; | 
| NOTEQUALS | &quot;NOTEQUALS&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:243.0.0_
