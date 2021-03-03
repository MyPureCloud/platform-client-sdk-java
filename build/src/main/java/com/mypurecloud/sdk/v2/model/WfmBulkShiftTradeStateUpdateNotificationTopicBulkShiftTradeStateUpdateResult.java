package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.Objects;
import java.io.IOException;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.WfmBulkShiftTradeStateUpdateNotificationTopicUserReference;
import com.mypurecloud.sdk.v2.model.WfmBulkShiftTradeStateUpdateNotificationTopicWfmVersionedEntityMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * WfmBulkShiftTradeStateUpdateNotificationTopicBulkShiftTradeStateUpdateResult
 */

public class WfmBulkShiftTradeStateUpdateNotificationTopicBulkShiftTradeStateUpdateResult  implements Serializable {
  
  private String id = null;

  private static class StateEnumDeserializer extends StdDeserializer<StateEnum> {
    public StateEnumDeserializer() {
      super(StateEnumDeserializer.class);
    }

    @Override
    public StateEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return StateEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets state
   */
 @JsonDeserialize(using = StateEnumDeserializer.class)
  public enum StateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNMATCHED("Unmatched"),
    MATCHED("Matched"),
    APPROVED("Approved"),
    DENIED("Denied"),
    EXPIRED("Expired"),
    CANCELED("Canceled");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StateEnum fromString(String key) {
      if (key == null) return null;

      for (StateEnum value : StateEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StateEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StateEnum state = null;
  private WfmBulkShiftTradeStateUpdateNotificationTopicUserReference reviewedBy = null;
  private Date reviewedDate = null;

  private static class FailureReasonEnumDeserializer extends StdDeserializer<FailureReasonEnum> {
    public FailureReasonEnumDeserializer() {
      super(FailureReasonEnumDeserializer.class);
    }

    @Override
    public FailureReasonEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return FailureReasonEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets failureReason
   */
 @JsonDeserialize(using = FailureReasonEnumDeserializer.class)
  public enum FailureReasonEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    INITIATINGAGENTSCHEDULENOTFOUND("InitiatingAgentScheduleNotFound"),
    INITIATINGAGENTSHIFTNOTFOUND("InitiatingAgentShiftNotFound"),
    RECEIVINGAGENTNOTFOUND("ReceivingAgentNotFound"),
    RECEIVINGAGENTSCHEDULENOTFOUND("ReceivingAgentScheduleNotFound"),
    RECEIVINGAGENTSHIFTNOTFOUND("ReceivingAgentShiftNotFound"),
    SCHEDULENOTPUBLISHED("ScheduleNotPublished"),
    TRANSITIONNOTALLOWED("TransitionNotAllowed");

    private String value;

    FailureReasonEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static FailureReasonEnum fromString(String key) {
      if (key == null) return null;

      for (FailureReasonEnum value : FailureReasonEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return FailureReasonEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private FailureReasonEnum failureReason = null;
  private WfmBulkShiftTradeStateUpdateNotificationTopicWfmVersionedEntityMetadata metadata = null;

  
  /**
   **/
  public WfmBulkShiftTradeStateUpdateNotificationTopicBulkShiftTradeStateUpdateResult id(String id) {
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
  public WfmBulkShiftTradeStateUpdateNotificationTopicBulkShiftTradeStateUpdateResult state(StateEnum state) {
    this.state = state;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }

  
  /**
   **/
  public WfmBulkShiftTradeStateUpdateNotificationTopicBulkShiftTradeStateUpdateResult reviewedBy(WfmBulkShiftTradeStateUpdateNotificationTopicUserReference reviewedBy) {
    this.reviewedBy = reviewedBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("reviewedBy")
  public WfmBulkShiftTradeStateUpdateNotificationTopicUserReference getReviewedBy() {
    return reviewedBy;
  }
  public void setReviewedBy(WfmBulkShiftTradeStateUpdateNotificationTopicUserReference reviewedBy) {
    this.reviewedBy = reviewedBy;
  }

  
  /**
   **/
  public WfmBulkShiftTradeStateUpdateNotificationTopicBulkShiftTradeStateUpdateResult reviewedDate(Date reviewedDate) {
    this.reviewedDate = reviewedDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("reviewedDate")
  public Date getReviewedDate() {
    return reviewedDate;
  }
  public void setReviewedDate(Date reviewedDate) {
    this.reviewedDate = reviewedDate;
  }

  
  /**
   **/
  public WfmBulkShiftTradeStateUpdateNotificationTopicBulkShiftTradeStateUpdateResult failureReason(FailureReasonEnum failureReason) {
    this.failureReason = failureReason;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("failureReason")
  public FailureReasonEnum getFailureReason() {
    return failureReason;
  }
  public void setFailureReason(FailureReasonEnum failureReason) {
    this.failureReason = failureReason;
  }

  
  /**
   **/
  public WfmBulkShiftTradeStateUpdateNotificationTopicBulkShiftTradeStateUpdateResult metadata(WfmBulkShiftTradeStateUpdateNotificationTopicWfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("metadata")
  public WfmBulkShiftTradeStateUpdateNotificationTopicWfmVersionedEntityMetadata getMetadata() {
    return metadata;
  }
  public void setMetadata(WfmBulkShiftTradeStateUpdateNotificationTopicWfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WfmBulkShiftTradeStateUpdateNotificationTopicBulkShiftTradeStateUpdateResult wfmBulkShiftTradeStateUpdateNotificationTopicBulkShiftTradeStateUpdateResult = (WfmBulkShiftTradeStateUpdateNotificationTopicBulkShiftTradeStateUpdateResult) o;
    return Objects.equals(this.id, wfmBulkShiftTradeStateUpdateNotificationTopicBulkShiftTradeStateUpdateResult.id) &&
        Objects.equals(this.state, wfmBulkShiftTradeStateUpdateNotificationTopicBulkShiftTradeStateUpdateResult.state) &&
        Objects.equals(this.reviewedBy, wfmBulkShiftTradeStateUpdateNotificationTopicBulkShiftTradeStateUpdateResult.reviewedBy) &&
        Objects.equals(this.reviewedDate, wfmBulkShiftTradeStateUpdateNotificationTopicBulkShiftTradeStateUpdateResult.reviewedDate) &&
        Objects.equals(this.failureReason, wfmBulkShiftTradeStateUpdateNotificationTopicBulkShiftTradeStateUpdateResult.failureReason) &&
        Objects.equals(this.metadata, wfmBulkShiftTradeStateUpdateNotificationTopicBulkShiftTradeStateUpdateResult.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, state, reviewedBy, reviewedDate, failureReason, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmBulkShiftTradeStateUpdateNotificationTopicBulkShiftTradeStateUpdateResult {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    reviewedBy: ").append(toIndentedString(reviewedBy)).append("\n");
    sb.append("    reviewedDate: ").append(toIndentedString(reviewedDate)).append("\n");
    sb.append("    failureReason: ").append(toIndentedString(failureReason)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

