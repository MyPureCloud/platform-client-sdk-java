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
import com.mypurecloud.sdk.v2.model.TaskManagementObservationQueryFilter;
import com.mypurecloud.sdk.v2.model.TaskManagementQueryMetric;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * TaskManagementObservationQuery
 */

public class TaskManagementObservationQuery  implements Serializable {
  

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
    QUEUEID("queueId"),
    TYPEID("typeId"),
    ASSIGNEEID("assigneeId"),
    STATUSCATEGORY("statusCategory");

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
  private List<TaskManagementQueryMetric> metrics = null;
  private TaskManagementObservationQueryFilter filter = null;

  private static class ExpandsEnumDeserializer extends StdDeserializer<ExpandsEnum> {
    public ExpandsEnumDeserializer() {
      super(ExpandsEnumDeserializer.class);
    }

    @Override
    public ExpandsEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ExpandsEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets expands
   */
 @JsonDeserialize(using = ExpandsEnumDeserializer.class)
  public enum ExpandsEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    TYPE("type"),
    ASSIGNEE("assignee");

    private String value;

    ExpandsEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ExpandsEnum fromString(String key) {
      if (key == null) return null;

      for (ExpandsEnum value : ExpandsEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ExpandsEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<ExpandsEnum> expands = null;

  public TaskManagementObservationQuery() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      groupBy = new ArrayList<GroupByEnum>();
      metrics = new ArrayList<TaskManagementQueryMetric>();
      expands = new ArrayList<ExpandsEnum>();
    }
  }

  
  /**
   * Dimension(s) to group by. Determines how the results will be grouped in the response.
   **/
  public TaskManagementObservationQuery groupBy(List<GroupByEnum> groupBy) {
    this.groupBy = groupBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Dimension(s) to group by. Determines how the results will be grouped in the response.")
  @JsonProperty("groupBy")
  public List<GroupByEnum> getGroupBy() {
    return groupBy;
  }
  public void setGroupBy(List<GroupByEnum> groupBy) {
    this.groupBy = groupBy;
  }


  /**
   * List of metrics to be retrieved. Specifies which observational metrics should be included in the response.
   **/
  public TaskManagementObservationQuery metrics(List<TaskManagementQueryMetric> metrics) {
    this.metrics = metrics;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "List of metrics to be retrieved. Specifies which observational metrics should be included in the response.")
  @JsonProperty("metrics")
  public List<TaskManagementQueryMetric> getMetrics() {
    return metrics;
  }
  public void setMetrics(List<TaskManagementQueryMetric> metrics) {
    this.metrics = metrics;
  }


  /**
   * Filter to return a subset of observations.
   **/
  public TaskManagementObservationQuery filter(TaskManagementObservationQueryFilter filter) {
    this.filter = filter;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Filter to return a subset of observations.")
  @JsonProperty("filter")
  public TaskManagementObservationQueryFilter getFilter() {
    return filter;
  }
  public void setFilter(TaskManagementObservationQueryFilter filter) {
    this.filter = filter;
  }


  /**
   * List of properties to expand. Additional details about the objects returned in the results will be included in the response if supplied.
   **/
  public TaskManagementObservationQuery expands(List<ExpandsEnum> expands) {
    this.expands = expands;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of properties to expand. Additional details about the objects returned in the results will be included in the response if supplied.")
  @JsonProperty("expands")
  public List<ExpandsEnum> getExpands() {
    return expands;
  }
  public void setExpands(List<ExpandsEnum> expands) {
    this.expands = expands;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskManagementObservationQuery taskManagementObservationQuery = (TaskManagementObservationQuery) o;

    return Objects.equals(this.groupBy, taskManagementObservationQuery.groupBy) &&
            Objects.equals(this.metrics, taskManagementObservationQuery.metrics) &&
            Objects.equals(this.filter, taskManagementObservationQuery.filter) &&
            Objects.equals(this.expands, taskManagementObservationQuery.expands);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupBy, metrics, filter, expands);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskManagementObservationQuery {\n");
    
    sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    expands: ").append(toIndentedString(expands)).append("\n");
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

