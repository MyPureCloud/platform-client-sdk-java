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
import com.mypurecloud.sdk.v2.model.JourneyOutcomeEventsNotificationBrowser;
import com.mypurecloud.sdk.v2.model.JourneyOutcomeEventsNotificationDevice;
import com.mypurecloud.sdk.v2.model.JourneyOutcomeEventsNotificationGeoLocation;
import com.mypurecloud.sdk.v2.model.JourneyOutcomeEventsNotificationMktCampaign;
import com.mypurecloud.sdk.v2.model.JourneyOutcomeEventsNotificationOutcome;
import com.mypurecloud.sdk.v2.model.JourneyOutcomeEventsNotificationReferrer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * JourneyOutcomeEventsNotificationOutcomeAchievedMessage
 */

public class JourneyOutcomeEventsNotificationOutcomeAchievedMessage  implements Serializable {
  
  private JourneyOutcomeEventsNotificationOutcome outcome = null;
  private JourneyOutcomeEventsNotificationBrowser browser = null;
  private Date visitCreatedDate = null;
  private String ipAddress = null;
  private String ipOrganization = null;
  private String userAgentString = null;
  private JourneyOutcomeEventsNotificationDevice device = null;
  private JourneyOutcomeEventsNotificationGeoLocation geolocation = null;
  private JourneyOutcomeEventsNotificationMktCampaign mktCampaign = null;
  private JourneyOutcomeEventsNotificationReferrer visitReferrer = null;

  
  /**
   **/
  public JourneyOutcomeEventsNotificationOutcomeAchievedMessage outcome(JourneyOutcomeEventsNotificationOutcome outcome) {
    this.outcome = outcome;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("outcome")
  public JourneyOutcomeEventsNotificationOutcome getOutcome() {
    return outcome;
  }
  public void setOutcome(JourneyOutcomeEventsNotificationOutcome outcome) {
    this.outcome = outcome;
  }

  
  /**
   **/
  public JourneyOutcomeEventsNotificationOutcomeAchievedMessage browser(JourneyOutcomeEventsNotificationBrowser browser) {
    this.browser = browser;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("browser")
  public JourneyOutcomeEventsNotificationBrowser getBrowser() {
    return browser;
  }
  public void setBrowser(JourneyOutcomeEventsNotificationBrowser browser) {
    this.browser = browser;
  }

  
  /**
   **/
  public JourneyOutcomeEventsNotificationOutcomeAchievedMessage visitCreatedDate(Date visitCreatedDate) {
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
  public JourneyOutcomeEventsNotificationOutcomeAchievedMessage ipAddress(String ipAddress) {
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
  public JourneyOutcomeEventsNotificationOutcomeAchievedMessage ipOrganization(String ipOrganization) {
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
  public JourneyOutcomeEventsNotificationOutcomeAchievedMessage userAgentString(String userAgentString) {
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
  public JourneyOutcomeEventsNotificationOutcomeAchievedMessage device(JourneyOutcomeEventsNotificationDevice device) {
    this.device = device;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("device")
  public JourneyOutcomeEventsNotificationDevice getDevice() {
    return device;
  }
  public void setDevice(JourneyOutcomeEventsNotificationDevice device) {
    this.device = device;
  }

  
  /**
   **/
  public JourneyOutcomeEventsNotificationOutcomeAchievedMessage geolocation(JourneyOutcomeEventsNotificationGeoLocation geolocation) {
    this.geolocation = geolocation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("geolocation")
  public JourneyOutcomeEventsNotificationGeoLocation getGeolocation() {
    return geolocation;
  }
  public void setGeolocation(JourneyOutcomeEventsNotificationGeoLocation geolocation) {
    this.geolocation = geolocation;
  }

  
  /**
   **/
  public JourneyOutcomeEventsNotificationOutcomeAchievedMessage mktCampaign(JourneyOutcomeEventsNotificationMktCampaign mktCampaign) {
    this.mktCampaign = mktCampaign;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("mktCampaign")
  public JourneyOutcomeEventsNotificationMktCampaign getMktCampaign() {
    return mktCampaign;
  }
  public void setMktCampaign(JourneyOutcomeEventsNotificationMktCampaign mktCampaign) {
    this.mktCampaign = mktCampaign;
  }

  
  /**
   **/
  public JourneyOutcomeEventsNotificationOutcomeAchievedMessage visitReferrer(JourneyOutcomeEventsNotificationReferrer visitReferrer) {
    this.visitReferrer = visitReferrer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("visitReferrer")
  public JourneyOutcomeEventsNotificationReferrer getVisitReferrer() {
    return visitReferrer;
  }
  public void setVisitReferrer(JourneyOutcomeEventsNotificationReferrer visitReferrer) {
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
    JourneyOutcomeEventsNotificationOutcomeAchievedMessage journeyOutcomeEventsNotificationOutcomeAchievedMessage = (JourneyOutcomeEventsNotificationOutcomeAchievedMessage) o;
    return Objects.equals(this.outcome, journeyOutcomeEventsNotificationOutcomeAchievedMessage.outcome) &&
        Objects.equals(this.browser, journeyOutcomeEventsNotificationOutcomeAchievedMessage.browser) &&
        Objects.equals(this.visitCreatedDate, journeyOutcomeEventsNotificationOutcomeAchievedMessage.visitCreatedDate) &&
        Objects.equals(this.ipAddress, journeyOutcomeEventsNotificationOutcomeAchievedMessage.ipAddress) &&
        Objects.equals(this.ipOrganization, journeyOutcomeEventsNotificationOutcomeAchievedMessage.ipOrganization) &&
        Objects.equals(this.userAgentString, journeyOutcomeEventsNotificationOutcomeAchievedMessage.userAgentString) &&
        Objects.equals(this.device, journeyOutcomeEventsNotificationOutcomeAchievedMessage.device) &&
        Objects.equals(this.geolocation, journeyOutcomeEventsNotificationOutcomeAchievedMessage.geolocation) &&
        Objects.equals(this.mktCampaign, journeyOutcomeEventsNotificationOutcomeAchievedMessage.mktCampaign) &&
        Objects.equals(this.visitReferrer, journeyOutcomeEventsNotificationOutcomeAchievedMessage.visitReferrer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(outcome, browser, visitCreatedDate, ipAddress, ipOrganization, userAgentString, device, geolocation, mktCampaign, visitReferrer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneyOutcomeEventsNotificationOutcomeAchievedMessage {\n");
    
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

