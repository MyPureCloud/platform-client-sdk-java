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
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.ConversationActivityScoredAgent;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * ConversationActivityEntityData
 */

public class ConversationActivityEntityData  implements Serializable {
  
  private Date activityDate = null;

  private static class MetricEnumDeserializer extends StdDeserializer<MetricEnum> {
    public MetricEnumDeserializer() {
      super(MetricEnumDeserializer.class);
    }

    @Override
    public MetricEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return MetricEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Activity metric
   */
 @JsonDeserialize(using = MetricEnumDeserializer.class)
  public enum MetricEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    OALERTING("oAlerting"),
    OINTERACTING("oInteracting"),
    OWAITING("oWaiting");

    private String value;

    MetricEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static MetricEnum fromString(String key) {
      if (key == null) return null;

      for (MetricEnum value : MetricEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return MetricEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private MetricEnum metric = null;

  private static class ActiveRoutingEnumDeserializer extends StdDeserializer<ActiveRoutingEnum> {
    public ActiveRoutingEnumDeserializer() {
      super(ActiveRoutingEnumDeserializer.class);
    }

    @Override
    public ActiveRoutingEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ActiveRoutingEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Active routing method
   */
 @JsonDeserialize(using = ActiveRoutingEnumDeserializer.class)
  public enum ActiveRoutingEnum {
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

    ActiveRoutingEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ActiveRoutingEnum fromString(String key) {
      if (key == null) return null;

      for (ActiveRoutingEnum value : ActiveRoutingEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ActiveRoutingEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ActiveRoutingEnum activeRouting = null;
  private String addressFrom = null;
  private String addressTo = null;
  private String ani = null;
  private String conversationId = null;
  private String convertedFrom = null;
  private String convertedTo = null;

  private static class DirectionEnumDeserializer extends StdDeserializer<DirectionEnum> {
    public DirectionEnumDeserializer() {
      super(DirectionEnumDeserializer.class);
    }

    @Override
    public DirectionEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return DirectionEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The direction of the communication
   */
 @JsonDeserialize(using = DirectionEnumDeserializer.class)
  public enum DirectionEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    INBOUND("inbound"),
    OUTBOUND("outbound");

    private String value;

    DirectionEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static DirectionEnum fromString(String key) {
      if (key == null) return null;

      for (DirectionEnum value : DirectionEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return DirectionEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private DirectionEnum direction = null;
  private String dnis = null;

  private static class MediaTypeEnumDeserializer extends StdDeserializer<MediaTypeEnum> {
    public MediaTypeEnumDeserializer() {
      super(MediaTypeEnumDeserializer.class);
    }

    @Override
    public MediaTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return MediaTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The session media type
   */
 @JsonDeserialize(using = MediaTypeEnumDeserializer.class)
  public enum MediaTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    CALLBACK("callback"),
    CHAT("chat"),
    COBROWSE("cobrowse"),
    EMAIL("email"),
    INTERNALMESSAGE("internalmessage"),
    MESSAGE("message"),
    SCREENSHARE("screenshare"),
    UNKNOWN("unknown"),
    VIDEO("video"),
    VOICE("voice");

    private String value;

    MediaTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static MediaTypeEnum fromString(String key) {
      if (key == null) return null;

      for (MediaTypeEnum value : MediaTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return MediaTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private MediaTypeEnum mediaType = null;
  private String participantName = null;
  private String queueId = null;
  private String requestedLanguageId = null;
  private List<String> requestedRoutingSkillIds = new ArrayList<String>();

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
  private List<RequestedRoutingsEnum> requestedRoutings = new ArrayList<RequestedRoutingsEnum>();
  private Long routingPriority = null;
  private String sessionId = null;
  private String teamId = null;

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
  private String userId = null;
  private List<ConversationActivityScoredAgent> scoredAgents = new ArrayList<ConversationActivityScoredAgent>();

  
  /**
   * The time at which the activity was observed. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public ConversationActivityEntityData activityDate(Date activityDate) {
    this.activityDate = activityDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The time at which the activity was observed. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("activityDate")
  public Date getActivityDate() {
    return activityDate;
  }
  public void setActivityDate(Date activityDate) {
    this.activityDate = activityDate;
  }


  /**
   * Activity metric
   **/
  public ConversationActivityEntityData metric(MetricEnum metric) {
    this.metric = metric;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Activity metric")
  @JsonProperty("metric")
  public MetricEnum getMetric() {
    return metric;
  }
  public void setMetric(MetricEnum metric) {
    this.metric = metric;
  }


  /**
   * Active routing method
   **/
  public ConversationActivityEntityData activeRouting(ActiveRoutingEnum activeRouting) {
    this.activeRouting = activeRouting;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Active routing method")
  @JsonProperty("activeRouting")
  public ActiveRoutingEnum getActiveRouting() {
    return activeRouting;
  }
  public void setActiveRouting(ActiveRoutingEnum activeRouting) {
    this.activeRouting = activeRouting;
  }


  /**
   * The address that initiated an action
   **/
  public ConversationActivityEntityData addressFrom(String addressFrom) {
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
  public ConversationActivityEntityData addressTo(String addressTo) {
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
  public ConversationActivityEntityData ani(String ani) {
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
   * Unique identifier for the conversation
   **/
  public ConversationActivityEntityData conversationId(String conversationId) {
    this.conversationId = conversationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique identifier for the conversation")
  @JsonProperty("conversationId")
  public String getConversationId() {
    return conversationId;
  }
  public void setConversationId(String conversationId) {
    this.conversationId = conversationId;
  }


  /**
   * Session media type that was converted from in case of a media type conversion
   **/
  public ConversationActivityEntityData convertedFrom(String convertedFrom) {
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
  public ConversationActivityEntityData convertedTo(String convertedTo) {
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
   * The direction of the communication
   **/
  public ConversationActivityEntityData direction(DirectionEnum direction) {
    this.direction = direction;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The direction of the communication")
  @JsonProperty("direction")
  public DirectionEnum getDirection() {
    return direction;
  }
  public void setDirection(DirectionEnum direction) {
    this.direction = direction;
  }


  /**
   * Dialed number identification service (number dialed by the calling party)
   **/
  public ConversationActivityEntityData dnis(String dnis) {
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
   * The session media type
   **/
  public ConversationActivityEntityData mediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The session media type")
  @JsonProperty("mediaType")
  public MediaTypeEnum getMediaType() {
    return mediaType;
  }
  public void setMediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
  }


  /**
   * A human readable name identifying the participant
   **/
  public ConversationActivityEntityData participantName(String participantName) {
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
   * Queue identifier
   **/
  public ConversationActivityEntityData queueId(String queueId) {
    this.queueId = queueId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Queue identifier")
  @JsonProperty("queueId")
  public String getQueueId() {
    return queueId;
  }
  public void setQueueId(String queueId) {
    this.queueId = queueId;
  }


  /**
   * Unique identifier for the language requested for an interaction
   **/
  public ConversationActivityEntityData requestedLanguageId(String requestedLanguageId) {
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
   * Unique identifier(s) for skill(s) requested for an interaction
   **/
  public ConversationActivityEntityData requestedRoutingSkillIds(List<String> requestedRoutingSkillIds) {
    this.requestedRoutingSkillIds = requestedRoutingSkillIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique identifier(s) for skill(s) requested for an interaction")
  @JsonProperty("requestedRoutingSkillIds")
  public List<String> getRequestedRoutingSkillIds() {
    return requestedRoutingSkillIds;
  }
  public void setRequestedRoutingSkillIds(List<String> requestedRoutingSkillIds) {
    this.requestedRoutingSkillIds = requestedRoutingSkillIds;
  }


  /**
   * Routing type(s) for requested/attempted routing methods.
   **/
  public ConversationActivityEntityData requestedRoutings(List<RequestedRoutingsEnum> requestedRoutings) {
    this.requestedRoutings = requestedRoutings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Routing type(s) for requested/attempted routing methods.")
  @JsonProperty("requestedRoutings")
  public List<RequestedRoutingsEnum> getRequestedRoutings() {
    return requestedRoutings;
  }
  public void setRequestedRoutings(List<RequestedRoutingsEnum> requestedRoutings) {
    this.requestedRoutings = requestedRoutings;
  }


  /**
   * Routing priority for the current interaction
   **/
  public ConversationActivityEntityData routingPriority(Long routingPriority) {
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
   * The unique identifier of this session
   **/
  public ConversationActivityEntityData sessionId(String sessionId) {
    this.sessionId = sessionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The unique identifier of this session")
  @JsonProperty("sessionId")
  public String getSessionId() {
    return sessionId;
  }
  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }


  /**
   * The team ID the user is a member of
   **/
  public ConversationActivityEntityData teamId(String teamId) {
    this.teamId = teamId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The team ID the user is a member of")
  @JsonProperty("teamId")
  public String getTeamId() {
    return teamId;
  }
  public void setTeamId(String teamId) {
    this.teamId = teamId;
  }


  /**
   * Complete routing method
   **/
  public ConversationActivityEntityData usedRouting(UsedRoutingEnum usedRouting) {
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


  /**
   * Unique identifier for the user
   **/
  public ConversationActivityEntityData userId(String userId) {
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
   * Scored agents
   **/
  public ConversationActivityEntityData scoredAgents(List<ConversationActivityScoredAgent> scoredAgents) {
    this.scoredAgents = scoredAgents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Scored agents")
  @JsonProperty("scoredAgents")
  public List<ConversationActivityScoredAgent> getScoredAgents() {
    return scoredAgents;
  }
  public void setScoredAgents(List<ConversationActivityScoredAgent> scoredAgents) {
    this.scoredAgents = scoredAgents;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationActivityEntityData conversationActivityEntityData = (ConversationActivityEntityData) o;

    return Objects.equals(this.activityDate, conversationActivityEntityData.activityDate) &&
            Objects.equals(this.metric, conversationActivityEntityData.metric) &&
            Objects.equals(this.activeRouting, conversationActivityEntityData.activeRouting) &&
            Objects.equals(this.addressFrom, conversationActivityEntityData.addressFrom) &&
            Objects.equals(this.addressTo, conversationActivityEntityData.addressTo) &&
            Objects.equals(this.ani, conversationActivityEntityData.ani) &&
            Objects.equals(this.conversationId, conversationActivityEntityData.conversationId) &&
            Objects.equals(this.convertedFrom, conversationActivityEntityData.convertedFrom) &&
            Objects.equals(this.convertedTo, conversationActivityEntityData.convertedTo) &&
            Objects.equals(this.direction, conversationActivityEntityData.direction) &&
            Objects.equals(this.dnis, conversationActivityEntityData.dnis) &&
            Objects.equals(this.mediaType, conversationActivityEntityData.mediaType) &&
            Objects.equals(this.participantName, conversationActivityEntityData.participantName) &&
            Objects.equals(this.queueId, conversationActivityEntityData.queueId) &&
            Objects.equals(this.requestedLanguageId, conversationActivityEntityData.requestedLanguageId) &&
            Objects.equals(this.requestedRoutingSkillIds, conversationActivityEntityData.requestedRoutingSkillIds) &&
            Objects.equals(this.requestedRoutings, conversationActivityEntityData.requestedRoutings) &&
            Objects.equals(this.routingPriority, conversationActivityEntityData.routingPriority) &&
            Objects.equals(this.sessionId, conversationActivityEntityData.sessionId) &&
            Objects.equals(this.teamId, conversationActivityEntityData.teamId) &&
            Objects.equals(this.usedRouting, conversationActivityEntityData.usedRouting) &&
            Objects.equals(this.userId, conversationActivityEntityData.userId) &&
            Objects.equals(this.scoredAgents, conversationActivityEntityData.scoredAgents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityDate, metric, activeRouting, addressFrom, addressTo, ani, conversationId, convertedFrom, convertedTo, direction, dnis, mediaType, participantName, queueId, requestedLanguageId, requestedRoutingSkillIds, requestedRoutings, routingPriority, sessionId, teamId, usedRouting, userId, scoredAgents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationActivityEntityData {\n");
    
    sb.append("    activityDate: ").append(toIndentedString(activityDate)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    activeRouting: ").append(toIndentedString(activeRouting)).append("\n");
    sb.append("    addressFrom: ").append(toIndentedString(addressFrom)).append("\n");
    sb.append("    addressTo: ").append(toIndentedString(addressTo)).append("\n");
    sb.append("    ani: ").append(toIndentedString(ani)).append("\n");
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
    sb.append("    convertedFrom: ").append(toIndentedString(convertedFrom)).append("\n");
    sb.append("    convertedTo: ").append(toIndentedString(convertedTo)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    dnis: ").append(toIndentedString(dnis)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    participantName: ").append(toIndentedString(participantName)).append("\n");
    sb.append("    queueId: ").append(toIndentedString(queueId)).append("\n");
    sb.append("    requestedLanguageId: ").append(toIndentedString(requestedLanguageId)).append("\n");
    sb.append("    requestedRoutingSkillIds: ").append(toIndentedString(requestedRoutingSkillIds)).append("\n");
    sb.append("    requestedRoutings: ").append(toIndentedString(requestedRoutings)).append("\n");
    sb.append("    routingPriority: ").append(toIndentedString(routingPriority)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    teamId: ").append(toIndentedString(teamId)).append("\n");
    sb.append("    usedRouting: ").append(toIndentedString(usedRouting)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    scoredAgents: ").append(toIndentedString(scoredAgents)).append("\n");
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

