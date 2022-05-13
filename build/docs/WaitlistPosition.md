---
title: WaitlistPosition
---
## WaitlistPosition


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **timeOffRequest** | <!----><!---->[**TimeOffRequestReference**](TimeOffRequestReference.html)<!----> | The time off request for this wait list position |  [optional] |
| **timeOffLimit** | <!----><!---->[**TimeOffLimitReference**](TimeOffLimitReference.html)<!----> | The time off limit for which time off request is waitlisted |  [optional] |
| **date** | <!----><!---->[**LocalDate**](LocalDate.html)<!----> | The date to which this wait list position applies, as defined by the time zone of the business unit. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  [optional] |
| **waitlistPosition** | <!----><!---->**Integer**<!----> | The time off request's position in the waitlist on the date. 1 means time off is the first in the waitlist |  [optional] |
{: class="table table-striped"}



