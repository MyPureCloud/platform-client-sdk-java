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
import com.mypurecloud.sdk.v2.model.BuScheduleReference;
import com.mypurecloud.sdk.v2.model.QueryOpportunityEnrollmentMetadata;
import com.mypurecloud.sdk.v2.model.UserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * QueryOpportunityEnrollmentResult
 */

public class QueryOpportunityEnrollmentResult  implements Serializable {
  
  private String id = null;
  private String opportunityId = null;
  private UserReference agent = null;

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
   * The current status of the enrollment
   */
 @JsonDeserialize(using = StatusEnumDeserializer.class)
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    PENDING("Pending"),
    APPROVED("Approved"),
    DENIED("Denied"),
    WITHDRAWN("Withdrawn"),
    PROCESSING("Processing");

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
  private BuScheduleReference schedule = null;

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
   * The system-generated message code about enrollment processing results or failures
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
  private String reviewNote = null;

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
   * The denial code
   */
 @JsonDeserialize(using = DenialCodeEnumDeserializer.class)
  public enum DenialCodeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
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
  private QueryOpportunityEnrollmentMetadata metadata = null;

  public QueryOpportunityEnrollmentResult() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public QueryOpportunityEnrollmentResult(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * The ID of the opportunity
   **/
  public QueryOpportunityEnrollmentResult opportunityId(String opportunityId) {
    this.opportunityId = opportunityId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the opportunity")
  @JsonProperty("opportunityId")
  public String getOpportunityId() {
    return opportunityId;
  }
  public void setOpportunityId(String opportunityId) {
    this.opportunityId = opportunityId;
  }


  /**
   * A reference to the agent who created the enrollment
   **/
  public QueryOpportunityEnrollmentResult agent(UserReference agent) {
    this.agent = agent;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A reference to the agent who created the enrollment")
  @JsonProperty("agent")
  public UserReference getAgent() {
    return agent;
  }
  public void setAgent(UserReference agent) {
    this.agent = agent;
  }


  /**
   * The current status of the enrollment
   **/
  public QueryOpportunityEnrollmentResult status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The current status of the enrollment")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  /**
   * The schedule on which the enrollment was added when this enrollment was approved
   **/
  public QueryOpportunityEnrollmentResult schedule(BuScheduleReference schedule) {
    this.schedule = schedule;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The schedule on which the enrollment was added when this enrollment was approved")
  @JsonProperty("schedule")
  public BuScheduleReference getSchedule() {
    return schedule;
  }
  public void setSchedule(BuScheduleReference schedule) {
    this.schedule = schedule;
  }


  /**
   * The system-generated message code about enrollment processing results or failures
   **/
  public QueryOpportunityEnrollmentResult systemMessageCode(SystemMessageCodeEnum systemMessageCode) {
    this.systemMessageCode = systemMessageCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The system-generated message code about enrollment processing results or failures")
  @JsonProperty("systemMessageCode")
  public SystemMessageCodeEnum getSystemMessageCode() {
    return systemMessageCode;
  }
  public void setSystemMessageCode(SystemMessageCodeEnum systemMessageCode) {
    this.systemMessageCode = systemMessageCode;
  }


  /**
   * Supervisor's note explaining the agent's enrollment status change
   **/
  public QueryOpportunityEnrollmentResult reviewNote(String reviewNote) {
    this.reviewNote = reviewNote;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Supervisor's note explaining the agent's enrollment status change")
  @JsonProperty("reviewNote")
  public String getReviewNote() {
    return reviewNote;
  }
  public void setReviewNote(String reviewNote) {
    this.reviewNote = reviewNote;
  }


  /**
   * The denial code
   **/
  public QueryOpportunityEnrollmentResult denialCode(DenialCodeEnum denialCode) {
    this.denialCode = denialCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The denial code")
  @JsonProperty("denialCode")
  public DenialCodeEnum getDenialCode() {
    return denialCode;
  }
  public void setDenialCode(DenialCodeEnum denialCode) {
    this.denialCode = denialCode;
  }


  /**
   * The metadata for the enrollment
   **/
  public QueryOpportunityEnrollmentResult metadata(QueryOpportunityEnrollmentMetadata metadata) {
    this.metadata = metadata;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The metadata for the enrollment")
  @JsonProperty("metadata")
  public QueryOpportunityEnrollmentMetadata getMetadata() {
    return metadata;
  }
  public void setMetadata(QueryOpportunityEnrollmentMetadata metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryOpportunityEnrollmentResult queryOpportunityEnrollmentResult = (QueryOpportunityEnrollmentResult) o;

    return Objects.equals(this.id, queryOpportunityEnrollmentResult.id) &&
            Objects.equals(this.opportunityId, queryOpportunityEnrollmentResult.opportunityId) &&
            Objects.equals(this.agent, queryOpportunityEnrollmentResult.agent) &&
            Objects.equals(this.status, queryOpportunityEnrollmentResult.status) &&
            Objects.equals(this.schedule, queryOpportunityEnrollmentResult.schedule) &&
            Objects.equals(this.systemMessageCode, queryOpportunityEnrollmentResult.systemMessageCode) &&
            Objects.equals(this.reviewNote, queryOpportunityEnrollmentResult.reviewNote) &&
            Objects.equals(this.denialCode, queryOpportunityEnrollmentResult.denialCode) &&
            Objects.equals(this.metadata, queryOpportunityEnrollmentResult.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, opportunityId, agent, status, schedule, systemMessageCode, reviewNote, denialCode, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryOpportunityEnrollmentResult {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    opportunityId: ").append(toIndentedString(opportunityId)).append("\n");
    sb.append("    agent: ").append(toIndentedString(agent)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    systemMessageCode: ").append(toIndentedString(systemMessageCode)).append("\n");
    sb.append("    reviewNote: ").append(toIndentedString(reviewNote)).append("\n");
    sb.append("    denialCode: ").append(toIndentedString(denialCode)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

