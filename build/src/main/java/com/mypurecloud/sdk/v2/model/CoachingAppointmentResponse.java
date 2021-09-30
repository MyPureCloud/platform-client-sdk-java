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
import com.mypurecloud.sdk.v2.model.ConversationReference;
import com.mypurecloud.sdk.v2.model.DocumentReference;
import com.mypurecloud.sdk.v2.model.UserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * Coaching appointment response
 */
@ApiModel(description = "Coaching appointment response")

public class CoachingAppointmentResponse  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String description = null;
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
   * The status of coaching appointment
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
  private UserReference facilitator = null;
  private List<UserReference> attendees = new ArrayList<UserReference>();
  private UserReference createdBy = null;
  private Date dateCreated = null;
  private UserReference modifiedBy = null;
  private Date dateModified = null;
  private List<ConversationReference> conversations = new ArrayList<ConversationReference>();
  private List<DocumentReference> documents = new ArrayList<DocumentReference>();
  private Boolean isOverdue = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  @ApiModelProperty(example = "null", value = "The name of coaching appointment")
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  
  @ApiModelProperty(example = "null", value = "The description of coaching appointment")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  
  @ApiModelProperty(example = "null", value = "The date/time the coaching appointment starts. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateStart")
  public Date getDateStart() {
    return dateStart;
  }

  
  @ApiModelProperty(example = "null", value = "The duration of coaching appointment in minutes")
  @JsonProperty("lengthInMinutes")
  public Integer getLengthInMinutes() {
    return lengthInMinutes;
  }

  
  @ApiModelProperty(example = "null", value = "The status of coaching appointment")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  
  @ApiModelProperty(example = "null", value = "The facilitator of coaching appointment")
  @JsonProperty("facilitator")
  public UserReference getFacilitator() {
    return facilitator;
  }

  
  @ApiModelProperty(example = "null", value = "The list of attendees attending the coaching")
  @JsonProperty("attendees")
  public List<UserReference> getAttendees() {
    return attendees;
  }

  
  @ApiModelProperty(example = "null", value = "The user who created the coaching appointment")
  @JsonProperty("createdBy")
  public UserReference getCreatedBy() {
    return createdBy;
  }

  
  @ApiModelProperty(example = "null", value = "The date/time the coaching appointment was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }

  
  @ApiModelProperty(example = "null", value = "The last user to modify the coaching appointment")
  @JsonProperty("modifiedBy")
  public UserReference getModifiedBy() {
    return modifiedBy;
  }

  
  @ApiModelProperty(example = "null", value = "The date/time the coaching appointment was last modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }

  
  @ApiModelProperty(example = "null", value = "The list of conversations associated with coaching appointment.")
  @JsonProperty("conversations")
  public List<ConversationReference> getConversations() {
    return conversations;
  }

  
  @ApiModelProperty(example = "null", value = "The list of documents associated with coaching appointment.")
  @JsonProperty("documents")
  public List<DocumentReference> getDocuments() {
    return documents;
  }

  
  @ApiModelProperty(example = "null", value = "Whether the appointment is overdue.")
  @JsonProperty("isOverdue")
  public Boolean getIsOverdue() {
    return isOverdue;
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
    CoachingAppointmentResponse coachingAppointmentResponse = (CoachingAppointmentResponse) o;
    return Objects.equals(this.id, coachingAppointmentResponse.id) &&
        Objects.equals(this.name, coachingAppointmentResponse.name) &&
        Objects.equals(this.description, coachingAppointmentResponse.description) &&
        Objects.equals(this.dateStart, coachingAppointmentResponse.dateStart) &&
        Objects.equals(this.lengthInMinutes, coachingAppointmentResponse.lengthInMinutes) &&
        Objects.equals(this.status, coachingAppointmentResponse.status) &&
        Objects.equals(this.facilitator, coachingAppointmentResponse.facilitator) &&
        Objects.equals(this.attendees, coachingAppointmentResponse.attendees) &&
        Objects.equals(this.createdBy, coachingAppointmentResponse.createdBy) &&
        Objects.equals(this.dateCreated, coachingAppointmentResponse.dateCreated) &&
        Objects.equals(this.modifiedBy, coachingAppointmentResponse.modifiedBy) &&
        Objects.equals(this.dateModified, coachingAppointmentResponse.dateModified) &&
        Objects.equals(this.conversations, coachingAppointmentResponse.conversations) &&
        Objects.equals(this.documents, coachingAppointmentResponse.documents) &&
        Objects.equals(this.isOverdue, coachingAppointmentResponse.isOverdue) &&
        Objects.equals(this.selfUri, coachingAppointmentResponse.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, dateStart, lengthInMinutes, status, facilitator, attendees, createdBy, dateCreated, modifiedBy, dateModified, conversations, documents, isOverdue, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoachingAppointmentResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dateStart: ").append(toIndentedString(dateStart)).append("\n");
    sb.append("    lengthInMinutes: ").append(toIndentedString(lengthInMinutes)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    facilitator: ").append(toIndentedString(facilitator)).append("\n");
    sb.append("    attendees: ").append(toIndentedString(attendees)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    conversations: ").append(toIndentedString(conversations)).append("\n");
    sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
    sb.append("    isOverdue: ").append(toIndentedString(isOverdue)).append("\n");
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

