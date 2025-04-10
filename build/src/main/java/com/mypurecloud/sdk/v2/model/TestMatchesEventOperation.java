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
import com.mypurecloud.sdk.v2.model.TestModeTrigger;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Results from evaluating matching criteria against test input
 */
@ApiModel(description = "Results from evaluating matching criteria against test input")

public class TestMatchesEventOperation  implements Serializable {
  
  private String name = null;
  private Integer step = null;
  private List<TestModeTrigger> matchedTriggers = null;
  private List<TestModeTrigger> unmatchedTriggers = null;

  public TestMatchesEventOperation() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      matchedTriggers = new ArrayList<TestModeTrigger>();
      unmatchedTriggers = new ArrayList<TestModeTrigger>();
    }
  }

  
  /**
   * The name of the processing step
   **/
  public TestMatchesEventOperation name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of the processing step")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The number of the processing step
   **/
  public TestMatchesEventOperation step(Integer step) {
    this.step = step;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of the processing step")
  @JsonProperty("step")
  public Integer getStep() {
    return step;
  }
  public void setStep(Integer step) {
    this.step = step;
  }


  /**
   * Triggers that matched
   **/
  public TestMatchesEventOperation matchedTriggers(List<TestModeTrigger> matchedTriggers) {
    this.matchedTriggers = matchedTriggers;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Triggers that matched")
  @JsonProperty("matchedTriggers")
  public List<TestModeTrigger> getMatchedTriggers() {
    return matchedTriggers;
  }
  public void setMatchedTriggers(List<TestModeTrigger> matchedTriggers) {
    this.matchedTriggers = matchedTriggers;
  }


  /**
   * Triggers that did not match
   **/
  public TestMatchesEventOperation unmatchedTriggers(List<TestModeTrigger> unmatchedTriggers) {
    this.unmatchedTriggers = unmatchedTriggers;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Triggers that did not match")
  @JsonProperty("unmatchedTriggers")
  public List<TestModeTrigger> getUnmatchedTriggers() {
    return unmatchedTriggers;
  }
  public void setUnmatchedTriggers(List<TestModeTrigger> unmatchedTriggers) {
    this.unmatchedTriggers = unmatchedTriggers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestMatchesEventOperation testMatchesEventOperation = (TestMatchesEventOperation) o;

    return Objects.equals(this.name, testMatchesEventOperation.name) &&
            Objects.equals(this.step, testMatchesEventOperation.step) &&
            Objects.equals(this.matchedTriggers, testMatchesEventOperation.matchedTriggers) &&
            Objects.equals(this.unmatchedTriggers, testMatchesEventOperation.unmatchedTriggers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, step, matchedTriggers, unmatchedTriggers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestMatchesEventOperation {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    step: ").append(toIndentedString(step)).append("\n");
    sb.append("    matchedTriggers: ").append(toIndentedString(matchedTriggers)).append("\n");
    sb.append("    unmatchedTriggers: ").append(toIndentedString(unmatchedTriggers)).append("\n");
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

