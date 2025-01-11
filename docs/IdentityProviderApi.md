# IdentityProviderApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**deleteIdentityprovider**](IdentityProviderApi#deleteIdentityprovider) | Delete Identity Provider |
| [**deleteIdentityprovidersAdfs**](IdentityProviderApi#deleteIdentityprovidersAdfs) | Delete ADFS Identity Provider |
| [**deleteIdentityprovidersCic**](IdentityProviderApi#deleteIdentityprovidersCic) | Delete Customer Interaction Center (CIC) Identity Provider |
| [**deleteIdentityprovidersGeneric**](IdentityProviderApi#deleteIdentityprovidersGeneric) | Delete Generic SAML Identity Provider |
| [**deleteIdentityprovidersGsuite**](IdentityProviderApi#deleteIdentityprovidersGsuite) | Delete G Suite Identity Provider |
| [**deleteIdentityprovidersIdentitynow**](IdentityProviderApi#deleteIdentityprovidersIdentitynow) | Delete IdentityNow Provider |
| [**deleteIdentityprovidersOkta**](IdentityProviderApi#deleteIdentityprovidersOkta) | Delete Okta Identity Provider |
| [**deleteIdentityprovidersOnelogin**](IdentityProviderApi#deleteIdentityprovidersOnelogin) | Delete OneLogin Identity Provider |
| [**deleteIdentityprovidersPing**](IdentityProviderApi#deleteIdentityprovidersPing) | Delete Ping Identity Provider |
| [**deleteIdentityprovidersPurecloud**](IdentityProviderApi#deleteIdentityprovidersPurecloud) | Delete PureCloud Identity Provider |
| [**deleteIdentityprovidersPureengage**](IdentityProviderApi#deleteIdentityprovidersPureengage) | Delete PureEngage Identity Provider |
| [**deleteIdentityprovidersSalesforce**](IdentityProviderApi#deleteIdentityprovidersSalesforce) | Delete Salesforce Identity Provider |
| [**getIdentityprovider**](IdentityProviderApi#getIdentityprovider) | Get Identity Provider |
| [**getIdentityproviders**](IdentityProviderApi#getIdentityproviders) | The list of identity providers |
| [**getIdentityprovidersAdfs**](IdentityProviderApi#getIdentityprovidersAdfs) | Get ADFS Identity Provider |
| [**getIdentityprovidersCic**](IdentityProviderApi#getIdentityprovidersCic) | Get Customer Interaction Center (CIC) Identity Provider |
| [**getIdentityprovidersGeneric**](IdentityProviderApi#getIdentityprovidersGeneric) | Get Generic SAML Identity Provider |
| [**getIdentityprovidersGsuite**](IdentityProviderApi#getIdentityprovidersGsuite) | Get G Suite Identity Provider |
| [**getIdentityprovidersIdentitynow**](IdentityProviderApi#getIdentityprovidersIdentitynow) | Get IdentityNow Provider |
| [**getIdentityprovidersOkta**](IdentityProviderApi#getIdentityprovidersOkta) | Get Okta Identity Provider |
| [**getIdentityprovidersOnelogin**](IdentityProviderApi#getIdentityprovidersOnelogin) | Get OneLogin Identity Provider |
| [**getIdentityprovidersPing**](IdentityProviderApi#getIdentityprovidersPing) | Get Ping Identity Provider |
| [**getIdentityprovidersPurecloud**](IdentityProviderApi#getIdentityprovidersPurecloud) | Get PureCloud Identity Provider |
| [**getIdentityprovidersPureengage**](IdentityProviderApi#getIdentityprovidersPureengage) | Get PureEngage Identity Provider |
| [**getIdentityprovidersSalesforce**](IdentityProviderApi#getIdentityprovidersSalesforce) | Get Salesforce Identity Provider |
| [**postIdentityproviders**](IdentityProviderApi#postIdentityproviders) | Create Identity Provider |
| [**putIdentityprovider**](IdentityProviderApi#putIdentityprovider) | Update Identity Provider |
| [**putIdentityprovidersAdfs**](IdentityProviderApi#putIdentityprovidersAdfs) | Update/Create ADFS Identity Provider |
| [**putIdentityprovidersCic**](IdentityProviderApi#putIdentityprovidersCic) | Update/Create Customer Interaction Center (CIC) Identity Provider |
| [**putIdentityprovidersGeneric**](IdentityProviderApi#putIdentityprovidersGeneric) | Update/Create Generic SAML Identity Provider |
| [**putIdentityprovidersGsuite**](IdentityProviderApi#putIdentityprovidersGsuite) | Update/Create G Suite Identity Provider |
| [**putIdentityprovidersIdentitynow**](IdentityProviderApi#putIdentityprovidersIdentitynow) | Update/Create IdentityNow Provider |
| [**putIdentityprovidersOkta**](IdentityProviderApi#putIdentityprovidersOkta) | Update/Create Okta Identity Provider |
| [**putIdentityprovidersOnelogin**](IdentityProviderApi#putIdentityprovidersOnelogin) | Update/Create OneLogin Identity Provider |
| [**putIdentityprovidersPing**](IdentityProviderApi#putIdentityprovidersPing) | Update/Create Ping Identity Provider |
| [**putIdentityprovidersPurecloud**](IdentityProviderApi#putIdentityprovidersPurecloud) | Update/Create PureCloud Identity Provider |
| [**putIdentityprovidersPureengage**](IdentityProviderApi#putIdentityprovidersPureengage) | Update/Create PureEngage Identity Provider |
| [**putIdentityprovidersSalesforce**](IdentityProviderApi#putIdentityprovidersSalesforce) | Update/Create Salesforce Identity Provider |
{: class="table-striped"}


# **deleteIdentityprovider**


> Void deleteIdentityprovider(providerId)

Delete Identity Provider

Wraps DELETE /api/v2/identityproviders/{providerId}  

Requires ANY permissions: 

* sso:provider:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IdentityProviderApi apiInstance = new IdentityProviderApi();
String providerId = "providerId_example"; // String | Provider ID
try {
    apiInstance.deleteIdentityprovider(providerId);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#deleteIdentityprovider");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **providerId** | **String**| Provider ID | 
{: class="table-striped"}


### Return type

null (empty response body)


# **deleteIdentityprovidersAdfs**


> Empty deleteIdentityprovidersAdfs()

Delete ADFS Identity Provider

Wraps DELETE /api/v2/identityproviders/adfs  

Requires ANY permissions: 

* sso:provider:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IdentityProviderApi apiInstance = new IdentityProviderApi();
try {
    Empty result = apiInstance.deleteIdentityprovidersAdfs();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#deleteIdentityprovidersAdfs");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

**Empty**


# **deleteIdentityprovidersCic**


> Empty deleteIdentityprovidersCic()

Delete Customer Interaction Center (CIC) Identity Provider

Wraps DELETE /api/v2/identityproviders/cic  

Requires ANY permissions: 

* sso:provider:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IdentityProviderApi apiInstance = new IdentityProviderApi();
try {
    Empty result = apiInstance.deleteIdentityprovidersCic();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#deleteIdentityprovidersCic");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

**Empty**


# **deleteIdentityprovidersGeneric**


> Empty deleteIdentityprovidersGeneric()

Delete Generic SAML Identity Provider

Wraps DELETE /api/v2/identityproviders/generic  

Requires ANY permissions: 

* sso:provider:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IdentityProviderApi apiInstance = new IdentityProviderApi();
try {
    Empty result = apiInstance.deleteIdentityprovidersGeneric();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#deleteIdentityprovidersGeneric");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

**Empty**


# **deleteIdentityprovidersGsuite**


> Empty deleteIdentityprovidersGsuite()

Delete G Suite Identity Provider

Wraps DELETE /api/v2/identityproviders/gsuite  

Requires ANY permissions: 

* sso:provider:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IdentityProviderApi apiInstance = new IdentityProviderApi();
try {
    Empty result = apiInstance.deleteIdentityprovidersGsuite();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#deleteIdentityprovidersGsuite");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

**Empty**


# **deleteIdentityprovidersIdentitynow**


> Empty deleteIdentityprovidersIdentitynow()

Delete IdentityNow Provider

Wraps DELETE /api/v2/identityproviders/identitynow  

Requires ANY permissions: 

* sso:provider:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IdentityProviderApi apiInstance = new IdentityProviderApi();
try {
    Empty result = apiInstance.deleteIdentityprovidersIdentitynow();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#deleteIdentityprovidersIdentitynow");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

**Empty**


# **deleteIdentityprovidersOkta**


> Empty deleteIdentityprovidersOkta()

Delete Okta Identity Provider

Wraps DELETE /api/v2/identityproviders/okta  

Requires ANY permissions: 

* sso:provider:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IdentityProviderApi apiInstance = new IdentityProviderApi();
try {
    Empty result = apiInstance.deleteIdentityprovidersOkta();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#deleteIdentityprovidersOkta");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

**Empty**


# **deleteIdentityprovidersOnelogin**


> Empty deleteIdentityprovidersOnelogin()

Delete OneLogin Identity Provider

Wraps DELETE /api/v2/identityproviders/onelogin  

Requires ANY permissions: 

* sso:provider:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IdentityProviderApi apiInstance = new IdentityProviderApi();
try {
    Empty result = apiInstance.deleteIdentityprovidersOnelogin();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#deleteIdentityprovidersOnelogin");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

**Empty**


# **deleteIdentityprovidersPing**


> Empty deleteIdentityprovidersPing()

Delete Ping Identity Provider

Wraps DELETE /api/v2/identityproviders/ping  

Requires ANY permissions: 

* sso:provider:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IdentityProviderApi apiInstance = new IdentityProviderApi();
try {
    Empty result = apiInstance.deleteIdentityprovidersPing();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#deleteIdentityprovidersPing");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

**Empty**


# **deleteIdentityprovidersPurecloud**


> Empty deleteIdentityprovidersPurecloud()

Delete PureCloud Identity Provider

Wraps DELETE /api/v2/identityproviders/purecloud  

Requires ANY permissions: 

* sso:provider:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IdentityProviderApi apiInstance = new IdentityProviderApi();
try {
    Empty result = apiInstance.deleteIdentityprovidersPurecloud();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#deleteIdentityprovidersPurecloud");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

**Empty**


# **deleteIdentityprovidersPureengage**


> Empty deleteIdentityprovidersPureengage()

Delete PureEngage Identity Provider

Wraps DELETE /api/v2/identityproviders/pureengage  

Requires ANY permissions: 

* sso:provider:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IdentityProviderApi apiInstance = new IdentityProviderApi();
try {
    Empty result = apiInstance.deleteIdentityprovidersPureengage();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#deleteIdentityprovidersPureengage");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

**Empty**


# **deleteIdentityprovidersSalesforce**


> Empty deleteIdentityprovidersSalesforce()

Delete Salesforce Identity Provider

Wraps DELETE /api/v2/identityproviders/salesforce  

Requires ANY permissions: 

* sso:provider:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IdentityProviderApi apiInstance = new IdentityProviderApi();
try {
    Empty result = apiInstance.deleteIdentityprovidersSalesforce();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#deleteIdentityprovidersSalesforce");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

**Empty**


# **getIdentityprovider**


> [CustomProvider](CustomProvider) getIdentityprovider(providerId)

Get Identity Provider

Wraps GET /api/v2/identityproviders/{providerId}  

Requires ANY permissions: 

* sso:provider:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IdentityProviderApi apiInstance = new IdentityProviderApi();
String providerId = "providerId_example"; // String | Provider ID
try {
    CustomProvider result = apiInstance.getIdentityprovider(providerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#getIdentityprovider");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **providerId** | **String**| Provider ID | 
{: class="table-striped"}


### Return type

[**CustomProvider**](CustomProvider)


# **getIdentityproviders**


> [IdentityProviderEntityListing](IdentityProviderEntityListing) getIdentityproviders()

The list of identity providers

Wraps GET /api/v2/identityproviders  

Requires ANY permissions: 

* sso:provider:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IdentityProviderApi apiInstance = new IdentityProviderApi();
try {
    IdentityProviderEntityListing result = apiInstance.getIdentityproviders();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#getIdentityproviders");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**IdentityProviderEntityListing**](IdentityProviderEntityListing)


# **getIdentityprovidersAdfs**


> [ADFS](ADFS) getIdentityprovidersAdfs()

Get ADFS Identity Provider

Wraps GET /api/v2/identityproviders/adfs  

Requires ANY permissions: 

* sso:provider:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IdentityProviderApi apiInstance = new IdentityProviderApi();
try {
    ADFS result = apiInstance.getIdentityprovidersAdfs();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#getIdentityprovidersAdfs");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**ADFS**](ADFS)


# **getIdentityprovidersCic**


> [CustomerInteractionCenter](CustomerInteractionCenter) getIdentityprovidersCic()

Get Customer Interaction Center (CIC) Identity Provider

Wraps GET /api/v2/identityproviders/cic  

Requires ANY permissions: 

* sso:provider:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IdentityProviderApi apiInstance = new IdentityProviderApi();
try {
    CustomerInteractionCenter result = apiInstance.getIdentityprovidersCic();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#getIdentityprovidersCic");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**CustomerInteractionCenter**](CustomerInteractionCenter)


# **getIdentityprovidersGeneric**


> [GenericSAML](GenericSAML) getIdentityprovidersGeneric()

Get Generic SAML Identity Provider

Wraps GET /api/v2/identityproviders/generic  

Requires ANY permissions: 

* sso:provider:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IdentityProviderApi apiInstance = new IdentityProviderApi();
try {
    GenericSAML result = apiInstance.getIdentityprovidersGeneric();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#getIdentityprovidersGeneric");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**GenericSAML**](GenericSAML)


# **getIdentityprovidersGsuite**


> [GSuite](GSuite) getIdentityprovidersGsuite()

Get G Suite Identity Provider

Wraps GET /api/v2/identityproviders/gsuite  

Requires ANY permissions: 

* sso:provider:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IdentityProviderApi apiInstance = new IdentityProviderApi();
try {
    GSuite result = apiInstance.getIdentityprovidersGsuite();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#getIdentityprovidersGsuite");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**GSuite**](GSuite)


# **getIdentityprovidersIdentitynow**


> [IdentityNow](IdentityNow) getIdentityprovidersIdentitynow()

Get IdentityNow Provider

Wraps GET /api/v2/identityproviders/identitynow  

Requires ANY permissions: 

* sso:provider:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IdentityProviderApi apiInstance = new IdentityProviderApi();
try {
    IdentityNow result = apiInstance.getIdentityprovidersIdentitynow();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#getIdentityprovidersIdentitynow");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**IdentityNow**](IdentityNow)


# **getIdentityprovidersOkta**


> [Okta](Okta) getIdentityprovidersOkta()

Get Okta Identity Provider

Wraps GET /api/v2/identityproviders/okta  

Requires ANY permissions: 

* sso:provider:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IdentityProviderApi apiInstance = new IdentityProviderApi();
try {
    Okta result = apiInstance.getIdentityprovidersOkta();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#getIdentityprovidersOkta");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**Okta**](Okta)


# **getIdentityprovidersOnelogin**


> [OneLogin](OneLogin) getIdentityprovidersOnelogin()

Get OneLogin Identity Provider

Wraps GET /api/v2/identityproviders/onelogin  

Requires ANY permissions: 

* sso:provider:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IdentityProviderApi apiInstance = new IdentityProviderApi();
try {
    OneLogin result = apiInstance.getIdentityprovidersOnelogin();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#getIdentityprovidersOnelogin");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**OneLogin**](OneLogin)


# **getIdentityprovidersPing**


> [PingIdentity](PingIdentity) getIdentityprovidersPing()

Get Ping Identity Provider

Wraps GET /api/v2/identityproviders/ping  

Requires ANY permissions: 

* sso:provider:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IdentityProviderApi apiInstance = new IdentityProviderApi();
try {
    PingIdentity result = apiInstance.getIdentityprovidersPing();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#getIdentityprovidersPing");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**PingIdentity**](PingIdentity)


# **getIdentityprovidersPurecloud**


> [PureCloud](PureCloud) getIdentityprovidersPurecloud()

Get PureCloud Identity Provider

Wraps GET /api/v2/identityproviders/purecloud  

Requires ANY permissions: 

* sso:provider:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IdentityProviderApi apiInstance = new IdentityProviderApi();
try {
    PureCloud result = apiInstance.getIdentityprovidersPurecloud();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#getIdentityprovidersPurecloud");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**PureCloud**](PureCloud)


# **getIdentityprovidersPureengage**


> [PureEngage](PureEngage) getIdentityprovidersPureengage()

Get PureEngage Identity Provider

Wraps GET /api/v2/identityproviders/pureengage  

Requires ANY permissions: 

* sso:provider:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IdentityProviderApi apiInstance = new IdentityProviderApi();
try {
    PureEngage result = apiInstance.getIdentityprovidersPureengage();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#getIdentityprovidersPureengage");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**PureEngage**](PureEngage)


# **getIdentityprovidersSalesforce**


> [Salesforce](Salesforce) getIdentityprovidersSalesforce()

Get Salesforce Identity Provider

Wraps GET /api/v2/identityproviders/salesforce  

Requires ANY permissions: 

* sso:provider:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IdentityProviderApi apiInstance = new IdentityProviderApi();
try {
    Salesforce result = apiInstance.getIdentityprovidersSalesforce();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#getIdentityprovidersSalesforce");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**Salesforce**](Salesforce)


# **postIdentityproviders**


> [CustomProvider](CustomProvider) postIdentityproviders(body)

Create Identity Provider

Wraps POST /api/v2/identityproviders  

Requires ANY permissions: 

* sso:provider:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IdentityProviderApi apiInstance = new IdentityProviderApi();
CustomProvider body = new CustomProvider(); // CustomProvider | Provider
try {
    CustomProvider result = apiInstance.postIdentityproviders(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#postIdentityproviders");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**CustomProvider**](CustomProvider)| Provider | 
{: class="table-striped"}


### Return type

[**CustomProvider**](CustomProvider)


# **putIdentityprovider**


> [CustomProvider](CustomProvider) putIdentityprovider(providerId, body)

Update Identity Provider

Wraps PUT /api/v2/identityproviders/{providerId}  

Requires ANY permissions: 

* sso:provider:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IdentityProviderApi apiInstance = new IdentityProviderApi();
String providerId = "providerId_example"; // String | Provider ID
CustomProvider body = new CustomProvider(); // CustomProvider | Provider
try {
    CustomProvider result = apiInstance.putIdentityprovider(providerId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#putIdentityprovider");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **providerId** | **String**| Provider ID | 
| **body** | [**CustomProvider**](CustomProvider)| Provider | 
{: class="table-striped"}


### Return type

[**CustomProvider**](CustomProvider)


# **putIdentityprovidersAdfs**


> [IdentityProvider](IdentityProvider) putIdentityprovidersAdfs(body)

Update/Create ADFS Identity Provider

Wraps PUT /api/v2/identityproviders/adfs  

Requires ANY permissions: 

* sso:provider:add
* sso:provider:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IdentityProviderApi apiInstance = new IdentityProviderApi();
ADFS body = new ADFS(); // ADFS | Provider
try {
    IdentityProvider result = apiInstance.putIdentityprovidersAdfs(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#putIdentityprovidersAdfs");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**ADFS**](ADFS)| Provider | 
{: class="table-striped"}


### Return type

[**IdentityProvider**](IdentityProvider)


# **putIdentityprovidersCic**


> [IdentityProvider](IdentityProvider) putIdentityprovidersCic(body)

Update/Create Customer Interaction Center (CIC) Identity Provider

Wraps PUT /api/v2/identityproviders/cic  

Requires ANY permissions: 

* sso:provider:add
* sso:provider:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IdentityProviderApi apiInstance = new IdentityProviderApi();
CustomerInteractionCenter body = new CustomerInteractionCenter(); // CustomerInteractionCenter | Provider
try {
    IdentityProvider result = apiInstance.putIdentityprovidersCic(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#putIdentityprovidersCic");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**CustomerInteractionCenter**](CustomerInteractionCenter)| Provider | 
{: class="table-striped"}


### Return type

[**IdentityProvider**](IdentityProvider)


# **putIdentityprovidersGeneric**


> [IdentityProvider](IdentityProvider) putIdentityprovidersGeneric(body)

Update/Create Generic SAML Identity Provider

Wraps PUT /api/v2/identityproviders/generic  

Requires ANY permissions: 

* sso:provider:add
* sso:provider:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IdentityProviderApi apiInstance = new IdentityProviderApi();
GenericSAML body = new GenericSAML(); // GenericSAML | Provider
try {
    IdentityProvider result = apiInstance.putIdentityprovidersGeneric(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#putIdentityprovidersGeneric");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**GenericSAML**](GenericSAML)| Provider | 
{: class="table-striped"}


### Return type

[**IdentityProvider**](IdentityProvider)


# **putIdentityprovidersGsuite**


> [IdentityProvider](IdentityProvider) putIdentityprovidersGsuite(body)

Update/Create G Suite Identity Provider

Wraps PUT /api/v2/identityproviders/gsuite  

Requires ANY permissions: 

* sso:provider:add
* sso:provider:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IdentityProviderApi apiInstance = new IdentityProviderApi();
GSuite body = new GSuite(); // GSuite | Provider
try {
    IdentityProvider result = apiInstance.putIdentityprovidersGsuite(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#putIdentityprovidersGsuite");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**GSuite**](GSuite)| Provider | 
{: class="table-striped"}


### Return type

[**IdentityProvider**](IdentityProvider)


# **putIdentityprovidersIdentitynow**


> [IdentityNow](IdentityNow) putIdentityprovidersIdentitynow(body)

Update/Create IdentityNow Provider

Wraps PUT /api/v2/identityproviders/identitynow  

Requires ANY permissions: 

* sso:provider:add
* sso:provider:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IdentityProviderApi apiInstance = new IdentityProviderApi();
IdentityNow body = new IdentityNow(); // IdentityNow | Provider
try {
    IdentityNow result = apiInstance.putIdentityprovidersIdentitynow(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#putIdentityprovidersIdentitynow");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**IdentityNow**](IdentityNow)| Provider | 
{: class="table-striped"}


### Return type

[**IdentityNow**](IdentityNow)


# **putIdentityprovidersOkta**


> [IdentityProvider](IdentityProvider) putIdentityprovidersOkta(body)

Update/Create Okta Identity Provider

Wraps PUT /api/v2/identityproviders/okta  

Requires ANY permissions: 

* sso:provider:add
* sso:provider:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IdentityProviderApi apiInstance = new IdentityProviderApi();
Okta body = new Okta(); // Okta | Provider
try {
    IdentityProvider result = apiInstance.putIdentityprovidersOkta(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#putIdentityprovidersOkta");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**Okta**](Okta)| Provider | 
{: class="table-striped"}


### Return type

[**IdentityProvider**](IdentityProvider)


# **putIdentityprovidersOnelogin**


> [IdentityProvider](IdentityProvider) putIdentityprovidersOnelogin(body)

Update/Create OneLogin Identity Provider

Wraps PUT /api/v2/identityproviders/onelogin  

Requires ANY permissions: 

* sso:provider:add
* sso:provider:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IdentityProviderApi apiInstance = new IdentityProviderApi();
OneLogin body = new OneLogin(); // OneLogin | Provider
try {
    IdentityProvider result = apiInstance.putIdentityprovidersOnelogin(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#putIdentityprovidersOnelogin");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**OneLogin**](OneLogin)| Provider | 
{: class="table-striped"}


### Return type

[**IdentityProvider**](IdentityProvider)


# **putIdentityprovidersPing**


> [IdentityProvider](IdentityProvider) putIdentityprovidersPing(body)

Update/Create Ping Identity Provider

Wraps PUT /api/v2/identityproviders/ping  

Requires ANY permissions: 

* sso:provider:add
* sso:provider:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IdentityProviderApi apiInstance = new IdentityProviderApi();
PingIdentity body = new PingIdentity(); // PingIdentity | Provider
try {
    IdentityProvider result = apiInstance.putIdentityprovidersPing(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#putIdentityprovidersPing");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**PingIdentity**](PingIdentity)| Provider | 
{: class="table-striped"}


### Return type

[**IdentityProvider**](IdentityProvider)


# **putIdentityprovidersPurecloud**


> [IdentityProvider](IdentityProvider) putIdentityprovidersPurecloud(body)

Update/Create PureCloud Identity Provider

Wraps PUT /api/v2/identityproviders/purecloud  

Requires ANY permissions: 

* sso:provider:add
* sso:provider:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IdentityProviderApi apiInstance = new IdentityProviderApi();
PureCloud body = new PureCloud(); // PureCloud | Provider
try {
    IdentityProvider result = apiInstance.putIdentityprovidersPurecloud(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#putIdentityprovidersPurecloud");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**PureCloud**](PureCloud)| Provider | 
{: class="table-striped"}


### Return type

[**IdentityProvider**](IdentityProvider)


# **putIdentityprovidersPureengage**


> [IdentityProvider](IdentityProvider) putIdentityprovidersPureengage(body)

Update/Create PureEngage Identity Provider

Wraps PUT /api/v2/identityproviders/pureengage  

Requires ANY permissions: 

* sso:provider:add
* sso:provider:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IdentityProviderApi apiInstance = new IdentityProviderApi();
PureEngage body = new PureEngage(); // PureEngage | Provider
try {
    IdentityProvider result = apiInstance.putIdentityprovidersPureengage(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#putIdentityprovidersPureengage");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**PureEngage**](PureEngage)| Provider | 
{: class="table-striped"}


### Return type

[**IdentityProvider**](IdentityProvider)


# **putIdentityprovidersSalesforce**


> [IdentityProvider](IdentityProvider) putIdentityprovidersSalesforce(body)

Update/Create Salesforce Identity Provider

Wraps PUT /api/v2/identityproviders/salesforce  

Requires ANY permissions: 

* sso:provider:add
* sso:provider:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IdentityProviderApi apiInstance = new IdentityProviderApi();
Salesforce body = new Salesforce(); // Salesforce | Provider
try {
    IdentityProvider result = apiInstance.putIdentityprovidersSalesforce(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#putIdentityprovidersSalesforce");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**Salesforce**](Salesforce)| Provider | 
{: class="table-striped"}


### Return type

[**IdentityProvider**](IdentityProvider)


_com.mypurecloud.sdk.v2:platform-client-v2:217.1.0_
