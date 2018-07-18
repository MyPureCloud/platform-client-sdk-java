package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Average speed of answer settings
 */
@ApiModel(description = "Average speed of answer settings")

public class WfmAverageSpeedOfAnswer  implements Serializable {
  
  private Boolean include = null;
  private Integer seconds = null;

  
  /**
   * Whether to include average speed of answer (ASA) in this service goal group's configuration
   **/
  public WfmAverageSpeedOfAnswer include(Boolean include) {
    this.include = include;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Whether to include average speed of answer (ASA) in this service goal group's configuration")
  @JsonProperty("include")
  public Boolean getInclude() {
    return include;
  }
  public void setInclude(Boolean include) {
    this.include = include;
  }

  
  /**
   * The target average speed of answer (ASA) in seconds. Required if include == true
   **/
  public WfmAverageSpeedOfAnswer seconds(Integer seconds) {
    this.seconds = seconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The target average speed of answer (ASA) in seconds. Required if include == true")
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
    WfmAverageSpeedOfAnswer wfmAverageSpeedOfAnswer = (WfmAverageSpeedOfAnswer) o;
    return Objects.equals(this.include, wfmAverageSpeedOfAnswer.include) &&
        Objects.equals(this.seconds, wfmAverageSpeedOfAnswer.seconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(include, seconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmAverageSpeedOfAnswer {\n");
    
    sb.append("    include: ").append(toIndentedString(include)).append("\n");
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

