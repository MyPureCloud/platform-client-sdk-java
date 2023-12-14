---
title: AlertingApi
---
## AlertingApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**deleteAlertingAlert**](AlertingApi.html#deleteAlertingAlert) | Delete an alert |
| [**deleteAlertingInteractionstatsAlert**](AlertingApi.html#deleteAlertingInteractionstatsAlert) | Delete an interaction stats alert |
| [**deleteAlertingInteractionstatsRule**](AlertingApi.html#deleteAlertingInteractionstatsRule) | Delete an interaction stats rule |
| [**deleteAlertingRule**](AlertingApi.html#deleteAlertingRule) | Delete a rule. |
| [**getAlertingAlert**](AlertingApi.html#getAlertingAlert) | Get an alert |
| [**getAlertingAlertsActive**](AlertingApi.html#getAlertingAlertsActive) | Gets active alert count for a user |
| [**getAlertingInteractionstatsAlert**](AlertingApi.html#getAlertingInteractionstatsAlert) | Get an interaction stats alert |
| [**getAlertingInteractionstatsAlerts**](AlertingApi.html#getAlertingInteractionstatsAlerts) | Get interaction stats alert list |
| [**getAlertingInteractionstatsAlertsUnread**](AlertingApi.html#getAlertingInteractionstatsAlertsUnread) | Gets user unread count of interaction stats alerts |
| [**getAlertingInteractionstatsRule**](AlertingApi.html#getAlertingInteractionstatsRule) | Get an interaction stats rule |
| [**getAlertingInteractionstatsRules**](AlertingApi.html#getAlertingInteractionstatsRules) | Get an interaction stats rule list |
| [**getAlertingRule**](AlertingApi.html#getAlertingRule) | Get a rule. |
| [**patchAlertingAlert**](AlertingApi.html#patchAlertingAlert) | Allows an entity to mute/snooze an alert or update the unread status of the alert. |
| [**patchAlertingAlertsBulk**](AlertingApi.html#patchAlertingAlertsBulk) | Bulk alert updates |
| [**patchAlertingRulesBulk**](AlertingApi.html#patchAlertingRulesBulk) | Bulk update of notification lists |
| [**postAlertingAlertsQuery**](AlertingApi.html#postAlertingAlertsQuery) | Gets a paged list of alerts. The max page size is 50 |
| [**postAlertingInteractionstatsRules**](AlertingApi.html#postAlertingInteractionstatsRules) | Create an interaction stats rule |
| [**postAlertingRules**](AlertingApi.html#postAlertingRules) | Create a Rule. |
| [**postAlertingRulesBulkRemove**](AlertingApi.html#postAlertingRulesBulkRemove) | Bulk remove rules |
| [**postAlertingRulesQuery**](AlertingApi.html#postAlertingRulesQuery) | Get a paged list of rules.  The max size of the page is 50 items. |
| [**putAlertingAlert**](AlertingApi.html#putAlertingAlert) | Update an alert read status |
| [**putAlertingInteractionstatsAlert**](AlertingApi.html#putAlertingInteractionstatsAlert) | Update an interaction stats alert read status |
| [**putAlertingInteractionstatsRule**](AlertingApi.html#putAlertingInteractionstatsRule) | Update an interaction stats rule |
| [**putAlertingRule**](AlertingApi.html#putAlertingRule) | Update a rule |
{: class="table-striped"}

<a name="deleteAlertingAlert"></a>

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

<a name="deleteAlertingInteractionstatsAlert"></a>

# **deleteAlertingInteractionstatsAlert**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> Void deleteAlertingInteractionstatsAlert(alertId)

Delete an interaction stats alert

Apps should migrate to use DELETE /api/v2/alerting/alerts/{alertId}.

Wraps DELETE /api/v2/alerting/interactionstats/alerts/{alertId}  

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
    apiInstance.deleteAlertingInteractionstatsAlert(alertId);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertingApi#deleteAlertingInteractionstatsAlert");
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

<a name="deleteAlertingInteractionstatsRule"></a>

# **deleteAlertingInteractionstatsRule**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> Void deleteAlertingInteractionstatsRule(ruleId)

Delete an interaction stats rule

Apps should migrate to use DELETE /api/v2/alerting/rules/{ruleId}.

Wraps DELETE /api/v2/alerting/interactionstats/rules/{ruleId}  

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
String ruleId = "ruleId_example"; // String | Rule ID
try {
    apiInstance.deleteAlertingInteractionstatsRule(ruleId);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertingApi#deleteAlertingInteractionstatsRule");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ruleId** | **String**| Rule ID | 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="deleteAlertingRule"></a>

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

<a name="getAlertingAlert"></a>

# **getAlertingAlert**



> [CommonAlert](CommonAlert.html) getAlertingAlert(alertId)

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

[**CommonAlert**](CommonAlert.html)

<a name="getAlertingAlertsActive"></a>

# **getAlertingAlertsActive**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> [ActiveAlertCount](ActiveAlertCount.html) getAlertingAlertsActive()

Gets active alert count for a user

Apps should migrate to use POST /api/v2/alerting/alerts/query with the queryType set to 'Count' and alertStatus to 'Active' in the request body.

Wraps GET /api/v2/alerting/alerts/active  

Requires NO permissions: 


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
    ActiveAlertCount result = apiInstance.getAlertingAlertsActive();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertingApi#getAlertingAlertsActive");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**ActiveAlertCount**](ActiveAlertCount.html)

<a name="getAlertingInteractionstatsAlert"></a>

# **getAlertingInteractionstatsAlert**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> [InteractionStatsAlert](InteractionStatsAlert.html) getAlertingInteractionstatsAlert(alertId, expand)

Get an interaction stats alert

Apps should migrate to use GET /api/v2/alerting/alerts/{alertId}.

Wraps GET /api/v2/alerting/interactionstats/alerts/{alertId}  

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
List<String> expand = Arrays.asList(null); // List<String> | Which fields, if any, to expand
try {
    InteractionStatsAlert result = apiInstance.getAlertingInteractionstatsAlert(alertId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertingApi#getAlertingInteractionstatsAlert");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **alertId** | **String**| Alert ID | 
| **expand** | [**List&lt;String&gt;**](String.html)| Which fields, if any, to expand | [optional]<br />**Values**: notificationUsers 
{: class="table-striped"}


### Return type

[**InteractionStatsAlert**](InteractionStatsAlert.html)

<a name="getAlertingInteractionstatsAlerts"></a>

# **getAlertingInteractionstatsAlerts**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> [InteractionStatsAlertContainer](InteractionStatsAlertContainer.html) getAlertingInteractionstatsAlerts(expand)

Get interaction stats alert list

Apps should migrate to use POST /api/v2/alerting/alerts/query.

Wraps GET /api/v2/alerting/interactionstats/alerts  

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
List<String> expand = Arrays.asList(null); // List<String> | Which fields, if any, to expand
try {
    InteractionStatsAlertContainer result = apiInstance.getAlertingInteractionstatsAlerts(expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertingApi#getAlertingInteractionstatsAlerts");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **expand** | [**List&lt;String&gt;**](String.html)| Which fields, if any, to expand | [optional]<br />**Values**: notificationUsers 
{: class="table-striped"}


### Return type

[**InteractionStatsAlertContainer**](InteractionStatsAlertContainer.html)

<a name="getAlertingInteractionstatsAlertsUnread"></a>

# **getAlertingInteractionstatsAlertsUnread**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> [UnreadMetric](UnreadMetric.html) getAlertingInteractionstatsAlertsUnread()

Gets user unread count of interaction stats alerts

Apps should migrate to use POST /api/v2/alerting/alerts/query with the queryType set to 'Count' and viewStatus to 'Unread' in the request body.

Wraps GET /api/v2/alerting/interactionstats/alerts/unread  

Requires NO permissions: 


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
    UnreadMetric result = apiInstance.getAlertingInteractionstatsAlertsUnread();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertingApi#getAlertingInteractionstatsAlertsUnread");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**UnreadMetric**](UnreadMetric.html)

<a name="getAlertingInteractionstatsRule"></a>

# **getAlertingInteractionstatsRule**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> [InteractionStatsRule](InteractionStatsRule.html) getAlertingInteractionstatsRule(ruleId, expand)

Get an interaction stats rule

Apps should migrate to use GET /api/v2/alerting/rules/{ruleId}.

Wraps GET /api/v2/alerting/interactionstats/rules/{ruleId}  

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
String ruleId = "ruleId_example"; // String | Rule ID
List<String> expand = Arrays.asList(null); // List<String> | Which fields, if any, to expand
try {
    InteractionStatsRule result = apiInstance.getAlertingInteractionstatsRule(ruleId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertingApi#getAlertingInteractionstatsRule");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ruleId** | **String**| Rule ID | 
| **expand** | [**List&lt;String&gt;**](String.html)| Which fields, if any, to expand | [optional]<br />**Values**: notificationUsers 
{: class="table-striped"}


### Return type

[**InteractionStatsRule**](InteractionStatsRule.html)

<a name="getAlertingInteractionstatsRules"></a>

# **getAlertingInteractionstatsRules**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> [InteractionStatsRuleContainer](InteractionStatsRuleContainer.html) getAlertingInteractionstatsRules(expand)

Get an interaction stats rule list

Apps should migrate to use POST /api/v2/alerting/rules/query.

Wraps GET /api/v2/alerting/interactionstats/rules  

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
List<String> expand = Arrays.asList(null); // List<String> | Which fields, if any, to expand
try {
    InteractionStatsRuleContainer result = apiInstance.getAlertingInteractionstatsRules(expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertingApi#getAlertingInteractionstatsRules");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **expand** | [**List&lt;String&gt;**](String.html)| Which fields, if any, to expand | [optional]<br />**Values**: notificationUsers 
{: class="table-striped"}


### Return type

[**InteractionStatsRuleContainer**](InteractionStatsRuleContainer.html)

<a name="getAlertingRule"></a>

# **getAlertingRule**



> [CommonRule](CommonRule.html) getAlertingRule(ruleId)

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

[**CommonRule**](CommonRule.html)

<a name="patchAlertingAlert"></a>

# **patchAlertingAlert**



> [CommonAlert](CommonAlert.html) patchAlertingAlert(alertId, body)

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
| **body** | [**AlertRequest**](AlertRequest.html)|  | [optional] 
{: class="table-striped"}


### Return type

[**CommonAlert**](CommonAlert.html)

<a name="patchAlertingAlertsBulk"></a>

# **patchAlertingAlertsBulk**



> [BulkResponse](BulkResponse.html) patchAlertingAlertsBulk(body)

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
| **body** | [**CommonAlertBulkUpdateRequest**](CommonAlertBulkUpdateRequest.html)|  | 
{: class="table-striped"}


### Return type

[**BulkResponse**](BulkResponse.html)

<a name="patchAlertingRulesBulk"></a>

# **patchAlertingRulesBulk**



> [BulkResponse](BulkResponse.html) patchAlertingRulesBulk(body)

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
| **body** | [**CommonRuleBulkUpdateNotificationsRequest**](CommonRuleBulkUpdateNotificationsRequest.html)|  | 
{: class="table-striped"}


### Return type

[**BulkResponse**](BulkResponse.html)

<a name="postAlertingAlertsQuery"></a>

# **postAlertingAlertsQuery**



> [AlertListing](AlertListing.html) postAlertingAlertsQuery(body)

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
| **body** | [**GetAlertQuery**](GetAlertQuery.html)|  | [optional] 
{: class="table-striped"}


### Return type

[**AlertListing**](AlertListing.html)

<a name="postAlertingInteractionstatsRules"></a>

# **postAlertingInteractionstatsRules**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> [InteractionStatsRule](InteractionStatsRule.html) postAlertingInteractionstatsRules(body, expand)

Create an interaction stats rule

Apps should migrate to use POST /api/v2/alerting/rules.

Wraps POST /api/v2/alerting/interactionstats/rules  

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
InteractionStatsRule body = new InteractionStatsRule(); // InteractionStatsRule | AlertingRule
List<String> expand = Arrays.asList(null); // List<String> | Which fields, if any, to expand
try {
    InteractionStatsRule result = apiInstance.postAlertingInteractionstatsRules(body, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertingApi#postAlertingInteractionstatsRules");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**InteractionStatsRule**](InteractionStatsRule.html)| AlertingRule | 
| **expand** | [**List&lt;String&gt;**](String.html)| Which fields, if any, to expand | [optional]<br />**Values**: notificationUsers 
{: class="table-striped"}


### Return type

[**InteractionStatsRule**](InteractionStatsRule.html)

<a name="postAlertingRules"></a>

# **postAlertingRules**



> [CommonRule](CommonRule.html) postAlertingRules(body)

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
| **body** | [**CommonRule**](CommonRule.html)| rule to be created | 
{: class="table-striped"}


### Return type

[**CommonRule**](CommonRule.html)

<a name="postAlertingRulesBulkRemove"></a>

# **postAlertingRulesBulkRemove**



> [BulkResponse](BulkResponse.html) postAlertingRulesBulkRemove(body)

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
| **body** | [**CommonRuleBulkDeleteRequest**](CommonRuleBulkDeleteRequest.html)|  | 
{: class="table-striped"}


### Return type

[**BulkResponse**](BulkResponse.html)

<a name="postAlertingRulesQuery"></a>

# **postAlertingRulesQuery**



> [CommonRuleContainer](CommonRuleContainer.html) postAlertingRulesQuery(body)

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
| **body** | [**GetRulesQuery**](GetRulesQuery.html)|  | [optional] 
{: class="table-striped"}


### Return type

[**CommonRuleContainer**](CommonRuleContainer.html)

<a name="putAlertingAlert"></a>

# **putAlertingAlert**



> [UnreadStatus](UnreadStatus.html) putAlertingAlert(alertId, body)

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
    UnreadStatus result = apiInstance.putAlertingAlert(alertId, body);
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
| **body** | [**AlertingUnreadStatus**](AlertingUnreadStatus.html)|  | [optional] 
{: class="table-striped"}


### Return type

[**UnreadStatus**](UnreadStatus.html)

<a name="putAlertingInteractionstatsAlert"></a>

# **putAlertingInteractionstatsAlert**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> [UnreadStatus](UnreadStatus.html) putAlertingInteractionstatsAlert(alertId, body, expand)

Update an interaction stats alert read status

Apps should migrate to use PUT /api/v2/alerting/alerts/{alertId}.

Wraps PUT /api/v2/alerting/interactionstats/alerts/{alertId}  

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
UnreadStatus body = new UnreadStatus(); // UnreadStatus | InteractionStatsAlert
List<String> expand = Arrays.asList(null); // List<String> | Which fields, if any, to expand
try {
    UnreadStatus result = apiInstance.putAlertingInteractionstatsAlert(alertId, body, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertingApi#putAlertingInteractionstatsAlert");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **alertId** | **String**| Alert ID | 
| **body** | [**UnreadStatus**](UnreadStatus.html)| InteractionStatsAlert | 
| **expand** | [**List&lt;String&gt;**](String.html)| Which fields, if any, to expand | [optional]<br />**Values**: notificationUsers 
{: class="table-striped"}


### Return type

[**UnreadStatus**](UnreadStatus.html)

<a name="putAlertingInteractionstatsRule"></a>

# **putAlertingInteractionstatsRule**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> [InteractionStatsRule](InteractionStatsRule.html) putAlertingInteractionstatsRule(ruleId, body, expand)

Update an interaction stats rule

Apps should migrate to use PUT /api/v2/alerting/rules/{ruleId}.

Wraps PUT /api/v2/alerting/interactionstats/rules/{ruleId}  

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
String ruleId = "ruleId_example"; // String | Rule ID
InteractionStatsRule body = new InteractionStatsRule(); // InteractionStatsRule | AlertingRule
List<String> expand = Arrays.asList(null); // List<String> | Which fields, if any, to expand
try {
    InteractionStatsRule result = apiInstance.putAlertingInteractionstatsRule(ruleId, body, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertingApi#putAlertingInteractionstatsRule");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ruleId** | **String**| Rule ID | 
| **body** | [**InteractionStatsRule**](InteractionStatsRule.html)| AlertingRule | 
| **expand** | [**List&lt;String&gt;**](String.html)| Which fields, if any, to expand | [optional]<br />**Values**: notificationUsers 
{: class="table-striped"}


### Return type

[**InteractionStatsRule**](InteractionStatsRule.html)

<a name="putAlertingRule"></a>

# **putAlertingRule**



> [CommonRule](CommonRule.html) putAlertingRule(ruleId, body)

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
| **body** | [**ModifiableRuleProperties**](ModifiableRuleProperties.html)| rule to be updated | 
{: class="table-striped"}


### Return type

[**CommonRule**](CommonRule.html)

