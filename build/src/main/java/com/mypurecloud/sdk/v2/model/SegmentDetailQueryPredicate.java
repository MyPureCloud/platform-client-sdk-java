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
 * SegmentDetailQueryPredicate
 */

public class SegmentDetailQueryPredicate  implements Serializable {
  

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
    ADDRESSFROM("addressFrom"),
    ADDRESSOTHER("addressOther"),
    ADDRESSSELF("addressSelf"),
    ADDRESSTO("addressTo"),
    AGENTSCORE("agentScore"),
    ANI("ani"),
    AUDIOMUTED("audioMuted"),
    CALLBACKNUMBER("callbackNumber"),
    CALLBACKSCHEDULEDTIME("callbackScheduledTime"),
    CALLBACKUSERNAME("callbackUserName"),
    COBROWSEROLE("cobrowseRole"),
    COBROWSEROOMID("cobrowseRoomId"),
    CONFERENCE("conference"),
    DESTINATIONCONVERSATIONID("destinationConversationId"),
    DESTINATIONSESSIONID("destinationSessionId"),
    DIRECTION("direction"),
    DISCONNECTTYPE("disconnectType"),
    DISPOSITIONANALYZER("dispositionAnalyzer"),
    DISPOSITIONNAME("dispositionName"),
    DNIS("dnis"),
    EDGEID("edgeId"),
    ENDINGLANGUAGE("endingLanguage"),
    ENTRYREASON("entryReason"),
    ENTRYTYPE("entryType"),
    ERRORCODE("errorCode"),
    EXITREASON("exitReason"),
    EXTERNALCONTACTID("externalContactId"),
    EXTERNALORGANIZATIONID("externalOrganizationId"),
    FLAGGEDREASON("flaggedReason"),
    FLOWID("flowId"),
    FLOWNAME("flowName"),
    FLOWOUTCOME("flowOutcome"),
    FLOWOUTCOMEENDTIMESTAMP("flowOutcomeEndTimestamp"),
    FLOWOUTCOMEID("flowOutcomeId"),
    FLOWOUTCOMESTARTTIMESTAMP("flowOutcomeStartTimestamp"),
    FLOWOUTCOMEVALUE("flowOutcomeValue"),
    FLOWTYPE("flowType"),
    FLOWVERSION("flowVersion"),
    GROUPID("groupId"),
    ISSUEDCALLBACK("issuedCallback"),
    JOURNEYACTIONID("journeyActionId"),
    JOURNEYACTIONMAPID("journeyActionMapId"),
    JOURNEYACTIONMAPVERSION("journeyActionMapVersion"),
    JOURNEYCUSTOMERID("journeyCustomerId"),
    JOURNEYCUSTOMERIDTYPE("journeyCustomerIdType"),
    JOURNEYCUSTOMERSESSIONID("journeyCustomerSessionId"),
    JOURNEYCUSTOMERSESSIONIDTYPE("journeyCustomerSessionIdType"),
    MEDIABRIDGEID("mediaBridgeId"),
    MEDIATYPE("mediaType"),
    MESSAGETYPE("messageType"),
    MONITOREDPARTICIPANTID("monitoredParticipantId"),
    OUTBOUNDCAMPAIGNID("outboundCampaignId"),
    OUTBOUNDCONTACTID("outboundContactId"),
    OUTBOUNDCONTACTLISTID("outboundContactListId"),
    PARTICIPANTID("participantId"),
    PARTICIPANTNAME("participantName"),
    PEERID("peerId"),
    PROTOCOLCALLID("protocolCallId"),
    PROVIDER("provider"),
    PURPOSE("purpose"),
    Q850RESPONSECODE("q850ResponseCode"),
    QUEUEID("queueId"),
    REMOTE("remote"),
    RECORDING("recording"),
    REMOTENAMEDISPLAYABLE("remoteNameDisplayable"),
    REQUESTEDLANGUAGEID("requestedLanguageId"),
    REQUESTEDROUTINGSKILLID("requestedRoutingSkillId"),
    REQUESTEDROUTINGUSERID("requestedRoutingUserId"),
    ROOMID("roomId"),
    SCOREDAGENTID("scoredAgentId"),
    SCREENSHAREADDRESSSELF("screenShareAddressSelf"),
    SCREENSHAREROOMID("screenShareRoomId"),
    SCRIPTID("scriptId"),
    SEGMENTEND("segmentEnd"),
    SEGMENTTYPE("segmentType"),
    SESSIONDNIS("sessionDnis"),
    SESSIONID("sessionId"),
    SHARINGSCREEN("sharingScreen"),
    SIPRESPONSECODE("sipResponseCode"),
    SKIPENABLED("skipEnabled"),
    SOURCECONVERSATIONID("sourceConversationId"),
    SOURCESESSIONID("sourceSessionId"),
    STARTINGLANGUAGE("startingLanguage"),
    SUBJECT("subject"),
    TIMEOUTSECONDS("timeoutSeconds"),
    TRANSFERTARGETADDRESS("transferTargetAddress"),
    TRANSFERTARGETNAME("transferTargetName"),
    TRANSFERTYPE("transferType"),
    USERID("userId"),
    VIDEOADDRESSSELF("videoAddressSelf"),
    VIDEOMUTED("videoMuted"),
    VIDEOROOMID("videoRoomId"),
    WRAPUPCODE("wrapUpCode"),
    WRAPUPNOTE("wrapUpNote"),
    WRAPUPTAG("wrapUpTag");

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
    TSEGMENTDURATION("tSegmentDuration");

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
  public SegmentDetailQueryPredicate type(TypeEnum type) {
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
  public SegmentDetailQueryPredicate dimension(DimensionEnum dimension) {
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
  public SegmentDetailQueryPredicate propertyType(PropertyTypeEnum propertyType) {
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
  public SegmentDetailQueryPredicate property(String property) {
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
  public SegmentDetailQueryPredicate metric(MetricEnum metric) {
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
  public SegmentDetailQueryPredicate operator(OperatorEnum operator) {
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
   * Right hand side for dimension, metric, or property predicates
   **/
  public SegmentDetailQueryPredicate value(String value) {
    this.value = value;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Right hand side for dimension, metric, or property predicates")
  @JsonProperty("value")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }

  
  /**
   * Right hand side for dimension, metric, or property predicates
   **/
  public SegmentDetailQueryPredicate range(NumericRange range) {
    this.range = range;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Right hand side for dimension, metric, or property predicates")
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
    SegmentDetailQueryPredicate segmentDetailQueryPredicate = (SegmentDetailQueryPredicate) o;
    return Objects.equals(this.type, segmentDetailQueryPredicate.type) &&
        Objects.equals(this.dimension, segmentDetailQueryPredicate.dimension) &&
        Objects.equals(this.propertyType, segmentDetailQueryPredicate.propertyType) &&
        Objects.equals(this.property, segmentDetailQueryPredicate.property) &&
        Objects.equals(this.metric, segmentDetailQueryPredicate.metric) &&
        Objects.equals(this.operator, segmentDetailQueryPredicate.operator) &&
        Objects.equals(this.value, segmentDetailQueryPredicate.value) &&
        Objects.equals(this.range, segmentDetailQueryPredicate.range);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, dimension, propertyType, property, metric, operator, value, range);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SegmentDetailQueryPredicate {\n");
    
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

