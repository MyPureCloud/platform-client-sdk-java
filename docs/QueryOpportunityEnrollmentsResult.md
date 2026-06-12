# QueryOpportunityEnrollmentsResult


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **nextStartDate** | [**Date**](Date) | The start date to use for the next query to retrieve additional results in ISO-8601 format. Null if there are no more results |  [optional] |
| **enrollments** | [**List&lt;QueryOpportunityEnrollmentResult&gt;**](QueryOpportunityEnrollmentResult) | The enrollments for the query operation |  |
| **opportunities** | [**List&lt;QueryEnrollmentOpportunityResult&gt;**](QueryEnrollmentOpportunityResult) | The referenced opportunities when expand=opportunities is specified |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:255.1.0_
