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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * WebChatSettings
 */

public class WebChatSettings  implements Serializable {
  
  private Boolean requireDeployment = null;

  
  /**
   **/
  public WebChatSettings requireDeployment(Boolean requireDeployment) {
    this.requireDeployment = requireDeployment;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("requireDeployment")
  public Boolean getRequireDeployment() {
    return requireDeployment;
  }
  public void setRequireDeployment(Boolean requireDeployment) {
    this.requireDeployment = requireDeployment;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebChatSettings webChatSettings = (WebChatSettings) o;
    return Objects.equals(this.requireDeployment, webChatSettings.requireDeployment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requireDeployment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebChatSettings {\n");
    
    sb.append("    requireDeployment: ").append(toIndentedString(requireDeployment)).append("\n");
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

