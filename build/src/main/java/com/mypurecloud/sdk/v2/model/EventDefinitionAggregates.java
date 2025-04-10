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
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * EventDefinitionAggregates
 */

public class EventDefinitionAggregates  implements Serializable {
  
  private AddressableEntityRef eventDefinition = null;
  private Integer eventCount = null;

  public EventDefinitionAggregates() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Event definition.
   **/
  public EventDefinitionAggregates eventDefinition(AddressableEntityRef eventDefinition) {
    this.eventDefinition = eventDefinition;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Event definition.")
  @JsonProperty("eventDefinition")
  public AddressableEntityRef getEventDefinition() {
    return eventDefinition;
  }
  public void setEventDefinition(AddressableEntityRef eventDefinition) {
    this.eventDefinition = eventDefinition;
  }


  /**
   * How many events have occurred.
   **/
  public EventDefinitionAggregates eventCount(Integer eventCount) {
    this.eventCount = eventCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "How many events have occurred.")
  @JsonProperty("eventCount")
  public Integer getEventCount() {
    return eventCount;
  }
  public void setEventCount(Integer eventCount) {
    this.eventCount = eventCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventDefinitionAggregates eventDefinitionAggregates = (EventDefinitionAggregates) o;

    return Objects.equals(this.eventDefinition, eventDefinitionAggregates.eventDefinition) &&
            Objects.equals(this.eventCount, eventDefinitionAggregates.eventCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventDefinition, eventCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventDefinitionAggregates {\n");
    
    sb.append("    eventDefinition: ").append(toIndentedString(eventDefinition)).append("\n");
    sb.append("    eventCount: ").append(toIndentedString(eventCount)).append("\n");
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

