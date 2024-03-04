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
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.ContactListFilterClause;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ContactBulkSearchCriteria
 */

public class ContactBulkSearchCriteria  implements Serializable {
  
  private List<ContactListFilterClause> clauses = new ArrayList<ContactListFilterClause>();

  private static class FilterTypeEnumDeserializer extends StdDeserializer<FilterTypeEnum> {
    public FilterTypeEnumDeserializer() {
      super(FilterTypeEnumDeserializer.class);
    }

    @Override
    public FilterTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return FilterTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * How to join clauses together.
   */
 @JsonDeserialize(using = FilterTypeEnumDeserializer.class)
  public enum FilterTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    AND("AND"),
    OR("OR");

    private String value;

    FilterTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static FilterTypeEnum fromString(String key) {
      if (key == null) return null;

      for (FilterTypeEnum value : FilterTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return FilterTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private FilterTypeEnum filterType = null;

  
  /**
   * Groups of conditions to filter the contacts by.
   **/
  public ContactBulkSearchCriteria clauses(List<ContactListFilterClause> clauses) {
    this.clauses = clauses;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Groups of conditions to filter the contacts by.")
  @JsonProperty("clauses")
  public List<ContactListFilterClause> getClauses() {
    return clauses;
  }
  public void setClauses(List<ContactListFilterClause> clauses) {
    this.clauses = clauses;
  }


  /**
   * How to join clauses together.
   **/
  public ContactBulkSearchCriteria filterType(FilterTypeEnum filterType) {
    this.filterType = filterType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "How to join clauses together.")
  @JsonProperty("filterType")
  public FilterTypeEnum getFilterType() {
    return filterType;
  }
  public void setFilterType(FilterTypeEnum filterType) {
    this.filterType = filterType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactBulkSearchCriteria contactBulkSearchCriteria = (ContactBulkSearchCriteria) o;

    return Objects.equals(this.clauses, contactBulkSearchCriteria.clauses) &&
            Objects.equals(this.filterType, contactBulkSearchCriteria.filterType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clauses, filterType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactBulkSearchCriteria {\n");
    
    sb.append("    clauses: ").append(toIndentedString(clauses)).append("\n");
    sb.append("    filterType: ").append(toIndentedString(filterType)).append("\n");
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

