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
import com.mypurecloud.sdk.v2.model.BuShortTermForecastWeekReference;
import com.mypurecloud.sdk.v2.model.WorkPlanBidMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.util.Date;

import java.io.Serializable;
/**
 * ScheduleBid
 */

public class ScheduleBid  implements Serializable {
  
  private String id = null;
  private String name = null;
  private LocalDate bidWindowStartDate = null;
  private LocalDate bidWindowEndDate = null;
  private LocalDate effectiveDate = null;

  private static class StatusEnumDeserializer extends StdDeserializer<StatusEnum> {
    public StatusEnumDeserializer() {
      super(StatusEnumDeserializer.class);
    }

    @Override
    public StatusEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return StatusEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The state of the bid
   */
 @JsonDeserialize(using = StatusEnumDeserializer.class)
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    DRAFT("Draft"),
    LOCKED("Locked"),
    OPTIMIZED("Optimized"),
    SCHEDULED("Scheduled"),
    OPEN("Open"),
    CLOSED("Closed"),
    PROCESSED("Processed"),
    PUBLISHED("Published");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StatusEnum fromString(String key) {
      if (key == null) return null;

      for (StatusEnum value : StatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StatusEnum status = null;

  private static class BidTypeEnumDeserializer extends StdDeserializer<BidTypeEnum> {
    public BidTypeEnumDeserializer() {
      super(BidTypeEnumDeserializer.class);
    }

    @Override
    public BidTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return BidTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The type of the bid
   */
 @JsonDeserialize(using = BidTypeEnumDeserializer.class)
  public enum BidTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    WORKPLANBID("WorkPlanBid"),
    SCHEDULEBID("ScheduleBid");

    private String value;

    BidTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static BidTypeEnum fromString(String key) {
      if (key == null) return null;

      for (BidTypeEnum value : BidTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return BidTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private BidTypeEnum bidType = null;
  private BuShortTermForecastWeekReference forecast = null;
  private Integer weeksToSchedule = null;
  private Boolean endOverridesAndRotations = null;

  private static class AgentRankingTypeEnumDeserializer extends StdDeserializer<AgentRankingTypeEnum> {
    public AgentRankingTypeEnumDeserializer() {
      super(AgentRankingTypeEnumDeserializer.class);
    }

    @Override
    public AgentRankingTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return AgentRankingTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The type of agent ranking selected for this bid
   */
 @JsonDeserialize(using = AgentRankingTypeEnumDeserializer.class)
  public enum AgentRankingTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    HIREDATE("HireDate"),
    PERFORMANCE("Performance");

    private String value;

    AgentRankingTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static AgentRankingTypeEnum fromString(String key) {
      if (key == null) return null;

      for (AgentRankingTypeEnum value : AgentRankingTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return AgentRankingTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private AgentRankingTypeEnum agentRankingType = null;

  private static class RankingTiebreakerTypeEnumDeserializer extends StdDeserializer<RankingTiebreakerTypeEnum> {
    public RankingTiebreakerTypeEnumDeserializer() {
      super(RankingTiebreakerTypeEnumDeserializer.class);
    }

    @Override
    public RankingTiebreakerTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return RankingTiebreakerTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Ranking tiebreaker
   */
 @JsonDeserialize(using = RankingTiebreakerTypeEnumDeserializer.class)
  public enum RankingTiebreakerTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    HIREDATE("HireDate"),
    PERFORMANCE("Performance"),
    CUSTOM("Custom"),
    RANDOMLYASSIGN("RandomlyAssign");

    private String value;

    RankingTiebreakerTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static RankingTiebreakerTypeEnum fromString(String key) {
      if (key == null) return null;

      for (RankingTiebreakerTypeEnum value : RankingTiebreakerTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return RankingTiebreakerTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private RankingTiebreakerTypeEnum rankingTiebreakerType = null;
  private Date publishedDate = null;
  private LocalDate endDate = null;
  private WorkPlanBidMetadata metadata = null;
  private String selfUri = null;

  public ScheduleBid() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public ScheduleBid(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The ID of the schedule bid
   **/
  public ScheduleBid id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the schedule bid")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * The name of the schedule bid
   **/
  public ScheduleBid name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the schedule bid")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The bid start date when agents can start participating in schedule bidding relative to the business unit time zone in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public ScheduleBid bidWindowStartDate(LocalDate bidWindowStartDate) {
    this.bidWindowStartDate = bidWindowStartDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The bid start date when agents can start participating in schedule bidding relative to the business unit time zone in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("bidWindowStartDate")
  public LocalDate getBidWindowStartDate() {
    return bidWindowStartDate;
  }
  public void setBidWindowStartDate(LocalDate bidWindowStartDate) {
    this.bidWindowStartDate = bidWindowStartDate;
  }


  /**
   * The bid end date relative to the business unit time zone in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public ScheduleBid bidWindowEndDate(LocalDate bidWindowEndDate) {
    this.bidWindowEndDate = bidWindowEndDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The bid end date relative to the business unit time zone in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("bidWindowEndDate")
  public LocalDate getBidWindowEndDate() {
    return bidWindowEndDate;
  }
  public void setBidWindowEndDate(LocalDate bidWindowEndDate) {
    this.bidWindowEndDate = bidWindowEndDate;
  }


  /**
   * The date when schedule sets would be effective for schedule generation relative to the business unit time zone in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public ScheduleBid effectiveDate(LocalDate effectiveDate) {
    this.effectiveDate = effectiveDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The date when schedule sets would be effective for schedule generation relative to the business unit time zone in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("effectiveDate")
  public LocalDate getEffectiveDate() {
    return effectiveDate;
  }
  public void setEffectiveDate(LocalDate effectiveDate) {
    this.effectiveDate = effectiveDate;
  }


  /**
   * The state of the bid
   **/
  public ScheduleBid status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The state of the bid")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  /**
   * The type of the bid
   **/
  public ScheduleBid bidType(BidTypeEnum bidType) {
    this.bidType = bidType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The type of the bid")
  @JsonProperty("bidType")
  public BidTypeEnum getBidType() {
    return bidType;
  }
  public void setBidType(BidTypeEnum bidType) {
    this.bidType = bidType;
  }


  /**
   * The selected forecast used for schedule set generation for this bid
   **/
  public ScheduleBid forecast(BuShortTermForecastWeekReference forecast) {
    this.forecast = forecast;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The selected forecast used for schedule set generation for this bid")
  @JsonProperty("forecast")
  public BuShortTermForecastWeekReference getForecast() {
    return forecast;
  }
  public void setForecast(BuShortTermForecastWeekReference forecast) {
    this.forecast = forecast;
  }


  /**
   * The number of weeks to generate schedule sets through this bid
   **/
  public ScheduleBid weeksToSchedule(Integer weeksToSchedule) {
    this.weeksToSchedule = weeksToSchedule;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of weeks to generate schedule sets through this bid")
  @JsonProperty("weeksToSchedule")
  public Integer getWeeksToSchedule() {
    return weeksToSchedule;
  }
  public void setWeeksToSchedule(Integer weeksToSchedule) {
    this.weeksToSchedule = weeksToSchedule;
  }


  /**
   * If true, all existing overrides, work plan rotations will be ended one day before effective date of this bid
   **/
  public ScheduleBid endOverridesAndRotations(Boolean endOverridesAndRotations) {
    this.endOverridesAndRotations = endOverridesAndRotations;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "If true, all existing overrides, work plan rotations will be ended one day before effective date of this bid")
  @JsonProperty("endOverridesAndRotations")
  public Boolean getEndOverridesAndRotations() {
    return endOverridesAndRotations;
  }
  public void setEndOverridesAndRotations(Boolean endOverridesAndRotations) {
    this.endOverridesAndRotations = endOverridesAndRotations;
  }


  /**
   * The type of agent ranking selected for this bid
   **/
  public ScheduleBid agentRankingType(AgentRankingTypeEnum agentRankingType) {
    this.agentRankingType = agentRankingType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The type of agent ranking selected for this bid")
  @JsonProperty("agentRankingType")
  public AgentRankingTypeEnum getAgentRankingType() {
    return agentRankingType;
  }
  public void setAgentRankingType(AgentRankingTypeEnum agentRankingType) {
    this.agentRankingType = agentRankingType;
  }


  /**
   * Ranking tiebreaker
   **/
  public ScheduleBid rankingTiebreakerType(RankingTiebreakerTypeEnum rankingTiebreakerType) {
    this.rankingTiebreakerType = rankingTiebreakerType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Ranking tiebreaker")
  @JsonProperty("rankingTiebreakerType")
  public RankingTiebreakerTypeEnum getRankingTiebreakerType() {
    return rankingTiebreakerType;
  }
  public void setRankingTiebreakerType(RankingTiebreakerTypeEnum rankingTiebreakerType) {
    this.rankingTiebreakerType = rankingTiebreakerType;
  }


  /**
   * The date the schedule bid is published. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public ScheduleBid publishedDate(Date publishedDate) {
    this.publishedDate = publishedDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The date the schedule bid is published. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("publishedDate")
  public Date getPublishedDate() {
    return publishedDate;
  }
  public void setPublishedDate(Date publishedDate) {
    this.publishedDate = publishedDate;
  }


  /**
   * The end date until which schedule sets can be used for schedule generation. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public ScheduleBid endDate(LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The end date until which schedule sets can be used for schedule generation. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("endDate")
  public LocalDate getEndDate() {
    return endDate;
  }
  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }


  /**
   * The metadata of this bid
   **/
  public ScheduleBid metadata(WorkPlanBidMetadata metadata) {
    this.metadata = metadata;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The metadata of this bid")
  @JsonProperty("metadata")
  public WorkPlanBidMetadata getMetadata() {
    return metadata;
  }
  public void setMetadata(WorkPlanBidMetadata metadata) {
    this.metadata = metadata;
  }


  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScheduleBid scheduleBid = (ScheduleBid) o;

    return Objects.equals(this.id, scheduleBid.id) &&
            Objects.equals(this.name, scheduleBid.name) &&
            Objects.equals(this.bidWindowStartDate, scheduleBid.bidWindowStartDate) &&
            Objects.equals(this.bidWindowEndDate, scheduleBid.bidWindowEndDate) &&
            Objects.equals(this.effectiveDate, scheduleBid.effectiveDate) &&
            Objects.equals(this.status, scheduleBid.status) &&
            Objects.equals(this.bidType, scheduleBid.bidType) &&
            Objects.equals(this.forecast, scheduleBid.forecast) &&
            Objects.equals(this.weeksToSchedule, scheduleBid.weeksToSchedule) &&
            Objects.equals(this.endOverridesAndRotations, scheduleBid.endOverridesAndRotations) &&
            Objects.equals(this.agentRankingType, scheduleBid.agentRankingType) &&
            Objects.equals(this.rankingTiebreakerType, scheduleBid.rankingTiebreakerType) &&
            Objects.equals(this.publishedDate, scheduleBid.publishedDate) &&
            Objects.equals(this.endDate, scheduleBid.endDate) &&
            Objects.equals(this.metadata, scheduleBid.metadata) &&
            Objects.equals(this.selfUri, scheduleBid.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, bidWindowStartDate, bidWindowEndDate, effectiveDate, status, bidType, forecast, weeksToSchedule, endOverridesAndRotations, agentRankingType, rankingTiebreakerType, publishedDate, endDate, metadata, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleBid {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    bidWindowStartDate: ").append(toIndentedString(bidWindowStartDate)).append("\n");
    sb.append("    bidWindowEndDate: ").append(toIndentedString(bidWindowEndDate)).append("\n");
    sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    bidType: ").append(toIndentedString(bidType)).append("\n");
    sb.append("    forecast: ").append(toIndentedString(forecast)).append("\n");
    sb.append("    weeksToSchedule: ").append(toIndentedString(weeksToSchedule)).append("\n");
    sb.append("    endOverridesAndRotations: ").append(toIndentedString(endOverridesAndRotations)).append("\n");
    sb.append("    agentRankingType: ").append(toIndentedString(agentRankingType)).append("\n");
    sb.append("    rankingTiebreakerType: ").append(toIndentedString(rankingTiebreakerType)).append("\n");
    sb.append("    publishedDate: ").append(toIndentedString(publishedDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

