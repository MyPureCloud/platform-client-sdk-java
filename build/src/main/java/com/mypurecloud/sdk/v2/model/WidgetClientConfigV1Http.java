package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * WidgetClientConfigV1Http
 */

public class WidgetClientConfigV1Http  implements Serializable {
  

  /**
   * Gets or Sets webChatSkin
   */
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
  private String authenticationUrl = null;

  
  /**
   **/
  public WidgetClientConfigV1Http webChatSkin(WebChatSkinEnum webChatSkin) {
    this.webChatSkin = webChatSkin;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("webChatSkin")
  public WebChatSkinEnum getWebChatSkin() {
    return webChatSkin;
  }
  public void setWebChatSkin(WebChatSkinEnum webChatSkin) {
    this.webChatSkin = webChatSkin;
  }

  
  /**
   **/
  public WidgetClientConfigV1Http authenticationUrl(String authenticationUrl) {
    this.authenticationUrl = authenticationUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("authenticationUrl")
  public String getAuthenticationUrl() {
    return authenticationUrl;
  }
  public void setAuthenticationUrl(String authenticationUrl) {
    this.authenticationUrl = authenticationUrl;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WidgetClientConfigV1Http widgetClientConfigV1Http = (WidgetClientConfigV1Http) o;
    return Objects.equals(this.webChatSkin, widgetClientConfigV1Http.webChatSkin) &&
        Objects.equals(this.authenticationUrl, widgetClientConfigV1Http.authenticationUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webChatSkin, authenticationUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WidgetClientConfigV1Http {\n");
    
    sb.append("    webChatSkin: ").append(toIndentedString(webChatSkin)).append("\n");
    sb.append("    authenticationUrl: ").append(toIndentedString(authenticationUrl)).append("\n");
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

