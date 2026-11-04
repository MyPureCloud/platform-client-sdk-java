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
import com.mypurecloud.sdk.v2.model.SelfScheduleActivityMoveRequestItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * SelfScheduleJobRequest
 */

public class SelfScheduleJobRequest  implements Serializable {
  
  private List<SelfScheduleActivityMoveRequestItem> activityMoves = null;

  public SelfScheduleJobRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      activityMoves = new ArrayList<SelfScheduleActivityMoveRequestItem>();
    }
  }

  public SelfScheduleJobRequest(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      activityMoves = new ArrayList<SelfScheduleActivityMoveRequestItem>();
    }
  }

  
  /**
   * Activities based on the offer that the user wants to move
   **/
  public SelfScheduleJobRequest activityMoves(List<SelfScheduleActivityMoveRequestItem> activityMoves) {
    this.activityMoves = activityMoves;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Activities based on the offer that the user wants to move")
  @JsonProperty("activityMoves")
  public List<SelfScheduleActivityMoveRequestItem> getActivityMoves() {
    return activityMoves;
  }
  public void setActivityMoves(List<SelfScheduleActivityMoveRequestItem> activityMoves) {
    this.activityMoves = activityMoves;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SelfScheduleJobRequest selfScheduleJobRequest = (SelfScheduleJobRequest) o;

    return Objects.equals(this.activityMoves, selfScheduleJobRequest.activityMoves);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityMoves);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SelfScheduleJobRequest {\n");
    
    sb.append("    activityMoves: ").append(toIndentedString(activityMoves)).append("\n");
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

