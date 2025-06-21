# ContactListDivisionView


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **division** | [**Division**](Division) | The division to which this entity belongs. |  [optional] |
| **columnNames** | **List&lt;String&gt;** | The names of the contact data columns. |  |
| **phoneColumns** | [**List&lt;ContactPhoneNumberColumn&gt;**](ContactPhoneNumberColumn) | Indicates which columns are phone numbers. |  [optional] |
| **emailColumns** | [**List&lt;EmailColumn&gt;**](EmailColumn) | Indicates which columns are email addresses. |  [optional] |
| **whatsAppColumns** | [**List&lt;WhatsAppColumn&gt;**](WhatsAppColumn) | Indicates which columns are whatsApp contacts. |  [optional] |
| **importStatus** | [**ImportStatus**](ImportStatus) | The status of the import process. |  [optional] |
| **size** | **Long** | The number of contacts in the ContactList. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:227.0.0_
