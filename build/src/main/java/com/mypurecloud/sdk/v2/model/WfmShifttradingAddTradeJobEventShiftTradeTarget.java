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
import com.mypurecloud.sdk.v2.model.WfmShifttradingAddTradeJobEventUserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * WfmShifttradingAddTradeJobEventShiftTradeTarget
 */

public class WfmShifttradingAddTradeJobEventShiftTradeTarget  implements Serializable {
  
  private WfmShifttradingAddTradeJobEventUserReference user = null;

  public WfmShifttradingAddTradeJobEventShiftTradeTarget() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public WfmShifttradingAddTradeJobEventShiftTradeTarget(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   **/
  public WfmShifttradingAddTradeJobEventShiftTradeTarget user(WfmShifttradingAddTradeJobEventUserReference user) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WfmShifttradingAddTradeJobEventShiftTradeTarget wfmShifttradingAddTradeJobEventShiftTradeTarget = (WfmShifttradingAddTradeJobEventShiftTradeTarget) o;

    return Objects.equals(this.user, wfmShifttradingAddTradeJobEventShiftTradeTarget.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmShifttradingAddTradeJobEventShiftTradeTarget {\n");
    
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

