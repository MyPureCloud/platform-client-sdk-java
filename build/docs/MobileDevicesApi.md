# MobileDevicesApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**deleteMobiledevice**](MobileDevicesApi#deleteMobiledevice) | Delete device |
| [**getMobiledevice**](MobileDevicesApi#getMobiledevice) | Get device |
| [**getMobiledevices**](MobileDevicesApi#getMobiledevices) | Get a list of all devices. |
| [**postMobiledevices**](MobileDevicesApi#postMobiledevices) | Create User device |
| [**putMobiledevice**](MobileDevicesApi#putMobiledevice) | Update device |
{: class="table-striped"}


# **deleteMobiledevice**


> Void deleteMobiledevice(deviceId)

Delete device

Wraps DELETE /api/v2/mobiledevices/{deviceId}  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.MobileDevicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

MobileDevicesApi apiInstance = new MobileDevicesApi();
String deviceId = "deviceId_example"; // String | Device ID
try {
    apiInstance.deleteMobiledevice(deviceId);
} catch (ApiException e) {
    System.err.println("Exception when calling MobileDevicesApi#deleteMobiledevice");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **deviceId** | **String**| Device ID | 
{: class="table-striped"}


### Return type

null (empty response body)


# **getMobiledevice**


> [UserDevice](UserDevice) getMobiledevice(deviceId)

Get device

Wraps GET /api/v2/mobiledevices/{deviceId}  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.MobileDevicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

MobileDevicesApi apiInstance = new MobileDevicesApi();
String deviceId = "deviceId_example"; // String | Device ID
try {
    UserDevice result = apiInstance.getMobiledevice(deviceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MobileDevicesApi#getMobiledevice");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **deviceId** | **String**| Device ID | 
{: class="table-striped"}


### Return type

[**UserDevice**](UserDevice)


# **getMobiledevices**


> [DirectoryUserDevicesListing](DirectoryUserDevicesListing) getMobiledevices(pageSize, pageNumber, sortOrder)

Get a list of all devices.

Wraps GET /api/v2/mobiledevices  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.MobileDevicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

MobileDevicesApi apiInstance = new MobileDevicesApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String sortOrder = "ascending"; // String | Ascending or descending sort order
try {
    DirectoryUserDevicesListing result = apiInstance.getMobiledevices(pageSize, pageNumber, sortOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MobileDevicesApi#getMobiledevices");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **sortOrder** | **String**| Ascending or descending sort order | [optional] [default to ascending]<br />**Values**: ascending, descending 
{: class="table-striped"}


### Return type

[**DirectoryUserDevicesListing**](DirectoryUserDevicesListing)


# **postMobiledevices**


> [UserDevice](UserDevice) postMobiledevices(body)

Create User device

Wraps POST /api/v2/mobiledevices  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.MobileDevicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

MobileDevicesApi apiInstance = new MobileDevicesApi();
UserDevice body = new UserDevice(); // UserDevice | Device
try {
    UserDevice result = apiInstance.postMobiledevices(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MobileDevicesApi#postMobiledevices");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**UserDevice**](UserDevice)| Device | 
{: class="table-striped"}


### Return type

[**UserDevice**](UserDevice)


# **putMobiledevice**


> [UserDevice](UserDevice) putMobiledevice(deviceId, body)

Update device

Wraps PUT /api/v2/mobiledevices/{deviceId}  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.MobileDevicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

MobileDevicesApi apiInstance = new MobileDevicesApi();
String deviceId = "deviceId_example"; // String | Device ID
UserDevice body = new UserDevice(); // UserDevice | Device
try {
    UserDevice result = apiInstance.putMobiledevice(deviceId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MobileDevicesApi#putMobiledevice");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **deviceId** | **String**| Device ID | 
| **body** | [**UserDevice**](UserDevice)| Device | [optional] 
{: class="table-striped"}


### Return type

[**UserDevice**](UserDevice)


_com.mypurecloud.sdk.v2:platform-client-v2:221.0.0_
