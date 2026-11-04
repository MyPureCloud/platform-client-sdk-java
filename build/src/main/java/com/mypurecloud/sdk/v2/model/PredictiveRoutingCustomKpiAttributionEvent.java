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

  public PredictiveRoutingCustomKpiAttributionEvent(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * A unique UUID v4 used to identify each attribution event uniquely
   **/
  public PredictiveRoutingCustomKpiAttributionEvent eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A unique UUID v4 used to identify each attribution event uniquely")
  @JsonProperty("eventId")
  public String getEventId() {
    return eventId;
  }
  public void setEventId(String eventId) {
    this.eventId = eventId;
  }


  /**
   * The date and time at which the attributed business result was achieved, in UTC, formatted as an ISO-8601 string. For example, 2023-01-07T08:30:00.123Z. Use the time the business result actually occurred or was confirmed, not a later ingestion, synchronisation, reporting, or batch-processing time. When conversationId is supplied, this timestamp must fall within the conversation attribution window, or the event is rejected. This means eventDateTime must be no earlier than the conversation start time, and no later than the conversation end time plus the grace period for the conversation's media type (1 hour for voice, message and email).
   **/
  public PredictiveRoutingCustomKpiAttributionEvent eventDateTime(Date eventDateTime) {
    this.eventDateTime = eventDateTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The date and time at which the attributed business result was achieved, in UTC, formatted as an ISO-8601 string. For example, 2023-01-07T08:30:00.123Z. Use the time the business result actually occurred or was confirmed, not a later ingestion, synchronisation, reporting, or batch-processing time. When conversationId is supplied, this timestamp must fall within the conversation attribution window, or the event is rejected. This means eventDateTime must be no earlier than the conversation start time, and no later than the conversation end time plus the grace period for the conversation's media type (1 hour for voice, message and email).")
  @JsonProperty("eventDateTime")
  public Date getEventDateTime() {
    return eventDateTime;
  }
  public void setEventDateTime(Date eventDateTime) {
    this.eventDateTime = eventDateTime;
  }


  /**
   * The id of the External Contact of the customer who was involved in the KPI attribution. If this field is populated, we will retrieve the relevant conversation internally - thus this field is not compatible with conversationId. You must chose to use either externalContactId or conversationId but not both on the same event.
   **/
  public PredictiveRoutingCustomKpiAttributionEvent externalContactId(String externalContactId) {
    this.externalContactId = externalContactId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The id of the External Contact of the customer who was involved in the KPI attribution. If this field is populated, we will retrieve the relevant conversation internally - thus this field is not compatible with conversationId. You must chose to use either externalContactId or conversationId but not both on the same event.")
  @JsonProperty("externalContactId")
  public String getExternalContactId() {
    return externalContactId;
  }
  public void setExternalContactId(String externalContactId) {
    this.externalContactId = externalContactId;
  }


  /**
   * The id of the conversation. This field must be omitted if externalContactId is already populated on the event.
   **/
  public PredictiveRoutingCustomKpiAttributionEvent conversationId(String conversationId) {
    this.conversationId = conversationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The id of the conversation. This field must be omitted if externalContactId is already populated on the event.")
  @JsonProperty("conversationId")
  public String getConversationId() {
    return conversationId;
  }
  public void setConversationId(String conversationId) {
    this.conversationId = conversationId;
  }


  /**
   * The id of the agent who achieved the KPI attribution that is getting the attribution.
   **/
  public PredictiveRoutingCustomKpiAttributionEvent agentId(String agentId) {
    this.agentId = agentId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The id of the agent who achieved the KPI attribution that is getting the attribution.")
  @JsonProperty("agentId")
  public String getAgentId() {
    return agentId;
  }
  public void setAgentId(String agentId) {
    this.agentId = agentId;
  }


  /**
   * The id of the relevant revenue KPI within the Genesys Platform - this id can be retrieved from the Revenue KPI Admin UI.
   **/
  public PredictiveRoutingCustomKpiAttributionEvent kpiId(String kpiId) {
    this.kpiId = kpiId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The id of the relevant revenue KPI within the Genesys Platform - this id can be retrieved from the Revenue KPI Admin UI.")
  @JsonProperty("kpiId")
  public String getKpiId() {
    return kpiId;
  }
  public void setKpiId(String kpiId) {
    this.kpiId = kpiId;
  }


  /**
   * For Sales Conversion, Retention and Churn KPI type, the numeric value expected is \"1\". For SalesValue KPI type, a numeric value representing the aggregated value of all KPI attributions achieved by an agent during a conversation, we do not allow multiple event uploads for the same conversationId and agentId pair.
   **/
  public PredictiveRoutingCustomKpiAttributionEvent associatedValue(Double associatedValue) {
    this.associatedValue = associatedValue;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "For Sales Conversion, Retention and Churn KPI type, the numeric value expected is \"1\". For SalesValue KPI type, a numeric value representing the aggregated value of all KPI attributions achieved by an agent during a conversation, we do not allow multiple event uploads for the same conversationId and agentId pair.")
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

