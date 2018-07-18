package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.HeadcountIntervalResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Headcount interval information for schedule
 */
@ApiModel(description = "Headcount interval information for schedule")

public class HeadcountForecastResponse  implements Serializable {
  
  private List<HeadcountIntervalResponse> required = new ArrayList<HeadcountIntervalResponse>();
  private List<HeadcountIntervalResponse> requiredWithoutShrinkage = new ArrayList<HeadcountIntervalResponse>();

  
  /**
   * Headcount information with shrinkage
   **/
  public HeadcountForecastResponse required(List<HeadcountIntervalResponse> required) {
    this.required = required;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Headcount information with shrinkage")
  @JsonProperty("required")
  public List<HeadcountIntervalResponse> getRequired() {
    return required;
  }
  public void setRequired(List<HeadcountIntervalResponse> required) {
    this.required = required;
  }

  
  /**
   * Headcount information without shrinkage
   **/
  public HeadcountForecastResponse requiredWithoutShrinkage(List<HeadcountIntervalResponse> requiredWithoutShrinkage) {
    this.requiredWithoutShrinkage = requiredWithoutShrinkage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Headcount information without shrinkage")
  @JsonProperty("requiredWithoutShrinkage")
  public List<HeadcountIntervalResponse> getRequiredWithoutShrinkage() {
    return requiredWithoutShrinkage;
  }
  public void setRequiredWithoutShrinkage(List<HeadcountIntervalResponse> requiredWithoutShrinkage) {
    this.requiredWithoutShrinkage = requiredWithoutShrinkage;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HeadcountForecastResponse headcountForecastResponse = (HeadcountForecastResponse) o;
    return Objects.equals(this.required, headcountForecastResponse.required) &&
        Objects.equals(this.requiredWithoutShrinkage, headcountForecastResponse.requiredWithoutShrinkage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(required, requiredWithoutShrinkage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HeadcountForecastResponse {\n");
    
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    requiredWithoutShrinkage: ").append(toIndentedString(requiredWithoutShrinkage)).append("\n");
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

