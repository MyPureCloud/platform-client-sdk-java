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
 * ConversationChecklistTopicConversationContextTurnInfo
 */

public class ConversationChecklistTopicConversationContextTurnInfo  implements Serializable {
  
  private String id = null;

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
    UNKNOWN("Unknown"),
    INTERNAL("Internal"),
    EXTERNAL("External");

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

  public ConversationChecklistTopicConversationContextTurnInfo() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public ConversationChecklistTopicConversationContextTurnInfo id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   **/
  public ConversationChecklistTopicConversationContextTurnInfo participant(ParticipantEnum participant) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationChecklistTopicConversationContextTurnInfo conversationChecklistTopicConversationContextTurnInfo = (ConversationChecklistTopicConversationContextTurnInfo) o;

    return Objects.equals(this.id, conversationChecklistTopicConversationContextTurnInfo.id) &&
            Objects.equals(this.participant, conversationChecklistTopicConversationContextTurnInfo.participant);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, participant);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationChecklistTopicConversationContextTurnInfo {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    participant: ").append(toIndentedString(participant)).append("\n");
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

