package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.Phrase;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * CreateTopicRequest
 */

public class CreateTopicRequest  implements Serializable {
  
  private String name = null;
  private String description = null;

  /**
   * The topic strictness
   */
  public enum StrictnessEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    _1("1"),
    _55("55"),
    _65("65"),
    _72("72"),
    _85("85"),
    _90("90");

    private String value;

    StrictnessEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StrictnessEnum fromString(String key) {
      if (key == null) return null;

      for (StrictnessEnum value : StrictnessEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StrictnessEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StrictnessEnum strictness = null;
  private List<String> programIds = new ArrayList<String>();
  private List<String> tags = new ArrayList<String>();
  private String dialect = null;

  /**
   * The topic participants
   */
  public enum ParticipantsEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    CUSTOMERSIDE("CustomerSide"),
    AGENTSIDE("AgentSide"),
    ALL("All");

    private String value;

    ParticipantsEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ParticipantsEnum fromString(String key) {
      if (key == null) return null;

      for (ParticipantsEnum value : ParticipantsEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ParticipantsEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ParticipantsEnum participants = null;
  private List<Phrase> phrases = new ArrayList<Phrase>();

  
  /**
   * The topic name
   **/
  public CreateTopicRequest name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The topic name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The topic description
   **/
  public CreateTopicRequest description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The topic description")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * The topic strictness
   **/
  public CreateTopicRequest strictness(StrictnessEnum strictness) {
    this.strictness = strictness;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The topic strictness")
  @JsonProperty("strictness")
  public StrictnessEnum getStrictness() {
    return strictness;
  }
  public void setStrictness(StrictnessEnum strictness) {
    this.strictness = strictness;
  }

  
  /**
   * The ids of programs associated to the topic
   **/
  public CreateTopicRequest programIds(List<String> programIds) {
    this.programIds = programIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ids of programs associated to the topic")
  @JsonProperty("programIds")
  public List<String> getProgramIds() {
    return programIds;
  }
  public void setProgramIds(List<String> programIds) {
    this.programIds = programIds;
  }

  
  /**
   * The topic tags
   **/
  public CreateTopicRequest tags(List<String> tags) {
    this.tags = tags;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The topic tags")
  @JsonProperty("tags")
  public List<String> getTags() {
    return tags;
  }
  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  
  /**
   * The topic dialect
   **/
  public CreateTopicRequest dialect(String dialect) {
    this.dialect = dialect;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The topic dialect")
  @JsonProperty("dialect")
  public String getDialect() {
    return dialect;
  }
  public void setDialect(String dialect) {
    this.dialect = dialect;
  }

  
  /**
   * The topic participants
   **/
  public CreateTopicRequest participants(ParticipantsEnum participants) {
    this.participants = participants;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The topic participants")
  @JsonProperty("participants")
  public ParticipantsEnum getParticipants() {
    return participants;
  }
  public void setParticipants(ParticipantsEnum participants) {
    this.participants = participants;
  }

  
  /**
   * The topic phrases
   **/
  public CreateTopicRequest phrases(List<Phrase> phrases) {
    this.phrases = phrases;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The topic phrases")
  @JsonProperty("phrases")
  public List<Phrase> getPhrases() {
    return phrases;
  }
  public void setPhrases(List<Phrase> phrases) {
    this.phrases = phrases;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateTopicRequest createTopicRequest = (CreateTopicRequest) o;
    return Objects.equals(this.name, createTopicRequest.name) &&
        Objects.equals(this.description, createTopicRequest.description) &&
        Objects.equals(this.strictness, createTopicRequest.strictness) &&
        Objects.equals(this.programIds, createTopicRequest.programIds) &&
        Objects.equals(this.tags, createTopicRequest.tags) &&
        Objects.equals(this.dialect, createTopicRequest.dialect) &&
        Objects.equals(this.participants, createTopicRequest.participants) &&
        Objects.equals(this.phrases, createTopicRequest.phrases);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, strictness, programIds, tags, dialect, participants, phrases);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTopicRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    strictness: ").append(toIndentedString(strictness)).append("\n");
    sb.append("    programIds: ").append(toIndentedString(programIds)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    dialect: ").append(toIndentedString(dialect)).append("\n");
    sb.append("    participants: ").append(toIndentedString(participants)).append("\n");
    sb.append("    phrases: ").append(toIndentedString(phrases)).append("\n");
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

