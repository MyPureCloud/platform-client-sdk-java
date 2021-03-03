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
 * WebChatConfig
 */

public class WebChatConfig  implements Serializable {
  

  private static class WebChatSkinEnumDeserializer extends StdDeserializer<WebChatSkinEnum> {
    public WebChatSkinEnumDeserializer() {
      super(WebChatSkinEnumDeserializer.class);
    }

    @Override
    public WebChatSkinEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return WebChatSkinEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * css class to be applied to the web chat widget.
   */
 @JsonDeserialize(using = WebChatSkinEnumDeserializer.class)
  public enum WebChatSkinEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    BASIC("basic"),
    MODERN_CARET_SKIN("modern-caret-skin");

    private String value;

    WebChatSkinEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static WebChatSkinEnum fromString(String key) {
      if (key == null) return null;

      for (WebChatSkinEnum value : WebChatSkinEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return WebChatSkinEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private WebChatSkinEnum webChatSkin = null;

  
  /**
   * css class to be applied to the web chat widget.
   **/
  public WebChatConfig webChatSkin(WebChatSkinEnum webChatSkin) {
    this.webChatSkin = webChatSkin;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "css class to be applied to the web chat widget.")
  @JsonProperty("webChatSkin")
  public WebChatSkinEnum getWebChatSkin() {
    return webChatSkin;
  }
  public void setWebChatSkin(WebChatSkinEnum webChatSkin) {
    this.webChatSkin = webChatSkin;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebChatConfig webChatConfig = (WebChatConfig) o;
    return Objects.equals(this.webChatSkin, webChatConfig.webChatSkin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webChatSkin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebChatConfig {\n");
    
    sb.append("    webChatSkin: ").append(toIndentedString(webChatSkin)).append("\n");
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

