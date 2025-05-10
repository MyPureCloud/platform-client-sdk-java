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
import com.mypurecloud.sdk.v2.model.OutputValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * DecisionTableOutputColumn
 */

public class DecisionTableOutputColumn  implements Serializable {
  
  private String id = null;
  private DecisionTableColumnDefaultRowValue defaultsTo = null;
  private OutputValue value = null;

  public DecisionTableOutputColumn() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "The id of the column.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * The default row value for this column that will be used for an output value where no value  is provided by a row.
   **/
  public DecisionTableOutputColumn defaultsTo(DecisionTableColumnDefaultRowValue defaultsTo) {
    this.defaultsTo = defaultsTo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The default row value for this column that will be used for an output value where no value  is provided by a row.")
  @JsonProperty("defaultsTo")
  public DecisionTableColumnDefaultRowValue getDefaultsTo() {
    return defaultsTo;
  }
  public void setDefaultsTo(DecisionTableColumnDefaultRowValue defaultsTo) {
    this.defaultsTo = defaultsTo;
  }


  /**
   * The output data of this column that will be provided by each row.
   **/
  public DecisionTableOutputColumn value(OutputValue value) {
    this.value = value;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The output data of this column that will be provided by each row.")
  @JsonProperty("value")
  public OutputValue getValue() {
    return value;
  }
  public void setValue(OutputValue value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DecisionTableOutputColumn decisionTableOutputColumn = (DecisionTableOutputColumn) o;

    return Objects.equals(this.id, decisionTableOutputColumn.id) &&
            Objects.equals(this.defaultsTo, decisionTableOutputColumn.defaultsTo) &&
            Objects.equals(this.value, decisionTableOutputColumn.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, defaultsTo, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DecisionTableOutputColumn {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    defaultsTo: ").append(toIndentedString(defaultsTo)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

