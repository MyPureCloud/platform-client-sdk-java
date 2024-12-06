# AlertingApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**deleteAlertingAlert**](AlertingApi#deleteAlertingAlert) | Delete an alert |
| [**deleteAlertingInteractionstatsAlert**](AlertingApi#deleteAlertingInteractionstatsAlert) | Delete an interaction stats alert |
| [**deleteAlertingInteractionstatsRule**](AlertingApi#deleteAlertingInteractionstatsRule) | Delete an interaction stats rule |
| [**deleteAlertingRule**](AlertingApi#deleteAlertingRule) | Delete a rule. |
| [**getAlertingAlert**](AlertingApi#getAlertingAlert) | Get an alert |
| [**getAlertingAlertsActive**](AlertingApi#getAlertingAlertsActive) | Gets active alert count for a user |
| [**getAlertingInteractionstatsAlert**](AlertingApi#getAlertingInteractionstatsAlert) | Get an interaction stats alert |
| [**getAlertingInteractionstatsAlerts**](AlertingApi#getAlertingInteractionstatsAlerts) | Get interaction stats alert list |
| [**getAlertingInteractionstatsAlertsUnread**](AlertingApi#getAlertingInteractionstatsAlertsUnread) | Gets user unread count of interaction stats alerts |
| [**getAlertingInteractionstatsRule**](AlertingApi#getAlertingInteractionstatsRule) | Get an interaction stats rule |
| [**getAlertingInteractionstatsRules**](AlertingApi#getAlertingInteractionstatsRules) | Get an interaction stats rule list |
| [**getAlertingRule**](AlertingApi#getAlertingRule) | Get a rule. |
| [**patchAlertingAlert**](AlertingApi#patchAlertingAlert) | Allows an entity to mute/snooze an alert or update the unread status of the alert. |
| [**patchAlertingAlertsBulk**](AlertingApi#patchAlertingAlertsBulk) | Bulk alert updates |
| [**patchAlertingRulesBulk**](AlertingApi#patchAlertingRulesBulk) | Bulk update of notification lists |
| [**postAlertingAlertsQuery**](AlertingApi#postAlertingAlertsQuery) | Gets a paged list of alerts. The max page size is 50 |
| [**postAlertingInteractionstatsRules**](AlertingApi#postAlertingInteractionstatsRules) | Create an interaction stats rule |
| [**postAlertingRules**](AlertingApi#postAlertingRules) | Create a Rule. |
| [**postAlertingRulesBulkRemove**](AlertingApi#postAlertingRulesBulkRemove) | Bulk remove rules |
| [**postAlertingRulesQuery**](AlertingApi#postAlertingRulesQuery) | Get a paged list of rules.  The max size of the page is 50 items. |
| [**putAlertingAlert**](AlertingApi#putAlertingAlert) | Update an alert read status |
| [**putAlertingInteractionstatsAlert**](AlertingApi#putAlertingInteractionstatsAlert) | Update an interaction stats alert read status |
| [**putAlertingInteractionstatsRule**](AlertingApi#putAlertingInteractionstatsRule) | Update an interaction stats rule |
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


# **deleteAlertingInteractionstatsAlert**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

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


# **deleteAlertingInteractionstatsRule**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

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


# **getAlertingAlertsActive**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> [ActiveAlertCount](ActiveAlertCount) getAlertingAlertsActive()

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

[**ActiveAlertCount**](ActiveAlertCount)


# **getAlertingInteractionstatsAlert**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> [InteractionStatsAlert](InteractionStatsAlert) getAlertingInteractionstatsAlert(alertId, expand)

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
| **expand** | [**List&lt;String&gt;**](String)| Which fields, if any, to expand | [optional]<br />**Values**: notificationUsers 
{: class="table-striped"}


### Return type

[**InteractionStatsAlert**](InteractionStatsAlert)


# **getAlertingInteractionstatsAlerts**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> [InteractionStatsAlertContainer](InteractionStatsAlertContainer) getAlertingInteractionstatsAlerts(expand)

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
| **expand** | [**List&lt;String&gt;**](String)| Which fields, if any, to expand | [optional]<br />**Values**: notificationUsers 
{: class="table-striped"}


### Return type

[**InteractionStatsAlertContainer**](InteractionStatsAlertContainer)


# **getAlertingInteractionstatsAlertsUnread**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> [UnreadMetric](UnreadMetric) getAlertingInteractionstatsAlertsUnread()

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

[**UnreadMetric**](UnreadMetric)


# **getAlertingInteractionstatsRule**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> [InteractionStatsRule](InteractionStatsRule) getAlertingInteractionstatsRule(ruleId, expand)

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
| **expand** | [**List&lt;String&gt;**](String)| Which fields, if any, to expand | [optional]<br />**Values**: notificationUsers 
{: class="table-striped"}


### Return type

[**InteractionStatsRule**](InteractionStatsRule)


# **getAlertingInteractionstatsRules**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> [InteractionStatsRuleContainer](InteractionStatsRuleContainer) getAlertingInteractionstatsRules(expand)

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
| **expand** | [**List&lt;String&gt;**](String)| Which fields, if any, to expand | [optional]<br />**Values**: notificationUsers 
{: class="table-striped"}


### Return type

[**InteractionStatsRuleContainer**](InteractionStatsRuleContainer)


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


# **postAlertingInteractionstatsRules**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> [InteractionStatsRule](InteractionStatsRule) postAlertingInteractionstatsRules(body, expand)

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
| **body** | [**InteractionStatsRule**](InteractionStatsRule)| AlertingRule | 
| **expand** | [**List&lt;String&gt;**](String)| Which fields, if any, to expand | [optional]<br />**Values**: notificationUsers 
{: class="table-striped"}


### Return type

[**InteractionStatsRule**](InteractionStatsRule)


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


> [UnreadStatus](UnreadStatus) putAlertingAlert(alertId, body)

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
| **body** | [**AlertingUnreadStatus**](AlertingUnreadStatus)|  | [optional] 
{: class="table-striped"}


### Return type

[**UnreadStatus**](UnreadStatus)


# **putAlertingInteractionstatsAlert**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> [UnreadStatus](UnreadStatus) putAlertingInteractionstatsAlert(alertId, body, expand)

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
| **body** | [**UnreadStatus**](UnreadStatus)| InteractionStatsAlert | 
| **expand** | [**List&lt;String&gt;**](String)| Which fields, if any, to expand | [optional]<br />**Values**: notificationUsers 
{: class="table-striped"}


### Return type

[**UnreadStatus**](UnreadStatus)


# **putAlertingInteractionstatsRule**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> [InteractionStatsRule](InteractionStatsRule) putAlertingInteractionstatsRule(ruleId, body, expand)

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
| **body** | [**InteractionStatsRule**](InteractionStatsRule)| AlertingRule | 
| **expand** | [**List&lt;String&gt;**](String)| Which fields, if any, to expand | [optional]<br />**Values**: notificationUsers 
{: class="table-striped"}


### Return type

[**InteractionStatsRule**](InteractionStatsRule)


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


_com.mypurecloud.sdk.v2:platform-client-v2:215.0.0_
