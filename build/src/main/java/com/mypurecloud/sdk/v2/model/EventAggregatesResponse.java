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
import com.mypurecloud.sdk.v2.model.EventDefinitionAggregates;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * EventAggregatesResponse
 */

public class EventAggregatesResponse  implements Serializable {
  
  private String interval = null;
  private List<EventDefinitionAggregates> eventDefinitionAggregates = null;

  public EventAggregatesResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      eventDefinitionAggregates = new ArrayList<EventDefinitionAggregates>();
    }
  }

  
  /**
   * Interval for returned aggregates. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss
   **/
  public EventAggregatesResponse interval(String interval) {
    this.interval = interval;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Interval for returned aggregates. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss")
  @JsonProperty("interval")
  public String getInterval() {
    return interval;
  }
  public void setInterval(String interval) {
    this.interval = interval;
  }


  /**
   * Aggregates by event definition
   **/
  public EventAggregatesResponse eventDefinitionAggregates(List<EventDefinitionAggregates> eventDefinitionAggregates) {
    this.eventDefinitionAggregates = eventDefinitionAggregates;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Aggregates by event definition")
  @JsonProperty("eventDefinitionAggregates")
  public List<EventDefinitionAggregates> getEventDefinitionAggregates() {
    return eventDefinitionAggregates;
  }
  public void setEventDefinitionAggregates(List<EventDefinitionAggregates> eventDefinitionAggregates) {
    this.eventDefinitionAggregates = eventDefinitionAggregates;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventAggregatesResponse eventAggregatesResponse = (EventAggregatesResponse) o;

    return Objects.equals(this.interval, eventAggregatesResponse.interval) &&
            Objects.equals(this.eventDefinitionAggregates, eventAggregatesResponse.eventDefinitionAggregates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interval, eventDefinitionAggregates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventAggregatesResponse {\n");
    
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    eventDefinitionAggregates: ").append(toIndentedString(eventDefinitionAggregates)).append("\n");
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

