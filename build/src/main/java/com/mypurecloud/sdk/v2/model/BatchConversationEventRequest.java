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
import com.mypurecloud.sdk.v2.model.AudioUpdatedEvent;
import com.mypurecloud.sdk.v2.model.CommunicationAnsweredEvent;
import com.mypurecloud.sdk.v2.model.CommunicationDispositionAppliedEvent;
import com.mypurecloud.sdk.v2.model.CommunicationEndedEvent;
import com.mypurecloud.sdk.v2.model.ConsultTransferEvent;
import com.mypurecloud.sdk.v2.model.EndConsultTransferEvent;
import com.mypurecloud.sdk.v2.model.EndTransferEvent;
import com.mypurecloud.sdk.v2.model.ExternalEstablishedEvent;
import com.mypurecloud.sdk.v2.model.HoldUpdatedEvent;
import com.mypurecloud.sdk.v2.model.IvrEstablishedEvent;
import com.mypurecloud.sdk.v2.model.PhoneEstablishedEvent;
import com.mypurecloud.sdk.v2.model.PhoneTransferEvent;
import com.mypurecloud.sdk.v2.model.ProgressConsultTransferEvent;
import com.mypurecloud.sdk.v2.model.ProgressTransferEvent;
import com.mypurecloud.sdk.v2.model.RoutingEstablishedEvent;
import com.mypurecloud.sdk.v2.model.RoutingTransferEvent;
import com.mypurecloud.sdk.v2.model.UserEstablishedEvent;
import com.mypurecloud.sdk.v2.model.UserTransferEvent;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * A maximum of 100 events are allowed per request
 */
@ApiModel(description = "A maximum of 100 events are allowed per request")

public class BatchConversationEventRequest  implements Serializable {
  
