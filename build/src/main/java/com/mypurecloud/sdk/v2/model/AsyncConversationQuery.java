package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.Objects;
import java.io.IOException;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.ConversationDetailQueryFilter;
import com.mypurecloud.sdk.v2.model.EvaluationDetailQueryFilter;
import com.mypurecloud.sdk.v2.model.ResolutionDetailQueryFilter;
import com.mypurecloud.sdk.v2.model.SegmentDetailQueryFilter;
import com.mypurecloud.sdk.v2.model.SurveyDetailQueryFilter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * AsyncConversationQuery
 */

public class AsyncConversationQuery  implements Serializable {
  
  private List<ConversationDetailQueryFilter> conversationFilters = new ArrayList<ConversationDetailQueryFilter>();
  private List<SegmentDetailQueryFilter> segmentFilters = new ArrayList<SegmentDetailQueryFilter>();
  private List<EvaluationDetailQueryFilter> evaluationFilters = new ArrayList<EvaluationDetailQueryFilter>();
  private List<SurveyDetailQueryFilter> surveyFilters = new ArrayList<SurveyDetailQueryFilter>();
  private List<ResolutionDetailQueryFilter> resolutionFilters = new ArrayList<ResolutionDetailQueryFilter>();

  private static class OrderEnumDeserializer extends StdDeserializer<OrderEnum> {
    public OrderEnumDeserializer() {
      super(OrderEnumDeserializer.class);
    }

    @Override
    public OrderEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return OrderEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Sort the result set in ascending/descending order. Default is ascending
   */
 @JsonDeserialize(using = OrderEnumDeserializer.class)
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

  private static class OrderByEnumDeserializer extends StdDeserializer<OrderByEnum> {
    public OrderByEnumDeserializer() {
      super(OrderByEnumDeserializer.class);
    }

