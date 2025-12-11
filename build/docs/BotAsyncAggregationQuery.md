# BotAsyncAggregationQuery


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **interval** | **String** | Behaves like one clause in a SQL WHERE. Specifies the date and time range of data being queried. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss |  |
| **granularity** | **String** | Granularity aggregates metrics into subpartitions within the time interval specified. The default granularity is the same duration as the interval. Periods are represented as an ISO-8601 string. For example: P1D or P1DT12H |  [optional] |
| **timeZone** | **String** | Time zone context used to calculate response intervals (this allows resolving DST changes). The interval offset is used even when timeZone is specified. Default is UTC. Time zones are represented as a string of the zone name as found in the IANA time zone database. For example: UTC, Etc/UTC, or Europe/London |  [optional] |
| **groupBy** | [**List<GroupByEnum>**](#Enum--GroupByEnum) | Behaves like a SQL GROUPBY. Allows for multiple levels of grouping as a list of dimensions. Partitions resulting aggregate computations into distinct named subgroups rather than across the entire result set as if it were one group. |  [optional] |
| **filter** | [**BotAggregateQueryFilter**](BotAggregateQueryFilter) | Behaves like a SQL WHERE clause. This is ANDed with the interval parameter. Expresses boolean logical predicates as well as dimensional filters |  [optional] |
| **metrics** | [**List<MetricsEnum>**](#Enum--MetricsEnum) | Behaves like a SQL SELECT clause. Only named metrics will be retrieved. |  |
| **flattenMultivaluedDimensions** | **Boolean** | Flattens any multivalued dimensions used in response groups (e.g. ['a','b','c']->'a,b,c') |  [optional] |
| **views** | [**List&lt;BotAggregationView&gt;**](BotAggregationView) | Custom derived metric views |  [optional] |
| **alternateTimeDimension** | [**AlternateTimeDimensionEnum**](#Enum--AlternateTimeDimensionEnum) | Dimension to use as the alternative timestamp for data in the aggregate.  Choosing \"eventTime\" uses the actual time of the data event. |  [optional] |
| **pageSize** | **Integer** | The number of results per page |  [optional] |


## Enum: GroupByEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| ASKACTIONID | &quot;askActionId&quot; |
| ASKACTIONRESULT | &quot;askActionResult&quot; |
| ASKACTIONTYPE | &quot;askActionType&quot; |
| BOTFINALINTENT | &quot;botFinalIntent&quot; |
| BOTFLOWSUBTYPE | &quot;botFlowSubType&quot; |
| BOTFLOWTYPE | &quot;botFlowType&quot; |
| BOTID | &quot;botId&quot; |
| BOTINTENT | &quot;botIntent&quot; |
| BOTNAME | &quot;botName&quot; |
| BOTPRODUCT | &quot;botProduct&quot; |
| BOTPROVIDER | &quot;botProvider&quot; |
| BOTRECOGNITIONFAILUREREASON | &quot;botRecognitionFailureReason&quot; |
| BOTRESULT | &quot;botResult&quot; |
| BOTSESSIONID | &quot;botSessionId&quot; |
| BOTSLOT | &quot;botSlot&quot; |
| BOTSLOTMECHANISM | &quot;botSlotMechanism&quot; |
| BOTVERSION | &quot;botVersion&quot; |
| CONVERSATIONID | &quot;conversationId&quot; |
| EXTERNALCONTACTID | &quot;externalContactId&quot; |
| INTERMEDIATEINTENTNAME | &quot;intermediateIntentName&quot; |
| KNOWLEDGEBASEID | &quot;knowledgeBaseId&quot; |
| LANGUAGECODE | &quot;languageCode&quot; |
| LASTACTIONID | &quot;lastActionId&quot; |
| LASTINPUTACTIONID | &quot;lastInputActionId&quot; |
| MEDIATYPE | &quot;mediaType&quot; |
| MESSAGETYPE | &quot;messageType&quot; |
| PREVIEWMODE | &quot;previewMode&quot; |
| SELFSERVED | &quot;selfServed&quot; |


## Enum: MetricsEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| NBOTSESSIONTURNS | &quot;nBotSessionTurns&quot; |
| NBOTSESSIONS | &quot;nBotSessions&quot; |
| OBOTINTENT | &quot;oBotIntent&quot; |
| OBOTSESSIONCOLLECTION | &quot;oBotSessionCollection&quot; |
| OBOTSESSIONCOLLECTIONSELFSERVED | &quot;oBotSessionCollectionSelfServed&quot; |
| OBOTSESSIONQUERY | &quot;oBotSessionQuery&quot; |
| OBOTSESSIONQUERYSELFSERVED | &quot;oBotSessionQuerySelfServed&quot; |
| OBOTSESSIONTURN | &quot;oBotSessionTurn&quot; |
| OBOTSLOT | &quot;oBotSlot&quot; |
| TBOTDISCONNECT | &quot;tBotDisconnect&quot; |
| TBOTEXIT | &quot;tBotExit&quot; |
| TBOTRECOGNITIONFAILURE | &quot;tBotRecognitionFailure&quot; |
| TBOTSESSION | &quot;tBotSession&quot; |


## Enum: AlternateTimeDimensionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| EVENTTIME | &quot;eventTime&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:240.0.0_
