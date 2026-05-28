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
import com.mypurecloud.sdk.v2.model.ListWrapperString;
import com.mypurecloud.sdk.v2.model.ValueWrapperInstant;
import com.mypurecloud.sdk.v2.model.ValueWrapperString;
import com.mypurecloud.sdk.v2.model.WfmVersionedEntityMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * PatchOpportunityRequest
 */

public class PatchOpportunityRequest  implements Serializable {
  
  private Date startDate = null;
  private Date endDate = null;
  private ValueWrapperInstant openDate = null;
  private Date deadlineDate = null;
  private String name = null;
  private ValueWrapperString description = null;
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
  private Integer capacity = null;
  private ListWrapperString agentIds = null;
  private WfmVersionedEntityMetadata metadata = null;

  public PatchOpportunityRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public PatchOpportunityRequest(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The start date and time of the opportunity in ISO-8601 format
   **/
  public PatchOpportunityRequest startDate(Date startDate) {
    this.startDate = startDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The start date and time of the opportunity in ISO-8601 format")
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
  public PatchOpportunityRequest endDate(Date endDate) {
    this.endDate = endDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The end date and time of the opportunity in ISO-8601 format")
  @JsonProperty("endDate")
  public Date getEndDate() {
    return endDate;
  }
  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }


  /**
   * The date and time when the opportunity opens for enrollment in ISO-8601 format. If not provided or in the past, it will be automatically updated to the current time when the opportunity is published
   **/
  public PatchOpportunityRequest openDate(ValueWrapperInstant openDate) {
    this.openDate = openDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The date and time when the opportunity opens for enrollment in ISO-8601 format. If not provided or in the past, it will be automatically updated to the current time when the opportunity is published")
  @JsonProperty("openDate")
  public ValueWrapperInstant getOpenDate() {
    return openDate;
  }
  public void setOpenDate(ValueWrapperInstant openDate) {
    this.openDate = openDate;
  }


  /**
   * The deadline date and time for enrollment in the opportunity in ISO-8601 format
   **/
  public PatchOpportunityRequest deadlineDate(Date deadlineDate) {
    this.deadlineDate = deadlineDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The deadline date and time for enrollment in the opportunity in ISO-8601 format")
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
  public PatchOpportunityRequest name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of the opportunity")
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
  public PatchOpportunityRequest description(ValueWrapperString description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Additional details describing the purpose or context of this opportunity")
  @JsonProperty("description")
  public ValueWrapperString getDescription() {
    return description;
  }
  public void setDescription(ValueWrapperString description) {
    this.description = description;
  }


  /**
   * The ID of the activity code associated with the opportunity
   **/
  public PatchOpportunityRequest activityCodeId(String activityCodeId) {
    this.activityCodeId = activityCodeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of the activity code associated with the opportunity")
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
  public PatchOpportunityRequest approvalType(ApprovalTypeEnum approvalType) {
    this.approvalType = approvalType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The approval type for enrollments")
  @JsonProperty("approvalType")
  public ApprovalTypeEnum getApprovalType() {
    return approvalType;
  }
  public void setApprovalType(ApprovalTypeEnum approvalType) {
    this.approvalType = approvalType;
  }


  /**
   * The maximum capacity (enrollment slots) for this opportunity
   **/
  public PatchOpportunityRequest capacity(Integer capacity) {
    this.capacity = capacity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The maximum capacity (enrollment slots) for this opportunity")
  @JsonProperty("capacity")
  public Integer getCapacity() {
    return capacity;
  }
  public void setCapacity(Integer capacity) {
    this.capacity = capacity;
  }


  /**
   * The IDs of the agents that are invited to the opportunity
   **/
  public PatchOpportunityRequest agentIds(ListWrapperString agentIds) {
    this.agentIds = agentIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The IDs of the agents that are invited to the opportunity")
  @JsonProperty("agentIds")
  public ListWrapperString getAgentIds() {
    return agentIds;
  }
  public void setAgentIds(ListWrapperString agentIds) {
    this.agentIds = agentIds;
  }


  /**
   * The metadata for the opportunity
   **/
  public PatchOpportunityRequest metadata(WfmVersionedEntityMetadata metadata) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatchOpportunityRequest patchOpportunityRequest = (PatchOpportunityRequest) o;

    return Objects.equals(this.startDate, patchOpportunityRequest.startDate) &&
            Objects.equals(this.endDate, patchOpportunityRequest.endDate) &&
            Objects.equals(this.openDate, patchOpportunityRequest.openDate) &&
            Objects.equals(this.deadlineDate, patchOpportunityRequest.deadlineDate) &&
            Objects.equals(this.name, patchOpportunityRequest.name) &&
            Objects.equals(this.description, patchOpportunityRequest.description) &&
            Objects.equals(this.activityCodeId, patchOpportunityRequest.activityCodeId) &&
            Objects.equals(this.approvalType, patchOpportunityRequest.approvalType) &&
            Objects.equals(this.capacity, patchOpportunityRequest.capacity) &&
            Objects.equals(this.agentIds, patchOpportunityRequest.agentIds) &&
            Objects.equals(this.metadata, patchOpportunityRequest.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, endDate, openDate, deadlineDate, name, description, activityCodeId, approvalType, capacity, agentIds, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchOpportunityRequest {\n");
    
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    openDate: ").append(toIndentedString(openDate)).append("\n");
    sb.append("    deadlineDate: ").append(toIndentedString(deadlineDate)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    activityCodeId: ").append(toIndentedString(activityCodeId)).append("\n");
    sb.append("    approvalType: ").append(toIndentedString(approvalType)).append("\n");
    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
    sb.append("    agentIds: ").append(toIndentedString(agentIds)).append("\n");
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

