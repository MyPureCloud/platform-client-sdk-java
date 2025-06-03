# AlertingApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**deleteAlertingAlert**](AlertingApi#deleteAlertingAlert) | Delete an alert |
| [**deleteAlertingAlertsAll**](AlertingApi#deleteAlertingAlertsAll) | Delete all alerts for the user |
| [**deleteAlertingRule**](AlertingApi#deleteAlertingRule) | Delete a rule. |
| [**getAlertingAlert**](AlertingApi#getAlertingAlert) | Get an alert |
| [**getAlertingRule**](AlertingApi#getAlertingRule) | Get a rule. |
| [**patchAlertingAlert**](AlertingApi#patchAlertingAlert) | Allows an entity to mute/snooze an alert or update the unread status of the alert. |
| [**patchAlertingAlertsAll**](AlertingApi#patchAlertingAlertsAll) | Updates all alerts |
| [**patchAlertingAlertsBulk**](AlertingApi#patchAlertingAlertsBulk) | Bulk alert updates |
| [**patchAlertingRulesBulk**](AlertingApi#patchAlertingRulesBulk) | Bulk update of notification lists |
| [**postAlertingAlertsQuery**](AlertingApi#postAlertingAlertsQuery) | Gets a paged list of alerts. The max page size is 50 |
| [**postAlertingRules**](AlertingApi#postAlertingRules) | Create a Rule. |
| [**postAlertingRulesBulkRemove**](AlertingApi#postAlertingRulesBulkRemove) | Bulk remove rules |
| [**postAlertingRulesQuery**](AlertingApi#postAlertingRulesQuery) | Get a paged list of rules.  The max size of the page is 50 items. |
| [**putAlertingAlert**](AlertingApi#putAlertingAlert) | Update an alert read status |
| [**putAlertingRule**](AlertingApi#putAlertingRule) | Update a rule |
{: class="table-striped"}


# **deleteAlertingAlert**


> Void deleteAlertingAlert(alertId)

Delete an alert

Wraps DELETE /api/v2/alerting/alerts/{alertId}  

Requires ALL permissions: 

* alerting:alert:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AlertingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AlertingApi apiInstance = new AlertingApi();
String alertId = "alertId_example"; // String | Alert ID
try {
    apiInstance.deleteAlertingAlert(alertId);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertingApi#deleteAlertingAlert");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **alertId** | **String**| Alert ID | 
{: class="table-striped"}


### Return type

null (empty response body)


# **deleteAlertingAlertsAll**


> Empty deleteAlertingAlertsAll()

Delete all alerts for the user

Wraps DELETE /api/v2/alerting/alerts/all  

Requires ALL permissions: 

* alerting:alert:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AlertingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AlertingApi apiInstance = new AlertingApi();
try {
    Empty result = apiInstance.deleteAlertingAlertsAll();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertingApi#deleteAlertingAlertsAll");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

**Empty**


# **deleteAlertingRule**


> Void deleteAlertingRule(ruleId)

Delete a rule.

Wraps DELETE /api/v2/alerting/rules/{ruleId}  

Requires ALL permissions: 

* alerting:rule:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AlertingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AlertingApi apiInstance = new AlertingApi();
String ruleId = "ruleId_example"; // String | Rule Id
try {
    apiInstance.deleteAlertingRule(ruleId);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertingApi#deleteAlertingRule");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ruleId** | **String**| Rule Id | 
{: class="table-striped"}


### Return type

null (empty response body)


# **getAlertingAlert**


> [CommonAlert](CommonAlert) getAlertingAlert(alertId)

Get an alert

Wraps GET /api/v2/alerting/alerts/{alertId}  

Requires ALL permissions: 

* alerting:alert:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AlertingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AlertingApi apiInstance = new AlertingApi();
String alertId = "alertId_example"; // String | Alert ID
try {
    CommonAlert result = apiInstance.getAlertingAlert(alertId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertingApi#getAlertingAlert");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **alertId** | **String**| Alert ID | 
{: class="table-striped"}


### Return type

[**CommonAlert**](CommonAlert)


# **getAlertingRule**


> [CommonRule](CommonRule) getAlertingRule(ruleId)

Get a rule.

Wraps GET /api/v2/alerting/rules/{ruleId}  

Requires ALL permissions: 

* alerting:rule:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AlertingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AlertingApi apiInstance = new AlertingApi();
String ruleId = "ruleId_example"; // String | Rule Id
try {
    CommonRule result = apiInstance.getAlertingRule(ruleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertingApi#getAlertingRule");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ruleId** | **String**| Rule Id | 
{: class="table-striped"}


### Return type

[**CommonRule**](CommonRule)


# **patchAlertingAlert**


> [CommonAlert](CommonAlert) patchAlertingAlert(alertId, body)

Allows an entity to mute/snooze an alert or update the unread status of the alert.

Snoozing an alert temporarily stop it from resending notifications to individualsas well as other services within Genesys Cloud for a given period.  Muting an alert will only block the notifications to individuals.

Wraps PATCH /api/v2/alerting/alerts/{alertId}  

Requires ALL permissions: 

* alerting:alert:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AlertingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AlertingApi apiInstance = new AlertingApi();
String alertId = "alertId_example"; // String | Alert ID
AlertRequest body = new AlertRequest(); // AlertRequest | 
try {
    CommonAlert result = apiInstance.patchAlertingAlert(alertId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertingApi#patchAlertingAlert");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **alertId** | **String**| Alert ID | 
| **body** | [**AlertRequest**](AlertRequest)|  | [optional] 
{: class="table-striped"}


### Return type

[**CommonAlert**](CommonAlert)


# **patchAlertingAlertsAll**


> Empty patchAlertingAlertsAll(body)

Updates all alerts

Wraps PATCH /api/v2/alerting/alerts/all  

Requires ALL permissions: 

* alerting:alert:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AlertingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AlertingApi apiInstance = new AlertingApi();
CommonAllAlertUpdateRequest body = new CommonAllAlertUpdateRequest(); // CommonAllAlertUpdateRequest | 
try {
    Empty result = apiInstance.patchAlertingAlertsAll(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertingApi#patchAlertingAlertsAll");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**CommonAllAlertUpdateRequest**](CommonAllAlertUpdateRequest)|  | [optional] 
{: class="table-striped"}


### Return type

**Empty**


# **patchAlertingAlertsBulk**


> [BulkResponse](BulkResponse) patchAlertingAlertsBulk(body)

Bulk alert updates

Wraps PATCH /api/v2/alerting/alerts/bulk  

Requires ALL permissions: 

* alerting:alert:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AlertingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AlertingApi apiInstance = new AlertingApi();
CommonAlertBulkUpdateRequest body = new CommonAlertBulkUpdateRequest(); // CommonAlertBulkUpdateRequest | 
try {
    BulkResponse result = apiInstance.patchAlertingAlertsBulk(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertingApi#patchAlertingAlertsBulk");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**CommonAlertBulkUpdateRequest**](CommonAlertBulkUpdateRequest)|  | 
{: class="table-striped"}


### Return type

[**BulkResponse**](BulkResponse)


# **patchAlertingRulesBulk**


> [BulkResponse](BulkResponse) patchAlertingRulesBulk(body)

Bulk update of notification lists

Wraps PATCH /api/v2/alerting/rules/bulk  

Requires ALL permissions: 

* alerting:rule:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AlertingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AlertingApi apiInstance = new AlertingApi();
CommonRuleBulkUpdateNotificationsRequest body = new CommonRuleBulkUpdateNotificationsRequest(); // CommonRuleBulkUpdateNotificationsRequest | 
try {
    BulkResponse result = apiInstance.patchAlertingRulesBulk(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertingApi#patchAlertingRulesBulk");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**CommonRuleBulkUpdateNotificationsRequest**](CommonRuleBulkUpdateNotificationsRequest)|  | 
{: class="table-striped"}


### Return type

[**BulkResponse**](BulkResponse)


# **postAlertingAlertsQuery**


> [AlertListing](AlertListing) postAlertingAlertsQuery(body)

Gets a paged list of alerts. The max page size is 50

Wraps POST /api/v2/alerting/alerts/query  

Requires ALL permissions: 

* alerting:alert:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AlertingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AlertingApi apiInstance = new AlertingApi();
GetAlertQuery body = new GetAlertQuery(); // GetAlertQuery | 
try {
    AlertListing result = apiInstance.postAlertingAlertsQuery(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertingApi#postAlertingAlertsQuery");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**GetAlertQuery**](GetAlertQuery)|  | [optional] 
{: class="table-striped"}


### Return type

[**AlertListing**](AlertListing)


# **postAlertingRules**


> [CommonRule](CommonRule) postAlertingRules(body)

Create a Rule.

Wraps POST /api/v2/alerting/rules  

Requires ALL permissions: 

* alerting:rule:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AlertingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AlertingApi apiInstance = new AlertingApi();
CommonRule body = new CommonRule(); // CommonRule | rule to be created
try {
    CommonRule result = apiInstance.postAlertingRules(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertingApi#postAlertingRules");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**CommonRule**](CommonRule)| rule to be created | 
{: class="table-striped"}


### Return type

[**CommonRule**](CommonRule)


# **postAlertingRulesBulkRemove**


> [BulkResponse](BulkResponse) postAlertingRulesBulkRemove(body)

Bulk remove rules

Wraps POST /api/v2/alerting/rules/bulk/remove  

Requires ALL permissions: 

* alerting:rule:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AlertingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AlertingApi apiInstance = new AlertingApi();
CommonRuleBulkDeleteRequest body = new CommonRuleBulkDeleteRequest(); // CommonRuleBulkDeleteRequest | 
try {
    BulkResponse result = apiInstance.postAlertingRulesBulkRemove(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertingApi#postAlertingRulesBulkRemove");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**CommonRuleBulkDeleteRequest**](CommonRuleBulkDeleteRequest)|  | 
{: class="table-striped"}


### Return type

[**BulkResponse**](BulkResponse)


# **postAlertingRulesQuery**


> [CommonRuleContainer](CommonRuleContainer) postAlertingRulesQuery(body)

Get a paged list of rules.  The max size of the page is 50 items.

Wraps POST /api/v2/alerting/rules/query  

Requires ALL permissions: 

* alerting:rule:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AlertingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AlertingApi apiInstance = new AlertingApi();
GetRulesQuery body = new GetRulesQuery(); // GetRulesQuery | 
try {
    CommonRuleContainer result = apiInstance.postAlertingRulesQuery(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertingApi#postAlertingRulesQuery");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**GetRulesQuery**](GetRulesQuery)|  | [optional] 
{: class="table-striped"}


### Return type

[**CommonRuleContainer**](CommonRuleContainer)


# **putAlertingAlert**


> [AlertingUnreadStatus](AlertingUnreadStatus) putAlertingAlert(alertId, body)

Update an alert read status

Wraps PUT /api/v2/alerting/alerts/{alertId}  

Requires ALL permissions: 

* alerting:alert:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AlertingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AlertingApi apiInstance = new AlertingApi();
String alertId = "alertId_example"; // String | Alert ID
AlertingUnreadStatus body = new AlertingUnreadStatus(); // AlertingUnreadStatus | 
try {
    AlertingUnreadStatus result = apiInstance.putAlertingAlert(alertId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertingApi#putAlertingAlert");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **alertId** | **String**| Alert ID | 
| **body** | [**AlertingUnreadStatus**](AlertingUnreadStatus)|  | [optional] 
{: class="table-striped"}


### Return type

[**AlertingUnreadStatus**](AlertingUnreadStatus)


# **putAlertingRule**


> [CommonRule](CommonRule) putAlertingRule(ruleId, body)

Update a rule

Wraps PUT /api/v2/alerting/rules/{ruleId}  

Requires ALL permissions: 

* alerting:rule:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AlertingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AlertingApi apiInstance = new AlertingApi();
String ruleId = "ruleId_example"; // String | Rule Id
ModifiableRuleProperties body = new ModifiableRuleProperties(); // ModifiableRuleProperties | rule to be updated
try {
    CommonRule result = apiInstance.putAlertingRule(ruleId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertingApi#putAlertingRule");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ruleId** | **String**| Rule Id | 
| **body** | [**ModifiableRuleProperties**](ModifiableRuleProperties)| rule to be updated | 
{: class="table-striped"}


### Return type

[**CommonRule**](CommonRule)


_com.mypurecloud.sdk.v2:platform-client-v2:226.0.0_
