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
import com.mypurecloud.sdk.v2.model.JourneyAppEventsNotificationActionMap;
import com.mypurecloud.sdk.v2.model.JourneyAppEventsNotificationActionTarget;
import com.mypurecloud.sdk.v2.model.JourneyAppEventsNotificationBrowser;
import com.mypurecloud.sdk.v2.model.JourneyAppEventsNotificationDevice;
import com.mypurecloud.sdk.v2.model.JourneyAppEventsNotificationEventAction;
import com.mypurecloud.sdk.v2.model.JourneyAppEventsNotificationGeoLocation;
import com.mypurecloud.sdk.v2.model.JourneyAppEventsNotificationMktCampaign;
import com.mypurecloud.sdk.v2.model.JourneyAppEventsNotificationReferrer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * JourneyAppEventsNotificationWebActionMessage
 */

public class JourneyAppEventsNotificationWebActionMessage  implements Serializable {
  
  private JourneyAppEventsNotificationEventAction action = null;
  private JourneyAppEventsNotificationActionTarget actionTarget = null;
  private JourneyAppEventsNotificationActionMap actionMap = null;
  private String errorCode = null;
  private String errorMessage = null;
  private String userAgentString = null;
  private String ipAddress = null;
  private String ipOrganization = null;
  private JourneyAppEventsNotificationBrowser browser = null;
  private JourneyAppEventsNotificationDevice device = null;
  private JourneyAppEventsNotificationGeoLocation geolocation = null;
  private JourneyAppEventsNotificationMktCampaign mktCampaign = null;
  private JourneyAppEventsNotificationReferrer visitReferrer = null;
  private Long timeToDisposition = null;

