package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.UserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * Information containing details of a schedule run
 */
@ApiModel(description = "Information containing details of a schedule run")

public class SchedulingRunResponse  implements Serializable {
  
  private String runId = null;

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
   * ID of the schedule
   **/
  public SchedulingRunResponse scheduleId(String scheduleId) {
    this.scheduleId = scheduleId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ID of the schedule")
  @JsonProperty("scheduleId")
  public String getScheduleId() {
    return scheduleId;
  }
  public void setScheduleId(String scheduleId) {
    this.scheduleId = scheduleId;
  }

  
  /**
   * Description of the schedule run
   **/
  public SchedulingRunResponse scheduleDescription(String scheduleDescription) {
    this.scheduleDescription = scheduleDescription;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Description of the schedule run")
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
        Objects.equals(this.state, schedulingRunResponse.state) &&
        Objects.equals(this.percentComplete, schedulingRunResponse.percentComplete) &&
        Objects.equals(this.targetWeek, schedulingRunResponse.targetWeek) &&
        Objects.equals(this.scheduleId, schedulingRunResponse.scheduleId) &&
        Objects.equals(this.scheduleDescription, schedulingRunResponse.scheduleDescription) &&
        Objects.equals(this.schedulingStartTime, schedulingRunResponse.schedulingStartTime) &&
        Objects.equals(this.schedulingStartedBy, schedulingRunResponse.schedulingStartedBy) &&
        Objects.equals(this.schedulingCanceledBy, schedulingRunResponse.schedulingCanceledBy) &&
        Objects.equals(this.schedulingCompletedTime, schedulingRunResponse.schedulingCompletedTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(runId, state, percentComplete, targetWeek, scheduleId, scheduleDescription, schedulingStartTime, schedulingStartedBy, schedulingCanceledBy, schedulingCompletedTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SchedulingRunResponse {\n");
    
    sb.append("    runId: ").append(toIndentedString(runId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    percentComplete: ").append(toIndentedString(percentComplete)).append("\n");
    sb.append("    targetWeek: ").append(toIndentedString(targetWeek)).append("\n");
    sb.append("    scheduleId: ").append(toIndentedString(scheduleId)).append("\n");
    sb.append("    scheduleDescription: ").append(toIndentedString(scheduleDescription)).append("\n");
    sb.append("    schedulingStartTime: ").append(toIndentedString(schedulingStartTime)).append("\n");
    sb.append("    schedulingStartedBy: ").append(toIndentedString(schedulingStartedBy)).append("\n");
    sb.append("    schedulingCanceledBy: ").append(toIndentedString(schedulingCanceledBy)).append("\n");
    sb.append("    schedulingCompletedTime: ").append(toIndentedString(schedulingCompletedTime)).append("\n");
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

