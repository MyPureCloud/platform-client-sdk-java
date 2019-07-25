package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.AnalyticsQueryFilter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * AsyncConversationQuery
 */

public class AsyncConversationQuery  implements Serializable {
  
  private String interval = null;
  private List<AnalyticsQueryFilter> conversationFilters = new ArrayList<AnalyticsQueryFilter>();
  private List<AnalyticsQueryFilter> evaluationFilters = new ArrayList<AnalyticsQueryFilter>();
  private List<AnalyticsQueryFilter> surveyFilters = new ArrayList<AnalyticsQueryFilter>();
  private List<AnalyticsQueryFilter> mediaEndpointStatFilters = new ArrayList<AnalyticsQueryFilter>();
  private List<AnalyticsQueryFilter> segmentFilters = new ArrayList<AnalyticsQueryFilter>();

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
  private Integer limit = null;

  
  /**
   * Specifies the date and time range of data being queried. Results will include conversations that both started on a day touched by the interval AND either started, ended, or any activity during the interval. Conversations that started before the earliest day of the interval will not be searched. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss
   **/
  public AsyncConversationQuery interval(String interval) {
    this.interval = interval;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Specifies the date and time range of data being queried. Results will include conversations that both started on a day touched by the interval AND either started, ended, or any activity during the interval. Conversations that started before the earliest day of the interval will not be searched. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss")
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
  public AsyncConversationQuery conversationFilters(List<AnalyticsQueryFilter> conversationFilters) {
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
  public AsyncConversationQuery evaluationFilters(List<AnalyticsQueryFilter> evaluationFilters) {
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
   * Filters that target quality management survey-level data
   **/
  public AsyncConversationQuery surveyFilters(List<AnalyticsQueryFilter> surveyFilters) {
    this.surveyFilters = surveyFilters;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Filters that target quality management survey-level data")
  @JsonProperty("surveyFilters")
  public List<AnalyticsQueryFilter> getSurveyFilters() {
    return surveyFilters;
  }
  public void setSurveyFilters(List<AnalyticsQueryFilter> surveyFilters) {
    this.surveyFilters = surveyFilters;
  }

  
  /**
   * Filters that target call quality of service data
   **/
  public AsyncConversationQuery mediaEndpointStatFilters(List<AnalyticsQueryFilter> mediaEndpointStatFilters) {
    this.mediaEndpointStatFilters = mediaEndpointStatFilters;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Filters that target call quality of service data")
  @JsonProperty("mediaEndpointStatFilters")
  public List<AnalyticsQueryFilter> getMediaEndpointStatFilters() {
    return mediaEndpointStatFilters;
  }
  public void setMediaEndpointStatFilters(List<AnalyticsQueryFilter> mediaEndpointStatFilters) {
    this.mediaEndpointStatFilters = mediaEndpointStatFilters;
  }

  
  /**
   * Filters that target individual segments within a conversation
   **/
  public AsyncConversationQuery segmentFilters(List<AnalyticsQueryFilter> segmentFilters) {
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
   * Sort the result set in ascending/descending order. Default is ascending
   **/
  public AsyncConversationQuery order(OrderEnum order) {
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
  public AsyncConversationQuery orderBy(OrderByEnum orderBy) {
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

  
  /**
   * Specify number of results to be returned
   **/
  public AsyncConversationQuery limit(Integer limit) {
    this.limit = limit;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Specify number of results to be returned")
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
    AsyncConversationQuery asyncConversationQuery = (AsyncConversationQuery) o;
    return Objects.equals(this.interval, asyncConversationQuery.interval) &&
        Objects.equals(this.conversationFilters, asyncConversationQuery.conversationFilters) &&
        Objects.equals(this.evaluationFilters, asyncConversationQuery.evaluationFilters) &&
        Objects.equals(this.surveyFilters, asyncConversationQuery.surveyFilters) &&
        Objects.equals(this.mediaEndpointStatFilters, asyncConversationQuery.mediaEndpointStatFilters) &&
        Objects.equals(this.segmentFilters, asyncConversationQuery.segmentFilters) &&
        Objects.equals(this.order, asyncConversationQuery.order) &&
        Objects.equals(this.orderBy, asyncConversationQuery.orderBy) &&
        Objects.equals(this.limit, asyncConversationQuery.limit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interval, conversationFilters, evaluationFilters, surveyFilters, mediaEndpointStatFilters, segmentFilters, order, orderBy, limit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AsyncConversationQuery {\n");
    
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    conversationFilters: ").append(toIndentedString(conversationFilters)).append("\n");
    sb.append("    evaluationFilters: ").append(toIndentedString(evaluationFilters)).append("\n");
    sb.append("    surveyFilters: ").append(toIndentedString(surveyFilters)).append("\n");
    sb.append("    mediaEndpointStatFilters: ").append(toIndentedString(mediaEndpointStatFilters)).append("\n");
    sb.append("    segmentFilters: ").append(toIndentedString(segmentFilters)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
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

