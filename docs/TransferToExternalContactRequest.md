# TransferToExternalContactRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **transferType** | [**TransferTypeEnum**](#Enum--TransferTypeEnum) | The type of transfer to perform. Attended, where the initiating agent maintains ownership of the conversation until the intended recipient accepts the transfer, or Unattended, where the initiating agent immediately disconnects. Default is Unattended. |  [optional] |
| **keepInternalMessageAlive** | **Boolean** | If true, the digital internal message will NOT be terminated. |  [optional] |
| **contactId** | **String** | The external contact id. |  |
| **phoneType** | [**PhoneTypeEnum**](#Enum--PhoneTypeEnum) | The external contact phone type. |  |


## Enum: TransferTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ATTENDED | &quot;Attended&quot; | 
| UNATTENDED | &quot;Unattended&quot; | 


## Enum: PhoneTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| WORKPHONE | &quot;WorkPhone&quot; | 
| CELLPHONE | &quot;CellPhone&quot; | 
| HOMEPHONE | &quot;HomePhone&quot; | 
| OTHERPHONE | &quot;OtherPhone&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:236.0.0_
