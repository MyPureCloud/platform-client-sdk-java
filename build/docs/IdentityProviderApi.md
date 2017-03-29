---
title: IdentityProviderApi
---
## IdentityProviderApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**deleteIdentityprovidersAdfs**](IdentityProviderApi.html#deleteIdentityprovidersAdfs) | Delete ADFS Identity Provider |
| [**deleteIdentityprovidersCic**](IdentityProviderApi.html#deleteIdentityprovidersCic) | Delete Customer Interaction Center (CIC) Identity Provider |
| [**deleteIdentityprovidersGsuite**](IdentityProviderApi.html#deleteIdentityprovidersGsuite) | Delete G Suite Identity Provider |
| [**deleteIdentityprovidersIdentitynow**](IdentityProviderApi.html#deleteIdentityprovidersIdentitynow) | Delete IdentityNow Provider |
| [**deleteIdentityprovidersOkta**](IdentityProviderApi.html#deleteIdentityprovidersOkta) | Delete Okta Identity Provider |
| [**deleteIdentityprovidersOnelogin**](IdentityProviderApi.html#deleteIdentityprovidersOnelogin) | Delete OneLogin Identity Provider |
| [**deleteIdentityprovidersPing**](IdentityProviderApi.html#deleteIdentityprovidersPing) | Delete Ping Identity Provider |
| [**deleteIdentityprovidersPurecloud**](IdentityProviderApi.html#deleteIdentityprovidersPurecloud) | Delete PureCloud Identity Provider |
| [**deleteIdentityprovidersSalesforce**](IdentityProviderApi.html#deleteIdentityprovidersSalesforce) | Delete Salesforce Identity Provider |
| [**getIdentityproviders**](IdentityProviderApi.html#getIdentityproviders) | The list of identity providers |
| [**getIdentityprovidersAdfs**](IdentityProviderApi.html#getIdentityprovidersAdfs) | Get ADFS Identity Provider |
| [**getIdentityprovidersCic**](IdentityProviderApi.html#getIdentityprovidersCic) | Get Customer Interaction Center (CIC) Identity Provider |
| [**getIdentityprovidersGsuite**](IdentityProviderApi.html#getIdentityprovidersGsuite) | Get G Suite Identity Provider |
| [**getIdentityprovidersIdentitynow**](IdentityProviderApi.html#getIdentityprovidersIdentitynow) | Get IdentityNow Provider |
| [**getIdentityprovidersOkta**](IdentityProviderApi.html#getIdentityprovidersOkta) | Get Okta Identity Provider |
| [**getIdentityprovidersOnelogin**](IdentityProviderApi.html#getIdentityprovidersOnelogin) | Get OneLogin Identity Provider |
| [**getIdentityprovidersPing**](IdentityProviderApi.html#getIdentityprovidersPing) | Get Ping Identity Provider |
| [**getIdentityprovidersPurecloud**](IdentityProviderApi.html#getIdentityprovidersPurecloud) | Get PureCloud Identity Provider |
| [**getIdentityprovidersSalesforce**](IdentityProviderApi.html#getIdentityprovidersSalesforce) | Get Salesforce Identity Provider |
| [**putIdentityprovidersAdfs**](IdentityProviderApi.html#putIdentityprovidersAdfs) | Update/Create ADFS Identity Provider |
| [**putIdentityprovidersCic**](IdentityProviderApi.html#putIdentityprovidersCic) | Update/Create Customer Interaction Center (CIC) Identity Provider |
| [**putIdentityprovidersGsuite**](IdentityProviderApi.html#putIdentityprovidersGsuite) | Update/Create G Suite Identity Provider |
| [**putIdentityprovidersIdentitynow**](IdentityProviderApi.html#putIdentityprovidersIdentitynow) | Update/Create IdentityNow Provider |
| [**putIdentityprovidersOkta**](IdentityProviderApi.html#putIdentityprovidersOkta) | Update/Create Okta Identity Provider |
| [**putIdentityprovidersOnelogin**](IdentityProviderApi.html#putIdentityprovidersOnelogin) | Update/Create OneLogin Identity Provider |
| [**putIdentityprovidersPing**](IdentityProviderApi.html#putIdentityprovidersPing) | Update/Create Ping Identity Provider |
| [**putIdentityprovidersPurecloud**](IdentityProviderApi.html#putIdentityprovidersPurecloud) | Update/Create PureCloud Identity Provider |
| [**putIdentityprovidersSalesforce**](IdentityProviderApi.html#putIdentityprovidersSalesforce) | Update/Create Salesforce Identity Provider |
{: class="table table-striped"}

<a name="deleteIdentityprovidersAdfs"></a>

# **deleteIdentityprovidersAdfs**

> [Empty](Empty.html) deleteIdentityprovidersAdfs()

Delete ADFS Identity Provider



Wraps DELETE /api/v2/identityproviders/adfs  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

IdentityProviderApi apiInstance = new IdentityProviderApi();
try {
    Empty result = apiInstance.deleteIdentityprovidersAdfs();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#deleteIdentityprovidersAdfs");
    e.printStackTrace();
}
~~~

### Parameters

This endpoint does not require any parameters.
{: class="table table-striped"}

### Return type

[**Empty**](Empty.html)

<a name="deleteIdentityprovidersCic"></a>

# **deleteIdentityprovidersCic**

> [Empty](Empty.html) deleteIdentityprovidersCic()

Delete Customer Interaction Center (CIC) Identity Provider



Wraps DELETE /api/v2/identityproviders/cic  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

IdentityProviderApi apiInstance = new IdentityProviderApi();
try {
    Empty result = apiInstance.deleteIdentityprovidersCic();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#deleteIdentityprovidersCic");
    e.printStackTrace();
}
~~~

### Parameters

This endpoint does not require any parameters.
{: class="table table-striped"}

### Return type

[**Empty**](Empty.html)

<a name="deleteIdentityprovidersGsuite"></a>

# **deleteIdentityprovidersGsuite**

> [Empty](Empty.html) deleteIdentityprovidersGsuite()

Delete G Suite Identity Provider



Wraps DELETE /api/v2/identityproviders/gsuite  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

IdentityProviderApi apiInstance = new IdentityProviderApi();
try {
    Empty result = apiInstance.deleteIdentityprovidersGsuite();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#deleteIdentityprovidersGsuite");
    e.printStackTrace();
}
~~~

### Parameters

This endpoint does not require any parameters.
{: class="table table-striped"}

### Return type

[**Empty**](Empty.html)

<a name="deleteIdentityprovidersIdentitynow"></a>

# **deleteIdentityprovidersIdentitynow**

> [Empty](Empty.html) deleteIdentityprovidersIdentitynow()

Delete IdentityNow Provider



Wraps DELETE /api/v2/identityproviders/identitynow  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

IdentityProviderApi apiInstance = new IdentityProviderApi();
try {
    Empty result = apiInstance.deleteIdentityprovidersIdentitynow();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#deleteIdentityprovidersIdentitynow");
    e.printStackTrace();
}
~~~

### Parameters

This endpoint does not require any parameters.
{: class="table table-striped"}

### Return type

[**Empty**](Empty.html)

<a name="deleteIdentityprovidersOkta"></a>

# **deleteIdentityprovidersOkta**

> [Empty](Empty.html) deleteIdentityprovidersOkta()

Delete Okta Identity Provider



Wraps DELETE /api/v2/identityproviders/okta  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

IdentityProviderApi apiInstance = new IdentityProviderApi();
try {
    Empty result = apiInstance.deleteIdentityprovidersOkta();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#deleteIdentityprovidersOkta");
    e.printStackTrace();
}
~~~

### Parameters

This endpoint does not require any parameters.
{: class="table table-striped"}

### Return type

[**Empty**](Empty.html)

<a name="deleteIdentityprovidersOnelogin"></a>

# **deleteIdentityprovidersOnelogin**

> [Empty](Empty.html) deleteIdentityprovidersOnelogin()

Delete OneLogin Identity Provider



Wraps DELETE /api/v2/identityproviders/onelogin  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

IdentityProviderApi apiInstance = new IdentityProviderApi();
try {
    Empty result = apiInstance.deleteIdentityprovidersOnelogin();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#deleteIdentityprovidersOnelogin");
    e.printStackTrace();
}
~~~

### Parameters

This endpoint does not require any parameters.
{: class="table table-striped"}

### Return type

[**Empty**](Empty.html)

<a name="deleteIdentityprovidersPing"></a>

# **deleteIdentityprovidersPing**

> [Empty](Empty.html) deleteIdentityprovidersPing()

Delete Ping Identity Provider



Wraps DELETE /api/v2/identityproviders/ping  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

IdentityProviderApi apiInstance = new IdentityProviderApi();
try {
    Empty result = apiInstance.deleteIdentityprovidersPing();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#deleteIdentityprovidersPing");
    e.printStackTrace();
}
~~~

### Parameters

This endpoint does not require any parameters.
{: class="table table-striped"}

### Return type

[**Empty**](Empty.html)

<a name="deleteIdentityprovidersPurecloud"></a>

# **deleteIdentityprovidersPurecloud**

> [Empty](Empty.html) deleteIdentityprovidersPurecloud()

Delete PureCloud Identity Provider



Wraps DELETE /api/v2/identityproviders/purecloud  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

IdentityProviderApi apiInstance = new IdentityProviderApi();
try {
    Empty result = apiInstance.deleteIdentityprovidersPurecloud();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#deleteIdentityprovidersPurecloud");
    e.printStackTrace();
}
~~~

### Parameters

This endpoint does not require any parameters.
{: class="table table-striped"}

### Return type

[**Empty**](Empty.html)

<a name="deleteIdentityprovidersSalesforce"></a>

# **deleteIdentityprovidersSalesforce**

> [Empty](Empty.html) deleteIdentityprovidersSalesforce()

Delete Salesforce Identity Provider



Wraps DELETE /api/v2/identityproviders/salesforce  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

IdentityProviderApi apiInstance = new IdentityProviderApi();
try {
    Empty result = apiInstance.deleteIdentityprovidersSalesforce();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#deleteIdentityprovidersSalesforce");
    e.printStackTrace();
}
~~~

### Parameters

This endpoint does not require any parameters.
{: class="table table-striped"}

### Return type

[**Empty**](Empty.html)

<a name="getIdentityproviders"></a>

# **getIdentityproviders**

> [OAuthProviderEntityListing](OAuthProviderEntityListing.html) getIdentityproviders()

The list of identity providers



Wraps GET /api/v2/identityproviders  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

IdentityProviderApi apiInstance = new IdentityProviderApi();
try {
    OAuthProviderEntityListing result = apiInstance.getIdentityproviders();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#getIdentityproviders");
    e.printStackTrace();
}
~~~

### Parameters

This endpoint does not require any parameters.
{: class="table table-striped"}

### Return type

[**OAuthProviderEntityListing**](OAuthProviderEntityListing.html)

<a name="getIdentityprovidersAdfs"></a>

# **getIdentityprovidersAdfs**

> [ADFS](ADFS.html) getIdentityprovidersAdfs()

Get ADFS Identity Provider



Wraps GET /api/v2/identityproviders/adfs  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

IdentityProviderApi apiInstance = new IdentityProviderApi();
try {
    ADFS result = apiInstance.getIdentityprovidersAdfs();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#getIdentityprovidersAdfs");
    e.printStackTrace();
}
~~~

### Parameters

This endpoint does not require any parameters.
{: class="table table-striped"}

### Return type

[**ADFS**](ADFS.html)

<a name="getIdentityprovidersCic"></a>

# **getIdentityprovidersCic**

> [CustomerInteractionCenter](CustomerInteractionCenter.html) getIdentityprovidersCic()

Get Customer Interaction Center (CIC) Identity Provider



Wraps GET /api/v2/identityproviders/cic  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

IdentityProviderApi apiInstance = new IdentityProviderApi();
try {
    CustomerInteractionCenter result = apiInstance.getIdentityprovidersCic();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#getIdentityprovidersCic");
    e.printStackTrace();
}
~~~

### Parameters

This endpoint does not require any parameters.
{: class="table table-striped"}

### Return type

[**CustomerInteractionCenter**](CustomerInteractionCenter.html)

<a name="getIdentityprovidersGsuite"></a>

# **getIdentityprovidersGsuite**

> [GSuite](GSuite.html) getIdentityprovidersGsuite()

Get G Suite Identity Provider



Wraps GET /api/v2/identityproviders/gsuite  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

IdentityProviderApi apiInstance = new IdentityProviderApi();
try {
    GSuite result = apiInstance.getIdentityprovidersGsuite();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#getIdentityprovidersGsuite");
    e.printStackTrace();
}
~~~

### Parameters

This endpoint does not require any parameters.
{: class="table table-striped"}

### Return type

[**GSuite**](GSuite.html)

<a name="getIdentityprovidersIdentitynow"></a>

# **getIdentityprovidersIdentitynow**

> [IdentityNow](IdentityNow.html) getIdentityprovidersIdentitynow()

Get IdentityNow Provider



Wraps GET /api/v2/identityproviders/identitynow  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

IdentityProviderApi apiInstance = new IdentityProviderApi();
try {
    IdentityNow result = apiInstance.getIdentityprovidersIdentitynow();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#getIdentityprovidersIdentitynow");
    e.printStackTrace();
}
~~~

### Parameters

This endpoint does not require any parameters.
{: class="table table-striped"}

### Return type

[**IdentityNow**](IdentityNow.html)

<a name="getIdentityprovidersOkta"></a>

# **getIdentityprovidersOkta**

> [Okta](Okta.html) getIdentityprovidersOkta()

Get Okta Identity Provider



Wraps GET /api/v2/identityproviders/okta  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

IdentityProviderApi apiInstance = new IdentityProviderApi();
try {
    Okta result = apiInstance.getIdentityprovidersOkta();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#getIdentityprovidersOkta");
    e.printStackTrace();
}
~~~

### Parameters

This endpoint does not require any parameters.
{: class="table table-striped"}

### Return type

[**Okta**](Okta.html)

<a name="getIdentityprovidersOnelogin"></a>

# **getIdentityprovidersOnelogin**

> [OneLogin](OneLogin.html) getIdentityprovidersOnelogin()

Get OneLogin Identity Provider



Wraps GET /api/v2/identityproviders/onelogin  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

IdentityProviderApi apiInstance = new IdentityProviderApi();
try {
    OneLogin result = apiInstance.getIdentityprovidersOnelogin();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#getIdentityprovidersOnelogin");
    e.printStackTrace();
}
~~~

### Parameters

This endpoint does not require any parameters.
{: class="table table-striped"}

### Return type

[**OneLogin**](OneLogin.html)

<a name="getIdentityprovidersPing"></a>

# **getIdentityprovidersPing**

> [PingIdentity](PingIdentity.html) getIdentityprovidersPing()

Get Ping Identity Provider



Wraps GET /api/v2/identityproviders/ping  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

IdentityProviderApi apiInstance = new IdentityProviderApi();
try {
    PingIdentity result = apiInstance.getIdentityprovidersPing();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#getIdentityprovidersPing");
    e.printStackTrace();
}
~~~

### Parameters

This endpoint does not require any parameters.
{: class="table table-striped"}

### Return type

[**PingIdentity**](PingIdentity.html)

<a name="getIdentityprovidersPurecloud"></a>

# **getIdentityprovidersPurecloud**

> [PureCloud](PureCloud.html) getIdentityprovidersPurecloud()

Get PureCloud Identity Provider



Wraps GET /api/v2/identityproviders/purecloud  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

IdentityProviderApi apiInstance = new IdentityProviderApi();
try {
    PureCloud result = apiInstance.getIdentityprovidersPurecloud();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#getIdentityprovidersPurecloud");
    e.printStackTrace();
}
~~~

### Parameters

This endpoint does not require any parameters.
{: class="table table-striped"}

### Return type

[**PureCloud**](PureCloud.html)

<a name="getIdentityprovidersSalesforce"></a>

# **getIdentityprovidersSalesforce**

> [Salesforce](Salesforce.html) getIdentityprovidersSalesforce()

Get Salesforce Identity Provider



Wraps GET /api/v2/identityproviders/salesforce  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

IdentityProviderApi apiInstance = new IdentityProviderApi();
try {
    Salesforce result = apiInstance.getIdentityprovidersSalesforce();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#getIdentityprovidersSalesforce");
    e.printStackTrace();
}
~~~

### Parameters

This endpoint does not require any parameters.
{: class="table table-striped"}

### Return type

[**Salesforce**](Salesforce.html)

<a name="putIdentityprovidersAdfs"></a>

# **putIdentityprovidersAdfs**

> [OAuthProvider](OAuthProvider.html) putIdentityprovidersAdfs(body)

Update/Create ADFS Identity Provider



Wraps PUT /api/v2/identityproviders/adfs  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

IdentityProviderApi apiInstance = new IdentityProviderApi();
ADFS body = new ADFS(); // ADFS | Provider
try {
    OAuthProvider result = apiInstance.putIdentityprovidersAdfs(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#putIdentityprovidersAdfs");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**ADFS**](ADFS.html)| Provider | |
{: class="table table-striped"}

### Return type

[**OAuthProvider**](OAuthProvider.html)

<a name="putIdentityprovidersCic"></a>

# **putIdentityprovidersCic**

> [OAuthProvider](OAuthProvider.html) putIdentityprovidersCic(body)

Update/Create Customer Interaction Center (CIC) Identity Provider



Wraps PUT /api/v2/identityproviders/cic  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

IdentityProviderApi apiInstance = new IdentityProviderApi();
CustomerInteractionCenter body = new CustomerInteractionCenter(); // CustomerInteractionCenter | Provider
try {
    OAuthProvider result = apiInstance.putIdentityprovidersCic(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#putIdentityprovidersCic");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**CustomerInteractionCenter**](CustomerInteractionCenter.html)| Provider | |
{: class="table table-striped"}

### Return type

[**OAuthProvider**](OAuthProvider.html)

<a name="putIdentityprovidersGsuite"></a>

# **putIdentityprovidersGsuite**

> [OAuthProvider](OAuthProvider.html) putIdentityprovidersGsuite(body)

Update/Create G Suite Identity Provider



Wraps PUT /api/v2/identityproviders/gsuite  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

IdentityProviderApi apiInstance = new IdentityProviderApi();
GSuite body = new GSuite(); // GSuite | Provider
try {
    OAuthProvider result = apiInstance.putIdentityprovidersGsuite(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#putIdentityprovidersGsuite");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**GSuite**](GSuite.html)| Provider | |
{: class="table table-striped"}

### Return type

[**OAuthProvider**](OAuthProvider.html)

<a name="putIdentityprovidersIdentitynow"></a>

# **putIdentityprovidersIdentitynow**

> [IdentityNow](IdentityNow.html) putIdentityprovidersIdentitynow(body)

Update/Create IdentityNow Provider



Wraps PUT /api/v2/identityproviders/identitynow  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

IdentityProviderApi apiInstance = new IdentityProviderApi();
IdentityNow body = new IdentityNow(); // IdentityNow | Provider
try {
    IdentityNow result = apiInstance.putIdentityprovidersIdentitynow(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#putIdentityprovidersIdentitynow");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**IdentityNow**](IdentityNow.html)| Provider | |
{: class="table table-striped"}

### Return type

[**IdentityNow**](IdentityNow.html)

<a name="putIdentityprovidersOkta"></a>

# **putIdentityprovidersOkta**

> [OAuthProvider](OAuthProvider.html) putIdentityprovidersOkta(body)

Update/Create Okta Identity Provider



Wraps PUT /api/v2/identityproviders/okta  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

IdentityProviderApi apiInstance = new IdentityProviderApi();
Okta body = new Okta(); // Okta | Provider
try {
    OAuthProvider result = apiInstance.putIdentityprovidersOkta(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#putIdentityprovidersOkta");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**Okta**](Okta.html)| Provider | |
{: class="table table-striped"}

### Return type

[**OAuthProvider**](OAuthProvider.html)

<a name="putIdentityprovidersOnelogin"></a>

# **putIdentityprovidersOnelogin**

> [OAuthProvider](OAuthProvider.html) putIdentityprovidersOnelogin(body)

Update/Create OneLogin Identity Provider



Wraps PUT /api/v2/identityproviders/onelogin  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

IdentityProviderApi apiInstance = new IdentityProviderApi();
OneLogin body = new OneLogin(); // OneLogin | Provider
try {
    OAuthProvider result = apiInstance.putIdentityprovidersOnelogin(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#putIdentityprovidersOnelogin");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**OneLogin**](OneLogin.html)| Provider | |
{: class="table table-striped"}

### Return type

[**OAuthProvider**](OAuthProvider.html)

<a name="putIdentityprovidersPing"></a>

# **putIdentityprovidersPing**

> [OAuthProvider](OAuthProvider.html) putIdentityprovidersPing(body)

Update/Create Ping Identity Provider



Wraps PUT /api/v2/identityproviders/ping  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

IdentityProviderApi apiInstance = new IdentityProviderApi();
PingIdentity body = new PingIdentity(); // PingIdentity | Provider
try {
    OAuthProvider result = apiInstance.putIdentityprovidersPing(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#putIdentityprovidersPing");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**PingIdentity**](PingIdentity.html)| Provider | |
{: class="table table-striped"}

### Return type

[**OAuthProvider**](OAuthProvider.html)

<a name="putIdentityprovidersPurecloud"></a>

# **putIdentityprovidersPurecloud**

> [OAuthProvider](OAuthProvider.html) putIdentityprovidersPurecloud(body)

Update/Create PureCloud Identity Provider



Wraps PUT /api/v2/identityproviders/purecloud  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

IdentityProviderApi apiInstance = new IdentityProviderApi();
PureCloud body = new PureCloud(); // PureCloud | Provider
try {
    OAuthProvider result = apiInstance.putIdentityprovidersPurecloud(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#putIdentityprovidersPurecloud");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**PureCloud**](PureCloud.html)| Provider | |
{: class="table table-striped"}

### Return type

[**OAuthProvider**](OAuthProvider.html)

<a name="putIdentityprovidersSalesforce"></a>

# **putIdentityprovidersSalesforce**

> [OAuthProvider](OAuthProvider.html) putIdentityprovidersSalesforce(body)

Update/Create Salesforce Identity Provider



Wraps PUT /api/v2/identityproviders/salesforce  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

IdentityProviderApi apiInstance = new IdentityProviderApi();
Salesforce body = new Salesforce(); // Salesforce | Provider
try {
    OAuthProvider result = apiInstance.putIdentityprovidersSalesforce(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#putIdentityprovidersSalesforce");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**Salesforce**](Salesforce.html)| Provider | |
{: class="table table-striped"}

### Return type

[**OAuthProvider**](OAuthProvider.html)

