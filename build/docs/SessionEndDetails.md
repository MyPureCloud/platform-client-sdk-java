---
title: SessionEndDetails
---
## SessionEndDetails


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#TypeEnum)<!----> | The type of termination handling that resulted in the session end. It can be either Exit or Disconnect |  [optional] |
| **reason** | <!----><!---->**String**<!----> | The reason for termination action. It can be due to an error or normal flow execution |  [optional] |
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| DISCONNECT | &quot;Disconnect&quot; | 
| EXIT | &quot;Exit&quot; | 
{: class="table table-striped"}



