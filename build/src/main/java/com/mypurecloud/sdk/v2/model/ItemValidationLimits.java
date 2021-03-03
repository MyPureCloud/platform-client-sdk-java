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
 * ItemValidationLimits
 */

public class ItemValidationLimits  implements Serializable {
  
  private MinLength minLength = null;
  private MaxLength maxLength = null;

  
  /**
   * A structure denoting the system-imposed minimum string length (for text-based core types) or numeric values (for number-based) core types.  For example, the validationLimits for a text-based core type specify the min/max values for a minimum string length (minLength) constraint supplied by a schemaauthor on a text field.  Similarly, the maxLength's min/max specifies maximum string length constraint supplied by a schema author for the same field.
   **/
  public ItemValidationLimits minLength(MinLength minLength) {
    this.minLength = minLength;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A structure denoting the system-imposed minimum string length (for text-based core types) or numeric values (for number-based) core types.  For example, the validationLimits for a text-based core type specify the min/max values for a minimum string length (minLength) constraint supplied by a schemaauthor on a text field.  Similarly, the maxLength's min/max specifies maximum string length constraint supplied by a schema author for the same field.")
  @JsonProperty("minLength")
  public MinLength getMinLength() {
    return minLength;
  }
  public void setMinLength(MinLength minLength) {
    this.minLength = minLength;
  }

  
  /**
   * A structure denoting the system-imposed minimum and maximum string length (for text-based core types) or numeric values (for number-based) core types.  For example, the validationLimits for a text-based core type specify the min/max values for a minimum string length (minLength) constraint supplied by a schemaauthor on a text field.  Similarly, the maxLength's min/max specifies maximum string length constraint supplied by a schema author for the same field.
   **/
  public ItemValidationLimits maxLength(MaxLength maxLength) {
    this.maxLength = maxLength;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A structure denoting the system-imposed minimum and maximum string length (for text-based core types) or numeric values (for number-based) core types.  For example, the validationLimits for a text-based core type specify the min/max values for a minimum string length (minLength) constraint supplied by a schemaauthor on a text field.  Similarly, the maxLength's min/max specifies maximum string length constraint supplied by a schema author for the same field.")
  @JsonProperty("maxLength")
  public MaxLength getMaxLength() {
    return maxLength;
  }
  public void setMaxLength(MaxLength maxLength) {
    this.maxLength = maxLength;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemValidationLimits itemValidationLimits = (ItemValidationLimits) o;
    return Objects.equals(this.minLength, itemValidationLimits.minLength) &&
        Objects.equals(this.maxLength, itemValidationLimits.maxLength);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minLength, maxLength);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemValidationLimits {\n");
    
    sb.append("    minLength: ").append(toIndentedString(minLength)).append("\n");
    sb.append("    maxLength: ").append(toIndentedString(maxLength)).append("\n");
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

