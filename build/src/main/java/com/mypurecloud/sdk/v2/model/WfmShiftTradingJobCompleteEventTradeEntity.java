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
import com.mypurecloud.sdk.v2.model.WfmShiftTradingJobCompleteEventTradeSide;
import com.mypurecloud.sdk.v2.model.WfmShiftTradingJobCompleteEventWfmDateTimeInterval;
import com.mypurecloud.sdk.v2.model.WfmShiftTradingJobCompleteEventWfmVersionMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * WfmShiftTradingJobCompleteEventTradeEntity
 */

public class WfmShiftTradingJobCompleteEventTradeEntity  implements Serializable {
  
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
    UNKNOWN("Unknown"),
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
  private String expirationDate = null;
  private List<WfmShiftTradingJobCompleteEventWfmDateTimeInterval> acceptableIntervals = null;
  private Boolean oneSided = null;
  private WfmShiftTradingJobCompleteEventTradeSide initiating = null;
  private WfmShiftTradingJobCompleteEventTradeSide receiving = null;
  private String targetUserId = null;
  private String reviewedBy = null;
  private String reviewedDate = null;
  private WfmShiftTradingJobCompleteEventWfmVersionMetadata metadata = null;

  public WfmShiftTradingJobCompleteEventTradeEntity() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      acceptableIntervals = new ArrayList<WfmShiftTradingJobCompleteEventWfmDateTimeInterval>();
    }
  }

  public WfmShiftTradingJobCompleteEventTradeEntity(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      acceptableIntervals = new ArrayList<WfmShiftTradingJobCompleteEventWfmDateTimeInterval>();
    }
  }

  
  /**
   **/
  public WfmShiftTradingJobCompleteEventTradeEntity id(String id) {
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
  public WfmShiftTradingJobCompleteEventTradeEntity state(StateEnum state) {
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
  public WfmShiftTradingJobCompleteEventTradeEntity expirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("expirationDate")
  public String getExpirationDate() {
    return expirationDate;
  }
  public void setExpirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
  }


  /**
   **/
  public WfmShiftTradingJobCompleteEventTradeEntity acceptableIntervals(List<WfmShiftTradingJobCompleteEventWfmDateTimeInterval> acceptableIntervals) {
    this.acceptableIntervals = acceptableIntervals;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("acceptableIntervals")
  public List<WfmShiftTradingJobCompleteEventWfmDateTimeInterval> getAcceptableIntervals() {
    return acceptableIntervals;
  }
  public void setAcceptableIntervals(List<WfmShiftTradingJobCompleteEventWfmDateTimeInterval> acceptableIntervals) {
    this.acceptableIntervals = acceptableIntervals;
  }


  /**
   **/
  public WfmShiftTradingJobCompleteEventTradeEntity oneSided(Boolean oneSided) {
    this.oneSided = oneSided;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("oneSided")
  public Boolean getOneSided() {
    return oneSided;
  }
  public void setOneSided(Boolean oneSided) {
    this.oneSided = oneSided;
  }


  /**
   **/
  public WfmShiftTradingJobCompleteEventTradeEntity initiating(WfmShiftTradingJobCompleteEventTradeSide initiating) {
    this.initiating = initiating;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("initiating")
  public WfmShiftTradingJobCompleteEventTradeSide getInitiating() {
    return initiating;
  }
  public void setInitiating(WfmShiftTradingJobCompleteEventTradeSide initiating) {
    this.initiating = initiating;
  }


  /**
   **/
  public WfmShiftTradingJobCompleteEventTradeEntity receiving(WfmShiftTradingJobCompleteEventTradeSide receiving) {
    this.receiving = receiving;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("receiving")
  public WfmShiftTradingJobCompleteEventTradeSide getReceiving() {
    return receiving;
  }
  public void setReceiving(WfmShiftTradingJobCompleteEventTradeSide receiving) {
    this.receiving = receiving;
  }


  /**
   **/
  public WfmShiftTradingJobCompleteEventTradeEntity targetUserId(String targetUserId) {
    this.targetUserId = targetUserId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("targetUserId")
  public String getTargetUserId() {
    return targetUserId;
  }
  public void setTargetUserId(String targetUserId) {
    this.targetUserId = targetUserId;
  }


  /**
   **/
  public WfmShiftTradingJobCompleteEventTradeEntity reviewedBy(String reviewedBy) {
    this.reviewedBy = reviewedBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("reviewedBy")
  public String getReviewedBy() {
    return reviewedBy;
  }
  public void setReviewedBy(String reviewedBy) {
    this.reviewedBy = reviewedBy;
  }


  /**
   **/
  public WfmShiftTradingJobCompleteEventTradeEntity reviewedDate(String reviewedDate) {
    this.reviewedDate = reviewedDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("reviewedDate")
  public String getReviewedDate() {
    return reviewedDate;
  }
  public void setReviewedDate(String reviewedDate) {
    this.reviewedDate = reviewedDate;
  }


  /**
   **/
  public WfmShiftTradingJobCompleteEventTradeEntity metadata(WfmShiftTradingJobCompleteEventWfmVersionMetadata metadata) {
    this.metadata = metadata;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("metadata")
  public WfmShiftTradingJobCompleteEventWfmVersionMetadata getMetadata() {
    return metadata;
  }
  public void setMetadata(WfmShiftTradingJobCompleteEventWfmVersionMetadata metadata) {
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
    WfmShiftTradingJobCompleteEventTradeEntity wfmShiftTradingJobCompleteEventTradeEntity = (WfmShiftTradingJobCompleteEventTradeEntity) o;

    return Objects.equals(this.id, wfmShiftTradingJobCompleteEventTradeEntity.id) &&
            Objects.equals(this.state, wfmShiftTradingJobCompleteEventTradeEntity.state) &&
            Objects.equals(this.expirationDate, wfmShiftTradingJobCompleteEventTradeEntity.expirationDate) &&
            Objects.equals(this.acceptableIntervals, wfmShiftTradingJobCompleteEventTradeEntity.acceptableIntervals) &&
            Objects.equals(this.oneSided, wfmShiftTradingJobCompleteEventTradeEntity.oneSided) &&
            Objects.equals(this.initiating, wfmShiftTradingJobCompleteEventTradeEntity.initiating) &&
            Objects.equals(this.receiving, wfmShiftTradingJobCompleteEventTradeEntity.receiving) &&
            Objects.equals(this.targetUserId, wfmShiftTradingJobCompleteEventTradeEntity.targetUserId) &&
            Objects.equals(this.reviewedBy, wfmShiftTradingJobCompleteEventTradeEntity.reviewedBy) &&
            Objects.equals(this.reviewedDate, wfmShiftTradingJobCompleteEventTradeEntity.reviewedDate) &&
            Objects.equals(this.metadata, wfmShiftTradingJobCompleteEventTradeEntity.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, state, expirationDate, acceptableIntervals, oneSided, initiating, receiving, targetUserId, reviewedBy, reviewedDate, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmShiftTradingJobCompleteEventTradeEntity {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    acceptableIntervals: ").append(toIndentedString(acceptableIntervals)).append("\n");
    sb.append("    oneSided: ").append(toIndentedString(oneSided)).append("\n");
    sb.append("    initiating: ").append(toIndentedString(initiating)).append("\n");
    sb.append("    receiving: ").append(toIndentedString(receiving)).append("\n");
    sb.append("    targetUserId: ").append(toIndentedString(targetUserId)).append("\n");
    sb.append("    reviewedBy: ").append(toIndentedString(reviewedBy)).append("\n");
    sb.append("    reviewedDate: ").append(toIndentedString(reviewedDate)).append("\n");
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

