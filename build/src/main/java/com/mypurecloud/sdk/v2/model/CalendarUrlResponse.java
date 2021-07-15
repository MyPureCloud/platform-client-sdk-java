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
 * CalendarUrlResponse
 */

public class CalendarUrlResponse  implements Serializable {
  
  private String calendarUrl = null;
  private String selfUri = null;

  
  /**
   * The calendar url for the user to subscribe with supported clients
   **/
  public CalendarUrlResponse calendarUrl(String calendarUrl) {
    this.calendarUrl = calendarUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The calendar url for the user to subscribe with supported clients")
  @JsonProperty("calendarUrl")
  public String getCalendarUrl() {
    return calendarUrl;
  }
  public void setCalendarUrl(String calendarUrl) {
    this.calendarUrl = calendarUrl;
  }

  
  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CalendarUrlResponse calendarUrlResponse = (CalendarUrlResponse) o;
    return Objects.equals(this.calendarUrl, calendarUrlResponse.calendarUrl) &&
        Objects.equals(this.selfUri, calendarUrlResponse.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(calendarUrl, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CalendarUrlResponse {\n");
    
    sb.append("    calendarUrl: ").append(toIndentedString(calendarUrl)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

