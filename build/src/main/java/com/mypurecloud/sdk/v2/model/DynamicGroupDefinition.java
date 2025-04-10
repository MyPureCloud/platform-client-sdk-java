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
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import com.mypurecloud.sdk.v2.model.DynamicGroupQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * DynamicGroupDefinition
 */

public class DynamicGroupDefinition  implements Serializable {
  
  private AddressableEntityRef group = null;
  private Date dateModified = null;
  private DynamicGroupQuery query = null;
  private String selfUri = null;

  public DynamicGroupDefinition() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The group the dynamic group definition belongs to
   **/
  public DynamicGroupDefinition group(AddressableEntityRef group) {
    this.group = group;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The group the dynamic group definition belongs to")
  @JsonProperty("group")
  public AddressableEntityRef getGroup() {
    return group;
  }
  public void setGroup(AddressableEntityRef group) {
    this.group = group;
  }


  /**
   * Last modified date/time of the dynamic group definition. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public DynamicGroupDefinition dateModified(Date dateModified) {
    this.dateModified = dateModified;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Last modified date/time of the dynamic group definition. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }
  public void setDateModified(Date dateModified) {
    this.dateModified = dateModified;
  }


  /**
   * Properties used for building a dynamic groups query
   **/
  public DynamicGroupDefinition query(DynamicGroupQuery query) {
    this.query = query;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Properties used for building a dynamic groups query")
  @JsonProperty("query")
  public DynamicGroupQuery getQuery() {
    return query;
  }
  public void setQuery(DynamicGroupQuery query) {
    this.query = query;
  }


  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DynamicGroupDefinition dynamicGroupDefinition = (DynamicGroupDefinition) o;

    return Objects.equals(this.group, dynamicGroupDefinition.group) &&
            Objects.equals(this.dateModified, dynamicGroupDefinition.dateModified) &&
            Objects.equals(this.query, dynamicGroupDefinition.query) &&
            Objects.equals(this.selfUri, dynamicGroupDefinition.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(group, dateModified, query, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DynamicGroupDefinition {\n");
    
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
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

