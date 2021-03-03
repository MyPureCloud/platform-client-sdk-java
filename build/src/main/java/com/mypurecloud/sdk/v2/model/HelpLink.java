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
 * Link to a help or support resource
 */
@ApiModel(description = "Link to a help or support resource")

public class HelpLink  implements Serializable {
  
  private String uri = null;
  private String title = null;
  private String description = null;

  
  @ApiModelProperty(example = "null", value = "URI of the help resource")
  @JsonProperty("uri")
  public String getUri() {
    return uri;
  }

  
  @ApiModelProperty(example = "null", value = "Link text of the resource")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  
  @ApiModelProperty(example = "null", value = "Description of the document or resource")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HelpLink helpLink = (HelpLink) o;
    return Objects.equals(this.uri, helpLink.uri) &&
        Objects.equals(this.title, helpLink.title) &&
        Objects.equals(this.description, helpLink.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uri, title, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HelpLink {\n");
    
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

