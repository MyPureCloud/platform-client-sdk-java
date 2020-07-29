package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.AnalyticsConversationSegment;
import com.mypurecloud.sdk.v2.model.AnalyticsFlow;
import com.mypurecloud.sdk.v2.model.AnalyticsMediaEndpointStat;
import com.mypurecloud.sdk.v2.model.AnalyticsSessionMetric;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * AnalyticsSession
 */

public class AnalyticsSession  implements Serializable {
  

  /**
   * The session media type
   */
  public enum MediaTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    VOICE("voice"),
    CHAT("chat"),
    EMAIL("email"),
    CALLBACK("callback"),
    COBROWSE("cobrowse"),
    VIDEO("video"),
    SCREENSHARE("screenshare"),
    MESSAGE("message");

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
  private String sessionId = null;
  private String addressOther = null;
  private String addressSelf = null;
  private String addressFrom = null;
  private String addressTo = null;

  /**
   * Message type for messaging services such as sms
   */
  public enum MessageTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    SMS("sms"),
    FACEBOOK("facebook"),
    TWITTER("twitter"),
    LINE("line");

    private String value;

    MessageTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static MessageTypeEnum fromString(String key) {
      if (key == null) return null;

      for (MessageTypeEnum value : MessageTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return MessageTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private MessageTypeEnum messageType = null;
  private String ani = null;

  /**
   * Direction
   */
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
  private String sessionDnis = null;
  private String outboundCampaignId = null;
  private String outboundContactId = null;
  private String outboundContactListId = null;
  private String dispositionAnalyzer = null;
  private String dispositionName = null;
  private String edgeId = null;
  private String remoteNameDisplayable = null;
  private String roomId = null;
  private String monitoredSessionId = null;
  private String monitoredParticipantId = null;
  private String callbackUserName = null;
  private List<String> callbackNumbers = new ArrayList<String>();
  private Date callbackScheduledTime = null;
  private String scriptId = null;
  private String peerId = null;
  private Boolean skipEnabled = null;
  private Integer timeoutSeconds = null;
  private String cobrowseRole = null;
  private String cobrowseRoomId = null;
  private String mediaBridgeId = null;
  private String screenShareAddressSelf = null;
  private Boolean sharingScreen = null;
  private String screenShareRoomId = null;
  private String videoRoomId = null;
  private String videoAddressSelf = null;
  private List<AnalyticsConversationSegment> segments = new ArrayList<AnalyticsConversationSegment>();
  private List<AnalyticsSessionMetric> metrics = new ArrayList<AnalyticsSessionMetric>();
  private AnalyticsFlow flow = null;
  private List<AnalyticsMediaEndpointStat> mediaEndpointStats = new ArrayList<AnalyticsMediaEndpointStat>();
  private Boolean recording = null;
  private String journeyCustomerId = null;
  private String journeyCustomerIdType = null;
  private String journeyCustomerSessionId = null;
  private String journeyCustomerSessionIdType = null;
  private String journeyActionId = null;
  private String journeyActionMapId = null;
  private String journeyActionMapVersion = null;
  private String protocolCallId = null;
  private String provider = null;
  private String remote = null;
  private Integer mediaCount = null;
  private String flowOutType = null;

  /**
   * Gets or Sets requestedRoutings
   */
  public enum RequestedRoutingsEnum {
    PREDICTIVE("Predictive"),
    PREFERRED("Preferred"),
    MANUAL("Manual"),
    LAST("Last"),
    BULLSEYE("Bullseye"),
    STANDARD("Standard");

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

  /**
   * Complete routing method
   */
  public enum UsedRoutingEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    PREDICTIVE("Predictive"),
    PREFERRED("Preferred"),
    MANUAL("Manual"),
    LAST("Last"),
    BULLSEYE("Bullseye"),
    STANDARD("Standard");

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
  private String selectedAgentId = null;
  private Integer selectedAgentRank = null;

  
  /**
   * The session media type
   **/
  public AnalyticsSession mediaType(MediaTypeEnum mediaType) {
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
   * The unique identifier of this session
   **/
  public AnalyticsSession sessionId(String sessionId) {
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
   **/
  public AnalyticsSession addressOther(String addressOther) {
    this.addressOther = addressOther;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("addressOther")
  public String getAddressOther() {
    return addressOther;
  }
  public void setAddressOther(String addressOther) {
    this.addressOther = addressOther;
  }

  
  /**
   **/
  public AnalyticsSession addressSelf(String addressSelf) {
    this.addressSelf = addressSelf;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("addressSelf")
  public String getAddressSelf() {
    return addressSelf;
  }
  public void setAddressSelf(String addressSelf) {
    this.addressSelf = addressSelf;
  }

  
  /**
   **/
  public AnalyticsSession addressFrom(String addressFrom) {
    this.addressFrom = addressFrom;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("addressFrom")
  public String getAddressFrom() {
    return addressFrom;
  }
  public void setAddressFrom(String addressFrom) {
    this.addressFrom = addressFrom;
  }

  
  /**
   **/
  public AnalyticsSession addressTo(String addressTo) {
    this.addressTo = addressTo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("addressTo")
  public String getAddressTo() {
    return addressTo;
  }
  public void setAddressTo(String addressTo) {
    this.addressTo = addressTo;
  }

  
  /**
   * Message type for messaging services such as sms
   **/
  public AnalyticsSession messageType(MessageTypeEnum messageType) {
    this.messageType = messageType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Message type for messaging services such as sms")
  @JsonProperty("messageType")
  public MessageTypeEnum getMessageType() {
    return messageType;
  }
  public void setMessageType(MessageTypeEnum messageType) {
    this.messageType = messageType;
  }

  
  /**
   * Automatic Number Identification (caller's number)
   **/
  public AnalyticsSession ani(String ani) {
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
   * Direction
   **/
  public AnalyticsSession direction(DirectionEnum direction) {
    this.direction = direction;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Direction")
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
  public AnalyticsSession dnis(String dnis) {
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
   * Dialed number for the current session; this can be different from dnis, e.g. if the call was transferred
   **/
  public AnalyticsSession sessionDnis(String sessionDnis) {
    this.sessionDnis = sessionDnis;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Dialed number for the current session; this can be different from dnis, e.g. if the call was transferred")
  @JsonProperty("sessionDnis")
  public String getSessionDnis() {
    return sessionDnis;
  }
  public void setSessionDnis(String sessionDnis) {
    this.sessionDnis = sessionDnis;
  }

  
  /**
   * (Dialer) Unique identifier of the outbound campaign
   **/
  public AnalyticsSession outboundCampaignId(String outboundCampaignId) {
    this.outboundCampaignId = outboundCampaignId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "(Dialer) Unique identifier of the outbound campaign")
  @JsonProperty("outboundCampaignId")
  public String getOutboundCampaignId() {
    return outboundCampaignId;
  }
  public void setOutboundCampaignId(String outboundCampaignId) {
    this.outboundCampaignId = outboundCampaignId;
  }

  
  /**
   * (Dialer) Unique identifier of the contact
   **/
  public AnalyticsSession outboundContactId(String outboundContactId) {
    this.outboundContactId = outboundContactId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "(Dialer) Unique identifier of the contact")
  @JsonProperty("outboundContactId")
  public String getOutboundContactId() {
    return outboundContactId;
  }
  public void setOutboundContactId(String outboundContactId) {
    this.outboundContactId = outboundContactId;
  }

  
  /**
   * (Dialer) Unique identifier of the contact list that this contact belongs to
   **/
  public AnalyticsSession outboundContactListId(String outboundContactListId) {
    this.outboundContactListId = outboundContactListId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "(Dialer) Unique identifier of the contact list that this contact belongs to")
  @JsonProperty("outboundContactListId")
  public String getOutboundContactListId() {
    return outboundContactListId;
  }
  public void setOutboundContactListId(String outboundContactListId) {
    this.outboundContactListId = outboundContactListId;
  }

  
  /**
   * (Dialer) Unique identifier of the contact list that this contact belongs to
   **/
  public AnalyticsSession dispositionAnalyzer(String dispositionAnalyzer) {
    this.dispositionAnalyzer = dispositionAnalyzer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "(Dialer) Unique identifier of the contact list that this contact belongs to")
  @JsonProperty("dispositionAnalyzer")
  public String getDispositionAnalyzer() {
    return dispositionAnalyzer;
  }
  public void setDispositionAnalyzer(String dispositionAnalyzer) {
    this.dispositionAnalyzer = dispositionAnalyzer;
  }

  
  /**
   * (Dialer) Result of the analysis
   **/
  public AnalyticsSession dispositionName(String dispositionName) {
    this.dispositionName = dispositionName;
    return this;
  }
  
  @ApiModelProperty(example = "disposition.classification.callable.machine", value = "(Dialer) Result of the analysis")
  @JsonProperty("dispositionName")
  public String getDispositionName() {
    return dispositionName;
  }
  public void setDispositionName(String dispositionName) {
    this.dispositionName = dispositionName;
  }

  
  /**
   * Unique identifier of the edge device
   **/
  public AnalyticsSession edgeId(String edgeId) {
    this.edgeId = edgeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique identifier of the edge device")
  @JsonProperty("edgeId")
  public String getEdgeId() {
    return edgeId;
  }
  public void setEdgeId(String edgeId) {
    this.edgeId = edgeId;
  }

  
  /**
   **/
  public AnalyticsSession remoteNameDisplayable(String remoteNameDisplayable) {
    this.remoteNameDisplayable = remoteNameDisplayable;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("remoteNameDisplayable")
  public String getRemoteNameDisplayable() {
    return remoteNameDisplayable;
  }
  public void setRemoteNameDisplayable(String remoteNameDisplayable) {
    this.remoteNameDisplayable = remoteNameDisplayable;
  }

  
  /**
   * Unique identifier for the room
   **/
  public AnalyticsSession roomId(String roomId) {
    this.roomId = roomId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique identifier for the room")
  @JsonProperty("roomId")
  public String getRoomId() {
    return roomId;
  }
  public void setRoomId(String roomId) {
    this.roomId = roomId;
  }

  
  /**
   * The sessionID being monitored
   **/
  public AnalyticsSession monitoredSessionId(String monitoredSessionId) {
    this.monitoredSessionId = monitoredSessionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The sessionID being monitored")
  @JsonProperty("monitoredSessionId")
  public String getMonitoredSessionId() {
    return monitoredSessionId;
  }
  public void setMonitoredSessionId(String monitoredSessionId) {
    this.monitoredSessionId = monitoredSessionId;
  }

  
  /**
   **/
  public AnalyticsSession monitoredParticipantId(String monitoredParticipantId) {
    this.monitoredParticipantId = monitoredParticipantId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("monitoredParticipantId")
  public String getMonitoredParticipantId() {
    return monitoredParticipantId;
  }
  public void setMonitoredParticipantId(String monitoredParticipantId) {
    this.monitoredParticipantId = monitoredParticipantId;
  }

  
  /**
   * The name of the user requesting a call back
   **/
  public AnalyticsSession callbackUserName(String callbackUserName) {
    this.callbackUserName = callbackUserName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of the user requesting a call back")
  @JsonProperty("callbackUserName")
  public String getCallbackUserName() {
    return callbackUserName;
  }
  public void setCallbackUserName(String callbackUserName) {
    this.callbackUserName = callbackUserName;
  }

  
  /**
   * List of numbers to callback
   **/
  public AnalyticsSession callbackNumbers(List<String> callbackNumbers) {
    this.callbackNumbers = callbackNumbers;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of numbers to callback")
  @JsonProperty("callbackNumbers")
  public List<String> getCallbackNumbers() {
    return callbackNumbers;
  }
  public void setCallbackNumbers(List<String> callbackNumbers) {
    this.callbackNumbers = callbackNumbers;
  }

  
  /**
   * Scheduled callback date/time. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  public AnalyticsSession callbackScheduledTime(Date callbackScheduledTime) {
    this.callbackScheduledTime = callbackScheduledTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Scheduled callback date/time. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("callbackScheduledTime")
  public Date getCallbackScheduledTime() {
    return callbackScheduledTime;
  }
  public void setCallbackScheduledTime(Date callbackScheduledTime) {
    this.callbackScheduledTime = callbackScheduledTime;
  }

  
  /**
   * A unique identifier for a script
   **/
  public AnalyticsSession scriptId(String scriptId) {
    this.scriptId = scriptId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A unique identifier for a script")
  @JsonProperty("scriptId")
  public String getScriptId() {
    return scriptId;
  }
  public void setScriptId(String scriptId) {
    this.scriptId = scriptId;
  }

  
  /**
   * A unique identifier for a peer
   **/
  public AnalyticsSession peerId(String peerId) {
    this.peerId = peerId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A unique identifier for a peer")
  @JsonProperty("peerId")
  public String getPeerId() {
    return peerId;
  }
  public void setPeerId(String peerId) {
    this.peerId = peerId;
  }

  
  /**
   * (Dialer) Whether the agent can skip the dialer contact
   **/
  public AnalyticsSession skipEnabled(Boolean skipEnabled) {
    this.skipEnabled = skipEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "(Dialer) Whether the agent can skip the dialer contact")
  @JsonProperty("skipEnabled")
  public Boolean getSkipEnabled() {
    return skipEnabled;
  }
  public void setSkipEnabled(Boolean skipEnabled) {
    this.skipEnabled = skipEnabled;
  }

  
  /**
   * The number of seconds before PureCloud begins the call for a call back. 0 disables automatic calling
   **/
  public AnalyticsSession timeoutSeconds(Integer timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of seconds before PureCloud begins the call for a call back. 0 disables automatic calling")
  @JsonProperty("timeoutSeconds")
  public Integer getTimeoutSeconds() {
    return timeoutSeconds;
  }
  public void setTimeoutSeconds(Integer timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
  }

  
  /**
   * Describe side of the cobrowse (sharer or viewer)
   **/
  public AnalyticsSession cobrowseRole(String cobrowseRole) {
    this.cobrowseRole = cobrowseRole;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Describe side of the cobrowse (sharer or viewer)")
  @JsonProperty("cobrowseRole")
  public String getCobrowseRole() {
    return cobrowseRole;
  }
  public void setCobrowseRole(String cobrowseRole) {
    this.cobrowseRole = cobrowseRole;
  }

  
  /**
   * A unique identifier for a PureCloud Cobrowse room.
   **/
  public AnalyticsSession cobrowseRoomId(String cobrowseRoomId) {
    this.cobrowseRoomId = cobrowseRoomId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A unique identifier for a PureCloud Cobrowse room.")
  @JsonProperty("cobrowseRoomId")
  public String getCobrowseRoomId() {
    return cobrowseRoomId;
  }
  public void setCobrowseRoomId(String cobrowseRoomId) {
    this.cobrowseRoomId = cobrowseRoomId;
  }

  
  /**
   **/
  public AnalyticsSession mediaBridgeId(String mediaBridgeId) {
    this.mediaBridgeId = mediaBridgeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("mediaBridgeId")
  public String getMediaBridgeId() {
    return mediaBridgeId;
  }
  public void setMediaBridgeId(String mediaBridgeId) {
    this.mediaBridgeId = mediaBridgeId;
  }

  
  /**
   * Direct ScreenShare address
   **/
  public AnalyticsSession screenShareAddressSelf(String screenShareAddressSelf) {
    this.screenShareAddressSelf = screenShareAddressSelf;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Direct ScreenShare address")
  @JsonProperty("screenShareAddressSelf")
  public String getScreenShareAddressSelf() {
    return screenShareAddressSelf;
  }
  public void setScreenShareAddressSelf(String screenShareAddressSelf) {
    this.screenShareAddressSelf = screenShareAddressSelf;
  }

  
  /**
   * Flag determining if screenShare is started or not (true/false)
   **/
  public AnalyticsSession sharingScreen(Boolean sharingScreen) {
    this.sharingScreen = sharingScreen;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Flag determining if screenShare is started or not (true/false)")
  @JsonProperty("sharingScreen")
  public Boolean getSharingScreen() {
    return sharingScreen;
  }
  public void setSharingScreen(Boolean sharingScreen) {
    this.sharingScreen = sharingScreen;
  }

  
  /**
   * A unique identifier for a PureCloud ScreenShare room.
   **/
  public AnalyticsSession screenShareRoomId(String screenShareRoomId) {
    this.screenShareRoomId = screenShareRoomId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A unique identifier for a PureCloud ScreenShare room.")
  @JsonProperty("screenShareRoomId")
  public String getScreenShareRoomId() {
    return screenShareRoomId;
  }
  public void setScreenShareRoomId(String screenShareRoomId) {
    this.screenShareRoomId = screenShareRoomId;
  }

  
  /**
   * A unique identifier for a PureCloud video room.
   **/
  public AnalyticsSession videoRoomId(String videoRoomId) {
    this.videoRoomId = videoRoomId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A unique identifier for a PureCloud video room.")
  @JsonProperty("videoRoomId")
  public String getVideoRoomId() {
    return videoRoomId;
  }
  public void setVideoRoomId(String videoRoomId) {
    this.videoRoomId = videoRoomId;
  }

  
  /**
   * Direct Video address
   **/
  public AnalyticsSession videoAddressSelf(String videoAddressSelf) {
    this.videoAddressSelf = videoAddressSelf;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Direct Video address")
  @JsonProperty("videoAddressSelf")
  public String getVideoAddressSelf() {
    return videoAddressSelf;
  }
  public void setVideoAddressSelf(String videoAddressSelf) {
    this.videoAddressSelf = videoAddressSelf;
  }

  
  /**
   * List of segments for this session
   **/
  public AnalyticsSession segments(List<AnalyticsConversationSegment> segments) {
    this.segments = segments;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of segments for this session")
  @JsonProperty("segments")
  public List<AnalyticsConversationSegment> getSegments() {
    return segments;
  }
  public void setSegments(List<AnalyticsConversationSegment> segments) {
    this.segments = segments;
  }

  
  /**
   * List of metrics for this session
   **/
  public AnalyticsSession metrics(List<AnalyticsSessionMetric> metrics) {
    this.metrics = metrics;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of metrics for this session")
  @JsonProperty("metrics")
  public List<AnalyticsSessionMetric> getMetrics() {
    return metrics;
  }
  public void setMetrics(List<AnalyticsSessionMetric> metrics) {
    this.metrics = metrics;
  }

  
  /**
   * IVR flow execution associated with this session
   **/
  public AnalyticsSession flow(AnalyticsFlow flow) {
    this.flow = flow;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "IVR flow execution associated with this session")
  @JsonProperty("flow")
  public AnalyticsFlow getFlow() {
    return flow;
  }
  public void setFlow(AnalyticsFlow flow) {
    this.flow = flow;
  }

  
  /**
   * Media endpoint stats associated with this session
   **/
  public AnalyticsSession mediaEndpointStats(List<AnalyticsMediaEndpointStat> mediaEndpointStats) {
    this.mediaEndpointStats = mediaEndpointStats;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Media endpoint stats associated with this session")
  @JsonProperty("mediaEndpointStats")
  public List<AnalyticsMediaEndpointStat> getMediaEndpointStats() {
    return mediaEndpointStats;
  }
  public void setMediaEndpointStats(List<AnalyticsMediaEndpointStat> mediaEndpointStats) {
    this.mediaEndpointStats = mediaEndpointStats;
  }

  
  /**
   * Flag determining if an audio recording was started or not
   **/
  public AnalyticsSession recording(Boolean recording) {
    this.recording = recording;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Flag determining if an audio recording was started or not")
  @JsonProperty("recording")
  public Boolean getRecording() {
    return recording;
  }
  public void setRecording(Boolean recording) {
    this.recording = recording;
  }

  
  /**
   * ID of the journey customer
   **/
  public AnalyticsSession journeyCustomerId(String journeyCustomerId) {
    this.journeyCustomerId = journeyCustomerId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ID of the journey customer")
  @JsonProperty("journeyCustomerId")
  public String getJourneyCustomerId() {
    return journeyCustomerId;
  }
  public void setJourneyCustomerId(String journeyCustomerId) {
    this.journeyCustomerId = journeyCustomerId;
  }

  
  /**
   * Type of the journey customer ID
   **/
  public AnalyticsSession journeyCustomerIdType(String journeyCustomerIdType) {
    this.journeyCustomerIdType = journeyCustomerIdType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Type of the journey customer ID")
  @JsonProperty("journeyCustomerIdType")
  public String getJourneyCustomerIdType() {
    return journeyCustomerIdType;
  }
  public void setJourneyCustomerIdType(String journeyCustomerIdType) {
    this.journeyCustomerIdType = journeyCustomerIdType;
  }

  
  /**
   * ID of the journey customer session
   **/
  public AnalyticsSession journeyCustomerSessionId(String journeyCustomerSessionId) {
    this.journeyCustomerSessionId = journeyCustomerSessionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ID of the journey customer session")
  @JsonProperty("journeyCustomerSessionId")
  public String getJourneyCustomerSessionId() {
    return journeyCustomerSessionId;
  }
  public void setJourneyCustomerSessionId(String journeyCustomerSessionId) {
    this.journeyCustomerSessionId = journeyCustomerSessionId;
  }

  
  /**
   * Type of the journey customer session ID
   **/
  public AnalyticsSession journeyCustomerSessionIdType(String journeyCustomerSessionIdType) {
    this.journeyCustomerSessionIdType = journeyCustomerSessionIdType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Type of the journey customer session ID")
  @JsonProperty("journeyCustomerSessionIdType")
  public String getJourneyCustomerSessionIdType() {
    return journeyCustomerSessionIdType;
  }
  public void setJourneyCustomerSessionIdType(String journeyCustomerSessionIdType) {
    this.journeyCustomerSessionIdType = journeyCustomerSessionIdType;
  }

  
  /**
   * Journey action ID
   **/
  public AnalyticsSession journeyActionId(String journeyActionId) {
    this.journeyActionId = journeyActionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Journey action ID")
  @JsonProperty("journeyActionId")
  public String getJourneyActionId() {
    return journeyActionId;
  }
  public void setJourneyActionId(String journeyActionId) {
    this.journeyActionId = journeyActionId;
  }

  
  /**
   * Journey action map ID
   **/
  public AnalyticsSession journeyActionMapId(String journeyActionMapId) {
    this.journeyActionMapId = journeyActionMapId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Journey action map ID")
  @JsonProperty("journeyActionMapId")
  public String getJourneyActionMapId() {
    return journeyActionMapId;
  }
  public void setJourneyActionMapId(String journeyActionMapId) {
    this.journeyActionMapId = journeyActionMapId;
  }

  
  /**
   * Journey action map version
   **/
  public AnalyticsSession journeyActionMapVersion(String journeyActionMapVersion) {
    this.journeyActionMapVersion = journeyActionMapVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Journey action map version")
  @JsonProperty("journeyActionMapVersion")
  public String getJourneyActionMapVersion() {
    return journeyActionMapVersion;
  }
  public void setJourneyActionMapVersion(String journeyActionMapVersion) {
    this.journeyActionMapVersion = journeyActionMapVersion;
  }

  
  /**
   * The original voice protocol call ID, e.g. a SIP call ID
   **/
  public AnalyticsSession protocolCallId(String protocolCallId) {
    this.protocolCallId = protocolCallId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The original voice protocol call ID, e.g. a SIP call ID")
  @JsonProperty("protocolCallId")
  public String getProtocolCallId() {
    return protocolCallId;
  }
  public void setProtocolCallId(String protocolCallId) {
    this.protocolCallId = protocolCallId;
  }

  
  /**
   * The source provider for the communication
   **/
  public AnalyticsSession provider(String provider) {
    this.provider = provider;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The source provider for the communication")
  @JsonProperty("provider")
  public String getProvider() {
    return provider;
  }
  public void setProvider(String provider) {
    this.provider = provider;
  }

  
  /**
   * Name, phone number, or email address of the remote party.
   **/
  public AnalyticsSession remote(String remote) {
    this.remote = remote;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Name, phone number, or email address of the remote party.")
  @JsonProperty("remote")
  public String getRemote() {
    return remote;
  }
  public void setRemote(String remote) {
    this.remote = remote;
  }

  
  /**
   * Count of any media (images, files, etc) included in this session
   **/
  public AnalyticsSession mediaCount(Integer mediaCount) {
    this.mediaCount = mediaCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Count of any media (images, files, etc) included in this session")
  @JsonProperty("mediaCount")
  public Integer getMediaCount() {
    return mediaCount;
  }
  public void setMediaCount(Integer mediaCount) {
    this.mediaCount = mediaCount;
  }

  
  /**
   * Type of flow out that occurred, e.g. voicemail, callback, or acd
   **/
  public AnalyticsSession flowOutType(String flowOutType) {
    this.flowOutType = flowOutType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Type of flow out that occurred, e.g. voicemail, callback, or acd")
  @JsonProperty("flowOutType")
  public String getFlowOutType() {
    return flowOutType;
  }
  public void setFlowOutType(String flowOutType) {
    this.flowOutType = flowOutType;
  }

  
  /**
   * All routing types for requested/attempted routing methods.
   **/
  public AnalyticsSession requestedRoutings(List<RequestedRoutingsEnum> requestedRoutings) {
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
  public AnalyticsSession usedRouting(UsedRoutingEnum usedRouting) {
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
   * Selected agent id
   **/
  public AnalyticsSession selectedAgentId(String selectedAgentId) {
    this.selectedAgentId = selectedAgentId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Selected agent id")
  @JsonProperty("selectedAgentId")
  public String getSelectedAgentId() {
    return selectedAgentId;
  }
  public void setSelectedAgentId(String selectedAgentId) {
    this.selectedAgentId = selectedAgentId;
  }

  
  /**
   * Selected agent GPR rank
   **/
  public AnalyticsSession selectedAgentRank(Integer selectedAgentRank) {
    this.selectedAgentRank = selectedAgentRank;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Selected agent GPR rank")
  @JsonProperty("selectedAgentRank")
  public Integer getSelectedAgentRank() {
    return selectedAgentRank;
  }
  public void setSelectedAgentRank(Integer selectedAgentRank) {
    this.selectedAgentRank = selectedAgentRank;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsSession analyticsSession = (AnalyticsSession) o;
    return Objects.equals(this.mediaType, analyticsSession.mediaType) &&
        Objects.equals(this.sessionId, analyticsSession.sessionId) &&
        Objects.equals(this.addressOther, analyticsSession.addressOther) &&
        Objects.equals(this.addressSelf, analyticsSession.addressSelf) &&
        Objects.equals(this.addressFrom, analyticsSession.addressFrom) &&
        Objects.equals(this.addressTo, analyticsSession.addressTo) &&
        Objects.equals(this.messageType, analyticsSession.messageType) &&
        Objects.equals(this.ani, analyticsSession.ani) &&
        Objects.equals(this.direction, analyticsSession.direction) &&
        Objects.equals(this.dnis, analyticsSession.dnis) &&
        Objects.equals(this.sessionDnis, analyticsSession.sessionDnis) &&
        Objects.equals(this.outboundCampaignId, analyticsSession.outboundCampaignId) &&
        Objects.equals(this.outboundContactId, analyticsSession.outboundContactId) &&
        Objects.equals(this.outboundContactListId, analyticsSession.outboundContactListId) &&
        Objects.equals(this.dispositionAnalyzer, analyticsSession.dispositionAnalyzer) &&
        Objects.equals(this.dispositionName, analyticsSession.dispositionName) &&
        Objects.equals(this.edgeId, analyticsSession.edgeId) &&
        Objects.equals(this.remoteNameDisplayable, analyticsSession.remoteNameDisplayable) &&
        Objects.equals(this.roomId, analyticsSession.roomId) &&
        Objects.equals(this.monitoredSessionId, analyticsSession.monitoredSessionId) &&
        Objects.equals(this.monitoredParticipantId, analyticsSession.monitoredParticipantId) &&
        Objects.equals(this.callbackUserName, analyticsSession.callbackUserName) &&
        Objects.equals(this.callbackNumbers, analyticsSession.callbackNumbers) &&
        Objects.equals(this.callbackScheduledTime, analyticsSession.callbackScheduledTime) &&
        Objects.equals(this.scriptId, analyticsSession.scriptId) &&
        Objects.equals(this.peerId, analyticsSession.peerId) &&
        Objects.equals(this.skipEnabled, analyticsSession.skipEnabled) &&
        Objects.equals(this.timeoutSeconds, analyticsSession.timeoutSeconds) &&
        Objects.equals(this.cobrowseRole, analyticsSession.cobrowseRole) &&
        Objects.equals(this.cobrowseRoomId, analyticsSession.cobrowseRoomId) &&
        Objects.equals(this.mediaBridgeId, analyticsSession.mediaBridgeId) &&
        Objects.equals(this.screenShareAddressSelf, analyticsSession.screenShareAddressSelf) &&
        Objects.equals(this.sharingScreen, analyticsSession.sharingScreen) &&
        Objects.equals(this.screenShareRoomId, analyticsSession.screenShareRoomId) &&
        Objects.equals(this.videoRoomId, analyticsSession.videoRoomId) &&
        Objects.equals(this.videoAddressSelf, analyticsSession.videoAddressSelf) &&
        Objects.equals(this.segments, analyticsSession.segments) &&
        Objects.equals(this.metrics, analyticsSession.metrics) &&
        Objects.equals(this.flow, analyticsSession.flow) &&
        Objects.equals(this.mediaEndpointStats, analyticsSession.mediaEndpointStats) &&
        Objects.equals(this.recording, analyticsSession.recording) &&
        Objects.equals(this.journeyCustomerId, analyticsSession.journeyCustomerId) &&
        Objects.equals(this.journeyCustomerIdType, analyticsSession.journeyCustomerIdType) &&
        Objects.equals(this.journeyCustomerSessionId, analyticsSession.journeyCustomerSessionId) &&
        Objects.equals(this.journeyCustomerSessionIdType, analyticsSession.journeyCustomerSessionIdType) &&
        Objects.equals(this.journeyActionId, analyticsSession.journeyActionId) &&
        Objects.equals(this.journeyActionMapId, analyticsSession.journeyActionMapId) &&
        Objects.equals(this.journeyActionMapVersion, analyticsSession.journeyActionMapVersion) &&
        Objects.equals(this.protocolCallId, analyticsSession.protocolCallId) &&
        Objects.equals(this.provider, analyticsSession.provider) &&
        Objects.equals(this.remote, analyticsSession.remote) &&
        Objects.equals(this.mediaCount, analyticsSession.mediaCount) &&
        Objects.equals(this.flowOutType, analyticsSession.flowOutType) &&
        Objects.equals(this.requestedRoutings, analyticsSession.requestedRoutings) &&
        Objects.equals(this.usedRouting, analyticsSession.usedRouting) &&
        Objects.equals(this.selectedAgentId, analyticsSession.selectedAgentId) &&
        Objects.equals(this.selectedAgentRank, analyticsSession.selectedAgentRank);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mediaType, sessionId, addressOther, addressSelf, addressFrom, addressTo, messageType, ani, direction, dnis, sessionDnis, outboundCampaignId, outboundContactId, outboundContactListId, dispositionAnalyzer, dispositionName, edgeId, remoteNameDisplayable, roomId, monitoredSessionId, monitoredParticipantId, callbackUserName, callbackNumbers, callbackScheduledTime, scriptId, peerId, skipEnabled, timeoutSeconds, cobrowseRole, cobrowseRoomId, mediaBridgeId, screenShareAddressSelf, sharingScreen, screenShareRoomId, videoRoomId, videoAddressSelf, segments, metrics, flow, mediaEndpointStats, recording, journeyCustomerId, journeyCustomerIdType, journeyCustomerSessionId, journeyCustomerSessionIdType, journeyActionId, journeyActionMapId, journeyActionMapVersion, protocolCallId, provider, remote, mediaCount, flowOutType, requestedRoutings, usedRouting, selectedAgentId, selectedAgentRank);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsSession {\n");
    
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    addressOther: ").append(toIndentedString(addressOther)).append("\n");
    sb.append("    addressSelf: ").append(toIndentedString(addressSelf)).append("\n");
    sb.append("    addressFrom: ").append(toIndentedString(addressFrom)).append("\n");
    sb.append("    addressTo: ").append(toIndentedString(addressTo)).append("\n");
    sb.append("    messageType: ").append(toIndentedString(messageType)).append("\n");
    sb.append("    ani: ").append(toIndentedString(ani)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    dnis: ").append(toIndentedString(dnis)).append("\n");
    sb.append("    sessionDnis: ").append(toIndentedString(sessionDnis)).append("\n");
    sb.append("    outboundCampaignId: ").append(toIndentedString(outboundCampaignId)).append("\n");
    sb.append("    outboundContactId: ").append(toIndentedString(outboundContactId)).append("\n");
    sb.append("    outboundContactListId: ").append(toIndentedString(outboundContactListId)).append("\n");
    sb.append("    dispositionAnalyzer: ").append(toIndentedString(dispositionAnalyzer)).append("\n");
    sb.append("    dispositionName: ").append(toIndentedString(dispositionName)).append("\n");
    sb.append("    edgeId: ").append(toIndentedString(edgeId)).append("\n");
    sb.append("    remoteNameDisplayable: ").append(toIndentedString(remoteNameDisplayable)).append("\n");
    sb.append("    roomId: ").append(toIndentedString(roomId)).append("\n");
    sb.append("    monitoredSessionId: ").append(toIndentedString(monitoredSessionId)).append("\n");
    sb.append("    monitoredParticipantId: ").append(toIndentedString(monitoredParticipantId)).append("\n");
    sb.append("    callbackUserName: ").append(toIndentedString(callbackUserName)).append("\n");
    sb.append("    callbackNumbers: ").append(toIndentedString(callbackNumbers)).append("\n");
    sb.append("    callbackScheduledTime: ").append(toIndentedString(callbackScheduledTime)).append("\n");
    sb.append("    scriptId: ").append(toIndentedString(scriptId)).append("\n");
    sb.append("    peerId: ").append(toIndentedString(peerId)).append("\n");
    sb.append("    skipEnabled: ").append(toIndentedString(skipEnabled)).append("\n");
    sb.append("    timeoutSeconds: ").append(toIndentedString(timeoutSeconds)).append("\n");
    sb.append("    cobrowseRole: ").append(toIndentedString(cobrowseRole)).append("\n");
    sb.append("    cobrowseRoomId: ").append(toIndentedString(cobrowseRoomId)).append("\n");
    sb.append("    mediaBridgeId: ").append(toIndentedString(mediaBridgeId)).append("\n");
    sb.append("    screenShareAddressSelf: ").append(toIndentedString(screenShareAddressSelf)).append("\n");
    sb.append("    sharingScreen: ").append(toIndentedString(sharingScreen)).append("\n");
    sb.append("    screenShareRoomId: ").append(toIndentedString(screenShareRoomId)).append("\n");
    sb.append("    videoRoomId: ").append(toIndentedString(videoRoomId)).append("\n");
    sb.append("    videoAddressSelf: ").append(toIndentedString(videoAddressSelf)).append("\n");
    sb.append("    segments: ").append(toIndentedString(segments)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    flow: ").append(toIndentedString(flow)).append("\n");
    sb.append("    mediaEndpointStats: ").append(toIndentedString(mediaEndpointStats)).append("\n");
    sb.append("    recording: ").append(toIndentedString(recording)).append("\n");
    sb.append("    journeyCustomerId: ").append(toIndentedString(journeyCustomerId)).append("\n");
    sb.append("    journeyCustomerIdType: ").append(toIndentedString(journeyCustomerIdType)).append("\n");
    sb.append("    journeyCustomerSessionId: ").append(toIndentedString(journeyCustomerSessionId)).append("\n");
    sb.append("    journeyCustomerSessionIdType: ").append(toIndentedString(journeyCustomerSessionIdType)).append("\n");
    sb.append("    journeyActionId: ").append(toIndentedString(journeyActionId)).append("\n");
    sb.append("    journeyActionMapId: ").append(toIndentedString(journeyActionMapId)).append("\n");
    sb.append("    journeyActionMapVersion: ").append(toIndentedString(journeyActionMapVersion)).append("\n");
    sb.append("    protocolCallId: ").append(toIndentedString(protocolCallId)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    remote: ").append(toIndentedString(remote)).append("\n");
    sb.append("    mediaCount: ").append(toIndentedString(mediaCount)).append("\n");
    sb.append("    flowOutType: ").append(toIndentedString(flowOutType)).append("\n");
    sb.append("    requestedRoutings: ").append(toIndentedString(requestedRoutings)).append("\n");
    sb.append("    usedRouting: ").append(toIndentedString(usedRouting)).append("\n");
    sb.append("    selectedAgentId: ").append(toIndentedString(selectedAgentId)).append("\n");
    sb.append("    selectedAgentRank: ").append(toIndentedString(selectedAgentRank)).append("\n");
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

