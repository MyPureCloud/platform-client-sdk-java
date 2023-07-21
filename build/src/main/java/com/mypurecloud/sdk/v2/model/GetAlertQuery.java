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
 * GetAlertQuery
 */

public class GetAlertQuery  implements Serializable {
  

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

  private static class ActiveStatusEnumDeserializer extends StdDeserializer<ActiveStatusEnum> {
    public ActiveStatusEnumDeserializer() {
      super(ActiveStatusEnumDeserializer.class);
    }

    @Override
    public ActiveStatusEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ActiveStatusEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The status of the alerts the query will return.
   */
 @JsonDeserialize(using = ActiveStatusEnumDeserializer.class)
  public enum ActiveStatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ACTIVE("Active"),
    INACTIVE("Inactive"),
    ALL("All");

    private String value;

    ActiveStatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ActiveStatusEnum fromString(String key) {
      if (key == null) return null;

      for (ActiveStatusEnum value : ActiveStatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ActiveStatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ActiveStatusEnum activeStatus = null;

  private static class ViewedStatusEnumDeserializer extends StdDeserializer<ViewedStatusEnum> {
    public ViewedStatusEnumDeserializer() {
      super(ViewedStatusEnumDeserializer.class);
    }

    @Override
    public ViewedStatusEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ViewedStatusEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The view status of the alerts the query will return.
   */
 @JsonDeserialize(using = ViewedStatusEnumDeserializer.class)
  public enum ViewedStatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNREAD("Unread"),
    READ("Read"),
    ALL("All");

    private String value;

    ViewedStatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ViewedStatusEnum fromString(String key) {
      if (key == null) return null;

      for (ViewedStatusEnum value : ViewedStatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ViewedStatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ViewedStatusEnum viewedStatus = null;
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
    DATESTART("DateStart");

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

  
  /**
   * The rule type of the alerts the query will return
   **/
  public GetAlertQuery ruleType(RuleTypeEnum ruleType) {
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
  public GetAlertQuery queryType(QueryTypeEnum queryType) {
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
   * The status of the alerts the query will return.
   **/
  public GetAlertQuery activeStatus(ActiveStatusEnum activeStatus) {
    this.activeStatus = activeStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The status of the alerts the query will return.")
  @JsonProperty("activeStatus")
  public ActiveStatusEnum getActiveStatus() {
    return activeStatus;
  }
  public void setActiveStatus(ActiveStatusEnum activeStatus) {
    this.activeStatus = activeStatus;
  }


  /**
   * The view status of the alerts the query will return.
   **/
  public GetAlertQuery viewedStatus(ViewedStatusEnum viewedStatus) {
    this.viewedStatus = viewedStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The view status of the alerts the query will return.")
  @JsonProperty("viewedStatus")
  public ViewedStatusEnum getViewedStatus() {
    return viewedStatus;
  }
  public void setViewedStatus(ViewedStatusEnum viewedStatus) {
    this.viewedStatus = viewedStatus;
  }


  /**
   * The page number of the queried response
   **/
  public GetAlertQuery pageNumber(Integer pageNumber) {
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
  public GetAlertQuery pageSize(Integer pageSize) {
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
  public GetAlertQuery sortBy(SortByEnum sortBy) {
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
  public GetAlertQuery sortOrder(SortOrderEnum sortOrder) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAlertQuery getAlertQuery = (GetAlertQuery) o;

    return Objects.equals(this.ruleType, getAlertQuery.ruleType) &&
            Objects.equals(this.queryType, getAlertQuery.queryType) &&
            Objects.equals(this.activeStatus, getAlertQuery.activeStatus) &&
            Objects.equals(this.viewedStatus, getAlertQuery.viewedStatus) &&
            Objects.equals(this.pageNumber, getAlertQuery.pageNumber) &&
            Objects.equals(this.pageSize, getAlertQuery.pageSize) &&
            Objects.equals(this.sortBy, getAlertQuery.sortBy) &&
            Objects.equals(this.sortOrder, getAlertQuery.sortOrder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ruleType, queryType, activeStatus, viewedStatus, pageNumber, pageSize, sortBy, sortOrder);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAlertQuery {\n");
    
    sb.append("    ruleType: ").append(toIndentedString(ruleType)).append("\n");
    sb.append("    queryType: ").append(toIndentedString(queryType)).append("\n");
    sb.append("    activeStatus: ").append(toIndentedString(activeStatus)).append("\n");
    sb.append("    viewedStatus: ").append(toIndentedString(viewedStatus)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    sortBy: ").append(toIndentedString(sortBy)).append("\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
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

