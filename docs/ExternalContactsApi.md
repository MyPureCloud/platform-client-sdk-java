# ExternalContactsApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**deleteExternalcontactsContact**](ExternalContactsApi#deleteExternalcontactsContact) | Delete an external contact |
| [**deleteExternalcontactsContactNote**](ExternalContactsApi#deleteExternalcontactsContactNote) | Delete a note for an external contact |
| [**deleteExternalcontactsContactsSchema**](ExternalContactsApi#deleteExternalcontactsContactsSchema) | Delete a schema |
| [**deleteExternalcontactsOrganization**](ExternalContactsApi#deleteExternalcontactsOrganization) | Delete an external organization |
| [**deleteExternalcontactsOrganizationNote**](ExternalContactsApi#deleteExternalcontactsOrganizationNote) | Delete a note for an external organization |
| [**deleteExternalcontactsOrganizationTrustor**](ExternalContactsApi#deleteExternalcontactsOrganizationTrustor) | Unlink the Trustor for this External Organization |
| [**deleteExternalcontactsRelationship**](ExternalContactsApi#deleteExternalcontactsRelationship) | Delete a relationship |
| [**getExternalcontactsContact**](ExternalContactsApi#getExternalcontactsContact) | Fetch an external contact |
| [**getExternalcontactsContactIdentifiers**](ExternalContactsApi#getExternalcontactsContactIdentifiers) | List the identifiers for a contact |
| [**getExternalcontactsContactJourneySessions**](ExternalContactsApi#getExternalcontactsContactJourneySessions) | Retrieve all sessions for a given external contact. |
| [**getExternalcontactsContactNote**](ExternalContactsApi#getExternalcontactsContactNote) | Fetch a note for an external contact |
| [**getExternalcontactsContactNotes**](ExternalContactsApi#getExternalcontactsContactNotes) | List notes for an external contact |
| [**getExternalcontactsContactUnresolved**](ExternalContactsApi#getExternalcontactsContactUnresolved) | Fetch an unresolved external contact |
| [**getExternalcontactsContacts**](ExternalContactsApi#getExternalcontactsContacts) | Search for external contacts |
| [**getExternalcontactsContactsSchema**](ExternalContactsApi#getExternalcontactsContactsSchema) | Get a schema |
| [**getExternalcontactsContactsSchemaVersion**](ExternalContactsApi#getExternalcontactsContactsSchemaVersion) | Get a specific version of a schema |
| [**getExternalcontactsContactsSchemaVersions**](ExternalContactsApi#getExternalcontactsContactsSchemaVersions) | Get all versions of an external contact's schema |
| [**getExternalcontactsContactsSchemas**](ExternalContactsApi#getExternalcontactsContactsSchemas) | Get a list of schemas. |
| [**getExternalcontactsOrganization**](ExternalContactsApi#getExternalcontactsOrganization) | Fetch an external organization |
| [**getExternalcontactsOrganizationContacts**](ExternalContactsApi#getExternalcontactsOrganizationContacts) | Search for external contacts in an external organization |
| [**getExternalcontactsOrganizationNote**](ExternalContactsApi#getExternalcontactsOrganizationNote) | Fetch a note for an external organization |
| [**getExternalcontactsOrganizationNotes**](ExternalContactsApi#getExternalcontactsOrganizationNotes) | List notes for an external organization |
| [**getExternalcontactsOrganizationRelationships**](ExternalContactsApi#getExternalcontactsOrganizationRelationships) | Fetch a relationship for an external organization |
| [**getExternalcontactsOrganizations**](ExternalContactsApi#getExternalcontactsOrganizations) | Search for external organizations |
| [**getExternalcontactsOrganizationsSchema**](ExternalContactsApi#getExternalcontactsOrganizationsSchema) | Get a schema |
| [**getExternalcontactsOrganizationsSchemaVersion**](ExternalContactsApi#getExternalcontactsOrganizationsSchemaVersion) | Get a specific version of a schema |
| [**getExternalcontactsOrganizationsSchemaVersions**](ExternalContactsApi#getExternalcontactsOrganizationsSchemaVersions) | Get all versions of an external organization's schema |
| [**getExternalcontactsOrganizationsSchemas**](ExternalContactsApi#getExternalcontactsOrganizationsSchemas) | Get a list of schemas. |
| [**getExternalcontactsRelationship**](ExternalContactsApi#getExternalcontactsRelationship) | Fetch a relationship |
| [**getExternalcontactsReversewhitepageslookup**](ExternalContactsApi#getExternalcontactsReversewhitepageslookup) | Look up contacts and externalOrganizations based on an attribute. Maximum of 25 values returned. |
| [**getExternalcontactsScanContacts**](ExternalContactsApi#getExternalcontactsScanContacts) | Scan for external contacts using paging |
| [**getExternalcontactsScanNotes**](ExternalContactsApi#getExternalcontactsScanNotes) | Scan for notes using paging |
| [**getExternalcontactsScanOrganizations**](ExternalContactsApi#getExternalcontactsScanOrganizations) | Scan for external organizations using paging |
| [**getExternalcontactsScanRelationships**](ExternalContactsApi#getExternalcontactsScanRelationships) | Scan for relationships |
| [**patchExternalcontactsContactIdentifiers**](ExternalContactsApi#patchExternalcontactsContactIdentifiers) | Claim or release identifiers for a contact |
| [**postExternalcontactsBulkContacts**](ExternalContactsApi#postExternalcontactsBulkContacts) | Bulk fetch contacts |
| [**postExternalcontactsBulkContactsAdd**](ExternalContactsApi#postExternalcontactsBulkContactsAdd) | Bulk add contacts |
| [**postExternalcontactsBulkContactsRemove**](ExternalContactsApi#postExternalcontactsBulkContactsRemove) | Bulk remove contacts |
| [**postExternalcontactsBulkContactsUnresolved**](ExternalContactsApi#postExternalcontactsBulkContactsUnresolved) | Bulk fetch unresolved ancestor contacts |
| [**postExternalcontactsBulkContactsUpdate**](ExternalContactsApi#postExternalcontactsBulkContactsUpdate) | Bulk update contacts |
| [**postExternalcontactsBulkNotes**](ExternalContactsApi#postExternalcontactsBulkNotes) | Bulk fetch notes |
| [**postExternalcontactsBulkNotesAdd**](ExternalContactsApi#postExternalcontactsBulkNotesAdd) | Bulk add notes |
| [**postExternalcontactsBulkNotesRemove**](ExternalContactsApi#postExternalcontactsBulkNotesRemove) | Bulk remove notes |
| [**postExternalcontactsBulkNotesUpdate**](ExternalContactsApi#postExternalcontactsBulkNotesUpdate) | Bulk update notes |
| [**postExternalcontactsBulkOrganizations**](ExternalContactsApi#postExternalcontactsBulkOrganizations) | Bulk fetch organizations |
| [**postExternalcontactsBulkOrganizationsAdd**](ExternalContactsApi#postExternalcontactsBulkOrganizationsAdd) | Bulk add organizations |
| [**postExternalcontactsBulkOrganizationsRemove**](ExternalContactsApi#postExternalcontactsBulkOrganizationsRemove) | Bulk remove organizations |
| [**postExternalcontactsBulkOrganizationsUpdate**](ExternalContactsApi#postExternalcontactsBulkOrganizationsUpdate) | Bulk update organizations |
| [**postExternalcontactsBulkRelationships**](ExternalContactsApi#postExternalcontactsBulkRelationships) | Bulk fetch relationships |
| [**postExternalcontactsBulkRelationshipsAdd**](ExternalContactsApi#postExternalcontactsBulkRelationshipsAdd) | Bulk add relationships |
| [**postExternalcontactsBulkRelationshipsRemove**](ExternalContactsApi#postExternalcontactsBulkRelationshipsRemove) | Bulk remove relationships |
| [**postExternalcontactsBulkRelationshipsUpdate**](ExternalContactsApi#postExternalcontactsBulkRelationshipsUpdate) | Bulk update relationships |
| [**postExternalcontactsContactNotes**](ExternalContactsApi#postExternalcontactsContactNotes) | Create a note for an external contact |
| [**postExternalcontactsContactPromotion**](ExternalContactsApi#postExternalcontactsContactPromotion) | Promote an observed contact (ephemeral or identified) to a curated contact |
| [**postExternalcontactsContacts**](ExternalContactsApi#postExternalcontactsContacts) | Create an external contact |
| [**postExternalcontactsContactsSchemas**](ExternalContactsApi#postExternalcontactsContactsSchemas) | Create a schema |
| [**postExternalcontactsIdentifierlookup**](ExternalContactsApi#postExternalcontactsIdentifierlookup) | Fetch a contact using an identifier type and value. |
| [**postExternalcontactsMergeContacts**](ExternalContactsApi#postExternalcontactsMergeContacts) | Merge two contacts into a new contact record |
| [**postExternalcontactsOrganizationNotes**](ExternalContactsApi#postExternalcontactsOrganizationNotes) | Create a note for an external organization |
| [**postExternalcontactsOrganizations**](ExternalContactsApi#postExternalcontactsOrganizations) | Create an external organization |
| [**postExternalcontactsOrganizationsSchemas**](ExternalContactsApi#postExternalcontactsOrganizationsSchemas) | Create a schema |
| [**postExternalcontactsRelationships**](ExternalContactsApi#postExternalcontactsRelationships) | Create a relationship |
| [**putExternalcontactsContact**](ExternalContactsApi#putExternalcontactsContact) | Update an external contact |
| [**putExternalcontactsContactNote**](ExternalContactsApi#putExternalcontactsContactNote) | Update a note for an external contact |
| [**putExternalcontactsContactsSchema**](ExternalContactsApi#putExternalcontactsContactsSchema) | Update a schema |
| [**putExternalcontactsConversation**](ExternalContactsApi#putExternalcontactsConversation) | Associate/disassociate an external contact with a conversation |
| [**putExternalcontactsOrganization**](ExternalContactsApi#putExternalcontactsOrganization) | Update an external organization |
| [**putExternalcontactsOrganizationNote**](ExternalContactsApi#putExternalcontactsOrganizationNote) | Update a note for an external organization |
| [**putExternalcontactsOrganizationTrustorTrustorId**](ExternalContactsApi#putExternalcontactsOrganizationTrustorTrustorId) | Links a Trustor with an External Organization |
| [**putExternalcontactsOrganizationsSchema**](ExternalContactsApi#putExternalcontactsOrganizationsSchema) | Update a schema |
| [**putExternalcontactsRelationship**](ExternalContactsApi#putExternalcontactsRelationship) | Update a relationship |
{: class="table-striped"}


# **deleteExternalcontactsContact**



> Empty deleteExternalcontactsContact(contactId)

Delete an external contact

Wraps DELETE /api/v2/externalcontacts/contacts/{contactId}  

Requires ANY permissions: 

* relate:contact:delete
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


# **deleteExternalcontactsContactNote**



> Empty deleteExternalcontactsContactNote(contactId, noteId)

Delete a note for an external contact

Wraps DELETE /api/v2/externalcontacts/contacts/{contactId}/notes/{noteId}  

Requires ANY permissions: 

* relate:contact:edit
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


# **deleteExternalcontactsOrganizationNote**



> Empty deleteExternalcontactsOrganizationNote(externalOrganizationId, noteId)

Delete a note for an external organization

Wraps DELETE /api/v2/externalcontacts/organizations/{externalOrganizationId}/notes/{noteId}  

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


# **deleteExternalcontactsRelationship**



> Empty deleteExternalcontactsRelationship(relationshipId)

Delete a relationship

Wraps DELETE /api/v2/externalcontacts/relationships/{relationshipId}  

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


# **getExternalcontactsContact**



> [ExternalContact](ExternalContact) getExternalcontactsContact(contactId, expand)

Fetch an external contact

Wraps GET /api/v2/externalcontacts/contacts/{contactId}  

Requires ANY permissions: 

* relate:contact:view
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
List<String> expand = Arrays.asList(null); // List<String> | which fields, if any, to expand (externalOrganization,externalDataSources,identifiers)
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
| **expand** | [**List&lt;String&gt;**](String)| which fields, if any, to expand (externalOrganization,externalDataSources,identifiers) | [optional]<br />**Values**: externalOrganization, externalDataSources, identifiers 
{: class="table-striped"}


### Return type

[**ExternalContact**](ExternalContact)


# **getExternalcontactsContactIdentifiers**



> [EntityListing](EntityListing) getExternalcontactsContactIdentifiers(contactId)

List the identifiers for a contact

Wraps GET /api/v2/externalcontacts/contacts/{contactId}/identifiers  

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
try {
    EntityListing result = apiInstance.getExternalcontactsContactIdentifiers(contactId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalContactsApi#getExternalcontactsContactIdentifiers");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **contactId** | **String**| ExternalContact ID | 
{: class="table-striped"}


### Return type

[**EntityListing**](EntityListing)


# **getExternalcontactsContactJourneySessions**



> [SessionListing](SessionListing) getExternalcontactsContactJourneySessions(contactId, pageSize, after, includeMerged)

Retrieve all sessions for a given external contact.

Wraps GET /api/v2/externalcontacts/contacts/{contactId}/journey/sessions  

Requires ANY permissions: 

* externalContacts:session:view

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
String pageSize = "pageSize_example"; // String | Number of entities to return. Maximum of 200.
String after = "after_example"; // String | The cursor that points to the end of the set of entities that has been returned.
Boolean includeMerged = true; // Boolean | Indicates whether to return sessions from all external contacts in the merge-set of the given one.
try {
    SessionListing result = apiInstance.getExternalcontactsContactJourneySessions(contactId, pageSize, after, includeMerged);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalContactsApi#getExternalcontactsContactJourneySessions");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **contactId** | **String**| ExternalContact ID | 
| **pageSize** | **String**| Number of entities to return. Maximum of 200. | [optional] 
| **after** | **String**| The cursor that points to the end of the set of entities that has been returned. | [optional] 
| **includeMerged** | **Boolean**| Indicates whether to return sessions from all external contacts in the merge-set of the given one. | [optional] 
{: class="table-striped"}


### Return type

[**SessionListing**](SessionListing)


# **getExternalcontactsContactNote**



> [Note](Note) getExternalcontactsContactNote(contactId, noteId, expand)

Fetch a note for an external contact

Wraps GET /api/v2/externalcontacts/contacts/{contactId}/notes/{noteId}  

Requires ANY permissions: 

* relate:contact:view
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
| **expand** | [**List&lt;String&gt;**](String)| which fields, if any, to expand | [optional]<br />**Values**: author, externalDataSources 
{: class="table-striped"}


### Return type

[**Note**](Note)


# **getExternalcontactsContactNotes**



> [NoteListing](NoteListing) getExternalcontactsContactNotes(contactId, pageSize, pageNumber, sortOrder, expand)

List notes for an external contact

Wraps GET /api/v2/externalcontacts/contacts/{contactId}/notes  

Requires ANY permissions: 

* relate:contact:view
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
String sortOrder = "sortOrder_example"; // String | The Note field to sort by. Any of: [createDate]. Direction: [asc, desc].  e.g. \"createDate:asc\", \"createDate:desc\"
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
| **sortOrder** | **String**| The Note field to sort by. Any of: [createDate]. Direction: [asc, desc].  e.g. \&quot;createDate:asc\&quot;, \&quot;createDate:desc\&quot; | [optional] 
| **expand** | [**List&lt;String&gt;**](String)| which fields, if any, to expand | [optional]<br />**Values**: author, externalDataSources 
{: class="table-striped"}


### Return type

[**NoteListing**](NoteListing)


# **getExternalcontactsContactUnresolved**



> [ExternalContact](ExternalContact) getExternalcontactsContactUnresolved(contactId, expand)

Fetch an unresolved external contact

Wraps GET /api/v2/externalcontacts/contacts/{contactId}/unresolved  

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
List<String> expand = Arrays.asList(null); // List<String> | which fields, if any, to expand (externalOrganization,externalDataSources,identifiers)
try {
    ExternalContact result = apiInstance.getExternalcontactsContactUnresolved(contactId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalContactsApi#getExternalcontactsContactUnresolved");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **contactId** | **String**| ExternalContact ID | 
| **expand** | [**List&lt;String&gt;**](String)| which fields, if any, to expand (externalOrganization,externalDataSources,identifiers) | [optional]<br />**Values**: externalOrganization, externalDataSources, identifiers 
{: class="table-striped"}


### Return type

[**ExternalContact**](ExternalContact)


# **getExternalcontactsContacts**



> [ContactListing](ContactListing) getExternalcontactsContacts(pageSize, pageNumber, q, sortOrder, expand)

Search for external contacts

Wraps GET /api/v2/externalcontacts/contacts  

Requires ANY permissions: 

* relate:contact:view
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
String sortOrder = "sortOrder_example"; // String | The External Contact field to sort by. Any of: [firstName, lastName, middleName, title]. Direction: [asc, desc]. e.g. \"firstName:asc\", \"title:desc\"
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
| **sortOrder** | **String**| The External Contact field to sort by. Any of: [firstName, lastName, middleName, title]. Direction: [asc, desc]. e.g. \&quot;firstName:asc\&quot;, \&quot;title:desc\&quot; | [optional] 
| **expand** | [**List&lt;String&gt;**](String)| which fields, if any, to expand | [optional]<br />**Values**: externalOrganization, externalDataSources, identifiers 
{: class="table-striped"}


### Return type

[**ContactListing**](ContactListing)


# **getExternalcontactsContactsSchema**



> [DataSchema](DataSchema) getExternalcontactsContactsSchema(schemaId)

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

[**DataSchema**](DataSchema)


# **getExternalcontactsContactsSchemaVersion**



> [DataSchema](DataSchema) getExternalcontactsContactsSchemaVersion(schemaId, versionId)

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

[**DataSchema**](DataSchema)


# **getExternalcontactsContactsSchemaVersions**



> [DataSchema](DataSchema) getExternalcontactsContactsSchemaVersions(schemaId)

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

[**DataSchema**](DataSchema)


# **getExternalcontactsContactsSchemas**



> [DataSchemaListing](DataSchemaListing) getExternalcontactsContactsSchemas()

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

[**DataSchemaListing**](DataSchemaListing)


# **getExternalcontactsOrganization**



> [ExternalOrganization](ExternalOrganization) getExternalcontactsOrganization(externalOrganizationId, expand, includeTrustors)

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
List<String> expand = Arrays.asList(null); // List<String> | which fields, if any, to expand (externalDataSources)
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
| **expand** | [**List&lt;String&gt;**](String)| which fields, if any, to expand (externalDataSources) | [optional]<br />**Values**: externalDataSources 
| **includeTrustors** | **Boolean**| (true or false) whether or not to include trustor information embedded in the externalOrganization | [optional] 
{: class="table-striped"}


### Return type

[**ExternalOrganization**](ExternalOrganization)


# **getExternalcontactsOrganizationContacts**



> [ContactListing](ContactListing) getExternalcontactsOrganizationContacts(externalOrganizationId, pageSize, pageNumber, q, sortOrder, expand)

Search for external contacts in an external organization

Wraps GET /api/v2/externalcontacts/organizations/{externalOrganizationId}/contacts  

Requires ANY permissions: 

* relate:contact:view
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
String sortOrder = "sortOrder_example"; // String | The External Contact field to sort by. Any of: [firstName, lastName, middleName, title]. Direction: [asc, desc]. e.g. \"firstName:asc\", \"title:desc\"
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
| **sortOrder** | **String**| The External Contact field to sort by. Any of: [firstName, lastName, middleName, title]. Direction: [asc, desc]. e.g. \&quot;firstName:asc\&quot;, \&quot;title:desc\&quot; | [optional] 
| **expand** | [**List&lt;String&gt;**](String)| which fields, if any, to expand | [optional]<br />**Values**: externalOrganization, externalDataSources, identifiers 
{: class="table-striped"}


### Return type

[**ContactListing**](ContactListing)


# **getExternalcontactsOrganizationNote**



> [Note](Note) getExternalcontactsOrganizationNote(externalOrganizationId, noteId, expand)

Fetch a note for an external organization

Wraps GET /api/v2/externalcontacts/organizations/{externalOrganizationId}/notes/{noteId}  

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
| **expand** | [**List&lt;String&gt;**](String)| which fields, if any, to expand | [optional]<br />**Values**: author, externalDataSources 
{: class="table-striped"}


### Return type

[**Note**](Note)


# **getExternalcontactsOrganizationNotes**



> [NoteListing](NoteListing) getExternalcontactsOrganizationNotes(externalOrganizationId, pageSize, pageNumber, sortOrder, expand)

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
String sortOrder = "sortOrder_example"; // String | The Note field to sort by. Any of: [createDate]. Direction: [asc, desc]. e.g. \"createDate:asc\", \"createDate:desc\"
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
| **sortOrder** | **String**| The Note field to sort by. Any of: [createDate]. Direction: [asc, desc]. e.g. \&quot;createDate:asc\&quot;, \&quot;createDate:desc\&quot; | [optional] 
| **expand** | [**List&lt;String&gt;**](String)| which fields, if any, to expand | [optional]<br />**Values**: author, externalDataSources 
{: class="table-striped"}


### Return type

[**NoteListing**](NoteListing)


# **getExternalcontactsOrganizationRelationships**



> [RelationshipListing](RelationshipListing) getExternalcontactsOrganizationRelationships(externalOrganizationId, pageSize, pageNumber, expand, sortOrder)

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
List<String> expand = Arrays.asList(null); // List<String> | which fields, if any, to expand
String sortOrder = "sortOrder_example"; // String | The Relationship field to sort by. Any of: [createDate, relationship]. Direction: [asc, desc]. e.g. \"createDate:asc\", \"relationship:desc\"
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
| **expand** | [**List&lt;String&gt;**](String)| which fields, if any, to expand | [optional]<br />**Values**: externalDataSources 
| **sortOrder** | **String**| The Relationship field to sort by. Any of: [createDate, relationship]. Direction: [asc, desc]. e.g. \&quot;createDate:asc\&quot;, \&quot;relationship:desc\&quot; | [optional] 
{: class="table-striped"}


### Return type

[**RelationshipListing**](RelationshipListing)


# **getExternalcontactsOrganizations**



> [ExternalOrganizationListing](ExternalOrganizationListing) getExternalcontactsOrganizations(pageSize, pageNumber, q, trustorId, sortOrder, expand, includeTrustors)

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
String sortOrder = "sortOrder_example"; // String | The Organization field to sort by. Any of: [companyType, industry, name]. Direction: [asc, desc]. e.g. \"companyType:asc\", \"industry:desc\"
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
| **trustorId** | [**List&lt;String&gt;**](String)| Search for external organizations by trustorIds (limit 25). If supplied, the &#39;q&#39; parameters is ignored. Items are returned in the order requested | [optional] 
| **sortOrder** | **String**| The Organization field to sort by. Any of: [companyType, industry, name]. Direction: [asc, desc]. e.g. \&quot;companyType:asc\&quot;, \&quot;industry:desc\&quot; | [optional] 
| **expand** | [**List&lt;String&gt;**](String)| which fields, if any, to expand | [optional]<br />**Values**: externalDataSources 
| **includeTrustors** | **Boolean**| (true or false) whether or not to include trustor information embedded in the externalOrganization | [optional] 
{: class="table-striped"}


### Return type

[**ExternalOrganizationListing**](ExternalOrganizationListing)


# **getExternalcontactsOrganizationsSchema**



> [DataSchema](DataSchema) getExternalcontactsOrganizationsSchema(schemaId)

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

[**DataSchema**](DataSchema)


# **getExternalcontactsOrganizationsSchemaVersion**



> [DataSchema](DataSchema) getExternalcontactsOrganizationsSchemaVersion(schemaId, versionId)

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

[**DataSchema**](DataSchema)


# **getExternalcontactsOrganizationsSchemaVersions**



> [DataSchema](DataSchema) getExternalcontactsOrganizationsSchemaVersions(schemaId)

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

[**DataSchema**](DataSchema)


# **getExternalcontactsOrganizationsSchemas**



> [DataSchemaListing](DataSchemaListing) getExternalcontactsOrganizationsSchemas()

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

[**DataSchemaListing**](DataSchemaListing)


# **getExternalcontactsRelationship**



> [Relationship](Relationship) getExternalcontactsRelationship(relationshipId, expand)

Fetch a relationship

Wraps GET /api/v2/externalcontacts/relationships/{relationshipId}  

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
String relationshipId = "relationshipId_example"; // String | Relationship Id
List<String> expand = Arrays.asList(null); // List<String> | which fields, if any, to expand
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
| **expand** | [**List&lt;String&gt;**](String)| which fields, if any, to expand | [optional]<br />**Values**: externalDataSources 
{: class="table-striped"}


### Return type

[**Relationship**](Relationship)


# **getExternalcontactsReversewhitepageslookup**



> [ReverseWhitepagesLookupResult](ReverseWhitepagesLookupResult) getExternalcontactsReversewhitepageslookup(lookupVal, expand)

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
| **expand** | [**List&lt;String&gt;**](String)| which field, if any, to expand | [optional]<br />**Values**: contacts.externalOrganization, externalDataSources 
{: class="table-striped"}


### Return type

[**ReverseWhitepagesLookupResult**](ReverseWhitepagesLookupResult)


# **getExternalcontactsScanContacts**



> [CursorContactListing](CursorContactListing) getExternalcontactsScanContacts(limit, cursor)

Scan for external contacts using paging

Wraps GET /api/v2/externalcontacts/scan/contacts  

Requires ANY permissions: 

* relate:contact:view
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
Integer limit = 56; // Integer | The number of contacts per page; must be between 10 and 200, default is 100
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
| **limit** | **Integer**| The number of contacts per page; must be between 10 and 200, default is 100 | [optional] 
| **cursor** | **String**| Indicates where to resume query results (not required for first page), each page returns a new cursor with a 24h TTL | [optional] 
{: class="table-striped"}


### Return type

[**CursorContactListing**](CursorContactListing)


# **getExternalcontactsScanNotes**



> [CursorNoteListing](CursorNoteListing) getExternalcontactsScanNotes(limit, cursor)

Scan for notes using paging

Wraps GET /api/v2/externalcontacts/scan/notes  

Requires ANY permissions: 

* relate:contact:view
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
Integer limit = 56; // Integer | The number of notes per page; must be between 10 and 200, default is 100
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
| **limit** | **Integer**| The number of notes per page; must be between 10 and 200, default is 100 | [optional] 
| **cursor** | **String**| Indicates where to resume query results (not required for first page), each page returns a new cursor with a 24h TTL | [optional] 
{: class="table-striped"}


### Return type

[**CursorNoteListing**](CursorNoteListing)


# **getExternalcontactsScanOrganizations**



> [CursorOrganizationListing](CursorOrganizationListing) getExternalcontactsScanOrganizations(limit, cursor)

Scan for external organizations using paging

Wraps GET /api/v2/externalcontacts/scan/organizations  

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
Integer limit = 56; // Integer | The number of organizations per page; must be between 10 and 200, default is 100
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
| **limit** | **Integer**| The number of organizations per page; must be between 10 and 200, default is 100 | [optional] 
| **cursor** | **String**| Indicates where to resume query results (not required for first page), each page returns a new cursor with a 24h TTL | [optional] 
{: class="table-striped"}


### Return type

[**CursorOrganizationListing**](CursorOrganizationListing)


# **getExternalcontactsScanRelationships**



> [CursorRelationshipListing](CursorRelationshipListing) getExternalcontactsScanRelationships(limit, cursor)

Scan for relationships

Wraps GET /api/v2/externalcontacts/scan/relationships  

Requires ANY permissions: 

* relate:contact:view
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
Integer limit = 56; // Integer | The number of relationships per page; must be between 10 and 200, default is 100
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
| **limit** | **Integer**| The number of relationships per page; must be between 10 and 200, default is 100 | [optional] 
| **cursor** | **String**| Indicates where to resume query results (not required for first page), each page returns a new cursor with a 24h TTL | [optional] 
{: class="table-striped"}


### Return type

[**CursorRelationshipListing**](CursorRelationshipListing)


# **patchExternalcontactsContactIdentifiers**



> [ContactIdentifier](ContactIdentifier) patchExternalcontactsContactIdentifiers(contactId, body)

Claim or release identifiers for a contact

Wraps PATCH /api/v2/externalcontacts/contacts/{contactId}/identifiers  

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
IdentifierClaimRequest body = new IdentifierClaimRequest(); // IdentifierClaimRequest | ClaimRequest
try {
    ContactIdentifier result = apiInstance.patchExternalcontactsContactIdentifiers(contactId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalContactsApi#patchExternalcontactsContactIdentifiers");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **contactId** | **String**| ExternalContact ID | 
| **body** | [**IdentifierClaimRequest**](IdentifierClaimRequest)| ClaimRequest | 
{: class="table-striped"}


### Return type

[**ContactIdentifier**](ContactIdentifier)


# **postExternalcontactsBulkContacts**



> [BulkFetchContactsResponse](BulkFetchContactsResponse) postExternalcontactsBulkContacts(body)

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
| **body** | [**BulkIdsRequest**](BulkIdsRequest)| Contact ids | 
{: class="table-striped"}


### Return type

[**BulkFetchContactsResponse**](BulkFetchContactsResponse)


# **postExternalcontactsBulkContactsAdd**



> [BulkContactsResponse](BulkContactsResponse) postExternalcontactsBulkContactsAdd(body)

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
| **body** | [**BulkContactsRequest**](BulkContactsRequest)| Contacts | 
{: class="table-striped"}


### Return type

[**BulkContactsResponse**](BulkContactsResponse)


# **postExternalcontactsBulkContactsRemove**



> [BulkDeleteResponse](BulkDeleteResponse) postExternalcontactsBulkContactsRemove(body)

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
| **body** | [**BulkIdsRequest**](BulkIdsRequest)| Contact ids | 
{: class="table-striped"}


### Return type

[**BulkDeleteResponse**](BulkDeleteResponse)


# **postExternalcontactsBulkContactsUnresolved**



> [BulkFetchContactsResponse](BulkFetchContactsResponse) postExternalcontactsBulkContactsUnresolved(body)

Bulk fetch unresolved ancestor contacts

Wraps POST /api/v2/externalcontacts/bulk/contacts/unresolved  

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
    BulkFetchContactsResponse result = apiInstance.postExternalcontactsBulkContactsUnresolved(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalContactsApi#postExternalcontactsBulkContactsUnresolved");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**BulkIdsRequest**](BulkIdsRequest)| Contact ids | 
{: class="table-striped"}


### Return type

[**BulkFetchContactsResponse**](BulkFetchContactsResponse)


# **postExternalcontactsBulkContactsUpdate**



> [BulkContactsResponse](BulkContactsResponse) postExternalcontactsBulkContactsUpdate(body)

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
| **body** | [**BulkContactsRequest**](BulkContactsRequest)| Contacts | 
{: class="table-striped"}


### Return type

[**BulkContactsResponse**](BulkContactsResponse)


# **postExternalcontactsBulkNotes**



> [BulkFetchNotesResponse](BulkFetchNotesResponse) postExternalcontactsBulkNotes(body)

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
| **body** | [**BulkIdsRequest**](BulkIdsRequest)| Note ids | 
{: class="table-striped"}


### Return type

[**BulkFetchNotesResponse**](BulkFetchNotesResponse)


# **postExternalcontactsBulkNotesAdd**



> [BulkNotesResponse](BulkNotesResponse) postExternalcontactsBulkNotesAdd(body)

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
| **body** | [**BulkNotesRequest**](BulkNotesRequest)| Notes | 
{: class="table-striped"}


### Return type

[**BulkNotesResponse**](BulkNotesResponse)


# **postExternalcontactsBulkNotesRemove**



> [BulkDeleteResponse](BulkDeleteResponse) postExternalcontactsBulkNotesRemove(body)

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
| **body** | [**BulkIdsRequest**](BulkIdsRequest)| Note ids | 
{: class="table-striped"}


### Return type

[**BulkDeleteResponse**](BulkDeleteResponse)


# **postExternalcontactsBulkNotesUpdate**



> [BulkNotesResponse](BulkNotesResponse) postExternalcontactsBulkNotesUpdate(body)

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
| **body** | [**BulkNotesRequest**](BulkNotesRequest)| Notes | 
{: class="table-striped"}


### Return type

[**BulkNotesResponse**](BulkNotesResponse)


# **postExternalcontactsBulkOrganizations**



> [BulkFetchOrganizationsResponse](BulkFetchOrganizationsResponse) postExternalcontactsBulkOrganizations(body)

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
| **body** | [**BulkIdsRequest**](BulkIdsRequest)| Organizations ids | 
{: class="table-striped"}


### Return type

[**BulkFetchOrganizationsResponse**](BulkFetchOrganizationsResponse)


# **postExternalcontactsBulkOrganizationsAdd**



> [BulkOrganizationsResponse](BulkOrganizationsResponse) postExternalcontactsBulkOrganizationsAdd(body)

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
| **body** | [**BulkOrganizationsRequest**](BulkOrganizationsRequest)| Organizations | 
{: class="table-striped"}


### Return type

[**BulkOrganizationsResponse**](BulkOrganizationsResponse)


# **postExternalcontactsBulkOrganizationsRemove**



> [BulkDeleteResponse](BulkDeleteResponse) postExternalcontactsBulkOrganizationsRemove(body)

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
| **body** | [**BulkIdsRequest**](BulkIdsRequest)| Organization ids | 
{: class="table-striped"}


### Return type

[**BulkDeleteResponse**](BulkDeleteResponse)


# **postExternalcontactsBulkOrganizationsUpdate**



> [BulkOrganizationsResponse](BulkOrganizationsResponse) postExternalcontactsBulkOrganizationsUpdate(body)

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
| **body** | [**BulkOrganizationsRequest**](BulkOrganizationsRequest)| Organizations | 
{: class="table-striped"}


### Return type

[**BulkOrganizationsResponse**](BulkOrganizationsResponse)


# **postExternalcontactsBulkRelationships**



> [BulkFetchRelationshipsResponse](BulkFetchRelationshipsResponse) postExternalcontactsBulkRelationships(body)

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
| **body** | [**BulkIdsRequest**](BulkIdsRequest)| Relationships ids | 
{: class="table-striped"}


### Return type

[**BulkFetchRelationshipsResponse**](BulkFetchRelationshipsResponse)


# **postExternalcontactsBulkRelationshipsAdd**



> [BulkRelationshipsResponse](BulkRelationshipsResponse) postExternalcontactsBulkRelationshipsAdd(body)

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
| **body** | [**BulkRelationshipsRequest**](BulkRelationshipsRequest)| Relationships | 
{: class="table-striped"}


### Return type

[**BulkRelationshipsResponse**](BulkRelationshipsResponse)


# **postExternalcontactsBulkRelationshipsRemove**



> [BulkDeleteResponse](BulkDeleteResponse) postExternalcontactsBulkRelationshipsRemove(body)

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
| **body** | [**BulkIdsRequest**](BulkIdsRequest)| Relationships ids | 
{: class="table-striped"}


### Return type

[**BulkDeleteResponse**](BulkDeleteResponse)


# **postExternalcontactsBulkRelationshipsUpdate**



> [BulkRelationshipsResponse](BulkRelationshipsResponse) postExternalcontactsBulkRelationshipsUpdate(body)

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
| **body** | [**BulkRelationshipsRequest**](BulkRelationshipsRequest)| Relationships | 
{: class="table-striped"}


### Return type

[**BulkRelationshipsResponse**](BulkRelationshipsResponse)


# **postExternalcontactsContactNotes**



> [Note](Note) postExternalcontactsContactNotes(contactId, body)

Create a note for an external contact

Wraps POST /api/v2/externalcontacts/contacts/{contactId}/notes  

Requires ANY permissions: 

* relate:contact:edit
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
| **body** | [**Note**](Note)| ExternalContact | 
{: class="table-striped"}


### Return type

[**Note**](Note)


# **postExternalcontactsContactPromotion**



> [ExternalContact](ExternalContact) postExternalcontactsContactPromotion(contactId)

Promote an observed contact (ephemeral or identified) to a curated contact

Wraps POST /api/v2/externalcontacts/contacts/{contactId}/promotion  

Requires ANY permissions: 

* externalContacts:identity:promote

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
    ExternalContact result = apiInstance.postExternalcontactsContactPromotion(contactId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalContactsApi#postExternalcontactsContactPromotion");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **contactId** | **String**| ExternalContact ID | 
{: class="table-striped"}


### Return type

[**ExternalContact**](ExternalContact)


# **postExternalcontactsContacts**



> [ExternalContact](ExternalContact) postExternalcontactsContacts(body)

Create an external contact

Wraps POST /api/v2/externalcontacts/contacts  

Requires ANY permissions: 

* relate:contact:add
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
| **body** | [**ExternalContact**](ExternalContact)| ExternalContact | 
{: class="table-striped"}


### Return type

[**ExternalContact**](ExternalContact)


# **postExternalcontactsContactsSchemas**



> [DataSchema](DataSchema) postExternalcontactsContactsSchemas(body)

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
| **body** | [**DataSchema**](DataSchema)| Schema | 
{: class="table-striped"}


### Return type

[**DataSchema**](DataSchema)


# **postExternalcontactsIdentifierlookup**



> [ExternalContact](ExternalContact) postExternalcontactsIdentifierlookup(identifier, expand)

Fetch a contact using an identifier type and value.

Phone number identifier values must be provided with the country code and a leading '+' symbol. Example: \"+1 704 298 4733\"

Wraps POST /api/v2/externalcontacts/identifierlookup  

Requires ANY permissions: 

* externalContacts:contact:view
* relate:contact:view

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
ContactIdentifier identifier = new ContactIdentifier(); // ContactIdentifier | 
List<String> expand = Arrays.asList(null); // List<String> | which field, if any, to expand
try {
    ExternalContact result = apiInstance.postExternalcontactsIdentifierlookup(identifier, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalContactsApi#postExternalcontactsIdentifierlookup");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **identifier** | [**ContactIdentifier**](ContactIdentifier)|  | 
| **expand** | [**List&lt;String&gt;**](String)| which field, if any, to expand | [optional]<br />**Values**: externalOrganization, identifiers 
{: class="table-striped"}


### Return type

[**ExternalContact**](ExternalContact)


# **postExternalcontactsMergeContacts**



> [ExternalContact](ExternalContact) postExternalcontactsMergeContacts(body)

Merge two contacts into a new contact record

Two curated contacts cannot be merged. Refer to the Contact Merging article on the Developer Center for details

Wraps POST /api/v2/externalcontacts/merge/contacts  

Requires ANY permissions: 

* externalContacts:identity:merge

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
MergeRequest body = new MergeRequest(); // MergeRequest | MergeRequest
try {
    ExternalContact result = apiInstance.postExternalcontactsMergeContacts(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalContactsApi#postExternalcontactsMergeContacts");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**MergeRequest**](MergeRequest)| MergeRequest | 
{: class="table-striped"}


### Return type

[**ExternalContact**](ExternalContact)


# **postExternalcontactsOrganizationNotes**



> [Note](Note) postExternalcontactsOrganizationNotes(externalOrganizationId, body)

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
| **body** | [**Note**](Note)| ExternalContact | 
{: class="table-striped"}


### Return type

[**Note**](Note)


# **postExternalcontactsOrganizations**



> [ExternalOrganization](ExternalOrganization) postExternalcontactsOrganizations(body)

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
| **body** | [**ExternalOrganization**](ExternalOrganization)| ExternalOrganization | 
{: class="table-striped"}


### Return type

[**ExternalOrganization**](ExternalOrganization)


# **postExternalcontactsOrganizationsSchemas**



> [DataSchema](DataSchema) postExternalcontactsOrganizationsSchemas(body)

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
| **body** | [**DataSchema**](DataSchema)| Schema | 
{: class="table-striped"}


### Return type

[**DataSchema**](DataSchema)


# **postExternalcontactsRelationships**



> [Relationship](Relationship) postExternalcontactsRelationships(body)

Create a relationship

Wraps POST /api/v2/externalcontacts/relationships  

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
| **body** | [**Relationship**](Relationship)| Relationship | 
{: class="table-striped"}


### Return type

[**Relationship**](Relationship)


# **putExternalcontactsContact**



> [ExternalContact](ExternalContact) putExternalcontactsContact(contactId, body)

Update an external contact

Wraps PUT /api/v2/externalcontacts/contacts/{contactId}  

Requires ANY permissions: 

* relate:contact:edit
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
| **body** | [**ExternalContact**](ExternalContact)| ExternalContact | 
{: class="table-striped"}


### Return type

[**ExternalContact**](ExternalContact)


# **putExternalcontactsContactNote**



> [Note](Note) putExternalcontactsContactNote(contactId, noteId, body)

Update a note for an external contact

Wraps PUT /api/v2/externalcontacts/contacts/{contactId}/notes/{noteId}  

Requires ANY permissions: 

* relate:contact:edit
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
| **body** | [**Note**](Note)| Note | 
{: class="table-striped"}


### Return type

[**Note**](Note)


# **putExternalcontactsContactsSchema**



> [DataSchema](DataSchema) putExternalcontactsContactsSchema(schemaId, body)

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
| **body** | [**DataSchema**](DataSchema)| Data Schema | 
{: class="table-striped"}


### Return type

[**DataSchema**](DataSchema)


# **putExternalcontactsConversation**



> Void putExternalcontactsConversation(conversationId, body)

Associate/disassociate an external contact with a conversation

To associate, supply a value for the externalContactId.  To disassociate, do not include the property at all.

Wraps PUT /api/v2/externalcontacts/conversations/{conversationId}  

Requires ANY permissions: 

* relate:conversation:associate
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
| **body** | [**ConversationAssociation**](ConversationAssociation)| ConversationAssociation | 
{: class="table-striped"}


### Return type

null (empty response body)


# **putExternalcontactsOrganization**



> [ExternalOrganization](ExternalOrganization) putExternalcontactsOrganization(externalOrganizationId, body)

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
| **body** | [**ExternalOrganization**](ExternalOrganization)| ExternalOrganization | 
{: class="table-striped"}


### Return type

[**ExternalOrganization**](ExternalOrganization)


# **putExternalcontactsOrganizationNote**



> [Note](Note) putExternalcontactsOrganizationNote(externalOrganizationId, noteId, body)

Update a note for an external organization

Wraps PUT /api/v2/externalcontacts/organizations/{externalOrganizationId}/notes/{noteId}  

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
| **body** | [**Note**](Note)| Note | 
{: class="table-striped"}


### Return type

[**Note**](Note)


# **putExternalcontactsOrganizationTrustorTrustorId**



> [ExternalOrganizationTrustorLink](ExternalOrganizationTrustorLink) putExternalcontactsOrganizationTrustorTrustorId(externalOrganizationId, trustorId)

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

[**ExternalOrganizationTrustorLink**](ExternalOrganizationTrustorLink)


# **putExternalcontactsOrganizationsSchema**



> [DataSchema](DataSchema) putExternalcontactsOrganizationsSchema(schemaId, body)

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
| **body** | [**DataSchema**](DataSchema)| Data Schema | 
{: class="table-striped"}


### Return type

[**DataSchema**](DataSchema)


# **putExternalcontactsRelationship**



> [Relationship](Relationship) putExternalcontactsRelationship(relationshipId, body)

Update a relationship

Wraps PUT /api/v2/externalcontacts/relationships/{relationshipId}  

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
| **body** | [**Relationship**](Relationship)| Relationship | 
{: class="table-striped"}


### Return type

[**Relationship**](Relationship)


_com.mypurecloud.sdk.v2:platform-client-v2:208.0.0_
