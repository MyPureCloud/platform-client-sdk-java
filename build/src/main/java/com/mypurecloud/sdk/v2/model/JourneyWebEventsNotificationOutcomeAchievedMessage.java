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
import com.mypurecloud.sdk.v2.model.JourneyWebEventsNotificationBrowser;
import com.mypurecloud.sdk.v2.model.JourneyWebEventsNotificationDevice;
import com.mypurecloud.sdk.v2.model.JourneyWebEventsNotificationGeoLocation;
import com.mypurecloud.sdk.v2.model.JourneyWebEventsNotificationMktCampaign;
import com.mypurecloud.sdk.v2.model.JourneyWebEventsNotificationOutcome;
import com.mypurecloud.sdk.v2.model.JourneyWebEventsNotificationReferrer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * JourneyWebEventsNotificationOutcomeAchievedMessage
 */

public class JourneyWebEventsNotificationOutcomeAchievedMessage  implements Serializable {
  
  private JourneyWebEventsNotificationOutcome outcome = null;
  private JourneyWebEventsNotificationBrowser browser = null;
  private Date visitCreatedDate = null;
  private String ipAddress = null;
  private String ipOrganization = null;
  private String userAgentString = null;
  private JourneyWebEventsNotificationDevice device = null;
  private JourneyWebEventsNotificationGeoLocation geolocation = null;
  private JourneyWebEventsNotificationMktCampaign mktCampaign = null;
  private JourneyWebEventsNotificationReferrer visitReferrer = null;

  
  /**
   **/
  public JourneyWebEventsNotificationOutcomeAchievedMessage outcome(JourneyWebEventsNotificationOutcome outcome) {
    this.outcome = outcome;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("outcome")
  public JourneyWebEventsNotificationOutcome getOutcome() {
    return outcome;
  }
  public void setOutcome(JourneyWebEventsNotificationOutcome outcome) {
    this.outcome = outcome;
  }

  
  /**
   **/
  public JourneyWebEventsNotificationOutcomeAchievedMessage browser(JourneyWebEventsNotificationBrowser browser) {
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
  public JourneyWebEventsNotificationOutcomeAchievedMessage visitCreatedDate(Date visitCreatedDate) {
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
  public JourneyWebEventsNotificationOutcomeAchievedMessage ipAddress(String ipAddress) {
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
  public JourneyWebEventsNotificationOutcomeAchievedMessage ipOrganization(String ipOrganization) {
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
  public JourneyWebEventsNotificationOutcomeAchievedMessage userAgentString(String userAgentString) {
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
  public JourneyWebEventsNotificationOutcomeAchievedMessage device(JourneyWebEventsNotificationDevice device) {
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
  public JourneyWebEventsNotificationOutcomeAchievedMessage geolocation(JourneyWebEventsNotificationGeoLocation geolocation) {
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
  public JourneyWebEventsNotificationOutcomeAchievedMessage mktCampaign(JourneyWebEventsNotificationMktCampaign mktCampaign) {
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
  public JourneyWebEventsNotificationOutcomeAchievedMessage visitReferrer(JourneyWebEventsNotificationReferrer visitReferrer) {
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
    JourneyWebEventsNotificationOutcomeAchievedMessage journeyWebEventsNotificationOutcomeAchievedMessage = (JourneyWebEventsNotificationOutcomeAchievedMessage) o;
    return Objects.equals(this.outcome, journeyWebEventsNotificationOutcomeAchievedMessage.outcome) &&
        Objects.equals(this.browser, journeyWebEventsNotificationOutcomeAchievedMessage.browser) &&
        Objects.equals(this.visitCreatedDate, journeyWebEventsNotificationOutcomeAchievedMessage.visitCreatedDate) &&
        Objects.equals(this.ipAddress, journeyWebEventsNotificationOutcomeAchievedMessage.ipAddress) &&
        Objects.equals(this.ipOrganization, journeyWebEventsNotificationOutcomeAchievedMessage.ipOrganization) &&
        Objects.equals(this.userAgentString, journeyWebEventsNotificationOutcomeAchievedMessage.userAgentString) &&
        Objects.equals(this.device, journeyWebEventsNotificationOutcomeAchievedMessage.device) &&
        Objects.equals(this.geolocation, journeyWebEventsNotificationOutcomeAchievedMessage.geolocation) &&
        Objects.equals(this.mktCampaign, journeyWebEventsNotificationOutcomeAchievedMessage.mktCampaign) &&
        Objects.equals(this.visitReferrer, journeyWebEventsNotificationOutcomeAchievedMessage.visitReferrer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(outcome, browser, visitCreatedDate, ipAddress, ipOrganization, userAgentString, device, geolocation, mktCampaign, visitReferrer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneyWebEventsNotificationOutcomeAchievedMessage {\n");
    
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

