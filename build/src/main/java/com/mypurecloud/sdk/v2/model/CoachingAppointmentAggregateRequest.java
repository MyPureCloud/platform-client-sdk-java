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
import com.mypurecloud.sdk.v2.model.QueryRequestFilter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * CoachingAppointmentAggregateRequest
 */

public class CoachingAppointmentAggregateRequest  implements Serializable {
  
  private String interval = null;

  private static class MetricsEnumDeserializer extends StdDeserializer<MetricsEnum> {
    public MetricsEnumDeserializer() {
      super(MetricsEnumDeserializer.class);
    }

    @Override
    public MetricsEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return MetricsEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets metrics
   */
 @JsonDeserialize(using = MetricsEnumDeserializer.class)
  public enum MetricsEnum {
    NACTIVITIES("nActivities"),
    NPLANNEDACTIVITIES("nPlannedActivities"),
    NINPROGRESSACTIVITIES("nInProgressActivities"),
    NCOMPLETEACTIVITIES("nCompleteActivities"),
    NOVERDUEACTIVITIES("nOverdueActivities"),
    NINVALIDSCHEDULEACTIVITIES("nInvalidScheduleActivities");

    private String value;

    MetricsEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static MetricsEnum fromString(String key) {
      if (key == null) return null;

      for (MetricsEnum value : MetricsEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return MetricsEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<MetricsEnum> metrics = new ArrayList<MetricsEnum>();

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
    ATTENDEEID("attendeeId");

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
  private List<GroupByEnum> groupBy = new ArrayList<GroupByEnum>();
  private QueryRequestFilter filter = null;

  
  /**
   * Interval to aggregate across. End date is not inclusive. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss
   **/
  public CoachingAppointmentAggregateRequest interval(String interval) {
    this.interval = interval;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Interval to aggregate across. End date is not inclusive. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss")
  @JsonProperty("interval")
  public String getInterval() {
    return interval;
  }
  public void setInterval(String interval) {
    this.interval = interval;
  }

  
  /**
   * A list of metrics to aggregate.  If omitted, all metrics are returned.
   **/
  public CoachingAppointmentAggregateRequest metrics(List<MetricsEnum> metrics) {
    this.metrics = metrics;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of metrics to aggregate.  If omitted, all metrics are returned.")
  @JsonProperty("metrics")
  public List<MetricsEnum> getMetrics() {
    return metrics;
  }
  public void setMetrics(List<MetricsEnum> metrics) {
    this.metrics = metrics;
  }

  
  /**
   * An optional list of items by which to group the result data.
   **/
  public CoachingAppointmentAggregateRequest groupBy(List<GroupByEnum> groupBy) {
    this.groupBy = groupBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "An optional list of items by which to group the result data.")
  @JsonProperty("groupBy")
  public List<GroupByEnum> getGroupBy() {
    return groupBy;
  }
  public void setGroupBy(List<GroupByEnum> groupBy) {
    this.groupBy = groupBy;
  }

  
  /**
   * The filter applied to the data
   **/
  public CoachingAppointmentAggregateRequest filter(QueryRequestFilter filter) {
    this.filter = filter;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The filter applied to the data")
  @JsonProperty("filter")
  public QueryRequestFilter getFilter() {
    return filter;
  }
  public void setFilter(QueryRequestFilter filter) {
    this.filter = filter;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoachingAppointmentAggregateRequest coachingAppointmentAggregateRequest = (CoachingAppointmentAggregateRequest) o;
    return Objects.equals(this.interval, coachingAppointmentAggregateRequest.interval) &&
        Objects.equals(this.metrics, coachingAppointmentAggregateRequest.metrics) &&
        Objects.equals(this.groupBy, coachingAppointmentAggregateRequest.groupBy) &&
        Objects.equals(this.filter, coachingAppointmentAggregateRequest.filter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interval, metrics, groupBy, filter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoachingAppointmentAggregateRequest {\n");
    
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
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

