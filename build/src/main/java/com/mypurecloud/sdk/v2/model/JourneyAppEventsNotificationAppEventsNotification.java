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
import com.mypurecloud.sdk.v2.model.JourneyAppEventsNotificationAppMessage;
import com.mypurecloud.sdk.v2.model.JourneyAppEventsNotificationExternalContact;
import com.mypurecloud.sdk.v2.model.JourneyAppEventsNotificationOutcomeAchievedMessage;
import com.mypurecloud.sdk.v2.model.JourneyAppEventsNotificationSegmentAssignmentMessage;
import com.mypurecloud.sdk.v2.model.JourneyAppEventsNotificationSession;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * JourneyAppEventsNotificationAppEventsNotification
 */

public class JourneyAppEventsNotificationAppEventsNotification  implements Serializable {
  
  private String id = null;
  private String correlationId = null;
  private JourneyAppEventsNotificationExternalContact externalContact = null;
  private Date createdDate = null;
  private String customerId = null;
  private String customerIdType = null;
  private JourneyAppEventsNotificationSession session = null;

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
    APPEVENT("AppEvent"),
    OUTCOMEACHIEVEDEVENT("OutcomeAchievedEvent"),
    SEGMENTASSIGNMENTEVENT("SegmentAssignmentEvent");

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
  private JourneyAppEventsNotificationAppMessage appEvent = null;
  private JourneyAppEventsNotificationOutcomeAchievedMessage outcomeAchievedEvent = null;
  private JourneyAppEventsNotificationSegmentAssignmentMessage segmentAssignmentEvent = null;

  
  /**
   **/
  public JourneyAppEventsNotificationAppEventsNotification id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   **/
  public JourneyAppEventsNotificationAppEventsNotification correlationId(String correlationId) {
    this.correlationId = correlationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("correlationId")
  public String getCorrelationId() {
    return correlationId;
  }
  public void setCorrelationId(String correlationId) {
    this.correlationId = correlationId;
  }


  /**
   **/
  public JourneyAppEventsNotificationAppEventsNotification externalContact(JourneyAppEventsNotificationExternalContact externalContact) {
    this.externalContact = externalContact;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("externalContact")
  public JourneyAppEventsNotificationExternalContact getExternalContact() {
    return externalContact;
  }
  public void setExternalContact(JourneyAppEventsNotificationExternalContact externalContact) {
    this.externalContact = externalContact;
  }


  /**
   **/
  public JourneyAppEventsNotificationAppEventsNotification createdDate(Date createdDate) {
    this.createdDate = createdDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("createdDate")
  public Date getCreatedDate() {
    return createdDate;
  }
  public void setCreatedDate(Date createdDate) {
    this.createdDate = createdDate;
  }


  /**
   **/
  public JourneyAppEventsNotificationAppEventsNotification customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("customerId")
  public String getCustomerId() {
    return customerId;
  }
  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }


  /**
   **/
  public JourneyAppEventsNotificationAppEventsNotification customerIdType(String customerIdType) {
    this.customerIdType = customerIdType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("customerIdType")
  public String getCustomerIdType() {
    return customerIdType;
  }
  public void setCustomerIdType(String customerIdType) {
    this.customerIdType = customerIdType;
  }


  /**
   **/
  public JourneyAppEventsNotificationAppEventsNotification session(JourneyAppEventsNotificationSession session) {
    this.session = session;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("session")
  public JourneyAppEventsNotificationSession getSession() {
    return session;
  }
  public void setSession(JourneyAppEventsNotificationSession session) {
    this.session = session;
  }


  /**
   **/
  public JourneyAppEventsNotificationAppEventsNotification eventType(EventTypeEnum eventType) {
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
  public JourneyAppEventsNotificationAppEventsNotification appEvent(JourneyAppEventsNotificationAppMessage appEvent) {
    this.appEvent = appEvent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("appEvent")
  public JourneyAppEventsNotificationAppMessage getAppEvent() {
    return appEvent;
  }
  public void setAppEvent(JourneyAppEventsNotificationAppMessage appEvent) {
    this.appEvent = appEvent;
  }


  /**
   **/
  public JourneyAppEventsNotificationAppEventsNotification outcomeAchievedEvent(JourneyAppEventsNotificationOutcomeAchievedMessage outcomeAchievedEvent) {
    this.outcomeAchievedEvent = outcomeAchievedEvent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("outcomeAchievedEvent")
  public JourneyAppEventsNotificationOutcomeAchievedMessage getOutcomeAchievedEvent() {
    return outcomeAchievedEvent;
  }
  public void setOutcomeAchievedEvent(JourneyAppEventsNotificationOutcomeAchievedMessage outcomeAchievedEvent) {
    this.outcomeAchievedEvent = outcomeAchievedEvent;
  }


  /**
   **/
  public JourneyAppEventsNotificationAppEventsNotification segmentAssignmentEvent(JourneyAppEventsNotificationSegmentAssignmentMessage segmentAssignmentEvent) {
    this.segmentAssignmentEvent = segmentAssignmentEvent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("segmentAssignmentEvent")
  public JourneyAppEventsNotificationSegmentAssignmentMessage getSegmentAssignmentEvent() {
    return segmentAssignmentEvent;
  }
  public void setSegmentAssignmentEvent(JourneyAppEventsNotificationSegmentAssignmentMessage segmentAssignmentEvent) {
    this.segmentAssignmentEvent = segmentAssignmentEvent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JourneyAppEventsNotificationAppEventsNotification journeyAppEventsNotificationAppEventsNotification = (JourneyAppEventsNotificationAppEventsNotification) o;

    return Objects.equals(this.id, journeyAppEventsNotificationAppEventsNotification.id) &&
            Objects.equals(this.correlationId, journeyAppEventsNotificationAppEventsNotification.correlationId) &&
            Objects.equals(this.externalContact, journeyAppEventsNotificationAppEventsNotification.externalContact) &&
            Objects.equals(this.createdDate, journeyAppEventsNotificationAppEventsNotification.createdDate) &&
            Objects.equals(this.customerId, journeyAppEventsNotificationAppEventsNotification.customerId) &&
            Objects.equals(this.customerIdType, journeyAppEventsNotificationAppEventsNotification.customerIdType) &&
            Objects.equals(this.session, journeyAppEventsNotificationAppEventsNotification.session) &&
            Objects.equals(this.eventType, journeyAppEventsNotificationAppEventsNotification.eventType) &&
            Objects.equals(this.appEvent, journeyAppEventsNotificationAppEventsNotification.appEvent) &&
            Objects.equals(this.outcomeAchievedEvent, journeyAppEventsNotificationAppEventsNotification.outcomeAchievedEvent) &&
            Objects.equals(this.segmentAssignmentEvent, journeyAppEventsNotificationAppEventsNotification.segmentAssignmentEvent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, correlationId, externalContact, createdDate, customerId, customerIdType, session, eventType, appEvent, outcomeAchievedEvent, segmentAssignmentEvent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneyAppEventsNotificationAppEventsNotification {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    correlationId: ").append(toIndentedString(correlationId)).append("\n");
    sb.append("    externalContact: ").append(toIndentedString(externalContact)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    customerIdType: ").append(toIndentedString(customerIdType)).append("\n");
    sb.append("    session: ").append(toIndentedString(session)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    appEvent: ").append(toIndentedString(appEvent)).append("\n");
    sb.append("    outcomeAchievedEvent: ").append(toIndentedString(outcomeAchievedEvent)).append("\n");
    sb.append("    segmentAssignmentEvent: ").append(toIndentedString(segmentAssignmentEvent)).append("\n");
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

