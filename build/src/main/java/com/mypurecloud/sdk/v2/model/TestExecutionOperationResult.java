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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * TestExecutionOperationResult
 */

public class TestExecutionOperationResult  implements Serializable {
  
  private Integer step = null;
  private String name = null;
  private Boolean success = null;
  private Object result = null;
  private ErrorBody error = null;

  
  /**
   * The step number to indicate the order in which the operation was performed
   **/
  public TestExecutionOperationResult step(Integer step) {
    this.step = step;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The step number to indicate the order in which the operation was performed")
  @JsonProperty("step")
  public Integer getStep() {
    return step;
  }
  public void setStep(Integer step) {
    this.step = step;
  }

  
  /**
   * Name of the operation performed
   **/
  public TestExecutionOperationResult name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Name of the operation performed")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Indicated whether or not the operation was successful
   **/
  public TestExecutionOperationResult success(Boolean success) {
    this.success = success;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicated whether or not the operation was successful")
  @JsonProperty("success")
  public Boolean getSuccess() {
    return success;
  }
  public void setSuccess(Boolean success) {
    this.success = success;
  }

  
  /**
   * The result of the operation
   **/
  public TestExecutionOperationResult result(Object result) {
    this.result = result;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The result of the operation")
  @JsonProperty("result")
  public Object getResult() {
    return result;
  }
  public void setResult(Object result) {
    this.result = result;
  }

  
  /**
   * Error that occurred during the operation
   **/
  public TestExecutionOperationResult error(ErrorBody error) {
    this.error = error;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Error that occurred during the operation")
  @JsonProperty("error")
  public ErrorBody getError() {
    return error;
  }
  public void setError(ErrorBody error) {
    this.error = error;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestExecutionOperationResult testExecutionOperationResult = (TestExecutionOperationResult) o;
    return Objects.equals(this.step, testExecutionOperationResult.step) &&
        Objects.equals(this.name, testExecutionOperationResult.name) &&
        Objects.equals(this.success, testExecutionOperationResult.success) &&
        Objects.equals(this.result, testExecutionOperationResult.result) &&
        Objects.equals(this.error, testExecutionOperationResult.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(step, name, success, result, error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestExecutionOperationResult {\n");
    
    sb.append("    step: ").append(toIndentedString(step)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

