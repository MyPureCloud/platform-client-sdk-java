---
title: TrustCreate
---
## TrustCreate


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **pairingId** | <!----><!---->**String**<!----> | The pairing Id created by the trustee. This is required to prove that the trustee agrees to the relationship.  Not required when creating a default pairing with Customer Care. |  [optional] |
| **enabled** | <!----><!---->**Boolean**<!----> | If disabled no trustee user will have access, even if they were previously added. |  |
| **users** | <!----><!---->[**List&lt;TrustMemberCreate&gt;**](TrustMemberCreate.html)<!----> | The list of users and their roles to which access will be granted. The users are from the trustee and the roles are from the trustor. If no users are specified, at least one group is required. |  [optional] |
| **groups** | <!----><!---->[**List&lt;TrustMemberCreate&gt;**](TrustMemberCreate.html)<!----> | The list of groups and their roles to which access will be granted. The groups are from the trustee and the roles are from the trustor. If no groups are specified, at least one user is required. |  [optional] |
| **dateExpired** | <!----><!---->[**Date**](Date.html)<!----> | The expiration date of the trust. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
{: class="table table-striped"}



