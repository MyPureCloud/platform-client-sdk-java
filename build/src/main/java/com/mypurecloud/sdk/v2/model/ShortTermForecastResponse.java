package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.ShortTermForecast;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ShortTermForecastResponse
 */

public class ShortTermForecastResponse  implements Serializable {
  

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
  private ShortTermForecast result = null;
  private String operationId = null;

  
  /**
   * The status of the request
   **/
  public ShortTermForecastResponse status(StatusEnum status) {
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
   * The resulting forecast.  May be sent asynchronously via notification depending on the complexity of the forecast
   **/
  public ShortTermForecastResponse result(ShortTermForecast result) {
    this.result = result;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The resulting forecast.  May be sent asynchronously via notification depending on the complexity of the forecast")
  @JsonProperty("result")
  public ShortTermForecast getResult() {
    return result;
  }
  public void setResult(ShortTermForecast result) {
    this.result = result;
  }

  
  /**
   * The operation id to watch for on the notification topic
   **/
  public ShortTermForecastResponse operationId(String operationId) {
    this.operationId = operationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The operation id to watch for on the notification topic")
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
    ShortTermForecastResponse shortTermForecastResponse = (ShortTermForecastResponse) o;
    return Objects.equals(this.status, shortTermForecastResponse.status) &&
        Objects.equals(this.result, shortTermForecastResponse.result) &&
        Objects.equals(this.operationId, shortTermForecastResponse.operationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, result, operationId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShortTermForecastResponse {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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

