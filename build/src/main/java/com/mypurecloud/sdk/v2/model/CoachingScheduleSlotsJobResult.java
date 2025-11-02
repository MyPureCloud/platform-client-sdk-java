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
import com.mypurecloud.sdk.v2.model.CoachingScheduleSlotsJobSlot;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * CoachingScheduleSlotsJobResult
 */

public class CoachingScheduleSlotsJobResult  implements Serializable {
  
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
   * The status of the job
   */
 @JsonDeserialize(using = StatusEnumDeserializer.class)
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
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
  private CoachingScheduleSlotsJobSlot slot = null;
  private Boolean hasConflict = null;

  public CoachingScheduleSlotsJobResult() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The interval of the job. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss
   **/
  public CoachingScheduleSlotsJobResult interval(String interval) {
    this.interval = interval;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The interval of the job. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss")
  @JsonProperty("interval")
  public String getInterval() {
    return interval;
  }
  public void setInterval(String interval) {
    this.interval = interval;
  }


  /**
   * The status of the job
   **/
  public CoachingScheduleSlotsJobResult status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The status of the job")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  /**
   * The slot found from the job
   **/
  public CoachingScheduleSlotsJobResult slot(CoachingScheduleSlotsJobSlot slot) {
    this.slot = slot;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The slot found from the job")
  @JsonProperty("slot")
  public CoachingScheduleSlotsJobSlot getSlot() {
    return slot;
  }
  public void setSlot(CoachingScheduleSlotsJobSlot slot) {
    this.slot = slot;
  }


  /**
   * True if the slot conflicts with a Coaching Appointment
   **/
  public CoachingScheduleSlotsJobResult hasConflict(Boolean hasConflict) {
    this.hasConflict = hasConflict;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "True if the slot conflicts with a Coaching Appointment")
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
    CoachingScheduleSlotsJobResult coachingScheduleSlotsJobResult = (CoachingScheduleSlotsJobResult) o;

    return Objects.equals(this.interval, coachingScheduleSlotsJobResult.interval) &&
            Objects.equals(this.status, coachingScheduleSlotsJobResult.status) &&
            Objects.equals(this.slot, coachingScheduleSlotsJobResult.slot) &&
            Objects.equals(this.hasConflict, coachingScheduleSlotsJobResult.hasConflict);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interval, status, slot, hasConflict);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoachingScheduleSlotsJobResult {\n");
    
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

