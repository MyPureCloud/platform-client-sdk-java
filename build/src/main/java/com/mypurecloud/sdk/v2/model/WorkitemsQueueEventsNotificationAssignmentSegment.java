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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * WorkitemsQueueEventsNotificationAssignmentSegment
 */

public class WorkitemsQueueEventsNotificationAssignmentSegment  implements Serializable {
  

  private static class StartStateEnumDeserializer extends StdDeserializer<StartStateEnum> {
    public StartStateEnumDeserializer() {
      super(StartStateEnumDeserializer.class);
    }

    @Override
    public StartStateEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return StartStateEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets startState
   */
 @JsonDeserialize(using = StartStateEnumDeserializer.class)
  public enum StartStateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("Unknown"),
    IDLE("Idle"),
    ACDSTARTED("AcdStarted"),
    ALERTING("Alerting"),
    ALERTTIMEOUT("AlertTimeout"),
    DECLINED("Declined"),
    CONNECTED("Connected"),
    DISCONNECTED("Disconnected"),
    PARKED("Parked"),
    HELD("Held"),
    ACDCANCELLED("AcdCancelled"),
    TERMINATED("Terminated"),
    ACDEXPIRED("AcdExpired");

    private String value;

    StartStateEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StartStateEnum fromString(String key) {
      if (key == null) return null;

      for (StartStateEnum value : StartStateEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StartStateEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StartStateEnum startState = null;

  private static class EndStateEnumDeserializer extends StdDeserializer<EndStateEnum> {
    public EndStateEnumDeserializer() {
      super(EndStateEnumDeserializer.class);
    }

    @Override
    public EndStateEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return EndStateEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets endState
   */
 @JsonDeserialize(using = EndStateEnumDeserializer.class)
  public enum EndStateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("Unknown"),
    IDLE("Idle"),
    ACDSTARTED("AcdStarted"),
    ALERTING("Alerting"),
    ALERTTIMEOUT("AlertTimeout"),
    DECLINED("Declined"),
    CONNECTED("Connected"),
    DISCONNECTED("Disconnected"),
    PARKED("Parked"),
    HELD("Held"),
    ACDCANCELLED("AcdCancelled"),
    TERMINATED("Terminated"),
    ACDEXPIRED("AcdExpired");

    private String value;

    EndStateEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static EndStateEnum fromString(String key) {
      if (key == null) return null;

      for (EndStateEnum value : EndStateEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return EndStateEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private EndStateEnum endState = null;
  private Integer durationMs = null;

  
  /**
   **/
  public WorkitemsQueueEventsNotificationAssignmentSegment startState(StartStateEnum startState) {
    this.startState = startState;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("startState")
  public StartStateEnum getStartState() {
    return startState;
  }
  public void setStartState(StartStateEnum startState) {
    this.startState = startState;
  }


  /**
   **/
  public WorkitemsQueueEventsNotificationAssignmentSegment endState(EndStateEnum endState) {
    this.endState = endState;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("endState")
  public EndStateEnum getEndState() {
    return endState;
  }
  public void setEndState(EndStateEnum endState) {
    this.endState = endState;
  }


  /**
   **/
  public WorkitemsQueueEventsNotificationAssignmentSegment durationMs(Integer durationMs) {
    this.durationMs = durationMs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("durationMs")
  public Integer getDurationMs() {
    return durationMs;
  }
  public void setDurationMs(Integer durationMs) {
    this.durationMs = durationMs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkitemsQueueEventsNotificationAssignmentSegment workitemsQueueEventsNotificationAssignmentSegment = (WorkitemsQueueEventsNotificationAssignmentSegment) o;

    return Objects.equals(this.startState, workitemsQueueEventsNotificationAssignmentSegment.startState) &&
            Objects.equals(this.endState, workitemsQueueEventsNotificationAssignmentSegment.endState) &&
            Objects.equals(this.durationMs, workitemsQueueEventsNotificationAssignmentSegment.durationMs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startState, endState, durationMs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkitemsQueueEventsNotificationAssignmentSegment {\n");
    
    sb.append("    startState: ").append(toIndentedString(startState)).append("\n");
    sb.append("    endState: ").append(toIndentedString(endState)).append("\n");
    sb.append("    durationMs: ").append(toIndentedString(durationMs)).append("\n");
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

