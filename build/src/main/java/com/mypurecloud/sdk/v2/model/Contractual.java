package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.Objects;
import java.util.ArrayList;
import java.io.IOException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Contractual
 */

public class Contractual  implements Serializable {
  
  private String schemaPropertyKey = null;
  private Contractual contractual = null;

  public Contractual() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The contract schema property key that describes the input value of this column.
   **/
  public Contractual schemaPropertyKey(String schemaPropertyKey) {
    this.schemaPropertyKey = schemaPropertyKey;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The contract schema property key that describes the input value of this column.")
  @JsonProperty("schemaPropertyKey")
  public String getSchemaPropertyKey() {
    return schemaPropertyKey;
  }
  public void setSchemaPropertyKey(String schemaPropertyKey) {
    this.schemaPropertyKey = schemaPropertyKey;
  }


  /**
   * The nested contractual definition that is defined by a contract schema, if any.
   **/
  public Contractual contractual(Contractual contractual) {
    this.contractual = contractual;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The nested contractual definition that is defined by a contract schema, if any.")
  @JsonProperty("contractual")
  public Contractual getContractual() {
    return contractual;
  }
  public void setContractual(Contractual contractual) {
    this.contractual = contractual;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Contractual contractual = (Contractual) o;

    return Objects.equals(this.schemaPropertyKey, contractual.schemaPropertyKey) &&
            Objects.equals(this.contractual, contractual.contractual);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemaPropertyKey, contractual);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Contractual {\n");
    
    sb.append("    schemaPropertyKey: ").append(toIndentedString(schemaPropertyKey)).append("\n");
    sb.append("    contractual: ").append(toIndentedString(contractual)).append("\n");
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

