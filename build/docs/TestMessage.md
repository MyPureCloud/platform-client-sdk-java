---
title: TestMessage
---
## TestMessage


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | After the message has been sent, this is the value of the Message-ID email header. |  [optional] |
| **to** | <!----><!---->[**List&lt;EmailAddress&gt;**](EmailAddress.html)<!----> | The recipients of the email message. |  |
| **from** | <!----><!---->[**EmailAddress**](EmailAddress.html)<!----> | The sender of the email message. |  |
| **subject** | <!----><!---->**String**<!----> | The subject of the email message. |  [optional] |
| **textBody** | <!----><!---->**String**<!----> | The text body of the email message. |  |
| **htmlBody** | <!----><!---->**String**<!----> | The html body of the email message |  [optional] |
| **time** | <!----><!---->[**Date**](Date.html)<!----> | The time when the message was sent. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
{: class="table table-striped"}



