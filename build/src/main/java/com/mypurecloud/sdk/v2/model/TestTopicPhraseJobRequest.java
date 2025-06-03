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
import com.mypurecloud.sdk.v2.model.TestTopicPhraseTopic;
import com.mypurecloud.sdk.v2.model.TranscriptsFilters;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * TestTopicPhraseJobRequest
 */

public class TestTopicPhraseJobRequest  implements Serializable {
  
  private TestTopicPhraseTopic topic = null;
  private TranscriptsFilters transcriptsFilters = null;

  public TestTopicPhraseJobRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The topic to test
   **/
  public TestTopicPhraseJobRequest topic(TestTopicPhraseTopic topic) {
    this.topic = topic;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The topic to test")
  @JsonProperty("topic")
  public TestTopicPhraseTopic getTopic() {
    return topic;
  }
  public void setTopic(TestTopicPhraseTopic topic) {
    this.topic = topic;
  }


  /**
   * The transcripts filters
   **/
  public TestTopicPhraseJobRequest transcriptsFilters(TranscriptsFilters transcriptsFilters) {
    this.transcriptsFilters = transcriptsFilters;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The transcripts filters")
  @JsonProperty("transcriptsFilters")
  public TranscriptsFilters getTranscriptsFilters() {
    return transcriptsFilters;
  }
  public void setTranscriptsFilters(TranscriptsFilters transcriptsFilters) {
    this.transcriptsFilters = transcriptsFilters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestTopicPhraseJobRequest testTopicPhraseJobRequest = (TestTopicPhraseJobRequest) o;

    return Objects.equals(this.topic, testTopicPhraseJobRequest.topic) &&
            Objects.equals(this.transcriptsFilters, testTopicPhraseJobRequest.transcriptsFilters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(topic, transcriptsFilters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestTopicPhraseJobRequest {\n");
    
    sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
    sb.append("    transcriptsFilters: ").append(toIndentedString(transcriptsFilters)).append("\n");
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

