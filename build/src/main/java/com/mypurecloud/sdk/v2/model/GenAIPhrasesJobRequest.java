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
import com.mypurecloud.sdk.v2.model.GenAIPhrasesJobTopic;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * GenAIPhrasesJobRequest
 */

public class GenAIPhrasesJobRequest  implements Serializable {
  
  private GenAIPhrasesJobTopic topic = null;

  public GenAIPhrasesJobRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public GenAIPhrasesJobRequest(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * topic used for phrases generation by GenAI
   **/
  public GenAIPhrasesJobRequest topic(GenAIPhrasesJobTopic topic) {
    this.topic = topic;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "topic used for phrases generation by GenAI")
  @JsonProperty("topic")
  public GenAIPhrasesJobTopic getTopic() {
    return topic;
  }
  public void setTopic(GenAIPhrasesJobTopic topic) {
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
    GenAIPhrasesJobRequest genAIPhrasesJobRequest = (GenAIPhrasesJobRequest) o;

    return Objects.equals(this.topic, genAIPhrasesJobRequest.topic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(topic);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenAIPhrasesJobRequest {\n");
    
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

