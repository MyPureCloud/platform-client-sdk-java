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
 * PunctualityEvent
 */

public class PunctualityEvent  implements Serializable {
  
  private Date dateScheduleStart = null;
  private Date dateStart = null;
  private Integer lengthMinutes = null;
  private String description = null;
  private String activityCodeId = null;
  private String activityCode = null;
  private String category = null;
  private Integer points = null;
  private Double delta = null;
  private Boolean bullseye = null;

  
  @ApiModelProperty(example = "null", value = "The scheduled activity start time. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateScheduleStart")
  public Date getDateScheduleStart() {
    return dateScheduleStart;
  }

  
  @ApiModelProperty(example = "null", value = "The time the user started the activity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateStart")
  public Date getDateStart() {
    return dateStart;
  }

  
  @ApiModelProperty(example = "null", value = "The length of the activity in minutes")
  @JsonProperty("lengthMinutes")
  public Integer getLengthMinutes() {
    return lengthMinutes;
  }

  
  @ApiModelProperty(example = "null", value = "The description of the activity")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  
  @ApiModelProperty(example = "null", value = "The ID of the activity code associated with this activity")
  @JsonProperty("activityCodeId")
  public String getActivityCodeId() {
    return activityCodeId;
  }

  
  @ApiModelProperty(example = "null", value = "The activity code")
  @JsonProperty("activityCode")
  public String getActivityCode() {
    return activityCode;
  }

  
  @ApiModelProperty(example = "null", value = "The category for the activity")
  @JsonProperty("category")
  public String getCategory() {
    return category;
  }

  
  @ApiModelProperty(example = "null", value = "The points earned for this activity")
  @JsonProperty("points")
  public Integer getPoints() {
    return points;
  }

  
  @ApiModelProperty(example = "null", value = "Difference between this activity and the last activity in seconds")
  @JsonProperty("delta")
  public Double getDelta() {
    return delta;
  }

  
  /**
   **/
  public PunctualityEvent bullseye(Boolean bullseye) {
    this.bullseye = bullseye;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("bullseye")
  public Boolean getBullseye() {
    return bullseye;
  }
  public void setBullseye(Boolean bullseye) {
    this.bullseye = bullseye;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PunctualityEvent punctualityEvent = (PunctualityEvent) o;
    return Objects.equals(this.dateScheduleStart, punctualityEvent.dateScheduleStart) &&
        Objects.equals(this.dateStart, punctualityEvent.dateStart) &&
        Objects.equals(this.lengthMinutes, punctualityEvent.lengthMinutes) &&
        Objects.equals(this.description, punctualityEvent.description) &&
        Objects.equals(this.activityCodeId, punctualityEvent.activityCodeId) &&
        Objects.equals(this.activityCode, punctualityEvent.activityCode) &&
        Objects.equals(this.category, punctualityEvent.category) &&
        Objects.equals(this.points, punctualityEvent.points) &&
        Objects.equals(this.delta, punctualityEvent.delta) &&
        Objects.equals(this.bullseye, punctualityEvent.bullseye);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateScheduleStart, dateStart, lengthMinutes, description, activityCodeId, activityCode, category, points, delta, bullseye);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PunctualityEvent {\n");
    
    sb.append("    dateScheduleStart: ").append(toIndentedString(dateScheduleStart)).append("\n");
    sb.append("    dateStart: ").append(toIndentedString(dateStart)).append("\n");
    sb.append("    lengthMinutes: ").append(toIndentedString(lengthMinutes)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    activityCodeId: ").append(toIndentedString(activityCodeId)).append("\n");
    sb.append("    activityCode: ").append(toIndentedString(activityCode)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
    sb.append("    delta: ").append(toIndentedString(delta)).append("\n");
    sb.append("    bullseye: ").append(toIndentedString(bullseye)).append("\n");
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

