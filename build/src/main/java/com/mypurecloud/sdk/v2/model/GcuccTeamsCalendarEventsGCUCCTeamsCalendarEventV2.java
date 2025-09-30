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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * GcuccTeamsCalendarEventsGCUCCTeamsCalendarEventV2
 */

public class GcuccTeamsCalendarEventsGCUCCTeamsCalendarEventV2  implements Serializable {
  
  private String externalUserId = null;
  private String genesysUserId = null;

  private static class TriggerEnumDeserializer extends StdDeserializer<TriggerEnum> {
    public TriggerEnumDeserializer() {
      super(TriggerEnumDeserializer.class);
    }

    @Override
    public TriggerEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return TriggerEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets trigger
   */
 @JsonDeserialize(using = TriggerEnumDeserializer.class)
  public enum TriggerEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("Unknown"),
    EVENTSTART("EventStart"),
    EVENTEND("EventEnd");

    private String value;

    TriggerEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static TriggerEnum fromString(String key) {
      if (key == null) return null;

      for (TriggerEnum value : TriggerEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return TriggerEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private TriggerEnum trigger = null;

  private static class EventTypeEnumDeserializer extends StdDeserializer<EventTypeEnum> {
    public EventTypeEnumDeserializer() {
      super(EventTypeEnumDeserializer.class);
    }

    @Override
    public EventTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return EventTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets eventType
   */
 @JsonDeserialize(using = EventTypeEnumDeserializer.class)
  public enum EventTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("Unknown"),
    CALENDAR("Calendar"),
    INSTANTMEETING("InstantMeeting");

    private String value;

    EventTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static EventTypeEnum fromString(String key) {
      if (key == null) return null;

      for (EventTypeEnum value : EventTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return EventTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private EventTypeEnum eventType = null;
  private Date eventTime = null;

  private static class ResponseStatusEnumDeserializer extends StdDeserializer<ResponseStatusEnum> {
    public ResponseStatusEnumDeserializer() {
      super(ResponseStatusEnumDeserializer.class);
    }

    @Override
    public ResponseStatusEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ResponseStatusEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets responseStatus
   */
 @JsonDeserialize(using = ResponseStatusEnumDeserializer.class)
  public enum ResponseStatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("unknown"),
    NONE("none"),
    ORGANIZER("organizer"),
    TENTATIVELYACCEPTED("tentativelyAccepted"),
    ACCEPTED("accepted"),
    DECLINED("declined"),
    NOTRESPONDED("notResponded");

    private String value;

    ResponseStatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ResponseStatusEnum fromString(String key) {
      if (key == null) return null;

      for (ResponseStatusEnum value : ResponseStatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ResponseStatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ResponseStatusEnum responseStatus = null;
  private String meetingId = null;

  public GcuccTeamsCalendarEventsGCUCCTeamsCalendarEventV2() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public GcuccTeamsCalendarEventsGCUCCTeamsCalendarEventV2 externalUserId(String externalUserId) {
    this.externalUserId = externalUserId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("externalUserId")
  public String getExternalUserId() {
    return externalUserId;
  }
  public void setExternalUserId(String externalUserId) {
    this.externalUserId = externalUserId;
  }


  /**
   **/
  public GcuccTeamsCalendarEventsGCUCCTeamsCalendarEventV2 genesysUserId(String genesysUserId) {
    this.genesysUserId = genesysUserId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("genesysUserId")
  public String getGenesysUserId() {
    return genesysUserId;
  }
  public void setGenesysUserId(String genesysUserId) {
    this.genesysUserId = genesysUserId;
  }


  /**
   **/
  public GcuccTeamsCalendarEventsGCUCCTeamsCalendarEventV2 trigger(TriggerEnum trigger) {
    this.trigger = trigger;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("trigger")
  public TriggerEnum getTrigger() {
    return trigger;
  }
  public void setTrigger(TriggerEnum trigger) {
    this.trigger = trigger;
  }


  /**
   **/
  public GcuccTeamsCalendarEventsGCUCCTeamsCalendarEventV2 eventType(EventTypeEnum eventType) {
    this.eventType = eventType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("eventType")
  public EventTypeEnum getEventType() {
    return eventType;
  }
  public void setEventType(EventTypeEnum eventType) {
    this.eventType = eventType;
  }


  /**
   **/
  public GcuccTeamsCalendarEventsGCUCCTeamsCalendarEventV2 eventTime(Date eventTime) {
    this.eventTime = eventTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("eventTime")
  public Date getEventTime() {
    return eventTime;
  }
  public void setEventTime(Date eventTime) {
    this.eventTime = eventTime;
  }


  /**
   **/
  public GcuccTeamsCalendarEventsGCUCCTeamsCalendarEventV2 responseStatus(ResponseStatusEnum responseStatus) {
    this.responseStatus = responseStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("responseStatus")
  public ResponseStatusEnum getResponseStatus() {
    return responseStatus;
  }
  public void setResponseStatus(ResponseStatusEnum responseStatus) {
    this.responseStatus = responseStatus;
  }


  /**
   **/
  public GcuccTeamsCalendarEventsGCUCCTeamsCalendarEventV2 meetingId(String meetingId) {
    this.meetingId = meetingId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("meetingId")
  public String getMeetingId() {
    return meetingId;
  }
  public void setMeetingId(String meetingId) {
    this.meetingId = meetingId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GcuccTeamsCalendarEventsGCUCCTeamsCalendarEventV2 gcuccTeamsCalendarEventsGCUCCTeamsCalendarEventV2 = (GcuccTeamsCalendarEventsGCUCCTeamsCalendarEventV2) o;

    return Objects.equals(this.externalUserId, gcuccTeamsCalendarEventsGCUCCTeamsCalendarEventV2.externalUserId) &&
            Objects.equals(this.genesysUserId, gcuccTeamsCalendarEventsGCUCCTeamsCalendarEventV2.genesysUserId) &&
            Objects.equals(this.trigger, gcuccTeamsCalendarEventsGCUCCTeamsCalendarEventV2.trigger) &&
            Objects.equals(this.eventType, gcuccTeamsCalendarEventsGCUCCTeamsCalendarEventV2.eventType) &&
            Objects.equals(this.eventTime, gcuccTeamsCalendarEventsGCUCCTeamsCalendarEventV2.eventTime) &&
            Objects.equals(this.responseStatus, gcuccTeamsCalendarEventsGCUCCTeamsCalendarEventV2.responseStatus) &&
            Objects.equals(this.meetingId, gcuccTeamsCalendarEventsGCUCCTeamsCalendarEventV2.meetingId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalUserId, genesysUserId, trigger, eventType, eventTime, responseStatus, meetingId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GcuccTeamsCalendarEventsGCUCCTeamsCalendarEventV2 {\n");
    
    sb.append("    externalUserId: ").append(toIndentedString(externalUserId)).append("\n");
    sb.append("    genesysUserId: ").append(toIndentedString(genesysUserId)).append("\n");
    sb.append("    trigger: ").append(toIndentedString(trigger)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
    sb.append("    responseStatus: ").append(toIndentedString(responseStatus)).append("\n");
    sb.append("    meetingId: ").append(toIndentedString(meetingId)).append("\n");
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

