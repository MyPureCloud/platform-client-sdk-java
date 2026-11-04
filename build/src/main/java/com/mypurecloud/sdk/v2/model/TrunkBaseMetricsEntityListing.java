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
import com.mypurecloud.sdk.v2.model.TrunkBaseMetrics;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * TrunkBaseMetricsEntityListing
 */

public class TrunkBaseMetricsEntityListing  implements Serializable {
  
  private Long total = null;
  private List<TrunkBaseMetrics> entities = null;
  private String selfUri = null;

  public TrunkBaseMetricsEntityListing() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      entities = new ArrayList<TrunkBaseMetrics>();
    }
  }

  public TrunkBaseMetricsEntityListing(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      entities = new ArrayList<TrunkBaseMetrics>();
    }
  }

  
  /**
   **/
  public TrunkBaseMetricsEntityListing total(Long total) {
    this.total = total;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("total")
  public Long getTotal() {
    return total;
  }
  public void setTotal(Long total) {
    this.total = total;
  }


  /**
   **/
  public TrunkBaseMetricsEntityListing entities(List<TrunkBaseMetrics> entities) {
    this.entities = entities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("entities")
  public List<TrunkBaseMetrics> getEntities() {
    return entities;
  }
  public void setEntities(List<TrunkBaseMetrics> entities) {
    this.entities = entities;
  }


  /**
   **/
  public TrunkBaseMetricsEntityListing selfUri(String selfUri) {
    this.selfUri = selfUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }
  public void setSelfUri(String selfUri) {
    this.selfUri = selfUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrunkBaseMetricsEntityListing trunkBaseMetricsEntityListing = (TrunkBaseMetricsEntityListing) o;

    return Objects.equals(this.total, trunkBaseMetricsEntityListing.total) &&
            Objects.equals(this.entities, trunkBaseMetricsEntityListing.entities) &&
            Objects.equals(this.selfUri, trunkBaseMetricsEntityListing.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(total, entities, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrunkBaseMetricsEntityListing {\n");
    
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
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

