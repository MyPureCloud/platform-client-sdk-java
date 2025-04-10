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
import com.mypurecloud.sdk.v2.model.CustomEventAttribute;
import com.mypurecloud.sdk.v2.model.JourneyCampaign;
import com.mypurecloud.sdk.v2.model.JourneyGeolocation;
import com.mypurecloud.sdk.v2.model.Referrer;
import com.mypurecloud.sdk.v2.model.ResponsePage;
import com.mypurecloud.sdk.v2.model.WebEventBrowser;
import com.mypurecloud.sdk.v2.model.WebEventDevice;
import com.mypurecloud.sdk.v2.model.WebEventResponseSession;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * WebEventResponse
 */

public class WebEventResponse  implements Serializable {
  
  private String customerId = null;
  private String eventName = null;
  private String customerIdType = null;
  private ResponsePage page = null;
  private String userAgentString = null;
  private WebEventBrowser browser = null;
  private WebEventDevice device = null;
  private String searchQuery = null;
  private String ipOrganization = null;
  private JourneyGeolocation geolocation = null;
  private JourneyCampaign mktCampaign = null;
  private WebEventResponseSession session = null;
  private Referrer referrer = null;
  private Map<String, CustomEventAttribute> attributes = null;
  private Map<String, CustomEventAttribute> traits = null;
  private Boolean authenticated = null;
  private Date createdDate = null;

