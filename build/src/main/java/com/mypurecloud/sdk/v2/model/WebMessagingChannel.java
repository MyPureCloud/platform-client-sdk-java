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
import com.mypurecloud.sdk.v2.model.WebMessagingRecipient;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * Channel-specific information that describes the message and the message channel/provider.
 */
@ApiModel(description = "Channel-specific information that describes the message and the message channel/provider.")

public class WebMessagingChannel  implements Serializable {
  
  private WebMessagingRecipient from = null;
  private WebMessagingRecipient to = null;
  private Date time = null;
  private String messageId = null;

  
  @ApiModelProperty(example = "null", value = "Information about the recipient the message is received from.")
  @JsonProperty("from")
  public WebMessagingRecipient getFrom() {
    return from;
  }

  
  @ApiModelProperty(example = "null", value = "Information about the recipient the message is sent to.")
  @JsonProperty("to")
  public WebMessagingRecipient getTo() {
    return to;
  }

  
  @ApiModelProperty(example = "null", value = "When the message was processed by Genesys Cloud. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("time")
  public Date getTime() {
    return time;
  }

  
  @ApiModelProperty(example = "null", value = "Unique provider ID of the message.")
  @JsonProperty("messageId")
  public String getMessageId() {
    return messageId;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebMessagingChannel webMessagingChannel = (WebMessagingChannel) o;
    return Objects.equals(this.from, webMessagingChannel.from) &&
        Objects.equals(this.to, webMessagingChannel.to) &&
        Objects.equals(this.time, webMessagingChannel.time) &&
        Objects.equals(this.messageId, webMessagingChannel.messageId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, to, time, messageId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebMessagingChannel {\n");
    
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
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

