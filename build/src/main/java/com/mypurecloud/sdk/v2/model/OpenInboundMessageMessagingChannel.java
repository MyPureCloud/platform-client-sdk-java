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
import com.mypurecloud.sdk.v2.model.OpenMessagingFromRecipient;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * Open Channel-specific information that describes the message and the message channel/provider, with additional message information
 */
@ApiModel(description = "Open Channel-specific information that describes the message and the message channel/provider, with additional message information")

public class OpenInboundMessageMessagingChannel  implements Serializable {
  
  private OpenMessagingFromRecipient from = null;
  private Date time = null;
  private String messageId = null;
  private Object metadata = null;

  public OpenInboundMessageMessagingChannel() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Information about the recipient the message is received from.
   **/
  public OpenInboundMessageMessagingChannel from(OpenMessagingFromRecipient from) {
    this.from = from;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Information about the recipient the message is received from.")
  @JsonProperty("from")
  public OpenMessagingFromRecipient getFrom() {
    return from;
  }
  public void setFrom(OpenMessagingFromRecipient from) {
    this.from = from;
  }


  /**
   * Original time of the event. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public OpenInboundMessageMessagingChannel time(Date time) {
    this.time = time;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Original time of the event. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("time")
  public Date getTime() {
    return time;
  }
  public void setTime(Date time) {
    this.time = time;
  }


  /**
   * Unique provider ID of the message.
   **/
  public OpenInboundMessageMessagingChannel messageId(String messageId) {
    this.messageId = messageId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique provider ID of the message.")
  @JsonProperty("messageId")
  public String getMessageId() {
    return messageId;
  }
  public void setMessageId(String messageId) {
    this.messageId = messageId;
  }


  /**
   * Additional Custom Information about the channel.
   **/
  public OpenInboundMessageMessagingChannel metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Additional Custom Information about the channel.")
  @JsonProperty("metadata")
  public Object getMetadata() {
    return metadata;
  }
  public void setMetadata(Object metadata) {
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
    OpenInboundMessageMessagingChannel openInboundMessageMessagingChannel = (OpenInboundMessageMessagingChannel) o;

    return Objects.equals(this.from, openInboundMessageMessagingChannel.from) &&
            Objects.equals(this.time, openInboundMessageMessagingChannel.time) &&
            Objects.equals(this.messageId, openInboundMessageMessagingChannel.messageId) &&
            Objects.equals(this.metadata, openInboundMessageMessagingChannel.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, time, messageId, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenInboundMessageMessagingChannel {\n");
    
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
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

