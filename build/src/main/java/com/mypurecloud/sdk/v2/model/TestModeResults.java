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
import com.mypurecloud.sdk.v2.model.TestMatchesOperation;
import com.mypurecloud.sdk.v2.model.TestSchemaOperation;
import com.mypurecloud.sdk.v2.model.TestTargetOperation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Information about trigger test mode execution
 */
@ApiModel(description = "Information about trigger test mode execution")

public class TestModeResults  implements Serializable {
  
  private TestSchemaOperation schemaValidation = null;
  private TestTargetOperation targetValidation = null;
  private TestMatchesOperation jsonPathValidation = null;
  private Boolean triggerMatches = null;

  public TestModeResults() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Information about the validation of the schema of the event body passed in to test mode
   **/
  public TestModeResults schemaValidation(TestSchemaOperation schemaValidation) {
    this.schemaValidation = schemaValidation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Information about the validation of the schema of the event body passed in to test mode")
  @JsonProperty("schemaValidation")
  public TestSchemaOperation getSchemaValidation() {
    return schemaValidation;
  }
  public void setSchemaValidation(TestSchemaOperation schemaValidation) {
    this.schemaValidation = schemaValidation;
  }


  /**
   * Information about the validation of the trigger target
   **/
  public TestModeResults targetValidation(TestTargetOperation targetValidation) {
    this.targetValidation = targetValidation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Information about the validation of the trigger target")
  @JsonProperty("targetValidation")
  public TestTargetOperation getTargetValidation() {
    return targetValidation;
  }
  public void setTargetValidation(TestTargetOperation targetValidation) {
    this.targetValidation = targetValidation;
  }


  /**
   * Information about the json path matching criteria
   **/
  public TestModeResults jsonPathValidation(TestMatchesOperation jsonPathValidation) {
    this.jsonPathValidation = jsonPathValidation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Information about the json path matching criteria")
  @JsonProperty("jsonPathValidation")
  public TestMatchesOperation getJsonPathValidation() {
    return jsonPathValidation;
  }
  public void setJsonPathValidation(TestMatchesOperation jsonPathValidation) {
    this.jsonPathValidation = jsonPathValidation;
  }


  /**
   * Whether the trigger would have matched on the provided event body
   **/
  public TestModeResults triggerMatches(Boolean triggerMatches) {
    this.triggerMatches = triggerMatches;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether the trigger would have matched on the provided event body")
  @JsonProperty("triggerMatches")
  public Boolean getTriggerMatches() {
    return triggerMatches;
  }
  public void setTriggerMatches(Boolean triggerMatches) {
    this.triggerMatches = triggerMatches;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestModeResults testModeResults = (TestModeResults) o;

    return Objects.equals(this.schemaValidation, testModeResults.schemaValidation) &&
            Objects.equals(this.targetValidation, testModeResults.targetValidation) &&
            Objects.equals(this.jsonPathValidation, testModeResults.jsonPathValidation) &&
            Objects.equals(this.triggerMatches, testModeResults.triggerMatches);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemaValidation, targetValidation, jsonPathValidation, triggerMatches);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestModeResults {\n");
    
    sb.append("    schemaValidation: ").append(toIndentedString(schemaValidation)).append("\n");
    sb.append("    targetValidation: ").append(toIndentedString(targetValidation)).append("\n");
    sb.append("    jsonPathValidation: ").append(toIndentedString(jsonPathValidation)).append("\n");
    sb.append("    triggerMatches: ").append(toIndentedString(triggerMatches)).append("\n");
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

