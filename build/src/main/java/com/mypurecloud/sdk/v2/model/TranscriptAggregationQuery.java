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
import com.mypurecloud.sdk.v2.model.TranscriptAggregateQueryFilter;
import com.mypurecloud.sdk.v2.model.TranscriptAggregationView;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * TranscriptAggregationQuery
 */

public class TranscriptAggregationQuery  implements Serializable {
  
  private String interval = null;
  private String granularity = null;
  private String timeZone = null;

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
    ADDRESSFROM("addressFrom"),
    ADDRESSTO("addressTo"),
    ANI("ani"),
    CHANNEL("channel"),
    CONVERSATIONID("conversationId"),
    DIRECTION("direction"),
    DIVISIONID("divisionId"),
    DNIS("dnis"),
    FLOWID("flowId"),
    FLOWVERSION("flowVersion"),
    MEDIATYPE("mediaType"),
    MESSAGETYPE("messageType"),
    QUEUEID("queueId"),
    TEAMID("teamId"),
    TOPICID("topicId"),
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
  private List<GroupByEnum> groupBy = new ArrayList<GroupByEnum>();
  private TranscriptAggregateQueryFilter filter = null;

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
    NTOPICCOMMUNICATIONS("nTopicCommunications"),
    OCUSTOMERSENTIMENT("oCustomerSentiment"),
    OSENTIMENTSCORE("oSentimentScore");

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
  private Boolean flattenMultivaluedDimensions = null;
  private List<TranscriptAggregationView> views = new ArrayList<TranscriptAggregationView>();

  private static class AlternateTimeDimensionEnumDeserializer extends StdDeserializer<AlternateTimeDimensionEnum> {
    public AlternateTimeDimensionEnumDeserializer() {
      super(AlternateTimeDimensionEnumDeserializer.class);
    }

    @Override
    public AlternateTimeDimensionEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return AlternateTimeDimensionEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Dimension to use as the alternative timestamp for data in the aggregate.  Choosing \"eventTime\" uses the actual time of the data event.
   */
 @JsonDeserialize(using = AlternateTimeDimensionEnumDeserializer.class)
  public enum AlternateTimeDimensionEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    EVENTTIME("eventTime");

    private String value;

    AlternateTimeDimensionEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static AlternateTimeDimensionEnum fromString(String key) {
      if (key == null) return null;

      for (AlternateTimeDimensionEnum value : AlternateTimeDimensionEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return AlternateTimeDimensionEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private AlternateTimeDimensionEnum alternateTimeDimension = null;

  
  /**
   * Behaves like one clause in a SQL WHERE. Specifies the date and time range of data being queried. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss
   **/
  public TranscriptAggregationQuery interval(String interval) {
    this.interval = interval;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Behaves like one clause in a SQL WHERE. Specifies the date and time range of data being queried. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss")
  @JsonProperty("interval")
  public String getInterval() {
    return interval;
  }
  public void setInterval(String interval) {
    this.interval = interval;
  }

  
  /**
   * Granularity aggregates metrics into subpartitions within the time interval specified. The default granularity is the same duration as the interval. Periods are represented as an ISO-8601 string. For example: P1D or P1DT12H
   **/
  public TranscriptAggregationQuery granularity(String granularity) {
    this.granularity = granularity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Granularity aggregates metrics into subpartitions within the time interval specified. The default granularity is the same duration as the interval. Periods are represented as an ISO-8601 string. For example: P1D or P1DT12H")
  @JsonProperty("granularity")
  public String getGranularity() {
    return granularity;
  }
  public void setGranularity(String granularity) {
    this.granularity = granularity;
  }

  
  /**
   * Time zone context used to calculate response intervals (this allows resolving DST changes). The interval offset is used even when timeZone is specified. Default is UTC. Time zones are represented as a string of the zone name as found in the IANA time zone database. For example: UTC, Etc/UTC, or Europe/London
   **/
  public TranscriptAggregationQuery timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Time zone context used to calculate response intervals (this allows resolving DST changes). The interval offset is used even when timeZone is specified. Default is UTC. Time zones are represented as a string of the zone name as found in the IANA time zone database. For example: UTC, Etc/UTC, or Europe/London")
  @JsonProperty("timeZone")
  public String getTimeZone() {
    return timeZone;
  }
  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }

  
  /**
   * Behaves like a SQL GROUPBY. Allows for multiple levels of grouping as a list of dimensions. Partitions resulting aggregate computations into distinct named subgroups rather than across the entire result set as if it were one group.
   **/
  public TranscriptAggregationQuery groupBy(List<GroupByEnum> groupBy) {
    this.groupBy = groupBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Behaves like a SQL GROUPBY. Allows for multiple levels of grouping as a list of dimensions. Partitions resulting aggregate computations into distinct named subgroups rather than across the entire result set as if it were one group.")
  @JsonProperty("groupBy")
  public List<GroupByEnum> getGroupBy() {
    return groupBy;
  }
  public void setGroupBy(List<GroupByEnum> groupBy) {
    this.groupBy = groupBy;
  }

  
  /**
   * Behaves like a SQL WHERE clause. This is ANDed with the interval parameter. Expresses boolean logical predicates as well as dimensional filters
   **/
  public TranscriptAggregationQuery filter(TranscriptAggregateQueryFilter filter) {
    this.filter = filter;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Behaves like a SQL WHERE clause. This is ANDed with the interval parameter. Expresses boolean logical predicates as well as dimensional filters")
  @JsonProperty("filter")
  public TranscriptAggregateQueryFilter getFilter() {
    return filter;
  }
  public void setFilter(TranscriptAggregateQueryFilter filter) {
    this.filter = filter;
  }

  
  /**
   * Behaves like a SQL SELECT clause. Only named metrics will be retrieved.
   **/
  public TranscriptAggregationQuery metrics(List<MetricsEnum> metrics) {
    this.metrics = metrics;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Behaves like a SQL SELECT clause. Only named metrics will be retrieved.")
  @JsonProperty("metrics")
  public List<MetricsEnum> getMetrics() {
    return metrics;
  }
  public void setMetrics(List<MetricsEnum> metrics) {
    this.metrics = metrics;
  }

  
  /**
   * Flattens any multivalued dimensions used in response groups (e.g. ['a','b','c']->'a,b,c')
   **/
  public TranscriptAggregationQuery flattenMultivaluedDimensions(Boolean flattenMultivaluedDimensions) {
    this.flattenMultivaluedDimensions = flattenMultivaluedDimensions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Flattens any multivalued dimensions used in response groups (e.g. ['a','b','c']->'a,b,c')")
  @JsonProperty("flattenMultivaluedDimensions")
  public Boolean getFlattenMultivaluedDimensions() {
    return flattenMultivaluedDimensions;
  }
  public void setFlattenMultivaluedDimensions(Boolean flattenMultivaluedDimensions) {
    this.flattenMultivaluedDimensions = flattenMultivaluedDimensions;
  }

  
  /**
   * Custom derived metric views
   **/
  public TranscriptAggregationQuery views(List<TranscriptAggregationView> views) {
    this.views = views;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Custom derived metric views")
  @JsonProperty("views")
  public List<TranscriptAggregationView> getViews() {
    return views;
  }
  public void setViews(List<TranscriptAggregationView> views) {
    this.views = views;
  }

  
  /**
   * Dimension to use as the alternative timestamp for data in the aggregate.  Choosing \"eventTime\" uses the actual time of the data event.
   **/
  public TranscriptAggregationQuery alternateTimeDimension(AlternateTimeDimensionEnum alternateTimeDimension) {
    this.alternateTimeDimension = alternateTimeDimension;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Dimension to use as the alternative timestamp for data in the aggregate.  Choosing \"eventTime\" uses the actual time of the data event.")
  @JsonProperty("alternateTimeDimension")
  public AlternateTimeDimensionEnum getAlternateTimeDimension() {
    return alternateTimeDimension;
  }
  public void setAlternateTimeDimension(AlternateTimeDimensionEnum alternateTimeDimension) {
    this.alternateTimeDimension = alternateTimeDimension;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TranscriptAggregationQuery transcriptAggregationQuery = (TranscriptAggregationQuery) o;
    return Objects.equals(this.interval, transcriptAggregationQuery.interval) &&
        Objects.equals(this.granularity, transcriptAggregationQuery.granularity) &&
        Objects.equals(this.timeZone, transcriptAggregationQuery.timeZone) &&
        Objects.equals(this.groupBy, transcriptAggregationQuery.groupBy) &&
        Objects.equals(this.filter, transcriptAggregationQuery.filter) &&
        Objects.equals(this.metrics, transcriptAggregationQuery.metrics) &&
        Objects.equals(this.flattenMultivaluedDimensions, transcriptAggregationQuery.flattenMultivaluedDimensions) &&
        Objects.equals(this.views, transcriptAggregationQuery.views) &&
        Objects.equals(this.alternateTimeDimension, transcriptAggregationQuery.alternateTimeDimension);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interval, granularity, timeZone, groupBy, filter, metrics, flattenMultivaluedDimensions, views, alternateTimeDimension);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TranscriptAggregationQuery {\n");
    
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    granularity: ").append(toIndentedString(granularity)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    flattenMultivaluedDimensions: ").append(toIndentedString(flattenMultivaluedDimensions)).append("\n");
    sb.append("    views: ").append(toIndentedString(views)).append("\n");
    sb.append("    alternateTimeDimension: ").append(toIndentedString(alternateTimeDimension)).append("\n");
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

