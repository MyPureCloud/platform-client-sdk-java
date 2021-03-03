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
import com.mypurecloud.sdk.v2.model.DomainEntityRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * QueueMessagingAddresses
 */

public class QueueMessagingAddresses  implements Serializable {
  
  private DomainEntityRef smsAddress = null;

  
  /**
   **/
  public QueueMessagingAddresses smsAddress(DomainEntityRef smsAddress) {
    this.smsAddress = smsAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("smsAddress")
  public DomainEntityRef getSmsAddress() {
    return smsAddress;
  }
  public void setSmsAddress(DomainEntityRef smsAddress) {
    this.smsAddress = smsAddress;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueueMessagingAddresses queueMessagingAddresses = (QueueMessagingAddresses) o;
    return Objects.equals(this.smsAddress, queueMessagingAddresses.smsAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(smsAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueMessagingAddresses {\n");
    
    sb.append("    smsAddress: ").append(toIndentedString(smsAddress)).append("\n");
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

