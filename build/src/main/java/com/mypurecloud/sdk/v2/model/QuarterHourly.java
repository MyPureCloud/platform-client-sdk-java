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
import com.mypurecloud.sdk.v2.model.Timeseries;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * QuarterHourly
 */

public class QuarterHourly  implements Serializable {
  
  private List<String> downloadUrls = new ArrayList<String>();
  private List<Timeseries> downloadResult = new ArrayList<Timeseries>();

  
  /**
   * List of download URLs to fetch the result of quarter hour time series. This field is populated only if session state is Complete
   **/
  public QuarterHourly downloadUrls(List<String> downloadUrls) {
    this.downloadUrls = downloadUrls;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of download URLs to fetch the result of quarter hour time series. This field is populated only if session state is Complete")
  @JsonProperty("downloadUrls")
  public List<String> getDownloadUrls() {
    return downloadUrls;
  }
  public void setDownloadUrls(List<String> downloadUrls) {
    this.downloadUrls = downloadUrls;
  }


  /**
   * Result will always come via downloadUrls; however the schema is included for documentation
   **/
  public QuarterHourly downloadResult(List<Timeseries> downloadResult) {
    this.downloadResult = downloadResult;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Result will always come via downloadUrls; however the schema is included for documentation")
  @JsonProperty("downloadResult")
  public List<Timeseries> getDownloadResult() {
    return downloadResult;
  }
  public void setDownloadResult(List<Timeseries> downloadResult) {
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
    QuarterHourly quarterHourly = (QuarterHourly) o;

    return Objects.equals(this.downloadUrls, quarterHourly.downloadUrls) &&
            Objects.equals(this.downloadResult, quarterHourly.downloadResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(downloadUrls, downloadResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuarterHourly {\n");
    
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

