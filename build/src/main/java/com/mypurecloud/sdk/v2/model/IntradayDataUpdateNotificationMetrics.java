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
 * IntradayDataUpdateNotificationMetrics
 */

public class IntradayDataUpdateNotificationMetrics  implements Serializable {
  

  /**
   * Gets or Sets category
   */
  public enum CategoryEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    HISTORICAL_QUEUE_DATA("HISTORICAL_QUEUE_DATA"),
    HISTORICAL_AGENT_DATA("HISTORICAL_AGENT_DATA"),
    FORECAST_DATA("FORECAST_DATA"),
    SCHEDULE_DATA("SCHEDULE_DATA"),
    PERFORMANCE_PREDICTION_AGENT_DATA("PERFORMANCE_PREDICTION_AGENT_DATA"),
    PERFORMANCE_PREDICTION_QUEUE_DATA("PERFORMANCE_PREDICTION_QUEUE_DATA");

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
   **/
  public IntradayDataUpdateNotificationMetrics category(CategoryEnum category) {
    this.category = category;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("category")
  public CategoryEnum getCategory() {
    return category;
  }
  public void setCategory(CategoryEnum category) {
    this.category = category;
  }


  /**
   **/
  public IntradayDataUpdateNotificationMetrics version(String version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
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
    IntradayDataUpdateNotificationMetrics intradayDataUpdateNotificationMetrics = (IntradayDataUpdateNotificationMetrics) o;
    return Objects.equals(this.category, intradayDataUpdateNotificationMetrics.category) &&
        Objects.equals(this.version, intradayDataUpdateNotificationMetrics.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntradayDataUpdateNotificationMetrics {\n");
    
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

