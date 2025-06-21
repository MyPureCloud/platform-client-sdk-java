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
import com.mypurecloud.sdk.v2.model.ContentButtonResponse;
import com.mypurecloud.sdk.v2.model.OpenInboundMessageMessagingChannel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * OpenInboundStructuredResponseMessage
 */

public class OpenInboundStructuredResponseMessage  implements Serializable {
  
  private OpenInboundMessageMessagingChannel channel = null;
  private ContentButtonResponse buttonResponse = null;
  private String originatingMessageId = null;

  public OpenInboundStructuredResponseMessage() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Channel-specific information that describes the message and the message channel/provider.
   **/
  public OpenInboundStructuredResponseMessage channel(OpenInboundMessageMessagingChannel channel) {
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
   * Button response element.
   **/
  public OpenInboundStructuredResponseMessage buttonResponse(ContentButtonResponse buttonResponse) {
    this.buttonResponse = buttonResponse;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Button response element.")
  @JsonProperty("buttonResponse")
  public ContentButtonResponse getButtonResponse() {
    return buttonResponse;
  }
  public void setButtonResponse(ContentButtonResponse buttonResponse) {
    this.buttonResponse = buttonResponse;
  }


  /**
   * Id of original structured message that this messages responds to.
   **/
  public OpenInboundStructuredResponseMessage originatingMessageId(String originatingMessageId) {
    this.originatingMessageId = originatingMessageId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Id of original structured message that this messages responds to.")
  @JsonProperty("originatingMessageId")
  public String getOriginatingMessageId() {
    return originatingMessageId;
  }
  public void setOriginatingMessageId(String originatingMessageId) {
    this.originatingMessageId = originatingMessageId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenInboundStructuredResponseMessage openInboundStructuredResponseMessage = (OpenInboundStructuredResponseMessage) o;

    return Objects.equals(this.channel, openInboundStructuredResponseMessage.channel) &&
            Objects.equals(this.buttonResponse, openInboundStructuredResponseMessage.buttonResponse) &&
            Objects.equals(this.originatingMessageId, openInboundStructuredResponseMessage.originatingMessageId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channel, buttonResponse, originatingMessageId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenInboundStructuredResponseMessage {\n");
    
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    buttonResponse: ").append(toIndentedString(buttonResponse)).append("\n");
    sb.append("    originatingMessageId: ").append(toIndentedString(originatingMessageId)).append("\n");
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

