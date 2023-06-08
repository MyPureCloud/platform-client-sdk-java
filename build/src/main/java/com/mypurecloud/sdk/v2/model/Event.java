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
import com.mypurecloud.sdk.v2.model.EventSession;
import com.mypurecloud.sdk.v2.model.GenericActionEvent;
import com.mypurecloud.sdk.v2.model.OutcomeAchievedEvent;
import com.mypurecloud.sdk.v2.model.SegmentAssignedEvent;
import com.mypurecloud.sdk.v2.model.SegmentAssignmentEvent;
import com.mypurecloud.sdk.v2.model.WebActionEvent;
import com.mypurecloud.sdk.v2.model.WebEvent;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * Event
 */

public class Event  implements Serializable {
  
  private String id = null;
  private String correlationId = null;
  private String customerId = null;
  private String customerIdType = null;
  private EventSession session = null;
  private String eventType = null;
  private GenericActionEvent genericActionEvent = null;
  private OutcomeAchievedEvent outcomeAchievedEvent = null;
  private SegmentAssignedEvent segmentAssignedEvent = null;
  private SegmentAssignmentEvent segmentAssignmentEvent = null;
  private WebActionEvent webActionEvent = null;
  private WebEvent webEvent = null;
  private Date createdDate = null;

  
  /**
   * System-generated UUID for the event.
   **/
  public Event id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "System-generated UUID for the event.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  @ApiModelProperty(example = "null", value = "UUID corresponding to triggering action that caused this event (e.g. HTTP POST, SIP invite, another event).")
  @JsonProperty("correlationId")
  public String getCorrelationId() {
    return correlationId;
  }


