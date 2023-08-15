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
import com.mypurecloud.sdk.v2.model.JourneyAppEventsNotificationApp;
import com.mypurecloud.sdk.v2.model.JourneyAppEventsNotificationCustomEventAttribute;
import com.mypurecloud.sdk.v2.model.JourneyAppEventsNotificationDevice;
import com.mypurecloud.sdk.v2.model.JourneyAppEventsNotificationGeoLocation;
import com.mypurecloud.sdk.v2.model.JourneyAppEventsNotificationMktCampaign;
import com.mypurecloud.sdk.v2.model.JourneyAppEventsNotificationNetworkConnectivity;
import com.mypurecloud.sdk.v2.model.JourneyAppEventsNotificationSdkLibrary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * JourneyAppEventsNotificationAppMessage
 */

public class JourneyAppEventsNotificationAppMessage  implements Serializable {
  
  private String eventName = null;
  private String screenName = null;
  private JourneyAppEventsNotificationApp app = null;
  private JourneyAppEventsNotificationDevice device = null;
  private String ipAddress = null;
  private String ipOrganization = null;
  private JourneyAppEventsNotificationGeoLocation geolocation = null;
  private JourneyAppEventsNotificationSdkLibrary sdkLibrary = null;
  private JourneyAppEventsNotificationNetworkConnectivity networkConnectivity = null;
  private JourneyAppEventsNotificationMktCampaign mktCampaign = null;
  private String searchQuery = null;
  private Map<String, JourneyAppEventsNotificationCustomEventAttribute> attributes = null;
  private Map<String, JourneyAppEventsNotificationCustomEventAttribute> traits = null;

  
  /**
   **/
  public JourneyAppEventsNotificationAppMessage eventName(String eventName) {
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
  public JourneyAppEventsNotificationAppMessage screenName(String screenName) {
    this.screenName = screenName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("screenName")
  public String getScreenName() {
    return screenName;
  }
  public void setScreenName(String screenName) {
    this.screenName = screenName;
  }


  /**
   **/
  public JourneyAppEventsNotificationAppMessage app(JourneyAppEventsNotificationApp app) {
    this.app = app;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("app")
  public JourneyAppEventsNotificationApp getApp() {
    return app;
  }
  public void setApp(JourneyAppEventsNotificationApp app) {
    this.app = app;
  }


  /**
   **/
  public JourneyAppEventsNotificationAppMessage device(JourneyAppEventsNotificationDevice device) {
    this.device = device;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("device")
  public JourneyAppEventsNotificationDevice getDevice() {
    return device;
  }
  public void setDevice(JourneyAppEventsNotificationDevice device) {
    this.device = device;
  }


  /**
   **/
  public JourneyAppEventsNotificationAppMessage ipAddress(String ipAddress) {
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
  public JourneyAppEventsNotificationAppMessage ipOrganization(String ipOrganization) {
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
  public JourneyAppEventsNotificationAppMessage geolocation(JourneyAppEventsNotificationGeoLocation geolocation) {
    this.geolocation = geolocation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("geolocation")
  public JourneyAppEventsNotificationGeoLocation getGeolocation() {
    return geolocation;
  }
  public void setGeolocation(JourneyAppEventsNotificationGeoLocation geolocation) {
    this.geolocation = geolocation;
  }


  /**
   **/
  public JourneyAppEventsNotificationAppMessage sdkLibrary(JourneyAppEventsNotificationSdkLibrary sdkLibrary) {
    this.sdkLibrary = sdkLibrary;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sdkLibrary")
  public JourneyAppEventsNotificationSdkLibrary getSdkLibrary() {
    return sdkLibrary;
  }
  public void setSdkLibrary(JourneyAppEventsNotificationSdkLibrary sdkLibrary) {
    this.sdkLibrary = sdkLibrary;
  }


  /**
   **/
  public JourneyAppEventsNotificationAppMessage networkConnectivity(JourneyAppEventsNotificationNetworkConnectivity networkConnectivity) {
    this.networkConnectivity = networkConnectivity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("networkConnectivity")
  public JourneyAppEventsNotificationNetworkConnectivity getNetworkConnectivity() {
    return networkConnectivity;
  }
  public void setNetworkConnectivity(JourneyAppEventsNotificationNetworkConnectivity networkConnectivity) {
    this.networkConnectivity = networkConnectivity;
  }


  /**
   **/
  public JourneyAppEventsNotificationAppMessage mktCampaign(JourneyAppEventsNotificationMktCampaign mktCampaign) {
    this.mktCampaign = mktCampaign;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("mktCampaign")
  public JourneyAppEventsNotificationMktCampaign getMktCampaign() {
    return mktCampaign;
  }
  public void setMktCampaign(JourneyAppEventsNotificationMktCampaign mktCampaign) {
    this.mktCampaign = mktCampaign;
  }


  /**
   **/
  public JourneyAppEventsNotificationAppMessage searchQuery(String searchQuery) {
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
  public JourneyAppEventsNotificationAppMessage attributes(Map<String, JourneyAppEventsNotificationCustomEventAttribute> attributes) {
    this.attributes = attributes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("attributes")
  public Map<String, JourneyAppEventsNotificationCustomEventAttribute> getAttributes() {
    return attributes;
  }
  public void setAttributes(Map<String, JourneyAppEventsNotificationCustomEventAttribute> attributes) {
    this.attributes = attributes;
  }


  /**
   **/
  public JourneyAppEventsNotificationAppMessage traits(Map<String, JourneyAppEventsNotificationCustomEventAttribute> traits) {
    this.traits = traits;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("traits")
  public Map<String, JourneyAppEventsNotificationCustomEventAttribute> getTraits() {
    return traits;
  }
  public void setTraits(Map<String, JourneyAppEventsNotificationCustomEventAttribute> traits) {
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
    JourneyAppEventsNotificationAppMessage journeyAppEventsNotificationAppMessage = (JourneyAppEventsNotificationAppMessage) o;

    return Objects.equals(this.eventName, journeyAppEventsNotificationAppMessage.eventName) &&
            Objects.equals(this.screenName, journeyAppEventsNotificationAppMessage.screenName) &&
            Objects.equals(this.app, journeyAppEventsNotificationAppMessage.app) &&
            Objects.equals(this.device, journeyAppEventsNotificationAppMessage.device) &&
            Objects.equals(this.ipAddress, journeyAppEventsNotificationAppMessage.ipAddress) &&
            Objects.equals(this.ipOrganization, journeyAppEventsNotificationAppMessage.ipOrganization) &&
            Objects.equals(this.geolocation, journeyAppEventsNotificationAppMessage.geolocation) &&
            Objects.equals(this.sdkLibrary, journeyAppEventsNotificationAppMessage.sdkLibrary) &&
            Objects.equals(this.networkConnectivity, journeyAppEventsNotificationAppMessage.networkConnectivity) &&
            Objects.equals(this.mktCampaign, journeyAppEventsNotificationAppMessage.mktCampaign) &&
            Objects.equals(this.searchQuery, journeyAppEventsNotificationAppMessage.searchQuery) &&
            Objects.equals(this.attributes, journeyAppEventsNotificationAppMessage.attributes) &&
            Objects.equals(this.traits, journeyAppEventsNotificationAppMessage.traits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventName, screenName, app, device, ipAddress, ipOrganization, geolocation, sdkLibrary, networkConnectivity, mktCampaign, searchQuery, attributes, traits);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneyAppEventsNotificationAppMessage {\n");
    
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

