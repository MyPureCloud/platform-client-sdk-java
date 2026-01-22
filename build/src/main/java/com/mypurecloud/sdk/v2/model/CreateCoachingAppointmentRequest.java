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
import com.mypurecloud.sdk.v2.model.WfmScheduleReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * Create coaching appointment request
 */
@ApiModel(description = "Create coaching appointment request")

public class CreateCoachingAppointmentRequest  implements Serializable {
  
  private String name = null;
  private String description = null;
  private Date dateStart = null;
  private Integer lengthInMinutes = null;
  private String facilitatorId = null;
  private List<String> attendeeIds = null;
  private List<String> conversationIds = null;
  private List<String> documentIds = null;
  private WfmScheduleReference wfmSchedule = null;
  private List<String> externalLinks = null;
  private String location = null;
  private Boolean shareInsightsData = null;
  private Boolean addToSchedule = null;

  public CreateCoachingAppointmentRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      attendeeIds = new ArrayList<String>();
      conversationIds = new ArrayList<String>();
      documentIds = new ArrayList<String>();
      externalLinks = new ArrayList<String>();
    }
  }

  
  /**
   * The name of coaching appointment.
   **/
  public CreateCoachingAppointmentRequest name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of coaching appointment.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The description of coaching appointment.
   **/
  public CreateCoachingAppointmentRequest description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The description of coaching appointment.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * The date/time the coaching appointment starts. Times will be rounded down to the minute. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public CreateCoachingAppointmentRequest dateStart(Date dateStart) {
    this.dateStart = dateStart;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The date/time the coaching appointment starts. Times will be rounded down to the minute. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateStart")
  public Date getDateStart() {
    return dateStart;
  }
  public void setDateStart(Date dateStart) {
    this.dateStart = dateStart;
  }


  /**
   * The duration of coaching appointment in minutes.
   **/
  public CreateCoachingAppointmentRequest lengthInMinutes(Integer lengthInMinutes) {
    this.lengthInMinutes = lengthInMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The duration of coaching appointment in minutes.")
  @JsonProperty("lengthInMinutes")
  public Integer getLengthInMinutes() {
    return lengthInMinutes;
  }
  public void setLengthInMinutes(Integer lengthInMinutes) {
    this.lengthInMinutes = lengthInMinutes;
  }


  /**
   * The facilitator ID of coaching appointment.
   **/
  public CreateCoachingAppointmentRequest facilitatorId(String facilitatorId) {
    this.facilitatorId = facilitatorId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The facilitator ID of coaching appointment.")
  @JsonProperty("facilitatorId")
  public String getFacilitatorId() {
    return facilitatorId;
  }
  public void setFacilitatorId(String facilitatorId) {
    this.facilitatorId = facilitatorId;
  }


  /**
   * IDs of attendees in the coaching appointment.
   **/
  public CreateCoachingAppointmentRequest attendeeIds(List<String> attendeeIds) {
    this.attendeeIds = attendeeIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "IDs of attendees in the coaching appointment.")
  @JsonProperty("attendeeIds")
  public List<String> getAttendeeIds() {
    return attendeeIds;
  }
  public void setAttendeeIds(List<String> attendeeIds) {
    this.attendeeIds = attendeeIds;
  }


  /**
   * IDs of conversations associated with this coaching appointment.
   **/
  public CreateCoachingAppointmentRequest conversationIds(List<String> conversationIds) {
    this.conversationIds = conversationIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "IDs of conversations associated with this coaching appointment.")
  @JsonProperty("conversationIds")
  public List<String> getConversationIds() {
    return conversationIds;
  }
  public void setConversationIds(List<String> conversationIds) {
    this.conversationIds = conversationIds;
  }


  /**
   * IDs of documents associated with this coaching appointment.
   **/
  public CreateCoachingAppointmentRequest documentIds(List<String> documentIds) {
    this.documentIds = documentIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "IDs of documents associated with this coaching appointment.")
  @JsonProperty("documentIds")
  public List<String> getDocumentIds() {
    return documentIds;
  }
  public void setDocumentIds(List<String> documentIds) {
    this.documentIds = documentIds;
  }


  /**
   * The Workforce Management schedule the appointment is associated with.
   **/
  public CreateCoachingAppointmentRequest wfmSchedule(WfmScheduleReference wfmSchedule) {
    this.wfmSchedule = wfmSchedule;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Workforce Management schedule the appointment is associated with.")
  @JsonProperty("wfmSchedule")
  public WfmScheduleReference getWfmSchedule() {
    return wfmSchedule;
  }
  public void setWfmSchedule(WfmScheduleReference wfmSchedule) {
    this.wfmSchedule = wfmSchedule;
  }


  /**
   * The list of external links related to the appointment
   **/
  public CreateCoachingAppointmentRequest externalLinks(List<String> externalLinks) {
    this.externalLinks = externalLinks;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of external links related to the appointment")
  @JsonProperty("externalLinks")
  public List<String> getExternalLinks() {
    return externalLinks;
  }
  public void setExternalLinks(List<String> externalLinks) {
    this.externalLinks = externalLinks;
  }


  /**
   * The location of the appointment
   **/
  public CreateCoachingAppointmentRequest location(String location) {
    this.location = location;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The location of the appointment")
  @JsonProperty("location")
  public String getLocation() {
    return location;
  }
  public void setLocation(String location) {
    this.location = location;
  }


  /**
   * Whether to share the insight data
   **/
  public CreateCoachingAppointmentRequest shareInsightsData(Boolean shareInsightsData) {
    this.shareInsightsData = shareInsightsData;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether to share the insight data")
  @JsonProperty("shareInsightsData")
  public Boolean getShareInsightsData() {
    return shareInsightsData;
  }
  public void setShareInsightsData(Boolean shareInsightsData) {
    this.shareInsightsData = shareInsightsData;
  }


  /**
   * If True, adds the appointment to their schedule
   **/
  public CreateCoachingAppointmentRequest addToSchedule(Boolean addToSchedule) {
    this.addToSchedule = addToSchedule;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If True, adds the appointment to their schedule")
  @JsonProperty("addToSchedule")
  public Boolean getAddToSchedule() {
    return addToSchedule;
  }
  public void setAddToSchedule(Boolean addToSchedule) {
    this.addToSchedule = addToSchedule;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCoachingAppointmentRequest createCoachingAppointmentRequest = (CreateCoachingAppointmentRequest) o;

    return Objects.equals(this.name, createCoachingAppointmentRequest.name) &&
            Objects.equals(this.description, createCoachingAppointmentRequest.description) &&
            Objects.equals(this.dateStart, createCoachingAppointmentRequest.dateStart) &&
            Objects.equals(this.lengthInMinutes, createCoachingAppointmentRequest.lengthInMinutes) &&
            Objects.equals(this.facilitatorId, createCoachingAppointmentRequest.facilitatorId) &&
            Objects.equals(this.attendeeIds, createCoachingAppointmentRequest.attendeeIds) &&
            Objects.equals(this.conversationIds, createCoachingAppointmentRequest.conversationIds) &&
            Objects.equals(this.documentIds, createCoachingAppointmentRequest.documentIds) &&
            Objects.equals(this.wfmSchedule, createCoachingAppointmentRequest.wfmSchedule) &&
            Objects.equals(this.externalLinks, createCoachingAppointmentRequest.externalLinks) &&
            Objects.equals(this.location, createCoachingAppointmentRequest.location) &&
            Objects.equals(this.shareInsightsData, createCoachingAppointmentRequest.shareInsightsData) &&
            Objects.equals(this.addToSchedule, createCoachingAppointmentRequest.addToSchedule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, dateStart, lengthInMinutes, facilitatorId, attendeeIds, conversationIds, documentIds, wfmSchedule, externalLinks, location, shareInsightsData, addToSchedule);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCoachingAppointmentRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dateStart: ").append(toIndentedString(dateStart)).append("\n");
    sb.append("    lengthInMinutes: ").append(toIndentedString(lengthInMinutes)).append("\n");
    sb.append("    facilitatorId: ").append(toIndentedString(facilitatorId)).append("\n");
    sb.append("    attendeeIds: ").append(toIndentedString(attendeeIds)).append("\n");
    sb.append("    conversationIds: ").append(toIndentedString(conversationIds)).append("\n");
    sb.append("    documentIds: ").append(toIndentedString(documentIds)).append("\n");
    sb.append("    wfmSchedule: ").append(toIndentedString(wfmSchedule)).append("\n");
    sb.append("    externalLinks: ").append(toIndentedString(externalLinks)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    shareInsightsData: ").append(toIndentedString(shareInsightsData)).append("\n");
    sb.append("    addToSchedule: ").append(toIndentedString(addToSchedule)).append("\n");
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

