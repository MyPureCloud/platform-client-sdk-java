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
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.WemCoachingScheduleSlotJobCompleteTopicCoachingScheduleSlotJobResultsSlot;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * WemCoachingScheduleSlotJobCompleteTopicCoachingScheduleSlotJobResults
 */

public class WemCoachingScheduleSlotJobCompleteTopicCoachingScheduleSlotJobResults  implements Serializable {
  
  private String interval = null;

  private static class StatusEnumDeserializer extends StdDeserializer<StatusEnum> {
    public StatusEnumDeserializer() {
      super(StatusEnumDeserializer.class);
    }

    @Override
    public StatusEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return StatusEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets status
   */
 @JsonDeserialize(using = StatusEnumDeserializer.class)
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("Unknown"),
    INPROGRESS("InProgress"),
    COMPLETE("Complete"),
    ERROR("Error");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StatusEnum fromString(String key) {
      if (key == null) return null;

      for (StatusEnum value : StatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StatusEnum status = null;
  private WemCoachingScheduleSlotJobCompleteTopicCoachingScheduleSlotJobResultsSlot slot = null;
  private Boolean hasConflict = null;

  public WemCoachingScheduleSlotJobCompleteTopicCoachingScheduleSlotJobResults() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public WemCoachingScheduleSlotJobCompleteTopicCoachingScheduleSlotJobResults interval(String interval) {
    this.interval = interval;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("interval")
  public String getInterval() {
    return interval;
  }
  public void setInterval(String interval) {
    this.interval = interval;
  }


  /**
   **/
  public WemCoachingScheduleSlotJobCompleteTopicCoachingScheduleSlotJobResults status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  /**
   **/
  public WemCoachingScheduleSlotJobCompleteTopicCoachingScheduleSlotJobResults slot(WemCoachingScheduleSlotJobCompleteTopicCoachingScheduleSlotJobResultsSlot slot) {
    this.slot = slot;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("slot")
  public WemCoachingScheduleSlotJobCompleteTopicCoachingScheduleSlotJobResultsSlot getSlot() {
    return slot;
  }
  public void setSlot(WemCoachingScheduleSlotJobCompleteTopicCoachingScheduleSlotJobResultsSlot slot) {
    this.slot = slot;
  }


  /**
   **/
  public WemCoachingScheduleSlotJobCompleteTopicCoachingScheduleSlotJobResults hasConflict(Boolean hasConflict) {
    this.hasConflict = hasConflict;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("hasConflict")
  public Boolean getHasConflict() {
    return hasConflict;
  }
  public void setHasConflict(Boolean hasConflict) {
    this.hasConflict = hasConflict;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WemCoachingScheduleSlotJobCompleteTopicCoachingScheduleSlotJobResults wemCoachingScheduleSlotJobCompleteTopicCoachingScheduleSlotJobResults = (WemCoachingScheduleSlotJobCompleteTopicCoachingScheduleSlotJobResults) o;

    return Objects.equals(this.interval, wemCoachingScheduleSlotJobCompleteTopicCoachingScheduleSlotJobResults.interval) &&
            Objects.equals(this.status, wemCoachingScheduleSlotJobCompleteTopicCoachingScheduleSlotJobResults.status) &&
            Objects.equals(this.slot, wemCoachingScheduleSlotJobCompleteTopicCoachingScheduleSlotJobResults.slot) &&
            Objects.equals(this.hasConflict, wemCoachingScheduleSlotJobCompleteTopicCoachingScheduleSlotJobResults.hasConflict);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interval, status, slot, hasConflict);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WemCoachingScheduleSlotJobCompleteTopicCoachingScheduleSlotJobResults {\n");
    
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    slot: ").append(toIndentedString(slot)).append("\n");
    sb.append("    hasConflict: ").append(toIndentedString(hasConflict)).append("\n");
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

