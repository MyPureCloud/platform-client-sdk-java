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
import com.mypurecloud.sdk.v2.model.StreetAddress;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ValidateAddressRequest
 */

public class ValidateAddressRequest  implements Serializable {
  
  private StreetAddress address = null;

  
  /**
   * Address schema
   **/
  public ValidateAddressRequest address(StreetAddress address) {
    this.address = address;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Address schema")
  @JsonProperty("address")
  public StreetAddress getAddress() {
    return address;
  }
  public void setAddress(StreetAddress address) {
    this.address = address;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidateAddressRequest validateAddressRequest = (ValidateAddressRequest) o;
    return Objects.equals(this.address, validateAddressRequest.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidateAddressRequest {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
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

