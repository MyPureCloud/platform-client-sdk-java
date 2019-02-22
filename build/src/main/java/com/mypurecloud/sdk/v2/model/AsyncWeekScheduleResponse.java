package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.WeekSchedule;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Response for query for week schedule for a given week in management unit
 */
@ApiModel(description = "Response for query for week schedule for a given week in management unit")

public class AsyncWeekScheduleResponse  implements Serializable {
  
  private WeekSchedule result = null;
  private String downloadUrl = null;

  /**
   * The status of the request
   */
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    PROCESSING("Processing"),
    COMPLETE("Complete"),
    CANCELED("Canceled"),
    ERROR("Error");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StatusEnum fromString(String key) {
      if (key == null) return null;

      for (StatusEnum value : StatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StatusEnum status = null;
  private String operationId = null;

  
  /**
   * Week schedule result. The value will be null if the data is sent through notification or if response is large.
   **/
  public AsyncWeekScheduleResponse result(WeekSchedule result) {
    this.result = result;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Week schedule result. The value will be null if the data is sent through notification or if response is large.")
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
  public AsyncWeekScheduleResponse downloadUrl(String downloadUrl) {
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

  
  /**
   * The status of the request
   **/
  public AsyncWeekScheduleResponse status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The status of the request")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   * The operation id to watch for on the notification topic if status == Processing
   **/
  public AsyncWeekScheduleResponse operationId(String operationId) {
    this.operationId = operationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The operation id to watch for on the notification topic if status == Processing")
  @JsonProperty("operationId")
  public String getOperationId() {
    return operationId;
  }
  public void setOperationId(String operationId) {
    this.operationId = operationId;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AsyncWeekScheduleResponse asyncWeekScheduleResponse = (AsyncWeekScheduleResponse) o;
    return Objects.equals(this.result, asyncWeekScheduleResponse.result) &&
        Objects.equals(this.downloadUrl, asyncWeekScheduleResponse.downloadUrl) &&
        Objects.equals(this.status, asyncWeekScheduleResponse.status) &&
        Objects.equals(this.operationId, asyncWeekScheduleResponse.operationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, downloadUrl, status, operationId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AsyncWeekScheduleResponse {\n");
    
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    operationId: ").append(toIndentedString(operationId)).append("\n");
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

