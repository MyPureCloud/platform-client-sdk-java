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
import com.mypurecloud.sdk.v2.model.DraftIntents;
import com.mypurecloud.sdk.v2.model.DraftTopics;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * DraftRequest
 */

public class DraftRequest  implements Serializable {
  
  private List<DraftIntents> intents = new ArrayList<DraftIntents>();
  private List<DraftTopics> topic = new ArrayList<DraftTopics>();

  
  /**
   * Draft intent object.
   **/
  public DraftRequest intents(List<DraftIntents> intents) {
    this.intents = intents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Draft intent object.")
  @JsonProperty("intents")
  public List<DraftIntents> getIntents() {
    return intents;
  }
  public void setIntents(List<DraftIntents> intents) {
    this.intents = intents;
  }

  
  /**
   **/
  public DraftRequest topic(List<DraftTopics> topic) {
    this.topic = topic;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("topic")
  public List<DraftTopics> getTopic() {
    return topic;
  }
  public void setTopic(List<DraftTopics> topic) {
    this.topic = topic;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DraftRequest draftRequest = (DraftRequest) o;
    return Objects.equals(this.intents, draftRequest.intents) &&
        Objects.equals(this.topic, draftRequest.topic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(intents, topic);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DraftRequest {\n");
    
    sb.append("    intents: ").append(toIndentedString(intents)).append("\n");
    sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
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

