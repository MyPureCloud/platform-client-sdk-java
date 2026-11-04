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
import com.mypurecloud.sdk.v2.model.WfmShifttradingUpdateTradeJobEventShiftTradeInitiatingSide;
import com.mypurecloud.sdk.v2.model.WfmShifttradingUpdateTradeJobEventShiftTradeInterval;
import com.mypurecloud.sdk.v2.model.WfmShifttradingUpdateTradeJobEventShiftTradeReceivingSide;
import com.mypurecloud.sdk.v2.model.WfmShifttradingUpdateTradeJobEventShiftTradeTarget;
import com.mypurecloud.sdk.v2.model.WfmShifttradingUpdateTradeJobEventUserReference;
import com.mypurecloud.sdk.v2.model.WfmShifttradingUpdateTradeJobEventWfmVersionedEntityMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * WfmShifttradingUpdateTradeJobEventShiftTradeDetail
 */

public class WfmShifttradingUpdateTradeJobEventShiftTradeDetail  implements Serializable {
  
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
  private Date expirationDate = null;
  private List<WfmShifttradingUpdateTradeJobEventShiftTradeInterval> acceptableIntervals = null;
  private Boolean oneSided = null;
  private WfmShifttradingUpdateTradeJobEventShiftTradeInitiatingSide initiating = null;
  private WfmShifttradingUpdateTradeJobEventShiftTradeReceivingSide receiving = null;
  private WfmShifttradingUpdateTradeJobEventShiftTradeTarget target = null;
  private WfmShifttradingUpdateTradeJobEventUserReference reviewedBy = null;
  private Date reviewedDate = null;
  private WfmShifttradingUpdateTradeJobEventWfmVersionedEntityMetadata metadata = null;