  public JourneyAppEventsNotificationWebActionMessage() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public JourneyAppEventsNotificationWebActionMessage action(JourneyAppEventsNotificationEventAction action) {
    this.action = action;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("action")
  public JourneyAppEventsNotificationEventAction getAction() {
    return action;
  }
  public void setAction(JourneyAppEventsNotificationEventAction action) {
    this.action = action;
  }


  /**
   **/
  public JourneyAppEventsNotificationWebActionMessage actionTarget(JourneyAppEventsNotificationActionTarget actionTarget) {
    this.actionTarget = actionTarget;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("actionTarget")
  public JourneyAppEventsNotificationActionTarget getActionTarget() {
    return actionTarget;
  }
  public void setActionTarget(JourneyAppEventsNotificationActionTarget actionTarget) {
    this.actionTarget = actionTarget;
  }


  /**
   **/
  public JourneyAppEventsNotificationWebActionMessage actionMap(JourneyAppEventsNotificationActionMap actionMap) {
    this.actionMap = actionMap;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("actionMap")
  public JourneyAppEventsNotificationActionMap getActionMap() {
    return actionMap;
  }
  public void setActionMap(JourneyAppEventsNotificationActionMap actionMap) {
    this.actionMap = actionMap;
  }


  /**
   **/
  public JourneyAppEventsNotificationWebActionMessage errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("errorCode")
  public String getErrorCode() {
    return errorCode;
  }
  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }


  /**
   **/
  public JourneyAppEventsNotificationWebActionMessage errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("errorMessage")
  public String getErrorMessage() {
    return errorMessage;
  }
  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }


  /**
   **/
  public JourneyAppEventsNotificationWebActionMessage userAgentString(String userAgentString) {
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
  public JourneyAppEventsNotificationWebActionMessage ipAddress(String ipAddress) {
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
  public JourneyAppEventsNotificationWebActionMessage ipOrganization(String ipOrganization) {
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
  public JourneyAppEventsNotificationWebActionMessage browser(JourneyAppEventsNotificationBrowser browser) {
    this.browser = browser;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("browser")
  public JourneyAppEventsNotificationBrowser getBrowser() {
    return browser;
  }
  public void setBrowser(JourneyAppEventsNotificationBrowser browser) {
    this.browser = browser;
  }


  /**
   **/
  public JourneyAppEventsNotificationWebActionMessage device(JourneyAppEventsNotificationDevice device) {
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
  public JourneyAppEventsNotificationWebActionMessage geolocation(JourneyAppEventsNotificationGeoLocation geolocation) {
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
  public JourneyAppEventsNotificationWebActionMessage mktCampaign(JourneyAppEventsNotificationMktCampaign mktCampaign) {
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
  public JourneyAppEventsNotificationWebActionMessage visitReferrer(JourneyAppEventsNotificationReferrer visitReferrer) {
    this.visitReferrer = visitReferrer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("visitReferrer")
  public JourneyAppEventsNotificationReferrer getVisitReferrer() {
    return visitReferrer;
  }
  public void setVisitReferrer(JourneyAppEventsNotificationReferrer visitReferrer) {
    this.visitReferrer = visitReferrer;
  }


  /**
   **/
  public JourneyAppEventsNotificationWebActionMessage timeToDisposition(Long timeToDisposition) {
    this.timeToDisposition = timeToDisposition;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("timeToDisposition")
  public Long getTimeToDisposition() {
    return timeToDisposition;
  }
  public void setTimeToDisposition(Long timeToDisposition) {
    this.timeToDisposition = timeToDisposition;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JourneyAppEventsNotificationWebActionMessage journeyAppEventsNotificationWebActionMessage = (JourneyAppEventsNotificationWebActionMessage) o;

    return Objects.equals(this.action, journeyAppEventsNotificationWebActionMessage.action) &&
            Objects.equals(this.actionTarget, journeyAppEventsNotificationWebActionMessage.actionTarget) &&
            Objects.equals(this.actionMap, journeyAppEventsNotificationWebActionMessage.actionMap) &&
            Objects.equals(this.errorCode, journeyAppEventsNotificationWebActionMessage.errorCode) &&
            Objects.equals(this.errorMessage, journeyAppEventsNotificationWebActionMessage.errorMessage) &&
            Objects.equals(this.userAgentString, journeyAppEventsNotificationWebActionMessage.userAgentString) &&
            Objects.equals(this.ipAddress, journeyAppEventsNotificationWebActionMessage.ipAddress) &&
            Objects.equals(this.ipOrganization, journeyAppEventsNotificationWebActionMessage.ipOrganization) &&
            Objects.equals(this.browser, journeyAppEventsNotificationWebActionMessage.browser) &&
            Objects.equals(this.device, journeyAppEventsNotificationWebActionMessage.device) &&
            Objects.equals(this.geolocation, journeyAppEventsNotificationWebActionMessage.geolocation) &&
            Objects.equals(this.mktCampaign, journeyAppEventsNotificationWebActionMessage.mktCampaign) &&
            Objects.equals(this.visitReferrer, journeyAppEventsNotificationWebActionMessage.visitReferrer) &&
            Objects.equals(this.timeToDisposition, journeyAppEventsNotificationWebActionMessage.timeToDisposition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, actionTarget, actionMap, errorCode, errorMessage, userAgentString, ipAddress, ipOrganization, browser, device, geolocation, mktCampaign, visitReferrer, timeToDisposition);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneyAppEventsNotificationWebActionMessage {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    actionTarget: ").append(toIndentedString(actionTarget)).append("\n");
    sb.append("    actionMap: ").append(toIndentedString(actionMap)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    userAgentString: ").append(toIndentedString(userAgentString)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    ipOrganization: ").append(toIndentedString(ipOrganization)).append("\n");
    sb.append("    browser: ").append(toIndentedString(browser)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    geolocation: ").append(toIndentedString(geolocation)).append("\n");
    sb.append("    mktCampaign: ").append(toIndentedString(mktCampaign)).append("\n");
    sb.append("    visitReferrer: ").append(toIndentedString(visitReferrer)).append("\n");
    sb.append("    timeToDisposition: ").append(toIndentedString(timeToDisposition)).append("\n");
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

