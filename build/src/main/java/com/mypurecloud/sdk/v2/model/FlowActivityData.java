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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.FlowActivityEntityData;
import com.mypurecloud.sdk.v2.model.FlowActivityMetricValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * FlowActivityData
 */

public class FlowActivityData  implements Serializable {
  
  private Map<String, String> group = null;
  private List<FlowActivityMetricValue> data = new ArrayList<FlowActivityMetricValue>();
  private Boolean truncated = null;
  private List<FlowActivityEntityData> entities = new ArrayList<FlowActivityEntityData>();

  
  /**
   * A mapping from grouping dimension to value
   **/
  public FlowActivityData group(Map<String, String> group) {
    this.group = group;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A mapping from grouping dimension to value")
  @JsonProperty("group")
  public Map<String, String> getGroup() {
    return group;
  }
  public void setGroup(Map<String, String> group) {
    this.group = group;
  }


  /**
   * Data for metrics
   **/
  public FlowActivityData data(List<FlowActivityMetricValue> data) {
    this.data = data;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data for metrics")
  @JsonProperty("data")
  public List<FlowActivityMetricValue> getData() {
    return data;
  }
  public void setData(List<FlowActivityMetricValue> data) {
    this.data = data;
  }


  /**
   * Flag for a truncated list of entities. If truncated, the first half of the list of entities will contain the oldest entities and the second half the newest entities.
   **/
  public FlowActivityData truncated(Boolean truncated) {
    this.truncated = truncated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Flag for a truncated list of entities. If truncated, the first half of the list of entities will contain the oldest entities and the second half the newest entities.")
  @JsonProperty("truncated")
  public Boolean getTruncated() {
    return truncated;
  }
  public void setTruncated(Boolean truncated) {
    this.truncated = truncated;
  }


  /**
   * Details for active entities
   **/
  public FlowActivityData entities(List<FlowActivityEntityData> entities) {
    this.entities = entities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Details for active entities")
  @JsonProperty("entities")
  public List<FlowActivityEntityData> getEntities() {
    return entities;
  }
  public void setEntities(List<FlowActivityEntityData> entities) {
    this.entities = entities;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlowActivityData flowActivityData = (FlowActivityData) o;

    return Objects.equals(this.group, flowActivityData.group) &&
            Objects.equals(this.data, flowActivityData.data) &&
            Objects.equals(this.truncated, flowActivityData.truncated) &&
            Objects.equals(this.entities, flowActivityData.entities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(group, data, truncated, entities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlowActivityData {\n");
    
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    truncated: ").append(toIndentedString(truncated)).append("\n");
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
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

