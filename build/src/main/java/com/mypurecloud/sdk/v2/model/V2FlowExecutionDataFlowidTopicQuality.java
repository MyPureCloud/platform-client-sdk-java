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
 * The quality context that invoked this.
 */
@ApiModel(description = "The quality context that invoked this.")

public class V2FlowExecutionDataFlowidTopicQuality  implements Serializable {
  
  private String policyId = null;
  private String policyName = null;

  public V2FlowExecutionDataFlowidTopicQuality() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The identifier of the quality policy that invoked this flow.
   **/
  public V2FlowExecutionDataFlowidTopicQuality policyId(String policyId) {
    this.policyId = policyId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The identifier of the quality policy that invoked this flow.")
  @JsonProperty("policyId")
  public String getPolicyId() {
    return policyId;
  }
  public void setPolicyId(String policyId) {
    this.policyId = policyId;
  }


  /**
   * The name of the quality policy that invoked this flow.
   **/
  public V2FlowExecutionDataFlowidTopicQuality policyName(String policyName) {
    this.policyName = policyName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of the quality policy that invoked this flow.")
  @JsonProperty("policyName")
  public String getPolicyName() {
    return policyName;
  }
  public void setPolicyName(String policyName) {
    this.policyName = policyName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2FlowExecutionDataFlowidTopicQuality v2FlowExecutionDataFlowidTopicQuality = (V2FlowExecutionDataFlowidTopicQuality) o;

    return Objects.equals(this.policyId, v2FlowExecutionDataFlowidTopicQuality.policyId) &&
            Objects.equals(this.policyName, v2FlowExecutionDataFlowidTopicQuality.policyName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policyId, policyName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2FlowExecutionDataFlowidTopicQuality {\n");
    
    sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
    sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
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

