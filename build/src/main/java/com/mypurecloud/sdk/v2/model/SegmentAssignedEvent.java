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
import com.mypurecloud.sdk.v2.model.Browser;
import com.mypurecloud.sdk.v2.model.Device;
import com.mypurecloud.sdk.v2.model.JourneyCampaign;
import com.mypurecloud.sdk.v2.model.JourneyGeolocation;
import com.mypurecloud.sdk.v2.model.Referrer;
import com.mypurecloud.sdk.v2.model.SegmentAssignedEventSegment;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * SegmentAssignedEvent
 */

public class SegmentAssignedEvent  implements Serializable {
  
  private SegmentAssignedEventSegment segment = null;
  private String userAgentString = null;
  private Browser browser = null;
  private Device device = null;
  private JourneyGeolocation geolocation = null;
  private String ipAddress = null;
  private String ipOrganization = null;
  private JourneyCampaign mktCampaign = null;
  private Referrer visitReferrer = null;
  private Date visitCreatedDate = null;

  
  /**
   * The segment that was matched.
   **/
  public SegmentAssignedEvent segment(SegmentAssignedEventSegment segment) {
    this.segment = segment;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The segment that was matched.")
  @JsonProperty("segment")
  public SegmentAssignedEventSegment getSegment() {
    return segment;
  }
  public void setSegment(SegmentAssignedEventSegment segment) {
    this.segment = segment;
  }


  /**
   * HTTP User-Agent string (see https://tools.ietf.org/html/rfc1945#section-10.15).
   **/
  public SegmentAssignedEvent userAgentString(String userAgentString) {
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
  public SegmentAssignedEvent browser(Browser browser) {
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
  public SegmentAssignedEvent device(Device device) {
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
  public SegmentAssignedEvent geolocation(JourneyGeolocation geolocation) {
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
  public SegmentAssignedEvent ipAddress(String ipAddress) {
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
  public SegmentAssignedEvent ipOrganization(String ipOrganization) {
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
  public SegmentAssignedEvent mktCampaign(JourneyCampaign mktCampaign) {
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
  public SegmentAssignedEvent visitReferrer(Referrer visitReferrer) {
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
  public SegmentAssignedEvent visitCreatedDate(Date visitCreatedDate) {
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
    SegmentAssignedEvent segmentAssignedEvent = (SegmentAssignedEvent) o;

    return Objects.equals(this.segment, segmentAssignedEvent.segment) &&
            Objects.equals(this.userAgentString, segmentAssignedEvent.userAgentString) &&
            Objects.equals(this.browser, segmentAssignedEvent.browser) &&
            Objects.equals(this.device, segmentAssignedEvent.device) &&
            Objects.equals(this.geolocation, segmentAssignedEvent.geolocation) &&
            Objects.equals(this.ipAddress, segmentAssignedEvent.ipAddress) &&
            Objects.equals(this.ipOrganization, segmentAssignedEvent.ipOrganization) &&
            Objects.equals(this.mktCampaign, segmentAssignedEvent.mktCampaign) &&
            Objects.equals(this.visitReferrer, segmentAssignedEvent.visitReferrer) &&
            Objects.equals(this.visitCreatedDate, segmentAssignedEvent.visitCreatedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(segment, userAgentString, browser, device, geolocation, ipAddress, ipOrganization, mktCampaign, visitReferrer, visitCreatedDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SegmentAssignedEvent {\n");
    
    sb.append("    segment: ").append(toIndentedString(segment)).append("\n");
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

