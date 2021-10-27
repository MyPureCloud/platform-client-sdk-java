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
import com.mypurecloud.sdk.v2.model.JourneyOutcomeEventsNotificationActionMap;
import com.mypurecloud.sdk.v2.model.JourneyOutcomeEventsNotificationOutcomeTouchpointChannel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * JourneyOutcomeEventsNotificationOutcomeTouchpoint
 */

public class JourneyOutcomeEventsNotificationOutcomeTouchpoint  implements Serializable {
  
  private String id = null;
  private List<JourneyOutcomeEventsNotificationOutcomeTouchpointChannel> channels = new ArrayList<JourneyOutcomeEventsNotificationOutcomeTouchpointChannel>();
  private Date createdDate = null;
  private JourneyOutcomeEventsNotificationActionMap actionMap = null;

  
  /**
   **/
  public JourneyOutcomeEventsNotificationOutcomeTouchpoint id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   **/
  public JourneyOutcomeEventsNotificationOutcomeTouchpoint channels(List<JourneyOutcomeEventsNotificationOutcomeTouchpointChannel> channels) {
    this.channels = channels;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("channels")
  public List<JourneyOutcomeEventsNotificationOutcomeTouchpointChannel> getChannels() {
    return channels;
  }
  public void setChannels(List<JourneyOutcomeEventsNotificationOutcomeTouchpointChannel> channels) {
    this.channels = channels;
  }

  
  /**
   **/
  public JourneyOutcomeEventsNotificationOutcomeTouchpoint createdDate(Date createdDate) {
    this.createdDate = createdDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("createdDate")
  public Date getCreatedDate() {
    return createdDate;
  }
  public void setCreatedDate(Date createdDate) {
    this.createdDate = createdDate;
  }

  
  /**
   **/
  public JourneyOutcomeEventsNotificationOutcomeTouchpoint actionMap(JourneyOutcomeEventsNotificationActionMap actionMap) {
    this.actionMap = actionMap;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("actionMap")
  public JourneyOutcomeEventsNotificationActionMap getActionMap() {
    return actionMap;
  }
  public void setActionMap(JourneyOutcomeEventsNotificationActionMap actionMap) {
    this.actionMap = actionMap;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JourneyOutcomeEventsNotificationOutcomeTouchpoint journeyOutcomeEventsNotificationOutcomeTouchpoint = (JourneyOutcomeEventsNotificationOutcomeTouchpoint) o;
    return Objects.equals(this.id, journeyOutcomeEventsNotificationOutcomeTouchpoint.id) &&
        Objects.equals(this.channels, journeyOutcomeEventsNotificationOutcomeTouchpoint.channels) &&
        Objects.equals(this.createdDate, journeyOutcomeEventsNotificationOutcomeTouchpoint.createdDate) &&
        Objects.equals(this.actionMap, journeyOutcomeEventsNotificationOutcomeTouchpoint.actionMap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, channels, createdDate, actionMap);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneyOutcomeEventsNotificationOutcomeTouchpoint {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    channels: ").append(toIndentedString(channels)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    actionMap: ").append(toIndentedString(actionMap)).append("\n");
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

