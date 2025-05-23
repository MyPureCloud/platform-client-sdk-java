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
import com.mypurecloud.sdk.v2.model.JourneyWebEventsNotificationExternalContact;
import com.mypurecloud.sdk.v2.model.JourneyWebEventsNotificationOutcomeAchievedMessage;
import com.mypurecloud.sdk.v2.model.JourneyWebEventsNotificationSegmentAssignmentMessage;
import com.mypurecloud.sdk.v2.model.JourneyWebEventsNotificationSession;
import com.mypurecloud.sdk.v2.model.JourneyWebEventsNotificationWebActionMessage;
import com.mypurecloud.sdk.v2.model.JourneyWebEventsNotificationWebMessage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * JourneyWebEventsNotificationWebEventsNotification
 */

public class JourneyWebEventsNotificationWebEventsNotification  implements Serializable {
  
  private String id = null;
  private String correlationId = null;
  private JourneyWebEventsNotificationExternalContact externalContact = null;
  private Date createdDate = null;
  private String customerId = null;
  private String customerIdType = null;
  private JourneyWebEventsNotificationSession session = null;

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
    WEBEVENT("WebEvent"),
    WEBACTIONEVENT("WebActionEvent"),
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
  private JourneyWebEventsNotificationWebMessage webEvent = null;
  private JourneyWebEventsNotificationWebActionMessage webActionEvent = null;
  private JourneyWebEventsNotificationOutcomeAchievedMessage outcomeAchievedEvent = null;
  private JourneyWebEventsNotificationSegmentAssignmentMessage segmentAssignmentEvent = null;

  public JourneyWebEventsNotificationWebEventsNotification() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public JourneyWebEventsNotificationWebEventsNotification id(String id) {
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
  public JourneyWebEventsNotificationWebEventsNotification correlationId(String correlationId) {
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
  public JourneyWebEventsNotificationWebEventsNotification externalContact(JourneyWebEventsNotificationExternalContact externalContact) {
    this.externalContact = externalContact;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("externalContact")
  public JourneyWebEventsNotificationExternalContact getExternalContact() {
    return externalContact;
  }
  public void setExternalContact(JourneyWebEventsNotificationExternalContact externalContact) {
    this.externalContact = externalContact;
  }


  /**
   **/
  public JourneyWebEventsNotificationWebEventsNotification createdDate(Date createdDate) {
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
  public JourneyWebEventsNotificationWebEventsNotification customerId(String customerId) {
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
  public JourneyWebEventsNotificationWebEventsNotification customerIdType(String customerIdType) {
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
  public JourneyWebEventsNotificationWebEventsNotification session(JourneyWebEventsNotificationSession session) {
    this.session = session;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("session")
  public JourneyWebEventsNotificationSession getSession() {
    return session;
  }
  public void setSession(JourneyWebEventsNotificationSession session) {
    this.session = session;
  }


  /**
   **/
  public JourneyWebEventsNotificationWebEventsNotification eventType(EventTypeEnum eventType) {
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
  public JourneyWebEventsNotificationWebEventsNotification webEvent(JourneyWebEventsNotificationWebMessage webEvent) {
    this.webEvent = webEvent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("webEvent")
  public JourneyWebEventsNotificationWebMessage getWebEvent() {
    return webEvent;
  }
  public void setWebEvent(JourneyWebEventsNotificationWebMessage webEvent) {
    this.webEvent = webEvent;
  }


  /**
   **/
  public JourneyWebEventsNotificationWebEventsNotification webActionEvent(JourneyWebEventsNotificationWebActionMessage webActionEvent) {
    this.webActionEvent = webActionEvent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("webActionEvent")
  public JourneyWebEventsNotificationWebActionMessage getWebActionEvent() {
    return webActionEvent;
  }
  public void setWebActionEvent(JourneyWebEventsNotificationWebActionMessage webActionEvent) {
    this.webActionEvent = webActionEvent;
  }


  /**
   **/
  public JourneyWebEventsNotificationWebEventsNotification outcomeAchievedEvent(JourneyWebEventsNotificationOutcomeAchievedMessage outcomeAchievedEvent) {
    this.outcomeAchievedEvent = outcomeAchievedEvent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("outcomeAchievedEvent")
  public JourneyWebEventsNotificationOutcomeAchievedMessage getOutcomeAchievedEvent() {
    return outcomeAchievedEvent;
  }
  public void setOutcomeAchievedEvent(JourneyWebEventsNotificationOutcomeAchievedMessage outcomeAchievedEvent) {
    this.outcomeAchievedEvent = outcomeAchievedEvent;
  }


  /**
   **/
  public JourneyWebEventsNotificationWebEventsNotification segmentAssignmentEvent(JourneyWebEventsNotificationSegmentAssignmentMessage segmentAssignmentEvent) {
    this.segmentAssignmentEvent = segmentAssignmentEvent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("segmentAssignmentEvent")
  public JourneyWebEventsNotificationSegmentAssignmentMessage getSegmentAssignmentEvent() {
    return segmentAssignmentEvent;
  }
  public void setSegmentAssignmentEvent(JourneyWebEventsNotificationSegmentAssignmentMessage segmentAssignmentEvent) {
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
    JourneyWebEventsNotificationWebEventsNotification journeyWebEventsNotificationWebEventsNotification = (JourneyWebEventsNotificationWebEventsNotification) o;

    return Objects.equals(this.id, journeyWebEventsNotificationWebEventsNotification.id) &&
            Objects.equals(this.correlationId, journeyWebEventsNotificationWebEventsNotification.correlationId) &&
            Objects.equals(this.externalContact, journeyWebEventsNotificationWebEventsNotification.externalContact) &&
            Objects.equals(this.createdDate, journeyWebEventsNotificationWebEventsNotification.createdDate) &&
            Objects.equals(this.customerId, journeyWebEventsNotificationWebEventsNotification.customerId) &&
            Objects.equals(this.customerIdType, journeyWebEventsNotificationWebEventsNotification.customerIdType) &&
            Objects.equals(this.session, journeyWebEventsNotificationWebEventsNotification.session) &&
            Objects.equals(this.eventType, journeyWebEventsNotificationWebEventsNotification.eventType) &&
            Objects.equals(this.webEvent, journeyWebEventsNotificationWebEventsNotification.webEvent) &&
            Objects.equals(this.webActionEvent, journeyWebEventsNotificationWebEventsNotification.webActionEvent) &&
            Objects.equals(this.outcomeAchievedEvent, journeyWebEventsNotificationWebEventsNotification.outcomeAchievedEvent) &&
            Objects.equals(this.segmentAssignmentEvent, journeyWebEventsNotificationWebEventsNotification.segmentAssignmentEvent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, correlationId, externalContact, createdDate, customerId, customerIdType, session, eventType, webEvent, webActionEvent, outcomeAchievedEvent, segmentAssignmentEvent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneyWebEventsNotificationWebEventsNotification {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    correlationId: ").append(toIndentedString(correlationId)).append("\n");
    sb.append("    externalContact: ").append(toIndentedString(externalContact)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    customerIdType: ").append(toIndentedString(customerIdType)).append("\n");
    sb.append("    session: ").append(toIndentedString(session)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    webEvent: ").append(toIndentedString(webEvent)).append("\n");
    sb.append("    webActionEvent: ").append(toIndentedString(webActionEvent)).append("\n");
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

