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
 * AudioFormat
 */

public class AudioFormat  implements Serializable {
  
  private Integer channels = null;
  private Integer bitsPerSample = null;
  private Integer sampleRate = null;

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
   * Audio encoding
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

  public AudioFormat() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public AudioFormat(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "Number of audio channels")
  @JsonProperty("channels")
  public Integer getChannels() {
    return channels;
  }


  @ApiModelProperty(example = "null", value = "Bits per audio sample")
  @JsonProperty("bitsPerSample")
  public Integer getBitsPerSample() {
    return bitsPerSample;
  }


  @ApiModelProperty(example = "null", value = "Sample rate in hertz (Hz), for example 8000 or 16000")
  @JsonProperty("sampleRate")
  public Integer getSampleRate() {
    return sampleRate;
  }


  @ApiModelProperty(example = "null", value = "Audio encoding")
  @JsonProperty("encoding")
  public EncodingEnum getEncoding() {
    return encoding;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AudioFormat audioFormat = (AudioFormat) o;

    return Objects.equals(this.channels, audioFormat.channels) &&
            Objects.equals(this.bitsPerSample, audioFormat.bitsPerSample) &&
            Objects.equals(this.sampleRate, audioFormat.sampleRate) &&
            Objects.equals(this.encoding, audioFormat.encoding);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channels, bitsPerSample, sampleRate, encoding);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudioFormat {\n");
    
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

