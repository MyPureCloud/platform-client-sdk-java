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
 * A datepicker available time that a user can take.
 */
@ApiModel(description = "A datepicker available time that a user can take.")

public class ContentDatePickerAvailableTime  implements Serializable {
  
  private Long duration = null;
  private Date dateTime = null;

  public ContentDatePickerAvailableTime() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The duration of the scheduling event in seconds.
   **/
  public ContentDatePickerAvailableTime duration(Long duration) {
    this.duration = duration;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The duration of the scheduling event in seconds.")
  @JsonProperty("duration")
  public Long getDuration() {
    return duration;
  }
  public void setDuration(Long duration) {
    this.duration = duration;
  }


  /**
   * The date and times of the event being scheduled. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public ContentDatePickerAvailableTime dateTime(Date dateTime) {
    this.dateTime = dateTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The date and times of the event being scheduled. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateTime")
  public Date getDateTime() {
    return dateTime;
  }
  public void setDateTime(Date dateTime) {
    this.dateTime = dateTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContentDatePickerAvailableTime contentDatePickerAvailableTime = (ContentDatePickerAvailableTime) o;

    return Objects.equals(this.duration, contentDatePickerAvailableTime.duration) &&
            Objects.equals(this.dateTime, contentDatePickerAvailableTime.dateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(duration, dateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentDatePickerAvailableTime {\n");
    
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
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

