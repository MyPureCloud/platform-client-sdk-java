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
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import com.mypurecloud.sdk.v2.model.Browser;
import com.mypurecloud.sdk.v2.model.ConnectedQueue;
import com.mypurecloud.sdk.v2.model.ConnectedUser;
import com.mypurecloud.sdk.v2.model.ConversationChannel;
import com.mypurecloud.sdk.v2.model.ConversationUserDisposition;
import com.mypurecloud.sdk.v2.model.CustomEventAttribute;
import com.mypurecloud.sdk.v2.model.CustomEventAttributeList;
import com.mypurecloud.sdk.v2.model.Device;
import com.mypurecloud.sdk.v2.model.JourneyCampaign;
import com.mypurecloud.sdk.v2.model.JourneyGeolocation;
import com.mypurecloud.sdk.v2.model.JourneyPage;
import com.mypurecloud.sdk.v2.model.OutcomeAchievement;
import com.mypurecloud.sdk.v2.model.Referrer;
import com.mypurecloud.sdk.v2.model.SessionLastEvent;
import com.mypurecloud.sdk.v2.model.SessionSegmentAssignment;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * Session
 */

public class Session  implements Serializable {
  
  private String id = null;
  private String customerId = null;
  private String customerIdType = null;
  private String type = null;
  private String externalId = null;
  private String externalUrl = null;
  private String shortId = null;
  private List<OutcomeAchievement> outcomeAchievements = new ArrayList<OutcomeAchievement>();
  private List<SessionSegmentAssignment> segmentAssignments = new ArrayList<SessionSegmentAssignment>();
  private Map<String, CustomEventAttribute> attributes = null;
  private Map<String, CustomEventAttributeList> attributeLists = null;
  private Browser browser = null;
  private Device device = null;
  private JourneyGeolocation geolocation = null;
  private String ipAddress = null;
  private String ipOrganization = null;
  private JourneyPage lastPage = null;
  private JourneyCampaign mktCampaign = null;
  private Referrer referrer = null;
  private List<String> searchTerms = new ArrayList<String>();
  private String userAgentString = null;
  private Integer durationInSeconds = null;
  private Integer eventCount = null;
  private Integer pageviewCount = null;
  private Integer screenviewCount = null;
  private SessionLastEvent lastEvent = null;
  private ConnectedQueue lastConnectedQueue = null;
  private ConnectedUser lastConnectedUser = null;
  private ConversationUserDisposition lastUserDisposition = null;
  private List<ConversationChannel> conversationChannels = new ArrayList<ConversationChannel>();

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
   * The original direction of the conversation.
   */
 @JsonDeserialize(using = OriginatingDirectionEnumDeserializer.class)
  public enum OriginatingDirectionEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
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
  private Boolean authenticated = null;
  private String selfUri = null;
  private Date createdDate = null;
  private Date endedDate = null;
  private AddressableEntityRef externalContact = null;
  private Date awayDate = null;
  private Date idleDate = null;
  private AddressableEntityRef conversation = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   * Primary identifier of the customer in the source where the events for the session originate from.
   **/
  public Session customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Primary identifier of the customer in the source where the events for the session originate from.")
  @JsonProperty("customerId")
  public String getCustomerId() {
    return customerId;
  }
  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  
  /**
   * Type of source customer identifier (e.g. cookie, email, phone).
   **/
  public Session customerIdType(String customerIdType) {
    this.customerIdType = customerIdType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Type of source customer identifier (e.g. cookie, email, phone).")
  @JsonProperty("customerIdType")
  public String getCustomerIdType() {
    return customerIdType;
  }
  public void setCustomerIdType(String customerIdType) {
    this.customerIdType = customerIdType;
  }

  
  /**
   * Session types indicate the type or category of sessions (e.g. web, ticket, delivery, atm).
   **/
  public Session type(String type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Session types indicate the type or category of sessions (e.g. web, ticket, delivery, atm).")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  
  /**
   * Unique identifier in the external system where the events for the session originate from.
   **/
  public Session externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique identifier in the external system where the events for the session originate from.")
  @JsonProperty("externalId")
  public String getExternalId() {
    return externalId;
  }
  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  
  /**
   * A URL that identifies an external system-of-record resource that may have more detailed information on the session.
   **/
  public Session externalUrl(String externalUrl) {
    this.externalUrl = externalUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A URL that identifies an external system-of-record resource that may have more detailed information on the session.")
  @JsonProperty("externalUrl")
  public String getExternalUrl() {
    return externalUrl;
  }
  public void setExternalUrl(String externalUrl) {
    this.externalUrl = externalUrl;
  }

  
  /**
   * Shortened numeric identifier of 4-6 digits.
   **/
  public Session shortId(String shortId) {
    this.shortId = shortId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Shortened numeric identifier of 4-6 digits.")
  @JsonProperty("shortId")
  public String getShortId() {
    return shortId;
  }
  public void setShortId(String shortId) {
    this.shortId = shortId;
  }

  
  /**
   * List of the outcome achievements by the customer in this session.
   **/
  public Session outcomeAchievements(List<OutcomeAchievement> outcomeAchievements) {
    this.outcomeAchievements = outcomeAchievements;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of the outcome achievements by the customer in this session.")
  @JsonProperty("outcomeAchievements")
  public List<OutcomeAchievement> getOutcomeAchievements() {
    return outcomeAchievements;
  }
  public void setOutcomeAchievements(List<OutcomeAchievement> outcomeAchievements) {
    this.outcomeAchievements = outcomeAchievements;
  }

  
  /**
   * List of the segment assignments to the customer in this session.
   **/
  public Session segmentAssignments(List<SessionSegmentAssignment> segmentAssignments) {
    this.segmentAssignments = segmentAssignments;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of the segment assignments to the customer in this session.")
  @JsonProperty("segmentAssignments")
  public List<SessionSegmentAssignment> getSegmentAssignments() {
    return segmentAssignments;
  }
  public void setSegmentAssignments(List<SessionSegmentAssignment> segmentAssignments) {
    this.segmentAssignments = segmentAssignments;
  }

  
  /**
   * Attributes projected from the session's event stream.
   **/
  public Session attributes(Map<String, CustomEventAttribute> attributes) {
    this.attributes = attributes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Attributes projected from the session's event stream.")
  @JsonProperty("attributes")
  public Map<String, CustomEventAttribute> getAttributes() {
    return attributes;
  }
  public void setAttributes(Map<String, CustomEventAttribute> attributes) {
    this.attributes = attributes;
  }

  
  /**
   * List-type attributes projected from the session's event stream.
   **/
  public Session attributeLists(Map<String, CustomEventAttributeList> attributeLists) {
    this.attributeLists = attributeLists;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List-type attributes projected from the session's event stream.")
  @JsonProperty("attributeLists")
  public Map<String, CustomEventAttributeList> getAttributeLists() {
    return attributeLists;
  }
  public void setAttributeLists(Map<String, CustomEventAttributeList> attributeLists) {
    this.attributeLists = attributeLists;
  }

  
  /**
   * Customer's browser.
   **/
  public Session browser(Browser browser) {
    this.browser = browser;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Customer's browser.")
  @JsonProperty("browser")
  public Browser getBrowser() {
    return browser;
  }
  public void setBrowser(Browser browser) {
    this.browser = browser;
  }

  
  /**
   * Customer's device.
   **/
  public Session device(Device device) {
    this.device = device;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Customer's device.")
  @JsonProperty("device")
  public Device getDevice() {
    return device;
  }
  public void setDevice(Device device) {
    this.device = device;
  }

  
  /**
   * Customer's geolocation.
   **/
  public Session geolocation(JourneyGeolocation geolocation) {
    this.geolocation = geolocation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Customer's geolocation.")
  @JsonProperty("geolocation")
  public JourneyGeolocation getGeolocation() {
    return geolocation;
  }
  public void setGeolocation(JourneyGeolocation geolocation) {
    this.geolocation = geolocation;
  }

  
  /**
   * Customer's IP address.
   **/
  public Session ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Customer's IP address.")
  @JsonProperty("ipAddress")
  public String getIpAddress() {
    return ipAddress;
  }
  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }

  
  /**
   * Customer's IP-based organization or ISP name.
   **/
  public Session ipOrganization(String ipOrganization) {
    this.ipOrganization = ipOrganization;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Customer's IP-based organization or ISP name.")
  @JsonProperty("ipOrganization")
  public String getIpOrganization() {
    return ipOrganization;
  }
  public void setIpOrganization(String ipOrganization) {
    this.ipOrganization = ipOrganization;
  }

  
  /**
   * The webpage where the customer's last web interaction occurred.
   **/
  public Session lastPage(JourneyPage lastPage) {
    this.lastPage = lastPage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The webpage where the customer's last web interaction occurred.")
  @JsonProperty("lastPage")
  public JourneyPage getLastPage() {
    return lastPage;
  }
  public void setLastPage(JourneyPage lastPage) {
    this.lastPage = lastPage;
  }

  
  /**
   * Marketing / traffic source information.
   **/
  public Session mktCampaign(JourneyCampaign mktCampaign) {
    this.mktCampaign = mktCampaign;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Marketing / traffic source information.")
  @JsonProperty("mktCampaign")
  public JourneyCampaign getMktCampaign() {
    return mktCampaign;
  }
  public void setMktCampaign(JourneyCampaign mktCampaign) {
    this.mktCampaign = mktCampaign;
  }

  
  /**
   * Identifies the page URL that originally generated the request for the current page being viewed.
   **/
  public Session referrer(Referrer referrer) {
    this.referrer = referrer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identifies the page URL that originally generated the request for the current page being viewed.")
  @JsonProperty("referrer")
  public Referrer getReferrer() {
    return referrer;
  }
  public void setReferrer(Referrer referrer) {
    this.referrer = referrer;
  }

  
  /**
   * Search terms associated with the session.
   **/
  public Session searchTerms(List<String> searchTerms) {
    this.searchTerms = searchTerms;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Search terms associated with the session.")
  @JsonProperty("searchTerms")
  public List<String> getSearchTerms() {
    return searchTerms;
  }
  public void setSearchTerms(List<String> searchTerms) {
    this.searchTerms = searchTerms;
  }

  
  /**
   * String identifying the user agent.
   **/
  public Session userAgentString(String userAgentString) {
    this.userAgentString = userAgentString;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "String identifying the user agent.")
  @JsonProperty("userAgentString")
  public String getUserAgentString() {
    return userAgentString;
  }
  public void setUserAgentString(String userAgentString) {
    this.userAgentString = userAgentString;
  }

  
  /**
   * Indicates how long the session has been active (valid for an individual device).
   **/
  public Session durationInSeconds(Integer durationInSeconds) {
    this.durationInSeconds = durationInSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates how long the session has been active (valid for an individual device).")
  @JsonProperty("durationInSeconds")
  public Integer getDurationInSeconds() {
    return durationInSeconds;
  }
  public void setDurationInSeconds(Integer durationInSeconds) {
    this.durationInSeconds = durationInSeconds;
  }

  
  /**
   * The count of all events performed during the session.
   **/
  public Session eventCount(Integer eventCount) {
    this.eventCount = eventCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The count of all events performed during the session.")
  @JsonProperty("eventCount")
  public Integer getEventCount() {
    return eventCount;
  }
  public void setEventCount(Integer eventCount) {
    this.eventCount = eventCount;
  }

  
  /**
   * The count of all pageviews performed during the session.
   **/
  public Session pageviewCount(Integer pageviewCount) {
    this.pageviewCount = pageviewCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The count of all pageviews performed during the session.")
  @JsonProperty("pageviewCount")
  public Integer getPageviewCount() {
    return pageviewCount;
  }
  public void setPageviewCount(Integer pageviewCount) {
    this.pageviewCount = pageviewCount;
  }

  
  /**
   * The count of all screenviews performed during the session.
   **/
  public Session screenviewCount(Integer screenviewCount) {
    this.screenviewCount = screenviewCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The count of all screenviews performed during the session.")
  @JsonProperty("screenviewCount")
  public Integer getScreenviewCount() {
    return screenviewCount;
  }
  public void setScreenviewCount(Integer screenviewCount) {
    this.screenviewCount = screenviewCount;
  }

  
  /**
   * Information about the most recent event in this session.
   **/
  public Session lastEvent(SessionLastEvent lastEvent) {
    this.lastEvent = lastEvent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Information about the most recent event in this session.")
  @JsonProperty("lastEvent")
  public SessionLastEvent getLastEvent() {
    return lastEvent;
  }
  public void setLastEvent(SessionLastEvent lastEvent) {
    this.lastEvent = lastEvent;
  }

  
  /**
   * The last queue connected to this session.
   **/
  public Session lastConnectedQueue(ConnectedQueue lastConnectedQueue) {
    this.lastConnectedQueue = lastConnectedQueue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The last queue connected to this session.")
  @JsonProperty("lastConnectedQueue")
  public ConnectedQueue getLastConnectedQueue() {
    return lastConnectedQueue;
  }
  public void setLastConnectedQueue(ConnectedQueue lastConnectedQueue) {
    this.lastConnectedQueue = lastConnectedQueue;
  }

  
  /**
   * The last user connected to this session.
   **/
  public Session lastConnectedUser(ConnectedUser lastConnectedUser) {
    this.lastConnectedUser = lastConnectedUser;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The last user connected to this session.")
  @JsonProperty("lastConnectedUser")
  public ConnectedUser getLastConnectedUser() {
    return lastConnectedUser;
  }
  public void setLastConnectedUser(ConnectedUser lastConnectedUser) {
    this.lastConnectedUser = lastConnectedUser;
  }

  
  /**
   * The last user disposition connected to this session.
   **/
  public Session lastUserDisposition(ConversationUserDisposition lastUserDisposition) {
    this.lastUserDisposition = lastUserDisposition;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The last user disposition connected to this session.")
  @JsonProperty("lastUserDisposition")
  public ConversationUserDisposition getLastUserDisposition() {
    return lastUserDisposition;
  }
  public void setLastUserDisposition(ConversationUserDisposition lastUserDisposition) {
    this.lastUserDisposition = lastUserDisposition;
  }

  
  /**
   * Represents the channels used for this conversation.
   **/
  public Session conversationChannels(List<ConversationChannel> conversationChannels) {
    this.conversationChannels = conversationChannels;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Represents the channels used for this conversation.")
  @JsonProperty("conversationChannels")
  public List<ConversationChannel> getConversationChannels() {
    return conversationChannels;
  }
  public void setConversationChannels(List<ConversationChannel> conversationChannels) {
    this.conversationChannels = conversationChannels;
  }

  
  /**
   * The original direction of the conversation.
   **/
  public Session originatingDirection(OriginatingDirectionEnum originatingDirection) {
    this.originatingDirection = originatingDirection;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The original direction of the conversation.")
  @JsonProperty("originatingDirection")
  public OriginatingDirectionEnum getOriginatingDirection() {
    return originatingDirection;
  }
  public void setOriginatingDirection(OriginatingDirectionEnum originatingDirection) {
    this.originatingDirection = originatingDirection;
  }

  
  /**
   * The subject for the conversation, for example an email subject.
   **/
  public Session conversationSubject(String conversationSubject) {
    this.conversationSubject = conversationSubject;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The subject for the conversation, for example an email subject.")
  @JsonProperty("conversationSubject")
  public String getConversationSubject() {
    return conversationSubject;
  }
  public void setConversationSubject(String conversationSubject) {
    this.conversationSubject = conversationSubject;
  }

  
  /**
   * Indicates whether or not the session is authenticated.
   **/
  public Session authenticated(Boolean authenticated) {
    this.authenticated = authenticated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates whether or not the session is authenticated.")
  @JsonProperty("authenticated")
  public Boolean getAuthenticated() {
    return authenticated;
  }
  public void setAuthenticated(Boolean authenticated) {
    this.authenticated = authenticated;
  }

  
  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }

  
  /**
   * Timestamp indicating when the session was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public Session createdDate(Date createdDate) {
    this.createdDate = createdDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Timestamp indicating when the session was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("createdDate")
  public Date getCreatedDate() {
    return createdDate;
  }
  public void setCreatedDate(Date createdDate) {
    this.createdDate = createdDate;
  }

  
  /**
   * Timestamp indicating when the session was ended. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public Session endedDate(Date endedDate) {
    this.endedDate = endedDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Timestamp indicating when the session was ended. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("endedDate")
  public Date getEndedDate() {
    return endedDate;
  }
  public void setEndedDate(Date endedDate) {
    this.endedDate = endedDate;
  }

  
  @ApiModelProperty(example = "null", value = "The external contact associated with this session.")
  @JsonProperty("externalContact")
  public AddressableEntityRef getExternalContact() {
    return externalContact;
  }

  
  /**
   * Timestamp indicating when the visitor should be considered as away. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public Session awayDate(Date awayDate) {
    this.awayDate = awayDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Timestamp indicating when the visitor should be considered as away. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("awayDate")
  public Date getAwayDate() {
    return awayDate;
  }
  public void setAwayDate(Date awayDate) {
    this.awayDate = awayDate;
  }

  
  /**
   * Timestamp indicating when the visitor should be considered as idle. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public Session idleDate(Date idleDate) {
    this.idleDate = idleDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Timestamp indicating when the visitor should be considered as idle. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("idleDate")
  public Date getIdleDate() {
    return idleDate;
  }
  public void setIdleDate(Date idleDate) {
    this.idleDate = idleDate;
  }

  
  @ApiModelProperty(example = "null", value = "The conversation for this session.")
  @JsonProperty("conversation")
  public AddressableEntityRef getConversation() {
    return conversation;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Session session = (Session) o;
    return Objects.equals(this.id, session.id) &&
        Objects.equals(this.customerId, session.customerId) &&
        Objects.equals(this.customerIdType, session.customerIdType) &&
        Objects.equals(this.type, session.type) &&
        Objects.equals(this.externalId, session.externalId) &&
        Objects.equals(this.externalUrl, session.externalUrl) &&
        Objects.equals(this.shortId, session.shortId) &&
        Objects.equals(this.outcomeAchievements, session.outcomeAchievements) &&
        Objects.equals(this.segmentAssignments, session.segmentAssignments) &&
        Objects.equals(this.attributes, session.attributes) &&
        Objects.equals(this.attributeLists, session.attributeLists) &&
        Objects.equals(this.browser, session.browser) &&
        Objects.equals(this.device, session.device) &&
        Objects.equals(this.geolocation, session.geolocation) &&
        Objects.equals(this.ipAddress, session.ipAddress) &&
        Objects.equals(this.ipOrganization, session.ipOrganization) &&
        Objects.equals(this.lastPage, session.lastPage) &&
        Objects.equals(this.mktCampaign, session.mktCampaign) &&
        Objects.equals(this.referrer, session.referrer) &&
        Objects.equals(this.searchTerms, session.searchTerms) &&
        Objects.equals(this.userAgentString, session.userAgentString) &&
        Objects.equals(this.durationInSeconds, session.durationInSeconds) &&
        Objects.equals(this.eventCount, session.eventCount) &&
        Objects.equals(this.pageviewCount, session.pageviewCount) &&
        Objects.equals(this.screenviewCount, session.screenviewCount) &&
        Objects.equals(this.lastEvent, session.lastEvent) &&
        Objects.equals(this.lastConnectedQueue, session.lastConnectedQueue) &&
        Objects.equals(this.lastConnectedUser, session.lastConnectedUser) &&
        Objects.equals(this.lastUserDisposition, session.lastUserDisposition) &&
        Objects.equals(this.conversationChannels, session.conversationChannels) &&
        Objects.equals(this.originatingDirection, session.originatingDirection) &&
        Objects.equals(this.conversationSubject, session.conversationSubject) &&
        Objects.equals(this.authenticated, session.authenticated) &&
        Objects.equals(this.selfUri, session.selfUri) &&
        Objects.equals(this.createdDate, session.createdDate) &&
        Objects.equals(this.endedDate, session.endedDate) &&
        Objects.equals(this.externalContact, session.externalContact) &&
        Objects.equals(this.awayDate, session.awayDate) &&
        Objects.equals(this.idleDate, session.idleDate) &&
        Objects.equals(this.conversation, session.conversation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, customerId, customerIdType, type, externalId, externalUrl, shortId, outcomeAchievements, segmentAssignments, attributes, attributeLists, browser, device, geolocation, ipAddress, ipOrganization, lastPage, mktCampaign, referrer, searchTerms, userAgentString, durationInSeconds, eventCount, pageviewCount, screenviewCount, lastEvent, lastConnectedQueue, lastConnectedUser, lastUserDisposition, conversationChannels, originatingDirection, conversationSubject, authenticated, selfUri, createdDate, endedDate, externalContact, awayDate, idleDate, conversation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Session {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    customerIdType: ").append(toIndentedString(customerIdType)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    externalUrl: ").append(toIndentedString(externalUrl)).append("\n");
    sb.append("    shortId: ").append(toIndentedString(shortId)).append("\n");
    sb.append("    outcomeAchievements: ").append(toIndentedString(outcomeAchievements)).append("\n");
    sb.append("    segmentAssignments: ").append(toIndentedString(segmentAssignments)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    attributeLists: ").append(toIndentedString(attributeLists)).append("\n");
    sb.append("    browser: ").append(toIndentedString(browser)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    geolocation: ").append(toIndentedString(geolocation)).append("\n");
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
    sb.append("    lastConnectedQueue: ").append(toIndentedString(lastConnectedQueue)).append("\n");
    sb.append("    lastConnectedUser: ").append(toIndentedString(lastConnectedUser)).append("\n");
    sb.append("    lastUserDisposition: ").append(toIndentedString(lastUserDisposition)).append("\n");
    sb.append("    conversationChannels: ").append(toIndentedString(conversationChannels)).append("\n");
    sb.append("    originatingDirection: ").append(toIndentedString(originatingDirection)).append("\n");
    sb.append("    conversationSubject: ").append(toIndentedString(conversationSubject)).append("\n");
    sb.append("    authenticated: ").append(toIndentedString(authenticated)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    endedDate: ").append(toIndentedString(endedDate)).append("\n");
    sb.append("    externalContact: ").append(toIndentedString(externalContact)).append("\n");
    sb.append("    awayDate: ").append(toIndentedString(awayDate)).append("\n");
    sb.append("    idleDate: ").append(toIndentedString(idleDate)).append("\n");
    sb.append("    conversation: ").append(toIndentedString(conversation)).append("\n");
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

