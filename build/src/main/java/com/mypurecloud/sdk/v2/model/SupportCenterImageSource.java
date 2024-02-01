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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * SupportCenterImageSource
 */

public class SupportCenterImageSource  implements Serializable {
  
  private String defaultUrl = null;

  
  /**
   * Default URL for image
   **/
  public SupportCenterImageSource defaultUrl(String defaultUrl) {
    this.defaultUrl = defaultUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Default URL for image")
  @JsonProperty("defaultUrl")
  public String getDefaultUrl() {
    return defaultUrl;
  }
  public void setDefaultUrl(String defaultUrl) {
    this.defaultUrl = defaultUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SupportCenterImageSource supportCenterImageSource = (SupportCenterImageSource) o;

    return Objects.equals(this.defaultUrl, supportCenterImageSource.defaultUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SupportCenterImageSource {\n");
    
    sb.append("    defaultUrl: ").append(toIndentedString(defaultUrl)).append("\n");
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

