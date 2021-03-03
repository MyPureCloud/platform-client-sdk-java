package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.Objects;
import java.io.IOException;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * WfmAgentScheduleUpdateTopicWfmFullDayTimeOffMarker
 */

public class WfmAgentScheduleUpdateTopicWfmFullDayTimeOffMarker  implements Serializable {
  
  private String timeOffRequestId = null;
  private String managementUnitDate = null;
  private String activityCodeId = null;
  private Boolean isPaid = null;
  private Integer lengthInMinutes = null;
  private String description = null;
  private Boolean paid = null;

  
  /**
   **/
  public WfmAgentScheduleUpdateTopicWfmFullDayTimeOffMarker timeOffRequestId(String timeOffRequestId) {
    this.timeOffRequestId = timeOffRequestId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("timeOffRequestId")
  public String getTimeOffRequestId() {
    return timeOffRequestId;
  }
  public void setTimeOffRequestId(String timeOffRequestId) {
    this.timeOffRequestId = timeOffRequestId;
  }

  
  /**
   **/
  public WfmAgentScheduleUpdateTopicWfmFullDayTimeOffMarker managementUnitDate(String managementUnitDate) {
    this.managementUnitDate = managementUnitDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("managementUnitDate")
  public String getManagementUnitDate() {
    return managementUnitDate;
  }
  public void setManagementUnitDate(String managementUnitDate) {
    this.managementUnitDate = managementUnitDate;
  }

  
  /**
   **/
  public WfmAgentScheduleUpdateTopicWfmFullDayTimeOffMarker activityCodeId(String activityCodeId) {
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
  public WfmAgentScheduleUpdateTopicWfmFullDayTimeOffMarker isPaid(Boolean isPaid) {
    this.isPaid = isPaid;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("isPaid")
  public Boolean getIsPaid() {
    return isPaid;
  }
  public void setIsPaid(Boolean isPaid) {
    this.isPaid = isPaid;
  }

  
  /**
   **/
  public WfmAgentScheduleUpdateTopicWfmFullDayTimeOffMarker lengthInMinutes(Integer lengthInMinutes) {
    this.lengthInMinutes = lengthInMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("lengthInMinutes")
  public Integer getLengthInMinutes() {
    return lengthInMinutes;
  }
  public void setLengthInMinutes(Integer lengthInMinutes) {
    this.lengthInMinutes = lengthInMinutes;
  }

  
  /**
   **/
  public WfmAgentScheduleUpdateTopicWfmFullDayTimeOffMarker description(String description) {
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
  public WfmAgentScheduleUpdateTopicWfmFullDayTimeOffMarker paid(Boolean paid) {
    this.paid = paid;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("paid")
  public Boolean getPaid() {
    return paid;
  }
  public void setPaid(Boolean paid) {
    this.paid = paid;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WfmAgentScheduleUpdateTopicWfmFullDayTimeOffMarker wfmAgentScheduleUpdateTopicWfmFullDayTimeOffMarker = (WfmAgentScheduleUpdateTopicWfmFullDayTimeOffMarker) o;
    return Objects.equals(this.timeOffRequestId, wfmAgentScheduleUpdateTopicWfmFullDayTimeOffMarker.timeOffRequestId) &&
        Objects.equals(this.managementUnitDate, wfmAgentScheduleUpdateTopicWfmFullDayTimeOffMarker.managementUnitDate) &&
        Objects.equals(this.activityCodeId, wfmAgentScheduleUpdateTopicWfmFullDayTimeOffMarker.activityCodeId) &&
        Objects.equals(this.isPaid, wfmAgentScheduleUpdateTopicWfmFullDayTimeOffMarker.isPaid) &&
        Objects.equals(this.lengthInMinutes, wfmAgentScheduleUpdateTopicWfmFullDayTimeOffMarker.lengthInMinutes) &&
        Objects.equals(this.description, wfmAgentScheduleUpdateTopicWfmFullDayTimeOffMarker.description) &&
        Objects.equals(this.paid, wfmAgentScheduleUpdateTopicWfmFullDayTimeOffMarker.paid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeOffRequestId, managementUnitDate, activityCodeId, isPaid, lengthInMinutes, description, paid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmAgentScheduleUpdateTopicWfmFullDayTimeOffMarker {\n");
    
    sb.append("    timeOffRequestId: ").append(toIndentedString(timeOffRequestId)).append("\n");
    sb.append("    managementUnitDate: ").append(toIndentedString(managementUnitDate)).append("\n");
    sb.append("    activityCodeId: ").append(toIndentedString(activityCodeId)).append("\n");
    sb.append("    isPaid: ").append(toIndentedString(isPaid)).append("\n");
    sb.append("    lengthInMinutes: ").append(toIndentedString(lengthInMinutes)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    paid: ").append(toIndentedString(paid)).append("\n");
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

