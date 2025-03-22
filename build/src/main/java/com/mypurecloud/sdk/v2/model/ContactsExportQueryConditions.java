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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.ContactsExportFilter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ContactsExportQueryConditions
 */

public class ContactsExportQueryConditions  implements Serializable {
  
  private ContactsExportFilter filters = null;
  private Integer limit = null;

  
  /**
   * Filters to apply on export
   **/
  public ContactsExportQueryConditions filters(ContactsExportFilter filters) {
    this.filters = filters;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Filters to apply on export")
  @JsonProperty("filters")
  public ContactsExportFilter getFilters() {
    return filters;
  }
  public void setFilters(ContactsExportFilter filters) {
    this.filters = filters;
  }


  /**
   * Maximum result count in export, default is 180 000 000
   * maximum: 180000000
   **/
  public ContactsExportQueryConditions limit(Integer limit) {
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
    ContactsExportQueryConditions contactsExportQueryConditions = (ContactsExportQueryConditions) o;

    return Objects.equals(this.filters, contactsExportQueryConditions.filters) &&
            Objects.equals(this.limit, contactsExportQueryConditions.limit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filters, limit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactsExportQueryConditions {\n");
    
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

