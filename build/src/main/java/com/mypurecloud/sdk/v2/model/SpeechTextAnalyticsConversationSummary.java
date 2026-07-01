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
import com.mypurecloud.sdk.v2.model.ConversationInsight;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * SpeechTextAnalyticsConversationSummary
 */

public class SpeechTextAnalyticsConversationSummary  implements Serializable {
  

  private static class SummaryTypeEnumDeserializer extends StdDeserializer<SummaryTypeEnum> {
    public SummaryTypeEnumDeserializer() {
      super(SummaryTypeEnumDeserializer.class);
    }

    @Override
    public SummaryTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return SummaryTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The type of summary
   */
 @JsonDeserialize(using = SummaryTypeEnumDeserializer.class)
  public enum SummaryTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    CONVERSATION("Conversation"),
    AGENT("Agent"),
    VIRTUALAGENT("VirtualAgent");

    private String value;

    SummaryTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static SummaryTypeEnum fromString(String key) {
      if (key == null) return null;

      for (SummaryTypeEnum value : SummaryTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return SummaryTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private SummaryTypeEnum summaryType = null;

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
   * The media type of the associated interaction
   */
 @JsonDeserialize(using = MediaTypeEnumDeserializer.class)
  public enum MediaTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("Unknown"),
    MESSAGE("Message"),
    CALL("Call"),
    EMAIL("Email");

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
  private String language = null;
  private String summaryId = null;
  private String agentId = null;
  private String sourceId = null;
  private String summary = null;
  private Boolean generated = null;
  private Date dateCreated = null;
  private List<ConversationInsight> insights = null;

  public SpeechTextAnalyticsConversationSummary() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      insights = new ArrayList<ConversationInsight>();
    }
  }

  public SpeechTextAnalyticsConversationSummary(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      insights = new ArrayList<ConversationInsight>();
    }
  }

  
  /**
   * The type of summary
   **/
  public SpeechTextAnalyticsConversationSummary summaryType(SummaryTypeEnum summaryType) {
    this.summaryType = summaryType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type of summary")
  @JsonProperty("summaryType")
  public SummaryTypeEnum getSummaryType() {
    return summaryType;
  }
  public void setSummaryType(SummaryTypeEnum summaryType) {
    this.summaryType = summaryType;
  }


  /**
   * The media type of the associated interaction
   **/
  public SpeechTextAnalyticsConversationSummary mediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The media type of the associated interaction")
  @JsonProperty("mediaType")
  public MediaTypeEnum getMediaType() {
    return mediaType;
  }
  public void setMediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
  }


  /**
   * Language of the summary
   **/
  public SpeechTextAnalyticsConversationSummary language(String language) {
    this.language = language;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Language of the summary")
  @JsonProperty("language")
  public String getLanguage() {
    return language;
  }
  public void setLanguage(String language) {
    this.language = language;
  }


  /**
   * The id of the summary
   **/
  public SpeechTextAnalyticsConversationSummary summaryId(String summaryId) {
    this.summaryId = summaryId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The id of the summary")
  @JsonProperty("summaryId")
  public String getSummaryId() {
    return summaryId;
  }
  public void setSummaryId(String summaryId) {
    this.summaryId = summaryId;
  }


  /**
   * The id of the agent associated with the summary
   **/
  public SpeechTextAnalyticsConversationSummary agentId(String agentId) {
    this.agentId = agentId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The id of the agent associated with the summary")
  @JsonProperty("agentId")
  public String getAgentId() {
    return agentId;
  }
  public void setAgentId(String agentId) {
    this.agentId = agentId;
  }


  /**
   * The id of the source (program, agent assistant, or flow) from which summarization is triggered
   **/
  public SpeechTextAnalyticsConversationSummary sourceId(String sourceId) {
    this.sourceId = sourceId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The id of the source (program, agent assistant, or flow) from which summarization is triggered")
  @JsonProperty("sourceId")
  public String getSourceId() {
    return sourceId;
  }
  public void setSourceId(String sourceId) {
    this.sourceId = sourceId;
  }


  /**
   * A summarization of the conversation transcription
   **/
  public SpeechTextAnalyticsConversationSummary summary(String summary) {
    this.summary = summary;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A summarization of the conversation transcription")
  @JsonProperty("summary")
  public String getSummary() {
    return summary;
  }
  public void setSummary(String summary) {
    this.summary = summary;
  }


  /**
   * Indicates whether or not the summary was generated by AI
   **/
  public SpeechTextAnalyticsConversationSummary generated(Boolean generated) {
    this.generated = generated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates whether or not the summary was generated by AI")
  @JsonProperty("generated")
  public Boolean getGenerated() {
    return generated;
  }
  public void setGenerated(Boolean generated) {
    this.generated = generated;
  }


  /**
   * Timestamp of when the summary was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public SpeechTextAnalyticsConversationSummary dateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Timestamp of when the summary was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }


  /**
   * Insights of the conversation
   **/
  public SpeechTextAnalyticsConversationSummary insights(List<ConversationInsight> insights) {
    this.insights = insights;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Insights of the conversation")
  @JsonProperty("insights")
  public List<ConversationInsight> getInsights() {
    return insights;
  }
  public void setInsights(List<ConversationInsight> insights) {
    this.insights = insights;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpeechTextAnalyticsConversationSummary speechTextAnalyticsConversationSummary = (SpeechTextAnalyticsConversationSummary) o;

    return Objects.equals(this.summaryType, speechTextAnalyticsConversationSummary.summaryType) &&
            Objects.equals(this.mediaType, speechTextAnalyticsConversationSummary.mediaType) &&
            Objects.equals(this.language, speechTextAnalyticsConversationSummary.language) &&
            Objects.equals(this.summaryId, speechTextAnalyticsConversationSummary.summaryId) &&
            Objects.equals(this.agentId, speechTextAnalyticsConversationSummary.agentId) &&
            Objects.equals(this.sourceId, speechTextAnalyticsConversationSummary.sourceId) &&
            Objects.equals(this.summary, speechTextAnalyticsConversationSummary.summary) &&
            Objects.equals(this.generated, speechTextAnalyticsConversationSummary.generated) &&
            Objects.equals(this.dateCreated, speechTextAnalyticsConversationSummary.dateCreated) &&
            Objects.equals(this.insights, speechTextAnalyticsConversationSummary.insights);
  }

  @Override
  public int hashCode() {
    return Objects.hash(summaryType, mediaType, language, summaryId, agentId, sourceId, summary, generated, dateCreated, insights);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpeechTextAnalyticsConversationSummary {\n");
    
    sb.append("    summaryType: ").append(toIndentedString(summaryType)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    summaryId: ").append(toIndentedString(summaryId)).append("\n");
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    generated: ").append(toIndentedString(generated)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    insights: ").append(toIndentedString(insights)).append("\n");
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

