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
 * Digits
 */

public class Digits  implements Serializable {
  
  private String digits = null;

  
  /**
   * A string representing the digits pressed on phone.
   **/
  public Digits digits(String digits) {
    this.digits = digits;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A string representing the digits pressed on phone.")
  @JsonProperty("digits")
  public String getDigits() {
    return digits;
  }
  public void setDigits(String digits) {
    this.digits = digits;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Digits digits = (Digits) o;
    return Objects.equals(this.digits, digits.digits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(digits);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Digits {\n");
    
    sb.append("    digits: ").append(toIndentedString(digits)).append("\n");
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

