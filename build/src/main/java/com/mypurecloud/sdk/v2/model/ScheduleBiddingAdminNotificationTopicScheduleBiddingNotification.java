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

import java.io.Serializable;
/**
 * ScheduleBiddingAdminNotificationTopicScheduleBiddingNotification
 */

public class ScheduleBiddingAdminNotificationTopicScheduleBiddingNotification  implements Serializable {
  
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
   * Gets or Sets bidType
   */
 @JsonDeserialize(using = BidTypeEnumDeserializer.class)
  public enum BidTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("Unknown"),
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

  public ScheduleBiddingAdminNotificationTopicScheduleBiddingNotification() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public ScheduleBiddingAdminNotificationTopicScheduleBiddingNotification(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   **/
  public ScheduleBiddingAdminNotificationTopicScheduleBiddingNotification id(String id) {
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
  public ScheduleBiddingAdminNotificationTopicScheduleBiddingNotification buId(String buId) {
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
  public ScheduleBiddingAdminNotificationTopicScheduleBiddingNotification status(StatusEnum status) {
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
  public ScheduleBiddingAdminNotificationTopicScheduleBiddingNotification bidType(BidTypeEnum bidType) {
    this.bidType = bidType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("bidType")
  public BidTypeEnum getBidType() {
    return bidType;
  }
  public void setBidType(BidTypeEnum bidType) {
    this.bidType = bidType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScheduleBiddingAdminNotificationTopicScheduleBiddingNotification scheduleBiddingAdminNotificationTopicScheduleBiddingNotification = (ScheduleBiddingAdminNotificationTopicScheduleBiddingNotification) o;

    return Objects.equals(this.id, scheduleBiddingAdminNotificationTopicScheduleBiddingNotification.id) &&
            Objects.equals(this.buId, scheduleBiddingAdminNotificationTopicScheduleBiddingNotification.buId) &&
            Objects.equals(this.status, scheduleBiddingAdminNotificationTopicScheduleBiddingNotification.status) &&
            Objects.equals(this.bidType, scheduleBiddingAdminNotificationTopicScheduleBiddingNotification.bidType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, buId, status, bidType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleBiddingAdminNotificationTopicScheduleBiddingNotification {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    buId: ").append(toIndentedString(buId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    bidType: ").append(toIndentedString(bidType)).append("\n");
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

