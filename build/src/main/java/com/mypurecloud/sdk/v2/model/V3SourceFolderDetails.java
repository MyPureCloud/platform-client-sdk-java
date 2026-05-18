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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * V3SourceFolderDetails
 */

public class V3SourceFolderDetails  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String fullPath = null;

  public V3SourceFolderDetails() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public V3SourceFolderDetails(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The folder's id.
   **/
  public V3SourceFolderDetails id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The folder's id.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * The folder's display name.
   **/
  public V3SourceFolderDetails name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The folder's display name.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The folder's full path from the root.
   **/
  public V3SourceFolderDetails fullPath(String fullPath) {
    this.fullPath = fullPath;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The folder's full path from the root.")
  @JsonProperty("fullPath")
  public String getFullPath() {
    return fullPath;
  }
  public void setFullPath(String fullPath) {
    this.fullPath = fullPath;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3SourceFolderDetails v3SourceFolderDetails = (V3SourceFolderDetails) o;

    return Objects.equals(this.id, v3SourceFolderDetails.id) &&
            Objects.equals(this.name, v3SourceFolderDetails.name) &&
            Objects.equals(this.fullPath, v3SourceFolderDetails.fullPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, fullPath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3SourceFolderDetails {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    fullPath: ").append(toIndentedString(fullPath)).append("\n");
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

