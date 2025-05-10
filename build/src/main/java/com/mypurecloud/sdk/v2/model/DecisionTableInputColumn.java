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
import com.mypurecloud.sdk.v2.model.DecisionTableColumnDefaultRowValue;
import com.mypurecloud.sdk.v2.model.DecisionTableInputColumnExpression;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * DecisionTableInputColumn
 */

public class DecisionTableInputColumn  implements Serializable {
  
  private String id = null;
  private DecisionTableColumnDefaultRowValue defaultsTo = null;
  private DecisionTableInputColumnExpression expression = null;

  public DecisionTableInputColumn() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "The id of the column.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * The default row value for this column that will complete the condition expression where no value is provided by a row.
   **/
  public DecisionTableInputColumn defaultsTo(DecisionTableColumnDefaultRowValue defaultsTo) {
    this.defaultsTo = defaultsTo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The default row value for this column that will complete the condition expression where no value is provided by a row.")
  @JsonProperty("defaultsTo")
  public DecisionTableColumnDefaultRowValue getDefaultsTo() {
    return defaultsTo;
  }
  public void setDefaultsTo(DecisionTableColumnDefaultRowValue defaultsTo) {
    this.defaultsTo = defaultsTo;
  }


  /**
   * The input column condition expression, comprising the left side and comparator of a logical condition in the form of left|comparator|right, where each row of the decision table will provide the right side to form a complete condition
   **/
  public DecisionTableInputColumn expression(DecisionTableInputColumnExpression expression) {
    this.expression = expression;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The input column condition expression, comprising the left side and comparator of a logical condition in the form of left|comparator|right, where each row of the decision table will provide the right side to form a complete condition")
  @JsonProperty("expression")
  public DecisionTableInputColumnExpression getExpression() {
    return expression;
  }
  public void setExpression(DecisionTableInputColumnExpression expression) {
    this.expression = expression;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DecisionTableInputColumn decisionTableInputColumn = (DecisionTableInputColumn) o;

    return Objects.equals(this.id, decisionTableInputColumn.id) &&
            Objects.equals(this.defaultsTo, decisionTableInputColumn.defaultsTo) &&
            Objects.equals(this.expression, decisionTableInputColumn.expression);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, defaultsTo, expression);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DecisionTableInputColumn {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    defaultsTo: ").append(toIndentedString(defaultsTo)).append("\n");
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
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

