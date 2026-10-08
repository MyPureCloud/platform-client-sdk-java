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
 * A message in the conversation history provided to a guide session turn.
 */
@ApiModel(description = "A message in the conversation history provided to a guide session turn.")

public class GuideSessionMessage  implements Serializable {
  

  private static class RoleEnumDeserializer extends StdDeserializer<RoleEnum> {
    public RoleEnumDeserializer() {
      super(RoleEnumDeserializer.class);
    }

    @Override
    public RoleEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return RoleEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The role of the message author.
   */
 @JsonDeserialize(using = RoleEnumDeserializer.class)
  public enum RoleEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    USER("User"),
    ASSISTANT("Assistant");

    private String value;

    RoleEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static RoleEnum fromString(String key) {
      if (key == null) return null;

      for (RoleEnum value : RoleEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return RoleEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private RoleEnum role = null;
  private String content = null;

  public GuideSessionMessage() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public GuideSessionMessage(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The role of the message author.
   **/
  public GuideSessionMessage role(RoleEnum role) {
    this.role = role;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The role of the message author.")
  @JsonProperty("role")
  public RoleEnum getRole() {
    return role;
  }
  public void setRole(RoleEnum role) {
    this.role = role;
  }


  /**
   * The content of the message.
   **/
  public GuideSessionMessage content(String content) {
    this.content = content;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The content of the message.")
  @JsonProperty("content")
  public String getContent() {
    return content;
  }
  public void setContent(String content) {
    this.content = content;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuideSessionMessage guideSessionMessage = (GuideSessionMessage) o;

    return Objects.equals(this.role, guideSessionMessage.role) &&
            Objects.equals(this.content, guideSessionMessage.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(role, content);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuideSessionMessage {\n");
    
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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