    @Override
    public OrderByEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return OrderByEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Specify which data element within the result set to use for sorting. The options  to use as a basis for sorting the results: conversationStart, segmentStart, and segmentEnd. If not specified, the default is conversationStart
   */
 @JsonDeserialize(using = OrderByEnumDeserializer.class)
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
  private String interval = null;
  private Integer limit = null;
  private Boolean startOfDayIntervalMatching = null;

  
  /**
   * Filters that target conversation-level data
   **/
  public AsyncConversationQuery conversationFilters(List<ConversationDetailQueryFilter> conversationFilters) {
    this.conversationFilters = conversationFilters;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Filters that target conversation-level data")
  @JsonProperty("conversationFilters")
  public List<ConversationDetailQueryFilter> getConversationFilters() {
    return conversationFilters;
  }
  public void setConversationFilters(List<ConversationDetailQueryFilter> conversationFilters) {
    this.conversationFilters = conversationFilters;
  }

  
  /**
   * Filters that target individual segments within a conversation
   **/
  public AsyncConversationQuery segmentFilters(List<SegmentDetailQueryFilter> segmentFilters) {
    this.segmentFilters = segmentFilters;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Filters that target individual segments within a conversation")
  @JsonProperty("segmentFilters")
  public List<SegmentDetailQueryFilter> getSegmentFilters() {
    return segmentFilters;
  }
  public void setSegmentFilters(List<SegmentDetailQueryFilter> segmentFilters) {
    this.segmentFilters = segmentFilters;
  }

  
  /**
   * Filters that target evaluations
   **/
  public AsyncConversationQuery evaluationFilters(List<EvaluationDetailQueryFilter> evaluationFilters) {
    this.evaluationFilters = evaluationFilters;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Filters that target evaluations")
  @JsonProperty("evaluationFilters")
  public List<EvaluationDetailQueryFilter> getEvaluationFilters() {
    return evaluationFilters;
  }
  public void setEvaluationFilters(List<EvaluationDetailQueryFilter> evaluationFilters) {
    this.evaluationFilters = evaluationFilters;
  }

  
  /**
   * Filters that target surveys
   **/
  public AsyncConversationQuery surveyFilters(List<SurveyDetailQueryFilter> surveyFilters) {
    this.surveyFilters = surveyFilters;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Filters that target surveys")
  @JsonProperty("surveyFilters")
  public List<SurveyDetailQueryFilter> getSurveyFilters() {
    return surveyFilters;
  }
  public void setSurveyFilters(List<SurveyDetailQueryFilter> surveyFilters) {
    this.surveyFilters = surveyFilters;
  }

  
  /**
   * Filters that target resolutions
   **/
  public AsyncConversationQuery resolutionFilters(List<ResolutionDetailQueryFilter> resolutionFilters) {
    this.resolutionFilters = resolutionFilters;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Filters that target resolutions")
  @JsonProperty("resolutionFilters")
  public List<ResolutionDetailQueryFilter> getResolutionFilters() {
    return resolutionFilters;
  }
  public void setResolutionFilters(List<ResolutionDetailQueryFilter> resolutionFilters) {
    this.resolutionFilters = resolutionFilters;
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
   * Specifies the date and time range of data being queried. Results will include all conversations that had activity during the interval. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss
   **/
  public AsyncConversationQuery interval(String interval) {
    this.interval = interval;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Specifies the date and time range of data being queried. Results will include all conversations that had activity during the interval. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss")
  @JsonProperty("interval")
  public String getInterval() {
    return interval;
  }
  public void setInterval(String interval) {
    this.interval = interval;
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

  
  /**
   * Add a filter to only include conversations that started after the beginning of the interval start date (UTC)
   **/
  public AsyncConversationQuery startOfDayIntervalMatching(Boolean startOfDayIntervalMatching) {
    this.startOfDayIntervalMatching = startOfDayIntervalMatching;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Add a filter to only include conversations that started after the beginning of the interval start date (UTC)")
  @JsonProperty("startOfDayIntervalMatching")
  public Boolean getStartOfDayIntervalMatching() {
    return startOfDayIntervalMatching;
  }
  public void setStartOfDayIntervalMatching(Boolean startOfDayIntervalMatching) {
    this.startOfDayIntervalMatching = startOfDayIntervalMatching;
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
    return Objects.equals(this.conversationFilters, asyncConversationQuery.conversationFilters) &&
        Objects.equals(this.segmentFilters, asyncConversationQuery.segmentFilters) &&
        Objects.equals(this.evaluationFilters, asyncConversationQuery.evaluationFilters) &&
        Objects.equals(this.surveyFilters, asyncConversationQuery.surveyFilters) &&
        Objects.equals(this.resolutionFilters, asyncConversationQuery.resolutionFilters) &&
        Objects.equals(this.order, asyncConversationQuery.order) &&
        Objects.equals(this.orderBy, asyncConversationQuery.orderBy) &&
        Objects.equals(this.interval, asyncConversationQuery.interval) &&
        Objects.equals(this.limit, asyncConversationQuery.limit) &&
        Objects.equals(this.startOfDayIntervalMatching, asyncConversationQuery.startOfDayIntervalMatching);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversationFilters, segmentFilters, evaluationFilters, surveyFilters, resolutionFilters, order, orderBy, interval, limit, startOfDayIntervalMatching);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AsyncConversationQuery {\n");
    
    sb.append("    conversationFilters: ").append(toIndentedString(conversationFilters)).append("\n");
    sb.append("    segmentFilters: ").append(toIndentedString(segmentFilters)).append("\n");
    sb.append("    evaluationFilters: ").append(toIndentedString(evaluationFilters)).append("\n");
    sb.append("    surveyFilters: ").append(toIndentedString(surveyFilters)).append("\n");
    sb.append("    resolutionFilters: ").append(toIndentedString(resolutionFilters)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    startOfDayIntervalMatching: ").append(toIndentedString(startOfDayIntervalMatching)).append("\n");
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

