---
title: Function
---
## Function


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | Function identifier. |  [optional] |
| **name** | <!----><!---->**String**<!----> | Function name. This is automatically created based on the Action Id. |  [optional] |
| **description** | <!----><!---->**String**<!----> | Description of the function. Limit 255 characters. |  |
| **dateCreated** | <!----><!---->[**Date**](Date.html)<!----> | Date and time function was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **zipId** | <!----><!---->**String**<!----> | Zip file identifier. |  [optional] |
| **handler** | <!----><!---->**String**<!----> | Handler entry point into zip file to execute function. Should be path within upload function package to the invocation module without language extension, followed by a period and then exported invocation method name. e.g. 'src/index.handler' |  |
| **runtime** | <!----><!---->**String**<!----> | Runtime required for execution. Valid runtimes change over time as versions are deprecated. Use /api/v2/integrations/actions/functions/runtimes for current list. |  |
| **timeoutSeconds** | <!----><!---->**Integer**<!----> | Execution timeout to apply to function. Value is in seconds. Range allowed 1 to 60. Default value 15 seconds. |  [optional] |
{: class="table table-striped"}



