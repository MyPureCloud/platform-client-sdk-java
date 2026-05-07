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
 * CaseplanQueryRequest
 */

public class CaseplanQueryRequest  implements Serializable {
  
  private String name = null;
  private Integer pageSize = null;
  private String after = null;
  private List<String> divisionIds = null;

  public CaseplanQueryRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      divisionIds = new ArrayList<String>();
    }
  }

  
  /**
   * Filter by caseplan name (case-insensitive, partial match). Omitting name returns all caseplans (subject to pagination).
   **/
  public CaseplanQueryRequest name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Filter by caseplan name (case-insensitive, partial match). Omitting name returns all caseplans (subject to pagination).")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * Number of results per page. Maximum is 200. Default is 25.
   * minimum: 1
   * maximum: 200
   **/
  public CaseplanQueryRequest pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of results per page. Maximum is 200. Default is 25.")
  @JsonProperty("pageSize")
  public Integer getPageSize() {
    return pageSize;
  }
  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


  /**
   * Cursor for pagination. Use the \"after\" value from the previous response.
   **/
  public CaseplanQueryRequest after(String after) {
    this.after = after;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Cursor for pagination. Use the \"after\" value from the previous response.")
  @JsonProperty("after")
  public String getAfter() {
    return after;
  }
  public void setAfter(String after) {
    this.after = after;
  }


  /**
   * Divisions to filter by. Accepts a list of UUIDs and/or '*'.
   **/
  public CaseplanQueryRequest divisionIds(List<String> divisionIds) {
    this.divisionIds = divisionIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Divisions to filter by. Accepts a list of UUIDs and/or '*'.")
  @JsonProperty("divisionIds")
  public List<String> getDivisionIds() {
    return divisionIds;
  }
  public void setDivisionIds(List<String> divisionIds) {
    this.divisionIds = divisionIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CaseplanQueryRequest caseplanQueryRequest = (CaseplanQueryRequest) o;

    return Objects.equals(this.name, caseplanQueryRequest.name) &&
            Objects.equals(this.pageSize, caseplanQueryRequest.pageSize) &&
            Objects.equals(this.after, caseplanQueryRequest.after) &&
            Objects.equals(this.divisionIds, caseplanQueryRequest.divisionIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, pageSize, after, divisionIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaseplanQueryRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    after: ").append(toIndentedString(after)).append("\n");
    sb.append("    divisionIds: ").append(toIndentedString(divisionIds)).append("\n");
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

