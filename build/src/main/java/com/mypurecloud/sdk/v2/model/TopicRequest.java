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
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.Phrase;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * TopicRequest
 */

public class TopicRequest  implements Serializable {
  
  private String name = null;
  private String description = null;

  private static class StrictnessEnumDeserializer extends StdDeserializer<StrictnessEnum> {
    public StrictnessEnumDeserializer() {
      super(StrictnessEnumDeserializer.class);
    }

    @Override
    public StrictnessEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return StrictnessEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The topic strictness, default value is 72
   */
 @JsonDeserialize(using = StrictnessEnumDeserializer.class)
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

  private static class ParticipantsEnumDeserializer extends StdDeserializer<ParticipantsEnum> {
    public ParticipantsEnumDeserializer() {
      super(ParticipantsEnumDeserializer.class);
    }

    @Override
    public ParticipantsEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ParticipantsEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The topic participants, default value is All
   */
 @JsonDeserialize(using = ParticipantsEnumDeserializer.class)
  public enum ParticipantsEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    EXTERNAL("External"),
    INTERNAL("Internal"),
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
  public TopicRequest name(String name) {
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
  public TopicRequest description(String description) {
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
   * The topic strictness, default value is 72
   **/
  public TopicRequest strictness(StrictnessEnum strictness) {
    this.strictness = strictness;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The topic strictness, default value is 72")
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
  public TopicRequest programIds(List<String> programIds) {
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
  public TopicRequest tags(List<String> tags) {
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
  public TopicRequest dialect(String dialect) {
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
   * The topic participants, default value is All
   **/
  public TopicRequest participants(ParticipantsEnum participants) {
    this.participants = participants;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The topic participants, default value is All")
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
  public TopicRequest phrases(List<Phrase> phrases) {
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
    TopicRequest topicRequest = (TopicRequest) o;
    return Objects.equals(this.name, topicRequest.name) &&
        Objects.equals(this.description, topicRequest.description) &&
        Objects.equals(this.strictness, topicRequest.strictness) &&
        Objects.equals(this.programIds, topicRequest.programIds) &&
        Objects.equals(this.tags, topicRequest.tags) &&
        Objects.equals(this.dialect, topicRequest.dialect) &&
        Objects.equals(this.participants, topicRequest.participants) &&
        Objects.equals(this.phrases, topicRequest.phrases);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, strictness, programIds, tags, dialect, participants, phrases);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TopicRequest {\n");
    
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

