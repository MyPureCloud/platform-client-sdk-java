---
title: ScimV2SchemaAttribute
---
## ScimV2SchemaAttribute


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | <!----><!---->**String**<!----> | The name of the attribute. |  [optional] |
| **type** | [**TypeEnum**](#TypeEnum)<!----> | The data type of the attribute. |  [optional] |
| **subAttributes** | <!----><!---->[**List&lt;ScimV2SchemaAttribute&gt;**](ScimV2SchemaAttribute.html)<!----> | The list of subattributes for an attribute of the type \"complex\". Uses the same schema as \"attributes\". |  [optional] |
| **multiValued** | <!----><!---->**Boolean**<!----> | Indicates whether an attribute contains multiple values. |  [optional] |
| **description** | <!----><!---->**String**<!----> | The description of the attribute. |  [optional] |
| **required** | <!----><!---->**Boolean**<!----> | Indicates whether an attribute is required. |  [optional] |
| **canonicalValues** | <!----><!---->**List&lt;String&gt;**<!----> | The list of standard values that service providers may use. Service providers may ignore unsupported values. |  [optional] |
| **caseExact** | <!----><!---->**Boolean**<!----> | Indicates whether a string attribute is case-sensitive. If set to \"true\", the server preserves case sensitivity. If set to \"false\", the server may change the case. The server also uses case sensitivity when evaluating filters. See section 3.4.2.2 \"Filtering\" in RFC 7644 for details. |  [optional] |
| **mutability** | [**MutabilityEnum**](#MutabilityEnum)<!----> | The circumstances under which an attribute can be defined or redefined. The default is \"readWrite\". |  [optional] |
| **returned** | [**ReturnedEnum**](#ReturnedEnum)<!----> | The circumstances under which an attribute and its values are returned in response to a GET, PUT, POST, or PATCH request. |  [optional] |
| **uniqueness** | [**UniquenessEnum**](#UniquenessEnum)<!----> | The method by which the service provider enforces the uniqueness of an attribute value. A server can reject a value by returning the HTTP response code 400 (Bad Request). A client can enforce uniqueness to a greater degree than the server provider enforces. For example, a client could make a value unique even though the server has \"uniqueness\" set to \"none\". |  [optional] |
| **referenceTypes** | <!---->[**List&lt;ReferenceTypesEnum&gt;**](#ReferenceTypesEnum)<!----> | The list of SCIM resource types that may be referenced. Only applies when \"type\" is set to \"reference\". |  [optional] |
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| STRING | &quot;string&quot; | 
| BOOLEAN | &quot;boolean&quot; | 
| DECIMAL | &quot;decimal&quot; | 
| INTEGER | &quot;integer&quot; | 
| DATETIME | &quot;dateTime&quot; | 
| REFERENCE | &quot;reference&quot; | 
| COMPLEX | &quot;complex&quot; | 
{: class="table table-striped"}


<a name="MutabilityEnum"></a>

## Enum: MutabilityEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| READWRITE | &quot;readWrite&quot; | 
| READONLY | &quot;readOnly&quot; | 
| IMMUTABLE | &quot;immutable&quot; | 
| WRITEONLY | &quot;writeOnly&quot; | 
{: class="table table-striped"}


<a name="ReturnedEnum"></a>

## Enum: ReturnedEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ALWAYS | &quot;always&quot; | 
| NEVER | &quot;never&quot; | 
| DEFAULT | &quot;default&quot; | 
| REQUEST | &quot;request&quot; | 
{: class="table table-striped"}


<a name="UniquenessEnum"></a>

## Enum: UniquenessEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| NONE | &quot;none&quot; | 
| SERVER | &quot;server&quot; | 
| GLOBAL | &quot;global&quot; | 
{: class="table table-striped"}


<a name="ReferenceTypesEnum"></a>

## Enum: ReferenceTypesEnum

| Name | Value |
| ---- | ----- |
| USER | &quot;User&quot; |
| GROUP | &quot;Group&quot; |
| EXTERNAL | &quot;external&quot; |
| URI | &quot;uri&quot; |
{: class="table table-striped"}



