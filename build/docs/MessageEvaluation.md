# MessageEvaluation


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **contactColumn** | **String** | The name of the contact column that was wrapped up |  [optional] |
| **contactAddress** | **String** | The address (phone or email) that was wrapped up |  [optional] |
| **messageType** | [**MessageTypeEnum**](#Enum--MessageTypeEnum) | The type of message sent |  [optional] |
| **wrapupCodeId** | **String** | The id of the wrap-up code |  [optional] |
| **timestamp** | [**Date**](Date) | The time that the wrap-up was applied. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
{: class="table table-striped"}


## Enum: MessageTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| SMS | &quot;Sms&quot; | 
| EMAIL | &quot;Email&quot; | 
{: class="table table-striped"}




_com.mypurecloud.sdk.v2:platform-client-v2:208.0.0_
