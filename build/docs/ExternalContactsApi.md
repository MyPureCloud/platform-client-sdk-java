---
title: ExternalContactsApi
---
## ExternalContactsApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**deleteExternalcontactsContact**](ExternalContactsApi.html#deleteExternalcontactsContact) | Delete an external contact |
| [**deleteExternalcontactsContactNote**](ExternalContactsApi.html#deleteExternalcontactsContactNote) | Delete a note for an external contact |
| [**deleteExternalcontactsContactsSchema**](ExternalContactsApi.html#deleteExternalcontactsContactsSchema) | Delete a schema |
| [**deleteExternalcontactsOrganization**](ExternalContactsApi.html#deleteExternalcontactsOrganization) | Delete an external organization |
| [**deleteExternalcontactsOrganizationNote**](ExternalContactsApi.html#deleteExternalcontactsOrganizationNote) | Delete a note for an external organization |
| [**deleteExternalcontactsOrganizationTrustor**](ExternalContactsApi.html#deleteExternalcontactsOrganizationTrustor) | Unlink the Trustor for this External Organization |
| [**deleteExternalcontactsRelationship**](ExternalContactsApi.html#deleteExternalcontactsRelationship) | Delete a relationship |
| [**getExternalcontactsContact**](ExternalContactsApi.html#getExternalcontactsContact) | Fetch an external contact |
| [**getExternalcontactsContactNote**](ExternalContactsApi.html#getExternalcontactsContactNote) | Fetch a note for an external contact |
| [**getExternalcontactsContactNotes**](ExternalContactsApi.html#getExternalcontactsContactNotes) | List notes for an external contact |
| [**getExternalcontactsContacts**](ExternalContactsApi.html#getExternalcontactsContacts) | Search for external contacts |
| [**getExternalcontactsContactsSchema**](ExternalContactsApi.html#getExternalcontactsContactsSchema) | Get a schema |
| [**getExternalcontactsContactsSchemaVersion**](ExternalContactsApi.html#getExternalcontactsContactsSchemaVersion) | Get a specific version of a schema |
| [**getExternalcontactsContactsSchemaVersions**](ExternalContactsApi.html#getExternalcontactsContactsSchemaVersions) | Get all versions of an external contact's schema |
| [**getExternalcontactsContactsSchemas**](ExternalContactsApi.html#getExternalcontactsContactsSchemas) | Get a list of schemas. |
| [**getExternalcontactsOrganization**](ExternalContactsApi.html#getExternalcontactsOrganization) | Fetch an external organization |
| [**getExternalcontactsOrganizationContacts**](ExternalContactsApi.html#getExternalcontactsOrganizationContacts) | Search for external contacts in an external organization |
| [**getExternalcontactsOrganizationNote**](ExternalContactsApi.html#getExternalcontactsOrganizationNote) | Fetch a note for an external organization |
| [**getExternalcontactsOrganizationNotes**](ExternalContactsApi.html#getExternalcontactsOrganizationNotes) | List notes for an external organization |
| [**getExternalcontactsOrganizationRelationships**](ExternalContactsApi.html#getExternalcontactsOrganizationRelationships) | Fetch a relationship for an external organization |
| [**getExternalcontactsOrganizations**](ExternalContactsApi.html#getExternalcontactsOrganizations) | Search for external organizations |
| [**getExternalcontactsOrganizationsSchema**](ExternalContactsApi.html#getExternalcontactsOrganizationsSchema) | Get a schema |
| [**getExternalcontactsOrganizationsSchemaVersion**](ExternalContactsApi.html#getExternalcontactsOrganizationsSchemaVersion) | Get a specific version of a schema |
| [**getExternalcontactsOrganizationsSchemaVersions**](ExternalContactsApi.html#getExternalcontactsOrganizationsSchemaVersions) | Get all versions of an external organization's schema |
| [**getExternalcontactsOrganizationsSchemas**](ExternalContactsApi.html#getExternalcontactsOrganizationsSchemas) | Get a list of schemas. |
| [**getExternalcontactsRelationship**](ExternalContactsApi.html#getExternalcontactsRelationship) | Fetch a relationship |
| [**getExternalcontactsReversewhitepageslookup**](ExternalContactsApi.html#getExternalcontactsReversewhitepageslookup) | Look up contacts and externalOrganizations based on an attribute. Maximum of 25 values returned. |
| [**getExternalcontactsScanContacts**](ExternalContactsApi.html#getExternalcontactsScanContacts) | Scan for external contacts using paging |
| [**getExternalcontactsScanNotes**](ExternalContactsApi.html#getExternalcontactsScanNotes) | Scan for notes using paging |
| [**getExternalcontactsScanOrganizations**](ExternalContactsApi.html#getExternalcontactsScanOrganizations) | Scan for external organizations using paging |
| [**getExternalcontactsScanRelationships**](ExternalContactsApi.html#getExternalcontactsScanRelationships) | Scan for relationships |
| [**postExternalcontactsBulkContacts**](ExternalContactsApi.html#postExternalcontactsBulkContacts) | Bulk fetch contacts |
| [**postExternalcontactsBulkContactsAdd**](ExternalContactsApi.html#postExternalcontactsBulkContactsAdd) | Bulk add contacts |
| [**postExternalcontactsBulkContactsRemove**](ExternalContactsApi.html#postExternalcontactsBulkContactsRemove) | Bulk remove contacts |
| [**postExternalcontactsBulkContactsUpdate**](ExternalContactsApi.html#postExternalcontactsBulkContactsUpdate) | Bulk update contacts |
| [**postExternalcontactsBulkNotes**](ExternalContactsApi.html#postExternalcontactsBulkNotes) | Bulk fetch notes |
| [**postExternalcontactsBulkNotesAdd**](ExternalContactsApi.html#postExternalcontactsBulkNotesAdd) | Bulk add notes |
| [**postExternalcontactsBulkNotesRemove**](ExternalContactsApi.html#postExternalcontactsBulkNotesRemove) | Bulk remove notes |
| [**postExternalcontactsBulkNotesUpdate**](ExternalContactsApi.html#postExternalcontactsBulkNotesUpdate) | Bulk update notes |
| [**postExternalcontactsBulkOrganizations**](ExternalContactsApi.html#postExternalcontactsBulkOrganizations) | Bulk fetch organizations |
| [**postExternalcontactsBulkOrganizationsAdd**](ExternalContactsApi.html#postExternalcontactsBulkOrganizationsAdd) | Bulk add organizations |
| [**postExternalcontactsBulkOrganizationsRemove**](ExternalContactsApi.html#postExternalcontactsBulkOrganizationsRemove) | Bulk remove organizations |
| [**postExternalcontactsBulkOrganizationsUpdate**](ExternalContactsApi.html#postExternalcontactsBulkOrganizationsUpdate) | Bulk update organizations |
| [**postExternalcontactsBulkRelationships**](ExternalContactsApi.html#postExternalcontactsBulkRelationships) | Bulk fetch relationships |
| [**postExternalcontactsBulkRelationshipsAdd**](ExternalContactsApi.html#postExternalcontactsBulkRelationshipsAdd) | Bulk add relationships |
| [**postExternalcontactsBulkRelationshipsRemove**](ExternalContactsApi.html#postExternalcontactsBulkRelationshipsRemove) | Bulk remove relationships |
| [**postExternalcontactsBulkRelationshipsUpdate**](ExternalContactsApi.html#postExternalcontactsBulkRelationshipsUpdate) | Bulk update relationships |
| [**postExternalcontactsContactNotes**](ExternalContactsApi.html#postExternalcontactsContactNotes) | Create a note for an external contact |
| [**postExternalcontactsContacts**](ExternalContactsApi.html#postExternalcontactsContacts) | Create an external contact |
| [**postExternalcontactsContactsSchemas**](ExternalContactsApi.html#postExternalcontactsContactsSchemas) | Create a schema |
| [**postExternalcontactsOrganizationNotes**](ExternalContactsApi.html#postExternalcontactsOrganizationNotes) | Create a note for an external organization |
| [**postExternalcontactsOrganizations**](ExternalContactsApi.html#postExternalcontactsOrganizations) | Create an external organization |
| [**postExternalcontactsOrganizationsSchemas**](ExternalContactsApi.html#postExternalcontactsOrganizationsSchemas) | Create a schema |
| [**postExternalcontactsRelationships**](ExternalContactsApi.html#postExternalcontactsRelationships) | Create a relationship |
| [**putExternalcontactsContact**](ExternalContactsApi.html#putExternalcontactsContact) | Update an external contact |
| [**putExternalcontactsContactNote**](ExternalContactsApi.html#putExternalcontactsContactNote) | Update a note for an external contact |
| [**putExternalcontactsContactsSchema**](ExternalContactsApi.html#putExternalcontactsContactsSchema) | Update a schema |
| [**putExternalcontactsConversation**](ExternalContactsApi.html#putExternalcontactsConversation) | Associate/disassociate an external contact with a conversation |
| [**putExternalcontactsOrganization**](ExternalContactsApi.html#putExternalcontactsOrganization) | Update an external organization |
| [**putExternalcontactsOrganizationNote**](ExternalContactsApi.html#putExternalcontactsOrganizationNote) | Update a note for an external organization |
| [**putExternalcontactsOrganizationTrustorTrustorId**](ExternalContactsApi.html#putExternalcontactsOrganizationTrustorTrustorId) | Links a Trustor with an External Organization |
| [**putExternalcontactsOrganizationsSchema**](ExternalContactsApi.html#putExternalcontactsOrganizationsSchema) | Update a schema |
| [**putExternalcontactsRelationship**](ExternalContactsApi.html#putExternalcontactsRelationship) | Update a relationship |
{: class="table-striped"}

<a name="deleteExternalcontactsContact"></a>

# **deleteExternalcontactsContact**



> Empty deleteExternalcontactsContact(contactId)

Delete an external contact

Wraps DELETE /api/v2/externalcontacts/contacts/{contactId}  

Requires ANY permissions: 

* externalContacts:contact:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ExternalContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ExternalContactsApi apiInstance = new ExternalContactsApi();
String contactId = "contactId_example"; // String | ExternalContact ID
try {
    Empty result = apiInstance.deleteExternalcontactsContact(contactId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalContactsApi#deleteExternalcontactsContact");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **contactId** | **String**| ExternalContact ID | 
{: class="table-striped"}


### Return type

**Empty**

<a name="deleteExternalcontactsContactNote"></a>

# **deleteExternalcontactsContactNote**



> Empty deleteExternalcontactsContactNote(contactId, noteId)

Delete a note for an external contact

Wraps DELETE /api/v2/externalcontacts/contacts/{contactId}/notes/{noteId}  

Requires ANY permissions: 

* externalContacts:contact:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ExternalContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ExternalContactsApi apiInstance = new ExternalContactsApi();
String contactId = "contactId_example"; // String | ExternalContact Id
String noteId = "noteId_example"; // String | Note Id
try {
    Empty result = apiInstance.deleteExternalcontactsContactNote(contactId, noteId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalContactsApi#deleteExternalcontactsContactNote");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **contactId** | **String**| ExternalContact Id | 
| **noteId** | **String**| Note Id | 
{: class="table-striped"}


### Return type

**Empty**

<a name="deleteExternalcontactsContactsSchema"></a>

# **deleteExternalcontactsContactsSchema**



> Void deleteExternalcontactsContactsSchema(schemaId)

Delete a schema

Wraps DELETE /api/v2/externalcontacts/contacts/schemas/{schemaId}  

Requires ANY permissions: 

* externalContacts:customFields:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ExternalContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ExternalContactsApi apiInstance = new ExternalContactsApi();
String schemaId = "schemaId_example"; // String | Schema ID
try {
    apiInstance.deleteExternalcontactsContactsSchema(schemaId);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalContactsApi#deleteExternalcontactsContactsSchema");
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

<a name="deleteExternalcontactsOrganization"></a>

# **deleteExternalcontactsOrganization**



> Empty deleteExternalcontactsOrganization(externalOrganizationId)

Delete an external organization

Wraps DELETE /api/v2/externalcontacts/organizations/{externalOrganizationId}  

Requires ANY permissions: 

* relate:externalOrganization:delete
* externalContacts:externalOrganization:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ExternalContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ExternalContactsApi apiInstance = new ExternalContactsApi();
String externalOrganizationId = "externalOrganizationId_example"; // String | External Organization ID
try {
    Empty result = apiInstance.deleteExternalcontactsOrganization(externalOrganizationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalContactsApi#deleteExternalcontactsOrganization");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **externalOrganizationId** | **String**| External Organization ID | 
{: class="table-striped"}


### Return type

**Empty**

<a name="deleteExternalcontactsOrganizationNote"></a>

# **deleteExternalcontactsOrganizationNote**



> Empty deleteExternalcontactsOrganizationNote(externalOrganizationId, noteId)

Delete a note for an external organization

Wraps DELETE /api/v2/externalcontacts/organizations/{externalOrganizationId}/notes/{noteId}  

Requires ANY permissions: 

* externalContacts:externalOrganization:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ExternalContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ExternalContactsApi apiInstance = new ExternalContactsApi();
String externalOrganizationId = "externalOrganizationId_example"; // String | External Organization Id
String noteId = "noteId_example"; // String | Note Id
try {
    Empty result = apiInstance.deleteExternalcontactsOrganizationNote(externalOrganizationId, noteId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalContactsApi#deleteExternalcontactsOrganizationNote");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **externalOrganizationId** | **String**| External Organization Id | 
| **noteId** | **String**| Note Id | 
{: class="table-striped"}


### Return type

**Empty**

<a name="deleteExternalcontactsOrganizationTrustor"></a>

# **deleteExternalcontactsOrganizationTrustor**



> Void deleteExternalcontactsOrganizationTrustor(externalOrganizationId)

Unlink the Trustor for this External Organization

Wraps DELETE /api/v2/externalcontacts/organizations/{externalOrganizationId}/trustor  

Requires ANY permissions: 

* externalContacts:externalOrganization:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ExternalContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ExternalContactsApi apiInstance = new ExternalContactsApi();
String externalOrganizationId = "externalOrganizationId_example"; // String | External Organization ID
try {
    apiInstance.deleteExternalcontactsOrganizationTrustor(externalOrganizationId);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalContactsApi#deleteExternalcontactsOrganizationTrustor");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **externalOrganizationId** | **String**| External Organization ID | 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="deleteExternalcontactsRelationship"></a>

# **deleteExternalcontactsRelationship**



> Empty deleteExternalcontactsRelationship(relationshipId)

Delete a relationship

Wraps DELETE /api/v2/externalcontacts/relationships/{relationshipId}  

Requires ANY permissions: 

* externalContacts:externalOrganization:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ExternalContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ExternalContactsApi apiInstance = new ExternalContactsApi();
String relationshipId = "relationshipId_example"; // String | Relationship Id
try {
    Empty result = apiInstance.deleteExternalcontactsRelationship(relationshipId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalContactsApi#deleteExternalcontactsRelationship");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **relationshipId** | **String**| Relationship Id | 
{: class="table-striped"}


### Return type

**Empty**

<a name="getExternalcontactsContact"></a>

# **getExternalcontactsContact**



> [ExternalContact](ExternalContact.html) getExternalcontactsContact(contactId, expand)

Fetch an external contact

Wraps GET /api/v2/externalcontacts/contacts/{contactId}  

Requires ANY permissions: 

* externalContacts:contact:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ExternalContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ExternalContactsApi apiInstance = new ExternalContactsApi();
String contactId = "contactId_example"; // String | ExternalContact ID
List<String> expand = Arrays.asList(null); // List<String> | which fields, if any, to expand (externalOrganization,externalDataSources)
try {
    ExternalContact result = apiInstance.getExternalcontactsContact(contactId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalContactsApi#getExternalcontactsContact");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **contactId** | **String**| ExternalContact ID | 
| **expand** | [**List&lt;String&gt;**](String.html)| which fields, if any, to expand (externalOrganization,externalDataSources) | [optional]<br />**Values**: externalOrganization, externalDataSources 
{: class="table-striped"}


### Return type

[**ExternalContact**](ExternalContact.html)

<a name="getExternalcontactsContactNote"></a>

# **getExternalcontactsContactNote**



> [Note](Note.html) getExternalcontactsContactNote(contactId, noteId, expand)

Fetch a note for an external contact

Wraps GET /api/v2/externalcontacts/contacts/{contactId}/notes/{noteId}  

Requires ANY permissions: 

* externalContacts:contact:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ExternalContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ExternalContactsApi apiInstance = new ExternalContactsApi();
String contactId = "contactId_example"; // String | ExternalContact Id
String noteId = "noteId_example"; // String | Note Id
List<String> expand = Arrays.asList(null); // List<String> | which fields, if any, to expand
try {
    Note result = apiInstance.getExternalcontactsContactNote(contactId, noteId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalContactsApi#getExternalcontactsContactNote");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **contactId** | **String**| ExternalContact Id | 
| **noteId** | **String**| Note Id | 
| **expand** | [**List&lt;String&gt;**](String.html)| which fields, if any, to expand | [optional]<br />**Values**: author, externalDataSources 
{: class="table-striped"}


### Return type

[**Note**](Note.html)

<a name="getExternalcontactsContactNotes"></a>

# **getExternalcontactsContactNotes**



> [NoteListing](NoteListing.html) getExternalcontactsContactNotes(contactId, pageSize, pageNumber, sortOrder, expand)

List notes for an external contact

Wraps GET /api/v2/externalcontacts/contacts/{contactId}/notes  

Requires ANY permissions: 

* externalContacts:contact:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ExternalContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ExternalContactsApi apiInstance = new ExternalContactsApi();
String contactId = "contactId_example"; // String | ExternalContact Id
Integer pageSize = 20; // Integer | Page size (limited to fetching first 1,000 records; pageNumber * pageSize must be <= 1,000)
Integer pageNumber = 1; // Integer | Page number (limited to fetching first 1,000 records; pageNumber * pageSize must be <= 1,000)
String sortOrder = "sortOrder_example"; // String | Sort order
List<String> expand = Arrays.asList(null); // List<String> | which fields, if any, to expand
try {
    NoteListing result = apiInstance.getExternalcontactsContactNotes(contactId, pageSize, pageNumber, sortOrder, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalContactsApi#getExternalcontactsContactNotes");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **contactId** | **String**| ExternalContact Id | 
| **pageSize** | **Integer**| Page size (limited to fetching first 1,000 records; pageNumber * pageSize must be &lt;&#x3D; 1,000) | [optional] [default to 20] 
| **pageNumber** | **Integer**| Page number (limited to fetching first 1,000 records; pageNumber * pageSize must be &lt;&#x3D; 1,000) | [optional] [default to 1] 
| **sortOrder** | **String**| Sort order | [optional] 
| **expand** | [**List&lt;String&gt;**](String.html)| which fields, if any, to expand | [optional]<br />**Values**: author, externalDataSources 
{: class="table-striped"}


### Return type

[**NoteListing**](NoteListing.html)

<a name="getExternalcontactsContacts"></a>

# **getExternalcontactsContacts**



> [ContactListing](ContactListing.html) getExternalcontactsContacts(pageSize, pageNumber, q, sortOrder, expand)

Search for external contacts

Wraps GET /api/v2/externalcontacts/contacts  

Requires ANY permissions: 

* externalContacts:contact:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ExternalContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ExternalContactsApi apiInstance = new ExternalContactsApi();
Integer pageSize = 20; // Integer | Page size (limited to fetching first 1,000 records; pageNumber * pageSize must be <= 1,000)
Integer pageNumber = 1; // Integer | Page number (limited to fetching first 1,000 records; pageNumber * pageSize must be <= 1,000)
String q = "q_example"; // String | User supplied search keywords (no special syntax is currently supported)
String sortOrder = "sortOrder_example"; // String | Sort order
List<String> expand = Arrays.asList(null); // List<String> | which fields, if any, to expand
try {
    ContactListing result = apiInstance.getExternalcontactsContacts(pageSize, pageNumber, q, sortOrder, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalContactsApi#getExternalcontactsContacts");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| Page size (limited to fetching first 1,000 records; pageNumber * pageSize must be &lt;&#x3D; 1,000) | [optional] [default to 20] 
| **pageNumber** | **Integer**| Page number (limited to fetching first 1,000 records; pageNumber * pageSize must be &lt;&#x3D; 1,000) | [optional] [default to 1] 
| **q** | **String**| User supplied search keywords (no special syntax is currently supported) | [optional] 
| **sortOrder** | **String**| Sort order | [optional] 
| **expand** | [**List&lt;String&gt;**](String.html)| which fields, if any, to expand | [optional]<br />**Values**: externalOrganization, externalDataSources 
{: class="table-striped"}


### Return type

[**ContactListing**](ContactListing.html)

<a name="getExternalcontactsContactsSchema"></a>

# **getExternalcontactsContactsSchema**



> [DataSchema](DataSchema.html) getExternalcontactsContactsSchema(schemaId)

Get a schema

Wraps GET /api/v2/externalcontacts/contacts/schemas/{schemaId}  

Requires ANY permissions: 

* externalContacts:customFields:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ExternalContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ExternalContactsApi apiInstance = new ExternalContactsApi();
String schemaId = "schemaId_example"; // String | Schema ID
try {
    DataSchema result = apiInstance.getExternalcontactsContactsSchema(schemaId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalContactsApi#getExternalcontactsContactsSchema");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **schemaId** | **String**| Schema ID | 
{: class="table-striped"}


### Return type

[**DataSchema**](DataSchema.html)

<a name="getExternalcontactsContactsSchemaVersion"></a>

# **getExternalcontactsContactsSchemaVersion**



> [DataSchema](DataSchema.html) getExternalcontactsContactsSchemaVersion(schemaId, versionId)

Get a specific version of a schema

Wraps GET /api/v2/externalcontacts/contacts/schemas/{schemaId}/versions/{versionId}  

Requires ANY permissions: 

* externalContacts:customFields:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ExternalContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ExternalContactsApi apiInstance = new ExternalContactsApi();
String schemaId = "schemaId_example"; // String | Schema ID
String versionId = "versionId_example"; // String | Schema version
try {
    DataSchema result = apiInstance.getExternalcontactsContactsSchemaVersion(schemaId, versionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalContactsApi#getExternalcontactsContactsSchemaVersion");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **schemaId** | **String**| Schema ID | 
| **versionId** | **String**| Schema version | 
{: class="table-striped"}


### Return type

[**DataSchema**](DataSchema.html)

<a name="getExternalcontactsContactsSchemaVersions"></a>

# **getExternalcontactsContactsSchemaVersions**



> [DataSchema](DataSchema.html) getExternalcontactsContactsSchemaVersions(schemaId)

Get all versions of an external contact's schema

Wraps GET /api/v2/externalcontacts/contacts/schemas/{schemaId}/versions  

Requires ANY permissions: 

* externalContacts:customFields:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ExternalContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ExternalContactsApi apiInstance = new ExternalContactsApi();
String schemaId = "schemaId_example"; // String | Schema ID
try {
    DataSchema result = apiInstance.getExternalcontactsContactsSchemaVersions(schemaId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalContactsApi#getExternalcontactsContactsSchemaVersions");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **schemaId** | **String**| Schema ID | 
{: class="table-striped"}


### Return type

[**DataSchema**](DataSchema.html)

<a name="getExternalcontactsContactsSchemas"></a>

# **getExternalcontactsContactsSchemas**



> [DataSchemaListing](DataSchemaListing.html) getExternalcontactsContactsSchemas()

Get a list of schemas.

Wraps GET /api/v2/externalcontacts/contacts/schemas  

Requires ANY permissions: 

* externalContacts:customFields:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ExternalContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ExternalContactsApi apiInstance = new ExternalContactsApi();
try {
    DataSchemaListing result = apiInstance.getExternalcontactsContactsSchemas();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalContactsApi#getExternalcontactsContactsSchemas");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**DataSchemaListing**](DataSchemaListing.html)

<a name="getExternalcontactsOrganization"></a>

# **getExternalcontactsOrganization**



> [ExternalOrganization](ExternalOrganization.html) getExternalcontactsOrganization(externalOrganizationId, expand, includeTrustors)

Fetch an external organization

Wraps GET /api/v2/externalcontacts/organizations/{externalOrganizationId}  

Requires ANY permissions: 

* relate:externalOrganization:view
* externalContacts:externalOrganization:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ExternalContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ExternalContactsApi apiInstance = new ExternalContactsApi();
String externalOrganizationId = "externalOrganizationId_example"; // String | External Organization ID
String expand = "expand_example"; // String | which fields, if any, to expand (externalDataSources)
Boolean includeTrustors = true; // Boolean | (true or false) whether or not to include trustor information embedded in the externalOrganization
try {
    ExternalOrganization result = apiInstance.getExternalcontactsOrganization(externalOrganizationId, expand, includeTrustors);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalContactsApi#getExternalcontactsOrganization");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **externalOrganizationId** | **String**| External Organization ID | 
| **expand** | **String**| which fields, if any, to expand (externalDataSources) | [optional]<br />**Values**: externalDataSources 
| **includeTrustors** | **Boolean**| (true or false) whether or not to include trustor information embedded in the externalOrganization | [optional] 
{: class="table-striped"}


### Return type

[**ExternalOrganization**](ExternalOrganization.html)

<a name="getExternalcontactsOrganizationContacts"></a>

# **getExternalcontactsOrganizationContacts**



> [ContactListing](ContactListing.html) getExternalcontactsOrganizationContacts(externalOrganizationId, pageSize, pageNumber, q, sortOrder, expand)

Search for external contacts in an external organization

Wraps GET /api/v2/externalcontacts/organizations/{externalOrganizationId}/contacts  

Requires ANY permissions: 

* externalContacts:contact:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ExternalContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ExternalContactsApi apiInstance = new ExternalContactsApi();
String externalOrganizationId = "externalOrganizationId_example"; // String | External Organization ID
Integer pageSize = 20; // Integer | Page size (limited to fetching first 1,000 records; pageNumber * pageSize must be <= 1,000)
Integer pageNumber = 1; // Integer | Page number (limited to fetching first 1,000 records; pageNumber * pageSize must be <= 1,000)
String q = "q_example"; // String | User supplied search keywords (no special syntax is currently supported)
String sortOrder = "sortOrder_example"; // String | Sort order
List<String> expand = Arrays.asList(null); // List<String> | which fields, if any, to expand
try {
    ContactListing result = apiInstance.getExternalcontactsOrganizationContacts(externalOrganizationId, pageSize, pageNumber, q, sortOrder, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalContactsApi#getExternalcontactsOrganizationContacts");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **externalOrganizationId** | **String**| External Organization ID | 
| **pageSize** | **Integer**| Page size (limited to fetching first 1,000 records; pageNumber * pageSize must be &lt;&#x3D; 1,000) | [optional] [default to 20] 
| **pageNumber** | **Integer**| Page number (limited to fetching first 1,000 records; pageNumber * pageSize must be &lt;&#x3D; 1,000) | [optional] [default to 1] 
| **q** | **String**| User supplied search keywords (no special syntax is currently supported) | [optional] 
| **sortOrder** | **String**| Sort order | [optional] 
| **expand** | [**List&lt;String&gt;**](String.html)| which fields, if any, to expand | [optional]<br />**Values**: externalOrganization, externalDataSources 
{: class="table-striped"}


### Return type

[**ContactListing**](ContactListing.html)

<a name="getExternalcontactsOrganizationNote"></a>

# **getExternalcontactsOrganizationNote**



> [Note](Note.html) getExternalcontactsOrganizationNote(externalOrganizationId, noteId, expand)

Fetch a note for an external organization

Wraps GET /api/v2/externalcontacts/organizations/{externalOrganizationId}/notes/{noteId}  

Requires ANY permissions: 

* externalContacts:externalOrganization:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ExternalContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ExternalContactsApi apiInstance = new ExternalContactsApi();
String externalOrganizationId = "externalOrganizationId_example"; // String | External Organization Id
String noteId = "noteId_example"; // String | Note Id
List<String> expand = Arrays.asList(null); // List<String> | which fields, if any, to expand
try {
    Note result = apiInstance.getExternalcontactsOrganizationNote(externalOrganizationId, noteId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalContactsApi#getExternalcontactsOrganizationNote");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **externalOrganizationId** | **String**| External Organization Id | 
| **noteId** | **String**| Note Id | 
| **expand** | [**List&lt;String&gt;**](String.html)| which fields, if any, to expand | [optional]<br />**Values**: author, externalDataSources 
{: class="table-striped"}


### Return type

[**Note**](Note.html)

<a name="getExternalcontactsOrganizationNotes"></a>

# **getExternalcontactsOrganizationNotes**



> [NoteListing](NoteListing.html) getExternalcontactsOrganizationNotes(externalOrganizationId, pageSize, pageNumber, sortOrder, expand)

List notes for an external organization

Wraps GET /api/v2/externalcontacts/organizations/{externalOrganizationId}/notes  

Requires ANY permissions: 

* relate:externalOrganization:view
* externalContacts:externalOrganization:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ExternalContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ExternalContactsApi apiInstance = new ExternalContactsApi();
String externalOrganizationId = "externalOrganizationId_example"; // String | External Organization Id
Integer pageSize = 20; // Integer | Page size (limited to fetching first 1,000 records; pageNumber * pageSize must be <= 1,000)
Integer pageNumber = 1; // Integer | Page number (limited to fetching first 1,000 records; pageNumber * pageSize must be <= 1,000)
String sortOrder = "sortOrder_example"; // String | Sort order
List<String> expand = Arrays.asList(null); // List<String> | which fields, if any, to expand
try {
    NoteListing result = apiInstance.getExternalcontactsOrganizationNotes(externalOrganizationId, pageSize, pageNumber, sortOrder, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalContactsApi#getExternalcontactsOrganizationNotes");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **externalOrganizationId** | **String**| External Organization Id | 
| **pageSize** | **Integer**| Page size (limited to fetching first 1,000 records; pageNumber * pageSize must be &lt;&#x3D; 1,000) | [optional] [default to 20] 
| **pageNumber** | **Integer**| Page number (limited to fetching first 1,000 records; pageNumber * pageSize must be &lt;&#x3D; 1,000) | [optional] [default to 1] 
| **sortOrder** | **String**| Sort order | [optional] 
| **expand** | [**List&lt;String&gt;**](String.html)| which fields, if any, to expand | [optional]<br />**Values**: author, externalDataSources 
{: class="table-striped"}


### Return type

[**NoteListing**](NoteListing.html)

<a name="getExternalcontactsOrganizationRelationships"></a>

# **getExternalcontactsOrganizationRelationships**



> [RelationshipListing](RelationshipListing.html) getExternalcontactsOrganizationRelationships(externalOrganizationId, pageSize, pageNumber, expand, sortOrder)

Fetch a relationship for an external organization

Wraps GET /api/v2/externalcontacts/organizations/{externalOrganizationId}/relationships  

Requires ANY permissions: 

* relate:externalOrganization:view
* externalContacts:externalOrganization:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ExternalContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ExternalContactsApi apiInstance = new ExternalContactsApi();
String externalOrganizationId = "externalOrganizationId_example"; // String | External Organization ID
Integer pageSize = 20; // Integer | Page size (limited to fetching first 1,000 records; pageNumber * pageSize must be <= 1,000)
Integer pageNumber = 1; // Integer | Page number (limited to fetching first 1,000 records; pageNumber * pageSize must be <= 1,000)
String expand = "expand_example"; // String | which fields, if any, to expand
String sortOrder = "sortOrder_example"; // String | Sort order
try {
    RelationshipListing result = apiInstance.getExternalcontactsOrganizationRelationships(externalOrganizationId, pageSize, pageNumber, expand, sortOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalContactsApi#getExternalcontactsOrganizationRelationships");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **externalOrganizationId** | **String**| External Organization ID | 
| **pageSize** | **Integer**| Page size (limited to fetching first 1,000 records; pageNumber * pageSize must be &lt;&#x3D; 1,000) | [optional] [default to 20] 
| **pageNumber** | **Integer**| Page number (limited to fetching first 1,000 records; pageNumber * pageSize must be &lt;&#x3D; 1,000) | [optional] [default to 1] 
| **expand** | **String**| which fields, if any, to expand | [optional]<br />**Values**: externalDataSources 
| **sortOrder** | **String**| Sort order | [optional] 
{: class="table-striped"}


### Return type

[**RelationshipListing**](RelationshipListing.html)

<a name="getExternalcontactsOrganizations"></a>

# **getExternalcontactsOrganizations**



> [ExternalOrganizationListing](ExternalOrganizationListing.html) getExternalcontactsOrganizations(pageSize, pageNumber, q, trustorId, sortOrder, expand, includeTrustors)

Search for external organizations

Wraps GET /api/v2/externalcontacts/organizations  

Requires ANY permissions: 

* relate:externalOrganization:view
* externalContacts:externalOrganization:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ExternalContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ExternalContactsApi apiInstance = new ExternalContactsApi();
Integer pageSize = 20; // Integer | Page size (limited to fetching first 1,000 records; pageNumber * pageSize must be <= 1,000)
Integer pageNumber = 1; // Integer | Page number (limited to fetching first 1,000 records; pageNumber * pageSize must be <= 1,000)
String q = "q_example"; // String | Search query
List<String> trustorId = Arrays.asList(null); // List<String> | Search for external organizations by trustorIds (limit 25). If supplied, the 'q' parameters is ignored. Items are returned in the order requested
String sortOrder = "sortOrder_example"; // String | Sort order
List<String> expand = Arrays.asList(null); // List<String> | which fields, if any, to expand
Boolean includeTrustors = true; // Boolean | (true or false) whether or not to include trustor information embedded in the externalOrganization
try {
    ExternalOrganizationListing result = apiInstance.getExternalcontactsOrganizations(pageSize, pageNumber, q, trustorId, sortOrder, expand, includeTrustors);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalContactsApi#getExternalcontactsOrganizations");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| Page size (limited to fetching first 1,000 records; pageNumber * pageSize must be &lt;&#x3D; 1,000) | [optional] [default to 20] 
| **pageNumber** | **Integer**| Page number (limited to fetching first 1,000 records; pageNumber * pageSize must be &lt;&#x3D; 1,000) | [optional] [default to 1] 
| **q** | **String**| Search query | [optional] 
| **trustorId** | [**List&lt;String&gt;**](String.html)| Search for external organizations by trustorIds (limit 25). If supplied, the &#39;q&#39; parameters is ignored. Items are returned in the order requested | [optional] 
| **sortOrder** | **String**| Sort order | [optional] 
| **expand** | [**List&lt;String&gt;**](String.html)| which fields, if any, to expand | [optional]<br />**Values**: externalDataSources 
| **includeTrustors** | **Boolean**| (true or false) whether or not to include trustor information embedded in the externalOrganization | [optional] 
{: class="table-striped"}


### Return type

[**ExternalOrganizationListing**](ExternalOrganizationListing.html)

<a name="getExternalcontactsOrganizationsSchema"></a>

# **getExternalcontactsOrganizationsSchema**



> [DataSchema](DataSchema.html) getExternalcontactsOrganizationsSchema(schemaId)

Get a schema

Wraps GET /api/v2/externalcontacts/organizations/schemas/{schemaId}  

Requires ANY permissions: 

* externalContacts:customFields:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ExternalContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ExternalContactsApi apiInstance = new ExternalContactsApi();
String schemaId = "schemaId_example"; // String | Schema ID
try {
    DataSchema result = apiInstance.getExternalcontactsOrganizationsSchema(schemaId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalContactsApi#getExternalcontactsOrganizationsSchema");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **schemaId** | **String**| Schema ID | 
{: class="table-striped"}


### Return type

[**DataSchema**](DataSchema.html)

<a name="getExternalcontactsOrganizationsSchemaVersion"></a>

# **getExternalcontactsOrganizationsSchemaVersion**



> [DataSchema](DataSchema.html) getExternalcontactsOrganizationsSchemaVersion(schemaId, versionId)

Get a specific version of a schema

Wraps GET /api/v2/externalcontacts/organizations/schemas/{schemaId}/versions/{versionId}  

Requires ANY permissions: 

* externalContacts:customFields:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ExternalContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ExternalContactsApi apiInstance = new ExternalContactsApi();
String schemaId = "schemaId_example"; // String | Schema ID
String versionId = "versionId_example"; // String | Schema version
try {
    DataSchema result = apiInstance.getExternalcontactsOrganizationsSchemaVersion(schemaId, versionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalContactsApi#getExternalcontactsOrganizationsSchemaVersion");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **schemaId** | **String**| Schema ID | 
| **versionId** | **String**| Schema version | 
{: class="table-striped"}


### Return type

[**DataSchema**](DataSchema.html)

<a name="getExternalcontactsOrganizationsSchemaVersions"></a>

# **getExternalcontactsOrganizationsSchemaVersions**



> [DataSchema](DataSchema.html) getExternalcontactsOrganizationsSchemaVersions(schemaId)

Get all versions of an external organization's schema

Wraps GET /api/v2/externalcontacts/organizations/schemas/{schemaId}/versions  

Requires ANY permissions: 

* externalContacts:customFields:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ExternalContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ExternalContactsApi apiInstance = new ExternalContactsApi();
String schemaId = "schemaId_example"; // String | Schema ID
try {
    DataSchema result = apiInstance.getExternalcontactsOrganizationsSchemaVersions(schemaId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalContactsApi#getExternalcontactsOrganizationsSchemaVersions");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **schemaId** | **String**| Schema ID | 
{: class="table-striped"}


### Return type

[**DataSchema**](DataSchema.html)

<a name="getExternalcontactsOrganizationsSchemas"></a>

# **getExternalcontactsOrganizationsSchemas**



> [DataSchemaListing](DataSchemaListing.html) getExternalcontactsOrganizationsSchemas()

Get a list of schemas.

Wraps GET /api/v2/externalcontacts/organizations/schemas  

Requires ANY permissions: 

* externalContacts:customFields:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ExternalContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ExternalContactsApi apiInstance = new ExternalContactsApi();
try {
    DataSchemaListing result = apiInstance.getExternalcontactsOrganizationsSchemas();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalContactsApi#getExternalcontactsOrganizationsSchemas");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**DataSchemaListing**](DataSchemaListing.html)

<a name="getExternalcontactsRelationship"></a>

# **getExternalcontactsRelationship**



> [Relationship](Relationship.html) getExternalcontactsRelationship(relationshipId, expand)

Fetch a relationship

Wraps GET /api/v2/externalcontacts/relationships/{relationshipId}  

Requires ANY permissions: 

* externalContacts:externalOrganization:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ExternalContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ExternalContactsApi apiInstance = new ExternalContactsApi();
String relationshipId = "relationshipId_example"; // String | Relationship Id
String expand = "expand_example"; // String | which fields, if any, to expand
try {
    Relationship result = apiInstance.getExternalcontactsRelationship(relationshipId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalContactsApi#getExternalcontactsRelationship");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **relationshipId** | **String**| Relationship Id | 
| **expand** | **String**| which fields, if any, to expand | [optional]<br />**Values**: externalDataSources 
{: class="table-striped"}


### Return type

[**Relationship**](Relationship.html)

<a name="getExternalcontactsReversewhitepageslookup"></a>

# **getExternalcontactsReversewhitepageslookup**



> [ReverseWhitepagesLookupResult](ReverseWhitepagesLookupResult.html) getExternalcontactsReversewhitepageslookup(lookupVal, expand)

Look up contacts and externalOrganizations based on an attribute. Maximum of 25 values returned.

Wraps GET /api/v2/externalcontacts/reversewhitepageslookup  

Requires ANY permissions: 

* externalContacts:contact:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ExternalContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ExternalContactsApi apiInstance = new ExternalContactsApi();
String lookupVal = "lookupVal_example"; // String | User supplied value to lookup contacts/externalOrganizations (supports email addresses, e164 phone numbers, Twitter screen names)
List<String> expand = Arrays.asList(null); // List<String> | which field, if any, to expand
try {
    ReverseWhitepagesLookupResult result = apiInstance.getExternalcontactsReversewhitepageslookup(lookupVal, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalContactsApi#getExternalcontactsReversewhitepageslookup");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **lookupVal** | **String**| User supplied value to lookup contacts/externalOrganizations (supports email addresses, e164 phone numbers, Twitter screen names) | 
| **expand** | [**List&lt;String&gt;**](String.html)| which field, if any, to expand | [optional]<br />**Values**: contacts.externalOrganization, externalDataSources 
{: class="table-striped"}


### Return type

[**ReverseWhitepagesLookupResult**](ReverseWhitepagesLookupResult.html)

<a name="getExternalcontactsScanContacts"></a>

# **getExternalcontactsScanContacts**



> [CursorContactListing](CursorContactListing.html) getExternalcontactsScanContacts(limit, cursor)

Scan for external contacts using paging

Wraps GET /api/v2/externalcontacts/scan/contacts  

Requires ANY permissions: 

* externalContacts:contact:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ExternalContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ExternalContactsApi apiInstance = new ExternalContactsApi();
Integer limit = 56; // Integer | The number of contacts per page; must be between 10 and 200, default is 100)
String cursor = "cursor_example"; // String | Indicates where to resume query results (not required for first page), each page returns a new cursor with a 24h TTL
try {
    CursorContactListing result = apiInstance.getExternalcontactsScanContacts(limit, cursor);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalContactsApi#getExternalcontactsScanContacts");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **limit** | **Integer**| The number of contacts per page; must be between 10 and 200, default is 100) | [optional] 
| **cursor** | **String**| Indicates where to resume query results (not required for first page), each page returns a new cursor with a 24h TTL | [optional] 
{: class="table-striped"}


### Return type

[**CursorContactListing**](CursorContactListing.html)

<a name="getExternalcontactsScanNotes"></a>

# **getExternalcontactsScanNotes**



> [CursorNoteListing](CursorNoteListing.html) getExternalcontactsScanNotes(limit, cursor)

Scan for notes using paging

Wraps GET /api/v2/externalcontacts/scan/notes  

Requires ANY permissions: 

* externalContacts:contact:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ExternalContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ExternalContactsApi apiInstance = new ExternalContactsApi();
Integer limit = 56; // Integer | The number of notes per page; must be between 10 and 200, default is 100)
String cursor = "cursor_example"; // String | Indicates where to resume query results (not required for first page), each page returns a new cursor with a 24h TTL
try {
    CursorNoteListing result = apiInstance.getExternalcontactsScanNotes(limit, cursor);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalContactsApi#getExternalcontactsScanNotes");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **limit** | **Integer**| The number of notes per page; must be between 10 and 200, default is 100) | [optional] 
| **cursor** | **String**| Indicates where to resume query results (not required for first page), each page returns a new cursor with a 24h TTL | [optional] 
{: class="table-striped"}


### Return type

[**CursorNoteListing**](CursorNoteListing.html)

<a name="getExternalcontactsScanOrganizations"></a>

# **getExternalcontactsScanOrganizations**



> [CursorOrganizationListing](CursorOrganizationListing.html) getExternalcontactsScanOrganizations(limit, cursor)

Scan for external organizations using paging

Wraps GET /api/v2/externalcontacts/scan/organizations  

Requires ANY permissions: 

* externalContacts:externalOrganization:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ExternalContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ExternalContactsApi apiInstance = new ExternalContactsApi();
Integer limit = 56; // Integer | The number of organizations per page; must be between 10 and 200, default is 100)
String cursor = "cursor_example"; // String | Indicates where to resume query results (not required for first page), each page returns a new cursor with a 24h TTL
try {
    CursorOrganizationListing result = apiInstance.getExternalcontactsScanOrganizations(limit, cursor);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalContactsApi#getExternalcontactsScanOrganizations");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **limit** | **Integer**| The number of organizations per page; must be between 10 and 200, default is 100) | [optional] 
| **cursor** | **String**| Indicates where to resume query results (not required for first page), each page returns a new cursor with a 24h TTL | [optional] 
{: class="table-striped"}


### Return type

[**CursorOrganizationListing**](CursorOrganizationListing.html)

<a name="getExternalcontactsScanRelationships"></a>

# **getExternalcontactsScanRelationships**



> [CursorRelationshipListing](CursorRelationshipListing.html) getExternalcontactsScanRelationships(limit, cursor)

Scan for relationships

Wraps GET /api/v2/externalcontacts/scan/relationships  

Requires ANY permissions: 

* externalContacts:contact:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ExternalContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ExternalContactsApi apiInstance = new ExternalContactsApi();
Integer limit = 56; // Integer | The number of relationships per page; must be between 10 and 200, default is 100)
String cursor = "cursor_example"; // String | Indicates where to resume query results (not required for first page), each page returns a new cursor with a 24h TTL
try {
    CursorRelationshipListing result = apiInstance.getExternalcontactsScanRelationships(limit, cursor);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalContactsApi#getExternalcontactsScanRelationships");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **limit** | **Integer**| The number of relationships per page; must be between 10 and 200, default is 100) | [optional] 
| **cursor** | **String**| Indicates where to resume query results (not required for first page), each page returns a new cursor with a 24h TTL | [optional] 
{: class="table-striped"}


### Return type

[**CursorRelationshipListing**](CursorRelationshipListing.html)

<a name="postExternalcontactsBulkContacts"></a>

# **postExternalcontactsBulkContacts**



> [BulkFetchContactsResponse](BulkFetchContactsResponse.html) postExternalcontactsBulkContacts(body)

Bulk fetch contacts

Wraps POST /api/v2/externalcontacts/bulk/contacts  

Requires ANY permissions: 

* externalContacts:contact:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ExternalContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ExternalContactsApi apiInstance = new ExternalContactsApi();
BulkIdsRequest body = new BulkIdsRequest(); // BulkIdsRequest | Contact ids
try {
    BulkFetchContactsResponse result = apiInstance.postExternalcontactsBulkContacts(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalContactsApi#postExternalcontactsBulkContacts");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**BulkIdsRequest**](BulkIdsRequest.html)| Contact ids | 
{: class="table-striped"}


### Return type

[**BulkFetchContactsResponse**](BulkFetchContactsResponse.html)

<a name="postExternalcontactsBulkContactsAdd"></a>

# **postExternalcontactsBulkContactsAdd**



> [BulkContactsResponse](BulkContactsResponse.html) postExternalcontactsBulkContactsAdd(body)

Bulk add contacts

Wraps POST /api/v2/externalcontacts/bulk/contacts/add  

Requires ANY permissions: 

* externalContacts:contact:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ExternalContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ExternalContactsApi apiInstance = new ExternalContactsApi();
BulkContactsRequest body = new BulkContactsRequest(); // BulkContactsRequest | Contacts
try {
    BulkContactsResponse result = apiInstance.postExternalcontactsBulkContactsAdd(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalContactsApi#postExternalcontactsBulkContactsAdd");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**BulkContactsRequest**](BulkContactsRequest.html)| Contacts | 
{: class="table-striped"}


### Return type

[**BulkContactsResponse**](BulkContactsResponse.html)

<a name="postExternalcontactsBulkContactsRemove"></a>

# **postExternalcontactsBulkContactsRemove**



> [BulkDeleteResponse](BulkDeleteResponse.html) postExternalcontactsBulkContactsRemove(body)

Bulk remove contacts

Wraps POST /api/v2/externalcontacts/bulk/contacts/remove  

Requires ANY permissions: 

* externalContacts:contact:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ExternalContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ExternalContactsApi apiInstance = new ExternalContactsApi();
BulkIdsRequest body = new BulkIdsRequest(); // BulkIdsRequest | Contact ids
try {
    BulkDeleteResponse result = apiInstance.postExternalcontactsBulkContactsRemove(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalContactsApi#postExternalcontactsBulkContactsRemove");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**BulkIdsRequest**](BulkIdsRequest.html)| Contact ids | 
{: class="table-striped"}


### Return type

[**BulkDeleteResponse**](BulkDeleteResponse.html)

<a name="postExternalcontactsBulkContactsUpdate"></a>

# **postExternalcontactsBulkContactsUpdate**



> [BulkContactsResponse](BulkContactsResponse.html) postExternalcontactsBulkContactsUpdate(body)

Bulk update contacts

Wraps POST /api/v2/externalcontacts/bulk/contacts/update  

Requires ANY permissions: 

* externalContacts:contact:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ExternalContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ExternalContactsApi apiInstance = new ExternalContactsApi();
BulkContactsRequest body = new BulkContactsRequest(); // BulkContactsRequest | Contacts
try {
    BulkContactsResponse result = apiInstance.postExternalcontactsBulkContactsUpdate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalContactsApi#postExternalcontactsBulkContactsUpdate");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**BulkContactsRequest**](BulkContactsRequest.html)| Contacts | 
{: class="table-striped"}


### Return type

[**BulkContactsResponse**](BulkContactsResponse.html)

<a name="postExternalcontactsBulkNotes"></a>

# **postExternalcontactsBulkNotes**



> [BulkFetchNotesResponse](BulkFetchNotesResponse.html) postExternalcontactsBulkNotes(body)

Bulk fetch notes

Wraps POST /api/v2/externalcontacts/bulk/notes  

Requires ALL permissions: 

* externalContacts:contact:view
* externalContacts:externalOrganization:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ExternalContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ExternalContactsApi apiInstance = new ExternalContactsApi();
BulkIdsRequest body = new BulkIdsRequest(); // BulkIdsRequest | Note ids
try {
    BulkFetchNotesResponse result = apiInstance.postExternalcontactsBulkNotes(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalContactsApi#postExternalcontactsBulkNotes");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**BulkIdsRequest**](BulkIdsRequest.html)| Note ids | 
{: class="table-striped"}


### Return type

[**BulkFetchNotesResponse**](BulkFetchNotesResponse.html)

<a name="postExternalcontactsBulkNotesAdd"></a>

# **postExternalcontactsBulkNotesAdd**



> [BulkNotesResponse](BulkNotesResponse.html) postExternalcontactsBulkNotesAdd(body)

Bulk add notes

Wraps POST /api/v2/externalcontacts/bulk/notes/add  

Requires ALL permissions: 

* externalContacts:contact:add
* externalContacts:externalOrganization:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ExternalContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ExternalContactsApi apiInstance = new ExternalContactsApi();
BulkNotesRequest body = new BulkNotesRequest(); // BulkNotesRequest | Notes
try {
    BulkNotesResponse result = apiInstance.postExternalcontactsBulkNotesAdd(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalContactsApi#postExternalcontactsBulkNotesAdd");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**BulkNotesRequest**](BulkNotesRequest.html)| Notes | 
{: class="table-striped"}


### Return type

[**BulkNotesResponse**](BulkNotesResponse.html)

<a name="postExternalcontactsBulkNotesRemove"></a>

# **postExternalcontactsBulkNotesRemove**



> [BulkDeleteResponse](BulkDeleteResponse.html) postExternalcontactsBulkNotesRemove(body)

Bulk remove notes

Wraps POST /api/v2/externalcontacts/bulk/notes/remove  

Requires ALL permissions: 

* externalContacts:contact:delete
* externalContacts:externalOrganization:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ExternalContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ExternalContactsApi apiInstance = new ExternalContactsApi();
BulkIdsRequest body = new BulkIdsRequest(); // BulkIdsRequest | Note ids
try {
    BulkDeleteResponse result = apiInstance.postExternalcontactsBulkNotesRemove(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalContactsApi#postExternalcontactsBulkNotesRemove");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**BulkIdsRequest**](BulkIdsRequest.html)| Note ids | 
{: class="table-striped"}


### Return type

[**BulkDeleteResponse**](BulkDeleteResponse.html)

<a name="postExternalcontactsBulkNotesUpdate"></a>

# **postExternalcontactsBulkNotesUpdate**



> [BulkNotesResponse](BulkNotesResponse.html) postExternalcontactsBulkNotesUpdate(body)

Bulk update notes

Wraps POST /api/v2/externalcontacts/bulk/notes/update  

Requires ALL permissions: 

* externalContacts:contact:edit
* externalContacts:externalOrganization:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ExternalContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ExternalContactsApi apiInstance = new ExternalContactsApi();
BulkNotesRequest body = new BulkNotesRequest(); // BulkNotesRequest | Notes
try {
    BulkNotesResponse result = apiInstance.postExternalcontactsBulkNotesUpdate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalContactsApi#postExternalcontactsBulkNotesUpdate");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**BulkNotesRequest**](BulkNotesRequest.html)| Notes | 
{: class="table-striped"}


### Return type

[**BulkNotesResponse**](BulkNotesResponse.html)

<a name="postExternalcontactsBulkOrganizations"></a>

# **postExternalcontactsBulkOrganizations**



> [BulkFetchOrganizationsResponse](BulkFetchOrganizationsResponse.html) postExternalcontactsBulkOrganizations(body)

Bulk fetch organizations

Wraps POST /api/v2/externalcontacts/bulk/organizations  

Requires ANY permissions: 

* externalContacts:externalOrganization:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ExternalContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ExternalContactsApi apiInstance = new ExternalContactsApi();
BulkIdsRequest body = new BulkIdsRequest(); // BulkIdsRequest | Organizations ids
try {
    BulkFetchOrganizationsResponse result = apiInstance.postExternalcontactsBulkOrganizations(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalContactsApi#postExternalcontactsBulkOrganizations");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**BulkIdsRequest**](BulkIdsRequest.html)| Organizations ids | 
{: class="table-striped"}


### Return type

[**BulkFetchOrganizationsResponse**](BulkFetchOrganizationsResponse.html)

<a name="postExternalcontactsBulkOrganizationsAdd"></a>

# **postExternalcontactsBulkOrganizationsAdd**



> [BulkOrganizationsResponse](BulkOrganizationsResponse.html) postExternalcontactsBulkOrganizationsAdd(body)

Bulk add organizations

Wraps POST /api/v2/externalcontacts/bulk/organizations/add  

Requires ANY permissions: 

* externalContacts:externalOrganization:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ExternalContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ExternalContactsApi apiInstance = new ExternalContactsApi();
BulkOrganizationsRequest body = new BulkOrganizationsRequest(); // BulkOrganizationsRequest | Organizations
try {
    BulkOrganizationsResponse result = apiInstance.postExternalcontactsBulkOrganizationsAdd(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalContactsApi#postExternalcontactsBulkOrganizationsAdd");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**BulkOrganizationsRequest**](BulkOrganizationsRequest.html)| Organizations | 
{: class="table-striped"}


### Return type

[**BulkOrganizationsResponse**](BulkOrganizationsResponse.html)

<a name="postExternalcontactsBulkOrganizationsRemove"></a>

# **postExternalcontactsBulkOrganizationsRemove**



> [BulkDeleteResponse](BulkDeleteResponse.html) postExternalcontactsBulkOrganizationsRemove(body)

Bulk remove organizations

Wraps POST /api/v2/externalcontacts/bulk/organizations/remove  

Requires ANY permissions: 

* externalContacts:externalOrganization:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ExternalContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ExternalContactsApi apiInstance = new ExternalContactsApi();
BulkIdsRequest body = new BulkIdsRequest(); // BulkIdsRequest | Organization ids
try {
    BulkDeleteResponse result = apiInstance.postExternalcontactsBulkOrganizationsRemove(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalContactsApi#postExternalcontactsBulkOrganizationsRemove");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**BulkIdsRequest**](BulkIdsRequest.html)| Organization ids | 
{: class="table-striped"}


### Return type

[**BulkDeleteResponse**](BulkDeleteResponse.html)

<a name="postExternalcontactsBulkOrganizationsUpdate"></a>

# **postExternalcontactsBulkOrganizationsUpdate**



> [BulkOrganizationsResponse](BulkOrganizationsResponse.html) postExternalcontactsBulkOrganizationsUpdate(body)

Bulk update organizations

Wraps POST /api/v2/externalcontacts/bulk/organizations/update  

Requires ANY permissions: 

* externalContacts:externalOrganization:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ExternalContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ExternalContactsApi apiInstance = new ExternalContactsApi();
BulkOrganizationsRequest body = new BulkOrganizationsRequest(); // BulkOrganizationsRequest | Organizations
try {
    BulkOrganizationsResponse result = apiInstance.postExternalcontactsBulkOrganizationsUpdate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalContactsApi#postExternalcontactsBulkOrganizationsUpdate");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**BulkOrganizationsRequest**](BulkOrganizationsRequest.html)| Organizations | 
{: class="table-striped"}


### Return type

[**BulkOrganizationsResponse**](BulkOrganizationsResponse.html)

<a name="postExternalcontactsBulkRelationships"></a>

# **postExternalcontactsBulkRelationships**



> [BulkFetchRelationshipsResponse](BulkFetchRelationshipsResponse.html) postExternalcontactsBulkRelationships(body)

Bulk fetch relationships

Wraps POST /api/v2/externalcontacts/bulk/relationships  

Requires ALL permissions: 

* externalContacts:contact:view
* externalContacts:externalOrganization:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ExternalContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ExternalContactsApi apiInstance = new ExternalContactsApi();
BulkIdsRequest body = new BulkIdsRequest(); // BulkIdsRequest | Relationships ids
try {
    BulkFetchRelationshipsResponse result = apiInstance.postExternalcontactsBulkRelationships(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalContactsApi#postExternalcontactsBulkRelationships");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**BulkIdsRequest**](BulkIdsRequest.html)| Relationships ids | 
{: class="table-striped"}


### Return type

[**BulkFetchRelationshipsResponse**](BulkFetchRelationshipsResponse.html)

<a name="postExternalcontactsBulkRelationshipsAdd"></a>

# **postExternalcontactsBulkRelationshipsAdd**



> [BulkRelationshipsResponse](BulkRelationshipsResponse.html) postExternalcontactsBulkRelationshipsAdd(body)

Bulk add relationships

Wraps POST /api/v2/externalcontacts/bulk/relationships/add  

Requires ALL permissions: 

* externalContacts:contact:add
* externalContacts:externalOrganization:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ExternalContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ExternalContactsApi apiInstance = new ExternalContactsApi();
BulkRelationshipsRequest body = new BulkRelationshipsRequest(); // BulkRelationshipsRequest | Relationships
try {
    BulkRelationshipsResponse result = apiInstance.postExternalcontactsBulkRelationshipsAdd(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalContactsApi#postExternalcontactsBulkRelationshipsAdd");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**BulkRelationshipsRequest**](BulkRelationshipsRequest.html)| Relationships | 
{: class="table-striped"}


### Return type

[**BulkRelationshipsResponse**](BulkRelationshipsResponse.html)

<a name="postExternalcontactsBulkRelationshipsRemove"></a>

# **postExternalcontactsBulkRelationshipsRemove**



> [BulkDeleteResponse](BulkDeleteResponse.html) postExternalcontactsBulkRelationshipsRemove(body)

Bulk remove relationships

Wraps POST /api/v2/externalcontacts/bulk/relationships/remove  

Requires ALL permissions: 

* externalContacts:contact:delete
* externalContacts:externalOrganization:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ExternalContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ExternalContactsApi apiInstance = new ExternalContactsApi();
BulkIdsRequest body = new BulkIdsRequest(); // BulkIdsRequest | Relationships ids
try {
    BulkDeleteResponse result = apiInstance.postExternalcontactsBulkRelationshipsRemove(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalContactsApi#postExternalcontactsBulkRelationshipsRemove");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**BulkIdsRequest**](BulkIdsRequest.html)| Relationships ids | 
{: class="table-striped"}


### Return type

[**BulkDeleteResponse**](BulkDeleteResponse.html)

<a name="postExternalcontactsBulkRelationshipsUpdate"></a>

# **postExternalcontactsBulkRelationshipsUpdate**



> [BulkRelationshipsResponse](BulkRelationshipsResponse.html) postExternalcontactsBulkRelationshipsUpdate(body)

Bulk update relationships

Wraps POST /api/v2/externalcontacts/bulk/relationships/update  

Requires ALL permissions: 

* externalContacts:contact:edit
* externalContacts:externalOrganization:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ExternalContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ExternalContactsApi apiInstance = new ExternalContactsApi();
BulkRelationshipsRequest body = new BulkRelationshipsRequest(); // BulkRelationshipsRequest | Relationships
try {
    BulkRelationshipsResponse result = apiInstance.postExternalcontactsBulkRelationshipsUpdate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalContactsApi#postExternalcontactsBulkRelationshipsUpdate");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**BulkRelationshipsRequest**](BulkRelationshipsRequest.html)| Relationships | 
{: class="table-striped"}


### Return type

[**BulkRelationshipsResponse**](BulkRelationshipsResponse.html)

<a name="postExternalcontactsContactNotes"></a>

# **postExternalcontactsContactNotes**



> [Note](Note.html) postExternalcontactsContactNotes(contactId, body)

Create a note for an external contact

Wraps POST /api/v2/externalcontacts/contacts/{contactId}/notes  

Requires ANY permissions: 

* externalContacts:contact:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ExternalContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ExternalContactsApi apiInstance = new ExternalContactsApi();
String contactId = "contactId_example"; // String | ExternalContact Id
Note body = new Note(); // Note | ExternalContact
try {
    Note result = apiInstance.postExternalcontactsContactNotes(contactId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalContactsApi#postExternalcontactsContactNotes");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **contactId** | **String**| ExternalContact Id | 
| **body** | [**Note**](Note.html)| ExternalContact | 
{: class="table-striped"}


### Return type

[**Note**](Note.html)

<a name="postExternalcontactsContacts"></a>

# **postExternalcontactsContacts**



> [ExternalContact](ExternalContact.html) postExternalcontactsContacts(body)

Create an external contact

Wraps POST /api/v2/externalcontacts/contacts  

Requires ANY permissions: 

* externalContacts:contact:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ExternalContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ExternalContactsApi apiInstance = new ExternalContactsApi();
ExternalContact body = new ExternalContact(); // ExternalContact | ExternalContact
try {
    ExternalContact result = apiInstance.postExternalcontactsContacts(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalContactsApi#postExternalcontactsContacts");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**ExternalContact**](ExternalContact.html)| ExternalContact | 
{: class="table-striped"}


### Return type

[**ExternalContact**](ExternalContact.html)

<a name="postExternalcontactsContactsSchemas"></a>

# **postExternalcontactsContactsSchemas**



> [DataSchema](DataSchema.html) postExternalcontactsContactsSchemas(body)

Create a schema

Wraps POST /api/v2/externalcontacts/contacts/schemas  

Requires ANY permissions: 

* externalContacts:customFields:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ExternalContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ExternalContactsApi apiInstance = new ExternalContactsApi();
DataSchema body = new DataSchema(); // DataSchema | Schema
try {
    DataSchema result = apiInstance.postExternalcontactsContactsSchemas(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalContactsApi#postExternalcontactsContactsSchemas");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**DataSchema**](DataSchema.html)| Schema | 
{: class="table-striped"}


### Return type

[**DataSchema**](DataSchema.html)

<a name="postExternalcontactsOrganizationNotes"></a>

# **postExternalcontactsOrganizationNotes**



> [Note](Note.html) postExternalcontactsOrganizationNotes(externalOrganizationId, body)

Create a note for an external organization

Wraps POST /api/v2/externalcontacts/organizations/{externalOrganizationId}/notes  

Requires ANY permissions: 

* relate:externalOrganization:edit
* externalContacts:externalOrganization:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ExternalContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ExternalContactsApi apiInstance = new ExternalContactsApi();
String externalOrganizationId = "externalOrganizationId_example"; // String | External Organization Id
Note body = new Note(); // Note | ExternalContact
try {
    Note result = apiInstance.postExternalcontactsOrganizationNotes(externalOrganizationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalContactsApi#postExternalcontactsOrganizationNotes");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **externalOrganizationId** | **String**| External Organization Id | 
| **body** | [**Note**](Note.html)| ExternalContact | 
{: class="table-striped"}


### Return type

[**Note**](Note.html)

<a name="postExternalcontactsOrganizations"></a>

# **postExternalcontactsOrganizations**



> [ExternalOrganization](ExternalOrganization.html) postExternalcontactsOrganizations(body)

Create an external organization

Wraps POST /api/v2/externalcontacts/organizations  

Requires ANY permissions: 

* relate:externalOrganization:add
* externalContacts:externalOrganization:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ExternalContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ExternalContactsApi apiInstance = new ExternalContactsApi();
ExternalOrganization body = new ExternalOrganization(); // ExternalOrganization | ExternalOrganization
try {
    ExternalOrganization result = apiInstance.postExternalcontactsOrganizations(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalContactsApi#postExternalcontactsOrganizations");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**ExternalOrganization**](ExternalOrganization.html)| ExternalOrganization | 
{: class="table-striped"}


### Return type

[**ExternalOrganization**](ExternalOrganization.html)

<a name="postExternalcontactsOrganizationsSchemas"></a>

# **postExternalcontactsOrganizationsSchemas**



> [DataSchema](DataSchema.html) postExternalcontactsOrganizationsSchemas(body)

Create a schema

Wraps POST /api/v2/externalcontacts/organizations/schemas  

Requires ANY permissions: 

* externalContacts:customFields:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ExternalContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ExternalContactsApi apiInstance = new ExternalContactsApi();
DataSchema body = new DataSchema(); // DataSchema | Schema
try {
    DataSchema result = apiInstance.postExternalcontactsOrganizationsSchemas(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalContactsApi#postExternalcontactsOrganizationsSchemas");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**DataSchema**](DataSchema.html)| Schema | 
{: class="table-striped"}


### Return type

[**DataSchema**](DataSchema.html)

<a name="postExternalcontactsRelationships"></a>

# **postExternalcontactsRelationships**



> [Relationship](Relationship.html) postExternalcontactsRelationships(body)

Create a relationship

Wraps POST /api/v2/externalcontacts/relationships  

Requires ANY permissions: 

* externalContacts:externalOrganization:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ExternalContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ExternalContactsApi apiInstance = new ExternalContactsApi();
Relationship body = new Relationship(); // Relationship | Relationship
try {
    Relationship result = apiInstance.postExternalcontactsRelationships(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalContactsApi#postExternalcontactsRelationships");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**Relationship**](Relationship.html)| Relationship | 
{: class="table-striped"}


### Return type

[**Relationship**](Relationship.html)

<a name="putExternalcontactsContact"></a>

# **putExternalcontactsContact**



> [ExternalContact](ExternalContact.html) putExternalcontactsContact(contactId, body)

Update an external contact

Wraps PUT /api/v2/externalcontacts/contacts/{contactId}  

Requires ANY permissions: 

* externalContacts:contact:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ExternalContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ExternalContactsApi apiInstance = new ExternalContactsApi();
String contactId = "contactId_example"; // String | ExternalContact ID
ExternalContact body = new ExternalContact(); // ExternalContact | ExternalContact
try {
    ExternalContact result = apiInstance.putExternalcontactsContact(contactId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalContactsApi#putExternalcontactsContact");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **contactId** | **String**| ExternalContact ID | 
| **body** | [**ExternalContact**](ExternalContact.html)| ExternalContact | 
{: class="table-striped"}


### Return type

[**ExternalContact**](ExternalContact.html)

<a name="putExternalcontactsContactNote"></a>

# **putExternalcontactsContactNote**



> [Note](Note.html) putExternalcontactsContactNote(contactId, noteId, body)

Update a note for an external contact

Wraps PUT /api/v2/externalcontacts/contacts/{contactId}/notes/{noteId}  

Requires ANY permissions: 

* externalContacts:contact:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ExternalContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ExternalContactsApi apiInstance = new ExternalContactsApi();
String contactId = "contactId_example"; // String | ExternalContact Id
String noteId = "noteId_example"; // String | Note Id
Note body = new Note(); // Note | Note
try {
    Note result = apiInstance.putExternalcontactsContactNote(contactId, noteId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalContactsApi#putExternalcontactsContactNote");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **contactId** | **String**| ExternalContact Id | 
| **noteId** | **String**| Note Id | 
| **body** | [**Note**](Note.html)| Note | 
{: class="table-striped"}


### Return type

[**Note**](Note.html)

<a name="putExternalcontactsContactsSchema"></a>

# **putExternalcontactsContactsSchema**



> [DataSchema](DataSchema.html) putExternalcontactsContactsSchema(schemaId, body)

Update a schema

Wraps PUT /api/v2/externalcontacts/contacts/schemas/{schemaId}  

Requires ANY permissions: 

* externalContacts:customFields:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ExternalContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ExternalContactsApi apiInstance = new ExternalContactsApi();
String schemaId = "schemaId_example"; // String | Schema ID
DataSchema body = new DataSchema(); // DataSchema | Data Schema
try {
    DataSchema result = apiInstance.putExternalcontactsContactsSchema(schemaId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalContactsApi#putExternalcontactsContactsSchema");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **schemaId** | **String**| Schema ID | 
| **body** | [**DataSchema**](DataSchema.html)| Data Schema | 
{: class="table-striped"}


### Return type

[**DataSchema**](DataSchema.html)

<a name="putExternalcontactsConversation"></a>

# **putExternalcontactsConversation**



> Void putExternalcontactsConversation(conversationId, body)

Associate/disassociate an external contact with a conversation

To associate, supply a value for the externalContactId.  To disassociate, do not include the property at all.

Wraps PUT /api/v2/externalcontacts/conversations/{conversationId}  

Requires ANY permissions: 

* externalContacts:conversation:associate

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ExternalContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ExternalContactsApi apiInstance = new ExternalContactsApi();
String conversationId = "conversationId_example"; // String | Conversation ID
ConversationAssociation body = new ConversationAssociation(); // ConversationAssociation | ConversationAssociation
try {
    apiInstance.putExternalcontactsConversation(conversationId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalContactsApi#putExternalcontactsConversation");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| Conversation ID | 
| **body** | [**ConversationAssociation**](ConversationAssociation.html)| ConversationAssociation | 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="putExternalcontactsOrganization"></a>

# **putExternalcontactsOrganization**



> [ExternalOrganization](ExternalOrganization.html) putExternalcontactsOrganization(externalOrganizationId, body)

Update an external organization

Wraps PUT /api/v2/externalcontacts/organizations/{externalOrganizationId}  

Requires ANY permissions: 

* relate:externalOrganization:edit
* externalContacts:externalOrganization:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ExternalContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ExternalContactsApi apiInstance = new ExternalContactsApi();
String externalOrganizationId = "externalOrganizationId_example"; // String | External Organization ID
ExternalOrganization body = new ExternalOrganization(); // ExternalOrganization | ExternalOrganization
try {
    ExternalOrganization result = apiInstance.putExternalcontactsOrganization(externalOrganizationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalContactsApi#putExternalcontactsOrganization");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **externalOrganizationId** | **String**| External Organization ID | 
| **body** | [**ExternalOrganization**](ExternalOrganization.html)| ExternalOrganization | 
{: class="table-striped"}


### Return type

[**ExternalOrganization**](ExternalOrganization.html)

<a name="putExternalcontactsOrganizationNote"></a>

# **putExternalcontactsOrganizationNote**



> [Note](Note.html) putExternalcontactsOrganizationNote(externalOrganizationId, noteId, body)

Update a note for an external organization

Wraps PUT /api/v2/externalcontacts/organizations/{externalOrganizationId}/notes/{noteId}  

Requires ANY permissions: 

* externalContacts:externalOrganization:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ExternalContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ExternalContactsApi apiInstance = new ExternalContactsApi();
String externalOrganizationId = "externalOrganizationId_example"; // String | External Organization Id
String noteId = "noteId_example"; // String | Note Id
Note body = new Note(); // Note | Note
try {
    Note result = apiInstance.putExternalcontactsOrganizationNote(externalOrganizationId, noteId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalContactsApi#putExternalcontactsOrganizationNote");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **externalOrganizationId** | **String**| External Organization Id | 
| **noteId** | **String**| Note Id | 
| **body** | [**Note**](Note.html)| Note | 
{: class="table-striped"}


### Return type

[**Note**](Note.html)

<a name="putExternalcontactsOrganizationTrustorTrustorId"></a>

# **putExternalcontactsOrganizationTrustorTrustorId**



> [ExternalOrganizationTrustorLink](ExternalOrganizationTrustorLink.html) putExternalcontactsOrganizationTrustorTrustorId(externalOrganizationId, trustorId)

Links a Trustor with an External Organization

Wraps PUT /api/v2/externalcontacts/organizations/{externalOrganizationId}/trustor/{trustorId}  

Requires ANY permissions: 

* externalContacts:externalOrganization:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ExternalContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ExternalContactsApi apiInstance = new ExternalContactsApi();
String externalOrganizationId = "externalOrganizationId_example"; // String | External Organization ID
String trustorId = "trustorId_example"; // String | Trustor ID
try {
    ExternalOrganizationTrustorLink result = apiInstance.putExternalcontactsOrganizationTrustorTrustorId(externalOrganizationId, trustorId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalContactsApi#putExternalcontactsOrganizationTrustorTrustorId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **externalOrganizationId** | **String**| External Organization ID | 
| **trustorId** | **String**| Trustor ID | 
{: class="table-striped"}


### Return type

[**ExternalOrganizationTrustorLink**](ExternalOrganizationTrustorLink.html)

<a name="putExternalcontactsOrganizationsSchema"></a>

# **putExternalcontactsOrganizationsSchema**



> [DataSchema](DataSchema.html) putExternalcontactsOrganizationsSchema(schemaId, body)

Update a schema

Wraps PUT /api/v2/externalcontacts/organizations/schemas/{schemaId}  

Requires ANY permissions: 

* externalContacts:customFields:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ExternalContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ExternalContactsApi apiInstance = new ExternalContactsApi();
String schemaId = "schemaId_example"; // String | Schema ID
DataSchema body = new DataSchema(); // DataSchema | Data Schema
try {
    DataSchema result = apiInstance.putExternalcontactsOrganizationsSchema(schemaId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalContactsApi#putExternalcontactsOrganizationsSchema");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **schemaId** | **String**| Schema ID | 
| **body** | [**DataSchema**](DataSchema.html)| Data Schema | 
{: class="table-striped"}


### Return type

[**DataSchema**](DataSchema.html)

<a name="putExternalcontactsRelationship"></a>

# **putExternalcontactsRelationship**



> [Relationship](Relationship.html) putExternalcontactsRelationship(relationshipId, body)

Update a relationship

Wraps PUT /api/v2/externalcontacts/relationships/{relationshipId}  

Requires ANY permissions: 

* externalContacts:externalOrganization:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ExternalContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ExternalContactsApi apiInstance = new ExternalContactsApi();
String relationshipId = "relationshipId_example"; // String | Relationship Id
Relationship body = new Relationship(); // Relationship | Relationship
try {
    Relationship result = apiInstance.putExternalcontactsRelationship(relationshipId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalContactsApi#putExternalcontactsRelationship");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **relationshipId** | **String**| Relationship Id | 
| **body** | [**Relationship**](Relationship.html)| Relationship | 
{: class="table-striped"}


### Return type

[**Relationship**](Relationship.html)

