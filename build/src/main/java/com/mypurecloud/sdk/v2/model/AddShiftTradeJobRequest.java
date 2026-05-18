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
import com.mypurecloud.sdk.v2.model.InitiatingShiftRequestItem;
import com.mypurecloud.sdk.v2.model.RequiredDateRange;
import com.mypurecloud.sdk.v2.model.ShiftTradeTargetRequestItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * AddShiftTradeJobRequest
 */

public class AddShiftTradeJobRequest  implements Serializable {
  
  private InitiatingShiftRequestItem initiatingShift = null;
  private List<RequiredDateRange> acceptableIntervals = null;
  private ShiftTradeTargetRequestItem target = null;
  private Date expirationDate = null;

  public AddShiftTradeJobRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      acceptableIntervals = new ArrayList<RequiredDateRange>();
    }
  }

  public AddShiftTradeJobRequest(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      acceptableIntervals = new ArrayList<RequiredDateRange>();
    }
  }

  
  /**
   * The shift that the initiating user wants to give up in this trade
   **/
  public AddShiftTradeJobRequest initiatingShift(InitiatingShiftRequestItem initiatingShift) {
    this.initiatingShift = initiatingShift;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The shift that the initiating user wants to give up in this trade")
  @JsonProperty("initiatingShift")
  public InitiatingShiftRequestItem getInitiatingShift() {
    return initiatingShift;
  }
  public void setInitiatingShift(InitiatingShiftRequestItem initiatingShift) {
    this.initiatingShift = initiatingShift;
  }


  /**
   * Time frames when the initiating user is willing to accept a shift in exchange. Empty means giving up the shift without taking on another one
   **/
  public AddShiftTradeJobRequest acceptableIntervals(List<RequiredDateRange> acceptableIntervals) {
    this.acceptableIntervals = acceptableIntervals;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Time frames when the initiating user is willing to accept a shift in exchange. Empty means giving up the shift without taking on another one")
  @JsonProperty("acceptableIntervals")
  public List<RequiredDateRange> getAcceptableIntervals() {
    return acceptableIntervals;
  }
  public void setAcceptableIntervals(List<RequiredDateRange> acceptableIntervals) {
    this.acceptableIntervals = acceptableIntervals;
  }


  /**
   * Optional shift trade target, can be used for example for direct user to user trade
   **/
  public AddShiftTradeJobRequest target(ShiftTradeTargetRequestItem target) {
    this.target = target;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Optional shift trade target, can be used for example for direct user to user trade")
  @JsonProperty("target")
  public ShiftTradeTargetRequestItem getTarget() {
    return target;
  }
  public void setTarget(ShiftTradeTargetRequestItem target) {
    this.target = target;
  }


  /**
   * When this shift trade will expire. Date time is represented as an ISO-8601 string
   **/
  public AddShiftTradeJobRequest expirationDate(Date expirationDate) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddShiftTradeJobRequest addShiftTradeJobRequest = (AddShiftTradeJobRequest) o;

    return Objects.equals(this.initiatingShift, addShiftTradeJobRequest.initiatingShift) &&
            Objects.equals(this.acceptableIntervals, addShiftTradeJobRequest.acceptableIntervals) &&
            Objects.equals(this.target, addShiftTradeJobRequest.target) &&
            Objects.equals(this.expirationDate, addShiftTradeJobRequest.expirationDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(initiatingShift, acceptableIntervals, target, expirationDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddShiftTradeJobRequest {\n");
    
    sb.append("    initiatingShift: ").append(toIndentedString(initiatingShift)).append("\n");
    sb.append("    acceptableIntervals: ").append(toIndentedString(acceptableIntervals)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
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

