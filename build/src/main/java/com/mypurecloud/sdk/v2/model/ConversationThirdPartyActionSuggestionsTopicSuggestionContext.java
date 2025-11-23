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
 * ConversationThirdPartyActionSuggestionsTopicSuggestionContext
 */

public class ConversationThirdPartyActionSuggestionsTopicSuggestionContext  implements Serializable {
  
  private String queueId = null;

  private static class MediaTypeEnumDeserializer extends StdDeserializer<MediaTypeEnum> {
    public MediaTypeEnumDeserializer() {
      super(MediaTypeEnumDeserializer.class);
    }

    @Override
    public MediaTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return MediaTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets mediaType
   */
 @JsonDeserialize(using = MediaTypeEnumDeserializer.class)
  public enum MediaTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("UNKNOWN"),
    VOICE("VOICE"),
    MESSAGE("MESSAGE"),
    EMAIL("EMAIL");

    private String value;

    MediaTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static MediaTypeEnum fromString(String key) {
      if (key == null) return null;

      for (MediaTypeEnum value : MediaTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return MediaTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private MediaTypeEnum mediaType = null;
  private String userId = null;
  private String externalContactId = null;
  private String assistantId = null;
  private String utteranceId = null;
  private String messageId = null;
  private String queryStatement = null;
  private String language = null;

  public ConversationThirdPartyActionSuggestionsTopicSuggestionContext() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public ConversationThirdPartyActionSuggestionsTopicSuggestionContext queueId(String queueId) {
    this.queueId = queueId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("queueId")
  public String getQueueId() {
    return queueId;
  }
  public void setQueueId(String queueId) {
    this.queueId = queueId;
  }


  /**
   **/
  public ConversationThirdPartyActionSuggestionsTopicSuggestionContext mediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("mediaType")
  public MediaTypeEnum getMediaType() {
    return mediaType;
  }
  public void setMediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
  }


  /**
   **/
  public ConversationThirdPartyActionSuggestionsTopicSuggestionContext userId(String userId) {
    this.userId = userId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }


  /**
   **/
  public ConversationThirdPartyActionSuggestionsTopicSuggestionContext externalContactId(String externalContactId) {
    this.externalContactId = externalContactId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("externalContactId")
  public String getExternalContactId() {
    return externalContactId;
  }
  public void setExternalContactId(String externalContactId) {
    this.externalContactId = externalContactId;
  }


  /**
   **/
  public ConversationThirdPartyActionSuggestionsTopicSuggestionContext assistantId(String assistantId) {
    this.assistantId = assistantId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("assistantId")
  public String getAssistantId() {
    return assistantId;
  }
  public void setAssistantId(String assistantId) {
    this.assistantId = assistantId;
  }


  /**
   **/
  public ConversationThirdPartyActionSuggestionsTopicSuggestionContext utteranceId(String utteranceId) {
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
  public ConversationThirdPartyActionSuggestionsTopicSuggestionContext messageId(String messageId) {
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
  public ConversationThirdPartyActionSuggestionsTopicSuggestionContext queryStatement(String queryStatement) {
    this.queryStatement = queryStatement;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("queryStatement")
  public String getQueryStatement() {
    return queryStatement;
  }
  public void setQueryStatement(String queryStatement) {
    this.queryStatement = queryStatement;
  }


  /**
   **/
  public ConversationThirdPartyActionSuggestionsTopicSuggestionContext language(String language) {
    this.language = language;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("language")
  public String getLanguage() {
    return language;
  }
  public void setLanguage(String language) {
    this.language = language;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationThirdPartyActionSuggestionsTopicSuggestionContext conversationThirdPartyActionSuggestionsTopicSuggestionContext = (ConversationThirdPartyActionSuggestionsTopicSuggestionContext) o;

    return Objects.equals(this.queueId, conversationThirdPartyActionSuggestionsTopicSuggestionContext.queueId) &&
            Objects.equals(this.mediaType, conversationThirdPartyActionSuggestionsTopicSuggestionContext.mediaType) &&
            Objects.equals(this.userId, conversationThirdPartyActionSuggestionsTopicSuggestionContext.userId) &&
            Objects.equals(this.externalContactId, conversationThirdPartyActionSuggestionsTopicSuggestionContext.externalContactId) &&
            Objects.equals(this.assistantId, conversationThirdPartyActionSuggestionsTopicSuggestionContext.assistantId) &&
            Objects.equals(this.utteranceId, conversationThirdPartyActionSuggestionsTopicSuggestionContext.utteranceId) &&
            Objects.equals(this.messageId, conversationThirdPartyActionSuggestionsTopicSuggestionContext.messageId) &&
            Objects.equals(this.queryStatement, conversationThirdPartyActionSuggestionsTopicSuggestionContext.queryStatement) &&
            Objects.equals(this.language, conversationThirdPartyActionSuggestionsTopicSuggestionContext.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queueId, mediaType, userId, externalContactId, assistantId, utteranceId, messageId, queryStatement, language);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationThirdPartyActionSuggestionsTopicSuggestionContext {\n");
    
    sb.append("    queueId: ").append(toIndentedString(queueId)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    externalContactId: ").append(toIndentedString(externalContactId)).append("\n");
    sb.append("    assistantId: ").append(toIndentedString(assistantId)).append("\n");
    sb.append("    utteranceId: ").append(toIndentedString(utteranceId)).append("\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    queryStatement: ").append(toIndentedString(queryStatement)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
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

