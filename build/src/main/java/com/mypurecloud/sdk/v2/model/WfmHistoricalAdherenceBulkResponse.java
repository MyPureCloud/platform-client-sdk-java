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
import com.mypurecloud.sdk.v2.model.WfmHistoricalAdherenceBulkJobReference;
import com.mypurecloud.sdk.v2.model.WfmHistoricalAdherenceBulkResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * WfmHistoricalAdherenceBulkResponse
 */

public class WfmHistoricalAdherenceBulkResponse  implements Serializable {
  
  private WfmHistoricalAdherenceBulkJobReference job = null;
  private List<String> downloadUrls = null;
  private WfmHistoricalAdherenceBulkResult downloadResult = null;

  public WfmHistoricalAdherenceBulkResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      downloadUrls = new ArrayList<String>();
    }
  }

  
  /**
   * A reference to the job that was started by the request
   **/
  public WfmHistoricalAdherenceBulkResponse job(WfmHistoricalAdherenceBulkJobReference job) {
    this.job = job;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A reference to the job that was started by the request")
  @JsonProperty("job")
  public WfmHistoricalAdherenceBulkJobReference getJob() {
    return job;
  }
  public void setJob(WfmHistoricalAdherenceBulkJobReference job) {
    this.job = job;
  }


  /**
   * The uri list to GET the results of the Historical Adherence query. This field is populated only if query state is Complete
   **/
  public WfmHistoricalAdherenceBulkResponse downloadUrls(List<String> downloadUrls) {
    this.downloadUrls = downloadUrls;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The uri list to GET the results of the Historical Adherence query. This field is populated only if query state is Complete")
  @JsonProperty("downloadUrls")
  public List<String> getDownloadUrls() {
    return downloadUrls;
  }
  public void setDownloadUrls(List<String> downloadUrls) {
    this.downloadUrls = downloadUrls;
  }


  /**
   * Results will always come via downloadUrls; however the schema is included for documentation
   **/
  public WfmHistoricalAdherenceBulkResponse downloadResult(WfmHistoricalAdherenceBulkResult downloadResult) {
    this.downloadResult = downloadResult;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Results will always come via downloadUrls; however the schema is included for documentation")
  @JsonProperty("downloadResult")
  public WfmHistoricalAdherenceBulkResult getDownloadResult() {
    return downloadResult;
  }
  public void setDownloadResult(WfmHistoricalAdherenceBulkResult downloadResult) {
    this.downloadResult = downloadResult;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WfmHistoricalAdherenceBulkResponse wfmHistoricalAdherenceBulkResponse = (WfmHistoricalAdherenceBulkResponse) o;

    return Objects.equals(this.job, wfmHistoricalAdherenceBulkResponse.job) &&
            Objects.equals(this.downloadUrls, wfmHistoricalAdherenceBulkResponse.downloadUrls) &&
            Objects.equals(this.downloadResult, wfmHistoricalAdherenceBulkResponse.downloadResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(job, downloadUrls, downloadResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmHistoricalAdherenceBulkResponse {\n");
    
    sb.append("    job: ").append(toIndentedString(job)).append("\n");
    sb.append("    downloadUrls: ").append(toIndentedString(downloadUrls)).append("\n");
    sb.append("    downloadResult: ").append(toIndentedString(downloadResult)).append("\n");
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

