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
import com.mypurecloud.sdk.v2.model.JourneyAggregateQueryFilter;
import com.mypurecloud.sdk.v2.model.JourneyAggregationView;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * JourneyAsyncAggregationQuery
 */

public class JourneyAsyncAggregationQuery  implements Serializable {
  
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
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    CONTAINSALLCONDITION("containsAllCondition"),
    CONTAINSANYCONDITION("containsAnyCondition"),
    ENDSWITHCONDITION("endsWithCondition"),
    EQUALCONDITION("equalCondition"),
    JOURNEYACTIONID("journeyActionId"),
    JOURNEYACTIONMAPID("journeyActionMapId"),
    JOURNEYACTIONMAPVERSION("journeyActionMapVersion"),
    JOURNEYACTIONMEDIATYPE("journeyActionMediaType"),
    JOURNEYACTIONTARGETID("journeyActionTargetId"),
    JOURNEYACTIONTEMPLATEID("journeyActionTemplateId"),
    JOURNEYBLOCKINGACTIONMAPID("journeyBlockingActionMapId"),
    JOURNEYBLOCKINGEMERGENCYSCHEDULEGROUPID("journeyBlockingEmergencyScheduleGroupId"),
    JOURNEYBLOCKINGREASON("journeyBlockingReason"),
    JOURNEYBLOCKINGSCHEDULEGROUPID("journeyBlockingScheduleGroupId"),
    JOURNEYDEVICECATEGORY("journeyDeviceCategory"),
    JOURNEYDEVICETYPE("journeyDeviceType"),
    JOURNEYFREQUENCYCAPREASON("journeyFrequencyCapReason"),
    JOURNEYIPGEOLOCATIONCOUNTRY("journeyIpGeolocationCountry"),
    JOURNEYOUTCOMEID("journeyOutcomeId"),
    JOURNEYSEGMENTASSIGNMENTSTATE("journeySegmentAssignmentState"),
    JOURNEYSEGMENTID("journeySegmentId"),
    JOURNEYSESSIONID("journeySessionId"),
    JOURNEYSESSIONSEGMENTID("journeySessionSegmentId"),
    JOURNEYSESSIONTYPE("journeySessionType"),
    NOTCONTAINSALLCONDITION("notContainsAllCondition"),
    NOTCONTAINSANYCONDITION("notContainsAnyCondition"),
    NOTEQUALCONDITION("notEqualCondition"),
    STARTSWITHCONDITION("startsWithCondition"),
    TOUCHPOINTACTIONMAPID("touchpointActionMapId"),
    TOUCHPOINTAGENTID("touchpointAgentId"),
    TOUCHPOINTATTRIBUTIONSCOPE("touchpointAttributionScope"),
    TOUCHPOINTCHANNELMESSAGETYPE("touchpointChannelMessageType"),
    TOUCHPOINTCHANNELPLATFORM("touchpointChannelPlatform"),
    TOUCHPOINTCHANNELTYPE("touchpointChannelType"),
    TOUCHPOINTCONVERSATIONID("touchpointConversationId"),
    TOUCHPOINTINTERACTIONTYPE("touchpointInteractionType"),
    TOUCHPOINTQUEUEID("touchpointQueueId"),
    TOUCHPOINTREQUESTEDROUTING("touchpointRequestedRouting"),
    TOUCHPOINTUSEDROUTING("touchpointUsedRouting"),
    TOUCHPOINTWRAPUPCODE("touchpointWrapupCode");

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
  private JourneyAggregateQueryFilter filter = null;

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
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    NDISTINCTJOURNEYACTIONS("nDistinctJourneyActions"),
    NDISTINCTJOURNEYSESSIONS("nDistinctJourneySessions"),
    NJOURNEYACTIONSBLOCKED("nJourneyActionsBlocked"),
    NJOURNEYOUTCOMESACHIEVED("nJourneyOutcomesAchieved"),
    NJOURNEYOUTCOMESATTRIBUTED("nJourneyOutcomesAttributed"),
    NJOURNEYSEGMENTSASSIGNED("nJourneySegmentsAssigned"),
    NJOURNEYSESSIONS("nJourneySessions"),
    NWEBACTIONSABANDONED("nWebActionsAbandoned"),
    NWEBACTIONSACCEPTED("nWebActionsAccepted"),
    NWEBACTIONSENGAGED("nWebActionsEngaged"),
    NWEBACTIONSERRORED("nWebActionsErrored"),
    NWEBACTIONSFREQUENCYCAPREACHED("nWebActionsFrequencyCapReached"),
    NWEBACTIONSIGNORED("nWebActionsIgnored"),
    NWEBACTIONSOFFERED("nWebActionsOffered"),
    NWEBACTIONSOFFEREDOUTSIDESCHEDULE("nWebActionsOfferedOutsideSchedule"),
    NWEBACTIONSQUALIFIED("nWebActionsQualified"),
    NWEBACTIONSQUALIFIEDOUTSIDESCHEDULE("nWebActionsQualifiedOutsideSchedule"),
    NWEBACTIONSREJECTED("nWebActionsRejected"),
    NWEBACTIONSSTARTED("nWebActionsStarted"),
    NWEBACTIONSTIMEDOUT("nWebActionsTimedout"),
    OJOURNEYOUTCOMETOUCHPOINTVALUE("oJourneyOutcomeTouchpointValue"),
    OJOURNEYOUTCOMEVALUE("oJourneyOutcomeValue");

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
  private List<MetricsEnum> metrics = null;
  private Boolean flattenMultivaluedDimensions = null;
  private List<JourneyAggregationView> views = null;

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
  private Integer pageSize = null;

