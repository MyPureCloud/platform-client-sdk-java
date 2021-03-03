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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * BuShortTermForecastingSettings
 */

public class BuShortTermForecastingSettings  implements Serializable {
  
  private Integer defaultHistoryWeeks = null;

  
  /**
   * The number of historical weeks to consider when creating a forecast. This setting is only used for legacy weighted average forecasts
   **/
  public BuShortTermForecastingSettings defaultHistoryWeeks(Integer defaultHistoryWeeks) {
    this.defaultHistoryWeeks = defaultHistoryWeeks;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of historical weeks to consider when creating a forecast. This setting is only used for legacy weighted average forecasts")
  @JsonProperty("defaultHistoryWeeks")
  public Integer getDefaultHistoryWeeks() {
    return defaultHistoryWeeks;
  }
  public void setDefaultHistoryWeeks(Integer defaultHistoryWeeks) {
    this.defaultHistoryWeeks = defaultHistoryWeeks;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuShortTermForecastingSettings buShortTermForecastingSettings = (BuShortTermForecastingSettings) o;
    return Objects.equals(this.defaultHistoryWeeks, buShortTermForecastingSettings.defaultHistoryWeeks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultHistoryWeeks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuShortTermForecastingSettings {\n");
    
    sb.append("    defaultHistoryWeeks: ").append(toIndentedString(defaultHistoryWeeks)).append("\n");
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

