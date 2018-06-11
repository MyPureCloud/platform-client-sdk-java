package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * WebChatConfig
 */

public class WebChatConfig  implements Serializable {
  
  private String webChatSkin = null;

  
  /**
   * css class to be applied to the web chat widget.
   **/
  public WebChatConfig webChatSkin(String webChatSkin) {
    this.webChatSkin = webChatSkin;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "css class to be applied to the web chat widget.")
  @JsonProperty("webChatSkin")
  public String getWebChatSkin() {
    return webChatSkin;
  }
  public void setWebChatSkin(String webChatSkin) {
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

