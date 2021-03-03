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

import java.io.Serializable;
/**
 * AtzmTimeSlot
 */

public class AtzmTimeSlot  implements Serializable {
  
  private String earliestCallableTime = null;
  private String latestCallableTime = null;

  
  /**
   * The earliest time to dial a contact. Valid format is HH:mm
   **/
  public AtzmTimeSlot earliestCallableTime(String earliestCallableTime) {
    this.earliestCallableTime = earliestCallableTime;
    return this;
  }
  
  @ApiModelProperty(example = "08:00", value = "The earliest time to dial a contact. Valid format is HH:mm")
  @JsonProperty("earliestCallableTime")
  public String getEarliestCallableTime() {
    return earliestCallableTime;
  }
  public void setEarliestCallableTime(String earliestCallableTime) {
    this.earliestCallableTime = earliestCallableTime;
  }

  
  /**
   * The latest time to dial a contact. Valid format is HH:mm
   **/
  public AtzmTimeSlot latestCallableTime(String latestCallableTime) {
    this.latestCallableTime = latestCallableTime;
    return this;
  }
  
  @ApiModelProperty(example = "21:00", value = "The latest time to dial a contact. Valid format is HH:mm")
  @JsonProperty("latestCallableTime")
  public String getLatestCallableTime() {
    return latestCallableTime;
  }
  public void setLatestCallableTime(String latestCallableTime) {
    this.latestCallableTime = latestCallableTime;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AtzmTimeSlot atzmTimeSlot = (AtzmTimeSlot) o;
    return Objects.equals(this.earliestCallableTime, atzmTimeSlot.earliestCallableTime) &&
        Objects.equals(this.latestCallableTime, atzmTimeSlot.latestCallableTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(earliestCallableTime, latestCallableTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AtzmTimeSlot {\n");
    
    sb.append("    earliestCallableTime: ").append(toIndentedString(earliestCallableTime)).append("\n");
    sb.append("    latestCallableTime: ").append(toIndentedString(latestCallableTime)).append("\n");
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

