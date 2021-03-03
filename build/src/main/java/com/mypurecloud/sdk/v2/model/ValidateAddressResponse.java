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
import com.mypurecloud.sdk.v2.model.SubscriberResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ValidateAddressResponse
 */

public class ValidateAddressResponse  implements Serializable {
  
  private Boolean valid = null;
  private SubscriberResponse response = null;

  
  /**
   * Was the passed in address valid
   **/
  public ValidateAddressResponse valid(Boolean valid) {
    this.valid = valid;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Was the passed in address valid")
  @JsonProperty("valid")
  public Boolean getValid() {
    return valid;
  }
  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  
  /**
   * Subscriber schema
   **/
  public ValidateAddressResponse response(SubscriberResponse response) {
    this.response = response;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Subscriber schema")
  @JsonProperty("response")
  public SubscriberResponse getResponse() {
    return response;
  }
  public void setResponse(SubscriberResponse response) {
    this.response = response;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidateAddressResponse validateAddressResponse = (ValidateAddressResponse) o;
    return Objects.equals(this.valid, validateAddressResponse.valid) &&
        Objects.equals(this.response, validateAddressResponse.response);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, response);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidateAddressResponse {\n");
    
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
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

