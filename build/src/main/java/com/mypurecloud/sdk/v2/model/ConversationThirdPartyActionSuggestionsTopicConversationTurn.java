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
 * ConversationThirdPartyActionSuggestionsTopicConversationTurn
 */

public class ConversationThirdPartyActionSuggestionsTopicConversationTurn  implements Serializable {
  
  private String utteranceId = null;
  private String messageId = null;

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
   * Gets or Sets participant
   */
 @JsonDeserialize(using = ParticipantEnumDeserializer.class)
  public enum ParticipantEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("UNKNOWN"),
    AGENT("AGENT"),
    CUSTOMER("CUSTOMER");

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

  public ConversationThirdPartyActionSuggestionsTopicConversationTurn() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public ConversationThirdPartyActionSuggestionsTopicConversationTurn(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   **/
  public ConversationThirdPartyActionSuggestionsTopicConversationTurn utteranceId(String utteranceId) {
    this.utteranceId = utteranceId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("utteranceId")
  public String getUtteranceId() {
    return utteranceId;
  }
  public void setUtteranceId(String utteranceId) {
    this.utteranceId = utteranceId;
  }


  /**
   **/
  public ConversationThirdPartyActionSuggestionsTopicConversationTurn messageId(String messageId) {
    this.messageId = messageId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("messageId")
  public String getMessageId() {
    return messageId;
  }
  public void setMessageId(String messageId) {
    this.messageId = messageId;
  }


  /**
   **/
  public ConversationThirdPartyActionSuggestionsTopicConversationTurn participant(ParticipantEnum participant) {
    this.participant = participant;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("participant")
  public ParticipantEnum getParticipant() {
    return participant;
  }
  public void setParticipant(ParticipantEnum participant) {
    this.participant = participant;
  }


  /**
   **/
  public ConversationThirdPartyActionSuggestionsTopicConversationTurn text(String text) {
    this.text = text;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
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
    ConversationThirdPartyActionSuggestionsTopicConversationTurn conversationThirdPartyActionSuggestionsTopicConversationTurn = (ConversationThirdPartyActionSuggestionsTopicConversationTurn) o;

    return Objects.equals(this.utteranceId, conversationThirdPartyActionSuggestionsTopicConversationTurn.utteranceId) &&
            Objects.equals(this.messageId, conversationThirdPartyActionSuggestionsTopicConversationTurn.messageId) &&
            Objects.equals(this.participant, conversationThirdPartyActionSuggestionsTopicConversationTurn.participant) &&
            Objects.equals(this.text, conversationThirdPartyActionSuggestionsTopicConversationTurn.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(utteranceId, messageId, participant, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationThirdPartyActionSuggestionsTopicConversationTurn {\n");
    
    sb.append("    utteranceId: ").append(toIndentedString(utteranceId)).append("\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
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

