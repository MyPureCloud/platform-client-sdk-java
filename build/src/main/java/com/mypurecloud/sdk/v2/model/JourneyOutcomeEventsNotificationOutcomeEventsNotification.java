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
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.JourneyOutcomeEventsNotificationExternalContact;
import com.mypurecloud.sdk.v2.model.JourneyOutcomeEventsNotificationOutcomeAchievedMessage;
import com.mypurecloud.sdk.v2.model.JourneyOutcomeEventsNotificationOutcomeAttributionMessage;
import com.mypurecloud.sdk.v2.model.JourneyOutcomeEventsNotificationSession;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * JourneyOutcomeEventsNotificationOutcomeEventsNotification
 */

public class JourneyOutcomeEventsNotificationOutcomeEventsNotification  implements Serializable {
  
  private String id = null;
  private String correlationId = null;
  private JourneyOutcomeEventsNotificationExternalContact externalContact = null;
  private Date createdDate = null;
  private String customerId = null;
  private String customerIdType = null;

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
    BLOCKEDWEBACTIONOFFEREVENT("BlockedWebActionOfferEvent"),
    OUTCOMEATTRIBUTIONEVENT("OutcomeAttributionEvent");

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
  private JourneyOutcomeEventsNotificationSession session = null;
  private JourneyOutcomeEventsNotificationOutcomeAchievedMessage outcomeAchievedEvent = null;
  private JourneyOutcomeEventsNotificationOutcomeAttributionMessage outcomeAttributionEventMessage = null;

  
  /**
   **/
  public JourneyOutcomeEventsNotificationOutcomeEventsNotification id(String id) {
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
  public JourneyOutcomeEventsNotificationOutcomeEventsNotification correlationId(String correlationId) {
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
  public JourneyOutcomeEventsNotificationOutcomeEventsNotification externalContact(JourneyOutcomeEventsNotificationExternalContact externalContact) {
    this.externalContact = externalContact;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("externalContact")
  public JourneyOutcomeEventsNotificationExternalContact getExternalContact() {
    return externalContact;
  }
  public void setExternalContact(JourneyOutcomeEventsNotificationExternalContact externalContact) {
    this.externalContact = externalContact;
  }

  
  /**
   **/
  public JourneyOutcomeEventsNotificationOutcomeEventsNotification createdDate(Date createdDate) {
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
  public JourneyOutcomeEventsNotificationOutcomeEventsNotification customerId(String customerId) {
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
  public JourneyOutcomeEventsNotificationOutcomeEventsNotification customerIdType(String customerIdType) {
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
  public JourneyOutcomeEventsNotificationOutcomeEventsNotification eventType(EventTypeEnum eventType) {
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
  public JourneyOutcomeEventsNotificationOutcomeEventsNotification session(JourneyOutcomeEventsNotificationSession session) {
    this.session = session;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("session")
  public JourneyOutcomeEventsNotificationSession getSession() {
    return session;
  }
  public void setSession(JourneyOutcomeEventsNotificationSession session) {
    this.session = session;
  }

  
  /**
   **/
  public JourneyOutcomeEventsNotificationOutcomeEventsNotification outcomeAchievedEvent(JourneyOutcomeEventsNotificationOutcomeAchievedMessage outcomeAchievedEvent) {
    this.outcomeAchievedEvent = outcomeAchievedEvent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("outcomeAchievedEvent")
  public JourneyOutcomeEventsNotificationOutcomeAchievedMessage getOutcomeAchievedEvent() {
    return outcomeAchievedEvent;
  }
  public void setOutcomeAchievedEvent(JourneyOutcomeEventsNotificationOutcomeAchievedMessage outcomeAchievedEvent) {
    this.outcomeAchievedEvent = outcomeAchievedEvent;
  }

  
  /**
   **/
  public JourneyOutcomeEventsNotificationOutcomeEventsNotification outcomeAttributionEventMessage(JourneyOutcomeEventsNotificationOutcomeAttributionMessage outcomeAttributionEventMessage) {
    this.outcomeAttributionEventMessage = outcomeAttributionEventMessage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("outcomeAttributionEventMessage")
  public JourneyOutcomeEventsNotificationOutcomeAttributionMessage getOutcomeAttributionEventMessage() {
    return outcomeAttributionEventMessage;
  }
  public void setOutcomeAttributionEventMessage(JourneyOutcomeEventsNotificationOutcomeAttributionMessage outcomeAttributionEventMessage) {
    this.outcomeAttributionEventMessage = outcomeAttributionEventMessage;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JourneyOutcomeEventsNotificationOutcomeEventsNotification journeyOutcomeEventsNotificationOutcomeEventsNotification = (JourneyOutcomeEventsNotificationOutcomeEventsNotification) o;
    return Objects.equals(this.id, journeyOutcomeEventsNotificationOutcomeEventsNotification.id) &&
        Objects.equals(this.correlationId, journeyOutcomeEventsNotificationOutcomeEventsNotification.correlationId) &&
        Objects.equals(this.externalContact, journeyOutcomeEventsNotificationOutcomeEventsNotification.externalContact) &&
        Objects.equals(this.createdDate, journeyOutcomeEventsNotificationOutcomeEventsNotification.createdDate) &&
        Objects.equals(this.customerId, journeyOutcomeEventsNotificationOutcomeEventsNotification.customerId) &&
        Objects.equals(this.customerIdType, journeyOutcomeEventsNotificationOutcomeEventsNotification.customerIdType) &&
        Objects.equals(this.eventType, journeyOutcomeEventsNotificationOutcomeEventsNotification.eventType) &&
        Objects.equals(this.session, journeyOutcomeEventsNotificationOutcomeEventsNotification.session) &&
        Objects.equals(this.outcomeAchievedEvent, journeyOutcomeEventsNotificationOutcomeEventsNotification.outcomeAchievedEvent) &&
        Objects.equals(this.outcomeAttributionEventMessage, journeyOutcomeEventsNotificationOutcomeEventsNotification.outcomeAttributionEventMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, correlationId, externalContact, createdDate, customerId, customerIdType, eventType, session, outcomeAchievedEvent, outcomeAttributionEventMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneyOutcomeEventsNotificationOutcomeEventsNotification {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    correlationId: ").append(toIndentedString(correlationId)).append("\n");
    sb.append("    externalContact: ").append(toIndentedString(externalContact)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    customerIdType: ").append(toIndentedString(customerIdType)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    session: ").append(toIndentedString(session)).append("\n");
    sb.append("    outcomeAchievedEvent: ").append(toIndentedString(outcomeAchievedEvent)).append("\n");
    sb.append("    outcomeAttributionEventMessage: ").append(toIndentedString(outcomeAttributionEventMessage)).append("\n");
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

