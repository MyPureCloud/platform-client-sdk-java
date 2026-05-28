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
import com.mypurecloud.sdk.v2.model.QueryOpportunityEnrollmentsResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * QueryOpportunityEnrollmentsResponse
 */

public class QueryOpportunityEnrollmentsResponse  implements Serializable {
  
  private QueryOpportunityEnrollmentsResult result = null;
  private String downloadUrl = null;

  public QueryOpportunityEnrollmentsResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public QueryOpportunityEnrollmentsResponse(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The query result. Null if downloadUrl is populated
   **/
  public QueryOpportunityEnrollmentsResponse result(QueryOpportunityEnrollmentsResult result) {
    this.result = result;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The query result. Null if downloadUrl is populated")
  @JsonProperty("result")
  public QueryOpportunityEnrollmentsResult getResult() {
    return result;
  }
  public void setResult(QueryOpportunityEnrollmentsResult result) {
    this.result = result;
  }


  /**
   * The URL used to retrieve large datasets. If present, the response conforms to the schema for the result field
   **/
  public QueryOpportunityEnrollmentsResponse downloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The URL used to retrieve large datasets. If present, the response conforms to the schema for the result field")
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
    QueryOpportunityEnrollmentsResponse queryOpportunityEnrollmentsResponse = (QueryOpportunityEnrollmentsResponse) o;

    return Objects.equals(this.result, queryOpportunityEnrollmentsResponse.result) &&
            Objects.equals(this.downloadUrl, queryOpportunityEnrollmentsResponse.downloadUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, downloadUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryOpportunityEnrollmentsResponse {\n");
    
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

