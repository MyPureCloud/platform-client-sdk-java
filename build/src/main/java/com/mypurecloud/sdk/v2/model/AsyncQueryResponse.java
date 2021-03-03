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
 * AsyncQueryResponse
 */

public class AsyncQueryResponse  implements Serializable {
  
  private String jobId = null;

  
  /**
   * Unique identifier for the async query execution. Can be used to check the status of the query and retrieve results.
   **/
  public AsyncQueryResponse jobId(String jobId) {
    this.jobId = jobId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique identifier for the async query execution. Can be used to check the status of the query and retrieve results.")
  @JsonProperty("jobId")
  public String getJobId() {
    return jobId;
  }
  public void setJobId(String jobId) {
    this.jobId = jobId;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AsyncQueryResponse asyncQueryResponse = (AsyncQueryResponse) o;
    return Objects.equals(this.jobId, asyncQueryResponse.jobId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AsyncQueryResponse {\n");
    
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
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

