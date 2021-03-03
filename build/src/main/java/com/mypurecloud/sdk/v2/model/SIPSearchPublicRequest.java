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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * SIPSearchPublicRequest
 */

public class SIPSearchPublicRequest  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String callId = null;
  private String toUser = null;
  private String fromUser = null;
  private String conversationId = null;
  private String participantId = null;
  private Date dateStart = null;
  private Date dateEnd = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public SIPSearchPublicRequest name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * unique identification of the placed call
   **/
  public SIPSearchPublicRequest callId(String callId) {
    this.callId = callId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "unique identification of the placed call")
  @JsonProperty("callId")
  public String getCallId() {
    return callId;
  }
  public void setCallId(String callId) {
    this.callId = callId;
  }

  
  /**
   * SIP user to who the call was placed
   **/
  public SIPSearchPublicRequest toUser(String toUser) {
    this.toUser = toUser;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "SIP user to who the call was placed")
  @JsonProperty("toUser")
  public String getToUser() {
    return toUser;
  }
  public void setToUser(String toUser) {
    this.toUser = toUser;
  }

  
  /**
   * SIP user who placed the call
   **/
  public SIPSearchPublicRequest fromUser(String fromUser) {
    this.fromUser = fromUser;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "SIP user who placed the call")
  @JsonProperty("fromUser")
  public String getFromUser() {
    return fromUser;
  }
  public void setFromUser(String fromUser) {
    this.fromUser = fromUser;
  }

  
  /**
   * Unique identification of the conversation
   **/
  public SIPSearchPublicRequest conversationId(String conversationId) {
    this.conversationId = conversationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique identification of the conversation")
  @JsonProperty("conversationId")
  public String getConversationId() {
    return conversationId;
  }
  public void setConversationId(String conversationId) {
    this.conversationId = conversationId;
  }

  
  /**
   * Unique identification of the participant
   **/
  public SIPSearchPublicRequest participantId(String participantId) {
    this.participantId = participantId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique identification of the participant")
  @JsonProperty("participantId")
  public String getParticipantId() {
    return participantId;
  }
  public void setParticipantId(String participantId) {
    this.participantId = participantId;
  }

  
  /**
   * Start date of the search. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public SIPSearchPublicRequest dateStart(Date dateStart) {
    this.dateStart = dateStart;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Start date of the search. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateStart")
  public Date getDateStart() {
    return dateStart;
  }
  public void setDateStart(Date dateStart) {
    this.dateStart = dateStart;
  }

  
  /**
   * End date of the search. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public SIPSearchPublicRequest dateEnd(Date dateEnd) {
    this.dateEnd = dateEnd;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "End date of the search. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateEnd")
  public Date getDateEnd() {
    return dateEnd;
  }
  public void setDateEnd(Date dateEnd) {
    this.dateEnd = dateEnd;
  }

  
  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SIPSearchPublicRequest sIPSearchPublicRequest = (SIPSearchPublicRequest) o;
    return Objects.equals(this.id, sIPSearchPublicRequest.id) &&
        Objects.equals(this.name, sIPSearchPublicRequest.name) &&
        Objects.equals(this.callId, sIPSearchPublicRequest.callId) &&
        Objects.equals(this.toUser, sIPSearchPublicRequest.toUser) &&
        Objects.equals(this.fromUser, sIPSearchPublicRequest.fromUser) &&
        Objects.equals(this.conversationId, sIPSearchPublicRequest.conversationId) &&
        Objects.equals(this.participantId, sIPSearchPublicRequest.participantId) &&
        Objects.equals(this.dateStart, sIPSearchPublicRequest.dateStart) &&
        Objects.equals(this.dateEnd, sIPSearchPublicRequest.dateEnd) &&
        Objects.equals(this.selfUri, sIPSearchPublicRequest.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, callId, toUser, fromUser, conversationId, participantId, dateStart, dateEnd, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SIPSearchPublicRequest {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    callId: ").append(toIndentedString(callId)).append("\n");
    sb.append("    toUser: ").append(toIndentedString(toUser)).append("\n");
    sb.append("    fromUser: ").append(toIndentedString(fromUser)).append("\n");
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
    sb.append("    participantId: ").append(toIndentedString(participantId)).append("\n");
    sb.append("    dateStart: ").append(toIndentedString(dateStart)).append("\n");
    sb.append("    dateEnd: ").append(toIndentedString(dateEnd)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

