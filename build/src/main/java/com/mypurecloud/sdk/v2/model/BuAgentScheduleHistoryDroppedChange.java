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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * BuAgentScheduleHistoryDroppedChange
 */

public class BuAgentScheduleHistoryDroppedChange  implements Serializable {
  
  private BuAgentScheduleHistoryChangeMetadata metadata = null;
  private List<String> shiftIds = new ArrayList<String>();
  private List<LocalDate> fullDayTimeOffMarkerDates = new ArrayList<LocalDate>();
  private BuAgentScheduleHistoryDeletedChange deletes = null;

  
  /**
   * The metadata of the change, including who and when the change was made
   **/
  public BuAgentScheduleHistoryDroppedChange metadata(BuAgentScheduleHistoryChangeMetadata metadata) {
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
   * The IDs of deleted shifts
   **/
  public BuAgentScheduleHistoryDroppedChange shiftIds(List<String> shiftIds) {
    this.shiftIds = shiftIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The IDs of deleted shifts")
  @JsonProperty("shiftIds")
  public List<String> getShiftIds() {
    return shiftIds;
  }
  public void setShiftIds(List<String> shiftIds) {
    this.shiftIds = shiftIds;
  }

  
  /**
   * The dates of any deleted full day time off markers
   **/
  public BuAgentScheduleHistoryDroppedChange fullDayTimeOffMarkerDates(List<LocalDate> fullDayTimeOffMarkerDates) {
    this.fullDayTimeOffMarkerDates = fullDayTimeOffMarkerDates;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The dates of any deleted full day time off markers")
  @JsonProperty("fullDayTimeOffMarkerDates")
  public List<LocalDate> getFullDayTimeOffMarkerDates() {
    return fullDayTimeOffMarkerDates;
  }
  public void setFullDayTimeOffMarkerDates(List<LocalDate> fullDayTimeOffMarkerDates) {
    this.fullDayTimeOffMarkerDates = fullDayTimeOffMarkerDates;
  }

  
  /**
   * The deleted shifts, full day time off markers, or the entire agent schedule
   **/
  public BuAgentScheduleHistoryDroppedChange deletes(BuAgentScheduleHistoryDeletedChange deletes) {
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
    BuAgentScheduleHistoryDroppedChange buAgentScheduleHistoryDroppedChange = (BuAgentScheduleHistoryDroppedChange) o;
    return Objects.equals(this.metadata, buAgentScheduleHistoryDroppedChange.metadata) &&
        Objects.equals(this.shiftIds, buAgentScheduleHistoryDroppedChange.shiftIds) &&
        Objects.equals(this.fullDayTimeOffMarkerDates, buAgentScheduleHistoryDroppedChange.fullDayTimeOffMarkerDates) &&
        Objects.equals(this.deletes, buAgentScheduleHistoryDroppedChange.deletes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, shiftIds, fullDayTimeOffMarkerDates, deletes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuAgentScheduleHistoryDroppedChange {\n");
    
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    shiftIds: ").append(toIndentedString(shiftIds)).append("\n");
    sb.append("    fullDayTimeOffMarkerDates: ").append(toIndentedString(fullDayTimeOffMarkerDates)).append("\n");
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

