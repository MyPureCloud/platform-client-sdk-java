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
import com.mypurecloud.sdk.v2.model.WfmShifttradingAddTradeJobEventShiftTradeShift;
import com.mypurecloud.sdk.v2.model.WfmShifttradingAddTradeJobEventUserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * WfmShifttradingAddTradeJobEventShiftTradeReceivingSide
 */

public class WfmShifttradingAddTradeJobEventShiftTradeReceivingSide  implements Serializable {
  
  private WfmShifttradingAddTradeJobEventUserReference user = null;
  private WfmShifttradingAddTradeJobEventShiftTradeShift shift = null;

  public WfmShifttradingAddTradeJobEventShiftTradeReceivingSide() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public WfmShifttradingAddTradeJobEventShiftTradeReceivingSide(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   **/
  public WfmShifttradingAddTradeJobEventShiftTradeReceivingSide user(WfmShifttradingAddTradeJobEventUserReference user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("user")
  public WfmShifttradingAddTradeJobEventUserReference getUser() {
    return user;
  }
  public void setUser(WfmShifttradingAddTradeJobEventUserReference user) {
    this.user = user;
  }


  /**
   **/
  public WfmShifttradingAddTradeJobEventShiftTradeReceivingSide shift(WfmShifttradingAddTradeJobEventShiftTradeShift shift) {
    this.shift = shift;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("shift")
  public WfmShifttradingAddTradeJobEventShiftTradeShift getShift() {
    return shift;
  }
  public void setShift(WfmShifttradingAddTradeJobEventShiftTradeShift shift) {
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
    WfmShifttradingAddTradeJobEventShiftTradeReceivingSide wfmShifttradingAddTradeJobEventShiftTradeReceivingSide = (WfmShifttradingAddTradeJobEventShiftTradeReceivingSide) o;

    return Objects.equals(this.user, wfmShifttradingAddTradeJobEventShiftTradeReceivingSide.user) &&
            Objects.equals(this.shift, wfmShifttradingAddTradeJobEventShiftTradeReceivingSide.shift);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, shift);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmShifttradingAddTradeJobEventShiftTradeReceivingSide {\n");
    
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

