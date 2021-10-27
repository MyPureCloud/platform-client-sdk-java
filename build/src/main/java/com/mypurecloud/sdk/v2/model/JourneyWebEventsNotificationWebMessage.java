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
import com.mypurecloud.sdk.v2.model.JourneyWebEventsNotificationBrowser;
import com.mypurecloud.sdk.v2.model.JourneyWebEventsNotificationCustomEventAttribute;
import com.mypurecloud.sdk.v2.model.JourneyWebEventsNotificationDevice;
import com.mypurecloud.sdk.v2.model.JourneyWebEventsNotificationGeoLocation;
import com.mypurecloud.sdk.v2.model.JourneyWebEventsNotificationMktCampaign;
import com.mypurecloud.sdk.v2.model.JourneyWebEventsNotificationPage;
import com.mypurecloud.sdk.v2.model.JourneyWebEventsNotificationReferrer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * JourneyWebEventsNotificationWebMessage
 */

public class JourneyWebEventsNotificationWebMessage  implements Serializable {
  
  private String eventName = null;
  private Integer totalEventCount = null;
  private Integer totalPageviewCount = null;
  private String userAgentString = null;
  private String ipAddress = null;
  private String ipOrganization = null;
  private String searchQuery = null;
  private Boolean authenticated = null;
  private JourneyWebEventsNotificationBrowser browser = null;
  private JourneyWebEventsNotificationDevice device = null;
  private JourneyWebEventsNotificationGeoLocation geolocation = null;
  private JourneyWebEventsNotificationMktCampaign mktCampaign = null;
  private JourneyWebEventsNotificationPage page = null;
  private JourneyWebEventsNotificationReferrer referrer = null;
  private Map<String, JourneyWebEventsNotificationCustomEventAttribute> attributes = null;
  private Map<String, JourneyWebEventsNotificationCustomEventAttribute> traits = null;

  
  /**
   **/
  public JourneyWebEventsNotificationWebMessage eventName(String eventName) {
    this.eventName = eventName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("eventName")
  public String getEventName() {
    return eventName;
  }
  public void setEventName(String eventName) {
    this.eventName = eventName;
  }

  
  /**
   **/
  public JourneyWebEventsNotificationWebMessage totalEventCount(Integer totalEventCount) {
    this.totalEventCount = totalEventCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("totalEventCount")
  public Integer getTotalEventCount() {
    return totalEventCount;
  }
  public void setTotalEventCount(Integer totalEventCount) {
    this.totalEventCount = totalEventCount;
  }

  
  /**
   **/
  public JourneyWebEventsNotificationWebMessage totalPageviewCount(Integer totalPageviewCount) {
    this.totalPageviewCount = totalPageviewCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("totalPageviewCount")
  public Integer getTotalPageviewCount() {
    return totalPageviewCount;
  }
  public void setTotalPageviewCount(Integer totalPageviewCount) {
    this.totalPageviewCount = totalPageviewCount;
  }

  
  /**
   **/
  public JourneyWebEventsNotificationWebMessage userAgentString(String userAgentString) {
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
  public JourneyWebEventsNotificationWebMessage ipAddress(String ipAddress) {
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
  public JourneyWebEventsNotificationWebMessage ipOrganization(String ipOrganization) {
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
  public JourneyWebEventsNotificationWebMessage searchQuery(String searchQuery) {
    this.searchQuery = searchQuery;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("searchQuery")
  public String getSearchQuery() {
    return searchQuery;
  }
  public void setSearchQuery(String searchQuery) {
    this.searchQuery = searchQuery;
  }

  
  /**
   **/
  public JourneyWebEventsNotificationWebMessage authenticated(Boolean authenticated) {
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
  public JourneyWebEventsNotificationWebMessage browser(JourneyWebEventsNotificationBrowser browser) {
    this.browser = browser;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("browser")
  public JourneyWebEventsNotificationBrowser getBrowser() {
    return browser;
  }
  public void setBrowser(JourneyWebEventsNotificationBrowser browser) {
    this.browser = browser;
  }

  
  /**
   **/
  public JourneyWebEventsNotificationWebMessage device(JourneyWebEventsNotificationDevice device) {
    this.device = device;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("device")
  public JourneyWebEventsNotificationDevice getDevice() {
    return device;
  }
  public void setDevice(JourneyWebEventsNotificationDevice device) {
    this.device = device;
  }

  
  /**
   **/
  public JourneyWebEventsNotificationWebMessage geolocation(JourneyWebEventsNotificationGeoLocation geolocation) {
    this.geolocation = geolocation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("geolocation")
  public JourneyWebEventsNotificationGeoLocation getGeolocation() {
    return geolocation;
  }
  public void setGeolocation(JourneyWebEventsNotificationGeoLocation geolocation) {
    this.geolocation = geolocation;
  }

  
  /**
   **/
  public JourneyWebEventsNotificationWebMessage mktCampaign(JourneyWebEventsNotificationMktCampaign mktCampaign) {
    this.mktCampaign = mktCampaign;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("mktCampaign")
  public JourneyWebEventsNotificationMktCampaign getMktCampaign() {
    return mktCampaign;
  }
  public void setMktCampaign(JourneyWebEventsNotificationMktCampaign mktCampaign) {
    this.mktCampaign = mktCampaign;
  }

  
  /**
   **/
  public JourneyWebEventsNotificationWebMessage page(JourneyWebEventsNotificationPage page) {
    this.page = page;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("page")
  public JourneyWebEventsNotificationPage getPage() {
    return page;
  }
  public void setPage(JourneyWebEventsNotificationPage page) {
    this.page = page;
  }

  
  /**
   **/
  public JourneyWebEventsNotificationWebMessage referrer(JourneyWebEventsNotificationReferrer referrer) {
    this.referrer = referrer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("referrer")
  public JourneyWebEventsNotificationReferrer getReferrer() {
    return referrer;
  }
  public void setReferrer(JourneyWebEventsNotificationReferrer referrer) {
    this.referrer = referrer;
  }

  
  /**
   **/
  public JourneyWebEventsNotificationWebMessage attributes(Map<String, JourneyWebEventsNotificationCustomEventAttribute> attributes) {
    this.attributes = attributes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("attributes")
  public Map<String, JourneyWebEventsNotificationCustomEventAttribute> getAttributes() {
    return attributes;
  }
  public void setAttributes(Map<String, JourneyWebEventsNotificationCustomEventAttribute> attributes) {
    this.attributes = attributes;
  }

  
  /**
   **/
  public JourneyWebEventsNotificationWebMessage traits(Map<String, JourneyWebEventsNotificationCustomEventAttribute> traits) {
    this.traits = traits;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("traits")
  public Map<String, JourneyWebEventsNotificationCustomEventAttribute> getTraits() {
    return traits;
  }
  public void setTraits(Map<String, JourneyWebEventsNotificationCustomEventAttribute> traits) {
    this.traits = traits;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JourneyWebEventsNotificationWebMessage journeyWebEventsNotificationWebMessage = (JourneyWebEventsNotificationWebMessage) o;
    return Objects.equals(this.eventName, journeyWebEventsNotificationWebMessage.eventName) &&
        Objects.equals(this.totalEventCount, journeyWebEventsNotificationWebMessage.totalEventCount) &&
        Objects.equals(this.totalPageviewCount, journeyWebEventsNotificationWebMessage.totalPageviewCount) &&
        Objects.equals(this.userAgentString, journeyWebEventsNotificationWebMessage.userAgentString) &&
        Objects.equals(this.ipAddress, journeyWebEventsNotificationWebMessage.ipAddress) &&
        Objects.equals(this.ipOrganization, journeyWebEventsNotificationWebMessage.ipOrganization) &&
        Objects.equals(this.searchQuery, journeyWebEventsNotificationWebMessage.searchQuery) &&
        Objects.equals(this.authenticated, journeyWebEventsNotificationWebMessage.authenticated) &&
        Objects.equals(this.browser, journeyWebEventsNotificationWebMessage.browser) &&
        Objects.equals(this.device, journeyWebEventsNotificationWebMessage.device) &&
        Objects.equals(this.geolocation, journeyWebEventsNotificationWebMessage.geolocation) &&
        Objects.equals(this.mktCampaign, journeyWebEventsNotificationWebMessage.mktCampaign) &&
        Objects.equals(this.page, journeyWebEventsNotificationWebMessage.page) &&
        Objects.equals(this.referrer, journeyWebEventsNotificationWebMessage.referrer) &&
        Objects.equals(this.attributes, journeyWebEventsNotificationWebMessage.attributes) &&
        Objects.equals(this.traits, journeyWebEventsNotificationWebMessage.traits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventName, totalEventCount, totalPageviewCount, userAgentString, ipAddress, ipOrganization, searchQuery, authenticated, browser, device, geolocation, mktCampaign, page, referrer, attributes, traits);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneyWebEventsNotificationWebMessage {\n");
    
    sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
    sb.append("    totalEventCount: ").append(toIndentedString(totalEventCount)).append("\n");
    sb.append("    totalPageviewCount: ").append(toIndentedString(totalPageviewCount)).append("\n");
    sb.append("    userAgentString: ").append(toIndentedString(userAgentString)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    ipOrganization: ").append(toIndentedString(ipOrganization)).append("\n");
    sb.append("    searchQuery: ").append(toIndentedString(searchQuery)).append("\n");
    sb.append("    authenticated: ").append(toIndentedString(authenticated)).append("\n");
    sb.append("    browser: ").append(toIndentedString(browser)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    geolocation: ").append(toIndentedString(geolocation)).append("\n");
    sb.append("    mktCampaign: ").append(toIndentedString(mktCampaign)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    referrer: ").append(toIndentedString(referrer)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    traits: ").append(toIndentedString(traits)).append("\n");
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

