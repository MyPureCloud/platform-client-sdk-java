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
import com.mypurecloud.sdk.v2.model.TestMatchesEventOperation;
import com.mypurecloud.sdk.v2.model.TestSchemaOperation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Information about event test mode execution
 */
@ApiModel(description = "Information about event test mode execution")

public class TestModeEventResults  implements Serializable {
  
  private TestSchemaOperation schemaValidation = null;
  private TestMatchesEventOperation triggerMatchValidation = null;

  public TestModeEventResults() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Information about the validation of the schema of the event body passed in to test mode
   **/
  public TestModeEventResults schemaValidation(TestSchemaOperation schemaValidation) {
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
   * Information about matched and unmatched triggers
   **/
  public TestModeEventResults triggerMatchValidation(TestMatchesEventOperation triggerMatchValidation) {
    this.triggerMatchValidation = triggerMatchValidation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Information about matched and unmatched triggers")
  @JsonProperty("triggerMatchValidation")
  public TestMatchesEventOperation getTriggerMatchValidation() {
    return triggerMatchValidation;
  }
  public void setTriggerMatchValidation(TestMatchesEventOperation triggerMatchValidation) {
    this.triggerMatchValidation = triggerMatchValidation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestModeEventResults testModeEventResults = (TestModeEventResults) o;

    return Objects.equals(this.schemaValidation, testModeEventResults.schemaValidation) &&
            Objects.equals(this.triggerMatchValidation, testModeEventResults.triggerMatchValidation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemaValidation, triggerMatchValidation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestModeEventResults {\n");
    
    sb.append("    schemaValidation: ").append(toIndentedString(schemaValidation)).append("\n");
    sb.append("    triggerMatchValidation: ").append(toIndentedString(triggerMatchValidation)).append("\n");
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

