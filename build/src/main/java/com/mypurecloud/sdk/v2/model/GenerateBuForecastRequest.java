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
 * GenerateBuForecastRequest
 */

public class GenerateBuForecastRequest  implements Serializable {
  
  private String description = null;
  private Integer weekCount = null;
  private Boolean canUseForScheduling = null;

  
  /**
   * The description for the forecast
   **/
  public GenerateBuForecastRequest description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The description for the forecast")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * The number of weeks this forecast covers
   **/
  public GenerateBuForecastRequest weekCount(Integer weekCount) {
    this.weekCount = weekCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of weeks this forecast covers")
  @JsonProperty("weekCount")
  public Integer getWeekCount() {
    return weekCount;
  }
  public void setWeekCount(Integer weekCount) {
    this.weekCount = weekCount;
  }

  
  /**
   * Whether this forecast can be used for scheduling
   **/
  public GenerateBuForecastRequest canUseForScheduling(Boolean canUseForScheduling) {
    this.canUseForScheduling = canUseForScheduling;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether this forecast can be used for scheduling")
  @JsonProperty("canUseForScheduling")
  public Boolean getCanUseForScheduling() {
    return canUseForScheduling;
  }
  public void setCanUseForScheduling(Boolean canUseForScheduling) {
    this.canUseForScheduling = canUseForScheduling;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenerateBuForecastRequest generateBuForecastRequest = (GenerateBuForecastRequest) o;
    return Objects.equals(this.description, generateBuForecastRequest.description) &&
        Objects.equals(this.weekCount, generateBuForecastRequest.weekCount) &&
        Objects.equals(this.canUseForScheduling, generateBuForecastRequest.canUseForScheduling);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, weekCount, canUseForScheduling);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenerateBuForecastRequest {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    weekCount: ").append(toIndentedString(weekCount)).append("\n");
    sb.append("    canUseForScheduling: ").append(toIndentedString(canUseForScheduling)).append("\n");
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

