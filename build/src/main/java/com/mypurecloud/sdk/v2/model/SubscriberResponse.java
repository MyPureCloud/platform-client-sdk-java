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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * SubscriberResponse
 */

public class SubscriberResponse  implements Serializable {
  
  private List<String> messageReturned = new ArrayList<String>();
  private String status = null;

  
  /**
   * Suggested valid addresses
   **/
  public SubscriberResponse messageReturned(List<String> messageReturned) {
    this.messageReturned = messageReturned;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Suggested valid addresses")
  @JsonProperty("messageReturned")
  public List<String> getMessageReturned() {
    return messageReturned;
  }
  public void setMessageReturned(List<String> messageReturned) {
    this.messageReturned = messageReturned;
  }

  
  /**
   * http status
   **/
  public SubscriberResponse status(String status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "http status")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriberResponse subscriberResponse = (SubscriberResponse) o;
    return Objects.equals(this.messageReturned, subscriberResponse.messageReturned) &&
        Objects.equals(this.status, subscriberResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageReturned, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriberResponse {\n");
    
    sb.append("    messageReturned: ").append(toIndentedString(messageReturned)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

