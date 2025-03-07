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
import com.mypurecloud.sdk.v2.model.EmailBeginTransmittingEvent;
import com.mypurecloud.sdk.v2.model.EmailCommunicationAnsweredEvent;
import com.mypurecloud.sdk.v2.model.EmailCommunicationDispositionAppliedEvent;
import com.mypurecloud.sdk.v2.model.EmailCommunicationEndedEvent;
import com.mypurecloud.sdk.v2.model.EmailCommunicationSentMessageEvent;
import com.mypurecloud.sdk.v2.model.EmailEndTransferEvent;
import com.mypurecloud.sdk.v2.model.EmailExternalEstablishedEvent;
import com.mypurecloud.sdk.v2.model.EmailFlowEstablishedEvent;
import com.mypurecloud.sdk.v2.model.EmailHoldUpdatedEvent;
import com.mypurecloud.sdk.v2.model.EmailProgressTransferEvent;
import com.mypurecloud.sdk.v2.model.EmailRoutingEstablishedEvent;
import com.mypurecloud.sdk.v2.model.EmailRoutingTransferEvent;
import com.mypurecloud.sdk.v2.model.EmailUserEstablishedEvent;
import com.mypurecloud.sdk.v2.model.EmailUserTransferEvent;
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
  private List<EmailBeginTransmittingEvent> emailBeginTransmittingEvents = new ArrayList<EmailBeginTransmittingEvent>();
  private List<EmailCommunicationEndedEvent> emailCommunicationEndedEvents = new ArrayList<EmailCommunicationEndedEvent>();
  private List<EmailExternalEstablishedEvent> emailExternalEstablishedEvents = new ArrayList<EmailExternalEstablishedEvent>();
  private List<EmailFlowEstablishedEvent> emailFlowEstablishedEvents = new ArrayList<EmailFlowEstablishedEvent>();
  private List<EmailRoutingEstablishedEvent> emailRoutingEstablishedEvents = new ArrayList<EmailRoutingEstablishedEvent>();
  private List<EmailUserEstablishedEvent> emailUserEstablishedEvents = new ArrayList<EmailUserEstablishedEvent>();
  private List<EmailCommunicationAnsweredEvent> emailCommunicationAnsweredEvents = new ArrayList<EmailCommunicationAnsweredEvent>();
  private List<EmailCommunicationDispositionAppliedEvent> emailCommunicationDispositionAppliedEvents = new ArrayList<EmailCommunicationDispositionAppliedEvent>();
  private List<EmailCommunicationSentMessageEvent> emailCommunicationSentMessageEvents = new ArrayList<EmailCommunicationSentMessageEvent>();
  private List<EmailHoldUpdatedEvent> emailHoldUpdatedEvents = new ArrayList<EmailHoldUpdatedEvent>();
  private List<EmailEndTransferEvent> emailEndTransferEvents = new ArrayList<EmailEndTransferEvent>();
  private List<EmailProgressTransferEvent> emailProgressTransferEvents = new ArrayList<EmailProgressTransferEvent>();
  private List<EmailRoutingTransferEvent> emailRoutingTransferEvents = new ArrayList<EmailRoutingTransferEvent>();
  private List<EmailUserTransferEvent> emailUserTransferEvents = new ArrayList<EmailUserTransferEvent>();

  
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


  /**
   * Email - EmailBeginTransmittingEvent events for this batch
   **/
  public BatchConversationEventRequest emailBeginTransmittingEvents(List<EmailBeginTransmittingEvent> emailBeginTransmittingEvents) {
    this.emailBeginTransmittingEvents = emailBeginTransmittingEvents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Email - EmailBeginTransmittingEvent events for this batch")
  @JsonProperty("emailBeginTransmittingEvents")
  public List<EmailBeginTransmittingEvent> getEmailBeginTransmittingEvents() {
    return emailBeginTransmittingEvents;
  }
  public void setEmailBeginTransmittingEvents(List<EmailBeginTransmittingEvent> emailBeginTransmittingEvents) {
    this.emailBeginTransmittingEvents = emailBeginTransmittingEvents;
  }


  /**
   * Email - EmailCommunicationEndedEvent events for this batch
   **/
  public BatchConversationEventRequest emailCommunicationEndedEvents(List<EmailCommunicationEndedEvent> emailCommunicationEndedEvents) {
    this.emailCommunicationEndedEvents = emailCommunicationEndedEvents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Email - EmailCommunicationEndedEvent events for this batch")
  @JsonProperty("emailCommunicationEndedEvents")
  public List<EmailCommunicationEndedEvent> getEmailCommunicationEndedEvents() {
    return emailCommunicationEndedEvents;
  }
  public void setEmailCommunicationEndedEvents(List<EmailCommunicationEndedEvent> emailCommunicationEndedEvents) {
    this.emailCommunicationEndedEvents = emailCommunicationEndedEvents;
  }


  /**
   * Email - EmailExternalEstablishedEvent events for this batch
   **/
  public BatchConversationEventRequest emailExternalEstablishedEvents(List<EmailExternalEstablishedEvent> emailExternalEstablishedEvents) {
    this.emailExternalEstablishedEvents = emailExternalEstablishedEvents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Email - EmailExternalEstablishedEvent events for this batch")
  @JsonProperty("emailExternalEstablishedEvents")
  public List<EmailExternalEstablishedEvent> getEmailExternalEstablishedEvents() {
    return emailExternalEstablishedEvents;
  }
  public void setEmailExternalEstablishedEvents(List<EmailExternalEstablishedEvent> emailExternalEstablishedEvents) {
    this.emailExternalEstablishedEvents = emailExternalEstablishedEvents;
  }


  /**
   * Email - EmailFlowEstablishedEvent events for this batch
   **/
  public BatchConversationEventRequest emailFlowEstablishedEvents(List<EmailFlowEstablishedEvent> emailFlowEstablishedEvents) {
    this.emailFlowEstablishedEvents = emailFlowEstablishedEvents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Email - EmailFlowEstablishedEvent events for this batch")
  @JsonProperty("emailFlowEstablishedEvents")
  public List<EmailFlowEstablishedEvent> getEmailFlowEstablishedEvents() {
    return emailFlowEstablishedEvents;
  }
  public void setEmailFlowEstablishedEvents(List<EmailFlowEstablishedEvent> emailFlowEstablishedEvents) {
    this.emailFlowEstablishedEvents = emailFlowEstablishedEvents;
  }


  /**
   * Email - EmailRoutingEstablishedEvent events for this batch
   **/
  public BatchConversationEventRequest emailRoutingEstablishedEvents(List<EmailRoutingEstablishedEvent> emailRoutingEstablishedEvents) {
    this.emailRoutingEstablishedEvents = emailRoutingEstablishedEvents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Email - EmailRoutingEstablishedEvent events for this batch")
  @JsonProperty("emailRoutingEstablishedEvents")
  public List<EmailRoutingEstablishedEvent> getEmailRoutingEstablishedEvents() {
    return emailRoutingEstablishedEvents;
  }
  public void setEmailRoutingEstablishedEvents(List<EmailRoutingEstablishedEvent> emailRoutingEstablishedEvents) {
    this.emailRoutingEstablishedEvents = emailRoutingEstablishedEvents;
  }


  /**
   * Email - EmailUserEstablishedEvent events for this batch
   **/
  public BatchConversationEventRequest emailUserEstablishedEvents(List<EmailUserEstablishedEvent> emailUserEstablishedEvents) {
    this.emailUserEstablishedEvents = emailUserEstablishedEvents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Email - EmailUserEstablishedEvent events for this batch")
  @JsonProperty("emailUserEstablishedEvents")
  public List<EmailUserEstablishedEvent> getEmailUserEstablishedEvents() {
    return emailUserEstablishedEvents;
  }
  public void setEmailUserEstablishedEvents(List<EmailUserEstablishedEvent> emailUserEstablishedEvents) {
    this.emailUserEstablishedEvents = emailUserEstablishedEvents;
  }


  /**
   * Email - EmailCommunicationAnsweredEvent events for this batch
   **/
  public BatchConversationEventRequest emailCommunicationAnsweredEvents(List<EmailCommunicationAnsweredEvent> emailCommunicationAnsweredEvents) {
    this.emailCommunicationAnsweredEvents = emailCommunicationAnsweredEvents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Email - EmailCommunicationAnsweredEvent events for this batch")
  @JsonProperty("emailCommunicationAnsweredEvents")
  public List<EmailCommunicationAnsweredEvent> getEmailCommunicationAnsweredEvents() {
    return emailCommunicationAnsweredEvents;
  }
  public void setEmailCommunicationAnsweredEvents(List<EmailCommunicationAnsweredEvent> emailCommunicationAnsweredEvents) {
    this.emailCommunicationAnsweredEvents = emailCommunicationAnsweredEvents;
  }


  /**
   * Email - EmailCommunicationDispositionAppliedEvent events for this batch
   **/
  public BatchConversationEventRequest emailCommunicationDispositionAppliedEvents(List<EmailCommunicationDispositionAppliedEvent> emailCommunicationDispositionAppliedEvents) {
    this.emailCommunicationDispositionAppliedEvents = emailCommunicationDispositionAppliedEvents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Email - EmailCommunicationDispositionAppliedEvent events for this batch")
  @JsonProperty("emailCommunicationDispositionAppliedEvents")
  public List<EmailCommunicationDispositionAppliedEvent> getEmailCommunicationDispositionAppliedEvents() {
    return emailCommunicationDispositionAppliedEvents;
  }
  public void setEmailCommunicationDispositionAppliedEvents(List<EmailCommunicationDispositionAppliedEvent> emailCommunicationDispositionAppliedEvents) {
    this.emailCommunicationDispositionAppliedEvents = emailCommunicationDispositionAppliedEvents;
  }


  /**
   * Email - EmailCommunicationSentMessageEvent events for this batch
   **/
  public BatchConversationEventRequest emailCommunicationSentMessageEvents(List<EmailCommunicationSentMessageEvent> emailCommunicationSentMessageEvents) {
    this.emailCommunicationSentMessageEvents = emailCommunicationSentMessageEvents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Email - EmailCommunicationSentMessageEvent events for this batch")
  @JsonProperty("emailCommunicationSentMessageEvents")
  public List<EmailCommunicationSentMessageEvent> getEmailCommunicationSentMessageEvents() {
    return emailCommunicationSentMessageEvents;
  }
  public void setEmailCommunicationSentMessageEvents(List<EmailCommunicationSentMessageEvent> emailCommunicationSentMessageEvents) {
    this.emailCommunicationSentMessageEvents = emailCommunicationSentMessageEvents;
  }


  /**
   * Email - EmailHoldUpdatedEvent events for this batch
   **/
  public BatchConversationEventRequest emailHoldUpdatedEvents(List<EmailHoldUpdatedEvent> emailHoldUpdatedEvents) {
    this.emailHoldUpdatedEvents = emailHoldUpdatedEvents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Email - EmailHoldUpdatedEvent events for this batch")
  @JsonProperty("emailHoldUpdatedEvents")
  public List<EmailHoldUpdatedEvent> getEmailHoldUpdatedEvents() {
    return emailHoldUpdatedEvents;
  }
  public void setEmailHoldUpdatedEvents(List<EmailHoldUpdatedEvent> emailHoldUpdatedEvents) {
    this.emailHoldUpdatedEvents = emailHoldUpdatedEvents;
  }


  /**
   * Email - EmailEndTransferEvent events for this batch
   **/
  public BatchConversationEventRequest emailEndTransferEvents(List<EmailEndTransferEvent> emailEndTransferEvents) {
    this.emailEndTransferEvents = emailEndTransferEvents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Email - EmailEndTransferEvent events for this batch")
  @JsonProperty("emailEndTransferEvents")
  public List<EmailEndTransferEvent> getEmailEndTransferEvents() {
    return emailEndTransferEvents;
  }
  public void setEmailEndTransferEvents(List<EmailEndTransferEvent> emailEndTransferEvents) {
    this.emailEndTransferEvents = emailEndTransferEvents;
  }


  /**
   * Email - EmailProgressTransferEvent events for this batch
   **/
  public BatchConversationEventRequest emailProgressTransferEvents(List<EmailProgressTransferEvent> emailProgressTransferEvents) {
    this.emailProgressTransferEvents = emailProgressTransferEvents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Email - EmailProgressTransferEvent events for this batch")
  @JsonProperty("emailProgressTransferEvents")
  public List<EmailProgressTransferEvent> getEmailProgressTransferEvents() {
    return emailProgressTransferEvents;
  }
  public void setEmailProgressTransferEvents(List<EmailProgressTransferEvent> emailProgressTransferEvents) {
    this.emailProgressTransferEvents = emailProgressTransferEvents;
  }


  /**
   * Email - EmailRoutingTransferEvent events for this batch
   **/
  public BatchConversationEventRequest emailRoutingTransferEvents(List<EmailRoutingTransferEvent> emailRoutingTransferEvents) {
    this.emailRoutingTransferEvents = emailRoutingTransferEvents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Email - EmailRoutingTransferEvent events for this batch")
  @JsonProperty("emailRoutingTransferEvents")
  public List<EmailRoutingTransferEvent> getEmailRoutingTransferEvents() {
    return emailRoutingTransferEvents;
  }
  public void setEmailRoutingTransferEvents(List<EmailRoutingTransferEvent> emailRoutingTransferEvents) {
    this.emailRoutingTransferEvents = emailRoutingTransferEvents;
  }


  /**
   * Email - EmailUserTransferEvent events for this batch
   **/
  public BatchConversationEventRequest emailUserTransferEvents(List<EmailUserTransferEvent> emailUserTransferEvents) {
    this.emailUserTransferEvents = emailUserTransferEvents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Email - EmailUserTransferEvent events for this batch")
  @JsonProperty("emailUserTransferEvents")
  public List<EmailUserTransferEvent> getEmailUserTransferEvents() {
    return emailUserTransferEvents;
  }
  public void setEmailUserTransferEvents(List<EmailUserTransferEvent> emailUserTransferEvents) {
    this.emailUserTransferEvents = emailUserTransferEvents;
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
            Objects.equals(this.endConsultTransferEvents, batchConversationEventRequest.endConsultTransferEvents) &&
            Objects.equals(this.emailBeginTransmittingEvents, batchConversationEventRequest.emailBeginTransmittingEvents) &&
            Objects.equals(this.emailCommunicationEndedEvents, batchConversationEventRequest.emailCommunicationEndedEvents) &&
            Objects.equals(this.emailExternalEstablishedEvents, batchConversationEventRequest.emailExternalEstablishedEvents) &&
            Objects.equals(this.emailFlowEstablishedEvents, batchConversationEventRequest.emailFlowEstablishedEvents) &&
            Objects.equals(this.emailRoutingEstablishedEvents, batchConversationEventRequest.emailRoutingEstablishedEvents) &&
            Objects.equals(this.emailUserEstablishedEvents, batchConversationEventRequest.emailUserEstablishedEvents) &&
            Objects.equals(this.emailCommunicationAnsweredEvents, batchConversationEventRequest.emailCommunicationAnsweredEvents) &&
            Objects.equals(this.emailCommunicationDispositionAppliedEvents, batchConversationEventRequest.emailCommunicationDispositionAppliedEvents) &&
            Objects.equals(this.emailCommunicationSentMessageEvents, batchConversationEventRequest.emailCommunicationSentMessageEvents) &&
            Objects.equals(this.emailHoldUpdatedEvents, batchConversationEventRequest.emailHoldUpdatedEvents) &&
            Objects.equals(this.emailEndTransferEvents, batchConversationEventRequest.emailEndTransferEvents) &&
            Objects.equals(this.emailProgressTransferEvents, batchConversationEventRequest.emailProgressTransferEvents) &&
            Objects.equals(this.emailRoutingTransferEvents, batchConversationEventRequest.emailRoutingTransferEvents) &&
            Objects.equals(this.emailUserTransferEvents, batchConversationEventRequest.emailUserTransferEvents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endTransferEvents, phoneTransferEvents, progressTransferEvents, routingTransferEvents, userTransferEvents, communicationAnsweredEvents, communicationDispositionAppliedEvents, holdUpdatedEvents, externalEstablishedEvents, ivrEstablishedEvents, phoneEstablishedEvents, routingEstablishedEvents, userEstablishedEvents, audioUpdatedEvents, communicationEndedEvents, consultTransferEvents, progressConsultTransferEvents, endConsultTransferEvents, emailBeginTransmittingEvents, emailCommunicationEndedEvents, emailExternalEstablishedEvents, emailFlowEstablishedEvents, emailRoutingEstablishedEvents, emailUserEstablishedEvents, emailCommunicationAnsweredEvents, emailCommunicationDispositionAppliedEvents, emailCommunicationSentMessageEvents, emailHoldUpdatedEvents, emailEndTransferEvents, emailProgressTransferEvents, emailRoutingTransferEvents, emailUserTransferEvents);
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
    sb.append("    emailBeginTransmittingEvents: ").append(toIndentedString(emailBeginTransmittingEvents)).append("\n");
    sb.append("    emailCommunicationEndedEvents: ").append(toIndentedString(emailCommunicationEndedEvents)).append("\n");
    sb.append("    emailExternalEstablishedEvents: ").append(toIndentedString(emailExternalEstablishedEvents)).append("\n");
    sb.append("    emailFlowEstablishedEvents: ").append(toIndentedString(emailFlowEstablishedEvents)).append("\n");
    sb.append("    emailRoutingEstablishedEvents: ").append(toIndentedString(emailRoutingEstablishedEvents)).append("\n");
    sb.append("    emailUserEstablishedEvents: ").append(toIndentedString(emailUserEstablishedEvents)).append("\n");
    sb.append("    emailCommunicationAnsweredEvents: ").append(toIndentedString(emailCommunicationAnsweredEvents)).append("\n");
    sb.append("    emailCommunicationDispositionAppliedEvents: ").append(toIndentedString(emailCommunicationDispositionAppliedEvents)).append("\n");
    sb.append("    emailCommunicationSentMessageEvents: ").append(toIndentedString(emailCommunicationSentMessageEvents)).append("\n");
    sb.append("    emailHoldUpdatedEvents: ").append(toIndentedString(emailHoldUpdatedEvents)).append("\n");
    sb.append("    emailEndTransferEvents: ").append(toIndentedString(emailEndTransferEvents)).append("\n");
    sb.append("    emailProgressTransferEvents: ").append(toIndentedString(emailProgressTransferEvents)).append("\n");
    sb.append("    emailRoutingTransferEvents: ").append(toIndentedString(emailRoutingTransferEvents)).append("\n");
    sb.append("    emailUserTransferEvents: ").append(toIndentedString(emailUserTransferEvents)).append("\n");
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

