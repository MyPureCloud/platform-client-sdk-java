package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.AnalyticsQueryFilter;
import com.mypurecloud.sdk.v2.model.AnalyticsView;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * AggregationQuery
 */

public class AggregationQuery  implements Serializable {
  
  private String interval = null;
  private String granularity = null;
  private String timeZone = null;

  /**
   * Gets or Sets groupBy
   */
  public enum GroupByEnum {
    CONVERSATIONID("conversationId"),
    SESSIONID("sessionId"),
    MEDIATYPE("mediaType"),
    QUEUEID("queueId"),
    USERID("userId"),
    PARTICIPANTID("participantId"),
    PARTICIPANTNAME("participantName"),
    DIRECTION("direction"),
    ORIGINATINGDIRECTION("originatingDirection"),
    WRAPUPCODE("wrapUpCode"),
    WRAPUPNOTE("wrapUpNote"),
    INTERACTIONTYPE("interactionType"),
    REQUESTEDROUTINGSKILLID("requestedRoutingSkillId"),
    REQUESTEDLANGUAGEID("requestedLanguageId"),
    REQUESTEDROUTINGUSERIDS("requestedRoutingUserIds"),
    ROUTINGPRIORITY("routingPriority"),
    SCOREDAGENTID("scoredAgentId"),
    AGENTSCORE("agentScore"),
    PURPOSE("purpose"),
    PARTICIPANTTYPE("participantType"),
    SEGMENTTYPE("segmentType"),
    DISCONNECTTYPE("disconnectType"),
    ERRORCODE("errorCode"),
    CONVERSATIONEND("conversationEnd"),
    SEGMENTEND("segmentEnd"),
    EXTERNALCONTACTID("externalContactId"),
    EXTERNALORGANIZATIONID("externalOrganizationId"),
    CONVERTEDFROM("convertedFrom"),
    CONVERTEDTO("convertedTo"),
    DIVISIONID("divisionId"),
    FLAGGEDREASON("flaggedReason"),
    PROVIDER("provider"),
    STATIONID("stationId"),
    EDGEID("edgeId"),
    DNIS("dnis"),
    ANI("ani"),
    SESSIONDNIS("sessionDnis"),
    OUTBOUNDCAMPAIGNID("outboundCampaignId"),
    OUTBOUNDCONTACTID("outboundContactId"),
    OUTBOUNDCONTACTLISTID("outboundContactListId"),
    MONITOREDPARTICIPANTID("monitoredParticipantId"),
    SOURCESESSIONID("sourceSessionId"),
    DESTINATIONSESSIONID("destinationSessionId"),
    SOURCECONVERSATIONID("sourceConversationId"),
    DESTINATIONCONVERSATIONID("destinationConversationId"),
    REMOTENAMEDISPLAYABLE("remoteNameDisplayable"),
    SIPRESPONSECODE("sipResponseCode"),
    Q850RESPONSECODE("q850ResponseCode"),
    CONFERENCE("conference"),
    GROUPID("groupId"),
    PROTOCOLCALLID("protocolCallId"),
    ROOMID("roomId"),
    ADDRESSFROM("addressFrom"),
    ADDRESSTO("addressTo"),
    ADDRESSSELF("addressSelf"),
    ADDRESSOTHER("addressOther"),
    SUBJECT("subject"),
    MESSAGETYPE("messageType"),
    PEERID("peerId"),
    SCRIPTID("scriptId"),
    EVALUATIONID("evaluationId"),
    EVALUATORID("evaluatorId"),
    CONTEXTID("contextId"),
    FORMID("formId"),
    FORMNAME("formName"),
    EVENTTIME("eventTime"),
    CALIBRATIONID("calibrationId"),
    SURVEYID("surveyId"),
    SURVEYFORMCONTEXTID("surveyFormContextId"),
    SURVEYFORMID("surveyFormId"),
    SURVEYFORMNAME("surveyFormName"),
    SURVEYANSWERID("surveyAnswerId"),
    SURVEYQUESTIONID("surveyQuestionId"),
    SURVEYQUESTIONGROUPID("surveyQuestionGroupId"),
    SURVEYPROMOTERSCORE("surveyPromoterScore"),
    SURVEYCOMPLETEDDATE("surveyCompletedDate"),
    SURVEYERRORREASON("surveyErrorReason"),
    SURVEYPREVIOUSSTATUS("surveyPreviousStatus"),
    SURVEYSTATUS("surveyStatus"),
    SYSTEMPRESENCE("systemPresence"),
    ORGANIZATIONPRESENCEID("organizationPresenceId"),
    ROUTINGSTATUS("routingStatus"),
    FLOWID("flowId"),
    FLOWNAME("flowName"),
    FLOWVERSION("flowVersion"),
    FLOWTYPE("flowType"),
    EXITREASON("exitReason"),
    ENTRYREASON("entryReason"),
    ENTRYTYPE("entryType"),
    TRANSFERTYPE("transferType"),
    TRANSFERTARGETNAME("transferTargetName"),
    TRANSFERTARGETADDRESS("transferTargetAddress"),
    ISSUEDCALLBACK("issuedCallback"),
    STARTINGLANGUAGE("startingLanguage"),
    ENDINGLANGUAGE("endingLanguage"),
    FLOWOUTCOMEID("flowOutcomeId"),
    FLOWOUTCOMEVALUE("flowOutcomeValue"),
    FLOWOUTCOME("flowOutcome"),
    JOURNEYCUSTOMERID("journeyCustomerId"),
    JOURNEYCUSTOMERIDTYPE("journeyCustomerIdType"),
    JOURNEYCUSTOMERSESSIONID("journeyCustomerSessionId"),
    JOURNEYCUSTOMERSESSIONIDTYPE("journeyCustomerSessionIdType"),
    JOURNEYACTIONID("journeyActionId"),
    JOURNEYACTIONMAPID("journeyActionMapId"),
    JOURNEYACTIONMAPVERSION("journeyActionMapVersion"),
    MINMOS("minMos"),
    MEDIASTATSMINCONVERSATIONMOS("mediaStatsMinConversationMos"),
    MINRFACTOR("minRFactor"),
    MEDIASTATSMINCONVERSATIONRFACTOR("mediaStatsMinConversationRFactor");

