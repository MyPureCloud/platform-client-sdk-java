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
import com.mypurecloud.sdk.v2.model.BatchDownloadRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * BatchDownloadJobSubmission
 */

public class BatchDownloadJobSubmission  implements Serializable {
  
  private List<BatchDownloadRequest> batchDownloadRequestList = new ArrayList<BatchDownloadRequest>();

  
  /**
   * List of up to 100 items requested
   **/
  public BatchDownloadJobSubmission batchDownloadRequestList(List<BatchDownloadRequest> batchDownloadRequestList) {
    this.batchDownloadRequestList = batchDownloadRequestList;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "List of up to 100 items requested")
  @JsonProperty("batchDownloadRequestList")
  public List<BatchDownloadRequest> getBatchDownloadRequestList() {
    return batchDownloadRequestList;
  }
  public void setBatchDownloadRequestList(List<BatchDownloadRequest> batchDownloadRequestList) {
    this.batchDownloadRequestList = batchDownloadRequestList;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchDownloadJobSubmission batchDownloadJobSubmission = (BatchDownloadJobSubmission) o;
    return Objects.equals(this.batchDownloadRequestList, batchDownloadJobSubmission.batchDownloadRequestList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batchDownloadRequestList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchDownloadJobSubmission {\n");
    
    sb.append("    batchDownloadRequestList: ").append(toIndentedString(batchDownloadRequestList)).append("\n");
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

