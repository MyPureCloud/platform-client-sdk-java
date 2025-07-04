# SurveyAsyncAggregationQuery


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **interval** | **String** | Behaves like one clause in a SQL WHERE. Specifies the date and time range of data being queried. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss |  |
| **granularity** | **String** | Granularity aggregates metrics into subpartitions within the time interval specified. The default granularity is the same duration as the interval. Periods are represented as an ISO-8601 string. For example: P1D or P1DT12H |  [optional] |
| **timeZone** | **String** | Time zone context used to calculate response intervals (this allows resolving DST changes). The interval offset is used even when timeZone is specified. Default is UTC. Time zones are represented as a string of the zone name as found in the IANA time zone database. For example: UTC, Etc/UTC, or Europe/London |  [optional] |
| **groupBy** | [**List<GroupByEnum>**](#Enum--GroupByEnum) | Behaves like a SQL GROUPBY. Allows for multiple levels of grouping as a list of dimensions. Partitions resulting aggregate computations into distinct named subgroups rather than across the entire result set as if it were one group. |  [optional] |
| **filter** | [**SurveyAggregateQueryFilter**](SurveyAggregateQueryFilter) | Behaves like a SQL WHERE clause. This is ANDed with the interval parameter. Expresses boolean logical predicates as well as dimensional filters |  [optional] |
| **metrics** | [**List<MetricsEnum>**](#Enum--MetricsEnum) | Behaves like a SQL SELECT clause. Only named metrics will be retrieved. |  |
| **flattenMultivaluedDimensions** | **Boolean** | Flattens any multivalued dimensions used in response groups (e.g. ['a','b','c']->'a,b,c') |  [optional] |
| **views** | [**List&lt;SurveyAggregationView&gt;**](SurveyAggregationView) | Custom derived metric views |  [optional] |
| **alternateTimeDimension** | [**AlternateTimeDimensionEnum**](#Enum--AlternateTimeDimensionEnum) | Dimension to use as the alternative timestamp for data in the aggregate.  Choosing \"eventTime\" uses the actual time of the data event. |  [optional] |
| **pageSize** | **Integer** | The number of results per page |  [optional] |


## Enum: GroupByEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| CONVERSATIONID | &quot;conversationId&quot; |
| DIVISIONID | &quot;divisionId&quot; |
| EXTERNALCONTACTID | &quot;externalContactId&quot; |
| MEDIATYPE | &quot;mediaType&quot; |
| QUEUEID | &quot;queueId&quot; |
| REQUESTEDLANGUAGEID | &quot;requestedLanguageId&quot; |
| REQUESTEDROUTINGSKILLID | &quot;requestedRoutingSkillId&quot; |
| SURVEYANSWERID | &quot;surveyAnswerId&quot; |
| SURVEYERRORREASON | &quot;surveyErrorReason&quot; |
| SURVEYFORMCONTEXTID | &quot;surveyFormContextId&quot; |
| SURVEYFORMID | &quot;surveyFormId&quot; |
| SURVEYFORMNAME | &quot;surveyFormName&quot; |
| SURVEYID | &quot;surveyId&quot; |
| SURVEYPARTIALRESPONSE | &quot;surveyPartialResponse&quot; |
| SURVEYPREVIOUSSTATUS | &quot;surveyPreviousStatus&quot; |
| SURVEYPROMOTERSCORE | &quot;surveyPromoterScore&quot; |
| SURVEYQUESTIONGROUPID | &quot;surveyQuestionGroupId&quot; |
| SURVEYQUESTIONID | &quot;surveyQuestionId&quot; |
| SURVEYSTATUS | &quot;surveyStatus&quot; |
| SURVEYTYPE | &quot;surveyType&quot; |
| TEAMID | &quot;teamId&quot; |
| USERID | &quot;userId&quot; |
| WRAPUPCODE | &quot;wrapUpCode&quot; |


## Enum: MetricsEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| NSURVEYERRORS | &quot;nSurveyErrors&quot; |
| NSURVEYFULLRESPONSES | &quot;nSurveyFullResponses&quot; |
| NSURVEYNPSDETRACTORS | &quot;nSurveyNpsDetractors&quot; |
| NSURVEYNPSPROMOTERS | &quot;nSurveyNpsPromoters&quot; |
| NSURVEYNPSRESPONSES | &quot;nSurveyNpsResponses&quot; |
| NSURVEYPARTIALRESPONSES | &quot;nSurveyPartialResponses&quot; |
| NSURVEYQUESTIONGROUPRESPONSES | &quot;nSurveyQuestionGroupResponses&quot; |
| NSURVEYQUESTIONRESPONSES | &quot;nSurveyQuestionResponses&quot; |
| NSURVEYRESPONSES | &quot;nSurveyResponses&quot; |
| NSURVEYSABANDONED | &quot;nSurveysAbandoned&quot; |
| NSURVEYSDELETED | &quot;nSurveysDeleted&quot; |
| NSURVEYSEXPIRED | &quot;nSurveysExpired&quot; |
| NSURVEYSSENT | &quot;nSurveysSent&quot; |
| NSURVEYSSTARTED | &quot;nSurveysStarted&quot; |
| NVOICESURVEYS | &quot;nVoiceSurveys&quot; |
| NWEBSURVEYS | &quot;nWebSurveys&quot; |
| OSURVEYQUESTIONGROUPSCORE | &quot;oSurveyQuestionGroupScore&quot; |
| OSURVEYQUESTIONSCORE | &quot;oSurveyQuestionScore&quot; |
| OSURVEYTOTALSCORE | &quot;oSurveyTotalScore&quot; |


## Enum: AlternateTimeDimensionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| EVENTTIME | &quot;eventTime&quot; | 
| SURVEYCREATEDDATE | &quot;surveyCreatedDate&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
