# SessionEndDetails


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | The type of termination handling that resulted in the session end. It can be either Exit or Disconnect |  [optional] |
| **reason** | **String** | The reason for termination action. It can be due to an error or normal flow execution |  [optional] |
{: class="table table-striped"}


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| DISCONNECT | &quot;Disconnect&quot; | 
| EXIT | &quot;Exit&quot; | 
{: class="table table-striped"}




_com.mypurecloud.sdk.v2:platform-client-v2:208.0.0_
