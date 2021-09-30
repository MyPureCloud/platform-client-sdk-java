package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.Objects;
import java.io.IOException;
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
  

  private static class TypeEnumDeserializer extends StdDeserializer<TypeEnum> {
    public TypeEnumDeserializer() {
      super(TypeEnumDeserializer.class);
    }

    @Override
    public TypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return TypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Optional type, can usually be inferred
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
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

  private static class DimensionEnumDeserializer extends StdDeserializer<DimensionEnum> {
    public DimensionEnumDeserializer() {
      super(DimensionEnumDeserializer.class);
    }

    @Override
    public DimensionEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return DimensionEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Left hand side for dimension predicates
   */
 @JsonDeserialize(using = DimensionEnumDeserializer.class)
  public enum DimensionEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ADDRESSFROM("addressFrom"),
    ADDRESSTO("addressTo"),
    AGENTASSISTANTID("agentAssistantId"),
    AGENTOWNED("agentOwned"),
    ANI("ani"),
    AUTHENTICATED("authenticated"),
    CALLBACKNUMBER("callbackNumber"),
    CALLBACKSCHEDULEDTIME("callbackScheduledTime"),
    COACHEDPARTICIPANTID("coachedParticipantId"),
    CONFERENCE("conference"),
    DELIVERYSTATUS("deliveryStatus"),
    DESTINATIONADDRESS("destinationAddress"),
    DESTINATIONCONVERSATIONID("destinationConversationId"),
    DIRECTION("direction"),
    DISCONNECTTYPE("disconnectType"),
    DNIS("dnis"),
    EDGEID("edgeId"),
    ERRORCODE("errorCode"),
    EXITREASON("exitReason"),
    EXTERNALCONTACTID("externalContactId"),
    EXTERNALORGANIZATIONID("externalOrganizationId"),
    FLAGGEDREASON("flaggedReason"),
    FLOWID("flowId"),
    FLOWNAME("flowName"),
    FLOWOUTTYPE("flowOutType"),
    FLOWOUTCOME("flowOutcome"),
    FLOWOUTCOMEID("flowOutcomeId"),
    FLOWOUTCOMEVALUE("flowOutcomeValue"),
    FLOWVERSION("flowVersion"),
    GROUPID("groupId"),
    JOURNEYACTIONID("journeyActionId"),
    JOURNEYACTIONMAPID("journeyActionMapId"),
    JOURNEYCUSTOMERID("journeyCustomerId"),
    JOURNEYCUSTOMERIDTYPE("journeyCustomerIdType"),
    JOURNEYCUSTOMERSESSIONID("journeyCustomerSessionId"),
    MEDIACOUNT("mediaCount"),
    MEDIATYPE("mediaType"),
    MESSAGETYPE("messageType"),
    MONITOREDPARTICIPANTID("monitoredParticipantId"),
    OUTBOUNDCAMPAIGNID("outboundCampaignId"),
    OUTBOUNDCONTACTID("outboundContactId"),
    OUTBOUNDCONTACTLISTID("outboundContactListId"),
    PARTICIPANTNAME("participantName"),
    PROTOCOLCALLID("protocolCallId"),
    PROVIDER("provider"),
    PURPOSE("purpose"),
    QUEUEID("queueId"),
    RECORDING("recording"),
    REMOTE("remote"),
    REMOTENAMEDISPLAYABLE("remoteNameDisplayable"),
    REQUESTEDLANGUAGEID("requestedLanguageId"),
    REQUESTEDROUTING("requestedRouting"),
    REQUESTEDROUTINGSKILLID("requestedRoutingSkillId"),
    SCOREDAGENTID("scoredAgentId"),
    SCRIPTID("scriptId"),
    SEGMENTEND("segmentEnd"),
    SEGMENTTYPE("segmentType"),
    SESSIONDNIS("sessionDnis"),
    SIPRESPONSECODE("sipResponseCode"),
    SUBJECT("subject"),
    TEAMID("teamId"),
    TRANSFERTARGETADDRESS("transferTargetAddress"),
    TRANSFERTARGETNAME("transferTargetName"),
    TRANSFERTYPE("transferType"),
    USEDROUTING("usedRouting"),
    USERID("userId"),
    WRAPUPCODE("wrapUpCode"),
    WRAPUPNOTE("wrapUpNote");

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

  private static class PropertyTypeEnumDeserializer extends StdDeserializer<PropertyTypeEnum> {
    public PropertyTypeEnumDeserializer() {
      super(PropertyTypeEnumDeserializer.class);
    }

    @Override
    public PropertyTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return PropertyTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Left hand side for property predicates
   */
 @JsonDeserialize(using = PropertyTypeEnumDeserializer.class)
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

  private static class MetricEnumDeserializer extends StdDeserializer<MetricEnum> {
    public MetricEnumDeserializer() {
      super(MetricEnumDeserializer.class);
    }

    @Override
    public MetricEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return MetricEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Left hand side for metric predicates
   */
 @JsonDeserialize(using = MetricEnumDeserializer.class)
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

  private static class OperatorEnumDeserializer extends StdDeserializer<OperatorEnum> {
    public OperatorEnumDeserializer() {
      super(OperatorEnumDeserializer.class);
    }

    @Override
    public OperatorEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return OperatorEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Optional operator, default is matches
   */
 @JsonDeserialize(using = OperatorEnumDeserializer.class)
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

