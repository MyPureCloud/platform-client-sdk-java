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
 * DynamicContactQueueingSettings
 */

public class DynamicContactQueueingSettings  implements Serializable {
  
  private Boolean sort = null;
  private Boolean filter = null;

  public DynamicContactQueueingSettings() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Whether to sort contacts dynamically
   **/
  public DynamicContactQueueingSettings sort(Boolean sort) {
    this.sort = sort;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether to sort contacts dynamically")
  @JsonProperty("sort")
  public Boolean getSort() {
    return sort;
  }
  public void setSort(Boolean sort) {
    this.sort = sort;
  }


  /**
   * Whether to filter contacts dynamically
   **/
  public DynamicContactQueueingSettings filter(Boolean filter) {
    this.filter = filter;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether to filter contacts dynamically")
  @JsonProperty("filter")
  public Boolean getFilter() {
    return filter;
  }
  public void setFilter(Boolean filter) {
    this.filter = filter;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DynamicContactQueueingSettings dynamicContactQueueingSettings = (DynamicContactQueueingSettings) o;

    return Objects.equals(this.sort, dynamicContactQueueingSettings.sort) &&
            Objects.equals(this.filter, dynamicContactQueueingSettings.filter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sort, filter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DynamicContactQueueingSettings {\n");
    
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
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

