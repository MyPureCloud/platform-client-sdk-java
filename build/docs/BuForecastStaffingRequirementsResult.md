---
title: BuForecastStaffingRequirementsResult
---
## BuForecastStaffingRequirementsResult


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **weekNumber** | <!----><!---->**Integer**<!----> | The week number represented by this response |  |
| **downloadUrl** | <!----><!---->**String**<!----> | The url to get the requirements results for this week |  |
| **downloadUrlExpirationDate** | <!----><!---->[**Date**](Date.html)<!----> | The expiration date of the download url, as an ISO-8601 string |  |
| **planningGroupStaffingRequirements** | <!----><!---->[**List&lt;StaffingRequirementsPlanningGroupData&gt;**](StaffingRequirementsPlanningGroupData.html)<!----> | Results will always come via downloadUrl, however the schema is included for documentation |  [optional] |
{: class="table table-striped"}



