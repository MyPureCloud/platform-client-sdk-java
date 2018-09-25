package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.ReschedulingOptionsResponse;
import com.mypurecloud.sdk.v2.model.UnscheduledAgentWarning;
import com.mypurecloud.sdk.v2.model.UserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * Information containing details of a schedule run
 */
@ApiModel(description = "Information containing details of a schedule run")

public class SchedulingRunResponse  implements Serializable {
  
  private String runId = null;
  private String schedulerRunId = null;
  private Boolean intradayRescheduling = null;

  /**
   * Status of the schedule run
   */
  public enum StateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    NONE("None"),
    QUEUED("Queued"),
    SCHEDULING("Scheduling"),
    CANCELED("Canceled"),
    FAILED("Failed"),
    COMPLETE("Complete");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StateEnum fromString(String key) {
      if (key == null) return null;

      for (StateEnum value : StateEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StateEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StateEnum state = null;
  private Double percentComplete = null;
  private String targetWeek = null;
  private String scheduleId = null;
  private String scheduleDescription = null;
  private Date schedulingStartTime = null;
  private UserReference schedulingStartedBy = null;
  private UserReference schedulingCanceledBy = null;
  private Date schedulingCompletedTime = null;
  private ReschedulingOptionsResponse reschedulingOptions = null;
  private Date reschedulingResultExpiration = null;
  private Boolean applied = null;
  private List<UnscheduledAgentWarning> unscheduledAgents = new ArrayList<UnscheduledAgentWarning>();

  
  /**
   * ID of the schedule run
   **/
  public SchedulingRunResponse runId(String runId) {
    this.runId = runId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ID of the schedule run")
  @JsonProperty("runId")
  public String getRunId() {
    return runId;
  }
  public void setRunId(String runId) {
    this.runId = runId;
  }

  
  /**
   * The runId from scheduler service.  Useful for debugging schedule errors
   **/
  public SchedulingRunResponse schedulerRunId(String schedulerRunId) {
    this.schedulerRunId = schedulerRunId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The runId from scheduler service.  Useful for debugging schedule errors")
  @JsonProperty("schedulerRunId")
  public String getSchedulerRunId() {
    return schedulerRunId;
  }
  public void setSchedulerRunId(String schedulerRunId) {
    this.schedulerRunId = schedulerRunId;
  }

  
  /**
   * Whether this is the result of a rescheduling request
   **/
  public SchedulingRunResponse intradayRescheduling(Boolean intradayRescheduling) {
    this.intradayRescheduling = intradayRescheduling;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether this is the result of a rescheduling request")
  @JsonProperty("intradayRescheduling")
  public Boolean getIntradayRescheduling() {
    return intradayRescheduling;
  }
  public void setIntradayRescheduling(Boolean intradayRescheduling) {
    this.intradayRescheduling = intradayRescheduling;
  }

  
  /**
   * Status of the schedule run
   **/
  public SchedulingRunResponse state(StateEnum state) {
    this.state = state;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Status of the schedule run")
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }

  
  /**
   * Completion percentage of the schedule run
   **/
  public SchedulingRunResponse percentComplete(Double percentComplete) {
    this.percentComplete = percentComplete;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Completion percentage of the schedule run")
  @JsonProperty("percentComplete")
  public Double getPercentComplete() {
    return percentComplete;
  }
  public void setPercentComplete(Double percentComplete) {
    this.percentComplete = percentComplete;
  }

  
  /**
   * The start date of the week for which the scheduling is done in yyyy-MM-dd format
   **/
  public SchedulingRunResponse targetWeek(String targetWeek) {
    this.targetWeek = targetWeek;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The start date of the week for which the scheduling is done in yyyy-MM-dd format")
  @JsonProperty("targetWeek")
  public String getTargetWeek() {
    return targetWeek;
  }
  public void setTargetWeek(String targetWeek) {
    this.targetWeek = targetWeek;
  }

  
  /**
   * ID of the schedule. Does not apply to reschedule, see reschedulingOptions.existingScheduleId
   **/
  public SchedulingRunResponse scheduleId(String scheduleId) {
    this.scheduleId = scheduleId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ID of the schedule. Does not apply to reschedule, see reschedulingOptions.existingScheduleId")
  @JsonProperty("scheduleId")
  public String getScheduleId() {
    return scheduleId;
  }
  public void setScheduleId(String scheduleId) {
    this.scheduleId = scheduleId;
  }

  
  /**
   * Description of the schedule
   **/
  public SchedulingRunResponse scheduleDescription(String scheduleDescription) {
    this.scheduleDescription = scheduleDescription;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Description of the schedule")
  @JsonProperty("scheduleDescription")
  public String getScheduleDescription() {
    return scheduleDescription;
  }
  public void setScheduleDescription(String scheduleDescription) {
    this.scheduleDescription = scheduleDescription;
  }

  
  /**
   * Start time of the schedule run. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  public SchedulingRunResponse schedulingStartTime(Date schedulingStartTime) {
    this.schedulingStartTime = schedulingStartTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Start time of the schedule run. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("schedulingStartTime")
  public Date getSchedulingStartTime() {
    return schedulingStartTime;
  }
  public void setSchedulingStartTime(Date schedulingStartTime) {
    this.schedulingStartTime = schedulingStartTime;
  }

  
  /**
   * User that started the schedule run
   **/
  public SchedulingRunResponse schedulingStartedBy(UserReference schedulingStartedBy) {
    this.schedulingStartedBy = schedulingStartedBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "User that started the schedule run")
  @JsonProperty("schedulingStartedBy")
  public UserReference getSchedulingStartedBy() {
    return schedulingStartedBy;
  }
  public void setSchedulingStartedBy(UserReference schedulingStartedBy) {
    this.schedulingStartedBy = schedulingStartedBy;
  }

  
  /**
   * User that canceled the schedule run
   **/
  public SchedulingRunResponse schedulingCanceledBy(UserReference schedulingCanceledBy) {
    this.schedulingCanceledBy = schedulingCanceledBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "User that canceled the schedule run")
  @JsonProperty("schedulingCanceledBy")
  public UserReference getSchedulingCanceledBy() {
    return schedulingCanceledBy;
  }
  public void setSchedulingCanceledBy(UserReference schedulingCanceledBy) {
    this.schedulingCanceledBy = schedulingCanceledBy;
  }

  
  /**
   * Time at which the scheduling run was completed. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  public SchedulingRunResponse schedulingCompletedTime(Date schedulingCompletedTime) {
    this.schedulingCompletedTime = schedulingCompletedTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Time at which the scheduling run was completed. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("schedulingCompletedTime")
  public Date getSchedulingCompletedTime() {
    return schedulingCompletedTime;
  }
  public void setSchedulingCompletedTime(Date schedulingCompletedTime) {
    this.schedulingCompletedTime = schedulingCompletedTime;
  }

  
  /**
   * The selected options for the reschedule request. Will always be null if intradayRescheduling is false
   **/
  public SchedulingRunResponse reschedulingOptions(ReschedulingOptionsResponse reschedulingOptions) {
    this.reschedulingOptions = reschedulingOptions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The selected options for the reschedule request. Will always be null if intradayRescheduling is false")
  @JsonProperty("reschedulingOptions")
  public ReschedulingOptionsResponse getReschedulingOptions() {
    return reschedulingOptions;
  }
  public void setReschedulingOptions(ReschedulingOptionsResponse reschedulingOptions) {
    this.reschedulingOptions = reschedulingOptions;
  }

  
  /**
   * When the rescheduling result data will expire. Results are kept temporarily as they should be applied as soon as possible after the run finishes.  Will always be null if intradayRescheduling is false. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  public SchedulingRunResponse reschedulingResultExpiration(Date reschedulingResultExpiration) {
    this.reschedulingResultExpiration = reschedulingResultExpiration;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "When the rescheduling result data will expire. Results are kept temporarily as they should be applied as soon as possible after the run finishes.  Will always be null if intradayRescheduling is false. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("reschedulingResultExpiration")
  public Date getReschedulingResultExpiration() {
    return reschedulingResultExpiration;
  }
  public void setReschedulingResultExpiration(Date reschedulingResultExpiration) {
    this.reschedulingResultExpiration = reschedulingResultExpiration;
  }

  
  /**
   * Whether the rescheduling run has been marked applied
   **/
  public SchedulingRunResponse applied(Boolean applied) {
    this.applied = applied;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether the rescheduling run has been marked applied")
  @JsonProperty("applied")
  public Boolean getApplied() {
    return applied;
  }
  public void setApplied(Boolean applied) {
    this.applied = applied;
  }

  
  /**
   * Agents that were not scheduled in the rescheduling operation. Will always be null if intradayRescheduling is false
   **/
  public SchedulingRunResponse unscheduledAgents(List<UnscheduledAgentWarning> unscheduledAgents) {
    this.unscheduledAgents = unscheduledAgents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Agents that were not scheduled in the rescheduling operation. Will always be null if intradayRescheduling is false")
  @JsonProperty("unscheduledAgents")
  public List<UnscheduledAgentWarning> getUnscheduledAgents() {
    return unscheduledAgents;
  }
  public void setUnscheduledAgents(List<UnscheduledAgentWarning> unscheduledAgents) {
    this.unscheduledAgents = unscheduledAgents;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SchedulingRunResponse schedulingRunResponse = (SchedulingRunResponse) o;
    return Objects.equals(this.runId, schedulingRunResponse.runId) &&
        Objects.equals(this.schedulerRunId, schedulingRunResponse.schedulerRunId) &&
        Objects.equals(this.intradayRescheduling, schedulingRunResponse.intradayRescheduling) &&
        Objects.equals(this.state, schedulingRunResponse.state) &&
        Objects.equals(this.percentComplete, schedulingRunResponse.percentComplete) &&
        Objects.equals(this.targetWeek, schedulingRunResponse.targetWeek) &&
        Objects.equals(this.scheduleId, schedulingRunResponse.scheduleId) &&
        Objects.equals(this.scheduleDescription, schedulingRunResponse.scheduleDescription) &&
        Objects.equals(this.schedulingStartTime, schedulingRunResponse.schedulingStartTime) &&
        Objects.equals(this.schedulingStartedBy, schedulingRunResponse.schedulingStartedBy) &&
        Objects.equals(this.schedulingCanceledBy, schedulingRunResponse.schedulingCanceledBy) &&
        Objects.equals(this.schedulingCompletedTime, schedulingRunResponse.schedulingCompletedTime) &&
        Objects.equals(this.reschedulingOptions, schedulingRunResponse.reschedulingOptions) &&
        Objects.equals(this.reschedulingResultExpiration, schedulingRunResponse.reschedulingResultExpiration) &&
        Objects.equals(this.applied, schedulingRunResponse.applied) &&
        Objects.equals(this.unscheduledAgents, schedulingRunResponse.unscheduledAgents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(runId, schedulerRunId, intradayRescheduling, state, percentComplete, targetWeek, scheduleId, scheduleDescription, schedulingStartTime, schedulingStartedBy, schedulingCanceledBy, schedulingCompletedTime, reschedulingOptions, reschedulingResultExpiration, applied, unscheduledAgents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SchedulingRunResponse {\n");
    
    sb.append("    runId: ").append(toIndentedString(runId)).append("\n");
    sb.append("    schedulerRunId: ").append(toIndentedString(schedulerRunId)).append("\n");
    sb.append("    intradayRescheduling: ").append(toIndentedString(intradayRescheduling)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    percentComplete: ").append(toIndentedString(percentComplete)).append("\n");
    sb.append("    targetWeek: ").append(toIndentedString(targetWeek)).append("\n");
    sb.append("    scheduleId: ").append(toIndentedString(scheduleId)).append("\n");
    sb.append("    scheduleDescription: ").append(toIndentedString(scheduleDescription)).append("\n");
    sb.append("    schedulingStartTime: ").append(toIndentedString(schedulingStartTime)).append("\n");
    sb.append("    schedulingStartedBy: ").append(toIndentedString(schedulingStartedBy)).append("\n");
    sb.append("    schedulingCanceledBy: ").append(toIndentedString(schedulingCanceledBy)).append("\n");
    sb.append("    schedulingCompletedTime: ").append(toIndentedString(schedulingCompletedTime)).append("\n");
    sb.append("    reschedulingOptions: ").append(toIndentedString(reschedulingOptions)).append("\n");
    sb.append("    reschedulingResultExpiration: ").append(toIndentedString(reschedulingResultExpiration)).append("\n");
    sb.append("    applied: ").append(toIndentedString(applied)).append("\n");
    sb.append("    unscheduledAgents: ").append(toIndentedString(unscheduledAgents)).append("\n");
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

