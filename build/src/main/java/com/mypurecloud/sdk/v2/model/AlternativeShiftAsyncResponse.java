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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.AlternativeShiftJobReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * AlternativeShiftAsyncResponse
 */

public class AlternativeShiftAsyncResponse  implements Serializable {
  
  private AlternativeShiftJobReference job = null;

  
  /**
   * The job related to the async request
   **/
  public AlternativeShiftAsyncResponse job(AlternativeShiftJobReference job) {
    this.job = job;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The job related to the async request")
  @JsonProperty("job")
  public AlternativeShiftJobReference getJob() {
    return job;
  }
  public void setJob(AlternativeShiftJobReference job) {
    this.job = job;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlternativeShiftAsyncResponse alternativeShiftAsyncResponse = (AlternativeShiftAsyncResponse) o;

    return Objects.equals(this.job, alternativeShiftAsyncResponse.job);
  }

  @Override
  public int hashCode() {
    return Objects.hash(job);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlternativeShiftAsyncResponse {\n");
    
    sb.append("    job: ").append(toIndentedString(job)).append("\n");
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