  public JourneyAsyncAggregationQuery() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      groupBy = new ArrayList<GroupByEnum>();
      metrics = new ArrayList<MetricsEnum>();
      views = new ArrayList<JourneyAggregationView>();
    }
  }

  
  /**
   * Behaves like one clause in a SQL WHERE. Specifies the date and time range of data being queried. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss
   **/
  public JourneyAsyncAggregationQuery interval(String interval) {
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
  public JourneyAsyncAggregationQuery granularity(String granularity) {
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
  public JourneyAsyncAggregationQuery timeZone(String timeZone) {
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
  public JourneyAsyncAggregationQuery groupBy(List<GroupByEnum> groupBy) {
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
  public JourneyAsyncAggregationQuery filter(JourneyAggregateQueryFilter filter) {
    this.filter = filter;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Behaves like a SQL WHERE clause. This is ANDed with the interval parameter. Expresses boolean logical predicates as well as dimensional filters")
  @JsonProperty("filter")
  public JourneyAggregateQueryFilter getFilter() {
    return filter;
  }
  public void setFilter(JourneyAggregateQueryFilter filter) {
    this.filter = filter;
  }


  /**
   * Behaves like a SQL SELECT clause. Only named metrics will be retrieved.
   **/
  public JourneyAsyncAggregationQuery metrics(List<MetricsEnum> metrics) {
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
  public JourneyAsyncAggregationQuery flattenMultivaluedDimensions(Boolean flattenMultivaluedDimensions) {
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
  public JourneyAsyncAggregationQuery views(List<JourneyAggregationView> views) {
    this.views = views;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Custom derived metric views")
  @JsonProperty("views")
  public List<JourneyAggregationView> getViews() {
    return views;
  }
  public void setViews(List<JourneyAggregationView> views) {
    this.views = views;
  }


  /**
   * Dimension to use as the alternative timestamp for data in the aggregate.  Choosing \"eventTime\" uses the actual time of the data event.
   **/
  public JourneyAsyncAggregationQuery alternateTimeDimension(AlternateTimeDimensionEnum alternateTimeDimension) {
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
   * The number of results per page
   **/
  public JourneyAsyncAggregationQuery pageSize(Integer pageSize) {
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
    JourneyAsyncAggregationQuery journeyAsyncAggregationQuery = (JourneyAsyncAggregationQuery) o;

    return Objects.equals(this.interval, journeyAsyncAggregationQuery.interval) &&
            Objects.equals(this.granularity, journeyAsyncAggregationQuery.granularity) &&
            Objects.equals(this.timeZone, journeyAsyncAggregationQuery.timeZone) &&
            Objects.equals(this.groupBy, journeyAsyncAggregationQuery.groupBy) &&
            Objects.equals(this.filter, journeyAsyncAggregationQuery.filter) &&
            Objects.equals(this.metrics, journeyAsyncAggregationQuery.metrics) &&
            Objects.equals(this.flattenMultivaluedDimensions, journeyAsyncAggregationQuery.flattenMultivaluedDimensions) &&
            Objects.equals(this.views, journeyAsyncAggregationQuery.views) &&
            Objects.equals(this.alternateTimeDimension, journeyAsyncAggregationQuery.alternateTimeDimension) &&
            Objects.equals(this.pageSize, journeyAsyncAggregationQuery.pageSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interval, granularity, timeZone, groupBy, filter, metrics, flattenMultivaluedDimensions, views, alternateTimeDimension, pageSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneyAsyncAggregationQuery {\n");
    
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    granularity: ").append(toIndentedString(granularity)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    flattenMultivaluedDimensions: ").append(toIndentedString(flattenMultivaluedDimensions)).append("\n");
    sb.append("    views: ").append(toIndentedString(views)).append("\n");
    sb.append("    alternateTimeDimension: ").append(toIndentedString(alternateTimeDimension)).append("\n");
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

