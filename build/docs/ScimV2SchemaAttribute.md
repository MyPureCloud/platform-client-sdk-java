---
title: ScimV2SchemaAttribute
---
## ScimV2SchemaAttribute


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | <!----><!---->**String**<!----> | The attribute&#39;s name |  [optional] |
| **type** | [**TypeEnum**](#TypeEnum)<!----> | The attribute&#39;s data type.  Valid values are \&quot;string\&quot;, \&quot;boolean\&quot;, \&quot;decimal\&quot;, \&quot;integer\&quot;, \&quot;dateTime\&quot;, \&quot;reference\&quot;, and \&quot;complex\&quot;. |  [optional] |
| **subAttributes** | <!----><!---->[**List&lt;ScimV2SchemaAttribute&gt;**](ScimV2SchemaAttribute.html)<!----> | When an attribute is of type \&quot;complex\&quot;, \&quot;subAttributes\&quot; defines a set of sub-attributes. \&quot;subAttributes\&quot; has the same schema sub-attributes as \&quot;attributes\&quot; |  [optional] |
| **multiValued** | <!----><!---->**Boolean**<!----> | A Boolean value indicating the attribute&#39;s plurality. |  [optional] |
| **description** | <!----><!---->**String**<!----> | The attribute&#39;s human-readable description. |  [optional] |
| **required** | <!----><!---->**Boolean**<!----> | A Boolean value that specifies whether or not the attribute is required. |  [optional] |
| **canonicalValues** | <!----><!---->**List&lt;String&gt;**<!----> | A collection of suggested canonical values that MAY be used (e.g., \&quot;work\&quot; and \&quot;home\&quot;).  In some cases, service providers MAY choose to ignore unsupported values.  OPTIONAL. |  [optional] |
| **caseExact** | <!----><!---->**Boolean**<!----> | A Boolean value that specifies whether or not a string attribute is case sensitive.  The server SHALL use case sensitivity when evaluating filters.  For attributes that are case exact, the server SHALL preserve case for any value submitted.  If the attribute is case insensitive, the server MAY alter case for a submitted value.  Case sensitivity also impacts how attribute values MAY be compared against filter values (see Section 3.4.2.2 of [RFC7644]) |  [optional] |
| **mutability** | [**MutabilityEnum**](#MutabilityEnum)<!----> | A single keyword indicating the circumstances under which the value of the attribute can be (re)defined. Value are readOnly, readWrite, immutable, writeOnly |  [optional] |
| **returned** | [**ReturnedEnum**](#ReturnedEnum)<!----> | A single keyword that indicates when an attribute and associated values are returned in response to a GET request, or in response to a PUT, POST, or PATCH request.  Valid keywords are as follows: always, never, default, request |  [optional] |
| **uniqueness** | [**UniquenessEnum**](#UniquenessEnum)<!----> | A single keyword value that specifies how the service provider enforces uniqueness of attribute values.  A server MAY reject an invalid value based on uniqueness by returning HTTP response code 400 (Bad Request).  A client MAY enforce uniqueness on the client side to a greater degree than the service provider enforces.  For example, a client could make a value unique while the server has uniqueness of \&quot;none\&quot;.  Valid keywords are as follows: none, server, global |  [optional] |
| **referenceTypes** | <!---->[**List&lt;ReferenceTypesEnum&gt;**](#ReferenceTypesEnum)<!----> | A multi-valued array of JSON strings that indicate the SCIM resource types that may be referenced. Values include User, Group, external and uri. |  [optional] |
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



