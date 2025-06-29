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
import com.mypurecloud.sdk.v2.model.V2QueueObservationMetricData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * V2QueueObservationMetricGroup
 */

public class V2QueueObservationMetricGroup  implements Serializable {
  
  private Map<String, String> group = null;
  private V2QueueObservationMetricData data = null;

  public V2QueueObservationMetricGroup() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public V2QueueObservationMetricGroup group(Map<String, String> group) {
    this.group = group;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("group")
  public Map<String, String> getGroup() {
    return group;
  }
  public void setGroup(Map<String, String> group) {
    this.group = group;
  }


  /**
   **/
  public V2QueueObservationMetricGroup data(V2QueueObservationMetricData data) {
    this.data = data;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("data")
  public V2QueueObservationMetricData getData() {
    return data;
  }
  public void setData(V2QueueObservationMetricData data) {
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
    V2QueueObservationMetricGroup v2QueueObservationMetricGroup = (V2QueueObservationMetricGroup) o;

    return Objects.equals(this.group, v2QueueObservationMetricGroup.group) &&
            Objects.equals(this.data, v2QueueObservationMetricGroup.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(group, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2QueueObservationMetricGroup {\n");
    
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

