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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.WemCoachingUserNotificationTopicCoachingAppointmentReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * WemCoachingUserNotificationTopicCoachingUserNotification
 */

public class WemCoachingUserNotificationTopicCoachingUserNotification  implements Serializable {
  
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
   * Gets or Sets actionType
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
   * Gets or Sets relationship
   */
 @JsonDeserialize(using = RelationshipEnumDeserializer.class)
  public enum RelationshipEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ATTENDEE("Attendee"),
    FACILITATOR("Facilitator"),
    CREATOR("Creator");

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
  private WemCoachingUserNotificationTopicCoachingAppointmentReference appointment = null;
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
   * Gets or Sets status
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

  
  /**
   **/
  public WemCoachingUserNotificationTopicCoachingUserNotification id(String id) {
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
  public WemCoachingUserNotificationTopicCoachingUserNotification name(String name) {
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
   **/
  public WemCoachingUserNotificationTopicCoachingUserNotification markedAsRead(Boolean markedAsRead) {
    this.markedAsRead = markedAsRead;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("markedAsRead")
  public Boolean getMarkedAsRead() {
    return markedAsRead;
  }
  public void setMarkedAsRead(Boolean markedAsRead) {
    this.markedAsRead = markedAsRead;
  }


  /**
   **/
  public WemCoachingUserNotificationTopicCoachingUserNotification actionType(ActionTypeEnum actionType) {
    this.actionType = actionType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("actionType")
  public ActionTypeEnum getActionType() {
    return actionType;
  }
  public void setActionType(ActionTypeEnum actionType) {
    this.actionType = actionType;
  }


  /**
   **/
  public WemCoachingUserNotificationTopicCoachingUserNotification relationship(RelationshipEnum relationship) {
    this.relationship = relationship;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("relationship")
  public RelationshipEnum getRelationship() {
    return relationship;
  }
  public void setRelationship(RelationshipEnum relationship) {
    this.relationship = relationship;
  }


  /**
   **/
  public WemCoachingUserNotificationTopicCoachingUserNotification appointment(WemCoachingUserNotificationTopicCoachingAppointmentReference appointment) {
    this.appointment = appointment;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("appointment")
  public WemCoachingUserNotificationTopicCoachingAppointmentReference getAppointment() {
    return appointment;
  }
  public void setAppointment(WemCoachingUserNotificationTopicCoachingAppointmentReference appointment) {
    this.appointment = appointment;
  }


  /**
   **/
  public WemCoachingUserNotificationTopicCoachingUserNotification dateStart(Date dateStart) {
    this.dateStart = dateStart;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dateStart")
  public Date getDateStart() {
    return dateStart;
  }
  public void setDateStart(Date dateStart) {
    this.dateStart = dateStart;
  }


  /**
   **/
  public WemCoachingUserNotificationTopicCoachingUserNotification lengthInMinutes(Integer lengthInMinutes) {
    this.lengthInMinutes = lengthInMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("lengthInMinutes")
  public Integer getLengthInMinutes() {
    return lengthInMinutes;
  }
  public void setLengthInMinutes(Integer lengthInMinutes) {
    this.lengthInMinutes = lengthInMinutes;
  }


  /**
   **/
  public WemCoachingUserNotificationTopicCoachingUserNotification status(StatusEnum status) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WemCoachingUserNotificationTopicCoachingUserNotification wemCoachingUserNotificationTopicCoachingUserNotification = (WemCoachingUserNotificationTopicCoachingUserNotification) o;

    return Objects.equals(this.id, wemCoachingUserNotificationTopicCoachingUserNotification.id) &&
            Objects.equals(this.name, wemCoachingUserNotificationTopicCoachingUserNotification.name) &&
            Objects.equals(this.markedAsRead, wemCoachingUserNotificationTopicCoachingUserNotification.markedAsRead) &&
            Objects.equals(this.actionType, wemCoachingUserNotificationTopicCoachingUserNotification.actionType) &&
            Objects.equals(this.relationship, wemCoachingUserNotificationTopicCoachingUserNotification.relationship) &&
            Objects.equals(this.appointment, wemCoachingUserNotificationTopicCoachingUserNotification.appointment) &&
            Objects.equals(this.dateStart, wemCoachingUserNotificationTopicCoachingUserNotification.dateStart) &&
            Objects.equals(this.lengthInMinutes, wemCoachingUserNotificationTopicCoachingUserNotification.lengthInMinutes) &&
            Objects.equals(this.status, wemCoachingUserNotificationTopicCoachingUserNotification.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, markedAsRead, actionType, relationship, appointment, dateStart, lengthInMinutes, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WemCoachingUserNotificationTopicCoachingUserNotification {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    markedAsRead: ").append(toIndentedString(markedAsRead)).append("\n");
    sb.append("    actionType: ").append(toIndentedString(actionType)).append("\n");
    sb.append("    relationship: ").append(toIndentedString(relationship)).append("\n");
    sb.append("    appointment: ").append(toIndentedString(appointment)).append("\n");
    sb.append("    dateStart: ").append(toIndentedString(dateStart)).append("\n");
    sb.append("    lengthInMinutes: ").append(toIndentedString(lengthInMinutes)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