  public WfmShifttradingUpdateTradeJobEventShiftTradeDetail() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      acceptableIntervals = new ArrayList<WfmShifttradingUpdateTradeJobEventShiftTradeInterval>();
    }
  }

  public WfmShifttradingUpdateTradeJobEventShiftTradeDetail(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      acceptableIntervals = new ArrayList<WfmShifttradingUpdateTradeJobEventShiftTradeInterval>();
    }
  }

  
  /**
   **/
  public WfmShifttradingUpdateTradeJobEventShiftTradeDetail id(String id) {
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
  public WfmShifttradingUpdateTradeJobEventShiftTradeDetail state(StateEnum state) {
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
  public WfmShifttradingUpdateTradeJobEventShiftTradeDetail expirationDate(Date expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("expirationDate")
  public Date getExpirationDate() {
    return expirationDate;
  }
  public void setExpirationDate(Date expirationDate) {
    this.expirationDate = expirationDate;
  }


  /**
   **/
  public WfmShifttradingUpdateTradeJobEventShiftTradeDetail acceptableIntervals(List<WfmShifttradingUpdateTradeJobEventShiftTradeInterval> acceptableIntervals) {
    this.acceptableIntervals = acceptableIntervals;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("acceptableIntervals")
  public List<WfmShifttradingUpdateTradeJobEventShiftTradeInterval> getAcceptableIntervals() {
    return acceptableIntervals;
  }
  public void setAcceptableIntervals(List<WfmShifttradingUpdateTradeJobEventShiftTradeInterval> acceptableIntervals) {
    this.acceptableIntervals = acceptableIntervals;
  }


  /**
   **/
  public WfmShifttradingUpdateTradeJobEventShiftTradeDetail oneSided(Boolean oneSided) {
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
  public WfmShifttradingUpdateTradeJobEventShiftTradeDetail initiating(WfmShifttradingUpdateTradeJobEventShiftTradeInitiatingSide initiating) {
    this.initiating = initiating;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("initiating")
  public WfmShifttradingUpdateTradeJobEventShiftTradeInitiatingSide getInitiating() {
    return initiating;
  }
  public void setInitiating(WfmShifttradingUpdateTradeJobEventShiftTradeInitiatingSide initiating) {
    this.initiating = initiating;
  }


  /**
   **/
  public WfmShifttradingUpdateTradeJobEventShiftTradeDetail receiving(WfmShifttradingUpdateTradeJobEventShiftTradeReceivingSide receiving) {
    this.receiving = receiving;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("receiving")
  public WfmShifttradingUpdateTradeJobEventShiftTradeReceivingSide getReceiving() {
    return receiving;
  }
  public void setReceiving(WfmShifttradingUpdateTradeJobEventShiftTradeReceivingSide receiving) {
    this.receiving = receiving;
  }


  /**
   **/
  public WfmShifttradingUpdateTradeJobEventShiftTradeDetail target(WfmShifttradingUpdateTradeJobEventShiftTradeTarget target) {
    this.target = target;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("target")
  public WfmShifttradingUpdateTradeJobEventShiftTradeTarget getTarget() {
    return target;
  }
  public void setTarget(WfmShifttradingUpdateTradeJobEventShiftTradeTarget target) {
    this.target = target;
  }


  /**
   **/
  public WfmShifttradingUpdateTradeJobEventShiftTradeDetail reviewedBy(WfmShifttradingUpdateTradeJobEventUserReference reviewedBy) {
    this.reviewedBy = reviewedBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("reviewedBy")
  public WfmShifttradingUpdateTradeJobEventUserReference getReviewedBy() {
    return reviewedBy;
  }
  public void setReviewedBy(WfmShifttradingUpdateTradeJobEventUserReference reviewedBy) {
    this.reviewedBy = reviewedBy;
  }


  /**
   **/
  public WfmShifttradingUpdateTradeJobEventShiftTradeDetail reviewedDate(Date reviewedDate) {
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
  public WfmShifttradingUpdateTradeJobEventShiftTradeDetail metadata(WfmShifttradingUpdateTradeJobEventWfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("metadata")
  public WfmShifttradingUpdateTradeJobEventWfmVersionedEntityMetadata getMetadata() {
    return metadata;
  }
  public void setMetadata(WfmShifttradingUpdateTradeJobEventWfmVersionedEntityMetadata metadata) {
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
    WfmShifttradingUpdateTradeJobEventShiftTradeDetail wfmShifttradingUpdateTradeJobEventShiftTradeDetail = (WfmShifttradingUpdateTradeJobEventShiftTradeDetail) o;

    return Objects.equals(this.id, wfmShifttradingUpdateTradeJobEventShiftTradeDetail.id) &&
            Objects.equals(this.state, wfmShifttradingUpdateTradeJobEventShiftTradeDetail.state) &&
            Objects.equals(this.expirationDate, wfmShifttradingUpdateTradeJobEventShiftTradeDetail.expirationDate) &&
            Objects.equals(this.acceptableIntervals, wfmShifttradingUpdateTradeJobEventShiftTradeDetail.acceptableIntervals) &&
            Objects.equals(this.oneSided, wfmShifttradingUpdateTradeJobEventShiftTradeDetail.oneSided) &&
            Objects.equals(this.initiating, wfmShifttradingUpdateTradeJobEventShiftTradeDetail.initiating) &&
            Objects.equals(this.receiving, wfmShifttradingUpdateTradeJobEventShiftTradeDetail.receiving) &&
            Objects.equals(this.target, wfmShifttradingUpdateTradeJobEventShiftTradeDetail.target) &&
            Objects.equals(this.reviewedBy, wfmShifttradingUpdateTradeJobEventShiftTradeDetail.reviewedBy) &&
            Objects.equals(this.reviewedDate, wfmShifttradingUpdateTradeJobEventShiftTradeDetail.reviewedDate) &&
            Objects.equals(this.metadata, wfmShifttradingUpdateTradeJobEventShiftTradeDetail.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, state, expirationDate, acceptableIntervals, oneSided, initiating, receiving, target, reviewedBy, reviewedDate, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmShifttradingUpdateTradeJobEventShiftTradeDetail {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    acceptableIntervals: ").append(toIndentedString(acceptableIntervals)).append("\n");
    sb.append("    oneSided: ").append(toIndentedString(oneSided)).append("\n");
    sb.append("    initiating: ").append(toIndentedString(initiating)).append("\n");
    sb.append("    receiving: ").append(toIndentedString(receiving)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
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

