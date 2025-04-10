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
import com.mypurecloud.sdk.v2.model.MinerTopic;
import com.mypurecloud.sdk.v2.model.Utterance;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * MinerTopicPhrase
 */

public class MinerTopicPhrase  implements Serializable {
  
  private String id = null;
  private String name = null;
  private MinerTopic topic = null;
  private List<Utterance> utterances = null;
  private Integer utteranceCount = null;
  private String selfUri = null;

  public MinerTopicPhrase() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      utterances = new ArrayList<Utterance>();
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * Phrase name.
   **/
  public MinerTopicPhrase name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Phrase name.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * Topic associated with a phrase.
   **/
  public MinerTopicPhrase topic(MinerTopic topic) {
    this.topic = topic;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Topic associated with a phrase.")
  @JsonProperty("topic")
  public MinerTopic getTopic() {
    return topic;
  }
  public void setTopic(MinerTopic topic) {
    this.topic = topic;
  }


  /**
   * List of utterances related to a phrase.
   **/
  public MinerTopicPhrase utterances(List<Utterance> utterances) {
    this.utterances = utterances;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of utterances related to a phrase.")
  @JsonProperty("utterances")
  public List<Utterance> getUtterances() {
    return utterances;
  }
  public void setUtterances(List<Utterance> utterances) {
    this.utterances = utterances;
  }


  /**
   * Number of utterances belonging to a phrase
   **/
  public MinerTopicPhrase utteranceCount(Integer utteranceCount) {
    this.utteranceCount = utteranceCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of utterances belonging to a phrase")
  @JsonProperty("utteranceCount")
  public Integer getUtteranceCount() {
    return utteranceCount;
  }
  public void setUtteranceCount(Integer utteranceCount) {
    this.utteranceCount = utteranceCount;
  }


  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MinerTopicPhrase minerTopicPhrase = (MinerTopicPhrase) o;

    return Objects.equals(this.id, minerTopicPhrase.id) &&
            Objects.equals(this.name, minerTopicPhrase.name) &&
            Objects.equals(this.topic, minerTopicPhrase.topic) &&
            Objects.equals(this.utterances, minerTopicPhrase.utterances) &&
            Objects.equals(this.utteranceCount, minerTopicPhrase.utteranceCount) &&
            Objects.equals(this.selfUri, minerTopicPhrase.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, topic, utterances, utteranceCount, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MinerTopicPhrase {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
    sb.append("    utterances: ").append(toIndentedString(utterances)).append("\n");
    sb.append("    utteranceCount: ").append(toIndentedString(utteranceCount)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

