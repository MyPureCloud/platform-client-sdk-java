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
import com.mypurecloud.sdk.v2.model.TimeOffLimitValueRange;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * QueryTimeOffLimitValuesResponse
 */

public class QueryTimeOffLimitValuesResponse  implements Serializable {
  
  private List<TimeOffLimitValueRange> values = null;

  public QueryTimeOffLimitValuesResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      values = new ArrayList<TimeOffLimitValueRange>();
    }
  }

  
  /**
   **/
  public QueryTimeOffLimitValuesResponse values(List<TimeOffLimitValueRange> values) {
    this.values = values;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("values")
  public List<TimeOffLimitValueRange> getValues() {
    return values;
  }
  public void setValues(List<TimeOffLimitValueRange> values) {
    this.values = values;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryTimeOffLimitValuesResponse queryTimeOffLimitValuesResponse = (QueryTimeOffLimitValuesResponse) o;

    return Objects.equals(this.values, queryTimeOffLimitValuesResponse.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryTimeOffLimitValuesResponse {\n");
    
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

