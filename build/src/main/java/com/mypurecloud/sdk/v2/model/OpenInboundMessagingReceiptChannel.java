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
import com.mypurecloud.sdk.v2.model.OpenMessagingToRecipient;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * Open Channel-specific information that describes the message and the message channel/provider.
 */
@ApiModel(description = "Open Channel-specific information that describes the message and the message channel/provider.")

public class OpenInboundMessagingReceiptChannel  implements Serializable {
  
  private OpenMessagingToRecipient to = null;
  private Date time = null;

  public OpenInboundMessagingReceiptChannel() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Information about the recipient the message is intended for.
   **/
  public OpenInboundMessagingReceiptChannel to(OpenMessagingToRecipient to) {
    this.to = to;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Information about the recipient the message is intended for.")
  @JsonProperty("to")
  public OpenMessagingToRecipient getTo() {
    return to;
  }
  public void setTo(OpenMessagingToRecipient to) {
    this.to = to;
  }


  /**
   * Original time of the event. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public OpenInboundMessagingReceiptChannel time(Date time) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenInboundMessagingReceiptChannel openInboundMessagingReceiptChannel = (OpenInboundMessagingReceiptChannel) o;

    return Objects.equals(this.to, openInboundMessagingReceiptChannel.to) &&
            Objects.equals(this.time, openInboundMessagingReceiptChannel.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(to, time);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenInboundMessagingReceiptChannel {\n");
    
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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