  public WebEventResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Identifier of the customer in the source of the event.
   **/
  public WebEventResponse customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Identifier of the customer in the source of the event.")
  @JsonProperty("customerId")
  public String getCustomerId() {
    return customerId;
  }
  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }


  /**
   * Represents the action the customer performed. Event types are created for each unique event name and can be faceted on in segment and outcome conditions. A valid event name must only contain alphanumeric characters and underscores. A good event name is typically an object followed by the action performed in past tense, e.g. page_viewed, order_completed, user_registered.
   **/
  public WebEventResponse eventName(String eventName) {
    this.eventName = eventName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Represents the action the customer performed. Event types are created for each unique event name and can be faceted on in segment and outcome conditions. A valid event name must only contain alphanumeric characters and underscores. A good event name is typically an object followed by the action performed in past tense, e.g. page_viewed, order_completed, user_registered.")
  @JsonProperty("eventName")
  public String getEventName() {
    return eventName;
  }
  public void setEventName(String eventName) {
    this.eventName = eventName;
  }


  /**
   * Type of identifier for the customer ID (e.g., cookie).
   **/
  public WebEventResponse customerIdType(String customerIdType) {
    this.customerIdType = customerIdType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Type of identifier for the customer ID (e.g., cookie).")
  @JsonProperty("customerIdType")
  public String getCustomerIdType() {
    return customerIdType;
  }
  public void setCustomerIdType(String customerIdType) {
    this.customerIdType = customerIdType;
  }


  /**
   * The webpage where the user interaction occurred.
   **/
  public WebEventResponse page(ResponsePage page) {
    this.page = page;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The webpage where the user interaction occurred.")
  @JsonProperty("page")
  public ResponsePage getPage() {
    return page;
  }
  public void setPage(ResponsePage page) {
    this.page = page;
  }


  /**
   * HTTP User-Agent string (see https://tools.ietf.org/html/rfc1945#section-10.15).
   **/
  public WebEventResponse userAgentString(String userAgentString) {
    this.userAgentString = userAgentString;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "HTTP User-Agent string (see https://tools.ietf.org/html/rfc1945#section-10.15).")
  @JsonProperty("userAgentString")
  public String getUserAgentString() {
    return userAgentString;
  }
  public void setUserAgentString(String userAgentString) {
    this.userAgentString = userAgentString;
  }


  /**
   * Customer's browser.
   **/
  public WebEventResponse browser(WebEventBrowser browser) {
    this.browser = browser;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Customer's browser.")
  @JsonProperty("browser")
  public WebEventBrowser getBrowser() {
    return browser;
  }
  public void setBrowser(WebEventBrowser browser) {
    this.browser = browser;
  }


  /**
   * Customer's device.
   **/
  public WebEventResponse device(WebEventDevice device) {
    this.device = device;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Customer's device.")
  @JsonProperty("device")
  public WebEventDevice getDevice() {
    return device;
  }
  public void setDevice(WebEventDevice device) {
    this.device = device;
  }


  /**
   * Represents the keywords in a customer search query.
   **/
  public WebEventResponse searchQuery(String searchQuery) {
    this.searchQuery = searchQuery;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Represents the keywords in a customer search query.")
  @JsonProperty("searchQuery")
  public String getSearchQuery() {
    return searchQuery;
  }
  public void setSearchQuery(String searchQuery) {
    this.searchQuery = searchQuery;
  }


  /**
   * Customer's IP-based organization or ISP name.
   **/
  public WebEventResponse ipOrganization(String ipOrganization) {
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
   * Customer's geolocation.
   **/
  public WebEventResponse geolocation(JourneyGeolocation geolocation) {
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
   * Urchin Tracking Module (UTM) parameters used to track the effectiveness of online marketing campaigns.
   **/
  public WebEventResponse mktCampaign(JourneyCampaign mktCampaign) {
    this.mktCampaign = mktCampaign;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Urchin Tracking Module (UTM) parameters used to track the effectiveness of online marketing campaigns.")
  @JsonProperty("mktCampaign")
  public JourneyCampaign getMktCampaign() {
    return mktCampaign;
  }
  public void setMktCampaign(JourneyCampaign mktCampaign) {
    this.mktCampaign = mktCampaign;
  }


  /**
   * The session that the event belongs to.
   **/
  public WebEventResponse session(WebEventResponseSession session) {
    this.session = session;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The session that the event belongs to.")
  @JsonProperty("session")
  public WebEventResponseSession getSession() {
    return session;
  }
  public void setSession(WebEventResponseSession session) {
    this.session = session;
  }


  /**
   * Identifies the web page that originally generated the request for the current page being viewed.
   **/
  public WebEventResponse referrer(Referrer referrer) {
    this.referrer = referrer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identifies the web page that originally generated the request for the current page being viewed.")
  @JsonProperty("referrer")
  public Referrer getReferrer() {
    return referrer;
  }
  public void setReferrer(Referrer referrer) {
    this.referrer = referrer;
  }


  /**
   * User-defined attributes associated with a particular event. These attributes provide additional context about the event. For example, items_in_cart or subscription_level.
   **/
  public WebEventResponse attributes(Map<String, CustomEventAttribute> attributes) {
    this.attributes = attributes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "User-defined attributes associated with a particular event. These attributes provide additional context about the event. For example, items_in_cart or subscription_level.")
  @JsonProperty("attributes")
  public Map<String, CustomEventAttribute> getAttributes() {
    return attributes;
  }
  public void setAttributes(Map<String, CustomEventAttribute> attributes) {
    this.attributes = attributes;
  }


  /**
   * Traits are attributes intrinsic to the customer that may be sent in selected events, (e.g. email, lastName, cellPhone). Traits are used to collect information for identity resolution. For example, the same person might be using an application on different devices which might create two sessions with different customerIds. Additional information can be provided as traits to help link those two sessions and customers to a single external contact through common identifiers that were submitted via a form fill, message, or other input in both sessions.
   **/
  public WebEventResponse traits(Map<String, CustomEventAttribute> traits) {
    this.traits = traits;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Traits are attributes intrinsic to the customer that may be sent in selected events, (e.g. email, lastName, cellPhone). Traits are used to collect information for identity resolution. For example, the same person might be using an application on different devices which might create two sessions with different customerIds. Additional information can be provided as traits to help link those two sessions and customers to a single external contact through common identifiers that were submitted via a form fill, message, or other input in both sessions.")
  @JsonProperty("traits")
  public Map<String, CustomEventAttribute> getTraits() {
    return traits;
  }
  public void setTraits(Map<String, CustomEventAttribute> traits) {
    this.traits = traits;
  }


  /**
   * Indicates whether the event was produced during an authenticated session.
   **/
  public WebEventResponse authenticated(Boolean authenticated) {
    this.authenticated = authenticated;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Indicates whether the event was produced during an authenticated session.")
  @JsonProperty("authenticated")
  public Boolean getAuthenticated() {
    return authenticated;
  }
  public void setAuthenticated(Boolean authenticated) {
    this.authenticated = authenticated;
  }


  /**
   * UTC timestamp indicating when the event actually took place, events older than an hour will be rejected. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public WebEventResponse createdDate(Date createdDate) {
    this.createdDate = createdDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "UTC timestamp indicating when the event actually took place, events older than an hour will be rejected. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("createdDate")
  public Date getCreatedDate() {
    return createdDate;
  }
  public void setCreatedDate(Date createdDate) {
    this.createdDate = createdDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebEventResponse webEventResponse = (WebEventResponse) o;

    return Objects.equals(this.customerId, webEventResponse.customerId) &&
            Objects.equals(this.eventName, webEventResponse.eventName) &&
            Objects.equals(this.customerIdType, webEventResponse.customerIdType) &&
            Objects.equals(this.page, webEventResponse.page) &&
            Objects.equals(this.userAgentString, webEventResponse.userAgentString) &&
            Objects.equals(this.browser, webEventResponse.browser) &&
            Objects.equals(this.device, webEventResponse.device) &&
            Objects.equals(this.searchQuery, webEventResponse.searchQuery) &&
            Objects.equals(this.ipOrganization, webEventResponse.ipOrganization) &&
            Objects.equals(this.geolocation, webEventResponse.geolocation) &&
            Objects.equals(this.mktCampaign, webEventResponse.mktCampaign) &&
            Objects.equals(this.session, webEventResponse.session) &&
            Objects.equals(this.referrer, webEventResponse.referrer) &&
            Objects.equals(this.attributes, webEventResponse.attributes) &&
            Objects.equals(this.traits, webEventResponse.traits) &&
            Objects.equals(this.authenticated, webEventResponse.authenticated) &&
            Objects.equals(this.createdDate, webEventResponse.createdDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerId, eventName, customerIdType, page, userAgentString, browser, device, searchQuery, ipOrganization, geolocation, mktCampaign, session, referrer, attributes, traits, authenticated, createdDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebEventResponse {\n");
    
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
    sb.append("    customerIdType: ").append(toIndentedString(customerIdType)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    userAgentString: ").append(toIndentedString(userAgentString)).append("\n");
    sb.append("    browser: ").append(toIndentedString(browser)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    searchQuery: ").append(toIndentedString(searchQuery)).append("\n");
    sb.append("    ipOrganization: ").append(toIndentedString(ipOrganization)).append("\n");
    sb.append("    geolocation: ").append(toIndentedString(geolocation)).append("\n");
    sb.append("    mktCampaign: ").append(toIndentedString(mktCampaign)).append("\n");
    sb.append("    session: ").append(toIndentedString(session)).append("\n");
    sb.append("    referrer: ").append(toIndentedString(referrer)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    traits: ").append(toIndentedString(traits)).append("\n");
    sb.append("    authenticated: ").append(toIndentedString(authenticated)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
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

