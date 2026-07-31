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

import java.io.Serializable;
/**
 * V2WfmOpportunityTopicOpportunityNotification
 */

public class V2WfmOpportunityTopicOpportunityNotification  implements Serializable {
  
  private String id = null;
  private String businessUnitId = null;
  private String organizationId = null;
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
  private String createdDate = null;
  private String publishedDate = null;
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
    DRAFT("Draft"),
    PUBLISHED("Published"),
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
    PUBLISHED("Published"),
    CREATED("Created"),
    UPDATED("Updated"),
    OPENED("Opened"),
    CLOSED("Closed"),
    DEADLINEDATEPASSED("DeadlineDatePassed");

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
  private Long pendingCount = null;
  private Long withdrawnCount = null;
  private Long approvedCount = null;
  private Long deniedCount = null;
  private Long remainingSpaces = null;

  public V2WfmOpportunityTopicOpportunityNotification() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public V2WfmOpportunityTopicOpportunityNotification(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   **/
  public V2WfmOpportunityTopicOpportunityNotification id(String id) {
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
  public V2WfmOpportunityTopicOpportunityNotification businessUnitId(String businessUnitId) {
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
  public V2WfmOpportunityTopicOpportunityNotification organizationId(String organizationId) {
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
  public V2WfmOpportunityTopicOpportunityNotification opportunityStartDate(String opportunityStartDate) {
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
  public V2WfmOpportunityTopicOpportunityNotification opportunityEndDate(String opportunityEndDate) {
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
  public V2WfmOpportunityTopicOpportunityNotification openDate(String openDate) {
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
  public V2WfmOpportunityTopicOpportunityNotification approvalType(ApprovalTypeEnum approvalType) {
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
  public V2WfmOpportunityTopicOpportunityNotification lengthMinutes(Long lengthMinutes) {
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
  public V2WfmOpportunityTopicOpportunityNotification deadlineDate(String deadlineDate) {
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
  public V2WfmOpportunityTopicOpportunityNotification activityCodeId(String activityCodeId) {
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
  public V2WfmOpportunityTopicOpportunityNotification name(String name) {
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
  public V2WfmOpportunityTopicOpportunityNotification description(String description) {
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
  public V2WfmOpportunityTopicOpportunityNotification createdDate(String createdDate) {
    this.createdDate = createdDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("createdDate")
  public String getCreatedDate() {
    return createdDate;
  }
  public void setCreatedDate(String createdDate) {
    this.createdDate = createdDate;
  }


  /**
   **/
  public V2WfmOpportunityTopicOpportunityNotification publishedDate(String publishedDate) {
    this.publishedDate = publishedDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("publishedDate")
  public String getPublishedDate() {
    return publishedDate;
  }
  public void setPublishedDate(String publishedDate) {
    this.publishedDate = publishedDate;
  }


  /**
   **/
  public V2WfmOpportunityTopicOpportunityNotification closedDate(String closedDate) {
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
  public V2WfmOpportunityTopicOpportunityNotification status(StatusEnum status) {
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
  public V2WfmOpportunityTopicOpportunityNotification eventType(EventTypeEnum eventType) {
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
  public V2WfmOpportunityTopicOpportunityNotification pendingCount(Long pendingCount) {
    this.pendingCount = pendingCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("pendingCount")
  public Long getPendingCount() {
    return pendingCount;
  }
  public void setPendingCount(Long pendingCount) {
    this.pendingCount = pendingCount;
  }


  /**
   **/
  public V2WfmOpportunityTopicOpportunityNotification withdrawnCount(Long withdrawnCount) {
    this.withdrawnCount = withdrawnCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("withdrawnCount")
  public Long getWithdrawnCount() {
    return withdrawnCount;
  }
  public void setWithdrawnCount(Long withdrawnCount) {
    this.withdrawnCount = withdrawnCount;
  }


  /**
   **/
  public V2WfmOpportunityTopicOpportunityNotification approvedCount(Long approvedCount) {
    this.approvedCount = approvedCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("approvedCount")
  public Long getApprovedCount() {
    return approvedCount;
  }
  public void setApprovedCount(Long approvedCount) {
    this.approvedCount = approvedCount;
  }


  /**
   **/
  public V2WfmOpportunityTopicOpportunityNotification deniedCount(Long deniedCount) {
    this.deniedCount = deniedCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("deniedCount")
  public Long getDeniedCount() {
    return deniedCount;
  }
  public void setDeniedCount(Long deniedCount) {
    this.deniedCount = deniedCount;
  }


  /**
   **/
  public V2WfmOpportunityTopicOpportunityNotification remainingSpaces(Long remainingSpaces) {
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
    V2WfmOpportunityTopicOpportunityNotification v2WfmOpportunityTopicOpportunityNotification = (V2WfmOpportunityTopicOpportunityNotification) o;

    return Objects.equals(this.id, v2WfmOpportunityTopicOpportunityNotification.id) &&
            Objects.equals(this.businessUnitId, v2WfmOpportunityTopicOpportunityNotification.businessUnitId) &&
            Objects.equals(this.organizationId, v2WfmOpportunityTopicOpportunityNotification.organizationId) &&
            Objects.equals(this.opportunityStartDate, v2WfmOpportunityTopicOpportunityNotification.opportunityStartDate) &&
            Objects.equals(this.opportunityEndDate, v2WfmOpportunityTopicOpportunityNotification.opportunityEndDate) &&
            Objects.equals(this.openDate, v2WfmOpportunityTopicOpportunityNotification.openDate) &&
            Objects.equals(this.approvalType, v2WfmOpportunityTopicOpportunityNotification.approvalType) &&
            Objects.equals(this.lengthMinutes, v2WfmOpportunityTopicOpportunityNotification.lengthMinutes) &&
            Objects.equals(this.deadlineDate, v2WfmOpportunityTopicOpportunityNotification.deadlineDate) &&
            Objects.equals(this.activityCodeId, v2WfmOpportunityTopicOpportunityNotification.activityCodeId) &&
            Objects.equals(this.name, v2WfmOpportunityTopicOpportunityNotification.name) &&
            Objects.equals(this.description, v2WfmOpportunityTopicOpportunityNotification.description) &&
            Objects.equals(this.createdDate, v2WfmOpportunityTopicOpportunityNotification.createdDate) &&
            Objects.equals(this.publishedDate, v2WfmOpportunityTopicOpportunityNotification.publishedDate) &&
            Objects.equals(this.closedDate, v2WfmOpportunityTopicOpportunityNotification.closedDate) &&
            Objects.equals(this.status, v2WfmOpportunityTopicOpportunityNotification.status) &&
            Objects.equals(this.eventType, v2WfmOpportunityTopicOpportunityNotification.eventType) &&
            Objects.equals(this.pendingCount, v2WfmOpportunityTopicOpportunityNotification.pendingCount) &&
            Objects.equals(this.withdrawnCount, v2WfmOpportunityTopicOpportunityNotification.withdrawnCount) &&
            Objects.equals(this.approvedCount, v2WfmOpportunityTopicOpportunityNotification.approvedCount) &&
            Objects.equals(this.deniedCount, v2WfmOpportunityTopicOpportunityNotification.deniedCount) &&
            Objects.equals(this.remainingSpaces, v2WfmOpportunityTopicOpportunityNotification.remainingSpaces);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, businessUnitId, organizationId, opportunityStartDate, opportunityEndDate, openDate, approvalType, lengthMinutes, deadlineDate, activityCodeId, name, description, createdDate, publishedDate, closedDate, status, eventType, pendingCount, withdrawnCount, approvedCount, deniedCount, remainingSpaces);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2WfmOpportunityTopicOpportunityNotification {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    businessUnitId: ").append(toIndentedString(businessUnitId)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    opportunityStartDate: ").append(toIndentedString(opportunityStartDate)).append("\n");
    sb.append("    opportunityEndDate: ").append(toIndentedString(opportunityEndDate)).append("\n");
    sb.append("    openDate: ").append(toIndentedString(openDate)).append("\n");
    sb.append("    approvalType: ").append(toIndentedString(approvalType)).append("\n");
    sb.append("    lengthMinutes: ").append(toIndentedString(lengthMinutes)).append("\n");
    sb.append("    deadlineDate: ").append(toIndentedString(deadlineDate)).append("\n");
    sb.append("    activityCodeId: ").append(toIndentedString(activityCodeId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    publishedDate: ").append(toIndentedString(publishedDate)).append("\n");
    sb.append("    closedDate: ").append(toIndentedString(closedDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    pendingCount: ").append(toIndentedString(pendingCount)).append("\n");
    sb.append("    withdrawnCount: ").append(toIndentedString(withdrawnCount)).append("\n");
    sb.append("    approvedCount: ").append(toIndentedString(approvedCount)).append("\n");
    sb.append("    deniedCount: ").append(toIndentedString(deniedCount)).append("\n");
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

