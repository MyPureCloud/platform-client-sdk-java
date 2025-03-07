# OrganizationApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**getFieldconfig**](OrganizationApi#getFieldconfig) | Fetch field config for an entity type |
| [**getOrganizationsAuthenticationSettings**](OrganizationApi#getOrganizationsAuthenticationSettings) | Gets the organization's settings |
| [**getOrganizationsEmbeddedintegration**](OrganizationApi#getOrganizationsEmbeddedintegration) | Get the list of domains that will be allowed to embed PureCloud applications |
| [**getOrganizationsIpaddressauthentication**](OrganizationApi#getOrganizationsIpaddressauthentication) | Get organization IP address whitelist settings |
| [**getOrganizationsLimitsChangerequest**](OrganizationApi#getOrganizationsLimitsChangerequest) | Get a limit change request |
| [**getOrganizationsLimitsChangerequests**](OrganizationApi#getOrganizationsLimitsChangerequests) | Get the available limit change requests |
| [**getOrganizationsLimitsDocs**](OrganizationApi#getOrganizationsLimitsDocs) | Get limit documentation |
| [**getOrganizationsLimitsDocsFreetrial**](OrganizationApi#getOrganizationsLimitsDocsFreetrial) | Get free trial limit documentation |
| [**getOrganizationsLimitsNamespace**](OrganizationApi#getOrganizationsLimitsNamespace) | Get the effective limits in a namespace for an organization |
| [**getOrganizationsLimitsNamespaceCounts**](OrganizationApi#getOrganizationsLimitsNamespaceCounts) | Get estimated limit counts for a namespace. This is not a source of truth for limit values but a record of estimates to facilitate limit threshold tracking. |
| [**getOrganizationsLimitsNamespaceDefaults**](OrganizationApi#getOrganizationsLimitsNamespaceDefaults) | Get the default limits in a namespace for an organization |
| [**getOrganizationsLimitsNamespaceLimitCounts**](OrganizationApi#getOrganizationsLimitsNamespaceLimitCounts) | Get estimated limit counts for a namespace and limit name. This is not a source of truth for limit values but a record of estimates to facilitate limit threshold tracking. |
| [**getOrganizationsLimitsNamespaces**](OrganizationApi#getOrganizationsLimitsNamespaces) | Get the available limit namespaces |
| [**getOrganizationsMe**](OrganizationApi#getOrganizationsMe) | Get organization. |
| [**getOrganizationsWhitelist**](OrganizationApi#getOrganizationsWhitelist) | This route is deprecated, please use /api/v2/organizations/authentication/settings instead |
| [**patchOrganizationsAuthenticationSettings**](OrganizationApi#patchOrganizationsAuthenticationSettings) | Update the organization's settings |
| [**patchOrganizationsFeature**](OrganizationApi#patchOrganizationsFeature) | Update organization |
| [**putOrganizationsEmbeddedintegration**](OrganizationApi#putOrganizationsEmbeddedintegration) | Update the list of domains that will be allowed to embed PureCloud applications |
| [**putOrganizationsIpaddressauthentication**](OrganizationApi#putOrganizationsIpaddressauthentication) | Update organization IP address whitelist settings |
| [**putOrganizationsMe**](OrganizationApi#putOrganizationsMe) | Update organization. |
| [**putOrganizationsWhitelist**](OrganizationApi#putOrganizationsWhitelist) | This route is deprecated, please use /api/v2/organizations/authentication/settings instead |
{: class="table-striped"}


# **getFieldconfig**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> [FieldConfig](FieldConfig) getFieldconfig(type)

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
| **type** | **String**| Field type |<br />**Values**: person, group, org 
{: class="table-striped"}


### Return type

[**FieldConfig**](FieldConfig)


# **getOrganizationsAuthenticationSettings**


> [OrgAuthSettings](OrgAuthSettings) getOrganizationsAuthenticationSettings()

Gets the organization's settings

Wraps GET /api/v2/organizations/authentication/settings  

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
    OrgAuthSettings result = apiInstance.getOrganizationsAuthenticationSettings();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#getOrganizationsAuthenticationSettings");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**OrgAuthSettings**](OrgAuthSettings)


# **getOrganizationsEmbeddedintegration**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> [EmbeddedIntegration](EmbeddedIntegration) getOrganizationsEmbeddedintegration()

Get the list of domains that will be allowed to embed PureCloud applications

This route is deprecated, please use /api/v2/organizations/authentication/settings instead

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

[**EmbeddedIntegration**](EmbeddedIntegration)


# **getOrganizationsIpaddressauthentication**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> [IpAddressAuthentication](IpAddressAuthentication) getOrganizationsIpaddressauthentication()

Get organization IP address whitelist settings

This route is deprecated, please use /api/v2/organizations/authentication/settings instead

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

[**IpAddressAuthentication**](IpAddressAuthentication)


# **getOrganizationsLimitsChangerequest**


> [LimitChangeRequestDetails](LimitChangeRequestDetails) getOrganizationsLimitsChangerequest(requestId)

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

[**LimitChangeRequestDetails**](LimitChangeRequestDetails)


# **getOrganizationsLimitsChangerequests**


> [LimitChangeRequestsEntityListing](LimitChangeRequestsEntityListing) getOrganizationsLimitsChangerequests(after, before, status, pageSize, expand)

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
| **expand** | [**List&lt;String&gt;**](String)| Which fields, if any, to expand. | [optional]<br />**Values**: statusHistory 
{: class="table-striped"}


### Return type

[**LimitChangeRequestsEntityListing**](LimitChangeRequestsEntityListing)


# **getOrganizationsLimitsDocs**


> [LimitDocumentation](LimitDocumentation) getOrganizationsLimitsDocs()

Get limit documentation

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
    LimitDocumentation result = apiInstance.getOrganizationsLimitsDocs();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#getOrganizationsLimitsDocs");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**LimitDocumentation**](LimitDocumentation)


# **getOrganizationsLimitsDocsFreetrial**


> [FreeTrialLimitDocs](FreeTrialLimitDocs) getOrganizationsLimitsDocsFreetrial()

Get free trial limit documentation

Wraps GET /api/v2/organizations/limits/docs/freetrial  

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
    FreeTrialLimitDocs result = apiInstance.getOrganizationsLimitsDocsFreetrial();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#getOrganizationsLimitsDocsFreetrial");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**FreeTrialLimitDocs**](FreeTrialLimitDocs)


# **getOrganizationsLimitsNamespace**


> [LimitsEntityListing](LimitsEntityListing) getOrganizationsLimitsNamespace(namespaceName)

Get the effective limits in a namespace for an organization

Wraps GET /api/v2/organizations/limits/namespaces/{namespaceName}  

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

[**LimitsEntityListing**](LimitsEntityListing)


# **getOrganizationsLimitsNamespaceCounts**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> [LimitCountListing](LimitCountListing) getOrganizationsLimitsNamespaceCounts(namespaceName, cursor, entityId, userId)

Get estimated limit counts for a namespace. This is not a source of truth for limit values but a record of estimates to facilitate limit threshold tracking.

See https://developer.genesys.cloud/organization/organization/limits#available-limits for limits that are trackable (Operational Events Enabled).

Wraps GET /api/v2/organizations/limits/namespaces/{namespaceName}/counts  

Requires ANY permissions: 

* limits:count:view

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
String namespaceName = "namespaceName_example"; // String | The namespace to get
String cursor = "cursor_example"; // String | Cursor provided when retrieving the last page
String entityId = "entityId_example"; // String | entity id of the count
String userId = "userId_example"; // String | userid of the count
try {
    LimitCountListing result = apiInstance.getOrganizationsLimitsNamespaceCounts(namespaceName, cursor, entityId, userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#getOrganizationsLimitsNamespaceCounts");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **namespaceName** | **String**| The namespace to get | 
| **cursor** | **String**| Cursor provided when retrieving the last page | [optional] 
| **entityId** | **String**| entity id of the count | [optional] 
| **userId** | **String**| userid of the count | [optional] 
{: class="table-striped"}


### Return type

[**LimitCountListing**](LimitCountListing)


# **getOrganizationsLimitsNamespaceDefaults**


> [LimitsEntityListing](LimitsEntityListing) getOrganizationsLimitsNamespaceDefaults(namespaceName)

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

[**LimitsEntityListing**](LimitsEntityListing)


# **getOrganizationsLimitsNamespaceLimitCounts**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> [LimitCountListing](LimitCountListing) getOrganizationsLimitsNamespaceLimitCounts(namespaceName, limitName, entityId, userId, cursor)

Get estimated limit counts for a namespace and limit name. This is not a source of truth for limit values but a record of estimates to facilitate limit threshold tracking.

See https://developer.genesys.cloud/organization/organization/limits#available-limits for limits that are trackable (Operational Events Enabled).

Wraps GET /api/v2/organizations/limits/namespaces/{namespaceName}/limits/{limitName}/counts  

Requires ANY permissions: 

* limits:count:view

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
String namespaceName = "namespaceName_example"; // String | The namespace to get
String limitName = "limitName_example"; // String | The limit to get
String entityId = "entityId_example"; // String | entity id of the count
String userId = "userId_example"; // String | userid of the count
String cursor = "cursor_example"; // String | Cursor provided when retrieving the last page
try {
    LimitCountListing result = apiInstance.getOrganizationsLimitsNamespaceLimitCounts(namespaceName, limitName, entityId, userId, cursor);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#getOrganizationsLimitsNamespaceLimitCounts");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **namespaceName** | **String**| The namespace to get | 
| **limitName** | **String**| The limit to get | 
| **entityId** | **String**| entity id of the count | [optional] 
| **userId** | **String**| userid of the count | [optional] 
| **cursor** | **String**| Cursor provided when retrieving the last page | [optional] 
{: class="table-striped"}


### Return type

[**LimitCountListing**](LimitCountListing)


# **getOrganizationsLimitsNamespaces**


> Object getOrganizationsLimitsNamespaces(pageSize, pageNumber)

Get the available limit namespaces

Wraps GET /api/v2/organizations/limits/namespaces  

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


# **getOrganizationsMe**


> [Organization](Organization) getOrganizationsMe()

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

[**Organization**](Organization)


# **getOrganizationsWhitelist**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> [OrgWhitelistSettings](OrgWhitelistSettings) getOrganizationsWhitelist()

This route is deprecated, please use /api/v2/organizations/authentication/settings instead

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

[**OrgWhitelistSettings**](OrgWhitelistSettings)


# **patchOrganizationsAuthenticationSettings**


> [OrgAuthSettings](OrgAuthSettings) patchOrganizationsAuthenticationSettings(body)

Update the organization's settings

Wraps PATCH /api/v2/organizations/authentication/settings  

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
OrgAuthSettings body = new OrgAuthSettings(); // OrgAuthSettings | Org settings
try {
    OrgAuthSettings result = apiInstance.patchOrganizationsAuthenticationSettings(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#patchOrganizationsAuthenticationSettings");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**OrgAuthSettings**](OrgAuthSettings)| Org settings | 
{: class="table-striped"}


### Return type

[**OrgAuthSettings**](OrgAuthSettings)


# **patchOrganizationsFeature**


> [OrganizationFeatures](OrganizationFeatures) patchOrganizationsFeature(featureName, enabled)

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
| **enabled** | [**FeatureState**](FeatureState)| New state of feature | 
{: class="table-striped"}


### Return type

[**OrganizationFeatures**](OrganizationFeatures)


# **putOrganizationsEmbeddedintegration**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> [EmbeddedIntegration](EmbeddedIntegration) putOrganizationsEmbeddedintegration(body)

Update the list of domains that will be allowed to embed PureCloud applications

This route is deprecated, please use /api/v2/organizations/authentication/settings instead

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
| **body** | [**EmbeddedIntegration**](EmbeddedIntegration)| Whitelist settings | 
{: class="table-striped"}


### Return type

[**EmbeddedIntegration**](EmbeddedIntegration)


# **putOrganizationsIpaddressauthentication**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> [IpAddressAuthentication](IpAddressAuthentication) putOrganizationsIpaddressauthentication(body)

Update organization IP address whitelist settings

This route is deprecated, please use /api/v2/organizations/authentication/settings instead

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
| **body** | [**IpAddressAuthentication**](IpAddressAuthentication)| IP address Whitelist settings | 
{: class="table-striped"}


### Return type

[**IpAddressAuthentication**](IpAddressAuthentication)


# **putOrganizationsMe**


> [Organization](Organization) putOrganizationsMe(body)

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
| **body** | [**Organization**](Organization)| Organization | [optional] 
{: class="table-striped"}


### Return type

[**Organization**](Organization)


# **putOrganizationsWhitelist**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> [OrgWhitelistSettings](OrgWhitelistSettings) putOrganizationsWhitelist(body)

This route is deprecated, please use /api/v2/organizations/authentication/settings instead

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
| **body** | [**OrgWhitelistSettings**](OrgWhitelistSettings)| Whitelist settings | 
{: class="table-striped"}


### Return type

[**OrgWhitelistSettings**](OrgWhitelistSettings)


_com.mypurecloud.sdk.v2:platform-client-v2:221.0.0_
