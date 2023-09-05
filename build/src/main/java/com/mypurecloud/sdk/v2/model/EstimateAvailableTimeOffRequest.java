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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.EstimateAvailableFullDayTimeOffRequest;
import com.mypurecloud.sdk.v2.model.EstimateAvailablePartialDayTimeOffRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * EstimateAvailableTimeOffRequest
 */

public class EstimateAvailableTimeOffRequest  implements Serializable {
  
  private List<EstimateAvailableFullDayTimeOffRequest> fullDayDates = new ArrayList<EstimateAvailableFullDayTimeOffRequest>();
  private List<EstimateAvailablePartialDayTimeOffRequest> partialDayDates = new ArrayList<EstimateAvailablePartialDayTimeOffRequest>();
  private String activityCodeId = null;
  private Boolean paid = null;

  
  /**
   * Full day dates. partialDayDates must be empty if this field is populated
   **/
  public EstimateAvailableTimeOffRequest fullDayDates(List<EstimateAvailableFullDayTimeOffRequest> fullDayDates) {
    this.fullDayDates = fullDayDates;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Full day dates. partialDayDates must be empty if this field is populated")
  @JsonProperty("fullDayDates")
  public List<EstimateAvailableFullDayTimeOffRequest> getFullDayDates() {
    return fullDayDates;
  }
  public void setFullDayDates(List<EstimateAvailableFullDayTimeOffRequest> fullDayDates) {
    this.fullDayDates = fullDayDates;
  }


  /**
   * Partial day dates. fullDayDates must be empty if this field is populated
   **/
  public EstimateAvailableTimeOffRequest partialDayDates(List<EstimateAvailablePartialDayTimeOffRequest> partialDayDates) {
    this.partialDayDates = partialDayDates;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Partial day dates. fullDayDates must be empty if this field is populated")
  @JsonProperty("partialDayDates")
  public List<EstimateAvailablePartialDayTimeOffRequest> getPartialDayDates() {
    return partialDayDates;
  }
  public void setPartialDayDates(List<EstimateAvailablePartialDayTimeOffRequest> partialDayDates) {
    this.partialDayDates = partialDayDates;
  }


  /**
   * The ID of the activity code associated with the time off request. Activity code must be of the TimeOff category
   **/
  public EstimateAvailableTimeOffRequest activityCodeId(String activityCodeId) {
    this.activityCodeId = activityCodeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the activity code associated with the time off request. Activity code must be of the TimeOff category")
  @JsonProperty("activityCodeId")
  public String getActivityCodeId() {
    return activityCodeId;
  }
  public void setActivityCodeId(String activityCodeId) {
    this.activityCodeId = activityCodeId;
  }


  /**
   * Whether this estimate is for a paid time off request
   **/
  public EstimateAvailableTimeOffRequest paid(Boolean paid) {
    this.paid = paid;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Whether this estimate is for a paid time off request")
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
    EstimateAvailableTimeOffRequest estimateAvailableTimeOffRequest = (EstimateAvailableTimeOffRequest) o;

    return Objects.equals(this.fullDayDates, estimateAvailableTimeOffRequest.fullDayDates) &&
            Objects.equals(this.partialDayDates, estimateAvailableTimeOffRequest.partialDayDates) &&
            Objects.equals(this.activityCodeId, estimateAvailableTimeOffRequest.activityCodeId) &&
            Objects.equals(this.paid, estimateAvailableTimeOffRequest.paid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullDayDates, partialDayDates, activityCodeId, paid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EstimateAvailableTimeOffRequest {\n");
    
    sb.append("    fullDayDates: ").append(toIndentedString(fullDayDates)).append("\n");
    sb.append("    partialDayDates: ").append(toIndentedString(partialDayDates)).append("\n");
    sb.append("    activityCodeId: ").append(toIndentedString(activityCodeId)).append("\n");
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

