# UtilitiesApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**getDate**](UtilitiesApi#getDate) | Get the current system date/time |
| [**getIpranges**](UtilitiesApi#getIpranges) | Get public ip address ranges for Genesys Cloud |
| [**getTimezones**](UtilitiesApi#getTimezones) | Get time zones list |
| [**postCertificateDetails**](UtilitiesApi#postCertificateDetails) | Returns the information about an X509 PEM encoded certificate or certificate chain. |
{: class="table-striped"}


# **getDate**


> [ServerDate](ServerDate) getDate()

Get the current system date/time

Wraps GET /api/v2/date  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UtilitiesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UtilitiesApi apiInstance = new UtilitiesApi();
try {
    ServerDate result = apiInstance.getDate();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UtilitiesApi#getDate");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**ServerDate**](ServerDate)


# **getIpranges**


> [IpAddressRangeListing](IpAddressRangeListing) getIpranges()

Get public ip address ranges for Genesys Cloud

Wraps GET /api/v2/ipranges  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UtilitiesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UtilitiesApi apiInstance = new UtilitiesApi();
try {
    IpAddressRangeListing result = apiInstance.getIpranges();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UtilitiesApi#getIpranges");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**IpAddressRangeListing**](IpAddressRangeListing)


# **getTimezones**


> [TimeZoneEntityListing](TimeZoneEntityListing) getTimezones(pageSize, pageNumber)

Get time zones list

Wraps GET /api/v2/timezones  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UtilitiesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UtilitiesApi apiInstance = new UtilitiesApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
try {
    TimeZoneEntityListing result = apiInstance.getTimezones(pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UtilitiesApi#getTimezones");
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

[**TimeZoneEntityListing**](TimeZoneEntityListing)


# **postCertificateDetails**


> [ParsedCertificate](ParsedCertificate) postCertificateDetails(body)

Returns the information about an X509 PEM encoded certificate or certificate chain.

Wraps POST /api/v2/certificate/details  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UtilitiesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UtilitiesApi apiInstance = new UtilitiesApi();
Certificate body = new Certificate(); // Certificate | Certificate
try {
    ParsedCertificate result = apiInstance.postCertificateDetails(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UtilitiesApi#postCertificateDetails");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**Certificate**](Certificate)| Certificate | 
{: class="table-striped"}


### Return type

[**ParsedCertificate**](ParsedCertificate)


_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
