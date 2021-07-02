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
import com.mypurecloud.sdk.v2.model.LongTermForecastResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * LongTermForecastResultResponse
 */

public class LongTermForecastResultResponse  implements Serializable {
  
  private LongTermForecastResult result = null;
  private String downloadUrl = null;

  
  /**
   * The result of the operation.  Populated whenever the result is small enough to pass through the api directly
   **/
  public LongTermForecastResultResponse result(LongTermForecastResult result) {
    this.result = result;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The result of the operation.  Populated whenever the result is small enough to pass through the api directly")
  @JsonProperty("result")
  public LongTermForecastResult getResult() {
    return result;
  }
  public void setResult(LongTermForecastResult result) {
    this.result = result;
  }

  
  /**
   * The download url to fetch the result.  Only populated if the result is too large to pass through the api directly
   **/
  public LongTermForecastResultResponse downloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The download url to fetch the result.  Only populated if the result is too large to pass through the api directly")
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
    LongTermForecastResultResponse longTermForecastResultResponse = (LongTermForecastResultResponse) o;
    return Objects.equals(this.result, longTermForecastResultResponse.result) &&
        Objects.equals(this.downloadUrl, longTermForecastResultResponse.downloadUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, downloadUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LongTermForecastResultResponse {\n");
    
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

