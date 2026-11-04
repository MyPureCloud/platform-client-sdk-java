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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * AnalyticsAgentStateAgentWorkitemResult
 */

public class AnalyticsAgentStateAgentWorkitemResult  implements Serializable {
  
  private String id = null;
  private String queueId = null;
  private String divisionId = null;
  private String typeId = null;
  private String workbinId = null;
  private Date dateDue = null;
  private Date dateExpires = null;
  private String statusId = null;

  private static class StatusCategoryEnumDeserializer extends StdDeserializer<StatusCategoryEnum> {
    public StatusCategoryEnumDeserializer() {
      super(StatusCategoryEnumDeserializer.class);
    }

    @Override
    public StatusCategoryEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return StatusCategoryEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The category of the current status of the workitem
   */
 @JsonDeserialize(using = StatusCategoryEnumDeserializer.class)
  public enum StatusCategoryEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    OPEN("Open"),
    INPROGRESS("InProgress"),
    WAITING("Waiting"),
    CLOSED("Closed"),
    UNKNOWN("Unknown");

    private String value;

    StatusCategoryEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StatusCategoryEnum fromString(String key) {
      if (key == null) return null;

      for (StatusCategoryEnum value : StatusCategoryEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StatusCategoryEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StatusCategoryEnum statusCategory = null;
  private Date dateStatusChanged = null;
  private Integer priority = null;

  private static class AssignmentStateEnumDeserializer extends StdDeserializer<AssignmentStateEnum> {
    public AssignmentStateEnumDeserializer() {
      super(AssignmentStateEnumDeserializer.class);
    }

    @Override
    public AssignmentStateEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return AssignmentStateEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Assignment state of the workitem
   */
 @JsonDeserialize(using = AssignmentStateEnumDeserializer.class)
  public enum AssignmentStateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("Unknown"),
    ACDSTARTED("AcdStarted"),
    ALERTING("Alerting"),
    ALERTTIMEOUT("AlertTimeout"),
    ACDCANCELLED("AcdCancelled"),
    TERMINATED("Terminated"),
    IDLE("Idle"),
    DECLINED("Declined"),
    CONNECTED("Connected"),
    DISCONNECTED("Disconnected"),
    PARKED("Parked"),
    HELD("Held"),
    ACDEXPIRED("AcdExpired");

    private String value;

    AssignmentStateEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static AssignmentStateEnum fromString(String key) {
      if (key == null) return null;

      for (AssignmentStateEnum value : AssignmentStateEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return AssignmentStateEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private AssignmentStateEnum assignmentState = null;
  private Date dateAssignmentStateChanged = null;
  private Date dateCreated = null;

  public AnalyticsAgentStateAgentWorkitemResult() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public AnalyticsAgentStateAgentWorkitemResult(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * Workitem Id
   **/
  public AnalyticsAgentStateAgentWorkitemResult id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Workitem Id")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * The Id of the queue used for routing the workitem
   **/
  public AnalyticsAgentStateAgentWorkitemResult queueId(String queueId) {
    this.queueId = queueId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Id of the queue used for routing the workitem")
  @JsonProperty("queueId")
  public String getQueueId() {
    return queueId;
  }
  public void setQueueId(String queueId) {
    this.queueId = queueId;
  }


  /**
   * The Id of the division the workitem belongs to
   **/
  public AnalyticsAgentStateAgentWorkitemResult divisionId(String divisionId) {
    this.divisionId = divisionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Id of the division the workitem belongs to")
  @JsonProperty("divisionId")
  public String getDivisionId() {
    return divisionId;
  }
  public void setDivisionId(String divisionId) {
    this.divisionId = divisionId;
  }


  /**
   * The Id of the worktype of the workitem
   **/
  public AnalyticsAgentStateAgentWorkitemResult typeId(String typeId) {
    this.typeId = typeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Id of the worktype of the workitem")
  @JsonProperty("typeId")
  public String getTypeId() {
    return typeId;
  }
  public void setTypeId(String typeId) {
    this.typeId = typeId;
  }


  /**
   * The Id of the workbin the workitem is placed in
   **/
  public AnalyticsAgentStateAgentWorkitemResult workbinId(String workbinId) {
    this.workbinId = workbinId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Id of the workbin the workitem is placed in")
  @JsonProperty("workbinId")
  public String getWorkbinId() {
    return workbinId;
  }
  public void setWorkbinId(String workbinId) {
    this.workbinId = workbinId;
  }


  /**
   * Due datetime of the workitem. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public AnalyticsAgentStateAgentWorkitemResult dateDue(Date dateDue) {
    this.dateDue = dateDue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Due datetime of the workitem. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateDue")
  public Date getDateDue() {
    return dateDue;
  }
  public void setDateDue(Date dateDue) {
    this.dateDue = dateDue;
  }


  /**
   * Expiry datetime of the workitem. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public AnalyticsAgentStateAgentWorkitemResult dateExpires(Date dateExpires) {
    this.dateExpires = dateExpires;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Expiry datetime of the workitem. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateExpires")
  public Date getDateExpires() {
    return dateExpires;
  }
  public void setDateExpires(Date dateExpires) {
    this.dateExpires = dateExpires;
  }


  /**
   * The Id of the current status of the workitem
   **/
  public AnalyticsAgentStateAgentWorkitemResult statusId(String statusId) {
    this.statusId = statusId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Id of the current status of the workitem")
  @JsonProperty("statusId")
  public String getStatusId() {
    return statusId;
  }
  public void setStatusId(String statusId) {
    this.statusId = statusId;
  }


  /**
   * The category of the current status of the workitem
   **/
  public AnalyticsAgentStateAgentWorkitemResult statusCategory(StatusCategoryEnum statusCategory) {
    this.statusCategory = statusCategory;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The category of the current status of the workitem")
  @JsonProperty("statusCategory")
  public StatusCategoryEnum getStatusCategory() {
    return statusCategory;
  }
  public void setStatusCategory(StatusCategoryEnum statusCategory) {
    this.statusCategory = statusCategory;
  }


  /**
   * Datetime the status of the workitem last changed. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public AnalyticsAgentStateAgentWorkitemResult dateStatusChanged(Date dateStatusChanged) {
    this.dateStatusChanged = dateStatusChanged;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Datetime the status of the workitem last changed. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateStatusChanged")
  public Date getDateStatusChanged() {
    return dateStatusChanged;
  }
  public void setDateStatusChanged(Date dateStatusChanged) {
    this.dateStatusChanged = dateStatusChanged;
  }


  /**
   * Priority of the workitem
   **/
  public AnalyticsAgentStateAgentWorkitemResult priority(Integer priority) {
    this.priority = priority;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Priority of the workitem")
  @JsonProperty("priority")
  public Integer getPriority() {
    return priority;
  }
  public void setPriority(Integer priority) {
    this.priority = priority;
  }


  /**
   * Assignment state of the workitem
   **/
  public AnalyticsAgentStateAgentWorkitemResult assignmentState(AssignmentStateEnum assignmentState) {
    this.assignmentState = assignmentState;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Assignment state of the workitem")
  @JsonProperty("assignmentState")
  public AssignmentStateEnum getAssignmentState() {
    return assignmentState;
  }
  public void setAssignmentState(AssignmentStateEnum assignmentState) {
    this.assignmentState = assignmentState;
  }


  /**
   * Datetime the assignment state of the workitem last changed. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public AnalyticsAgentStateAgentWorkitemResult dateAssignmentStateChanged(Date dateAssignmentStateChanged) {
    this.dateAssignmentStateChanged = dateAssignmentStateChanged;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Datetime the assignment state of the workitem last changed. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateAssignmentStateChanged")
  public Date getDateAssignmentStateChanged() {
    return dateAssignmentStateChanged;
  }
  public void setDateAssignmentStateChanged(Date dateAssignmentStateChanged) {
    this.dateAssignmentStateChanged = dateAssignmentStateChanged;
  }


  /**
   * Creation datetime of the workitem. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public AnalyticsAgentStateAgentWorkitemResult dateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Creation datetime of the workitem. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsAgentStateAgentWorkitemResult analyticsAgentStateAgentWorkitemResult = (AnalyticsAgentStateAgentWorkitemResult) o;

    return Objects.equals(this.id, analyticsAgentStateAgentWorkitemResult.id) &&
            Objects.equals(this.queueId, analyticsAgentStateAgentWorkitemResult.queueId) &&
            Objects.equals(this.divisionId, analyticsAgentStateAgentWorkitemResult.divisionId) &&
            Objects.equals(this.typeId, analyticsAgentStateAgentWorkitemResult.typeId) &&
            Objects.equals(this.workbinId, analyticsAgentStateAgentWorkitemResult.workbinId) &&
            Objects.equals(this.dateDue, analyticsAgentStateAgentWorkitemResult.dateDue) &&
            Objects.equals(this.dateExpires, analyticsAgentStateAgentWorkitemResult.dateExpires) &&
            Objects.equals(this.statusId, analyticsAgentStateAgentWorkitemResult.statusId) &&
            Objects.equals(this.statusCategory, analyticsAgentStateAgentWorkitemResult.statusCategory) &&
            Objects.equals(this.dateStatusChanged, analyticsAgentStateAgentWorkitemResult.dateStatusChanged) &&
            Objects.equals(this.priority, analyticsAgentStateAgentWorkitemResult.priority) &&
            Objects.equals(this.assignmentState, analyticsAgentStateAgentWorkitemResult.assignmentState) &&
            Objects.equals(this.dateAssignmentStateChanged, analyticsAgentStateAgentWorkitemResult.dateAssignmentStateChanged) &&
            Objects.equals(this.dateCreated, analyticsAgentStateAgentWorkitemResult.dateCreated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, queueId, divisionId, typeId, workbinId, dateDue, dateExpires, statusId, statusCategory, dateStatusChanged, priority, assignmentState, dateAssignmentStateChanged, dateCreated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsAgentStateAgentWorkitemResult {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    queueId: ").append(toIndentedString(queueId)).append("\n");
    sb.append("    divisionId: ").append(toIndentedString(divisionId)).append("\n");
    sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
    sb.append("    workbinId: ").append(toIndentedString(workbinId)).append("\n");
    sb.append("    dateDue: ").append(toIndentedString(dateDue)).append("\n");
    sb.append("    dateExpires: ").append(toIndentedString(dateExpires)).append("\n");
    sb.append("    statusId: ").append(toIndentedString(statusId)).append("\n");
    sb.append("    statusCategory: ").append(toIndentedString(statusCategory)).append("\n");
    sb.append("    dateStatusChanged: ").append(toIndentedString(dateStatusChanged)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    assignmentState: ").append(toIndentedString(assignmentState)).append("\n");
    sb.append("    dateAssignmentStateChanged: ").append(toIndentedString(dateAssignmentStateChanged)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
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

