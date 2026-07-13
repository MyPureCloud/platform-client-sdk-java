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
import com.mypurecloud.sdk.v2.model.OrganizationsExportFilter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * OrganizationsExportQueryConditions
 */

public class OrganizationsExportQueryConditions  implements Serializable {
  
  private OrganizationsExportFilter filters = null;
  private Integer limit = null;

  public OrganizationsExportQueryConditions() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public OrganizationsExportQueryConditions(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * Filters to apply on export
   **/
  public OrganizationsExportQueryConditions filters(OrganizationsExportFilter filters) {
    this.filters = filters;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Filters to apply on export")
  @JsonProperty("filters")
  public OrganizationsExportFilter getFilters() {
    return filters;
  }
  public void setFilters(OrganizationsExportFilter filters) {
    this.filters = filters;
  }


  /**
   * Maximum result count in export, default is 180 000 000
   * maximum: 180000000
   **/
  public OrganizationsExportQueryConditions limit(Integer limit) {
    this.limit = limit;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Maximum result count in export, default is 180 000 000")
  @JsonProperty("limit")
  public Integer getLimit() {
    return limit;
  }
  public void setLimit(Integer limit) {
    this.limit = limit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationsExportQueryConditions organizationsExportQueryConditions = (OrganizationsExportQueryConditions) o;

    return Objects.equals(this.filters, organizationsExportQueryConditions.filters) &&
            Objects.equals(this.limit, organizationsExportQueryConditions.limit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filters, limit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationsExportQueryConditions {\n");
    
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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

