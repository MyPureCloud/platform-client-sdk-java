---
title: TrustCreate
---
## TrustCreate


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **pairingId** | **String** | The pairing Id created by the trustee. This is required to prove that the trustee agrees to the relationship. |  |
| **enabled** | **Boolean** | If disabled no trustee user will have access, even if they were previously added. |  |
| **users** | [**List&lt;TrustUserCreate&gt;**](TrustUserCreate.html) | The list of users and their roles to which access will be granted. The users are from the trustee and the roles are from the trustor. |  |
{: class="table table-striped"}
{: class="table table-striped"}


