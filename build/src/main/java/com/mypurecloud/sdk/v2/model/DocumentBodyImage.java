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
 * DocumentBodyImage
 */

public class DocumentBodyImage  implements Serializable {
  
  private String url = null;
  private String hyperlink = null;

  
  /**
   * The URL for the image.
   **/
  public DocumentBodyImage url(String url) {
    this.url = url;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The URL for the image.")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }


  /**
   * The URL of the page that the hyperlink goes to.
   **/
  public DocumentBodyImage hyperlink(String hyperlink) {
    this.hyperlink = hyperlink;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The URL of the page that the hyperlink goes to.")
  @JsonProperty("hyperlink")
  public String getHyperlink() {
    return hyperlink;
  }
  public void setHyperlink(String hyperlink) {
    this.hyperlink = hyperlink;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentBodyImage documentBodyImage = (DocumentBodyImage) o;

    return Objects.equals(this.url, documentBodyImage.url) &&
            Objects.equals(this.hyperlink, documentBodyImage.hyperlink);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, hyperlink);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentBodyImage {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    hyperlink: ").append(toIndentedString(hyperlink)).append("\n");
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

