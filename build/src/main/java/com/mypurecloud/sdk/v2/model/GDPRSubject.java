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
import com.mypurecloud.sdk.v2.model.DialerContactId;
import com.mypurecloud.sdk.v2.model.GDPRJourneyCustomer;
import com.mypurecloud.sdk.v2.model.SocialHandle;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * GDPRSubject
 */

public class GDPRSubject  implements Serializable {
  
  private String name = null;
  private String userId = null;
  private String externalContactId = null;
  private DialerContactId dialerContactId = null;
  private GDPRJourneyCustomer journeyCustomer = null;
  private SocialHandle socialHandle = null;
  private String externalId = null;
  private List<String> addresses = new ArrayList<String>();
  private List<String> phoneNumbers = new ArrayList<String>();
  private List<String> emailAddresses = new ArrayList<String>();

  
  /**
   **/
  public GDPRSubject name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  public GDPRSubject userId(String userId) {
    this.userId = userId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }

  
  /**
   **/
  public GDPRSubject externalContactId(String externalContactId) {
    this.externalContactId = externalContactId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("externalContactId")
  public String getExternalContactId() {
    return externalContactId;
  }
  public void setExternalContactId(String externalContactId) {
    this.externalContactId = externalContactId;
  }

  
  /**
   **/
  public GDPRSubject dialerContactId(DialerContactId dialerContactId) {
    this.dialerContactId = dialerContactId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dialerContactId")
  public DialerContactId getDialerContactId() {
    return dialerContactId;
  }
  public void setDialerContactId(DialerContactId dialerContactId) {
    this.dialerContactId = dialerContactId;
  }

  
  /**
   **/
  public GDPRSubject journeyCustomer(GDPRJourneyCustomer journeyCustomer) {
    this.journeyCustomer = journeyCustomer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("journeyCustomer")
  public GDPRJourneyCustomer getJourneyCustomer() {
    return journeyCustomer;
  }
  public void setJourneyCustomer(GDPRJourneyCustomer journeyCustomer) {
    this.journeyCustomer = journeyCustomer;
  }

  
  /**
   **/
  public GDPRSubject socialHandle(SocialHandle socialHandle) {
    this.socialHandle = socialHandle;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("socialHandle")
  public SocialHandle getSocialHandle() {
    return socialHandle;
  }
  public void setSocialHandle(SocialHandle socialHandle) {
    this.socialHandle = socialHandle;
  }

  
  /**
   **/
  public GDPRSubject externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("externalId")
  public String getExternalId() {
    return externalId;
  }
  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  
  /**
   **/
  public GDPRSubject addresses(List<String> addresses) {
    this.addresses = addresses;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("addresses")
  public List<String> getAddresses() {
    return addresses;
  }
  public void setAddresses(List<String> addresses) {
    this.addresses = addresses;
  }

  
  /**
   **/
  public GDPRSubject phoneNumbers(List<String> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("phoneNumbers")
  public List<String> getPhoneNumbers() {
    return phoneNumbers;
  }
  public void setPhoneNumbers(List<String> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
  }

  
  /**
   **/
  public GDPRSubject emailAddresses(List<String> emailAddresses) {
    this.emailAddresses = emailAddresses;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("emailAddresses")
  public List<String> getEmailAddresses() {
    return emailAddresses;
  }
  public void setEmailAddresses(List<String> emailAddresses) {
    this.emailAddresses = emailAddresses;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GDPRSubject gDPRSubject = (GDPRSubject) o;
    return Objects.equals(this.name, gDPRSubject.name) &&
        Objects.equals(this.userId, gDPRSubject.userId) &&
        Objects.equals(this.externalContactId, gDPRSubject.externalContactId) &&
        Objects.equals(this.dialerContactId, gDPRSubject.dialerContactId) &&
        Objects.equals(this.journeyCustomer, gDPRSubject.journeyCustomer) &&
        Objects.equals(this.socialHandle, gDPRSubject.socialHandle) &&
        Objects.equals(this.externalId, gDPRSubject.externalId) &&
        Objects.equals(this.addresses, gDPRSubject.addresses) &&
        Objects.equals(this.phoneNumbers, gDPRSubject.phoneNumbers) &&
        Objects.equals(this.emailAddresses, gDPRSubject.emailAddresses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, userId, externalContactId, dialerContactId, journeyCustomer, socialHandle, externalId, addresses, phoneNumbers, emailAddresses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GDPRSubject {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    externalContactId: ").append(toIndentedString(externalContactId)).append("\n");
    sb.append("    dialerContactId: ").append(toIndentedString(dialerContactId)).append("\n");
    sb.append("    journeyCustomer: ").append(toIndentedString(journeyCustomer)).append("\n");
    sb.append("    socialHandle: ").append(toIndentedString(socialHandle)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    phoneNumbers: ").append(toIndentedString(phoneNumbers)).append("\n");
    sb.append("    emailAddresses: ").append(toIndentedString(emailAddresses)).append("\n");
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

