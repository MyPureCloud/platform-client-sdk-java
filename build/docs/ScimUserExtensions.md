---
title: ScimUserExtensions
---
## ScimUserExtensions


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **routingSkills** | <!----><!---->[**List&lt;ScimUserRoutingSkill&gt;**](ScimUserRoutingSkill.html)<!----> | The list of routing skills assigned to a user. Maximum 50 skills. |  [optional] |
| **routingLanguages** | <!----><!---->[**List&lt;ScimUserRoutingLanguage&gt;**](ScimUserRoutingLanguage.html)<!----> | The list of routing languages assigned to a user. Maximum 50 languages. |  [optional] |
| **externalIds** | <!----><!---->[**List&lt;ScimGenesysUserExternalId&gt;**](ScimGenesysUserExternalId.html)<!----> | The list of external identifiers assigned to user. Always includes an immutable SCIM authority prefixed with \"x-pc:scimv2:v1\". ExternalIds are searchable with complex filter query parameter using 'authority' and 'value', e.g., filter=urn:ietf:params:scim:schemas:extension:genesys:purecloud:2.0:User:externalIds[authority eq \"matchAuthName\" and value eq \"matchingExternalKeyValue\"]. |  [optional] |
{: class="table table-striped"}



