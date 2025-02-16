# FunctionConfig


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | Action identifier. |  [optional] |
| **function** | [**Function**](Function) | Function configuration. |  [optional] |
| **zip** | [**FunctionZipConfig**](FunctionZipConfig) | Zip file configuration and state. |  [optional] |
| **uploadExceptionHistory** | [**List&lt;FunctionZipConfig&gt;**](FunctionZipConfig) | History of failed zip upload file configuration including their state and error messages. Contains no more than last ten failures. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:220.0.0_
