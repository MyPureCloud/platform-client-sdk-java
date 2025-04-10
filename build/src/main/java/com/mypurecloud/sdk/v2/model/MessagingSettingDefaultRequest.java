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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * MessagingSettingDefaultRequest
 */

public class MessagingSettingDefaultRequest  implements Serializable {
  
  private String settingId = null;

  public MessagingSettingDefaultRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Messaging Setting ID to be used as the default for this Organization.
   **/
  public MessagingSettingDefaultRequest settingId(String settingId) {
    this.settingId = settingId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Messaging Setting ID to be used as the default for this Organization.")
  @JsonProperty("settingId")
  public String getSettingId() {
    return settingId;
  }
  public void setSettingId(String settingId) {
    this.settingId = settingId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessagingSettingDefaultRequest messagingSettingDefaultRequest = (MessagingSettingDefaultRequest) o;

    return Objects.equals(this.settingId, messagingSettingDefaultRequest.settingId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(settingId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessagingSettingDefaultRequest {\n");
    
    sb.append("    settingId: ").append(toIndentedString(settingId)).append("\n");
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

