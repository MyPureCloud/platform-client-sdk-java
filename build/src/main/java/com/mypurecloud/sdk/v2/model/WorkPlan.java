package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.DeletableUserReference;
import com.mypurecloud.sdk.v2.model.ListWrapperShiftStartVariance;
import com.mypurecloud.sdk.v2.model.SetWrapperDayOfWeek;
import com.mypurecloud.sdk.v2.model.WfmVersionedEntityMetadata;
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

public class WorkPlan  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Boolean enabled = null;
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

  /**
   * The day of the week for which the weekend starts, such as Saturday
   */
  public enum StartDayOfWeekendEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    SUNDAY("Sunday"),
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday");

    private String value;

    StartDayOfWeekendEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StartDayOfWeekendEnum fromString(String key) {
      if (key == null) return null;

      for (StartDayOfWeekendEnum value : StartDayOfWeekendEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StartDayOfWeekendEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StartDayOfWeekendEnum startDayOfWeekend = null;
  private Integer minimumConsecutiveTimeOffPerWeekMinutes = null;
  private Boolean constrainMaximumConsecutiveWorkingWeekends = null;
  private Integer maximumConsecutiveWorkingWeekends = null;
  private Integer minimumWorkingDaysPerWeek = null;
  private Integer maximumConsecutiveWorkingDays = null;
  private Integer minimumShiftStartDistanceMinutes = null;
  private Integer minimumDaysOffPerPlanningPeriod = null;
  private Integer maximumDaysOffPerPlanningPeriod = null;
  private Integer minimumPaidHoursPerPlanningPeriod = null;
  private Integer maximumPaidHoursPerPlanningPeriod = null;
  private SetWrapperDayOfWeek optionalDays = null;
  private ListWrapperShiftStartVariance shiftStartVariances = null;
  private List<WorkPlanShift> shifts = new ArrayList<WorkPlanShift>();
  private List<DeletableUserReference> agents = new ArrayList<DeletableUserReference>();
  private WfmVersionedEntityMetadata metadata = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public WorkPlan name(String name) {
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
  public WorkPlan enabled(Boolean enabled) {
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

  
  /**
   * Whether the weekly paid time constraint is enabled for this work plan
   **/
  public WorkPlan constrainWeeklyPaidTime(Boolean constrainWeeklyPaidTime) {
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
  public WorkPlan flexibleWeeklyPaidTime(Boolean flexibleWeeklyPaidTime) {
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
  public WorkPlan weeklyExactPaidMinutes(Integer weeklyExactPaidMinutes) {
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
  public WorkPlan weeklyMinimumPaidMinutes(Integer weeklyMinimumPaidMinutes) {
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
  public WorkPlan weeklyMaximumPaidMinutes(Integer weeklyMaximumPaidMinutes) {
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
   * Whether paid time granularity is constrained for this workplan
   **/
  public WorkPlan constrainPaidTimeGranularity(Boolean constrainPaidTimeGranularity) {
    this.constrainPaidTimeGranularity = constrainPaidTimeGranularity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether paid time granularity is constrained for this workplan")
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
  public WorkPlan paidTimeGranularityMinutes(Integer paidTimeGranularityMinutes) {
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
  public WorkPlan constrainMinimumTimeBetweenShifts(Boolean constrainMinimumTimeBetweenShifts) {
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
  public WorkPlan minimumTimeBetweenShiftsMinutes(Integer minimumTimeBetweenShiftsMinutes) {
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
  public WorkPlan maximumDays(Integer maximumDays) {
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
   * The day of the week for which the weekend starts, such as Saturday
   **/
  public WorkPlan startDayOfWeekend(StartDayOfWeekendEnum startDayOfWeekend) {
    this.startDayOfWeekend = startDayOfWeekend;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The day of the week for which the weekend starts, such as Saturday")
  @JsonProperty("startDayOfWeekend")
  public StartDayOfWeekendEnum getStartDayOfWeekend() {
    return startDayOfWeekend;
  }
  public void setStartDayOfWeekend(StartDayOfWeekendEnum startDayOfWeekend) {
    this.startDayOfWeekend = startDayOfWeekend;
  }

  
  /**
   * Minimum amount of consecutive time off per week that agents who are assigned this work plan are allowed to have off
   **/
  public WorkPlan minimumConsecutiveTimeOffPerWeekMinutes(Integer minimumConsecutiveTimeOffPerWeekMinutes) {
    this.minimumConsecutiveTimeOffPerWeekMinutes = minimumConsecutiveTimeOffPerWeekMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Minimum amount of consecutive time off per week that agents who are assigned this work plan are allowed to have off")
  @JsonProperty("minimumConsecutiveTimeOffPerWeekMinutes")
  public Integer getMinimumConsecutiveTimeOffPerWeekMinutes() {
    return minimumConsecutiveTimeOffPerWeekMinutes;
  }
  public void setMinimumConsecutiveTimeOffPerWeekMinutes(Integer minimumConsecutiveTimeOffPerWeekMinutes) {
    this.minimumConsecutiveTimeOffPerWeekMinutes = minimumConsecutiveTimeOffPerWeekMinutes;
  }

  
  /**
   * Whether to constrain the maximum consecutive working weekends
   **/
  public WorkPlan constrainMaximumConsecutiveWorkingWeekends(Boolean constrainMaximumConsecutiveWorkingWeekends) {
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
  public WorkPlan maximumConsecutiveWorkingWeekends(Integer maximumConsecutiveWorkingWeekends) {
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
  public WorkPlan minimumWorkingDaysPerWeek(Integer minimumWorkingDaysPerWeek) {
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
   * The maximum number of consecutive days that agents assigned to this work plan are allowed to work
   **/
  public WorkPlan maximumConsecutiveWorkingDays(Integer maximumConsecutiveWorkingDays) {
    this.maximumConsecutiveWorkingDays = maximumConsecutiveWorkingDays;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The maximum number of consecutive days that agents assigned to this work plan are allowed to work")
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
  public WorkPlan minimumShiftStartDistanceMinutes(Integer minimumShiftStartDistanceMinutes) {
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
  public WorkPlan minimumDaysOffPerPlanningPeriod(Integer minimumDaysOffPerPlanningPeriod) {
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
  public WorkPlan maximumDaysOffPerPlanningPeriod(Integer maximumDaysOffPerPlanningPeriod) {
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
   * Minimum paid hours in the planning period
   **/
  public WorkPlan minimumPaidHoursPerPlanningPeriod(Integer minimumPaidHoursPerPlanningPeriod) {
    this.minimumPaidHoursPerPlanningPeriod = minimumPaidHoursPerPlanningPeriod;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Minimum paid hours in the planning period")
  @JsonProperty("minimumPaidHoursPerPlanningPeriod")
  public Integer getMinimumPaidHoursPerPlanningPeriod() {
    return minimumPaidHoursPerPlanningPeriod;
  }
  public void setMinimumPaidHoursPerPlanningPeriod(Integer minimumPaidHoursPerPlanningPeriod) {
    this.minimumPaidHoursPerPlanningPeriod = minimumPaidHoursPerPlanningPeriod;
  }

  
  /**
   * Maximum paid hours in the planning period
   **/
  public WorkPlan maximumPaidHoursPerPlanningPeriod(Integer maximumPaidHoursPerPlanningPeriod) {
    this.maximumPaidHoursPerPlanningPeriod = maximumPaidHoursPerPlanningPeriod;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Maximum paid hours in the planning period")
  @JsonProperty("maximumPaidHoursPerPlanningPeriod")
  public Integer getMaximumPaidHoursPerPlanningPeriod() {
    return maximumPaidHoursPerPlanningPeriod;
  }
  public void setMaximumPaidHoursPerPlanningPeriod(Integer maximumPaidHoursPerPlanningPeriod) {
    this.maximumPaidHoursPerPlanningPeriod = maximumPaidHoursPerPlanningPeriod;
  }

  
  /**
   * Optional days to schedule for this work plan
   **/
  public WorkPlan optionalDays(SetWrapperDayOfWeek optionalDays) {
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
   * Variance in minutes among start times of shifts in this work plan
   **/
  public WorkPlan shiftStartVariances(ListWrapperShiftStartVariance shiftStartVariances) {
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
  public WorkPlan shifts(List<WorkPlanShift> shifts) {
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
  public WorkPlan agents(List<DeletableUserReference> agents) {
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
   * Version metadata for this work plan
   **/
  public WorkPlan metadata(WfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Version metadata for this work plan")
  @JsonProperty("metadata")
  public WfmVersionedEntityMetadata getMetadata() {
    return metadata;
  }
  public void setMetadata(WfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
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
    WorkPlan workPlan = (WorkPlan) o;
    return Objects.equals(this.id, workPlan.id) &&
        Objects.equals(this.name, workPlan.name) &&
        Objects.equals(this.enabled, workPlan.enabled) &&
        Objects.equals(this.constrainWeeklyPaidTime, workPlan.constrainWeeklyPaidTime) &&
        Objects.equals(this.flexibleWeeklyPaidTime, workPlan.flexibleWeeklyPaidTime) &&
        Objects.equals(this.weeklyExactPaidMinutes, workPlan.weeklyExactPaidMinutes) &&
        Objects.equals(this.weeklyMinimumPaidMinutes, workPlan.weeklyMinimumPaidMinutes) &&
        Objects.equals(this.weeklyMaximumPaidMinutes, workPlan.weeklyMaximumPaidMinutes) &&
        Objects.equals(this.constrainPaidTimeGranularity, workPlan.constrainPaidTimeGranularity) &&
        Objects.equals(this.paidTimeGranularityMinutes, workPlan.paidTimeGranularityMinutes) &&
        Objects.equals(this.constrainMinimumTimeBetweenShifts, workPlan.constrainMinimumTimeBetweenShifts) &&
        Objects.equals(this.minimumTimeBetweenShiftsMinutes, workPlan.minimumTimeBetweenShiftsMinutes) &&
        Objects.equals(this.maximumDays, workPlan.maximumDays) &&
        Objects.equals(this.startDayOfWeekend, workPlan.startDayOfWeekend) &&
        Objects.equals(this.minimumConsecutiveTimeOffPerWeekMinutes, workPlan.minimumConsecutiveTimeOffPerWeekMinutes) &&
        Objects.equals(this.constrainMaximumConsecutiveWorkingWeekends, workPlan.constrainMaximumConsecutiveWorkingWeekends) &&
        Objects.equals(this.maximumConsecutiveWorkingWeekends, workPlan.maximumConsecutiveWorkingWeekends) &&
        Objects.equals(this.minimumWorkingDaysPerWeek, workPlan.minimumWorkingDaysPerWeek) &&
        Objects.equals(this.maximumConsecutiveWorkingDays, workPlan.maximumConsecutiveWorkingDays) &&
        Objects.equals(this.minimumShiftStartDistanceMinutes, workPlan.minimumShiftStartDistanceMinutes) &&
        Objects.equals(this.minimumDaysOffPerPlanningPeriod, workPlan.minimumDaysOffPerPlanningPeriod) &&
        Objects.equals(this.maximumDaysOffPerPlanningPeriod, workPlan.maximumDaysOffPerPlanningPeriod) &&
        Objects.equals(this.minimumPaidHoursPerPlanningPeriod, workPlan.minimumPaidHoursPerPlanningPeriod) &&
        Objects.equals(this.maximumPaidHoursPerPlanningPeriod, workPlan.maximumPaidHoursPerPlanningPeriod) &&
        Objects.equals(this.optionalDays, workPlan.optionalDays) &&
        Objects.equals(this.shiftStartVariances, workPlan.shiftStartVariances) &&
        Objects.equals(this.shifts, workPlan.shifts) &&
        Objects.equals(this.agents, workPlan.agents) &&
        Objects.equals(this.metadata, workPlan.metadata) &&
        Objects.equals(this.selfUri, workPlan.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, enabled, constrainWeeklyPaidTime, flexibleWeeklyPaidTime, weeklyExactPaidMinutes, weeklyMinimumPaidMinutes, weeklyMaximumPaidMinutes, constrainPaidTimeGranularity, paidTimeGranularityMinutes, constrainMinimumTimeBetweenShifts, minimumTimeBetweenShiftsMinutes, maximumDays, startDayOfWeekend, minimumConsecutiveTimeOffPerWeekMinutes, constrainMaximumConsecutiveWorkingWeekends, maximumConsecutiveWorkingWeekends, minimumWorkingDaysPerWeek, maximumConsecutiveWorkingDays, minimumShiftStartDistanceMinutes, minimumDaysOffPerPlanningPeriod, maximumDaysOffPerPlanningPeriod, minimumPaidHoursPerPlanningPeriod, maximumPaidHoursPerPlanningPeriod, optionalDays, shiftStartVariances, shifts, agents, metadata, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkPlan {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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
    sb.append("    startDayOfWeekend: ").append(toIndentedString(startDayOfWeekend)).append("\n");
    sb.append("    minimumConsecutiveTimeOffPerWeekMinutes: ").append(toIndentedString(minimumConsecutiveTimeOffPerWeekMinutes)).append("\n");
    sb.append("    constrainMaximumConsecutiveWorkingWeekends: ").append(toIndentedString(constrainMaximumConsecutiveWorkingWeekends)).append("\n");
    sb.append("    maximumConsecutiveWorkingWeekends: ").append(toIndentedString(maximumConsecutiveWorkingWeekends)).append("\n");
    sb.append("    minimumWorkingDaysPerWeek: ").append(toIndentedString(minimumWorkingDaysPerWeek)).append("\n");
    sb.append("    maximumConsecutiveWorkingDays: ").append(toIndentedString(maximumConsecutiveWorkingDays)).append("\n");
    sb.append("    minimumShiftStartDistanceMinutes: ").append(toIndentedString(minimumShiftStartDistanceMinutes)).append("\n");
    sb.append("    minimumDaysOffPerPlanningPeriod: ").append(toIndentedString(minimumDaysOffPerPlanningPeriod)).append("\n");
    sb.append("    maximumDaysOffPerPlanningPeriod: ").append(toIndentedString(maximumDaysOffPerPlanningPeriod)).append("\n");
    sb.append("    minimumPaidHoursPerPlanningPeriod: ").append(toIndentedString(minimumPaidHoursPerPlanningPeriod)).append("\n");
    sb.append("    maximumPaidHoursPerPlanningPeriod: ").append(toIndentedString(maximumPaidHoursPerPlanningPeriod)).append("\n");
    sb.append("    optionalDays: ").append(toIndentedString(optionalDays)).append("\n");
    sb.append("    shiftStartVariances: ").append(toIndentedString(shiftStartVariances)).append("\n");
    sb.append("    shifts: ").append(toIndentedString(shifts)).append("\n");
    sb.append("    agents: ").append(toIndentedString(agents)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

