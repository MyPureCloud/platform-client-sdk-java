---
title: WebMessagingApi
---
## WebMessagingApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**getWebmessagingMessages**](WebMessagingApi.html#getWebmessagingMessages) | Get the messages for a web messaging session. |
{: class="table-striped"}

<a name="getWebmessagingMessages"></a>

# **getWebmessagingMessages**



> [WebMessagingMessageEntityList](WebMessagingMessageEntityList.html) getWebmessagingMessages(pageSize, pageNumber)

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

[**WebMessagingMessageEntityList**](WebMessagingMessageEntityList.html)

