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
import com.mypurecloud.sdk.v2.model.OpportunityEnrollmentCounts;
import com.mypurecloud.sdk.v2.model.WfmVersionedEntityMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * OpportunityResultWithAgentIds
 */

public class OpportunityResultWithAgentIds  implements Serializable {
  
  private String id = null;
  private Date startDate = null;
  private Date endDate = null;

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
   * The current status of the opportunity
   */
 @JsonDeserialize(using = StatusEnumDeserializer.class)
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
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
  private Date openDate = null;
  private Date deadlineDate = null;
  private String name = null;
  private String description = null;
  private String activityCodeId = null;

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
   * The approval type for enrollments
   */
 @JsonDeserialize(using = ApprovalTypeEnumDeserializer.class)
  public enum ApprovalTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
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
  private Integer agentCount = null;
  private Integer capacity = null;
  private Integer enrollmentProcessingCount = null;
  private OpportunityEnrollmentCounts enrollmentCounts = null;
  private Date publishedDate = null;
  private Date closedDate = null;

  private static class SystemMessageCodeEnumDeserializer extends StdDeserializer<SystemMessageCodeEnum> {
    public SystemMessageCodeEnumDeserializer() {
      super(SystemMessageCodeEnumDeserializer.class);
    }

    @Override
    public SystemMessageCodeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return SystemMessageCodeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The system-generated message code about opportunity processing issues or validation failures
   */
 @JsonDeserialize(using = SystemMessageCodeEnumDeserializer.class)
  public enum SystemMessageCodeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ACTIVITYCHANGED("ActivityChanged"),
    AGENTENROLLMENTSHOURLYLIMITEXCEEDED("AgentEnrollmentsHourlyLimitExceeded"),
    BATCHLIMITEXCEEDED("BatchLimitExceeded"),
    BUSINESSUNITENROLLMENTSHOURLYLIMITEXCEEDED("BusinessUnitEnrollmentsHourlyLimitExceeded"),
    BUSINESSUNITNOTFOUND("BusinessUnitNotFound"),
    BUSINESSUNITOPPORTUNITYHOURLYLIMITEXCEEDED("BusinessUnitOpportunityHourlyLimitExceeded"),
    CAPACITYFULL("CapacityFull"),
    CONFLICT("Conflict"),
    DATEMUSTBEINFUTURE("DateMustBeInFuture"),
    DEADLINEMUSTBEAFTEROPENTIME("DeadlineMustBeAfterOpenTime"),
    DEADLINEMUSTBEBEFOREOREQUALTOSTARTTIME("DeadlineMustBeBeforeOrEqualToStartTime"),
    ENDTIMEMUSTBEAFTERSTARTTIME("EndTimeMustBeAfterStartTime"),
    ENROLLMENTNOTFOUND("EnrollmentNotFound"),
    INTERNALERROR("InternalError"),
    INTERNALERRORAUTOAPPROVAL("InternalErrorAutoApproval"),
    INTERNALERRORDENIAL("InternalErrorDenial"),
    INTERNALERRORSCHEDULEUPDATE("InternalErrorScheduleUpdate"),
    INVALIDOPPORTUNITYLENGTH("InvalidOpportunityLength"),
    INVALIDOPPORTUNITYSTATUS("InvalidOpportunityStatus"),
    INVALIDREQUEST("InvalidRequest"),
    INVALIDSTATUSTRANSITION("InvalidStatusTransition"),
    INVALIDTIME("InvalidTime"),
    NOINVITATIONSFORPUBLISH("NoInvitationsForPublish"),
    OPENTIMEMUSTBEBEFORESTARTTIME("OpenTimeMustBeBeforeStartTime"),
    OPPORTUNITYCLOSED("OpportunityClosed"),
    OPPORTUNITYNOTFOUND("OpportunityNotFound"),
    OPPORTUNITYNOTOPEN("OpportunityNotOpen"),
    SCHEDULECONFLICT("ScheduleConflict"),
    SCHEDULENOTFOUND("ScheduleNotFound"),
    SERVICEUNAVAILABLE("ServiceUnavailable"),
    STARTTIMEMUSTBEWITHINONEYEAR("StartTimeMustBeWithinOneYear"),
    STATUSNOTDRAFT("StatusNotDraft");