  /**
   * Primary identifier of the customer in the source of the events.
   **/
  public Event customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Primary identifier of the customer in the source of the events.")
  @JsonProperty("customerId")
  public String getCustomerId() {
    return customerId;
  }
  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }


  /**
   * Type of primary identifier (e.g. cookie, email, phone).
   **/
  public Event customerIdType(String customerIdType) {
    this.customerIdType = customerIdType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Type of primary identifier (e.g. cookie, email, phone).")
  @JsonProperty("customerIdType")
  public String getCustomerIdType() {
    return customerIdType;
  }
  public void setCustomerIdType(String customerIdType) {
    this.customerIdType = customerIdType;
  }


  /**
   * The session that the event belongs to.
   **/
  public Event session(EventSession session) {
    this.session = session;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The session that the event belongs to.")
  @JsonProperty("session")
  public EventSession getSession() {
    return session;
  }
  public void setSession(EventSession session) {
    this.session = session;
  }


  /**
   * The name representing the type of event.
   **/
  public Event eventType(String eventType) {
    this.eventType = eventType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name representing the type of event.")
  @JsonProperty("eventType")
  public String getEventType() {
    return eventType;
  }
  public void setEventType(String eventType) {
    this.eventType = eventType;
  }


  /**
   * Event triggered by generic actions.
   **/
  public Event genericActionEvent(GenericActionEvent genericActionEvent) {
    this.genericActionEvent = genericActionEvent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Event triggered by generic actions.")
  @JsonProperty("genericActionEvent")
  public GenericActionEvent getGenericActionEvent() {
    return genericActionEvent;
  }
  public void setGenericActionEvent(GenericActionEvent genericActionEvent) {
    this.genericActionEvent = genericActionEvent;
  }


  /**
   * Event where a customer has achieved a specific outcome or goal.
   **/
  public Event outcomeAchievedEvent(OutcomeAchievedEvent outcomeAchievedEvent) {
    this.outcomeAchievedEvent = outcomeAchievedEvent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Event where a customer has achieved a specific outcome or goal.")
  @JsonProperty("outcomeAchievedEvent")
  public OutcomeAchievedEvent getOutcomeAchievedEvent() {
    return outcomeAchievedEvent;
  }
  public void setOutcomeAchievedEvent(OutcomeAchievedEvent outcomeAchievedEvent) {
    this.outcomeAchievedEvent = outcomeAchievedEvent;
  }


  /**
   * Event that represents a segment being assigned (deprecated).
   **/
  public Event segmentAssignedEvent(SegmentAssignedEvent segmentAssignedEvent) {
    this.segmentAssignedEvent = segmentAssignedEvent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Event that represents a segment being assigned (deprecated).")
  @JsonProperty("segmentAssignedEvent")
  public SegmentAssignedEvent getSegmentAssignedEvent() {
    return segmentAssignedEvent;
  }
  public void setSegmentAssignedEvent(SegmentAssignedEvent segmentAssignedEvent) {
    this.segmentAssignedEvent = segmentAssignedEvent;
  }


  /**
   * Event that represents a segment being assigned.
   **/
  public Event segmentAssignmentEvent(SegmentAssignmentEvent segmentAssignmentEvent) {
    this.segmentAssignmentEvent = segmentAssignmentEvent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Event that represents a segment being assigned.")
  @JsonProperty("segmentAssignmentEvent")
  public SegmentAssignmentEvent getSegmentAssignmentEvent() {
    return segmentAssignmentEvent;
  }
  public void setSegmentAssignmentEvent(SegmentAssignmentEvent segmentAssignmentEvent) {
    this.segmentAssignmentEvent = segmentAssignmentEvent;
  }


  /**
   * Event triggered by web actions.
   **/
  public Event webActionEvent(WebActionEvent webActionEvent) {
    this.webActionEvent = webActionEvent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Event triggered by web actions.")
  @JsonProperty("webActionEvent")
  public WebActionEvent getWebActionEvent() {
    return webActionEvent;
  }
  public void setWebActionEvent(WebActionEvent webActionEvent) {
    this.webActionEvent = webActionEvent;
  }


  /**
   * Event that tracks user interactions with content in a browser such as pageviews, downloads, mobile ad clicks, etc.
   **/
  public Event webEvent(WebEvent webEvent) {
    this.webEvent = webEvent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Event that tracks user interactions with content in a browser such as pageviews, downloads, mobile ad clicks, etc.")
  @JsonProperty("webEvent")
  public WebEvent getWebEvent() {
    return webEvent;
  }
  public void setWebEvent(WebEvent webEvent) {
    this.webEvent = webEvent;
  }


  /**
   * Timestamp indicating when the event actually took place. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public Event createdDate(Date createdDate) {
    this.createdDate = createdDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Timestamp indicating when the event actually took place. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("createdDate")
  public Date getCreatedDate() {
    return createdDate;
  }
  public void setCreatedDate(Date createdDate) {
    this.createdDate = createdDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Event event = (Event) o;

    return Objects.equals(this.id, event.id) &&
            Objects.equals(this.correlationId, event.correlationId) &&
            Objects.equals(this.customerId, event.customerId) &&
            Objects.equals(this.customerIdType, event.customerIdType) &&
            Objects.equals(this.session, event.session) &&
            Objects.equals(this.eventType, event.eventType) &&
            Objects.equals(this.genericActionEvent, event.genericActionEvent) &&
            Objects.equals(this.outcomeAchievedEvent, event.outcomeAchievedEvent) &&
            Objects.equals(this.segmentAssignedEvent, event.segmentAssignedEvent) &&
            Objects.equals(this.segmentAssignmentEvent, event.segmentAssignmentEvent) &&
            Objects.equals(this.webActionEvent, event.webActionEvent) &&
            Objects.equals(this.webEvent, event.webEvent) &&
            Objects.equals(this.createdDate, event.createdDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, correlationId, customerId, customerIdType, session, eventType, genericActionEvent, outcomeAchievedEvent, segmentAssignedEvent, segmentAssignmentEvent, webActionEvent, webEvent, createdDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Event {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    correlationId: ").append(toIndentedString(correlationId)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    customerIdType: ").append(toIndentedString(customerIdType)).append("\n");
    sb.append("    session: ").append(toIndentedString(session)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    genericActionEvent: ").append(toIndentedString(genericActionEvent)).append("\n");
    sb.append("    outcomeAchievedEvent: ").append(toIndentedString(outcomeAchievedEvent)).append("\n");
    sb.append("    segmentAssignedEvent: ").append(toIndentedString(segmentAssignedEvent)).append("\n");
    sb.append("    segmentAssignmentEvent: ").append(toIndentedString(segmentAssignmentEvent)).append("\n");
    sb.append("    webActionEvent: ").append(toIndentedString(webActionEvent)).append("\n");
    sb.append("    webEvent: ").append(toIndentedString(webEvent)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
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

