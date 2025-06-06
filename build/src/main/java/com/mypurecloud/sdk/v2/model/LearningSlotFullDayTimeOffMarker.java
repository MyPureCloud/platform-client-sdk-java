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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;

import java.io.Serializable;
/**
 * LearningSlotFullDayTimeOffMarker
 */

public class LearningSlotFullDayTimeOffMarker  implements Serializable {
  
  private LocalDate businessUnitDate = null;
  private Integer lengthMinutes = null;
  private String description = null;
  private String activityCodeId = null;
  private Boolean paid = null;
  private String timeOffRequestId = null;

  public LearningSlotFullDayTimeOffMarker() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The date of the time off marker, interpreted in the business unit's time zone. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public LearningSlotFullDayTimeOffMarker businessUnitDate(LocalDate businessUnitDate) {
    this.businessUnitDate = businessUnitDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The date of the time off marker, interpreted in the business unit's time zone. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("businessUnitDate")
  public LocalDate getBusinessUnitDate() {
    return businessUnitDate;
  }
  public void setBusinessUnitDate(LocalDate businessUnitDate) {
    this.businessUnitDate = businessUnitDate;
  }


  /**
   * The length of the time off marker in minutes
   **/
  public LearningSlotFullDayTimeOffMarker lengthMinutes(Integer lengthMinutes) {
    this.lengthMinutes = lengthMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The length of the time off marker in minutes")
  @JsonProperty("lengthMinutes")
  public Integer getLengthMinutes() {
    return lengthMinutes;
  }
  public void setLengthMinutes(Integer lengthMinutes) {
    this.lengthMinutes = lengthMinutes;
  }


  /**
   * The description of the time off marker
   **/
  public LearningSlotFullDayTimeOffMarker description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The description of the time off marker")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * The ID of the activity code associated with the time off marker
   **/
  public LearningSlotFullDayTimeOffMarker activityCodeId(String activityCodeId) {
    this.activityCodeId = activityCodeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of the activity code associated with the time off marker")
  @JsonProperty("activityCodeId")
  public String getActivityCodeId() {
    return activityCodeId;
  }
  public void setActivityCodeId(String activityCodeId) {
    this.activityCodeId = activityCodeId;
  }


  /**
   * Whether the time off marker is paid
   **/
  public LearningSlotFullDayTimeOffMarker paid(Boolean paid) {
    this.paid = paid;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether the time off marker is paid")
  @JsonProperty("paid")
  public Boolean getPaid() {
    return paid;
  }
  public void setPaid(Boolean paid) {
    this.paid = paid;
  }


  /**
   * The ID of the time off request
   **/
  public LearningSlotFullDayTimeOffMarker timeOffRequestId(String timeOffRequestId) {
    this.timeOffRequestId = timeOffRequestId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of the time off request")
  @JsonProperty("timeOffRequestId")
  public String getTimeOffRequestId() {
    return timeOffRequestId;
  }
  public void setTimeOffRequestId(String timeOffRequestId) {
    this.timeOffRequestId = timeOffRequestId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LearningSlotFullDayTimeOffMarker learningSlotFullDayTimeOffMarker = (LearningSlotFullDayTimeOffMarker) o;

    return Objects.equals(this.businessUnitDate, learningSlotFullDayTimeOffMarker.businessUnitDate) &&
            Objects.equals(this.lengthMinutes, learningSlotFullDayTimeOffMarker.lengthMinutes) &&
            Objects.equals(this.description, learningSlotFullDayTimeOffMarker.description) &&
            Objects.equals(this.activityCodeId, learningSlotFullDayTimeOffMarker.activityCodeId) &&
            Objects.equals(this.paid, learningSlotFullDayTimeOffMarker.paid) &&
            Objects.equals(this.timeOffRequestId, learningSlotFullDayTimeOffMarker.timeOffRequestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessUnitDate, lengthMinutes, description, activityCodeId, paid, timeOffRequestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LearningSlotFullDayTimeOffMarker {\n");
    
    sb.append("    businessUnitDate: ").append(toIndentedString(businessUnitDate)).append("\n");
    sb.append("    lengthMinutes: ").append(toIndentedString(lengthMinutes)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    activityCodeId: ").append(toIndentedString(activityCodeId)).append("\n");
    sb.append("    paid: ").append(toIndentedString(paid)).append("\n");
    sb.append("    timeOffRequestId: ").append(toIndentedString(timeOffRequestId)).append("\n");
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

