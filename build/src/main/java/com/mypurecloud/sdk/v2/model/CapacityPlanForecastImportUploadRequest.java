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
import com.mypurecloud.sdk.v2.model.UploadUrlRequestBody;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * CapacityPlanForecastImportUploadRequest
 */

public class CapacityPlanForecastImportUploadRequest  implements Serializable {
  
  private UploadUrlRequestBody hourlyForecast = null;
  private UploadUrlRequestBody dailyForecast = null;

  public CapacityPlanForecastImportUploadRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public CapacityPlanForecastImportUploadRequest(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * Content length request details for the hourly forecast to be imported for the capacity plan
   **/
  public CapacityPlanForecastImportUploadRequest hourlyForecast(UploadUrlRequestBody hourlyForecast) {
    this.hourlyForecast = hourlyForecast;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Content length request details for the hourly forecast to be imported for the capacity plan")
  @JsonProperty("hourlyForecast")
  public UploadUrlRequestBody getHourlyForecast() {
    return hourlyForecast;
  }
  public void setHourlyForecast(UploadUrlRequestBody hourlyForecast) {
    this.hourlyForecast = hourlyForecast;
  }


  /**
   * Content length request details for the daily forecast to be imported for the capacity plan
   **/
  public CapacityPlanForecastImportUploadRequest dailyForecast(UploadUrlRequestBody dailyForecast) {
    this.dailyForecast = dailyForecast;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Content length request details for the daily forecast to be imported for the capacity plan")
  @JsonProperty("dailyForecast")
  public UploadUrlRequestBody getDailyForecast() {
    return dailyForecast;
  }
  public void setDailyForecast(UploadUrlRequestBody dailyForecast) {
    this.dailyForecast = dailyForecast;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CapacityPlanForecastImportUploadRequest capacityPlanForecastImportUploadRequest = (CapacityPlanForecastImportUploadRequest) o;

    return Objects.equals(this.hourlyForecast, capacityPlanForecastImportUploadRequest.hourlyForecast) &&
            Objects.equals(this.dailyForecast, capacityPlanForecastImportUploadRequest.dailyForecast);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hourlyForecast, dailyForecast);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CapacityPlanForecastImportUploadRequest {\n");
    
    sb.append("    hourlyForecast: ").append(toIndentedString(hourlyForecast)).append("\n");
    sb.append("    dailyForecast: ").append(toIndentedString(dailyForecast)).append("\n");
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

