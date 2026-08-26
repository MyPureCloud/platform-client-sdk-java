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
import com.mypurecloud.sdk.v2.model.Cluster;
import com.mypurecloud.sdk.v2.model.Cursors;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ClusterList
 */

public class ClusterList  implements Serializable {
  
  private List<Cluster> entities = null;
  private String nextUri = null;
  private String selfUri = null;
  private String previousUri = null;
  private Cursors cursors = null;

  public ClusterList() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      entities = new ArrayList<Cluster>();
    }
  }

  public ClusterList(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      entities = new ArrayList<Cluster>();
    }
  }

  
  /**
   **/
  public ClusterList entities(List<Cluster> entities) {
    this.entities = entities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("entities")
  public List<Cluster> getEntities() {
    return entities;
  }
  public void setEntities(List<Cluster> entities) {
    this.entities = entities;
  }


  /**
   **/
  public ClusterList nextUri(String nextUri) {
    this.nextUri = nextUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("nextUri")
  public String getNextUri() {
    return nextUri;
  }
  public void setNextUri(String nextUri) {
    this.nextUri = nextUri;
  }


  /**
   **/
  public ClusterList selfUri(String selfUri) {
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


  /**
   **/
  public ClusterList previousUri(String previousUri) {
    this.previousUri = previousUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("previousUri")
  public String getPreviousUri() {
    return previousUri;
  }
  public void setPreviousUri(String previousUri) {
    this.previousUri = previousUri;
  }


  /**
   * The cursor that points to the next set of entities being returned.
   **/
  public ClusterList cursors(Cursors cursors) {
    this.cursors = cursors;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The cursor that points to the next set of entities being returned.")
  @JsonProperty("cursors")
  public Cursors getCursors() {
    return cursors;
  }
  public void setCursors(Cursors cursors) {
    this.cursors = cursors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterList clusterList = (ClusterList) o;

    return Objects.equals(this.entities, clusterList.entities) &&
            Objects.equals(this.nextUri, clusterList.nextUri) &&
            Objects.equals(this.selfUri, clusterList.selfUri) &&
            Objects.equals(this.previousUri, clusterList.previousUri) &&
            Objects.equals(this.cursors, clusterList.cursors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entities, nextUri, selfUri, previousUri, cursors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterList {\n");
    
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
    sb.append("    nextUri: ").append(toIndentedString(nextUri)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
    sb.append("    previousUri: ").append(toIndentedString(previousUri)).append("\n");
    sb.append("    cursors: ").append(toIndentedString(cursors)).append("\n");
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

