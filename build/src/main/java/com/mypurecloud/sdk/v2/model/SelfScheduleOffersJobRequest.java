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
import com.mypurecloud.sdk.v2.model.BuScheduleReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * SelfScheduleOffersJobRequest
 */

public class SelfScheduleOffersJobRequest  implements Serializable {
  
  private String shiftId = null;
  private BuScheduleReference schedule = null;

  public SelfScheduleOffersJobRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public SelfScheduleOffersJobRequest(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The ID of the shift that the user wants to self-schedule
   **/
  public SelfScheduleOffersJobRequest shiftId(String shiftId) {
    this.shiftId = shiftId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the shift that the user wants to self-schedule")
  @JsonProperty("shiftId")
  public String getShiftId() {
    return shiftId;
  }
  public void setShiftId(String shiftId) {
    this.shiftId = shiftId;
  }


  /**
   * A reference to the associated schedule to which this shift belongs
   **/
  public SelfScheduleOffersJobRequest schedule(BuScheduleReference schedule) {
    this.schedule = schedule;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A reference to the associated schedule to which this shift belongs")
  @JsonProperty("schedule")
  public BuScheduleReference getSchedule() {
    return schedule;
  }
  public void setSchedule(BuScheduleReference schedule) {
    this.schedule = schedule;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SelfScheduleOffersJobRequest selfScheduleOffersJobRequest = (SelfScheduleOffersJobRequest) o;

    return Objects.equals(this.shiftId, selfScheduleOffersJobRequest.shiftId) &&
            Objects.equals(this.schedule, selfScheduleOffersJobRequest.schedule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shiftId, schedule);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SelfScheduleOffersJobRequest {\n");
    
    sb.append("    shiftId: ").append(toIndentedString(shiftId)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
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

