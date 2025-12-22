# OrganizationAuthorizationApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**deleteOrgauthorizationTrustee**](OrganizationAuthorizationApi#deleteOrgauthorizationTrustee) | Delete Org Trust |
| [**deleteOrgauthorizationTrusteeCloneduser**](OrganizationAuthorizationApi#deleteOrgauthorizationTrusteeCloneduser) | Deletes cloned user |
| [**deleteOrgauthorizationTrusteeGroup**](OrganizationAuthorizationApi#deleteOrgauthorizationTrusteeGroup) | Delete Trustee Group |
| [**deleteOrgauthorizationTrusteeGroupRoles**](OrganizationAuthorizationApi#deleteOrgauthorizationTrusteeGroupRoles) | Delete Trustee Group Roles |
| [**deleteOrgauthorizationTrusteeUser**](OrganizationAuthorizationApi#deleteOrgauthorizationTrusteeUser) | Delete Trustee User |
| [**deleteOrgauthorizationTrusteeUserRoles**](OrganizationAuthorizationApi#deleteOrgauthorizationTrusteeUserRoles) | Delete Trustee User Roles |
| [**deleteOrgauthorizationTrustees**](OrganizationAuthorizationApi#deleteOrgauthorizationTrustees) | Delete Bulk Org Trustees |
| [**deleteOrgauthorizationTrustor**](OrganizationAuthorizationApi#deleteOrgauthorizationTrustor) | Delete Org Trust |
| [**deleteOrgauthorizationTrustorCloneduser**](OrganizationAuthorizationApi#deleteOrgauthorizationTrustorCloneduser) | Delete Cloned User |
| [**deleteOrgauthorizationTrustorGroup**](OrganizationAuthorizationApi#deleteOrgauthorizationTrustorGroup) | Delete Trustee Group |
| [**deleteOrgauthorizationTrustorUser**](OrganizationAuthorizationApi#deleteOrgauthorizationTrustorUser) | Delete Trustee User |
| [**deleteOrgauthorizationTrustors**](OrganizationAuthorizationApi#deleteOrgauthorizationTrustors) | Delete Bulk Org Trustors |
| [**getOrgauthorizationPairing**](OrganizationAuthorizationApi#getOrgauthorizationPairing) | Get Pairing Info |
| [**getOrgauthorizationTrustee**](OrganizationAuthorizationApi#getOrgauthorizationTrustee) | Get Org Trust |
| [**getOrgauthorizationTrusteeClonedusers**](OrganizationAuthorizationApi#getOrgauthorizationTrusteeClonedusers) | The list of cloned users from the trustee organization (i.e. users with a native user record). |
| [**getOrgauthorizationTrusteeGroup**](OrganizationAuthorizationApi#getOrgauthorizationTrusteeGroup) | Get Trustee Group |
| [**getOrgauthorizationTrusteeGroupRoles**](OrganizationAuthorizationApi#getOrgauthorizationTrusteeGroupRoles) | Get Trustee Group Roles |
| [**getOrgauthorizationTrusteeGroups**](OrganizationAuthorizationApi#getOrgauthorizationTrusteeGroups) | The list of trustee groups for this organization (i.e. groups granted access to this organization). |
| [**getOrgauthorizationTrusteeUser**](OrganizationAuthorizationApi#getOrgauthorizationTrusteeUser) | Get Trustee User |
| [**getOrgauthorizationTrusteeUserRoles**](OrganizationAuthorizationApi#getOrgauthorizationTrusteeUserRoles) | Get Trustee User Roles |
| [**getOrgauthorizationTrusteeUsers**](OrganizationAuthorizationApi#getOrgauthorizationTrusteeUsers) | The list of trustee users for this organization (i.e. users granted access to this organization). |
| [**getOrgauthorizationTrustees**](OrganizationAuthorizationApi#getOrgauthorizationTrustees) | The list of trustees for this organization (i.e. organizations granted access to this organization). |
| [**getOrgauthorizationTrusteesCare**](OrganizationAuthorizationApi#getOrgauthorizationTrusteesCare) | Get Customer Care organization ids. |
| [**getOrgauthorizationTrusteesDefault**](OrganizationAuthorizationApi#getOrgauthorizationTrusteesDefault) | Get organization authorization trust with Customer Care, if one exists. |
| [**getOrgauthorizationTrustor**](OrganizationAuthorizationApi#getOrgauthorizationTrustor) | Get Org Trust |
| [**getOrgauthorizationTrustorCloneduser**](OrganizationAuthorizationApi#getOrgauthorizationTrustorCloneduser) | Get Cloned User |
| [**getOrgauthorizationTrustorClonedusers**](OrganizationAuthorizationApi#getOrgauthorizationTrustorClonedusers) | The list of cloned users in the trustor organization (i.e. users with a native user record). |
| [**getOrgauthorizationTrustorGroup**](OrganizationAuthorizationApi#getOrgauthorizationTrustorGroup) | Get Trustee Group |
| [**getOrgauthorizationTrustorGroups**](OrganizationAuthorizationApi#getOrgauthorizationTrustorGroups) | The list of groups in the trustor organization (i.e. groups granted access). |
| [**getOrgauthorizationTrustorUser**](OrganizationAuthorizationApi#getOrgauthorizationTrustorUser) | Get Trustee User |
| [**getOrgauthorizationTrustorUsers**](OrganizationAuthorizationApi#getOrgauthorizationTrustorUsers) | The list of users in the trustor organization (i.e. users granted access). |
| [**getOrgauthorizationTrustors**](OrganizationAuthorizationApi#getOrgauthorizationTrustors) | The list of organizations that have authorized/trusted your organization. |
| [**postOrgauthorizationPairings**](OrganizationAuthorizationApi#postOrgauthorizationPairings) | A pairing id is created by the trustee and given to the trustor to create a trust. |
| [**postOrgauthorizationTrusteeGroups**](OrganizationAuthorizationApi#postOrgauthorizationTrusteeGroups) | Add a group to the trust. |
| [**postOrgauthorizationTrusteeUsers**](OrganizationAuthorizationApi#postOrgauthorizationTrusteeUsers) | Add a user to the trust. |
| [**postOrgauthorizationTrustees**](OrganizationAuthorizationApi#postOrgauthorizationTrustees) | Create a new organization authorization trust. This is required to grant other organizations access to your organization. |
| [**postOrgauthorizationTrusteesAudits**](OrganizationAuthorizationApi#postOrgauthorizationTrusteesAudits) | Get Org Trustee Audits |
| [**postOrgauthorizationTrusteesCare**](OrganizationAuthorizationApi#postOrgauthorizationTrusteesCare) | Create a new organization authorization trust with Customer Care. This is required to grant your regional Customer Care organization access to your organization. |
| [**postOrgauthorizationTrusteesDefault**](OrganizationAuthorizationApi#postOrgauthorizationTrusteesDefault) | Create a new organization authorization trust with Customer Care. This is required to grant your regional Customer Care organization access to your organization. |
| [**postOrgauthorizationTrustorAudits**](OrganizationAuthorizationApi#postOrgauthorizationTrustorAudits) | Get Org Trustor Audits |
| [**putOrgauthorizationTrustee**](OrganizationAuthorizationApi#putOrgauthorizationTrustee) | Update Org Trust |
| [**putOrgauthorizationTrusteeGroupRoledivisions**](OrganizationAuthorizationApi#putOrgauthorizationTrusteeGroupRoledivisions) | Update Trustee Group Roles |
| [**putOrgauthorizationTrusteeGroupRoles**](OrganizationAuthorizationApi#putOrgauthorizationTrusteeGroupRoles) | Update Trustee Group Roles |
| [**putOrgauthorizationTrusteeUserRoledivisions**](OrganizationAuthorizationApi#putOrgauthorizationTrusteeUserRoledivisions) | Update Trustee User Roles |
| [**putOrgauthorizationTrusteeUserRoles**](OrganizationAuthorizationApi#putOrgauthorizationTrusteeUserRoles) | Update Trustee User Roles |
| [**putOrgauthorizationTrustorCloneduser**](OrganizationAuthorizationApi#putOrgauthorizationTrustorCloneduser) | Creates a clone of the trustee user in the trustor org. |
| [**putOrgauthorizationTrustorGroup**](OrganizationAuthorizationApi#putOrgauthorizationTrustorGroup) | Add a Trustee Group to the trust. |
| [**putOrgauthorizationTrustorUser**](OrganizationAuthorizationApi#putOrgauthorizationTrustorUser) | Add a Trustee user to the trust. |
{: class="table-striped"}


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


# **deleteOrgauthorizationTrusteeCloneduser**


> Void deleteOrgauthorizationTrusteeCloneduser(trusteeOrgId, trusteeUserId)

Deletes cloned user

Wraps DELETE /api/v2/orgauthorization/trustees/{trusteeOrgId}/clonedusers/{trusteeUserId}  

Requires ANY permissions: 

* directory:user:delete

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
String trusteeUserId = "trusteeUserId_example"; // String | Id of the cloned user to delete
try {
    apiInstance.deleteOrgauthorizationTrusteeCloneduser(trusteeOrgId, trusteeUserId);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationAuthorizationApi#deleteOrgauthorizationTrusteeCloneduser");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **trusteeOrgId** | **String**| Trustee Organization Id | 
| **trusteeUserId** | **String**| Id of the cloned user to delete | 
{: class="table-striped"}


### Return type

null (empty response body)


# **deleteOrgauthorizationTrusteeGroup**


> Void deleteOrgauthorizationTrusteeGroup(trusteeOrgId, trusteeGroupId)

Delete Trustee Group

Wraps DELETE /api/v2/orgauthorization/trustees/{trusteeOrgId}/groups/{trusteeGroupId}  

Requires ANY permissions: 

* authorization:orgTrusteeGroup:delete

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
String trusteeGroupId = "trusteeGroupId_example"; // String | Trustee Group Id
try {
    apiInstance.deleteOrgauthorizationTrusteeGroup(trusteeOrgId, trusteeGroupId);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationAuthorizationApi#deleteOrgauthorizationTrusteeGroup");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **trusteeOrgId** | **String**| Trustee Organization Id | 
| **trusteeGroupId** | **String**| Trustee Group Id | 
{: class="table-striped"}


### Return type

null (empty response body)


# **deleteOrgauthorizationTrusteeGroupRoles**


> Void deleteOrgauthorizationTrusteeGroupRoles(trusteeOrgId, trusteeGroupId)

Delete Trustee Group Roles

Wraps DELETE /api/v2/orgauthorization/trustees/{trusteeOrgId}/groups/{trusteeGroupId}/roles  

Requires ANY permissions: 

* authorization:orgTrusteeGroup:delete

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
String trusteeGroupId = "trusteeGroupId_example"; // String | Trustee Group Id
try {
    apiInstance.deleteOrgauthorizationTrusteeGroupRoles(trusteeOrgId, trusteeGroupId);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationAuthorizationApi#deleteOrgauthorizationTrusteeGroupRoles");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **trusteeOrgId** | **String**| Trustee Organization Id | 
| **trusteeGroupId** | **String**| Trustee Group Id | 
{: class="table-striped"}


### Return type

null (empty response body)


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


# **deleteOrgauthorizationTrustees**


> Void deleteOrgauthorizationTrustees(id)

Delete Bulk Org Trustees

deleteOrgauthorizationTrustees is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps DELETE /api/v2/orgauthorization/trustees  

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
List<String> id = Arrays.asList(null); // List<String> | Comma separated list of trustee ids to remove
try {
    apiInstance.deleteOrgauthorizationTrustees(id);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationAuthorizationApi#deleteOrgauthorizationTrustees");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | [**List&lt;String&gt;**](String)| Comma separated list of trustee ids to remove | 
{: class="table-striped"}


### Return type

null (empty response body)


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


# **deleteOrgauthorizationTrustorCloneduser**


> Void deleteOrgauthorizationTrustorCloneduser(trustorOrgId, trusteeUserId)

Delete Cloned User

Wraps DELETE /api/v2/orgauthorization/trustors/{trustorOrgId}/clonedusers/{trusteeUserId}  

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
    apiInstance.deleteOrgauthorizationTrustorCloneduser(trustorOrgId, trusteeUserId);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationAuthorizationApi#deleteOrgauthorizationTrustorCloneduser");
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


# **deleteOrgauthorizationTrustorGroup**


> Void deleteOrgauthorizationTrustorGroup(trustorOrgId, trustorGroupId)

Delete Trustee Group

Wraps DELETE /api/v2/orgauthorization/trustors/{trustorOrgId}/groups/{trustorGroupId}  

Requires ANY permissions: 

* authorization:orgTrusteeGroup:delete

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
String trustorGroupId = "trustorGroupId_example"; // String | Trustor Group Id
try {
    apiInstance.deleteOrgauthorizationTrustorGroup(trustorOrgId, trustorGroupId);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationAuthorizationApi#deleteOrgauthorizationTrustorGroup");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **trustorOrgId** | **String**| Trustor Organization Id | 
| **trustorGroupId** | **String**| Trustor Group Id | 
{: class="table-striped"}


### Return type

null (empty response body)


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


# **deleteOrgauthorizationTrustors**


> Void deleteOrgauthorizationTrustors(id)

Delete Bulk Org Trustors

deleteOrgauthorizationTrustors is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps DELETE /api/v2/orgauthorization/trustors  

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
List<String> id = Arrays.asList(null); // List<String> | Comma separated list of trustor ids to remove
try {
    apiInstance.deleteOrgauthorizationTrustors(id);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationAuthorizationApi#deleteOrgauthorizationTrustors");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | [**List&lt;String&gt;**](String)| Comma separated list of trustor ids to remove | 
{: class="table-striped"}


### Return type

null (empty response body)


# **getOrgauthorizationPairing**


> [TrustRequest](TrustRequest) getOrgauthorizationPairing(pairingId)

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

[**TrustRequest**](TrustRequest)


# **getOrgauthorizationTrustee**


> [Trustee](Trustee) getOrgauthorizationTrustee(trusteeOrgId)

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

[**Trustee**](Trustee)


# **getOrgauthorizationTrusteeClonedusers**


> [ClonedUserEntityListing](ClonedUserEntityListing) getOrgauthorizationTrusteeClonedusers(trusteeOrgId)

The list of cloned users from the trustee organization (i.e. users with a native user record).

There can be no more than 5 cloned users per organization, so results are represented as simple list and not paged

Wraps GET /api/v2/orgauthorization/trustees/{trusteeOrgId}/clonedusers  

Requires ANY permissions: 

* directory:user:view

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
    ClonedUserEntityListing result = apiInstance.getOrgauthorizationTrusteeClonedusers(trusteeOrgId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationAuthorizationApi#getOrgauthorizationTrusteeClonedusers");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **trusteeOrgId** | **String**| Trustee Organization Id | 
{: class="table-striped"}


### Return type

[**ClonedUserEntityListing**](ClonedUserEntityListing)


# **getOrgauthorizationTrusteeGroup**


> [TrustGroup](TrustGroup) getOrgauthorizationTrusteeGroup(trusteeOrgId, trusteeGroupId)

Get Trustee Group

Wraps GET /api/v2/orgauthorization/trustees/{trusteeOrgId}/groups/{trusteeGroupId}  

Requires ANY permissions: 

* authorization:orgTrusteeGroup:view

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
String trusteeGroupId = "trusteeGroupId_example"; // String | Trustee Group Id
try {
    TrustGroup result = apiInstance.getOrgauthorizationTrusteeGroup(trusteeOrgId, trusteeGroupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationAuthorizationApi#getOrgauthorizationTrusteeGroup");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **trusteeOrgId** | **String**| Trustee Organization Id | 
| **trusteeGroupId** | **String**| Trustee Group Id | 
{: class="table-striped"}


### Return type

[**TrustGroup**](TrustGroup)


# **getOrgauthorizationTrusteeGroupRoles**


> [UserAuthorization](UserAuthorization) getOrgauthorizationTrusteeGroupRoles(trusteeOrgId, trusteeGroupId)

Get Trustee Group Roles

Wraps GET /api/v2/orgauthorization/trustees/{trusteeOrgId}/groups/{trusteeGroupId}/roles  

Requires ANY permissions: 

* authorization:orgTrusteeGroup:view

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
String trusteeGroupId = "trusteeGroupId_example"; // String | Trustee Group Id
try {
    UserAuthorization result = apiInstance.getOrgauthorizationTrusteeGroupRoles(trusteeOrgId, trusteeGroupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationAuthorizationApi#getOrgauthorizationTrusteeGroupRoles");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **trusteeOrgId** | **String**| Trustee Organization Id | 
| **trusteeGroupId** | **String**| Trustee Group Id | 
{: class="table-striped"}


### Return type

[**UserAuthorization**](UserAuthorization)


# **getOrgauthorizationTrusteeGroups**


> [TrustGroupEntityListing](TrustGroupEntityListing) getOrgauthorizationTrusteeGroups(trusteeOrgId, pageSize, pageNumber)

The list of trustee groups for this organization (i.e. groups granted access to this organization).

Wraps GET /api/v2/orgauthorization/trustees/{trusteeOrgId}/groups  

Requires ANY permissions: 

* authorization:orgTrusteeGroup:view

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
    TrustGroupEntityListing result = apiInstance.getOrgauthorizationTrusteeGroups(trusteeOrgId, pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationAuthorizationApi#getOrgauthorizationTrusteeGroups");
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

[**TrustGroupEntityListing**](TrustGroupEntityListing)


# **getOrgauthorizationTrusteeUser**


> [TrustUser](TrustUser) getOrgauthorizationTrusteeUser(trusteeOrgId, trusteeUserId)

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

[**TrustUser**](TrustUser)


# **getOrgauthorizationTrusteeUserRoles**


> [UserAuthorization](UserAuthorization) getOrgauthorizationTrusteeUserRoles(trusteeOrgId, trusteeUserId)

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

[**UserAuthorization**](UserAuthorization)


# **getOrgauthorizationTrusteeUsers**


> [TrustUserEntityListing](TrustUserEntityListing) getOrgauthorizationTrusteeUsers(trusteeOrgId, pageSize, pageNumber)

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

[**TrustUserEntityListing**](TrustUserEntityListing)


# **getOrgauthorizationTrustees**


> [TrustEntityListing](TrustEntityListing) getOrgauthorizationTrustees(pageSize, pageNumber)

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

[**TrustEntityListing**](TrustEntityListing)


# **getOrgauthorizationTrusteesCare**


> [TrusteeReferenceList](TrusteeReferenceList) getOrgauthorizationTrusteesCare()

Get Customer Care organization ids.

Wraps GET /api/v2/orgauthorization/trustees/care  

Requires ANY permissions: 

* authorization:orgTrustee:view
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
try {
    TrusteeReferenceList result = apiInstance.getOrgauthorizationTrusteesCare();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationAuthorizationApi#getOrgauthorizationTrusteesCare");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**TrusteeReferenceList**](TrusteeReferenceList)


# **getOrgauthorizationTrusteesDefault**


> [Trustee](Trustee) getOrgauthorizationTrusteesDefault()

Get organization authorization trust with Customer Care, if one exists.

Wraps GET /api/v2/orgauthorization/trustees/default  

Requires ANY permissions: 

* authorization:orgTrustee:view
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
try {
    Trustee result = apiInstance.getOrgauthorizationTrusteesDefault();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationAuthorizationApi#getOrgauthorizationTrusteesDefault");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**Trustee**](Trustee)


# **getOrgauthorizationTrustor**


> [Trustor](Trustor) getOrgauthorizationTrustor(trustorOrgId)

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

[**Trustor**](Trustor)


# **getOrgauthorizationTrustorCloneduser**


> [ClonedUser](ClonedUser) getOrgauthorizationTrustorCloneduser(trustorOrgId, trusteeUserId)

Get Cloned User

Wraps GET /api/v2/orgauthorization/trustors/{trustorOrgId}/clonedusers/{trusteeUserId}  

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
    ClonedUser result = apiInstance.getOrgauthorizationTrustorCloneduser(trustorOrgId, trusteeUserId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationAuthorizationApi#getOrgauthorizationTrustorCloneduser");
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

[**ClonedUser**](ClonedUser)


# **getOrgauthorizationTrustorClonedusers**


> [ClonedUserEntityListing](ClonedUserEntityListing) getOrgauthorizationTrustorClonedusers(trustorOrgId)

The list of cloned users in the trustor organization (i.e. users with a native user record).

Wraps GET /api/v2/orgauthorization/trustors/{trustorOrgId}/clonedusers  

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
try {
    ClonedUserEntityListing result = apiInstance.getOrgauthorizationTrustorClonedusers(trustorOrgId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationAuthorizationApi#getOrgauthorizationTrustorClonedusers");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **trustorOrgId** | **String**| Trustor Organization Id | 
{: class="table-striped"}


### Return type

[**ClonedUserEntityListing**](ClonedUserEntityListing)


# **getOrgauthorizationTrustorGroup**


> [TrustGroup](TrustGroup) getOrgauthorizationTrustorGroup(trustorOrgId, trustorGroupId)

Get Trustee Group

Wraps GET /api/v2/orgauthorization/trustors/{trustorOrgId}/groups/{trustorGroupId}  

Requires ANY permissions: 

* authorization:orgTrusteeGroup:view

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
String trustorGroupId = "trustorGroupId_example"; // String | Trustor Group Id
try {
    TrustGroup result = apiInstance.getOrgauthorizationTrustorGroup(trustorOrgId, trustorGroupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationAuthorizationApi#getOrgauthorizationTrustorGroup");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **trustorOrgId** | **String**| Trustor Organization Id | 
| **trustorGroupId** | **String**| Trustor Group Id | 
{: class="table-striped"}


### Return type

[**TrustGroup**](TrustGroup)


# **getOrgauthorizationTrustorGroups**


> [TrustGroupEntityListing](TrustGroupEntityListing) getOrgauthorizationTrustorGroups(trustorOrgId, pageSize, pageNumber)

The list of groups in the trustor organization (i.e. groups granted access).

Wraps GET /api/v2/orgauthorization/trustors/{trustorOrgId}/groups  

Requires ANY permissions: 

* authorization:orgTrusteeGroup:view

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
    TrustGroupEntityListing result = apiInstance.getOrgauthorizationTrustorGroups(trustorOrgId, pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationAuthorizationApi#getOrgauthorizationTrustorGroups");
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

[**TrustGroupEntityListing**](TrustGroupEntityListing)


# **getOrgauthorizationTrustorUser**


> [TrustUser](TrustUser) getOrgauthorizationTrustorUser(trustorOrgId, trusteeUserId)

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

[**TrustUser**](TrustUser)


# **getOrgauthorizationTrustorUsers**


> [TrustUserEntityListing](TrustUserEntityListing) getOrgauthorizationTrustorUsers(trustorOrgId, pageSize, pageNumber)

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

[**TrustUserEntityListing**](TrustUserEntityListing)


# **getOrgauthorizationTrustors**


> [TrustorEntityListing](TrustorEntityListing) getOrgauthorizationTrustors(pageSize, pageNumber)

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

[**TrustorEntityListing**](TrustorEntityListing)


# **postOrgauthorizationPairings**


> [TrustRequest](TrustRequest) postOrgauthorizationPairings(body)

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
| **body** | [**TrustRequestCreate**](TrustRequestCreate)| Pairing Info | 
{: class="table-striped"}


### Return type

[**TrustRequest**](TrustRequest)


# **postOrgauthorizationTrusteeGroups**


> [TrustGroup](TrustGroup) postOrgauthorizationTrusteeGroups(trusteeOrgId, body)

Add a group to the trust.

Wraps POST /api/v2/orgauthorization/trustees/{trusteeOrgId}/groups  

Requires ANY permissions: 

* authorization:orgTrusteeGroup:add

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
    TrustGroup result = apiInstance.postOrgauthorizationTrusteeGroups(trusteeOrgId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationAuthorizationApi#postOrgauthorizationTrusteeGroups");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **trusteeOrgId** | **String**| Trustee Organization Id | 
| **body** | [**TrustMemberCreate**](TrustMemberCreate)| Trust | 
{: class="table-striped"}


### Return type

[**TrustGroup**](TrustGroup)


# **postOrgauthorizationTrusteeUsers**


> [TrustUser](TrustUser) postOrgauthorizationTrusteeUsers(trusteeOrgId, body)

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
| **body** | [**TrustMemberCreate**](TrustMemberCreate)| Trust | 
{: class="table-striped"}


### Return type

[**TrustUser**](TrustUser)


# **postOrgauthorizationTrustees**


> [Trustee](Trustee) postOrgauthorizationTrustees(body)

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
| **body** | [**TrustCreate**](TrustCreate)| Trust | 
{: class="table-striped"}


### Return type

[**Trustee**](Trustee)


# **postOrgauthorizationTrusteesAudits**


> Object postOrgauthorizationTrusteesAudits(body, pageSize, pageNumber, sortBy, sortOrder)

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
    Object result = apiInstance.postOrgauthorizationTrusteesAudits(body, pageSize, pageNumber, sortBy, sortOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationAuthorizationApi#postOrgauthorizationTrusteesAudits");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**TrusteeAuditQueryRequest**](TrusteeAuditQueryRequest)| Values to scope the request. | 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **sortBy** | **String**| Sort by | [optional] [default to timestamp] 
| **sortOrder** | **String**| Sort order | [optional] [default to descending] 
{: class="table-striped"}


### Return type

**Object**


# **postOrgauthorizationTrusteesCare**


> [TrustEntityListing](TrustEntityListing) postOrgauthorizationTrusteesCare(assignDefaultRole, autoExpire, assignFullAccess, allowTrustedUserAccess)

Create a new organization authorization trust with Customer Care. This is required to grant your regional Customer Care organization access to your organization.

Wraps POST /api/v2/orgauthorization/trustees/care  

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
Boolean assignDefaultRole = true; // Boolean | Assign Admin role to default pairing with Customer Care
Boolean autoExpire = true; // Boolean | Automatically expire pairing after 30 days
Boolean assignFullAccess = true; // Boolean | Grant Customer Care full access to the organization
Boolean allowTrustedUserAccess = true; // Boolean | Make Customer Care a Trusted User
try {
    TrustEntityListing result = apiInstance.postOrgauthorizationTrusteesCare(assignDefaultRole, autoExpire, assignFullAccess, allowTrustedUserAccess);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationAuthorizationApi#postOrgauthorizationTrusteesCare");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **assignDefaultRole** | **Boolean**| Assign Admin role to default pairing with Customer Care | [optional] 
| **autoExpire** | **Boolean**| Automatically expire pairing after 30 days | [optional] 
| **assignFullAccess** | **Boolean**| Grant Customer Care full access to the organization | [optional] 
| **allowTrustedUserAccess** | **Boolean**| Make Customer Care a Trusted User | [optional] 
{: class="table-striped"}


### Return type

[**TrustEntityListing**](TrustEntityListing)


# **postOrgauthorizationTrusteesDefault**


> [Trustee](Trustee) postOrgauthorizationTrusteesDefault(assignDefaultRole, autoExpire)

Create a new organization authorization trust with Customer Care. This is required to grant your regional Customer Care organization access to your organization.

Wraps POST /api/v2/orgauthorization/trustees/default  

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
Boolean assignDefaultRole = true; // Boolean | Assign Admin role to default pairing with Customer Care
Boolean autoExpire = true; // Boolean | Automatically expire pairing after 30 days
try {
    Trustee result = apiInstance.postOrgauthorizationTrusteesDefault(assignDefaultRole, autoExpire);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationAuthorizationApi#postOrgauthorizationTrusteesDefault");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **assignDefaultRole** | **Boolean**| Assign Admin role to default pairing with Customer Care | [optional] 
| **autoExpire** | **Boolean**| Automatically expire pairing after 30 days | [optional] 
{: class="table-striped"}


### Return type

[**Trustee**](Trustee)


# **postOrgauthorizationTrustorAudits**


> Object postOrgauthorizationTrustorAudits(body, pageSize, pageNumber, sortBy, sortOrder)

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
    Object result = apiInstance.postOrgauthorizationTrustorAudits(body, pageSize, pageNumber, sortBy, sortOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationAuthorizationApi#postOrgauthorizationTrustorAudits");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**TrustorAuditQueryRequest**](TrustorAuditQueryRequest)| Values to scope the request. | 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **sortBy** | **String**| Sort by | [optional] [default to timestamp] 
| **sortOrder** | **String**| Sort order | [optional] [default to descending] 
{: class="table-striped"}


### Return type

**Object**


# **putOrgauthorizationTrustee**


> [Trustee](Trustee) putOrgauthorizationTrustee(trusteeOrgId, body)

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
| **body** | [**TrustUpdate**](TrustUpdate)| Client | 
{: class="table-striped"}


### Return type

[**Trustee**](Trustee)


# **putOrgauthorizationTrusteeGroupRoledivisions**


> [UserAuthorization](UserAuthorization) putOrgauthorizationTrusteeGroupRoledivisions(trusteeOrgId, trusteeGroupId, body)

Update Trustee Group Roles

Wraps PUT /api/v2/orgauthorization/trustees/{trusteeOrgId}/groups/{trusteeGroupId}/roledivisions  

Requires ANY permissions: 

* authorization:orgTrusteeGroup:edit

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
String trusteeGroupId = "trusteeGroupId_example"; // String | Trustee Group Id
RoleDivisionGrants body = new RoleDivisionGrants(); // RoleDivisionGrants | Set of roles with corresponding divisions to apply
try {
    UserAuthorization result = apiInstance.putOrgauthorizationTrusteeGroupRoledivisions(trusteeOrgId, trusteeGroupId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationAuthorizationApi#putOrgauthorizationTrusteeGroupRoledivisions");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **trusteeOrgId** | **String**| Trustee Organization Id | 
| **trusteeGroupId** | **String**| Trustee Group Id | 
| **body** | [**RoleDivisionGrants**](RoleDivisionGrants)| Set of roles with corresponding divisions to apply | 
{: class="table-striped"}


### Return type

[**UserAuthorization**](UserAuthorization)


# **putOrgauthorizationTrusteeGroupRoles**


> [UserAuthorization](UserAuthorization) putOrgauthorizationTrusteeGroupRoles(trusteeOrgId, trusteeGroupId, body)

Update Trustee Group Roles

Wraps PUT /api/v2/orgauthorization/trustees/{trusteeOrgId}/groups/{trusteeGroupId}/roles  

Requires ANY permissions: 

* authorization:orgTrusteeGroup:edit

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
String trusteeGroupId = "trusteeGroupId_example"; // String | Trustee Group Id
List<String> body = Arrays.asList(null); // List<String> | List of roles
try {
    UserAuthorization result = apiInstance.putOrgauthorizationTrusteeGroupRoles(trusteeOrgId, trusteeGroupId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationAuthorizationApi#putOrgauthorizationTrusteeGroupRoles");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **trusteeOrgId** | **String**| Trustee Organization Id | 
| **trusteeGroupId** | **String**| Trustee Group Id | 
| **body** | [**List&lt;String&gt;**](String)| List of roles | 
{: class="table-striped"}


### Return type

[**UserAuthorization**](UserAuthorization)


# **putOrgauthorizationTrusteeUserRoledivisions**


> [UserAuthorization](UserAuthorization) putOrgauthorizationTrusteeUserRoledivisions(trusteeOrgId, trusteeUserId, body)

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
| **body** | [**RoleDivisionGrants**](RoleDivisionGrants)| Set of roles with corresponding divisions to apply | 
{: class="table-striped"}


### Return type

[**UserAuthorization**](UserAuthorization)


# **putOrgauthorizationTrusteeUserRoles**


> [UserAuthorization](UserAuthorization) putOrgauthorizationTrusteeUserRoles(trusteeOrgId, trusteeUserId, body)

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
List<String> body = Arrays.asList(null); // List<String> | List of roles
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
| **body** | [**List&lt;String&gt;**](String)| List of roles | 
{: class="table-striped"}


### Return type

[**UserAuthorization**](UserAuthorization)


# **putOrgauthorizationTrustorCloneduser**


> [ClonedUser](ClonedUser) putOrgauthorizationTrustorCloneduser(trustorOrgId, trusteeUserId)

Creates a clone of the trustee user in the trustor org.

Wraps PUT /api/v2/orgauthorization/trustors/{trustorOrgId}/clonedusers/{trusteeUserId}  

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
    ClonedUser result = apiInstance.putOrgauthorizationTrustorCloneduser(trustorOrgId, trusteeUserId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationAuthorizationApi#putOrgauthorizationTrustorCloneduser");
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

[**ClonedUser**](ClonedUser)


# **putOrgauthorizationTrustorGroup**


> [TrustGroup](TrustGroup) putOrgauthorizationTrustorGroup(trustorOrgId, trustorGroupId)

Add a Trustee Group to the trust.

Wraps PUT /api/v2/orgauthorization/trustors/{trustorOrgId}/groups/{trustorGroupId}  

Requires ALL permissions: 

* authorization:orgTrusteeGroup:add

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
String trustorGroupId = "trustorGroupId_example"; // String | Trustor Group Id
try {
    TrustGroup result = apiInstance.putOrgauthorizationTrustorGroup(trustorOrgId, trustorGroupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationAuthorizationApi#putOrgauthorizationTrustorGroup");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **trustorOrgId** | **String**| Trustor Organization Id | 
| **trustorGroupId** | **String**| Trustor Group Id | 
{: class="table-striped"}


### Return type

[**TrustGroup**](TrustGroup)


# **putOrgauthorizationTrustorUser**


> [TrustUser](TrustUser) putOrgauthorizationTrustorUser(trustorOrgId, trusteeUserId)

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

[**TrustUser**](TrustUser)


_com.mypurecloud.sdk.v2:platform-client-v2:241.0.0_
