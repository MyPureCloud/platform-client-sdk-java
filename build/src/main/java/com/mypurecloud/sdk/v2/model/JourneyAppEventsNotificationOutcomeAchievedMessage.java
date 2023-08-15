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
import com.mypurecloud.sdk.v2.model.JourneyAppEventsNotificationAssociatedValue;
import com.mypurecloud.sdk.v2.model.JourneyAppEventsNotificationBrowser;
import com.mypurecloud.sdk.v2.model.JourneyAppEventsNotificationDevice;
import com.mypurecloud.sdk.v2.model.JourneyAppEventsNotificationGeoLocation;
import com.mypurecloud.sdk.v2.model.JourneyAppEventsNotificationMktCampaign;
import com.mypurecloud.sdk.v2.model.JourneyAppEventsNotificationOutcome;
import com.mypurecloud.sdk.v2.model.JourneyAppEventsNotificationReferrer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * JourneyAppEventsNotificationOutcomeAchievedMessage
 */

public class JourneyAppEventsNotificationOutcomeAchievedMessage  implements Serializable {
  
  private JourneyAppEventsNotificationOutcome outcome = null;
  private JourneyAppEventsNotificationBrowser browser = null;
  private Date visitCreatedDate = null;
  private String ipAddress = null;
  private String ipOrganization = null;
  private String userAgentString = null;
  private JourneyAppEventsNotificationDevice device = null;
  private JourneyAppEventsNotificationGeoLocation geolocation = null;
  private JourneyAppEventsNotificationMktCampaign mktCampaign = null;
  private JourneyAppEventsNotificationReferrer visitReferrer = null;
  private JourneyAppEventsNotificationAssociatedValue associatedValue = null;

  
  /**
   **/
  public JourneyAppEventsNotificationOutcomeAchievedMessage outcome(JourneyAppEventsNotificationOutcome outcome) {
    this.outcome = outcome;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("outcome")
  public JourneyAppEventsNotificationOutcome getOutcome() {
    return outcome;
  }
  public void setOutcome(JourneyAppEventsNotificationOutcome outcome) {
    this.outcome = outcome;
  }


  /**
   **/
  public JourneyAppEventsNotificationOutcomeAchievedMessage browser(JourneyAppEventsNotificationBrowser browser) {
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
  public JourneyAppEventsNotificationOutcomeAchievedMessage visitCreatedDate(Date visitCreatedDate) {
    this.visitCreatedDate = visitCreatedDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("visitCreatedDate")
  public Date getVisitCreatedDate() {
    return visitCreatedDate;
  }
  public void setVisitCreatedDate(Date visitCreatedDate) {
    this.visitCreatedDate = visitCreatedDate;
  }


  /**
   **/
  public JourneyAppEventsNotificationOutcomeAchievedMessage ipAddress(String ipAddress) {
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
  public JourneyAppEventsNotificationOutcomeAchievedMessage ipOrganization(String ipOrganization) {
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
  public JourneyAppEventsNotificationOutcomeAchievedMessage userAgentString(String userAgentString) {
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
  public JourneyAppEventsNotificationOutcomeAchievedMessage device(JourneyAppEventsNotificationDevice device) {
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
  public JourneyAppEventsNotificationOutcomeAchievedMessage geolocation(JourneyAppEventsNotificationGeoLocation geolocation) {
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
  public JourneyAppEventsNotificationOutcomeAchievedMessage mktCampaign(JourneyAppEventsNotificationMktCampaign mktCampaign) {
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
  public JourneyAppEventsNotificationOutcomeAchievedMessage visitReferrer(JourneyAppEventsNotificationReferrer visitReferrer) {
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
  public JourneyAppEventsNotificationOutcomeAchievedMessage associatedValue(JourneyAppEventsNotificationAssociatedValue associatedValue) {
    this.associatedValue = associatedValue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("associatedValue")
  public JourneyAppEventsNotificationAssociatedValue getAssociatedValue() {
    return associatedValue;
  }
  public void setAssociatedValue(JourneyAppEventsNotificationAssociatedValue associatedValue) {
    this.associatedValue = associatedValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JourneyAppEventsNotificationOutcomeAchievedMessage journeyAppEventsNotificationOutcomeAchievedMessage = (JourneyAppEventsNotificationOutcomeAchievedMessage) o;

    return Objects.equals(this.outcome, journeyAppEventsNotificationOutcomeAchievedMessage.outcome) &&
            Objects.equals(this.browser, journeyAppEventsNotificationOutcomeAchievedMessage.browser) &&
            Objects.equals(this.visitCreatedDate, journeyAppEventsNotificationOutcomeAchievedMessage.visitCreatedDate) &&
            Objects.equals(this.ipAddress, journeyAppEventsNotificationOutcomeAchievedMessage.ipAddress) &&
            Objects.equals(this.ipOrganization, journeyAppEventsNotificationOutcomeAchievedMessage.ipOrganization) &&
            Objects.equals(this.userAgentString, journeyAppEventsNotificationOutcomeAchievedMessage.userAgentString) &&
            Objects.equals(this.device, journeyAppEventsNotificationOutcomeAchievedMessage.device) &&
            Objects.equals(this.geolocation, journeyAppEventsNotificationOutcomeAchievedMessage.geolocation) &&
            Objects.equals(this.mktCampaign, journeyAppEventsNotificationOutcomeAchievedMessage.mktCampaign) &&
            Objects.equals(this.visitReferrer, journeyAppEventsNotificationOutcomeAchievedMessage.visitReferrer) &&
            Objects.equals(this.associatedValue, journeyAppEventsNotificationOutcomeAchievedMessage.associatedValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(outcome, browser, visitCreatedDate, ipAddress, ipOrganization, userAgentString, device, geolocation, mktCampaign, visitReferrer, associatedValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneyAppEventsNotificationOutcomeAchievedMessage {\n");
    
    sb.append("    outcome: ").append(toIndentedString(outcome)).append("\n");
    sb.append("    browser: ").append(toIndentedString(browser)).append("\n");
    sb.append("    visitCreatedDate: ").append(toIndentedString(visitCreatedDate)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    ipOrganization: ").append(toIndentedString(ipOrganization)).append("\n");
    sb.append("    userAgentString: ").append(toIndentedString(userAgentString)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    geolocation: ").append(toIndentedString(geolocation)).append("\n");
    sb.append("    mktCampaign: ").append(toIndentedString(mktCampaign)).append("\n");
    sb.append("    visitReferrer: ").append(toIndentedString(visitReferrer)).append("\n");
    sb.append("    associatedValue: ").append(toIndentedString(associatedValue)).append("\n");
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

