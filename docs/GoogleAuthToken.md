# GoogleAuthToken


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | ID of the Google OAuth 2 access token. The token cannot be accessed via Genesys API, only referenced by this property. When the token is not referenced by any integration, it is deleted after 24 hours. |  |
| **clientId** | **String** | ID of the Genesys-owned Google API client |  |
| **scopes** | **List&lt;String&gt;** | Google API authorization scopes that have been granted to the Genesys-owned Google API client |  |
| **dateCreated** | [**Date**](Date) | Date this token was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  |
| **createdBy** | [**DomainEntityRef**](DomainEntityRef) | User reference that created this Integration |  |




_com.mypurecloud.sdk.v2:platform-client-v2:257.1.0_
