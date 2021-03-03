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
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.TestExecutionOperationResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * TestExecutionResult
 */

public class TestExecutionResult  implements Serializable {
  
  private List<TestExecutionOperationResult> operations = new ArrayList<TestExecutionOperationResult>();
  private ErrorBody error = null;
  private Object finalResult = null;
  private Boolean success = null;

  
  /**
   * Execution operations performed as part of the test
   **/
  public TestExecutionResult operations(List<TestExecutionOperationResult> operations) {
    this.operations = operations;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Execution operations performed as part of the test")
  @JsonProperty("operations")
  public List<TestExecutionOperationResult> getOperations() {
    return operations;
  }
  public void setOperations(List<TestExecutionOperationResult> operations) {
    this.operations = operations;
  }

  
  /**
   * The final error encountered during the test that resulted in test failure
   **/
  public TestExecutionResult error(ErrorBody error) {
    this.error = error;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The final error encountered during the test that resulted in test failure")
  @JsonProperty("error")
  public ErrorBody getError() {
    return error;
  }
  public void setError(ErrorBody error) {
    this.error = error;
  }

  
  /**
   * The final result of the test. This is the response that would be returned during normal action execution
   **/
  public TestExecutionResult finalResult(Object finalResult) {
    this.finalResult = finalResult;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The final result of the test. This is the response that would be returned during normal action execution")
  @JsonProperty("finalResult")
  public Object getFinalResult() {
    return finalResult;
  }
  public void setFinalResult(Object finalResult) {
    this.finalResult = finalResult;
  }

  
  /**
   * Indicates whether or not the test was a success
   **/
  public TestExecutionResult success(Boolean success) {
    this.success = success;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates whether or not the test was a success")
  @JsonProperty("success")
  public Boolean getSuccess() {
    return success;
  }
  public void setSuccess(Boolean success) {
    this.success = success;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestExecutionResult testExecutionResult = (TestExecutionResult) o;
    return Objects.equals(this.operations, testExecutionResult.operations) &&
        Objects.equals(this.error, testExecutionResult.error) &&
        Objects.equals(this.finalResult, testExecutionResult.finalResult) &&
        Objects.equals(this.success, testExecutionResult.success);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operations, error, finalResult, success);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestExecutionResult {\n");
    
    sb.append("    operations: ").append(toIndentedString(operations)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    finalResult: ").append(toIndentedString(finalResult)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
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

