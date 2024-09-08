---
title: FunctionConfig
---
## FunctionConfig


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | Action identifier. |  [optional] |
| **function** | <!----><!---->[**Function**](Function.html)<!----> | Function configuration. |  [optional] |
| **zip** | <!----><!---->[**FunctionZipConfig**](FunctionZipConfig.html)<!----> | Zip file configuration and state. |  [optional] |
| **uploadExceptionHistory** | <!----><!---->[**List&lt;FunctionZipConfig&gt;**](FunctionZipConfig.html)<!----> | History of failed zip upload file configuration including their state and error messages. Contains no more than last ten failures. |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}



