---
title: Trustee
---
## Trustee


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | Organization Id for this trust. |  [optional] |
| **enabled** | <!----><!---->**Boolean**<!----> | If disabled no trustee user will have access, even if they were previously added. |  |
| **usesDefaultRole** | <!----><!---->**Boolean**<!----> | Denotes if trustee uses admin role by default. |  [optional] |
| **dateCreated** | <!----><!---->[**Date**](Date.html)<!----> | Date Trust was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateExpired** | <!----><!---->[**Date**](Date.html)<!----> | The expiration date of the trust. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **createdBy** | <!----><!---->[**OrgUser**](OrgUser.html)<!----> | User that created trust. |  [optional] |
| **organization** | <!----><!---->[**Organization**](Organization.html)<!----> | Organization associated with this trust. |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}



