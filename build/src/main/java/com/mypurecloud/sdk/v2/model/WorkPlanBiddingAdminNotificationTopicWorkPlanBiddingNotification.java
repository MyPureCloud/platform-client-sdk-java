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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * WorkPlanBiddingAdminNotificationTopicWorkPlanBiddingNotification
 */

public class WorkPlanBiddingAdminNotificationTopicWorkPlanBiddingNotification  implements Serializable {
  
  private String id = null;
  private String buId = null;

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
   * Gets or Sets status
   */
 @JsonDeserialize(using = StatusEnumDeserializer.class)
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("Unknown"),
    DRAFT("Draft"),
    LOCKED("Locked"),
    SCHEDULED("Scheduled"),
    OPTIMIZED("Optimized"),
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
  private String bidWindowStartDate = null;
  private String bidWindowEndDate = null;
  private String effectiveDate = null;

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
   * Gets or Sets agentRankingType
   */
 @JsonDeserialize(using = AgentRankingTypeEnumDeserializer.class)
  public enum AgentRankingTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("Unknown"),
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
   * Gets or Sets rankingTiebreakerType
   */
 @JsonDeserialize(using = RankingTiebreakerTypeEnumDeserializer.class)
  public enum RankingTiebreakerTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("Unknown"),
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
    UNKNOWN("Unknown"),
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

