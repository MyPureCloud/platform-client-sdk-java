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
import com.mypurecloud.sdk.v2.model.WfmAgentHistoricalAdherenceJobReference;
import com.mypurecloud.sdk.v2.model.WfmAgentHistoricalAdherenceResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * WfmAgentHistoricalAdherenceResponse
 */

public class WfmAgentHistoricalAdherenceResponse  implements Serializable {
  
  private WfmAgentHistoricalAdherenceJobReference job = null;
  private List<String> downloadUrls = null;
  private WfmAgentHistoricalAdherenceResult result = null;

  public WfmAgentHistoricalAdherenceResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      downloadUrls = new ArrayList<String>();
    }
  }

  
  /**
   * A reference to the job that was started by the request
   **/
  public WfmAgentHistoricalAdherenceResponse job(WfmAgentHistoricalAdherenceJobReference job) {
    this.job = job;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A reference to the job that was started by the request")
  @JsonProperty("job")
  public WfmAgentHistoricalAdherenceJobReference getJob() {
    return job;
  }
  public void setJob(WfmAgentHistoricalAdherenceJobReference job) {
    this.job = job;
  }


  /**
   * The url list to GET the results of the agent adherence query. This field is populated only if query state is Complete
   **/
  public WfmAgentHistoricalAdherenceResponse downloadUrls(List<String> downloadUrls) {
    this.downloadUrls = downloadUrls;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The url list to GET the results of the agent adherence query. This field is populated only if query state is Complete")
  @JsonProperty("downloadUrls")
  public List<String> getDownloadUrls() {
    return downloadUrls;
  }
  public void setDownloadUrls(List<String> downloadUrls) {
    this.downloadUrls = downloadUrls;
  }


  /**
   * Results will come via downloadUrls, however it may come inline if small enough
   **/
  public WfmAgentHistoricalAdherenceResponse result(WfmAgentHistoricalAdherenceResult result) {
    this.result = result;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Results will come via downloadUrls, however it may come inline if small enough")
  @JsonProperty("result")
  public WfmAgentHistoricalAdherenceResult getResult() {
    return result;
  }
  public void setResult(WfmAgentHistoricalAdherenceResult result) {
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
    WfmAgentHistoricalAdherenceResponse wfmAgentHistoricalAdherenceResponse = (WfmAgentHistoricalAdherenceResponse) o;

    return Objects.equals(this.job, wfmAgentHistoricalAdherenceResponse.job) &&
            Objects.equals(this.downloadUrls, wfmAgentHistoricalAdherenceResponse.downloadUrls) &&
            Objects.equals(this.result, wfmAgentHistoricalAdherenceResponse.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(job, downloadUrls, result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmAgentHistoricalAdherenceResponse {\n");
    
    sb.append("    job: ").append(toIndentedString(job)).append("\n");
    sb.append("    downloadUrls: ").append(toIndentedString(downloadUrls)).append("\n");
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

