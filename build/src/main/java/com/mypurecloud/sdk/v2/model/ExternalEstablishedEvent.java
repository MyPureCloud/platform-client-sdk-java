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
import com.mypurecloud.sdk.v2.model.InitialConfiguration;
import com.mypurecloud.sdk.v2.model.SourceConfiguration;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * ExternalEstablishedEvent
 */

public class ExternalEstablishedEvent  implements Serializable {
  
  private String eventId = null;
  private Date eventDateTime = null;
  private String conversationId = null;
  private String communicationId = null;
  private String ani = null;
  private String aniName = null;
  private String dnis = null;
  private String dnisName = null;
  private InitialConfiguration initialConfiguration = null;
  private SourceConfiguration sourceConfiguration = null;

  
  /**
   * A unique (V4 UUID) eventId for this event
   **/
  public ExternalEstablishedEvent eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A unique (V4 UUID) eventId for this event")
  @JsonProperty("eventId")
  public String getEventId() {
    return eventId;
  }
  public void setEventId(String eventId) {
    this.eventId = eventId;
  }


  /**
   * A Date Time representing the time this event occurred. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public ExternalEstablishedEvent eventDateTime(Date eventDateTime) {
    this.eventDateTime = eventDateTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A Date Time representing the time this event occurred. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("eventDateTime")
  public Date getEventDateTime() {
    return eventDateTime;
  }
  public void setEventDateTime(Date eventDateTime) {
    this.eventDateTime = eventDateTime;
  }


  /**
   * A unique Id (V4 UUID) identifying this conversation
   **/
  public ExternalEstablishedEvent conversationId(String conversationId) {
    this.conversationId = conversationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A unique Id (V4 UUID) identifying this conversation")
  @JsonProperty("conversationId")
  public String getConversationId() {
    return conversationId;
  }
  public void setConversationId(String conversationId) {
    this.conversationId = conversationId;
  }


  /**
   * A unique Id (V4 UUID) identifying this communication
   **/
  public ExternalEstablishedEvent communicationId(String communicationId) {
    this.communicationId = communicationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A unique Id (V4 UUID) identifying this communication")
  @JsonProperty("communicationId")
  public String getCommunicationId() {
    return communicationId;
  }
  public void setCommunicationId(String communicationId) {
    this.communicationId = communicationId;
  }


  /**
   * The automatic number identification if it is available for this conversation.
   **/
  public ExternalEstablishedEvent ani(String ani) {
    this.ani = ani;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The automatic number identification if it is available for this conversation.")
  @JsonProperty("ani")
  public String getAni() {
    return ani;
  }
  public void setAni(String ani) {
    this.ani = ani;
  }


  /**
   * The automatic number identification name if it is available for this conversation.
   **/
  public ExternalEstablishedEvent aniName(String aniName) {
    this.aniName = aniName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The automatic number identification name if it is available for this conversation.")
  @JsonProperty("aniName")
  public String getAniName() {
    return aniName;
  }
  public void setAniName(String aniName) {
    this.aniName = aniName;
  }


  /**
   * The dialed number identification if it is available for this conversation.
   **/
  public ExternalEstablishedEvent dnis(String dnis) {
    this.dnis = dnis;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The dialed number identification if it is available for this conversation.")
  @JsonProperty("dnis")
  public String getDnis() {
    return dnis;
  }
  public void setDnis(String dnis) {
    this.dnis = dnis;
  }


  /**
   * The dialed number identification name if it is available for this conversation.
   **/
  public ExternalEstablishedEvent dnisName(String dnisName) {
    this.dnisName = dnisName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The dialed number identification name if it is available for this conversation.")
  @JsonProperty("dnisName")
  public String getDnisName() {
    return dnisName;
  }
  public void setDnisName(String dnisName) {
    this.dnisName = dnisName;
  }


  /**
   * Metadata about this communication.
   **/
  public ExternalEstablishedEvent initialConfiguration(InitialConfiguration initialConfiguration) {
    this.initialConfiguration = initialConfiguration;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Metadata about this communication.")
  @JsonProperty("initialConfiguration")
  public InitialConfiguration getInitialConfiguration() {
    return initialConfiguration;
  }
  public void setInitialConfiguration(InitialConfiguration initialConfiguration) {
    this.initialConfiguration = initialConfiguration;
  }


  /**
   * Metadata about the source of this communication's interaction.
   **/
  public ExternalEstablishedEvent sourceConfiguration(SourceConfiguration sourceConfiguration) {
    this.sourceConfiguration = sourceConfiguration;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Metadata about the source of this communication's interaction.")
  @JsonProperty("sourceConfiguration")
  public SourceConfiguration getSourceConfiguration() {
    return sourceConfiguration;
  }
  public void setSourceConfiguration(SourceConfiguration sourceConfiguration) {
    this.sourceConfiguration = sourceConfiguration;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalEstablishedEvent externalEstablishedEvent = (ExternalEstablishedEvent) o;

    return Objects.equals(this.eventId, externalEstablishedEvent.eventId) &&
            Objects.equals(this.eventDateTime, externalEstablishedEvent.eventDateTime) &&
            Objects.equals(this.conversationId, externalEstablishedEvent.conversationId) &&
            Objects.equals(this.communicationId, externalEstablishedEvent.communicationId) &&
            Objects.equals(this.ani, externalEstablishedEvent.ani) &&
            Objects.equals(this.aniName, externalEstablishedEvent.aniName) &&
            Objects.equals(this.dnis, externalEstablishedEvent.dnis) &&
            Objects.equals(this.dnisName, externalEstablishedEvent.dnisName) &&
            Objects.equals(this.initialConfiguration, externalEstablishedEvent.initialConfiguration) &&
            Objects.equals(this.sourceConfiguration, externalEstablishedEvent.sourceConfiguration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, eventDateTime, conversationId, communicationId, ani, aniName, dnis, dnisName, initialConfiguration, sourceConfiguration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalEstablishedEvent {\n");
    
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    eventDateTime: ").append(toIndentedString(eventDateTime)).append("\n");
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
    sb.append("    communicationId: ").append(toIndentedString(communicationId)).append("\n");
    sb.append("    ani: ").append(toIndentedString(ani)).append("\n");
    sb.append("    aniName: ").append(toIndentedString(aniName)).append("\n");
    sb.append("    dnis: ").append(toIndentedString(dnis)).append("\n");
    sb.append("    dnisName: ").append(toIndentedString(dnisName)).append("\n");
    sb.append("    initialConfiguration: ").append(toIndentedString(initialConfiguration)).append("\n");
    sb.append("    sourceConfiguration: ").append(toIndentedString(sourceConfiguration)).append("\n");
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

