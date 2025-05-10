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
import com.mypurecloud.sdk.v2.model.Literal;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * DecisionTableRowParameterValue
 */

public class DecisionTableRowParameterValue  implements Serializable {
  
  private Literal literal = null;

  public DecisionTableRowParameterValue() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * A literal parameter value
   **/
  public DecisionTableRowParameterValue literal(Literal literal) {
    this.literal = literal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A literal parameter value")
  @JsonProperty("literal")
  public Literal getLiteral() {
    return literal;
  }
  public void setLiteral(Literal literal) {
    this.literal = literal;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DecisionTableRowParameterValue decisionTableRowParameterValue = (DecisionTableRowParameterValue) o;

    return Objects.equals(this.literal, decisionTableRowParameterValue.literal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(literal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DecisionTableRowParameterValue {\n");
    
    sb.append("    literal: ").append(toIndentedString(literal)).append("\n");
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

