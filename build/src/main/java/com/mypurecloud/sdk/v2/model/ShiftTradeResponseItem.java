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
import com.mypurecloud.sdk.v2.model.RequiredDateRange;
import com.mypurecloud.sdk.v2.model.ShiftTradeInitiatingSideResponseItem;
import com.mypurecloud.sdk.v2.model.ShiftTradeReceivingSideResponseItem;
import com.mypurecloud.sdk.v2.model.ShiftTradeTargetResponseItem;
import com.mypurecloud.sdk.v2.model.UserReference;
import com.mypurecloud.sdk.v2.model.WfmVersionedEntityMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * ShiftTradeResponseItem
 */

public class ShiftTradeResponseItem  implements Serializable {
  
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
   * The state of this shift trade
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
  private Date expirationDate = null;
  private ShiftTradeInitiatingSideResponseItem initiating = null;
  private ShiftTradeReceivingSideResponseItem receiving = null;
  private List<RequiredDateRange> acceptableIntervals = null;
  private Boolean oneSided = null;
  private ShiftTradeTargetResponseItem target = null;
  private UserReference reviewedBy = null;
  private Date reviewedDate = null;
  private WfmVersionedEntityMetadata metadata = null;

  public ShiftTradeResponseItem() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      acceptableIntervals = new ArrayList<RequiredDateRange>();
    }
  }

  public ShiftTradeResponseItem(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      acceptableIntervals = new ArrayList<RequiredDateRange>();
    }
  }

  
  /**
   * The ID of this shift trade
   **/
  public ShiftTradeResponseItem id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of this shift trade")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * The state of this shift trade
   **/
  public ShiftTradeResponseItem state(StateEnum state) {
    this.state = state;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The state of this shift trade")
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }


  /**
   * When this shift trade will expire. Date time is represented as an ISO-8601 string
   **/
  public ShiftTradeResponseItem expirationDate(Date expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "When this shift trade will expire. Date time is represented as an ISO-8601 string")
  @JsonProperty("expirationDate")
  public Date getExpirationDate() {
    return expirationDate;
  }
  public void setExpirationDate(Date expirationDate) {
    this.expirationDate = expirationDate;
  }


  /**
   * Details about the initiating user involved in this shift trade
   **/
  public ShiftTradeResponseItem initiating(ShiftTradeInitiatingSideResponseItem initiating) {
    this.initiating = initiating;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Details about the initiating user involved in this shift trade")
  @JsonProperty("initiating")
  public ShiftTradeInitiatingSideResponseItem getInitiating() {
    return initiating;
  }
  public void setInitiating(ShiftTradeInitiatingSideResponseItem initiating) {
    this.initiating = initiating;
  }


  /**
   * Details about the receiving user involved in this shift trade
   **/
  public ShiftTradeResponseItem receiving(ShiftTradeReceivingSideResponseItem receiving) {
    this.receiving = receiving;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Details about the receiving user involved in this shift trade")
  @JsonProperty("receiving")
  public ShiftTradeReceivingSideResponseItem getReceiving() {
    return receiving;
  }
  public void setReceiving(ShiftTradeReceivingSideResponseItem receiving) {
    this.receiving = receiving;
  }


  /**
   * Time frames when the initiating user is willing to accept trades. Empty means giving up the shift
   **/
  public ShiftTradeResponseItem acceptableIntervals(List<RequiredDateRange> acceptableIntervals) {
    this.acceptableIntervals = acceptableIntervals;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Time frames when the initiating user is willing to accept trades. Empty means giving up the shift")
  @JsonProperty("acceptableIntervals")
  public List<RequiredDateRange> getAcceptableIntervals() {
    return acceptableIntervals;
  }
  public void setAcceptableIntervals(List<RequiredDateRange> acceptableIntervals) {
    this.acceptableIntervals = acceptableIntervals;
  }


  /**
   * Whether this is a one-sided shift trade (e.g. the initiating user is not asking for a shift in return)
   **/
  public ShiftTradeResponseItem oneSided(Boolean oneSided) {
    this.oneSided = oneSided;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Whether this is a one-sided shift trade (e.g. the initiating user is not asking for a shift in return)")
  @JsonProperty("oneSided")
  public Boolean getOneSided() {
    return oneSided;
  }
  public void setOneSided(Boolean oneSided) {
    this.oneSided = oneSided;
  }


  /**
   * The user to whom the shift trade request was sent in a direct trade, or the user with whom a shift trade was Matched
   **/
  public ShiftTradeResponseItem target(ShiftTradeTargetResponseItem target) {
    this.target = target;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user to whom the shift trade request was sent in a direct trade, or the user with whom a shift trade was Matched")
  @JsonProperty("target")
  public ShiftTradeTargetResponseItem getTarget() {
    return target;
  }
  public void setTarget(ShiftTradeTargetResponseItem target) {
    this.target = target;
  }


  /**
   * The admin who approved or denied this shift trade
   **/
  public ShiftTradeResponseItem reviewedBy(UserReference reviewedBy) {
    this.reviewedBy = reviewedBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The admin who approved or denied this shift trade")
  @JsonProperty("reviewedBy")
  public UserReference getReviewedBy() {
    return reviewedBy;
  }
  public void setReviewedBy(UserReference reviewedBy) {
    this.reviewedBy = reviewedBy;
  }


  /**
   * The timestamp of when the trade request was reviewed by an admin in ISO-8601 format
   **/
  public ShiftTradeResponseItem reviewedDate(Date reviewedDate) {
    this.reviewedDate = reviewedDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The timestamp of when the trade request was reviewed by an admin in ISO-8601 format")
  @JsonProperty("reviewedDate")
  public Date getReviewedDate() {
    return reviewedDate;
  }
  public void setReviewedDate(Date reviewedDate) {
    this.reviewedDate = reviewedDate;
  }


  /**
   * Version metadata for this shift trade
   **/
  public ShiftTradeResponseItem metadata(WfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Version metadata for this shift trade")
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
    ShiftTradeResponseItem shiftTradeResponseItem = (ShiftTradeResponseItem) o;

    return Objects.equals(this.id, shiftTradeResponseItem.id) &&
            Objects.equals(this.state, shiftTradeResponseItem.state) &&
            Objects.equals(this.expirationDate, shiftTradeResponseItem.expirationDate) &&
            Objects.equals(this.initiating, shiftTradeResponseItem.initiating) &&
            Objects.equals(this.receiving, shiftTradeResponseItem.receiving) &&
            Objects.equals(this.acceptableIntervals, shiftTradeResponseItem.acceptableIntervals) &&
            Objects.equals(this.oneSided, shiftTradeResponseItem.oneSided) &&
            Objects.equals(this.target, shiftTradeResponseItem.target) &&
            Objects.equals(this.reviewedBy, shiftTradeResponseItem.reviewedBy) &&
            Objects.equals(this.reviewedDate, shiftTradeResponseItem.reviewedDate) &&
            Objects.equals(this.metadata, shiftTradeResponseItem.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, state, expirationDate, initiating, receiving, acceptableIntervals, oneSided, target, reviewedBy, reviewedDate, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShiftTradeResponseItem {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    initiating: ").append(toIndentedString(initiating)).append("\n");
    sb.append("    receiving: ").append(toIndentedString(receiving)).append("\n");
    sb.append("    acceptableIntervals: ").append(toIndentedString(acceptableIntervals)).append("\n");
    sb.append("    oneSided: ").append(toIndentedString(oneSided)).append("\n");
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