  public WorkPlanBiddingAdminNotificationTopicWorkPlanBiddingNotification() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      workPlanFieldsVisibleToAgents = new ArrayList<WorkPlanFieldsVisibleToAgentsEnum>();
    }
  }

  
  /**
   **/
  public WorkPlanBiddingAdminNotificationTopicWorkPlanBiddingNotification id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   **/
  public WorkPlanBiddingAdminNotificationTopicWorkPlanBiddingNotification buId(String buId) {
    this.buId = buId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("buId")
  public String getBuId() {
    return buId;
  }
  public void setBuId(String buId) {
    this.buId = buId;
  }


  /**
   **/
  public WorkPlanBiddingAdminNotificationTopicWorkPlanBiddingNotification status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  /**
   **/
  public WorkPlanBiddingAdminNotificationTopicWorkPlanBiddingNotification bidWindowStartDate(String bidWindowStartDate) {
    this.bidWindowStartDate = bidWindowStartDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("bidWindowStartDate")
  public String getBidWindowStartDate() {
    return bidWindowStartDate;
  }
  public void setBidWindowStartDate(String bidWindowStartDate) {
    this.bidWindowStartDate = bidWindowStartDate;
  }


  /**
   **/
  public WorkPlanBiddingAdminNotificationTopicWorkPlanBiddingNotification bidWindowEndDate(String bidWindowEndDate) {
    this.bidWindowEndDate = bidWindowEndDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("bidWindowEndDate")
  public String getBidWindowEndDate() {
    return bidWindowEndDate;
  }
  public void setBidWindowEndDate(String bidWindowEndDate) {
    this.bidWindowEndDate = bidWindowEndDate;
  }


  /**
   **/
  public WorkPlanBiddingAdminNotificationTopicWorkPlanBiddingNotification effectiveDate(String effectiveDate) {
    this.effectiveDate = effectiveDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("effectiveDate")
  public String getEffectiveDate() {
    return effectiveDate;
  }
  public void setEffectiveDate(String effectiveDate) {
    this.effectiveDate = effectiveDate;
  }


  /**
   **/
  public WorkPlanBiddingAdminNotificationTopicWorkPlanBiddingNotification agentRankingType(AgentRankingTypeEnum agentRankingType) {
    this.agentRankingType = agentRankingType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("agentRankingType")
  public AgentRankingTypeEnum getAgentRankingType() {
    return agentRankingType;
  }
  public void setAgentRankingType(AgentRankingTypeEnum agentRankingType) {
    this.agentRankingType = agentRankingType;
  }


  /**
   **/
  public WorkPlanBiddingAdminNotificationTopicWorkPlanBiddingNotification rankingTiebreakerType(RankingTiebreakerTypeEnum rankingTiebreakerType) {
    this.rankingTiebreakerType = rankingTiebreakerType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("rankingTiebreakerType")
  public RankingTiebreakerTypeEnum getRankingTiebreakerType() {
    return rankingTiebreakerType;
  }
  public void setRankingTiebreakerType(RankingTiebreakerTypeEnum rankingTiebreakerType) {
    this.rankingTiebreakerType = rankingTiebreakerType;
  }


  /**
   **/
  public WorkPlanBiddingAdminNotificationTopicWorkPlanBiddingNotification workPlanFieldsVisibleToAgents(List<WorkPlanFieldsVisibleToAgentsEnum> workPlanFieldsVisibleToAgents) {
    this.workPlanFieldsVisibleToAgents = workPlanFieldsVisibleToAgents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("workPlanFieldsVisibleToAgents")
  public List<WorkPlanFieldsVisibleToAgentsEnum> getWorkPlanFieldsVisibleToAgents() {
    return workPlanFieldsVisibleToAgents;
  }
  public void setWorkPlanFieldsVisibleToAgents(List<WorkPlanFieldsVisibleToAgentsEnum> workPlanFieldsVisibleToAgents) {
    this.workPlanFieldsVisibleToAgents = workPlanFieldsVisibleToAgents;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkPlanBiddingAdminNotificationTopicWorkPlanBiddingNotification workPlanBiddingAdminNotificationTopicWorkPlanBiddingNotification = (WorkPlanBiddingAdminNotificationTopicWorkPlanBiddingNotification) o;

    return Objects.equals(this.id, workPlanBiddingAdminNotificationTopicWorkPlanBiddingNotification.id) &&
            Objects.equals(this.buId, workPlanBiddingAdminNotificationTopicWorkPlanBiddingNotification.buId) &&
            Objects.equals(this.status, workPlanBiddingAdminNotificationTopicWorkPlanBiddingNotification.status) &&
            Objects.equals(this.bidWindowStartDate, workPlanBiddingAdminNotificationTopicWorkPlanBiddingNotification.bidWindowStartDate) &&
            Objects.equals(this.bidWindowEndDate, workPlanBiddingAdminNotificationTopicWorkPlanBiddingNotification.bidWindowEndDate) &&
            Objects.equals(this.effectiveDate, workPlanBiddingAdminNotificationTopicWorkPlanBiddingNotification.effectiveDate) &&
            Objects.equals(this.agentRankingType, workPlanBiddingAdminNotificationTopicWorkPlanBiddingNotification.agentRankingType) &&
            Objects.equals(this.rankingTiebreakerType, workPlanBiddingAdminNotificationTopicWorkPlanBiddingNotification.rankingTiebreakerType) &&
            Objects.equals(this.workPlanFieldsVisibleToAgents, workPlanBiddingAdminNotificationTopicWorkPlanBiddingNotification.workPlanFieldsVisibleToAgents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, buId, status, bidWindowStartDate, bidWindowEndDate, effectiveDate, agentRankingType, rankingTiebreakerType, workPlanFieldsVisibleToAgents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkPlanBiddingAdminNotificationTopicWorkPlanBiddingNotification {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    buId: ").append(toIndentedString(buId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    bidWindowStartDate: ").append(toIndentedString(bidWindowStartDate)).append("\n");
    sb.append("    bidWindowEndDate: ").append(toIndentedString(bidWindowEndDate)).append("\n");
    sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
    sb.append("    agentRankingType: ").append(toIndentedString(agentRankingType)).append("\n");
    sb.append("    rankingTiebreakerType: ").append(toIndentedString(rankingTiebreakerType)).append("\n");
    sb.append("    workPlanFieldsVisibleToAgents: ").append(toIndentedString(workPlanFieldsVisibleToAgents)).append("\n");
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

