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
 * Expanded audio format metadata for Architect prompt resources.
 */
@ApiModel(description = "Expanded audio format metadata for Architect prompt resources.")

public class ArchitectSystemPromptResourceNotificationPromptResourceAudioFormat  implements Serializable {
  
  private Long channels = null;
  private Long bitsPerSample = null;
  private Long sampleRate = null;

  private static class EncodingEnumDeserializer extends StdDeserializer<EncodingEnum> {
    public EncodingEnumDeserializer() {
      super(EncodingEnumDeserializer.class);
    }

    @Override
    public EncodingEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return EncodingEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Audio encoding format.
   */
 @JsonDeserialize(using = EncodingEnumDeserializer.class)
  public enum EncodingEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ULAW("ULAW"),
    ALAW("ALAW"),
    PCM("PCM");

    private String value;

    EncodingEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static EncodingEnum fromString(String key) {
      if (key == null) return null;

      for (EncodingEnum value : EncodingEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return EncodingEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private EncodingEnum encoding = null;

  public ArchitectSystemPromptResourceNotificationPromptResourceAudioFormat() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public ArchitectSystemPromptResourceNotificationPromptResourceAudioFormat(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * Number of audio channels (for example, 1 for mono or 2 for stereo).
   **/
  public ArchitectSystemPromptResourceNotificationPromptResourceAudioFormat channels(Long channels) {
    this.channels = channels;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of audio channels (for example, 1 for mono or 2 for stereo).")
  @JsonProperty("channels")
  public Long getChannels() {
    return channels;
  }
  public void setChannels(Long channels) {
    this.channels = channels;
  }


  /**
   * Number of bits used to represent each audio sample (for example, 8 or 16).
   **/
  public ArchitectSystemPromptResourceNotificationPromptResourceAudioFormat bitsPerSample(Long bitsPerSample) {
    this.bitsPerSample = bitsPerSample;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of bits used to represent each audio sample (for example, 8 or 16).")
  @JsonProperty("bitsPerSample")
  public Long getBitsPerSample() {
    return bitsPerSample;
  }
  public void setBitsPerSample(Long bitsPerSample) {
    this.bitsPerSample = bitsPerSample;
  }


  /**
   * Sample rate in hertz (Hz), for example 8000 or 16000.
   **/
  public ArchitectSystemPromptResourceNotificationPromptResourceAudioFormat sampleRate(Long sampleRate) {
    this.sampleRate = sampleRate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Sample rate in hertz (Hz), for example 8000 or 16000.")
  @JsonProperty("sampleRate")
  public Long getSampleRate() {
    return sampleRate;
  }
  public void setSampleRate(Long sampleRate) {
    this.sampleRate = sampleRate;
  }


  /**
   * Audio encoding format.
   **/
  public ArchitectSystemPromptResourceNotificationPromptResourceAudioFormat encoding(EncodingEnum encoding) {
    this.encoding = encoding;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Audio encoding format.")
  @JsonProperty("encoding")
  public EncodingEnum getEncoding() {
    return encoding;
  }
  public void setEncoding(EncodingEnum encoding) {
    this.encoding = encoding;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArchitectSystemPromptResourceNotificationPromptResourceAudioFormat architectSystemPromptResourceNotificationPromptResourceAudioFormat = (ArchitectSystemPromptResourceNotificationPromptResourceAudioFormat) o;

    return Objects.equals(this.channels, architectSystemPromptResourceNotificationPromptResourceAudioFormat.channels) &&
            Objects.equals(this.bitsPerSample, architectSystemPromptResourceNotificationPromptResourceAudioFormat.bitsPerSample) &&
            Objects.equals(this.sampleRate, architectSystemPromptResourceNotificationPromptResourceAudioFormat.sampleRate) &&
            Objects.equals(this.encoding, architectSystemPromptResourceNotificationPromptResourceAudioFormat.encoding);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channels, bitsPerSample, sampleRate, encoding);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArchitectSystemPromptResourceNotificationPromptResourceAudioFormat {\n");
    
    sb.append("    channels: ").append(toIndentedString(channels)).append("\n");
    sb.append("    bitsPerSample: ").append(toIndentedString(bitsPerSample)).append("\n");
    sb.append("    sampleRate: ").append(toIndentedString(sampleRate)).append("\n");
    sb.append("    encoding: ").append(toIndentedString(encoding)).append("\n");
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

