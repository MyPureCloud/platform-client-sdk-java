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
import com.mypurecloud.sdk.v2.model.ShiftTradePreviewResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ShiftTradeMatchReviewUserResponse
 */

public class ShiftTradeMatchReviewUserResponse  implements Serializable {
  
  private Integer weeklyMinimumPaidMinutes = null;
  private Integer weeklyMaximumPaidMinutes = null;
  private Integer preTradeSchedulePaidMinutes = null;
  private Integer postTradeSchedulePaidMinutes = null;
  private ShiftTradePreviewResponse postTradeNewShift = null;

  
  /**
   * The minimum weekly paid minutes for this user per the work plan tied to the agent schedule
   **/
  public ShiftTradeMatchReviewUserResponse weeklyMinimumPaidMinutes(Integer weeklyMinimumPaidMinutes) {
    this.weeklyMinimumPaidMinutes = weeklyMinimumPaidMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The minimum weekly paid minutes for this user per the work plan tied to the agent schedule")
  @JsonProperty("weeklyMinimumPaidMinutes")
  public Integer getWeeklyMinimumPaidMinutes() {
    return weeklyMinimumPaidMinutes;
  }
  public void setWeeklyMinimumPaidMinutes(Integer weeklyMinimumPaidMinutes) {
    this.weeklyMinimumPaidMinutes = weeklyMinimumPaidMinutes;
  }

  
  /**
   * The maximum weekly paid minutes for this user per the work plan tied to the agent schedule
   **/
  public ShiftTradeMatchReviewUserResponse weeklyMaximumPaidMinutes(Integer weeklyMaximumPaidMinutes) {
    this.weeklyMaximumPaidMinutes = weeklyMaximumPaidMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The maximum weekly paid minutes for this user per the work plan tied to the agent schedule")
  @JsonProperty("weeklyMaximumPaidMinutes")
  public Integer getWeeklyMaximumPaidMinutes() {
    return weeklyMaximumPaidMinutes;
  }
  public void setWeeklyMaximumPaidMinutes(Integer weeklyMaximumPaidMinutes) {
    this.weeklyMaximumPaidMinutes = weeklyMaximumPaidMinutes;
  }

  
  /**
   * The paid minutes on the week schedule for this user prior to the shift trade
   **/
  public ShiftTradeMatchReviewUserResponse preTradeSchedulePaidMinutes(Integer preTradeSchedulePaidMinutes) {
    this.preTradeSchedulePaidMinutes = preTradeSchedulePaidMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The paid minutes on the week schedule for this user prior to the shift trade")
  @JsonProperty("preTradeSchedulePaidMinutes")
  public Integer getPreTradeSchedulePaidMinutes() {
    return preTradeSchedulePaidMinutes;
  }
  public void setPreTradeSchedulePaidMinutes(Integer preTradeSchedulePaidMinutes) {
    this.preTradeSchedulePaidMinutes = preTradeSchedulePaidMinutes;
  }

  
  /**
   * The paid minutes on the week schedule for this user if the shift trade is approved
   **/
  public ShiftTradeMatchReviewUserResponse postTradeSchedulePaidMinutes(Integer postTradeSchedulePaidMinutes) {
    this.postTradeSchedulePaidMinutes = postTradeSchedulePaidMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The paid minutes on the week schedule for this user if the shift trade is approved")
  @JsonProperty("postTradeSchedulePaidMinutes")
  public Integer getPostTradeSchedulePaidMinutes() {
    return postTradeSchedulePaidMinutes;
  }
  public void setPostTradeSchedulePaidMinutes(Integer postTradeSchedulePaidMinutes) {
    this.postTradeSchedulePaidMinutes = postTradeSchedulePaidMinutes;
  }

  
  /**
   * Preview of what the shift will look like for the opposite side of this trade after the match is approved
   **/
  public ShiftTradeMatchReviewUserResponse postTradeNewShift(ShiftTradePreviewResponse postTradeNewShift) {
    this.postTradeNewShift = postTradeNewShift;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Preview of what the shift will look like for the opposite side of this trade after the match is approved")
  @JsonProperty("postTradeNewShift")
  public ShiftTradePreviewResponse getPostTradeNewShift() {
    return postTradeNewShift;
  }
  public void setPostTradeNewShift(ShiftTradePreviewResponse postTradeNewShift) {
    this.postTradeNewShift = postTradeNewShift;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShiftTradeMatchReviewUserResponse shiftTradeMatchReviewUserResponse = (ShiftTradeMatchReviewUserResponse) o;
    return Objects.equals(this.weeklyMinimumPaidMinutes, shiftTradeMatchReviewUserResponse.weeklyMinimumPaidMinutes) &&
        Objects.equals(this.weeklyMaximumPaidMinutes, shiftTradeMatchReviewUserResponse.weeklyMaximumPaidMinutes) &&
        Objects.equals(this.preTradeSchedulePaidMinutes, shiftTradeMatchReviewUserResponse.preTradeSchedulePaidMinutes) &&
        Objects.equals(this.postTradeSchedulePaidMinutes, shiftTradeMatchReviewUserResponse.postTradeSchedulePaidMinutes) &&
        Objects.equals(this.postTradeNewShift, shiftTradeMatchReviewUserResponse.postTradeNewShift);
  }

  @Override
  public int hashCode() {
    return Objects.hash(weeklyMinimumPaidMinutes, weeklyMaximumPaidMinutes, preTradeSchedulePaidMinutes, postTradeSchedulePaidMinutes, postTradeNewShift);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShiftTradeMatchReviewUserResponse {\n");
    
    sb.append("    weeklyMinimumPaidMinutes: ").append(toIndentedString(weeklyMinimumPaidMinutes)).append("\n");
    sb.append("    weeklyMaximumPaidMinutes: ").append(toIndentedString(weeklyMaximumPaidMinutes)).append("\n");
    sb.append("    preTradeSchedulePaidMinutes: ").append(toIndentedString(preTradeSchedulePaidMinutes)).append("\n");
    sb.append("    postTradeSchedulePaidMinutes: ").append(toIndentedString(postTradeSchedulePaidMinutes)).append("\n");
    sb.append("    postTradeNewShift: ").append(toIndentedString(postTradeNewShift)).append("\n");
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

