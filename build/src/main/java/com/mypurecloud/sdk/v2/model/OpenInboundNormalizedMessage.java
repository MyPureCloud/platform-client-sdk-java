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
import com.mypurecloud.sdk.v2.model.OpenInboundMessageContent;
import com.mypurecloud.sdk.v2.model.OpenInboundMessageMessagingChannel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * Open Messaging rich media message structure
 */
@ApiModel(description = "Open Messaging rich media message structure")

public class OpenInboundNormalizedMessage  implements Serializable {
  
  private OpenInboundMessageMessagingChannel channel = null;
  private String text = null;
  private List<OpenInboundMessageContent> content = null;
  private Map<String, String> metadata = null;

  public OpenInboundNormalizedMessage() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      content = new ArrayList<OpenInboundMessageContent>();
    }
  }

  
  /**
   * Channel-specific information that describes the message and the message channel/provider.
   **/
  public OpenInboundNormalizedMessage channel(OpenInboundMessageMessagingChannel channel) {
    this.channel = channel;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Channel-specific information that describes the message and the message channel/provider.")
  @JsonProperty("channel")
  public OpenInboundMessageMessagingChannel getChannel() {
    return channel;
  }
  public void setChannel(OpenInboundMessageMessagingChannel channel) {
    this.channel = channel;
  }


  /**
   * Message text.
   **/
  public OpenInboundNormalizedMessage text(String text) {
    this.text = text;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Message text.")
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }


  /**
   * List of content elements.
   **/
  public OpenInboundNormalizedMessage content(List<OpenInboundMessageContent> content) {
    this.content = content;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of content elements.")
  @JsonProperty("content")
  public List<OpenInboundMessageContent> getContent() {
    return content;
  }
  public void setContent(List<OpenInboundMessageContent> content) {
    this.content = content;
  }


  /**
   * Additional metadata about this message to capture non-channel specific data.
   **/
  public OpenInboundNormalizedMessage metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Additional metadata about this message to capture non-channel specific data.")
  @JsonProperty("metadata")
  public Map<String, String> getMetadata() {
    return metadata;
  }
  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenInboundNormalizedMessage openInboundNormalizedMessage = (OpenInboundNormalizedMessage) o;

    return Objects.equals(this.channel, openInboundNormalizedMessage.channel) &&
            Objects.equals(this.text, openInboundNormalizedMessage.text) &&
            Objects.equals(this.content, openInboundNormalizedMessage.content) &&
            Objects.equals(this.metadata, openInboundNormalizedMessage.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channel, text, content, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenInboundNormalizedMessage {\n");
    
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

