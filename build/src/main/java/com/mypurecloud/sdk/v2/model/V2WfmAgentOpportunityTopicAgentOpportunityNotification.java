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
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * V2WfmAgentOpportunityTopicAgentOpportunityNotification
 */

public class V2WfmAgentOpportunityTopicAgentOpportunityNotification  implements Serializable {
  
  private String id = null;
  private String businessUnitId = null;
  private String organizationId = null;
  private List<String> agentIds = null;
  private String opportunityStartDate = null;
  private String opportunityEndDate = null;
  private String openDate = null;

  private static class ApprovalTypeEnumDeserializer extends StdDeserializer<ApprovalTypeEnum> {
    public ApprovalTypeEnumDeserializer() {
      super(ApprovalTypeEnumDeserializer.class);
    }

    @Override
    public ApprovalTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ApprovalTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets approvalType
   */
 @JsonDeserialize(using = ApprovalTypeEnumDeserializer.class)
  public enum ApprovalTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("Unknown"),
    AUTOMATIC("Automatic"),
    MANUAL("Manual");

    private String value;

    ApprovalTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ApprovalTypeEnum fromString(String key) {
      if (key == null) return null;

      for (ApprovalTypeEnum value : ApprovalTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ApprovalTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ApprovalTypeEnum approvalType = null;
  private Long lengthMinutes = null;
  private String deadlineDate = null;
  private String activityCodeId = null;
  private String name = null;
  private String description = null;
  private String closedDate = null;

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
    OPEN("Open"),
    PENDING("Pending"),
    CLOSED("Closed");

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

  private static class EventTypeEnumDeserializer extends StdDeserializer<EventTypeEnum> {
    public EventTypeEnumDeserializer() {
      super(EventTypeEnumDeserializer.class);
    }

    @Override
    public EventTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return EventTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets eventType
   */
 @JsonDeserialize(using = EventTypeEnumDeserializer.class)
  public enum EventTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("Unknown"),
    OPENED("Opened"),
    SIGNEDUP("SignedUp"),
    APPROVEDAUTOMATICALLY("ApprovedAutomatically"),
    APPROVEDMANUALLY("ApprovedManually"),
    WITHDRAWN("Withdrawn"),
    DENIED("Denied");

    private String value;

    EventTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static EventTypeEnum fromString(String key) {
      if (key == null) return null;

      for (EventTypeEnum value : EventTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return EventTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private EventTypeEnum eventType = null;

  private static class DenialCodeEnumDeserializer extends StdDeserializer<DenialCodeEnum> {
    public DenialCodeEnumDeserializer() {
      super(DenialCodeEnumDeserializer.class);
    }

    @Override
    public DenialCodeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return DenialCodeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets denialCode
   */
 @JsonDeserialize(using = DenialCodeEnumDeserializer.class)
  public enum DenialCodeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("Unknown"),
    MANUALLYDENIED("ManuallyDenied"),
    AUTOMATICALLYCLOSED("AutomaticallyClosed"),
    MANUALLYCLOSED("ManuallyClosed"),
    CAPACITYFULL("CapacityFull"),
    SCHEDULECONFLICT("ScheduleConflict");

    private String value;

    DenialCodeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static DenialCodeEnum fromString(String key) {
      if (key == null) return null;

      for (DenialCodeEnum value : DenialCodeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return DenialCodeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private DenialCodeEnum denialCode = null;
  private String reviewNote = null;
  private Long remainingSpaces = null;

  public V2WfmAgentOpportunityTopicAgentOpportunityNotification() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      agentIds = new ArrayList<String>();
    }
  }

  public V2WfmAgentOpportunityTopicAgentOpportunityNotification(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      agentIds = new ArrayList<String>();
    }
  }

  
  /**
   **/
  public V2WfmAgentOpportunityTopicAgentOpportunityNotification id(String id) {
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
  public V2WfmAgentOpportunityTopicAgentOpportunityNotification businessUnitId(String businessUnitId) {
    this.businessUnitId = businessUnitId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("businessUnitId")
  public String getBusinessUnitId() {
    return businessUnitId;
  }
  public void setBusinessUnitId(String businessUnitId) {
    this.businessUnitId = businessUnitId;
  }


  /**
   **/
  public V2WfmAgentOpportunityTopicAgentOpportunityNotification organizationId(String organizationId) {
    this.organizationId = organizationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("organizationId")
  public String getOrganizationId() {
    return organizationId;
  }
  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }


  /**
   **/
  public V2WfmAgentOpportunityTopicAgentOpportunityNotification agentIds(List<String> agentIds) {
    this.agentIds = agentIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("agentIds")
  public List<String> getAgentIds() {
    return agentIds;
  }
  public void setAgentIds(List<String> agentIds) {
    this.agentIds = agentIds;
  }


  /**
   **/
  public V2WfmAgentOpportunityTopicAgentOpportunityNotification opportunityStartDate(String opportunityStartDate) {
    this.opportunityStartDate = opportunityStartDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("opportunityStartDate")
  public String getOpportunityStartDate() {
    return opportunityStartDate;
  }
  public void setOpportunityStartDate(String opportunityStartDate) {
    this.opportunityStartDate = opportunityStartDate;
  }


  /**
   **/
  public V2WfmAgentOpportunityTopicAgentOpportunityNotification opportunityEndDate(String opportunityEndDate) {
    this.opportunityEndDate = opportunityEndDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("opportunityEndDate")
  public String getOpportunityEndDate() {
    return opportunityEndDate;
  }
  public void setOpportunityEndDate(String opportunityEndDate) {
    this.opportunityEndDate = opportunityEndDate;
  }


  /**
   **/
  public V2WfmAgentOpportunityTopicAgentOpportunityNotification openDate(String openDate) {
    this.openDate = openDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("openDate")
  public String getOpenDate() {
    return openDate;
  }
  public void setOpenDate(String openDate) {
    this.openDate = openDate;
  }


  /**
   **/
  public V2WfmAgentOpportunityTopicAgentOpportunityNotification approvalType(ApprovalTypeEnum approvalType) {
    this.approvalType = approvalType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("approvalType")
  public ApprovalTypeEnum getApprovalType() {
    return approvalType;
  }
  public void setApprovalType(ApprovalTypeEnum approvalType) {
    this.approvalType = approvalType;
  }


  /**
   **/
  public V2WfmAgentOpportunityTopicAgentOpportunityNotification lengthMinutes(Long lengthMinutes) {
    this.lengthMinutes = lengthMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("lengthMinutes")
  public Long getLengthMinutes() {
    return lengthMinutes;
  }
  public void setLengthMinutes(Long lengthMinutes) {
    this.lengthMinutes = lengthMinutes;
  }


  /**
   **/
  public V2WfmAgentOpportunityTopicAgentOpportunityNotification deadlineDate(String deadlineDate) {
    this.deadlineDate = deadlineDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("deadlineDate")
  public String getDeadlineDate() {
    return deadlineDate;
  }
  public void setDeadlineDate(String deadlineDate) {
    this.deadlineDate = deadlineDate;
  }


  /**
   **/
  public V2WfmAgentOpportunityTopicAgentOpportunityNotification activityCodeId(String activityCodeId) {
    this.activityCodeId = activityCodeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("activityCodeId")
  public String getActivityCodeId() {
    return activityCodeId;
  }
  public void setActivityCodeId(String activityCodeId) {
    this.activityCodeId = activityCodeId;
  }


  /**
   **/
  public V2WfmAgentOpportunityTopicAgentOpportunityNotification name(String name) {
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
  public V2WfmAgentOpportunityTopicAgentOpportunityNotification description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   **/
  public V2WfmAgentOpportunityTopicAgentOpportunityNotification closedDate(String closedDate) {
    this.closedDate = closedDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("closedDate")
  public String getClosedDate() {
    return closedDate;
  }
  public void setClosedDate(String closedDate) {
    this.closedDate = closedDate;
  }


  /**
   **/
  public V2WfmAgentOpportunityTopicAgentOpportunityNotification status(StatusEnum status) {
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
  public V2WfmAgentOpportunityTopicAgentOpportunityNotification eventType(EventTypeEnum eventType) {
    this.eventType = eventType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("eventType")
  public EventTypeEnum getEventType() {
    return eventType;
  }
  public void setEventType(EventTypeEnum eventType) {
    this.eventType = eventType;
  }


  /**
   **/
  public V2WfmAgentOpportunityTopicAgentOpportunityNotification denialCode(DenialCodeEnum denialCode) {
    this.denialCode = denialCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("denialCode")
  public DenialCodeEnum getDenialCode() {
    return denialCode;
  }
  public void setDenialCode(DenialCodeEnum denialCode) {
    this.denialCode = denialCode;
  }


  /**
   **/
  public V2WfmAgentOpportunityTopicAgentOpportunityNotification reviewNote(String reviewNote) {
    this.reviewNote = reviewNote;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("reviewNote")
  public String getReviewNote() {
    return reviewNote;
  }
  public void setReviewNote(String reviewNote) {
    this.reviewNote = reviewNote;
  }


  /**
   **/
  public V2WfmAgentOpportunityTopicAgentOpportunityNotification remainingSpaces(Long remainingSpaces) {
    this.remainingSpaces = remainingSpaces;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("remainingSpaces")
  public Long getRemainingSpaces() {
    return remainingSpaces;
  }
  public void setRemainingSpaces(Long remainingSpaces) {
    this.remainingSpaces = remainingSpaces;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2WfmAgentOpportunityTopicAgentOpportunityNotification v2WfmAgentOpportunityTopicAgentOpportunityNotification = (V2WfmAgentOpportunityTopicAgentOpportunityNotification) o;

    return Objects.equals(this.id, v2WfmAgentOpportunityTopicAgentOpportunityNotification.id) &&
            Objects.equals(this.businessUnitId, v2WfmAgentOpportunityTopicAgentOpportunityNotification.businessUnitId) &&
            Objects.equals(this.organizationId, v2WfmAgentOpportunityTopicAgentOpportunityNotification.organizationId) &&
            Objects.equals(this.agentIds, v2WfmAgentOpportunityTopicAgentOpportunityNotification.agentIds) &&
            Objects.equals(this.opportunityStartDate, v2WfmAgentOpportunityTopicAgentOpportunityNotification.opportunityStartDate) &&
            Objects.equals(this.opportunityEndDate, v2WfmAgentOpportunityTopicAgentOpportunityNotification.opportunityEndDate) &&
            Objects.equals(this.openDate, v2WfmAgentOpportunityTopicAgentOpportunityNotification.openDate) &&
            Objects.equals(this.approvalType, v2WfmAgentOpportunityTopicAgentOpportunityNotification.approvalType) &&
            Objects.equals(this.lengthMinutes, v2WfmAgentOpportunityTopicAgentOpportunityNotification.lengthMinutes) &&
            Objects.equals(this.deadlineDate, v2WfmAgentOpportunityTopicAgentOpportunityNotification.deadlineDate) &&
            Objects.equals(this.activityCodeId, v2WfmAgentOpportunityTopicAgentOpportunityNotification.activityCodeId) &&
            Objects.equals(this.name, v2WfmAgentOpportunityTopicAgentOpportunityNotification.name) &&
            Objects.equals(this.description, v2WfmAgentOpportunityTopicAgentOpportunityNotification.description) &&
            Objects.equals(this.closedDate, v2WfmAgentOpportunityTopicAgentOpportunityNotification.closedDate) &&
            Objects.equals(this.status, v2WfmAgentOpportunityTopicAgentOpportunityNotification.status) &&
            Objects.equals(this.eventType, v2WfmAgentOpportunityTopicAgentOpportunityNotification.eventType) &&
            Objects.equals(this.denialCode, v2WfmAgentOpportunityTopicAgentOpportunityNotification.denialCode) &&
            Objects.equals(this.reviewNote, v2WfmAgentOpportunityTopicAgentOpportunityNotification.reviewNote) &&
            Objects.equals(this.remainingSpaces, v2WfmAgentOpportunityTopicAgentOpportunityNotification.remainingSpaces);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, businessUnitId, organizationId, agentIds, opportunityStartDate, opportunityEndDate, openDate, approvalType, lengthMinutes, deadlineDate, activityCodeId, name, description, closedDate, status, eventType, denialCode, reviewNote, remainingSpaces);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2WfmAgentOpportunityTopicAgentOpportunityNotification {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    businessUnitId: ").append(toIndentedString(businessUnitId)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    agentIds: ").append(toIndentedString(agentIds)).append("\n");
    sb.append("    opportunityStartDate: ").append(toIndentedString(opportunityStartDate)).append("\n");
    sb.append("    opportunityEndDate: ").append(toIndentedString(opportunityEndDate)).append("\n");
    sb.append("    openDate: ").append(toIndentedString(openDate)).append("\n");
    sb.append("    approvalType: ").append(toIndentedString(approvalType)).append("\n");
    sb.append("    lengthMinutes: ").append(toIndentedString(lengthMinutes)).append("\n");
    sb.append("    deadlineDate: ").append(toIndentedString(deadlineDate)).append("\n");
    sb.append("    activityCodeId: ").append(toIndentedString(activityCodeId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    closedDate: ").append(toIndentedString(closedDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    denialCode: ").append(toIndentedString(denialCode)).append("\n");
    sb.append("    reviewNote: ").append(toIndentedString(reviewNote)).append("\n");
    sb.append("    remainingSpaces: ").append(toIndentedString(remainingSpaces)).append("\n");
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

