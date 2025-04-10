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
import com.mypurecloud.sdk.v2.model.AlternativeShiftTradeListing;
import com.mypurecloud.sdk.v2.model.BuAlternativeShiftJobResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * BuListAlternativeShiftTradesResponse
 */

public class BuListAlternativeShiftTradesResponse  implements Serializable {
  
  private BuAlternativeShiftJobResponse job = null;
  private AlternativeShiftTradeListing result = null;

  public BuListAlternativeShiftTradesResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The asynchronous job handling the request. Null if result returns synchronously
   **/
  public BuListAlternativeShiftTradesResponse job(BuAlternativeShiftJobResponse job) {
    this.job = job;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The asynchronous job handling the request. Null if result returns synchronously")
  @JsonProperty("job")
  public BuAlternativeShiftJobResponse getJob() {
    return job;
  }
  public void setJob(BuAlternativeShiftJobResponse job) {
    this.job = job;
  }


  /**
   * The result of the request. May come via notification. Null if job is populated
   **/
  public BuListAlternativeShiftTradesResponse result(AlternativeShiftTradeListing result) {
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
    BuListAlternativeShiftTradesResponse buListAlternativeShiftTradesResponse = (BuListAlternativeShiftTradesResponse) o;

    return Objects.equals(this.job, buListAlternativeShiftTradesResponse.job) &&
            Objects.equals(this.result, buListAlternativeShiftTradesResponse.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(job, result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuListAlternativeShiftTradesResponse {\n");
    
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

