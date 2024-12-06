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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.AgentCopilotAggregateQueryFilter;
import com.mypurecloud.sdk.v2.model.AgentCopilotAggregationView;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * AgentCopilotAsyncAggregationQuery
 */

public class AgentCopilotAsyncAggregationQuery  implements Serializable {
  
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
    AGENTASSISTANTID("agentAssistantId"),
    CANNEDRESPONSEID("cannedResponseId"),
    CANNEDRESPONSELIBRARYID("cannedResponseLibraryId"),
    CONVERSATIONID("conversationId"),
    ENGAGEMENTTYPE("engagementType"),
    EXTERNALCONTACTID("externalContactId"),
    FEEDBACKRATING("feedbackRating"),
    HASANSWERHIGHLIGHT("hasAnswerHighlight"),
    KNOWLEDGEBASEDOCUMENTID("knowledgeBaseDocumentId"),
    KNOWLEDGEBASEDOCUMENTVERSIONID("knowledgeBaseDocumentVersionId"),
    MEDIATYPE("mediaType"),
    MESSAGEID("messageId"),
    QUEUEID("queueId"),
    SCRIPTID("scriptId"),
    SCRIPTPAGEID("scriptPageId"),
    SEARCHID("searchId"),
    STATE("state"),
    SUGGESTIONID("suggestionId"),
    SUGGESTIONTYPE("suggestionType"),
    TRIGGERTYPE("triggerType"),
    USERID("userId"),
    UTTERANCEID("utteranceId");

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
  private AgentCopilotAggregateQueryFilter filter = null;

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
    NCANNEDRESPONSESUGGESTIONS("nCannedResponseSuggestions"),
    NDISTINCTSUGGESTIONS("nDistinctSuggestions"),
    NKNOWLEDGEARTICLESUGGESTIONS("nKnowledgeArticleSuggestions"),
    NKNOWLEDGESEARCHSUGGESTIONS("nKnowledgeSearchSuggestions"),
    NSCRIPTSUGGESTIONS("nScriptSuggestions");

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
  private List<AgentCopilotAggregationView> views = new ArrayList<AgentCopilotAggregationView>();

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

  private static class QueryTypeEnumDeserializer extends StdDeserializer<QueryTypeEnum> {
    public QueryTypeEnumDeserializer() {
      super(QueryTypeEnumDeserializer.class);
    }

    @Override
    public QueryTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return QueryTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Query type to use. Use groupBy for all matching results, and topN for just top N results for the requested metric (group by exactly 1 dimension)
   */
 @JsonDeserialize(using = QueryTypeEnumDeserializer.class)
  public enum QueryTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    GROUPBY("groupBy"),
    TOPN("topN");

    private String value;

    QueryTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static QueryTypeEnum fromString(String key) {
      if (key == null) return null;

      for (QueryTypeEnum value : QueryTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return QueryTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private QueryTypeEnum queryType = null;
  private Integer limit = null;
  private Integer pageSize = null;

  
  /**
   * Behaves like one clause in a SQL WHERE. Specifies the date and time range of data being queried. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss
   **/
  public AgentCopilotAsyncAggregationQuery interval(String interval) {
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
  public AgentCopilotAsyncAggregationQuery granularity(String granularity) {
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
  public AgentCopilotAsyncAggregationQuery timeZone(String timeZone) {
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
  public AgentCopilotAsyncAggregationQuery groupBy(List<GroupByEnum> groupBy) {
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
  public AgentCopilotAsyncAggregationQuery filter(AgentCopilotAggregateQueryFilter filter) {
    this.filter = filter;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Behaves like a SQL WHERE clause. This is ANDed with the interval parameter. Expresses boolean logical predicates as well as dimensional filters")
  @JsonProperty("filter")
  public AgentCopilotAggregateQueryFilter getFilter() {
    return filter;
  }
  public void setFilter(AgentCopilotAggregateQueryFilter filter) {
    this.filter = filter;
  }


  /**
   * Behaves like a SQL SELECT clause. Only named metrics will be retrieved.
   **/
  public AgentCopilotAsyncAggregationQuery metrics(List<MetricsEnum> metrics) {
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
  public AgentCopilotAsyncAggregationQuery flattenMultivaluedDimensions(Boolean flattenMultivaluedDimensions) {
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
  public AgentCopilotAsyncAggregationQuery views(List<AgentCopilotAggregationView> views) {
    this.views = views;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Custom derived metric views")
  @JsonProperty("views")
  public List<AgentCopilotAggregationView> getViews() {
    return views;
  }
  public void setViews(List<AgentCopilotAggregationView> views) {
    this.views = views;
  }


  /**
   * Dimension to use as the alternative timestamp for data in the aggregate.  Choosing \"eventTime\" uses the actual time of the data event.
   **/
  public AgentCopilotAsyncAggregationQuery alternateTimeDimension(AlternateTimeDimensionEnum alternateTimeDimension) {
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


  /**
   * Query type to use. Use groupBy for all matching results, and topN for just top N results for the requested metric (group by exactly 1 dimension)
   **/
  public AgentCopilotAsyncAggregationQuery queryType(QueryTypeEnum queryType) {
    this.queryType = queryType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Query type to use. Use groupBy for all matching results, and topN for just top N results for the requested metric (group by exactly 1 dimension)")
  @JsonProperty("queryType")
  public QueryTypeEnum getQueryType() {
    return queryType;
  }
  public void setQueryType(QueryTypeEnum queryType) {
    this.queryType = queryType;
  }


  /**
   * How many results you want in the topN list. Only applicable for topN query type.
   **/
  public AgentCopilotAsyncAggregationQuery limit(Integer limit) {
    this.limit = limit;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "How many results you want in the topN list. Only applicable for topN query type.")
  @JsonProperty("limit")
  public Integer getLimit() {
    return limit;
  }
  public void setLimit(Integer limit) {
    this.limit = limit;
  }


  /**
   * The number of results per page
   **/
  public AgentCopilotAsyncAggregationQuery pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of results per page")
  @JsonProperty("pageSize")
  public Integer getPageSize() {
    return pageSize;
  }
  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentCopilotAsyncAggregationQuery agentCopilotAsyncAggregationQuery = (AgentCopilotAsyncAggregationQuery) o;

    return Objects.equals(this.interval, agentCopilotAsyncAggregationQuery.interval) &&
            Objects.equals(this.granularity, agentCopilotAsyncAggregationQuery.granularity) &&
            Objects.equals(this.timeZone, agentCopilotAsyncAggregationQuery.timeZone) &&
            Objects.equals(this.groupBy, agentCopilotAsyncAggregationQuery.groupBy) &&
            Objects.equals(this.filter, agentCopilotAsyncAggregationQuery.filter) &&
            Objects.equals(this.metrics, agentCopilotAsyncAggregationQuery.metrics) &&
            Objects.equals(this.flattenMultivaluedDimensions, agentCopilotAsyncAggregationQuery.flattenMultivaluedDimensions) &&
            Objects.equals(this.views, agentCopilotAsyncAggregationQuery.views) &&
            Objects.equals(this.alternateTimeDimension, agentCopilotAsyncAggregationQuery.alternateTimeDimension) &&
            Objects.equals(this.queryType, agentCopilotAsyncAggregationQuery.queryType) &&
            Objects.equals(this.limit, agentCopilotAsyncAggregationQuery.limit) &&
            Objects.equals(this.pageSize, agentCopilotAsyncAggregationQuery.pageSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interval, granularity, timeZone, groupBy, filter, metrics, flattenMultivaluedDimensions, views, alternateTimeDimension, queryType, limit, pageSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentCopilotAsyncAggregationQuery {\n");
    
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    granularity: ").append(toIndentedString(granularity)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    flattenMultivaluedDimensions: ").append(toIndentedString(flattenMultivaluedDimensions)).append("\n");
    sb.append("    views: ").append(toIndentedString(views)).append("\n");
    sb.append("    alternateTimeDimension: ").append(toIndentedString(alternateTimeDimension)).append("\n");
    sb.append("    queryType: ").append(toIndentedString(queryType)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
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

