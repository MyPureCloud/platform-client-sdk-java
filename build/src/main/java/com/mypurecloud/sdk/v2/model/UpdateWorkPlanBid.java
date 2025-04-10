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
import com.mypurecloud.sdk.v2.model.ListWrapperAgentWorkPlanField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;

import java.io.Serializable;
/**
 * Update work plan bid model
 */
@ApiModel(description = "Update work plan bid model")

public class UpdateWorkPlanBid  implements Serializable {
  
  private String name = null;
  private BuShortTermForecastWeekReference forecast = null;
  private LocalDate bidWindowStartDate = null;
  private LocalDate bidWindowEndDate = null;
  private LocalDate effectiveDate = null;

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
  private ListWrapperAgentWorkPlanField workPlanFieldsVisibleToAgents = null;

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

  public UpdateWorkPlanBid() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The name of the work plan bid
   **/
  public UpdateWorkPlanBid name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of the work plan bid")
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
  public UpdateWorkPlanBid forecast(BuShortTermForecastWeekReference forecast) {
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
   * The bid start date where agents start participate in work plan bidding in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public UpdateWorkPlanBid bidWindowStartDate(LocalDate bidWindowStartDate) {
    this.bidWindowStartDate = bidWindowStartDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The bid start date where agents start participate in work plan bidding in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("bidWindowStartDate")
  public LocalDate getBidWindowStartDate() {
    return bidWindowStartDate;
  }
  public void setBidWindowStartDate(LocalDate bidWindowStartDate) {
    this.bidWindowStartDate = bidWindowStartDate;
  }


  /**
   * The bid end date in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public UpdateWorkPlanBid bidWindowEndDate(LocalDate bidWindowEndDate) {
    this.bidWindowEndDate = bidWindowEndDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The bid end date in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("bidWindowEndDate")
  public LocalDate getBidWindowEndDate() {
    return bidWindowEndDate;
  }
  public void setBidWindowEndDate(LocalDate bidWindowEndDate) {
    this.bidWindowEndDate = bidWindowEndDate;
  }


  /**
   * The date when agents will be assigned to the new work plan in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public UpdateWorkPlanBid effectiveDate(LocalDate effectiveDate) {
    this.effectiveDate = effectiveDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The date when agents will be assigned to the new work plan in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("effectiveDate")
  public LocalDate getEffectiveDate() {
    return effectiveDate;
  }
  public void setEffectiveDate(LocalDate effectiveDate) {
    this.effectiveDate = effectiveDate;
  }


  /**
   * The type of agent ranking selected for this bid
   **/
  public UpdateWorkPlanBid agentRankingType(AgentRankingTypeEnum agentRankingType) {
    this.agentRankingType = agentRankingType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type of agent ranking selected for this bid")
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
  public UpdateWorkPlanBid rankingTiebreakerType(RankingTiebreakerTypeEnum rankingTiebreakerType) {
    this.rankingTiebreakerType = rankingTiebreakerType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Ranking tiebreaker")
  @JsonProperty("rankingTiebreakerType")
  public RankingTiebreakerTypeEnum getRankingTiebreakerType() {
    return rankingTiebreakerType;
  }
  public void setRankingTiebreakerType(RankingTiebreakerTypeEnum rankingTiebreakerType) {
    this.rankingTiebreakerType = rankingTiebreakerType;
  }


  /**
   * The work plan fields visible to agents whenever work plan preferences are made
   **/
  public UpdateWorkPlanBid workPlanFieldsVisibleToAgents(ListWrapperAgentWorkPlanField workPlanFieldsVisibleToAgents) {
    this.workPlanFieldsVisibleToAgents = workPlanFieldsVisibleToAgents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The work plan fields visible to agents whenever work plan preferences are made")
  @JsonProperty("workPlanFieldsVisibleToAgents")
  public ListWrapperAgentWorkPlanField getWorkPlanFieldsVisibleToAgents() {
    return workPlanFieldsVisibleToAgents;
  }
  public void setWorkPlanFieldsVisibleToAgents(ListWrapperAgentWorkPlanField workPlanFieldsVisibleToAgents) {
    this.workPlanFieldsVisibleToAgents = workPlanFieldsVisibleToAgents;
  }


  /**
   * The state of the bid
   **/
  public UpdateWorkPlanBid status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The state of the bid")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateWorkPlanBid updateWorkPlanBid = (UpdateWorkPlanBid) o;

    return Objects.equals(this.name, updateWorkPlanBid.name) &&
            Objects.equals(this.forecast, updateWorkPlanBid.forecast) &&
            Objects.equals(this.bidWindowStartDate, updateWorkPlanBid.bidWindowStartDate) &&
            Objects.equals(this.bidWindowEndDate, updateWorkPlanBid.bidWindowEndDate) &&
            Objects.equals(this.effectiveDate, updateWorkPlanBid.effectiveDate) &&
            Objects.equals(this.agentRankingType, updateWorkPlanBid.agentRankingType) &&
            Objects.equals(this.rankingTiebreakerType, updateWorkPlanBid.rankingTiebreakerType) &&
            Objects.equals(this.workPlanFieldsVisibleToAgents, updateWorkPlanBid.workPlanFieldsVisibleToAgents) &&
            Objects.equals(this.status, updateWorkPlanBid.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, forecast, bidWindowStartDate, bidWindowEndDate, effectiveDate, agentRankingType, rankingTiebreakerType, workPlanFieldsVisibleToAgents, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateWorkPlanBid {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    forecast: ").append(toIndentedString(forecast)).append("\n");
    sb.append("    bidWindowStartDate: ").append(toIndentedString(bidWindowStartDate)).append("\n");
    sb.append("    bidWindowEndDate: ").append(toIndentedString(bidWindowEndDate)).append("\n");
    sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
    sb.append("    agentRankingType: ").append(toIndentedString(agentRankingType)).append("\n");
    sb.append("    rankingTiebreakerType: ").append(toIndentedString(rankingTiebreakerType)).append("\n");
    sb.append("    workPlanFieldsVisibleToAgents: ").append(toIndentedString(workPlanFieldsVisibleToAgents)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

