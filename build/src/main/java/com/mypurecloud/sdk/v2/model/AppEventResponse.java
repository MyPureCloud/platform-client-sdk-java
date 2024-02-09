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
import com.mypurecloud.sdk.v2.model.AppEventResponseSession;
import com.mypurecloud.sdk.v2.model.CustomEventAttribute;
import com.mypurecloud.sdk.v2.model.Device;
import com.mypurecloud.sdk.v2.model.JourneyApp;
import com.mypurecloud.sdk.v2.model.JourneyCampaign;
import com.mypurecloud.sdk.v2.model.JourneyGeolocation;
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
 * AppEventResponse
 */

public class AppEventResponse  implements Serializable {
  
  private String id = null;
  private String customerId = null;
  private String customerIdType = null;
  private String eventName = null;
  private String screenName = null;
  private JourneyApp app = null;
  private Device device = null;
  private String ipOrganization = null;
  private JourneyGeolocation geolocation = null;
  private SdkLibrary sdkLibrary = null;
  private NetworkConnectivity networkConnectivity = null;
  private JourneyCampaign mktCampaign = null;
  private AppEventResponseSession session = null;
  private String searchQuery = null;
  private Map<String, CustomEventAttribute> attributes = null;
  private Map<String, CustomEventAttribute> traits = null;
  private Date createdDate = null;

  
  /**
   * System-generated UUID for the event.
   **/
  public AppEventResponse id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "System-generated UUID for the event.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * Identifier of the customer in the source of the event.
   **/
  public AppEventResponse customerId(String customerId) {
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
   * Type of identifier for the customer ID (cookie, email etc.).
   **/
  public AppEventResponse customerIdType(String customerIdType) {
    this.customerIdType = customerIdType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Type of identifier for the customer ID (cookie, email etc.).")
  @JsonProperty("customerIdType")
  public String getCustomerIdType() {
    return customerIdType;
  }
  public void setCustomerIdType(String customerIdType) {
    this.customerIdType = customerIdType;
  }


  /**
   * Represents the action the customer performed. A good event name is typically an object followed by the action performed in past tense (e.g. screen_viewed, order_completed, user_registered).
   **/
  public AppEventResponse eventName(String eventName) {
    this.eventName = eventName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Represents the action the customer performed. A good event name is typically an object followed by the action performed in past tense (e.g. screen_viewed, order_completed, user_registered).")
  @JsonProperty("eventName")
  public String getEventName() {
    return eventName;
  }
  public void setEventName(String eventName) {
    this.eventName = eventName;
  }


  /**
   * The name of the screen in the app that the event took place.
   **/
  public AppEventResponse screenName(String screenName) {
    this.screenName = screenName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the screen in the app that the event took place.")
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
  public AppEventResponse app(JourneyApp app) {
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
  public AppEventResponse device(Device device) {
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
   * Customer's IP-based organization or ISP name.
   **/
  public AppEventResponse ipOrganization(String ipOrganization) {
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
  public AppEventResponse geolocation(JourneyGeolocation geolocation) {
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
   * SDK library used to generate the event.
   **/
  public AppEventResponse sdkLibrary(SdkLibrary sdkLibrary) {
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
  public AppEventResponse networkConnectivity(NetworkConnectivity networkConnectivity) {
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
   * Marketing / traffic source information.
   **/
  public AppEventResponse mktCampaign(JourneyCampaign mktCampaign) {
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
   * The app session the event belongs to.
   **/
  public AppEventResponse session(AppEventResponseSession session) {
    this.session = session;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The app session the event belongs to.")
  @JsonProperty("session")
  public AppEventResponseSession getSession() {
    return session;
  }
  public void setSession(AppEventResponseSession session) {
    this.session = session;
  }


  /**
   * Represents the keywords in a customer search query.
   **/
  public AppEventResponse searchQuery(String searchQuery) {
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
   * User-defined attributes associated with a particular event.
   **/
  public AppEventResponse attributes(Map<String, CustomEventAttribute> attributes) {
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
   * Traits are attributes intrinsic to the customer that may be sent in selected events (e.g. email, name, phone).
   **/
  public AppEventResponse traits(Map<String, CustomEventAttribute> traits) {
    this.traits = traits;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Traits are attributes intrinsic to the customer that may be sent in selected events (e.g. email, name, phone).")
  @JsonProperty("traits")
  public Map<String, CustomEventAttribute> getTraits() {
    return traits;
  }
  public void setTraits(Map<String, CustomEventAttribute> traits) {
    this.traits = traits;
  }


  /**
   * UTC timestamp indicating when the event actually took place. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public AppEventResponse createdDate(Date createdDate) {
    this.createdDate = createdDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "UTC timestamp indicating when the event actually took place. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
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
    AppEventResponse appEventResponse = (AppEventResponse) o;

    return Objects.equals(this.id, appEventResponse.id) &&
            Objects.equals(this.customerId, appEventResponse.customerId) &&
            Objects.equals(this.customerIdType, appEventResponse.customerIdType) &&
            Objects.equals(this.eventName, appEventResponse.eventName) &&
            Objects.equals(this.screenName, appEventResponse.screenName) &&
            Objects.equals(this.app, appEventResponse.app) &&
            Objects.equals(this.device, appEventResponse.device) &&
            Objects.equals(this.ipOrganization, appEventResponse.ipOrganization) &&
            Objects.equals(this.geolocation, appEventResponse.geolocation) &&
            Objects.equals(this.sdkLibrary, appEventResponse.sdkLibrary) &&
            Objects.equals(this.networkConnectivity, appEventResponse.networkConnectivity) &&
            Objects.equals(this.mktCampaign, appEventResponse.mktCampaign) &&
            Objects.equals(this.session, appEventResponse.session) &&
            Objects.equals(this.searchQuery, appEventResponse.searchQuery) &&
            Objects.equals(this.attributes, appEventResponse.attributes) &&
            Objects.equals(this.traits, appEventResponse.traits) &&
            Objects.equals(this.createdDate, appEventResponse.createdDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, customerId, customerIdType, eventName, screenName, app, device, ipOrganization, geolocation, sdkLibrary, networkConnectivity, mktCampaign, session, searchQuery, attributes, traits, createdDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppEventResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    customerIdType: ").append(toIndentedString(customerIdType)).append("\n");
    sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
    sb.append("    screenName: ").append(toIndentedString(screenName)).append("\n");
    sb.append("    app: ").append(toIndentedString(app)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    ipOrganization: ").append(toIndentedString(ipOrganization)).append("\n");
    sb.append("    geolocation: ").append(toIndentedString(geolocation)).append("\n");
    sb.append("    sdkLibrary: ").append(toIndentedString(sdkLibrary)).append("\n");
    sb.append("    networkConnectivity: ").append(toIndentedString(networkConnectivity)).append("\n");
    sb.append("    mktCampaign: ").append(toIndentedString(mktCampaign)).append("\n");
    sb.append("    session: ").append(toIndentedString(session)).append("\n");
    sb.append("    searchQuery: ").append(toIndentedString(searchQuery)).append("\n");
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

