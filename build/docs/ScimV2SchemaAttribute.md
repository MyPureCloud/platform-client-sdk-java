---
title: ScimV2SchemaAttribute
---
## ScimV2SchemaAttribute


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | <!----><!---->**String**<!----> | The attribute&#39;s name |  [optional] |
| **type** | [**TypeEnum**](#TypeEnum)<!----> | The data type of the attribute. |  [optional] |
| **subAttributes** | <!----><!---->[**List&lt;ScimV2SchemaAttribute&gt;**](ScimV2SchemaAttribute.html)<!----> | The list of subattributes for an attribute of the type \&quot;complex\&quot;. Uses the same schema as \&quot;attributes\&quot;. |  [optional] |
| **multiValued** | <!----><!---->**Boolean**<!----> | Indicates whether an attribute contains multiple values. |  [optional] |
| **description** | <!----><!---->**String**<!----> | The description of the attribute. |  [optional] |
| **required** | <!----><!---->**Boolean**<!----> | Indicates whether an attribute is required. |  [optional] |
| **canonicalValues** | <!----><!---->**List&lt;String&gt;**<!----> | The list of standard values that service providers may use. Service providers may ignore unsupported values. |  [optional] |
| **caseExact** | <!----><!---->**Boolean**<!----> | Indicates whether a string attribute is case-sensitive. If set to \&quot;true\&quot;, the server preserves case sensitivity. If set to \&quot;false\&quot;, the server may change the case. The server also uses case sensitivity when evaluating filters. See section 3.4.2.2 \&quot;Filtering\&quot; in RFC 7644 for details. |  [optional] |
| **mutability** | [**MutabilityEnum**](#MutabilityEnum)<!----> | The circumstances under which an attribute can be defined or redefined. The default is \&quot;readWrite\&quot;. |  [optional] |
| **returned** | [**ReturnedEnum**](#ReturnedEnum)<!----> | The circumstances under which an attribute and its values are returned in response to a GET, PUT, POST, or PATCH request. |  [optional] |
| **uniqueness** | [**UniquenessEnum**](#UniquenessEnum)<!----> | The method by which the service provider enforces the uniqueness of an attribute value. A server can reject a value by returning the HTTP response code 400 (Bad Request). A client can enforce uniqueness to a greater degree than the server provider enforces. For example, a client could make a value unique even though the server has \&quot;uniqueness\&quot; set to \&quot;none\&quot;. |  [optional] |
| **referenceTypes** | <!---->[**List&lt;ReferenceTypesEnum&gt;**](#ReferenceTypesEnum)<!----> | The list of SCIM resource types that may be referenced. Only applies when \&quot;type\&quot; is set to \&quot;reference\&quot;. |  [optional] |
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| STRING | &quot;STRING&quot; |
| BOOLEAN | &quot;BOOLEAN&quot; |
| DECIMAL | &quot;DECIMAL&quot; |
| INTEGER | &quot;INTEGER&quot; |
| DATE_TIME | &quot;DATE_TIME&quot; |
| REFERENCE | &quot;REFERENCE&quot; |
| COMPLEX | &quot;COMPLEX&quot; |
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
| ALWAYS | &quot;ALWAYS&quot; |
| NEVER | &quot;NEVER&quot; |
| DEFAULT | &quot;DEFAULT&quot; |
| REQUEST | &quot;REQUEST&quot; |
{: class="table table-striped"}


<a name="UniquenessEnum"></a>

## Enum: UniquenessEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| NONE | &quot;NONE&quot; |
| SERVER | &quot;SERVER&quot; |
| GLOBAL | &quot;GLOBAL&quot; |
{: class="table table-striped"}


<a name="ReferenceTypesEnum"></a>

## Enum: ReferenceTypesEnum

| Name | Value |
| ---- | ----- |
| USER | &quot;USER&quot; |
| GROUP | &quot;GROUP&quot; |
| EXTERNAL | &quot;EXTERNAL&quot; |
| URI | &quot;URI&quot; |
{: class="table table-striped"}



