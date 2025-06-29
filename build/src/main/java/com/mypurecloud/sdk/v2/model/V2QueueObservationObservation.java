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
import com.mypurecloud.sdk.v2.model.V2QueueObservationScoredAgent;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * V2QueueObservationObservation
 */

public class V2QueueObservationObservation  implements Serializable {
  
  private Date observationDate = null;
  private String conversationId = null;
  private String sessionId = null;
  private List<String> requestedRoutingSkillIds = null;
  private String requestedLanguageId = null;
  private Long routingPriority = null;
  private String participantName = null;
  private String userId = null;
  private String direction = null;
  private String convertedFrom = null;
  private String convertedTo = null;
  private String addressFrom = null;
  private String addressTo = null;
  private String ani = null;
  private String dnis = null;
  private String teamId = null;
  private List<V2QueueObservationScoredAgent> scoredAgents = null;

  private static class RequestedRoutingsEnumDeserializer extends StdDeserializer<RequestedRoutingsEnum> {
    public RequestedRoutingsEnumDeserializer() {
      super(RequestedRoutingsEnumDeserializer.class);
    }

    @Override
    public RequestedRoutingsEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return RequestedRoutingsEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets requestedRoutings
   */
 @JsonDeserialize(using = RequestedRoutingsEnumDeserializer.class)
  public enum RequestedRoutingsEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    BULLSEYE("Bullseye"),
    CONDITIONAL("Conditional"),
    DIRECT("Direct"),
    LAST("Last"),
    MANUAL("Manual"),
    PREDICTIVE("Predictive"),
    PREFERRED("Preferred"),
    STANDARD("Standard"),
    VIP("Vip");

    private String value;

    RequestedRoutingsEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static RequestedRoutingsEnum fromString(String key) {
      if (key == null) return null;

      for (RequestedRoutingsEnum value : RequestedRoutingsEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return RequestedRoutingsEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<RequestedRoutingsEnum> requestedRoutings = null;

  private static class UsedRoutingEnumDeserializer extends StdDeserializer<UsedRoutingEnum> {
    public UsedRoutingEnumDeserializer() {
      super(UsedRoutingEnumDeserializer.class);
    }

    @Override
    public UsedRoutingEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return UsedRoutingEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Complete routing method
   */
 @JsonDeserialize(using = UsedRoutingEnumDeserializer.class)
  public enum UsedRoutingEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    BULLSEYE("Bullseye"),
    CONDITIONAL("Conditional"),
    DIRECT("Direct"),
    LAST("Last"),
    MANUAL("Manual"),
    PREDICTIVE("Predictive"),
    PREFERRED("Preferred"),
    STANDARD("Standard"),
    VIP("Vip");

    private String value;

    UsedRoutingEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static UsedRoutingEnum fromString(String key) {
      if (key == null) return null;

      for (UsedRoutingEnum value : UsedRoutingEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return UsedRoutingEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private UsedRoutingEnum usedRouting = null;

  public V2QueueObservationObservation() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      requestedRoutingSkillIds = new ArrayList<String>();
      scoredAgents = new ArrayList<V2QueueObservationScoredAgent>();
      requestedRoutings = new ArrayList<RequestedRoutingsEnum>();
    }
  }

  
  /**
   * The timestamp when the observation started
   **/
  public V2QueueObservationObservation observationDate(Date observationDate) {
    this.observationDate = observationDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The timestamp when the observation started")
  @JsonProperty("observationDate")
  public Date getObservationDate() {
    return observationDate;
  }
  public void setObservationDate(Date observationDate) {
    this.observationDate = observationDate;
  }


  /**
   * Unique identifier of the conversation to which this observation belongs
   **/
  public V2QueueObservationObservation conversationId(String conversationId) {
    this.conversationId = conversationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique identifier of the conversation to which this observation belongs")
  @JsonProperty("conversationId")
  public String getConversationId() {
    return conversationId;
  }
  public void setConversationId(String conversationId) {
    this.conversationId = conversationId;
  }


  /**
   * Unique identifier of the user session associated with this observation
   **/
  public V2QueueObservationObservation sessionId(String sessionId) {
    this.sessionId = sessionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique identifier of the user session associated with this observation")
  @JsonProperty("sessionId")
  public String getSessionId() {
    return sessionId;
  }
  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }


  /**
   * Unique identifiers for skills requested for an interaction
   **/
  public V2QueueObservationObservation requestedRoutingSkillIds(List<String> requestedRoutingSkillIds) {
    this.requestedRoutingSkillIds = requestedRoutingSkillIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique identifiers for skills requested for an interaction")
  @JsonProperty("requestedRoutingSkillIds")
  public List<String> getRequestedRoutingSkillIds() {
    return requestedRoutingSkillIds;
  }
  public void setRequestedRoutingSkillIds(List<String> requestedRoutingSkillIds) {
    this.requestedRoutingSkillIds = requestedRoutingSkillIds;
  }


  /**
   * Unique identifier for the language requested for an interaction
   **/
  public V2QueueObservationObservation requestedLanguageId(String requestedLanguageId) {
    this.requestedLanguageId = requestedLanguageId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique identifier for the language requested for an interaction")
  @JsonProperty("requestedLanguageId")
  public String getRequestedLanguageId() {
    return requestedLanguageId;
  }
  public void setRequestedLanguageId(String requestedLanguageId) {
    this.requestedLanguageId = requestedLanguageId;
  }


  /**
   * Routing priority for the current interaction
   **/
  public V2QueueObservationObservation routingPriority(Long routingPriority) {
    this.routingPriority = routingPriority;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Routing priority for the current interaction")
  @JsonProperty("routingPriority")
  public Long getRoutingPriority() {
    return routingPriority;
  }
  public void setRoutingPriority(Long routingPriority) {
    this.routingPriority = routingPriority;
  }


  /**
   * A human readable name identifying the participant
   **/
  public V2QueueObservationObservation participantName(String participantName) {
    this.participantName = participantName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A human readable name identifying the participant")
  @JsonProperty("participantName")
  public String getParticipantName() {
    return participantName;
  }
  public void setParticipantName(String participantName) {
    this.participantName = participantName;
  }


  /**
   * Unique identifier for the user
   **/
  public V2QueueObservationObservation userId(String userId) {
    this.userId = userId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique identifier for the user")
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }


  /**
   * The direction of the communication
   **/
  public V2QueueObservationObservation direction(String direction) {
    this.direction = direction;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The direction of the communication")
  @JsonProperty("direction")
  public String getDirection() {
    return direction;
  }
  public void setDirection(String direction) {
    this.direction = direction;
  }


  /**
   * Session media type that was converted from in case of a media type conversion
   **/
  public V2QueueObservationObservation convertedFrom(String convertedFrom) {
    this.convertedFrom = convertedFrom;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Session media type that was converted from in case of a media type conversion")
  @JsonProperty("convertedFrom")
  public String getConvertedFrom() {
    return convertedFrom;
  }
  public void setConvertedFrom(String convertedFrom) {
    this.convertedFrom = convertedFrom;
  }


  /**
   * Session media type that was converted to in case of a media type conversion
   **/
  public V2QueueObservationObservation convertedTo(String convertedTo) {
    this.convertedTo = convertedTo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Session media type that was converted to in case of a media type conversion")
  @JsonProperty("convertedTo")
  public String getConvertedTo() {
    return convertedTo;
  }
  public void setConvertedTo(String convertedTo) {
    this.convertedTo = convertedTo;
  }


  /**
   * The address that initiated an action
   **/
  public V2QueueObservationObservation addressFrom(String addressFrom) {
    this.addressFrom = addressFrom;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The address that initiated an action")
  @JsonProperty("addressFrom")
  public String getAddressFrom() {
    return addressFrom;
  }
  public void setAddressFrom(String addressFrom) {
    this.addressFrom = addressFrom;
  }


  /**
   * The address receiving an action
   **/
  public V2QueueObservationObservation addressTo(String addressTo) {
    this.addressTo = addressTo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The address receiving an action")
  @JsonProperty("addressTo")
  public String getAddressTo() {
    return addressTo;
  }
  public void setAddressTo(String addressTo) {
    this.addressTo = addressTo;
  }


  /**
   * Automatic Number Identification (caller's number)
   **/
  public V2QueueObservationObservation ani(String ani) {
    this.ani = ani;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Automatic Number Identification (caller's number)")
  @JsonProperty("ani")
  public String getAni() {
    return ani;
  }
  public void setAni(String ani) {
    this.ani = ani;
  }


  /**
   * Dialed number identification service (number dialed by the calling party)
   **/
  public V2QueueObservationObservation dnis(String dnis) {
    this.dnis = dnis;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Dialed number identification service (number dialed by the calling party)")
  @JsonProperty("dnis")
  public String getDnis() {
    return dnis;
  }
  public void setDnis(String dnis) {
    this.dnis = dnis;
  }


  /**
   * The team Id the user is a member of
   **/
  public V2QueueObservationObservation teamId(String teamId) {
    this.teamId = teamId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The team Id the user is a member of")
  @JsonProperty("teamId")
  public String getTeamId() {
    return teamId;
  }
  public void setTeamId(String teamId) {
    this.teamId = teamId;
  }


  /**
   * Scored agents for this conversation
   **/
  public V2QueueObservationObservation scoredAgents(List<V2QueueObservationScoredAgent> scoredAgents) {
    this.scoredAgents = scoredAgents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Scored agents for this conversation")
  @JsonProperty("scoredAgents")
  public List<V2QueueObservationScoredAgent> getScoredAgents() {
    return scoredAgents;
  }
  public void setScoredAgents(List<V2QueueObservationScoredAgent> scoredAgents) {
    this.scoredAgents = scoredAgents;
  }


  /**
   * All routing types for requested/attempted routing methods.
   **/
  public V2QueueObservationObservation requestedRoutings(List<RequestedRoutingsEnum> requestedRoutings) {
    this.requestedRoutings = requestedRoutings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "All routing types for requested/attempted routing methods.")
  @JsonProperty("requestedRoutings")
  public List<RequestedRoutingsEnum> getRequestedRoutings() {
    return requestedRoutings;
  }
  public void setRequestedRoutings(List<RequestedRoutingsEnum> requestedRoutings) {
    this.requestedRoutings = requestedRoutings;
  }


  /**
   * Complete routing method
   **/
  public V2QueueObservationObservation usedRouting(UsedRoutingEnum usedRouting) {
    this.usedRouting = usedRouting;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Complete routing method")
  @JsonProperty("usedRouting")
  public UsedRoutingEnum getUsedRouting() {
    return usedRouting;
  }
  public void setUsedRouting(UsedRoutingEnum usedRouting) {
    this.usedRouting = usedRouting;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2QueueObservationObservation v2QueueObservationObservation = (V2QueueObservationObservation) o;

    return Objects.equals(this.observationDate, v2QueueObservationObservation.observationDate) &&
            Objects.equals(this.conversationId, v2QueueObservationObservation.conversationId) &&
            Objects.equals(this.sessionId, v2QueueObservationObservation.sessionId) &&
            Objects.equals(this.requestedRoutingSkillIds, v2QueueObservationObservation.requestedRoutingSkillIds) &&
            Objects.equals(this.requestedLanguageId, v2QueueObservationObservation.requestedLanguageId) &&
            Objects.equals(this.routingPriority, v2QueueObservationObservation.routingPriority) &&
            Objects.equals(this.participantName, v2QueueObservationObservation.participantName) &&
            Objects.equals(this.userId, v2QueueObservationObservation.userId) &&
            Objects.equals(this.direction, v2QueueObservationObservation.direction) &&
            Objects.equals(this.convertedFrom, v2QueueObservationObservation.convertedFrom) &&
            Objects.equals(this.convertedTo, v2QueueObservationObservation.convertedTo) &&
            Objects.equals(this.addressFrom, v2QueueObservationObservation.addressFrom) &&
            Objects.equals(this.addressTo, v2QueueObservationObservation.addressTo) &&
            Objects.equals(this.ani, v2QueueObservationObservation.ani) &&
            Objects.equals(this.dnis, v2QueueObservationObservation.dnis) &&
            Objects.equals(this.teamId, v2QueueObservationObservation.teamId) &&
            Objects.equals(this.scoredAgents, v2QueueObservationObservation.scoredAgents) &&
            Objects.equals(this.requestedRoutings, v2QueueObservationObservation.requestedRoutings) &&
            Objects.equals(this.usedRouting, v2QueueObservationObservation.usedRouting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(observationDate, conversationId, sessionId, requestedRoutingSkillIds, requestedLanguageId, routingPriority, participantName, userId, direction, convertedFrom, convertedTo, addressFrom, addressTo, ani, dnis, teamId, scoredAgents, requestedRoutings, usedRouting);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2QueueObservationObservation {\n");
    
    sb.append("    observationDate: ").append(toIndentedString(observationDate)).append("\n");
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    requestedRoutingSkillIds: ").append(toIndentedString(requestedRoutingSkillIds)).append("\n");
    sb.append("    requestedLanguageId: ").append(toIndentedString(requestedLanguageId)).append("\n");
    sb.append("    routingPriority: ").append(toIndentedString(routingPriority)).append("\n");
    sb.append("    participantName: ").append(toIndentedString(participantName)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    convertedFrom: ").append(toIndentedString(convertedFrom)).append("\n");
    sb.append("    convertedTo: ").append(toIndentedString(convertedTo)).append("\n");
    sb.append("    addressFrom: ").append(toIndentedString(addressFrom)).append("\n");
    sb.append("    addressTo: ").append(toIndentedString(addressTo)).append("\n");
    sb.append("    ani: ").append(toIndentedString(ani)).append("\n");
    sb.append("    dnis: ").append(toIndentedString(dnis)).append("\n");
    sb.append("    teamId: ").append(toIndentedString(teamId)).append("\n");
    sb.append("    scoredAgents: ").append(toIndentedString(scoredAgents)).append("\n");
    sb.append("    requestedRoutings: ").append(toIndentedString(requestedRoutings)).append("\n");
    sb.append("    usedRouting: ").append(toIndentedString(usedRouting)).append("\n");
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

