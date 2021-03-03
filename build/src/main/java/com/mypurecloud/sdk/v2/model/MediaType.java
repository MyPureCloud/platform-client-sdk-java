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
 * Media type definition
 */
@ApiModel(description = "Media type definition")

public class MediaType  implements Serializable {
  
  private String type = null;

  
  /**
   * The media type string as defined by RFC 2046. You can define specific types such as 'image/jpeg', 'video/mpeg', or specify wild cards for a range of types, 'image/*', or all types '*\\/\\*'. See https://www.iana.org/assignments/media-types/media-types.xhtml for a list of registered media types.
   **/
  public MediaType type(String type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The media type string as defined by RFC 2046. You can define specific types such as 'image/jpeg', 'video/mpeg', or specify wild cards for a range of types, 'image/*', or all types '*\\/\\*'. See https://www.iana.org/assignments/media-types/media-types.xhtml for a list of registered media types.")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediaType mediaType = (MediaType) o;
    return Objects.equals(this.type, mediaType.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaType {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

