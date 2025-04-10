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
import com.mypurecloud.sdk.v2.model.OpenEvent;
import com.mypurecloud.sdk.v2.model.OpenInboundMessagingChannel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Open Event Messaging rich media message structure
 */
@ApiModel(description = "Open Event Messaging rich media message structure")

public class OpenInboundNormalizedEvent  implements Serializable {
  
  private OpenInboundMessagingChannel channel = null;
  private List<OpenEvent> events = null;

  public OpenInboundNormalizedEvent() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      events = new ArrayList<OpenEvent>();
    }
  }

  
  /**
   * Channel-specific information that describes the message and the message channel/provider.
   **/
  public OpenInboundNormalizedEvent channel(OpenInboundMessagingChannel channel) {
    this.channel = channel;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Channel-specific information that describes the message and the message channel/provider.")
  @JsonProperty("channel")
  public OpenInboundMessagingChannel getChannel() {
    return channel;
  }
  public void setChannel(OpenInboundMessagingChannel channel) {
    this.channel = channel;
  }


  /**
   * List of event elements.
   **/
  public OpenInboundNormalizedEvent events(List<OpenEvent> events) {
    this.events = events;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "List of event elements.")
  @JsonProperty("events")
  public List<OpenEvent> getEvents() {
    return events;
  }
  public void setEvents(List<OpenEvent> events) {
    this.events = events;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenInboundNormalizedEvent openInboundNormalizedEvent = (OpenInboundNormalizedEvent) o;

    return Objects.equals(this.channel, openInboundNormalizedEvent.channel) &&
            Objects.equals(this.events, openInboundNormalizedEvent.events);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channel, events);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenInboundNormalizedEvent {\n");
    
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
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

