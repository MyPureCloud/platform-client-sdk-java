package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.AnalyticsQueryAggregation;
import com.mypurecloud.sdk.v2.model.AnalyticsQueryFilter;
import com.mypurecloud.sdk.v2.model.PagingSpec;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ConversationQuery
 */

public class ConversationQuery  implements Serializable {
  
  private String interval = null;
  private List<AnalyticsQueryFilter> conversationFilters = new ArrayList<AnalyticsQueryFilter>();
  private List<AnalyticsQueryFilter> evaluationFilters = new ArrayList<AnalyticsQueryFilter>();
  private List<AnalyticsQueryFilter> segmentFilters = new ArrayList<AnalyticsQueryFilter>();
  private List<AnalyticsQueryAggregation> aggregations = new ArrayList<AnalyticsQueryAggregation>();
  private PagingSpec paging = null;

  /**
   * Sort the result set in ascending/descending order. Default is ascending
   */
  public enum OrderEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ASC("asc"),
    DESC("desc");

    private String value;

    OrderEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static OrderEnum fromString(String key) {
      if (key == null) return null;

      for (OrderEnum value : OrderEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return OrderEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private OrderEnum order = null;

  /**
   * Specify which data element within the result set to use for sorting. The options  to use as a basis for sorting the results: conversationStart, segmentStart, and segmentEnd. If not specified, the default is conversationStart
   */
  public enum OrderByEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    CONVERSATIONSTART("conversationStart"),
    CONVERSATIONEND("conversationEnd"),
    SEGMENTSTART("segmentStart"),
    SEGMENTEND("segmentEnd");

    private String value;

    OrderByEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static OrderByEnum fromString(String key) {
      if (key == null) return null;

      for (OrderByEnum value : OrderByEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return OrderByEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private OrderByEnum orderBy = null;

  
  /**
   * Specifies the date and time range of data being queried. Results will include conversations that started, ended, or had any activity during the interval. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss
   **/
  public ConversationQuery interval(String interval) {
    this.interval = interval;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Specifies the date and time range of data being queried. Results will include conversations that started, ended, or had any activity during the interval. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss")
  @JsonProperty("interval")
  public String getInterval() {
    return interval;
  }
  public void setInterval(String interval) {
    this.interval = interval;
  }

  
  /**
   * Filters that target conversation-level data
   **/
  public ConversationQuery conversationFilters(List<AnalyticsQueryFilter> conversationFilters) {
    this.conversationFilters = conversationFilters;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Filters that target conversation-level data")
  @JsonProperty("conversationFilters")
  public List<AnalyticsQueryFilter> getConversationFilters() {
    return conversationFilters;
  }
  public void setConversationFilters(List<AnalyticsQueryFilter> conversationFilters) {
    this.conversationFilters = conversationFilters;
  }

  
  /**
   * Filters that target quality management evaluation-level data
   **/
  public ConversationQuery evaluationFilters(List<AnalyticsQueryFilter> evaluationFilters) {
    this.evaluationFilters = evaluationFilters;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Filters that target quality management evaluation-level data")
  @JsonProperty("evaluationFilters")
  public List<AnalyticsQueryFilter> getEvaluationFilters() {
    return evaluationFilters;
  }
  public void setEvaluationFilters(List<AnalyticsQueryFilter> evaluationFilters) {
    this.evaluationFilters = evaluationFilters;
  }

  
  /**
   * Filters that target individual segments within a conversation
   **/
  public ConversationQuery segmentFilters(List<AnalyticsQueryFilter> segmentFilters) {
    this.segmentFilters = segmentFilters;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Filters that target individual segments within a conversation")
  @JsonProperty("segmentFilters")
  public List<AnalyticsQueryFilter> getSegmentFilters() {
    return segmentFilters;
  }
  public void setSegmentFilters(List<AnalyticsQueryFilter> segmentFilters) {
    this.segmentFilters = segmentFilters;
  }

  
  /**
   * Include faceted search and aggregate roll-ups describing your search results. This does not function as a filter, but rather, summary data about the data matching your filters
   **/
  public ConversationQuery aggregations(List<AnalyticsQueryAggregation> aggregations) {
    this.aggregations = aggregations;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Include faceted search and aggregate roll-ups describing your search results. This does not function as a filter, but rather, summary data about the data matching your filters")
  @JsonProperty("aggregations")
  public List<AnalyticsQueryAggregation> getAggregations() {
    return aggregations;
  }
  public void setAggregations(List<AnalyticsQueryAggregation> aggregations) {
    this.aggregations = aggregations;
  }

  
  /**
   * Page size and number to control iterating through large result sets. Default page size is 25
   **/
  public ConversationQuery paging(PagingSpec paging) {
    this.paging = paging;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Page size and number to control iterating through large result sets. Default page size is 25")
  @JsonProperty("paging")
  public PagingSpec getPaging() {
    return paging;
  }
  public void setPaging(PagingSpec paging) {
    this.paging = paging;
  }

  
  /**
   * Sort the result set in ascending/descending order. Default is ascending
   **/
  public ConversationQuery order(OrderEnum order) {
    this.order = order;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Sort the result set in ascending/descending order. Default is ascending")
  @JsonProperty("order")
  public OrderEnum getOrder() {
    return order;
  }
  public void setOrder(OrderEnum order) {
    this.order = order;
  }

  
  /**
   * Specify which data element within the result set to use for sorting. The options  to use as a basis for sorting the results: conversationStart, segmentStart, and segmentEnd. If not specified, the default is conversationStart
   **/
  public ConversationQuery orderBy(OrderByEnum orderBy) {
    this.orderBy = orderBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Specify which data element within the result set to use for sorting. The options  to use as a basis for sorting the results: conversationStart, segmentStart, and segmentEnd. If not specified, the default is conversationStart")
  @JsonProperty("orderBy")
  public OrderByEnum getOrderBy() {
    return orderBy;
  }
  public void setOrderBy(OrderByEnum orderBy) {
    this.orderBy = orderBy;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationQuery conversationQuery = (ConversationQuery) o;
    return Objects.equals(this.interval, conversationQuery.interval) &&
        Objects.equals(this.conversationFilters, conversationQuery.conversationFilters) &&
        Objects.equals(this.evaluationFilters, conversationQuery.evaluationFilters) &&
        Objects.equals(this.segmentFilters, conversationQuery.segmentFilters) &&
        Objects.equals(this.aggregations, conversationQuery.aggregations) &&
        Objects.equals(this.paging, conversationQuery.paging) &&
        Objects.equals(this.order, conversationQuery.order) &&
        Objects.equals(this.orderBy, conversationQuery.orderBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interval, conversationFilters, evaluationFilters, segmentFilters, aggregations, paging, order, orderBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationQuery {\n");
    
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    conversationFilters: ").append(toIndentedString(conversationFilters)).append("\n");
    sb.append("    evaluationFilters: ").append(toIndentedString(evaluationFilters)).append("\n");
    sb.append("    segmentFilters: ").append(toIndentedString(segmentFilters)).append("\n");
    sb.append("    aggregations: ").append(toIndentedString(aggregations)).append("\n");
    sb.append("    paging: ").append(toIndentedString(paging)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
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

