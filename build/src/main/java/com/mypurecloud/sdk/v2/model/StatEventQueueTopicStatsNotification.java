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
import com.mypurecloud.sdk.v2.model.StatEventQueueTopicIntervalMetrics;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * StatEventQueueTopicStatsNotification
 */

public class StatEventQueueTopicStatsNotification  implements Serializable {
  
  private Map<String, String> group = null;
  private List<StatEventQueueTopicIntervalMetrics> data = null;

  public StatEventQueueTopicStatsNotification() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      data = new ArrayList<StatEventQueueTopicIntervalMetrics>();
    }
  }

  
  /**
   **/
  public StatEventQueueTopicStatsNotification group(Map<String, String> group) {
    this.group = group;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("group")
  public Map<String, String> getGroup() {
    return group;
  }
  public void setGroup(Map<String, String> group) {
    this.group = group;
  }


  /**
   **/
  public StatEventQueueTopicStatsNotification data(List<StatEventQueueTopicIntervalMetrics> data) {
    this.data = data;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("data")
  public List<StatEventQueueTopicIntervalMetrics> getData() {
    return data;
  }
  public void setData(List<StatEventQueueTopicIntervalMetrics> data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatEventQueueTopicStatsNotification statEventQueueTopicStatsNotification = (StatEventQueueTopicStatsNotification) o;

    return Objects.equals(this.group, statEventQueueTopicStatsNotification.group) &&
            Objects.equals(this.data, statEventQueueTopicStatsNotification.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(group, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatEventQueueTopicStatsNotification {\n");
    
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

