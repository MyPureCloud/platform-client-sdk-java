---
title: OutboundDomain
---
## OutboundDomain


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | Unique Id of the domain such as: example.com |  |
| **name** | <!----><!---->**String**<!----> |  |  [optional] |
| **cnameVerificationResult** | <!----><!---->[**VerificationResult**](VerificationResult.html)<!----> | CNAME registration Status |  [optional] |
| **dkimVerificationResult** | <!----><!---->[**VerificationResult**](VerificationResult.html)<!----> | DKIM registration Status |  [optional] |
| **fromEmail** | <!----><!---->[**EmailAddress**](EmailAddress.html)<!----> | The email that is used to display sender informations |  [optional] |
| **replyToEmail** | <!----><!---->[**EmailAddress**](EmailAddress.html)<!----> | The email that is used if replies are expected |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}



