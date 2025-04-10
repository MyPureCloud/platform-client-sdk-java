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
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * Work plan bid response
 */
@ApiModel(description = "Work plan bid response")

public class WorkPlanBid  implements Serializable {
  
  private String id = null;
  private String name = null;
  private BuShortTermForecastWeekReference forecast = null;
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

  private static class WorkPlanFieldsVisibleToAgentsEnumDeserializer extends StdDeserializer<WorkPlanFieldsVisibleToAgentsEnum> {
    public WorkPlanFieldsVisibleToAgentsEnumDeserializer() {
      super(WorkPlanFieldsVisibleToAgentsEnumDeserializer.class);
    }

    @Override
    public WorkPlanFieldsVisibleToAgentsEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return WorkPlanFieldsVisibleToAgentsEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets workPlanFieldsVisibleToAgents
   */
 @JsonDeserialize(using = WorkPlanFieldsVisibleToAgentsEnumDeserializer.class)
  public enum WorkPlanFieldsVisibleToAgentsEnum {
    NAME("Name"),
    PAIDHOURS("PaidHours");

    private String value;

    WorkPlanFieldsVisibleToAgentsEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static WorkPlanFieldsVisibleToAgentsEnum fromString(String key) {
      if (key == null) return null;

      for (WorkPlanFieldsVisibleToAgentsEnum value : WorkPlanFieldsVisibleToAgentsEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return WorkPlanFieldsVisibleToAgentsEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<WorkPlanFieldsVisibleToAgentsEnum> workPlanFieldsVisibleToAgents = null;
  private WorkPlanBidMetadata metadata = null;
  private String selfUri = null;

  public WorkPlanBid() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      workPlanFieldsVisibleToAgents = new ArrayList<WorkPlanFieldsVisibleToAgentsEnum>();
    }
  }

  
  /**
   * The ID of the work plan bid
   **/
  public WorkPlanBid id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the work plan bid")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * The name of the work plan bid
   **/
  public WorkPlanBid name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the work plan bid")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The selected forecast in this work plan bid
   **/
  public WorkPlanBid forecast(BuShortTermForecastWeekReference forecast) {
    this.forecast = forecast;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The selected forecast in this work plan bid")
  @JsonProperty("forecast")
  public BuShortTermForecastWeekReference getForecast() {
    return forecast;
  }
  public void setForecast(BuShortTermForecastWeekReference forecast) {
    this.forecast = forecast;
  }


  /**
   * The bid start date where agents start participate in work plan bidding. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public WorkPlanBid bidWindowStartDate(LocalDate bidWindowStartDate) {
    this.bidWindowStartDate = bidWindowStartDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The bid start date where agents start participate in work plan bidding. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("bidWindowStartDate")
  public LocalDate getBidWindowStartDate() {
    return bidWindowStartDate;
  }
  public void setBidWindowStartDate(LocalDate bidWindowStartDate) {
    this.bidWindowStartDate = bidWindowStartDate;
  }


  /**
   * The bid end date. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public WorkPlanBid bidWindowEndDate(LocalDate bidWindowEndDate) {
    this.bidWindowEndDate = bidWindowEndDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The bid end date. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("bidWindowEndDate")
  public LocalDate getBidWindowEndDate() {
    return bidWindowEndDate;
  }
  public void setBidWindowEndDate(LocalDate bidWindowEndDate) {
    this.bidWindowEndDate = bidWindowEndDate;
  }


  /**
   * The date when agents will be assigned to the new work plan. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public WorkPlanBid effectiveDate(LocalDate effectiveDate) {
    this.effectiveDate = effectiveDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The date when agents will be assigned to the new work plan. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
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
  public WorkPlanBid status(StatusEnum status) {
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
   * The type of agent ranking selected for this bid
   **/
  public WorkPlanBid agentRankingType(AgentRankingTypeEnum agentRankingType) {
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
  public WorkPlanBid rankingTiebreakerType(RankingTiebreakerTypeEnum rankingTiebreakerType) {
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
   * The date the work plan bid published. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public WorkPlanBid publishedDate(Date publishedDate) {
    this.publishedDate = publishedDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The date the work plan bid published. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("publishedDate")
  public Date getPublishedDate() {
    return publishedDate;
  }
  public void setPublishedDate(Date publishedDate) {
    this.publishedDate = publishedDate;
  }


  /**
   * The work plan fields visible to agents whenever work plan preferences are made
   **/
  public WorkPlanBid workPlanFieldsVisibleToAgents(List<WorkPlanFieldsVisibleToAgentsEnum> workPlanFieldsVisibleToAgents) {
    this.workPlanFieldsVisibleToAgents = workPlanFieldsVisibleToAgents;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The work plan fields visible to agents whenever work plan preferences are made")
  @JsonProperty("workPlanFieldsVisibleToAgents")
  public List<WorkPlanFieldsVisibleToAgentsEnum> getWorkPlanFieldsVisibleToAgents() {
    return workPlanFieldsVisibleToAgents;
  }
  public void setWorkPlanFieldsVisibleToAgents(List<WorkPlanFieldsVisibleToAgentsEnum> workPlanFieldsVisibleToAgents) {
    this.workPlanFieldsVisibleToAgents = workPlanFieldsVisibleToAgents;
  }


  /**
   * The meta data of this bid
   **/
  public WorkPlanBid metadata(WorkPlanBidMetadata metadata) {
    this.metadata = metadata;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The meta data of this bid")
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
    WorkPlanBid workPlanBid = (WorkPlanBid) o;

    return Objects.equals(this.id, workPlanBid.id) &&
            Objects.equals(this.name, workPlanBid.name) &&
            Objects.equals(this.forecast, workPlanBid.forecast) &&
            Objects.equals(this.bidWindowStartDate, workPlanBid.bidWindowStartDate) &&
            Objects.equals(this.bidWindowEndDate, workPlanBid.bidWindowEndDate) &&
            Objects.equals(this.effectiveDate, workPlanBid.effectiveDate) &&
            Objects.equals(this.status, workPlanBid.status) &&
            Objects.equals(this.agentRankingType, workPlanBid.agentRankingType) &&
            Objects.equals(this.rankingTiebreakerType, workPlanBid.rankingTiebreakerType) &&
            Objects.equals(this.publishedDate, workPlanBid.publishedDate) &&
            Objects.equals(this.workPlanFieldsVisibleToAgents, workPlanBid.workPlanFieldsVisibleToAgents) &&
            Objects.equals(this.metadata, workPlanBid.metadata) &&
            Objects.equals(this.selfUri, workPlanBid.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, forecast, bidWindowStartDate, bidWindowEndDate, effectiveDate, status, agentRankingType, rankingTiebreakerType, publishedDate, workPlanFieldsVisibleToAgents, metadata, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkPlanBid {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    forecast: ").append(toIndentedString(forecast)).append("\n");
    sb.append("    bidWindowStartDate: ").append(toIndentedString(bidWindowStartDate)).append("\n");
    sb.append("    bidWindowEndDate: ").append(toIndentedString(bidWindowEndDate)).append("\n");
    sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    agentRankingType: ").append(toIndentedString(agentRankingType)).append("\n");
    sb.append("    rankingTiebreakerType: ").append(toIndentedString(rankingTiebreakerType)).append("\n");
    sb.append("    publishedDate: ").append(toIndentedString(publishedDate)).append("\n");
    sb.append("    workPlanFieldsVisibleToAgents: ").append(toIndentedString(workPlanFieldsVisibleToAgents)).append("\n");
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

