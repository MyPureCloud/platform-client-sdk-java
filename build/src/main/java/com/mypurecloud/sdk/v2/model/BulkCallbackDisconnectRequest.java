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
import com.mypurecloud.sdk.v2.model.CallbackDisconnectIdentifier;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * BulkCallbackDisconnectRequest
 */

public class BulkCallbackDisconnectRequest  implements Serializable {
  
  private List<CallbackDisconnectIdentifier> callbackDisconnectIdentifiers = new ArrayList<CallbackDisconnectIdentifier>();

  
  /**
   * The list of requests to disconnect callbacks in bulk
   **/
  public BulkCallbackDisconnectRequest callbackDisconnectIdentifiers(List<CallbackDisconnectIdentifier> callbackDisconnectIdentifiers) {
    this.callbackDisconnectIdentifiers = callbackDisconnectIdentifiers;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The list of requests to disconnect callbacks in bulk")
  @JsonProperty("callbackDisconnectIdentifiers")
  public List<CallbackDisconnectIdentifier> getCallbackDisconnectIdentifiers() {
    return callbackDisconnectIdentifiers;
  }
  public void setCallbackDisconnectIdentifiers(List<CallbackDisconnectIdentifier> callbackDisconnectIdentifiers) {
    this.callbackDisconnectIdentifiers = callbackDisconnectIdentifiers;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkCallbackDisconnectRequest bulkCallbackDisconnectRequest = (BulkCallbackDisconnectRequest) o;
    return Objects.equals(this.callbackDisconnectIdentifiers, bulkCallbackDisconnectRequest.callbackDisconnectIdentifiers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callbackDisconnectIdentifiers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkCallbackDisconnectRequest {\n");
    
    sb.append("    callbackDisconnectIdentifiers: ").append(toIndentedString(callbackDisconnectIdentifiers)).append("\n");
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