    private String value;

    SystemMessageCodeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static SystemMessageCodeEnum fromString(String key) {
      if (key == null) return null;

      for (SystemMessageCodeEnum value : SystemMessageCodeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return SystemMessageCodeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private SystemMessageCodeEnum systemMessageCode = null;
  private WfmVersionedEntityMetadata metadata = null;
  private List<String> agentIds = null;
  private String selfUri = null;

  public OpportunityResultWithAgentIds() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      agentIds = new ArrayList<String>();
    }
  }

  public OpportunityResultWithAgentIds(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      agentIds = new ArrayList<String>();
    }
  }

  
  /**
   * The globally unique identifier for the object.
   **/
  public OpportunityResultWithAgentIds id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * The start date and time of the opportunity in ISO-8601 format
   **/
  public OpportunityResultWithAgentIds startDate(Date startDate) {
    this.startDate = startDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The start date and time of the opportunity in ISO-8601 format")
  @JsonProperty("startDate")
  public Date getStartDate() {
    return startDate;
  }
  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }


  /**
   * The end date and time of the opportunity in ISO-8601 format
   **/
  public OpportunityResultWithAgentIds endDate(Date endDate) {
    this.endDate = endDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The end date and time of the opportunity in ISO-8601 format")
  @JsonProperty("endDate")
  public Date getEndDate() {
    return endDate;
  }
  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }


  /**
   * The current status of the opportunity
   **/
  public OpportunityResultWithAgentIds status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The current status of the opportunity")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  /**
   * The date and time when the opportunity opens for enrollment in ISO-8601 format. If not provided or in the past, it will be automatically updated to the current time when the opportunity is published
   **/
  public OpportunityResultWithAgentIds openDate(Date openDate) {
    this.openDate = openDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The date and time when the opportunity opens for enrollment in ISO-8601 format. If not provided or in the past, it will be automatically updated to the current time when the opportunity is published")
  @JsonProperty("openDate")
  public Date getOpenDate() {
    return openDate;
  }
  public void setOpenDate(Date openDate) {
    this.openDate = openDate;
  }


  /**
   * The deadline date and time for enrollment in the opportunity in ISO-8601 format
   **/
  public OpportunityResultWithAgentIds deadlineDate(Date deadlineDate) {
    this.deadlineDate = deadlineDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The deadline date and time for enrollment in the opportunity in ISO-8601 format")
  @JsonProperty("deadlineDate")
  public Date getDeadlineDate() {
    return deadlineDate;
  }
  public void setDeadlineDate(Date deadlineDate) {
    this.deadlineDate = deadlineDate;
  }


  /**
   * The name of the opportunity
   **/
  public OpportunityResultWithAgentIds name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the opportunity")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * Additional details describing the purpose or context of this opportunity
   **/
  public OpportunityResultWithAgentIds description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Additional details describing the purpose or context of this opportunity")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * The ID of the activity code associated with the opportunity
   **/
  public OpportunityResultWithAgentIds activityCodeId(String activityCodeId) {
    this.activityCodeId = activityCodeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the activity code associated with the opportunity")
  @JsonProperty("activityCodeId")
  public String getActivityCodeId() {
    return activityCodeId;
  }
  public void setActivityCodeId(String activityCodeId) {
    this.activityCodeId = activityCodeId;
  }


  /**
   * The approval type for enrollments
   **/
  public OpportunityResultWithAgentIds approvalType(ApprovalTypeEnum approvalType) {
    this.approvalType = approvalType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The approval type for enrollments")
  @JsonProperty("approvalType")
  public ApprovalTypeEnum getApprovalType() {
    return approvalType;
  }
  public void setApprovalType(ApprovalTypeEnum approvalType) {
    this.approvalType = approvalType;
  }


  /**
   * The total number of agents invited to this opportunity
   **/
  public OpportunityResultWithAgentIds agentCount(Integer agentCount) {
    this.agentCount = agentCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The total number of agents invited to this opportunity")
  @JsonProperty("agentCount")
  public Integer getAgentCount() {
    return agentCount;
  }
  public void setAgentCount(Integer agentCount) {
    this.agentCount = agentCount;
  }


  /**
   * The maximum capacity (enrollment slots) for this opportunity
   **/
  public OpportunityResultWithAgentIds capacity(Integer capacity) {
    this.capacity = capacity;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The maximum capacity (enrollment slots) for this opportunity")
  @JsonProperty("capacity")
  public Integer getCapacity() {
    return capacity;
  }
  public void setCapacity(Integer capacity) {
    this.capacity = capacity;
  }


  /**
   * The number of enrollments currently being processed
   **/
  public OpportunityResultWithAgentIds enrollmentProcessingCount(Integer enrollmentProcessingCount) {
    this.enrollmentProcessingCount = enrollmentProcessingCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of enrollments currently being processed")
  @JsonProperty("enrollmentProcessingCount")
  public Integer getEnrollmentProcessingCount() {
    return enrollmentProcessingCount;
  }
  public void setEnrollmentProcessingCount(Integer enrollmentProcessingCount) {
    this.enrollmentProcessingCount = enrollmentProcessingCount;
  }


  /**
   * The counts for enrollment statuses
   **/
  public OpportunityResultWithAgentIds enrollmentCounts(OpportunityEnrollmentCounts enrollmentCounts) {
    this.enrollmentCounts = enrollmentCounts;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The counts for enrollment statuses")
  @JsonProperty("enrollmentCounts")
  public OpportunityEnrollmentCounts getEnrollmentCounts() {
    return enrollmentCounts;
  }
  public void setEnrollmentCounts(OpportunityEnrollmentCounts enrollmentCounts) {
    this.enrollmentCounts = enrollmentCounts;
  }


  /**
   * The date and time when the opportunity was published in ISO-8601 format
   **/
  public OpportunityResultWithAgentIds publishedDate(Date publishedDate) {
    this.publishedDate = publishedDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The date and time when the opportunity was published in ISO-8601 format")
  @JsonProperty("publishedDate")
  public Date getPublishedDate() {
    return publishedDate;
  }
  public void setPublishedDate(Date publishedDate) {
    this.publishedDate = publishedDate;
  }


  /**
   * The date and time when the opportunity was closed in ISO-8601 format
   **/
  public OpportunityResultWithAgentIds closedDate(Date closedDate) {
    this.closedDate = closedDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The date and time when the opportunity was closed in ISO-8601 format")
  @JsonProperty("closedDate")
  public Date getClosedDate() {
    return closedDate;
  }
  public void setClosedDate(Date closedDate) {
    this.closedDate = closedDate;
  }


  /**
   * The system-generated message code about opportunity processing issues or validation failures
   **/
  public OpportunityResultWithAgentIds systemMessageCode(SystemMessageCodeEnum systemMessageCode) {
    this.systemMessageCode = systemMessageCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The system-generated message code about opportunity processing issues or validation failures")
  @JsonProperty("systemMessageCode")
  public SystemMessageCodeEnum getSystemMessageCode() {
    return systemMessageCode;
  }
  public void setSystemMessageCode(SystemMessageCodeEnum systemMessageCode) {
    this.systemMessageCode = systemMessageCode;
  }


  /**
   * The metadata for the opportunity
   **/
  public OpportunityResultWithAgentIds metadata(WfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The metadata for the opportunity")
  @JsonProperty("metadata")
  public WfmVersionedEntityMetadata getMetadata() {
    return metadata;
  }
  public void setMetadata(WfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
  }


  /**
   * The IDs of the agents that are invited to the opportunity
   **/
  public OpportunityResultWithAgentIds agentIds(List<String> agentIds) {
    this.agentIds = agentIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The IDs of the agents that are invited to the opportunity")
  @JsonProperty("agentIds")
  public List<String> getAgentIds() {
    return agentIds;
  }
  public void setAgentIds(List<String> agentIds) {
    this.agentIds = agentIds;
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
    OpportunityResultWithAgentIds opportunityResultWithAgentIds = (OpportunityResultWithAgentIds) o;

    return Objects.equals(this.id, opportunityResultWithAgentIds.id) &&
            Objects.equals(this.startDate, opportunityResultWithAgentIds.startDate) &&
            Objects.equals(this.endDate, opportunityResultWithAgentIds.endDate) &&
            Objects.equals(this.status, opportunityResultWithAgentIds.status) &&
            Objects.equals(this.openDate, opportunityResultWithAgentIds.openDate) &&
            Objects.equals(this.deadlineDate, opportunityResultWithAgentIds.deadlineDate) &&
            Objects.equals(this.name, opportunityResultWithAgentIds.name) &&
            Objects.equals(this.description, opportunityResultWithAgentIds.description) &&
            Objects.equals(this.activityCodeId, opportunityResultWithAgentIds.activityCodeId) &&
            Objects.equals(this.approvalType, opportunityResultWithAgentIds.approvalType) &&
            Objects.equals(this.agentCount, opportunityResultWithAgentIds.agentCount) &&
            Objects.equals(this.capacity, opportunityResultWithAgentIds.capacity) &&
            Objects.equals(this.enrollmentProcessingCount, opportunityResultWithAgentIds.enrollmentProcessingCount) &&
            Objects.equals(this.enrollmentCounts, opportunityResultWithAgentIds.enrollmentCounts) &&
            Objects.equals(this.publishedDate, opportunityResultWithAgentIds.publishedDate) &&
            Objects.equals(this.closedDate, opportunityResultWithAgentIds.closedDate) &&
            Objects.equals(this.systemMessageCode, opportunityResultWithAgentIds.systemMessageCode) &&
            Objects.equals(this.metadata, opportunityResultWithAgentIds.metadata) &&
            Objects.equals(this.agentIds, opportunityResultWithAgentIds.agentIds) &&
            Objects.equals(this.selfUri, opportunityResultWithAgentIds.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, startDate, endDate, status, openDate, deadlineDate, name, description, activityCodeId, approvalType, agentCount, capacity, enrollmentProcessingCount, enrollmentCounts, publishedDate, closedDate, systemMessageCode, metadata, agentIds, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpportunityResultWithAgentIds {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    openDate: ").append(toIndentedString(openDate)).append("\n");
    sb.append("    deadlineDate: ").append(toIndentedString(deadlineDate)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    activityCodeId: ").append(toIndentedString(activityCodeId)).append("\n");
    sb.append("    approvalType: ").append(toIndentedString(approvalType)).append("\n");
    sb.append("    agentCount: ").append(toIndentedString(agentCount)).append("\n");
    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
    sb.append("    enrollmentProcessingCount: ").append(toIndentedString(enrollmentProcessingCount)).append("\n");
    sb.append("    enrollmentCounts: ").append(toIndentedString(enrollmentCounts)).append("\n");
    sb.append("    publishedDate: ").append(toIndentedString(publishedDate)).append("\n");
    sb.append("    closedDate: ").append(toIndentedString(closedDate)).append("\n");
    sb.append("    systemMessageCode: ").append(toIndentedString(systemMessageCode)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    agentIds: ").append(toIndentedString(agentIds)).append("\n");
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

