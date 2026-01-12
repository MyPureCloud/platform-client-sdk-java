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
import com.mypurecloud.sdk.v2.model.RichLinkHeader;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * RichLink
 */

public class RichLink  implements Serializable {
  
  private String id = null;
  private RichLinkHeader header = null;
  private String footer = null;
  private String text = null;
  private String url = null;
  private String urlLabel = null;

  public RichLink() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * Header for the Rich Link.
   **/
  public RichLink header(RichLinkHeader header) {
    this.header = header;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Header for the Rich Link.")
  @JsonProperty("header")
  public RichLinkHeader getHeader() {
    return header;
  }
  public void setHeader(RichLinkHeader header) {
    this.header = header;
  }


  /**
   * Footer text for the Rich Link.
   **/
  public RichLink footer(String footer) {
    this.footer = footer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Footer text for the Rich Link.")
  @JsonProperty("footer")
  public String getFooter() {
    return footer;
  }
  public void setFooter(String footer) {
    this.footer = footer;
  }


  /**
   * Text for the body of the Rich Link.
   **/
  public RichLink text(String text) {
    this.text = text;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Text for the body of the Rich Link.")
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }


  /**
   * Url for the Rich Link.
   **/
  public RichLink url(String url) {
    this.url = url;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Url for the Rich Link.")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }


  /**
   * Label for the URL of the Rich link.
   **/
  public RichLink urlLabel(String urlLabel) {
    this.urlLabel = urlLabel;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Label for the URL of the Rich link.")
  @JsonProperty("urlLabel")
  public String getUrlLabel() {
    return urlLabel;
  }
  public void setUrlLabel(String urlLabel) {
    this.urlLabel = urlLabel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RichLink richLink = (RichLink) o;

    return Objects.equals(this.id, richLink.id) &&
            Objects.equals(this.header, richLink.header) &&
            Objects.equals(this.footer, richLink.footer) &&
            Objects.equals(this.text, richLink.text) &&
            Objects.equals(this.url, richLink.url) &&
            Objects.equals(this.urlLabel, richLink.urlLabel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, header, footer, text, url, urlLabel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RichLink {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    footer: ").append(toIndentedString(footer)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    urlLabel: ").append(toIndentedString(urlLabel)).append("\n");
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

