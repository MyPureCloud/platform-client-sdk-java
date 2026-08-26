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
import com.mypurecloud.sdk.v2.model.ContinuousForecastTimeSeries;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Weekly
 */

public class Weekly  implements Serializable {
  
  private String downloadUrl = null;
  private List<ContinuousForecastTimeSeries> downloadResult = null;

  public Weekly() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      downloadResult = new ArrayList<ContinuousForecastTimeSeries>();
    }
  }

  public Weekly(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      downloadResult = new ArrayList<ContinuousForecastTimeSeries>();
    }
  }

  
  /**
   * Download URL to fetch the result of weekly time series. This field is populated only if session state is Complete. The downloaded data contains Newline Delimited JSON (NDJSON): one JSON object per line
   **/
  public Weekly downloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Download URL to fetch the result of weekly time series. This field is populated only if session state is Complete. The downloaded data contains Newline Delimited JSON (NDJSON): one JSON object per line")
  @JsonProperty("downloadUrl")
  public String getDownloadUrl() {
    return downloadUrl;
  }
  public void setDownloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
  }


  /**
   * Result will always come via downloadUrls; however the schema is included for documentation
   **/
  public Weekly downloadResult(List<ContinuousForecastTimeSeries> downloadResult) {
    this.downloadResult = downloadResult;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Result will always come via downloadUrls; however the schema is included for documentation")
  @JsonProperty("downloadResult")
  public List<ContinuousForecastTimeSeries> getDownloadResult() {
    return downloadResult;
  }
  public void setDownloadResult(List<ContinuousForecastTimeSeries> downloadResult) {
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
    Weekly weekly = (Weekly) o;

    return Objects.equals(this.downloadUrl, weekly.downloadUrl) &&
            Objects.equals(this.downloadResult, weekly.downloadResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(downloadUrl, downloadResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Weekly {\n");
    
    sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
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

