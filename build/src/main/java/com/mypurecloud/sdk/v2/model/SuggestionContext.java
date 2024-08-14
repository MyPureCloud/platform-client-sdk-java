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
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import com.mypurecloud.sdk.v2.model.Entity;
import com.mypurecloud.sdk.v2.model.UserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * SuggestionContext
 */

public class SuggestionContext  implements Serializable {
  
  private AddressableEntityRef queue = null;

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
   * The media type of the conversation in which the suggestion event was raised.
   */
 @JsonDeserialize(using = MediaTypeEnumDeserializer.class)
  public enum MediaTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    MESSAGE("Message"),
    VOICE("Voice"),
    UNKNOWN("Unknown");

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
  private UserReference user = null;
  private AddressableEntityRef externalContact = null;
  private Entity utterance = null;
  private AddressableEntityRef message = null;
  private String queryStatement = null;

  
  @ApiModelProperty(example = "null", value = "The queue used to assign the interaction to the user, if any.")
  @JsonProperty("queue")
  public AddressableEntityRef getQueue() {
    return queue;
  }


  @ApiModelProperty(example = "null", value = "The media type of the conversation in which the suggestion event was raised.")
  @JsonProperty("mediaType")
  public MediaTypeEnum getMediaType() {
    return mediaType;
  }


  @ApiModelProperty(example = "null", value = "The agent participant who received the raised suggestion, if any.")
  @JsonProperty("user")
  public UserReference getUser() {
    return user;
  }


  @ApiModelProperty(example = "null", value = "The external contact of the end-user participant, if any.")
  @JsonProperty("externalContact")
  public AddressableEntityRef getExternalContact() {
    return externalContact;
  }


  @ApiModelProperty(example = "null", value = "The utterance in the voice conversation, after which the suggestion was raised, if any.")
  @JsonProperty("utterance")
  public Entity getUtterance() {
    return utterance;
  }


  @ApiModelProperty(example = "null", value = "The message in the digital conversation, after which the suggestion was raised, if any.")
  @JsonProperty("message")
  public AddressableEntityRef getMessage() {
    return message;
  }


  @ApiModelProperty(example = "null", value = "The query statement used when generating the suggestion, if any.")
  @JsonProperty("queryStatement")
  public String getQueryStatement() {
    return queryStatement;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuggestionContext suggestionContext = (SuggestionContext) o;

    return Objects.equals(this.queue, suggestionContext.queue) &&
            Objects.equals(this.mediaType, suggestionContext.mediaType) &&
            Objects.equals(this.user, suggestionContext.user) &&
            Objects.equals(this.externalContact, suggestionContext.externalContact) &&
            Objects.equals(this.utterance, suggestionContext.utterance) &&
            Objects.equals(this.message, suggestionContext.message) &&
            Objects.equals(this.queryStatement, suggestionContext.queryStatement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queue, mediaType, user, externalContact, utterance, message, queryStatement);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuggestionContext {\n");
    
    sb.append("    queue: ").append(toIndentedString(queue)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    externalContact: ").append(toIndentedString(externalContact)).append("\n");
    sb.append("    utterance: ").append(toIndentedString(utterance)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    queryStatement: ").append(toIndentedString(queryStatement)).append("\n");
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

