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
import com.mypurecloud.sdk.v2.model.JourneyWebActionEventsNotificationBlockedWebActionOfferMessage;
import com.mypurecloud.sdk.v2.model.JourneyWebActionEventsNotificationExternalContact;
import com.mypurecloud.sdk.v2.model.JourneyWebActionEventsNotificationSession;
import com.mypurecloud.sdk.v2.model.JourneyWebActionEventsNotificationWebActionMessage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * JourneyWebActionEventsNotificationWebActionEventsNotification
 */

public class JourneyWebActionEventsNotificationWebActionEventsNotification  implements Serializable {
  
  private String id = null;
  private String correlationId = null;
  private JourneyWebActionEventsNotificationExternalContact externalContact = null;
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
  private JourneyWebActionEventsNotificationSession session = null;
  private JourneyWebActionEventsNotificationWebActionMessage webActionEvent = null;
  private JourneyWebActionEventsNotificationBlockedWebActionOfferMessage blockedWebActionOfferEvent = null;

  
  /**
   **/
  public JourneyWebActionEventsNotificationWebActionEventsNotification id(String id) {
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
  public JourneyWebActionEventsNotificationWebActionEventsNotification correlationId(String correlationId) {
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
  public JourneyWebActionEventsNotificationWebActionEventsNotification externalContact(JourneyWebActionEventsNotificationExternalContact externalContact) {
    this.externalContact = externalContact;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("externalContact")
  public JourneyWebActionEventsNotificationExternalContact getExternalContact() {
    return externalContact;
  }
  public void setExternalContact(JourneyWebActionEventsNotificationExternalContact externalContact) {
    this.externalContact = externalContact;
  }

  
  /**
   **/
  public JourneyWebActionEventsNotificationWebActionEventsNotification createdDate(Date createdDate) {
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
  public JourneyWebActionEventsNotificationWebActionEventsNotification customerId(String customerId) {
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
  public JourneyWebActionEventsNotificationWebActionEventsNotification customerIdType(String customerIdType) {
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
  public JourneyWebActionEventsNotificationWebActionEventsNotification eventType(EventTypeEnum eventType) {
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
  public JourneyWebActionEventsNotificationWebActionEventsNotification session(JourneyWebActionEventsNotificationSession session) {
    this.session = session;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("session")
  public JourneyWebActionEventsNotificationSession getSession() {
    return session;
  }
  public void setSession(JourneyWebActionEventsNotificationSession session) {
    this.session = session;
  }

  
  /**
   **/
  public JourneyWebActionEventsNotificationWebActionEventsNotification webActionEvent(JourneyWebActionEventsNotificationWebActionMessage webActionEvent) {
    this.webActionEvent = webActionEvent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("webActionEvent")
  public JourneyWebActionEventsNotificationWebActionMessage getWebActionEvent() {
    return webActionEvent;
  }
  public void setWebActionEvent(JourneyWebActionEventsNotificationWebActionMessage webActionEvent) {
    this.webActionEvent = webActionEvent;
  }

  
  /**
   **/
  public JourneyWebActionEventsNotificationWebActionEventsNotification blockedWebActionOfferEvent(JourneyWebActionEventsNotificationBlockedWebActionOfferMessage blockedWebActionOfferEvent) {
    this.blockedWebActionOfferEvent = blockedWebActionOfferEvent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("blockedWebActionOfferEvent")
  public JourneyWebActionEventsNotificationBlockedWebActionOfferMessage getBlockedWebActionOfferEvent() {
    return blockedWebActionOfferEvent;
  }
  public void setBlockedWebActionOfferEvent(JourneyWebActionEventsNotificationBlockedWebActionOfferMessage blockedWebActionOfferEvent) {
    this.blockedWebActionOfferEvent = blockedWebActionOfferEvent;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JourneyWebActionEventsNotificationWebActionEventsNotification journeyWebActionEventsNotificationWebActionEventsNotification = (JourneyWebActionEventsNotificationWebActionEventsNotification) o;
    return Objects.equals(this.id, journeyWebActionEventsNotificationWebActionEventsNotification.id) &&
        Objects.equals(this.correlationId, journeyWebActionEventsNotificationWebActionEventsNotification.correlationId) &&
        Objects.equals(this.externalContact, journeyWebActionEventsNotificationWebActionEventsNotification.externalContact) &&
        Objects.equals(this.createdDate, journeyWebActionEventsNotificationWebActionEventsNotification.createdDate) &&
        Objects.equals(this.customerId, journeyWebActionEventsNotificationWebActionEventsNotification.customerId) &&
        Objects.equals(this.customerIdType, journeyWebActionEventsNotificationWebActionEventsNotification.customerIdType) &&
        Objects.equals(this.eventType, journeyWebActionEventsNotificationWebActionEventsNotification.eventType) &&
        Objects.equals(this.session, journeyWebActionEventsNotificationWebActionEventsNotification.session) &&
        Objects.equals(this.webActionEvent, journeyWebActionEventsNotificationWebActionEventsNotification.webActionEvent) &&
        Objects.equals(this.blockedWebActionOfferEvent, journeyWebActionEventsNotificationWebActionEventsNotification.blockedWebActionOfferEvent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, correlationId, externalContact, createdDate, customerId, customerIdType, eventType, session, webActionEvent, blockedWebActionOfferEvent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneyWebActionEventsNotificationWebActionEventsNotification {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    correlationId: ").append(toIndentedString(correlationId)).append("\n");
    sb.append("    externalContact: ").append(toIndentedString(externalContact)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    customerIdType: ").append(toIndentedString(customerIdType)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    session: ").append(toIndentedString(session)).append("\n");
    sb.append("    webActionEvent: ").append(toIndentedString(webActionEvent)).append("\n");
    sb.append("    blockedWebActionOfferEvent: ").append(toIndentedString(blockedWebActionOfferEvent)).append("\n");
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

