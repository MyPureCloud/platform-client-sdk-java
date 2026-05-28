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
import java.util.Date;

import java.io.Serializable;
/**
 * AddOpportunityBody
 */

public class AddOpportunityBody  implements Serializable {
  
  private Date startDate = null;
  private Date endDate = null;
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
  private Integer capacity = null;

  public AddOpportunityBody() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public AddOpportunityBody(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The start date and time of the opportunity in ISO-8601 format
   **/
  public AddOpportunityBody startDate(Date startDate) {
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
  public AddOpportunityBody endDate(Date endDate) {
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
   * The date and time when the opportunity opens for enrollment in ISO-8601 format. If not provided or in the past, it will be automatically updated to the current time when the opportunity is published
   **/
  public AddOpportunityBody openDate(Date openDate) {
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
  public AddOpportunityBody deadlineDate(Date deadlineDate) {
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
  public AddOpportunityBody name(String name) {
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
  public AddOpportunityBody description(String description) {
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
  public AddOpportunityBody activityCodeId(String activityCodeId) {
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
  public AddOpportunityBody approvalType(ApprovalTypeEnum approvalType) {
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
   * The maximum capacity (enrollment slots) for this opportunity
   **/
  public AddOpportunityBody capacity(Integer capacity) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddOpportunityBody addOpportunityBody = (AddOpportunityBody) o;

    return Objects.equals(this.startDate, addOpportunityBody.startDate) &&
            Objects.equals(this.endDate, addOpportunityBody.endDate) &&
            Objects.equals(this.openDate, addOpportunityBody.openDate) &&
            Objects.equals(this.deadlineDate, addOpportunityBody.deadlineDate) &&
            Objects.equals(this.name, addOpportunityBody.name) &&
            Objects.equals(this.description, addOpportunityBody.description) &&
            Objects.equals(this.activityCodeId, addOpportunityBody.activityCodeId) &&
            Objects.equals(this.approvalType, addOpportunityBody.approvalType) &&
            Objects.equals(this.capacity, addOpportunityBody.capacity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, endDate, openDate, deadlineDate, name, description, activityCodeId, approvalType, capacity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddOpportunityBody {\n");
    
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    openDate: ").append(toIndentedString(openDate)).append("\n");
    sb.append("    deadlineDate: ").append(toIndentedString(deadlineDate)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    activityCodeId: ").append(toIndentedString(activityCodeId)).append("\n");
    sb.append("    approvalType: ").append(toIndentedString(approvalType)).append("\n");
    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
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

