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
import com.mypurecloud.sdk.v2.model.ConversationContentRichLinkHeader;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * A Rich Link attachment
 */
@ApiModel(description = "A Rich Link attachment")

public class ConversationContentRichLink  implements Serializable {
  
  private ConversationContentRichLinkHeader header = null;
  private String footer = null;
  private String text = null;
  private String urlLabel = null;
  private String url = null;

  public ConversationContentRichLink() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Header for the Rich Link.
   **/
  public ConversationContentRichLink header(ConversationContentRichLinkHeader header) {
    this.header = header;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Header for the Rich Link.")
  @JsonProperty("header")
  public ConversationContentRichLinkHeader getHeader() {
    return header;
  }
  public void setHeader(ConversationContentRichLinkHeader header) {
    this.header = header;
  }


  /**
   * Footer text for the Rich Link.
   **/
  public ConversationContentRichLink footer(String footer) {
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
  public ConversationContentRichLink text(String text) {
    this.text = text;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Text for the body of the Rich Link.")
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }


  /**
   * Label for the URL of the Rich Link.
   **/
  public ConversationContentRichLink urlLabel(String urlLabel) {
    this.urlLabel = urlLabel;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Label for the URL of the Rich Link.")
  @JsonProperty("urlLabel")
  public String getUrlLabel() {
    return urlLabel;
  }
  public void setUrlLabel(String urlLabel) {
    this.urlLabel = urlLabel;
  }


  /**
   * Url for the Rich Link.
   **/
  public ConversationContentRichLink url(String url) {
    this.url = url;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Url for the Rich Link.")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationContentRichLink conversationContentRichLink = (ConversationContentRichLink) o;

    return Objects.equals(this.header, conversationContentRichLink.header) &&
            Objects.equals(this.footer, conversationContentRichLink.footer) &&
            Objects.equals(this.text, conversationContentRichLink.text) &&
            Objects.equals(this.urlLabel, conversationContentRichLink.urlLabel) &&
            Objects.equals(this.url, conversationContentRichLink.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(header, footer, text, urlLabel, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationContentRichLink {\n");
    
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    footer: ").append(toIndentedString(footer)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    urlLabel: ").append(toIndentedString(urlLabel)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

