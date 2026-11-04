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
import com.mypurecloud.sdk.v2.model.WfmShifttradingUpdateTradeJobEventShiftTradeShift;
import com.mypurecloud.sdk.v2.model.WfmShifttradingUpdateTradeJobEventUserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * WfmShifttradingUpdateTradeJobEventShiftTradeReceivingSide
 */

public class WfmShifttradingUpdateTradeJobEventShiftTradeReceivingSide  implements Serializable {
  
  private WfmShifttradingUpdateTradeJobEventUserReference user = null;
  private WfmShifttradingUpdateTradeJobEventShiftTradeShift shift = null;

  public WfmShifttradingUpdateTradeJobEventShiftTradeReceivingSide() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public WfmShifttradingUpdateTradeJobEventShiftTradeReceivingSide(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   **/
  public WfmShifttradingUpdateTradeJobEventShiftTradeReceivingSide user(WfmShifttradingUpdateTradeJobEventUserReference user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("user")
  public WfmShifttradingUpdateTradeJobEventUserReference getUser() {
    return user;
  }
  public void setUser(WfmShifttradingUpdateTradeJobEventUserReference user) {
    this.user = user;
  }


  /**
   **/
  public WfmShifttradingUpdateTradeJobEventShiftTradeReceivingSide shift(WfmShifttradingUpdateTradeJobEventShiftTradeShift shift) {
    this.shift = shift;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("shift")
  public WfmShifttradingUpdateTradeJobEventShiftTradeShift getShift() {
    return shift;
  }
  public void setShift(WfmShifttradingUpdateTradeJobEventShiftTradeShift shift) {
    this.shift = shift;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WfmShifttradingUpdateTradeJobEventShiftTradeReceivingSide wfmShifttradingUpdateTradeJobEventShiftTradeReceivingSide = (WfmShifttradingUpdateTradeJobEventShiftTradeReceivingSide) o;

    return Objects.equals(this.user, wfmShifttradingUpdateTradeJobEventShiftTradeReceivingSide.user) &&
            Objects.equals(this.shift, wfmShifttradingUpdateTradeJobEventShiftTradeReceivingSide.shift);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, shift);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmShifttradingUpdateTradeJobEventShiftTradeReceivingSide {\n");
    
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    shift: ").append(toIndentedString(shift)).append("\n");
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

