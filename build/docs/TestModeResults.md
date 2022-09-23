---
title: TestModeResults
---
## TestModeResults


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **schemaValidation** | <!----><!---->[**TestSchemaOperation**](TestSchemaOperation.html)<!----> | Information about the validation of the schema of the event body passed in to test mode |  [optional] |
| **targetValidation** | <!----><!---->[**TestTargetOperation**](TestTargetOperation.html)<!----> | Information about the validation of the trigger target |  [optional] |
| **jsonPathValidation** | <!----><!---->[**TestMatchesOperation**](TestMatchesOperation.html)<!----> | Information about the json path matching criteria |  [optional] |
| **triggerMatches** | <!----><!---->**Boolean**<!----> | Whether the trigger would have matched on the provided event body |  [optional] |
{: class="table table-striped"}



