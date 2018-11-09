package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * GenerateWeekScheduleResponse
 */

public class GenerateWeekScheduleResponse  implements Serializable {
  

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
  private String downloadUrl = null;

  
  /**
   * The status of the request
   **/
  public GenerateWeekScheduleResponse status(StatusEnum status) {
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
  public GenerateWeekScheduleResponse operationId(String operationId) {
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

  
  /**
   * The url to fetch the result for large responses. The value will be null if result contains the data
   **/
  public GenerateWeekScheduleResponse downloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The url to fetch the result for large responses. The value will be null if result contains the data")
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
    GenerateWeekScheduleResponse generateWeekScheduleResponse = (GenerateWeekScheduleResponse) o;
    return Objects.equals(this.status, generateWeekScheduleResponse.status) &&
        Objects.equals(this.operationId, generateWeekScheduleResponse.operationId) &&
        Objects.equals(this.downloadUrl, generateWeekScheduleResponse.downloadUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, operationId, downloadUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenerateWeekScheduleResponse {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    operationId: ").append(toIndentedString(operationId)).append("\n");
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

