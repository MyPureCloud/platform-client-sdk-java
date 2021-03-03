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
 * CreateWebChatMessageRequest
 */

public class CreateWebChatMessageRequest  implements Serializable {
  
  private String body = null;

  private static class BodyTypeEnumDeserializer extends StdDeserializer<BodyTypeEnum> {
    public BodyTypeEnumDeserializer() {
      super(BodyTypeEnumDeserializer.class);
    }

    @Override
    public BodyTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return BodyTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The purpose of the message within the conversation, such as a standard text entry versus a greeting.
   */
 @JsonDeserialize(using = BodyTypeEnumDeserializer.class)
  public enum BodyTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    STANDARD("standard"),
    NOTICE("notice"),
    MEMBER_JOIN("member-join"),
    MEMBER_LEAVE("member-leave"),
    MEDIA_REQUEST("media-request");

    private String value;

    BodyTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static BodyTypeEnum fromString(String key) {
      if (key == null) return null;

      for (BodyTypeEnum value : BodyTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return BodyTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private BodyTypeEnum bodyType = null;

  
  /**
   * The message body. Note that message bodies are limited to 4,000 characters.
   **/
  public CreateWebChatMessageRequest body(String body) {
    this.body = body;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The message body. Note that message bodies are limited to 4,000 characters.")
  @JsonProperty("body")
  public String getBody() {
    return body;
  }
  public void setBody(String body) {
    this.body = body;
  }

  
  /**
   * The purpose of the message within the conversation, such as a standard text entry versus a greeting.
   **/
  public CreateWebChatMessageRequest bodyType(BodyTypeEnum bodyType) {
    this.bodyType = bodyType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The purpose of the message within the conversation, such as a standard text entry versus a greeting.")
  @JsonProperty("bodyType")
  public BodyTypeEnum getBodyType() {
    return bodyType;
  }
  public void setBodyType(BodyTypeEnum bodyType) {
    this.bodyType = bodyType;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateWebChatMessageRequest createWebChatMessageRequest = (CreateWebChatMessageRequest) o;
    return Objects.equals(this.body, createWebChatMessageRequest.body) &&
        Objects.equals(this.bodyType, createWebChatMessageRequest.bodyType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(body, bodyType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateWebChatMessageRequest {\n");
    
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    bodyType: ").append(toIndentedString(bodyType)).append("\n");
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

