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
import com.mypurecloud.sdk.v2.model.CallbackIdentifier;
import com.mypurecloud.sdk.v2.model.DomainEntityRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * CreateCallbackResponse
 */

public class CreateCallbackResponse  implements Serializable {
  
  private DomainEntityRef conversation = null;
  private List<CallbackIdentifier> callbackIdentifiers = new ArrayList<CallbackIdentifier>();

  
  /**
   * The conversation associated with the callback
   **/
  public CreateCallbackResponse conversation(DomainEntityRef conversation) {
    this.conversation = conversation;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The conversation associated with the callback")
  @JsonProperty("conversation")
  public DomainEntityRef getConversation() {
    return conversation;
  }
  public void setConversation(DomainEntityRef conversation) {
    this.conversation = conversation;
  }

  
  /**
   * The list of communication identifiers for the callback participants
   **/
  public CreateCallbackResponse callbackIdentifiers(List<CallbackIdentifier> callbackIdentifiers) {
    this.callbackIdentifiers = callbackIdentifiers;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The list of communication identifiers for the callback participants")
  @JsonProperty("callbackIdentifiers")
  public List<CallbackIdentifier> getCallbackIdentifiers() {
    return callbackIdentifiers;
  }
  public void setCallbackIdentifiers(List<CallbackIdentifier> callbackIdentifiers) {
    this.callbackIdentifiers = callbackIdentifiers;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCallbackResponse createCallbackResponse = (CreateCallbackResponse) o;
    return Objects.equals(this.conversation, createCallbackResponse.conversation) &&
        Objects.equals(this.callbackIdentifiers, createCallbackResponse.callbackIdentifiers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversation, callbackIdentifiers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCallbackResponse {\n");
    
    sb.append("    conversation: ").append(toIndentedString(conversation)).append("\n");
    sb.append("    callbackIdentifiers: ").append(toIndentedString(callbackIdentifiers)).append("\n");
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

