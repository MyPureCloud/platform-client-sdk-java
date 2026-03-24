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
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * V3SourceFilter
 */

public class V3SourceFilter  implements Serializable {
  
  private String site = null;
  private List<String> folders = null;

  public V3SourceFilter() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      folders = new ArrayList<String>();
    }
  }

  
  /**
   * The site from which to sync data.
   **/
  public V3SourceFilter site(String site) {
    this.site = site;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The site from which to sync data.")
  @JsonProperty("site")
  public String getSite() {
    return site;
  }
  public void setSite(String site) {
    this.site = site;
  }


  /**
   * The folders from which to sync data.
   **/
  public V3SourceFilter folders(List<String> folders) {
    this.folders = folders;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The folders from which to sync data.")
  @JsonProperty("folders")
  public List<String> getFolders() {
    return folders;
  }
  public void setFolders(List<String> folders) {
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
    V3SourceFilter v3SourceFilter = (V3SourceFilter) o;

    return Objects.equals(this.site, v3SourceFilter.site) &&
            Objects.equals(this.folders, v3SourceFilter.folders);
  }

  @Override
  public int hashCode() {
    return Objects.hash(site, folders);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3SourceFilter {\n");
    
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

