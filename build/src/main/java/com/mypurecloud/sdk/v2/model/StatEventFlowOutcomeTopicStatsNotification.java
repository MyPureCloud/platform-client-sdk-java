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
import com.mypurecloud.sdk.v2.model.StatEventFlowOutcomeTopicDatum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * StatEventFlowOutcomeTopicStatsNotification
 */

public class StatEventFlowOutcomeTopicStatsNotification  implements Serializable {
  
  private Map<String, String> group = null;
  private List<StatEventFlowOutcomeTopicDatum> data = new ArrayList<StatEventFlowOutcomeTopicDatum>();

  
  /**
   **/
  public StatEventFlowOutcomeTopicStatsNotification group(Map<String, String> group) {
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
  public StatEventFlowOutcomeTopicStatsNotification data(List<StatEventFlowOutcomeTopicDatum> data) {
    this.data = data;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("data")
  public List<StatEventFlowOutcomeTopicDatum> getData() {
    return data;
  }
  public void setData(List<StatEventFlowOutcomeTopicDatum> data) {
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
    StatEventFlowOutcomeTopicStatsNotification statEventFlowOutcomeTopicStatsNotification = (StatEventFlowOutcomeTopicStatsNotification) o;
    return Objects.equals(this.group, statEventFlowOutcomeTopicStatsNotification.group) &&
        Objects.equals(this.data, statEventFlowOutcomeTopicStatsNotification.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(group, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatEventFlowOutcomeTopicStatsNotification {\n");
    
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

