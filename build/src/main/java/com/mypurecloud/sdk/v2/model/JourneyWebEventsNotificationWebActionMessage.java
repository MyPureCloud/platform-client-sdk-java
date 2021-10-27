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
import com.mypurecloud.sdk.v2.model.JourneyWebEventsNotificationActionMap;
import com.mypurecloud.sdk.v2.model.JourneyWebEventsNotificationActionTarget;
import com.mypurecloud.sdk.v2.model.JourneyWebEventsNotificationBrowser;
import com.mypurecloud.sdk.v2.model.JourneyWebEventsNotificationDevice;
import com.mypurecloud.sdk.v2.model.JourneyWebEventsNotificationEventAction;
import com.mypurecloud.sdk.v2.model.JourneyWebEventsNotificationGeoLocation;
import com.mypurecloud.sdk.v2.model.JourneyWebEventsNotificationMktCampaign;
import com.mypurecloud.sdk.v2.model.JourneyWebEventsNotificationReferrer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * JourneyWebEventsNotificationWebActionMessage
 */

public class JourneyWebEventsNotificationWebActionMessage  implements Serializable {
  
  private JourneyWebEventsNotificationEventAction action = null;
  private JourneyWebEventsNotificationActionTarget actionTarget = null;
  private JourneyWebEventsNotificationActionMap actionMap = null;
  private String errorCode = null;
  private String errorMessage = null;
  private String userAgentString = null;
  private String ipAddress = null;
  private String ipOrganization = null;
  private JourneyWebEventsNotificationBrowser browser = null;
  private JourneyWebEventsNotificationDevice device = null;
  private JourneyWebEventsNotificationGeoLocation geolocation = null;
  private JourneyWebEventsNotificationMktCampaign mktCampaign = null;
  private JourneyWebEventsNotificationReferrer visitReferrer = null;

  
  /**
   **/
  public JourneyWebEventsNotificationWebActionMessage action(JourneyWebEventsNotificationEventAction action) {
    this.action = action;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("action")
  public JourneyWebEventsNotificationEventAction getAction() {
    return action;
  }
  public void setAction(JourneyWebEventsNotificationEventAction action) {
    this.action = action;
  }

  
  /**
   **/
  public JourneyWebEventsNotificationWebActionMessage actionTarget(JourneyWebEventsNotificationActionTarget actionTarget) {
    this.actionTarget = actionTarget;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("actionTarget")
  public JourneyWebEventsNotificationActionTarget getActionTarget() {
    return actionTarget;
  }
  public void setActionTarget(JourneyWebEventsNotificationActionTarget actionTarget) {
    this.actionTarget = actionTarget;
  }

  
  /**
   **/
  public JourneyWebEventsNotificationWebActionMessage actionMap(JourneyWebEventsNotificationActionMap actionMap) {
    this.actionMap = actionMap;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("actionMap")
  public JourneyWebEventsNotificationActionMap getActionMap() {
    return actionMap;
  }
  public void setActionMap(JourneyWebEventsNotificationActionMap actionMap) {
    this.actionMap = actionMap;
  }

  
  /**
   **/
  public JourneyWebEventsNotificationWebActionMessage errorCode(String errorCode) {
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
  public JourneyWebEventsNotificationWebActionMessage errorMessage(String errorMessage) {
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
  public JourneyWebEventsNotificationWebActionMessage userAgentString(String userAgentString) {
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
  public JourneyWebEventsNotificationWebActionMessage ipAddress(String ipAddress) {
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
  public JourneyWebEventsNotificationWebActionMessage ipOrganization(String ipOrganization) {
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
  public JourneyWebEventsNotificationWebActionMessage browser(JourneyWebEventsNotificationBrowser browser) {
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
  public JourneyWebEventsNotificationWebActionMessage device(JourneyWebEventsNotificationDevice device) {
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
  public JourneyWebEventsNotificationWebActionMessage geolocation(JourneyWebEventsNotificationGeoLocation geolocation) {
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
  public JourneyWebEventsNotificationWebActionMessage mktCampaign(JourneyWebEventsNotificationMktCampaign mktCampaign) {
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
  public JourneyWebEventsNotificationWebActionMessage visitReferrer(JourneyWebEventsNotificationReferrer visitReferrer) {
    this.visitReferrer = visitReferrer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("visitReferrer")
  public JourneyWebEventsNotificationReferrer getVisitReferrer() {
    return visitReferrer;
  }
  public void setVisitReferrer(JourneyWebEventsNotificationReferrer visitReferrer) {
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
    JourneyWebEventsNotificationWebActionMessage journeyWebEventsNotificationWebActionMessage = (JourneyWebEventsNotificationWebActionMessage) o;
    return Objects.equals(this.action, journeyWebEventsNotificationWebActionMessage.action) &&
        Objects.equals(this.actionTarget, journeyWebEventsNotificationWebActionMessage.actionTarget) &&
        Objects.equals(this.actionMap, journeyWebEventsNotificationWebActionMessage.actionMap) &&
        Objects.equals(this.errorCode, journeyWebEventsNotificationWebActionMessage.errorCode) &&
        Objects.equals(this.errorMessage, journeyWebEventsNotificationWebActionMessage.errorMessage) &&
        Objects.equals(this.userAgentString, journeyWebEventsNotificationWebActionMessage.userAgentString) &&
        Objects.equals(this.ipAddress, journeyWebEventsNotificationWebActionMessage.ipAddress) &&
        Objects.equals(this.ipOrganization, journeyWebEventsNotificationWebActionMessage.ipOrganization) &&
        Objects.equals(this.browser, journeyWebEventsNotificationWebActionMessage.browser) &&
        Objects.equals(this.device, journeyWebEventsNotificationWebActionMessage.device) &&
        Objects.equals(this.geolocation, journeyWebEventsNotificationWebActionMessage.geolocation) &&
        Objects.equals(this.mktCampaign, journeyWebEventsNotificationWebActionMessage.mktCampaign) &&
        Objects.equals(this.visitReferrer, journeyWebEventsNotificationWebActionMessage.visitReferrer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, actionTarget, actionMap, errorCode, errorMessage, userAgentString, ipAddress, ipOrganization, browser, device, geolocation, mktCampaign, visitReferrer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneyWebEventsNotificationWebActionMessage {\n");
    
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

