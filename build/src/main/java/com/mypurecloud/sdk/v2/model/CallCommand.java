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
 * CallCommand
 */

public class CallCommand  implements Serializable {
  
  private String callNumber = null;
  private String phoneColumn = null;

  
  /**
   * The phone number to dial for this call.
   **/
  public CallCommand callNumber(String callNumber) {
    this.callNumber = callNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The phone number to dial for this call.")
  @JsonProperty("callNumber")
  public String getCallNumber() {
    return callNumber;
  }
  public void setCallNumber(String callNumber) {
    this.callNumber = callNumber;
  }

  
  /**
   * For a dialer preview or scheduled callback, the phone column associated with the phone number
   **/
  public CallCommand phoneColumn(String phoneColumn) {
    this.phoneColumn = phoneColumn;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "For a dialer preview or scheduled callback, the phone column associated with the phone number")
  @JsonProperty("phoneColumn")
  public String getPhoneColumn() {
    return phoneColumn;
  }
  public void setPhoneColumn(String phoneColumn) {
    this.phoneColumn = phoneColumn;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CallCommand callCommand = (CallCommand) o;
    return Objects.equals(this.callNumber, callCommand.callNumber) &&
        Objects.equals(this.phoneColumn, callCommand.phoneColumn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callNumber, phoneColumn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallCommand {\n");
    
    sb.append("    callNumber: ").append(toIndentedString(callNumber)).append("\n");
    sb.append("    phoneColumn: ").append(toIndentedString(phoneColumn)).append("\n");
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

