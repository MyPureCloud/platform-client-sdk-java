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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * PredictiveRoutingCustomKpiAttributionEvent
 */

public class PredictiveRoutingCustomKpiAttributionEvent  implements Serializable {
  
  private String eventId = null;
  private Date eventDateTime = null;
  private String externalContactId = null;
  private String conversationId = null;
  private String agentId = null;
  private String kpiId = null;
  private Double associatedValue = null;

  public PredictiveRoutingCustomKpiAttributionEvent() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * A unique (UUID) eventId for this event
   **/
  public PredictiveRoutingCustomKpiAttributionEvent eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A unique (UUID) eventId for this event")
  @JsonProperty("eventId")
  public String getEventId() {
    return eventId;
  }
  public void setEventId(String eventId) {
    this.eventId = eventId;
  }


  /**
   * A timestamp as epoch representing the time this event occurred. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public PredictiveRoutingCustomKpiAttributionEvent eventDateTime(Date eventDateTime) {
    this.eventDateTime = eventDateTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A timestamp as epoch representing the time this event occurred. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("eventDateTime")
  public Date getEventDateTime() {
    return eventDateTime;
  }
  public void setEventDateTime(Date eventDateTime) {
    this.eventDateTime = eventDateTime;
  }


  /**
   * The UUID of the external contact associated with this event
   **/
  public PredictiveRoutingCustomKpiAttributionEvent externalContactId(String externalContactId) {
    this.externalContactId = externalContactId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The UUID of the external contact associated with this event")
  @JsonProperty("externalContactId")
  public String getExternalContactId() {
    return externalContactId;
  }
  public void setExternalContactId(String externalContactId) {
    this.externalContactId = externalContactId;
  }


  /**
   * The UUID of the conversation associated with this event
   **/
  public PredictiveRoutingCustomKpiAttributionEvent conversationId(String conversationId) {
    this.conversationId = conversationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The UUID of the conversation associated with this event")
  @JsonProperty("conversationId")
  public String getConversationId() {
    return conversationId;
  }
  public void setConversationId(String conversationId) {
    this.conversationId = conversationId;
  }


  /**
   * The UUID of the agent associated with this event
   **/
  public PredictiveRoutingCustomKpiAttributionEvent agentId(String agentId) {
    this.agentId = agentId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The UUID of the agent associated with this event")
  @JsonProperty("agentId")
  public String getAgentId() {
    return agentId;
  }
  public void setAgentId(String agentId) {
    this.agentId = agentId;
  }


  /**
   * The UUID of the KPI associated with this event
   **/
  public PredictiveRoutingCustomKpiAttributionEvent kpiId(String kpiId) {
    this.kpiId = kpiId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The UUID of the KPI associated with this event")
  @JsonProperty("kpiId")
  public String getKpiId() {
    return kpiId;
  }
  public void setKpiId(String kpiId) {
    this.kpiId = kpiId;
  }


  /**
   * The value associated with this outcome attribution
   **/
  public PredictiveRoutingCustomKpiAttributionEvent associatedValue(Double associatedValue) {
    this.associatedValue = associatedValue;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The value associated with this outcome attribution")
  @JsonProperty("associatedValue")
  public Double getAssociatedValue() {
    return associatedValue;
  }
  public void setAssociatedValue(Double associatedValue) {
    this.associatedValue = associatedValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PredictiveRoutingCustomKpiAttributionEvent predictiveRoutingCustomKpiAttributionEvent = (PredictiveRoutingCustomKpiAttributionEvent) o;

    return Objects.equals(this.eventId, predictiveRoutingCustomKpiAttributionEvent.eventId) &&
            Objects.equals(this.eventDateTime, predictiveRoutingCustomKpiAttributionEvent.eventDateTime) &&
            Objects.equals(this.externalContactId, predictiveRoutingCustomKpiAttributionEvent.externalContactId) &&
            Objects.equals(this.conversationId, predictiveRoutingCustomKpiAttributionEvent.conversationId) &&
            Objects.equals(this.agentId, predictiveRoutingCustomKpiAttributionEvent.agentId) &&
            Objects.equals(this.kpiId, predictiveRoutingCustomKpiAttributionEvent.kpiId) &&
            Objects.equals(this.associatedValue, predictiveRoutingCustomKpiAttributionEvent.associatedValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, eventDateTime, externalContactId, conversationId, agentId, kpiId, associatedValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PredictiveRoutingCustomKpiAttributionEvent {\n");
    
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    eventDateTime: ").append(toIndentedString(eventDateTime)).append("\n");
    sb.append("    externalContactId: ").append(toIndentedString(externalContactId)).append("\n");
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    kpiId: ").append(toIndentedString(kpiId)).append("\n");
    sb.append("    associatedValue: ").append(toIndentedString(associatedValue)).append("\n");
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

