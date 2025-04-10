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
import com.mypurecloud.sdk.v2.model.Device;
import com.mypurecloud.sdk.v2.model.JourneyApp;
import com.mypurecloud.sdk.v2.model.JourneyCampaign;
import com.mypurecloud.sdk.v2.model.JourneyGeolocation;
import com.mypurecloud.sdk.v2.model.NetworkConnectivity;
import com.mypurecloud.sdk.v2.model.SdkLibrary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * AppEvent
 */

public class AppEvent  implements Serializable {
  
  private String eventName = null;
  private String screenName = null;
  private JourneyApp app = null;
  private Device device = null;
  private String ipAddress = null;
  private String ipOrganization = null;
  private JourneyGeolocation geolocation = null;
  private SdkLibrary sdkLibrary = null;
  private NetworkConnectivity networkConnectivity = null;
  private JourneyCampaign mktCampaign = null;
  private String searchQuery = null;
  private Map<String, CustomEventAttribute> attributes = null;
  private Map<String, CustomEventAttribute> traits = null;

  public AppEvent() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Represents the action the customer performed. A good event name is typically an object followed by the action performed in past tense (e.g. screen_viewed, order_completed, user_registered).
   **/
  public AppEvent eventName(String eventName) {
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
  public AppEvent screenName(String screenName) {
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
  public AppEvent app(JourneyApp app) {
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
  public AppEvent device(Device device) {
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
   * Customer's IP address. May be null if the business configures the tracker to not collect IP addresses.
   **/
  public AppEvent ipAddress(String ipAddress) {
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
  public AppEvent ipOrganization(String ipOrganization) {
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
  public AppEvent geolocation(JourneyGeolocation geolocation) {
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
  public AppEvent sdkLibrary(SdkLibrary sdkLibrary) {
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
  public AppEvent networkConnectivity(NetworkConnectivity networkConnectivity) {
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
  public AppEvent mktCampaign(JourneyCampaign mktCampaign) {
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
   * Represents the keywords in a customer search query.
   **/
  public AppEvent searchQuery(String searchQuery) {
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
  public AppEvent attributes(Map<String, CustomEventAttribute> attributes) {
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
   * Traits are attributes intrinsic to the customer that may be sent in selected events. Examples are email, name, phone.
   **/
  public AppEvent traits(Map<String, CustomEventAttribute> traits) {
    this.traits = traits;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Traits are attributes intrinsic to the customer that may be sent in selected events. Examples are email, name, phone.")
  @JsonProperty("traits")
  public Map<String, CustomEventAttribute> getTraits() {
    return traits;
  }
  public void setTraits(Map<String, CustomEventAttribute> traits) {
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
    AppEvent appEvent = (AppEvent) o;

    return Objects.equals(this.eventName, appEvent.eventName) &&
            Objects.equals(this.screenName, appEvent.screenName) &&
            Objects.equals(this.app, appEvent.app) &&
            Objects.equals(this.device, appEvent.device) &&
            Objects.equals(this.ipAddress, appEvent.ipAddress) &&
            Objects.equals(this.ipOrganization, appEvent.ipOrganization) &&
            Objects.equals(this.geolocation, appEvent.geolocation) &&
            Objects.equals(this.sdkLibrary, appEvent.sdkLibrary) &&
            Objects.equals(this.networkConnectivity, appEvent.networkConnectivity) &&
            Objects.equals(this.mktCampaign, appEvent.mktCampaign) &&
            Objects.equals(this.searchQuery, appEvent.searchQuery) &&
            Objects.equals(this.attributes, appEvent.attributes) &&
            Objects.equals(this.traits, appEvent.traits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventName, screenName, app, device, ipAddress, ipOrganization, geolocation, sdkLibrary, networkConnectivity, mktCampaign, searchQuery, attributes, traits);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppEvent {\n");
    
    sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
    sb.append("    screenName: ").append(toIndentedString(screenName)).append("\n");
    sb.append("    app: ").append(toIndentedString(app)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    ipOrganization: ").append(toIndentedString(ipOrganization)).append("\n");
    sb.append("    geolocation: ").append(toIndentedString(geolocation)).append("\n");
    sb.append("    sdkLibrary: ").append(toIndentedString(sdkLibrary)).append("\n");
    sb.append("    networkConnectivity: ").append(toIndentedString(networkConnectivity)).append("\n");
    sb.append("    mktCampaign: ").append(toIndentedString(mktCampaign)).append("\n");
    sb.append("    searchQuery: ").append(toIndentedString(searchQuery)).append("\n");
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

