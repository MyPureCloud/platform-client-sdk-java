# WebMessagingApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**deleteWebmessagingDeploymentPushdevice**](WebMessagingApi#deleteWebmessagingDeploymentPushdevice) | Delete device information |
| [**getWebmessagingMessages**](WebMessagingApi#getWebmessagingMessages) | Get the messages for a web messaging session. |
| [**patchWebmessagingDeploymentPushdevice**](WebMessagingApi#patchWebmessagingDeploymentPushdevice) | Edit device information |
| [**postWebmessagingDeploymentPushdevice**](WebMessagingApi#postWebmessagingDeploymentPushdevice) | Add a new device information |
{: class="table-striped"}


# **deleteWebmessagingDeploymentPushdevice**


> Void deleteWebmessagingDeploymentPushdevice(deploymentId, tokenId)

Delete device information

Wraps DELETE /api/v2/webmessaging/deployments/{deploymentId}/pushdevices/{tokenId}  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.api.WebMessagingApi;


WebMessagingApi apiInstance = new WebMessagingApi();
String deploymentId = "deploymentId_example"; // String | WebMessaging deployment id
String tokenId = "tokenId_example"; // String | Device token id or cookie id
try {
    apiInstance.deleteWebmessagingDeploymentPushdevice(deploymentId, tokenId);
} catch (ApiException e) {
    System.err.println("Exception when calling WebMessagingApi#deleteWebmessagingDeploymentPushdevice");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **deploymentId** | **String**| WebMessaging deployment id | 
| **tokenId** | **String**| Device token id or cookie id | 
{: class="table-striped"}


### Return type

null (empty response body)


# **getWebmessagingMessages**


> [WebMessagingMessageEntityList](WebMessagingMessageEntityList) getWebmessagingMessages(pageSize, pageNumber)

Get the messages for a web messaging session.

Wraps GET /api/v2/webmessaging/messages  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.api.WebMessagingApi;


WebMessagingApi apiInstance = new WebMessagingApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
try {
    WebMessagingMessageEntityList result = apiInstance.getWebmessagingMessages(pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebMessagingApi#getWebmessagingMessages");
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

[**WebMessagingMessageEntityList**](WebMessagingMessageEntityList)


# **patchWebmessagingDeploymentPushdevice**


> Void patchWebmessagingDeploymentPushdevice(deploymentId, tokenId, body)

Edit device information

Wraps PATCH /api/v2/webmessaging/deployments/{deploymentId}/pushdevices/{tokenId}  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.api.WebMessagingApi;


WebMessagingApi apiInstance = new WebMessagingApi();
String deploymentId = "deploymentId_example"; // String | WebMessaging deployment id
String tokenId = "tokenId_example"; // String | Device token id or cookie id
PushDeviceUpdateRequest body = new PushDeviceUpdateRequest(); // PushDeviceUpdateRequest | Request body
try {
    apiInstance.patchWebmessagingDeploymentPushdevice(deploymentId, tokenId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling WebMessagingApi#patchWebmessagingDeploymentPushdevice");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **deploymentId** | **String**| WebMessaging deployment id | 
| **tokenId** | **String**| Device token id or cookie id | 
| **body** | [**PushDeviceUpdateRequest**](PushDeviceUpdateRequest)| Request body | 
{: class="table-striped"}


### Return type

null (empty response body)


# **postWebmessagingDeploymentPushdevice**


> Void postWebmessagingDeploymentPushdevice(deploymentId, tokenId, body)

Add a new device information

Wraps POST /api/v2/webmessaging/deployments/{deploymentId}/pushdevices/{tokenId}  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.api.WebMessagingApi;


WebMessagingApi apiInstance = new WebMessagingApi();
String deploymentId = "deploymentId_example"; // String | WebMessaging deployment id
String tokenId = "tokenId_example"; // String | Device token id or cookie id
PushDeviceInsertRequest body = new PushDeviceInsertRequest(); // PushDeviceInsertRequest | Request body
try {
    apiInstance.postWebmessagingDeploymentPushdevice(deploymentId, tokenId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling WebMessagingApi#postWebmessagingDeploymentPushdevice");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **deploymentId** | **String**| WebMessaging deployment id | 
| **tokenId** | **String**| Device token id or cookie id | 
| **body** | [**PushDeviceInsertRequest**](PushDeviceInsertRequest)| Request body | 
{: class="table-striped"}


### Return type

null (empty response body)


_com.mypurecloud.sdk.v2:platform-client-v2:237.0.0_
