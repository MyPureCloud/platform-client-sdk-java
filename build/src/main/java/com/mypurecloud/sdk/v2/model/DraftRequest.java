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
import com.mypurecloud.sdk.v2.model.DraftIntents;
import com.mypurecloud.sdk.v2.model.DraftTopicRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * DraftRequest
 */

public class DraftRequest  implements Serializable {
  
  private List<DraftIntents> intents = null;
  private List<DraftTopicRequest> topics = null;

  public DraftRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      intents = new ArrayList<DraftIntents>();
      topics = new ArrayList<DraftTopicRequest>();
    }
  }

  
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
   * Draft topic object.
   **/
  public DraftRequest topics(List<DraftTopicRequest> topics) {
    this.topics = topics;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Draft topic object.")
  @JsonProperty("topics")
  public List<DraftTopicRequest> getTopics() {
    return topics;
  }
  public void setTopics(List<DraftTopicRequest> topics) {
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
    DraftRequest draftRequest = (DraftRequest) o;

    return Objects.equals(this.intents, draftRequest.intents) &&
            Objects.equals(this.topics, draftRequest.topics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(intents, topics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DraftRequest {\n");
    
    sb.append("    intents: ").append(toIndentedString(intents)).append("\n");
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

