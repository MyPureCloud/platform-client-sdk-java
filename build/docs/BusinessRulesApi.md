# BusinessRulesApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**deleteBusinessrulesDecisiontable**](BusinessRulesApi#deleteBusinessrulesDecisiontable) | Delete a decision table |
| [**deleteBusinessrulesDecisiontableExport**](BusinessRulesApi#deleteBusinessrulesDecisiontableExport) | Delete an export job for a decision table |
| [**deleteBusinessrulesDecisiontableImport**](BusinessRulesApi#deleteBusinessrulesDecisiontableImport) | Delete decision table row import job |
| [**deleteBusinessrulesDecisiontableVersion**](BusinessRulesApi#deleteBusinessrulesDecisiontableVersion) | Delete a decision table version |
| [**deleteBusinessrulesDecisiontableVersionRow**](BusinessRulesApi#deleteBusinessrulesDecisiontableVersionRow) | Delete a decision table row |
| [**deleteBusinessrulesDecisiontableVersionSnapshot**](BusinessRulesApi#deleteBusinessrulesDecisiontableVersionSnapshot) | Deletes a decision table version snapshot |
| [**deleteBusinessrulesSchema**](BusinessRulesApi#deleteBusinessrulesSchema) | Delete a schema |
| [**getBusinessrulesDecisiontable**](BusinessRulesApi#getBusinessrulesDecisiontable) | Get a decision table |
| [**getBusinessrulesDecisiontableExport**](BusinessRulesApi#getBusinessrulesDecisiontableExport) | Get an export job for a decision table |
| [**getBusinessrulesDecisiontableExports**](BusinessRulesApi#getBusinessrulesDecisiontableExports) | List export jobs for a decision table |
| [**getBusinessrulesDecisiontableImport**](BusinessRulesApi#getBusinessrulesDecisiontableImport) | Get decision table row import job |
| [**getBusinessrulesDecisiontableImports**](BusinessRulesApi#getBusinessrulesDecisiontableImports) | List decision table row import jobs |
| [**getBusinessrulesDecisiontableVersion**](BusinessRulesApi#getBusinessrulesDecisiontableVersion) | Get a decision table version |
| [**getBusinessrulesDecisiontableVersionRow**](BusinessRulesApi#getBusinessrulesDecisiontableVersionRow) | Get a decision table row |
| [**getBusinessrulesDecisiontableVersionRows**](BusinessRulesApi#getBusinessrulesDecisiontableVersionRows) | Get a list of decision table rows. |
| [**getBusinessrulesDecisiontableVersions**](BusinessRulesApi#getBusinessrulesDecisiontableVersions) | Get a list of decision table versions |
| [**getBusinessrulesDecisiontables**](BusinessRulesApi#getBusinessrulesDecisiontables) | Get a list of decision tables. |
| [**getBusinessrulesDecisiontablesSearch**](BusinessRulesApi#getBusinessrulesDecisiontablesSearch) | Search for decision tables. |
| [**getBusinessrulesSchema**](BusinessRulesApi#getBusinessrulesSchema) | Get a schema |
| [**getBusinessrulesSchemaVersion**](BusinessRulesApi#getBusinessrulesSchemaVersion) | Get a schema version |
| [**getBusinessrulesSchemaVersions**](BusinessRulesApi#getBusinessrulesSchemaVersions) | List schema versions |
| [**getBusinessrulesSchemas**](BusinessRulesApi#getBusinessrulesSchemas) | Get a list of schemas. |
| [**getBusinessrulesSchemasCoretype**](BusinessRulesApi#getBusinessrulesSchemasCoretype) | Get a specific named core type. |
| [**getBusinessrulesSchemasCoretypes**](BusinessRulesApi#getBusinessrulesSchemasCoretypes) | Get the core types from which all schemas are built. |
| [**patchBusinessrulesDecisiontable**](BusinessRulesApi#patchBusinessrulesDecisiontable) | Update a decision table |
| [**patchBusinessrulesDecisiontableImport**](BusinessRulesApi#patchBusinessrulesDecisiontableImport) | Update decision table row import job |
| [**patchBusinessrulesDecisiontableVersion**](BusinessRulesApi#patchBusinessrulesDecisiontableVersion) | Update a decision table version |
| [**postBusinessrulesDecisiontableExecute**](BusinessRulesApi#postBusinessrulesDecisiontableExecute) | Execute a published decision table |
| [**postBusinessrulesDecisiontableExports**](BusinessRulesApi#postBusinessrulesDecisiontableExports) | Create an export job for a decision table version |
| [**postBusinessrulesDecisiontableImports**](BusinessRulesApi#postBusinessrulesDecisiontableImports) | Create a decision table row import job |
| [**postBusinessrulesDecisiontableVersionCopy**](BusinessRulesApi#postBusinessrulesDecisiontableVersionCopy) | Copy a decision table version |
| [**postBusinessrulesDecisiontableVersionExecute**](BusinessRulesApi#postBusinessrulesDecisiontableVersionExecute) | Execute a decision table version |
| [**postBusinessrulesDecisiontableVersionRollback**](BusinessRulesApi#postBusinessrulesDecisiontableVersionRollback) | Re-publish a superseded decision table version as the current published version |
| [**postBusinessrulesDecisiontableVersionRows**](BusinessRulesApi#postBusinessrulesDecisiontableVersionRows) | Create a decision table row |
| [**postBusinessrulesDecisiontableVersionRowsBulkAdd**](BusinessRulesApi#postBusinessrulesDecisiontableVersionRowsBulkAdd) | Bulk add decision table rows |
| [**postBusinessrulesDecisiontableVersionRowsBulkRemove**](BusinessRulesApi#postBusinessrulesDecisiontableVersionRowsBulkRemove) | Bulk delete decision table rows |
| [**postBusinessrulesDecisiontableVersionRowsBulkUpdate**](BusinessRulesApi#postBusinessrulesDecisiontableVersionRowsBulkUpdate) | Bulk update decision table rows |
| [**postBusinessrulesDecisiontableVersionRowsSearch**](BusinessRulesApi#postBusinessrulesDecisiontableVersionRowsSearch) | Search for decision table rows |
| [**postBusinessrulesDecisiontableVersionSnapshot**](BusinessRulesApi#postBusinessrulesDecisiontableVersionSnapshot) | Creates a decision table version snapshot |
| [**postBusinessrulesDecisiontableVersionSync**](BusinessRulesApi#postBusinessrulesDecisiontableVersionSync) | Update the Business Rules Schema to the latest version for a given decision table version |
| [**postBusinessrulesDecisiontableVersions**](BusinessRulesApi#postBusinessrulesDecisiontableVersions) | Create a new decision table version. When sourceVersion is not provided, the draft is created from the published version. |
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


# **deleteBusinessrulesDecisiontableExport**


> Void deleteBusinessrulesDecisiontableExport(tableId, exportJobId)

Delete an export job for a decision table

Wraps DELETE /api/v2/businessrules/decisiontables/{tableId}/exports/{exportJobId}  

Requires ANY permissions: 

* businessrules:decisionTableExportJob:delete

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
String exportJobId = "exportJobId_example"; // String | Export Job ID
try {
    apiInstance.deleteBusinessrulesDecisiontableExport(tableId, exportJobId);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessRulesApi#deleteBusinessrulesDecisiontableExport");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tableId** | **String**| Table ID | 
| **exportJobId** | **String**| Export Job ID | 
{: class="table-striped"}


### Return type

null (empty response body)


# **deleteBusinessrulesDecisiontableImport**


> Void deleteBusinessrulesDecisiontableImport(tableId, importJobId)

Delete decision table row import job

Wraps DELETE /api/v2/businessrules/decisiontables/{tableId}/imports/{importJobId}  

Requires ANY permissions: 

* businessrules:decisionTableImportJob:delete

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
String importJobId = "importJobId_example"; // String | Import job ID
try {
    apiInstance.deleteBusinessrulesDecisiontableImport(tableId, importJobId);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessRulesApi#deleteBusinessrulesDecisiontableImport");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tableId** | **String**| Table ID | 
| **importJobId** | **String**| Import job ID | 
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

Required permissions depend on table content: if the table or row contains queue references, routing:queue:view is required in each queue's division. Future platform objects will require their associated permissions in the relevant divisions when the table or row contains references to them.

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


# **deleteBusinessrulesDecisiontableVersionSnapshot**


> Void deleteBusinessrulesDecisiontableVersionSnapshot(tableId, tableVersion)

Deletes a decision table version snapshot

Wraps DELETE /api/v2/businessrules/decisiontables/{tableId}/versions/{tableVersion}/snapshot  

Requires ANY permissions: 

* businessrules:decisionTableSnapshot:delete

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
    apiInstance.deleteBusinessrulesDecisiontableVersionSnapshot(tableId, tableVersion);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessRulesApi#deleteBusinessrulesDecisiontableVersionSnapshot");
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


# **getBusinessrulesDecisiontableExport**


> [DecisionTableExportJob](DecisionTableExportJob) getBusinessrulesDecisiontableExport(tableId, exportJobId)

Get an export job for a decision table

Wraps GET /api/v2/businessrules/decisiontables/{tableId}/exports/{exportJobId}  

Requires ANY permissions: 

* businessrules:decisionTableExportJob:view

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
String exportJobId = "exportJobId_example"; // String | Export Job ID
try {
    DecisionTableExportJob result = apiInstance.getBusinessrulesDecisiontableExport(tableId, exportJobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessRulesApi#getBusinessrulesDecisiontableExport");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tableId** | **String**| Table ID | 
| **exportJobId** | **String**| Export Job ID | 
{: class="table-striped"}


### Return type

[**DecisionTableExportJob**](DecisionTableExportJob)


# **getBusinessrulesDecisiontableExports**


> [DecisionTableExportJobListing](DecisionTableExportJobListing) getBusinessrulesDecisiontableExports(tableId, after, pageSize)

List export jobs for a decision table

Wraps GET /api/v2/businessrules/decisiontables/{tableId}/exports  

Requires ANY permissions: 

* businessrules:decisionTableExportJob:view

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
    DecisionTableExportJobListing result = apiInstance.getBusinessrulesDecisiontableExports(tableId, after, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessRulesApi#getBusinessrulesDecisiontableExports");
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

[**DecisionTableExportJobListing**](DecisionTableExportJobListing)


# **getBusinessrulesDecisiontableImport**


> [DecisionTableImportJob](DecisionTableImportJob) getBusinessrulesDecisiontableImport(tableId, importJobId)

Get decision table row import job

Wraps GET /api/v2/businessrules/decisiontables/{tableId}/imports/{importJobId}  

Requires ANY permissions: 

* businessrules:decisionTableImportJob:view

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
String importJobId = "importJobId_example"; // String | Import job ID
try {
    DecisionTableImportJob result = apiInstance.getBusinessrulesDecisiontableImport(tableId, importJobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessRulesApi#getBusinessrulesDecisiontableImport");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tableId** | **String**| Table ID | 
| **importJobId** | **String**| Import job ID | 
{: class="table-striped"}


### Return type

[**DecisionTableImportJob**](DecisionTableImportJob)


# **getBusinessrulesDecisiontableImports**


> [DecisionTableImportJobListing](DecisionTableImportJobListing) getBusinessrulesDecisiontableImports(tableId, after, pageSize)

List decision table row import jobs

Wraps GET /api/v2/businessrules/decisiontables/{tableId}/imports  

Requires ANY permissions: 

* businessrules:decisionTableImportJob:view

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
    DecisionTableImportJobListing result = apiInstance.getBusinessrulesDecisiontableImports(tableId, after, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessRulesApi#getBusinessrulesDecisiontableImports");
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

[**DecisionTableImportJobListing**](DecisionTableImportJobListing)


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


> [DecisionTableVersionListing](DecisionTableVersionListing) getBusinessrulesDecisiontableVersions(tableId, after, pageSize, status, hasSnapshot)

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
List<String> status = Arrays.asList(null); // List<String> | Filter by version status. Repeatable.
Boolean hasSnapshot = true; // Boolean | When true, returns only versions that have snapshot metadata.
try {
    DecisionTableVersionListing result = apiInstance.getBusinessrulesDecisiontableVersions(tableId, after, pageSize, status, hasSnapshot);
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
| **status** | [**List&lt;String&gt;**](String)| Filter by version status. Repeatable. | [optional]<br />**Values**: Draft, Published, Error, Preparing, Superseded 
| **hasSnapshot** | **Boolean**| When true, returns only versions that have snapshot metadata. | [optional] 
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


# **getBusinessrulesSchemaVersion**


> [BusinessRulesDataSchema](BusinessRulesDataSchema) getBusinessrulesSchemaVersion(schemaId, schemaVersion)

Get a schema version

Wraps GET /api/v2/businessrules/schemas/{schemaId}/versions/{schemaVersion}  

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
String schemaVersion = "schemaVersion_example"; // String | Schema version number
try {
    BusinessRulesDataSchema result = apiInstance.getBusinessrulesSchemaVersion(schemaId, schemaVersion);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessRulesApi#getBusinessrulesSchemaVersion");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **schemaId** | **String**| Schema ID | 
| **schemaVersion** | **String**| Schema version number | 
{: class="table-striped"}


### Return type

[**BusinessRulesDataSchema**](BusinessRulesDataSchema)


# **getBusinessrulesSchemaVersions**


> [BusinessRulesDataSchemaListing](BusinessRulesDataSchemaListing) getBusinessrulesSchemaVersions(schemaId, before, after, pageSize)

List schema versions

Wraps GET /api/v2/businessrules/schemas/{schemaId}/versions  

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
String before = "before_example"; // String | The cursor that points to the start of the set of entities that has been returned.
String after = "after_example"; // String | The cursor that points to the end of the set of entities that has been returned.
String pageSize = "pageSize_example"; // String | Number of items per page (must be between 1 and 100)
try {
    BusinessRulesDataSchemaListing result = apiInstance.getBusinessrulesSchemaVersions(schemaId, before, after, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessRulesApi#getBusinessrulesSchemaVersions");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **schemaId** | **String**| Schema ID | 
| **before** | **String**| The cursor that points to the start of the set of entities that has been returned. | [optional] 
| **after** | **String**| The cursor that points to the end of the set of entities that has been returned. | [optional] 
| **pageSize** | **String**| Number of items per page (must be between 1 and 100) | [optional] 
{: class="table-striped"}


### Return type

[**BusinessRulesDataSchemaListing**](BusinessRulesDataSchemaListing)


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

Required permissions depend on table content: if the table or row contains queue references, routing:queue:view is required in each queue's division. Future platform objects will require their associated permissions in the relevant divisions when the table or row contains references to them.

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


# **patchBusinessrulesDecisiontableImport**


> [DecisionTableImportJob](DecisionTableImportJob) patchBusinessrulesDecisiontableImport(tableId, importJobId, body)

Update decision table row import job

Cancels an in-progress import job by supplying a status of Cancelled. Cancellation is idempotent: cancelling a job that is already Cancelled returns 200 with the cancelled job. Cancelling a job that is still Uploading or Processing returns 200. A job that has already finished (Complete or Failed) can no longer be cancelled.

Wraps PATCH /api/v2/businessrules/decisiontables/{tableId}/imports/{importJobId}  

Requires ANY permissions: 

* businessrules:decisionTableImportJob:edit

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
String importJobId = "importJobId_example"; // String | Import job ID
UpdateDecisionTableImportJobRequest body = new UpdateDecisionTableImportJobRequest(); // UpdateDecisionTableImportJobRequest | Import job update request
try {
    DecisionTableImportJob result = apiInstance.patchBusinessrulesDecisiontableImport(tableId, importJobId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessRulesApi#patchBusinessrulesDecisiontableImport");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tableId** | **String**| Table ID | 
| **importJobId** | **String**| Import job ID | 
| **body** | [**UpdateDecisionTableImportJobRequest**](UpdateDecisionTableImportJobRequest)| Import job update request | 
{: class="table-striped"}


### Return type

[**DecisionTableImportJob**](DecisionTableImportJob)


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

Example request payload: {\"inputs\":{\"schemaPropertykey1\":\"inputValue1\",\"schemaPropertykey2\":\"inputValue2\"}}

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


# **postBusinessrulesDecisiontableExports**


> [DecisionTableExportJob](DecisionTableExportJob) postBusinessrulesDecisiontableExports(tableId, body)

Create an export job for a decision table version

Wraps POST /api/v2/businessrules/decisiontables/{tableId}/exports  

Requires ANY permissions: 

* businessrules:decisionTableExportJob:add

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
DecisionTableExportJobRequest body = new DecisionTableExportJobRequest(); // DecisionTableExportJobRequest | Export job request
try {
    DecisionTableExportJob result = apiInstance.postBusinessrulesDecisiontableExports(tableId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessRulesApi#postBusinessrulesDecisiontableExports");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tableId** | **String**| Table ID | 
| **body** | [**DecisionTableExportJobRequest**](DecisionTableExportJobRequest)| Export job request | 
{: class="table-striped"}


### Return type

[**DecisionTableExportJob**](DecisionTableExportJob)


# **postBusinessrulesDecisiontableImports**


> [DecisionTableImportJob](DecisionTableImportJob) postBusinessrulesDecisiontableImports(tableId, body)

Create a decision table row import job

Wraps POST /api/v2/businessrules/decisiontables/{tableId}/imports  

Requires ANY permissions: 

* businessrules:decisionTableImportJob:add

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
CreateDecisionTableImportJobRequest body = new CreateDecisionTableImportJobRequest(); // CreateDecisionTableImportJobRequest | Import job create request
try {
    DecisionTableImportJob result = apiInstance.postBusinessrulesDecisiontableImports(tableId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessRulesApi#postBusinessrulesDecisiontableImports");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tableId** | **String**| Table ID | 
| **body** | [**CreateDecisionTableImportJobRequest**](CreateDecisionTableImportJobRequest)| Import job create request | 
{: class="table-striped"}


### Return type

[**DecisionTableImportJob**](DecisionTableImportJob)


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

Example request payload: {\"inputs\":{\"schemaPropertykey1\":\"inputValue1\",\"schemaPropertykey2\":\"inputValue2\"}}

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


# **postBusinessrulesDecisiontableVersionRollback**


> [DecisionTableVersion](DecisionTableVersion) postBusinessrulesDecisiontableVersionRollback(tableId, tableVersion, body)

Re-publish a superseded decision table version as the current published version

Wraps POST /api/v2/businessrules/decisiontables/{tableId}/versions/{tableVersion}/rollback  

Requires ANY permissions: 

* businessrules:decisionTable:rollback

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
RollbackDecisionTableVersionRequest body = new RollbackDecisionTableVersionRequest(); // RollbackDecisionTableVersionRequest | Rollback request
try {
    DecisionTableVersion result = apiInstance.postBusinessrulesDecisiontableVersionRollback(tableId, tableVersion, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessRulesApi#postBusinessrulesDecisiontableVersionRollback");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tableId** | **String**| Table ID | 
| **tableVersion** | **Integer**| Table Version | 
| **body** | [**RollbackDecisionTableVersionRequest**](RollbackDecisionTableVersionRequest)| Rollback request | [optional] 
{: class="table-striped"}


### Return type

[**DecisionTableVersion**](DecisionTableVersion)


# **postBusinessrulesDecisiontableVersionRows**


> [DecisionTableRow](DecisionTableRow) postBusinessrulesDecisiontableVersionRows(tableId, tableVersion, body)

Create a decision table row

Required permissions depend on table content: if the table or row contains queue references, routing:queue:view is required in each queue's division. Future platform objects will require their associated permissions in the relevant divisions when the table or row contains references to them.

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


# **postBusinessrulesDecisiontableVersionRowsBulkAdd**


> [BulkAddDecisionTableRowsResponse](BulkAddDecisionTableRowsResponse) postBusinessrulesDecisiontableVersionRowsBulkAdd(tableId, tableVersion, body)

Bulk add decision table rows

Required permissions depend on table content: if the table or row contains queue references, routing:queue:view is required in each queue's division. Future platform objects will require their associated permissions in the relevant divisions when the table or row contains references to them.

Wraps POST /api/v2/businessrules/decisiontables/{tableId}/versions/{tableVersion}/rows/bulk/add  

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
BulkAddDecisionTableRowsRequest body = new BulkAddDecisionTableRowsRequest(); // BulkAddDecisionTableRowsRequest | Bulk add decision table rows request
try {
    BulkAddDecisionTableRowsResponse result = apiInstance.postBusinessrulesDecisiontableVersionRowsBulkAdd(tableId, tableVersion, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessRulesApi#postBusinessrulesDecisiontableVersionRowsBulkAdd");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tableId** | **String**| Table ID | 
| **tableVersion** | **Integer**| Table Version | 
| **body** | [**BulkAddDecisionTableRowsRequest**](BulkAddDecisionTableRowsRequest)| Bulk add decision table rows request | 
{: class="table-striped"}


### Return type

[**BulkAddDecisionTableRowsResponse**](BulkAddDecisionTableRowsResponse)


# **postBusinessrulesDecisiontableVersionRowsBulkRemove**


> Void postBusinessrulesDecisiontableVersionRowsBulkRemove(tableId, tableVersion, body)

Bulk delete decision table rows

Required permissions depend on table content: if the table or row contains queue references, routing:queue:view is required in each queue's division. Future platform objects will require their associated permissions in the relevant divisions when the table or row contains references to them.

Wraps POST /api/v2/businessrules/decisiontables/{tableId}/versions/{tableVersion}/rows/bulk/remove  

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
BulkDeleteDecisionTableRowsRequest body = new BulkDeleteDecisionTableRowsRequest(); // BulkDeleteDecisionTableRowsRequest | 
try {
    apiInstance.postBusinessrulesDecisiontableVersionRowsBulkRemove(tableId, tableVersion, body);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessRulesApi#postBusinessrulesDecisiontableVersionRowsBulkRemove");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tableId** | **String**| Table ID | 
| **tableVersion** | **Integer**| Table Version | 
| **body** | [**BulkDeleteDecisionTableRowsRequest**](BulkDeleteDecisionTableRowsRequest)|  | 
{: class="table-striped"}


### Return type

null (empty response body)


# **postBusinessrulesDecisiontableVersionRowsBulkUpdate**


> [BulkUpdateDecisionTableRowsResponse](BulkUpdateDecisionTableRowsResponse) postBusinessrulesDecisiontableVersionRowsBulkUpdate(tableId, tableVersion, body)

Bulk update decision table rows

Required permissions depend on table content: if the table or row contains queue references, routing:queue:view is required in each queue's division. Future platform objects will require their associated permissions in the relevant divisions when the table or row contains references to them.

Wraps POST /api/v2/businessrules/decisiontables/{tableId}/versions/{tableVersion}/rows/bulk/update  

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
BulkUpdateDecisionTableRowsRequest body = new BulkUpdateDecisionTableRowsRequest(); // BulkUpdateDecisionTableRowsRequest | Bulk update decision table rows request
try {
    BulkUpdateDecisionTableRowsResponse result = apiInstance.postBusinessrulesDecisiontableVersionRowsBulkUpdate(tableId, tableVersion, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessRulesApi#postBusinessrulesDecisiontableVersionRowsBulkUpdate");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tableId** | **String**| Table ID | 
| **tableVersion** | **Integer**| Table Version | 
| **body** | [**BulkUpdateDecisionTableRowsRequest**](BulkUpdateDecisionTableRowsRequest)| Bulk update decision table rows request | 
{: class="table-striped"}


### Return type

[**BulkUpdateDecisionTableRowsResponse**](BulkUpdateDecisionTableRowsResponse)


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


# **postBusinessrulesDecisiontableVersionSnapshot**


> [DecisionTableVersion](DecisionTableVersion) postBusinessrulesDecisiontableVersionSnapshot(tableId, tableVersion, body)

Creates a decision table version snapshot

Wraps POST /api/v2/businessrules/decisiontables/{tableId}/versions/{tableVersion}/snapshot  

Requires ANY permissions: 

* businessrules:decisionTableSnapshot:add

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
CreateDecisionTableSnapshotRequest body = new CreateDecisionTableSnapshotRequest(); // CreateDecisionTableSnapshotRequest | Snapshot request
try {
    DecisionTableVersion result = apiInstance.postBusinessrulesDecisiontableVersionSnapshot(tableId, tableVersion, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessRulesApi#postBusinessrulesDecisiontableVersionSnapshot");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tableId** | **String**| Table ID | 
| **tableVersion** | **Integer**| Table Version | 
| **body** | [**CreateDecisionTableSnapshotRequest**](CreateDecisionTableSnapshotRequest)| Snapshot request | 
{: class="table-striped"}


### Return type

[**DecisionTableVersion**](DecisionTableVersion)


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


> [DecisionTableVersion](DecisionTableVersion) postBusinessrulesDecisiontableVersions(tableId, body)

Create a new decision table version. When sourceVersion is not provided, the draft is created from the published version.

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
CreateDecisionTableVersionRequest body = new CreateDecisionTableVersionRequest(); // CreateDecisionTableVersionRequest | Decision Table Version
try {
    DecisionTableVersion result = apiInstance.postBusinessrulesDecisiontableVersions(tableId, body);
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
| **body** | [**CreateDecisionTableVersionRequest**](CreateDecisionTableVersionRequest)| Decision Table Version | [optional] 
{: class="table-striped"}


### Return type

[**DecisionTableVersion**](DecisionTableVersion)


# **postBusinessrulesDecisiontables**


> [DecisionTableVersion](DecisionTableVersion) postBusinessrulesDecisiontables(body)

Create a decision table

Required permissions depend on table content: if the table or row contains queue references, routing:queue:view is required in each queue's division. Future platform objects will require their associated permissions in the relevant divisions when the table or row contains references to them.

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

Required permissions depend on table content: if the table or row contains queue references, routing:queue:view is required in each queue's division. Future platform objects will require their associated permissions in the relevant divisions when the table or row contains references to them.

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


_com.mypurecloud.sdk.v2:platform-client-v2:261.0.0_
