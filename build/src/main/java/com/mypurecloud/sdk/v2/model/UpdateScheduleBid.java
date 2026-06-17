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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;

import java.io.Serializable;
/**
 * UpdateScheduleBid
 */

public class UpdateScheduleBid  implements Serializable {
  
  private String name = null;
  private BuShortTermForecastWeekReference forecast = null;
  private LocalDate bidWindowStartDate = null;
  private LocalDate bidWindowEndDate = null;
  private LocalDate effectiveDate = null;
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
   * Ranking tiebreaker to be used
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

  public UpdateScheduleBid() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public UpdateScheduleBid(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The name of the schedule bid
   **/
  public UpdateScheduleBid name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of the schedule bid")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The selected forecast used for schedule set generation for this bid
   **/
  public UpdateScheduleBid forecast(BuShortTermForecastWeekReference forecast) {
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
   * The bid start date where agents start participating in schedule bidding relative to the business unit time zone in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public UpdateScheduleBid bidWindowStartDate(LocalDate bidWindowStartDate) {
    this.bidWindowStartDate = bidWindowStartDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The bid start date where agents start participating in schedule bidding relative to the business unit time zone in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
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
  public UpdateScheduleBid bidWindowEndDate(LocalDate bidWindowEndDate) {
    this.bidWindowEndDate = bidWindowEndDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The bid end date relative to the business unit time zone in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
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
  public UpdateScheduleBid effectiveDate(LocalDate effectiveDate) {
    this.effectiveDate = effectiveDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The date when schedule sets would be effective for schedule generation relative to the business unit time zone in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("effectiveDate")
  public LocalDate getEffectiveDate() {
    return effectiveDate;
  }
  public void setEffectiveDate(LocalDate effectiveDate) {
    this.effectiveDate = effectiveDate;
  }


  /**
   * The number of weeks to generate schedule set through this bid
   **/
  public UpdateScheduleBid weeksToSchedule(Integer weeksToSchedule) {
    this.weeksToSchedule = weeksToSchedule;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of weeks to generate schedule set through this bid")
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
  public UpdateScheduleBid endOverridesAndRotations(Boolean endOverridesAndRotations) {
    this.endOverridesAndRotations = endOverridesAndRotations;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If true, all existing overrides, work plan rotations will be ended one day before effective date of this bid")
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
  public UpdateScheduleBid agentRankingType(AgentRankingTypeEnum agentRankingType) {
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
   * Ranking tiebreaker to be used
   **/
  public UpdateScheduleBid rankingTiebreakerType(RankingTiebreakerTypeEnum rankingTiebreakerType) {
    this.rankingTiebreakerType = rankingTiebreakerType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Ranking tiebreaker to be used")
  @JsonProperty("rankingTiebreakerType")
  public RankingTiebreakerTypeEnum getRankingTiebreakerType() {
    return rankingTiebreakerType;
  }
  public void setRankingTiebreakerType(RankingTiebreakerTypeEnum rankingTiebreakerType) {
    this.rankingTiebreakerType = rankingTiebreakerType;
  }


  /**
   * The state of the bid
   **/
  public UpdateScheduleBid status(StatusEnum status) {
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
    UpdateScheduleBid updateScheduleBid = (UpdateScheduleBid) o;

    return Objects.equals(this.name, updateScheduleBid.name) &&
            Objects.equals(this.forecast, updateScheduleBid.forecast) &&
            Objects.equals(this.bidWindowStartDate, updateScheduleBid.bidWindowStartDate) &&
            Objects.equals(this.bidWindowEndDate, updateScheduleBid.bidWindowEndDate) &&
            Objects.equals(this.effectiveDate, updateScheduleBid.effectiveDate) &&
            Objects.equals(this.weeksToSchedule, updateScheduleBid.weeksToSchedule) &&
            Objects.equals(this.endOverridesAndRotations, updateScheduleBid.endOverridesAndRotations) &&
            Objects.equals(this.agentRankingType, updateScheduleBid.agentRankingType) &&
            Objects.equals(this.rankingTiebreakerType, updateScheduleBid.rankingTiebreakerType) &&
            Objects.equals(this.status, updateScheduleBid.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, forecast, bidWindowStartDate, bidWindowEndDate, effectiveDate, weeksToSchedule, endOverridesAndRotations, agentRankingType, rankingTiebreakerType, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateScheduleBid {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    forecast: ").append(toIndentedString(forecast)).append("\n");
    sb.append("    bidWindowStartDate: ").append(toIndentedString(bidWindowStartDate)).append("\n");
    sb.append("    bidWindowEndDate: ").append(toIndentedString(bidWindowEndDate)).append("\n");
    sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
    sb.append("    weeksToSchedule: ").append(toIndentedString(weeksToSchedule)).append("\n");
    sb.append("    endOverridesAndRotations: ").append(toIndentedString(endOverridesAndRotations)).append("\n");
    sb.append("    agentRankingType: ").append(toIndentedString(agentRankingType)).append("\n");
    sb.append("    rankingTiebreakerType: ").append(toIndentedString(rankingTiebreakerType)).append("\n");
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

