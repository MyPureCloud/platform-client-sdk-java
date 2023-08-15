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
 * AppEventRequestSession
 */

public class AppEventRequestSession  implements Serializable {
  
  private String id = null;
  private Integer eventCount = null;
  private Integer screenviewCount = null;

  
  /**
   * ID of the app session.
   **/
  public AppEventRequestSession id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "ID of the app session.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * The count of all events recorded during this session. This should be incremented for each event in the session, regardless of event name.
   **/
  public AppEventRequestSession eventCount(Integer eventCount) {
    this.eventCount = eventCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The count of all events recorded during this session. This should be incremented for each event in the session, regardless of event name.")
  @JsonProperty("eventCount")
  public Integer getEventCount() {
    return eventCount;
  }
  public void setEventCount(Integer eventCount) {
    this.eventCount = eventCount;
  }


  /**
   * The count of all screen view events recorded during this session. This should be incremented for each screen_viewed event in the session.
   **/
  public AppEventRequestSession screenviewCount(Integer screenviewCount) {
    this.screenviewCount = screenviewCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The count of all screen view events recorded during this session. This should be incremented for each screen_viewed event in the session.")
  @JsonProperty("screenviewCount")
  public Integer getScreenviewCount() {
    return screenviewCount;
  }
  public void setScreenviewCount(Integer screenviewCount) {
    this.screenviewCount = screenviewCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppEventRequestSession appEventRequestSession = (AppEventRequestSession) o;

    return Objects.equals(this.id, appEventRequestSession.id) &&
            Objects.equals(this.eventCount, appEventRequestSession.eventCount) &&
            Objects.equals(this.screenviewCount, appEventRequestSession.screenviewCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, eventCount, screenviewCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppEventRequestSession {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    eventCount: ").append(toIndentedString(eventCount)).append("\n");
    sb.append("    screenviewCount: ").append(toIndentedString(screenviewCount)).append("\n");
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

