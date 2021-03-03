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
import com.mypurecloud.sdk.v2.model.PhoneChangeTopicLocalDate;
import com.mypurecloud.sdk.v2.model.PhoneChangeTopicLocalTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * PhoneChangeTopicLocalDateTime
 */

public class PhoneChangeTopicLocalDateTime  implements Serializable {
  
  private PhoneChangeTopicLocalDate date = null;
  private PhoneChangeTopicLocalTime time = null;

  
  /**
   **/
  public PhoneChangeTopicLocalDateTime date(PhoneChangeTopicLocalDate date) {
    this.date = date;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("date")
  public PhoneChangeTopicLocalDate getDate() {
    return date;
  }
  public void setDate(PhoneChangeTopicLocalDate date) {
    this.date = date;
  }

  
  /**
   **/
  public PhoneChangeTopicLocalDateTime time(PhoneChangeTopicLocalTime time) {
    this.time = time;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("time")
  public PhoneChangeTopicLocalTime getTime() {
    return time;
  }
  public void setTime(PhoneChangeTopicLocalTime time) {
    this.time = time;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhoneChangeTopicLocalDateTime phoneChangeTopicLocalDateTime = (PhoneChangeTopicLocalDateTime) o;
    return Objects.equals(this.date, phoneChangeTopicLocalDateTime.date) &&
        Objects.equals(this.time, phoneChangeTopicLocalDateTime.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, time);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhoneChangeTopicLocalDateTime {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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

