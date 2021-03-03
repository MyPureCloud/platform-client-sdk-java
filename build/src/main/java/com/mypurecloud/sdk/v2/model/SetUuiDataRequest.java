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
 * SetUuiDataRequest
 */

public class SetUuiDataRequest  implements Serializable {
  
  private String uuiData = null;

  
  /**
   * The value of the uuiData to set.
   **/
  public SetUuiDataRequest uuiData(String uuiData) {
    this.uuiData = uuiData;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The value of the uuiData to set.")
  @JsonProperty("uuiData")
  public String getUuiData() {
    return uuiData;
  }
  public void setUuiData(String uuiData) {
    this.uuiData = uuiData;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetUuiDataRequest setUuiDataRequest = (SetUuiDataRequest) o;
    return Objects.equals(this.uuiData, setUuiDataRequest.uuiData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuiData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetUuiDataRequest {\n");
    
    sb.append("    uuiData: ").append(toIndentedString(uuiData)).append("\n");
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

