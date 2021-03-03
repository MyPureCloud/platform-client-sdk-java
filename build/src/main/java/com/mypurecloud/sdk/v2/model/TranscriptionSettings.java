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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * TranscriptionSettings
 */

public class TranscriptionSettings  implements Serializable {
  

  private static class TranscriptionEnumDeserializer extends StdDeserializer<TranscriptionEnum> {
    public TranscriptionEnumDeserializer() {
      super(TranscriptionEnumDeserializer.class);
    }

    @Override
    public TranscriptionEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return TranscriptionEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Setting to enable/disable transcription capability
   */
 @JsonDeserialize(using = TranscriptionEnumDeserializer.class)
  public enum TranscriptionEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    DISABLED("Disabled"),
    ENABLEDGLOBALLY("EnabledGlobally"),
    ENABLEDQUEUEFLOW("EnabledQueueFlow");

    private String value;

    TranscriptionEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static TranscriptionEnum fromString(String key) {
      if (key == null) return null;

      for (TranscriptionEnum value : TranscriptionEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return TranscriptionEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private TranscriptionEnum transcription = null;
  private Integer transcriptionConfidenceThreshold = null;
  private Boolean contentSearchEnabled = null;

  
  /**
   * Setting to enable/disable transcription capability
   **/
  public TranscriptionSettings transcription(TranscriptionEnum transcription) {
    this.transcription = transcription;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Setting to enable/disable transcription capability")
  @JsonProperty("transcription")
  public TranscriptionEnum getTranscription() {
    return transcription;
  }
  public void setTranscription(TranscriptionEnum transcription) {
    this.transcription = transcription;
  }

  
  /**
   * Configure confidence threshold. The possible values are from 1 to 100.
   **/
  public TranscriptionSettings transcriptionConfidenceThreshold(Integer transcriptionConfidenceThreshold) {
    this.transcriptionConfidenceThreshold = transcriptionConfidenceThreshold;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Configure confidence threshold. The possible values are from 1 to 100.")
  @JsonProperty("transcriptionConfidenceThreshold")
  public Integer getTranscriptionConfidenceThreshold() {
    return transcriptionConfidenceThreshold;
  }
  public void setTranscriptionConfidenceThreshold(Integer transcriptionConfidenceThreshold) {
    this.transcriptionConfidenceThreshold = transcriptionConfidenceThreshold;
  }

  
  /**
   * Setting to enable/disable content search
   **/
  public TranscriptionSettings contentSearchEnabled(Boolean contentSearchEnabled) {
    this.contentSearchEnabled = contentSearchEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Setting to enable/disable content search")
  @JsonProperty("contentSearchEnabled")
  public Boolean getContentSearchEnabled() {
    return contentSearchEnabled;
  }
  public void setContentSearchEnabled(Boolean contentSearchEnabled) {
    this.contentSearchEnabled = contentSearchEnabled;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TranscriptionSettings transcriptionSettings = (TranscriptionSettings) o;
    return Objects.equals(this.transcription, transcriptionSettings.transcription) &&
        Objects.equals(this.transcriptionConfidenceThreshold, transcriptionSettings.transcriptionConfidenceThreshold) &&
        Objects.equals(this.contentSearchEnabled, transcriptionSettings.contentSearchEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transcription, transcriptionConfidenceThreshold, contentSearchEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TranscriptionSettings {\n");
    
    sb.append("    transcription: ").append(toIndentedString(transcription)).append("\n");
    sb.append("    transcriptionConfidenceThreshold: ").append(toIndentedString(transcriptionConfidenceThreshold)).append("\n");
    sb.append("    contentSearchEnabled: ").append(toIndentedString(contentSearchEnabled)).append("\n");
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

