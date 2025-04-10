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
import com.mypurecloud.sdk.v2.model.LearningSlot;
import com.mypurecloud.sdk.v2.model.LearningSlotWfmScheduleActivity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * LearningScheduleSlotsQueryResponse
 */

public class LearningScheduleSlotsQueryResponse  implements Serializable {
  
  private List<LearningSlot> suggestedSlots = null;
  private List<LearningSlotWfmScheduleActivity> wfmScheduleActivities = null;

  public LearningScheduleSlotsQueryResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      suggestedSlots = new ArrayList<LearningSlot>();
      wfmScheduleActivities = new ArrayList<LearningSlotWfmScheduleActivity>();
    }
  }

  
  /**
   * List of slots where Learning activity can be scheduled
   **/
  public LearningScheduleSlotsQueryResponse suggestedSlots(List<LearningSlot> suggestedSlots) {
    this.suggestedSlots = suggestedSlots;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of slots where Learning activity can be scheduled")
  @JsonProperty("suggestedSlots")
  public List<LearningSlot> getSuggestedSlots() {
    return suggestedSlots;
  }
  public void setSuggestedSlots(List<LearningSlot> suggestedSlots) {
    this.suggestedSlots = suggestedSlots;
  }


  /**
   * Detailed data for WFM scheduled activities
   **/
  public LearningScheduleSlotsQueryResponse wfmScheduleActivities(List<LearningSlotWfmScheduleActivity> wfmScheduleActivities) {
    this.wfmScheduleActivities = wfmScheduleActivities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Detailed data for WFM scheduled activities")
  @JsonProperty("wfmScheduleActivities")
  public List<LearningSlotWfmScheduleActivity> getWfmScheduleActivities() {
    return wfmScheduleActivities;
  }
  public void setWfmScheduleActivities(List<LearningSlotWfmScheduleActivity> wfmScheduleActivities) {
    this.wfmScheduleActivities = wfmScheduleActivities;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LearningScheduleSlotsQueryResponse learningScheduleSlotsQueryResponse = (LearningScheduleSlotsQueryResponse) o;

    return Objects.equals(this.suggestedSlots, learningScheduleSlotsQueryResponse.suggestedSlots) &&
            Objects.equals(this.wfmScheduleActivities, learningScheduleSlotsQueryResponse.wfmScheduleActivities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(suggestedSlots, wfmScheduleActivities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LearningScheduleSlotsQueryResponse {\n");
    
    sb.append("    suggestedSlots: ").append(toIndentedString(suggestedSlots)).append("\n");
    sb.append("    wfmScheduleActivities: ").append(toIndentedString(wfmScheduleActivities)).append("\n");
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

