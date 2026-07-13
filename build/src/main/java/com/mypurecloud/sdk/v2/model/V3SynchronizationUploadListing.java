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
import com.mypurecloud.sdk.v2.model.V3SynchronizationUpload;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * V3SynchronizationUploadListing
 */

public class V3SynchronizationUploadListing  implements Serializable {
  
  private List<V3SynchronizationUpload> entities = null;
  private String nextUri = null;
  private String selfUri = null;
  private String previousUri = null;

  public V3SynchronizationUploadListing() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      entities = new ArrayList<V3SynchronizationUpload>();
    }
  }

  public V3SynchronizationUploadListing(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      entities = new ArrayList<V3SynchronizationUpload>();
    }
  }

  
  /**
   **/
  public V3SynchronizationUploadListing entities(List<V3SynchronizationUpload> entities) {
    this.entities = entities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("entities")
  public List<V3SynchronizationUpload> getEntities() {
    return entities;
  }
  public void setEntities(List<V3SynchronizationUpload> entities) {
    this.entities = entities;
  }


  /**
   **/
  public V3SynchronizationUploadListing nextUri(String nextUri) {
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
  public V3SynchronizationUploadListing selfUri(String selfUri) {
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
  public V3SynchronizationUploadListing previousUri(String previousUri) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3SynchronizationUploadListing v3SynchronizationUploadListing = (V3SynchronizationUploadListing) o;

    return Objects.equals(this.entities, v3SynchronizationUploadListing.entities) &&
            Objects.equals(this.nextUri, v3SynchronizationUploadListing.nextUri) &&
            Objects.equals(this.selfUri, v3SynchronizationUploadListing.selfUri) &&
            Objects.equals(this.previousUri, v3SynchronizationUploadListing.previousUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entities, nextUri, selfUri, previousUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3SynchronizationUploadListing {\n");
    
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
    sb.append("    nextUri: ").append(toIndentedString(nextUri)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
    sb.append("    previousUri: ").append(toIndentedString(previousUri)).append("\n");
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

