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
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.DialerContactlistfilterConfigChangeFilterPredicate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * DialerContactlistfilterConfigChangeFilterClause
 */

public class DialerContactlistfilterConfigChangeFilterClause  implements Serializable {
  

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
   * Contact list filter type
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
  private List<DialerContactlistfilterConfigChangeFilterPredicate> predicates = null;
  private Map<String, Object> additionalProperties = null;

  public DialerContactlistfilterConfigChangeFilterClause() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      predicates = new ArrayList<DialerContactlistfilterConfigChangeFilterPredicate>();
    }
  }

  
  /**
   * Contact list filter type
   **/
  public DialerContactlistfilterConfigChangeFilterClause filterType(FilterTypeEnum filterType) {
    this.filterType = filterType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Contact list filter type")
  @JsonProperty("filterType")
  public FilterTypeEnum getFilterType() {
    return filterType;
  }
  public void setFilterType(FilterTypeEnum filterType) {
    this.filterType = filterType;
  }


  /**
   * The list of predicates in that clause
   **/
  public DialerContactlistfilterConfigChangeFilterClause predicates(List<DialerContactlistfilterConfigChangeFilterPredicate> predicates) {
    this.predicates = predicates;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of predicates in that clause")
  @JsonProperty("predicates")
  public List<DialerContactlistfilterConfigChangeFilterPredicate> getPredicates() {
    return predicates;
  }
  public void setPredicates(List<DialerContactlistfilterConfigChangeFilterPredicate> predicates) {
    this.predicates = predicates;
  }


  /**
   **/
  public DialerContactlistfilterConfigChangeFilterClause additionalProperties(Map<String, Object> additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("additionalProperties")
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }
  public void setAdditionalProperties(Map<String, Object> additionalProperties) {
    this.additionalProperties = additionalProperties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DialerContactlistfilterConfigChangeFilterClause dialerContactlistfilterConfigChangeFilterClause = (DialerContactlistfilterConfigChangeFilterClause) o;

    return Objects.equals(this.filterType, dialerContactlistfilterConfigChangeFilterClause.filterType) &&
            Objects.equals(this.predicates, dialerContactlistfilterConfigChangeFilterClause.predicates) &&
            Objects.equals(this.additionalProperties, dialerContactlistfilterConfigChangeFilterClause.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filterType, predicates, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DialerContactlistfilterConfigChangeFilterClause {\n");
    
    sb.append("    filterType: ").append(toIndentedString(filterType)).append("\n");
    sb.append("    predicates: ").append(toIndentedString(predicates)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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

