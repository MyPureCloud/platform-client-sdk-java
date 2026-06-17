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

import java.io.Serializable;
/**
 * AgentScheduleBid
 */

public class AgentScheduleBid  implements Serializable {
  
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
  private String selfUri = null;

  public AgentScheduleBid() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public AgentScheduleBid(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The ID of the schedule bid
   **/
  public AgentScheduleBid id(String id) {
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
   **/
  public AgentScheduleBid name(String name) {
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
   * The bid start date when agents can start participating in schedule bidding relative to the business unit time zone in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public AgentScheduleBid bidWindowStartDate(LocalDate bidWindowStartDate) {
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
  public AgentScheduleBid bidWindowEndDate(LocalDate bidWindowEndDate) {
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
  public AgentScheduleBid effectiveDate(LocalDate effectiveDate) {
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
  public AgentScheduleBid status(StatusEnum status) {
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
  public AgentScheduleBid bidType(BidTypeEnum bidType) {
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
    AgentScheduleBid agentScheduleBid = (AgentScheduleBid) o;

    return Objects.equals(this.id, agentScheduleBid.id) &&
            Objects.equals(this.name, agentScheduleBid.name) &&
            Objects.equals(this.bidWindowStartDate, agentScheduleBid.bidWindowStartDate) &&
            Objects.equals(this.bidWindowEndDate, agentScheduleBid.bidWindowEndDate) &&
            Objects.equals(this.effectiveDate, agentScheduleBid.effectiveDate) &&
            Objects.equals(this.status, agentScheduleBid.status) &&
            Objects.equals(this.bidType, agentScheduleBid.bidType) &&
            Objects.equals(this.selfUri, agentScheduleBid.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, bidWindowStartDate, bidWindowEndDate, effectiveDate, status, bidType, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentScheduleBid {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    bidWindowStartDate: ").append(toIndentedString(bidWindowStartDate)).append("\n");
    sb.append("    bidWindowEndDate: ").append(toIndentedString(bidWindowEndDate)).append("\n");
    sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    bidType: ").append(toIndentedString(bidType)).append("\n");
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

