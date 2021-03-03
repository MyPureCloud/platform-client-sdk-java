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
import com.mypurecloud.sdk.v2.model.MediaTypeAccess;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Media types
 */
@ApiModel(description = "Media types")

public class MediaTypes  implements Serializable {
  
  private MediaTypeAccess allow = null;

  
  /**
   * Specify allowed media types for inbound and outbound messages. If this field is empty, all inbound and outbound media will be blocked.
   **/
  public MediaTypes allow(MediaTypeAccess allow) {
    this.allow = allow;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Specify allowed media types for inbound and outbound messages. If this field is empty, all inbound and outbound media will be blocked.")
  @JsonProperty("allow")
  public MediaTypeAccess getAllow() {
    return allow;
  }
  public void setAllow(MediaTypeAccess allow) {
    this.allow = allow;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediaTypes mediaTypes = (MediaTypes) o;
    return Objects.equals(this.allow, mediaTypes.allow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allow);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaTypes {\n");
    
    sb.append("    allow: ").append(toIndentedString(allow)).append("\n");
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

