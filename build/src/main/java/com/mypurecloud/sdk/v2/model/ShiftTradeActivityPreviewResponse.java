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
import java.util.Date;

import java.io.Serializable;
/**
 * ShiftTradeActivityPreviewResponse
 */

public class ShiftTradeActivityPreviewResponse  implements Serializable {
  
  private Date startDate = null;
  private Integer lengthMinutes = null;
  private String activityCodeId = null;
  private Boolean countsAsPaidTime = null;

  
  /**
   * The start date and time of this activity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public ShiftTradeActivityPreviewResponse startDate(Date startDate) {
    this.startDate = startDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The start date and time of this activity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("startDate")
  public Date getStartDate() {
    return startDate;
  }
  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  
  /**
   * The length in minutes of this activity
   **/
  public ShiftTradeActivityPreviewResponse lengthMinutes(Integer lengthMinutes) {
    this.lengthMinutes = lengthMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The length in minutes of this activity")
  @JsonProperty("lengthMinutes")
  public Integer getLengthMinutes() {
    return lengthMinutes;
  }
  public void setLengthMinutes(Integer lengthMinutes) {
    this.lengthMinutes = lengthMinutes;
  }

  
  /**
   * The ID of the activity code for this activity
   **/
  public ShiftTradeActivityPreviewResponse activityCodeId(String activityCodeId) {
    this.activityCodeId = activityCodeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of the activity code for this activity")
  @JsonProperty("activityCodeId")
  public String getActivityCodeId() {
    return activityCodeId;
  }
  public void setActivityCodeId(String activityCodeId) {
    this.activityCodeId = activityCodeId;
  }

  
  /**
   * Whether this activity counts as paid time
   **/
  public ShiftTradeActivityPreviewResponse countsAsPaidTime(Boolean countsAsPaidTime) {
    this.countsAsPaidTime = countsAsPaidTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether this activity counts as paid time")
  @JsonProperty("countsAsPaidTime")
  public Boolean getCountsAsPaidTime() {
    return countsAsPaidTime;
  }
  public void setCountsAsPaidTime(Boolean countsAsPaidTime) {
    this.countsAsPaidTime = countsAsPaidTime;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShiftTradeActivityPreviewResponse shiftTradeActivityPreviewResponse = (ShiftTradeActivityPreviewResponse) o;
    return Objects.equals(this.startDate, shiftTradeActivityPreviewResponse.startDate) &&
        Objects.equals(this.lengthMinutes, shiftTradeActivityPreviewResponse.lengthMinutes) &&
        Objects.equals(this.activityCodeId, shiftTradeActivityPreviewResponse.activityCodeId) &&
        Objects.equals(this.countsAsPaidTime, shiftTradeActivityPreviewResponse.countsAsPaidTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, lengthMinutes, activityCodeId, countsAsPaidTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShiftTradeActivityPreviewResponse {\n");
    
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    lengthMinutes: ").append(toIndentedString(lengthMinutes)).append("\n");
    sb.append("    activityCodeId: ").append(toIndentedString(activityCodeId)).append("\n");
    sb.append("    countsAsPaidTime: ").append(toIndentedString(countsAsPaidTime)).append("\n");
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

