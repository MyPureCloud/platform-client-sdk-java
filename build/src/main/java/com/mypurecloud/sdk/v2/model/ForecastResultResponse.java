package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.RouteGroupList;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ForecastResultResponse
 */

public class ForecastResultResponse  implements Serializable {
  
  private RouteGroupList result = null;
  private String downloadUrl = null;

  
  /**
   * The forecast result.  If null, fetch the result from the url in downloadUrl
   **/
  public ForecastResultResponse result(RouteGroupList result) {
    this.result = result;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The forecast result.  If null, fetch the result from the url in downloadUrl")
  @JsonProperty("result")
  public RouteGroupList getResult() {
    return result;
  }
  public void setResult(RouteGroupList result) {
    this.result = result;
  }

  
  /**
   * The downloadUrl to fetch the result if it is too large to be sent directly
   **/
  public ForecastResultResponse downloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The downloadUrl to fetch the result if it is too large to be sent directly")
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
    ForecastResultResponse forecastResultResponse = (ForecastResultResponse) o;
    return Objects.equals(this.result, forecastResultResponse.result) &&
        Objects.equals(this.downloadUrl, forecastResultResponse.downloadUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, downloadUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ForecastResultResponse {\n");
    
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

