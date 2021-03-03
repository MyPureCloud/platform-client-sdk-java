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
import com.mypurecloud.sdk.v2.model.WeekSchedule;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Response for query for week schedule for a given week in management unit
 */
@ApiModel(description = "Response for query for week schedule for a given week in management unit")

public class WeekScheduleResponse  implements Serializable {
  
  private WeekSchedule result = null;
  private String downloadUrl = null;

  
  /**
   * The result of the request. The value will be null if response is large
   **/
  public WeekScheduleResponse result(WeekSchedule result) {
    this.result = result;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The result of the request. The value will be null if response is large")
  @JsonProperty("result")
  public WeekSchedule getResult() {
    return result;
  }
  public void setResult(WeekSchedule result) {
    this.result = result;
  }

  
  /**
   * The url to fetch the result for large responses. The value is null if result contains the data
   **/
  public WeekScheduleResponse downloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The url to fetch the result for large responses. The value is null if result contains the data")
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
    WeekScheduleResponse weekScheduleResponse = (WeekScheduleResponse) o;
    return Objects.equals(this.result, weekScheduleResponse.result) &&
        Objects.equals(this.downloadUrl, weekScheduleResponse.downloadUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, downloadUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WeekScheduleResponse {\n");
    
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

