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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * SmsAddressProvision
 */

public class SmsAddressProvision  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String street = null;
  private String city = null;
  private String region = null;
  private String postalCode = null;
  private String countryCode = null;
  private Boolean autoCorrectAddress = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   * Name associated with this address
   **/
  public SmsAddressProvision name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Name associated with this address")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The number and street address where this address is located.
   **/
  public SmsAddressProvision street(String street) {
    this.street = street;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number and street address where this address is located.")
  @JsonProperty("street")
  public String getStreet() {
    return street;
  }
  public void setStreet(String street) {
    this.street = street;
  }

  
  /**
   * The city in which this address is in
   **/
  public SmsAddressProvision city(String city) {
    this.city = city;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The city in which this address is in")
  @JsonProperty("city")
  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }

  
  /**
   * The state or region this address is in
   **/
  public SmsAddressProvision region(String region) {
    this.region = region;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The state or region this address is in")
  @JsonProperty("region")
  public String getRegion() {
    return region;
  }
  public void setRegion(String region) {
    this.region = region;
  }

  
  /**
   * The postal code this address is in
   **/
  public SmsAddressProvision postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The postal code this address is in")
  @JsonProperty("postalCode")
  public String getPostalCode() {
    return postalCode;
  }
  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  
  /**
   * The ISO country code of this address
   **/
  public SmsAddressProvision countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ISO country code of this address")
  @JsonProperty("countryCode")
  public String getCountryCode() {
    return countryCode;
  }
  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  
  /**
   * This is used when the address is created. If the value is not set or true, then the system will, if necessary, auto-correct the address you provide. Set this value to false if the system should not auto-correct the address.
   **/
  public SmsAddressProvision autoCorrectAddress(Boolean autoCorrectAddress) {
    this.autoCorrectAddress = autoCorrectAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This is used when the address is created. If the value is not set or true, then the system will, if necessary, auto-correct the address you provide. Set this value to false if the system should not auto-correct the address.")
  @JsonProperty("autoCorrectAddress")
  public Boolean getAutoCorrectAddress() {
    return autoCorrectAddress;
  }
  public void setAutoCorrectAddress(Boolean autoCorrectAddress) {
    this.autoCorrectAddress = autoCorrectAddress;
  }

  
  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmsAddressProvision smsAddressProvision = (SmsAddressProvision) o;
    return Objects.equals(this.id, smsAddressProvision.id) &&
        Objects.equals(this.name, smsAddressProvision.name) &&
        Objects.equals(this.street, smsAddressProvision.street) &&
        Objects.equals(this.city, smsAddressProvision.city) &&
        Objects.equals(this.region, smsAddressProvision.region) &&
        Objects.equals(this.postalCode, smsAddressProvision.postalCode) &&
        Objects.equals(this.countryCode, smsAddressProvision.countryCode) &&
        Objects.equals(this.autoCorrectAddress, smsAddressProvision.autoCorrectAddress) &&
        Objects.equals(this.selfUri, smsAddressProvision.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, street, city, region, postalCode, countryCode, autoCorrectAddress, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmsAddressProvision {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    autoCorrectAddress: ").append(toIndentedString(autoCorrectAddress)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

