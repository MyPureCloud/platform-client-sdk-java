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
import com.mypurecloud.sdk.v2.model.WorkitemsUserEventsNotificationAssignmentSegment;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * WorkitemsUserEventsNotificationSession
 */

public class WorkitemsUserEventsNotificationSession  implements Serializable {
  

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
   * Gets or Sets type
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("Unknown"),
    AGENT("Agent"),
    QUEUEASSIGNMENT("QueueAssignment"),
    DIRECTASSIGNMENT("DirectAssignment"),
    AGENTCOMPLETE("AgentComplete");

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
  private String id = null;

  private static class StatusEnumDeserializer extends StdDeserializer<StatusEnum> {
    public StatusEnumDeserializer() {
      super(StatusEnumDeserializer.class);
    }

    @Override
    public StatusEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return StatusEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets status
   */
 @JsonDeserialize(using = StatusEnumDeserializer.class)
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("Unknown"),
    ACTIVE("Active"),
    COMPLETED("Completed");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StatusEnum fromString(String key) {
      if (key == null) return null;

      for (StatusEnum value : StatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StatusEnum status = null;
  private String dateSessionStart = null;
  private String dateSessionEnd = null;
  private List<WorkitemsUserEventsNotificationAssignmentSegment> assignmentSegments = null;

  public WorkitemsUserEventsNotificationSession() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      assignmentSegments = new ArrayList<WorkitemsUserEventsNotificationAssignmentSegment>();
    }
  }

  
  /**
   **/
  public WorkitemsUserEventsNotificationSession type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   **/
  public WorkitemsUserEventsNotificationSession id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   **/
  public WorkitemsUserEventsNotificationSession status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  /**
   **/
  public WorkitemsUserEventsNotificationSession dateSessionStart(String dateSessionStart) {
    this.dateSessionStart = dateSessionStart;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dateSessionStart")
  public String getDateSessionStart() {
    return dateSessionStart;
  }
  public void setDateSessionStart(String dateSessionStart) {
    this.dateSessionStart = dateSessionStart;
  }


  /**
   **/
  public WorkitemsUserEventsNotificationSession dateSessionEnd(String dateSessionEnd) {
    this.dateSessionEnd = dateSessionEnd;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dateSessionEnd")
  public String getDateSessionEnd() {
    return dateSessionEnd;
  }
  public void setDateSessionEnd(String dateSessionEnd) {
    this.dateSessionEnd = dateSessionEnd;
  }


  /**
   **/
  public WorkitemsUserEventsNotificationSession assignmentSegments(List<WorkitemsUserEventsNotificationAssignmentSegment> assignmentSegments) {
    this.assignmentSegments = assignmentSegments;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("assignmentSegments")
  public List<WorkitemsUserEventsNotificationAssignmentSegment> getAssignmentSegments() {
    return assignmentSegments;
  }
  public void setAssignmentSegments(List<WorkitemsUserEventsNotificationAssignmentSegment> assignmentSegments) {
    this.assignmentSegments = assignmentSegments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkitemsUserEventsNotificationSession workitemsUserEventsNotificationSession = (WorkitemsUserEventsNotificationSession) o;

    return Objects.equals(this.type, workitemsUserEventsNotificationSession.type) &&
            Objects.equals(this.id, workitemsUserEventsNotificationSession.id) &&
            Objects.equals(this.status, workitemsUserEventsNotificationSession.status) &&
            Objects.equals(this.dateSessionStart, workitemsUserEventsNotificationSession.dateSessionStart) &&
            Objects.equals(this.dateSessionEnd, workitemsUserEventsNotificationSession.dateSessionEnd) &&
            Objects.equals(this.assignmentSegments, workitemsUserEventsNotificationSession.assignmentSegments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, id, status, dateSessionStart, dateSessionEnd, assignmentSegments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkitemsUserEventsNotificationSession {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    dateSessionStart: ").append(toIndentedString(dateSessionStart)).append("\n");
    sb.append("    dateSessionEnd: ").append(toIndentedString(dateSessionEnd)).append("\n");
    sb.append("    assignmentSegments: ").append(toIndentedString(assignmentSegments)).append("\n");
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

