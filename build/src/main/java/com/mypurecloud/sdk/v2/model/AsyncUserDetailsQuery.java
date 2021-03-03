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
import com.mypurecloud.sdk.v2.model.PresenceDetailQueryFilter;
import com.mypurecloud.sdk.v2.model.RoutingStatusDetailQueryFilter;
import com.mypurecloud.sdk.v2.model.UserDetailQueryFilter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * AsyncUserDetailsQuery
 */

public class AsyncUserDetailsQuery  implements Serializable {
  
  private String interval = null;
  private List<UserDetailQueryFilter> userFilters = new ArrayList<UserDetailQueryFilter>();
  private List<PresenceDetailQueryFilter> presenceFilters = new ArrayList<PresenceDetailQueryFilter>();
  private List<RoutingStatusDetailQueryFilter> routingStatusFilters = new ArrayList<RoutingStatusDetailQueryFilter>();

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
  private Integer limit = null;

  
  /**
   * Specifies the date and time range of data being queried. Conversations MUST have started within this time range to potentially be included within the result set. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss
   **/
  public AsyncUserDetailsQuery interval(String interval) {
    this.interval = interval;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Specifies the date and time range of data being queried. Conversations MUST have started within this time range to potentially be included within the result set. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss")
  @JsonProperty("interval")
  public String getInterval() {
    return interval;
  }
  public void setInterval(String interval) {
    this.interval = interval;
  }

  
  /**
   * Filters that target the users to retrieve data for
   **/
  public AsyncUserDetailsQuery userFilters(List<UserDetailQueryFilter> userFilters) {
    this.userFilters = userFilters;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Filters that target the users to retrieve data for")
  @JsonProperty("userFilters")
  public List<UserDetailQueryFilter> getUserFilters() {
    return userFilters;
  }
  public void setUserFilters(List<UserDetailQueryFilter> userFilters) {
    this.userFilters = userFilters;
  }

  
  /**
   * Filters that target system and organization presence-level data
   **/
  public AsyncUserDetailsQuery presenceFilters(List<PresenceDetailQueryFilter> presenceFilters) {
    this.presenceFilters = presenceFilters;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Filters that target system and organization presence-level data")
  @JsonProperty("presenceFilters")
  public List<PresenceDetailQueryFilter> getPresenceFilters() {
    return presenceFilters;
  }
  public void setPresenceFilters(List<PresenceDetailQueryFilter> presenceFilters) {
    this.presenceFilters = presenceFilters;
  }

  
  /**
   * Filters that target agent routing status-level data
   **/
  public AsyncUserDetailsQuery routingStatusFilters(List<RoutingStatusDetailQueryFilter> routingStatusFilters) {
    this.routingStatusFilters = routingStatusFilters;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Filters that target agent routing status-level data")
  @JsonProperty("routingStatusFilters")
  public List<RoutingStatusDetailQueryFilter> getRoutingStatusFilters() {
    return routingStatusFilters;
  }
  public void setRoutingStatusFilters(List<RoutingStatusDetailQueryFilter> routingStatusFilters) {
    this.routingStatusFilters = routingStatusFilters;
  }

  
  /**
   * Sort the result set in ascending/descending order. Default is ascending
   **/
  public AsyncUserDetailsQuery order(OrderEnum order) {
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
   * Specify number of results to be returned
   **/
  public AsyncUserDetailsQuery limit(Integer limit) {
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
    AsyncUserDetailsQuery asyncUserDetailsQuery = (AsyncUserDetailsQuery) o;
    return Objects.equals(this.interval, asyncUserDetailsQuery.interval) &&
        Objects.equals(this.userFilters, asyncUserDetailsQuery.userFilters) &&
        Objects.equals(this.presenceFilters, asyncUserDetailsQuery.presenceFilters) &&
        Objects.equals(this.routingStatusFilters, asyncUserDetailsQuery.routingStatusFilters) &&
        Objects.equals(this.order, asyncUserDetailsQuery.order) &&
        Objects.equals(this.limit, asyncUserDetailsQuery.limit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interval, userFilters, presenceFilters, routingStatusFilters, order, limit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AsyncUserDetailsQuery {\n");
    
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    userFilters: ").append(toIndentedString(userFilters)).append("\n");
    sb.append("    presenceFilters: ").append(toIndentedString(presenceFilters)).append("\n");
    sb.append("    routingStatusFilters: ").append(toIndentedString(routingStatusFilters)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
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

