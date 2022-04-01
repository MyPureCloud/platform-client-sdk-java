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

import java.io.Serializable;
/**
 * CallbackDisconnectIdentifier
 */

public class CallbackDisconnectIdentifier  implements Serializable {
  
  private String conversationId = null;
  private String callbackId = null;

  
  /**
   * The Conversation Id.
   **/
  public CallbackDisconnectIdentifier conversationId(String conversationId) {
    this.conversationId = conversationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The Conversation Id.")
  @JsonProperty("conversationId")
  public String getConversationId() {
    return conversationId;
  }
  public void setConversationId(String conversationId) {
    this.conversationId = conversationId;
  }

  
  /**
   * The callback id.
   **/
  public CallbackDisconnectIdentifier callbackId(String callbackId) {
    this.callbackId = callbackId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The callback id.")
  @JsonProperty("callbackId")
  public String getCallbackId() {
    return callbackId;
  }
  public void setCallbackId(String callbackId) {
    this.callbackId = callbackId;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CallbackDisconnectIdentifier callbackDisconnectIdentifier = (CallbackDisconnectIdentifier) o;
    return Objects.equals(this.conversationId, callbackDisconnectIdentifier.conversationId) &&
        Objects.equals(this.callbackId, callbackDisconnectIdentifier.callbackId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversationId, callbackId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallbackDisconnectIdentifier {\n");
    
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
    sb.append("    callbackId: ").append(toIndentedString(callbackId)).append("\n");
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