    private String value;

    GroupByEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static GroupByEnum fromString(String key) {
      if (key == null) return null;

      for (GroupByEnum value : GroupByEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return GroupByEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<GroupByEnum> groupBy = new ArrayList<GroupByEnum>();
  private AnalyticsQueryFilter filter = null;

  /**
   * Gets or Sets metrics
   */
  public enum MetricsEnum {
    TSEGMENTDURATION("tSegmentDuration"),
    TCONVERSATIONDURATION("tConversationDuration"),
    OTOTALCRITICALSCORE("oTotalCriticalScore"),
    OTOTALSCORE("oTotalScore"),
    NEVALUATIONS("nEvaluations"),
    TABANDON("tAbandon"),
    TIVR("tIvr"),
    TANSWERED("tAnswered"),
    TFLOWOUT("tFlowOut"),
    TACD("tAcd"),
    TTALK("tTalk"),
    THELD("tHeld"),
    TTALKCOMPLETE("tTalkComplete"),
    THELDCOMPLETE("tHeldComplete"),
    TACW("tAcw"),
    THANDLE("tHandle"),
    TCONTACTING("tContacting"),
    TDIALING("tDialing"),
    TWAIT("tWait"),
    TAGENTROUTINGSTATUS("tAgentRoutingStatus"),
    TORGANIZATIONPRESENCE("tOrganizationPresence"),
    TSYSTEMPRESENCE("tSystemPresence"),
    TUSERRESPONSETIME("tUserResponseTime"),
    TAGENTRESPONSETIME("tAgentResponseTime"),
    TVOICEMAIL("tVoicemail"),
    NSTATETRANSITIONERROR("nStateTransitionError"),
    NOFFERED("nOffered"),
    NOVERSLA("nOverSla"),
    NTRANSFERRED("nTransferred"),
    NBLINDTRANSFERRED("nBlindTransferred"),
    NCONSULTTRANSFERRED("nConsultTransferred"),
    NCONSULT("nConsult"),
    NCONNECTED("nConnected"),
    TALERT("tAlert"),
    TNOTRESPONDING("tNotResponding"),
    NOUTBOUND("nOutbound"),
    NOUTBOUNDATTEMPTED("nOutboundAttempted"),
    NOUTBOUNDCONNECTED("nOutboundConnected"),
    NOUTBOUNDABANDONED("nOutboundAbandoned"),
    NERROR("nError"),
    OSERVICETARGET("oServiceTarget"),
    OSERVICELEVEL("oServiceLevel"),
    TACTIVE("tActive"),
    TINACTIVE("tInactive"),
    OACTIVEUSERS("oActiveUsers"),
    OMEMBERUSERS("oMemberUsers"),
    OACTIVEQUEUES("oActiveQueues"),
    OMEMBERQUEUES("oMemberQueues"),
    OINTERACTING("oInteracting"),
    OWAITING("oWaiting"),
    OONQUEUEUSERS("oOnQueueUsers"),
    OOFFQUEUEUSERS("oOffQueueUsers"),
    OUSERPRESENCES("oUserPresences"),
    OUSERROUTINGSTATUSES("oUserRoutingStatuses"),
    NSURVEYSSENT("nSurveysSent"),
    NSURVEYSSTARTED("nSurveysStarted"),
    NSURVEYSABANDONED("nSurveysAbandoned"),
    NSURVEYSEXPIRED("nSurveysExpired"),
    NSURVEYERRORS("nSurveyErrors"),
    NSURVEYRESPONSES("nSurveyResponses"),
    NSURVEYANSWERRESPONSES("nSurveyAnswerResponses"),
    OSURVEYTOTALSCORE("oSurveyTotalScore"),
    OSURVEYQUESTIONGROUPSCORE("oSurveyQuestionGroupScore"),
    NSURVEYQUESTIONGROUPRESPONSES("nSurveyQuestionGroupResponses"),
    OSURVEYQUESTIONSCORE("oSurveyQuestionScore"),
    NSURVEYQUESTIONRESPONSES("nSurveyQuestionResponses"),
    NSURVEYNPSRESPONSES("nSurveyNpsResponses"),
    NSURVEYNPSPROMOTERS("nSurveyNpsPromoters"),
    NSURVEYNPSDETRACTORS("nSurveyNpsDetractors"),
    NFLOW("nFlow"),
    TFLOWDISCONNECT("tFlowDisconnect"),
    TFLOWEXIT("tFlowExit"),
    TFLOW("tFlow"),
    OFLOW("oFlow"),
    TFLOWOUTCOME("tFlowOutcome"),
    NFLOWOUTCOME("nFlowOutcome"),
    NFLOWOUTCOMEFAILED("nFlowOutcomeFailed");

    private String value;

    MetricsEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static MetricsEnum fromString(String key) {
      if (key == null) return null;

      for (MetricsEnum value : MetricsEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return MetricsEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<MetricsEnum> metrics = new ArrayList<MetricsEnum>();
  private Boolean flattenMultivaluedDimensions = null;
  private List<AnalyticsView> views = new ArrayList<AnalyticsView>();

  
  /**
   * Behaves like one clause in a SQL WHERE. Specifies the date and time range of data being queried. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss
   **/
  public AggregationQuery interval(String interval) {
    this.interval = interval;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Behaves like one clause in a SQL WHERE. Specifies the date and time range of data being queried. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss")
  @JsonProperty("interval")
  public String getInterval() {
    return interval;
  }
  public void setInterval(String interval) {
    this.interval = interval;
  }

  
  /**
   * Granularity aggregates metrics into subpartitions within the time interval specified. The default granularity is the same duration as the interval. Periods are represented as an ISO-8601 string. For example: P1D or P1DT12H
   **/
  public AggregationQuery granularity(String granularity) {
    this.granularity = granularity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Granularity aggregates metrics into subpartitions within the time interval specified. The default granularity is the same duration as the interval. Periods are represented as an ISO-8601 string. For example: P1D or P1DT12H")
  @JsonProperty("granularity")
  public String getGranularity() {
    return granularity;
  }
  public void setGranularity(String granularity) {
    this.granularity = granularity;
  }

  
  /**
   * Sets the time zone for the query interval, defaults to UTC. Time zones are represented as a string of the zone name as found in the IANA time zone database. For example: UTC, Etc/UTC, or Europe/London
   **/
  public AggregationQuery timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Sets the time zone for the query interval, defaults to UTC. Time zones are represented as a string of the zone name as found in the IANA time zone database. For example: UTC, Etc/UTC, or Europe/London")
  @JsonProperty("timeZone")
  public String getTimeZone() {
    return timeZone;
  }
  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }

  
  /**
   * Behaves like a SQL GROUPBY. Allows for multiple levels of grouping as a list of dimensions. Partitions resulting aggregate computations into distinct named subgroups rather than across the entire result set as if it were one group.
   **/
  public AggregationQuery groupBy(List<GroupByEnum> groupBy) {
    this.groupBy = groupBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Behaves like a SQL GROUPBY. Allows for multiple levels of grouping as a list of dimensions. Partitions resulting aggregate computations into distinct named subgroups rather than across the entire result set as if it were one group.")
  @JsonProperty("groupBy")
  public List<GroupByEnum> getGroupBy() {
    return groupBy;
  }
  public void setGroupBy(List<GroupByEnum> groupBy) {
    this.groupBy = groupBy;
  }

  
  /**
   * Behaves like a SQL WHERE clause. This is ANDed with the interval parameter. Expresses boolean logical predicates as well as dimensional filters
   **/
  public AggregationQuery filter(AnalyticsQueryFilter filter) {
    this.filter = filter;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Behaves like a SQL WHERE clause. This is ANDed with the interval parameter. Expresses boolean logical predicates as well as dimensional filters")
  @JsonProperty("filter")
  public AnalyticsQueryFilter getFilter() {
    return filter;
  }
  public void setFilter(AnalyticsQueryFilter filter) {
    this.filter = filter;
  }

  
  /**
   * Behaves like a SQL SELECT clause. Enables retrieving only named metrics. If omitted, all metrics that are available will be returned (like SELECT *).
   **/
  public AggregationQuery metrics(List<MetricsEnum> metrics) {
    this.metrics = metrics;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Behaves like a SQL SELECT clause. Enables retrieving only named metrics. If omitted, all metrics that are available will be returned (like SELECT *).")
  @JsonProperty("metrics")
  public List<MetricsEnum> getMetrics() {
    return metrics;
  }
  public void setMetrics(List<MetricsEnum> metrics) {
    this.metrics = metrics;
  }

  
  /**
   * Flattens any multivalued dimensions used in response groups (e.g. ['a','b','c']->'a,b,c')
   **/
  public AggregationQuery flattenMultivaluedDimensions(Boolean flattenMultivaluedDimensions) {
    this.flattenMultivaluedDimensions = flattenMultivaluedDimensions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Flattens any multivalued dimensions used in response groups (e.g. ['a','b','c']->'a,b,c')")
  @JsonProperty("flattenMultivaluedDimensions")
  public Boolean getFlattenMultivaluedDimensions() {
    return flattenMultivaluedDimensions;
  }
  public void setFlattenMultivaluedDimensions(Boolean flattenMultivaluedDimensions) {
    this.flattenMultivaluedDimensions = flattenMultivaluedDimensions;
  }

  
  /**
   * Custom derived metric views
   **/
  public AggregationQuery views(List<AnalyticsView> views) {
    this.views = views;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Custom derived metric views")
  @JsonProperty("views")
  public List<AnalyticsView> getViews() {
    return views;
  }
  public void setViews(List<AnalyticsView> views) {
    this.views = views;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AggregationQuery aggregationQuery = (AggregationQuery) o;
    return Objects.equals(this.interval, aggregationQuery.interval) &&
        Objects.equals(this.granularity, aggregationQuery.granularity) &&
        Objects.equals(this.timeZone, aggregationQuery.timeZone) &&
        Objects.equals(this.groupBy, aggregationQuery.groupBy) &&
        Objects.equals(this.filter, aggregationQuery.filter) &&
        Objects.equals(this.metrics, aggregationQuery.metrics) &&
        Objects.equals(this.flattenMultivaluedDimensions, aggregationQuery.flattenMultivaluedDimensions) &&
        Objects.equals(this.views, aggregationQuery.views);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interval, granularity, timeZone, groupBy, filter, metrics, flattenMultivaluedDimensions, views);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AggregationQuery {\n");
    
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    granularity: ").append(toIndentedString(granularity)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    flattenMultivaluedDimensions: ").append(toIndentedString(flattenMultivaluedDimensions)).append("\n");
    sb.append("    views: ").append(toIndentedString(views)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

