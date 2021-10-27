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

import java.io.Serializable;
/**
 * SchedulerMessageTypeSeverity
 */

public class SchedulerMessageTypeSeverity  implements Serializable {
  

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

  private static class SeverityEnumDeserializer extends StdDeserializer<SeverityEnum> {
    public SeverityEnumDeserializer() {
      super(SeverityEnumDeserializer.class);
    }

    @Override
    public SeverityEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return SeverityEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The severity of the message
   */
 @JsonDeserialize(using = SeverityEnumDeserializer.class)
  public enum SeverityEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    IGNORE("Ignore"),
    INFORMATION("Information"),
    WARNING("Warning"),
    ERROR("Error");

    private String value;

    SeverityEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static SeverityEnum fromString(String key) {
      if (key == null) return null;

      for (SeverityEnum value : SeverityEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return SeverityEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private SeverityEnum severity = null;

  
  /**
   * The type of the message
   **/
  public SchedulerMessageTypeSeverity type(TypeEnum type) {
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
   * The severity of the message
   **/
  public SchedulerMessageTypeSeverity severity(SeverityEnum severity) {
    this.severity = severity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The severity of the message")
  @JsonProperty("severity")
  public SeverityEnum getSeverity() {
    return severity;
  }
  public void setSeverity(SeverityEnum severity) {
    this.severity = severity;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SchedulerMessageTypeSeverity schedulerMessageTypeSeverity = (SchedulerMessageTypeSeverity) o;
    return Objects.equals(this.type, schedulerMessageTypeSeverity.type) &&
        Objects.equals(this.severity, schedulerMessageTypeSeverity.severity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, severity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SchedulerMessageTypeSeverity {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
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

