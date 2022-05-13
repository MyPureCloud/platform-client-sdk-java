---
title: TelephonyApi
---
## TelephonyApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**getTelephonySiptraces**](TelephonyApi.html#getTelephonySiptraces) | Fetch SIP metadata |
| [**getTelephonySiptracesDownloadDownloadId**](TelephonyApi.html#getTelephonySiptracesDownloadDownloadId) | Get signed S3 URL for a pcap download |
| [**postTelephonySiptracesDownload**](TelephonyApi.html#postTelephonySiptracesDownload) | Request a download of a pcap file to S3 |
{: class="table-striped"}

<a name="getTelephonySiptraces"></a>

# **getTelephonySiptraces**



> [SipSearchResult](SipSearchResult.html) getTelephonySiptraces(dateStart, dateEnd, callId, toUser, fromUser, conversationId)

Fetch SIP metadata

Fetch SIP metadata that matches a given parameter. If exactMatch is passed as a parameter only sip records that have exactly that value will be returned. For example, some records contain conversationId but not all relevant records for that call may contain the conversationId so only a partial view of the call will be reflected

Wraps GET /api/v2/telephony/siptraces  

Requires ALL permissions: 

* telephony:pcap:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyApi apiInstance = new TelephonyApi();
Date dateStart = new Date(); // Date | Start date of the search. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
Date dateEnd = new Date(); // Date | End date of the search. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
String callId = "callId_example"; // String | unique identification of the placed call
String toUser = "toUser_example"; // String | User to who the call was placed
String fromUser = "fromUser_example"; // String | user who placed the call
String conversationId = "conversationId_example"; // String | Unique identification of the conversation
try {
    SipSearchResult result = apiInstance.getTelephonySiptraces(dateStart, dateEnd, callId, toUser, fromUser, conversationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyApi#getTelephonySiptraces");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **dateStart** | **Date**| Start date of the search. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z | 
| **dateEnd** | **Date**| End date of the search. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z | 
| **callId** | **String**| unique identification of the placed call | [optional] 
| **toUser** | **String**| User to who the call was placed | [optional] 
| **fromUser** | **String**| user who placed the call | [optional] 
| **conversationId** | **String**| Unique identification of the conversation | [optional] 
{: class="table-striped"}


### Return type

[**SipSearchResult**](SipSearchResult.html)

<a name="getTelephonySiptracesDownloadDownloadId"></a>

# **getTelephonySiptracesDownloadDownloadId**



> [SignedUrlResponse](SignedUrlResponse.html) getTelephonySiptracesDownloadDownloadId(downloadId)

Get signed S3 URL for a pcap download

Wraps GET /api/v2/telephony/siptraces/download/{downloadId}  

Requires ALL permissions: 

* telephony:pcap:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyApi apiInstance = new TelephonyApi();
String downloadId = "downloadId_example"; // String | unique id for the downloaded file in S3
try {
    SignedUrlResponse result = apiInstance.getTelephonySiptracesDownloadDownloadId(downloadId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyApi#getTelephonySiptracesDownloadDownloadId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **downloadId** | **String**| unique id for the downloaded file in S3 | 
{: class="table-striped"}


### Return type

[**SignedUrlResponse**](SignedUrlResponse.html)

<a name="postTelephonySiptracesDownload"></a>

# **postTelephonySiptracesDownload**



> [SipDownloadResponse](SipDownloadResponse.html) postTelephonySiptracesDownload(sIPSearchPublicRequest)

Request a download of a pcap file to S3

Wraps POST /api/v2/telephony/siptraces/download  

Requires ALL permissions: 

* telephony:pcap:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyApi apiInstance = new TelephonyApi();
SIPSearchPublicRequest sIPSearchPublicRequest = new SIPSearchPublicRequest(); // SIPSearchPublicRequest | 
try {
    SipDownloadResponse result = apiInstance.postTelephonySiptracesDownload(sIPSearchPublicRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyApi#postTelephonySiptracesDownload");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sIPSearchPublicRequest** | [**SIPSearchPublicRequest**](SIPSearchPublicRequest.html)|  | 
{: class="table-striped"}


### Return type

[**SipDownloadResponse**](SipDownloadResponse.html)

