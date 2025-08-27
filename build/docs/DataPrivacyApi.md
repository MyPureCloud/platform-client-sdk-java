# DataPrivacyApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**deleteDataprivacyMaskingrule**](DataPrivacyApi#deleteDataprivacyMaskingrule) | Delete a masking rule. |
| [**getDataprivacyMaskingrule**](DataPrivacyApi#getDataprivacyMaskingrule) | Fetch details about a masking rule. |
| [**getDataprivacyMaskingrules**](DataPrivacyApi#getDataprivacyMaskingrules) | Retrieve the list of masking rules. |
| [**patchDataprivacyMaskingrule**](DataPrivacyApi#patchDataprivacyMaskingrule) | Update information about a masking rule. |
| [**postDataprivacyMaskingrules**](DataPrivacyApi#postDataprivacyMaskingrules) | Create a new masking rule resource. |
| [**postDataprivacyMaskingrulesValidate**](DataPrivacyApi#postDataprivacyMaskingrulesValidate) | Validate masking before creating. |
{: class="table-striped"}


# **deleteDataprivacyMaskingrule**


> Void deleteDataprivacyMaskingrule(ruleId)

Delete a masking rule.

Wraps DELETE /api/v2/dataprivacy/maskingrules/{ruleId}  

Requires ALL permissions: 

* dataprivacy:maskingrule:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.DataPrivacyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

DataPrivacyApi apiInstance = new DataPrivacyApi();
String ruleId = "ruleId_example"; // String | ruleId
try {
    apiInstance.deleteDataprivacyMaskingrule(ruleId);
} catch (ApiException e) {
    System.err.println("Exception when calling DataPrivacyApi#deleteDataprivacyMaskingrule");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ruleId** | **String**| ruleId | 
{: class="table-striped"}


### Return type

null (empty response body)


# **getDataprivacyMaskingrule**


> [MaskingRule](MaskingRule) getDataprivacyMaskingrule(ruleId)

Fetch details about a masking rule.

Wraps GET /api/v2/dataprivacy/maskingrules/{ruleId}  

Requires ALL permissions: 

* dataprivacy:maskingrule:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.DataPrivacyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

DataPrivacyApi apiInstance = new DataPrivacyApi();
String ruleId = "ruleId_example"; // String | ruleId
try {
    MaskingRule result = apiInstance.getDataprivacyMaskingrule(ruleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataPrivacyApi#getDataprivacyMaskingrule");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ruleId** | **String**| ruleId | 
{: class="table-striped"}


### Return type

[**MaskingRule**](MaskingRule)


# **getDataprivacyMaskingrules**


> [MaskingRuleListing](MaskingRuleListing) getDataprivacyMaskingrules()

Retrieve the list of masking rules.

Wraps GET /api/v2/dataprivacy/maskingrules  

Requires ALL permissions: 

* dataprivacy:maskingrule:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.DataPrivacyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

DataPrivacyApi apiInstance = new DataPrivacyApi();
try {
    MaskingRuleListing result = apiInstance.getDataprivacyMaskingrules();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataPrivacyApi#getDataprivacyMaskingrules");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**MaskingRuleListing**](MaskingRuleListing)


# **patchDataprivacyMaskingrule**


> [MaskingRule](MaskingRule) patchDataprivacyMaskingrule(ruleId, body)

Update information about a masking rule.

Wraps PATCH /api/v2/dataprivacy/maskingrules/{ruleId}  

Requires ALL permissions: 

* dataprivacy:maskingrule:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.DataPrivacyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

DataPrivacyApi apiInstance = new DataPrivacyApi();
String ruleId = "ruleId_example"; // String | ruleId
MaskingRule body = new MaskingRule(); // MaskingRule | 
try {
    MaskingRule result = apiInstance.patchDataprivacyMaskingrule(ruleId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataPrivacyApi#patchDataprivacyMaskingrule");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ruleId** | **String**| ruleId | 
| **body** | [**MaskingRule**](MaskingRule)|  | [optional] 
{: class="table-striped"}


### Return type

[**MaskingRule**](MaskingRule)


# **postDataprivacyMaskingrules**


> [MaskingRule](MaskingRule) postDataprivacyMaskingrules(body)

Create a new masking rule resource.

Wraps POST /api/v2/dataprivacy/maskingrules  

Requires ALL permissions: 

* dataprivacy:maskingrule:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.DataPrivacyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

DataPrivacyApi apiInstance = new DataPrivacyApi();
MaskingRule body = new MaskingRule(); // MaskingRule | Details for creating masking rule resource
try {
    MaskingRule result = apiInstance.postDataprivacyMaskingrules(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataPrivacyApi#postDataprivacyMaskingrules");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**MaskingRule**](MaskingRule)| Details for creating masking rule resource | 
{: class="table-striped"}


### Return type

[**MaskingRule**](MaskingRule)


# **postDataprivacyMaskingrulesValidate**


> [MaskingRuleValidateResponse](MaskingRuleValidateResponse) postDataprivacyMaskingrulesValidate(body)

Validate masking before creating.

Wraps POST /api/v2/dataprivacy/maskingrules/validate  

Requires ALL permissions: 

* dataprivacy:maskingrule:execute

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.DataPrivacyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

DataPrivacyApi apiInstance = new DataPrivacyApi();
MaskingRuleValidateRequest body = new MaskingRuleValidateRequest(); // MaskingRuleValidateRequest | Text to be masked
try {
    MaskingRuleValidateResponse result = apiInstance.postDataprivacyMaskingrulesValidate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataPrivacyApi#postDataprivacyMaskingrulesValidate");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**MaskingRuleValidateRequest**](MaskingRuleValidateRequest)| Text to be masked | 
{: class="table-striped"}


### Return type

[**MaskingRuleValidateResponse**](MaskingRuleValidateResponse)


_com.mypurecloud.sdk.v2:platform-client-v2:230.0.0_
