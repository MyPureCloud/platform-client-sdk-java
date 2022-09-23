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
import com.mypurecloud.sdk.v2.model.MatchCriteria;
import com.mypurecloud.sdk.v2.model.TriggerTarget;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * CreateTriggerRequest
 */

public class CreateTriggerRequest  implements Serializable {
  
  private TriggerTarget target = null;
  private Boolean enabled = null;
  private List<MatchCriteria> matchCriteria = new ArrayList<MatchCriteria>();
  private String name = null;
  private String topicName = null;
  private Integer eventTTLSeconds = null;
  private String description = null;

  
  /**
   * The target to invoke when a matching event is received
   **/
  public CreateTriggerRequest target(TriggerTarget target) {
    this.target = target;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The target to invoke when a matching event is received")
  @JsonProperty("target")
  public TriggerTarget getTarget() {
    return target;
  }
  public void setTarget(TriggerTarget target) {
    this.target = target;
  }


  /**
   * Boolean indicating if Trigger is enabled
   **/
  public CreateTriggerRequest enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Boolean indicating if Trigger is enabled")
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  /**
   * The configuration for when a trigger is considered to be a match for an event. When not provided, all events will fire the trigger
   **/
  public CreateTriggerRequest matchCriteria(List<MatchCriteria> matchCriteria) {
    this.matchCriteria = matchCriteria;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The configuration for when a trigger is considered to be a match for an event. When not provided, all events will fire the trigger")
  @JsonProperty("matchCriteria")
  public List<MatchCriteria> getMatchCriteria() {
    return matchCriteria;
  }
  public void setMatchCriteria(List<MatchCriteria> matchCriteria) {
    this.matchCriteria = matchCriteria;
  }


  /**
   * The name of the trigger
   **/
  public CreateTriggerRequest name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the trigger")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The topic that will cause the trigger to be invoked. Cannot be updated after creation. Valid topics can be found at /processautomation/triggers/topics 
   **/
  public CreateTriggerRequest topicName(String topicName) {
    this.topicName = topicName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The topic that will cause the trigger to be invoked. Cannot be updated after creation. Valid topics can be found at /processautomation/triggers/topics ")
  @JsonProperty("topicName")
  public String getTopicName() {
    return topicName;
  }
  public void setTopicName(String topicName) {
    this.topicName = topicName;
  }


  /**
   * How long each event is meaningful after origination, in seconds. Events older than this threshold may be dropped if the platform is delayed in processing events. Unset means events are valid indefinitely.
   **/
  public CreateTriggerRequest eventTTLSeconds(Integer eventTTLSeconds) {
    this.eventTTLSeconds = eventTTLSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "How long each event is meaningful after origination, in seconds. Events older than this threshold may be dropped if the platform is delayed in processing events. Unset means events are valid indefinitely.")
  @JsonProperty("eventTTLSeconds")
  public Integer getEventTTLSeconds() {
    return eventTTLSeconds;
  }
  public void setEventTTLSeconds(Integer eventTTLSeconds) {
    this.eventTTLSeconds = eventTTLSeconds;
  }


  /**
   * Description of the trigger. Can be up to 512 characters in length.
   **/
  public CreateTriggerRequest description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Description of the trigger. Can be up to 512 characters in length.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateTriggerRequest createTriggerRequest = (CreateTriggerRequest) o;

    return Objects.equals(this.target, createTriggerRequest.target) &&
            Objects.equals(this.enabled, createTriggerRequest.enabled) &&
            Objects.equals(this.matchCriteria, createTriggerRequest.matchCriteria) &&
            Objects.equals(this.name, createTriggerRequest.name) &&
            Objects.equals(this.topicName, createTriggerRequest.topicName) &&
            Objects.equals(this.eventTTLSeconds, createTriggerRequest.eventTTLSeconds) &&
            Objects.equals(this.description, createTriggerRequest.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(target, enabled, matchCriteria, name, topicName, eventTTLSeconds, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTriggerRequest {\n");
    
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    matchCriteria: ").append(toIndentedString(matchCriteria)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    topicName: ").append(toIndentedString(topicName)).append("\n");
    sb.append("    eventTTLSeconds: ").append(toIndentedString(eventTTLSeconds)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

