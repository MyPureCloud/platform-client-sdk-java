# Reoccurrence


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** |  |  [optional] |
| **start** | **String** | The start date time of the initial occurrence as an ISO-8601 string in the format YYYY-MM-DDThh:mm:ss |  |
| **end** | **String** | The end date time of the initial occurrence as an ISO-8601 string in the format YYYY-MM-DDThh:mm:ss |  |
| **timeZone** | **String** | The time zone for the recurrence. The time zone of the recurrence is determined by prioritizing the recurrence's time zone if specified, then the schedule's time zone if set, and finally defaulting to UTC if neither defines a time zone. See here for a list of valid time zones https://www.iana.org/time-zones |  [optional] |
| **pattern** | [**Pattern**](Pattern) | The schedule pattern e.g.: Daily/Weekly |  |
| **range** | [**Range**](Range) | The schedule range e.g.: EndDate/NoEnd/Numbered |  |
| **alterations** | [**List&lt;Alteration&gt;**](Alteration) | Modifications to the original recurrence schedule (Exclusions/Inclusions) |  [optional] |
| **nextOccurrenceDetails** | [**NextOccurrenceDetails**](NextOccurrenceDetails) | The next occurrence details for the next start and end occurrences for the recurrence |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:235.0.0_
