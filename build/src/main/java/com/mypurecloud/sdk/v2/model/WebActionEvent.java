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
import com.mypurecloud.sdk.v2.model.ActionEventActionMap;
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import com.mypurecloud.sdk.v2.model.Browser;
import com.mypurecloud.sdk.v2.model.Device;
import com.mypurecloud.sdk.v2.model.EventAction;
import com.mypurecloud.sdk.v2.model.JourneyCampaign;
import com.mypurecloud.sdk.v2.model.JourneyGeolocation;
import com.mypurecloud.sdk.v2.model.Referrer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * WebActionEvent
 */

public class WebActionEvent  implements Serializable {
  
  private EventAction action = null;
  private ActionEventActionMap actionMap = null;
  private AddressableEntityRef actionTarget = null;
  private Long timeToDisposition = null;
  private String errorCode = null;
  private String errorMessage = null;
  private String userAgentString = null;
  private Browser browser = null;
  private Device device = null;
  private JourneyGeolocation geolocation = null;
  private String ipAddress = null;
  private String ipOrganization = null;
  private JourneyCampaign mktCampaign = null;
  private Referrer visitReferrer = null;

  
  /**
   * The action that triggered the event.
   **/
  public WebActionEvent action(EventAction action) {
    this.action = action;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The action that triggered the event.")
  @JsonProperty("action")
  public EventAction getAction() {
    return action;
  }
  public void setAction(EventAction action) {
    this.action = action;
  }


  /**
   * The action map that triggered the action.
   **/
  public WebActionEvent actionMap(ActionEventActionMap actionMap) {
    this.actionMap = actionMap;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The action map that triggered the action.")
  @JsonProperty("actionMap")
  public ActionEventActionMap getActionMap() {
    return actionMap;
  }
  public void setActionMap(ActionEventActionMap actionMap) {
    this.actionMap = actionMap;
  }


  /**
   * The target for engagement actions.
   **/
  public WebActionEvent actionTarget(AddressableEntityRef actionTarget) {
    this.actionTarget = actionTarget;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The target for engagement actions.")
  @JsonProperty("actionTarget")
  public AddressableEntityRef getActionTarget() {
    return actionTarget;
  }
  public void setActionTarget(AddressableEntityRef actionTarget) {
    this.actionTarget = actionTarget;
  }


  /**
   * Milliseconds elapsed until the action is disposed.
   **/
  public WebActionEvent timeToDisposition(Long timeToDisposition) {
    this.timeToDisposition = timeToDisposition;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Milliseconds elapsed until the action is disposed.")
  @JsonProperty("timeToDisposition")
  public Long getTimeToDisposition() {
    return timeToDisposition;
  }
  public void setTimeToDisposition(Long timeToDisposition) {
    this.timeToDisposition = timeToDisposition;
  }


  /**
   * Code of the error returned when the action fails.
   **/
  public WebActionEvent errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Code of the error returned when the action fails.")
  @JsonProperty("errorCode")
  public String getErrorCode() {
    return errorCode;
  }
  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }


  /**
   * Message of the error returned when the action fails.
   **/
  public WebActionEvent errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Message of the error returned when the action fails.")
  @JsonProperty("errorMessage")
  public String getErrorMessage() {
    return errorMessage;
  }
  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }


  /**
   * HTTP User-Agent string (see https://tools.ietf.org/html/rfc1945#section-10.15).
   **/
  public WebActionEvent userAgentString(String userAgentString) {
    this.userAgentString = userAgentString;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "HTTP User-Agent string (see https://tools.ietf.org/html/rfc1945#section-10.15).")
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
  public WebActionEvent browser(Browser browser) {
    this.browser = browser;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Customer's browser.")
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
  public WebActionEvent device(Device device) {
    this.device = device;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Customer's device.")
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
  public WebActionEvent geolocation(JourneyGeolocation geolocation) {
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
   * Visitor's IP address.
   **/
  public WebActionEvent ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Visitor's IP address.")
  @JsonProperty("ipAddress")
  public String getIpAddress() {
    return ipAddress;
  }
  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }


  /**
   * Visitor's IP-based organization or ISP name.
   **/
  public WebActionEvent ipOrganization(String ipOrganization) {
    this.ipOrganization = ipOrganization;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Visitor's IP-based organization or ISP name.")
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
  public WebActionEvent mktCampaign(JourneyCampaign mktCampaign) {
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
   * Visit's referrer.
   **/
  public WebActionEvent visitReferrer(Referrer visitReferrer) {
    this.visitReferrer = visitReferrer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Visit's referrer.")
  @JsonProperty("visitReferrer")
  public Referrer getVisitReferrer() {
    return visitReferrer;
  }
  public void setVisitReferrer(Referrer visitReferrer) {
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
    WebActionEvent webActionEvent = (WebActionEvent) o;

    return Objects.equals(this.action, webActionEvent.action) &&
            Objects.equals(this.actionMap, webActionEvent.actionMap) &&
            Objects.equals(this.actionTarget, webActionEvent.actionTarget) &&
            Objects.equals(this.timeToDisposition, webActionEvent.timeToDisposition) &&
            Objects.equals(this.errorCode, webActionEvent.errorCode) &&
            Objects.equals(this.errorMessage, webActionEvent.errorMessage) &&
            Objects.equals(this.userAgentString, webActionEvent.userAgentString) &&
            Objects.equals(this.browser, webActionEvent.browser) &&
            Objects.equals(this.device, webActionEvent.device) &&
            Objects.equals(this.geolocation, webActionEvent.geolocation) &&
            Objects.equals(this.ipAddress, webActionEvent.ipAddress) &&
            Objects.equals(this.ipOrganization, webActionEvent.ipOrganization) &&
            Objects.equals(this.mktCampaign, webActionEvent.mktCampaign) &&
            Objects.equals(this.visitReferrer, webActionEvent.visitReferrer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, actionMap, actionTarget, timeToDisposition, errorCode, errorMessage, userAgentString, browser, device, geolocation, ipAddress, ipOrganization, mktCampaign, visitReferrer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebActionEvent {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    actionMap: ").append(toIndentedString(actionMap)).append("\n");
    sb.append("    actionTarget: ").append(toIndentedString(actionTarget)).append("\n");
    sb.append("    timeToDisposition: ").append(toIndentedString(timeToDisposition)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    userAgentString: ").append(toIndentedString(userAgentString)).append("\n");
    sb.append("    browser: ").append(toIndentedString(browser)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    geolocation: ").append(toIndentedString(geolocation)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    ipOrganization: ").append(toIndentedString(ipOrganization)).append("\n");
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