  private List<EndTransferEvent> endTransferEvents = new ArrayList<EndTransferEvent>();
  private List<PhoneTransferEvent> phoneTransferEvents = new ArrayList<PhoneTransferEvent>();
  private List<ProgressTransferEvent> progressTransferEvents = new ArrayList<ProgressTransferEvent>();
  private List<RoutingTransferEvent> routingTransferEvents = new ArrayList<RoutingTransferEvent>();
  private List<UserTransferEvent> userTransferEvents = new ArrayList<UserTransferEvent>();
  private List<CommunicationAnsweredEvent> communicationAnsweredEvents = new ArrayList<CommunicationAnsweredEvent>();
  private List<CommunicationDispositionAppliedEvent> communicationDispositionAppliedEvents = new ArrayList<CommunicationDispositionAppliedEvent>();
  private List<HoldUpdatedEvent> holdUpdatedEvents = new ArrayList<HoldUpdatedEvent>();
  private List<ExternalEstablishedEvent> externalEstablishedEvents = new ArrayList<ExternalEstablishedEvent>();
  private List<IvrEstablishedEvent> ivrEstablishedEvents = new ArrayList<IvrEstablishedEvent>();
  private List<PhoneEstablishedEvent> phoneEstablishedEvents = new ArrayList<PhoneEstablishedEvent>();
  private List<RoutingEstablishedEvent> routingEstablishedEvents = new ArrayList<RoutingEstablishedEvent>();
  private List<UserEstablishedEvent> userEstablishedEvents = new ArrayList<UserEstablishedEvent>();
  private List<AudioUpdatedEvent> audioUpdatedEvents = new ArrayList<AudioUpdatedEvent>();
  private List<CommunicationEndedEvent> communicationEndedEvents = new ArrayList<CommunicationEndedEvent>();
  private List<ConsultTransferEvent> consultTransferEvents = new ArrayList<ConsultTransferEvent>();
  private List<ProgressConsultTransferEvent> progressConsultTransferEvents = new ArrayList<ProgressConsultTransferEvent>();
  private List<EndConsultTransferEvent> endConsultTransferEvents = new ArrayList<EndConsultTransferEvent>();

  
  /**
   * Voice - EndTransfer events for this batch
   **/
  public BatchConversationEventRequest endTransferEvents(List<EndTransferEvent> endTransferEvents) {
    this.endTransferEvents = endTransferEvents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Voice - EndTransfer events for this batch")
  @JsonProperty("endTransferEvents")
  public List<EndTransferEvent> getEndTransferEvents() {
    return endTransferEvents;
  }
  public void setEndTransferEvents(List<EndTransferEvent> endTransferEvents) {
    this.endTransferEvents = endTransferEvents;
  }


  /**
   * Voice - PhoneTransfer events for this batch
   **/
  public BatchConversationEventRequest phoneTransferEvents(List<PhoneTransferEvent> phoneTransferEvents) {
    this.phoneTransferEvents = phoneTransferEvents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Voice - PhoneTransfer events for this batch")
  @JsonProperty("phoneTransferEvents")
  public List<PhoneTransferEvent> getPhoneTransferEvents() {
    return phoneTransferEvents;
  }
  public void setPhoneTransferEvents(List<PhoneTransferEvent> phoneTransferEvents) {
    this.phoneTransferEvents = phoneTransferEvents;
  }


  /**
   * Voice - ProgressTransfer events for this batch
   **/
  public BatchConversationEventRequest progressTransferEvents(List<ProgressTransferEvent> progressTransferEvents) {
    this.progressTransferEvents = progressTransferEvents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Voice - ProgressTransfer events for this batch")
  @JsonProperty("progressTransferEvents")
  public List<ProgressTransferEvent> getProgressTransferEvents() {
    return progressTransferEvents;
  }
  public void setProgressTransferEvents(List<ProgressTransferEvent> progressTransferEvents) {
    this.progressTransferEvents = progressTransferEvents;
  }


  /**
   * Voice - RoutingTransfer events for this batch
   **/
  public BatchConversationEventRequest routingTransferEvents(List<RoutingTransferEvent> routingTransferEvents) {
    this.routingTransferEvents = routingTransferEvents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Voice - RoutingTransfer events for this batch")
  @JsonProperty("routingTransferEvents")
  public List<RoutingTransferEvent> getRoutingTransferEvents() {
    return routingTransferEvents;
  }
  public void setRoutingTransferEvents(List<RoutingTransferEvent> routingTransferEvents) {
    this.routingTransferEvents = routingTransferEvents;
  }


  /**
   * Voice - UserTransfer events for this batch
   **/
  public BatchConversationEventRequest userTransferEvents(List<UserTransferEvent> userTransferEvents) {
    this.userTransferEvents = userTransferEvents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Voice - UserTransfer events for this batch")
  @JsonProperty("userTransferEvents")
  public List<UserTransferEvent> getUserTransferEvents() {
    return userTransferEvents;
  }
  public void setUserTransferEvents(List<UserTransferEvent> userTransferEvents) {
    this.userTransferEvents = userTransferEvents;
  }


  /**
   * Voice - CommunicationAnswered events for this batch
   **/
  public BatchConversationEventRequest communicationAnsweredEvents(List<CommunicationAnsweredEvent> communicationAnsweredEvents) {
    this.communicationAnsweredEvents = communicationAnsweredEvents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Voice - CommunicationAnswered events for this batch")
  @JsonProperty("communicationAnsweredEvents")
  public List<CommunicationAnsweredEvent> getCommunicationAnsweredEvents() {
    return communicationAnsweredEvents;
  }
  public void setCommunicationAnsweredEvents(List<CommunicationAnsweredEvent> communicationAnsweredEvents) {
    this.communicationAnsweredEvents = communicationAnsweredEvents;
  }


  /**
   * Voice - CommunicationDispositionApplied events for this batch
   **/
  public BatchConversationEventRequest communicationDispositionAppliedEvents(List<CommunicationDispositionAppliedEvent> communicationDispositionAppliedEvents) {
    this.communicationDispositionAppliedEvents = communicationDispositionAppliedEvents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Voice - CommunicationDispositionApplied events for this batch")
  @JsonProperty("communicationDispositionAppliedEvents")
  public List<CommunicationDispositionAppliedEvent> getCommunicationDispositionAppliedEvents() {
    return communicationDispositionAppliedEvents;
  }
  public void setCommunicationDispositionAppliedEvents(List<CommunicationDispositionAppliedEvent> communicationDispositionAppliedEvents) {
    this.communicationDispositionAppliedEvents = communicationDispositionAppliedEvents;
  }


  /**
   * Voice - HoldUpdated events for this batch
   **/
  public BatchConversationEventRequest holdUpdatedEvents(List<HoldUpdatedEvent> holdUpdatedEvents) {
    this.holdUpdatedEvents = holdUpdatedEvents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Voice - HoldUpdated events for this batch")
  @JsonProperty("holdUpdatedEvents")
  public List<HoldUpdatedEvent> getHoldUpdatedEvents() {
    return holdUpdatedEvents;
  }
  public void setHoldUpdatedEvents(List<HoldUpdatedEvent> holdUpdatedEvents) {
    this.holdUpdatedEvents = holdUpdatedEvents;
  }


  /**
   * Voice - ExternalEstablished events for this batch
   **/
  public BatchConversationEventRequest externalEstablishedEvents(List<ExternalEstablishedEvent> externalEstablishedEvents) {
    this.externalEstablishedEvents = externalEstablishedEvents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Voice - ExternalEstablished events for this batch")
  @JsonProperty("externalEstablishedEvents")
  public List<ExternalEstablishedEvent> getExternalEstablishedEvents() {
    return externalEstablishedEvents;
  }
  public void setExternalEstablishedEvents(List<ExternalEstablishedEvent> externalEstablishedEvents) {
    this.externalEstablishedEvents = externalEstablishedEvents;
  }


  /**
   * Voice - IvrEstablished events for this batch
   **/
  public BatchConversationEventRequest ivrEstablishedEvents(List<IvrEstablishedEvent> ivrEstablishedEvents) {
    this.ivrEstablishedEvents = ivrEstablishedEvents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Voice - IvrEstablished events for this batch")
  @JsonProperty("ivrEstablishedEvents")
  public List<IvrEstablishedEvent> getIvrEstablishedEvents() {
    return ivrEstablishedEvents;
  }
  public void setIvrEstablishedEvents(List<IvrEstablishedEvent> ivrEstablishedEvents) {
    this.ivrEstablishedEvents = ivrEstablishedEvents;
  }


  /**
   * Voice - PhoneEstablished events for this batch
   **/
  public BatchConversationEventRequest phoneEstablishedEvents(List<PhoneEstablishedEvent> phoneEstablishedEvents) {
    this.phoneEstablishedEvents = phoneEstablishedEvents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Voice - PhoneEstablished events for this batch")
  @JsonProperty("phoneEstablishedEvents")
  public List<PhoneEstablishedEvent> getPhoneEstablishedEvents() {
    return phoneEstablishedEvents;
  }
  public void setPhoneEstablishedEvents(List<PhoneEstablishedEvent> phoneEstablishedEvents) {
    this.phoneEstablishedEvents = phoneEstablishedEvents;
  }


  /**
   * Voice - RoutingEstablished events for this batch
   **/
  public BatchConversationEventRequest routingEstablishedEvents(List<RoutingEstablishedEvent> routingEstablishedEvents) {
    this.routingEstablishedEvents = routingEstablishedEvents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Voice - RoutingEstablished events for this batch")
  @JsonProperty("routingEstablishedEvents")
  public List<RoutingEstablishedEvent> getRoutingEstablishedEvents() {
    return routingEstablishedEvents;
  }
  public void setRoutingEstablishedEvents(List<RoutingEstablishedEvent> routingEstablishedEvents) {
    this.routingEstablishedEvents = routingEstablishedEvents;
  }


  /**
   * Voice - UserEstablished events for this batch
   **/
  public BatchConversationEventRequest userEstablishedEvents(List<UserEstablishedEvent> userEstablishedEvents) {
    this.userEstablishedEvents = userEstablishedEvents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Voice - UserEstablished events for this batch")
  @JsonProperty("userEstablishedEvents")
  public List<UserEstablishedEvent> getUserEstablishedEvents() {
    return userEstablishedEvents;
  }
  public void setUserEstablishedEvents(List<UserEstablishedEvent> userEstablishedEvents) {
    this.userEstablishedEvents = userEstablishedEvents;
  }


  /**
   * Voice - AudioUpdated events for this batch
   **/
  public BatchConversationEventRequest audioUpdatedEvents(List<AudioUpdatedEvent> audioUpdatedEvents) {
    this.audioUpdatedEvents = audioUpdatedEvents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Voice - AudioUpdated events for this batch")
  @JsonProperty("audioUpdatedEvents")
  public List<AudioUpdatedEvent> getAudioUpdatedEvents() {
    return audioUpdatedEvents;
  }
  public void setAudioUpdatedEvents(List<AudioUpdatedEvent> audioUpdatedEvents) {
    this.audioUpdatedEvents = audioUpdatedEvents;
  }


  /**
   * Voice - CommunicationEnded events for this batch
   **/
  public BatchConversationEventRequest communicationEndedEvents(List<CommunicationEndedEvent> communicationEndedEvents) {
    this.communicationEndedEvents = communicationEndedEvents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Voice - CommunicationEnded events for this batch")
  @JsonProperty("communicationEndedEvents")
  public List<CommunicationEndedEvent> getCommunicationEndedEvents() {
    return communicationEndedEvents;
  }
  public void setCommunicationEndedEvents(List<CommunicationEndedEvent> communicationEndedEvents) {
    this.communicationEndedEvents = communicationEndedEvents;
  }


  /**
   * Voice - ConsultTransfer events for this batch
   **/
  public BatchConversationEventRequest consultTransferEvents(List<ConsultTransferEvent> consultTransferEvents) {
    this.consultTransferEvents = consultTransferEvents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Voice - ConsultTransfer events for this batch")
  @JsonProperty("consultTransferEvents")
  public List<ConsultTransferEvent> getConsultTransferEvents() {
    return consultTransferEvents;
  }
  public void setConsultTransferEvents(List<ConsultTransferEvent> consultTransferEvents) {
    this.consultTransferEvents = consultTransferEvents;
  }


  /**
   * Voice - ProgressConsultTransfer events for this batch
   **/
  public BatchConversationEventRequest progressConsultTransferEvents(List<ProgressConsultTransferEvent> progressConsultTransferEvents) {
    this.progressConsultTransferEvents = progressConsultTransferEvents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Voice - ProgressConsultTransfer events for this batch")
  @JsonProperty("progressConsultTransferEvents")
  public List<ProgressConsultTransferEvent> getProgressConsultTransferEvents() {
    return progressConsultTransferEvents;
  }
  public void setProgressConsultTransferEvents(List<ProgressConsultTransferEvent> progressConsultTransferEvents) {
    this.progressConsultTransferEvents = progressConsultTransferEvents;
  }


  /**
   * Voice - EndConsultTransfer events for this batch
   **/
  public BatchConversationEventRequest endConsultTransferEvents(List<EndConsultTransferEvent> endConsultTransferEvents) {
    this.endConsultTransferEvents = endConsultTransferEvents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Voice - EndConsultTransfer events for this batch")
  @JsonProperty("endConsultTransferEvents")
  public List<EndConsultTransferEvent> getEndConsultTransferEvents() {
    return endConsultTransferEvents;
  }
  public void setEndConsultTransferEvents(List<EndConsultTransferEvent> endConsultTransferEvents) {
    this.endConsultTransferEvents = endConsultTransferEvents;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchConversationEventRequest batchConversationEventRequest = (BatchConversationEventRequest) o;

    return Objects.equals(this.endTransferEvents, batchConversationEventRequest.endTransferEvents) &&
            Objects.equals(this.phoneTransferEvents, batchConversationEventRequest.phoneTransferEvents) &&
            Objects.equals(this.progressTransferEvents, batchConversationEventRequest.progressTransferEvents) &&
            Objects.equals(this.routingTransferEvents, batchConversationEventRequest.routingTransferEvents) &&
            Objects.equals(this.userTransferEvents, batchConversationEventRequest.userTransferEvents) &&
            Objects.equals(this.communicationAnsweredEvents, batchConversationEventRequest.communicationAnsweredEvents) &&
            Objects.equals(this.communicationDispositionAppliedEvents, batchConversationEventRequest.communicationDispositionAppliedEvents) &&
            Objects.equals(this.holdUpdatedEvents, batchConversationEventRequest.holdUpdatedEvents) &&
            Objects.equals(this.externalEstablishedEvents, batchConversationEventRequest.externalEstablishedEvents) &&
            Objects.equals(this.ivrEstablishedEvents, batchConversationEventRequest.ivrEstablishedEvents) &&
            Objects.equals(this.phoneEstablishedEvents, batchConversationEventRequest.phoneEstablishedEvents) &&
            Objects.equals(this.routingEstablishedEvents, batchConversationEventRequest.routingEstablishedEvents) &&
            Objects.equals(this.userEstablishedEvents, batchConversationEventRequest.userEstablishedEvents) &&
            Objects.equals(this.audioUpdatedEvents, batchConversationEventRequest.audioUpdatedEvents) &&
            Objects.equals(this.communicationEndedEvents, batchConversationEventRequest.communicationEndedEvents) &&
            Objects.equals(this.consultTransferEvents, batchConversationEventRequest.consultTransferEvents) &&
            Objects.equals(this.progressConsultTransferEvents, batchConversationEventRequest.progressConsultTransferEvents) &&
            Objects.equals(this.endConsultTransferEvents, batchConversationEventRequest.endConsultTransferEvents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endTransferEvents, phoneTransferEvents, progressTransferEvents, routingTransferEvents, userTransferEvents, communicationAnsweredEvents, communicationDispositionAppliedEvents, holdUpdatedEvents, externalEstablishedEvents, ivrEstablishedEvents, phoneEstablishedEvents, routingEstablishedEvents, userEstablishedEvents, audioUpdatedEvents, communicationEndedEvents, consultTransferEvents, progressConsultTransferEvents, endConsultTransferEvents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchConversationEventRequest {\n");
    
    sb.append("    endTransferEvents: ").append(toIndentedString(endTransferEvents)).append("\n");
    sb.append("    phoneTransferEvents: ").append(toIndentedString(phoneTransferEvents)).append("\n");
    sb.append("    progressTransferEvents: ").append(toIndentedString(progressTransferEvents)).append("\n");
    sb.append("    routingTransferEvents: ").append(toIndentedString(routingTransferEvents)).append("\n");
    sb.append("    userTransferEvents: ").append(toIndentedString(userTransferEvents)).append("\n");
    sb.append("    communicationAnsweredEvents: ").append(toIndentedString(communicationAnsweredEvents)).append("\n");
    sb.append("    communicationDispositionAppliedEvents: ").append(toIndentedString(communicationDispositionAppliedEvents)).append("\n");
    sb.append("    holdUpdatedEvents: ").append(toIndentedString(holdUpdatedEvents)).append("\n");
    sb.append("    externalEstablishedEvents: ").append(toIndentedString(externalEstablishedEvents)).append("\n");
    sb.append("    ivrEstablishedEvents: ").append(toIndentedString(ivrEstablishedEvents)).append("\n");
    sb.append("    phoneEstablishedEvents: ").append(toIndentedString(phoneEstablishedEvents)).append("\n");
    sb.append("    routingEstablishedEvents: ").append(toIndentedString(routingEstablishedEvents)).append("\n");
    sb.append("    userEstablishedEvents: ").append(toIndentedString(userEstablishedEvents)).append("\n");
    sb.append("    audioUpdatedEvents: ").append(toIndentedString(audioUpdatedEvents)).append("\n");
    sb.append("    communicationEndedEvents: ").append(toIndentedString(communicationEndedEvents)).append("\n");
    sb.append("    consultTransferEvents: ").append(toIndentedString(consultTransferEvents)).append("\n");
    sb.append("    progressConsultTransferEvents: ").append(toIndentedString(progressConsultTransferEvents)).append("\n");
    sb.append("    endConsultTransferEvents: ").append(toIndentedString(endConsultTransferEvents)).append("\n");
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

