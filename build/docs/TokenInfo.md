# TokenInfo


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **organization** | [**NamedEntity**](NamedEntity) | The current organization |  [optional] |
| **homeOrganization** | [**NamedEntity**](NamedEntity) | The token's home organization |  [optional] |
| **authorizedScope** | **List&lt;String&gt;** | The list of scopes authorized for the OAuth client |  [optional] |
| **clonedUser** | [**TokenInfoClonedUser**](TokenInfoClonedUser) | Only present when a user is a clone of trustee user in the trustor org. |  [optional] |
| **oAuthClient** | [**OrgOAuthClient**](OrgOAuthClient) |  |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:220.0.0_
