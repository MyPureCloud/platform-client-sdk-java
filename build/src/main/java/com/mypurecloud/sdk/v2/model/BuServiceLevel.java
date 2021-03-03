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
 * Service goal service level configuration
 */
@ApiModel(description = "Service goal service level configuration")

public class BuServiceLevel  implements Serializable {
  
  private Boolean include = null;
  private Integer percent = null;
  private Integer seconds = null;

  
  /**
   * Whether to include service level targets in the associated configuration
   **/
  public BuServiceLevel include(Boolean include) {
    this.include = include;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Whether to include service level targets in the associated configuration")
  @JsonProperty("include")
  public Boolean getInclude() {
    return include;
  }
  public void setInclude(Boolean include) {
    this.include = include;
  }

  
  /**
   * Service level target percent answered. Required if include == true
   **/
  public BuServiceLevel percent(Integer percent) {
    this.percent = percent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Service level target percent answered. Required if include == true")
  @JsonProperty("percent")
  public Integer getPercent() {
    return percent;
  }
  public void setPercent(Integer percent) {
    this.percent = percent;
  }

  
  /**
   * Service level target answer time. Required if include == true
   **/
  public BuServiceLevel seconds(Integer seconds) {
    this.seconds = seconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Service level target answer time. Required if include == true")
  @JsonProperty("seconds")
  public Integer getSeconds() {
    return seconds;
  }
  public void setSeconds(Integer seconds) {
    this.seconds = seconds;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuServiceLevel buServiceLevel = (BuServiceLevel) o;
    return Objects.equals(this.include, buServiceLevel.include) &&
        Objects.equals(this.percent, buServiceLevel.percent) &&
        Objects.equals(this.seconds, buServiceLevel.seconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(include, percent, seconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuServiceLevel {\n");
    
    sb.append("    include: ").append(toIndentedString(include)).append("\n");
    sb.append("    percent: ").append(toIndentedString(percent)).append("\n");
    sb.append("    seconds: ").append(toIndentedString(seconds)).append("\n");
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

