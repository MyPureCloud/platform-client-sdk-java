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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * LocalTime
 */

public class LocalTime  implements Serializable {
  
  private Integer hour = null;
  private Integer minute = null;
  private Integer second = null;
  private Integer nano = null;

  
  /**
   **/
  public LocalTime hour(Integer hour) {
    this.hour = hour;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("hour")
  public Integer getHour() {
    return hour;
  }
  public void setHour(Integer hour) {
    this.hour = hour;
  }


  /**
   **/
  public LocalTime minute(Integer minute) {
    this.minute = minute;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("minute")
  public Integer getMinute() {
    return minute;
  }
  public void setMinute(Integer minute) {
    this.minute = minute;
  }


  /**
   **/
  public LocalTime second(Integer second) {
    this.second = second;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("second")
  public Integer getSecond() {
    return second;
  }
  public void setSecond(Integer second) {
    this.second = second;
  }


  /**
   **/
  public LocalTime nano(Integer nano) {
    this.nano = nano;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("nano")
  public Integer getNano() {
    return nano;
  }
  public void setNano(Integer nano) {
    this.nano = nano;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocalTime localTime = (LocalTime) o;

    return Objects.equals(this.hour, localTime.hour) &&
            Objects.equals(this.minute, localTime.minute) &&
            Objects.equals(this.second, localTime.second) &&
            Objects.equals(this.nano, localTime.nano);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hour, minute, second, nano);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocalTime {\n");
    
    sb.append("    hour: ").append(toIndentedString(hour)).append("\n");
    sb.append("    minute: ").append(toIndentedString(minute)).append("\n");
    sb.append("    second: ").append(toIndentedString(second)).append("\n");
    sb.append("    nano: ").append(toIndentedString(nano)).append("\n");
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

