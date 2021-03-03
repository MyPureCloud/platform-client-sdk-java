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
import com.mypurecloud.sdk.v2.model.WemCoachingAppointmentTopicCoachingAppointmentConversation;
import com.mypurecloud.sdk.v2.model.WemCoachingAppointmentTopicCoachingAppointmentDocument;
import com.mypurecloud.sdk.v2.model.WemCoachingAppointmentTopicCoachingAppointmentExternalLink;
import com.mypurecloud.sdk.v2.model.WemCoachingAppointmentTopicUserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * WemCoachingAppointmentTopicCoachingAppointmentNotification
 */

public class WemCoachingAppointmentTopicCoachingAppointmentNotification  implements Serializable {
  
  private String id = null;
  private String name = null;
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
  private WemCoachingAppointmentTopicUserReference facilitator = null;
  private List<WemCoachingAppointmentTopicUserReference> attendees = new ArrayList<WemCoachingAppointmentTopicUserReference>();
  private WemCoachingAppointmentTopicUserReference createdBy = null;
  private Date dateCreated = null;
  private WemCoachingAppointmentTopicUserReference modifiedBy = null;
  private Date dateModified = null;
  private List<WemCoachingAppointmentTopicCoachingAppointmentConversation> conversations = new ArrayList<WemCoachingAppointmentTopicCoachingAppointmentConversation>();
  private List<WemCoachingAppointmentTopicCoachingAppointmentDocument> documents = new ArrayList<WemCoachingAppointmentTopicCoachingAppointmentDocument>();

  private static class ChangeTypeEnumDeserializer extends StdDeserializer<ChangeTypeEnum> {
    public ChangeTypeEnumDeserializer() {
      super(ChangeTypeEnumDeserializer.class);
    }

    @Override
    public ChangeTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ChangeTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets changeType
   */
 @JsonDeserialize(using = ChangeTypeEnumDeserializer.class)
  public enum ChangeTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    CREATE("Create"),
    UPDATE("Update"),
    DELETE("Delete"),
    INVALIDATE("Invalidate");

    private String value;

    ChangeTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ChangeTypeEnum fromString(String key) {
      if (key == null) return null;

      for (ChangeTypeEnum value : ChangeTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ChangeTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ChangeTypeEnum changeType = null;
  private Date dateCompleted = null;
  private List<WemCoachingAppointmentTopicCoachingAppointmentExternalLink> externalLinks = new ArrayList<WemCoachingAppointmentTopicCoachingAppointmentExternalLink>();

  
  /**
   **/
  public WemCoachingAppointmentTopicCoachingAppointmentNotification id(String id) {
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
  public WemCoachingAppointmentTopicCoachingAppointmentNotification name(String name) {
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
  public WemCoachingAppointmentTopicCoachingAppointmentNotification dateStart(Date dateStart) {
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
  public WemCoachingAppointmentTopicCoachingAppointmentNotification lengthInMinutes(Integer lengthInMinutes) {
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
  public WemCoachingAppointmentTopicCoachingAppointmentNotification status(StatusEnum status) {
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
  public WemCoachingAppointmentTopicCoachingAppointmentNotification facilitator(WemCoachingAppointmentTopicUserReference facilitator) {
    this.facilitator = facilitator;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("facilitator")
  public WemCoachingAppointmentTopicUserReference getFacilitator() {
    return facilitator;
  }
  public void setFacilitator(WemCoachingAppointmentTopicUserReference facilitator) {
    this.facilitator = facilitator;
  }

  
  /**
   **/
  public WemCoachingAppointmentTopicCoachingAppointmentNotification attendees(List<WemCoachingAppointmentTopicUserReference> attendees) {
    this.attendees = attendees;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("attendees")
  public List<WemCoachingAppointmentTopicUserReference> getAttendees() {
    return attendees;
  }
  public void setAttendees(List<WemCoachingAppointmentTopicUserReference> attendees) {
    this.attendees = attendees;
  }

  
  /**
   **/
  public WemCoachingAppointmentTopicCoachingAppointmentNotification createdBy(WemCoachingAppointmentTopicUserReference createdBy) {
    this.createdBy = createdBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("createdBy")
  public WemCoachingAppointmentTopicUserReference getCreatedBy() {
    return createdBy;
  }
  public void setCreatedBy(WemCoachingAppointmentTopicUserReference createdBy) {
    this.createdBy = createdBy;
  }

  
  /**
   **/
  public WemCoachingAppointmentTopicCoachingAppointmentNotification dateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }

  
  /**
   **/
  public WemCoachingAppointmentTopicCoachingAppointmentNotification modifiedBy(WemCoachingAppointmentTopicUserReference modifiedBy) {
    this.modifiedBy = modifiedBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("modifiedBy")
  public WemCoachingAppointmentTopicUserReference getModifiedBy() {
    return modifiedBy;
  }
  public void setModifiedBy(WemCoachingAppointmentTopicUserReference modifiedBy) {
    this.modifiedBy = modifiedBy;
  }

  
  /**
   **/
  public WemCoachingAppointmentTopicCoachingAppointmentNotification dateModified(Date dateModified) {
    this.dateModified = dateModified;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }
  public void setDateModified(Date dateModified) {
    this.dateModified = dateModified;
  }

  
  /**
   **/
  public WemCoachingAppointmentTopicCoachingAppointmentNotification conversations(List<WemCoachingAppointmentTopicCoachingAppointmentConversation> conversations) {
    this.conversations = conversations;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("conversations")
  public List<WemCoachingAppointmentTopicCoachingAppointmentConversation> getConversations() {
    return conversations;
  }
  public void setConversations(List<WemCoachingAppointmentTopicCoachingAppointmentConversation> conversations) {
    this.conversations = conversations;
  }

  
  /**
   **/
  public WemCoachingAppointmentTopicCoachingAppointmentNotification documents(List<WemCoachingAppointmentTopicCoachingAppointmentDocument> documents) {
    this.documents = documents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("documents")
  public List<WemCoachingAppointmentTopicCoachingAppointmentDocument> getDocuments() {
    return documents;
  }
  public void setDocuments(List<WemCoachingAppointmentTopicCoachingAppointmentDocument> documents) {
    this.documents = documents;
  }

  
  /**
   **/
  public WemCoachingAppointmentTopicCoachingAppointmentNotification changeType(ChangeTypeEnum changeType) {
    this.changeType = changeType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("changeType")
  public ChangeTypeEnum getChangeType() {
    return changeType;
  }
  public void setChangeType(ChangeTypeEnum changeType) {
    this.changeType = changeType;
  }

  
  /**
   **/
  public WemCoachingAppointmentTopicCoachingAppointmentNotification dateCompleted(Date dateCompleted) {
    this.dateCompleted = dateCompleted;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dateCompleted")
  public Date getDateCompleted() {
    return dateCompleted;
  }
  public void setDateCompleted(Date dateCompleted) {
    this.dateCompleted = dateCompleted;
  }

  
  /**
   **/
  public WemCoachingAppointmentTopicCoachingAppointmentNotification externalLinks(List<WemCoachingAppointmentTopicCoachingAppointmentExternalLink> externalLinks) {
    this.externalLinks = externalLinks;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("externalLinks")
  public List<WemCoachingAppointmentTopicCoachingAppointmentExternalLink> getExternalLinks() {
    return externalLinks;
  }
  public void setExternalLinks(List<WemCoachingAppointmentTopicCoachingAppointmentExternalLink> externalLinks) {
    this.externalLinks = externalLinks;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WemCoachingAppointmentTopicCoachingAppointmentNotification wemCoachingAppointmentTopicCoachingAppointmentNotification = (WemCoachingAppointmentTopicCoachingAppointmentNotification) o;
    return Objects.equals(this.id, wemCoachingAppointmentTopicCoachingAppointmentNotification.id) &&
        Objects.equals(this.name, wemCoachingAppointmentTopicCoachingAppointmentNotification.name) &&
        Objects.equals(this.dateStart, wemCoachingAppointmentTopicCoachingAppointmentNotification.dateStart) &&
        Objects.equals(this.lengthInMinutes, wemCoachingAppointmentTopicCoachingAppointmentNotification.lengthInMinutes) &&
        Objects.equals(this.status, wemCoachingAppointmentTopicCoachingAppointmentNotification.status) &&
        Objects.equals(this.facilitator, wemCoachingAppointmentTopicCoachingAppointmentNotification.facilitator) &&
        Objects.equals(this.attendees, wemCoachingAppointmentTopicCoachingAppointmentNotification.attendees) &&
        Objects.equals(this.createdBy, wemCoachingAppointmentTopicCoachingAppointmentNotification.createdBy) &&
        Objects.equals(this.dateCreated, wemCoachingAppointmentTopicCoachingAppointmentNotification.dateCreated) &&
        Objects.equals(this.modifiedBy, wemCoachingAppointmentTopicCoachingAppointmentNotification.modifiedBy) &&
        Objects.equals(this.dateModified, wemCoachingAppointmentTopicCoachingAppointmentNotification.dateModified) &&
        Objects.equals(this.conversations, wemCoachingAppointmentTopicCoachingAppointmentNotification.conversations) &&
        Objects.equals(this.documents, wemCoachingAppointmentTopicCoachingAppointmentNotification.documents) &&
        Objects.equals(this.changeType, wemCoachingAppointmentTopicCoachingAppointmentNotification.changeType) &&
        Objects.equals(this.dateCompleted, wemCoachingAppointmentTopicCoachingAppointmentNotification.dateCompleted) &&
        Objects.equals(this.externalLinks, wemCoachingAppointmentTopicCoachingAppointmentNotification.externalLinks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, dateStart, lengthInMinutes, status, facilitator, attendees, createdBy, dateCreated, modifiedBy, dateModified, conversations, documents, changeType, dateCompleted, externalLinks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WemCoachingAppointmentTopicCoachingAppointmentNotification {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    sb.append("    changeType: ").append(toIndentedString(changeType)).append("\n");
    sb.append("    dateCompleted: ").append(toIndentedString(dateCompleted)).append("\n");
    sb.append("    externalLinks: ").append(toIndentedString(externalLinks)).append("\n");
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

