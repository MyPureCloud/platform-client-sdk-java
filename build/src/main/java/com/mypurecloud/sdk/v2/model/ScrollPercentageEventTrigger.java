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
 * Details about a scroll percentage event trigger
 */
@ApiModel(description = "Details about a scroll percentage event trigger")

public class ScrollPercentageEventTrigger  implements Serializable {
  
  private Integer percentage = null;
  private String eventName = null;

  
  /**
   * Percentage of a webpage at which an event is triggered.
   **/
  public ScrollPercentageEventTrigger percentage(Integer percentage) {
    this.percentage = percentage;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Percentage of a webpage at which an event is triggered.")
  @JsonProperty("percentage")
  public Integer getPercentage() {
    return percentage;
  }
  public void setPercentage(Integer percentage) {
    this.percentage = percentage;
  }

  
  /**
   * Name of event triggered after scrolling to the specified percentage.
   **/
  public ScrollPercentageEventTrigger eventName(String eventName) {
    this.eventName = eventName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Name of event triggered after scrolling to the specified percentage.")
  @JsonProperty("eventName")
  public String getEventName() {
    return eventName;
  }
  public void setEventName(String eventName) {
    this.eventName = eventName;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScrollPercentageEventTrigger scrollPercentageEventTrigger = (ScrollPercentageEventTrigger) o;
    return Objects.equals(this.percentage, scrollPercentageEventTrigger.percentage) &&
        Objects.equals(this.eventName, scrollPercentageEventTrigger.eventName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(percentage, eventName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScrollPercentageEventTrigger {\n");
    
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
    sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
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

