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
import com.mypurecloud.sdk.v2.model.IgnoreTopic;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * IgnoreTopicsRequest
 */

public class IgnoreTopicsRequest  implements Serializable {
  
  private List<IgnoreTopic> topics = null;

  public IgnoreTopicsRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      topics = new ArrayList<IgnoreTopic>();
    }
  }

  
  /**
   * List of topics to be ignored
   **/
  public IgnoreTopicsRequest topics(List<IgnoreTopic> topics) {
    this.topics = topics;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "List of topics to be ignored")
  @JsonProperty("topics")
  public List<IgnoreTopic> getTopics() {
    return topics;
  }
  public void setTopics(List<IgnoreTopic> topics) {
    this.topics = topics;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IgnoreTopicsRequest ignoreTopicsRequest = (IgnoreTopicsRequest) o;

    return Objects.equals(this.topics, ignoreTopicsRequest.topics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(topics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IgnoreTopicsRequest {\n");
    
    sb.append("    topics: ").append(toIndentedString(topics)).append("\n");
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

