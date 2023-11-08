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
import com.mypurecloud.sdk.v2.model.RecipientFlow;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * RecipientRequest
 */

public class RecipientRequest  implements Serializable {
  
  private RecipientFlow flow = null;

  
  /**
   * An automate flow object which defines the set of actions to be taken, when a message is received by this recipient.
   **/
  public RecipientRequest flow(RecipientFlow flow) {
    this.flow = flow;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "An automate flow object which defines the set of actions to be taken, when a message is received by this recipient.")
  @JsonProperty("flow")
  public RecipientFlow getFlow() {
    return flow;
  }
  public void setFlow(RecipientFlow flow) {
    this.flow = flow;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecipientRequest recipientRequest = (RecipientRequest) o;

    return Objects.equals(this.flow, recipientRequest.flow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flow);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipientRequest {\n");
    
    sb.append("    flow: ").append(toIndentedString(flow)).append("\n");
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

