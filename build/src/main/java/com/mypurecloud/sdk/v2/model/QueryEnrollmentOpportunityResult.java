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
import com.mypurecloud.sdk.v2.model.PendingAndApprovedOpportunityEnrollmentCounts;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * QueryEnrollmentOpportunityResult
 */

public class QueryEnrollmentOpportunityResult  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String activityCodeId = null;
  private Date startDate = null;
  private Date endDate = null;
  private Date deadlineDate = null;

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
  private Integer capacity = null;
  private PendingAndApprovedOpportunityEnrollmentCounts enrollmentCounts = null;

  public QueryEnrollmentOpportunityResult() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public QueryEnrollmentOpportunityResult(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * The name of the opportunity
   **/
  public QueryEnrollmentOpportunityResult name(String name) {
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
   * The ID of the activity code associated with the opportunity
   **/
  public QueryEnrollmentOpportunityResult activityCodeId(String activityCodeId) {
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
   * The start date and time of the opportunity in ISO-8601 format
   **/
  public QueryEnrollmentOpportunityResult startDate(Date startDate) {
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
  public QueryEnrollmentOpportunityResult endDate(Date endDate) {
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
   * The deadline date and time for enrollment in the opportunity in ISO-8601 format
   **/
  public QueryEnrollmentOpportunityResult deadlineDate(Date deadlineDate) {
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
   * The current status of the opportunity
   **/
  public QueryEnrollmentOpportunityResult status(StatusEnum status) {
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
   * The maximum capacity (enrollment slots) for this opportunity
   **/
  public QueryEnrollmentOpportunityResult capacity(Integer capacity) {
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
   * The counts for enrollment statuses
   **/
  public QueryEnrollmentOpportunityResult enrollmentCounts(PendingAndApprovedOpportunityEnrollmentCounts enrollmentCounts) {
    this.enrollmentCounts = enrollmentCounts;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The counts for enrollment statuses")
  @JsonProperty("enrollmentCounts")
  public PendingAndApprovedOpportunityEnrollmentCounts getEnrollmentCounts() {
    return enrollmentCounts;
  }
  public void setEnrollmentCounts(PendingAndApprovedOpportunityEnrollmentCounts enrollmentCounts) {
    this.enrollmentCounts = enrollmentCounts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryEnrollmentOpportunityResult queryEnrollmentOpportunityResult = (QueryEnrollmentOpportunityResult) o;

    return Objects.equals(this.id, queryEnrollmentOpportunityResult.id) &&
            Objects.equals(this.name, queryEnrollmentOpportunityResult.name) &&
            Objects.equals(this.activityCodeId, queryEnrollmentOpportunityResult.activityCodeId) &&
            Objects.equals(this.startDate, queryEnrollmentOpportunityResult.startDate) &&
            Objects.equals(this.endDate, queryEnrollmentOpportunityResult.endDate) &&
            Objects.equals(this.deadlineDate, queryEnrollmentOpportunityResult.deadlineDate) &&
            Objects.equals(this.status, queryEnrollmentOpportunityResult.status) &&
            Objects.equals(this.capacity, queryEnrollmentOpportunityResult.capacity) &&
            Objects.equals(this.enrollmentCounts, queryEnrollmentOpportunityResult.enrollmentCounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, activityCodeId, startDate, endDate, deadlineDate, status, capacity, enrollmentCounts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryEnrollmentOpportunityResult {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    activityCodeId: ").append(toIndentedString(activityCodeId)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    deadlineDate: ").append(toIndentedString(deadlineDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
    sb.append("    enrollmentCounts: ").append(toIndentedString(enrollmentCounts)).append("\n");
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

