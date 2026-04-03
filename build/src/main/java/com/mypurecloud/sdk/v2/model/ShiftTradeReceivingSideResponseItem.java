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
import com.mypurecloud.sdk.v2.model.ShiftTradeShiftResponseItem;
import com.mypurecloud.sdk.v2.model.UserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ShiftTradeReceivingSideResponseItem
 */

public class ShiftTradeReceivingSideResponseItem  implements Serializable {
  
  private UserReference user = null;
  private ShiftTradeShiftResponseItem shift = null;

  public ShiftTradeReceivingSideResponseItem() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The receiving user that was matched in a shift trade
   **/
  public ShiftTradeReceivingSideResponseItem user(UserReference user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The receiving user that was matched in a shift trade")
  @JsonProperty("user")
  public UserReference getUser() {
    return user;
  }
  public void setUser(UserReference user) {
    this.user = user;
  }


  /**
   * The shift being traded by the receiving user, or null if picking up a shift in a one-sided trade
   **/
  public ShiftTradeReceivingSideResponseItem shift(ShiftTradeShiftResponseItem shift) {
    this.shift = shift;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The shift being traded by the receiving user, or null if picking up a shift in a one-sided trade")
  @JsonProperty("shift")
  public ShiftTradeShiftResponseItem getShift() {
    return shift;
  }
  public void setShift(ShiftTradeShiftResponseItem shift) {
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
    ShiftTradeReceivingSideResponseItem shiftTradeReceivingSideResponseItem = (ShiftTradeReceivingSideResponseItem) o;

    return Objects.equals(this.user, shiftTradeReceivingSideResponseItem.user) &&
            Objects.equals(this.shift, shiftTradeReceivingSideResponseItem.shift);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, shift);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShiftTradeReceivingSideResponseItem {\n");
    
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

