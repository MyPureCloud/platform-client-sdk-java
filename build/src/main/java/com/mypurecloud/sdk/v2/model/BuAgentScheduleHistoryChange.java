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
import com.mypurecloud.sdk.v2.model.BuAgentScheduleHistoryChangeMetadata;
import com.mypurecloud.sdk.v2.model.BuAgentScheduleHistoryDeletedChange;
import com.mypurecloud.sdk.v2.model.BuAgentScheduleShift;
import com.mypurecloud.sdk.v2.model.BuFullDayTimeOffMarker;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * BuAgentScheduleHistoryChange
 */

public class BuAgentScheduleHistoryChange  implements Serializable {
  
  private BuAgentScheduleHistoryChangeMetadata metadata = null;
  private List<BuAgentScheduleShift> shifts = new ArrayList<BuAgentScheduleShift>();
  private List<BuFullDayTimeOffMarker> fullDayTimeOffMarkers = new ArrayList<BuFullDayTimeOffMarker>();
  private BuAgentScheduleHistoryDeletedChange deletes = null;

  
  /**
   * The metadata of the change, including who and when the change was made
   **/
  public BuAgentScheduleHistoryChange metadata(BuAgentScheduleHistoryChangeMetadata metadata) {
    this.metadata = metadata;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The metadata of the change, including who and when the change was made")
  @JsonProperty("metadata")
  public BuAgentScheduleHistoryChangeMetadata getMetadata() {
    return metadata;
  }
  public void setMetadata(BuAgentScheduleHistoryChangeMetadata metadata) {
    this.metadata = metadata;
  }

  
  /**
   * The list of changed shifts
   **/
  public BuAgentScheduleHistoryChange shifts(List<BuAgentScheduleShift> shifts) {
    this.shifts = shifts;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of changed shifts")
  @JsonProperty("shifts")
  public List<BuAgentScheduleShift> getShifts() {
    return shifts;
  }
  public void setShifts(List<BuAgentScheduleShift> shifts) {
    this.shifts = shifts;
  }

  
  /**
   * The list of changed full day time off markers
   **/
  public BuAgentScheduleHistoryChange fullDayTimeOffMarkers(List<BuFullDayTimeOffMarker> fullDayTimeOffMarkers) {
    this.fullDayTimeOffMarkers = fullDayTimeOffMarkers;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of changed full day time off markers")
  @JsonProperty("fullDayTimeOffMarkers")
  public List<BuFullDayTimeOffMarker> getFullDayTimeOffMarkers() {
    return fullDayTimeOffMarkers;
  }
  public void setFullDayTimeOffMarkers(List<BuFullDayTimeOffMarker> fullDayTimeOffMarkers) {
    this.fullDayTimeOffMarkers = fullDayTimeOffMarkers;
  }

  
  /**
   * The deleted shifts, full day time off markers, or the entire agent schedule
   **/
  public BuAgentScheduleHistoryChange deletes(BuAgentScheduleHistoryDeletedChange deletes) {
    this.deletes = deletes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The deleted shifts, full day time off markers, or the entire agent schedule")
  @JsonProperty("deletes")
  public BuAgentScheduleHistoryDeletedChange getDeletes() {
    return deletes;
  }
  public void setDeletes(BuAgentScheduleHistoryDeletedChange deletes) {
    this.deletes = deletes;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuAgentScheduleHistoryChange buAgentScheduleHistoryChange = (BuAgentScheduleHistoryChange) o;
    return Objects.equals(this.metadata, buAgentScheduleHistoryChange.metadata) &&
        Objects.equals(this.shifts, buAgentScheduleHistoryChange.shifts) &&
        Objects.equals(this.fullDayTimeOffMarkers, buAgentScheduleHistoryChange.fullDayTimeOffMarkers) &&
        Objects.equals(this.deletes, buAgentScheduleHistoryChange.deletes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, shifts, fullDayTimeOffMarkers, deletes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuAgentScheduleHistoryChange {\n");
    
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    shifts: ").append(toIndentedString(shifts)).append("\n");
    sb.append("    fullDayTimeOffMarkers: ").append(toIndentedString(fullDayTimeOffMarkers)).append("\n");
    sb.append("    deletes: ").append(toIndentedString(deletes)).append("\n");
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

