---
title: ScimV2Group
---
## ScimV2Group


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The ID of the SCIM resource. Set by the service provider. \&quot;caseExact\&quot; is set to \&quot;true\&quot;. \&quot;Mutability\&quot; is set to \&quot;readOnly\&quot;. \&quot;Returned\&quot; is set to \&quot;always\&quot;. |  [optional] |
| **schemas** | <!----><!---->**List&lt;String&gt;**<!----> | The list of supported schemas. |  [optional] |
| **displayName** | <!----><!---->**String**<!----> | The display name of the group. |  [optional] |
| **members** | <!----><!---->[**List&lt;ScimV2MemberReference&gt;**](ScimV2MemberReference.html)<!----> | The list of members in the group. |  [optional] |
| **meta** | <!----><!---->[**ScimMetadata**](ScimMetadata.html)<!----> | The metadata of the SCIM resource. |  [optional] |
{: class="table table-striped"}



