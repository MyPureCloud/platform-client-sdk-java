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
import com.mypurecloud.sdk.v2.model.UserReference;
import com.mypurecloud.sdk.v2.model.WfmVersionedEntityMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * AlternativeShiftTradeBulkUpdateTemplateItem
 */

public class AlternativeShiftTradeBulkUpdateTemplateItem  implements Serializable {
  
  private String tradeId = null;

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
   * The current state of this alternative shift trade request
   */
 @JsonDeserialize(using = StateEnumDeserializer.class)
  public enum StateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    CANCELED("Canceled"),
    DENIED("Denied"),
    EXPIRED("Expired"),
    SUBMITTED("Submitted"),
    APPROVED("Approved");

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
    TRANSITIONNOTALLOWED("TransitionNotAllowed"),
    NOTAUTHORIZED("NotAuthorized");

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
  private Date adminDateReviewed = null;
  private UserReference adminReviewedBy = null;
  private WfmVersionedEntityMetadata metadata = null;

  public AlternativeShiftTradeBulkUpdateTemplateItem() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The ID of this alternative shift trade
   **/
  public AlternativeShiftTradeBulkUpdateTemplateItem tradeId(String tradeId) {
    this.tradeId = tradeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of this alternative shift trade")
  @JsonProperty("tradeId")
  public String getTradeId() {
    return tradeId;
  }
  public void setTradeId(String tradeId) {
    this.tradeId = tradeId;
  }


  /**
   * The current state of this alternative shift trade request
   **/
  public AlternativeShiftTradeBulkUpdateTemplateItem state(StateEnum state) {
    this.state = state;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The current state of this alternative shift trade request")
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }


  /**
   * The reason the update failed, if applicable
   **/
  public AlternativeShiftTradeBulkUpdateTemplateItem failureReason(FailureReasonEnum failureReason) {
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
   * The timestamp of when the trade request was manually reviewed by an admin in ISO-8601 format
   **/
  public AlternativeShiftTradeBulkUpdateTemplateItem adminDateReviewed(Date adminDateReviewed) {
    this.adminDateReviewed = adminDateReviewed;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The timestamp of when the trade request was manually reviewed by an admin in ISO-8601 format")
  @JsonProperty("adminDateReviewed")
  public Date getAdminDateReviewed() {
    return adminDateReviewed;
  }
  public void setAdminDateReviewed(Date adminDateReviewed) {
    this.adminDateReviewed = adminDateReviewed;
  }


  /**
   * The admin who manually reviewed this alternative shift trade after system denial
   **/
  public AlternativeShiftTradeBulkUpdateTemplateItem adminReviewedBy(UserReference adminReviewedBy) {
    this.adminReviewedBy = adminReviewedBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The admin who manually reviewed this alternative shift trade after system denial")
  @JsonProperty("adminReviewedBy")
  public UserReference getAdminReviewedBy() {
    return adminReviewedBy;
  }
  public void setAdminReviewedBy(UserReference adminReviewedBy) {
    this.adminReviewedBy = adminReviewedBy;
  }


  /**
   * Version metadata for this alternative shift trade
   **/
  public AlternativeShiftTradeBulkUpdateTemplateItem metadata(WfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Version metadata for this alternative shift trade")
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
    AlternativeShiftTradeBulkUpdateTemplateItem alternativeShiftTradeBulkUpdateTemplateItem = (AlternativeShiftTradeBulkUpdateTemplateItem) o;

    return Objects.equals(this.tradeId, alternativeShiftTradeBulkUpdateTemplateItem.tradeId) &&
            Objects.equals(this.state, alternativeShiftTradeBulkUpdateTemplateItem.state) &&
            Objects.equals(this.failureReason, alternativeShiftTradeBulkUpdateTemplateItem.failureReason) &&
            Objects.equals(this.adminDateReviewed, alternativeShiftTradeBulkUpdateTemplateItem.adminDateReviewed) &&
            Objects.equals(this.adminReviewedBy, alternativeShiftTradeBulkUpdateTemplateItem.adminReviewedBy) &&
            Objects.equals(this.metadata, alternativeShiftTradeBulkUpdateTemplateItem.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tradeId, state, failureReason, adminDateReviewed, adminReviewedBy, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlternativeShiftTradeBulkUpdateTemplateItem {\n");
    
    sb.append("    tradeId: ").append(toIndentedString(tradeId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    failureReason: ").append(toIndentedString(failureReason)).append("\n");
    sb.append("    adminDateReviewed: ").append(toIndentedString(adminDateReviewed)).append("\n");
    sb.append("    adminReviewedBy: ").append(toIndentedString(adminReviewedBy)).append("\n");
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

