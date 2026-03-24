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
import com.mypurecloud.sdk.v2.model.ResponseAsset;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ResponseAssetEntityListing
 */

public class ResponseAssetEntityListing  implements Serializable {
  
  private List<ResponseAsset> entities = null;
  private List<String> notFound = null;

  public ResponseAssetEntityListing() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      entities = new ArrayList<ResponseAsset>();
      notFound = new ArrayList<String>();
    }
  }

  
  /**
   * List of response assets
   **/
  public ResponseAssetEntityListing entities(List<ResponseAsset> entities) {
    this.entities = entities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of response assets")
  @JsonProperty("entities")
  public List<ResponseAsset> getEntities() {
    return entities;
  }
  public void setEntities(List<ResponseAsset> entities) {
    this.entities = entities;
  }


  /**
   * Asset IDs not found
   **/
  public ResponseAssetEntityListing notFound(List<String> notFound) {
    this.notFound = notFound;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Asset IDs not found")
  @JsonProperty("notFound")
  public List<String> getNotFound() {
    return notFound;
  }
  public void setNotFound(List<String> notFound) {
    this.notFound = notFound;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseAssetEntityListing responseAssetEntityListing = (ResponseAssetEntityListing) o;

    return Objects.equals(this.entities, responseAssetEntityListing.entities) &&
            Objects.equals(this.notFound, responseAssetEntityListing.notFound);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entities, notFound);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseAssetEntityListing {\n");
    
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
    sb.append("    notFound: ").append(toIndentedString(notFound)).append("\n");
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

