# CarrierServicesApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**getCarrierservicesIntegrationsEmergencylocationsMe**](CarrierServicesApi#getCarrierservicesIntegrationsEmergencylocationsMe) | Get location for the logged in user |
| [**postCarrierservicesIntegrationsEmergencylocationsMe**](CarrierServicesApi#postCarrierservicesIntegrationsEmergencylocationsMe) | Set current location for the logged in user |
{: class="table-striped"}


# **getCarrierservicesIntegrationsEmergencylocationsMe**


> [EmergencyLocation](EmergencyLocation) getCarrierservicesIntegrationsEmergencylocationsMe(phoneNumber)

Get location for the logged in user

Wraps GET /api/v2/carrierservices/integrations/emergencylocations/me  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.CarrierServicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

CarrierServicesApi apiInstance = new CarrierServicesApi();
String phoneNumber = "phoneNumber_example"; // String | Phone number in E164 format
try {
    EmergencyLocation result = apiInstance.getCarrierservicesIntegrationsEmergencylocationsMe(phoneNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CarrierServicesApi#getCarrierservicesIntegrationsEmergencylocationsMe");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **phoneNumber** | **String**| Phone number in E164 format | 
{: class="table-striped"}


### Return type

[**EmergencyLocation**](EmergencyLocation)


# **postCarrierservicesIntegrationsEmergencylocationsMe**


> [EmergencyLocation](EmergencyLocation) postCarrierservicesIntegrationsEmergencylocationsMe(body)

Set current location for the logged in user

Wraps POST /api/v2/carrierservices/integrations/emergencylocations/me  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.CarrierServicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

CarrierServicesApi apiInstance = new CarrierServicesApi();
EmergencyLocation body = new EmergencyLocation(); // EmergencyLocation | 
try {
    EmergencyLocation result = apiInstance.postCarrierservicesIntegrationsEmergencylocationsMe(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CarrierServicesApi#postCarrierservicesIntegrationsEmergencylocationsMe");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**EmergencyLocation**](EmergencyLocation)|  | [optional] 
{: class="table-striped"}


### Return type

[**EmergencyLocation**](EmergencyLocation)


_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
