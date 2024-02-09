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
import com.mypurecloud.sdk.v2.model.Browser;
import com.mypurecloud.sdk.v2.model.CustomEventAttribute;
import com.mypurecloud.sdk.v2.model.Device;
import com.mypurecloud.sdk.v2.model.JourneyCampaign;
import com.mypurecloud.sdk.v2.model.JourneyGeolocation;
import com.mypurecloud.sdk.v2.model.JourneyPage;
import com.mypurecloud.sdk.v2.model.Referrer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * WebEvent
 */

public class WebEvent  implements Serializable {
  
  private String eventName = null;
  private Integer totalEventCount = null;
  private Integer totalPageviewCount = null;
  private JourneyPage page = null;
  private String userAgentString = null;
  private Browser browser = null;
  private Device device = null;
  private JourneyGeolocation geolocation = null;
  private String ipAddress = null;
  private String ipOrganization = null;
  private JourneyCampaign mktCampaign = null;
  private Referrer referrer = null;
  private Map<String, CustomEventAttribute> attributes = null;
  private Map<String, CustomEventAttribute> traits = null;
  private String searchQuery = null;
  private Boolean authenticated = null;

  
  /**
   * Represents the action the customer performed. A good event name is typically an object followed by the action performed in past tense (e.g. page_viewed, order_completed, user_registered).
   **/
  public WebEvent eventName(String eventName) {
    this.eventName = eventName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Represents the action the customer performed. A good event name is typically an object followed by the action performed in past tense (e.g. page_viewed, order_completed, user_registered).")
  @JsonProperty("eventName")
  public String getEventName() {
    return eventName;
  }
  public void setEventName(String eventName) {
    this.eventName = eventName;
  }


  /**
   * The total count of events performed by the customer across all sessions.
   **/
  public WebEvent totalEventCount(Integer totalEventCount) {
    this.totalEventCount = totalEventCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The total count of events performed by the customer across all sessions.")
  @JsonProperty("totalEventCount")
  public Integer getTotalEventCount() {
    return totalEventCount;
  }
  public void setTotalEventCount(Integer totalEventCount) {
    this.totalEventCount = totalEventCount;
  }


  /**
   * The total count of pageviews performed by the customer across all sessions.
   **/
  public WebEvent totalPageviewCount(Integer totalPageviewCount) {
    this.totalPageviewCount = totalPageviewCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The total count of pageviews performed by the customer across all sessions.")
  @JsonProperty("totalPageviewCount")
  public Integer getTotalPageviewCount() {
    return totalPageviewCount;
  }
  public void setTotalPageviewCount(Integer totalPageviewCount) {
    this.totalPageviewCount = totalPageviewCount;
  }


  /**
   * The webpage where the user interaction occurred.
   **/
  public WebEvent page(JourneyPage page) {
    this.page = page;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The webpage where the user interaction occurred.")
  @JsonProperty("page")
  public JourneyPage getPage() {
    return page;
  }
  public void setPage(JourneyPage page) {
    this.page = page;
  }


  /**
   * HTTP User-Agent string (see https://tools.ietf.org/html/rfc1945#section-10.15).
   **/
  public WebEvent userAgentString(String userAgentString) {
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
  public WebEvent browser(Browser browser) {
    this.browser = browser;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Customer's browser.")
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
  public WebEvent device(Device device) {
    this.device = device;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Customer's device.")
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
  public WebEvent geolocation(JourneyGeolocation geolocation) {
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
   * Customer's IP address. May be null if the business configures the tracker to not collect IP addresses.
   **/
  public WebEvent ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Customer's IP address. May be null if the business configures the tracker to not collect IP addresses.")
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
  public WebEvent ipOrganization(String ipOrganization) {
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
   * Marketing / traffic source information.
   **/
  public WebEvent mktCampaign(JourneyCampaign mktCampaign) {
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
  public WebEvent referrer(Referrer referrer) {
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
   * User-defined attributes associated with a particular event.
   **/
  public WebEvent attributes(Map<String, CustomEventAttribute> attributes) {
    this.attributes = attributes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "User-defined attributes associated with a particular event.")
  @JsonProperty("attributes")
  public Map<String, CustomEventAttribute> getAttributes() {
    return attributes;
  }
  public void setAttributes(Map<String, CustomEventAttribute> attributes) {
    this.attributes = attributes;
  }


  /**
   * User-defined traits associated with a particular event.
   **/
  public WebEvent traits(Map<String, CustomEventAttribute> traits) {
    this.traits = traits;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "User-defined traits associated with a particular event.")
  @JsonProperty("traits")
  public Map<String, CustomEventAttribute> getTraits() {
    return traits;
  }
  public void setTraits(Map<String, CustomEventAttribute> traits) {
    this.traits = traits;
  }


  /**
   * Represents the keywords in a customer search query.
   **/
  public WebEvent searchQuery(String searchQuery) {
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
   * Indicates whether the event was produced during an authenticated session.
   **/
  public WebEvent authenticated(Boolean authenticated) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebEvent webEvent = (WebEvent) o;

    return Objects.equals(this.eventName, webEvent.eventName) &&
            Objects.equals(this.totalEventCount, webEvent.totalEventCount) &&
            Objects.equals(this.totalPageviewCount, webEvent.totalPageviewCount) &&
            Objects.equals(this.page, webEvent.page) &&
            Objects.equals(this.userAgentString, webEvent.userAgentString) &&
            Objects.equals(this.browser, webEvent.browser) &&
            Objects.equals(this.device, webEvent.device) &&
            Objects.equals(this.geolocation, webEvent.geolocation) &&
            Objects.equals(this.ipAddress, webEvent.ipAddress) &&
            Objects.equals(this.ipOrganization, webEvent.ipOrganization) &&
            Objects.equals(this.mktCampaign, webEvent.mktCampaign) &&
            Objects.equals(this.referrer, webEvent.referrer) &&
            Objects.equals(this.attributes, webEvent.attributes) &&
            Objects.equals(this.traits, webEvent.traits) &&
            Objects.equals(this.searchQuery, webEvent.searchQuery) &&
            Objects.equals(this.authenticated, webEvent.authenticated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventName, totalEventCount, totalPageviewCount, page, userAgentString, browser, device, geolocation, ipAddress, ipOrganization, mktCampaign, referrer, attributes, traits, searchQuery, authenticated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebEvent {\n");
    
    sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
    sb.append("    totalEventCount: ").append(toIndentedString(totalEventCount)).append("\n");
    sb.append("    totalPageviewCount: ").append(toIndentedString(totalPageviewCount)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    userAgentString: ").append(toIndentedString(userAgentString)).append("\n");
    sb.append("    browser: ").append(toIndentedString(browser)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    geolocation: ").append(toIndentedString(geolocation)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    ipOrganization: ").append(toIndentedString(ipOrganization)).append("\n");
    sb.append("    mktCampaign: ").append(toIndentedString(mktCampaign)).append("\n");
    sb.append("    referrer: ").append(toIndentedString(referrer)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    traits: ").append(toIndentedString(traits)).append("\n");
    sb.append("    searchQuery: ").append(toIndentedString(searchQuery)).append("\n");
    sb.append("    authenticated: ").append(toIndentedString(authenticated)).append("\n");
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

