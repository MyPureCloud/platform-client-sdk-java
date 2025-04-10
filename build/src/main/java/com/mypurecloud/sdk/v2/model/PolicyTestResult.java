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
import com.mypurecloud.sdk.v2.model.PolicyConditionResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * PolicyTestResult
 */

public class PolicyTestResult  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String result = null;
  private List<PolicyConditionResult> policyConditionResults = null;

  public PolicyTestResult() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      policyConditionResults = new ArrayList<PolicyConditionResult>();
    }
  }

  
  /**
   * The ID of the policy being tested.
   **/
  public PolicyTestResult id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of the policy being tested.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * The name of the policy being tested.
   **/
  public PolicyTestResult name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of the policy being tested.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The result of the evaluation against supplied test data.
   **/
  public PolicyTestResult result(String result) {
    this.result = result;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The result of the evaluation against supplied test data.")
  @JsonProperty("result")
  public String getResult() {
    return result;
  }
  public void setResult(String result) {
    this.result = result;
  }


  /**
   * The results of conditions, with their boolean result.
   **/
  public PolicyTestResult policyConditionResults(List<PolicyConditionResult> policyConditionResults) {
    this.policyConditionResults = policyConditionResults;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The results of conditions, with their boolean result.")
  @JsonProperty("policyConditionResults")
  public List<PolicyConditionResult> getPolicyConditionResults() {
    return policyConditionResults;
  }
  public void setPolicyConditionResults(List<PolicyConditionResult> policyConditionResults) {
    this.policyConditionResults = policyConditionResults;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PolicyTestResult policyTestResult = (PolicyTestResult) o;

    return Objects.equals(this.id, policyTestResult.id) &&
            Objects.equals(this.name, policyTestResult.name) &&
            Objects.equals(this.result, policyTestResult.result) &&
            Objects.equals(this.policyConditionResults, policyTestResult.policyConditionResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, result, policyConditionResults);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PolicyTestResult {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    policyConditionResults: ").append(toIndentedString(policyConditionResults)).append("\n");
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

