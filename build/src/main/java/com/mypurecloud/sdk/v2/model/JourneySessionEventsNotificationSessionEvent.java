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
import com.mypurecloud.sdk.v2.model.JourneySessionEventsNotificationApp;
import com.mypurecloud.sdk.v2.model.JourneySessionEventsNotificationBrowser;
import com.mypurecloud.sdk.v2.model.JourneySessionEventsNotificationConnectedQueue;
import com.mypurecloud.sdk.v2.model.JourneySessionEventsNotificationConversation;
import com.mypurecloud.sdk.v2.model.JourneySessionEventsNotificationConversationChannel;
import com.mypurecloud.sdk.v2.model.JourneySessionEventsNotificationConversationUserDisposition;
import com.mypurecloud.sdk.v2.model.JourneySessionEventsNotificationDevice;
import com.mypurecloud.sdk.v2.model.JourneySessionEventsNotificationExternalContact;
import com.mypurecloud.sdk.v2.model.JourneySessionEventsNotificationGeoLocation;
import com.mypurecloud.sdk.v2.model.JourneySessionEventsNotificationMktCampaign;
import com.mypurecloud.sdk.v2.model.JourneySessionEventsNotificationNetworkConnectivity;
import com.mypurecloud.sdk.v2.model.JourneySessionEventsNotificationOutcomeAchievement;
import com.mypurecloud.sdk.v2.model.JourneySessionEventsNotificationPage;
import com.mypurecloud.sdk.v2.model.JourneySessionEventsNotificationReferrer;
import com.mypurecloud.sdk.v2.model.JourneySessionEventsNotificationSdkLibrary;
import com.mypurecloud.sdk.v2.model.JourneySessionEventsNotificationSegmentAssignment;
import com.mypurecloud.sdk.v2.model.JourneySessionEventsNotificationSessionLastEvent;
import com.mypurecloud.sdk.v2.model.JourneySessionEventsNotificationUser;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * JourneySessionEventsNotificationSessionEvent
 */

public class JourneySessionEventsNotificationSessionEvent  implements Serializable {
  
  private String id = null;
  private String selfUri = null;
  private Date createdDate = null;
  private Date endedDate = null;
  private JourneySessionEventsNotificationExternalContact externalContact = null;
  private String customerId = null;
  private String customerIdType = null;
  private String type = null;
  private List<JourneySessionEventsNotificationOutcomeAchievement> outcomeAchievements = null;
  private List<JourneySessionEventsNotificationSegmentAssignment> segmentAssignments = null;
  private Date awayDate = null;
  private JourneySessionEventsNotificationBrowser browser = null;
  private JourneySessionEventsNotificationDevice device = null;
  private JourneySessionEventsNotificationGeoLocation geolocation = null;
  private Date idleDate = null;
  private String ipAddress = null;
  private String ipOrganization = null;
  private JourneySessionEventsNotificationPage lastPage = null;
  private JourneySessionEventsNotificationMktCampaign mktCampaign = null;
  private JourneySessionEventsNotificationReferrer referrer = null;
  private List<String> searchTerms = null;
  private String userAgentString = null;
  private Long durationInSeconds = null;
  private Long eventCount = null;
  private Long pageviewCount = null;
  private Long screenviewCount = null;
  private JourneySessionEventsNotificationSessionLastEvent lastEvent = null;
  private JourneySessionEventsNotificationConversation conversation = null;

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
   * Gets or Sets originatingDirection
   */
 @JsonDeserialize(using = OriginatingDirectionEnumDeserializer.class)
  public enum OriginatingDirectionEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("Unknown"),
    INBOUND("Inbound"),
    OUTBOUND("Outbound");

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
  private String conversationSubject = null;
  private JourneySessionEventsNotificationConversationUserDisposition lastUserDisposition = null;
  private JourneySessionEventsNotificationUser lastConnectedUser = null;
  private JourneySessionEventsNotificationConnectedQueue lastConnectedQueue = null;
  private List<JourneySessionEventsNotificationConversationChannel> conversationChannels = null;

