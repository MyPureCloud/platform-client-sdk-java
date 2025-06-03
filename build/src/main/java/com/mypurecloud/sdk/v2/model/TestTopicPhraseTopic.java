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
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.TestTopicPhrasePhrase;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * TestTopicPhraseTopic
 */

public class TestTopicPhraseTopic  implements Serializable {
  
  private TestTopicPhrasePhrase phrase = null;

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
   * The topic participants, default value is both
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

  public TestTopicPhraseTopic() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The topic phrase to test
   **/
  public TestTopicPhraseTopic phrase(TestTopicPhrasePhrase phrase) {
    this.phrase = phrase;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The topic phrase to test")
  @JsonProperty("phrase")
  public TestTopicPhrasePhrase getPhrase() {
    return phrase;
  }
  public void setPhrase(TestTopicPhrasePhrase phrase) {
    this.phrase = phrase;
  }


  /**
   * The topic strictness, default value is 72
   **/
  public TestTopicPhraseTopic strictness(StrictnessEnum strictness) {
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
   * The topic dialect, default value is en-US
   **/
  public TestTopicPhraseTopic dialect(String dialect) {
    this.dialect = dialect;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The topic dialect, default value is en-US")
  @JsonProperty("dialect")
  public String getDialect() {
    return dialect;
  }
  public void setDialect(String dialect) {
    this.dialect = dialect;
  }


  /**
   * The topic participants, default value is both
   **/
  public TestTopicPhraseTopic participants(ParticipantsEnum participants) {
    this.participants = participants;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The topic participants, default value is both")
  @JsonProperty("participants")
  public ParticipantsEnum getParticipants() {
    return participants;
  }
  public void setParticipants(ParticipantsEnum participants) {
    this.participants = participants;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestTopicPhraseTopic testTopicPhraseTopic = (TestTopicPhraseTopic) o;

    return Objects.equals(this.phrase, testTopicPhraseTopic.phrase) &&
            Objects.equals(this.strictness, testTopicPhraseTopic.strictness) &&
            Objects.equals(this.dialect, testTopicPhraseTopic.dialect) &&
            Objects.equals(this.participants, testTopicPhraseTopic.participants);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phrase, strictness, dialect, participants);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestTopicPhraseTopic {\n");
    
    sb.append("    phrase: ").append(toIndentedString(phrase)).append("\n");
    sb.append("    strictness: ").append(toIndentedString(strictness)).append("\n");
    sb.append("    dialect: ").append(toIndentedString(dialect)).append("\n");
    sb.append("    participants: ").append(toIndentedString(participants)).append("\n");
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

