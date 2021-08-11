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
 * Details about a selector event trigger
 */
@ApiModel(description = "Details about a selector event trigger")

public class SelectorEventTrigger  implements Serializable {
  
  private String selector = null;
  private String eventName = null;

  
  /**
   * Element that triggers event.
   **/
  public SelectorEventTrigger selector(String selector) {
    this.selector = selector;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Element that triggers event.")
  @JsonProperty("selector")
  public String getSelector() {
    return selector;
  }
  public void setSelector(String selector) {
    this.selector = selector;
  }

  
  /**
   * Name of event triggered when element matching selector is interacted with.
   **/
  public SelectorEventTrigger eventName(String eventName) {
    this.eventName = eventName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Name of event triggered when element matching selector is interacted with.")
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
    SelectorEventTrigger selectorEventTrigger = (SelectorEventTrigger) o;
    return Objects.equals(this.selector, selectorEventTrigger.selector) &&
        Objects.equals(this.eventName, selectorEventTrigger.eventName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(selector, eventName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SelectorEventTrigger {\n");
    
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
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

