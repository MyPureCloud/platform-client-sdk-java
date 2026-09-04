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
 * ContactSimpleSearch
 */

public class ContactSimpleSearch  implements Serializable {
  
  private String query = null;
  private List<String> sortOrder = null;
  private List<String> ids = null;

  public ContactSimpleSearch() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      sortOrder = new ArrayList<String>();
      ids = new ArrayList<String>();
    }
  }

  public ContactSimpleSearch(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      sortOrder = new ArrayList<String>();
      ids = new ArrayList<String>();
    }
  }

  
  /**
   * User supplied search keywords (no special syntax is currently supported)
   **/
  public ContactSimpleSearch query(String query) {
    this.query = query;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "User supplied search keywords (no special syntax is currently supported)")
  @JsonProperty("query")
  public String getQuery() {
    return query;
  }
  public void setQuery(String query) {
    this.query = query;
  }


  /**
   * The External Contact field to sort by. Any of: [firstName, lastName, middleName, title]. Direction: [asc, desc]. e.g. \"firstName:asc\", \"title:desc\"
   **/
  public ContactSimpleSearch sortOrder(List<String> sortOrder) {
    this.sortOrder = sortOrder;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The External Contact field to sort by. Any of: [firstName, lastName, middleName, title]. Direction: [asc, desc]. e.g. \"firstName:asc\", \"title:desc\"")
  @JsonProperty("sortOrder")
  public List<String> getSortOrder() {
    return sortOrder;
  }
  public void setSortOrder(List<String> sortOrder) {
    this.sortOrder = sortOrder;
  }


  /**
   * List of External Contact ids to exact match in search result. Optional filter, up to 100
   **/
  public ContactSimpleSearch ids(List<String> ids) {
    this.ids = ids;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of External Contact ids to exact match in search result. Optional filter, up to 100")
  @JsonProperty("ids")
  public List<String> getIds() {
    return ids;
  }
  public void setIds(List<String> ids) {
    this.ids = ids;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactSimpleSearch contactSimpleSearch = (ContactSimpleSearch) o;

    return Objects.equals(this.query, contactSimpleSearch.query) &&
            Objects.equals(this.sortOrder, contactSimpleSearch.sortOrder) &&
            Objects.equals(this.ids, contactSimpleSearch.ids);
  }

  @Override
  public int hashCode() {
    return Objects.hash(query, sortOrder, ids);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactSimpleSearch {\n");
    
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
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

