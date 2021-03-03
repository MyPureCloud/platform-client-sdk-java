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
 * SmsAddress
 */

public class SmsAddress  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String street = null;
  private String city = null;
  private String region = null;
  private String postalCode = null;
  private String countryCode = null;
  private Boolean validated = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The id of this address.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public SmsAddress name(String name) {
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
   * The number and street address where this address is located.
   **/
  public SmsAddress street(String street) {
    this.street = street;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number and street address where this address is located.")
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
  public SmsAddress city(String city) {
    this.city = city;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The city in which this address is in")
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
  public SmsAddress region(String region) {
    this.region = region;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The state or region this address is in")
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
  public SmsAddress postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The postal code this address is in")
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
  public SmsAddress countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ISO country code of this address")
  @JsonProperty("countryCode")
  public String getCountryCode() {
    return countryCode;
  }
  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  
  @ApiModelProperty(example = "null", value = "In some countries, addresses are validated to comply with local regulation. In those countries, if the address you provide does not pass validation, it will not be accepted as an Address. This value will be true if the Address has been validated, or false for countries that don't require validation or if the Address is non-compliant.")
  @JsonProperty("validated")
  public Boolean getValidated() {
    return validated;
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
    SmsAddress smsAddress = (SmsAddress) o;
    return Objects.equals(this.id, smsAddress.id) &&
        Objects.equals(this.name, smsAddress.name) &&
        Objects.equals(this.street, smsAddress.street) &&
        Objects.equals(this.city, smsAddress.city) &&
        Objects.equals(this.region, smsAddress.region) &&
        Objects.equals(this.postalCode, smsAddress.postalCode) &&
        Objects.equals(this.countryCode, smsAddress.countryCode) &&
        Objects.equals(this.validated, smsAddress.validated) &&
        Objects.equals(this.selfUri, smsAddress.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, street, city, region, postalCode, countryCode, validated, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmsAddress {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    validated: ").append(toIndentedString(validated)).append("\n");
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

