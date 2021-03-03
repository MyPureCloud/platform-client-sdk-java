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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * UsageExecutionResult
 */

public class UsageExecutionResult  implements Serializable {
  
  private String executionId = null;
  private String resultsUri = null;

  
  /**
   * The id of the query execution
   **/
  public UsageExecutionResult executionId(String executionId) {
    this.executionId = executionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The id of the query execution")
  @JsonProperty("executionId")
  public String getExecutionId() {
    return executionId;
  }
  public void setExecutionId(String executionId) {
    this.executionId = executionId;
  }

  
  /**
   * URI where the query results can be retrieved
   **/
  public UsageExecutionResult resultsUri(String resultsUri) {
    this.resultsUri = resultsUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "URI where the query results can be retrieved")
  @JsonProperty("resultsUri")
  public String getResultsUri() {
    return resultsUri;
  }
  public void setResultsUri(String resultsUri) {
    this.resultsUri = resultsUri;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageExecutionResult usageExecutionResult = (UsageExecutionResult) o;
    return Objects.equals(this.executionId, usageExecutionResult.executionId) &&
        Objects.equals(this.resultsUri, usageExecutionResult.resultsUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(executionId, resultsUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageExecutionResult {\n");
    
    sb.append("    executionId: ").append(toIndentedString(executionId)).append("\n");
    sb.append("    resultsUri: ").append(toIndentedString(resultsUri)).append("\n");
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

