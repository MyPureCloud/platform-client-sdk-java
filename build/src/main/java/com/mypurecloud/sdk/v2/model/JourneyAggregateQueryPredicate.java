package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.Objects;
import java.util.ArrayList;
import java.io.IOException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.NumericRange;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * JourneyAggregateQueryPredicate
 */

public class JourneyAggregateQueryPredicate  implements Serializable {
  

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
    CONTAINSALLCONDITION("containsAllCondition"),
    CONTAINSANYCONDITION("containsAnyCondition"),
    ENDSWITHCONDITION("endsWithCondition"),
    EQUALCONDITION("equalCondition"),
    JOURNEYACTIONID("journeyActionId"),
    JOURNEYACTIONMAPID("journeyActionMapId"),
    JOURNEYACTIONMAPVERSION("journeyActionMapVersion"),
    JOURNEYACTIONMEDIATYPE("journeyActionMediaType"),
    JOURNEYACTIONTARGETID("journeyActionTargetId"),
    JOURNEYACTIONTEMPLATEID("journeyActionTemplateId"),
    JOURNEYBLOCKINGACTIONMAPID("journeyBlockingActionMapId"),
    JOURNEYBLOCKINGEMERGENCYSCHEDULEGROUPID("journeyBlockingEmergencyScheduleGroupId"),
    JOURNEYBLOCKINGREASON("journeyBlockingReason"),
    JOURNEYBLOCKINGSCHEDULEGROUPID("journeyBlockingScheduleGroupId"),
    JOURNEYDEVICECATEGORY("journeyDeviceCategory"),
    JOURNEYDEVICETYPE("journeyDeviceType"),
    JOURNEYFREQUENCYCAPREASON("journeyFrequencyCapReason"),
    JOURNEYIPGEOLOCATIONCOUNTRY("journeyIpGeolocationCountry"),
    JOURNEYOUTCOMEID("journeyOutcomeId"),
    JOURNEYSEGMENTASSIGNMENTSTATE("journeySegmentAssignmentState"),
    JOURNEYSEGMENTID("journeySegmentId"),
    JOURNEYSESSIONID("journeySessionId"),
    JOURNEYSESSIONSEGMENTID("journeySessionSegmentId"),
    JOURNEYSESSIONTYPE("journeySessionType"),
    NOTCONTAINSALLCONDITION("notContainsAllCondition"),
    NOTCONTAINSANYCONDITION("notContainsAnyCondition"),
    NOTEQUALCONDITION("notEqualCondition"),
    STARTSWITHCONDITION("startsWithCondition"),
    TOUCHPOINTACTIONMAPID("touchpointActionMapId"),
    TOUCHPOINTAGENTID("touchpointAgentId"),
    TOUCHPOINTATTRIBUTIONSCOPE("touchpointAttributionScope"),
    TOUCHPOINTCHANNELMESSAGETYPE("touchpointChannelMessageType"),
    TOUCHPOINTCHANNELPLATFORM("touchpointChannelPlatform"),
    TOUCHPOINTCHANNELTYPE("touchpointChannelType"),
    TOUCHPOINTCONVERSATIONID("touchpointConversationId"),
    TOUCHPOINTINTERACTIONTYPE("touchpointInteractionType"),
    TOUCHPOINTQUEUEID("touchpointQueueId"),
    TOUCHPOINTREQUESTEDROUTING("touchpointRequestedRouting"),
    TOUCHPOINTUSEDROUTING("touchpointUsedRouting"),
    TOUCHPOINTWRAPUPCODE("touchpointWrapupCode");

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

  public JourneyAggregateQueryPredicate() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Optional type, can usually be inferred
   **/
  public JourneyAggregateQueryPredicate type(TypeEnum type) {
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
  public JourneyAggregateQueryPredicate dimension(DimensionEnum dimension) {
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
   * Optional operator, default is matches
   **/
  public JourneyAggregateQueryPredicate operator(OperatorEnum operator) {
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
   * Right hand side for dimension predicates
   **/
  public JourneyAggregateQueryPredicate value(String value) {
    this.value = value;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Right hand side for dimension predicates")
  @JsonProperty("value")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }


  /**
   * Right hand side for dimension predicates
   **/
  public JourneyAggregateQueryPredicate range(NumericRange range) {
    this.range = range;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Right hand side for dimension predicates")
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
    JourneyAggregateQueryPredicate journeyAggregateQueryPredicate = (JourneyAggregateQueryPredicate) o;

    return Objects.equals(this.type, journeyAggregateQueryPredicate.type) &&
            Objects.equals(this.dimension, journeyAggregateQueryPredicate.dimension) &&
            Objects.equals(this.operator, journeyAggregateQueryPredicate.operator) &&
            Objects.equals(this.value, journeyAggregateQueryPredicate.value) &&
            Objects.equals(this.range, journeyAggregateQueryPredicate.range);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, dimension, operator, value, range);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneyAggregateQueryPredicate {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    dimension: ").append(toIndentedString(dimension)).append("\n");
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

