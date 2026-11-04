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
import com.mypurecloud.sdk.v2.model.ActivityCodeReference;
import com.mypurecloud.sdk.v2.model.BuScheduleReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * SelfScheduleActivityMoveListItem
 */

public class SelfScheduleActivityMoveListItem  implements Serializable {
  
  private String id = null;
  private BuScheduleReference schedule = null;
  private String shiftId = null;

  private static class StateEnumDeserializer extends StdDeserializer<StateEnum> {
    public StateEnumDeserializer() {
      super(StateEnumDeserializer.class);
    }

    @Override
    public StateEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return StateEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The state of the self-schedule operation
   */
 @JsonDeserialize(using = StateEnumDeserializer.class)
  public enum StateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    APPROVED("Approved"),
    DENIED("Denied"),
    PENDING("Pending");

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

  private static class WorkflowStatusEnumDeserializer extends StdDeserializer<WorkflowStatusEnum> {
    public WorkflowStatusEnumDeserializer() {
      super(WorkflowStatusEnumDeserializer.class);
    }

    @Override
    public WorkflowStatusEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return WorkflowStatusEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The processing status of this self-schedule operation
   */
 @JsonDeserialize(using = WorkflowStatusEnumDeserializer.class)
  public enum WorkflowStatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ERROR("Error"),
    REVIEWING("Reviewing"),
    SCHEDULEUPDATED("ScheduleUpdated"),
    SCHEDULEUPDATING("ScheduleUpdating"),
    WAITINGFORREVIEW("WaitingForReview"),
    WAITINGFORSCHEDULEUPDATE("WaitingForScheduleUpdate");

    private String value;

    WorkflowStatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static WorkflowStatusEnum fromString(String key) {
      if (key == null) return null;

      for (WorkflowStatusEnum value : WorkflowStatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return WorkflowStatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private WorkflowStatusEnum workflowStatus = null;
  private Date startDate = null;
  private Date newDate = null;
  private Integer lengthMinutes = null;
  private ActivityCodeReference activityCode = null;
  private String selfUri = null;

  public SelfScheduleActivityMoveListItem() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public SelfScheduleActivityMoveListItem(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The globally unique identifier for the object.
   **/
  public SelfScheduleActivityMoveListItem id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * The schedule to which the shift and activity are associated
   **/
  public SelfScheduleActivityMoveListItem schedule(BuScheduleReference schedule) {
    this.schedule = schedule;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The schedule to which the shift and activity are associated")
  @JsonProperty("schedule")
  public BuScheduleReference getSchedule() {
    return schedule;
  }
  public void setSchedule(BuScheduleReference schedule) {
    this.schedule = schedule;
  }


  /**
   * The ID of the shift to which this activity is associated
   **/
  public SelfScheduleActivityMoveListItem shiftId(String shiftId) {
    this.shiftId = shiftId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the shift to which this activity is associated")
  @JsonProperty("shiftId")
  public String getShiftId() {
    return shiftId;
  }
  public void setShiftId(String shiftId) {
    this.shiftId = shiftId;
  }


  /**
   * The state of the self-schedule operation
   **/
  public SelfScheduleActivityMoveListItem state(StateEnum state) {
    this.state = state;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The state of the self-schedule operation")
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }


  /**
   * The processing status of this self-schedule operation
   **/
  public SelfScheduleActivityMoveListItem workflowStatus(WorkflowStatusEnum workflowStatus) {
    this.workflowStatus = workflowStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The processing status of this self-schedule operation")
  @JsonProperty("workflowStatus")
  public WorkflowStatusEnum getWorkflowStatus() {
    return workflowStatus;
  }
  public void setWorkflowStatus(WorkflowStatusEnum workflowStatus) {
    this.workflowStatus = workflowStatus;
  }


  /**
   * The original start date of this activity in ISO-8601 format
   **/
  public SelfScheduleActivityMoveListItem startDate(Date startDate) {
    this.startDate = startDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The original start date of this activity in ISO-8601 format")
  @JsonProperty("startDate")
  public Date getStartDate() {
    return startDate;
  }
  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }


  /**
   * The new start date of this activity in ISO-8601 format
   **/
  public SelfScheduleActivityMoveListItem newDate(Date newDate) {
    this.newDate = newDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The new start date of this activity in ISO-8601 format")
  @JsonProperty("newDate")
  public Date getNewDate() {
    return newDate;
  }
  public void setNewDate(Date newDate) {
    this.newDate = newDate;
  }


  /**
   * The length of this activity in minutes
   **/
  public SelfScheduleActivityMoveListItem lengthMinutes(Integer lengthMinutes) {
    this.lengthMinutes = lengthMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The length of this activity in minutes")
  @JsonProperty("lengthMinutes")
  public Integer getLengthMinutes() {
    return lengthMinutes;
  }
  public void setLengthMinutes(Integer lengthMinutes) {
    this.lengthMinutes = lengthMinutes;
  }


  /**
   * The activity code related to this shift
   **/
  public SelfScheduleActivityMoveListItem activityCode(ActivityCodeReference activityCode) {
    this.activityCode = activityCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The activity code related to this shift")
  @JsonProperty("activityCode")
  public ActivityCodeReference getActivityCode() {
    return activityCode;
  }
  public void setActivityCode(ActivityCodeReference activityCode) {
    this.activityCode = activityCode;
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
    SelfScheduleActivityMoveListItem selfScheduleActivityMoveListItem = (SelfScheduleActivityMoveListItem) o;

    return Objects.equals(this.id, selfScheduleActivityMoveListItem.id) &&
            Objects.equals(this.schedule, selfScheduleActivityMoveListItem.schedule) &&
            Objects.equals(this.shiftId, selfScheduleActivityMoveListItem.shiftId) &&
            Objects.equals(this.state, selfScheduleActivityMoveListItem.state) &&
            Objects.equals(this.workflowStatus, selfScheduleActivityMoveListItem.workflowStatus) &&
            Objects.equals(this.startDate, selfScheduleActivityMoveListItem.startDate) &&
            Objects.equals(this.newDate, selfScheduleActivityMoveListItem.newDate) &&
            Objects.equals(this.lengthMinutes, selfScheduleActivityMoveListItem.lengthMinutes) &&
            Objects.equals(this.activityCode, selfScheduleActivityMoveListItem.activityCode) &&
            Objects.equals(this.selfUri, selfScheduleActivityMoveListItem.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, schedule, shiftId, state, workflowStatus, startDate, newDate, lengthMinutes, activityCode, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SelfScheduleActivityMoveListItem {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    shiftId: ").append(toIndentedString(shiftId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    workflowStatus: ").append(toIndentedString(workflowStatus)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    newDate: ").append(toIndentedString(newDate)).append("\n");
    sb.append("    lengthMinutes: ").append(toIndentedString(lengthMinutes)).append("\n");
    sb.append("    activityCode: ").append(toIndentedString(activityCode)).append("\n");
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

