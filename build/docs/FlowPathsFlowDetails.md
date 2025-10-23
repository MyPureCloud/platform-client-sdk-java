# FlowPathsFlowDetails


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **version** | **String** | The version of the flow. |  |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | The type of the flow. |  |
| **count** | **Integer** | Count of all journeys that include this element in the given flow. |  |
| **flow** | [**AddressableEntityRef**](AddressableEntityRef) | The identifier of the flow. |  |


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| DIGITALBOT | &quot;DigitalBot&quot; | 
| BOT | &quot;Bot&quot; | 
| INBOUNDCALL | &quot;InboundCall&quot; | 
| SECURECALL | &quot;SecureCall&quot; | 
| INBOUNDSHORTMESSAGE | &quot;InboundShortMessage&quot; | 
| INBOUNDEMAIL | &quot;InboundEmail&quot; | 
| OUTBOUNDCALL | &quot;OutboundCall&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:235.0.0_
