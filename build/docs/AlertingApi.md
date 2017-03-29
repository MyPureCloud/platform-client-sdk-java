---
title: AlertingApi
---
## AlertingApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**deleteAlertingHeartbeatAlert**](AlertingApi.html#deleteAlertingHeartbeatAlert) | Delete a heart beat alert |
| [**deleteAlertingHeartbeatRule**](AlertingApi.html#deleteAlertingHeartbeatRule) | Delete a heart beat rule. |
| [**deleteAlertingInteractionstatsAlert**](AlertingApi.html#deleteAlertingInteractionstatsAlert) | Delete an interaction stats alert |
| [**deleteAlertingInteractionstatsRule**](AlertingApi.html#deleteAlertingInteractionstatsRule) | Delete an interaction stats rule. |
| [**deleteAlertingRoutingstatusAlert**](AlertingApi.html#deleteAlertingRoutingstatusAlert) | Delete a routing status alert |
| [**deleteAlertingRoutingstatusRule**](AlertingApi.html#deleteAlertingRoutingstatusRule) | Delete a routing status rule. |
| [**deleteAlertingUserpresenceAlert**](AlertingApi.html#deleteAlertingUserpresenceAlert) | Delete a user presence alert |
| [**deleteAlertingUserpresenceRule**](AlertingApi.html#deleteAlertingUserpresenceRule) | Delete a user presence rule. |
| [**getAlertingHeartbeatAlert**](AlertingApi.html#getAlertingHeartbeatAlert) | Get a heart beat alert |
| [**getAlertingHeartbeatAlerts**](AlertingApi.html#getAlertingHeartbeatAlerts) | Get heart beat alert list. |
| [**getAlertingHeartbeatRule**](AlertingApi.html#getAlertingHeartbeatRule) | Get a heart beat rule. |
| [**getAlertingHeartbeatRules**](AlertingApi.html#getAlertingHeartbeatRules) | Get a heart beat rule list. |
| [**getAlertingInteractionstatsAlert**](AlertingApi.html#getAlertingInteractionstatsAlert) | Get an interaction stats alert |
| [**getAlertingInteractionstatsAlerts**](AlertingApi.html#getAlertingInteractionstatsAlerts) | Get interaction stats alert list. |
| [**getAlertingInteractionstatsAlertsUnread**](AlertingApi.html#getAlertingInteractionstatsAlertsUnread) | Gets user unread count of interaction stats alerts. |
| [**getAlertingInteractionstatsRule**](AlertingApi.html#getAlertingInteractionstatsRule) | Get an interaction stats rule. |
| [**getAlertingInteractionstatsRules**](AlertingApi.html#getAlertingInteractionstatsRules) | Get an interaction stats rule list. |
| [**getAlertingRoutingstatusAlert**](AlertingApi.html#getAlertingRoutingstatusAlert) | Get a routing status alert |
| [**getAlertingRoutingstatusAlerts**](AlertingApi.html#getAlertingRoutingstatusAlerts) | Get routing status alert list. |
| [**getAlertingRoutingstatusRule**](AlertingApi.html#getAlertingRoutingstatusRule) | Get a routing status rule. |
| [**getAlertingRoutingstatusRules**](AlertingApi.html#getAlertingRoutingstatusRules) | Get a routing status rule list. |
| [**getAlertingUserpresenceAlert**](AlertingApi.html#getAlertingUserpresenceAlert) | Get a user presence alert |
| [**getAlertingUserpresenceAlerts**](AlertingApi.html#getAlertingUserpresenceAlerts) | Get user presence alert list. |
| [**getAlertingUserpresenceRule**](AlertingApi.html#getAlertingUserpresenceRule) | Get a user presence rule. |
| [**getAlertingUserpresenceRules**](AlertingApi.html#getAlertingUserpresenceRules) | Get a user presence rule list. |
| [**postAlertingHeartbeatRules**](AlertingApi.html#postAlertingHeartbeatRules) | Create a heart beat rule. |
| [**postAlertingInteractionstatsRules**](AlertingApi.html#postAlertingInteractionstatsRules) | Create an interaction stats rule. |
| [**postAlertingRoutingstatusRules**](AlertingApi.html#postAlertingRoutingstatusRules) | Create a routing status rule. |
| [**postAlertingUserpresenceRules**](AlertingApi.html#postAlertingUserpresenceRules) | Create a user presence rule. |
| [**putAlertingHeartbeatRule**](AlertingApi.html#putAlertingHeartbeatRule) | Update a heart beat rule |
| [**putAlertingInteractionstatsAlert**](AlertingApi.html#putAlertingInteractionstatsAlert) | Update an interaction stats alert read status |
| [**putAlertingInteractionstatsRule**](AlertingApi.html#putAlertingInteractionstatsRule) | Update an interaction stats rule |
| [**putAlertingRoutingstatusRule**](AlertingApi.html#putAlertingRoutingstatusRule) | Update a routing status rule |
| [**putAlertingUserpresenceRule**](AlertingApi.html#putAlertingUserpresenceRule) | Update a user presence rule |
{: class="table table-striped"}

<a name="deleteAlertingHeartbeatAlert"></a>

# **deleteAlertingHeartbeatAlert**

> Void deleteAlertingHeartbeatAlert(alertId)

Delete a heart beat alert



Wraps DELETE /api/v2/alerting/heartbeat/alerts/{alertId}  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.AlertingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AlertingApi apiInstance = new AlertingApi();
String alertId = "alertId_example"; // String | Alert ID
try {
    apiInstance.deleteAlertingHeartbeatAlert(alertId);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertingApi#deleteAlertingHeartbeatAlert");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **alertId** | **String**| Alert ID | |
{: class="table table-striped"}

### Return type

null (empty response body)

<a name="deleteAlertingHeartbeatRule"></a>

# **deleteAlertingHeartbeatRule**

> Void deleteAlertingHeartbeatRule(ruleId)

Delete a heart beat rule.



Wraps DELETE /api/v2/alerting/heartbeat/rules/{ruleId}  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.AlertingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AlertingApi apiInstance = new AlertingApi();
String ruleId = "ruleId_example"; // String | Rule ID
try {
    apiInstance.deleteAlertingHeartbeatRule(ruleId);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertingApi#deleteAlertingHeartbeatRule");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ruleId** | **String**| Rule ID | |
{: class="table table-striped"}

### Return type

null (empty response body)

<a name="deleteAlertingInteractionstatsAlert"></a>

# **deleteAlertingInteractionstatsAlert**

> Void deleteAlertingInteractionstatsAlert(alertId)

Delete an interaction stats alert



Wraps DELETE /api/v2/alerting/interactionstats/alerts/{alertId}  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.AlertingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AlertingApi apiInstance = new AlertingApi();
String alertId = "alertId_example"; // String | Alert ID
try {
    apiInstance.deleteAlertingInteractionstatsAlert(alertId);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertingApi#deleteAlertingInteractionstatsAlert");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **alertId** | **String**| Alert ID | |
{: class="table table-striped"}

### Return type

null (empty response body)

<a name="deleteAlertingInteractionstatsRule"></a>

# **deleteAlertingInteractionstatsRule**

> Void deleteAlertingInteractionstatsRule(ruleId)

Delete an interaction stats rule.



Wraps DELETE /api/v2/alerting/interactionstats/rules/{ruleId}  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.AlertingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AlertingApi apiInstance = new AlertingApi();
String ruleId = "ruleId_example"; // String | Rule ID
try {
    apiInstance.deleteAlertingInteractionstatsRule(ruleId);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertingApi#deleteAlertingInteractionstatsRule");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ruleId** | **String**| Rule ID | |
{: class="table table-striped"}

### Return type

null (empty response body)

<a name="deleteAlertingRoutingstatusAlert"></a>

# **deleteAlertingRoutingstatusAlert**

> Void deleteAlertingRoutingstatusAlert(alertId)

Delete a routing status alert



Wraps DELETE /api/v2/alerting/routingstatus/alerts/{alertId}  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.AlertingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AlertingApi apiInstance = new AlertingApi();
String alertId = "alertId_example"; // String | Alert ID
try {
    apiInstance.deleteAlertingRoutingstatusAlert(alertId);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertingApi#deleteAlertingRoutingstatusAlert");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **alertId** | **String**| Alert ID | |
{: class="table table-striped"}

### Return type

null (empty response body)

<a name="deleteAlertingRoutingstatusRule"></a>

# **deleteAlertingRoutingstatusRule**

> Void deleteAlertingRoutingstatusRule(ruleId)

Delete a routing status rule.



Wraps DELETE /api/v2/alerting/routingstatus/rules/{ruleId}  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.AlertingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AlertingApi apiInstance = new AlertingApi();
String ruleId = "ruleId_example"; // String | Rule ID
try {
    apiInstance.deleteAlertingRoutingstatusRule(ruleId);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertingApi#deleteAlertingRoutingstatusRule");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ruleId** | **String**| Rule ID | |
{: class="table table-striped"}

### Return type

null (empty response body)

<a name="deleteAlertingUserpresenceAlert"></a>

# **deleteAlertingUserpresenceAlert**

> Void deleteAlertingUserpresenceAlert(alertId)

Delete a user presence alert



Wraps DELETE /api/v2/alerting/userpresence/alerts/{alertId}  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.AlertingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AlertingApi apiInstance = new AlertingApi();
String alertId = "alertId_example"; // String | Alert ID
try {
    apiInstance.deleteAlertingUserpresenceAlert(alertId);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertingApi#deleteAlertingUserpresenceAlert");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **alertId** | **String**| Alert ID | |
{: class="table table-striped"}

### Return type

null (empty response body)

<a name="deleteAlertingUserpresenceRule"></a>

# **deleteAlertingUserpresenceRule**

> Void deleteAlertingUserpresenceRule(ruleId)

Delete a user presence rule.



Wraps DELETE /api/v2/alerting/userpresence/rules/{ruleId}  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.AlertingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AlertingApi apiInstance = new AlertingApi();
String ruleId = "ruleId_example"; // String | Rule ID
try {
    apiInstance.deleteAlertingUserpresenceRule(ruleId);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertingApi#deleteAlertingUserpresenceRule");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ruleId** | **String**| Rule ID | |
{: class="table table-striped"}

### Return type

null (empty response body)

<a name="getAlertingHeartbeatAlert"></a>

# **getAlertingHeartbeatAlert**

> [HeartBeatAlert](HeartBeatAlert.html) getAlertingHeartbeatAlert(alertId, expand)

Get a heart beat alert



Wraps GET /api/v2/alerting/heartbeat/alerts/{alertId}  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.AlertingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AlertingApi apiInstance = new AlertingApi();
String alertId = "alertId_example"; // String | Alert ID
List<String> expand = Arrays.asList("expand_example"); // List<String> | Which fields, if any, to expand
try {
    HeartBeatAlert result = apiInstance.getAlertingHeartbeatAlert(alertId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertingApi#getAlertingHeartbeatAlert");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **alertId** | **String**| Alert ID | |
| **expand** | [**List&lt;String&gt;**](String.html)| Which fields, if any, to expand | [optional] |
{: class="table table-striped"}

### Return type

[**HeartBeatAlert**](HeartBeatAlert.html)

<a name="getAlertingHeartbeatAlerts"></a>

# **getAlertingHeartbeatAlerts**

> [HeartBeatAlertContainer](HeartBeatAlertContainer.html) getAlertingHeartbeatAlerts(expand)

Get heart beat alert list.



Wraps GET /api/v2/alerting/heartbeat/alerts  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.AlertingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AlertingApi apiInstance = new AlertingApi();
List<String> expand = Arrays.asList("expand_example"); // List<String> | Which fields, if any, to expand
try {
    HeartBeatAlertContainer result = apiInstance.getAlertingHeartbeatAlerts(expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertingApi#getAlertingHeartbeatAlerts");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **expand** | [**List&lt;String&gt;**](String.html)| Which fields, if any, to expand | [optional] |
{: class="table table-striped"}

### Return type

[**HeartBeatAlertContainer**](HeartBeatAlertContainer.html)

<a name="getAlertingHeartbeatRule"></a>

# **getAlertingHeartbeatRule**

> [HeartBeatRule](HeartBeatRule.html) getAlertingHeartbeatRule(ruleId, expand)

Get a heart beat rule.



Wraps GET /api/v2/alerting/heartbeat/rules/{ruleId}  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.AlertingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AlertingApi apiInstance = new AlertingApi();
String ruleId = "ruleId_example"; // String | Rule ID
List<String> expand = Arrays.asList("expand_example"); // List<String> | Which fields, if any, to expand
try {
    HeartBeatRule result = apiInstance.getAlertingHeartbeatRule(ruleId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertingApi#getAlertingHeartbeatRule");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ruleId** | **String**| Rule ID | |
| **expand** | [**List&lt;String&gt;**](String.html)| Which fields, if any, to expand | [optional] |
{: class="table table-striped"}

### Return type

[**HeartBeatRule**](HeartBeatRule.html)

<a name="getAlertingHeartbeatRules"></a>

# **getAlertingHeartbeatRules**

> [HeartBeatRuleContainer](HeartBeatRuleContainer.html) getAlertingHeartbeatRules(expand)

Get a heart beat rule list.



Wraps GET /api/v2/alerting/heartbeat/rules  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.AlertingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AlertingApi apiInstance = new AlertingApi();
List<String> expand = Arrays.asList("expand_example"); // List<String> | Which fields, if any, to expand
try {
    HeartBeatRuleContainer result = apiInstance.getAlertingHeartbeatRules(expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertingApi#getAlertingHeartbeatRules");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **expand** | [**List&lt;String&gt;**](String.html)| Which fields, if any, to expand | [optional] |
{: class="table table-striped"}

### Return type

[**HeartBeatRuleContainer**](HeartBeatRuleContainer.html)

<a name="getAlertingInteractionstatsAlert"></a>

# **getAlertingInteractionstatsAlert**

> [InteractionStatsAlert](InteractionStatsAlert.html) getAlertingInteractionstatsAlert(alertId, expand)

Get an interaction stats alert



Wraps GET /api/v2/alerting/interactionstats/alerts/{alertId}  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.AlertingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AlertingApi apiInstance = new AlertingApi();
String alertId = "alertId_example"; // String | Alert ID
List<String> expand = Arrays.asList("expand_example"); // List<String> | Which fields, if any, to expand
try {
    InteractionStatsAlert result = apiInstance.getAlertingInteractionstatsAlert(alertId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertingApi#getAlertingInteractionstatsAlert");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **alertId** | **String**| Alert ID | |
| **expand** | [**List&lt;String&gt;**](String.html)| Which fields, if any, to expand | [optional] |
{: class="table table-striped"}

### Return type

[**InteractionStatsAlert**](InteractionStatsAlert.html)

<a name="getAlertingInteractionstatsAlerts"></a>

# **getAlertingInteractionstatsAlerts**

> [InteractionStatsAlertContainer](InteractionStatsAlertContainer.html) getAlertingInteractionstatsAlerts(expand)

Get interaction stats alert list.



Wraps GET /api/v2/alerting/interactionstats/alerts  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.AlertingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AlertingApi apiInstance = new AlertingApi();
List<String> expand = Arrays.asList("expand_example"); // List<String> | Which fields, if any, to expand
try {
    InteractionStatsAlertContainer result = apiInstance.getAlertingInteractionstatsAlerts(expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertingApi#getAlertingInteractionstatsAlerts");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **expand** | [**List&lt;String&gt;**](String.html)| Which fields, if any, to expand | [optional] |
{: class="table table-striped"}

### Return type

[**InteractionStatsAlertContainer**](InteractionStatsAlertContainer.html)

<a name="getAlertingInteractionstatsAlertsUnread"></a>

# **getAlertingInteractionstatsAlertsUnread**

> [UnreadMetric](UnreadMetric.html) getAlertingInteractionstatsAlertsUnread()

Gets user unread count of interaction stats alerts.



Wraps GET /api/v2/alerting/interactionstats/alerts/unread  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.AlertingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AlertingApi apiInstance = new AlertingApi();
try {
    UnreadMetric result = apiInstance.getAlertingInteractionstatsAlertsUnread();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertingApi#getAlertingInteractionstatsAlertsUnread");
    e.printStackTrace();
}
~~~

### Parameters

This endpoint does not require any parameters.
{: class="table table-striped"}

### Return type

[**UnreadMetric**](UnreadMetric.html)

<a name="getAlertingInteractionstatsRule"></a>

# **getAlertingInteractionstatsRule**

> [InteractionStatsRule](InteractionStatsRule.html) getAlertingInteractionstatsRule(ruleId, expand)

Get an interaction stats rule.



Wraps GET /api/v2/alerting/interactionstats/rules/{ruleId}  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.AlertingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AlertingApi apiInstance = new AlertingApi();
String ruleId = "ruleId_example"; // String | Rule ID
List<String> expand = Arrays.asList("expand_example"); // List<String> | Which fields, if any, to expand
try {
    InteractionStatsRule result = apiInstance.getAlertingInteractionstatsRule(ruleId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertingApi#getAlertingInteractionstatsRule");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ruleId** | **String**| Rule ID | |
| **expand** | [**List&lt;String&gt;**](String.html)| Which fields, if any, to expand | [optional] |
{: class="table table-striped"}

### Return type

[**InteractionStatsRule**](InteractionStatsRule.html)

<a name="getAlertingInteractionstatsRules"></a>

# **getAlertingInteractionstatsRules**

> [InteractionStatsRuleContainer](InteractionStatsRuleContainer.html) getAlertingInteractionstatsRules(expand)

Get an interaction stats rule list.



Wraps GET /api/v2/alerting/interactionstats/rules  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.AlertingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AlertingApi apiInstance = new AlertingApi();
List<String> expand = Arrays.asList("expand_example"); // List<String> | Which fields, if any, to expand
try {
    InteractionStatsRuleContainer result = apiInstance.getAlertingInteractionstatsRules(expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertingApi#getAlertingInteractionstatsRules");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **expand** | [**List&lt;String&gt;**](String.html)| Which fields, if any, to expand | [optional] |
{: class="table table-striped"}

### Return type

[**InteractionStatsRuleContainer**](InteractionStatsRuleContainer.html)

<a name="getAlertingRoutingstatusAlert"></a>

# **getAlertingRoutingstatusAlert**

> [RoutingStatusAlert](RoutingStatusAlert.html) getAlertingRoutingstatusAlert(alertId, expand)

Get a routing status alert



Wraps GET /api/v2/alerting/routingstatus/alerts/{alertId}  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.AlertingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AlertingApi apiInstance = new AlertingApi();
String alertId = "alertId_example"; // String | Alert ID
List<String> expand = Arrays.asList("expand_example"); // List<String> | Which fields, if any, to expand
try {
    RoutingStatusAlert result = apiInstance.getAlertingRoutingstatusAlert(alertId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertingApi#getAlertingRoutingstatusAlert");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **alertId** | **String**| Alert ID | |
| **expand** | [**List&lt;String&gt;**](String.html)| Which fields, if any, to expand | [optional] |
{: class="table table-striped"}

### Return type

[**RoutingStatusAlert**](RoutingStatusAlert.html)

<a name="getAlertingRoutingstatusAlerts"></a>

# **getAlertingRoutingstatusAlerts**

> [RoutingStatusAlertContainer](RoutingStatusAlertContainer.html) getAlertingRoutingstatusAlerts(expand)

Get routing status alert list.



Wraps GET /api/v2/alerting/routingstatus/alerts  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.AlertingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AlertingApi apiInstance = new AlertingApi();
List<String> expand = Arrays.asList("expand_example"); // List<String> | Which fields, if any, to expand
try {
    RoutingStatusAlertContainer result = apiInstance.getAlertingRoutingstatusAlerts(expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertingApi#getAlertingRoutingstatusAlerts");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **expand** | [**List&lt;String&gt;**](String.html)| Which fields, if any, to expand | [optional] |
{: class="table table-striped"}

### Return type

[**RoutingStatusAlertContainer**](RoutingStatusAlertContainer.html)

<a name="getAlertingRoutingstatusRule"></a>

# **getAlertingRoutingstatusRule**

> [RoutingStatusRule](RoutingStatusRule.html) getAlertingRoutingstatusRule(ruleId, expand)

Get a routing status rule.



Wraps GET /api/v2/alerting/routingstatus/rules/{ruleId}  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.AlertingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AlertingApi apiInstance = new AlertingApi();
String ruleId = "ruleId_example"; // String | Rule ID
List<String> expand = Arrays.asList("expand_example"); // List<String> | Which fields, if any, to expand
try {
    RoutingStatusRule result = apiInstance.getAlertingRoutingstatusRule(ruleId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertingApi#getAlertingRoutingstatusRule");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ruleId** | **String**| Rule ID | |
| **expand** | [**List&lt;String&gt;**](String.html)| Which fields, if any, to expand | [optional] |
{: class="table table-striped"}

### Return type

[**RoutingStatusRule**](RoutingStatusRule.html)

<a name="getAlertingRoutingstatusRules"></a>

# **getAlertingRoutingstatusRules**

> [RoutingStatusRuleContainer](RoutingStatusRuleContainer.html) getAlertingRoutingstatusRules(expand)

Get a routing status rule list.



Wraps GET /api/v2/alerting/routingstatus/rules  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.AlertingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AlertingApi apiInstance = new AlertingApi();
List<String> expand = Arrays.asList("expand_example"); // List<String> | Which fields, if any, to expand
try {
    RoutingStatusRuleContainer result = apiInstance.getAlertingRoutingstatusRules(expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertingApi#getAlertingRoutingstatusRules");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **expand** | [**List&lt;String&gt;**](String.html)| Which fields, if any, to expand | [optional] |
{: class="table table-striped"}

### Return type

[**RoutingStatusRuleContainer**](RoutingStatusRuleContainer.html)

<a name="getAlertingUserpresenceAlert"></a>

# **getAlertingUserpresenceAlert**

> [UserPresenceAlert](UserPresenceAlert.html) getAlertingUserpresenceAlert(alertId, expand)

Get a user presence alert



Wraps GET /api/v2/alerting/userpresence/alerts/{alertId}  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.AlertingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AlertingApi apiInstance = new AlertingApi();
String alertId = "alertId_example"; // String | Alert ID
List<String> expand = Arrays.asList("expand_example"); // List<String> | Which fields, if any, to expand
try {
    UserPresenceAlert result = apiInstance.getAlertingUserpresenceAlert(alertId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertingApi#getAlertingUserpresenceAlert");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **alertId** | **String**| Alert ID | |
| **expand** | [**List&lt;String&gt;**](String.html)| Which fields, if any, to expand | [optional] |
{: class="table table-striped"}

### Return type

[**UserPresenceAlert**](UserPresenceAlert.html)

<a name="getAlertingUserpresenceAlerts"></a>

# **getAlertingUserpresenceAlerts**

> [UserPresenceAlertContainer](UserPresenceAlertContainer.html) getAlertingUserpresenceAlerts(expand)

Get user presence alert list.



Wraps GET /api/v2/alerting/userpresence/alerts  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.AlertingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AlertingApi apiInstance = new AlertingApi();
List<String> expand = Arrays.asList("expand_example"); // List<String> | Which fields, if any, to expand
try {
    UserPresenceAlertContainer result = apiInstance.getAlertingUserpresenceAlerts(expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertingApi#getAlertingUserpresenceAlerts");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **expand** | [**List&lt;String&gt;**](String.html)| Which fields, if any, to expand | [optional] |
{: class="table table-striped"}

### Return type

[**UserPresenceAlertContainer**](UserPresenceAlertContainer.html)

<a name="getAlertingUserpresenceRule"></a>

# **getAlertingUserpresenceRule**

> [UserPresenceRule](UserPresenceRule.html) getAlertingUserpresenceRule(ruleId, expand)

Get a user presence rule.



Wraps GET /api/v2/alerting/userpresence/rules/{ruleId}  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.AlertingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AlertingApi apiInstance = new AlertingApi();
String ruleId = "ruleId_example"; // String | Rule ID
List<String> expand = Arrays.asList("expand_example"); // List<String> | Which fields, if any, to expand
try {
    UserPresenceRule result = apiInstance.getAlertingUserpresenceRule(ruleId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertingApi#getAlertingUserpresenceRule");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ruleId** | **String**| Rule ID | |
| **expand** | [**List&lt;String&gt;**](String.html)| Which fields, if any, to expand | [optional] |
{: class="table table-striped"}

### Return type

[**UserPresenceRule**](UserPresenceRule.html)

<a name="getAlertingUserpresenceRules"></a>

# **getAlertingUserpresenceRules**

> [UserPresenceRuleContainer](UserPresenceRuleContainer.html) getAlertingUserpresenceRules(expand)

Get a user presence rule list.



Wraps GET /api/v2/alerting/userpresence/rules  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.AlertingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AlertingApi apiInstance = new AlertingApi();
List<String> expand = Arrays.asList("expand_example"); // List<String> | Which fields, if any, to expand
try {
    UserPresenceRuleContainer result = apiInstance.getAlertingUserpresenceRules(expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertingApi#getAlertingUserpresenceRules");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **expand** | [**List&lt;String&gt;**](String.html)| Which fields, if any, to expand | [optional] |
{: class="table table-striped"}

### Return type

[**UserPresenceRuleContainer**](UserPresenceRuleContainer.html)

<a name="postAlertingHeartbeatRules"></a>

# **postAlertingHeartbeatRules**

> [HeartBeatRule](HeartBeatRule.html) postAlertingHeartbeatRules(body, expand)

Create a heart beat rule.



Wraps POST /api/v2/alerting/heartbeat/rules  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.AlertingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AlertingApi apiInstance = new AlertingApi();
HeartBeatRule body = new HeartBeatRule(); // HeartBeatRule | HeartBeatRule
List<String> expand = Arrays.asList("expand_example"); // List<String> | Which fields, if any, to expand
try {
    HeartBeatRule result = apiInstance.postAlertingHeartbeatRules(body, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertingApi#postAlertingHeartbeatRules");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**HeartBeatRule**](HeartBeatRule.html)| HeartBeatRule | |
| **expand** | [**List&lt;String&gt;**](String.html)| Which fields, if any, to expand | [optional] |
{: class="table table-striped"}

### Return type

[**HeartBeatRule**](HeartBeatRule.html)

<a name="postAlertingInteractionstatsRules"></a>

# **postAlertingInteractionstatsRules**

> [InteractionStatsRule](InteractionStatsRule.html) postAlertingInteractionstatsRules(body, expand)

Create an interaction stats rule.



Wraps POST /api/v2/alerting/interactionstats/rules  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.AlertingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AlertingApi apiInstance = new AlertingApi();
InteractionStatsRule body = new InteractionStatsRule(); // InteractionStatsRule | AlertingRule
List<String> expand = Arrays.asList("expand_example"); // List<String> | Which fields, if any, to expand
try {
    InteractionStatsRule result = apiInstance.postAlertingInteractionstatsRules(body, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertingApi#postAlertingInteractionstatsRules");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**InteractionStatsRule**](InteractionStatsRule.html)| AlertingRule | |
| **expand** | [**List&lt;String&gt;**](String.html)| Which fields, if any, to expand | [optional] |
{: class="table table-striped"}

### Return type

[**InteractionStatsRule**](InteractionStatsRule.html)

<a name="postAlertingRoutingstatusRules"></a>

# **postAlertingRoutingstatusRules**

> [RoutingStatusRule](RoutingStatusRule.html) postAlertingRoutingstatusRules(body, expand)

Create a routing status rule.



Wraps POST /api/v2/alerting/routingstatus/rules  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.AlertingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AlertingApi apiInstance = new AlertingApi();
RoutingStatusRule body = new RoutingStatusRule(); // RoutingStatusRule | RoutingStatusRule
List<String> expand = Arrays.asList("expand_example"); // List<String> | Which fields, if any, to expand
try {
    RoutingStatusRule result = apiInstance.postAlertingRoutingstatusRules(body, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertingApi#postAlertingRoutingstatusRules");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**RoutingStatusRule**](RoutingStatusRule.html)| RoutingStatusRule | |
| **expand** | [**List&lt;String&gt;**](String.html)| Which fields, if any, to expand | [optional] |
{: class="table table-striped"}

### Return type

[**RoutingStatusRule**](RoutingStatusRule.html)

<a name="postAlertingUserpresenceRules"></a>

# **postAlertingUserpresenceRules**

> [UserPresenceRule](UserPresenceRule.html) postAlertingUserpresenceRules(body, expand)

Create a user presence rule.



Wraps POST /api/v2/alerting/userpresence/rules  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.AlertingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AlertingApi apiInstance = new AlertingApi();
UserPresenceRule body = new UserPresenceRule(); // UserPresenceRule | UserPresenceRule
List<String> expand = Arrays.asList("expand_example"); // List<String> | Which fields, if any, to expand
try {
    UserPresenceRule result = apiInstance.postAlertingUserpresenceRules(body, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertingApi#postAlertingUserpresenceRules");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**UserPresenceRule**](UserPresenceRule.html)| UserPresenceRule | |
| **expand** | [**List&lt;String&gt;**](String.html)| Which fields, if any, to expand | [optional] |
{: class="table table-striped"}

### Return type

[**UserPresenceRule**](UserPresenceRule.html)

<a name="putAlertingHeartbeatRule"></a>

# **putAlertingHeartbeatRule**

> [HeartBeatRule](HeartBeatRule.html) putAlertingHeartbeatRule(ruleId, body, expand)

Update a heart beat rule



Wraps PUT /api/v2/alerting/heartbeat/rules/{ruleId}  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.AlertingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AlertingApi apiInstance = new AlertingApi();
String ruleId = "ruleId_example"; // String | Rule ID
HeartBeatRule body = new HeartBeatRule(); // HeartBeatRule | HeartBeatRule
List<String> expand = Arrays.asList("expand_example"); // List<String> | Which fields, if any, to expand
try {
    HeartBeatRule result = apiInstance.putAlertingHeartbeatRule(ruleId, body, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertingApi#putAlertingHeartbeatRule");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ruleId** | **String**| Rule ID | |
| **body** | [**HeartBeatRule**](HeartBeatRule.html)| HeartBeatRule | |
| **expand** | [**List&lt;String&gt;**](String.html)| Which fields, if any, to expand | [optional] |
{: class="table table-striped"}

### Return type

[**HeartBeatRule**](HeartBeatRule.html)

<a name="putAlertingInteractionstatsAlert"></a>

# **putAlertingInteractionstatsAlert**

> [UnreadStatus](UnreadStatus.html) putAlertingInteractionstatsAlert(alertId, body, expand)

Update an interaction stats alert read status



Wraps PUT /api/v2/alerting/interactionstats/alerts/{alertId}  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.AlertingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AlertingApi apiInstance = new AlertingApi();
String alertId = "alertId_example"; // String | Alert ID
UnreadStatus body = new UnreadStatus(); // UnreadStatus | InteractionStatsAlert
List<String> expand = Arrays.asList("expand_example"); // List<String> | Which fields, if any, to expand
try {
    UnreadStatus result = apiInstance.putAlertingInteractionstatsAlert(alertId, body, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertingApi#putAlertingInteractionstatsAlert");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **alertId** | **String**| Alert ID | |
| **body** | [**UnreadStatus**](UnreadStatus.html)| InteractionStatsAlert | |
| **expand** | [**List&lt;String&gt;**](String.html)| Which fields, if any, to expand | [optional] |
{: class="table table-striped"}

### Return type

[**UnreadStatus**](UnreadStatus.html)

<a name="putAlertingInteractionstatsRule"></a>

# **putAlertingInteractionstatsRule**

> [InteractionStatsRule](InteractionStatsRule.html) putAlertingInteractionstatsRule(ruleId, body, expand)

Update an interaction stats rule



Wraps PUT /api/v2/alerting/interactionstats/rules/{ruleId}  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.AlertingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AlertingApi apiInstance = new AlertingApi();
String ruleId = "ruleId_example"; // String | Rule ID
InteractionStatsRule body = new InteractionStatsRule(); // InteractionStatsRule | AlertingRule
List<String> expand = Arrays.asList("expand_example"); // List<String> | Which fields, if any, to expand
try {
    InteractionStatsRule result = apiInstance.putAlertingInteractionstatsRule(ruleId, body, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertingApi#putAlertingInteractionstatsRule");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ruleId** | **String**| Rule ID | |
| **body** | [**InteractionStatsRule**](InteractionStatsRule.html)| AlertingRule | |
| **expand** | [**List&lt;String&gt;**](String.html)| Which fields, if any, to expand | [optional] |
{: class="table table-striped"}

### Return type

[**InteractionStatsRule**](InteractionStatsRule.html)

<a name="putAlertingRoutingstatusRule"></a>

# **putAlertingRoutingstatusRule**

> [RoutingStatusRule](RoutingStatusRule.html) putAlertingRoutingstatusRule(ruleId, body, expand)

Update a routing status rule



Wraps PUT /api/v2/alerting/routingstatus/rules/{ruleId}  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.AlertingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AlertingApi apiInstance = new AlertingApi();
String ruleId = "ruleId_example"; // String | Rule ID
RoutingStatusRule body = new RoutingStatusRule(); // RoutingStatusRule | RoutingStatusRule
List<String> expand = Arrays.asList("expand_example"); // List<String> | Which fields, if any, to expand
try {
    RoutingStatusRule result = apiInstance.putAlertingRoutingstatusRule(ruleId, body, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertingApi#putAlertingRoutingstatusRule");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ruleId** | **String**| Rule ID | |
| **body** | [**RoutingStatusRule**](RoutingStatusRule.html)| RoutingStatusRule | |
| **expand** | [**List&lt;String&gt;**](String.html)| Which fields, if any, to expand | [optional] |
{: class="table table-striped"}

### Return type

[**RoutingStatusRule**](RoutingStatusRule.html)

<a name="putAlertingUserpresenceRule"></a>

# **putAlertingUserpresenceRule**

> [UserPresenceRule](UserPresenceRule.html) putAlertingUserpresenceRule(ruleId, body, expand)

Update a user presence rule



Wraps PUT /api/v2/alerting/userpresence/rules/{ruleId}  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.AlertingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AlertingApi apiInstance = new AlertingApi();
String ruleId = "ruleId_example"; // String | Rule ID
UserPresenceRule body = new UserPresenceRule(); // UserPresenceRule | UserPresenceRule
List<String> expand = Arrays.asList("expand_example"); // List<String> | Which fields, if any, to expand
try {
    UserPresenceRule result = apiInstance.putAlertingUserpresenceRule(ruleId, body, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertingApi#putAlertingUserpresenceRule");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ruleId** | **String**| Rule ID | |
| **body** | [**UserPresenceRule**](UserPresenceRule.html)| UserPresenceRule | |
| **expand** | [**List&lt;String&gt;**](String.html)| Which fields, if any, to expand | [optional] |
{: class="table table-striped"}

### Return type

[**UserPresenceRule**](UserPresenceRule.html)

