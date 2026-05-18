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
import com.mypurecloud.sdk.v2.model.V3SourceFolderDetails;
import com.mypurecloud.sdk.v2.model.V3SourceSiteDetails;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * V3SourceFilterDetails
 */

public class V3SourceFilterDetails  implements Serializable {
  
  private V3SourceSiteDetails site = null;
  private List<V3SourceFolderDetails> folders = null;

  public V3SourceFilterDetails() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      folders = new ArrayList<V3SourceFolderDetails>();
    }
  }

  public V3SourceFilterDetails(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      folders = new ArrayList<V3SourceFolderDetails>();
    }
  }

  
  /**
   * Details about the site associated with the Fabric Source.
   **/
  public V3SourceFilterDetails site(V3SourceSiteDetails site) {
    this.site = site;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Details about the site associated with the Fabric Source.")
  @JsonProperty("site")
  public V3SourceSiteDetails getSite() {
    return site;
  }
  public void setSite(V3SourceSiteDetails site) {
    this.site = site;
  }


  /**
   * Details about the folders associated with the Fabric Source.
   **/
  public V3SourceFilterDetails folders(List<V3SourceFolderDetails> folders) {
    this.folders = folders;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Details about the folders associated with the Fabric Source.")
  @JsonProperty("folders")
  public List<V3SourceFolderDetails> getFolders() {
    return folders;
  }
  public void setFolders(List<V3SourceFolderDetails> folders) {
    this.folders = folders;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3SourceFilterDetails v3SourceFilterDetails = (V3SourceFilterDetails) o;

    return Objects.equals(this.site, v3SourceFilterDetails.site) &&
            Objects.equals(this.folders, v3SourceFilterDetails.folders);
  }

  @Override
  public int hashCode() {
    return Objects.hash(site, folders);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3SourceFilterDetails {\n");
    
    sb.append("    site: ").append(toIndentedString(site)).append("\n");
    sb.append("    folders: ").append(toIndentedString(folders)).append("\n");
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

