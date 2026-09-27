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
import com.mypurecloud.sdk.v2.model.AdherenceAdjustmentsReasonCodeReference;
import com.mypurecloud.sdk.v2.model.BusinessUnitReference;
import com.mypurecloud.sdk.v2.model.ManagementUnitReference;
import com.mypurecloud.sdk.v2.model.UserReference;
import com.mypurecloud.sdk.v2.model.WfmVersionedEntityMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * CurrentAgentAdherenceAdjustment
 */

public class CurrentAgentAdherenceAdjustment  implements Serializable {
  
  private String id = null;
  private UserReference agent = null;
  private ManagementUnitReference managementUnit = null;
  private BusinessUnitReference businessUnit = null;
  private Date startDate = null;
  private Integer lengthMinutes = null;
  private AdherenceAdjustmentsReasonCodeReference reasonCode = null;

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
   * The status of the adherence adjustment
   */
 @JsonDeserialize(using = StatusEnumDeserializer.class)
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    APPROVED("Approved"),
    DENIED("Denied"),
    PENDING("Pending");

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
  private Boolean expired = null;
  private String submitterNotes = null;
  private String reviewerNotes = null;
  private UserReference reviewedBy = null;
  private Date reviewedDate = null;
  private WfmVersionedEntityMetadata metadata = null;
  private String selfUri = null;

