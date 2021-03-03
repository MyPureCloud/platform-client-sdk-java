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
 * MediaTranscription
 */

public class MediaTranscription  implements Serializable {
  
  private String displayName = null;

  private static class TranscriptionProviderEnumDeserializer extends StdDeserializer<TranscriptionProviderEnum> {
    public TranscriptionProviderEnumDeserializer() {
      super(TranscriptionProviderEnumDeserializer.class);
    }

    @Override
    public TranscriptionProviderEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return TranscriptionProviderEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets transcriptionProvider
   */
 @JsonDeserialize(using = TranscriptionProviderEnumDeserializer.class)
  public enum TranscriptionProviderEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    VOCI("VOCI"),
    CALLJOURNEY("CALLJOURNEY");

    private String value;

    TranscriptionProviderEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static TranscriptionProviderEnum fromString(String key) {
      if (key == null) return null;

      for (TranscriptionProviderEnum value : TranscriptionProviderEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return TranscriptionProviderEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private TranscriptionProviderEnum transcriptionProvider = null;
  private String integrationId = null;

  
  /**
   **/
  public MediaTranscription displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("displayName")
  public String getDisplayName() {
    return displayName;
  }
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  
  /**
   **/
  public MediaTranscription transcriptionProvider(TranscriptionProviderEnum transcriptionProvider) {
    this.transcriptionProvider = transcriptionProvider;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("transcriptionProvider")
  public TranscriptionProviderEnum getTranscriptionProvider() {
    return transcriptionProvider;
  }
  public void setTranscriptionProvider(TranscriptionProviderEnum transcriptionProvider) {
    this.transcriptionProvider = transcriptionProvider;
  }

  
  /**
   **/
  public MediaTranscription integrationId(String integrationId) {
    this.integrationId = integrationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("integrationId")
  public String getIntegrationId() {
    return integrationId;
  }
  public void setIntegrationId(String integrationId) {
    this.integrationId = integrationId;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediaTranscription mediaTranscription = (MediaTranscription) o;
    return Objects.equals(this.displayName, mediaTranscription.displayName) &&
        Objects.equals(this.transcriptionProvider, mediaTranscription.transcriptionProvider) &&
        Objects.equals(this.integrationId, mediaTranscription.integrationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, transcriptionProvider, integrationId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaTranscription {\n");
    
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    transcriptionProvider: ").append(toIndentedString(transcriptionProvider)).append("\n");
    sb.append("    integrationId: ").append(toIndentedString(integrationId)).append("\n");
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

