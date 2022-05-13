---
title: Coretype
---
## Coretype


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> |  |  [optional] |
| **version** | <!----><!---->**Integer**<!----> | A positive integer denoting the core type's version |  [optional] |
| **dateCreated** | <!----><!---->[**Date**](Date.html)<!----> | The date the core type was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **schema** | <!----><!---->[**Schema**](Schema.html)<!----> | The core type's built-in schema |  [optional] |
| **current** | <!----><!---->**Boolean**<!----> | A boolean indicating if the core type's version is the current one in use by the system |  [optional] |
| **validationFields** | <!----><!---->**List&lt;String&gt;**<!----> | An array of strings naming the fields of the core type subject to validation.  Validation constraints are specified by a schema author using the core type. |  [optional] |
| **validationLimits** | <!----><!---->[**ValidationLimits**](ValidationLimits.html)<!----> | A structure denoting the system-imposed minimum and maximum string length (for text-based core types) or numeric values (for number-based) core types.  For example, the validationLimits for a text-based core type specify the min/max values for a minimum string length (minLength) constraint supplied by a schemaauthor on a text field.  Similarly, the maxLength's min/max specifies maximum string length constraint supplied by a schema author for the same field. |  [optional] |
| **itemValidationFields** | <!----><!---->**List&lt;String&gt;**<!----> | Specific to the \"tag\" core type, this is an array of strings naming the tag item fields of the core type subject to validation |  [optional] |
| **itemValidationLimits** | <!----><!---->[**ItemValidationLimits**](ItemValidationLimits.html)<!----> | A structure denoting the system-imposed minimum and maximum string length for string-array based core types such as \"tag\" and \"enum\".  Forexample, the validationLimits for a schema field using a tag core type specify the min/max values for a minimum string length (minLength) constraint supplied by a schema author on individual tags.  Similarly, the maxLength's min/max specifies maximum string length constraint supplied by a schema author for the same field's tags. |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}



