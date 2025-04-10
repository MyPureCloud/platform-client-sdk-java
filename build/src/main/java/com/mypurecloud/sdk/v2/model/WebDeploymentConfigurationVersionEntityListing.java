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
import com.mypurecloud.sdk.v2.model.WebDeploymentConfigurationVersion;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * WebDeploymentConfigurationVersionEntityListing
 */

public class WebDeploymentConfigurationVersionEntityListing  implements Serializable {
  
  private List<WebDeploymentConfigurationVersion> entities = null;
  private String nextUri = null;
  private String selfUri = null;
  private String previousUri = null;
  private Long total = null;

  public WebDeploymentConfigurationVersionEntityListing() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      entities = new ArrayList<WebDeploymentConfigurationVersion>();
    }
  }

  
  /**
   **/
  public WebDeploymentConfigurationVersionEntityListing entities(List<WebDeploymentConfigurationVersion> entities) {
    this.entities = entities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("entities")
  public List<WebDeploymentConfigurationVersion> getEntities() {
    return entities;
  }
  public void setEntities(List<WebDeploymentConfigurationVersion> entities) {
    this.entities = entities;
  }


  /**
   **/
  public WebDeploymentConfigurationVersionEntityListing nextUri(String nextUri) {
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
  public WebDeploymentConfigurationVersionEntityListing selfUri(String selfUri) {
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
  public WebDeploymentConfigurationVersionEntityListing previousUri(String previousUri) {
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
   **/
  public WebDeploymentConfigurationVersionEntityListing total(Long total) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebDeploymentConfigurationVersionEntityListing webDeploymentConfigurationVersionEntityListing = (WebDeploymentConfigurationVersionEntityListing) o;

    return Objects.equals(this.entities, webDeploymentConfigurationVersionEntityListing.entities) &&
            Objects.equals(this.nextUri, webDeploymentConfigurationVersionEntityListing.nextUri) &&
            Objects.equals(this.selfUri, webDeploymentConfigurationVersionEntityListing.selfUri) &&
            Objects.equals(this.previousUri, webDeploymentConfigurationVersionEntityListing.previousUri) &&
            Objects.equals(this.total, webDeploymentConfigurationVersionEntityListing.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entities, nextUri, selfUri, previousUri, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebDeploymentConfigurationVersionEntityListing {\n");
    
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
    sb.append("    nextUri: ").append(toIndentedString(nextUri)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
    sb.append("    previousUri: ").append(toIndentedString(previousUri)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

