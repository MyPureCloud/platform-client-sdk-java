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
import com.mypurecloud.sdk.v2.model.BuAgentScheduleHistoryChange;
import com.mypurecloud.sdk.v2.model.BuAgentScheduleHistoryDroppedChange;
import com.mypurecloud.sdk.v2.model.BuScheduleReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * BuAgentScheduleHistoryResponse
 */

public class BuAgentScheduleHistoryResponse  implements Serializable {
  
  private List<BuScheduleReference> priorPublishedSchedules = new ArrayList<BuScheduleReference>();
  private BuAgentScheduleHistoryChange basePublishedSchedule = null;
  private List<BuAgentScheduleHistoryDroppedChange> droppedChanges = new ArrayList<BuAgentScheduleHistoryDroppedChange>();
  private List<BuAgentScheduleHistoryChange> changes = new ArrayList<BuAgentScheduleHistoryChange>();

  
  /**
   * The list of previously published schedules
   **/
  public BuAgentScheduleHistoryResponse priorPublishedSchedules(List<BuScheduleReference> priorPublishedSchedules) {
    this.priorPublishedSchedules = priorPublishedSchedules;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of previously published schedules")
  @JsonProperty("priorPublishedSchedules")
  public List<BuScheduleReference> getPriorPublishedSchedules() {
    return priorPublishedSchedules;
  }
  public void setPriorPublishedSchedules(List<BuScheduleReference> priorPublishedSchedules) {
    this.priorPublishedSchedules = priorPublishedSchedules;
  }

  
  /**
   * The originally published agent schedules
   **/
  public BuAgentScheduleHistoryResponse basePublishedSchedule(BuAgentScheduleHistoryChange basePublishedSchedule) {
    this.basePublishedSchedule = basePublishedSchedule;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The originally published agent schedules")
  @JsonProperty("basePublishedSchedule")
  public BuAgentScheduleHistoryChange getBasePublishedSchedule() {
    return basePublishedSchedule;
  }
  public void setBasePublishedSchedule(BuAgentScheduleHistoryChange basePublishedSchedule) {
    this.basePublishedSchedule = basePublishedSchedule;
  }

  
  /**
   * The changes dropped from the schedule history. This will happen if the schedule history is too large
   **/
  public BuAgentScheduleHistoryResponse droppedChanges(List<BuAgentScheduleHistoryDroppedChange> droppedChanges) {
    this.droppedChanges = droppedChanges;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The changes dropped from the schedule history. This will happen if the schedule history is too large")
  @JsonProperty("droppedChanges")
  public List<BuAgentScheduleHistoryDroppedChange> getDroppedChanges() {
    return droppedChanges;
  }
  public void setDroppedChanges(List<BuAgentScheduleHistoryDroppedChange> droppedChanges) {
    this.droppedChanges = droppedChanges;
  }

  
  /**
   * The list of changes for the schedule history
   **/
  public BuAgentScheduleHistoryResponse changes(List<BuAgentScheduleHistoryChange> changes) {
    this.changes = changes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of changes for the schedule history")
  @JsonProperty("changes")
  public List<BuAgentScheduleHistoryChange> getChanges() {
    return changes;
  }
  public void setChanges(List<BuAgentScheduleHistoryChange> changes) {
    this.changes = changes;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuAgentScheduleHistoryResponse buAgentScheduleHistoryResponse = (BuAgentScheduleHistoryResponse) o;
    return Objects.equals(this.priorPublishedSchedules, buAgentScheduleHistoryResponse.priorPublishedSchedules) &&
        Objects.equals(this.basePublishedSchedule, buAgentScheduleHistoryResponse.basePublishedSchedule) &&
        Objects.equals(this.droppedChanges, buAgentScheduleHistoryResponse.droppedChanges) &&
        Objects.equals(this.changes, buAgentScheduleHistoryResponse.changes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(priorPublishedSchedules, basePublishedSchedule, droppedChanges, changes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuAgentScheduleHistoryResponse {\n");
    
    sb.append("    priorPublishedSchedules: ").append(toIndentedString(priorPublishedSchedules)).append("\n");
    sb.append("    basePublishedSchedule: ").append(toIndentedString(basePublishedSchedule)).append("\n");
    sb.append("    droppedChanges: ").append(toIndentedString(droppedChanges)).append("\n");
    sb.append("    changes: ").append(toIndentedString(changes)).append("\n");
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