  private static class LastUserDisconnectTypeEnumDeserializer extends StdDeserializer<LastUserDisconnectTypeEnum> {
    public LastUserDisconnectTypeEnumDeserializer() {
      super(LastUserDisconnectTypeEnumDeserializer.class);
    }

    @Override
    public LastUserDisconnectTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return LastUserDisconnectTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets lastUserDisconnectType
   */
 @JsonDeserialize(using = LastUserDisconnectTypeEnumDeserializer.class)
  public enum LastUserDisconnectTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("Unknown"),
    ENDPOINT("Endpoint"),
    CLIENT("Client"),
    SYSTEM("System"),
    TRANSFER("Transfer"),
    ERROR("Error"),
    PEER("Peer"),
    OTHER("Other"),
    SPAM("Spam"),
    TIMEOUT("Timeout"),
    TRANSPORTFAILURE("TransportFailure"),
    CONFERENCETRANSFER("ConferenceTransfer"),
    CONSULTTRANSFER("ConsultTransfer"),
    FORWARDTRANSFER("ForwardTransfer"),
    NOANSWERTRANSFER("NoAnswerTransfer"),
    NOTAVAILABLETRANSFER("NotAvailableTransfer"),
    UNCALLABLE("Uncallable"),
    DONOTDISTURBENDPOINT("DoNotDisturbEndpoint"),
    DONOTDISTURBTRANSFER("DoNotDisturbTransfer"),
    SESSIONEXPIRED("SessionExpired");

    private String value;

    LastUserDisconnectTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static LastUserDisconnectTypeEnum fromString(String key) {
      if (key == null) return null;

      for (LastUserDisconnectTypeEnum value : LastUserDisconnectTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return LastUserDisconnectTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private LastUserDisconnectTypeEnum lastUserDisconnectType = null;

  private static class LastAcdOutcomeEnumDeserializer extends StdDeserializer<LastAcdOutcomeEnum> {
    public LastAcdOutcomeEnumDeserializer() {
      super(LastAcdOutcomeEnumDeserializer.class);
    }

    @Override
    public LastAcdOutcomeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return LastAcdOutcomeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets lastAcdOutcome
   */
 @JsonDeserialize(using = LastAcdOutcomeEnumDeserializer.class)
  public enum LastAcdOutcomeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("Unknown"),
    ABANDON("Abandon"),
    ANSWERED("Answered"),
    FLOWOUT("FlowOut");

    private String value;

    LastAcdOutcomeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static LastAcdOutcomeEnum fromString(String key) {
      if (key == null) return null;

      for (LastAcdOutcomeEnum value : LastAcdOutcomeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return LastAcdOutcomeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private LastAcdOutcomeEnum lastAcdOutcome = null;
  private Boolean authenticated = null;
  private JourneySessionEventsNotificationApp app = null;
  private JourneySessionEventsNotificationSdkLibrary sdkLibrary = null;
  private JourneySessionEventsNotificationNetworkConnectivity networkConnectivity = null;
  private List<String> divisionIds = null;
  private String lastScreen = null;

  public JourneySessionEventsNotificationSessionEvent() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      outcomeAchievements = new ArrayList<JourneySessionEventsNotificationOutcomeAchievement>();
      segmentAssignments = new ArrayList<JourneySessionEventsNotificationSegmentAssignment>();
      searchTerms = new ArrayList<String>();
      conversationChannels = new ArrayList<JourneySessionEventsNotificationConversationChannel>();
      divisionIds = new ArrayList<String>();
    }
  }

  
  /**
   **/
  public JourneySessionEventsNotificationSessionEvent id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   **/
  public JourneySessionEventsNotificationSessionEvent selfUri(String selfUri) {
    this.selfUri = selfUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }
  public void setSelfUri(String selfUri) {
    this.selfUri = selfUri;
  }


  /**
   **/
  public JourneySessionEventsNotificationSessionEvent createdDate(Date createdDate) {
    this.createdDate = createdDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("createdDate")
  public Date getCreatedDate() {
    return createdDate;
  }
  public void setCreatedDate(Date createdDate) {
    this.createdDate = createdDate;
  }


  /**
   **/
  public JourneySessionEventsNotificationSessionEvent endedDate(Date endedDate) {
    this.endedDate = endedDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("endedDate")
  public Date getEndedDate() {
    return endedDate;
  }
  public void setEndedDate(Date endedDate) {
    this.endedDate = endedDate;
  }


  /**
   **/
  public JourneySessionEventsNotificationSessionEvent externalContact(JourneySessionEventsNotificationExternalContact externalContact) {
    this.externalContact = externalContact;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("externalContact")
  public JourneySessionEventsNotificationExternalContact getExternalContact() {
    return externalContact;
  }
  public void setExternalContact(JourneySessionEventsNotificationExternalContact externalContact) {
    this.externalContact = externalContact;
  }


  /**
   **/
  public JourneySessionEventsNotificationSessionEvent customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("customerId")
  public String getCustomerId() {
    return customerId;
  }
  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }


  /**
   **/
  public JourneySessionEventsNotificationSessionEvent customerIdType(String customerIdType) {
    this.customerIdType = customerIdType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("customerIdType")
  public String getCustomerIdType() {
    return customerIdType;
  }
  public void setCustomerIdType(String customerIdType) {
    this.customerIdType = customerIdType;
  }


  /**
   **/
  public JourneySessionEventsNotificationSessionEvent type(String type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }


  /**
   **/
  public JourneySessionEventsNotificationSessionEvent outcomeAchievements(List<JourneySessionEventsNotificationOutcomeAchievement> outcomeAchievements) {
    this.outcomeAchievements = outcomeAchievements;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("outcomeAchievements")
  public List<JourneySessionEventsNotificationOutcomeAchievement> getOutcomeAchievements() {
    return outcomeAchievements;
  }
  public void setOutcomeAchievements(List<JourneySessionEventsNotificationOutcomeAchievement> outcomeAchievements) {
    this.outcomeAchievements = outcomeAchievements;
  }


  /**
   **/
  public JourneySessionEventsNotificationSessionEvent segmentAssignments(List<JourneySessionEventsNotificationSegmentAssignment> segmentAssignments) {
    this.segmentAssignments = segmentAssignments;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("segmentAssignments")
  public List<JourneySessionEventsNotificationSegmentAssignment> getSegmentAssignments() {
    return segmentAssignments;
  }
  public void setSegmentAssignments(List<JourneySessionEventsNotificationSegmentAssignment> segmentAssignments) {
    this.segmentAssignments = segmentAssignments;
  }


  /**
   **/
  public JourneySessionEventsNotificationSessionEvent awayDate(Date awayDate) {
    this.awayDate = awayDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("awayDate")
  public Date getAwayDate() {
    return awayDate;
  }
  public void setAwayDate(Date awayDate) {
    this.awayDate = awayDate;
  }


  /**
   **/
  public JourneySessionEventsNotificationSessionEvent browser(JourneySessionEventsNotificationBrowser browser) {
    this.browser = browser;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("browser")
  public JourneySessionEventsNotificationBrowser getBrowser() {
    return browser;
  }
  public void setBrowser(JourneySessionEventsNotificationBrowser browser) {
    this.browser = browser;
  }


  /**
   **/
  public JourneySessionEventsNotificationSessionEvent device(JourneySessionEventsNotificationDevice device) {
    this.device = device;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("device")
  public JourneySessionEventsNotificationDevice getDevice() {
    return device;
  }
  public void setDevice(JourneySessionEventsNotificationDevice device) {
    this.device = device;
  }


  /**
   **/
  public JourneySessionEventsNotificationSessionEvent geolocation(JourneySessionEventsNotificationGeoLocation geolocation) {
    this.geolocation = geolocation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("geolocation")
  public JourneySessionEventsNotificationGeoLocation getGeolocation() {
    return geolocation;
  }
  public void setGeolocation(JourneySessionEventsNotificationGeoLocation geolocation) {
    this.geolocation = geolocation;
  }


  /**
   **/
  public JourneySessionEventsNotificationSessionEvent idleDate(Date idleDate) {
    this.idleDate = idleDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("idleDate")
  public Date getIdleDate() {
    return idleDate;
  }
  public void setIdleDate(Date idleDate) {
    this.idleDate = idleDate;
  }


  /**
   **/
  public JourneySessionEventsNotificationSessionEvent ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("ipAddress")
  public String getIpAddress() {
    return ipAddress;
  }
  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }


  /**
   **/
  public JourneySessionEventsNotificationSessionEvent ipOrganization(String ipOrganization) {
    this.ipOrganization = ipOrganization;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("ipOrganization")
  public String getIpOrganization() {
    return ipOrganization;
  }
  public void setIpOrganization(String ipOrganization) {
    this.ipOrganization = ipOrganization;
  }


  /**
   **/
  public JourneySessionEventsNotificationSessionEvent lastPage(JourneySessionEventsNotificationPage lastPage) {
    this.lastPage = lastPage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("lastPage")
  public JourneySessionEventsNotificationPage getLastPage() {
    return lastPage;
  }
  public void setLastPage(JourneySessionEventsNotificationPage lastPage) {
    this.lastPage = lastPage;
  }


  /**
   **/
  public JourneySessionEventsNotificationSessionEvent mktCampaign(JourneySessionEventsNotificationMktCampaign mktCampaign) {
    this.mktCampaign = mktCampaign;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("mktCampaign")
  public JourneySessionEventsNotificationMktCampaign getMktCampaign() {
    return mktCampaign;
  }
  public void setMktCampaign(JourneySessionEventsNotificationMktCampaign mktCampaign) {
    this.mktCampaign = mktCampaign;
  }


  /**
   **/
  public JourneySessionEventsNotificationSessionEvent referrer(JourneySessionEventsNotificationReferrer referrer) {
    this.referrer = referrer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("referrer")
  public JourneySessionEventsNotificationReferrer getReferrer() {
    return referrer;
  }
  public void setReferrer(JourneySessionEventsNotificationReferrer referrer) {
    this.referrer = referrer;
  }


  /**
   **/
  public JourneySessionEventsNotificationSessionEvent searchTerms(List<String> searchTerms) {
    this.searchTerms = searchTerms;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("searchTerms")
  public List<String> getSearchTerms() {
    return searchTerms;
  }
  public void setSearchTerms(List<String> searchTerms) {
    this.searchTerms = searchTerms;
  }


  /**
   **/
  public JourneySessionEventsNotificationSessionEvent userAgentString(String userAgentString) {
    this.userAgentString = userAgentString;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("userAgentString")
  public String getUserAgentString() {
    return userAgentString;
  }
  public void setUserAgentString(String userAgentString) {
    this.userAgentString = userAgentString;
  }


  /**
   **/
  public JourneySessionEventsNotificationSessionEvent durationInSeconds(Long durationInSeconds) {
    this.durationInSeconds = durationInSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("durationInSeconds")
  public Long getDurationInSeconds() {
    return durationInSeconds;
  }
  public void setDurationInSeconds(Long durationInSeconds) {
    this.durationInSeconds = durationInSeconds;
  }


  /**
   **/
  public JourneySessionEventsNotificationSessionEvent eventCount(Long eventCount) {
    this.eventCount = eventCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("eventCount")
  public Long getEventCount() {
    return eventCount;
  }
  public void setEventCount(Long eventCount) {
    this.eventCount = eventCount;
  }


  /**
   **/
  public JourneySessionEventsNotificationSessionEvent pageviewCount(Long pageviewCount) {
    this.pageviewCount = pageviewCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("pageviewCount")
  public Long getPageviewCount() {
    return pageviewCount;
  }
  public void setPageviewCount(Long pageviewCount) {
    this.pageviewCount = pageviewCount;
  }


  /**
   **/
  public JourneySessionEventsNotificationSessionEvent screenviewCount(Long screenviewCount) {
    this.screenviewCount = screenviewCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("screenviewCount")
  public Long getScreenviewCount() {
    return screenviewCount;
  }
  public void setScreenviewCount(Long screenviewCount) {
    this.screenviewCount = screenviewCount;
  }


  /**
   **/
  public JourneySessionEventsNotificationSessionEvent lastEvent(JourneySessionEventsNotificationSessionLastEvent lastEvent) {
    this.lastEvent = lastEvent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("lastEvent")
  public JourneySessionEventsNotificationSessionLastEvent getLastEvent() {
    return lastEvent;
  }
  public void setLastEvent(JourneySessionEventsNotificationSessionLastEvent lastEvent) {
    this.lastEvent = lastEvent;
  }


  /**
   **/
  public JourneySessionEventsNotificationSessionEvent conversation(JourneySessionEventsNotificationConversation conversation) {
    this.conversation = conversation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("conversation")
  public JourneySessionEventsNotificationConversation getConversation() {
    return conversation;
  }
  public void setConversation(JourneySessionEventsNotificationConversation conversation) {
    this.conversation = conversation;
  }


  /**
   **/
  public JourneySessionEventsNotificationSessionEvent originatingDirection(OriginatingDirectionEnum originatingDirection) {
    this.originatingDirection = originatingDirection;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("originatingDirection")
  public OriginatingDirectionEnum getOriginatingDirection() {
    return originatingDirection;
  }
  public void setOriginatingDirection(OriginatingDirectionEnum originatingDirection) {
    this.originatingDirection = originatingDirection;
  }


  /**
   **/
  public JourneySessionEventsNotificationSessionEvent conversationSubject(String conversationSubject) {
    this.conversationSubject = conversationSubject;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("conversationSubject")
  public String getConversationSubject() {
    return conversationSubject;
  }
  public void setConversationSubject(String conversationSubject) {
    this.conversationSubject = conversationSubject;
  }


  /**
   **/
  public JourneySessionEventsNotificationSessionEvent lastUserDisposition(JourneySessionEventsNotificationConversationUserDisposition lastUserDisposition) {
    this.lastUserDisposition = lastUserDisposition;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("lastUserDisposition")
  public JourneySessionEventsNotificationConversationUserDisposition getLastUserDisposition() {
    return lastUserDisposition;
  }
  public void setLastUserDisposition(JourneySessionEventsNotificationConversationUserDisposition lastUserDisposition) {
    this.lastUserDisposition = lastUserDisposition;
  }


  /**
   **/
  public JourneySessionEventsNotificationSessionEvent lastConnectedUser(JourneySessionEventsNotificationUser lastConnectedUser) {
    this.lastConnectedUser = lastConnectedUser;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("lastConnectedUser")
  public JourneySessionEventsNotificationUser getLastConnectedUser() {
    return lastConnectedUser;
  }
  public void setLastConnectedUser(JourneySessionEventsNotificationUser lastConnectedUser) {
    this.lastConnectedUser = lastConnectedUser;
  }


  /**
   **/
  public JourneySessionEventsNotificationSessionEvent lastConnectedQueue(JourneySessionEventsNotificationConnectedQueue lastConnectedQueue) {
    this.lastConnectedQueue = lastConnectedQueue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("lastConnectedQueue")
  public JourneySessionEventsNotificationConnectedQueue getLastConnectedQueue() {
    return lastConnectedQueue;
  }
  public void setLastConnectedQueue(JourneySessionEventsNotificationConnectedQueue lastConnectedQueue) {
    this.lastConnectedQueue = lastConnectedQueue;
  }


  /**
   **/
  public JourneySessionEventsNotificationSessionEvent conversationChannels(List<JourneySessionEventsNotificationConversationChannel> conversationChannels) {
    this.conversationChannels = conversationChannels;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("conversationChannels")
  public List<JourneySessionEventsNotificationConversationChannel> getConversationChannels() {
    return conversationChannels;
  }
  public void setConversationChannels(List<JourneySessionEventsNotificationConversationChannel> conversationChannels) {
    this.conversationChannels = conversationChannels;
  }


  /**
   **/
  public JourneySessionEventsNotificationSessionEvent lastUserDisconnectType(LastUserDisconnectTypeEnum lastUserDisconnectType) {
    this.lastUserDisconnectType = lastUserDisconnectType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("lastUserDisconnectType")
  public LastUserDisconnectTypeEnum getLastUserDisconnectType() {
    return lastUserDisconnectType;
  }
  public void setLastUserDisconnectType(LastUserDisconnectTypeEnum lastUserDisconnectType) {
    this.lastUserDisconnectType = lastUserDisconnectType;
  }


  /**
   **/
  public JourneySessionEventsNotificationSessionEvent lastAcdOutcome(LastAcdOutcomeEnum lastAcdOutcome) {
    this.lastAcdOutcome = lastAcdOutcome;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("lastAcdOutcome")
  public LastAcdOutcomeEnum getLastAcdOutcome() {
    return lastAcdOutcome;
  }
  public void setLastAcdOutcome(LastAcdOutcomeEnum lastAcdOutcome) {
    this.lastAcdOutcome = lastAcdOutcome;
  }


  /**
   **/
  public JourneySessionEventsNotificationSessionEvent authenticated(Boolean authenticated) {
    this.authenticated = authenticated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("authenticated")
  public Boolean getAuthenticated() {
    return authenticated;
  }
  public void setAuthenticated(Boolean authenticated) {
    this.authenticated = authenticated;
  }


  /**
   **/
  public JourneySessionEventsNotificationSessionEvent app(JourneySessionEventsNotificationApp app) {
    this.app = app;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("app")
  public JourneySessionEventsNotificationApp getApp() {
    return app;
  }
  public void setApp(JourneySessionEventsNotificationApp app) {
    this.app = app;
  }


  /**
   **/
  public JourneySessionEventsNotificationSessionEvent sdkLibrary(JourneySessionEventsNotificationSdkLibrary sdkLibrary) {
    this.sdkLibrary = sdkLibrary;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sdkLibrary")
  public JourneySessionEventsNotificationSdkLibrary getSdkLibrary() {
    return sdkLibrary;
  }
  public void setSdkLibrary(JourneySessionEventsNotificationSdkLibrary sdkLibrary) {
    this.sdkLibrary = sdkLibrary;
  }


  /**
   **/
  public JourneySessionEventsNotificationSessionEvent networkConnectivity(JourneySessionEventsNotificationNetworkConnectivity networkConnectivity) {
    this.networkConnectivity = networkConnectivity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("networkConnectivity")
  public JourneySessionEventsNotificationNetworkConnectivity getNetworkConnectivity() {
    return networkConnectivity;
  }
  public void setNetworkConnectivity(JourneySessionEventsNotificationNetworkConnectivity networkConnectivity) {
    this.networkConnectivity = networkConnectivity;
  }


  /**
   **/
  public JourneySessionEventsNotificationSessionEvent divisionIds(List<String> divisionIds) {
    this.divisionIds = divisionIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("divisionIds")
  public List<String> getDivisionIds() {
    return divisionIds;
  }
  public void setDivisionIds(List<String> divisionIds) {
    this.divisionIds = divisionIds;
  }


  /**
   **/
  public JourneySessionEventsNotificationSessionEvent lastScreen(String lastScreen) {
    this.lastScreen = lastScreen;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("lastScreen")
  public String getLastScreen() {
    return lastScreen;
  }
  public void setLastScreen(String lastScreen) {
    this.lastScreen = lastScreen;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JourneySessionEventsNotificationSessionEvent journeySessionEventsNotificationSessionEvent = (JourneySessionEventsNotificationSessionEvent) o;

    return Objects.equals(this.id, journeySessionEventsNotificationSessionEvent.id) &&
            Objects.equals(this.selfUri, journeySessionEventsNotificationSessionEvent.selfUri) &&
            Objects.equals(this.createdDate, journeySessionEventsNotificationSessionEvent.createdDate) &&
            Objects.equals(this.endedDate, journeySessionEventsNotificationSessionEvent.endedDate) &&
            Objects.equals(this.externalContact, journeySessionEventsNotificationSessionEvent.externalContact) &&
            Objects.equals(this.customerId, journeySessionEventsNotificationSessionEvent.customerId) &&
            Objects.equals(this.customerIdType, journeySessionEventsNotificationSessionEvent.customerIdType) &&
            Objects.equals(this.type, journeySessionEventsNotificationSessionEvent.type) &&
            Objects.equals(this.outcomeAchievements, journeySessionEventsNotificationSessionEvent.outcomeAchievements) &&
            Objects.equals(this.segmentAssignments, journeySessionEventsNotificationSessionEvent.segmentAssignments) &&
            Objects.equals(this.awayDate, journeySessionEventsNotificationSessionEvent.awayDate) &&
            Objects.equals(this.browser, journeySessionEventsNotificationSessionEvent.browser) &&
            Objects.equals(this.device, journeySessionEventsNotificationSessionEvent.device) &&
            Objects.equals(this.geolocation, journeySessionEventsNotificationSessionEvent.geolocation) &&
            Objects.equals(this.idleDate, journeySessionEventsNotificationSessionEvent.idleDate) &&
            Objects.equals(this.ipAddress, journeySessionEventsNotificationSessionEvent.ipAddress) &&
            Objects.equals(this.ipOrganization, journeySessionEventsNotificationSessionEvent.ipOrganization) &&
            Objects.equals(this.lastPage, journeySessionEventsNotificationSessionEvent.lastPage) &&
            Objects.equals(this.mktCampaign, journeySessionEventsNotificationSessionEvent.mktCampaign) &&
            Objects.equals(this.referrer, journeySessionEventsNotificationSessionEvent.referrer) &&
            Objects.equals(this.searchTerms, journeySessionEventsNotificationSessionEvent.searchTerms) &&
            Objects.equals(this.userAgentString, journeySessionEventsNotificationSessionEvent.userAgentString) &&
            Objects.equals(this.durationInSeconds, journeySessionEventsNotificationSessionEvent.durationInSeconds) &&
            Objects.equals(this.eventCount, journeySessionEventsNotificationSessionEvent.eventCount) &&
            Objects.equals(this.pageviewCount, journeySessionEventsNotificationSessionEvent.pageviewCount) &&
            Objects.equals(this.screenviewCount, journeySessionEventsNotificationSessionEvent.screenviewCount) &&
            Objects.equals(this.lastEvent, journeySessionEventsNotificationSessionEvent.lastEvent) &&
            Objects.equals(this.conversation, journeySessionEventsNotificationSessionEvent.conversation) &&
            Objects.equals(this.originatingDirection, journeySessionEventsNotificationSessionEvent.originatingDirection) &&
            Objects.equals(this.conversationSubject, journeySessionEventsNotificationSessionEvent.conversationSubject) &&
            Objects.equals(this.lastUserDisposition, journeySessionEventsNotificationSessionEvent.lastUserDisposition) &&
            Objects.equals(this.lastConnectedUser, journeySessionEventsNotificationSessionEvent.lastConnectedUser) &&
            Objects.equals(this.lastConnectedQueue, journeySessionEventsNotificationSessionEvent.lastConnectedQueue) &&
            Objects.equals(this.conversationChannels, journeySessionEventsNotificationSessionEvent.conversationChannels) &&
            Objects.equals(this.lastUserDisconnectType, journeySessionEventsNotificationSessionEvent.lastUserDisconnectType) &&
            Objects.equals(this.lastAcdOutcome, journeySessionEventsNotificationSessionEvent.lastAcdOutcome) &&
            Objects.equals(this.authenticated, journeySessionEventsNotificationSessionEvent.authenticated) &&
            Objects.equals(this.app, journeySessionEventsNotificationSessionEvent.app) &&
            Objects.equals(this.sdkLibrary, journeySessionEventsNotificationSessionEvent.sdkLibrary) &&
            Objects.equals(this.networkConnectivity, journeySessionEventsNotificationSessionEvent.networkConnectivity) &&
            Objects.equals(this.divisionIds, journeySessionEventsNotificationSessionEvent.divisionIds) &&
            Objects.equals(this.lastScreen, journeySessionEventsNotificationSessionEvent.lastScreen);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, selfUri, createdDate, endedDate, externalContact, customerId, customerIdType, type, outcomeAchievements, segmentAssignments, awayDate, browser, device, geolocation, idleDate, ipAddress, ipOrganization, lastPage, mktCampaign, referrer, searchTerms, userAgentString, durationInSeconds, eventCount, pageviewCount, screenviewCount, lastEvent, conversation, originatingDirection, conversationSubject, lastUserDisposition, lastConnectedUser, lastConnectedQueue, conversationChannels, lastUserDisconnectType, lastAcdOutcome, authenticated, app, sdkLibrary, networkConnectivity, divisionIds, lastScreen);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneySessionEventsNotificationSessionEvent {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    endedDate: ").append(toIndentedString(endedDate)).append("\n");
    sb.append("    externalContact: ").append(toIndentedString(externalContact)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    customerIdType: ").append(toIndentedString(customerIdType)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    outcomeAchievements: ").append(toIndentedString(outcomeAchievements)).append("\n");
    sb.append("    segmentAssignments: ").append(toIndentedString(segmentAssignments)).append("\n");
    sb.append("    awayDate: ").append(toIndentedString(awayDate)).append("\n");
    sb.append("    browser: ").append(toIndentedString(browser)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    geolocation: ").append(toIndentedString(geolocation)).append("\n");
    sb.append("    idleDate: ").append(toIndentedString(idleDate)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    ipOrganization: ").append(toIndentedString(ipOrganization)).append("\n");
    sb.append("    lastPage: ").append(toIndentedString(lastPage)).append("\n");
    sb.append("    mktCampaign: ").append(toIndentedString(mktCampaign)).append("\n");
    sb.append("    referrer: ").append(toIndentedString(referrer)).append("\n");
    sb.append("    searchTerms: ").append(toIndentedString(searchTerms)).append("\n");
    sb.append("    userAgentString: ").append(toIndentedString(userAgentString)).append("\n");
    sb.append("    durationInSeconds: ").append(toIndentedString(durationInSeconds)).append("\n");
    sb.append("    eventCount: ").append(toIndentedString(eventCount)).append("\n");
    sb.append("    pageviewCount: ").append(toIndentedString(pageviewCount)).append("\n");
    sb.append("    screenviewCount: ").append(toIndentedString(screenviewCount)).append("\n");
    sb.append("    lastEvent: ").append(toIndentedString(lastEvent)).append("\n");
    sb.append("    conversation: ").append(toIndentedString(conversation)).append("\n");
    sb.append("    originatingDirection: ").append(toIndentedString(originatingDirection)).append("\n");
    sb.append("    conversationSubject: ").append(toIndentedString(conversationSubject)).append("\n");
    sb.append("    lastUserDisposition: ").append(toIndentedString(lastUserDisposition)).append("\n");
    sb.append("    lastConnectedUser: ").append(toIndentedString(lastConnectedUser)).append("\n");
    sb.append("    lastConnectedQueue: ").append(toIndentedString(lastConnectedQueue)).append("\n");
    sb.append("    conversationChannels: ").append(toIndentedString(conversationChannels)).append("\n");
    sb.append("    lastUserDisconnectType: ").append(toIndentedString(lastUserDisconnectType)).append("\n");
    sb.append("    lastAcdOutcome: ").append(toIndentedString(lastAcdOutcome)).append("\n");
    sb.append("    authenticated: ").append(toIndentedString(authenticated)).append("\n");
    sb.append("    app: ").append(toIndentedString(app)).append("\n");
    sb.append("    sdkLibrary: ").append(toIndentedString(sdkLibrary)).append("\n");
    sb.append("    networkConnectivity: ").append(toIndentedString(networkConnectivity)).append("\n");
    sb.append("    divisionIds: ").append(toIndentedString(divisionIds)).append("\n");
    sb.append("    lastScreen: ").append(toIndentedString(lastScreen)).append("\n");
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

