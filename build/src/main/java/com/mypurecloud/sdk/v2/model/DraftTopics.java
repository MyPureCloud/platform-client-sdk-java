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
import com.mypurecloud.sdk.v2.model.Miner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * DraftTopics
 */

public class DraftTopics  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Miner miner = null;
  private Integer conversationCount = null;
  private Float conversationPercent = null;
  private Integer utteranceCount = null;
  private Integer phraseCount = null;
  private List<String> phrases = new ArrayList<String>();
  private String selfUri = null;

  
  /**
   * Id for a topic.
   **/
  public DraftTopics id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Id for a topic.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * Topic name.
   **/
  public DraftTopics name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Topic name.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  @ApiModelProperty(example = "null", value = "The miner to which the topic belongs.")
  @JsonProperty("miner")
  public Miner getMiner() {
    return miner;
  }

  
  @ApiModelProperty(example = "null", value = "Number of conversations where a topic has occurred.")
  @JsonProperty("conversationCount")
  public Integer getConversationCount() {
    return conversationCount;
  }

  
  @ApiModelProperty(example = "null", value = "Percentage of conversations where a topic has occurred.")
  @JsonProperty("conversationPercent")
  public Float getConversationPercent() {
    return conversationPercent;
  }

  
  @ApiModelProperty(example = "null", value = "Number of unique utterances where a topic has occurred.")
  @JsonProperty("utteranceCount")
  public Integer getUtteranceCount() {
    return utteranceCount;
  }

  
  @ApiModelProperty(example = "null", value = "Number of unique phrases (sub-utterances) where a topic has occurred.")
  @JsonProperty("phraseCount")
  public Integer getPhraseCount() {
    return phraseCount;
  }

  
  /**
   * The phrases that are extracted for a topic.
   **/
  public DraftTopics phrases(List<String> phrases) {
    this.phrases = phrases;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The phrases that are extracted for a topic.")
  @JsonProperty("phrases")
  public List<String> getPhrases() {
    return phrases;
  }
  public void setPhrases(List<String> phrases) {
    this.phrases = phrases;
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
    DraftTopics draftTopics = (DraftTopics) o;
    return Objects.equals(this.id, draftTopics.id) &&
        Objects.equals(this.name, draftTopics.name) &&
        Objects.equals(this.miner, draftTopics.miner) &&
        Objects.equals(this.conversationCount, draftTopics.conversationCount) &&
        Objects.equals(this.conversationPercent, draftTopics.conversationPercent) &&
        Objects.equals(this.utteranceCount, draftTopics.utteranceCount) &&
        Objects.equals(this.phraseCount, draftTopics.phraseCount) &&
        Objects.equals(this.phrases, draftTopics.phrases) &&
        Objects.equals(this.selfUri, draftTopics.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, miner, conversationCount, conversationPercent, utteranceCount, phraseCount, phrases, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DraftTopics {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    miner: ").append(toIndentedString(miner)).append("\n");
    sb.append("    conversationCount: ").append(toIndentedString(conversationCount)).append("\n");
    sb.append("    conversationPercent: ").append(toIndentedString(conversationPercent)).append("\n");
    sb.append("    utteranceCount: ").append(toIndentedString(utteranceCount)).append("\n");
    sb.append("    phraseCount: ").append(toIndentedString(phraseCount)).append("\n");
    sb.append("    phrases: ").append(toIndentedString(phrases)).append("\n");
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

