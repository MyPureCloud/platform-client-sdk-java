package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.NumericRange;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * AnalyticsQueryPredicate
 */

public class AnalyticsQueryPredicate  implements Serializable {
  

  /**
   * Optional type, can usually be inferred
   */
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    DIMENSION("dimension"),
    PROPERTY("property"),
    METRIC("metric");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static TypeEnum fromString(String key) {
      if (key == null) return null;

      for (TypeEnum value : TypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return TypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private TypeEnum type = null;

  /**
   * Left hand side for dimension predicates
   */
  public enum DimensionEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
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

    DimensionEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static DimensionEnum fromString(String key) {
      if (key == null) return null;

      for (DimensionEnum value : DimensionEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return DimensionEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private DimensionEnum dimension = null;

  /**
   * Left hand side for property predicates
   */
  public enum PropertyTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    BOOL("bool"),
    INTEGER("integer"),
    REAL("real"),
    DATE("date"),
    STRING("string"),
    UUID("uuid");

    private String value;

    PropertyTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static PropertyTypeEnum fromString(String key) {
      if (key == null) return null;

      for (PropertyTypeEnum value : PropertyTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return PropertyTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private PropertyTypeEnum propertyType = null;
  private String property = null;

  /**
   * Left hand side for metric predicates
   */
  public enum MetricEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
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

    MetricEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static MetricEnum fromString(String key) {
      if (key == null) return null;

      for (MetricEnum value : MetricEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return MetricEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private MetricEnum metric = null;

  /**
   * Optional operator, default is matches
   */
  public enum OperatorEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    MATCHES("matches"),
    EXISTS("exists"),
    NOTEXISTS("notExists");

    private String value;

    OperatorEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static OperatorEnum fromString(String key) {
      if (key == null) return null;

      for (OperatorEnum value : OperatorEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return OperatorEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private OperatorEnum operator = null;
  private String value = null;
  private NumericRange range = null;

  
  /**
   * Optional type, can usually be inferred
   **/
  public AnalyticsQueryPredicate type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Optional type, can usually be inferred")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  
  /**
   * Left hand side for dimension predicates
   **/
  public AnalyticsQueryPredicate dimension(DimensionEnum dimension) {
    this.dimension = dimension;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Left hand side for dimension predicates")
  @JsonProperty("dimension")
  public DimensionEnum getDimension() {
    return dimension;
  }
  public void setDimension(DimensionEnum dimension) {
    this.dimension = dimension;
  }

  
  /**
   * Left hand side for property predicates
   **/
  public AnalyticsQueryPredicate propertyType(PropertyTypeEnum propertyType) {
    this.propertyType = propertyType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Left hand side for property predicates")
  @JsonProperty("propertyType")
  public PropertyTypeEnum getPropertyType() {
    return propertyType;
  }
  public void setPropertyType(PropertyTypeEnum propertyType) {
    this.propertyType = propertyType;
  }

  
  /**
   * Left hand side for property predicates
   **/
  public AnalyticsQueryPredicate property(String property) {
    this.property = property;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Left hand side for property predicates")
  @JsonProperty("property")
  public String getProperty() {
    return property;
  }
  public void setProperty(String property) {
    this.property = property;
  }

  
  /**
   * Left hand side for metric predicates
   **/
  public AnalyticsQueryPredicate metric(MetricEnum metric) {
    this.metric = metric;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Left hand side for metric predicates")
  @JsonProperty("metric")
  public MetricEnum getMetric() {
    return metric;
  }
  public void setMetric(MetricEnum metric) {
    this.metric = metric;
  }

  
  /**
   * Optional operator, default is matches
   **/
  public AnalyticsQueryPredicate operator(OperatorEnum operator) {
    this.operator = operator;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Optional operator, default is matches")
  @JsonProperty("operator")
  public OperatorEnum getOperator() {
    return operator;
  }
  public void setOperator(OperatorEnum operator) {
    this.operator = operator;
  }

  
  /**
   * Right hand side for dimension, property, or metric predicates
   **/
  public AnalyticsQueryPredicate value(String value) {
    this.value = value;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Right hand side for dimension, property, or metric predicates")
  @JsonProperty("value")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }

  
  /**
   * Right hand side for property or metric predicates
   **/
  public AnalyticsQueryPredicate range(NumericRange range) {
    this.range = range;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Right hand side for property or metric predicates")
  @JsonProperty("range")
  public NumericRange getRange() {
    return range;
  }
  public void setRange(NumericRange range) {
    this.range = range;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsQueryPredicate analyticsQueryPredicate = (AnalyticsQueryPredicate) o;
    return Objects.equals(this.type, analyticsQueryPredicate.type) &&
        Objects.equals(this.dimension, analyticsQueryPredicate.dimension) &&
        Objects.equals(this.propertyType, analyticsQueryPredicate.propertyType) &&
        Objects.equals(this.property, analyticsQueryPredicate.property) &&
        Objects.equals(this.metric, analyticsQueryPredicate.metric) &&
        Objects.equals(this.operator, analyticsQueryPredicate.operator) &&
        Objects.equals(this.value, analyticsQueryPredicate.value) &&
        Objects.equals(this.range, analyticsQueryPredicate.range);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, dimension, propertyType, property, metric, operator, value, range);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsQueryPredicate {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    dimension: ").append(toIndentedString(dimension)).append("\n");
    sb.append("    propertyType: ").append(toIndentedString(propertyType)).append("\n");
    sb.append("    property: ").append(toIndentedString(property)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    range: ").append(toIndentedString(range)).append("\n");
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

