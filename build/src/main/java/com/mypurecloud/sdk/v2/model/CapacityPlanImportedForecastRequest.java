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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * CapacityPlanImportedForecastRequest
 */

public class CapacityPlanImportedForecastRequest  implements Serializable {
  
  private String hourlyForecastUploadKey = null;
  private String dailyForecastUploadKey = null;

  public CapacityPlanImportedForecastRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public CapacityPlanImportedForecastRequest(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The uploadKey returned in the hourlyForecast field of the capacity plan forecast upload URL response
   **/
  public CapacityPlanImportedForecastRequest hourlyForecastUploadKey(String hourlyForecastUploadKey) {
    this.hourlyForecastUploadKey = hourlyForecastUploadKey;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The uploadKey returned in the hourlyForecast field of the capacity plan forecast upload URL response")
  @JsonProperty("hourlyForecastUploadKey")
  public String getHourlyForecastUploadKey() {
    return hourlyForecastUploadKey;
  }
  public void setHourlyForecastUploadKey(String hourlyForecastUploadKey) {
    this.hourlyForecastUploadKey = hourlyForecastUploadKey;
  }


  /**
   * The uploadKey returned in the dailyForecast field of the capacity plan forecast upload URL response
   **/
  public CapacityPlanImportedForecastRequest dailyForecastUploadKey(String dailyForecastUploadKey) {
    this.dailyForecastUploadKey = dailyForecastUploadKey;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The uploadKey returned in the dailyForecast field of the capacity plan forecast upload URL response")
  @JsonProperty("dailyForecastUploadKey")
  public String getDailyForecastUploadKey() {
    return dailyForecastUploadKey;
  }
  public void setDailyForecastUploadKey(String dailyForecastUploadKey) {
    this.dailyForecastUploadKey = dailyForecastUploadKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CapacityPlanImportedForecastRequest capacityPlanImportedForecastRequest = (CapacityPlanImportedForecastRequest) o;

    return Objects.equals(this.hourlyForecastUploadKey, capacityPlanImportedForecastRequest.hourlyForecastUploadKey) &&
            Objects.equals(this.dailyForecastUploadKey, capacityPlanImportedForecastRequest.dailyForecastUploadKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hourlyForecastUploadKey, dailyForecastUploadKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CapacityPlanImportedForecastRequest {\n");
    
    sb.append("    hourlyForecastUploadKey: ").append(toIndentedString(hourlyForecastUploadKey)).append("\n");
    sb.append("    dailyForecastUploadKey: ").append(toIndentedString(dailyForecastUploadKey)).append("\n");
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

