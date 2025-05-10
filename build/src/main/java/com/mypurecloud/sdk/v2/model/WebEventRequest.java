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
import com.mypurecloud.sdk.v2.model.RequestPage;
import com.mypurecloud.sdk.v2.model.WebEventBrowser;
import com.mypurecloud.sdk.v2.model.WebEventDevice;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * WebEventRequest
 */

public class WebEventRequest  implements Serializable {
  
  private String customerCookieId = null;
  private String eventName = null;
  private RequestPage page = null;
  private String userAgentString = null;
  private WebEventBrowser browser = null;
  private WebEventDevice device = null;
  private String searchQuery = null;
  private String ipAddress = null;
  private String referrerUrl = null;
  private Map<String, CustomEventAttribute> attributes = null;
  private Map<String, CustomEventAttribute> traits = null;
  private Date createdDate = null;

  public WebEventRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * A UUID representing the customer making the request.
   **/
  public WebEventRequest customerCookieId(String customerCookieId) {
    this.customerCookieId = customerCookieId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A UUID representing the customer making the request.")
  @JsonProperty("customerCookieId")
  public String getCustomerCookieId() {
    return customerCookieId;
  }
  public void setCustomerCookieId(String customerCookieId) {
    this.customerCookieId = customerCookieId;
  }


  /**
   * Represents the action the customer performed. Event types are created for each unique event name and can be faceted on in segment and outcome conditions. A valid event name must only contain alphanumeric characters and underscores. A good event name is typically an object followed by the action performed in past tense, e.g. page_viewed, order_completed, user_registered.
   **/
  public WebEventRequest eventName(String eventName) {
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
   * The webpage where the user interaction occurred.
   **/
  public WebEventRequest page(RequestPage page) {
    this.page = page;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The webpage where the user interaction occurred.")
  @JsonProperty("page")
  public RequestPage getPage() {
    return page;
  }
  public void setPage(RequestPage page) {
    this.page = page;
  }


  /**
   * Override for HTTP User-Agent string from request header (see https://tools.ietf.org/html/rfc1945#section-10.15).
   **/
  public WebEventRequest userAgentString(String userAgentString) {
    this.userAgentString = userAgentString;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Override for HTTP User-Agent string from request header (see https://tools.ietf.org/html/rfc1945#section-10.15).")
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
  public WebEventRequest browser(WebEventBrowser browser) {
    this.browser = browser;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Customer's browser.")
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
  public WebEventRequest device(WebEventDevice device) {
    this.device = device;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Customer's device.")
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
  public WebEventRequest searchQuery(String searchQuery) {
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
   * Customer's IP address.
   **/
  public WebEventRequest ipAddress(String ipAddress) {
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
   * Identifies the referrer URL that originally generated the request for the current page being viewed.
   **/
  public WebEventRequest referrerUrl(String referrerUrl) {
    this.referrerUrl = referrerUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identifies the referrer URL that originally generated the request for the current page being viewed.")
  @JsonProperty("referrerUrl")
  public String getReferrerUrl() {
    return referrerUrl;
  }
  public void setReferrerUrl(String referrerUrl) {
    this.referrerUrl = referrerUrl;
  }


  /**
   * User-defined attributes associated with a particular event. These attributes provide additional context about the event. For example, items_in_cart or subscription_level.
   **/
  public WebEventRequest attributes(Map<String, CustomEventAttribute> attributes) {
    this.attributes = attributes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "User-defined attributes associated with a particular event. These attributes provide additional context about the event. For example, items_in_cart or subscription_level.")
  @JsonProperty("attributes")
  public Map<String, CustomEventAttribute> getAttributes() {
    return attributes;
  }
  public void setAttributes(Map<String, CustomEventAttribute> attributes) {
    this.attributes = attributes;
  }


  /**
   * Traits are attributes intrinsic to the customer that may be sent in selected events, e.g. email, givenName, cellPhone. Traits are used to collect information for identity resolution. For example, the same person might be using an application on different devices which might create two sessions with different customerIds. Additional information can be provided as traits to help link those two sessions and customers to a single external contact through common identifiers that were submitted via a form fill, message, or other input in both sessions.
   **/
  public WebEventRequest traits(Map<String, CustomEventAttribute> traits) {
    this.traits = traits;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Traits are attributes intrinsic to the customer that may be sent in selected events, e.g. email, givenName, cellPhone. Traits are used to collect information for identity resolution. For example, the same person might be using an application on different devices which might create two sessions with different customerIds. Additional information can be provided as traits to help link those two sessions and customers to a single external contact through common identifiers that were submitted via a form fill, message, or other input in both sessions.")
  @JsonProperty("traits")
  public Map<String, CustomEventAttribute> getTraits() {
    return traits;
  }
  public void setTraits(Map<String, CustomEventAttribute> traits) {
    this.traits = traits;
  }


  /**
   * UTC timestamp indicating when the event actually took place, events older than an hour will be rejected. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public WebEventRequest createdDate(Date createdDate) {
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
    WebEventRequest webEventRequest = (WebEventRequest) o;

    return Objects.equals(this.customerCookieId, webEventRequest.customerCookieId) &&
            Objects.equals(this.eventName, webEventRequest.eventName) &&
            Objects.equals(this.page, webEventRequest.page) &&
            Objects.equals(this.userAgentString, webEventRequest.userAgentString) &&
            Objects.equals(this.browser, webEventRequest.browser) &&
            Objects.equals(this.device, webEventRequest.device) &&
            Objects.equals(this.searchQuery, webEventRequest.searchQuery) &&
            Objects.equals(this.ipAddress, webEventRequest.ipAddress) &&
            Objects.equals(this.referrerUrl, webEventRequest.referrerUrl) &&
            Objects.equals(this.attributes, webEventRequest.attributes) &&
            Objects.equals(this.traits, webEventRequest.traits) &&
            Objects.equals(this.createdDate, webEventRequest.createdDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerCookieId, eventName, page, userAgentString, browser, device, searchQuery, ipAddress, referrerUrl, attributes, traits, createdDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebEventRequest {\n");
    
    sb.append("    customerCookieId: ").append(toIndentedString(customerCookieId)).append("\n");
    sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    userAgentString: ").append(toIndentedString(userAgentString)).append("\n");
    sb.append("    browser: ").append(toIndentedString(browser)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    searchQuery: ").append(toIndentedString(searchQuery)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    referrerUrl: ").append(toIndentedString(referrerUrl)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    traits: ").append(toIndentedString(traits)).append("\n");
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