  public CurrentAgentAdherenceAdjustment() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public CurrentAgentAdherenceAdjustment(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The globally unique identifier for the object.
   **/
  public CurrentAgentAdherenceAdjustment id(String id) {
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
   * The agent to whom this adherence adjustment applies
   **/
  public CurrentAgentAdherenceAdjustment agent(UserReference agent) {
    this.agent = agent;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The agent to whom this adherence adjustment applies")
  @JsonProperty("agent")
  public UserReference getAgent() {
    return agent;
  }
  public void setAgent(UserReference agent) {
    this.agent = agent;
  }


  /**
   * The management unit to which the agent belonged when the adherence adjustment was submitted
   **/
  public CurrentAgentAdherenceAdjustment managementUnit(ManagementUnitReference managementUnit) {
    this.managementUnit = managementUnit;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The management unit to which the agent belonged when the adherence adjustment was submitted")
  @JsonProperty("managementUnit")
  public ManagementUnitReference getManagementUnit() {
    return managementUnit;
  }
  public void setManagementUnit(ManagementUnitReference managementUnit) {
    this.managementUnit = managementUnit;
  }


  /**
   * The business unit to which the agent belonged when the adherence adjustment was submitted
   **/
  public CurrentAgentAdherenceAdjustment businessUnit(BusinessUnitReference businessUnit) {
    this.businessUnit = businessUnit;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The business unit to which the agent belonged when the adherence adjustment was submitted")
  @JsonProperty("businessUnit")
  public BusinessUnitReference getBusinessUnit() {
    return businessUnit;
  }
  public void setBusinessUnit(BusinessUnitReference businessUnit) {
    this.businessUnit = businessUnit;
  }


  /**
   * The start timestamp of the adherence adjustment in ISO-8601 format
   **/
  public CurrentAgentAdherenceAdjustment startDate(Date startDate) {
    this.startDate = startDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The start timestamp of the adherence adjustment in ISO-8601 format")
  @JsonProperty("startDate")
  public Date getStartDate() {
    return startDate;
  }
  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }


  /**
   * The length of the adherence adjustment in minutes
   **/
  public CurrentAgentAdherenceAdjustment lengthMinutes(Integer lengthMinutes) {
    this.lengthMinutes = lengthMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The length of the adherence adjustment in minutes")
  @JsonProperty("lengthMinutes")
  public Integer getLengthMinutes() {
    return lengthMinutes;
  }
  public void setLengthMinutes(Integer lengthMinutes) {
    this.lengthMinutes = lengthMinutes;
  }


  /**
   * The reason code for this adherence adjustment
   **/
  public CurrentAgentAdherenceAdjustment reasonCode(AdherenceAdjustmentsReasonCodeReference reasonCode) {
    this.reasonCode = reasonCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The reason code for this adherence adjustment")
  @JsonProperty("reasonCode")
  public AdherenceAdjustmentsReasonCodeReference getReasonCode() {
    return reasonCode;
  }
  public void setReasonCode(AdherenceAdjustmentsReasonCodeReference reasonCode) {
    this.reasonCode = reasonCode;
  }


  /**
   * The status of the adherence adjustment
   **/
  public CurrentAgentAdherenceAdjustment status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The status of the adherence adjustment")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  /**
   * Indicates if the adherence adjustment is expired
   **/
  public CurrentAgentAdherenceAdjustment expired(Boolean expired) {
    this.expired = expired;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Indicates if the adherence adjustment is expired")
  @JsonProperty("expired")
  public Boolean getExpired() {
    return expired;
  }
  public void setExpired(Boolean expired) {
    this.expired = expired;
  }


  /**
   * Notes provided by the submitter for this adherence adjustment
   **/
  public CurrentAgentAdherenceAdjustment submitterNotes(String submitterNotes) {
    this.submitterNotes = submitterNotes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Notes provided by the submitter for this adherence adjustment")
  @JsonProperty("submitterNotes")
  public String getSubmitterNotes() {
    return submitterNotes;
  }
  public void setSubmitterNotes(String submitterNotes) {
    this.submitterNotes = submitterNotes;
  }


  /**
   * Notes provided by the reviewer for this adherence adjustment
   **/
  public CurrentAgentAdherenceAdjustment reviewerNotes(String reviewerNotes) {
    this.reviewerNotes = reviewerNotes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Notes provided by the reviewer for this adherence adjustment")
  @JsonProperty("reviewerNotes")
  public String getReviewerNotes() {
    return reviewerNotes;
  }
  public void setReviewerNotes(String reviewerNotes) {
    this.reviewerNotes = reviewerNotes;
  }


  /**
   * The user who reviewed the adherence adjustment, if applicable. The id may be 'System' if it was an automated process
   **/
  public CurrentAgentAdherenceAdjustment reviewedBy(UserReference reviewedBy) {
    this.reviewedBy = reviewedBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user who reviewed the adherence adjustment, if applicable. The id may be 'System' if it was an automated process")
  @JsonProperty("reviewedBy")
  public UserReference getReviewedBy() {
    return reviewedBy;
  }
  public void setReviewedBy(UserReference reviewedBy) {
    this.reviewedBy = reviewedBy;
  }


  /**
   * The date the adherence adjustment was reviewed, if applicable. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public CurrentAgentAdherenceAdjustment reviewedDate(Date reviewedDate) {
    this.reviewedDate = reviewedDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The date the adherence adjustment was reviewed, if applicable. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("reviewedDate")
  public Date getReviewedDate() {
    return reviewedDate;
  }
  public void setReviewedDate(Date reviewedDate) {
    this.reviewedDate = reviewedDate;
  }


  /**
   * Version metadata for the adherence adjustment
   **/
  public CurrentAgentAdherenceAdjustment metadata(WfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Version metadata for the adherence adjustment")
  @JsonProperty("metadata")
  public WfmVersionedEntityMetadata getMetadata() {
    return metadata;
  }
  public void setMetadata(WfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
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
    CurrentAgentAdherenceAdjustment currentAgentAdherenceAdjustment = (CurrentAgentAdherenceAdjustment) o;

    return Objects.equals(this.id, currentAgentAdherenceAdjustment.id) &&
            Objects.equals(this.agent, currentAgentAdherenceAdjustment.agent) &&
            Objects.equals(this.managementUnit, currentAgentAdherenceAdjustment.managementUnit) &&
            Objects.equals(this.businessUnit, currentAgentAdherenceAdjustment.businessUnit) &&
            Objects.equals(this.startDate, currentAgentAdherenceAdjustment.startDate) &&
            Objects.equals(this.lengthMinutes, currentAgentAdherenceAdjustment.lengthMinutes) &&
            Objects.equals(this.reasonCode, currentAgentAdherenceAdjustment.reasonCode) &&
            Objects.equals(this.status, currentAgentAdherenceAdjustment.status) &&
            Objects.equals(this.expired, currentAgentAdherenceAdjustment.expired) &&
            Objects.equals(this.submitterNotes, currentAgentAdherenceAdjustment.submitterNotes) &&
            Objects.equals(this.reviewerNotes, currentAgentAdherenceAdjustment.reviewerNotes) &&
            Objects.equals(this.reviewedBy, currentAgentAdherenceAdjustment.reviewedBy) &&
            Objects.equals(this.reviewedDate, currentAgentAdherenceAdjustment.reviewedDate) &&
            Objects.equals(this.metadata, currentAgentAdherenceAdjustment.metadata) &&
            Objects.equals(this.selfUri, currentAgentAdherenceAdjustment.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, agent, managementUnit, businessUnit, startDate, lengthMinutes, reasonCode, status, expired, submitterNotes, reviewerNotes, reviewedBy, reviewedDate, metadata, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrentAgentAdherenceAdjustment {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    agent: ").append(toIndentedString(agent)).append("\n");
    sb.append("    managementUnit: ").append(toIndentedString(managementUnit)).append("\n");
    sb.append("    businessUnit: ").append(toIndentedString(businessUnit)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    lengthMinutes: ").append(toIndentedString(lengthMinutes)).append("\n");
    sb.append("    reasonCode: ").append(toIndentedString(reasonCode)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    expired: ").append(toIndentedString(expired)).append("\n");
    sb.append("    submitterNotes: ").append(toIndentedString(submitterNotes)).append("\n");
    sb.append("    reviewerNotes: ").append(toIndentedString(reviewerNotes)).append("\n");
    sb.append("    reviewedBy: ").append(toIndentedString(reviewedBy)).append("\n");
    sb.append("    reviewedDate: ").append(toIndentedString(reviewedDate)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

