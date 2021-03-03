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
 * Service goal abandon rate configuration
 */
@ApiModel(description = "Service goal abandon rate configuration")

public class BuAbandonRate  implements Serializable {
  
  private Boolean include = null;
  private Integer percent = null;

  
  /**
   * Whether to include abandon rate in the associated configuration
   **/
  public BuAbandonRate include(Boolean include) {
    this.include = include;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Whether to include abandon rate in the associated configuration")
  @JsonProperty("include")
  public Boolean getInclude() {
    return include;
  }
  public void setInclude(Boolean include) {
    this.include = include;
  }

  
  /**
   * Abandon rate percent goal. Required if include == true
   **/
  public BuAbandonRate percent(Integer percent) {
    this.percent = percent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Abandon rate percent goal. Required if include == true")
  @JsonProperty("percent")
  public Integer getPercent() {
    return percent;
  }
  public void setPercent(Integer percent) {
    this.percent = percent;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuAbandonRate buAbandonRate = (BuAbandonRate) o;
    return Objects.equals(this.include, buAbandonRate.include) &&
        Objects.equals(this.percent, buAbandonRate.percent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(include, percent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuAbandonRate {\n");
    
    sb.append("    include: ").append(toIndentedString(include)).append("\n");
    sb.append("    percent: ").append(toIndentedString(percent)).append("\n");
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

