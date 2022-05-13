---
title: ContentManagementApi
---
## ContentManagementApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**deleteContentmanagementDocument**](ContentManagementApi.html#deleteContentmanagementDocument) | Delete a document. |
| [**deleteContentmanagementShare**](ContentManagementApi.html#deleteContentmanagementShare) | Deletes an existing share. |
| [**deleteContentmanagementStatusStatusId**](ContentManagementApi.html#deleteContentmanagementStatusStatusId) | Cancel the command for this status |
| [**deleteContentmanagementWorkspace**](ContentManagementApi.html#deleteContentmanagementWorkspace) | Delete a workspace |
| [**deleteContentmanagementWorkspaceMember**](ContentManagementApi.html#deleteContentmanagementWorkspaceMember) | Delete a member from a workspace |
| [**deleteContentmanagementWorkspaceTagvalue**](ContentManagementApi.html#deleteContentmanagementWorkspaceTagvalue) | Delete workspace tag |
| [**getContentmanagementDocument**](ContentManagementApi.html#getContentmanagementDocument) | Get a document. |
| [**getContentmanagementDocumentAudits**](ContentManagementApi.html#getContentmanagementDocumentAudits) | Get a list of audits for a document. |
| [**getContentmanagementDocumentContent**](ContentManagementApi.html#getContentmanagementDocumentContent) | Download a document. |
| [**getContentmanagementDocuments**](ContentManagementApi.html#getContentmanagementDocuments) | Get a list of documents. |
| [**getContentmanagementQuery**](ContentManagementApi.html#getContentmanagementQuery) | Query content |
| [**getContentmanagementSecurityprofile**](ContentManagementApi.html#getContentmanagementSecurityprofile) | Get a Security Profile |
| [**getContentmanagementSecurityprofiles**](ContentManagementApi.html#getContentmanagementSecurityprofiles) | Get a List of Security Profiles |
| [**getContentmanagementShare**](ContentManagementApi.html#getContentmanagementShare) | Retrieve details about an existing share. |
| [**getContentmanagementSharedSharedId**](ContentManagementApi.html#getContentmanagementSharedSharedId) | Get shared documents. Securely download a shared document. |
| [**getContentmanagementShares**](ContentManagementApi.html#getContentmanagementShares) | Gets a list of shares.  You must specify at least one filter (e.g. entityId). |
| [**getContentmanagementStatus**](ContentManagementApi.html#getContentmanagementStatus) | Get a list of statuses for pending operations |
| [**getContentmanagementStatusStatusId**](ContentManagementApi.html#getContentmanagementStatusStatusId) | Get a status. |
| [**getContentmanagementUsage**](ContentManagementApi.html#getContentmanagementUsage) | Get usage details. |
| [**getContentmanagementWorkspace**](ContentManagementApi.html#getContentmanagementWorkspace) | Get a workspace. |
| [**getContentmanagementWorkspaceDocuments**](ContentManagementApi.html#getContentmanagementWorkspaceDocuments) | Get a list of documents. |
| [**getContentmanagementWorkspaceMember**](ContentManagementApi.html#getContentmanagementWorkspaceMember) | Get a workspace member |
| [**getContentmanagementWorkspaceMembers**](ContentManagementApi.html#getContentmanagementWorkspaceMembers) | Get a list workspace members |
| [**getContentmanagementWorkspaceTagvalue**](ContentManagementApi.html#getContentmanagementWorkspaceTagvalue) | Get a workspace tag |
| [**getContentmanagementWorkspaceTagvalues**](ContentManagementApi.html#getContentmanagementWorkspaceTagvalues) | Get a list of workspace tags |
| [**getContentmanagementWorkspaces**](ContentManagementApi.html#getContentmanagementWorkspaces) | Get a list of workspaces. |
| [**postContentmanagementAuditquery**](ContentManagementApi.html#postContentmanagementAuditquery) | Query audits |
| [**postContentmanagementDocument**](ContentManagementApi.html#postContentmanagementDocument) | Update a document. |
| [**postContentmanagementDocumentContent**](ContentManagementApi.html#postContentmanagementDocumentContent) | Replace the contents of a document. |
| [**postContentmanagementDocuments**](ContentManagementApi.html#postContentmanagementDocuments) | Add a document. |
| [**postContentmanagementQuery**](ContentManagementApi.html#postContentmanagementQuery) | Query content |
| [**postContentmanagementShares**](ContentManagementApi.html#postContentmanagementShares) | Creates a new share or updates an existing share if the entity has already been shared |
| [**postContentmanagementWorkspaceTagvalues**](ContentManagementApi.html#postContentmanagementWorkspaceTagvalues) | Create a workspace tag |
| [**postContentmanagementWorkspaceTagvaluesQuery**](ContentManagementApi.html#postContentmanagementWorkspaceTagvaluesQuery) | Perform a prefix query on tags in the workspace |
| [**postContentmanagementWorkspaces**](ContentManagementApi.html#postContentmanagementWorkspaces) | Create a group workspace |
| [**putContentmanagementWorkspace**](ContentManagementApi.html#putContentmanagementWorkspace) | Update a workspace |
| [**putContentmanagementWorkspaceMember**](ContentManagementApi.html#putContentmanagementWorkspaceMember) | Add a member to a workspace |
| [**putContentmanagementWorkspaceTagvalue**](ContentManagementApi.html#putContentmanagementWorkspaceTagvalue) | Update a workspace tag. Will update all documents with the new tag value. |
{: class="table-striped"}

<a name="deleteContentmanagementDocument"></a>

# **deleteContentmanagementDocument**



> Void deleteContentmanagementDocument(documentId, override)

Delete a document.

Wraps DELETE /api/v2/contentmanagement/documents/{documentId}  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ContentManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ContentManagementApi apiInstance = new ContentManagementApi();
String documentId = "documentId_example"; // String | Document ID
Boolean override = true; // Boolean | Override any lock on the document
try {
    apiInstance.deleteContentmanagementDocument(documentId, override);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentManagementApi#deleteContentmanagementDocument");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **documentId** | **String**| Document ID | 
| **override** | **Boolean**| Override any lock on the document | [optional] 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="deleteContentmanagementShare"></a>

# **deleteContentmanagementShare**



> Void deleteContentmanagementShare(shareId)

Deletes an existing share.

This revokes sharing rights specified in the share record

Wraps DELETE /api/v2/contentmanagement/shares/{shareId}  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ContentManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ContentManagementApi apiInstance = new ContentManagementApi();
String shareId = "shareId_example"; // String | Share ID
try {
    apiInstance.deleteContentmanagementShare(shareId);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentManagementApi#deleteContentmanagementShare");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **shareId** | **String**| Share ID | 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="deleteContentmanagementStatusStatusId"></a>

# **deleteContentmanagementStatusStatusId**



> Void deleteContentmanagementStatusStatusId(statusId)

Cancel the command for this status

Wraps DELETE /api/v2/contentmanagement/status/{statusId}  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ContentManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ContentManagementApi apiInstance = new ContentManagementApi();
String statusId = "statusId_example"; // String | Status ID
try {
    apiInstance.deleteContentmanagementStatusStatusId(statusId);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentManagementApi#deleteContentmanagementStatusStatusId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **statusId** | **String**| Status ID | 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="deleteContentmanagementWorkspace"></a>

# **deleteContentmanagementWorkspace**



> Void deleteContentmanagementWorkspace(workspaceId, moveChildrenToWorkspaceId)

Delete a workspace

Wraps DELETE /api/v2/contentmanagement/workspaces/{workspaceId}  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ContentManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ContentManagementApi apiInstance = new ContentManagementApi();
String workspaceId = "workspaceId_example"; // String | Workspace ID
String moveChildrenToWorkspaceId = "moveChildrenToWorkspaceId_example"; // String | New location for objects in deleted workspace.
try {
    apiInstance.deleteContentmanagementWorkspace(workspaceId, moveChildrenToWorkspaceId);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentManagementApi#deleteContentmanagementWorkspace");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **workspaceId** | **String**| Workspace ID | 
| **moveChildrenToWorkspaceId** | **String**| New location for objects in deleted workspace. | [optional] 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="deleteContentmanagementWorkspaceMember"></a>

# **deleteContentmanagementWorkspaceMember**



> Void deleteContentmanagementWorkspaceMember(workspaceId, memberId)

Delete a member from a workspace

Wraps DELETE /api/v2/contentmanagement/workspaces/{workspaceId}/members/{memberId}  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ContentManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ContentManagementApi apiInstance = new ContentManagementApi();
String workspaceId = "workspaceId_example"; // String | Workspace ID
String memberId = "memberId_example"; // String | Member ID
try {
    apiInstance.deleteContentmanagementWorkspaceMember(workspaceId, memberId);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentManagementApi#deleteContentmanagementWorkspaceMember");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **workspaceId** | **String**| Workspace ID | 
| **memberId** | **String**| Member ID | 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="deleteContentmanagementWorkspaceTagvalue"></a>

# **deleteContentmanagementWorkspaceTagvalue**



> Void deleteContentmanagementWorkspaceTagvalue(workspaceId, tagId)

Delete workspace tag

Delete a tag from a workspace. Will remove this tag from all documents.

Wraps DELETE /api/v2/contentmanagement/workspaces/{workspaceId}/tagvalues/{tagId}  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ContentManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ContentManagementApi apiInstance = new ContentManagementApi();
String workspaceId = "workspaceId_example"; // String | Workspace ID
String tagId = "tagId_example"; // String | Tag ID
try {
    apiInstance.deleteContentmanagementWorkspaceTagvalue(workspaceId, tagId);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentManagementApi#deleteContentmanagementWorkspaceTagvalue");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **workspaceId** | **String**| Workspace ID | 
| **tagId** | **String**| Tag ID | 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="getContentmanagementDocument"></a>

# **getContentmanagementDocument**



> [Document](Document.html) getContentmanagementDocument(documentId, expand)

Get a document.

Wraps GET /api/v2/contentmanagement/documents/{documentId}  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ContentManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ContentManagementApi apiInstance = new ContentManagementApi();
String documentId = "documentId_example"; // String | Document ID
List<String> expand = Arrays.asList(null); // List<String> | Which fields, if any, to expand.
try {
    Document result = apiInstance.getContentmanagementDocument(documentId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentManagementApi#getContentmanagementDocument");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **documentId** | **String**| Document ID | 
| **expand** | [**List&lt;String&gt;**](String.html)| Which fields, if any, to expand. | [optional]<br />**Values**: lockInfo, acl, workspace 
{: class="table-striped"}


### Return type

[**Document**](Document.html)

<a name="getContentmanagementDocumentAudits"></a>

# **getContentmanagementDocumentAudits**



> [DocumentAuditEntityListing](DocumentAuditEntityListing.html) getContentmanagementDocumentAudits(documentId, pageSize, pageNumber, transactionFilter, level, sortBy, sortOrder)

Get a list of audits for a document.

Wraps GET /api/v2/contentmanagement/documents/{documentId}/audits  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ContentManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ContentManagementApi apiInstance = new ContentManagementApi();
String documentId = "documentId_example"; // String | Document ID
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String transactionFilter = "transactionFilter_example"; // String | Transaction filter
String level = "USER"; // String | level
String sortBy = "sortBy_example"; // String | Sort by
String sortOrder = "ascending"; // String | Sort order
try {
    DocumentAuditEntityListing result = apiInstance.getContentmanagementDocumentAudits(documentId, pageSize, pageNumber, transactionFilter, level, sortBy, sortOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentManagementApi#getContentmanagementDocumentAudits");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **documentId** | **String**| Document ID | 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **transactionFilter** | **String**| Transaction filter | [optional] 
| **level** | **String**| level | [optional] [default to USER] 
| **sortBy** | **String**| Sort by | [optional] 
| **sortOrder** | **String**| Sort order | [optional] [default to ascending] 
{: class="table-striped"}


### Return type

[**DocumentAuditEntityListing**](DocumentAuditEntityListing.html)

<a name="getContentmanagementDocumentContent"></a>

# **getContentmanagementDocumentContent**



> [DownloadResponse](DownloadResponse.html) getContentmanagementDocumentContent(documentId, disposition, contentType)

Download a document.

Wraps GET /api/v2/contentmanagement/documents/{documentId}/content  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ContentManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ContentManagementApi apiInstance = new ContentManagementApi();
String documentId = "documentId_example"; // String | Document ID
String disposition = "disposition_example"; // String | Request how the content will be downloaded: a file attachment or inline. Default is attachment.
String contentType = "contentType_example"; // String | The requested format for the specified document. If supported, the document will be returned in that format. Example contentType=audio/wav
try {
    DownloadResponse result = apiInstance.getContentmanagementDocumentContent(documentId, disposition, contentType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentManagementApi#getContentmanagementDocumentContent");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **documentId** | **String**| Document ID | 
| **disposition** | **String**| Request how the content will be downloaded: a file attachment or inline. Default is attachment. | [optional]<br />**Values**: attachment, inline 
| **contentType** | **String**| The requested format for the specified document. If supported, the document will be returned in that format. Example contentType&#x3D;audio/wav | [optional] 
{: class="table-striped"}


### Return type

[**DownloadResponse**](DownloadResponse.html)

<a name="getContentmanagementDocuments"></a>

# **getContentmanagementDocuments**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> [DocumentEntityListing](DocumentEntityListing.html) getContentmanagementDocuments(workspaceId, name, expand, pageSize, pageNumber, sortBy, sortOrder)

Get a list of documents.

Wraps GET /api/v2/contentmanagement/documents  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ContentManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ContentManagementApi apiInstance = new ContentManagementApi();
String workspaceId = "workspaceId_example"; // String | Workspace ID
String name = "name_example"; // String | Name
List<String> expand = Arrays.asList(null); // List<String> | Which fields, if any, to expand.
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String sortBy = "sortBy_example"; // String | name or dateCreated
String sortOrder = "ascending"; // String | ascending or descending
try {
    DocumentEntityListing result = apiInstance.getContentmanagementDocuments(workspaceId, name, expand, pageSize, pageNumber, sortBy, sortOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentManagementApi#getContentmanagementDocuments");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **workspaceId** | **String**| Workspace ID | 
| **name** | **String**| Name | [optional] 
| **expand** | [**List&lt;String&gt;**](String.html)| Which fields, if any, to expand. | [optional]<br />**Values**: acl, workspace 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **sortBy** | **String**| name or dateCreated | [optional] 
| **sortOrder** | **String**| ascending or descending | [optional] [default to ascending] 
{: class="table-striped"}


### Return type

[**DocumentEntityListing**](DocumentEntityListing.html)

<a name="getContentmanagementQuery"></a>

# **getContentmanagementQuery**



> [QueryResults](QueryResults.html) getContentmanagementQuery(queryPhrase, pageSize, pageNumber, sortBy, sortOrder, expand)

Query content

Wraps GET /api/v2/contentmanagement/query  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ContentManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ContentManagementApi apiInstance = new ContentManagementApi();
String queryPhrase = "queryPhrase_example"; // String | Phrase tokens are ANDed together over all searchable fields
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String sortBy = "name"; // String | name or dateCreated
String sortOrder = "ascending"; // String | ascending or descending
List<String> expand = Arrays.asList(null); // List<String> | Which fields, if any, to expand.
try {
    QueryResults result = apiInstance.getContentmanagementQuery(queryPhrase, pageSize, pageNumber, sortBy, sortOrder, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentManagementApi#getContentmanagementQuery");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **queryPhrase** | **String**| Phrase tokens are ANDed together over all searchable fields | 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **sortBy** | **String**| name or dateCreated | [optional] [default to name] 
| **sortOrder** | **String**| ascending or descending | [optional] [default to ascending] 
| **expand** | [**List&lt;String&gt;**](String.html)| Which fields, if any, to expand. | [optional]<br />**Values**: acl, workspace 
{: class="table-striped"}


### Return type

[**QueryResults**](QueryResults.html)

<a name="getContentmanagementSecurityprofile"></a>

# **getContentmanagementSecurityprofile**



> [SecurityProfile](SecurityProfile.html) getContentmanagementSecurityprofile(securityProfileId)

Get a Security Profile

Wraps GET /api/v2/contentmanagement/securityprofiles/{securityProfileId}  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ContentManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ContentManagementApi apiInstance = new ContentManagementApi();
String securityProfileId = "securityProfileId_example"; // String | Security Profile Id
try {
    SecurityProfile result = apiInstance.getContentmanagementSecurityprofile(securityProfileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentManagementApi#getContentmanagementSecurityprofile");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **securityProfileId** | **String**| Security Profile Id | 
{: class="table-striped"}


### Return type

[**SecurityProfile**](SecurityProfile.html)

<a name="getContentmanagementSecurityprofiles"></a>

# **getContentmanagementSecurityprofiles**



> [SecurityProfileEntityListing](SecurityProfileEntityListing.html) getContentmanagementSecurityprofiles()

Get a List of Security Profiles

Wraps GET /api/v2/contentmanagement/securityprofiles  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ContentManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ContentManagementApi apiInstance = new ContentManagementApi();
try {
    SecurityProfileEntityListing result = apiInstance.getContentmanagementSecurityprofiles();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentManagementApi#getContentmanagementSecurityprofiles");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**SecurityProfileEntityListing**](SecurityProfileEntityListing.html)

<a name="getContentmanagementShare"></a>

# **getContentmanagementShare**



> [Share](Share.html) getContentmanagementShare(shareId, expand)

Retrieve details about an existing share.

Wraps GET /api/v2/contentmanagement/shares/{shareId}  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ContentManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ContentManagementApi apiInstance = new ContentManagementApi();
String shareId = "shareId_example"; // String | Share ID
List<String> expand = Arrays.asList(null); // List<String> | Which fields, if any, to expand.
try {
    Share result = apiInstance.getContentmanagementShare(shareId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentManagementApi#getContentmanagementShare");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **shareId** | **String**| Share ID | 
| **expand** | [**List&lt;String&gt;**](String.html)| Which fields, if any, to expand. | [optional]<br />**Values**: member 
{: class="table-striped"}


### Return type

[**Share**](Share.html)

<a name="getContentmanagementSharedSharedId"></a>

# **getContentmanagementSharedSharedId**



> [SharedResponse](SharedResponse.html) getContentmanagementSharedSharedId(sharedId, redirect, disposition, contentType, expand)

Get shared documents. Securely download a shared document.

This method requires the download sharing URI obtained in the get document response (downloadSharingUri). Documents may be shared between users in the same workspace. Documents may also be shared between any user by creating a content management share.

Wraps GET /api/v2/contentmanagement/shared/{sharedId}  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ContentManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ContentManagementApi apiInstance = new ContentManagementApi();
String sharedId = "sharedId_example"; // String | Shared ID
Boolean redirect = true; // Boolean | Turn on or off redirect
String disposition = "attachment"; // String | Request how the share content will be downloaded: attached as a file or inline. Default is attachment.
String contentType = "contentType_example"; // String | The requested format for the specified document. If supported, the document will be returned in that format. Example contentType=audio/wav
String expand = "expand_example"; // String | Expand some document fields
try {
    SharedResponse result = apiInstance.getContentmanagementSharedSharedId(sharedId, redirect, disposition, contentType, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentManagementApi#getContentmanagementSharedSharedId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sharedId** | **String**| Shared ID | 
| **redirect** | **Boolean**| Turn on or off redirect | [optional] [default to true] 
| **disposition** | **String**| Request how the share content will be downloaded: attached as a file or inline. Default is attachment. | [optional] [default to attachment]<br />**Values**: attachment, inline, none 
| **contentType** | **String**| The requested format for the specified document. If supported, the document will be returned in that format. Example contentType&#x3D;audio/wav | [optional] 
| **expand** | **String**| Expand some document fields | [optional]<br />**Values**: document.acl 
{: class="table-striped"}


### Return type

[**SharedResponse**](SharedResponse.html)

<a name="getContentmanagementShares"></a>

# **getContentmanagementShares**



> [ShareEntityListing](ShareEntityListing.html) getContentmanagementShares(entityId, expand, pageSize, pageNumber)

Gets a list of shares.  You must specify at least one filter (e.g. entityId).

Failing to specify a filter will return 400.

Wraps GET /api/v2/contentmanagement/shares  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ContentManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ContentManagementApi apiInstance = new ContentManagementApi();
String entityId = "entityId_example"; // String | Filters the shares returned to only the entity specified by the value of this parameter.
List<String> expand = Arrays.asList(null); // List<String> | Which fields, if any, to expand.
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
try {
    ShareEntityListing result = apiInstance.getContentmanagementShares(entityId, expand, pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentManagementApi#getContentmanagementShares");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **entityId** | **String**| Filters the shares returned to only the entity specified by the value of this parameter. | [optional] 
| **expand** | [**List&lt;String&gt;**](String.html)| Which fields, if any, to expand. | [optional]<br />**Values**: member 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
{: class="table-striped"}


### Return type

[**ShareEntityListing**](ShareEntityListing.html)

<a name="getContentmanagementStatus"></a>

# **getContentmanagementStatus**



> [CommandStatusEntityListing](CommandStatusEntityListing.html) getContentmanagementStatus(pageSize, pageNumber)

Get a list of statuses for pending operations

Wraps GET /api/v2/contentmanagement/status  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ContentManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ContentManagementApi apiInstance = new ContentManagementApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
try {
    CommandStatusEntityListing result = apiInstance.getContentmanagementStatus(pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentManagementApi#getContentmanagementStatus");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
{: class="table-striped"}


### Return type

[**CommandStatusEntityListing**](CommandStatusEntityListing.html)

<a name="getContentmanagementStatusStatusId"></a>

# **getContentmanagementStatusStatusId**



> [CommandStatus](CommandStatus.html) getContentmanagementStatusStatusId(statusId)

Get a status.

Wraps GET /api/v2/contentmanagement/status/{statusId}  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ContentManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ContentManagementApi apiInstance = new ContentManagementApi();
String statusId = "statusId_example"; // String | Status ID
try {
    CommandStatus result = apiInstance.getContentmanagementStatusStatusId(statusId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentManagementApi#getContentmanagementStatusStatusId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **statusId** | **String**| Status ID | 
{: class="table-striped"}


### Return type

[**CommandStatus**](CommandStatus.html)

<a name="getContentmanagementUsage"></a>

# **getContentmanagementUsage**



> [Usage](Usage.html) getContentmanagementUsage()

Get usage details.

Wraps GET /api/v2/contentmanagement/usage  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ContentManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ContentManagementApi apiInstance = new ContentManagementApi();
try {
    Usage result = apiInstance.getContentmanagementUsage();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentManagementApi#getContentmanagementUsage");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**Usage**](Usage.html)

<a name="getContentmanagementWorkspace"></a>

# **getContentmanagementWorkspace**



> [Workspace](Workspace.html) getContentmanagementWorkspace(workspaceId, expand)

Get a workspace.

Wraps GET /api/v2/contentmanagement/workspaces/{workspaceId}  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ContentManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ContentManagementApi apiInstance = new ContentManagementApi();
String workspaceId = "workspaceId_example"; // String | Workspace ID
List<String> expand = Arrays.asList(null); // List<String> | Which fields, if any, to expand.
try {
    Workspace result = apiInstance.getContentmanagementWorkspace(workspaceId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentManagementApi#getContentmanagementWorkspace");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **workspaceId** | **String**| Workspace ID | 
| **expand** | [**List&lt;String&gt;**](String.html)| Which fields, if any, to expand. | [optional]<br />**Values**: summary, acl 
{: class="table-striped"}


### Return type

[**Workspace**](Workspace.html)

<a name="getContentmanagementWorkspaceDocuments"></a>

# **getContentmanagementWorkspaceDocuments**



> [DocumentEntityListing](DocumentEntityListing.html) getContentmanagementWorkspaceDocuments(workspaceId, expand, pageSize, pageNumber, sortBy, sortOrder)

Get a list of documents.

Wraps GET /api/v2/contentmanagement/workspaces/{workspaceId}/documents  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ContentManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ContentManagementApi apiInstance = new ContentManagementApi();
String workspaceId = "workspaceId_example"; // String | Workspace ID
List<String> expand = Arrays.asList(null); // List<String> | Which fields, if any, to expand.
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String sortBy = "sortBy_example"; // String | name or dateCreated
String sortOrder = "ascending"; // String | ascending or descending
try {
    DocumentEntityListing result = apiInstance.getContentmanagementWorkspaceDocuments(workspaceId, expand, pageSize, pageNumber, sortBy, sortOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentManagementApi#getContentmanagementWorkspaceDocuments");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **workspaceId** | **String**| Workspace ID | 
| **expand** | [**List&lt;String&gt;**](String.html)| Which fields, if any, to expand. | [optional]<br />**Values**: acl, workspace 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **sortBy** | **String**| name or dateCreated | [optional] 
| **sortOrder** | **String**| ascending or descending | [optional] [default to ascending] 
{: class="table-striped"}


### Return type

[**DocumentEntityListing**](DocumentEntityListing.html)

<a name="getContentmanagementWorkspaceMember"></a>

# **getContentmanagementWorkspaceMember**



> [WorkspaceMember](WorkspaceMember.html) getContentmanagementWorkspaceMember(workspaceId, memberId, expand)

Get a workspace member

Wraps GET /api/v2/contentmanagement/workspaces/{workspaceId}/members/{memberId}  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ContentManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ContentManagementApi apiInstance = new ContentManagementApi();
String workspaceId = "workspaceId_example"; // String | Workspace ID
String memberId = "memberId_example"; // String | Member ID
List<String> expand = Arrays.asList(null); // List<String> | Which fields, if any, to expand.
try {
    WorkspaceMember result = apiInstance.getContentmanagementWorkspaceMember(workspaceId, memberId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentManagementApi#getContentmanagementWorkspaceMember");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **workspaceId** | **String**| Workspace ID | 
| **memberId** | **String**| Member ID | 
| **expand** | [**List&lt;String&gt;**](String.html)| Which fields, if any, to expand. | [optional]<br />**Values**: member 
{: class="table-striped"}


### Return type

[**WorkspaceMember**](WorkspaceMember.html)

<a name="getContentmanagementWorkspaceMembers"></a>

# **getContentmanagementWorkspaceMembers**



> [WorkspaceMemberEntityListing](WorkspaceMemberEntityListing.html) getContentmanagementWorkspaceMembers(workspaceId, pageSize, pageNumber, expand)

Get a list workspace members

Wraps GET /api/v2/contentmanagement/workspaces/{workspaceId}/members  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ContentManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ContentManagementApi apiInstance = new ContentManagementApi();
String workspaceId = "workspaceId_example"; // String | Workspace ID
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
List<String> expand = Arrays.asList(null); // List<String> | Which fields, if any, to expand.
try {
    WorkspaceMemberEntityListing result = apiInstance.getContentmanagementWorkspaceMembers(workspaceId, pageSize, pageNumber, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentManagementApi#getContentmanagementWorkspaceMembers");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **workspaceId** | **String**| Workspace ID | 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **expand** | [**List&lt;String&gt;**](String.html)| Which fields, if any, to expand. | [optional]<br />**Values**: member 
{: class="table-striped"}


### Return type

[**WorkspaceMemberEntityListing**](WorkspaceMemberEntityListing.html)

<a name="getContentmanagementWorkspaceTagvalue"></a>

# **getContentmanagementWorkspaceTagvalue**



> [TagValue](TagValue.html) getContentmanagementWorkspaceTagvalue(workspaceId, tagId, expand)

Get a workspace tag

Wraps GET /api/v2/contentmanagement/workspaces/{workspaceId}/tagvalues/{tagId}  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ContentManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ContentManagementApi apiInstance = new ContentManagementApi();
String workspaceId = "workspaceId_example"; // String | Workspace ID
String tagId = "tagId_example"; // String | Tag ID
List<String> expand = Arrays.asList(null); // List<String> | Which fields, if any, to expand.
try {
    TagValue result = apiInstance.getContentmanagementWorkspaceTagvalue(workspaceId, tagId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentManagementApi#getContentmanagementWorkspaceTagvalue");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **workspaceId** | **String**| Workspace ID | 
| **tagId** | **String**| Tag ID | 
| **expand** | [**List&lt;String&gt;**](String.html)| Which fields, if any, to expand. | [optional]<br />**Values**: acl 
{: class="table-striped"}


### Return type

[**TagValue**](TagValue.html)

<a name="getContentmanagementWorkspaceTagvalues"></a>

# **getContentmanagementWorkspaceTagvalues**



> [TagValueEntityListing](TagValueEntityListing.html) getContentmanagementWorkspaceTagvalues(workspaceId, value, pageSize, pageNumber, expand)

Get a list of workspace tags

Wraps GET /api/v2/contentmanagement/workspaces/{workspaceId}/tagvalues  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ContentManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ContentManagementApi apiInstance = new ContentManagementApi();
String workspaceId = "workspaceId_example"; // String | Workspace ID
String value = "value_example"; // String | filter the list of tags returned
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
List<String> expand = Arrays.asList(null); // List<String> | Which fields, if any, to expand.
try {
    TagValueEntityListing result = apiInstance.getContentmanagementWorkspaceTagvalues(workspaceId, value, pageSize, pageNumber, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentManagementApi#getContentmanagementWorkspaceTagvalues");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **workspaceId** | **String**| Workspace ID | 
| **value** | **String**| filter the list of tags returned | [optional] 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **expand** | [**List&lt;String&gt;**](String.html)| Which fields, if any, to expand. | [optional]<br />**Values**: acl 
{: class="table-striped"}


### Return type

[**TagValueEntityListing**](TagValueEntityListing.html)

<a name="getContentmanagementWorkspaces"></a>

# **getContentmanagementWorkspaces**



> [WorkspaceEntityListing](WorkspaceEntityListing.html) getContentmanagementWorkspaces(pageSize, pageNumber, access, expand)

Get a list of workspaces.

Specifying 'content' access will return all workspaces the user has document access to, while 'admin' access will return all group workspaces the user has administrative rights to.

Wraps GET /api/v2/contentmanagement/workspaces  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ContentManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ContentManagementApi apiInstance = new ContentManagementApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
List<String> access = Arrays.asList(null); // List<String> | Requested access level.
List<String> expand = Arrays.asList(null); // List<String> | Which fields, if any, to expand.
try {
    WorkspaceEntityListing result = apiInstance.getContentmanagementWorkspaces(pageSize, pageNumber, access, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentManagementApi#getContentmanagementWorkspaces");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **access** | [**List&lt;String&gt;**](String.html)| Requested access level. | [optional]<br />**Values**: content, admin, document:create, document:viewContent, document:viewMetadata, document:download, document:delete, document:update, document:share, document:shareView, document:email, document:print, document:auditView, document:replace, document:tag, tag:create, tag:view, tag:update, tag:apply, tag:remove, tag:delete 
| **expand** | [**List&lt;String&gt;**](String.html)| Which fields, if any, to expand. | [optional]<br />**Values**: summary, acl 
{: class="table-striped"}


### Return type

[**WorkspaceEntityListing**](WorkspaceEntityListing.html)

<a name="postContentmanagementAuditquery"></a>

# **postContentmanagementAuditquery**



> [QueryResults](QueryResults.html) postContentmanagementAuditquery(body)

Query audits

Wraps POST /api/v2/contentmanagement/auditquery  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ContentManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ContentManagementApi apiInstance = new ContentManagementApi();
ContentQueryRequest body = new ContentQueryRequest(); // ContentQueryRequest | Allows for a filtered query returning facet information
try {
    QueryResults result = apiInstance.postContentmanagementAuditquery(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentManagementApi#postContentmanagementAuditquery");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**ContentQueryRequest**](ContentQueryRequest.html)| Allows for a filtered query returning facet information | 
{: class="table-striped"}


### Return type

[**QueryResults**](QueryResults.html)

<a name="postContentmanagementDocument"></a>

# **postContentmanagementDocument**



> [Document](Document.html) postContentmanagementDocument(documentId, body, expand, override)

Update a document.

Wraps POST /api/v2/contentmanagement/documents/{documentId}  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ContentManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ContentManagementApi apiInstance = new ContentManagementApi();
String documentId = "documentId_example"; // String | Document ID
DocumentUpdate body = new DocumentUpdate(); // DocumentUpdate | Document
String expand = "expand_example"; // String | Expand some document fields
Boolean override = true; // Boolean | Override any lock on the document
try {
    Document result = apiInstance.postContentmanagementDocument(documentId, body, expand, override);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentManagementApi#postContentmanagementDocument");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **documentId** | **String**| Document ID | 
| **body** | [**DocumentUpdate**](DocumentUpdate.html)| Document | 
| **expand** | **String**| Expand some document fields | [optional]<br />**Values**: acl 
| **override** | **Boolean**| Override any lock on the document | [optional] 
{: class="table-striped"}


### Return type

[**Document**](Document.html)

<a name="postContentmanagementDocumentContent"></a>

# **postContentmanagementDocumentContent**



> [ReplaceResponse](ReplaceResponse.html) postContentmanagementDocumentContent(documentId, body, override)

Replace the contents of a document.

Wraps POST /api/v2/contentmanagement/documents/{documentId}/content  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ContentManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ContentManagementApi apiInstance = new ContentManagementApi();
String documentId = "documentId_example"; // String | Document ID
ReplaceRequest body = new ReplaceRequest(); // ReplaceRequest | Replace Request
Boolean override = true; // Boolean | Override any lock on the document
try {
    ReplaceResponse result = apiInstance.postContentmanagementDocumentContent(documentId, body, override);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentManagementApi#postContentmanagementDocumentContent");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **documentId** | **String**| Document ID | 
| **body** | [**ReplaceRequest**](ReplaceRequest.html)| Replace Request | 
| **override** | **Boolean**| Override any lock on the document | [optional] 
{: class="table-striped"}


### Return type

[**ReplaceResponse**](ReplaceResponse.html)

<a name="postContentmanagementDocuments"></a>

# **postContentmanagementDocuments**



> [Document](Document.html) postContentmanagementDocuments(body, copySource, moveSource, override)

Add a document.

Wraps POST /api/v2/contentmanagement/documents  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ContentManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ContentManagementApi apiInstance = new ContentManagementApi();
DocumentUpload body = new DocumentUpload(); // DocumentUpload | Document
String copySource = "copySource_example"; // String | Copy a document within a workspace or to a new workspace. Provide a document ID as the copy source.
String moveSource = "moveSource_example"; // String | Move a document to a new workspace. Provide a document ID as the move source.
Boolean override = true; // Boolean | Override any lock on the source document
try {
    Document result = apiInstance.postContentmanagementDocuments(body, copySource, moveSource, override);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentManagementApi#postContentmanagementDocuments");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**DocumentUpload**](DocumentUpload.html)| Document | 
| **copySource** | **String**| Copy a document within a workspace or to a new workspace. Provide a document ID as the copy source. | [optional] 
| **moveSource** | **String**| Move a document to a new workspace. Provide a document ID as the move source. | [optional] 
| **override** | **Boolean**| Override any lock on the source document | [optional] 
{: class="table-striped"}


### Return type

[**Document**](Document.html)

<a name="postContentmanagementQuery"></a>

# **postContentmanagementQuery**



> [QueryResults](QueryResults.html) postContentmanagementQuery(body, expand)

Query content

Wraps POST /api/v2/contentmanagement/query  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ContentManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ContentManagementApi apiInstance = new ContentManagementApi();
QueryRequest body = new QueryRequest(); // QueryRequest | Allows for a filtered query returning facet information
String expand = "expand_example"; // String | Expand some document fields
try {
    QueryResults result = apiInstance.postContentmanagementQuery(body, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentManagementApi#postContentmanagementQuery");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**QueryRequest**](QueryRequest.html)| Allows for a filtered query returning facet information | 
| **expand** | **String**| Expand some document fields | [optional]<br />**Values**: acl, workspace 
{: class="table-striped"}


### Return type

[**QueryResults**](QueryResults.html)

<a name="postContentmanagementShares"></a>

# **postContentmanagementShares**



> [CreateShareResponse](CreateShareResponse.html) postContentmanagementShares(body)

Creates a new share or updates an existing share if the entity has already been shared

Wraps POST /api/v2/contentmanagement/shares  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ContentManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ContentManagementApi apiInstance = new ContentManagementApi();
CreateShareRequest body = new CreateShareRequest(); // CreateShareRequest | CreateShareRequest - entity id and type and a single member or list of members are required
try {
    CreateShareResponse result = apiInstance.postContentmanagementShares(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentManagementApi#postContentmanagementShares");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**CreateShareRequest**](CreateShareRequest.html)| CreateShareRequest - entity id and type and a single member or list of members are required | 
{: class="table-striped"}


### Return type

[**CreateShareResponse**](CreateShareResponse.html)

<a name="postContentmanagementWorkspaceTagvalues"></a>

# **postContentmanagementWorkspaceTagvalues**



> [TagValue](TagValue.html) postContentmanagementWorkspaceTagvalues(workspaceId, body)

Create a workspace tag

Wraps POST /api/v2/contentmanagement/workspaces/{workspaceId}/tagvalues  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ContentManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ContentManagementApi apiInstance = new ContentManagementApi();
String workspaceId = "workspaceId_example"; // String | Workspace ID
TagValue body = new TagValue(); // TagValue | tag
try {
    TagValue result = apiInstance.postContentmanagementWorkspaceTagvalues(workspaceId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentManagementApi#postContentmanagementWorkspaceTagvalues");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **workspaceId** | **String**| Workspace ID | 
| **body** | [**TagValue**](TagValue.html)| tag | 
{: class="table-striped"}


### Return type

[**TagValue**](TagValue.html)

<a name="postContentmanagementWorkspaceTagvaluesQuery"></a>

# **postContentmanagementWorkspaceTagvaluesQuery**



> [TagValueEntityListing](TagValueEntityListing.html) postContentmanagementWorkspaceTagvaluesQuery(workspaceId, body, expand)

Perform a prefix query on tags in the workspace

Wraps POST /api/v2/contentmanagement/workspaces/{workspaceId}/tagvalues/query  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ContentManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ContentManagementApi apiInstance = new ContentManagementApi();
String workspaceId = "workspaceId_example"; // String | Workspace ID
TagQueryRequest body = new TagQueryRequest(); // TagQueryRequest | query
List<String> expand = Arrays.asList(null); // List<String> | Which fields, if any, to expand.
try {
    TagValueEntityListing result = apiInstance.postContentmanagementWorkspaceTagvaluesQuery(workspaceId, body, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentManagementApi#postContentmanagementWorkspaceTagvaluesQuery");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **workspaceId** | **String**| Workspace ID | 
| **body** | [**TagQueryRequest**](TagQueryRequest.html)| query | 
| **expand** | [**List&lt;String&gt;**](String.html)| Which fields, if any, to expand. | [optional]<br />**Values**: acl 
{: class="table-striped"}


### Return type

[**TagValueEntityListing**](TagValueEntityListing.html)

<a name="postContentmanagementWorkspaces"></a>

# **postContentmanagementWorkspaces**



> [Workspace](Workspace.html) postContentmanagementWorkspaces(body)

Create a group workspace

Wraps POST /api/v2/contentmanagement/workspaces  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ContentManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ContentManagementApi apiInstance = new ContentManagementApi();
WorkspaceCreate body = new WorkspaceCreate(); // WorkspaceCreate | Workspace
try {
    Workspace result = apiInstance.postContentmanagementWorkspaces(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentManagementApi#postContentmanagementWorkspaces");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**WorkspaceCreate**](WorkspaceCreate.html)| Workspace | 
{: class="table-striped"}


### Return type

[**Workspace**](Workspace.html)

<a name="putContentmanagementWorkspace"></a>

# **putContentmanagementWorkspace**



> [Workspace](Workspace.html) putContentmanagementWorkspace(workspaceId, body)

Update a workspace

Wraps PUT /api/v2/contentmanagement/workspaces/{workspaceId}  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ContentManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ContentManagementApi apiInstance = new ContentManagementApi();
String workspaceId = "workspaceId_example"; // String | Workspace ID
Workspace body = new Workspace(); // Workspace | Workspace
try {
    Workspace result = apiInstance.putContentmanagementWorkspace(workspaceId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentManagementApi#putContentmanagementWorkspace");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **workspaceId** | **String**| Workspace ID | 
| **body** | [**Workspace**](Workspace.html)| Workspace | 
{: class="table-striped"}


### Return type

[**Workspace**](Workspace.html)

<a name="putContentmanagementWorkspaceMember"></a>

# **putContentmanagementWorkspaceMember**



> [WorkspaceMember](WorkspaceMember.html) putContentmanagementWorkspaceMember(workspaceId, memberId, body)

Add a member to a workspace

Wraps PUT /api/v2/contentmanagement/workspaces/{workspaceId}/members/{memberId}  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ContentManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ContentManagementApi apiInstance = new ContentManagementApi();
String workspaceId = "workspaceId_example"; // String | Workspace ID
String memberId = "memberId_example"; // String | Member ID
WorkspaceMember body = new WorkspaceMember(); // WorkspaceMember | Workspace Member
try {
    WorkspaceMember result = apiInstance.putContentmanagementWorkspaceMember(workspaceId, memberId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentManagementApi#putContentmanagementWorkspaceMember");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **workspaceId** | **String**| Workspace ID | 
| **memberId** | **String**| Member ID | 
| **body** | [**WorkspaceMember**](WorkspaceMember.html)| Workspace Member | 
{: class="table-striped"}


### Return type

[**WorkspaceMember**](WorkspaceMember.html)

<a name="putContentmanagementWorkspaceTagvalue"></a>

# **putContentmanagementWorkspaceTagvalue**



> [TagValue](TagValue.html) putContentmanagementWorkspaceTagvalue(workspaceId, tagId, body)

Update a workspace tag. Will update all documents with the new tag value.

Wraps PUT /api/v2/contentmanagement/workspaces/{workspaceId}/tagvalues/{tagId}  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ContentManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ContentManagementApi apiInstance = new ContentManagementApi();
String workspaceId = "workspaceId_example"; // String | Workspace ID
String tagId = "tagId_example"; // String | Tag ID
TagValue body = new TagValue(); // TagValue | Workspace
try {
    TagValue result = apiInstance.putContentmanagementWorkspaceTagvalue(workspaceId, tagId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentManagementApi#putContentmanagementWorkspaceTagvalue");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **workspaceId** | **String**| Workspace ID | 
| **tagId** | **String**| Tag ID | 
| **body** | [**TagValue**](TagValue.html)| Workspace | 
{: class="table-striped"}


### Return type

[**TagValue**](TagValue.html)

