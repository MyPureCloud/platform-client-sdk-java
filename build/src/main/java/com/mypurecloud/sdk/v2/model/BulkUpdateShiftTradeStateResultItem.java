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
import com.mypurecloud.sdk.v2.model.UserReference;
import com.mypurecloud.sdk.v2.model.WfmVersionedEntityMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * BulkUpdateShiftTradeStateResultItem
 */

public class BulkUpdateShiftTradeStateResultItem  implements Serializable {
  
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
   * The state of the shift trade after the update request is processed
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
  private UserReference reviewedBy = null;
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
   * The reason the update failed, if applicable
   */
 @JsonDeserialize(using = FailureReasonEnumDeserializer.class)
  public enum FailureReasonEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    INITIATINGAGENTSCHEDULENOTFOUND("InitiatingAgentScheduleNotFound"),
    INITIATINGAGENTSHIFTHASEXTERNALACTIVITIES("InitiatingAgentShiftHasExternalActivities"),
    INITIATINGAGENTSHIFTNOTFOUND("InitiatingAgentShiftNotFound"),
    RECEIVINGAGENTNOTFOUND("ReceivingAgentNotFound"),
    RECEIVINGAGENTSCHEDULENOTFOUND("ReceivingAgentScheduleNotFound"),
    RECEIVINGAGENTSHIFTHASEXTERNALACTIVITIES("ReceivingAgentShiftHasExternalActivities"),
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
  private WfmVersionedEntityMetadata metadata = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   * The state of the shift trade after the update request is processed
   **/
  public BulkUpdateShiftTradeStateResultItem state(StateEnum state) {
    this.state = state;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The state of the shift trade after the update request is processed")
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }

  
  /**
   * The user who reviewed the request, if applicable
   **/
  public BulkUpdateShiftTradeStateResultItem reviewedBy(UserReference reviewedBy) {
    this.reviewedBy = reviewedBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user who reviewed the request, if applicable")
  @JsonProperty("reviewedBy")
  public UserReference getReviewedBy() {
    return reviewedBy;
  }
  public void setReviewedBy(UserReference reviewedBy) {
    this.reviewedBy = reviewedBy;
  }

  
  /**
   * The date the request was reviewed, if applicable. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public BulkUpdateShiftTradeStateResultItem reviewedDate(Date reviewedDate) {
    this.reviewedDate = reviewedDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The date the request was reviewed, if applicable. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("reviewedDate")
  public Date getReviewedDate() {
    return reviewedDate;
  }
  public void setReviewedDate(Date reviewedDate) {
    this.reviewedDate = reviewedDate;
  }

  
  /**
   * The reason the update failed, if applicable
   **/
  public BulkUpdateShiftTradeStateResultItem failureReason(FailureReasonEnum failureReason) {
    this.failureReason = failureReason;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The reason the update failed, if applicable")
  @JsonProperty("failureReason")
  public FailureReasonEnum getFailureReason() {
    return failureReason;
  }
  public void setFailureReason(FailureReasonEnum failureReason) {
    this.failureReason = failureReason;
  }

  
  /**
   * Version metadata for the shift trade
   **/
  public BulkUpdateShiftTradeStateResultItem metadata(WfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Version metadata for the shift trade")
  @JsonProperty("metadata")
  public WfmVersionedEntityMetadata getMetadata() {
    return metadata;
  }
  public void setMetadata(WfmVersionedEntityMetadata metadata) {
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
    BulkUpdateShiftTradeStateResultItem bulkUpdateShiftTradeStateResultItem = (BulkUpdateShiftTradeStateResultItem) o;
    return Objects.equals(this.id, bulkUpdateShiftTradeStateResultItem.id) &&
        Objects.equals(this.state, bulkUpdateShiftTradeStateResultItem.state) &&
        Objects.equals(this.reviewedBy, bulkUpdateShiftTradeStateResultItem.reviewedBy) &&
        Objects.equals(this.reviewedDate, bulkUpdateShiftTradeStateResultItem.reviewedDate) &&
        Objects.equals(this.failureReason, bulkUpdateShiftTradeStateResultItem.failureReason) &&
        Objects.equals(this.metadata, bulkUpdateShiftTradeStateResultItem.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, state, reviewedBy, reviewedDate, failureReason, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkUpdateShiftTradeStateResultItem {\n");
    
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

