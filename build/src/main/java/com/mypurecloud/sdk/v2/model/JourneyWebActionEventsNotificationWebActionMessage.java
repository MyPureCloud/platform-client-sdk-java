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
import com.mypurecloud.sdk.v2.model.JourneyWebActionEventsNotificationActionMap;
import com.mypurecloud.sdk.v2.model.JourneyWebActionEventsNotificationActionTarget;
import com.mypurecloud.sdk.v2.model.JourneyWebActionEventsNotificationBrowser;
import com.mypurecloud.sdk.v2.model.JourneyWebActionEventsNotificationDevice;
import com.mypurecloud.sdk.v2.model.JourneyWebActionEventsNotificationEventAction;
import com.mypurecloud.sdk.v2.model.JourneyWebActionEventsNotificationGeoLocation;
import com.mypurecloud.sdk.v2.model.JourneyWebActionEventsNotificationMktCampaign;
import com.mypurecloud.sdk.v2.model.JourneyWebActionEventsNotificationReferrer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * JourneyWebActionEventsNotificationWebActionMessage
 */

public class JourneyWebActionEventsNotificationWebActionMessage  implements Serializable {
  
  private JourneyWebActionEventsNotificationEventAction action = null;
  private JourneyWebActionEventsNotificationActionTarget actionTarget = null;
  private JourneyWebActionEventsNotificationActionMap actionMap = null;
  private String errorCode = null;
  private String errorMessage = null;
  private String userAgentString = null;
  private String ipAddress = null;
  private String ipOrganization = null;
  private JourneyWebActionEventsNotificationBrowser browser = null;
  private JourneyWebActionEventsNotificationDevice device = null;
  private JourneyWebActionEventsNotificationGeoLocation geolocation = null;
  private JourneyWebActionEventsNotificationMktCampaign mktCampaign = null;
  private JourneyWebActionEventsNotificationReferrer visitReferrer = null;

  
  /**
   **/
  public JourneyWebActionEventsNotificationWebActionMessage action(JourneyWebActionEventsNotificationEventAction action) {
    this.action = action;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("action")
  public JourneyWebActionEventsNotificationEventAction getAction() {
    return action;
  }
  public void setAction(JourneyWebActionEventsNotificationEventAction action) {
    this.action = action;
  }

  
  /**
   **/
  public JourneyWebActionEventsNotificationWebActionMessage actionTarget(JourneyWebActionEventsNotificationActionTarget actionTarget) {
    this.actionTarget = actionTarget;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("actionTarget")
  public JourneyWebActionEventsNotificationActionTarget getActionTarget() {
    return actionTarget;
  }
  public void setActionTarget(JourneyWebActionEventsNotificationActionTarget actionTarget) {
    this.actionTarget = actionTarget;
  }

  
  /**
   **/
  public JourneyWebActionEventsNotificationWebActionMessage actionMap(JourneyWebActionEventsNotificationActionMap actionMap) {
    this.actionMap = actionMap;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("actionMap")
  public JourneyWebActionEventsNotificationActionMap getActionMap() {
    return actionMap;
  }
  public void setActionMap(JourneyWebActionEventsNotificationActionMap actionMap) {
    this.actionMap = actionMap;
  }

  
  /**
   **/
  public JourneyWebActionEventsNotificationWebActionMessage errorCode(String errorCode) {
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
  public JourneyWebActionEventsNotificationWebActionMessage errorMessage(String errorMessage) {
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
  public JourneyWebActionEventsNotificationWebActionMessage userAgentString(String userAgentString) {
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
  public JourneyWebActionEventsNotificationWebActionMessage ipAddress(String ipAddress) {
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
  public JourneyWebActionEventsNotificationWebActionMessage ipOrganization(String ipOrganization) {
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
  public JourneyWebActionEventsNotificationWebActionMessage browser(JourneyWebActionEventsNotificationBrowser browser) {
    this.browser = browser;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("browser")
  public JourneyWebActionEventsNotificationBrowser getBrowser() {
    return browser;
  }
  public void setBrowser(JourneyWebActionEventsNotificationBrowser browser) {
    this.browser = browser;
  }

  
  /**
   **/
  public JourneyWebActionEventsNotificationWebActionMessage device(JourneyWebActionEventsNotificationDevice device) {
    this.device = device;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("device")
  public JourneyWebActionEventsNotificationDevice getDevice() {
    return device;
  }
  public void setDevice(JourneyWebActionEventsNotificationDevice device) {
    this.device = device;
  }

  
  /**
   **/
  public JourneyWebActionEventsNotificationWebActionMessage geolocation(JourneyWebActionEventsNotificationGeoLocation geolocation) {
    this.geolocation = geolocation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("geolocation")
  public JourneyWebActionEventsNotificationGeoLocation getGeolocation() {
    return geolocation;
  }
  public void setGeolocation(JourneyWebActionEventsNotificationGeoLocation geolocation) {
    this.geolocation = geolocation;
  }

  
  /**
   **/
  public JourneyWebActionEventsNotificationWebActionMessage mktCampaign(JourneyWebActionEventsNotificationMktCampaign mktCampaign) {
    this.mktCampaign = mktCampaign;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("mktCampaign")
  public JourneyWebActionEventsNotificationMktCampaign getMktCampaign() {
    return mktCampaign;
  }
  public void setMktCampaign(JourneyWebActionEventsNotificationMktCampaign mktCampaign) {
    this.mktCampaign = mktCampaign;
  }

  
  /**
   **/
  public JourneyWebActionEventsNotificationWebActionMessage visitReferrer(JourneyWebActionEventsNotificationReferrer visitReferrer) {
    this.visitReferrer = visitReferrer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("visitReferrer")
  public JourneyWebActionEventsNotificationReferrer getVisitReferrer() {
    return visitReferrer;
  }
  public void setVisitReferrer(JourneyWebActionEventsNotificationReferrer visitReferrer) {
    this.visitReferrer = visitReferrer;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JourneyWebActionEventsNotificationWebActionMessage journeyWebActionEventsNotificationWebActionMessage = (JourneyWebActionEventsNotificationWebActionMessage) o;
    return Objects.equals(this.action, journeyWebActionEventsNotificationWebActionMessage.action) &&
        Objects.equals(this.actionTarget, journeyWebActionEventsNotificationWebActionMessage.actionTarget) &&
        Objects.equals(this.actionMap, journeyWebActionEventsNotificationWebActionMessage.actionMap) &&
        Objects.equals(this.errorCode, journeyWebActionEventsNotificationWebActionMessage.errorCode) &&
        Objects.equals(this.errorMessage, journeyWebActionEventsNotificationWebActionMessage.errorMessage) &&
        Objects.equals(this.userAgentString, journeyWebActionEventsNotificationWebActionMessage.userAgentString) &&
        Objects.equals(this.ipAddress, journeyWebActionEventsNotificationWebActionMessage.ipAddress) &&
        Objects.equals(this.ipOrganization, journeyWebActionEventsNotificationWebActionMessage.ipOrganization) &&
        Objects.equals(this.browser, journeyWebActionEventsNotificationWebActionMessage.browser) &&
        Objects.equals(this.device, journeyWebActionEventsNotificationWebActionMessage.device) &&
        Objects.equals(this.geolocation, journeyWebActionEventsNotificationWebActionMessage.geolocation) &&
        Objects.equals(this.mktCampaign, journeyWebActionEventsNotificationWebActionMessage.mktCampaign) &&
        Objects.equals(this.visitReferrer, journeyWebActionEventsNotificationWebActionMessage.visitReferrer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, actionTarget, actionMap, errorCode, errorMessage, userAgentString, ipAddress, ipOrganization, browser, device, geolocation, mktCampaign, visitReferrer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneyWebActionEventsNotificationWebActionMessage {\n");
    
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

