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
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Work plan bid reference
 */
@ApiModel(description = "Work plan bid reference")

public class AgentWorkPlanBid  implements Serializable {
  
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
  private String selfUri = null;

  public AgentWorkPlanBid() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      workPlanFieldsVisibleToAgents = new ArrayList<WorkPlanFieldsVisibleToAgentsEnum>();
    }
  }

  
  /**
   * The ID of the work plan bid
   **/
  public AgentWorkPlanBid id(String id) {
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
   **/
  public AgentWorkPlanBid name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The date when agents can start participating in work plan bidding. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public AgentWorkPlanBid bidWindowStartDate(LocalDate bidWindowStartDate) {
    this.bidWindowStartDate = bidWindowStartDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The date when agents can start participating in work plan bidding. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("bidWindowStartDate")
  public LocalDate getBidWindowStartDate() {
    return bidWindowStartDate;
  }
  public void setBidWindowStartDate(LocalDate bidWindowStartDate) {
    this.bidWindowStartDate = bidWindowStartDate;
  }


  /**
   * The inclusive end date of a bid window. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public AgentWorkPlanBid bidWindowEndDate(LocalDate bidWindowEndDate) {
    this.bidWindowEndDate = bidWindowEndDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The inclusive end date of a bid window. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
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
  public AgentWorkPlanBid effectiveDate(LocalDate effectiveDate) {
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
  public AgentWorkPlanBid status(StatusEnum status) {
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
   * The work plan fields visible to agents whenever work plan preferences are made
   **/
  public AgentWorkPlanBid workPlanFieldsVisibleToAgents(List<WorkPlanFieldsVisibleToAgentsEnum> workPlanFieldsVisibleToAgents) {
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
    AgentWorkPlanBid agentWorkPlanBid = (AgentWorkPlanBid) o;

    return Objects.equals(this.id, agentWorkPlanBid.id) &&
            Objects.equals(this.name, agentWorkPlanBid.name) &&
            Objects.equals(this.bidWindowStartDate, agentWorkPlanBid.bidWindowStartDate) &&
            Objects.equals(this.bidWindowEndDate, agentWorkPlanBid.bidWindowEndDate) &&
            Objects.equals(this.effectiveDate, agentWorkPlanBid.effectiveDate) &&
            Objects.equals(this.status, agentWorkPlanBid.status) &&
            Objects.equals(this.workPlanFieldsVisibleToAgents, agentWorkPlanBid.workPlanFieldsVisibleToAgents) &&
            Objects.equals(this.selfUri, agentWorkPlanBid.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, bidWindowStartDate, bidWindowEndDate, effectiveDate, status, workPlanFieldsVisibleToAgents, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentWorkPlanBid {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    bidWindowStartDate: ").append(toIndentedString(bidWindowStartDate)).append("\n");
    sb.append("    bidWindowEndDate: ").append(toIndentedString(bidWindowEndDate)).append("\n");
    sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    workPlanFieldsVisibleToAgents: ").append(toIndentedString(workPlanFieldsVisibleToAgents)).append("\n");
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

