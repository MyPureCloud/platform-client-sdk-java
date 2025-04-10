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
import com.mypurecloud.sdk.v2.model.DailyPossibleShift;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * PossibleWorkShiftsForWeek
 */

public class PossibleWorkShiftsForWeek  implements Serializable {
  
  private Integer id = null;
  private List<DailyPossibleShift> dailyPossibleShifts = null;

  public PossibleWorkShiftsForWeek() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      dailyPossibleShifts = new ArrayList<DailyPossibleShift>();
    }
  }

  
  /**
   * ID of this possible weekly shift
   **/
  public PossibleWorkShiftsForWeek id(Integer id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ID of this possible weekly shift")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }


  /**
   * Daily shifts in this possible weekly shift
   **/
  public PossibleWorkShiftsForWeek dailyPossibleShifts(List<DailyPossibleShift> dailyPossibleShifts) {
    this.dailyPossibleShifts = dailyPossibleShifts;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Daily shifts in this possible weekly shift")
  @JsonProperty("dailyPossibleShifts")
  public List<DailyPossibleShift> getDailyPossibleShifts() {
    return dailyPossibleShifts;
  }
  public void setDailyPossibleShifts(List<DailyPossibleShift> dailyPossibleShifts) {
    this.dailyPossibleShifts = dailyPossibleShifts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PossibleWorkShiftsForWeek possibleWorkShiftsForWeek = (PossibleWorkShiftsForWeek) o;

    return Objects.equals(this.id, possibleWorkShiftsForWeek.id) &&
            Objects.equals(this.dailyPossibleShifts, possibleWorkShiftsForWeek.dailyPossibleShifts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, dailyPossibleShifts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PossibleWorkShiftsForWeek {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    dailyPossibleShifts: ").append(toIndentedString(dailyPossibleShifts)).append("\n");
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

