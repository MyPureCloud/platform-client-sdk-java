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
import com.mypurecloud.sdk.v2.model.AlternativeShiftJobResponse;
import com.mypurecloud.sdk.v2.model.AlternativeShiftTradeListing;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ListAlternativeShiftTradesResponse
 */

public class ListAlternativeShiftTradesResponse  implements Serializable {
  
  private AlternativeShiftJobResponse job = null;
  private AlternativeShiftTradeListing result = null;

  
  /**
   * The asynchronous job handling the request. Null if result returns synchronously
   **/
  public ListAlternativeShiftTradesResponse job(AlternativeShiftJobResponse job) {
    this.job = job;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The asynchronous job handling the request. Null if result returns synchronously")
  @JsonProperty("job")
  public AlternativeShiftJobResponse getJob() {
    return job;
  }
  public void setJob(AlternativeShiftJobResponse job) {
    this.job = job;
  }


  /**
   * The result of the request. May come via notification. Null if job is populated
   **/
  public ListAlternativeShiftTradesResponse result(AlternativeShiftTradeListing result) {
    this.result = result;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The result of the request. May come via notification. Null if job is populated")
  @JsonProperty("result")
  public AlternativeShiftTradeListing getResult() {
    return result;
  }
  public void setResult(AlternativeShiftTradeListing result) {
    this.result = result;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListAlternativeShiftTradesResponse listAlternativeShiftTradesResponse = (ListAlternativeShiftTradesResponse) o;

    return Objects.equals(this.job, listAlternativeShiftTradesResponse.job) &&
            Objects.equals(this.result, listAlternativeShiftTradesResponse.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(job, result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListAlternativeShiftTradesResponse {\n");
    
    sb.append("    job: ").append(toIndentedString(job)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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

