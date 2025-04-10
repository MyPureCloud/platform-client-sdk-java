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
import com.mypurecloud.sdk.v2.model.Browser;
import com.mypurecloud.sdk.v2.model.Device;
import com.mypurecloud.sdk.v2.model.JourneyCampaign;
import com.mypurecloud.sdk.v2.model.JourneyGeolocation;
import com.mypurecloud.sdk.v2.model.OutcomeAchievedEventOutcome;
import com.mypurecloud.sdk.v2.model.Referrer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * OutcomeAchievedEvent
 */

public class OutcomeAchievedEvent  implements Serializable {
  
  private OutcomeAchievedEventOutcome outcome = null;
  private String userAgentString = null;
  private Browser browser = null;
  private Device device = null;
  private JourneyGeolocation geolocation = null;
  private String ipAddress = null;
  private String ipOrganization = null;
  private JourneyCampaign mktCampaign = null;
  private Referrer visitReferrer = null;
  private Date visitCreatedDate = null;

  public OutcomeAchievedEvent() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The outcome achieved.
   **/
  public OutcomeAchievedEvent outcome(OutcomeAchievedEventOutcome outcome) {
    this.outcome = outcome;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The outcome achieved.")
  @JsonProperty("outcome")
  public OutcomeAchievedEventOutcome getOutcome() {
    return outcome;
  }
  public void setOutcome(OutcomeAchievedEventOutcome outcome) {
    this.outcome = outcome;
  }


  /**
   * HTTP User-Agent string (see https://tools.ietf.org/html/rfc1945#section-10.15).
   **/
  public OutcomeAchievedEvent userAgentString(String userAgentString) {
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
  public OutcomeAchievedEvent browser(Browser browser) {
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
  public OutcomeAchievedEvent device(Device device) {
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
  public OutcomeAchievedEvent geolocation(JourneyGeolocation geolocation) {
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
  public OutcomeAchievedEvent ipAddress(String ipAddress) {
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
  public OutcomeAchievedEvent ipOrganization(String ipOrganization) {
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
  public OutcomeAchievedEvent mktCampaign(JourneyCampaign mktCampaign) {
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
  public OutcomeAchievedEvent visitReferrer(Referrer visitReferrer) {
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


  /**
   * When visit was created (e.g. timestamp of the first event in visit). Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public OutcomeAchievedEvent visitCreatedDate(Date visitCreatedDate) {
    this.visitCreatedDate = visitCreatedDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "When visit was created (e.g. timestamp of the first event in visit). Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("visitCreatedDate")
  public Date getVisitCreatedDate() {
    return visitCreatedDate;
  }
  public void setVisitCreatedDate(Date visitCreatedDate) {
    this.visitCreatedDate = visitCreatedDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutcomeAchievedEvent outcomeAchievedEvent = (OutcomeAchievedEvent) o;

    return Objects.equals(this.outcome, outcomeAchievedEvent.outcome) &&
            Objects.equals(this.userAgentString, outcomeAchievedEvent.userAgentString) &&
            Objects.equals(this.browser, outcomeAchievedEvent.browser) &&
            Objects.equals(this.device, outcomeAchievedEvent.device) &&
            Objects.equals(this.geolocation, outcomeAchievedEvent.geolocation) &&
            Objects.equals(this.ipAddress, outcomeAchievedEvent.ipAddress) &&
            Objects.equals(this.ipOrganization, outcomeAchievedEvent.ipOrganization) &&
            Objects.equals(this.mktCampaign, outcomeAchievedEvent.mktCampaign) &&
            Objects.equals(this.visitReferrer, outcomeAchievedEvent.visitReferrer) &&
            Objects.equals(this.visitCreatedDate, outcomeAchievedEvent.visitCreatedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(outcome, userAgentString, browser, device, geolocation, ipAddress, ipOrganization, mktCampaign, visitReferrer, visitCreatedDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutcomeAchievedEvent {\n");
    
    sb.append("    outcome: ").append(toIndentedString(outcome)).append("\n");
    sb.append("    userAgentString: ").append(toIndentedString(userAgentString)).append("\n");
    sb.append("    browser: ").append(toIndentedString(browser)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    geolocation: ").append(toIndentedString(geolocation)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    ipOrganization: ").append(toIndentedString(ipOrganization)).append("\n");
    sb.append("    mktCampaign: ").append(toIndentedString(mktCampaign)).append("\n");
    sb.append("    visitReferrer: ").append(toIndentedString(visitReferrer)).append("\n");
    sb.append("    visitCreatedDate: ").append(toIndentedString(visitCreatedDate)).append("\n");
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

