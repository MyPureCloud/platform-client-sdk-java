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
 * IgnorePhrase
 */

public class IgnorePhrase  implements Serializable {
  
  private String text = null;

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
   * Type of participant
   */
 @JsonDeserialize(using = ParticipantEnumDeserializer.class)
  public enum ParticipantEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    CUSTOMER("Customer"),
    AGENT("Agent"),
    BOTH("Both");

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
   * Media Type for the entity (Optional)
   */
 @JsonDeserialize(using = MediaTypeEnumDeserializer.class)
  public enum MediaTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    CHAT("Chat"),
    CALL("Call"),
    MESSAGE("Message"),
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

  public IgnorePhrase() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Text of the phrase to be ignored
   **/
  public IgnorePhrase text(String text) {
    this.text = text;
    return this;
  }
  
  @ApiModelProperty(example = "want to pay bill", required = true, value = "Text of the phrase to be ignored")
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }


  /**
   * Type of participant
   **/
  public IgnorePhrase participant(ParticipantEnum participant) {
    this.participant = participant;
    return this;
  }
  
  @ApiModelProperty(example = "Customer", required = true, value = "Type of participant")
  @JsonProperty("participant")
  public ParticipantEnum getParticipant() {
    return participant;
  }
  public void setParticipant(ParticipantEnum participant) {
    this.participant = participant;
  }


  /**
   * Media Type for the entity (Optional)
   **/
  public IgnorePhrase mediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Media Type for the entity (Optional)")
  @JsonProperty("mediaType")
  public MediaTypeEnum getMediaType() {
    return mediaType;
  }
  public void setMediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IgnorePhrase ignorePhrase = (IgnorePhrase) o;

    return Objects.equals(this.text, ignorePhrase.text) &&
            Objects.equals(this.participant, ignorePhrase.participant) &&
            Objects.equals(this.mediaType, ignorePhrase.mediaType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, participant, mediaType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IgnorePhrase {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    participant: ").append(toIndentedString(participant)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
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

