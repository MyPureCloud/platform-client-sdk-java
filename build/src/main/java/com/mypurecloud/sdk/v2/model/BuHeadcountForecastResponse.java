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
import com.mypurecloud.sdk.v2.model.BuHeadcountForecast;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * BuHeadcountForecastResponse
 */

public class BuHeadcountForecastResponse  implements Serializable {
  
  private BuHeadcountForecast result = null;
  private String downloadUrl = null;

  
  /**
   * The headcount forecast, null when downloadUrl is provided
   **/
  public BuHeadcountForecastResponse result(BuHeadcountForecast result) {
    this.result = result;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The headcount forecast, null when downloadUrl is provided")
  @JsonProperty("result")
  public BuHeadcountForecast getResult() {
    return result;
  }
  public void setResult(BuHeadcountForecast result) {
    this.result = result;
  }

  
  /**
   * Download URL.  Null unless the response is too large to pass directly through the api
   **/
  public BuHeadcountForecastResponse downloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Download URL.  Null unless the response is too large to pass directly through the api")
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
    BuHeadcountForecastResponse buHeadcountForecastResponse = (BuHeadcountForecastResponse) o;
    return Objects.equals(this.result, buHeadcountForecastResponse.result) &&
        Objects.equals(this.downloadUrl, buHeadcountForecastResponse.downloadUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, downloadUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuHeadcountForecastResponse {\n");
    
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

