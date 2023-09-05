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
import com.mypurecloud.sdk.v2.model.EstimateAvailableFullDayTimeOffResponse;
import com.mypurecloud.sdk.v2.model.EstimateAvailablePartialDayTimeOffResponse;
import com.mypurecloud.sdk.v2.model.UserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * EstimateAvailableTimeOffResponse
 */

public class EstimateAvailableTimeOffResponse  implements Serializable {
  
  private List<EstimateAvailableFullDayTimeOffResponse> fullDayDates = new ArrayList<EstimateAvailableFullDayTimeOffResponse>();
  private List<EstimateAvailablePartialDayTimeOffResponse> partialDayDates = new ArrayList<EstimateAvailablePartialDayTimeOffResponse>();
  private UserReference user = null;
  private String activityCodeId = null;
  private Boolean paid = null;

  
  /**
   * Full day dates. partialDayDates must be empty if this field is populated
   **/
  public EstimateAvailableTimeOffResponse fullDayDates(List<EstimateAvailableFullDayTimeOffResponse> fullDayDates) {
    this.fullDayDates = fullDayDates;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Full day dates. partialDayDates must be empty if this field is populated")
  @JsonProperty("fullDayDates")
  public List<EstimateAvailableFullDayTimeOffResponse> getFullDayDates() {
    return fullDayDates;
  }
  public void setFullDayDates(List<EstimateAvailableFullDayTimeOffResponse> fullDayDates) {
    this.fullDayDates = fullDayDates;
  }


  /**
   * Partial day dates. fullDayDates must be empty if this field is populated
   **/
  public EstimateAvailableTimeOffResponse partialDayDates(List<EstimateAvailablePartialDayTimeOffResponse> partialDayDates) {
    this.partialDayDates = partialDayDates;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Partial day dates. fullDayDates must be empty if this field is populated")
  @JsonProperty("partialDayDates")
  public List<EstimateAvailablePartialDayTimeOffResponse> getPartialDayDates() {
    return partialDayDates;
  }
  public void setPartialDayDates(List<EstimateAvailablePartialDayTimeOffResponse> partialDayDates) {
    this.partialDayDates = partialDayDates;
  }


  /**
   * The user to whom the time off request belongs
   **/
  public EstimateAvailableTimeOffResponse user(UserReference user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The user to whom the time off request belongs")
  @JsonProperty("user")
  public UserReference getUser() {
    return user;
  }
  public void setUser(UserReference user) {
    this.user = user;
  }


  /**
   * The ID of the activity code associated with the time off request. Activity code must be of the TimeOff category
   **/
  public EstimateAvailableTimeOffResponse activityCodeId(String activityCodeId) {
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
  public EstimateAvailableTimeOffResponse paid(Boolean paid) {
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
    EstimateAvailableTimeOffResponse estimateAvailableTimeOffResponse = (EstimateAvailableTimeOffResponse) o;

    return Objects.equals(this.fullDayDates, estimateAvailableTimeOffResponse.fullDayDates) &&
            Objects.equals(this.partialDayDates, estimateAvailableTimeOffResponse.partialDayDates) &&
            Objects.equals(this.user, estimateAvailableTimeOffResponse.user) &&
            Objects.equals(this.activityCodeId, estimateAvailableTimeOffResponse.activityCodeId) &&
            Objects.equals(this.paid, estimateAvailableTimeOffResponse.paid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullDayDates, partialDayDates, user, activityCodeId, paid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EstimateAvailableTimeOffResponse {\n");
    
    sb.append("    fullDayDates: ").append(toIndentedString(fullDayDates)).append("\n");
    sb.append("    partialDayDates: ").append(toIndentedString(partialDayDates)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

