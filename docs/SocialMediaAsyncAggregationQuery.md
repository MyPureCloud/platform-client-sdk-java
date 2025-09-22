# SocialMediaAsyncAggregationQuery


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **interval** | **String** | Behaves like one clause in a SQL WHERE. Specifies the date and time range of data being queried. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss |  |
| **granularity** | **String** | Granularity metrics into subpartitions within the time interval specified. The default granularity is the same duration as the interval. Periods are represented as an ISO-8601 string. For example: P1D or P1DT12H |  [optional] |
| **timeZone** | **String** | Time zone context used to calculate response intervals (this allows resolving DST changes). The interval offset is used even when timeZone is specified. Default is UTC. Time zones are represented as a string of the zone name as found in the IANA time zone database. For example: UTC, Etc/UTC, or Europe/London |  [optional] |
| **groupBy** | [**List<GroupByEnum>**](#Enum--GroupByEnum) | Behaves like a SQL GROUPBY. Allows for multiple levels of grouping as a list of dimensions. Partitions resulting computations into distinct named subgroups rather than across the entire result set as if it were one group. |  [optional] |
| **filter** | [**SocialMediaQueryFilter**](SocialMediaQueryFilter) | Behaves like a SQL WHERE clause. This is ANDed with the interval parameter. Expresses boolean logical predicates as well as dimensional filters |  [optional] |
| **metrics** | [**List<MetricsEnum>**](#Enum--MetricsEnum) | Behaves like a SQL SELECT clause. Only named metrics will be retrieved. |  |
| **pageSize** | **Integer** | The number of results per page |  [optional] |


## Enum: GroupByEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| COUNTRY | &quot;country&quot; |
| LANGUAGE | &quot;language&quot; |
| PLATFORM | &quot;platform&quot; |
| TOPIC | &quot;topic&quot; |
| ESCALATIONSTATUS | &quot;escalationStatus&quot; |
| MESSAGECONTENTTYPE | &quot;messageContentType&quot; |
| SENTIMENT | &quot;sentiment&quot; |
| DATAINGESTIONRULE | &quot;dataIngestionRule&quot; |
| TEXT | &quot;text&quot; |
| MODERATIONFLAG | &quot;moderationFlag&quot; |


## Enum: MetricsEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| NSOCIALPOSTS | &quot;nSocialPosts&quot; |
| OSOCIALAUTHORS | &quot;oSocialAuthors&quot; |
| OSOCIALSENTIMENT | &quot;oSocialSentiment&quot; |
| OSOCIALENGAGEMENT | &quot;oSocialEngagement&quot; |
| NSOCIALREVIEWRATING | &quot;nSocialReviewRating&quot; |




_com.mypurecloud.sdk.v2:platform-client-v2:231.0.0_
