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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.PublishProgramTestPhraseDetectedPhrase;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * PublishProgramTestPhraseMatchedTranscript
 */

public class PublishProgramTestPhraseMatchedTranscript  implements Serializable {
  
  private Integer timestamp = null;
  private String transcriptId = null;
  private String communicationId = null;
  private String conversationId = null;

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
    UNKNOWN("unknown"),
    CALL("call"),
    MESSAGE("message"),
    EMAIL("email"),
    CHAT("chat"),
    CALLBACK("callback"),
    ALL("all");

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
  private List<PublishProgramTestPhraseDetectedPhrase> detectedPhrases = new ArrayList<PublishProgramTestPhraseDetectedPhrase>();

  
  /**
   **/
  public PublishProgramTestPhraseMatchedTranscript timestamp(Integer timestamp) {
    this.timestamp = timestamp;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("timestamp")
  public Integer getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(Integer timestamp) {
    this.timestamp = timestamp;
  }


  /**
   **/
  public PublishProgramTestPhraseMatchedTranscript transcriptId(String transcriptId) {
    this.transcriptId = transcriptId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("transcriptId")
  public String getTranscriptId() {
    return transcriptId;
  }
  public void setTranscriptId(String transcriptId) {
    this.transcriptId = transcriptId;
  }


  /**
   **/
  public PublishProgramTestPhraseMatchedTranscript communicationId(String communicationId) {
    this.communicationId = communicationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("communicationId")
  public String getCommunicationId() {
    return communicationId;
  }
  public void setCommunicationId(String communicationId) {
    this.communicationId = communicationId;
  }


  /**
   **/
  public PublishProgramTestPhraseMatchedTranscript conversationId(String conversationId) {
    this.conversationId = conversationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("conversationId")
  public String getConversationId() {
    return conversationId;
  }
  public void setConversationId(String conversationId) {
    this.conversationId = conversationId;
  }


  /**
   **/
  public PublishProgramTestPhraseMatchedTranscript mediaType(MediaTypeEnum mediaType) {
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
  public PublishProgramTestPhraseMatchedTranscript detectedPhrases(List<PublishProgramTestPhraseDetectedPhrase> detectedPhrases) {
    this.detectedPhrases = detectedPhrases;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("detectedPhrases")
  public List<PublishProgramTestPhraseDetectedPhrase> getDetectedPhrases() {
    return detectedPhrases;
  }
  public void setDetectedPhrases(List<PublishProgramTestPhraseDetectedPhrase> detectedPhrases) {
    this.detectedPhrases = detectedPhrases;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PublishProgramTestPhraseMatchedTranscript publishProgramTestPhraseMatchedTranscript = (PublishProgramTestPhraseMatchedTranscript) o;

    return Objects.equals(this.timestamp, publishProgramTestPhraseMatchedTranscript.timestamp) &&
            Objects.equals(this.transcriptId, publishProgramTestPhraseMatchedTranscript.transcriptId) &&
            Objects.equals(this.communicationId, publishProgramTestPhraseMatchedTranscript.communicationId) &&
            Objects.equals(this.conversationId, publishProgramTestPhraseMatchedTranscript.conversationId) &&
            Objects.equals(this.mediaType, publishProgramTestPhraseMatchedTranscript.mediaType) &&
            Objects.equals(this.detectedPhrases, publishProgramTestPhraseMatchedTranscript.detectedPhrases);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timestamp, transcriptId, communicationId, conversationId, mediaType, detectedPhrases);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublishProgramTestPhraseMatchedTranscript {\n");
    
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    transcriptId: ").append(toIndentedString(transcriptId)).append("\n");
    sb.append("    communicationId: ").append(toIndentedString(communicationId)).append("\n");
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    detectedPhrases: ").append(toIndentedString(detectedPhrases)).append("\n");
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

