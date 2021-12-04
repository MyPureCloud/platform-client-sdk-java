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
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import com.mypurecloud.sdk.v2.model.ParticipantMetrics;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ConversationMetrics
 */

public class ConversationMetrics  implements Serializable {
  
  private AddressableEntityRef conversation = null;
  private Double sentimentScore = null;
  private Double sentimentTrend = null;

  private static class SentimentTrendClassEnumDeserializer extends StdDeserializer<SentimentTrendClassEnum> {
    public SentimentTrendClassEnumDeserializer() {
      super(SentimentTrendClassEnumDeserializer.class);
    }

    @Override
    public SentimentTrendClassEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return SentimentTrendClassEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The Sentiment Trend Class
   */
 @JsonDeserialize(using = SentimentTrendClassEnumDeserializer.class)
  public enum SentimentTrendClassEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    NOTCALCULATED("NotCalculated"),
    DECLINING("Declining"),
    SLIGHTLYDECLINING("SlightlyDeclining"),
    NOCHANGE("NoChange"),
    SLIGHTLYIMPROVING("SlightlyImproving"),
    IMPROVING("Improving");

    private String value;

    SentimentTrendClassEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static SentimentTrendClassEnum fromString(String key) {
      if (key == null) return null;

      for (SentimentTrendClassEnum value : SentimentTrendClassEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return SentimentTrendClassEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private SentimentTrendClassEnum sentimentTrendClass = null;
  private ParticipantMetrics participantMetrics = null;

  
  /**
   * The Conversation Reference
   **/
  public ConversationMetrics conversation(AddressableEntityRef conversation) {
    this.conversation = conversation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Conversation Reference")
  @JsonProperty("conversation")
  public AddressableEntityRef getConversation() {
    return conversation;
  }
  public void setConversation(AddressableEntityRef conversation) {
    this.conversation = conversation;
  }

  
  /**
   * The Sentiment Score
   **/
  public ConversationMetrics sentimentScore(Double sentimentScore) {
    this.sentimentScore = sentimentScore;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Sentiment Score")
  @JsonProperty("sentimentScore")
  public Double getSentimentScore() {
    return sentimentScore;
  }
  public void setSentimentScore(Double sentimentScore) {
    this.sentimentScore = sentimentScore;
  }

  
  /**
   * The Sentiment Trend
   **/
  public ConversationMetrics sentimentTrend(Double sentimentTrend) {
    this.sentimentTrend = sentimentTrend;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Sentiment Trend")
  @JsonProperty("sentimentTrend")
  public Double getSentimentTrend() {
    return sentimentTrend;
  }
  public void setSentimentTrend(Double sentimentTrend) {
    this.sentimentTrend = sentimentTrend;
  }

  
  /**
   * The Sentiment Trend Class
   **/
  public ConversationMetrics sentimentTrendClass(SentimentTrendClassEnum sentimentTrendClass) {
    this.sentimentTrendClass = sentimentTrendClass;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Sentiment Trend Class")
  @JsonProperty("sentimentTrendClass")
  public SentimentTrendClassEnum getSentimentTrendClass() {
    return sentimentTrendClass;
  }
  public void setSentimentTrendClass(SentimentTrendClassEnum sentimentTrendClass) {
    this.sentimentTrendClass = sentimentTrendClass;
  }

  
  /**
   * The Participant Metrics
   **/
  public ConversationMetrics participantMetrics(ParticipantMetrics participantMetrics) {
    this.participantMetrics = participantMetrics;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Participant Metrics")
  @JsonProperty("participantMetrics")
  public ParticipantMetrics getParticipantMetrics() {
    return participantMetrics;
  }
  public void setParticipantMetrics(ParticipantMetrics participantMetrics) {
    this.participantMetrics = participantMetrics;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationMetrics conversationMetrics = (ConversationMetrics) o;
    return Objects.equals(this.conversation, conversationMetrics.conversation) &&
        Objects.equals(this.sentimentScore, conversationMetrics.sentimentScore) &&
        Objects.equals(this.sentimentTrend, conversationMetrics.sentimentTrend) &&
        Objects.equals(this.sentimentTrendClass, conversationMetrics.sentimentTrendClass) &&
        Objects.equals(this.participantMetrics, conversationMetrics.participantMetrics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversation, sentimentScore, sentimentTrend, sentimentTrendClass, participantMetrics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationMetrics {\n");
    
    sb.append("    conversation: ").append(toIndentedString(conversation)).append("\n");
    sb.append("    sentimentScore: ").append(toIndentedString(sentimentScore)).append("\n");
    sb.append("    sentimentTrend: ").append(toIndentedString(sentimentTrend)).append("\n");
    sb.append("    sentimentTrendClass: ").append(toIndentedString(sentimentTrendClass)).append("\n");
    sb.append("    participantMetrics: ").append(toIndentedString(participantMetrics)).append("\n");
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

