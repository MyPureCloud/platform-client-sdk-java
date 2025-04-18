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
import com.mypurecloud.sdk.v2.model.PolicyErrorMessage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * PolicyErrors
 */

public class PolicyErrors  implements Serializable {
  
  private List<PolicyErrorMessage> policyErrorMessages = null;

  public PolicyErrors() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      policyErrorMessages = new ArrayList<PolicyErrorMessage>();
    }
  }

  
  /**
   **/
  public PolicyErrors policyErrorMessages(List<PolicyErrorMessage> policyErrorMessages) {
    this.policyErrorMessages = policyErrorMessages;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("policyErrorMessages")
  public List<PolicyErrorMessage> getPolicyErrorMessages() {
    return policyErrorMessages;
  }
  public void setPolicyErrorMessages(List<PolicyErrorMessage> policyErrorMessages) {
    this.policyErrorMessages = policyErrorMessages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PolicyErrors policyErrors = (PolicyErrors) o;

    return Objects.equals(this.policyErrorMessages, policyErrors.policyErrorMessages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policyErrorMessages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PolicyErrors {\n");
    
    sb.append("    policyErrorMessages: ").append(toIndentedString(policyErrorMessages)).append("\n");
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

