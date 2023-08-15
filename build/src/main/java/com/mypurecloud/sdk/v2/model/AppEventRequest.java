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
import com.mypurecloud.sdk.v2.model.AppEventRequestSession;
import com.mypurecloud.sdk.v2.model.CustomEventAttribute;
import com.mypurecloud.sdk.v2.model.Device;
import com.mypurecloud.sdk.v2.model.JourneyApp;
import com.mypurecloud.sdk.v2.model.NetworkConnectivity;
import com.mypurecloud.sdk.v2.model.SdkLibrary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * AppEventRequest
 */

public class AppEventRequest  implements Serializable {
  
  private String eventName = null;
  private String screenName = null;
  private JourneyApp app = null;
  private Device device = null;
  private SdkLibrary sdkLibrary = null;
  private NetworkConnectivity networkConnectivity = null;
  private String referrerUrl = null;
  private AppEventRequestSession session = null;
  private String searchQuery = null;
  private Map<String, CustomEventAttribute> attributes = null;
  private Map<String, CustomEventAttribute> traits = null;
  private String customerCookieId = null;
  private Date createdDate = null;

  
  /**
   * Represents the action the customer performed. Event types are created for each unique event name and can be faceted on in segment and outcome conditions. A valid event name must only contain alphanumeric characters and underscores. A good event name is typically an object followed by the action performed in past tense, e.g. screen_viewed, search_performed, user_registered.
   **/
  public AppEventRequest eventName(String eventName) {
    this.eventName = eventName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Represents the action the customer performed. Event types are created for each unique event name and can be faceted on in segment and outcome conditions. A valid event name must only contain alphanumeric characters and underscores. A good event name is typically an object followed by the action performed in past tense, e.g. screen_viewed, search_performed, user_registered.")
  @JsonProperty("eventName")
  public String getEventName() {
    return eventName;
  }
  public void setEventName(String eventName) {
    this.eventName = eventName;
  }


  /**
   * The name of the screen, view, or fragment in the app where the event took place.
   **/
  public AppEventRequest screenName(String screenName) {
    this.screenName = screenName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the screen, view, or fragment in the app where the event took place.")
  @JsonProperty("screenName")
  public String getScreenName() {
    return screenName;
  }
  public void setScreenName(String screenName) {
    this.screenName = screenName;
  }


  /**
   * Application that the customer is interacting with.
   **/
  public AppEventRequest app(JourneyApp app) {
    this.app = app;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Application that the customer is interacting with.")
  @JsonProperty("app")
  public JourneyApp getApp() {
    return app;
  }
  public void setApp(JourneyApp app) {
    this.app = app;
  }


  /**
   * Customer's device.
   **/
  public AppEventRequest device(Device device) {
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
   * SDK library used to generate the event.
   **/
  public AppEventRequest sdkLibrary(SdkLibrary sdkLibrary) {
    this.sdkLibrary = sdkLibrary;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "SDK library used to generate the event.")
  @JsonProperty("sdkLibrary")
  public SdkLibrary getSdkLibrary() {
    return sdkLibrary;
  }
  public void setSdkLibrary(SdkLibrary sdkLibrary) {
    this.sdkLibrary = sdkLibrary;
  }


  /**
   * Information relating to the device's network connectivity.
   **/
  public AppEventRequest networkConnectivity(NetworkConnectivity networkConnectivity) {
    this.networkConnectivity = networkConnectivity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Information relating to the device's network connectivity.")
  @JsonProperty("networkConnectivity")
  public NetworkConnectivity getNetworkConnectivity() {
    return networkConnectivity;
  }
  public void setNetworkConnectivity(NetworkConnectivity networkConnectivity) {
    this.networkConnectivity = networkConnectivity;
  }


  /**
   * The referrer URL of the first event in the app session.
   **/
  public AppEventRequest referrerUrl(String referrerUrl) {
    this.referrerUrl = referrerUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The referrer URL of the first event in the app session.")
  @JsonProperty("referrerUrl")
  public String getReferrerUrl() {
    return referrerUrl;
  }
  public void setReferrerUrl(String referrerUrl) {
    this.referrerUrl = referrerUrl;
  }


  /**
   * Contains information about the app session the event belongs to. A session is expected to end once the application is closed or a customer has been idle for more than 30 minutes. Each session is tied to a single customer and a customer can be linked to multiple unique sessions.
   **/
  public AppEventRequest session(AppEventRequestSession session) {
    this.session = session;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Contains information about the app session the event belongs to. A session is expected to end once the application is closed or a customer has been idle for more than 30 minutes. Each session is tied to a single customer and a customer can be linked to multiple unique sessions.")
  @JsonProperty("session")
  public AppEventRequestSession getSession() {
    return session;
  }
  public void setSession(AppEventRequestSession session) {
    this.session = session;
  }


  /**
   * Represents the keywords in a customer search query.
   **/
  public AppEventRequest searchQuery(String searchQuery) {
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
   * User-defined attributes associated with a particular event. These attributes provide additional context about the event. For example, items_in_cart or subscription_level.
   **/
  public AppEventRequest attributes(Map<String, CustomEventAttribute> attributes) {
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
   * Traits are attributes intrinsic to the customer that may be sent in selected events, (e.g. email, lastName, cellPhone). Traits are used to collect information for identity resolution. For example, the same person might be using an application on different devices which might create two sessions with different customerIds. Additional information can be provided as traits to help link those two sessions and customers to a single external contact through common identifiers that were submitted via a form fill, message, or other input in both sessions.
   **/
  public AppEventRequest traits(Map<String, CustomEventAttribute> traits) {
    this.traits = traits;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Traits are attributes intrinsic to the customer that may be sent in selected events, (e.g. email, lastName, cellPhone). Traits are used to collect information for identity resolution. For example, the same person might be using an application on different devices which might create two sessions with different customerIds. Additional information can be provided as traits to help link those two sessions and customers to a single external contact through common identifiers that were submitted via a form fill, message, or other input in both sessions.")
  @JsonProperty("traits")
  public Map<String, CustomEventAttribute> getTraits() {
    return traits;
  }
  public void setTraits(Map<String, CustomEventAttribute> traits) {
    this.traits = traits;
  }


  /**
   * Cookie ID of the customer associated with the app event. This is expected to be set per application install or device and can be used to identify a single customer across multiple sessions. This identifier, along with others passed as traits, is used for identity resolution.
   **/
  public AppEventRequest customerCookieId(String customerCookieId) {
    this.customerCookieId = customerCookieId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Cookie ID of the customer associated with the app event. This is expected to be set per application install or device and can be used to identify a single customer across multiple sessions. This identifier, along with others passed as traits, is used for identity resolution.")
  @JsonProperty("customerCookieId")
  public String getCustomerCookieId() {
    return customerCookieId;
  }
  public void setCustomerCookieId(String customerCookieId) {
    this.customerCookieId = customerCookieId;
  }


  /**
   * Timestamp indicating when the event actually took place. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public AppEventRequest createdDate(Date createdDate) {
    this.createdDate = createdDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Timestamp indicating when the event actually took place. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
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
    AppEventRequest appEventRequest = (AppEventRequest) o;

    return Objects.equals(this.eventName, appEventRequest.eventName) &&
            Objects.equals(this.screenName, appEventRequest.screenName) &&
            Objects.equals(this.app, appEventRequest.app) &&
            Objects.equals(this.device, appEventRequest.device) &&
            Objects.equals(this.sdkLibrary, appEventRequest.sdkLibrary) &&
            Objects.equals(this.networkConnectivity, appEventRequest.networkConnectivity) &&
            Objects.equals(this.referrerUrl, appEventRequest.referrerUrl) &&
            Objects.equals(this.session, appEventRequest.session) &&
            Objects.equals(this.searchQuery, appEventRequest.searchQuery) &&
            Objects.equals(this.attributes, appEventRequest.attributes) &&
            Objects.equals(this.traits, appEventRequest.traits) &&
            Objects.equals(this.customerCookieId, appEventRequest.customerCookieId) &&
            Objects.equals(this.createdDate, appEventRequest.createdDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventName, screenName, app, device, sdkLibrary, networkConnectivity, referrerUrl, session, searchQuery, attributes, traits, customerCookieId, createdDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppEventRequest {\n");
    
    sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
    sb.append("    screenName: ").append(toIndentedString(screenName)).append("\n");
    sb.append("    app: ").append(toIndentedString(app)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    sdkLibrary: ").append(toIndentedString(sdkLibrary)).append("\n");
    sb.append("    networkConnectivity: ").append(toIndentedString(networkConnectivity)).append("\n");
    sb.append("    referrerUrl: ").append(toIndentedString(referrerUrl)).append("\n");
    sb.append("    session: ").append(toIndentedString(session)).append("\n");
    sb.append("    searchQuery: ").append(toIndentedString(searchQuery)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    traits: ").append(toIndentedString(traits)).append("\n");
    sb.append("    customerCookieId: ").append(toIndentedString(customerCookieId)).append("\n");
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

