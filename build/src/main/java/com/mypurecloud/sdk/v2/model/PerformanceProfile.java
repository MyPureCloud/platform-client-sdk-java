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
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * PerformanceProfile
 */

public class PerformanceProfile  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String description = null;
  private List<String> metricOrders = new ArrayList<String>();
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   * A name for this performance profile
   **/
  public PerformanceProfile name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A name for this performance profile")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * A description about this performance profile
   **/
  public PerformanceProfile description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A description about this performance profile")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * Order of the associated metrics. The list should contain valid ids for metrics
   **/
  public PerformanceProfile metricOrders(List<String> metricOrders) {
    this.metricOrders = metricOrders;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Order of the associated metrics. The list should contain valid ids for metrics")
  @JsonProperty("metricOrders")
  public List<String> getMetricOrders() {
    return metricOrders;
  }
  public void setMetricOrders(List<String> metricOrders) {
    this.metricOrders = metricOrders;
  }

  
  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PerformanceProfile performanceProfile = (PerformanceProfile) o;
    return Objects.equals(this.id, performanceProfile.id) &&
        Objects.equals(this.name, performanceProfile.name) &&
        Objects.equals(this.description, performanceProfile.description) &&
        Objects.equals(this.metricOrders, performanceProfile.metricOrders) &&
        Objects.equals(this.selfUri, performanceProfile.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, metricOrders, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PerformanceProfile {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    metricOrders: ").append(toIndentedString(metricOrders)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

