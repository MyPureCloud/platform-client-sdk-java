---
title: ExternalContactsApi
---
## ExternalContactsApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**deleteExternalcontactsContact**](ExternalContactsApi.html#deleteExternalcontactsContact) | Delete an external contact |
| [**deleteExternalcontactsContactNote**](ExternalContactsApi.html#deleteExternalcontactsContactNote) | Delete a note for an external contact |
| [**deleteExternalcontactsOrganization**](ExternalContactsApi.html#deleteExternalcontactsOrganization) | Delete an external organization |
| [**deleteExternalcontactsOrganizationNote**](ExternalContactsApi.html#deleteExternalcontactsOrganizationNote) | Delete a note for an external organization |
| [**deleteExternalcontactsOrganizationTrustor**](ExternalContactsApi.html#deleteExternalcontactsOrganizationTrustor) | Unlink the Trustor for this External Organization |
| [**deleteExternalcontactsRelationship**](ExternalContactsApi.html#deleteExternalcontactsRelationship) | Delete a relationship |
| [**getExternalcontactsContact**](ExternalContactsApi.html#getExternalcontactsContact) | Fetch an external contact |
| [**getExternalcontactsContactNote**](ExternalContactsApi.html#getExternalcontactsContactNote) | Fetch a note for an external contact |
| [**getExternalcontactsContactNotes**](ExternalContactsApi.html#getExternalcontactsContactNotes) | List notes for an external contact |
| [**getExternalcontactsContacts**](ExternalContactsApi.html#getExternalcontactsContacts) | Search for external contacts |
| [**getExternalcontactsOrganization**](ExternalContactsApi.html#getExternalcontactsOrganization) | Fetch an external organization |
| [**getExternalcontactsOrganizationContacts**](ExternalContactsApi.html#getExternalcontactsOrganizationContacts) | Search for external contacts in an external organization |
| [**getExternalcontactsOrganizationNote**](ExternalContactsApi.html#getExternalcontactsOrganizationNote) | Fetch a note for an external organization |
| [**getExternalcontactsOrganizationNotes**](ExternalContactsApi.html#getExternalcontactsOrganizationNotes) | List notes for an external organization |
| [**getExternalcontactsOrganizationRelationships**](ExternalContactsApi.html#getExternalcontactsOrganizationRelationships) | Fetch a relationship for an external organization |
| [**getExternalcontactsOrganizations**](ExternalContactsApi.html#getExternalcontactsOrganizations) | Search for external organizations |
| [**getExternalcontactsRelationship**](ExternalContactsApi.html#getExternalcontactsRelationship) | Fetch a relationship |
| [**getExternalcontactsReversewhitepageslookup**](ExternalContactsApi.html#getExternalcontactsReversewhitepageslookup) | Look up contacts and externalOrganizations based on an attribute. Maximum of 25 values returned. |
| [**postExternalcontactsContactNotes**](ExternalContactsApi.html#postExternalcontactsContactNotes) | Create a note for an external contact |
| [**postExternalcontactsContacts**](ExternalContactsApi.html#postExternalcontactsContacts) | Create an external contact |
| [**postExternalcontactsOrganizationNotes**](ExternalContactsApi.html#postExternalcontactsOrganizationNotes) | Create a note for an external organization |
| [**postExternalcontactsOrganizations**](ExternalContactsApi.html#postExternalcontactsOrganizations) | Create an external organization |
| [**postExternalcontactsRelationships**](ExternalContactsApi.html#postExternalcontactsRelationships) | Create a relationship |
| [**putExternalcontactsContact**](ExternalContactsApi.html#putExternalcontactsContact) | Update an external contact |
| [**putExternalcontactsContactNote**](ExternalContactsApi.html#putExternalcontactsContactNote) | Update a note for an external contact |
| [**putExternalcontactsConversation**](ExternalContactsApi.html#putExternalcontactsConversation) | Associate an external contact with a conversation |
| [**putExternalcontactsOrganization**](ExternalContactsApi.html#putExternalcontactsOrganization) | Update an external organization |
| [**putExternalcontactsOrganizationNote**](ExternalContactsApi.html#putExternalcontactsOrganizationNote) | Update a note for an external organization |
| [**putExternalcontactsOrganizationTrustorTrustorId**](ExternalContactsApi.html#putExternalcontactsOrganizationTrustorTrustorId) | Links a Trustor with an External Organization |
| [**putExternalcontactsRelationship**](ExternalContactsApi.html#putExternalcontactsRelationship) | Update a relationship |
{: class="table-striped"}

<a name="deleteExternalcontactsContact"></a>

# **deleteExternalcontactsContact**



> [Empty](Empty.html) deleteExternalcontactsContact(contactId)

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

[**Empty**](Empty.html)

<a name="deleteExternalcontactsContactNote"></a>

# **deleteExternalcontactsContactNote**



> [Empty](Empty.html) deleteExternalcontactsContactNote(contactId, noteId)

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

[**Empty**](Empty.html)

<a name="deleteExternalcontactsOrganization"></a>

# **deleteExternalcontactsOrganization**



> [Empty](Empty.html) deleteExternalcontactsOrganization(externalOrganizationId)

Delete an external organization



Wraps DELETE /api/v2/externalcontacts/organizations/{externalOrganizationId}  

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

[**Empty**](Empty.html)

<a name="deleteExternalcontactsOrganizationNote"></a>

# **deleteExternalcontactsOrganizationNote**



> [Empty](Empty.html) deleteExternalcontactsOrganizationNote(externalOrganizationId, noteId)

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

[**Empty**](Empty.html)

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



> [Empty](Empty.html) deleteExternalcontactsRelationship(relationshipId)

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

[**Empty**](Empty.html)

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
List<String> expand = Arrays.asList("expand_example"); // List<String> | which fields, if any, to expand (externalOrganization,externalDataSources)
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
List<String> expand = Arrays.asList("expand_example"); // List<String> | which fields, if any, to expand
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
List<String> expand = Arrays.asList("expand_example"); // List<String> | which fields, if any, to expand
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
| **pageSize** | **Integer**| Page size (limited to fetching first 1,000 records; pageNumber * pageSize must be &lt;= 1,000) | [optional] [default to 20] 
| **pageNumber** | **Integer**| Page number (limited to fetching first 1,000 records; pageNumber * pageSize must be &lt;= 1,000) | [optional] [default to 1] 
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
List<String> expand = Arrays.asList("expand_example"); // List<String> | which fields, if any, to expand
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
| **pageSize** | **Integer**| Page size (limited to fetching first 1,000 records; pageNumber * pageSize must be &lt;= 1,000) | [optional] [default to 20] 
| **pageNumber** | **Integer**| Page number (limited to fetching first 1,000 records; pageNumber * pageSize must be &lt;= 1,000) | [optional] [default to 1] 
| **q** | **String**| User supplied search keywords (no special syntax is currently supported) | [optional] 
| **sortOrder** | **String**| Sort order | [optional] 
| **expand** | [**List&lt;String&gt;**](String.html)| which fields, if any, to expand | [optional]<br />**Values**: externalOrganization, externalDataSources 
{: class="table-striped"}


### Return type

[**ContactListing**](ContactListing.html)

<a name="getExternalcontactsOrganization"></a>

# **getExternalcontactsOrganization**



> [ExternalOrganization](ExternalOrganization.html) getExternalcontactsOrganization(externalOrganizationId, expand, includeTrustors)

Fetch an external organization



Wraps GET /api/v2/externalcontacts/organizations/{externalOrganizationId}  

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
List<String> expand = Arrays.asList("expand_example"); // List<String> | which fields, if any, to expand
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
| **pageSize** | **Integer**| Page size (limited to fetching first 1,000 records; pageNumber * pageSize must be &lt;= 1,000) | [optional] [default to 20] 
| **pageNumber** | **Integer**| Page number (limited to fetching first 1,000 records; pageNumber * pageSize must be &lt;= 1,000) | [optional] [default to 1] 
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
List<String> expand = Arrays.asList("expand_example"); // List<String> | which fields, if any, to expand
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
List<String> expand = Arrays.asList("expand_example"); // List<String> | which fields, if any, to expand
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
| **pageSize** | **Integer**| Page size (limited to fetching first 1,000 records; pageNumber * pageSize must be &lt;= 1,000) | [optional] [default to 20] 
| **pageNumber** | **Integer**| Page number (limited to fetching first 1,000 records; pageNumber * pageSize must be &lt;= 1,000) | [optional] [default to 1] 
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
| **pageSize** | **Integer**| Page size (limited to fetching first 1,000 records; pageNumber * pageSize must be &lt;= 1,000) | [optional] [default to 20] 
| **pageNumber** | **Integer**| Page number (limited to fetching first 1,000 records; pageNumber * pageSize must be &lt;= 1,000) | [optional] [default to 1] 
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
List<String> trustorId = Arrays.asList("trustorId_example"); // List<String> | Search for external organizations by trustorIds (limit 25). If supplied, the 'q' parameters is ignored. Items are returned in the order requested
String sortOrder = "sortOrder_example"; // String | Sort order
List<String> expand = Arrays.asList("expand_example"); // List<String> | which fields, if any, to expand
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
| **pageSize** | **Integer**| Page size (limited to fetching first 1,000 records; pageNumber * pageSize must be &lt;= 1,000) | [optional] [default to 20] 
| **pageNumber** | **Integer**| Page number (limited to fetching first 1,000 records; pageNumber * pageSize must be &lt;= 1,000) | [optional] [default to 1] 
| **q** | **String**| Search query | [optional] 
| **trustorId** | [**List&lt;String&gt;**](String.html)| Search for external organizations by trustorIds (limit 25). If supplied, the &#39;q&#39; parameters is ignored. Items are returned in the order requested | [optional] 
| **sortOrder** | **String**| Sort order | [optional] 
| **expand** | [**List&lt;String&gt;**](String.html)| which fields, if any, to expand | [optional]<br />**Values**: externalDataSources 
| **includeTrustors** | **Boolean**| (true or false) whether or not to include trustor information embedded in the externalOrganization | [optional] 
{: class="table-striped"}


### Return type

[**ExternalOrganizationListing**](ExternalOrganizationListing.html)

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
List<String> expand = Arrays.asList("expand_example"); // List<String> | which field, if any, to expand
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

<a name="postExternalcontactsOrganizationNotes"></a>

# **postExternalcontactsOrganizationNotes**



> [Note](Note.html) postExternalcontactsOrganizationNotes(externalOrganizationId, body)

Create a note for an external organization



Wraps POST /api/v2/externalcontacts/organizations/{externalOrganizationId}/notes  

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

<a name="putExternalcontactsConversation"></a>

# **putExternalcontactsConversation**



> Void putExternalcontactsConversation(conversationId, body)

Associate an external contact with a conversation



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



> [ExternalOrganization](ExternalOrganization.html) putExternalcontactsOrganizationTrustorTrustorId(externalOrganizationId, trustorId)

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
    ExternalOrganization result = apiInstance.putExternalcontactsOrganizationTrustorTrustorId(externalOrganizationId, trustorId);
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

[**ExternalOrganization**](ExternalOrganization.html)

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

