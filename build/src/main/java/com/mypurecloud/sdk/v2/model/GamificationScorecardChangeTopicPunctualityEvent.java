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

import java.io.Serializable;
/**
 * GamificationScorecardChangeTopicPunctualityEvent
 */

public class GamificationScorecardChangeTopicPunctualityEvent  implements Serializable {
  
  private String dateStart = null;
  private String dateScheduleStart = null;
  private String activityCode = null;
  private Long points = null;

  public GamificationScorecardChangeTopicPunctualityEvent() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public GamificationScorecardChangeTopicPunctualityEvent dateStart(String dateStart) {
    this.dateStart = dateStart;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dateStart")
  public String getDateStart() {
    return dateStart;
  }
  public void setDateStart(String dateStart) {
    this.dateStart = dateStart;
  }


  /**
   **/
  public GamificationScorecardChangeTopicPunctualityEvent dateScheduleStart(String dateScheduleStart) {
    this.dateScheduleStart = dateScheduleStart;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dateScheduleStart")
  public String getDateScheduleStart() {
    return dateScheduleStart;
  }
  public void setDateScheduleStart(String dateScheduleStart) {
    this.dateScheduleStart = dateScheduleStart;
  }


  /**
   **/
  public GamificationScorecardChangeTopicPunctualityEvent activityCode(String activityCode) {
    this.activityCode = activityCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("activityCode")
  public String getActivityCode() {
    return activityCode;
  }
  public void setActivityCode(String activityCode) {
    this.activityCode = activityCode;
  }


  /**
   **/
  public GamificationScorecardChangeTopicPunctualityEvent points(Long points) {
    this.points = points;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("points")
  public Long getPoints() {
    return points;
  }
  public void setPoints(Long points) {
    this.points = points;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GamificationScorecardChangeTopicPunctualityEvent gamificationScorecardChangeTopicPunctualityEvent = (GamificationScorecardChangeTopicPunctualityEvent) o;

    return Objects.equals(this.dateStart, gamificationScorecardChangeTopicPunctualityEvent.dateStart) &&
            Objects.equals(this.dateScheduleStart, gamificationScorecardChangeTopicPunctualityEvent.dateScheduleStart) &&
            Objects.equals(this.activityCode, gamificationScorecardChangeTopicPunctualityEvent.activityCode) &&
            Objects.equals(this.points, gamificationScorecardChangeTopicPunctualityEvent.points);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateStart, dateScheduleStart, activityCode, points);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GamificationScorecardChangeTopicPunctualityEvent {\n");
    
    sb.append("    dateStart: ").append(toIndentedString(dateStart)).append("\n");
    sb.append("    dateScheduleStart: ").append(toIndentedString(dateScheduleStart)).append("\n");
    sb.append("    activityCode: ").append(toIndentedString(activityCode)).append("\n");
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
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

