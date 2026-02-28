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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * KnowledgeConversationTurn
 */

public class KnowledgeConversationTurn  implements Serializable {
  

  private static class ParticipantEnumDeserializer extends StdDeserializer<ParticipantEnum> {
    public ParticipantEnumDeserializer() {
      super(ParticipantEnumDeserializer.class);
    }

    @Override
    public ParticipantEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ParticipantEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The participant type.
   */
 @JsonDeserialize(using = ParticipantEnumDeserializer.class)
  public enum ParticipantEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    EXTERNAL("External"),
    INTERNAL("Internal");

    private String value;

    ParticipantEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ParticipantEnum fromString(String key) {
      if (key == null) return null;

      for (ParticipantEnum value : ParticipantEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ParticipantEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ParticipantEnum participant = null;
  private String text = null;

  public KnowledgeConversationTurn() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The participant type.
   **/
  public KnowledgeConversationTurn participant(ParticipantEnum participant) {
    this.participant = participant;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The participant type.")
  @JsonProperty("participant")
  public ParticipantEnum getParticipant() {
    return participant;
  }
  public void setParticipant(ParticipantEnum participant) {
    this.participant = participant;
  }


  /**
   * The message text.
   **/
  public KnowledgeConversationTurn text(String text) {
    this.text = text;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The message text.")
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KnowledgeConversationTurn knowledgeConversationTurn = (KnowledgeConversationTurn) o;

    return Objects.equals(this.participant, knowledgeConversationTurn.participant) &&
            Objects.equals(this.text, knowledgeConversationTurn.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(participant, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowledgeConversationTurn {\n");
    
    sb.append("    participant: ").append(toIndentedString(participant)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

