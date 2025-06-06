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
import com.mypurecloud.sdk.v2.model.WorkPlanValidationMessageArgument;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * WorkPlanConfigurationViolationMessage
 */

public class WorkPlanConfigurationViolationMessage  implements Serializable {
  

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
   * Type of configuration violation message for this work plan
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ACTIVITIESOVERLAP("ActivitiesOverlap"),
    ACTIVITYENDGREATERTHANSHIFTSTOP("ActivityEndGreaterThanShiftStop"),
    ACTIVITYPAIDTIMEGREATERTHANSHIFTPAIDTIME("ActivityPaidTimeGreaterThanShiftPaidTime"),
    ACTIVITYSTARTBEFORESHIFTSTART("ActivityStartBeforeShiftStart"),
    ACTIVITYSTARTGREATERTHANEQUALTOSHIFTSTOP("ActivityStartGreaterThanEqualToShiftStop"),
    ACTIVITYSTARTINCREMENTMINUTESNOTDIVISIBLEBYSCHEDULEINTERVALMINUTES("ActivityStartIncrementMinutesNotDivisibleByScheduleIntervalMinutes"),
    DAILYEXACTPAIDMINUTES("DailyExactPaidMinutes"),
    DAILYMAXTOTALLESSTHANWEEKLYMIN("DailyMaxTotalLessThanWeeklyMin"),
    DAILYMAXTOTALLESSTHANWEEKLYMINWITHOPTIONAL("DailyMaxTotalLessThanWeeklyMinWithOptional"),
    DAILYMAXTOTALLESSTHANWEEKLYMINWITHOUTOPTIONAL("DailyMaxTotalLessThanWeeklyMinWithoutOptional"),
    DAILYMINTOTALGREATERTHANWEEKLYMAX("DailyMinTotalGreaterThanWeeklyMax"),
    DAILYMINTOTALGREATERTHANWEEKLYMAXWITHOPTIONAL("DailyMinTotalGreaterThanWeeklyMaxWithOptional"),
    DAILYMINTOTALGREATERTHANWEEKLYMAXWITHOUTOPTIONAL("DailyMinTotalGreaterThanWeeklyMaxWithoutOptional"),
    DAILYREQUIREDDAYSGREATERTHANWEEKLYMAXDAYS("DailyRequiredDaysGreaterThanWeeklyMaxDays"),
    DAILYSHIFTHASNODAYSSELECTED("DailyShiftHasNoDaysSelected"),
    DAILYSHIFTMAXPOSSIBILITIESVIOLATED("DailyShiftMaxPossibilitiesViolated"),
    EARLIESTSHIFTSTOPISTOOLATE("EarliestShiftStopIsTooLate"),
    EXACTPAIDTIMENOTDIVISIBLEBYGRANULARITY("ExactPaidTimeNotDivisibleByGranularity"),
    MAXCONSECUTIVEWORKINGDAYSNOMORETHANDOUBLEMAXWORKINGDAYSPERWEEK("MaxConsecutiveWorkingDaysNoMoreThanDoubleMaxWorkingDaysPerWeek"),
    MAXDAYSOFFPERPLANNINGPERIODNOTCORRECT("MaxDaysOffPerPlanningPeriodNotCorrect"),
    MAXPAIDTIMEISMORETHANSHIFTLENGTH("MaxPaidTimeIsMoreThanShiftLength"),
    MAXPAIDTIMENOTDIVISIBLEBYGRANULARITY("MaxPaidTimeNotDivisibleByGranularity"),
    MAXPAIDTIMEPERMONTHLYPLANNINGPERIOD("MaxPaidTimePerMonthlyPlanningPeriod"),
    MAXPAIDTIMEPERPLANNINGPERIOD("MaxPaidTimePerPlanningPeriod"),
    MAXSHIFTS("MaxShifts"),
    MINPAIDTIMENOTDIVISIBLEBYGRANULARITY("MinPaidTimeNotDivisibleByGranularity"),
    MINPAIDTIMEPERMONTHLYPLANNINGPERIOD("MinPaidTimePerMonthlyPlanningPeriod"),
    MINPAIDTIMEPERPLANNINGPERIOD("MinPaidTimePerPlanningPeriod"),
    NOSHIFTS("NoShifts"),
    PAIDTIMEGREATERTHANMAXWORKTIME("PaidTimeGreaterThanMaxWorkTime"),
    PAIDTIMELESSTHANMINWORKTIME("PaidTimeLessThanMinWorkTime"),
    PAIDTIMENOTMETBYSHIFTSTARTSTOP("PaidTimeNotMetByShiftStartStop"),
    PLANNINGPERIODMAXWORKINGWEEKENDSCANNOTBEMET("PlanningPeriodMaxWorkingWeekendsCannotBeMet"),
    SHIFTDAYSSELECTMORETHANMINWORKINGDAYS("ShiftDaysSelectMoreThanMinWorkingDays"),
    SHIFTSTOPEARLIERTHANSTART("ShiftStopEarlierThanStart"),
    SHIFTMAXCOUNTPERPLANNINGPERIODCANNOTBEMET("ShiftMaxCountPerPlanningPeriodCannotBeMet"),
    SHIFTMINCOUNTPERPLANNINGPERIODCANNOTBEMET("ShiftMinCountPerPlanningPeriodCannotBeMet"),
    SHIFTVARIANCECANNOTBEMET("ShiftVarianceCannotBeMet"),
    WEEKLYEXACTPAIDMINUTES("WeeklyExactPaidMinutes");

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
  private List<WorkPlanValidationMessageArgument> arguments = null;

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
   * Severity of the message. A message with Error severity indicates the scheduler won't be able to produce schedules and thus the work plan is invalid.
   */
 @JsonDeserialize(using = SeverityEnumDeserializer.class)
  public enum SeverityEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
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

  public WorkPlanConfigurationViolationMessage() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      arguments = new ArrayList<WorkPlanValidationMessageArgument>();
    }
  }

  
  /**
   * Type of configuration violation message for this work plan
   **/
  public WorkPlanConfigurationViolationMessage type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Type of configuration violation message for this work plan")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * Arguments of the message that provide information about the misconfigured value or the threshold that is exceeded by the misconfigured value
   **/
  public WorkPlanConfigurationViolationMessage arguments(List<WorkPlanValidationMessageArgument> arguments) {
    this.arguments = arguments;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Arguments of the message that provide information about the misconfigured value or the threshold that is exceeded by the misconfigured value")
  @JsonProperty("arguments")
  public List<WorkPlanValidationMessageArgument> getArguments() {
    return arguments;
  }
  public void setArguments(List<WorkPlanValidationMessageArgument> arguments) {
    this.arguments = arguments;
  }


  /**
   * Severity of the message. A message with Error severity indicates the scheduler won't be able to produce schedules and thus the work plan is invalid.
   **/
  public WorkPlanConfigurationViolationMessage severity(SeverityEnum severity) {
    this.severity = severity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Severity of the message. A message with Error severity indicates the scheduler won't be able to produce schedules and thus the work plan is invalid.")
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
    WorkPlanConfigurationViolationMessage workPlanConfigurationViolationMessage = (WorkPlanConfigurationViolationMessage) o;

    return Objects.equals(this.type, workPlanConfigurationViolationMessage.type) &&
            Objects.equals(this.arguments, workPlanConfigurationViolationMessage.arguments) &&
            Objects.equals(this.severity, workPlanConfigurationViolationMessage.severity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, arguments, severity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkPlanConfigurationViolationMessage {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
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

