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
import com.mypurecloud.sdk.v2.model.DeletableUserReference;
import com.mypurecloud.sdk.v2.model.ListWrapperShiftStartVariance;
import com.mypurecloud.sdk.v2.model.SetWrapperDayOfWeek;
import com.mypurecloud.sdk.v2.model.WorkPlanShift;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Work plan information
 */
@ApiModel(description = "Work plan information")

public class WorkPlanValidationRequest  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Boolean enabled = null;
  private Boolean valid = null;
  private Boolean constrainWeeklyPaidTime = null;
  private Boolean flexibleWeeklyPaidTime = null;
  private Integer weeklyExactPaidMinutes = null;
  private Integer weeklyMinimumPaidMinutes = null;
  private Integer weeklyMaximumPaidMinutes = null;
  private Boolean constrainPaidTimeGranularity = null;
  private Integer paidTimeGranularityMinutes = null;
  private Boolean constrainMinimumTimeBetweenShifts = null;
  private Integer minimumTimeBetweenShiftsMinutes = null;
  private Integer maximumDays = null;
  private Integer minimumConsecutiveNonWorkingMinutesPerWeek = null;
  private Boolean constrainMaximumConsecutiveWorkingWeekends = null;
  private Integer maximumConsecutiveWorkingWeekends = null;
  private Integer minimumWorkingDaysPerWeek = null;
  private Boolean constrainMaximumConsecutiveWorkingDays = null;
  private Integer maximumConsecutiveWorkingDays = null;
  private Integer minimumShiftStartDistanceMinutes = null;
  private Integer minimumDaysOffPerPlanningPeriod = null;
  private Integer maximumDaysOffPerPlanningPeriod = null;
  private Integer minimumPaidMinutesPerPlanningPeriod = null;
  private Integer maximumPaidMinutesPerPlanningPeriod = null;
  private SetWrapperDayOfWeek optionalDays = null;

  private static class ShiftStartVarianceTypeEnumDeserializer extends StdDeserializer<ShiftStartVarianceTypeEnum> {
    public ShiftStartVarianceTypeEnumDeserializer() {
      super(ShiftStartVarianceTypeEnumDeserializer.class);
    }

    @Override
    public ShiftStartVarianceTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ShiftStartVarianceTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * This constraint ensures that an agent starts each workday within a user-defined time threshold
   */
 @JsonDeserialize(using = ShiftStartVarianceTypeEnumDeserializer.class)
  public enum ShiftStartVarianceTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    SHIFTSTART("ShiftStart"),
    SHIFTSTARTANDPAIDDURATION("ShiftStartAndPaidDuration");

    private String value;

    ShiftStartVarianceTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ShiftStartVarianceTypeEnum fromString(String key) {
      if (key == null) return null;

      for (ShiftStartVarianceTypeEnum value : ShiftStartVarianceTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ShiftStartVarianceTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ShiftStartVarianceTypeEnum shiftStartVarianceType = null;
  private ListWrapperShiftStartVariance shiftStartVariances = null;
  private List<WorkPlanShift> shifts = new ArrayList<WorkPlanShift>();
  private List<DeletableUserReference> agents = new ArrayList<DeletableUserReference>();
  private Integer agentCount = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public WorkPlanValidationRequest name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Whether the work plan is enabled for scheduling
   **/
  public WorkPlanValidationRequest enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether the work plan is enabled for scheduling")
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  
  @ApiModelProperty(example = "null", value = "Whether the work plan is valid or not")
  @JsonProperty("valid")
  public Boolean getValid() {
    return valid;
  }

  
  /**
   * Whether the weekly paid time constraint is enabled for this work plan
   **/
  public WorkPlanValidationRequest constrainWeeklyPaidTime(Boolean constrainWeeklyPaidTime) {
    this.constrainWeeklyPaidTime = constrainWeeklyPaidTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether the weekly paid time constraint is enabled for this work plan")
  @JsonProperty("constrainWeeklyPaidTime")
  public Boolean getConstrainWeeklyPaidTime() {
    return constrainWeeklyPaidTime;
  }
  public void setConstrainWeeklyPaidTime(Boolean constrainWeeklyPaidTime) {
    this.constrainWeeklyPaidTime = constrainWeeklyPaidTime;
  }

  
  /**
   * Whether the weekly paid time constraint is flexible for this work plan
   **/
  public WorkPlanValidationRequest flexibleWeeklyPaidTime(Boolean flexibleWeeklyPaidTime) {
    this.flexibleWeeklyPaidTime = flexibleWeeklyPaidTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether the weekly paid time constraint is flexible for this work plan")
  @JsonProperty("flexibleWeeklyPaidTime")
  public Boolean getFlexibleWeeklyPaidTime() {
    return flexibleWeeklyPaidTime;
  }
  public void setFlexibleWeeklyPaidTime(Boolean flexibleWeeklyPaidTime) {
    this.flexibleWeeklyPaidTime = flexibleWeeklyPaidTime;
  }

  
  /**
   * Exact weekly paid time in minutes for this work plan. Used if flexibleWeeklyPaidTime == false
   **/
  public WorkPlanValidationRequest weeklyExactPaidMinutes(Integer weeklyExactPaidMinutes) {
    this.weeklyExactPaidMinutes = weeklyExactPaidMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Exact weekly paid time in minutes for this work plan. Used if flexibleWeeklyPaidTime == false")
  @JsonProperty("weeklyExactPaidMinutes")
  public Integer getWeeklyExactPaidMinutes() {
    return weeklyExactPaidMinutes;
  }
  public void setWeeklyExactPaidMinutes(Integer weeklyExactPaidMinutes) {
    this.weeklyExactPaidMinutes = weeklyExactPaidMinutes;
  }

  
  /**
   * Minimum weekly paid time in minutes for this work plan. Used if flexibleWeeklyPaidTime == true
   **/
  public WorkPlanValidationRequest weeklyMinimumPaidMinutes(Integer weeklyMinimumPaidMinutes) {
    this.weeklyMinimumPaidMinutes = weeklyMinimumPaidMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Minimum weekly paid time in minutes for this work plan. Used if flexibleWeeklyPaidTime == true")
  @JsonProperty("weeklyMinimumPaidMinutes")
  public Integer getWeeklyMinimumPaidMinutes() {
    return weeklyMinimumPaidMinutes;
  }
  public void setWeeklyMinimumPaidMinutes(Integer weeklyMinimumPaidMinutes) {
    this.weeklyMinimumPaidMinutes = weeklyMinimumPaidMinutes;
  }

  
  /**
   * Maximum weekly paid time in minutes for this work plan. Used if flexibleWeeklyPaidTime == true
   **/
  public WorkPlanValidationRequest weeklyMaximumPaidMinutes(Integer weeklyMaximumPaidMinutes) {
    this.weeklyMaximumPaidMinutes = weeklyMaximumPaidMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Maximum weekly paid time in minutes for this work plan. Used if flexibleWeeklyPaidTime == true")
  @JsonProperty("weeklyMaximumPaidMinutes")
  public Integer getWeeklyMaximumPaidMinutes() {
    return weeklyMaximumPaidMinutes;
  }
  public void setWeeklyMaximumPaidMinutes(Integer weeklyMaximumPaidMinutes) {
    this.weeklyMaximumPaidMinutes = weeklyMaximumPaidMinutes;
  }

  
  /**
   * Whether paid time granularity is constrained for this work plan
   **/
  public WorkPlanValidationRequest constrainPaidTimeGranularity(Boolean constrainPaidTimeGranularity) {
    this.constrainPaidTimeGranularity = constrainPaidTimeGranularity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether paid time granularity is constrained for this work plan")
  @JsonProperty("constrainPaidTimeGranularity")
  public Boolean getConstrainPaidTimeGranularity() {
    return constrainPaidTimeGranularity;
  }
  public void setConstrainPaidTimeGranularity(Boolean constrainPaidTimeGranularity) {
    this.constrainPaidTimeGranularity = constrainPaidTimeGranularity;
  }

  
  /**
   * Granularity in minutes allowed for shift paid time in this work plan. Used if constrainPaidTimeGranularity == true
   **/
  public WorkPlanValidationRequest paidTimeGranularityMinutes(Integer paidTimeGranularityMinutes) {
    this.paidTimeGranularityMinutes = paidTimeGranularityMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Granularity in minutes allowed for shift paid time in this work plan. Used if constrainPaidTimeGranularity == true")
  @JsonProperty("paidTimeGranularityMinutes")
  public Integer getPaidTimeGranularityMinutes() {
    return paidTimeGranularityMinutes;
  }
  public void setPaidTimeGranularityMinutes(Integer paidTimeGranularityMinutes) {
    this.paidTimeGranularityMinutes = paidTimeGranularityMinutes;
  }

  
  /**
   * Whether the minimum time between shifts constraint is enabled for this work plan
   **/
  public WorkPlanValidationRequest constrainMinimumTimeBetweenShifts(Boolean constrainMinimumTimeBetweenShifts) {
    this.constrainMinimumTimeBetweenShifts = constrainMinimumTimeBetweenShifts;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether the minimum time between shifts constraint is enabled for this work plan")
  @JsonProperty("constrainMinimumTimeBetweenShifts")
  public Boolean getConstrainMinimumTimeBetweenShifts() {
    return constrainMinimumTimeBetweenShifts;
  }
  public void setConstrainMinimumTimeBetweenShifts(Boolean constrainMinimumTimeBetweenShifts) {
    this.constrainMinimumTimeBetweenShifts = constrainMinimumTimeBetweenShifts;
  }

  
  /**
   * Minimum time between shifts in minutes defined in this work plan. Used if constrainMinimumTimeBetweenShifts == true
   **/
  public WorkPlanValidationRequest minimumTimeBetweenShiftsMinutes(Integer minimumTimeBetweenShiftsMinutes) {
    this.minimumTimeBetweenShiftsMinutes = minimumTimeBetweenShiftsMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Minimum time between shifts in minutes defined in this work plan. Used if constrainMinimumTimeBetweenShifts == true")
  @JsonProperty("minimumTimeBetweenShiftsMinutes")
  public Integer getMinimumTimeBetweenShiftsMinutes() {
    return minimumTimeBetweenShiftsMinutes;
  }
  public void setMinimumTimeBetweenShiftsMinutes(Integer minimumTimeBetweenShiftsMinutes) {
    this.minimumTimeBetweenShiftsMinutes = minimumTimeBetweenShiftsMinutes;
  }

  
  /**
   * Maximum number days in a week allowed to be scheduled for this work plan
   **/
  public WorkPlanValidationRequest maximumDays(Integer maximumDays) {
    this.maximumDays = maximumDays;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Maximum number days in a week allowed to be scheduled for this work plan")
  @JsonProperty("maximumDays")
  public Integer getMaximumDays() {
    return maximumDays;
  }
  public void setMaximumDays(Integer maximumDays) {
    this.maximumDays = maximumDays;
  }

  
  /**
   * Minimum amount of consecutive non working minutes per week that agents who are assigned this work plan are allowed to have off
   **/
  public WorkPlanValidationRequest minimumConsecutiveNonWorkingMinutesPerWeek(Integer minimumConsecutiveNonWorkingMinutesPerWeek) {
    this.minimumConsecutiveNonWorkingMinutesPerWeek = minimumConsecutiveNonWorkingMinutesPerWeek;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Minimum amount of consecutive non working minutes per week that agents who are assigned this work plan are allowed to have off")
  @JsonProperty("minimumConsecutiveNonWorkingMinutesPerWeek")
  public Integer getMinimumConsecutiveNonWorkingMinutesPerWeek() {
    return minimumConsecutiveNonWorkingMinutesPerWeek;
  }
  public void setMinimumConsecutiveNonWorkingMinutesPerWeek(Integer minimumConsecutiveNonWorkingMinutesPerWeek) {
    this.minimumConsecutiveNonWorkingMinutesPerWeek = minimumConsecutiveNonWorkingMinutesPerWeek;
  }

  
  /**
   * Whether to constrain the maximum consecutive working weekends
   **/
  public WorkPlanValidationRequest constrainMaximumConsecutiveWorkingWeekends(Boolean constrainMaximumConsecutiveWorkingWeekends) {
    this.constrainMaximumConsecutiveWorkingWeekends = constrainMaximumConsecutiveWorkingWeekends;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether to constrain the maximum consecutive working weekends")
  @JsonProperty("constrainMaximumConsecutiveWorkingWeekends")
  public Boolean getConstrainMaximumConsecutiveWorkingWeekends() {
    return constrainMaximumConsecutiveWorkingWeekends;
  }
  public void setConstrainMaximumConsecutiveWorkingWeekends(Boolean constrainMaximumConsecutiveWorkingWeekends) {
    this.constrainMaximumConsecutiveWorkingWeekends = constrainMaximumConsecutiveWorkingWeekends;
  }

  
  /**
   * The maximum number of consecutive weekends that agents who are assigned to this work plan are allowed to work
   **/
  public WorkPlanValidationRequest maximumConsecutiveWorkingWeekends(Integer maximumConsecutiveWorkingWeekends) {
    this.maximumConsecutiveWorkingWeekends = maximumConsecutiveWorkingWeekends;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The maximum number of consecutive weekends that agents who are assigned to this work plan are allowed to work")
  @JsonProperty("maximumConsecutiveWorkingWeekends")
  public Integer getMaximumConsecutiveWorkingWeekends() {
    return maximumConsecutiveWorkingWeekends;
  }
  public void setMaximumConsecutiveWorkingWeekends(Integer maximumConsecutiveWorkingWeekends) {
    this.maximumConsecutiveWorkingWeekends = maximumConsecutiveWorkingWeekends;
  }

  
  /**
   * The minimum number of days that agents assigned to a work plan must work per week
   **/
  public WorkPlanValidationRequest minimumWorkingDaysPerWeek(Integer minimumWorkingDaysPerWeek) {
    this.minimumWorkingDaysPerWeek = minimumWorkingDaysPerWeek;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The minimum number of days that agents assigned to a work plan must work per week")
  @JsonProperty("minimumWorkingDaysPerWeek")
  public Integer getMinimumWorkingDaysPerWeek() {
    return minimumWorkingDaysPerWeek;
  }
  public void setMinimumWorkingDaysPerWeek(Integer minimumWorkingDaysPerWeek) {
    this.minimumWorkingDaysPerWeek = minimumWorkingDaysPerWeek;
  }

  
  /**
   * Whether to constrain the maximum consecutive working days
   **/
  public WorkPlanValidationRequest constrainMaximumConsecutiveWorkingDays(Boolean constrainMaximumConsecutiveWorkingDays) {
    this.constrainMaximumConsecutiveWorkingDays = constrainMaximumConsecutiveWorkingDays;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether to constrain the maximum consecutive working days")
  @JsonProperty("constrainMaximumConsecutiveWorkingDays")
  public Boolean getConstrainMaximumConsecutiveWorkingDays() {
    return constrainMaximumConsecutiveWorkingDays;
  }
  public void setConstrainMaximumConsecutiveWorkingDays(Boolean constrainMaximumConsecutiveWorkingDays) {
    this.constrainMaximumConsecutiveWorkingDays = constrainMaximumConsecutiveWorkingDays;
  }

  
  /**
   * The maximum number of consecutive days that agents assigned to this work plan are allowed to work. Used if constrainMaximumConsecutiveWorkingDays == true
   **/
  public WorkPlanValidationRequest maximumConsecutiveWorkingDays(Integer maximumConsecutiveWorkingDays) {
    this.maximumConsecutiveWorkingDays = maximumConsecutiveWorkingDays;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The maximum number of consecutive days that agents assigned to this work plan are allowed to work. Used if constrainMaximumConsecutiveWorkingDays == true")
  @JsonProperty("maximumConsecutiveWorkingDays")
  public Integer getMaximumConsecutiveWorkingDays() {
    return maximumConsecutiveWorkingDays;
  }
  public void setMaximumConsecutiveWorkingDays(Integer maximumConsecutiveWorkingDays) {
    this.maximumConsecutiveWorkingDays = maximumConsecutiveWorkingDays;
  }

  
  /**
   * The time period in minutes for the duration between the start times of two consecutive working days
   **/
  public WorkPlanValidationRequest minimumShiftStartDistanceMinutes(Integer minimumShiftStartDistanceMinutes) {
    this.minimumShiftStartDistanceMinutes = minimumShiftStartDistanceMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The time period in minutes for the duration between the start times of two consecutive working days")
  @JsonProperty("minimumShiftStartDistanceMinutes")
  public Integer getMinimumShiftStartDistanceMinutes() {
    return minimumShiftStartDistanceMinutes;
  }
  public void setMinimumShiftStartDistanceMinutes(Integer minimumShiftStartDistanceMinutes) {
    this.minimumShiftStartDistanceMinutes = minimumShiftStartDistanceMinutes;
  }

  
  /**
   * Minimum days off in the planning period
   **/
  public WorkPlanValidationRequest minimumDaysOffPerPlanningPeriod(Integer minimumDaysOffPerPlanningPeriod) {
    this.minimumDaysOffPerPlanningPeriod = minimumDaysOffPerPlanningPeriod;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Minimum days off in the planning period")
  @JsonProperty("minimumDaysOffPerPlanningPeriod")
  public Integer getMinimumDaysOffPerPlanningPeriod() {
    return minimumDaysOffPerPlanningPeriod;
  }
  public void setMinimumDaysOffPerPlanningPeriod(Integer minimumDaysOffPerPlanningPeriod) {
    this.minimumDaysOffPerPlanningPeriod = minimumDaysOffPerPlanningPeriod;
  }

  
  /**
   * Maximum days off in the planning period
   **/
  public WorkPlanValidationRequest maximumDaysOffPerPlanningPeriod(Integer maximumDaysOffPerPlanningPeriod) {
    this.maximumDaysOffPerPlanningPeriod = maximumDaysOffPerPlanningPeriod;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Maximum days off in the planning period")
  @JsonProperty("maximumDaysOffPerPlanningPeriod")
  public Integer getMaximumDaysOffPerPlanningPeriod() {
    return maximumDaysOffPerPlanningPeriod;
  }
  public void setMaximumDaysOffPerPlanningPeriod(Integer maximumDaysOffPerPlanningPeriod) {
    this.maximumDaysOffPerPlanningPeriod = maximumDaysOffPerPlanningPeriod;
  }

  
  /**
   * Minimum paid minutes in the planning period
   **/
  public WorkPlanValidationRequest minimumPaidMinutesPerPlanningPeriod(Integer minimumPaidMinutesPerPlanningPeriod) {
    this.minimumPaidMinutesPerPlanningPeriod = minimumPaidMinutesPerPlanningPeriod;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Minimum paid minutes in the planning period")
  @JsonProperty("minimumPaidMinutesPerPlanningPeriod")
  public Integer getMinimumPaidMinutesPerPlanningPeriod() {
    return minimumPaidMinutesPerPlanningPeriod;
  }
  public void setMinimumPaidMinutesPerPlanningPeriod(Integer minimumPaidMinutesPerPlanningPeriod) {
    this.minimumPaidMinutesPerPlanningPeriod = minimumPaidMinutesPerPlanningPeriod;
  }

  
  /**
   * Maximum paid minutes in the planning period
   **/
  public WorkPlanValidationRequest maximumPaidMinutesPerPlanningPeriod(Integer maximumPaidMinutesPerPlanningPeriod) {
    this.maximumPaidMinutesPerPlanningPeriod = maximumPaidMinutesPerPlanningPeriod;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Maximum paid minutes in the planning period")
  @JsonProperty("maximumPaidMinutesPerPlanningPeriod")
  public Integer getMaximumPaidMinutesPerPlanningPeriod() {
    return maximumPaidMinutesPerPlanningPeriod;
  }
  public void setMaximumPaidMinutesPerPlanningPeriod(Integer maximumPaidMinutesPerPlanningPeriod) {
    this.maximumPaidMinutesPerPlanningPeriod = maximumPaidMinutesPerPlanningPeriod;
  }

  
  /**
   * Optional days to schedule for this work plan
   **/
  public WorkPlanValidationRequest optionalDays(SetWrapperDayOfWeek optionalDays) {
    this.optionalDays = optionalDays;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Optional days to schedule for this work plan")
  @JsonProperty("optionalDays")
  public SetWrapperDayOfWeek getOptionalDays() {
    return optionalDays;
  }
  public void setOptionalDays(SetWrapperDayOfWeek optionalDays) {
    this.optionalDays = optionalDays;
  }

  
  /**
   * This constraint ensures that an agent starts each workday within a user-defined time threshold
   **/
  public WorkPlanValidationRequest shiftStartVarianceType(ShiftStartVarianceTypeEnum shiftStartVarianceType) {
    this.shiftStartVarianceType = shiftStartVarianceType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This constraint ensures that an agent starts each workday within a user-defined time threshold")
  @JsonProperty("shiftStartVarianceType")
  public ShiftStartVarianceTypeEnum getShiftStartVarianceType() {
    return shiftStartVarianceType;
  }
  public void setShiftStartVarianceType(ShiftStartVarianceTypeEnum shiftStartVarianceType) {
    this.shiftStartVarianceType = shiftStartVarianceType;
  }

  
  /**
   * Variance in minutes among start times of shifts in this work plan
   **/
  public WorkPlanValidationRequest shiftStartVariances(ListWrapperShiftStartVariance shiftStartVariances) {
    this.shiftStartVariances = shiftStartVariances;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Variance in minutes among start times of shifts in this work plan")
  @JsonProperty("shiftStartVariances")
  public ListWrapperShiftStartVariance getShiftStartVariances() {
    return shiftStartVariances;
  }
  public void setShiftStartVariances(ListWrapperShiftStartVariance shiftStartVariances) {
    this.shiftStartVariances = shiftStartVariances;
  }

  
  /**
   * Shifts in this work plan
   **/
  public WorkPlanValidationRequest shifts(List<WorkPlanShift> shifts) {
    this.shifts = shifts;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Shifts in this work plan")
  @JsonProperty("shifts")
  public List<WorkPlanShift> getShifts() {
    return shifts;
  }
  public void setShifts(List<WorkPlanShift> shifts) {
    this.shifts = shifts;
  }

  
  /**
   * Agents in this work plan
   **/
  public WorkPlanValidationRequest agents(List<DeletableUserReference> agents) {
    this.agents = agents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Agents in this work plan")
  @JsonProperty("agents")
  public List<DeletableUserReference> getAgents() {
    return agents;
  }
  public void setAgents(List<DeletableUserReference> agents) {
    this.agents = agents;
  }

  
  /**
   * Number of agents in this work plan
   **/
  public WorkPlanValidationRequest agentCount(Integer agentCount) {
    this.agentCount = agentCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of agents in this work plan")
  @JsonProperty("agentCount")
  public Integer getAgentCount() {
    return agentCount;
  }
  public void setAgentCount(Integer agentCount) {
    this.agentCount = agentCount;
  }

  
  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkPlanValidationRequest workPlanValidationRequest = (WorkPlanValidationRequest) o;
    return Objects.equals(this.id, workPlanValidationRequest.id) &&
        Objects.equals(this.name, workPlanValidationRequest.name) &&
        Objects.equals(this.enabled, workPlanValidationRequest.enabled) &&
        Objects.equals(this.valid, workPlanValidationRequest.valid) &&
        Objects.equals(this.constrainWeeklyPaidTime, workPlanValidationRequest.constrainWeeklyPaidTime) &&
        Objects.equals(this.flexibleWeeklyPaidTime, workPlanValidationRequest.flexibleWeeklyPaidTime) &&
        Objects.equals(this.weeklyExactPaidMinutes, workPlanValidationRequest.weeklyExactPaidMinutes) &&
        Objects.equals(this.weeklyMinimumPaidMinutes, workPlanValidationRequest.weeklyMinimumPaidMinutes) &&
        Objects.equals(this.weeklyMaximumPaidMinutes, workPlanValidationRequest.weeklyMaximumPaidMinutes) &&
        Objects.equals(this.constrainPaidTimeGranularity, workPlanValidationRequest.constrainPaidTimeGranularity) &&
        Objects.equals(this.paidTimeGranularityMinutes, workPlanValidationRequest.paidTimeGranularityMinutes) &&
        Objects.equals(this.constrainMinimumTimeBetweenShifts, workPlanValidationRequest.constrainMinimumTimeBetweenShifts) &&
        Objects.equals(this.minimumTimeBetweenShiftsMinutes, workPlanValidationRequest.minimumTimeBetweenShiftsMinutes) &&
        Objects.equals(this.maximumDays, workPlanValidationRequest.maximumDays) &&
        Objects.equals(this.minimumConsecutiveNonWorkingMinutesPerWeek, workPlanValidationRequest.minimumConsecutiveNonWorkingMinutesPerWeek) &&
        Objects.equals(this.constrainMaximumConsecutiveWorkingWeekends, workPlanValidationRequest.constrainMaximumConsecutiveWorkingWeekends) &&
        Objects.equals(this.maximumConsecutiveWorkingWeekends, workPlanValidationRequest.maximumConsecutiveWorkingWeekends) &&
        Objects.equals(this.minimumWorkingDaysPerWeek, workPlanValidationRequest.minimumWorkingDaysPerWeek) &&
        Objects.equals(this.constrainMaximumConsecutiveWorkingDays, workPlanValidationRequest.constrainMaximumConsecutiveWorkingDays) &&
        Objects.equals(this.maximumConsecutiveWorkingDays, workPlanValidationRequest.maximumConsecutiveWorkingDays) &&
        Objects.equals(this.minimumShiftStartDistanceMinutes, workPlanValidationRequest.minimumShiftStartDistanceMinutes) &&
        Objects.equals(this.minimumDaysOffPerPlanningPeriod, workPlanValidationRequest.minimumDaysOffPerPlanningPeriod) &&
        Objects.equals(this.maximumDaysOffPerPlanningPeriod, workPlanValidationRequest.maximumDaysOffPerPlanningPeriod) &&
        Objects.equals(this.minimumPaidMinutesPerPlanningPeriod, workPlanValidationRequest.minimumPaidMinutesPerPlanningPeriod) &&
        Objects.equals(this.maximumPaidMinutesPerPlanningPeriod, workPlanValidationRequest.maximumPaidMinutesPerPlanningPeriod) &&
        Objects.equals(this.optionalDays, workPlanValidationRequest.optionalDays) &&
        Objects.equals(this.shiftStartVarianceType, workPlanValidationRequest.shiftStartVarianceType) &&
        Objects.equals(this.shiftStartVariances, workPlanValidationRequest.shiftStartVariances) &&
        Objects.equals(this.shifts, workPlanValidationRequest.shifts) &&
        Objects.equals(this.agents, workPlanValidationRequest.agents) &&
        Objects.equals(this.agentCount, workPlanValidationRequest.agentCount) &&
        Objects.equals(this.selfUri, workPlanValidationRequest.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, enabled, valid, constrainWeeklyPaidTime, flexibleWeeklyPaidTime, weeklyExactPaidMinutes, weeklyMinimumPaidMinutes, weeklyMaximumPaidMinutes, constrainPaidTimeGranularity, paidTimeGranularityMinutes, constrainMinimumTimeBetweenShifts, minimumTimeBetweenShiftsMinutes, maximumDays, minimumConsecutiveNonWorkingMinutesPerWeek, constrainMaximumConsecutiveWorkingWeekends, maximumConsecutiveWorkingWeekends, minimumWorkingDaysPerWeek, constrainMaximumConsecutiveWorkingDays, maximumConsecutiveWorkingDays, minimumShiftStartDistanceMinutes, minimumDaysOffPerPlanningPeriod, maximumDaysOffPerPlanningPeriod, minimumPaidMinutesPerPlanningPeriod, maximumPaidMinutesPerPlanningPeriod, optionalDays, shiftStartVarianceType, shiftStartVariances, shifts, agents, agentCount, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkPlanValidationRequest {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    constrainWeeklyPaidTime: ").append(toIndentedString(constrainWeeklyPaidTime)).append("\n");
    sb.append("    flexibleWeeklyPaidTime: ").append(toIndentedString(flexibleWeeklyPaidTime)).append("\n");
    sb.append("    weeklyExactPaidMinutes: ").append(toIndentedString(weeklyExactPaidMinutes)).append("\n");
    sb.append("    weeklyMinimumPaidMinutes: ").append(toIndentedString(weeklyMinimumPaidMinutes)).append("\n");
    sb.append("    weeklyMaximumPaidMinutes: ").append(toIndentedString(weeklyMaximumPaidMinutes)).append("\n");
    sb.append("    constrainPaidTimeGranularity: ").append(toIndentedString(constrainPaidTimeGranularity)).append("\n");
    sb.append("    paidTimeGranularityMinutes: ").append(toIndentedString(paidTimeGranularityMinutes)).append("\n");
    sb.append("    constrainMinimumTimeBetweenShifts: ").append(toIndentedString(constrainMinimumTimeBetweenShifts)).append("\n");
    sb.append("    minimumTimeBetweenShiftsMinutes: ").append(toIndentedString(minimumTimeBetweenShiftsMinutes)).append("\n");
    sb.append("    maximumDays: ").append(toIndentedString(maximumDays)).append("\n");
    sb.append("    minimumConsecutiveNonWorkingMinutesPerWeek: ").append(toIndentedString(minimumConsecutiveNonWorkingMinutesPerWeek)).append("\n");
    sb.append("    constrainMaximumConsecutiveWorkingWeekends: ").append(toIndentedString(constrainMaximumConsecutiveWorkingWeekends)).append("\n");
    sb.append("    maximumConsecutiveWorkingWeekends: ").append(toIndentedString(maximumConsecutiveWorkingWeekends)).append("\n");
    sb.append("    minimumWorkingDaysPerWeek: ").append(toIndentedString(minimumWorkingDaysPerWeek)).append("\n");
    sb.append("    constrainMaximumConsecutiveWorkingDays: ").append(toIndentedString(constrainMaximumConsecutiveWorkingDays)).append("\n");
    sb.append("    maximumConsecutiveWorkingDays: ").append(toIndentedString(maximumConsecutiveWorkingDays)).append("\n");
    sb.append("    minimumShiftStartDistanceMinutes: ").append(toIndentedString(minimumShiftStartDistanceMinutes)).append("\n");
    sb.append("    minimumDaysOffPerPlanningPeriod: ").append(toIndentedString(minimumDaysOffPerPlanningPeriod)).append("\n");
    sb.append("    maximumDaysOffPerPlanningPeriod: ").append(toIndentedString(maximumDaysOffPerPlanningPeriod)).append("\n");
    sb.append("    minimumPaidMinutesPerPlanningPeriod: ").append(toIndentedString(minimumPaidMinutesPerPlanningPeriod)).append("\n");
    sb.append("    maximumPaidMinutesPerPlanningPeriod: ").append(toIndentedString(maximumPaidMinutesPerPlanningPeriod)).append("\n");
    sb.append("    optionalDays: ").append(toIndentedString(optionalDays)).append("\n");
    sb.append("    shiftStartVarianceType: ").append(toIndentedString(shiftStartVarianceType)).append("\n");
    sb.append("    shiftStartVariances: ").append(toIndentedString(shiftStartVariances)).append("\n");
    sb.append("    shifts: ").append(toIndentedString(shifts)).append("\n");
    sb.append("    agents: ").append(toIndentedString(agents)).append("\n");
    sb.append("    agentCount: ").append(toIndentedString(agentCount)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

