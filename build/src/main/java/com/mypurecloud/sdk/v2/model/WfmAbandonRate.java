package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Service goal abandon rate configuration
 */
@ApiModel(description = "Service goal abandon rate configuration")

public class WfmAbandonRate  implements Serializable {
  
  private Boolean include = null;
  private Integer percent = null;

  
  /**
   * Whether to include abandon rate in the associated configuration
   **/
  public WfmAbandonRate include(Boolean include) {
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
  public WfmAbandonRate percent(Integer percent) {
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
    WfmAbandonRate wfmAbandonRate = (WfmAbandonRate) o;
    return Objects.equals(this.include, wfmAbandonRate.include) &&
        Objects.equals(this.percent, wfmAbandonRate.percent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(include, percent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmAbandonRate {\n");
    
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

