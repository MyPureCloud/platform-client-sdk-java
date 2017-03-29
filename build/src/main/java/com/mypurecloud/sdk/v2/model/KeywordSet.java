package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.Keyword;
import com.mypurecloud.sdk.v2.model.Queue;
import com.mypurecloud.sdk.v2.model.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * KeywordSet
 */

public class KeywordSet  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String description = null;
  private List<Queue> queues = new ArrayList<Queue>();
  private String language = null;
  private List<User> agents = new ArrayList<User>();
  private List<Keyword> keywords = new ArrayList<Keyword>();

  /**
   * Gets or Sets participantPurposes
   */
  public enum ParticipantPurposesEnum {
    AGENT("AGENT"),
    CUSTOMER("CUSTOMER");

    private String value;

    ParticipantPurposesEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ParticipantPurposesEnum fromString(String key) {
      if (key == null) return null;

      for (ParticipantPurposesEnum value : ParticipantPurposesEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ParticipantPurposesEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<ParticipantPurposesEnum> participantPurposes = new ArrayList<ParticipantPurposesEnum>();
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   **/
  public KeywordSet name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   **/
  public KeywordSet description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   **/
  public KeywordSet queues(List<Queue> queues) {
    this.queues = queues;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("queues")
  public List<Queue> getQueues() {
    return queues;
  }
  public void setQueues(List<Queue> queues) {
    this.queues = queues;
  }


  /**
   * Language code, such as 'en-US'
   **/
  public KeywordSet language(String language) {
    this.language = language;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Language code, such as 'en-US'")
  @JsonProperty("language")
  public String getLanguage() {
    return language;
  }
  public void setLanguage(String language) {
    this.language = language;
  }


  /**
   **/
  public KeywordSet agents(List<User> agents) {
    this.agents = agents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("agents")
  public List<User> getAgents() {
    return agents;
  }
  public void setAgents(List<User> agents) {
    this.agents = agents;
  }


  /**
   * The list of keywords to be used for keyword spotting.
   **/
  public KeywordSet keywords(List<Keyword> keywords) {
    this.keywords = keywords;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The list of keywords to be used for keyword spotting.")
  @JsonProperty("keywords")
  public List<Keyword> getKeywords() {
    return keywords;
  }
  public void setKeywords(List<Keyword> keywords) {
    this.keywords = keywords;
  }


  /**
   * The types of participants to use keyword spotting on.
   **/
  public KeywordSet participantPurposes(List<ParticipantPurposesEnum> participantPurposes) {
    this.participantPurposes = participantPurposes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The types of participants to use keyword spotting on.")
  @JsonProperty("participantPurposes")
  public List<ParticipantPurposesEnum> getParticipantPurposes() {
    return participantPurposes;
  }
  public void setParticipantPurposes(List<ParticipantPurposesEnum> participantPurposes) {
    this.participantPurposes = participantPurposes;
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
    KeywordSet keywordSet = (KeywordSet) o;
    return Objects.equals(this.id, keywordSet.id) &&
        Objects.equals(this.name, keywordSet.name) &&
        Objects.equals(this.description, keywordSet.description) &&
        Objects.equals(this.queues, keywordSet.queues) &&
        Objects.equals(this.language, keywordSet.language) &&
        Objects.equals(this.agents, keywordSet.agents) &&
        Objects.equals(this.keywords, keywordSet.keywords) &&
        Objects.equals(this.participantPurposes, keywordSet.participantPurposes) &&
        Objects.equals(this.selfUri, keywordSet.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, queues, language, agents, keywords, participantPurposes, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeywordSet {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    queues: ").append(toIndentedString(queues)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    agents: ").append(toIndentedString(agents)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    participantPurposes: ").append(toIndentedString(participantPurposes)).append("\n");
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

