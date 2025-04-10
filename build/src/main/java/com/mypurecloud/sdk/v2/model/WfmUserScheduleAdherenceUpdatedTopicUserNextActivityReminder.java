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
import java.util.Date;

import java.io.Serializable;
/**
 * WfmUserScheduleAdherenceUpdatedTopicUserNextActivityReminder
 */

public class WfmUserScheduleAdherenceUpdatedTopicUserNextActivityReminder  implements Serializable {
  
  private String activityCategory = null;
  private Date startDate = null;

  public WfmUserScheduleAdherenceUpdatedTopicUserNextActivityReminder() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public WfmUserScheduleAdherenceUpdatedTopicUserNextActivityReminder activityCategory(String activityCategory) {
    this.activityCategory = activityCategory;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("activityCategory")
  public String getActivityCategory() {
    return activityCategory;
  }
  public void setActivityCategory(String activityCategory) {
    this.activityCategory = activityCategory;
  }


  /**
   **/
  public WfmUserScheduleAdherenceUpdatedTopicUserNextActivityReminder startDate(Date startDate) {
    this.startDate = startDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("startDate")
  public Date getStartDate() {
    return startDate;
  }
  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WfmUserScheduleAdherenceUpdatedTopicUserNextActivityReminder wfmUserScheduleAdherenceUpdatedTopicUserNextActivityReminder = (WfmUserScheduleAdherenceUpdatedTopicUserNextActivityReminder) o;

    return Objects.equals(this.activityCategory, wfmUserScheduleAdherenceUpdatedTopicUserNextActivityReminder.activityCategory) &&
            Objects.equals(this.startDate, wfmUserScheduleAdherenceUpdatedTopicUserNextActivityReminder.startDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityCategory, startDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmUserScheduleAdherenceUpdatedTopicUserNextActivityReminder {\n");
    
    sb.append("    activityCategory: ").append(toIndentedString(activityCategory)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
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

