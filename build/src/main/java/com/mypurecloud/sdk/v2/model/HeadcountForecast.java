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
import com.mypurecloud.sdk.v2.model.HeadcountInterval;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Headcount interval information for schedule
 */
@ApiModel(description = "Headcount interval information for schedule")

public class HeadcountForecast  implements Serializable {
  
  private List<HeadcountInterval> required = new ArrayList<HeadcountInterval>();
  private List<HeadcountInterval> requiredWithoutShrinkage = new ArrayList<HeadcountInterval>();

  
  /**
   * Headcount information with shrinkage
   **/
  public HeadcountForecast required(List<HeadcountInterval> required) {
    this.required = required;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Headcount information with shrinkage")
  @JsonProperty("required")
  public List<HeadcountInterval> getRequired() {
    return required;
  }
  public void setRequired(List<HeadcountInterval> required) {
    this.required = required;
  }

  
  /**
   * Headcount information without shrinkage
   **/
  public HeadcountForecast requiredWithoutShrinkage(List<HeadcountInterval> requiredWithoutShrinkage) {
    this.requiredWithoutShrinkage = requiredWithoutShrinkage;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Headcount information without shrinkage")
  @JsonProperty("requiredWithoutShrinkage")
  public List<HeadcountInterval> getRequiredWithoutShrinkage() {
    return requiredWithoutShrinkage;
  }
  public void setRequiredWithoutShrinkage(List<HeadcountInterval> requiredWithoutShrinkage) {
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
    HeadcountForecast headcountForecast = (HeadcountForecast) o;
    return Objects.equals(this.required, headcountForecast.required) &&
        Objects.equals(this.requiredWithoutShrinkage, headcountForecast.requiredWithoutShrinkage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(required, requiredWithoutShrinkage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HeadcountForecast {\n");
    
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

