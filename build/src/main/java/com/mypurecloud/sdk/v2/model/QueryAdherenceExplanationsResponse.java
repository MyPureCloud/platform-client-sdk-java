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
import com.mypurecloud.sdk.v2.model.AdherenceExplanationJobReference;
import com.mypurecloud.sdk.v2.model.AdherenceExplanationListing;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * QueryAdherenceExplanationsResponse
 */

public class QueryAdherenceExplanationsResponse  implements Serializable {
  
  private AdherenceExplanationJobReference job = null;
  private AdherenceExplanationListing result = null;
  private String downloadUrl = null;

  public QueryAdherenceExplanationsResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The asynchronous job handling the query
   **/
  public QueryAdherenceExplanationsResponse job(AdherenceExplanationJobReference job) {
    this.job = job;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The asynchronous job handling the query")
  @JsonProperty("job")
  public AdherenceExplanationJobReference getJob() {
    return job;
  }
  public void setJob(AdherenceExplanationJobReference job) {
    this.job = job;
  }


  /**
   * The result of the query. May come via notification
   **/
  public QueryAdherenceExplanationsResponse result(AdherenceExplanationListing result) {
    this.result = result;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The result of the query. May come via notification")
  @JsonProperty("result")
  public AdherenceExplanationListing getResult() {
    return result;
  }
  public void setResult(AdherenceExplanationListing result) {
    this.result = result;
  }


  /**
   * The URL from which to download the result. May come via notification
   **/
  public QueryAdherenceExplanationsResponse downloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The URL from which to download the result. May come via notification")
  @JsonProperty("downloadUrl")
  public String getDownloadUrl() {
    return downloadUrl;
  }
  public void setDownloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryAdherenceExplanationsResponse queryAdherenceExplanationsResponse = (QueryAdherenceExplanationsResponse) o;

    return Objects.equals(this.job, queryAdherenceExplanationsResponse.job) &&
            Objects.equals(this.result, queryAdherenceExplanationsResponse.result) &&
            Objects.equals(this.downloadUrl, queryAdherenceExplanationsResponse.downloadUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(job, result, downloadUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryAdherenceExplanationsResponse {\n");
    
    sb.append("    job: ").append(toIndentedString(job)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
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

