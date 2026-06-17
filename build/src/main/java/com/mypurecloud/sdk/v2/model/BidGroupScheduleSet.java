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
import com.mypurecloud.sdk.v2.model.ShiftSet;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * BidGroupScheduleSet
 */

public class BidGroupScheduleSet  implements Serializable {
  
  private List<ShiftSet> shiftSets = null;

  public BidGroupScheduleSet() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      shiftSets = new ArrayList<ShiftSet>();
    }
  }

  public BidGroupScheduleSet(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      shiftSets = new ArrayList<ShiftSet>();
    }
  }

  
  /**
   * The shift sets that will be used for schedule generation
   **/
  public BidGroupScheduleSet shiftSets(List<ShiftSet> shiftSets) {
    this.shiftSets = shiftSets;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The shift sets that will be used for schedule generation")
  @JsonProperty("shiftSets")
  public List<ShiftSet> getShiftSets() {
    return shiftSets;
  }
  public void setShiftSets(List<ShiftSet> shiftSets) {
    this.shiftSets = shiftSets;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BidGroupScheduleSet bidGroupScheduleSet = (BidGroupScheduleSet) o;

    return Objects.equals(this.shiftSets, bidGroupScheduleSet.shiftSets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shiftSets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BidGroupScheduleSet {\n");
    
    sb.append("    shiftSets: ").append(toIndentedString(shiftSets)).append("\n");
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

