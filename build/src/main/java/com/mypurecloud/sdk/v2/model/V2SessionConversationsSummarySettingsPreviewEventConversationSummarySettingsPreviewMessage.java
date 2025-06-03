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
import com.mypurecloud.sdk.v2.model.V2SessionConversationsSummarySettingsPreviewEventConversationFollowupAction;
import com.mypurecloud.sdk.v2.model.V2SessionConversationsSummarySettingsPreviewEventConversationReasonMessage;
import com.mypurecloud.sdk.v2.model.V2SessionConversationsSummarySettingsPreviewEventConversationResolutionMessage;
import com.mypurecloud.sdk.v2.model.V2SessionConversationsSummarySettingsPreviewEventConversationSummaryExtractedEntity;
import com.mypurecloud.sdk.v2.model.V2SessionConversationsSummarySettingsPreviewEventConversationSummaryMessage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * V2SessionConversationsSummarySettingsPreviewEventConversationSummarySettingsPreviewMessage
 */

public class V2SessionConversationsSummarySettingsPreviewEventConversationSummarySettingsPreviewMessage  implements Serializable {
  
  private Date createdDate = null;
  private String summaryId = null;
  private String sessionId = null;
  private String userId = null;
  private String summarySettingsId = null;
  private String language = null;

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
    MESSAGE("MESSAGE"),
    CALL("CALL"),
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
  private V2SessionConversationsSummarySettingsPreviewEventConversationSummaryMessage summary = null;
  private V2SessionConversationsSummarySettingsPreviewEventConversationReasonMessage reason = null;
  private V2SessionConversationsSummarySettingsPreviewEventConversationResolutionMessage resolution = null;
  private List<V2SessionConversationsSummarySettingsPreviewEventConversationFollowupAction> followupActions = null;
  private List<V2SessionConversationsSummarySettingsPreviewEventConversationSummaryExtractedEntity> extractedEntities = null;

  private static class ErrorTypeEnumDeserializer extends StdDeserializer<ErrorTypeEnum> {
    public ErrorTypeEnumDeserializer() {
      super(ErrorTypeEnumDeserializer.class);
    }

    @Override
    public ErrorTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ErrorTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets errorType
   */
 @JsonDeserialize(using = ErrorTypeEnumDeserializer.class)
  public enum ErrorTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("UNKNOWN"),
    CONVERSATION_TOO_LONG("CONVERSATION_TOO_LONG"),
    CONVERSATION_TOO_SHORT("CONVERSATION_TOO_SHORT"),
    RATE_LIMITED("RATE_LIMITED");

    private String value;

    ErrorTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ErrorTypeEnum fromString(String key) {
      if (key == null) return null;

      for (ErrorTypeEnum value : ErrorTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ErrorTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ErrorTypeEnum errorType = null;
  private Long durationMs = null;

  public V2SessionConversationsSummarySettingsPreviewEventConversationSummarySettingsPreviewMessage() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      followupActions = new ArrayList<V2SessionConversationsSummarySettingsPreviewEventConversationFollowupAction>();
      extractedEntities = new ArrayList<V2SessionConversationsSummarySettingsPreviewEventConversationSummaryExtractedEntity>();
    }
  }

  
  /**
   **/
  public V2SessionConversationsSummarySettingsPreviewEventConversationSummarySettingsPreviewMessage createdDate(Date createdDate) {
    this.createdDate = createdDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("createdDate")
  public Date getCreatedDate() {
    return createdDate;
  }
  public void setCreatedDate(Date createdDate) {
    this.createdDate = createdDate;
  }


  /**
   **/
  public V2SessionConversationsSummarySettingsPreviewEventConversationSummarySettingsPreviewMessage summaryId(String summaryId) {
    this.summaryId = summaryId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("summaryId")
  public String getSummaryId() {
    return summaryId;
  }
  public void setSummaryId(String summaryId) {
    this.summaryId = summaryId;
  }


  /**
   **/
  public V2SessionConversationsSummarySettingsPreviewEventConversationSummarySettingsPreviewMessage sessionId(String sessionId) {
    this.sessionId = sessionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sessionId")
  public String getSessionId() {
    return sessionId;
  }
  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }


  /**
   **/
  public V2SessionConversationsSummarySettingsPreviewEventConversationSummarySettingsPreviewMessage userId(String userId) {
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
  public V2SessionConversationsSummarySettingsPreviewEventConversationSummarySettingsPreviewMessage summarySettingsId(String summarySettingsId) {
    this.summarySettingsId = summarySettingsId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("summarySettingsId")
  public String getSummarySettingsId() {
    return summarySettingsId;
  }
  public void setSummarySettingsId(String summarySettingsId) {
    this.summarySettingsId = summarySettingsId;
  }


  /**
   **/
  public V2SessionConversationsSummarySettingsPreviewEventConversationSummarySettingsPreviewMessage language(String language) {
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


  /**
   **/
  public V2SessionConversationsSummarySettingsPreviewEventConversationSummarySettingsPreviewMessage mediaType(MediaTypeEnum mediaType) {
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
  public V2SessionConversationsSummarySettingsPreviewEventConversationSummarySettingsPreviewMessage summary(V2SessionConversationsSummarySettingsPreviewEventConversationSummaryMessage summary) {
    this.summary = summary;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("summary")
  public V2SessionConversationsSummarySettingsPreviewEventConversationSummaryMessage getSummary() {
    return summary;
  }
  public void setSummary(V2SessionConversationsSummarySettingsPreviewEventConversationSummaryMessage summary) {
    this.summary = summary;
  }


  /**
   **/
  public V2SessionConversationsSummarySettingsPreviewEventConversationSummarySettingsPreviewMessage reason(V2SessionConversationsSummarySettingsPreviewEventConversationReasonMessage reason) {
    this.reason = reason;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("reason")
  public V2SessionConversationsSummarySettingsPreviewEventConversationReasonMessage getReason() {
    return reason;
  }
  public void setReason(V2SessionConversationsSummarySettingsPreviewEventConversationReasonMessage reason) {
    this.reason = reason;
  }


  /**
   **/
  public V2SessionConversationsSummarySettingsPreviewEventConversationSummarySettingsPreviewMessage resolution(V2SessionConversationsSummarySettingsPreviewEventConversationResolutionMessage resolution) {
    this.resolution = resolution;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("resolution")
  public V2SessionConversationsSummarySettingsPreviewEventConversationResolutionMessage getResolution() {
    return resolution;
  }
  public void setResolution(V2SessionConversationsSummarySettingsPreviewEventConversationResolutionMessage resolution) {
    this.resolution = resolution;
  }


  /**
   **/
  public V2SessionConversationsSummarySettingsPreviewEventConversationSummarySettingsPreviewMessage followupActions(List<V2SessionConversationsSummarySettingsPreviewEventConversationFollowupAction> followupActions) {
    this.followupActions = followupActions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("followupActions")
  public List<V2SessionConversationsSummarySettingsPreviewEventConversationFollowupAction> getFollowupActions() {
    return followupActions;
  }
  public void setFollowupActions(List<V2SessionConversationsSummarySettingsPreviewEventConversationFollowupAction> followupActions) {
    this.followupActions = followupActions;
  }


  /**
   **/
  public V2SessionConversationsSummarySettingsPreviewEventConversationSummarySettingsPreviewMessage extractedEntities(List<V2SessionConversationsSummarySettingsPreviewEventConversationSummaryExtractedEntity> extractedEntities) {
    this.extractedEntities = extractedEntities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("extractedEntities")
  public List<V2SessionConversationsSummarySettingsPreviewEventConversationSummaryExtractedEntity> getExtractedEntities() {
    return extractedEntities;
  }
  public void setExtractedEntities(List<V2SessionConversationsSummarySettingsPreviewEventConversationSummaryExtractedEntity> extractedEntities) {
    this.extractedEntities = extractedEntities;
  }


  /**
   **/
  public V2SessionConversationsSummarySettingsPreviewEventConversationSummarySettingsPreviewMessage errorType(ErrorTypeEnum errorType) {
    this.errorType = errorType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("errorType")
  public ErrorTypeEnum getErrorType() {
    return errorType;
  }
  public void setErrorType(ErrorTypeEnum errorType) {
    this.errorType = errorType;
  }


  /**
   **/
  public V2SessionConversationsSummarySettingsPreviewEventConversationSummarySettingsPreviewMessage durationMs(Long durationMs) {
    this.durationMs = durationMs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("durationMs")
  public Long getDurationMs() {
    return durationMs;
  }
  public void setDurationMs(Long durationMs) {
    this.durationMs = durationMs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2SessionConversationsSummarySettingsPreviewEventConversationSummarySettingsPreviewMessage v2SessionConversationsSummarySettingsPreviewEventConversationSummarySettingsPreviewMessage = (V2SessionConversationsSummarySettingsPreviewEventConversationSummarySettingsPreviewMessage) o;

    return Objects.equals(this.createdDate, v2SessionConversationsSummarySettingsPreviewEventConversationSummarySettingsPreviewMessage.createdDate) &&
            Objects.equals(this.summaryId, v2SessionConversationsSummarySettingsPreviewEventConversationSummarySettingsPreviewMessage.summaryId) &&
            Objects.equals(this.sessionId, v2SessionConversationsSummarySettingsPreviewEventConversationSummarySettingsPreviewMessage.sessionId) &&
            Objects.equals(this.userId, v2SessionConversationsSummarySettingsPreviewEventConversationSummarySettingsPreviewMessage.userId) &&
            Objects.equals(this.summarySettingsId, v2SessionConversationsSummarySettingsPreviewEventConversationSummarySettingsPreviewMessage.summarySettingsId) &&
            Objects.equals(this.language, v2SessionConversationsSummarySettingsPreviewEventConversationSummarySettingsPreviewMessage.language) &&
            Objects.equals(this.mediaType, v2SessionConversationsSummarySettingsPreviewEventConversationSummarySettingsPreviewMessage.mediaType) &&
            Objects.equals(this.summary, v2SessionConversationsSummarySettingsPreviewEventConversationSummarySettingsPreviewMessage.summary) &&
            Objects.equals(this.reason, v2SessionConversationsSummarySettingsPreviewEventConversationSummarySettingsPreviewMessage.reason) &&
            Objects.equals(this.resolution, v2SessionConversationsSummarySettingsPreviewEventConversationSummarySettingsPreviewMessage.resolution) &&
            Objects.equals(this.followupActions, v2SessionConversationsSummarySettingsPreviewEventConversationSummarySettingsPreviewMessage.followupActions) &&
            Objects.equals(this.extractedEntities, v2SessionConversationsSummarySettingsPreviewEventConversationSummarySettingsPreviewMessage.extractedEntities) &&
            Objects.equals(this.errorType, v2SessionConversationsSummarySettingsPreviewEventConversationSummarySettingsPreviewMessage.errorType) &&
            Objects.equals(this.durationMs, v2SessionConversationsSummarySettingsPreviewEventConversationSummarySettingsPreviewMessage.durationMs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdDate, summaryId, sessionId, userId, summarySettingsId, language, mediaType, summary, reason, resolution, followupActions, extractedEntities, errorType, durationMs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2SessionConversationsSummarySettingsPreviewEventConversationSummarySettingsPreviewMessage {\n");
    
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    summaryId: ").append(toIndentedString(summaryId)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    summarySettingsId: ").append(toIndentedString(summarySettingsId)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    resolution: ").append(toIndentedString(resolution)).append("\n");
    sb.append("    followupActions: ").append(toIndentedString(followupActions)).append("\n");
    sb.append("    extractedEntities: ").append(toIndentedString(extractedEntities)).append("\n");
    sb.append("    errorType: ").append(toIndentedString(errorType)).append("\n");
    sb.append("    durationMs: ").append(toIndentedString(durationMs)).append("\n");
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

