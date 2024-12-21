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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * AnalyticsAgentStateAgentSessionResult
 */

public class AnalyticsAgentStateAgentSessionResult  implements Serializable {
  
  private String conversationId = null;
  private String sessionId = null;
  private Date sessionStart = null;
  private Date segmentStart = null;

  private static class SegmentTypeEnumDeserializer extends StdDeserializer<SegmentTypeEnum> {
    public SegmentTypeEnumDeserializer() {
      super(SegmentTypeEnumDeserializer.class);
    }

    @Override
    public SegmentTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return SegmentTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Segment type
   */
 @JsonDeserialize(using = SegmentTypeEnumDeserializer.class)
  public enum SegmentTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ALERT("alert"),
    BARGING("barging"),
    CALLBACK("callback"),
    COACHING("coaching"),
    CONTACTING("contacting"),
    CONVERTING("converting"),
    DELAY("delay"),
    DIALING("dialing"),
    HOLD("hold"),
    INTERACT("interact"),
    IVR("ivr"),
    MONITORING("monitoring"),
    PARKED("parked"),
    SCHEDULED("scheduled"),
    SHARING("sharing"),
    SYSTEM("system"),
    TRANSMITTING("transmitting"),
    UNKNOWN("unknown"),
    UPLOADING("uploading"),
    VOICEMAIL("voicemail"),
    WRAPUP("wrapup");

    private String value;

    SegmentTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static SegmentTypeEnum fromString(String key) {
      if (key == null) return null;

      for (SegmentTypeEnum value : SegmentTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return SegmentTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private SegmentTypeEnum segmentType = null;
  private String routedQueueId = null;
  private List<String> requestedRoutingSkillIds = new ArrayList<String>();
  private String requestedLanguageId = null;

  private static class OriginatingDirectionEnumDeserializer extends StdDeserializer<OriginatingDirectionEnum> {
    public OriginatingDirectionEnumDeserializer() {
      super(OriginatingDirectionEnumDeserializer.class);
    }

    @Override
    public OriginatingDirectionEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return OriginatingDirectionEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Originating direction
   */
 @JsonDeserialize(using = OriginatingDirectionEnumDeserializer.class)
  public enum OriginatingDirectionEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    INBOUND("inbound"),
    OUTBOUND("outbound");

    private String value;

    OriginatingDirectionEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static OriginatingDirectionEnum fromString(String key) {
      if (key == null) return null;

      for (OriginatingDirectionEnum value : OriginatingDirectionEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return OriginatingDirectionEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private OriginatingDirectionEnum originatingDirection = null;

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
   * Media type
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

  
  /**
   * Conversation Id
   **/
  public AnalyticsAgentStateAgentSessionResult conversationId(String conversationId) {
    this.conversationId = conversationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Conversation Id")
  @JsonProperty("conversationId")
  public String getConversationId() {
    return conversationId;
  }
  public void setConversationId(String conversationId) {
    this.conversationId = conversationId;
  }


  /**
   * Session Id
   **/
  public AnalyticsAgentStateAgentSessionResult sessionId(String sessionId) {
    this.sessionId = sessionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Session Id")
  @JsonProperty("sessionId")
  public String getSessionId() {
    return sessionId;
  }
  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }


  /**
   * Session start datetime. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public AnalyticsAgentStateAgentSessionResult sessionStart(Date sessionStart) {
    this.sessionStart = sessionStart;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Session start datetime. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("sessionStart")
  public Date getSessionStart() {
    return sessionStart;
  }
  public void setSessionStart(Date sessionStart) {
    this.sessionStart = sessionStart;
  }


  /**
   * Segment start datetime. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public AnalyticsAgentStateAgentSessionResult segmentStart(Date segmentStart) {
    this.segmentStart = segmentStart;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Segment start datetime. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("segmentStart")
  public Date getSegmentStart() {
    return segmentStart;
  }
  public void setSegmentStart(Date segmentStart) {
    this.segmentStart = segmentStart;
  }


  /**
   * Segment type
   **/
  public AnalyticsAgentStateAgentSessionResult segmentType(SegmentTypeEnum segmentType) {
    this.segmentType = segmentType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Segment type")
  @JsonProperty("segmentType")
  public SegmentTypeEnum getSegmentType() {
    return segmentType;
  }
  public void setSegmentType(SegmentTypeEnum segmentType) {
    this.segmentType = segmentType;
  }


  /**
   * Routed queue Id
   **/
  public AnalyticsAgentStateAgentSessionResult routedQueueId(String routedQueueId) {
    this.routedQueueId = routedQueueId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Routed queue Id")
  @JsonProperty("routedQueueId")
  public String getRoutedQueueId() {
    return routedQueueId;
  }
  public void setRoutedQueueId(String routedQueueId) {
    this.routedQueueId = routedQueueId;
  }


  /**
   * List of requested routing skill Id
   **/
  public AnalyticsAgentStateAgentSessionResult requestedRoutingSkillIds(List<String> requestedRoutingSkillIds) {
    this.requestedRoutingSkillIds = requestedRoutingSkillIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of requested routing skill Id")
  @JsonProperty("requestedRoutingSkillIds")
  public List<String> getRequestedRoutingSkillIds() {
    return requestedRoutingSkillIds;
  }
  public void setRequestedRoutingSkillIds(List<String> requestedRoutingSkillIds) {
    this.requestedRoutingSkillIds = requestedRoutingSkillIds;
  }


  /**
   * Requested language Id
   **/
  public AnalyticsAgentStateAgentSessionResult requestedLanguageId(String requestedLanguageId) {
    this.requestedLanguageId = requestedLanguageId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Requested language Id")
  @JsonProperty("requestedLanguageId")
  public String getRequestedLanguageId() {
    return requestedLanguageId;
  }
  public void setRequestedLanguageId(String requestedLanguageId) {
    this.requestedLanguageId = requestedLanguageId;
  }


  /**
   * Originating direction
   **/
  public AnalyticsAgentStateAgentSessionResult originatingDirection(OriginatingDirectionEnum originatingDirection) {
    this.originatingDirection = originatingDirection;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Originating direction")
  @JsonProperty("originatingDirection")
  public OriginatingDirectionEnum getOriginatingDirection() {
    return originatingDirection;
  }
  public void setOriginatingDirection(OriginatingDirectionEnum originatingDirection) {
    this.originatingDirection = originatingDirection;
  }


  /**
   * Media type
   **/
  public AnalyticsAgentStateAgentSessionResult mediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Media type")
  @JsonProperty("mediaType")
  public MediaTypeEnum getMediaType() {
    return mediaType;
  }
  public void setMediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsAgentStateAgentSessionResult analyticsAgentStateAgentSessionResult = (AnalyticsAgentStateAgentSessionResult) o;

    return Objects.equals(this.conversationId, analyticsAgentStateAgentSessionResult.conversationId) &&
            Objects.equals(this.sessionId, analyticsAgentStateAgentSessionResult.sessionId) &&
            Objects.equals(this.sessionStart, analyticsAgentStateAgentSessionResult.sessionStart) &&
            Objects.equals(this.segmentStart, analyticsAgentStateAgentSessionResult.segmentStart) &&
            Objects.equals(this.segmentType, analyticsAgentStateAgentSessionResult.segmentType) &&
            Objects.equals(this.routedQueueId, analyticsAgentStateAgentSessionResult.routedQueueId) &&
            Objects.equals(this.requestedRoutingSkillIds, analyticsAgentStateAgentSessionResult.requestedRoutingSkillIds) &&
            Objects.equals(this.requestedLanguageId, analyticsAgentStateAgentSessionResult.requestedLanguageId) &&
            Objects.equals(this.originatingDirection, analyticsAgentStateAgentSessionResult.originatingDirection) &&
            Objects.equals(this.mediaType, analyticsAgentStateAgentSessionResult.mediaType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversationId, sessionId, sessionStart, segmentStart, segmentType, routedQueueId, requestedRoutingSkillIds, requestedLanguageId, originatingDirection, mediaType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsAgentStateAgentSessionResult {\n");
    
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    sessionStart: ").append(toIndentedString(sessionStart)).append("\n");
    sb.append("    segmentStart: ").append(toIndentedString(segmentStart)).append("\n");
    sb.append("    segmentType: ").append(toIndentedString(segmentType)).append("\n");
    sb.append("    routedQueueId: ").append(toIndentedString(routedQueueId)).append("\n");
    sb.append("    requestedRoutingSkillIds: ").append(toIndentedString(requestedRoutingSkillIds)).append("\n");
    sb.append("    requestedLanguageId: ").append(toIndentedString(requestedLanguageId)).append("\n");
    sb.append("    originatingDirection: ").append(toIndentedString(originatingDirection)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
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

