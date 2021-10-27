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
import com.mypurecloud.sdk.v2.model.SchedulerMessageArgument;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ScheduleGenerationMessage
 */

public class ScheduleGenerationMessage  implements Serializable {
  

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
   * The type of the message
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    AGENTNOTFOUND("AgentNotFound"),
    AGENTNOTINSELECTEDMANAGEMENTUNIT("AgentNotInSelectedManagementUnit"),
    AGENTNOTLICENSED("AgentNotLicensed"),
    AGENTWITHOUTWORKPLAN("AgentWithoutWorkPlan"),
    WORKPLANNOTENABLED("WorkPlanNotEnabled"),
    WORKPLANNOTFOUND("WorkPlanNotFound"),
    AGENTWITHOUTCAPABILITY("AgentWithoutCapability"),
    NONEEDDAYS("NoNeedDays"),
    UNABLETOPRODUCEAGENTSCHEDULE("UnableToProduceAgentSchedule"),
    UNABLETOSCHEDULEMAXCONSECUTIVEWORKINGDAYSFROMAGENTHISTORY("UnableToScheduleMaxConsecutiveWorkingDaysFromAgentHistory"),
    UNABLETOSCHEDULEMAXCONSECUTIVEWORKINGWEEKENDSFROMAGENTHISTORY("UnableToScheduleMaxConsecutiveWorkingWeekendsFromAgentHistory"),
    UNABLETOSCHEDULEMAXWEEKLYPAIDTIMEFROMTIMEOFF("UnableToScheduleMaxWeeklyPaidTimeFromTimeOff"),
    UNABLETOSCHEDULEMAXWORKDAYPAIDTIMEFROMTIMEOFF("UnableToScheduleMaxWorkDayPaidTimeFromTimeOff"),
    UNABLETOSCHEDULEMININTERSHIFTTIMEFROMAGENTHISTORY("UnableToScheduleMinIntershiftTimeFromAgentHistory"),
    UNABLETOSCHEDULEMININTERSHIFTTIMEFROMDST("UnableToScheduleMinIntershiftTimeFromDst"),
    UNABLETOSCHEDULEMINSHIFTSTARTDISTANCEFROMAGENTHISTORY("UnableToScheduleMinShiftStartDistanceFromAgentHistory"),
    UNABLETOSCHEDULEMINSHIFTSTARTDISTANCEFROMDST("UnableToScheduleMinShiftStartDistanceFromDst"),
    UNABLETOSCHEDULEMINWEEKLYPAIDTIMEFROMTIMEOFF("UnableToScheduleMinWeeklyPaidTimeFromTimeOff"),
    UNABLETOSCHEDULEMINWEEKLYWORKDAYSFROMTIMEOFF("UnableToScheduleMinWeeklyWorkDaysFromTimeOff"),
    UNABLETOSCHEDULEMINWORKDAYPAIDTIMEFROMTIMEOFF("UnableToScheduleMinWorkDayPaidTimeFromTimeOff"),
    UNABLETOSCHEDULEPLANNINGPERIODMAXDAYSOFFFROMAGENTHISTORY("UnableToSchedulePlanningPeriodMaxDaysOffFromAgentHistory"),
    UNABLETOSCHEDULEPLANNINGPERIODMAXDAYSOFFFROMTIMEOFF("UnableToSchedulePlanningPeriodMaxDaysOffFromTimeOff"),
    UNABLETOSCHEDULEPLANNINGPERIODMAXPAIDTIMEFROMAGENTHISTORY("UnableToSchedulePlanningPeriodMaxPaidTimeFromAgentHistory"),
    UNABLETOSCHEDULEPLANNINGPERIODMAXPAIDTIMEFROMTIMEOFF("UnableToSchedulePlanningPeriodMaxPaidTimeFromTimeOff"),
    UNABLETOSCHEDULEPLANNINGPERIODMINDAYSOFFFROMAGENTHISTORY("UnableToSchedulePlanningPeriodMinDaysOffFromAgentHistory"),
    UNABLETOSCHEDULEPLANNINGPERIODMINPAIDTIMEFROMAGENTHISTORY("UnableToSchedulePlanningPeriodMinPaidTimeFromAgentHistory"),
    UNABLETOSCHEDULEPLANNINGPERIODMINPAIDTIMEFROMTIMEOFF("UnableToSchedulePlanningPeriodMinPaidTimeFromTimeOff"),
    UNABLETOSCHEDULEWORKDAYFROMTIMEOFF("UnableToScheduleWorkDayFromTimeOff"),
    UNABLETOSCHEDULEMAXCONSECUTIVEWORKINGDAYS("UnableToScheduleMaxConsecutiveWorkingDays"),
    UNABLETOSCHEDULEMAXCONSECUTIVEWORKINGWEEKENDS("UnableToScheduleMaxConsecutiveWorkingWeekends"),
    UNABLETOSCHEDULEMAXWEEKLYPAIDTIME("UnableToScheduleMaxWeeklyPaidTime"),
    UNABLETOSCHEDULEMAXWEEKLYWORKDAYS("UnableToScheduleMaxWeeklyWorkDays"),
    UNABLETOSCHEDULEMAXWORKDAYPAIDTIME("UnableToScheduleMaxWorkDayPaidTime"),
    UNABLETOSCHEDULEMINCONSECUTIVENONWORKINGTIMEPERWEEK("UnableToScheduleMinConsecutiveNonWorkingTimePerWeek"),
    UNABLETOSCHEDULEMININTERSHIFTTIME("UnableToScheduleMinIntershiftTime"),
    UNABLETOSCHEDULEMINSHIFTSTARTDISTANCE("UnableToScheduleMinShiftStartDistance"),
    UNABLETOSCHEDULEMINWEEKLYPAIDTIME("UnableToScheduleMinWeeklyPaidTime"),
    UNABLETOSCHEDULEMINWEEKLYWORKDAYS("UnableToScheduleMinWeeklyWorkDays"),
    UNABLETOSCHEDULEMINWORKDAYPAIDTIME("UnableToScheduleMinWorkDayPaidTime"),
    UNABLETOSCHEDULEPLANNINGPERIODMAXDAYSOFF("UnableToSchedulePlanningPeriodMaxDaysOff"),
    UNABLETOSCHEDULEPLANNINGPERIODMAXPAIDTIME("UnableToSchedulePlanningPeriodMaxPaidTime"),
    UNABLETOSCHEDULEPLANNINGPERIODMINDAYSOFF("UnableToSchedulePlanningPeriodMinDaysOff"),
    UNABLETOSCHEDULEPLANNINGPERIODMINPAIDTIME("UnableToSchedulePlanningPeriodMinPaidTime"),
    UNABLETOSCHEDULESHIFTVARIANCE("UnableToScheduleShiftVariance"),
    UNABLETOSCHEDULEWORKDAY("UnableToScheduleWorkDay");

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
  private List<SchedulerMessageArgument> arguments = new ArrayList<SchedulerMessageArgument>();

  
  /**
   * The type of the message
   **/
  public ScheduleGenerationMessage type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type of the message")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  
  /**
   * The arguments describing the message
   **/
  public ScheduleGenerationMessage arguments(List<SchedulerMessageArgument> arguments) {
    this.arguments = arguments;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The arguments describing the message")
  @JsonProperty("arguments")
  public List<SchedulerMessageArgument> getArguments() {
    return arguments;
  }
  public void setArguments(List<SchedulerMessageArgument> arguments) {
    this.arguments = arguments;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScheduleGenerationMessage scheduleGenerationMessage = (ScheduleGenerationMessage) o;
    return Objects.equals(this.type, scheduleGenerationMessage.type) &&
        Objects.equals(this.arguments, scheduleGenerationMessage.arguments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, arguments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleGenerationMessage {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
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

