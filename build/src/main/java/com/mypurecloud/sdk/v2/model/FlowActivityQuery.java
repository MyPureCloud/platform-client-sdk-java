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
import com.mypurecloud.sdk.v2.model.FlowActivityQueryFilter;
import com.mypurecloud.sdk.v2.model.FlowActivityQueryMetric;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * FlowActivityQuery
 */

public class FlowActivityQuery  implements Serializable {
  
  private List<FlowActivityQueryMetric> metrics = null;

  private static class GroupByEnumDeserializer extends StdDeserializer<GroupByEnum> {
    public GroupByEnumDeserializer() {
      super(GroupByEnumDeserializer.class);
    }

    @Override
    public GroupByEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return GroupByEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets groupBy
   */
 @JsonDeserialize(using = GroupByEnumDeserializer.class)
  public enum GroupByEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ACTIVEROUTING("activeRouting"),
    ADDRESSFROM("addressFrom"),
    ADDRESSTO("addressTo"),
    AGENTSCORE("agentScore"),
    ANI("ani"),
    CONVERSATIONID("conversationId"),
    CONVERTEDFROM("convertedFrom"),
    CONVERTEDTO("convertedTo"),
    DIRECTION("direction"),
    DNIS("dnis"),
    FLOWID("flowId"),
    FLOWTYPE("flowType"),
    MEDIATYPE("mediaType"),
    PARTICIPANTNAME("participantName"),
    QUEUEID("queueId"),
    REQUESTEDLANGUAGEID("requestedLanguageId"),
    REQUESTEDROUTING("requestedRouting"),
    REQUESTEDROUTINGSKILLID("requestedRoutingSkillId"),
    ROUTINGPRIORITY("routingPriority"),
    SCOREDAGENTID("scoredAgentId"),
    SESSIONID("sessionId"),
    TEAMID("teamId"),
    USEDROUTING("usedRouting"),
    USERID("userId");

    private String value;

    GroupByEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static GroupByEnum fromString(String key) {
      if (key == null) return null;

      for (GroupByEnum value : GroupByEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return GroupByEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<GroupByEnum> groupBy = null;
  private FlowActivityQueryFilter filter = null;

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
    DESC("desc"),
    UNORDERED("unordered");

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

  public FlowActivityQuery() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      metrics = new ArrayList<FlowActivityQueryMetric>();
      groupBy = new ArrayList<GroupByEnum>();
    }
  }

  
  /**
   * List of requested metrics
   **/
  public FlowActivityQuery metrics(List<FlowActivityQueryMetric> metrics) {
    this.metrics = metrics;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "List of requested metrics")
  @JsonProperty("metrics")
  public List<FlowActivityQueryMetric> getMetrics() {
    return metrics;
  }
  public void setMetrics(List<FlowActivityQueryMetric> metrics) {
    this.metrics = metrics;
  }


  /**
   * Dimension(s) to group by
   **/
  public FlowActivityQuery groupBy(List<GroupByEnum> groupBy) {
    this.groupBy = groupBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Dimension(s) to group by")
  @JsonProperty("groupBy")
  public List<GroupByEnum> getGroupBy() {
    return groupBy;
  }
  public void setGroupBy(List<GroupByEnum> groupBy) {
    this.groupBy = groupBy;
  }


  /**
   * Filter to return a subset of observations. Expresses boolean logical predicates as well as dimensional filters
   **/
  public FlowActivityQuery filter(FlowActivityQueryFilter filter) {
    this.filter = filter;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Filter to return a subset of observations. Expresses boolean logical predicates as well as dimensional filters")
  @JsonProperty("filter")
  public FlowActivityQueryFilter getFilter() {
    return filter;
  }
  public void setFilter(FlowActivityQueryFilter filter) {
    this.filter = filter;
  }


  /**
   * Sort the result set in ascending/descending order. Default is ascending
   **/
  public FlowActivityQuery order(OrderEnum order) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlowActivityQuery flowActivityQuery = (FlowActivityQuery) o;

    return Objects.equals(this.metrics, flowActivityQuery.metrics) &&
            Objects.equals(this.groupBy, flowActivityQuery.groupBy) &&
            Objects.equals(this.filter, flowActivityQuery.filter) &&
            Objects.equals(this.order, flowActivityQuery.order);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metrics, groupBy, filter, order);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlowActivityQuery {\n");
    
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
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

