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
 * MandatoryPostCallActionInput
 */

public class MandatoryPostCallActionInput  implements Serializable {
  
  private String destination = null;
  private String invocationData = null;

  public MandatoryPostCallActionInput() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The destination phone number or phone id to send the flow to after completion.  If null or blank will not update.
   **/
  public MandatoryPostCallActionInput destination(String destination) {
    this.destination = destination;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The destination phone number or phone id to send the flow to after completion.  If null or blank will not update.")
  @JsonProperty("destination")
  public String getDestination() {
    return destination;
  }
  public void setDestination(String destination) {
    this.destination = destination;
  }


  /**
   * The invocation data to send the destination after completion.  If null or blank will not update.  Invocation data is only supported when the destination is an Inbound Call flow or Voice Survey flow.
   **/
  public MandatoryPostCallActionInput invocationData(String invocationData) {
    this.invocationData = invocationData;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The invocation data to send the destination after completion.  If null or blank will not update.  Invocation data is only supported when the destination is an Inbound Call flow or Voice Survey flow.")
  @JsonProperty("invocationData")
  public String getInvocationData() {
    return invocationData;
  }
  public void setInvocationData(String invocationData) {
    this.invocationData = invocationData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MandatoryPostCallActionInput mandatoryPostCallActionInput = (MandatoryPostCallActionInput) o;

    return Objects.equals(this.destination, mandatoryPostCallActionInput.destination) &&
            Objects.equals(this.invocationData, mandatoryPostCallActionInput.invocationData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destination, invocationData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MandatoryPostCallActionInput {\n");
    
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    invocationData: ").append(toIndentedString(invocationData)).append("\n");
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

