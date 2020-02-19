---
title: MessagingApi
---
## MessagingApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**getMessagingSticker**](MessagingApi.html#getMessagingSticker) | Get a list of Messaging Stickers |
{: class="table-striped"}

<a name="getMessagingSticker"></a>

# **getMessagingSticker**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> [MessagingStickerEntityListing](MessagingStickerEntityListing.html) getMessagingSticker(messengerType, pageSize, pageNumber)

Get a list of Messaging Stickers



Wraps GET /api/v2/messaging/stickers/{messengerType}  

Requires ANY permissions: 

* conversation:message:create

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.MessagingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

MessagingApi apiInstance = new MessagingApi();
String messengerType = "messengerType_example"; // String | Messenger Type
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
try {
    MessagingStickerEntityListing result = apiInstance.getMessagingSticker(messengerType, pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingApi#getMessagingSticker");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **messengerType** | **String**| Messenger Type | 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
{: class="table-striped"}


### Return type

[**MessagingStickerEntityListing**](MessagingStickerEntityListing.html)

