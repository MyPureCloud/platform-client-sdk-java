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
import com.mypurecloud.sdk.v2.model.CallForwardingEventTarget;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * CallForwardingEventCall
 */

public class CallForwardingEventCall  implements Serializable {
  
  private List<CallForwardingEventTarget> targets = new ArrayList<CallForwardingEventTarget>();

  
  /**
   **/
  public CallForwardingEventCall targets(List<CallForwardingEventTarget> targets) {
    this.targets = targets;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("targets")
  public List<CallForwardingEventTarget> getTargets() {
    return targets;
  }
  public void setTargets(List<CallForwardingEventTarget> targets) {
    this.targets = targets;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CallForwardingEventCall callForwardingEventCall = (CallForwardingEventCall) o;
    return Objects.equals(this.targets, callForwardingEventCall.targets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallForwardingEventCall {\n");
    
    sb.append("    targets: ").append(toIndentedString(targets)).append("\n");
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

