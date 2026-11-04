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
import com.mypurecloud.sdk.v2.model.WfmShifttradingAddTradeJobEventShiftTradeInitiatingSide;
import com.mypurecloud.sdk.v2.model.WfmShifttradingAddTradeJobEventShiftTradeInterval;
import com.mypurecloud.sdk.v2.model.WfmShifttradingAddTradeJobEventShiftTradeReceivingSide;
import com.mypurecloud.sdk.v2.model.WfmShifttradingAddTradeJobEventShiftTradeTarget;
import com.mypurecloud.sdk.v2.model.WfmShifttradingAddTradeJobEventUserReference;
import com.mypurecloud.sdk.v2.model.WfmShifttradingAddTradeJobEventWfmVersionedEntityMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * WfmShifttradingAddTradeJobEventShiftTradeDetail
 */

public class WfmShifttradingAddTradeJobEventShiftTradeDetail  implements Serializable {
  
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
  private List<WfmShifttradingAddTradeJobEventShiftTradeInterval> acceptableIntervals = null;
  private Boolean oneSided = null;
  private WfmShifttradingAddTradeJobEventShiftTradeInitiatingSide initiating = null;
  private WfmShifttradingAddTradeJobEventShiftTradeReceivingSide receiving = null;
  private WfmShifttradingAddTradeJobEventShiftTradeTarget target = null;
  private WfmShifttradingAddTradeJobEventUserReference reviewedBy = null;
  private Date reviewedDate = null;
  private WfmShifttradingAddTradeJobEventWfmVersionedEntityMetadata metadata = null;

  public WfmShifttradingAddTradeJobEventShiftTradeDetail() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      acceptableIntervals = new ArrayList<WfmShifttradingAddTradeJobEventShiftTradeInterval>();
    }
  }

  public WfmShifttradingAddTradeJobEventShiftTradeDetail(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      acceptableIntervals = new ArrayList<WfmShifttradingAddTradeJobEventShiftTradeInterval>();
    }
  }

  
  /**
   **/
  public WfmShifttradingAddTradeJobEventShiftTradeDetail id(String id) {
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
  public WfmShifttradingAddTradeJobEventShiftTradeDetail state(StateEnum state) {
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
  public WfmShifttradingAddTradeJobEventShiftTradeDetail expirationDate(Date expirationDate) {
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
  public WfmShifttradingAddTradeJobEventShiftTradeDetail acceptableIntervals(List<WfmShifttradingAddTradeJobEventShiftTradeInterval> acceptableIntervals) {
    this.acceptableIntervals = acceptableIntervals;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("acceptableIntervals")
  public List<WfmShifttradingAddTradeJobEventShiftTradeInterval> getAcceptableIntervals() {
    return acceptableIntervals;
  }
  public void setAcceptableIntervals(List<WfmShifttradingAddTradeJobEventShiftTradeInterval> acceptableIntervals) {
    this.acceptableIntervals = acceptableIntervals;
  }


  /**
   **/
  public WfmShifttradingAddTradeJobEventShiftTradeDetail oneSided(Boolean oneSided) {
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
  public WfmShifttradingAddTradeJobEventShiftTradeDetail initiating(WfmShifttradingAddTradeJobEventShiftTradeInitiatingSide initiating) {
    this.initiating = initiating;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("initiating")
  public WfmShifttradingAddTradeJobEventShiftTradeInitiatingSide getInitiating() {
    return initiating;
  }
  public void setInitiating(WfmShifttradingAddTradeJobEventShiftTradeInitiatingSide initiating) {
    this.initiating = initiating;
  }


  /**
   **/
  public WfmShifttradingAddTradeJobEventShiftTradeDetail receiving(WfmShifttradingAddTradeJobEventShiftTradeReceivingSide receiving) {
    this.receiving = receiving;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("receiving")
  public WfmShifttradingAddTradeJobEventShiftTradeReceivingSide getReceiving() {
    return receiving;
  }
  public void setReceiving(WfmShifttradingAddTradeJobEventShiftTradeReceivingSide receiving) {
    this.receiving = receiving;
  }


  /**
   **/
  public WfmShifttradingAddTradeJobEventShiftTradeDetail target(WfmShifttradingAddTradeJobEventShiftTradeTarget target) {
    this.target = target;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("target")
  public WfmShifttradingAddTradeJobEventShiftTradeTarget getTarget() {
    return target;
  }
  public void setTarget(WfmShifttradingAddTradeJobEventShiftTradeTarget target) {
    this.target = target;
  }


  /**
   **/
  public WfmShifttradingAddTradeJobEventShiftTradeDetail reviewedBy(WfmShifttradingAddTradeJobEventUserReference reviewedBy) {
    this.reviewedBy = reviewedBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("reviewedBy")
  public WfmShifttradingAddTradeJobEventUserReference getReviewedBy() {
    return reviewedBy;
  }
  public void setReviewedBy(WfmShifttradingAddTradeJobEventUserReference reviewedBy) {
    this.reviewedBy = reviewedBy;
  }


  /**
   **/
  public WfmShifttradingAddTradeJobEventShiftTradeDetail reviewedDate(Date reviewedDate) {
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
  public WfmShifttradingAddTradeJobEventShiftTradeDetail metadata(WfmShifttradingAddTradeJobEventWfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("metadata")
  public WfmShifttradingAddTradeJobEventWfmVersionedEntityMetadata getMetadata() {
    return metadata;
  }
  public void setMetadata(WfmShifttradingAddTradeJobEventWfmVersionedEntityMetadata metadata) {
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
    WfmShifttradingAddTradeJobEventShiftTradeDetail wfmShifttradingAddTradeJobEventShiftTradeDetail = (WfmShifttradingAddTradeJobEventShiftTradeDetail) o;

    return Objects.equals(this.id, wfmShifttradingAddTradeJobEventShiftTradeDetail.id) &&
            Objects.equals(this.state, wfmShifttradingAddTradeJobEventShiftTradeDetail.state) &&
            Objects.equals(this.expirationDate, wfmShifttradingAddTradeJobEventShiftTradeDetail.expirationDate) &&
            Objects.equals(this.acceptableIntervals, wfmShifttradingAddTradeJobEventShiftTradeDetail.acceptableIntervals) &&
            Objects.equals(this.oneSided, wfmShifttradingAddTradeJobEventShiftTradeDetail.oneSided) &&
            Objects.equals(this.initiating, wfmShifttradingAddTradeJobEventShiftTradeDetail.initiating) &&
            Objects.equals(this.receiving, wfmShifttradingAddTradeJobEventShiftTradeDetail.receiving) &&
            Objects.equals(this.target, wfmShifttradingAddTradeJobEventShiftTradeDetail.target) &&
            Objects.equals(this.reviewedBy, wfmShifttradingAddTradeJobEventShiftTradeDetail.reviewedBy) &&
            Objects.equals(this.reviewedDate, wfmShifttradingAddTradeJobEventShiftTradeDetail.reviewedDate) &&
            Objects.equals(this.metadata, wfmShifttradingAddTradeJobEventShiftTradeDetail.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, state, expirationDate, acceptableIntervals, oneSided, initiating, receiving, target, reviewedBy, reviewedDate, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmShifttradingAddTradeJobEventShiftTradeDetail {\n");
    
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

