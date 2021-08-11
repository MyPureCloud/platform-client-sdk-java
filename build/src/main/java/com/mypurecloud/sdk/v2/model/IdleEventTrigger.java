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
 * Details about an idle event trigger
 */
@ApiModel(description = "Details about an idle event trigger")

public class IdleEventTrigger  implements Serializable {
  
  private String eventName = null;
  private Long idleAfterSeconds = null;

  
  /**
   * Name of event triggered after period of inactivity.
   **/
  public IdleEventTrigger eventName(String eventName) {
    this.eventName = eventName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Name of event triggered after period of inactivity.")
  @JsonProperty("eventName")
  public String getEventName() {
    return eventName;
  }
  public void setEventName(String eventName) {
    this.eventName = eventName;
  }

  
  /**
   * Number of seconds of inactivity before an event is triggered.
   **/
  public IdleEventTrigger idleAfterSeconds(Long idleAfterSeconds) {
    this.idleAfterSeconds = idleAfterSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of seconds of inactivity before an event is triggered.")
  @JsonProperty("idleAfterSeconds")
  public Long getIdleAfterSeconds() {
    return idleAfterSeconds;
  }
  public void setIdleAfterSeconds(Long idleAfterSeconds) {
    this.idleAfterSeconds = idleAfterSeconds;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdleEventTrigger idleEventTrigger = (IdleEventTrigger) o;
    return Objects.equals(this.eventName, idleEventTrigger.eventName) &&
        Objects.equals(this.idleAfterSeconds, idleEventTrigger.idleAfterSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventName, idleAfterSeconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdleEventTrigger {\n");
    
    sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
    sb.append("    idleAfterSeconds: ").append(toIndentedString(idleAfterSeconds)).append("\n");
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

