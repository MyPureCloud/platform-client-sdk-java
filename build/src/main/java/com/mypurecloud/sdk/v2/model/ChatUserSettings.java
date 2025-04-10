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
import com.mypurecloud.sdk.v2.model.MobileSettings;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Settings for a chat user
 */
@ApiModel(description = "Settings for a chat user")

public class ChatUserSettings  implements Serializable {
  
  private MobileSettings mobile = null;

  public ChatUserSettings() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Settings for mobile devices
   **/
  public ChatUserSettings mobile(MobileSettings mobile) {
    this.mobile = mobile;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Settings for mobile devices")
  @JsonProperty("mobile")
  public MobileSettings getMobile() {
    return mobile;
  }
  public void setMobile(MobileSettings mobile) {
    this.mobile = mobile;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChatUserSettings chatUserSettings = (ChatUserSettings) o;

    return Objects.equals(this.mobile, chatUserSettings.mobile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mobile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatUserSettings {\n");
    
    sb.append("    mobile: ").append(toIndentedString(mobile)).append("\n");
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

