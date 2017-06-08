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
 * IntradayMetric
 */

public class IntradayMetric  implements Serializable {
  

  /**
   * The metric category
   */
  public enum CategoryEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    FORECASTDATA("ForecastData"),
    SCHEDULEDATA("ScheduleData"),
    HISTORICALQUEUEDATA("HistoricalQueueData"),
    HISTORICALAGENTDATA("HistoricalAgentData"),
    PERFORMANCEPREDICTIONQUEUEDATA("PerformancePredictionQueueData"),
    PERFORMANCEPREDICTIONAGENTDATA("PerformancePredictionAgentData");

    private String value;

    CategoryEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static CategoryEnum fromString(String key) {
      if (key == null) return null;

      for (CategoryEnum value : CategoryEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return CategoryEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private CategoryEnum category = null;
  private String version = null;

  
  /**
   * The metric category
   **/
  public IntradayMetric category(CategoryEnum category) {
    this.category = category;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The metric category")
  @JsonProperty("category")
  public CategoryEnum getCategory() {
    return category;
  }
  public void setCategory(CategoryEnum category) {
    this.category = category;
  }

  
  /**
   * The current version id for this metric category
   **/
  public IntradayMetric version(String version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The current version id for this metric category")
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }
  public void setVersion(String version) {
    this.version = version;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntradayMetric intradayMetric = (IntradayMetric) o;
    return Objects.equals(this.category, intradayMetric.category) &&
        Objects.equals(this.version, intradayMetric.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntradayMetric {\n");
    
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

