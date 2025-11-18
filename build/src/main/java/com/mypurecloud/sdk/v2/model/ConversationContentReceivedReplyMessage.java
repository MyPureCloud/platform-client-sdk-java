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
 * ReceivedReplyMessage content object.
 */
@ApiModel(description = "ReceivedReplyMessage content object.")

public class ConversationContentReceivedReplyMessage  implements Serializable {
  
  private String header = null;
  private String title = null;
  private String subtitle = null;
  private String buttonLabel = null;
  private String imageUrl = null;

  public ConversationContentReceivedReplyMessage() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Text to show in the header.
   **/
  public ConversationContentReceivedReplyMessage header(String header) {
    this.header = header;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Text to show in the header.")
  @JsonProperty("header")
  public String getHeader() {
    return header;
  }
  public void setHeader(String header) {
    this.header = header;
  }


  /**
   * Text to show in the title.
   **/
  public ConversationContentReceivedReplyMessage title(String title) {
    this.title = title;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Text to show in the title.")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }


  /**
   * Text to show in the subtitle.
   **/
  public ConversationContentReceivedReplyMessage subtitle(String subtitle) {
    this.subtitle = subtitle;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Text to show in the subtitle.")
  @JsonProperty("subtitle")
  public String getSubtitle() {
    return subtitle;
  }
  public void setSubtitle(String subtitle) {
    this.subtitle = subtitle;
  }


  /**
   * Text to show on the button label.
   **/
  public ConversationContentReceivedReplyMessage buttonLabel(String buttonLabel) {
    this.buttonLabel = buttonLabel;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Text to show on the button label.")
  @JsonProperty("buttonLabel")
  public String getButtonLabel() {
    return buttonLabel;
  }
  public void setButtonLabel(String buttonLabel) {
    this.buttonLabel = buttonLabel;
  }


  /**
   * URL of an image.
   **/
  public ConversationContentReceivedReplyMessage imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "URL of an image.")
  @JsonProperty("imageUrl")
  public String getImageUrl() {
    return imageUrl;
  }
  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationContentReceivedReplyMessage conversationContentReceivedReplyMessage = (ConversationContentReceivedReplyMessage) o;

    return Objects.equals(this.header, conversationContentReceivedReplyMessage.header) &&
            Objects.equals(this.title, conversationContentReceivedReplyMessage.title) &&
            Objects.equals(this.subtitle, conversationContentReceivedReplyMessage.subtitle) &&
            Objects.equals(this.buttonLabel, conversationContentReceivedReplyMessage.buttonLabel) &&
            Objects.equals(this.imageUrl, conversationContentReceivedReplyMessage.imageUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(header, title, subtitle, buttonLabel, imageUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationContentReceivedReplyMessage {\n");
    
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    subtitle: ").append(toIndentedString(subtitle)).append("\n");
    sb.append("    buttonLabel: ").append(toIndentedString(buttonLabel)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
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

