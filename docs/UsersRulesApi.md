# UsersRulesApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**deleteUsersRule**](UsersRulesApi#deleteUsersRule) | Delete an existing users rule |
| [**getUsersRule**](UsersRulesApi#getUsersRule) | Get a users rule |
| [**getUsersRuleDependentTypeId**](UsersRulesApi#getUsersRuleDependentTypeId) | Get dependent of a users rule |
| [**getUsersRuleDependents**](UsersRulesApi#getUsersRuleDependents) | Get dependents for a users rule |
| [**getUsersRules**](UsersRulesApi#getUsersRules) | Get the list of users rules |
| [**getUsersRulesSetting**](UsersRulesApi#getUsersRulesSetting) | Get the settings for a specific users rule type |
| [**patchUsersRule**](UsersRulesApi#patchUsersRule) | Update an existing users rule |
| [**postUsersRules**](UsersRulesApi#postUsersRules) | Create a new rule |
| [**postUsersRulesQuery**](UsersRulesApi#postUsersRulesQuery) | Query the result of a users rule |
{: class="table-striped"}


# **deleteUsersRule**


> Void deleteUsersRule(ruleId)

Delete an existing users rule

deleteUsersRule is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps DELETE /api/v2/users/rules/{ruleId}  

Requires ANY permissions: 

* users:rules:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersRulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersRulesApi apiInstance = new UsersRulesApi();
String ruleId = "ruleId_example"; // String | The id of the rule
try {
    apiInstance.deleteUsersRule(ruleId);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersRulesApi#deleteUsersRule");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ruleId** | **String**| The id of the rule | 
{: class="table-striped"}


### Return type

null (empty response body)


# **getUsersRule**


> [UsersRulesRule](UsersRulesRule) getUsersRule(ruleId)

Get a users rule

getUsersRule is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/users/rules/{ruleId}  

Requires ANY permissions: 

* users:rules:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersRulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersRulesApi apiInstance = new UsersRulesApi();
String ruleId = "ruleId_example"; // String | The ID of the rule to retrieve
try {
    UsersRulesRule result = apiInstance.getUsersRule(ruleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersRulesApi#getUsersRule");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ruleId** | **String**| The ID of the rule to retrieve | 
{: class="table-striped"}


### Return type

[**UsersRulesRule**](UsersRulesRule)


# **getUsersRuleDependentTypeId**


> [UsersRulesDependent](UsersRulesDependent) getUsersRuleDependentTypeId(ruleId, ruleType, typeId)

Get dependent of a users rule

getUsersRuleDependentTypeId is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/users/rules/{ruleId}/dependents/{ruleType}/{typeId}  

Requires ANY permissions: 

* users:ruleDependents:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersRulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersRulesApi apiInstance = new UsersRulesApi();
String ruleId = "ruleId_example"; // String | The ID of the rule for which to retrieve dependents
String ruleType = "ruleType_example"; // String | The type of the dependent
String typeId = "typeId_example"; // String | The type ID of the dependent
try {
    UsersRulesDependent result = apiInstance.getUsersRuleDependentTypeId(ruleId, ruleType, typeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersRulesApi#getUsersRuleDependentTypeId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ruleId** | **String**| The ID of the rule for which to retrieve dependents | 
| **ruleType** | **String**| The type of the dependent |<br />**Values**: learning 
| **typeId** | **String**| The type ID of the dependent | 
{: class="table-striped"}


### Return type

[**UsersRulesDependent**](UsersRulesDependent)


# **getUsersRuleDependents**


> [UsersRulesDependentList](UsersRulesDependentList) getUsersRuleDependents(ruleId, pageSize, pageNumber, sortOrder)

Get dependents for a users rule

getUsersRuleDependents is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/users/rules/{ruleId}/dependents  

Requires ANY permissions: 

* users:ruleDependents:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersRulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersRulesApi apiInstance = new UsersRulesApi();
String ruleId = "ruleId_example"; // String | The ID of the rule for which to retrieve dependents
Integer pageSize = 25; // Integer | Number of results per page
Integer pageNumber = 1; // Integer | Page number
String sortOrder = "descending"; // String | Sort order for dependents (by last run date, then created date)
try {
    UsersRulesDependentList result = apiInstance.getUsersRuleDependents(ruleId, pageSize, pageNumber, sortOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersRulesApi#getUsersRuleDependents");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ruleId** | **String**| The ID of the rule for which to retrieve dependents | 
| **pageSize** | **Integer**| Number of results per page | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **sortOrder** | **String**| Sort order for dependents (by last run date, then created date) | [optional] [default to descending]<br />**Values**: ascending, descending 
{: class="table-striped"}


### Return type

[**UsersRulesDependentList**](UsersRulesDependentList)


# **getUsersRules**


> [UsersRulesRuleList](UsersRulesRuleList) getUsersRules(types, pageNumber, pageSize, expand, searchTerm, sortOrder)

Get the list of users rules

getUsersRules is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/users/rules  

Requires ANY permissions: 

* users:rules:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersRulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersRulesApi apiInstance = new UsersRulesApi();
List<String> types = Arrays.asList(null); // List<String> | The types of the rule
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Number of results per page
List<String> expand = Arrays.asList(null); // List<String> | Fields to expand in response
String searchTerm = "searchTerm_example"; // String | a search term for finding a rule by name
String sortOrder = "ascending"; // String | sort rules by name, ascending, descending
try {
    UsersRulesRuleList result = apiInstance.getUsersRules(types, pageNumber, pageSize, expand, searchTerm, sortOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersRulesApi#getUsersRules");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **types** | [**List&lt;String&gt;**](String)| The types of the rule |<br />**Values**: Learning, ActivityPlan 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **pageSize** | **Integer**| Number of results per page | [optional] [default to 25] 
| **expand** | [**List&lt;String&gt;**](String)| Fields to expand in response | [optional]<br />**Values**: criteria 
| **searchTerm** | **String**| a search term for finding a rule by name | [optional] 
| **sortOrder** | **String**| sort rules by name, ascending, descending | [optional] [default to ascending]<br />**Values**: ascending, descending 
{: class="table-striped"}


### Return type

[**UsersRulesRuleList**](UsersRulesRuleList)


# **getUsersRulesSetting**


> [UsersRulesRuleSettings](UsersRulesRuleSettings) getUsersRulesSetting(ruleType)

Get the settings for a specific users rule type

getUsersRulesSetting is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/users/rules/settings/{ruleType}  

Requires ANY permissions: 

* users:rules:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersRulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersRulesApi apiInstance = new UsersRulesApi();
String ruleType = "ruleType_example"; // String | The type of the rule
try {
    UsersRulesRuleSettings result = apiInstance.getUsersRulesSetting(ruleType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersRulesApi#getUsersRulesSetting");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ruleType** | **String**| The type of the rule |<br />**Values**: Learning, ActivityPlan 
{: class="table-striped"}


### Return type

[**UsersRulesRuleSettings**](UsersRulesRuleSettings)


# **patchUsersRule**


> [UsersRulesRule](UsersRulesRule) patchUsersRule(ruleId, body)

Update an existing users rule

This will update an existing users rule with the specified fields.

patchUsersRule is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps PATCH /api/v2/users/rules/{ruleId}  

Requires ANY permissions: 

* users:rules:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersRulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersRulesApi apiInstance = new UsersRulesApi();
String ruleId = "ruleId_example"; // String | The ID of the rule to update
UsersRulesUpdateRuleRequest body = new UsersRulesUpdateRuleRequest(); // UsersRulesUpdateRuleRequest | updateRuleRequest
try {
    UsersRulesRule result = apiInstance.patchUsersRule(ruleId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersRulesApi#patchUsersRule");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ruleId** | **String**| The ID of the rule to update | 
| **body** | [**UsersRulesUpdateRuleRequest**](UsersRulesUpdateRuleRequest)| updateRuleRequest | 
{: class="table-striped"}


### Return type

[**UsersRulesRule**](UsersRulesRule)


# **postUsersRules**


> [UsersRulesRule](UsersRulesRule) postUsersRules(body)

Create a new rule

This will create a new rule with the specified fields.

postUsersRules is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps POST /api/v2/users/rules  

Requires ANY permissions: 

* users:rules:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersRulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersRulesApi apiInstance = new UsersRulesApi();
UsersRulesCreateRuleRequest body = new UsersRulesCreateRuleRequest(); // UsersRulesCreateRuleRequest | usersRulesCreateRuleRequest
try {
    UsersRulesRule result = apiInstance.postUsersRules(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersRulesApi#postUsersRules");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**UsersRulesCreateRuleRequest**](UsersRulesCreateRuleRequest)| usersRulesCreateRuleRequest | 
{: class="table-striped"}


### Return type

[**UsersRulesRule**](UsersRulesRule)


# **postUsersRulesQuery**


> [UsersRulesQueryResponse](UsersRulesQueryResponse) postUsersRulesQuery(body, pageNumber, pageSize)

Query the result of a users rule

This will query the result of a rule.

postUsersRulesQuery is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps POST /api/v2/users/rules/query  

Requires ANY permissions: 

* users:ruleUsers:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersRulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersRulesApi apiInstance = new UsersRulesApi();
UsersRulesQueryRuleRequest body = new UsersRulesQueryRuleRequest(); // UsersRulesQueryRuleRequest | usersRulesQueryRuleRequest
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Number of results per page
try {
    UsersRulesQueryResponse result = apiInstance.postUsersRulesQuery(body, pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersRulesApi#postUsersRulesQuery");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**UsersRulesQueryRuleRequest**](UsersRulesQueryRuleRequest)| usersRulesQueryRuleRequest | 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **pageSize** | **Integer**| Number of results per page | [optional] [default to 25] 
{: class="table-striped"}


### Return type

[**UsersRulesQueryResponse**](UsersRulesQueryResponse)


_com.mypurecloud.sdk.v2:platform-client-v2:244.0.0_
