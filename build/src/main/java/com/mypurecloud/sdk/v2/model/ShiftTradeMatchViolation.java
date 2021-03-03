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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * ShiftTradeMatchViolation
 */

public class ShiftTradeMatchViolation  implements Serializable {
  

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
   * The type of constraint violation
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    AGENTCAPABILITYMISMATCH("AgentCapabilityMismatch"),
    CANNOTTRADEWITHYOURSELF("CannotTradeWithYourself"),
    DIRECTTRADEFOROTHERUSER("DirectTradeForOtherUser"),
    INITIATINGAGENTSCHEDULEDOESNOTEXIST("InitiatingAgentScheduleDoesNotExist"),
    INITIATINGSHIFTDISALLOWEDACTIVITYCATEGORY("InitiatingShiftDisallowedActivityCategory"),
    INITIATINGSHIFTDOESNOTEXIST("InitiatingShiftDoesNotExist"),
    INITIATINGSHIFTHASEXTERNALACTIVITIES("InitiatingShiftHasExternalActivities"),
    INITIATINGSHIFTOVERLAPSEXISTING("InitiatingShiftOverlapsExisting"),
    INITIATINGSHIFTSTARTTOOCLOSE("InitiatingShiftStartTooClose"),
    INITIATINGSHIFTTIMESCHANGED("InitiatingShiftTimesChanged"),
    INITIATINGWEEKLYMAXPAIDTIME("InitiatingWeeklyMaxPaidTime"),
    INITIATINGWEEKLYMINPAIDTIME("InitiatingWeeklyMinPaidTime"),
    INVALIDSTATE("InvalidState"),
    ONESIDEDTRADECREATION("OneSidedTradeCreation"),
    RECEIVINGAGENTSCHEDULEDOESNOTEXIST("ReceivingAgentScheduleDoesNotExist"),
    RECEIVINGSHIFTDISALLOWEDACTIVITYCATEGORY("ReceivingShiftDisallowedActivityCategory"),
    RECEIVINGSHIFTDOESNOTEXIST("ReceivingShiftDoesNotExist"),
    RECEIVINGSHIFTFORONESIDEDTRADE("ReceivingShiftForOneSidedTrade"),
    RECEIVINGSHIFTHASEXTERNALACTIVITIES("ReceivingShiftHasExternalActivities"),
    RECEIVINGSHIFTMISSINGFORTWOSIDEDTRADE("ReceivingShiftMissingForTwoSidedTrade"),
    RECEIVINGSHIFTOUTSIDEACCEPTABLEINTERVALS("ReceivingShiftOutsideAcceptableIntervals"),
    RECEIVINGSHIFTOVERLAPSEXISTING("ReceivingShiftOverlapsExisting"),
    RECEIVINGSHIFTSTARTTOOCLOSE("ReceivingShiftStartTooClose"),
    RECEIVINGSHIFTTIMESCHANGED("ReceivingShiftTimesChanged"),
    RECEIVINGWEEKLYMAXPAIDTIME("ReceivingWeeklyMaxPaidTime"),
    RECEIVINGWEEKLYMINPAIDTIME("ReceivingWeeklyMinPaidTime"),
    SHIFTTRADINGNOTENABLED("ShiftTradingNotEnabled"),
    UNEQUALPAIDTIME("UnequalPaidTime"),
    WEEKSCHEDULEDIFFERENT("WeekScheduleDifferent"),
    WEEKSCHEDULEDOESNOTEXIST("WeekScheduleDoesNotExist"),
    WEEKSCHEDULEUNPUBLISHED("WeekScheduleUnpublished");

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
  private Map<String, String> params = null;

  
  /**
   * The type of constraint violation
   **/
  public ShiftTradeMatchViolation type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type of constraint violation")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  
  /**
   * Clarifying user params for constructing helpful error messages
   **/
  public ShiftTradeMatchViolation params(Map<String, String> params) {
    this.params = params;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Clarifying user params for constructing helpful error messages")
  @JsonProperty("params")
  public Map<String, String> getParams() {
    return params;
  }
  public void setParams(Map<String, String> params) {
    this.params = params;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShiftTradeMatchViolation shiftTradeMatchViolation = (ShiftTradeMatchViolation) o;
    return Objects.equals(this.type, shiftTradeMatchViolation.type) &&
        Objects.equals(this.params, shiftTradeMatchViolation.params);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, params);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShiftTradeMatchViolation {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
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

