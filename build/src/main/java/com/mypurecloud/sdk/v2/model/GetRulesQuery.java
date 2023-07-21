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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * GetRulesQuery
 */

public class GetRulesQuery  implements Serializable {
  

  private static class RuleTypeEnumDeserializer extends StdDeserializer<RuleTypeEnum> {
    public RuleTypeEnumDeserializer() {
      super(RuleTypeEnumDeserializer.class);
    }

    @Override
    public RuleTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return RuleTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The rule type of the alerts the query will return
   */
 @JsonDeserialize(using = RuleTypeEnumDeserializer.class)
  public enum RuleTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    CONVERSATION("Conversation"),
    PRESENCE("Presence"),
    ALL("All");

    private String value;

    RuleTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static RuleTypeEnum fromString(String key) {
      if (key == null) return null;

      for (RuleTypeEnum value : RuleTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return RuleTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private RuleTypeEnum ruleType = null;

  private static class QueryTypeEnumDeserializer extends StdDeserializer<QueryTypeEnum> {
    public QueryTypeEnumDeserializer() {
      super(QueryTypeEnumDeserializer.class);
    }

    @Override
    public QueryTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return QueryTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The type of query being performed.
   */
 @JsonDeserialize(using = QueryTypeEnumDeserializer.class)
  public enum QueryTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    INFO("Info"),
    COUNT("Count");

    private String value;

    QueryTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static QueryTypeEnum fromString(String key) {
      if (key == null) return null;

      for (QueryTypeEnum value : QueryTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return QueryTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private QueryTypeEnum queryType = null;

  private static class EnabledTypeEnumDeserializer extends StdDeserializer<EnabledTypeEnum> {
    public EnabledTypeEnumDeserializer() {
      super(EnabledTypeEnumDeserializer.class);
    }

    @Override
    public EnabledTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return EnabledTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The state of the rule the query will return.  The accepted choices are Enabled, Disabled, or All
   */
 @JsonDeserialize(using = EnabledTypeEnumDeserializer.class)
  public enum EnabledTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ENABLED("Enabled"),
    DISABLED("Disabled"),
    ALL("All");

    private String value;

    EnabledTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static EnabledTypeEnum fromString(String key) {
      if (key == null) return null;

      for (EnabledTypeEnum value : EnabledTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return EnabledTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private EnabledTypeEnum enabledType = null;
  private Integer pageNumber = null;
  private Integer pageSize = null;

  private static class SortByEnumDeserializer extends StdDeserializer<SortByEnum> {
    public SortByEnumDeserializer() {
      super(SortByEnumDeserializer.class);
    }

    @Override
    public SortByEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return SortByEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The field to sort responses by.  The accepted choices are Name and DateStart
   */
 @JsonDeserialize(using = SortByEnumDeserializer.class)
  public enum SortByEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    NAME("Name"),
    DATECREATED("DateCreated");

    private String value;

    SortByEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static SortByEnum fromString(String key) {
      if (key == null) return null;

      for (SortByEnum value : SortByEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return SortByEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private SortByEnum sortBy = null;

  private static class SortOrderEnumDeserializer extends StdDeserializer<SortOrderEnum> {
    public SortOrderEnumDeserializer() {
      super(SortOrderEnumDeserializer.class);
    }

    @Override
    public SortOrderEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return SortOrderEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The order in which response will be sorted.  The accepted choices are Asc and Desc
   */
 @JsonDeserialize(using = SortOrderEnumDeserializer.class)
  public enum SortOrderEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ASC("Asc"),
    DESC("Desc");

    private String value;

    SortOrderEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static SortOrderEnum fromString(String key) {
      if (key == null) return null;

      for (SortOrderEnum value : SortOrderEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return SortOrderEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private SortOrderEnum sortOrder = null;
  private String ruleName = null;

  private static class NameSearchTypeEnumDeserializer extends StdDeserializer<NameSearchTypeEnum> {
    public NameSearchTypeEnumDeserializer() {
      super(NameSearchTypeEnumDeserializer.class);
    }

    @Override
    public NameSearchTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return NameSearchTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Specifies how strict the name search needs to be. Expected values are Exact and Contains if querying by name.
   */
 @JsonDeserialize(using = NameSearchTypeEnumDeserializer.class)
  public enum NameSearchTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    EXACT("Exact"),
    CONTAINS("Contains"),
    UNKNOWN("Unknown");

    private String value;

    NameSearchTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static NameSearchTypeEnum fromString(String key) {
      if (key == null) return null;

      for (NameSearchTypeEnum value : NameSearchTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return NameSearchTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private NameSearchTypeEnum nameSearchType = null;

  
  /**
   * The rule type of the alerts the query will return
   **/
  public GetRulesQuery ruleType(RuleTypeEnum ruleType) {
    this.ruleType = ruleType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The rule type of the alerts the query will return")
  @JsonProperty("ruleType")
  public RuleTypeEnum getRuleType() {
    return ruleType;
  }
  public void setRuleType(RuleTypeEnum ruleType) {
    this.ruleType = ruleType;
  }


  /**
   * The type of query being performed.
   **/
  public GetRulesQuery queryType(QueryTypeEnum queryType) {
    this.queryType = queryType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The type of query being performed.")
  @JsonProperty("queryType")
  public QueryTypeEnum getQueryType() {
    return queryType;
  }
  public void setQueryType(QueryTypeEnum queryType) {
    this.queryType = queryType;
  }


  /**
   * The state of the rule the query will return.  The accepted choices are Enabled, Disabled, or All
   **/
  public GetRulesQuery enabledType(EnabledTypeEnum enabledType) {
    this.enabledType = enabledType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The state of the rule the query will return.  The accepted choices are Enabled, Disabled, or All")
  @JsonProperty("enabledType")
  public EnabledTypeEnum getEnabledType() {
    return enabledType;
  }
  public void setEnabledType(EnabledTypeEnum enabledType) {
    this.enabledType = enabledType;
  }


  /**
   * The page number of the queried response
   **/
  public GetRulesQuery pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The page number of the queried response")
  @JsonProperty("pageNumber")
  public Integer getPageNumber() {
    return pageNumber;
  }
  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }


  /**
   * The number of entities to return of the queried response.  The max is 25
   **/
  public GetRulesQuery pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of entities to return of the queried response.  The max is 25")
  @JsonProperty("pageSize")
  public Integer getPageSize() {
    return pageSize;
  }
  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


  /**
   * The field to sort responses by.  The accepted choices are Name and DateStart
   **/
  public GetRulesQuery sortBy(SortByEnum sortBy) {
    this.sortBy = sortBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The field to sort responses by.  The accepted choices are Name and DateStart")
  @JsonProperty("sortBy")
  public SortByEnum getSortBy() {
    return sortBy;
  }
  public void setSortBy(SortByEnum sortBy) {
    this.sortBy = sortBy;
  }


  /**
   * The order in which response will be sorted.  The accepted choices are Asc and Desc
   **/
  public GetRulesQuery sortOrder(SortOrderEnum sortOrder) {
    this.sortOrder = sortOrder;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The order in which response will be sorted.  The accepted choices are Asc and Desc")
  @JsonProperty("sortOrder")
  public SortOrderEnum getSortOrder() {
    return sortOrder;
  }
  public void setSortOrder(SortOrderEnum sortOrder) {
    this.sortOrder = sortOrder;
  }


  /**
   * The name of the rule being queries.
   **/
  public GetRulesQuery ruleName(String ruleName) {
    this.ruleName = ruleName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of the rule being queries.")
  @JsonProperty("ruleName")
  public String getRuleName() {
    return ruleName;
  }
  public void setRuleName(String ruleName) {
    this.ruleName = ruleName;
  }


  /**
   * Specifies how strict the name search needs to be. Expected values are Exact and Contains if querying by name.
   **/
  public GetRulesQuery nameSearchType(NameSearchTypeEnum nameSearchType) {
    this.nameSearchType = nameSearchType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Specifies how strict the name search needs to be. Expected values are Exact and Contains if querying by name.")
  @JsonProperty("nameSearchType")
  public NameSearchTypeEnum getNameSearchType() {
    return nameSearchType;
  }
  public void setNameSearchType(NameSearchTypeEnum nameSearchType) {
    this.nameSearchType = nameSearchType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetRulesQuery getRulesQuery = (GetRulesQuery) o;

    return Objects.equals(this.ruleType, getRulesQuery.ruleType) &&
            Objects.equals(this.queryType, getRulesQuery.queryType) &&
            Objects.equals(this.enabledType, getRulesQuery.enabledType) &&
            Objects.equals(this.pageNumber, getRulesQuery.pageNumber) &&
            Objects.equals(this.pageSize, getRulesQuery.pageSize) &&
            Objects.equals(this.sortBy, getRulesQuery.sortBy) &&
            Objects.equals(this.sortOrder, getRulesQuery.sortOrder) &&
            Objects.equals(this.ruleName, getRulesQuery.ruleName) &&
            Objects.equals(this.nameSearchType, getRulesQuery.nameSearchType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ruleType, queryType, enabledType, pageNumber, pageSize, sortBy, sortOrder, ruleName, nameSearchType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetRulesQuery {\n");
    
    sb.append("    ruleType: ").append(toIndentedString(ruleType)).append("\n");
    sb.append("    queryType: ").append(toIndentedString(queryType)).append("\n");
    sb.append("    enabledType: ").append(toIndentedString(enabledType)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    sortBy: ").append(toIndentedString(sortBy)).append("\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
    sb.append("    ruleName: ").append(toIndentedString(ruleName)).append("\n");
    sb.append("    nameSearchType: ").append(toIndentedString(nameSearchType)).append("\n");
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

