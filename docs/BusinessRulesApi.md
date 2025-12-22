# BusinessRulesApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**deleteBusinessrulesDecisiontable**](BusinessRulesApi#deleteBusinessrulesDecisiontable) | Delete a decision table |
| [**deleteBusinessrulesDecisiontableVersion**](BusinessRulesApi#deleteBusinessrulesDecisiontableVersion) | Delete a decision table version |
| [**deleteBusinessrulesDecisiontableVersionRow**](BusinessRulesApi#deleteBusinessrulesDecisiontableVersionRow) | Delete a decision table row |
| [**deleteBusinessrulesSchema**](BusinessRulesApi#deleteBusinessrulesSchema) | Delete a schema |
| [**getBusinessrulesDecisiontable**](BusinessRulesApi#getBusinessrulesDecisiontable) | Get a decision table |
| [**getBusinessrulesDecisiontableVersion**](BusinessRulesApi#getBusinessrulesDecisiontableVersion) | Get a decision table version |
| [**getBusinessrulesDecisiontableVersionRow**](BusinessRulesApi#getBusinessrulesDecisiontableVersionRow) | Get a decision table row |
| [**getBusinessrulesDecisiontableVersionRows**](BusinessRulesApi#getBusinessrulesDecisiontableVersionRows) | Get a list of decision table rows. |
| [**getBusinessrulesDecisiontableVersions**](BusinessRulesApi#getBusinessrulesDecisiontableVersions) | Get a list of decision table versions |
| [**getBusinessrulesDecisiontables**](BusinessRulesApi#getBusinessrulesDecisiontables) | Get a list of decision tables. |
| [**getBusinessrulesDecisiontablesSearch**](BusinessRulesApi#getBusinessrulesDecisiontablesSearch) | Search for decision tables. |
| [**getBusinessrulesSchema**](BusinessRulesApi#getBusinessrulesSchema) | Get a schema |
| [**getBusinessrulesSchemas**](BusinessRulesApi#getBusinessrulesSchemas) | Get a list of schemas. |
| [**getBusinessrulesSchemasCoretype**](BusinessRulesApi#getBusinessrulesSchemasCoretype) | Get a specific named core type. |
| [**getBusinessrulesSchemasCoretypes**](BusinessRulesApi#getBusinessrulesSchemasCoretypes) | Get the core types from which all schemas are built. |
| [**patchBusinessrulesDecisiontable**](BusinessRulesApi#patchBusinessrulesDecisiontable) | Update a decision table |
| [**patchBusinessrulesDecisiontableVersion**](BusinessRulesApi#patchBusinessrulesDecisiontableVersion) | Update a decision table version |
| [**postBusinessrulesDecisiontableExecute**](BusinessRulesApi#postBusinessrulesDecisiontableExecute) | Execute a published decision table |
| [**postBusinessrulesDecisiontableVersionCopy**](BusinessRulesApi#postBusinessrulesDecisiontableVersionCopy) | Copy a decision table version |
| [**postBusinessrulesDecisiontableVersionExecute**](BusinessRulesApi#postBusinessrulesDecisiontableVersionExecute) | Execute a decision table version |
| [**postBusinessrulesDecisiontableVersionRows**](BusinessRulesApi#postBusinessrulesDecisiontableVersionRows) | Create a decision table row |
| [**postBusinessrulesDecisiontableVersionRowsSearch**](BusinessRulesApi#postBusinessrulesDecisiontableVersionRowsSearch) | Search for decision table rows |
| [**postBusinessrulesDecisiontableVersionSync**](BusinessRulesApi#postBusinessrulesDecisiontableVersionSync) | Update the Business Rules Schema to the latest version for a given decision table version |
| [**postBusinessrulesDecisiontableVersions**](BusinessRulesApi#postBusinessrulesDecisiontableVersions) | Create a new decision table version |
| [**postBusinessrulesDecisiontables**](BusinessRulesApi#postBusinessrulesDecisiontables) | Create a decision table |
| [**postBusinessrulesSchemas**](BusinessRulesApi#postBusinessrulesSchemas) | Create a schema |
| [**putBusinessrulesDecisiontableVersionPublish**](BusinessRulesApi#putBusinessrulesDecisiontableVersionPublish) | Publish a decision table version |
| [**putBusinessrulesDecisiontableVersionRow**](BusinessRulesApi#putBusinessrulesDecisiontableVersionRow) | Full update a decision table row |
| [**putBusinessrulesSchema**](BusinessRulesApi#putBusinessrulesSchema) | Update a schema |
{: class="table-striped"}


# **deleteBusinessrulesDecisiontable**


> Void deleteBusinessrulesDecisiontable(tableId, forceDelete)

Delete a decision table

Wraps DELETE /api/v2/businessrules/decisiontables/{tableId}  

Requires ANY permissions: 

* businessrules:decisionTable:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.BusinessRulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

BusinessRulesApi apiInstance = new BusinessRulesApi();
String tableId = "tableId_example"; // String | Table ID
Boolean forceDelete = false; // Boolean | Force delete decision table (under certain conditions)
try {
    apiInstance.deleteBusinessrulesDecisiontable(tableId, forceDelete);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessRulesApi#deleteBusinessrulesDecisiontable");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tableId** | **String**| Table ID | 
| **forceDelete** | **Boolean**| Force delete decision table (under certain conditions) | [optional] [default to false] 
{: class="table-striped"}


### Return type

null (empty response body)


# **deleteBusinessrulesDecisiontableVersion**


> Void deleteBusinessrulesDecisiontableVersion(tableId, tableVersion)

Delete a decision table version

Wraps DELETE /api/v2/businessrules/decisiontables/{tableId}/versions/{tableVersion}  

Requires ANY permissions: 

* businessrules:decisionTable:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.BusinessRulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

BusinessRulesApi apiInstance = new BusinessRulesApi();
String tableId = "tableId_example"; // String | Table ID
Integer tableVersion = 56; // Integer | Table Version
try {
    apiInstance.deleteBusinessrulesDecisiontableVersion(tableId, tableVersion);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessRulesApi#deleteBusinessrulesDecisiontableVersion");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tableId** | **String**| Table ID | 
| **tableVersion** | **Integer**| Table Version | 
{: class="table-striped"}


### Return type

null (empty response body)


# **deleteBusinessrulesDecisiontableVersionRow**


> Void deleteBusinessrulesDecisiontableVersionRow(tableId, tableVersion, rowId)

Delete a decision table row

Wraps DELETE /api/v2/businessrules/decisiontables/{tableId}/versions/{tableVersion}/rows/{rowId}  

Requires ALL permissions: 

* businessrules:decisionTableRow:delete
* routing:queue:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.BusinessRulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

BusinessRulesApi apiInstance = new BusinessRulesApi();
String tableId = "tableId_example"; // String | Table ID
Integer tableVersion = 56; // Integer | Table Version
String rowId = "rowId_example"; // String | Row ID
try {
    apiInstance.deleteBusinessrulesDecisiontableVersionRow(tableId, tableVersion, rowId);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessRulesApi#deleteBusinessrulesDecisiontableVersionRow");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tableId** | **String**| Table ID | 
| **tableVersion** | **Integer**| Table Version | 
| **rowId** | **String**| Row ID | 
{: class="table-striped"}


### Return type

null (empty response body)


# **deleteBusinessrulesSchema**


> Void deleteBusinessrulesSchema(schemaId)

Delete a schema

Wraps DELETE /api/v2/businessrules/schemas/{schemaId}  

Requires ANY permissions: 

* businessrules:businessRulesSchema:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.BusinessRulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

BusinessRulesApi apiInstance = new BusinessRulesApi();
String schemaId = "schemaId_example"; // String | Schema ID
try {
    apiInstance.deleteBusinessrulesSchema(schemaId);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessRulesApi#deleteBusinessrulesSchema");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **schemaId** | **String**| Schema ID | 
{: class="table-striped"}


### Return type

null (empty response body)


# **getBusinessrulesDecisiontable**


> [DecisionTable](DecisionTable) getBusinessrulesDecisiontable(tableId)

Get a decision table

Wraps GET /api/v2/businessrules/decisiontables/{tableId}  

Requires ANY permissions: 

* businessrules:decisionTable:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.BusinessRulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

BusinessRulesApi apiInstance = new BusinessRulesApi();
String tableId = "tableId_example"; // String | Table ID
try {
    DecisionTable result = apiInstance.getBusinessrulesDecisiontable(tableId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessRulesApi#getBusinessrulesDecisiontable");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tableId** | **String**| Table ID | 
{: class="table-striped"}


### Return type

[**DecisionTable**](DecisionTable)


# **getBusinessrulesDecisiontableVersion**


> [DecisionTableVersion](DecisionTableVersion) getBusinessrulesDecisiontableVersion(tableId, tableVersion)

Get a decision table version

Wraps GET /api/v2/businessrules/decisiontables/{tableId}/versions/{tableVersion}  

Requires ANY permissions: 

* businessrules:decisionTable:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.BusinessRulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

BusinessRulesApi apiInstance = new BusinessRulesApi();
String tableId = "tableId_example"; // String | Table ID
Integer tableVersion = 56; // Integer | Table Version
try {
    DecisionTableVersion result = apiInstance.getBusinessrulesDecisiontableVersion(tableId, tableVersion);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessRulesApi#getBusinessrulesDecisiontableVersion");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tableId** | **String**| Table ID | 
| **tableVersion** | **Integer**| Table Version | 
{: class="table-striped"}


### Return type

[**DecisionTableVersion**](DecisionTableVersion)


# **getBusinessrulesDecisiontableVersionRow**


> [DecisionTableRow](DecisionTableRow) getBusinessrulesDecisiontableVersionRow(tableId, tableVersion, rowId)

Get a decision table row

Wraps GET /api/v2/businessrules/decisiontables/{tableId}/versions/{tableVersion}/rows/{rowId}  

Requires ANY permissions: 

* businessrules:decisionTableRow:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.BusinessRulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

BusinessRulesApi apiInstance = new BusinessRulesApi();
String tableId = "tableId_example"; // String | Table ID
Integer tableVersion = 56; // Integer | Table Version
String rowId = "rowId_example"; // String | Row ID
try {
    DecisionTableRow result = apiInstance.getBusinessrulesDecisiontableVersionRow(tableId, tableVersion, rowId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessRulesApi#getBusinessrulesDecisiontableVersionRow");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tableId** | **String**| Table ID | 
| **tableVersion** | **Integer**| Table Version | 
| **rowId** | **String**| Row ID | 
{: class="table-striped"}


### Return type

[**DecisionTableRow**](DecisionTableRow)


# **getBusinessrulesDecisiontableVersionRows**


> [DecisionTableRowListing](DecisionTableRowListing) getBusinessrulesDecisiontableVersionRows(tableId, tableVersion, pageNumber, pageSize)

Get a list of decision table rows.

Wraps GET /api/v2/businessrules/decisiontables/{tableId}/versions/{tableVersion}/rows  

Requires ANY permissions: 

* businessrules:decisionTableRow:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.BusinessRulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

BusinessRulesApi apiInstance = new BusinessRulesApi();
String tableId = "tableId_example"; // String | Table ID
Integer tableVersion = 56; // Integer | Table Version
String pageNumber = "pageNumber_example"; // String | Page number of the entities to return. Defaults to 1.
String pageSize = "pageSize_example"; // String | Number of entities to return. Maximum of 100. Defaults to 25.
try {
    DecisionTableRowListing result = apiInstance.getBusinessrulesDecisiontableVersionRows(tableId, tableVersion, pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessRulesApi#getBusinessrulesDecisiontableVersionRows");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tableId** | **String**| Table ID | 
| **tableVersion** | **Integer**| Table Version | 
| **pageNumber** | **String**| Page number of the entities to return. Defaults to 1. | [optional] 
| **pageSize** | **String**| Number of entities to return. Maximum of 100. Defaults to 25. | [optional] 
{: class="table-striped"}


### Return type

[**DecisionTableRowListing**](DecisionTableRowListing)


# **getBusinessrulesDecisiontableVersions**


> [DecisionTableVersionListing](DecisionTableVersionListing) getBusinessrulesDecisiontableVersions(tableId, after, pageSize)

Get a list of decision table versions

Wraps GET /api/v2/businessrules/decisiontables/{tableId}/versions  

Requires ANY permissions: 

* businessrules:decisionTable:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.BusinessRulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

BusinessRulesApi apiInstance = new BusinessRulesApi();
String tableId = "tableId_example"; // String | Table ID
String after = "after_example"; // String | The cursor that points to the end of the set of entities that has been returned.
String pageSize = "pageSize_example"; // String | Number of entities to return. Maximum of 100.
try {
    DecisionTableVersionListing result = apiInstance.getBusinessrulesDecisiontableVersions(tableId, after, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessRulesApi#getBusinessrulesDecisiontableVersions");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tableId** | **String**| Table ID | 
| **after** | **String**| The cursor that points to the end of the set of entities that has been returned. | [optional] 
| **pageSize** | **String**| Number of entities to return. Maximum of 100. | [optional] 
{: class="table-striped"}


### Return type

[**DecisionTableVersionListing**](DecisionTableVersionListing)


# **getBusinessrulesDecisiontables**


> [DecisionTableListing](DecisionTableListing) getBusinessrulesDecisiontables(after, pageSize, divisionIds, name)

Get a list of decision tables.

Wraps GET /api/v2/businessrules/decisiontables  

Requires ANY permissions: 

* businessrules:decisionTable:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.BusinessRulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

BusinessRulesApi apiInstance = new BusinessRulesApi();
String after = "after_example"; // String | The cursor that points to the end of the set of entities that has been returned.
String pageSize = "pageSize_example"; // String | Number of entities to return. Maximum of 100.
List<String> divisionIds = Arrays.asList(null); // List<String> | One or more comma separated divisions to filters decision tables by. If nothing is provided, the decision tables associated with the list of divisions that the user has access to will be returned.
String name = "name_example"; // String | Search for decision tables with a name that contains the given search string. Search is case insensitive and will match any table that contains this string in any part of the name.
try {
    DecisionTableListing result = apiInstance.getBusinessrulesDecisiontables(after, pageSize, divisionIds, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessRulesApi#getBusinessrulesDecisiontables");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **after** | **String**| The cursor that points to the end of the set of entities that has been returned. | [optional] 
| **pageSize** | **String**| Number of entities to return. Maximum of 100. | [optional] 
| **divisionIds** | [**List&lt;String&gt;**](String)| One or more comma separated divisions to filters decision tables by. If nothing is provided, the decision tables associated with the list of divisions that the user has access to will be returned. | [optional] 
| **name** | **String**| Search for decision tables with a name that contains the given search string. Search is case insensitive and will match any table that contains this string in any part of the name. | [optional] 
{: class="table-striped"}


### Return type

[**DecisionTableListing**](DecisionTableListing)


# **getBusinessrulesDecisiontablesSearch**


> [DecisionTableListing](DecisionTableListing) getBusinessrulesDecisiontablesSearch(after, pageSize, schemaId, name, withPublishedVersion, expand, ids)

Search for decision tables.

Wraps GET /api/v2/businessrules/decisiontables/search  

Requires ANY permissions: 

* businessrules:decisionTable:search

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.BusinessRulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

BusinessRulesApi apiInstance = new BusinessRulesApi();
String after = "after_example"; // String | The cursor that points to the end of the set of entities that has been returned.
String pageSize = "pageSize_example"; // String | Number of entities to return. Maximum of 100.
String schemaId = "schemaId_example"; // String | Search for decision tables that use the schema with this ID. Cannot be combined with name search. Search results will not be paginated if used.
String name = "name_example"; // String | Search for decision tables with a name that contains the given search string. Search is case insensitive and will match any table that contains this string in any part of the name. Cannot be combined with schema search. Search results will not be paginated if used.
Boolean withPublishedVersion = true; // Boolean | Filters results to only decision tables that have at least one version in Published status
List<String> expand = Arrays.asList(null); // List<String> | Fields to expand in response
List<String> ids = Arrays.asList(null); // List<String> | Decision table IDs to search for
try {
    DecisionTableListing result = apiInstance.getBusinessrulesDecisiontablesSearch(after, pageSize, schemaId, name, withPublishedVersion, expand, ids);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessRulesApi#getBusinessrulesDecisiontablesSearch");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **after** | **String**| The cursor that points to the end of the set of entities that has been returned. | [optional] 
| **pageSize** | **String**| Number of entities to return. Maximum of 100. | [optional] 
| **schemaId** | **String**| Search for decision tables that use the schema with this ID. Cannot be combined with name search. Search results will not be paginated if used. | [optional] 
| **name** | **String**| Search for decision tables with a name that contains the given search string. Search is case insensitive and will match any table that contains this string in any part of the name. Cannot be combined with schema search. Search results will not be paginated if used. | [optional] 
| **withPublishedVersion** | **Boolean**| Filters results to only decision tables that have at least one version in Published status | [optional] 
| **expand** | [**List&lt;String&gt;**](String)| Fields to expand in response | [optional]<br />**Values**: ExecutionInputSchema, ExecutionOutputSchema 
| **ids** | [**List&lt;String&gt;**](String)| Decision table IDs to search for | [optional] 
{: class="table-striped"}


### Return type

[**DecisionTableListing**](DecisionTableListing)


# **getBusinessrulesSchema**


> [BusinessRulesDataSchema](BusinessRulesDataSchema) getBusinessrulesSchema(schemaId)

Get a schema

Wraps GET /api/v2/businessrules/schemas/{schemaId}  

Requires ANY permissions: 

* businessrules:businessRulesSchema:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.BusinessRulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

BusinessRulesApi apiInstance = new BusinessRulesApi();
String schemaId = "schemaId_example"; // String | Schema ID
try {
    BusinessRulesDataSchema result = apiInstance.getBusinessrulesSchema(schemaId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessRulesApi#getBusinessrulesSchema");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **schemaId** | **String**| Schema ID | 
{: class="table-striped"}


### Return type

[**BusinessRulesDataSchema**](BusinessRulesDataSchema)


# **getBusinessrulesSchemas**


> [BusinessRulesDataSchemaListing](BusinessRulesDataSchemaListing) getBusinessrulesSchemas()

Get a list of schemas.

Wraps GET /api/v2/businessrules/schemas  

Requires ANY permissions: 

* businessrules:businessRulesSchema:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.BusinessRulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

BusinessRulesApi apiInstance = new BusinessRulesApi();
try {
    BusinessRulesDataSchemaListing result = apiInstance.getBusinessrulesSchemas();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessRulesApi#getBusinessrulesSchemas");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**BusinessRulesDataSchemaListing**](BusinessRulesDataSchemaListing)


# **getBusinessrulesSchemasCoretype**


> [Coretype](Coretype) getBusinessrulesSchemasCoretype(coreTypeName)

Get a specific named core type.

Wraps GET /api/v2/businessrules/schemas/coretypes/{coreTypeName}  

Requires ANY permissions: 

* businessrules:businessRulesSchema:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.BusinessRulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

BusinessRulesApi apiInstance = new BusinessRulesApi();
String coreTypeName = "coreTypeName_example"; // String | The core type's name
try {
    Coretype result = apiInstance.getBusinessrulesSchemasCoretype(coreTypeName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessRulesApi#getBusinessrulesSchemasCoretype");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **coreTypeName** | **String**| The core type&#39;s name | 
{: class="table-striped"}


### Return type

[**Coretype**](Coretype)


# **getBusinessrulesSchemasCoretypes**


> [CoretypeListing](CoretypeListing) getBusinessrulesSchemasCoretypes()

Get the core types from which all schemas are built.

Wraps GET /api/v2/businessrules/schemas/coretypes  

Requires ANY permissions: 

* businessrules:businessRulesSchema:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.BusinessRulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

BusinessRulesApi apiInstance = new BusinessRulesApi();
try {
    CoretypeListing result = apiInstance.getBusinessrulesSchemasCoretypes();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessRulesApi#getBusinessrulesSchemasCoretypes");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**CoretypeListing**](CoretypeListing)


# **patchBusinessrulesDecisiontable**


> [DecisionTable](DecisionTable) patchBusinessrulesDecisiontable(tableId, body)

Update a decision table

Wraps PATCH /api/v2/businessrules/decisiontables/{tableId}  

Requires ALL permissions: 

* businessrules:decisionTable:edit
* businessrules:businessRulesSchema:view
* routing:queue:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.BusinessRulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

BusinessRulesApi apiInstance = new BusinessRulesApi();
String tableId = "tableId_example"; // String | Table ID
UpdateDecisionTableRequest body = new UpdateDecisionTableRequest(); // UpdateDecisionTableRequest | Decision Table
try {
    DecisionTable result = apiInstance.patchBusinessrulesDecisiontable(tableId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessRulesApi#patchBusinessrulesDecisiontable");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tableId** | **String**| Table ID | 
| **body** | [**UpdateDecisionTableRequest**](UpdateDecisionTableRequest)| Decision Table | 
{: class="table-striped"}


### Return type

[**DecisionTable**](DecisionTable)


# **patchBusinessrulesDecisiontableVersion**


> [DecisionTableVersion](DecisionTableVersion) patchBusinessrulesDecisiontableVersion(tableId, tableVersion, body)

Update a decision table version

Wraps PATCH /api/v2/businessrules/decisiontables/{tableId}/versions/{tableVersion}  

Requires ANY permissions: 

* businessrules:decisionTable:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.BusinessRulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

BusinessRulesApi apiInstance = new BusinessRulesApi();
String tableId = "tableId_example"; // String | Table ID
Integer tableVersion = 56; // Integer | Table Version
UpdateDecisionTableVersionRequest body = new UpdateDecisionTableVersionRequest(); // UpdateDecisionTableVersionRequest | Decision Table
try {
    DecisionTableVersion result = apiInstance.patchBusinessrulesDecisiontableVersion(tableId, tableVersion, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessRulesApi#patchBusinessrulesDecisiontableVersion");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tableId** | **String**| Table ID | 
| **tableVersion** | **Integer**| Table Version | 
| **body** | [**UpdateDecisionTableVersionRequest**](UpdateDecisionTableVersionRequest)| Decision Table | 
{: class="table-striped"}


### Return type

[**DecisionTableVersion**](DecisionTableVersion)


# **postBusinessrulesDecisiontableExecute**


> [DecisionTableExecutionResponse](DecisionTableExecutionResponse) postBusinessrulesDecisiontableExecute(tableId, body)

Execute a published decision table

Wraps POST /api/v2/businessrules/decisiontables/{tableId}/execute  

Requires ANY permissions: 

* businessrules:decisionTable:execute

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.BusinessRulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

BusinessRulesApi apiInstance = new BusinessRulesApi();
String tableId = "tableId_example"; // String | Table ID
DecisionTableExecutionRequest body = new DecisionTableExecutionRequest(); // DecisionTableExecutionRequest | Decision Table
try {
    DecisionTableExecutionResponse result = apiInstance.postBusinessrulesDecisiontableExecute(tableId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessRulesApi#postBusinessrulesDecisiontableExecute");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tableId** | **String**| Table ID | 
| **body** | [**DecisionTableExecutionRequest**](DecisionTableExecutionRequest)| Decision Table | 
{: class="table-striped"}


### Return type

[**DecisionTableExecutionResponse**](DecisionTableExecutionResponse)


# **postBusinessrulesDecisiontableVersionCopy**


> [DecisionTableVersion](DecisionTableVersion) postBusinessrulesDecisiontableVersionCopy(tableId, tableVersion, body)

Copy a decision table version

Wraps POST /api/v2/businessrules/decisiontables/{tableId}/versions/{tableVersion}/copy  

Requires ANY permissions: 

* businessrules:decisionTable:copy

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.BusinessRulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

BusinessRulesApi apiInstance = new BusinessRulesApi();
String tableId = "tableId_example"; // String | Table ID
Integer tableVersion = 56; // Integer | Table Version
CopyDecisionTableRequest body = new CopyDecisionTableRequest(); // CopyDecisionTableRequest | Decision Table
try {
    DecisionTableVersion result = apiInstance.postBusinessrulesDecisiontableVersionCopy(tableId, tableVersion, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessRulesApi#postBusinessrulesDecisiontableVersionCopy");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tableId** | **String**| Table ID | 
| **tableVersion** | **Integer**| Table Version | 
| **body** | [**CopyDecisionTableRequest**](CopyDecisionTableRequest)| Decision Table | 
{: class="table-striped"}


### Return type

[**DecisionTableVersion**](DecisionTableVersion)


# **postBusinessrulesDecisiontableVersionExecute**


> [DecisionTableExecutionResponse](DecisionTableExecutionResponse) postBusinessrulesDecisiontableVersionExecute(tableId, tableVersion, body)

Execute a decision table version

Wraps POST /api/v2/businessrules/decisiontables/{tableId}/versions/{tableVersion}/execute  

Requires ANY permissions: 

* businessrules:decisionTable:execute

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.BusinessRulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

BusinessRulesApi apiInstance = new BusinessRulesApi();
String tableId = "tableId_example"; // String | Table ID
Integer tableVersion = 56; // Integer | Table Version
DecisionTableExecutionRequest body = new DecisionTableExecutionRequest(); // DecisionTableExecutionRequest | Decision Table
try {
    DecisionTableExecutionResponse result = apiInstance.postBusinessrulesDecisiontableVersionExecute(tableId, tableVersion, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessRulesApi#postBusinessrulesDecisiontableVersionExecute");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tableId** | **String**| Table ID | 
| **tableVersion** | **Integer**| Table Version | 
| **body** | [**DecisionTableExecutionRequest**](DecisionTableExecutionRequest)| Decision Table | 
{: class="table-striped"}


### Return type

[**DecisionTableExecutionResponse**](DecisionTableExecutionResponse)


# **postBusinessrulesDecisiontableVersionRows**


> [DecisionTableRow](DecisionTableRow) postBusinessrulesDecisiontableVersionRows(tableId, tableVersion, body)

Create a decision table row

Wraps POST /api/v2/businessrules/decisiontables/{tableId}/versions/{tableVersion}/rows  

Requires ALL permissions: 

* businessrules:decisionTableRow:add
* routing:queue:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.BusinessRulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

BusinessRulesApi apiInstance = new BusinessRulesApi();
String tableId = "tableId_example"; // String | Table ID
Integer tableVersion = 56; // Integer | Table Version
CreateDecisionTableRowRequest body = new CreateDecisionTableRowRequest(); // CreateDecisionTableRowRequest | Create decision table row request
try {
    DecisionTableRow result = apiInstance.postBusinessrulesDecisiontableVersionRows(tableId, tableVersion, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessRulesApi#postBusinessrulesDecisiontableVersionRows");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tableId** | **String**| Table ID | 
| **tableVersion** | **Integer**| Table Version | 
| **body** | [**CreateDecisionTableRowRequest**](CreateDecisionTableRowRequest)| Create decision table row request | 
{: class="table-striped"}


### Return type

[**DecisionTableRow**](DecisionTableRow)


# **postBusinessrulesDecisiontableVersionRowsSearch**


> [DecisionTableRowListing](DecisionTableRowListing) postBusinessrulesDecisiontableVersionRowsSearch(tableId, tableVersion, body, pageNumber, pageSize)

Search for decision table rows

Wraps POST /api/v2/businessrules/decisiontables/{tableId}/versions/{tableVersion}/rows/search  

Requires ANY permissions: 

* businessrules:decisionTableRow:search

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.BusinessRulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

BusinessRulesApi apiInstance = new BusinessRulesApi();
String tableId = "tableId_example"; // String | Table ID
Integer tableVersion = 56; // Integer | Table Version
SearchDecisionTableRowsRequest body = new SearchDecisionTableRowsRequest(); // SearchDecisionTableRowsRequest | Search decision table rows request
String pageNumber = "pageNumber_example"; // String | Page number of the entities to return. Defaults to 1.
String pageSize = "pageSize_example"; // String | Number of entities to return. Maximum of 100. Defaults to 25.
try {
    DecisionTableRowListing result = apiInstance.postBusinessrulesDecisiontableVersionRowsSearch(tableId, tableVersion, body, pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessRulesApi#postBusinessrulesDecisiontableVersionRowsSearch");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tableId** | **String**| Table ID | 
| **tableVersion** | **Integer**| Table Version | 
| **body** | [**SearchDecisionTableRowsRequest**](SearchDecisionTableRowsRequest)| Search decision table rows request | 
| **pageNumber** | **String**| Page number of the entities to return. Defaults to 1. | [optional] 
| **pageSize** | **String**| Number of entities to return. Maximum of 100. Defaults to 25. | [optional] 
{: class="table-striped"}


### Return type

[**DecisionTableRowListing**](DecisionTableRowListing)


# **postBusinessrulesDecisiontableVersionSync**


> [DecisionTableVersion](DecisionTableVersion) postBusinessrulesDecisiontableVersionSync(tableId, tableVersion)

Update the Business Rules Schema to the latest version for a given decision table version

Wraps POST /api/v2/businessrules/decisiontables/{tableId}/versions/{tableVersion}/sync  

Requires ANY permissions: 

* businessrules:decisionTable:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.BusinessRulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

BusinessRulesApi apiInstance = new BusinessRulesApi();
String tableId = "tableId_example"; // String | Table ID
Integer tableVersion = 56; // Integer | Table Version
try {
    DecisionTableVersion result = apiInstance.postBusinessrulesDecisiontableVersionSync(tableId, tableVersion);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessRulesApi#postBusinessrulesDecisiontableVersionSync");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tableId** | **String**| Table ID | 
| **tableVersion** | **Integer**| Table Version | 
{: class="table-striped"}


### Return type

[**DecisionTableVersion**](DecisionTableVersion)


# **postBusinessrulesDecisiontableVersions**


> [DecisionTableVersion](DecisionTableVersion) postBusinessrulesDecisiontableVersions(tableId)

Create a new decision table version

Wraps POST /api/v2/businessrules/decisiontables/{tableId}/versions  

Requires ANY permissions: 

* businessrules:decisionTable:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.BusinessRulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

BusinessRulesApi apiInstance = new BusinessRulesApi();
String tableId = "tableId_example"; // String | Table ID
try {
    DecisionTableVersion result = apiInstance.postBusinessrulesDecisiontableVersions(tableId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessRulesApi#postBusinessrulesDecisiontableVersions");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tableId** | **String**| Table ID | 
{: class="table-striped"}


### Return type

[**DecisionTableVersion**](DecisionTableVersion)


# **postBusinessrulesDecisiontables**


> [DecisionTableVersion](DecisionTableVersion) postBusinessrulesDecisiontables(body)

Create a decision table

Wraps POST /api/v2/businessrules/decisiontables  

Requires ALL permissions: 

* businessrules:decisionTable:add
* businessrules:businessRulesSchema:view
* routing:queue:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.BusinessRulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

BusinessRulesApi apiInstance = new BusinessRulesApi();
CreateDecisionTableRequest body = new CreateDecisionTableRequest(); // CreateDecisionTableRequest | Decision Table
try {
    DecisionTableVersion result = apiInstance.postBusinessrulesDecisiontables(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessRulesApi#postBusinessrulesDecisiontables");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**CreateDecisionTableRequest**](CreateDecisionTableRequest)| Decision Table | 
{: class="table-striped"}


### Return type

[**DecisionTableVersion**](DecisionTableVersion)


# **postBusinessrulesSchemas**


> [BusinessRulesDataSchema](BusinessRulesDataSchema) postBusinessrulesSchemas(body)

Create a schema

Wraps POST /api/v2/businessrules/schemas  

Requires ANY permissions: 

* businessrules:businessRulesSchema:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.BusinessRulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

BusinessRulesApi apiInstance = new BusinessRulesApi();
BusinessRulesSchemaCreateRequest body = new BusinessRulesSchemaCreateRequest(); // BusinessRulesSchemaCreateRequest | Business Rules Schema Create Request
try {
    BusinessRulesDataSchema result = apiInstance.postBusinessrulesSchemas(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessRulesApi#postBusinessrulesSchemas");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**BusinessRulesSchemaCreateRequest**](BusinessRulesSchemaCreateRequest)| Business Rules Schema Create Request | 
{: class="table-striped"}


### Return type

[**BusinessRulesDataSchema**](BusinessRulesDataSchema)


# **putBusinessrulesDecisiontableVersionPublish**


> [DecisionTableVersion](DecisionTableVersion) putBusinessrulesDecisiontableVersionPublish(tableId, tableVersion)

Publish a decision table version

Wraps PUT /api/v2/businessrules/decisiontables/{tableId}/versions/{tableVersion}/publish  

Requires ANY permissions: 

* businessrules:decisionTable:publish

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.BusinessRulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

BusinessRulesApi apiInstance = new BusinessRulesApi();
String tableId = "tableId_example"; // String | Table ID
Integer tableVersion = 56; // Integer | Table Version
try {
    DecisionTableVersion result = apiInstance.putBusinessrulesDecisiontableVersionPublish(tableId, tableVersion);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessRulesApi#putBusinessrulesDecisiontableVersionPublish");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tableId** | **String**| Table ID | 
| **tableVersion** | **Integer**| Table Version | 
{: class="table-striped"}


### Return type

[**DecisionTableVersion**](DecisionTableVersion)


# **putBusinessrulesDecisiontableVersionRow**


> [DecisionTableRow](DecisionTableRow) putBusinessrulesDecisiontableVersionRow(tableId, tableVersion, rowId, body)

Full update a decision table row

Wraps PUT /api/v2/businessrules/decisiontables/{tableId}/versions/{tableVersion}/rows/{rowId}  

Requires ALL permissions: 

* businessrules:decisionTableRow:edit
* routing:queue:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.BusinessRulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

BusinessRulesApi apiInstance = new BusinessRulesApi();
String tableId = "tableId_example"; // String | Table ID
Integer tableVersion = 56; // Integer | Table Version
String rowId = "rowId_example"; // String | Row ID
PutDecisionTableRowRequest body = new PutDecisionTableRowRequest(); // PutDecisionTableRowRequest | Full update decision table row request
try {
    DecisionTableRow result = apiInstance.putBusinessrulesDecisiontableVersionRow(tableId, tableVersion, rowId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessRulesApi#putBusinessrulesDecisiontableVersionRow");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tableId** | **String**| Table ID | 
| **tableVersion** | **Integer**| Table Version | 
| **rowId** | **String**| Row ID | 
| **body** | [**PutDecisionTableRowRequest**](PutDecisionTableRowRequest)| Full update decision table row request | 
{: class="table-striped"}


### Return type

[**DecisionTableRow**](DecisionTableRow)


# **putBusinessrulesSchema**


> [BusinessRulesDataSchema](BusinessRulesDataSchema) putBusinessrulesSchema(schemaId, body)

Update a schema

Wraps PUT /api/v2/businessrules/schemas/{schemaId}  

Requires ANY permissions: 

* businessrules:businessRulesSchema:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.BusinessRulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

BusinessRulesApi apiInstance = new BusinessRulesApi();
String schemaId = "schemaId_example"; // String | Schema ID
BusinessRulesSchemaUpdateRequest body = new BusinessRulesSchemaUpdateRequest(); // BusinessRulesSchemaUpdateRequest | Business Rules Schema Update Request
try {
    BusinessRulesDataSchema result = apiInstance.putBusinessrulesSchema(schemaId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessRulesApi#putBusinessrulesSchema");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **schemaId** | **String**| Schema ID | 
| **body** | [**BusinessRulesSchemaUpdateRequest**](BusinessRulesSchemaUpdateRequest)| Business Rules Schema Update Request | 
{: class="table-striped"}


### Return type

[**BusinessRulesDataSchema**](BusinessRulesDataSchema)


_com.mypurecloud.sdk.v2:platform-client-v2:241.0.0_
