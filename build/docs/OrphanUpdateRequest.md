---
title: OrphanUpdateRequest
---
## OrphanUpdateRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **archiveDate** | <!----><!---->[**Date**](Date.html)<!----> | The orphan recording's archive date. Must be greater than 1 day from now if set. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **deleteDate** | <!----><!---->[**Date**](Date.html)<!----> | The orphan recording's delete date. Must be greater than archiveDate and exportDate if set, otherwise one day from now. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **exportDate** | <!----><!---->[**Date**](Date.html)<!----> | The orphan recording's export date. Must be greater than 1 day from now if set. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **integrationId** | <!----><!---->**String**<!----> | IntegrationId to access AWS S3 bucket for export. This field is required if exportDate is set. |  [optional] |
| **conversationId** | <!----><!---->**String**<!----> | A conversation Id that this orphan's recording is to be attached to. If not present, the conversationId will be deduced from the recording media. |  [optional] |
{: class="table table-striped"}



