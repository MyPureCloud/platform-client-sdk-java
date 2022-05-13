---
title: UserRoutingStatusErrorInfo
---
## UserRoutingStatusErrorInfo


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **errorCode** | <!----><!---->**String**<!----> | A code unique to this error. Typically prefixed with the service that originated the error. For example CONFIG_USER_NOT_FOUND |  [optional] |
| **status** | <!----><!---->**Integer**<!----> | The HTTP status code for this message. If left blank the status code from the HTTP response is used. |  [optional] |
| **correlationId** | <!----><!---->**String**<!----> | The correlation Id or context Id for this message. If left blank the Public API will look at the HTTP response header 'ININ-Correlation-Id' instead. |  [optional] |
| **userMessage** | <!----><!---->**String**<!----> | A customer friendly message. This should be a complete sentence, use proper grammar and only include information useful to a customer. This is not a dev message and should not include things like Org Id |  [optional] |
| **userParamsMessage** | <!----><!---->**String**<!----> | This is the same as userMessage except it uses template fields for variable replacement. For instance: 'User {username} was not found' |  [optional] |
| **userParams** | <!----><!---->[**List&lt;UserRoutingStatusUserParam&gt;**](UserRoutingStatusUserParam.html)<!----> | Used in conjunction with userParamsMessage. These are the template parameters. For instance: UserParam.key = 'username', UserParam.value = 'chuck.pulfer' |  [optional] |
{: class="table table-striped"}



