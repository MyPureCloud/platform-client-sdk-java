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
import com.mypurecloud.sdk.v2.model.StatisticalResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * FlowExecutionAggregateDataContainer
 */

public class FlowExecutionAggregateDataContainer  implements Serializable {
  
  private Map<String, String> group = null;
  private List<StatisticalResponse> data = null;

  public FlowExecutionAggregateDataContainer() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      data = new ArrayList<StatisticalResponse>();
    }
  }

  
  /**
   * A mapping from dimension to value
   **/
  public FlowExecutionAggregateDataContainer group(Map<String, String> group) {
    this.group = group;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A mapping from dimension to value")
  @JsonProperty("group")
  public Map<String, String> getGroup() {
    return group;
  }
  public void setGroup(Map<String, String> group) {
    this.group = group;
  }


  /**
   **/
  public FlowExecutionAggregateDataContainer data(List<StatisticalResponse> data) {
    this.data = data;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("data")
  public List<StatisticalResponse> getData() {
    return data;
  }
  public void setData(List<StatisticalResponse> data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlowExecutionAggregateDataContainer flowExecutionAggregateDataContainer = (FlowExecutionAggregateDataContainer) o;

    return Objects.equals(this.group, flowExecutionAggregateDataContainer.group) &&
            Objects.equals(this.data, flowExecutionAggregateDataContainer.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(group, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlowExecutionAggregateDataContainer {\n");
    
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

