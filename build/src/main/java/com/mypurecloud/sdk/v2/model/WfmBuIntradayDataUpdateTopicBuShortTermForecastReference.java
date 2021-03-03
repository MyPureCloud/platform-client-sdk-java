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
 * WfmBuIntradayDataUpdateTopicBuShortTermForecastReference
 */

public class WfmBuIntradayDataUpdateTopicBuShortTermForecastReference  implements Serializable {
  
  private String id = null;
  private String weekDate = null;
  private String description = null;

  
  /**
   **/
  public WfmBuIntradayDataUpdateTopicBuShortTermForecastReference id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   **/
  public WfmBuIntradayDataUpdateTopicBuShortTermForecastReference weekDate(String weekDate) {
    this.weekDate = weekDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("weekDate")
  public String getWeekDate() {
    return weekDate;
  }
  public void setWeekDate(String weekDate) {
    this.weekDate = weekDate;
  }

  
  /**
   **/
  public WfmBuIntradayDataUpdateTopicBuShortTermForecastReference description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WfmBuIntradayDataUpdateTopicBuShortTermForecastReference wfmBuIntradayDataUpdateTopicBuShortTermForecastReference = (WfmBuIntradayDataUpdateTopicBuShortTermForecastReference) o;
    return Objects.equals(this.id, wfmBuIntradayDataUpdateTopicBuShortTermForecastReference.id) &&
        Objects.equals(this.weekDate, wfmBuIntradayDataUpdateTopicBuShortTermForecastReference.weekDate) &&
        Objects.equals(this.description, wfmBuIntradayDataUpdateTopicBuShortTermForecastReference.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, weekDate, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmBuIntradayDataUpdateTopicBuShortTermForecastReference {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    weekDate: ").append(toIndentedString(weekDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

