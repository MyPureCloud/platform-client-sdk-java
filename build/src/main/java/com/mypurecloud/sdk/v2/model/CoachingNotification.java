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
import com.mypurecloud.sdk.v2.model.CoachingAppointmentResponse;
import com.mypurecloud.sdk.v2.model.UserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * CoachingNotification
 */

public class CoachingNotification  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Boolean markedAsRead = null;

  private static class ActionTypeEnumDeserializer extends StdDeserializer<ActionTypeEnum> {
    public ActionTypeEnumDeserializer() {
      super(ActionTypeEnumDeserializer.class);
    }

    @Override
    public ActionTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ActionTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Action causing the notification.
   */
 @JsonDeserialize(using = ActionTypeEnumDeserializer.class)
  public enum ActionTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    CREATE("Create"),
    UPDATE("Update"),
    DELETE("Delete"),
    STATUSCHANGE("StatusChange");

    private String value;

    ActionTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ActionTypeEnum fromString(String key) {
      if (key == null) return null;

      for (ActionTypeEnum value : ActionTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ActionTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ActionTypeEnum actionType = null;

  private static class RelationshipEnumDeserializer extends StdDeserializer<RelationshipEnum> {
    public RelationshipEnumDeserializer() {
      super(RelationshipEnumDeserializer.class);
    }

    @Override
    public RelationshipEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return RelationshipEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The relationship of this user to this notification's appointment
   */
 @JsonDeserialize(using = RelationshipEnumDeserializer.class)
  public enum RelationshipEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ATTENDEE("Attendee"),
    CREATOR("Creator"),
    FACILITATOR("Facilitator");

    private String value;

    RelationshipEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static RelationshipEnum fromString(String key) {
      if (key == null) return null;

      for (RelationshipEnum value : RelationshipEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return RelationshipEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private RelationshipEnum relationship = null;
  private Date dateStart = null;
  private Integer lengthInMinutes = null;

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
   * The status of the appointment for this notification
   */
 @JsonDeserialize(using = StatusEnumDeserializer.class)
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    SCHEDULED("Scheduled"),
    INPROGRESS("InProgress"),
    COMPLETED("Completed"),
    INVALIDSCHEDULE("InvalidSchedule");

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
  private UserReference user = null;
  private CoachingAppointmentResponse appointment = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  @ApiModelProperty(example = "null", value = "The name of the appointment for this notification.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  
  /**
   * Indicates if notification is read or unread
   **/
  public CoachingNotification markedAsRead(Boolean markedAsRead) {
    this.markedAsRead = markedAsRead;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates if notification is read or unread")
  @JsonProperty("markedAsRead")
  public Boolean getMarkedAsRead() {
    return markedAsRead;
  }
  public void setMarkedAsRead(Boolean markedAsRead) {
    this.markedAsRead = markedAsRead;
  }

  
  @ApiModelProperty(example = "null", value = "Action causing the notification.")
  @JsonProperty("actionType")
  public ActionTypeEnum getActionType() {
    return actionType;
  }

  
  @ApiModelProperty(example = "null", value = "The relationship of this user to this notification's appointment")
  @JsonProperty("relationship")
  public RelationshipEnum getRelationship() {
    return relationship;
  }

  
  @ApiModelProperty(example = "null", value = "The start time of the appointment relating to this notification. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateStart")
  public Date getDateStart() {
    return dateStart;
  }

  
  @ApiModelProperty(example = "null", value = "The duration of the appointment on this notification")
  @JsonProperty("lengthInMinutes")
  public Integer getLengthInMinutes() {
    return lengthInMinutes;
  }

  
  @ApiModelProperty(example = "null", value = "The status of the appointment for this notification")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  
  @ApiModelProperty(example = "null", value = "The user of this notification")
  @JsonProperty("user")
  public UserReference getUser() {
    return user;
  }

  
  @ApiModelProperty(example = "null", value = "The appointment")
  @JsonProperty("appointment")
  public CoachingAppointmentResponse getAppointment() {
    return appointment;
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
    CoachingNotification coachingNotification = (CoachingNotification) o;
    return Objects.equals(this.id, coachingNotification.id) &&
        Objects.equals(this.name, coachingNotification.name) &&
        Objects.equals(this.markedAsRead, coachingNotification.markedAsRead) &&
        Objects.equals(this.actionType, coachingNotification.actionType) &&
        Objects.equals(this.relationship, coachingNotification.relationship) &&
        Objects.equals(this.dateStart, coachingNotification.dateStart) &&
        Objects.equals(this.lengthInMinutes, coachingNotification.lengthInMinutes) &&
        Objects.equals(this.status, coachingNotification.status) &&
        Objects.equals(this.user, coachingNotification.user) &&
        Objects.equals(this.appointment, coachingNotification.appointment) &&
        Objects.equals(this.selfUri, coachingNotification.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, markedAsRead, actionType, relationship, dateStart, lengthInMinutes, status, user, appointment, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoachingNotification {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    markedAsRead: ").append(toIndentedString(markedAsRead)).append("\n");
    sb.append("    actionType: ").append(toIndentedString(actionType)).append("\n");
    sb.append("    relationship: ").append(toIndentedString(relationship)).append("\n");
    sb.append("    dateStart: ").append(toIndentedString(dateStart)).append("\n");
    sb.append("    lengthInMinutes: ").append(toIndentedString(lengthInMinutes)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    appointment: ").append(toIndentedString(appointment)).append("\n");
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

