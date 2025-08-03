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
import com.mypurecloud.sdk.v2.model.JourneySegmentAssignmentEventsNotificationExternalContact;
import com.mypurecloud.sdk.v2.model.JourneySegmentAssignmentEventsNotificationSegmentAssignmentMessage;
import com.mypurecloud.sdk.v2.model.JourneySegmentAssignmentEventsNotificationSession;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * JourneySegmentAssignmentEventsNotificationSegmentAssignmentEventsNotification
 */

public class JourneySegmentAssignmentEventsNotificationSegmentAssignmentEventsNotification  implements Serializable {
  
  private String id = null;
  private String correlationId = null;
  private JourneySegmentAssignmentEventsNotificationExternalContact externalContact = null;
  private Date createdDate = null;
  private String customerId = null;
  private String customerIdType = null;
  private JourneySegmentAssignmentEventsNotificationSession session = null;

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
  private JourneySegmentAssignmentEventsNotificationSegmentAssignmentMessage segmentAssignmentEvent = null;

  public JourneySegmentAssignmentEventsNotificationSegmentAssignmentEventsNotification() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public JourneySegmentAssignmentEventsNotificationSegmentAssignmentEventsNotification id(String id) {
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
  public JourneySegmentAssignmentEventsNotificationSegmentAssignmentEventsNotification correlationId(String correlationId) {
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
  public JourneySegmentAssignmentEventsNotificationSegmentAssignmentEventsNotification externalContact(JourneySegmentAssignmentEventsNotificationExternalContact externalContact) {
    this.externalContact = externalContact;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("externalContact")
  public JourneySegmentAssignmentEventsNotificationExternalContact getExternalContact() {
    return externalContact;
  }
  public void setExternalContact(JourneySegmentAssignmentEventsNotificationExternalContact externalContact) {
    this.externalContact = externalContact;
  }


  /**
   **/
  public JourneySegmentAssignmentEventsNotificationSegmentAssignmentEventsNotification createdDate(Date createdDate) {
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
  public JourneySegmentAssignmentEventsNotificationSegmentAssignmentEventsNotification customerId(String customerId) {
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
  public JourneySegmentAssignmentEventsNotificationSegmentAssignmentEventsNotification customerIdType(String customerIdType) {
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
  public JourneySegmentAssignmentEventsNotificationSegmentAssignmentEventsNotification session(JourneySegmentAssignmentEventsNotificationSession session) {
    this.session = session;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("session")
  public JourneySegmentAssignmentEventsNotificationSession getSession() {
    return session;
  }
  public void setSession(JourneySegmentAssignmentEventsNotificationSession session) {
    this.session = session;
  }


  /**
   **/
  public JourneySegmentAssignmentEventsNotificationSegmentAssignmentEventsNotification eventType(EventTypeEnum eventType) {
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
  public JourneySegmentAssignmentEventsNotificationSegmentAssignmentEventsNotification segmentAssignmentEvent(JourneySegmentAssignmentEventsNotificationSegmentAssignmentMessage segmentAssignmentEvent) {
    this.segmentAssignmentEvent = segmentAssignmentEvent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("segmentAssignmentEvent")
  public JourneySegmentAssignmentEventsNotificationSegmentAssignmentMessage getSegmentAssignmentEvent() {
    return segmentAssignmentEvent;
  }
  public void setSegmentAssignmentEvent(JourneySegmentAssignmentEventsNotificationSegmentAssignmentMessage segmentAssignmentEvent) {
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
    JourneySegmentAssignmentEventsNotificationSegmentAssignmentEventsNotification journeySegmentAssignmentEventsNotificationSegmentAssignmentEventsNotification = (JourneySegmentAssignmentEventsNotificationSegmentAssignmentEventsNotification) o;

    return Objects.equals(this.id, journeySegmentAssignmentEventsNotificationSegmentAssignmentEventsNotification.id) &&
            Objects.equals(this.correlationId, journeySegmentAssignmentEventsNotificationSegmentAssignmentEventsNotification.correlationId) &&
            Objects.equals(this.externalContact, journeySegmentAssignmentEventsNotificationSegmentAssignmentEventsNotification.externalContact) &&
            Objects.equals(this.createdDate, journeySegmentAssignmentEventsNotificationSegmentAssignmentEventsNotification.createdDate) &&
            Objects.equals(this.customerId, journeySegmentAssignmentEventsNotificationSegmentAssignmentEventsNotification.customerId) &&
            Objects.equals(this.customerIdType, journeySegmentAssignmentEventsNotificationSegmentAssignmentEventsNotification.customerIdType) &&
            Objects.equals(this.session, journeySegmentAssignmentEventsNotificationSegmentAssignmentEventsNotification.session) &&
            Objects.equals(this.eventType, journeySegmentAssignmentEventsNotificationSegmentAssignmentEventsNotification.eventType) &&
            Objects.equals(this.segmentAssignmentEvent, journeySegmentAssignmentEventsNotificationSegmentAssignmentEventsNotification.segmentAssignmentEvent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, correlationId, externalContact, createdDate, customerId, customerIdType, session, eventType, segmentAssignmentEvent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneySegmentAssignmentEventsNotificationSegmentAssignmentEventsNotification {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    correlationId: ").append(toIndentedString(correlationId)).append("\n");
    sb.append("    externalContact: ").append(toIndentedString(externalContact)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    customerIdType: ").append(toIndentedString(customerIdType)).append("\n");
    sb.append("    session: ").append(toIndentedString(session)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
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

