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
 * PhoneNumberStatus
 */

public class PhoneNumberStatus  implements Serializable {
  
  private Boolean callable = null;

  
  /**
   * Indicates whether or not a phone number is callable.
   **/
  public PhoneNumberStatus callable(Boolean callable) {
    this.callable = callable;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates whether or not a phone number is callable.")
  @JsonProperty("callable")
  public Boolean getCallable() {
    return callable;
  }
  public void setCallable(Boolean callable) {
    this.callable = callable;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhoneNumberStatus phoneNumberStatus = (PhoneNumberStatus) o;
    return Objects.equals(this.callable, phoneNumberStatus.callable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhoneNumberStatus {\n");
    
    sb.append("    callable: ").append(toIndentedString(callable)).append("\n");
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

