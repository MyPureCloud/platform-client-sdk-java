package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.Objects;
import java.io.IOException;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.ShiftTradeActivityPreviewResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ShiftTradePreviewResponse
 */

public class ShiftTradePreviewResponse  implements Serializable {
  
  private List<ShiftTradeActivityPreviewResponse> activities = new ArrayList<ShiftTradeActivityPreviewResponse>();

  
  /**
   * List of activities that will make up the new shift if this shift trade is approved
   **/
  public ShiftTradePreviewResponse activities(List<ShiftTradeActivityPreviewResponse> activities) {
    this.activities = activities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of activities that will make up the new shift if this shift trade is approved")
  @JsonProperty("activities")
  public List<ShiftTradeActivityPreviewResponse> getActivities() {
    return activities;
  }
  public void setActivities(List<ShiftTradeActivityPreviewResponse> activities) {
    this.activities = activities;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShiftTradePreviewResponse shiftTradePreviewResponse = (ShiftTradePreviewResponse) o;
    return Objects.equals(this.activities, shiftTradePreviewResponse.activities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShiftTradePreviewResponse {\n");
    
    sb.append("    activities: ").append(toIndentedString(activities)).append("\n");
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

