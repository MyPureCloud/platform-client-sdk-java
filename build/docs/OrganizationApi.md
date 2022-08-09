---
title: OrganizationApi
---
## OrganizationApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**getFieldconfig**](OrganizationApi.html#getFieldconfig) | Fetch field config for an entity type |
| [**getOrganizationsEmbeddedintegration**](OrganizationApi.html#getOrganizationsEmbeddedintegration) | Get the list of domains that will be allowed to embed PureCloud applications |
| [**getOrganizationsIpaddressauthentication**](OrganizationApi.html#getOrganizationsIpaddressauthentication) | Get organization IP address whitelist settings |
| [**getOrganizationsLimitsChangerequest**](OrganizationApi.html#getOrganizationsLimitsChangerequest) | Get a limit change request |
| [**getOrganizationsLimitsChangerequests**](OrganizationApi.html#getOrganizationsLimitsChangerequests) | Get the available limit change requests |
| [**getOrganizationsLimitsDocs**](OrganizationApi.html#getOrganizationsLimitsDocs) | Get a link to the limit documentation |
| [**getOrganizationsLimitsNamespace**](OrganizationApi.html#getOrganizationsLimitsNamespace) | Get the effective limits in a namespace for an organization |
| [**getOrganizationsLimitsNamespaceDefaults**](OrganizationApi.html#getOrganizationsLimitsNamespaceDefaults) | Get the default limits in a namespace for an organization |
| [**getOrganizationsLimitsNamespaces**](OrganizationApi.html#getOrganizationsLimitsNamespaces) | Get the available limit namespaces |
| [**getOrganizationsMe**](OrganizationApi.html#getOrganizationsMe) | Get organization. |
| [**getOrganizationsWhitelist**](OrganizationApi.html#getOrganizationsWhitelist) | Use PUT /api/v2/organizations/embeddedintegration instead |
| [**patchOrganizationsFeature**](OrganizationApi.html#patchOrganizationsFeature) | Update organization |
| [**putOrganizationsEmbeddedintegration**](OrganizationApi.html#putOrganizationsEmbeddedintegration) | Update the list of domains that will be allowed to embed PureCloud applications |
| [**putOrganizationsIpaddressauthentication**](OrganizationApi.html#putOrganizationsIpaddressauthentication) | Update organization IP address whitelist settings |
| [**putOrganizationsMe**](OrganizationApi.html#putOrganizationsMe) | Update organization. |
| [**putOrganizationsWhitelist**](OrganizationApi.html#putOrganizationsWhitelist) | Use PUT /api/v2/organizations/embeddedintegration instead |
{: class="table-striped"}

<a name="getFieldconfig"></a>

# **getFieldconfig**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> [FieldConfig](FieldConfig.html) getFieldconfig(type)

Fetch field config for an entity type

Wraps GET /api/v2/fieldconfig  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.OrganizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

OrganizationApi apiInstance = new OrganizationApi();
String type = "type_example"; // String | Field type
try {
    FieldConfig result = apiInstance.getFieldconfig(type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#getFieldconfig");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **type** | **String**| Field type |<br />**Values**: person, group, org, externalContact 
{: class="table-striped"}


### Return type

[**FieldConfig**](FieldConfig.html)

<a name="getOrganizationsEmbeddedintegration"></a>

# **getOrganizationsEmbeddedintegration**



> [EmbeddedIntegration](EmbeddedIntegration.html) getOrganizationsEmbeddedintegration()

Get the list of domains that will be allowed to embed PureCloud applications

Wraps GET /api/v2/organizations/embeddedintegration  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.OrganizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

OrganizationApi apiInstance = new OrganizationApi();
try {
    EmbeddedIntegration result = apiInstance.getOrganizationsEmbeddedintegration();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#getOrganizationsEmbeddedintegration");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**EmbeddedIntegration**](EmbeddedIntegration.html)

<a name="getOrganizationsIpaddressauthentication"></a>

# **getOrganizationsIpaddressauthentication**



> [IpAddressAuthentication](IpAddressAuthentication.html) getOrganizationsIpaddressauthentication()

Get organization IP address whitelist settings

Wraps GET /api/v2/organizations/ipaddressauthentication  

Requires ANY permissions: 

* directory:organization:admin

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.OrganizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

OrganizationApi apiInstance = new OrganizationApi();
try {
    IpAddressAuthentication result = apiInstance.getOrganizationsIpaddressauthentication();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#getOrganizationsIpaddressauthentication");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**IpAddressAuthentication**](IpAddressAuthentication.html)

<a name="getOrganizationsLimitsChangerequest"></a>

# **getOrganizationsLimitsChangerequest**



> [LimitChangeRequestDetails](LimitChangeRequestDetails.html) getOrganizationsLimitsChangerequest(requestId)

Get a limit change request

Wraps GET /api/v2/organizations/limits/changerequests/{requestId}  

Requires ANY permissions: 

* limits:organization:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.OrganizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

OrganizationApi apiInstance = new OrganizationApi();
String requestId = "requestId_example"; // String | Unique id for the limit change request
try {
    LimitChangeRequestDetails result = apiInstance.getOrganizationsLimitsChangerequest(requestId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#getOrganizationsLimitsChangerequest");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **requestId** | **String**| Unique id for the limit change request | 
{: class="table-striped"}


### Return type

[**LimitChangeRequestDetails**](LimitChangeRequestDetails.html)

<a name="getOrganizationsLimitsChangerequests"></a>

# **getOrganizationsLimitsChangerequests**



> [LimitChangeRequestsEntityListing](LimitChangeRequestsEntityListing.html) getOrganizationsLimitsChangerequests(after, before, status, pageSize, expand)

Get the available limit change requests

Timestamp interval defaults to the last 365 days if both query parameters are omitted. If only one parameter is omitted, the interval will default to a 180 day range in the specified direction.

Wraps GET /api/v2/organizations/limits/changerequests  

Requires ANY permissions: 

* limits:organization:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.OrganizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

OrganizationApi apiInstance = new OrganizationApi();
Long after = 56L; // Long | Timestamp indicating the date to begin after when searching for requests.
Long before = 56L; // Long | Timestamp indicating the date to end before when searching for requests.
String status = "status_example"; // String | Status of the request to be filtered by
Integer pageSize = 25; // Integer | Page Size
List<String> expand = Arrays.asList(null); // List<String> | Which fields, if any, to expand.
try {
    LimitChangeRequestsEntityListing result = apiInstance.getOrganizationsLimitsChangerequests(after, before, status, pageSize, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#getOrganizationsLimitsChangerequests");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **after** | **Long**| Timestamp indicating the date to begin after when searching for requests. | [optional] 
| **before** | **Long**| Timestamp indicating the date to end before when searching for requests. | [optional] 
| **status** | **String**| Status of the request to be filtered by | [optional]<br />**Values**: Approved, Rejected, Rollback, Pending, Open, SecondaryApprovalNamespacesAdded, ReviewerApproved, ReviewerRejected, ReviewerRollback, ImplementingChange, ChangeImplemented, ImplementingRollback, RollbackImplemented 
| **pageSize** | **Integer**| Page Size | [optional] [default to 25] 
| **expand** | [**List&lt;String&gt;**](String.html)| Which fields, if any, to expand. | [optional]<br />**Values**: statusHistory 
{: class="table-striped"}


### Return type

[**LimitChangeRequestsEntityListing**](LimitChangeRequestsEntityListing.html)

<a name="getOrganizationsLimitsDocs"></a>

# **getOrganizationsLimitsDocs**



> [UrlResponse](UrlResponse.html) getOrganizationsLimitsDocs()

Get a link to the limit documentation

Wraps GET /api/v2/organizations/limits/docs  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.OrganizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

OrganizationApi apiInstance = new OrganizationApi();
try {
    UrlResponse result = apiInstance.getOrganizationsLimitsDocs();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#getOrganizationsLimitsDocs");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**UrlResponse**](UrlResponse.html)

<a name="getOrganizationsLimitsNamespace"></a>

# **getOrganizationsLimitsNamespace**



> [LimitsEntityListing](LimitsEntityListing.html) getOrganizationsLimitsNamespace(namespaceName)

Get the effective limits in a namespace for an organization

Wraps GET /api/v2/organizations/limits/namespaces/{namespaceName}  

Requires ANY permissions: 

* limits:organization:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.OrganizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

OrganizationApi apiInstance = new OrganizationApi();
String namespaceName = "namespaceName_example"; // String | The namespace to fetch limits for
try {
    LimitsEntityListing result = apiInstance.getOrganizationsLimitsNamespace(namespaceName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#getOrganizationsLimitsNamespace");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **namespaceName** | **String**| The namespace to fetch limits for | 
{: class="table-striped"}


### Return type

[**LimitsEntityListing**](LimitsEntityListing.html)

<a name="getOrganizationsLimitsNamespaceDefaults"></a>

# **getOrganizationsLimitsNamespaceDefaults**



> [LimitsEntityListing](LimitsEntityListing.html) getOrganizationsLimitsNamespaceDefaults(namespaceName)

Get the default limits in a namespace for an organization

Wraps GET /api/v2/organizations/limits/namespaces/{namespaceName}/defaults  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.OrganizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

OrganizationApi apiInstance = new OrganizationApi();
String namespaceName = "namespaceName_example"; // String | The namespace to fetch defaults limits for
try {
    LimitsEntityListing result = apiInstance.getOrganizationsLimitsNamespaceDefaults(namespaceName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#getOrganizationsLimitsNamespaceDefaults");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **namespaceName** | **String**| The namespace to fetch defaults limits for | 
{: class="table-striped"}


### Return type

[**LimitsEntityListing**](LimitsEntityListing.html)

<a name="getOrganizationsLimitsNamespaces"></a>

# **getOrganizationsLimitsNamespaces**



> Object getOrganizationsLimitsNamespaces(pageSize, pageNumber)

Get the available limit namespaces

Wraps GET /api/v2/organizations/limits/namespaces  

Requires ANY permissions: 

* limits:organization:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.OrganizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

OrganizationApi apiInstance = new OrganizationApi();
Integer pageSize = 100; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
try {
    Object result = apiInstance.getOrganizationsLimitsNamespaces(pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#getOrganizationsLimitsNamespaces");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| Page size | [optional] [default to 100] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
{: class="table-striped"}


### Return type

**Object**

<a name="getOrganizationsMe"></a>

# **getOrganizationsMe**



> [Organization](Organization.html) getOrganizationsMe()

Get organization.

Wraps GET /api/v2/organizations/me  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.OrganizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

OrganizationApi apiInstance = new OrganizationApi();
try {
    Organization result = apiInstance.getOrganizationsMe();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#getOrganizationsMe");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**Organization**](Organization.html)

<a name="getOrganizationsWhitelist"></a>

# **getOrganizationsWhitelist**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> [OrgWhitelistSettings](OrgWhitelistSettings.html) getOrganizationsWhitelist()

Use PUT /api/v2/organizations/embeddedintegration instead

Wraps GET /api/v2/organizations/whitelist  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.OrganizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

OrganizationApi apiInstance = new OrganizationApi();
try {
    OrgWhitelistSettings result = apiInstance.getOrganizationsWhitelist();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#getOrganizationsWhitelist");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**OrgWhitelistSettings**](OrgWhitelistSettings.html)

<a name="patchOrganizationsFeature"></a>

# **patchOrganizationsFeature**



> [OrganizationFeatures](OrganizationFeatures.html) patchOrganizationsFeature(featureName, enabled)

Update organization

Wraps PATCH /api/v2/organizations/features/{featureName}  

Requires ANY permissions: 

* directory:organization:admin

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.OrganizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

OrganizationApi apiInstance = new OrganizationApi();
String featureName = "featureName_example"; // String | Organization feature
FeatureState enabled = new FeatureState(); // FeatureState | New state of feature
try {
    OrganizationFeatures result = apiInstance.patchOrganizationsFeature(featureName, enabled);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#patchOrganizationsFeature");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **featureName** | **String**| Organization feature |<br />**Values**: realtimeCIC, purecloud, hipaa, ucEnabled, pci, purecloudVoice, xmppFederation, chat, informalPhotos, directory, contactCenter, unifiedCommunications, custserv 
| **enabled** | [**FeatureState**](FeatureState.html)| New state of feature | 
{: class="table-striped"}


### Return type

[**OrganizationFeatures**](OrganizationFeatures.html)

<a name="putOrganizationsEmbeddedintegration"></a>

# **putOrganizationsEmbeddedintegration**



> [EmbeddedIntegration](EmbeddedIntegration.html) putOrganizationsEmbeddedintegration(body)

Update the list of domains that will be allowed to embed PureCloud applications

Wraps PUT /api/v2/organizations/embeddedintegration  

Requires ANY permissions: 

* directory:organization:admin

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.OrganizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

OrganizationApi apiInstance = new OrganizationApi();
EmbeddedIntegration body = new EmbeddedIntegration(); // EmbeddedIntegration | Whitelist settings
try {
    EmbeddedIntegration result = apiInstance.putOrganizationsEmbeddedintegration(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#putOrganizationsEmbeddedintegration");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**EmbeddedIntegration**](EmbeddedIntegration.html)| Whitelist settings | 
{: class="table-striped"}


### Return type

[**EmbeddedIntegration**](EmbeddedIntegration.html)

<a name="putOrganizationsIpaddressauthentication"></a>

# **putOrganizationsIpaddressauthentication**



> [IpAddressAuthentication](IpAddressAuthentication.html) putOrganizationsIpaddressauthentication(body)

Update organization IP address whitelist settings

Wraps PUT /api/v2/organizations/ipaddressauthentication  

Requires ANY permissions: 

* directory:organization:admin

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.OrganizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

OrganizationApi apiInstance = new OrganizationApi();
IpAddressAuthentication body = new IpAddressAuthentication(); // IpAddressAuthentication | IP address Whitelist settings
try {
    IpAddressAuthentication result = apiInstance.putOrganizationsIpaddressauthentication(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#putOrganizationsIpaddressauthentication");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**IpAddressAuthentication**](IpAddressAuthentication.html)| IP address Whitelist settings | 
{: class="table-striped"}


### Return type

[**IpAddressAuthentication**](IpAddressAuthentication.html)

<a name="putOrganizationsMe"></a>

# **putOrganizationsMe**



> [Organization](Organization.html) putOrganizationsMe(body)

Update organization.

Wraps PUT /api/v2/organizations/me  

Requires ANY permissions: 

* directory:organization:admin

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.OrganizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

OrganizationApi apiInstance = new OrganizationApi();
Organization body = new Organization(); // Organization | Organization
try {
    Organization result = apiInstance.putOrganizationsMe(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#putOrganizationsMe");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**Organization**](Organization.html)| Organization | [optional] 
{: class="table-striped"}


### Return type

[**Organization**](Organization.html)

<a name="putOrganizationsWhitelist"></a>

# **putOrganizationsWhitelist**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> [OrgWhitelistSettings](OrgWhitelistSettings.html) putOrganizationsWhitelist(body)

Use PUT /api/v2/organizations/embeddedintegration instead

Wraps PUT /api/v2/organizations/whitelist  

Requires ANY permissions: 

* directory:organization:admin

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.OrganizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

OrganizationApi apiInstance = new OrganizationApi();
OrgWhitelistSettings body = new OrgWhitelistSettings(); // OrgWhitelistSettings | Whitelist settings
try {
    OrgWhitelistSettings result = apiInstance.putOrganizationsWhitelist(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#putOrganizationsWhitelist");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**OrgWhitelistSettings**](OrgWhitelistSettings.html)| Whitelist settings | 
{: class="table-striped"}


### Return type

[**OrgWhitelistSettings**](OrgWhitelistSettings.html)

