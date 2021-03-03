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
import com.mypurecloud.sdk.v2.model.MaxLength;
import com.mypurecloud.sdk.v2.model.MinLength;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ValidationLimits
 */

public class ValidationLimits  implements Serializable {
  
  private MinLength minLength = null;
  private MaxLength maxLength = null;
  private MinLength minItems = null;
  private MaxLength maxItems = null;
  private MinLength minimum = null;
  private MaxLength maximum = null;

  
  /**
   **/
  public ValidationLimits minLength(MinLength minLength) {
    this.minLength = minLength;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("minLength")
  public MinLength getMinLength() {
    return minLength;
  }
  public void setMinLength(MinLength minLength) {
    this.minLength = minLength;
  }

  
  /**
   **/
  public ValidationLimits maxLength(MaxLength maxLength) {
    this.maxLength = maxLength;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("maxLength")
  public MaxLength getMaxLength() {
    return maxLength;
  }
  public void setMaxLength(MaxLength maxLength) {
    this.maxLength = maxLength;
  }

  
  /**
   **/
  public ValidationLimits minItems(MinLength minItems) {
    this.minItems = minItems;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("minItems")
  public MinLength getMinItems() {
    return minItems;
  }
  public void setMinItems(MinLength minItems) {
    this.minItems = minItems;
  }

  
  /**
   **/
  public ValidationLimits maxItems(MaxLength maxItems) {
    this.maxItems = maxItems;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("maxItems")
  public MaxLength getMaxItems() {
    return maxItems;
  }
  public void setMaxItems(MaxLength maxItems) {
    this.maxItems = maxItems;
  }

  
  /**
   **/
  public ValidationLimits minimum(MinLength minimum) {
    this.minimum = minimum;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("minimum")
  public MinLength getMinimum() {
    return minimum;
  }
  public void setMinimum(MinLength minimum) {
    this.minimum = minimum;
  }

  
  /**
   **/
  public ValidationLimits maximum(MaxLength maximum) {
    this.maximum = maximum;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("maximum")
  public MaxLength getMaximum() {
    return maximum;
  }
  public void setMaximum(MaxLength maximum) {
    this.maximum = maximum;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidationLimits validationLimits = (ValidationLimits) o;
    return Objects.equals(this.minLength, validationLimits.minLength) &&
        Objects.equals(this.maxLength, validationLimits.maxLength) &&
        Objects.equals(this.minItems, validationLimits.minItems) &&
        Objects.equals(this.maxItems, validationLimits.maxItems) &&
        Objects.equals(this.minimum, validationLimits.minimum) &&
        Objects.equals(this.maximum, validationLimits.maximum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minLength, maxLength, minItems, maxItems, minimum, maximum);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidationLimits {\n");
    
    sb.append("    minLength: ").append(toIndentedString(minLength)).append("\n");
    sb.append("    maxLength: ").append(toIndentedString(maxLength)).append("\n");
    sb.append("    minItems: ").append(toIndentedString(minItems)).append("\n");
    sb.append("    maxItems: ").append(toIndentedString(maxItems)).append("\n");
    sb.append("    minimum: ").append(toIndentedString(minimum)).append("\n");
    sb.append("    maximum: ").append(toIndentedString(maximum)).append("\n");
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

