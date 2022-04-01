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
 * V2ConversationMessageTypingEventForWorkflowTopicConversationReason
 */

public class V2ConversationMessageTypingEventForWorkflowTopicConversationReason  implements Serializable {
  

  private static class CodeEnumDeserializer extends StdDeserializer<CodeEnum> {
    public CodeEnumDeserializer() {
      super(CodeEnumDeserializer.class);
    }

    @Override
    public CodeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return CodeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets code
   */
 @JsonDeserialize(using = CodeEnumDeserializer.class)
  public enum CodeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    MESSAGEEXPIRED("MessageExpired"),
    RATELIMITED("RateLimited"),
    MESSAGENOTALLOWED("MessageNotAllowed"),
    GENERALERROR("GeneralError"),
    UNSUPPORTEDMESSAGE("UnsupportedMessage"),
    UNKNOWNMESSAGE("UnknownMessage"),
    INVALIDMESSAGESTRUCTURE("InvalidMessageStructure"),
    INVALIDDESTINATION("InvalidDestination"),
    SERVERERROR("ServerError"),
    MEDIATYPENOTALLOWED("MediaTypeNotAllowed"),
    INVALIDMEDIACONTENTLENGTH("InvalidMediaContentLength"),
    RECIPIENTOPTEDOUT("RecipientOptedOut");

    private String value;

    CodeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static CodeEnum fromString(String key) {
      if (key == null) return null;

      for (CodeEnum value : CodeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return CodeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private CodeEnum code = null;
  private String message = null;

  
  /**
   **/
  public V2ConversationMessageTypingEventForWorkflowTopicConversationReason code(CodeEnum code) {
    this.code = code;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("code")
  public CodeEnum getCode() {
    return code;
  }
  public void setCode(CodeEnum code) {
    this.code = code;
  }

  
  /**
   **/
  public V2ConversationMessageTypingEventForWorkflowTopicConversationReason message(String message) {
    this.message = message;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2ConversationMessageTypingEventForWorkflowTopicConversationReason v2ConversationMessageTypingEventForWorkflowTopicConversationReason = (V2ConversationMessageTypingEventForWorkflowTopicConversationReason) o;
    return Objects.equals(this.code, v2ConversationMessageTypingEventForWorkflowTopicConversationReason.code) &&
        Objects.equals(this.message, v2ConversationMessageTypingEventForWorkflowTopicConversationReason.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2ConversationMessageTypingEventForWorkflowTopicConversationReason {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

