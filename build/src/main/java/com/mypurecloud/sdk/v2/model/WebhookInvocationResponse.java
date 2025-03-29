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
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * WebhookInvocationResponse
 */

public class WebhookInvocationResponse  implements Serializable {
  
  private String invocationId = null;

  
  /**
   * The id of the Webhook Invocation
   **/
  public WebhookInvocationResponse invocationId(String invocationId) {
    this.invocationId = invocationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The id of the Webhook Invocation")
  @JsonProperty("invocationId")
  public String getInvocationId() {
    return invocationId;
  }
  public void setInvocationId(String invocationId) {
    this.invocationId = invocationId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookInvocationResponse webhookInvocationResponse = (WebhookInvocationResponse) o;

    return Objects.equals(this.invocationId, webhookInvocationResponse.invocationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invocationId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookInvocationResponse {\n");
    
    sb.append("    invocationId: ").append(toIndentedString(invocationId)).append("\n");
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

