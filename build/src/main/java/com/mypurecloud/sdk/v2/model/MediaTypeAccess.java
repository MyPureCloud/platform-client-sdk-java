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
import com.mypurecloud.sdk.v2.model.MediaType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Media type access definitions
 */
@ApiModel(description = "Media type access definitions")

public class MediaTypeAccess  implements Serializable {
  
  private List<MediaType> inbound = new ArrayList<MediaType>();
  private List<MediaType> outbound = new ArrayList<MediaType>();

  
  /**
   * List of media types allowed for inbound messages from customers. If inbound messages from a customer contain media that is not in this list, the media will be dropped from the outbound message.
   **/
  public MediaTypeAccess inbound(List<MediaType> inbound) {
    this.inbound = inbound;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of media types allowed for inbound messages from customers. If inbound messages from a customer contain media that is not in this list, the media will be dropped from the outbound message.")
  @JsonProperty("inbound")
  public List<MediaType> getInbound() {
    return inbound;
  }
  public void setInbound(List<MediaType> inbound) {
    this.inbound = inbound;
  }

  
  /**
   * List of media types allowed for outbound messages to customers. If an outbound message is sent that contains media that is not in this list, the message will not be sent.
   **/
  public MediaTypeAccess outbound(List<MediaType> outbound) {
    this.outbound = outbound;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of media types allowed for outbound messages to customers. If an outbound message is sent that contains media that is not in this list, the message will not be sent.")
  @JsonProperty("outbound")
  public List<MediaType> getOutbound() {
    return outbound;
  }
  public void setOutbound(List<MediaType> outbound) {
    this.outbound = outbound;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediaTypeAccess mediaTypeAccess = (MediaTypeAccess) o;
    return Objects.equals(this.inbound, mediaTypeAccess.inbound) &&
        Objects.equals(this.outbound, mediaTypeAccess.outbound);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inbound, outbound);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaTypeAccess {\n");
    
    sb.append("    inbound: ").append(toIndentedString(inbound)).append("\n");
    sb.append("    outbound: ").append(toIndentedString(outbound)).append("\n");
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

