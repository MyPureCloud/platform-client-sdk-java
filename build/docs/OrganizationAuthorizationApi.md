---
title: OrganizationAuthorizationApi
---
## OrganizationAuthorizationApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**deleteOrgauthorizationTrustee**](OrganizationAuthorizationApi.html#deleteOrgauthorizationTrustee) | Delete Org Trust |
| [**deleteOrgauthorizationTrusteeUser**](OrganizationAuthorizationApi.html#deleteOrgauthorizationTrusteeUser) | Delete Trustee User |
| [**deleteOrgauthorizationTrusteeUserRoles**](OrganizationAuthorizationApi.html#deleteOrgauthorizationTrusteeUserRoles) | Delete Trustee User Roles |
| [**deleteOrgauthorizationTrustor**](OrganizationAuthorizationApi.html#deleteOrgauthorizationTrustor) | Delete Org Trust |
| [**deleteOrgauthorizationTrustorUser**](OrganizationAuthorizationApi.html#deleteOrgauthorizationTrustorUser) | Delete Trustee User |
| [**getOrgauthorizationPairing**](OrganizationAuthorizationApi.html#getOrgauthorizationPairing) | Get Pairing Info |
| [**getOrgauthorizationTrustee**](OrganizationAuthorizationApi.html#getOrgauthorizationTrustee) | Get Org Trust |
| [**getOrgauthorizationTrusteeUser**](OrganizationAuthorizationApi.html#getOrgauthorizationTrusteeUser) | Get Trustee User |
| [**getOrgauthorizationTrusteeUserRoles**](OrganizationAuthorizationApi.html#getOrgauthorizationTrusteeUserRoles) | Get Trustee User Roles |
| [**getOrgauthorizationTrusteeUsers**](OrganizationAuthorizationApi.html#getOrgauthorizationTrusteeUsers) | The list of trustee users for this organization (i.e. users granted access to this organization). |
| [**getOrgauthorizationTrustees**](OrganizationAuthorizationApi.html#getOrgauthorizationTrustees) | The list of trustees for this organization (i.e. organizations granted access to this organization). |
| [**getOrgauthorizationTrustor**](OrganizationAuthorizationApi.html#getOrgauthorizationTrustor) | Get Org Trust |
| [**getOrgauthorizationTrustorUser**](OrganizationAuthorizationApi.html#getOrgauthorizationTrustorUser) | Get Trustee User |
| [**getOrgauthorizationTrustorUsers**](OrganizationAuthorizationApi.html#getOrgauthorizationTrustorUsers) | The list of users in the trustor organization (i.e. users granted access). |
| [**getOrgauthorizationTrustors**](OrganizationAuthorizationApi.html#getOrgauthorizationTrustors) | The list of organizations that have authorized/trusted your organization. |
| [**postOrgauthorizationPairings**](OrganizationAuthorizationApi.html#postOrgauthorizationPairings) | A pairing id is created by the trustee and given to the trustor to create a trust. |
| [**postOrgauthorizationTrusteeUsers**](OrganizationAuthorizationApi.html#postOrgauthorizationTrusteeUsers) | Add a user to the trust. |
| [**postOrgauthorizationTrustees**](OrganizationAuthorizationApi.html#postOrgauthorizationTrustees) | Create a new organization authorization trust. This is required to grant other organizations access to your organization. |
| [**postOrgauthorizationTrusteesAudits**](OrganizationAuthorizationApi.html#postOrgauthorizationTrusteesAudits) | Get Org Trustee Audits |
| [**postOrgauthorizationTrustorAudits**](OrganizationAuthorizationApi.html#postOrgauthorizationTrustorAudits) | Get Org Trustor Audits |
| [**putOrgauthorizationTrustee**](OrganizationAuthorizationApi.html#putOrgauthorizationTrustee) | Update Org Trust |
| [**putOrgauthorizationTrusteeUserRoledivisions**](OrganizationAuthorizationApi.html#putOrgauthorizationTrusteeUserRoledivisions) | Update Trustee User Roles |
| [**putOrgauthorizationTrusteeUserRoles**](OrganizationAuthorizationApi.html#putOrgauthorizationTrusteeUserRoles) | Update Trustee User Roles |
| [**putOrgauthorizationTrustorUser**](OrganizationAuthorizationApi.html#putOrgauthorizationTrustorUser) | Add a Trustee user to the trust. |
{: class="table-striped"}

<a name="deleteOrgauthorizationTrustee"></a>

# **deleteOrgauthorizationTrustee**



> Void deleteOrgauthorizationTrustee(trusteeOrgId)

Delete Org Trust



Wraps DELETE /api/v2/orgauthorization/trustees/{trusteeOrgId}  

Requires ANY permissions: 

* authorization:orgTrustee:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.OrganizationAuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

OrganizationAuthorizationApi apiInstance = new OrganizationAuthorizationApi();
String trusteeOrgId = "trusteeOrgId_example"; // String | Trustee Organization Id
try {
    apiInstance.deleteOrgauthorizationTrustee(trusteeOrgId);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationAuthorizationApi#deleteOrgauthorizationTrustee");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **trusteeOrgId** | **String**| Trustee Organization Id | 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="deleteOrgauthorizationTrusteeUser"></a>

# **deleteOrgauthorizationTrusteeUser**



> Void deleteOrgauthorizationTrusteeUser(trusteeOrgId, trusteeUserId)

Delete Trustee User



Wraps DELETE /api/v2/orgauthorization/trustees/{trusteeOrgId}/users/{trusteeUserId}  

Requires ANY permissions: 

* authorization:orgTrusteeUser:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.OrganizationAuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

OrganizationAuthorizationApi apiInstance = new OrganizationAuthorizationApi();
String trusteeOrgId = "trusteeOrgId_example"; // String | Trustee Organization Id
String trusteeUserId = "trusteeUserId_example"; // String | Trustee User Id
try {
    apiInstance.deleteOrgauthorizationTrusteeUser(trusteeOrgId, trusteeUserId);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationAuthorizationApi#deleteOrgauthorizationTrusteeUser");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **trusteeOrgId** | **String**| Trustee Organization Id | 
| **trusteeUserId** | **String**| Trustee User Id | 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="deleteOrgauthorizationTrusteeUserRoles"></a>

# **deleteOrgauthorizationTrusteeUserRoles**



> Void deleteOrgauthorizationTrusteeUserRoles(trusteeOrgId, trusteeUserId)

Delete Trustee User Roles



Wraps DELETE /api/v2/orgauthorization/trustees/{trusteeOrgId}/users/{trusteeUserId}/roles  

Requires ANY permissions: 

* authorization:orgTrusteeUser:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.OrganizationAuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

OrganizationAuthorizationApi apiInstance = new OrganizationAuthorizationApi();
String trusteeOrgId = "trusteeOrgId_example"; // String | Trustee Organization Id
String trusteeUserId = "trusteeUserId_example"; // String | Trustee User Id
try {
    apiInstance.deleteOrgauthorizationTrusteeUserRoles(trusteeOrgId, trusteeUserId);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationAuthorizationApi#deleteOrgauthorizationTrusteeUserRoles");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **trusteeOrgId** | **String**| Trustee Organization Id | 
| **trusteeUserId** | **String**| Trustee User Id | 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="deleteOrgauthorizationTrustor"></a>

# **deleteOrgauthorizationTrustor**



> Void deleteOrgauthorizationTrustor(trustorOrgId)

Delete Org Trust



Wraps DELETE /api/v2/orgauthorization/trustors/{trustorOrgId}  

Requires ANY permissions: 

* authorization:orgTrustor:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.OrganizationAuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

OrganizationAuthorizationApi apiInstance = new OrganizationAuthorizationApi();
String trustorOrgId = "trustorOrgId_example"; // String | Trustor Organization Id
try {
    apiInstance.deleteOrgauthorizationTrustor(trustorOrgId);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationAuthorizationApi#deleteOrgauthorizationTrustor");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **trustorOrgId** | **String**| Trustor Organization Id | 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="deleteOrgauthorizationTrustorUser"></a>

# **deleteOrgauthorizationTrustorUser**



> Void deleteOrgauthorizationTrustorUser(trustorOrgId, trusteeUserId)

Delete Trustee User



Wraps DELETE /api/v2/orgauthorization/trustors/{trustorOrgId}/users/{trusteeUserId}  

Requires ANY permissions: 

* authorization:orgTrusteeUser:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.OrganizationAuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

OrganizationAuthorizationApi apiInstance = new OrganizationAuthorizationApi();
String trustorOrgId = "trustorOrgId_example"; // String | Trustor Organization Id
String trusteeUserId = "trusteeUserId_example"; // String | Trustee User Id
try {
    apiInstance.deleteOrgauthorizationTrustorUser(trustorOrgId, trusteeUserId);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationAuthorizationApi#deleteOrgauthorizationTrustorUser");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **trustorOrgId** | **String**| Trustor Organization Id | 
| **trusteeUserId** | **String**| Trustee User Id | 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="getOrgauthorizationPairing"></a>

# **getOrgauthorizationPairing**



> [TrustRequest](TrustRequest.html) getOrgauthorizationPairing(pairingId)

Get Pairing Info



Wraps GET /api/v2/orgauthorization/pairings/{pairingId}  

Requires ANY permissions: 

* authorization:orgTrustee:view
* authorization:orgTrustor:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.OrganizationAuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

OrganizationAuthorizationApi apiInstance = new OrganizationAuthorizationApi();
String pairingId = "pairingId_example"; // String | Pairing Id
try {
    TrustRequest result = apiInstance.getOrgauthorizationPairing(pairingId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationAuthorizationApi#getOrgauthorizationPairing");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pairingId** | **String**| Pairing Id | 
{: class="table-striped"}


### Return type

[**TrustRequest**](TrustRequest.html)

<a name="getOrgauthorizationTrustee"></a>

# **getOrgauthorizationTrustee**



> [Trustee](Trustee.html) getOrgauthorizationTrustee(trusteeOrgId)

Get Org Trust



Wraps GET /api/v2/orgauthorization/trustees/{trusteeOrgId}  

Requires ANY permissions: 

* authorization:orgTrustee:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.OrganizationAuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

OrganizationAuthorizationApi apiInstance = new OrganizationAuthorizationApi();
String trusteeOrgId = "trusteeOrgId_example"; // String | Trustee Organization Id
try {
    Trustee result = apiInstance.getOrgauthorizationTrustee(trusteeOrgId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationAuthorizationApi#getOrgauthorizationTrustee");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **trusteeOrgId** | **String**| Trustee Organization Id | 
{: class="table-striped"}


### Return type

[**Trustee**](Trustee.html)

<a name="getOrgauthorizationTrusteeUser"></a>

# **getOrgauthorizationTrusteeUser**



> [TrustUser](TrustUser.html) getOrgauthorizationTrusteeUser(trusteeOrgId, trusteeUserId)

Get Trustee User



Wraps GET /api/v2/orgauthorization/trustees/{trusteeOrgId}/users/{trusteeUserId}  

Requires ANY permissions: 

* authorization:orgTrusteeUser:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.OrganizationAuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

OrganizationAuthorizationApi apiInstance = new OrganizationAuthorizationApi();
String trusteeOrgId = "trusteeOrgId_example"; // String | Trustee Organization Id
String trusteeUserId = "trusteeUserId_example"; // String | Trustee User Id
try {
    TrustUser result = apiInstance.getOrgauthorizationTrusteeUser(trusteeOrgId, trusteeUserId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationAuthorizationApi#getOrgauthorizationTrusteeUser");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **trusteeOrgId** | **String**| Trustee Organization Id | 
| **trusteeUserId** | **String**| Trustee User Id | 
{: class="table-striped"}


### Return type

[**TrustUser**](TrustUser.html)

<a name="getOrgauthorizationTrusteeUserRoles"></a>

# **getOrgauthorizationTrusteeUserRoles**



> [UserAuthorization](UserAuthorization.html) getOrgauthorizationTrusteeUserRoles(trusteeOrgId, trusteeUserId)

Get Trustee User Roles



Wraps GET /api/v2/orgauthorization/trustees/{trusteeOrgId}/users/{trusteeUserId}/roles  

Requires ANY permissions: 

* authorization:orgTrusteeUser:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.OrganizationAuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

OrganizationAuthorizationApi apiInstance = new OrganizationAuthorizationApi();
String trusteeOrgId = "trusteeOrgId_example"; // String | Trustee Organization Id
String trusteeUserId = "trusteeUserId_example"; // String | Trustee User Id
try {
    UserAuthorization result = apiInstance.getOrgauthorizationTrusteeUserRoles(trusteeOrgId, trusteeUserId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationAuthorizationApi#getOrgauthorizationTrusteeUserRoles");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **trusteeOrgId** | **String**| Trustee Organization Id | 
| **trusteeUserId** | **String**| Trustee User Id | 
{: class="table-striped"}


### Return type

[**UserAuthorization**](UserAuthorization.html)

<a name="getOrgauthorizationTrusteeUsers"></a>

# **getOrgauthorizationTrusteeUsers**



> [TrustUserEntityListing](TrustUserEntityListing.html) getOrgauthorizationTrusteeUsers(trusteeOrgId, pageSize, pageNumber)

The list of trustee users for this organization (i.e. users granted access to this organization).



Wraps GET /api/v2/orgauthorization/trustees/{trusteeOrgId}/users  

Requires ANY permissions: 

* authorization:orgTrusteeUser:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.OrganizationAuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

OrganizationAuthorizationApi apiInstance = new OrganizationAuthorizationApi();
String trusteeOrgId = "trusteeOrgId_example"; // String | Trustee Organization Id
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
try {
    TrustUserEntityListing result = apiInstance.getOrgauthorizationTrusteeUsers(trusteeOrgId, pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationAuthorizationApi#getOrgauthorizationTrusteeUsers");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **trusteeOrgId** | **String**| Trustee Organization Id | 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
{: class="table-striped"}


### Return type

[**TrustUserEntityListing**](TrustUserEntityListing.html)

<a name="getOrgauthorizationTrustees"></a>

# **getOrgauthorizationTrustees**



> [TrustEntityListing](TrustEntityListing.html) getOrgauthorizationTrustees(pageSize, pageNumber)

The list of trustees for this organization (i.e. organizations granted access to this organization).



Wraps GET /api/v2/orgauthorization/trustees  

Requires ANY permissions: 

* authorization:orgTrustee:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.OrganizationAuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

OrganizationAuthorizationApi apiInstance = new OrganizationAuthorizationApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
try {
    TrustEntityListing result = apiInstance.getOrgauthorizationTrustees(pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationAuthorizationApi#getOrgauthorizationTrustees");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
{: class="table-striped"}


### Return type

[**TrustEntityListing**](TrustEntityListing.html)

<a name="getOrgauthorizationTrustor"></a>

# **getOrgauthorizationTrustor**



> [Trustor](Trustor.html) getOrgauthorizationTrustor(trustorOrgId)

Get Org Trust



Wraps GET /api/v2/orgauthorization/trustors/{trustorOrgId}  

Requires ANY permissions: 

* authorization:orgTrustor:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.OrganizationAuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

OrganizationAuthorizationApi apiInstance = new OrganizationAuthorizationApi();
String trustorOrgId = "trustorOrgId_example"; // String | Trustor Organization Id
try {
    Trustor result = apiInstance.getOrgauthorizationTrustor(trustorOrgId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationAuthorizationApi#getOrgauthorizationTrustor");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **trustorOrgId** | **String**| Trustor Organization Id | 
{: class="table-striped"}


### Return type

[**Trustor**](Trustor.html)

<a name="getOrgauthorizationTrustorUser"></a>

# **getOrgauthorizationTrustorUser**



> [TrustUser](TrustUser.html) getOrgauthorizationTrustorUser(trustorOrgId, trusteeUserId)

Get Trustee User



Wraps GET /api/v2/orgauthorization/trustors/{trustorOrgId}/users/{trusteeUserId}  

Requires ANY permissions: 

* authorization:orgTrusteeUser:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.OrganizationAuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

OrganizationAuthorizationApi apiInstance = new OrganizationAuthorizationApi();
String trustorOrgId = "trustorOrgId_example"; // String | Trustor Organization Id
String trusteeUserId = "trusteeUserId_example"; // String | Trustee User Id
try {
    TrustUser result = apiInstance.getOrgauthorizationTrustorUser(trustorOrgId, trusteeUserId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationAuthorizationApi#getOrgauthorizationTrustorUser");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **trustorOrgId** | **String**| Trustor Organization Id | 
| **trusteeUserId** | **String**| Trustee User Id | 
{: class="table-striped"}


### Return type

[**TrustUser**](TrustUser.html)

<a name="getOrgauthorizationTrustorUsers"></a>

# **getOrgauthorizationTrustorUsers**



> [TrustUserEntityListing](TrustUserEntityListing.html) getOrgauthorizationTrustorUsers(trustorOrgId, pageSize, pageNumber)

The list of users in the trustor organization (i.e. users granted access).



Wraps GET /api/v2/orgauthorization/trustors/{trustorOrgId}/users  

Requires ANY permissions: 

* authorization:orgTrusteeUser:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.OrganizationAuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

OrganizationAuthorizationApi apiInstance = new OrganizationAuthorizationApi();
String trustorOrgId = "trustorOrgId_example"; // String | Trustee Organization Id
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
try {
    TrustUserEntityListing result = apiInstance.getOrgauthorizationTrustorUsers(trustorOrgId, pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationAuthorizationApi#getOrgauthorizationTrustorUsers");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **trustorOrgId** | **String**| Trustee Organization Id | 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
{: class="table-striped"}


### Return type

[**TrustUserEntityListing**](TrustUserEntityListing.html)

<a name="getOrgauthorizationTrustors"></a>

# **getOrgauthorizationTrustors**



> [TrustorEntityListing](TrustorEntityListing.html) getOrgauthorizationTrustors(pageSize, pageNumber)

The list of organizations that have authorized/trusted your organization.



Wraps GET /api/v2/orgauthorization/trustors  

Requires ANY permissions: 

* authorization:orgTrustor:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.OrganizationAuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

OrganizationAuthorizationApi apiInstance = new OrganizationAuthorizationApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
try {
    TrustorEntityListing result = apiInstance.getOrgauthorizationTrustors(pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationAuthorizationApi#getOrgauthorizationTrustors");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
{: class="table-striped"}


### Return type

[**TrustorEntityListing**](TrustorEntityListing.html)

<a name="postOrgauthorizationPairings"></a>

# **postOrgauthorizationPairings**



> [TrustRequest](TrustRequest.html) postOrgauthorizationPairings(body)

A pairing id is created by the trustee and given to the trustor to create a trust.



Wraps POST /api/v2/orgauthorization/pairings  

Requires ANY permissions: 

* authorization:orgTrustee:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.OrganizationAuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

OrganizationAuthorizationApi apiInstance = new OrganizationAuthorizationApi();
TrustRequestCreate body = new TrustRequestCreate(); // TrustRequestCreate | Pairing Info
try {
    TrustRequest result = apiInstance.postOrgauthorizationPairings(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationAuthorizationApi#postOrgauthorizationPairings");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**TrustRequestCreate**](TrustRequestCreate.html)| Pairing Info | 
{: class="table-striped"}


### Return type

[**TrustRequest**](TrustRequest.html)

<a name="postOrgauthorizationTrusteeUsers"></a>

# **postOrgauthorizationTrusteeUsers**



> [TrustUser](TrustUser.html) postOrgauthorizationTrusteeUsers(trusteeOrgId, body)

Add a user to the trust.



Wraps POST /api/v2/orgauthorization/trustees/{trusteeOrgId}/users  

Requires ANY permissions: 

* authorization:orgTrusteeUser:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.OrganizationAuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

OrganizationAuthorizationApi apiInstance = new OrganizationAuthorizationApi();
String trusteeOrgId = "trusteeOrgId_example"; // String | Trustee Organization Id
TrustMemberCreate body = new TrustMemberCreate(); // TrustMemberCreate | Trust
try {
    TrustUser result = apiInstance.postOrgauthorizationTrusteeUsers(trusteeOrgId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationAuthorizationApi#postOrgauthorizationTrusteeUsers");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **trusteeOrgId** | **String**| Trustee Organization Id | 
| **body** | [**TrustMemberCreate**](TrustMemberCreate.html)| Trust | 
{: class="table-striped"}


### Return type

[**TrustUser**](TrustUser.html)

<a name="postOrgauthorizationTrustees"></a>

# **postOrgauthorizationTrustees**



> [Trustee](Trustee.html) postOrgauthorizationTrustees(body)

Create a new organization authorization trust. This is required to grant other organizations access to your organization.



Wraps POST /api/v2/orgauthorization/trustees  

Requires ALL permissions: 

* authorization:orgTrustee:add
* authorization:orgTrusteeUser:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.OrganizationAuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

OrganizationAuthorizationApi apiInstance = new OrganizationAuthorizationApi();
TrustCreate body = new TrustCreate(); // TrustCreate | Trust
try {
    Trustee result = apiInstance.postOrgauthorizationTrustees(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationAuthorizationApi#postOrgauthorizationTrustees");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**TrustCreate**](TrustCreate.html)| Trust | 
{: class="table-striped"}


### Return type

[**Trustee**](Trustee.html)

<a name="postOrgauthorizationTrusteesAudits"></a>

# **postOrgauthorizationTrusteesAudits**



> [AuditQueryResponse](AuditQueryResponse.html) postOrgauthorizationTrusteesAudits(body, pageSize, pageNumber, sortBy, sortOrder)

Get Org Trustee Audits



Wraps POST /api/v2/orgauthorization/trustees/audits  

Requires ANY permissions: 

* authorization:audit:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.OrganizationAuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

OrganizationAuthorizationApi apiInstance = new OrganizationAuthorizationApi();
TrusteeAuditQueryRequest body = new TrusteeAuditQueryRequest(); // TrusteeAuditQueryRequest | Values to scope the request.
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String sortBy = "timestamp"; // String | Sort by
String sortOrder = "descending"; // String | Sort order
try {
    AuditQueryResponse result = apiInstance.postOrgauthorizationTrusteesAudits(body, pageSize, pageNumber, sortBy, sortOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationAuthorizationApi#postOrgauthorizationTrusteesAudits");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**TrusteeAuditQueryRequest**](TrusteeAuditQueryRequest.html)| Values to scope the request. | 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **sortBy** | **String**| Sort by | [optional] [default to timestamp] 
| **sortOrder** | **String**| Sort order | [optional] [default to descending] 
{: class="table-striped"}


### Return type

[**AuditQueryResponse**](AuditQueryResponse.html)

<a name="postOrgauthorizationTrustorAudits"></a>

# **postOrgauthorizationTrustorAudits**



> [AuditQueryResponse](AuditQueryResponse.html) postOrgauthorizationTrustorAudits(body, pageSize, pageNumber, sortBy, sortOrder)

Get Org Trustor Audits



Wraps POST /api/v2/orgauthorization/trustor/audits  

Requires ANY permissions: 

* authorization:audit:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.OrganizationAuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

OrganizationAuthorizationApi apiInstance = new OrganizationAuthorizationApi();
TrustorAuditQueryRequest body = new TrustorAuditQueryRequest(); // TrustorAuditQueryRequest | Values to scope the request.
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String sortBy = "timestamp"; // String | Sort by
String sortOrder = "descending"; // String | Sort order
try {
    AuditQueryResponse result = apiInstance.postOrgauthorizationTrustorAudits(body, pageSize, pageNumber, sortBy, sortOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationAuthorizationApi#postOrgauthorizationTrustorAudits");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**TrustorAuditQueryRequest**](TrustorAuditQueryRequest.html)| Values to scope the request. | 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **sortBy** | **String**| Sort by | [optional] [default to timestamp] 
| **sortOrder** | **String**| Sort order | [optional] [default to descending] 
{: class="table-striped"}


### Return type

[**AuditQueryResponse**](AuditQueryResponse.html)

<a name="putOrgauthorizationTrustee"></a>

# **putOrgauthorizationTrustee**



> [Trustee](Trustee.html) putOrgauthorizationTrustee(trusteeOrgId, body)

Update Org Trust



Wraps PUT /api/v2/orgauthorization/trustees/{trusteeOrgId}  

Requires ANY permissions: 

* authorization:orgTrustee:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.OrganizationAuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

OrganizationAuthorizationApi apiInstance = new OrganizationAuthorizationApi();
String trusteeOrgId = "trusteeOrgId_example"; // String | Trustee Organization Id
TrustUpdate body = new TrustUpdate(); // TrustUpdate | Client
try {
    Trustee result = apiInstance.putOrgauthorizationTrustee(trusteeOrgId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationAuthorizationApi#putOrgauthorizationTrustee");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **trusteeOrgId** | **String**| Trustee Organization Id | 
| **body** | [**TrustUpdate**](TrustUpdate.html)| Client | 
{: class="table-striped"}


### Return type

[**Trustee**](Trustee.html)

<a name="putOrgauthorizationTrusteeUserRoledivisions"></a>

# **putOrgauthorizationTrusteeUserRoledivisions**



> [UserAuthorization](UserAuthorization.html) putOrgauthorizationTrusteeUserRoledivisions(trusteeOrgId, trusteeUserId, body)

Update Trustee User Roles



Wraps PUT /api/v2/orgauthorization/trustees/{trusteeOrgId}/users/{trusteeUserId}/roledivisions  

Requires ANY permissions: 

* authorization:orgTrusteeUser:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.OrganizationAuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

OrganizationAuthorizationApi apiInstance = new OrganizationAuthorizationApi();
String trusteeOrgId = "trusteeOrgId_example"; // String | Trustee Organization Id
String trusteeUserId = "trusteeUserId_example"; // String | Trustee User Id
RoleDivisionGrants body = new RoleDivisionGrants(); // RoleDivisionGrants | Set of roles with corresponding divisions to apply
try {
    UserAuthorization result = apiInstance.putOrgauthorizationTrusteeUserRoledivisions(trusteeOrgId, trusteeUserId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationAuthorizationApi#putOrgauthorizationTrusteeUserRoledivisions");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **trusteeOrgId** | **String**| Trustee Organization Id | 
| **trusteeUserId** | **String**| Trustee User Id | 
| **body** | [**RoleDivisionGrants**](RoleDivisionGrants.html)| Set of roles with corresponding divisions to apply | 
{: class="table-striped"}


### Return type

[**UserAuthorization**](UserAuthorization.html)

<a name="putOrgauthorizationTrusteeUserRoles"></a>

# **putOrgauthorizationTrusteeUserRoles**



> [UserAuthorization](UserAuthorization.html) putOrgauthorizationTrusteeUserRoles(trusteeOrgId, trusteeUserId, body)

Update Trustee User Roles



Wraps PUT /api/v2/orgauthorization/trustees/{trusteeOrgId}/users/{trusteeUserId}/roles  

Requires ANY permissions: 

* authorization:orgTrusteeUser:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.OrganizationAuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

OrganizationAuthorizationApi apiInstance = new OrganizationAuthorizationApi();
String trusteeOrgId = "trusteeOrgId_example"; // String | Trustee Organization Id
String trusteeUserId = "trusteeUserId_example"; // String | Trustee User Id
List<String> body = Arrays.asList(new List<String>()); // List<String> | List of roles
try {
    UserAuthorization result = apiInstance.putOrgauthorizationTrusteeUserRoles(trusteeOrgId, trusteeUserId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationAuthorizationApi#putOrgauthorizationTrusteeUserRoles");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **trusteeOrgId** | **String**| Trustee Organization Id | 
| **trusteeUserId** | **String**| Trustee User Id | 
| **body** | **List&lt;String&gt;**| List of roles | 
{: class="table-striped"}


### Return type

[**UserAuthorization**](UserAuthorization.html)

<a name="putOrgauthorizationTrustorUser"></a>

# **putOrgauthorizationTrustorUser**



> [TrustUser](TrustUser.html) putOrgauthorizationTrustorUser(trustorOrgId, trusteeUserId)

Add a Trustee user to the trust.



Wraps PUT /api/v2/orgauthorization/trustors/{trustorOrgId}/users/{trusteeUserId}  

Requires ALL permissions: 

* authorization:orgTrusteeUser:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.OrganizationAuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

OrganizationAuthorizationApi apiInstance = new OrganizationAuthorizationApi();
String trustorOrgId = "trustorOrgId_example"; // String | Trustor Organization Id
String trusteeUserId = "trusteeUserId_example"; // String | Trustee User Id
try {
    TrustUser result = apiInstance.putOrgauthorizationTrustorUser(trustorOrgId, trusteeUserId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationAuthorizationApi#putOrgauthorizationTrustorUser");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **trustorOrgId** | **String**| Trustor Organization Id | 
| **trusteeUserId** | **String**| Trustee User Id | 
{: class="table-striped"}


### Return type

[**TrustUser**](TrustUser.html)

