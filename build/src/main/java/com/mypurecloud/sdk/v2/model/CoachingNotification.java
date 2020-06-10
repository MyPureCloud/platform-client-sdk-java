package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.CoachingAppointmentReference;
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

  /**
   * Action causing the notification.
   */
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

  /**
   * The relationship of this user to this notification's appointment
   */
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

  /**
   * The status of the appointment for this notification
   */
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    SCHEDULED("Scheduled"),
    INPROGRESS("InProgress"),
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
  private UserReference user = null;
  private CoachingAppointmentReference appointment = null;
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

  
  @ApiModelProperty(example = "null", value = "The start time of the appointment relating to this notification. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
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

  
  /**
   * The user of this notification
   **/
  public CoachingNotification user(UserReference user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user of this notification")
  @JsonProperty("user")
  public UserReference getUser() {
    return user;
  }
  public void setUser(UserReference user) {
    this.user = user;
  }

  
  /**
   * The appointment
   **/
  public CoachingNotification appointment(CoachingAppointmentReference appointment) {
    this.appointment = appointment;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The appointment")
  @JsonProperty("appointment")
  public CoachingAppointmentReference getAppointment() {
    return appointment;
  }
  public void setAppointment(CoachingAppointmentReference appointment) {
    this.appointment = appointment;
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

