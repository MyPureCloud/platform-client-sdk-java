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
 * LocationAddress
 */

public class LocationAddress  implements Serializable {
  
  private String city = null;
  private String country = null;
  private String countryName = null;
  private String state = null;
  private String street1 = null;
  private String street2 = null;
  private String zipcode = null;

  
  /**
   **/
  public LocationAddress city(String city) {
    this.city = city;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("city")
  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }

  
  /**
   **/
  public LocationAddress country(String country) {
    this.country = country;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("country")
  public String getCountry() {
    return country;
  }
  public void setCountry(String country) {
    this.country = country;
  }

  
  /**
   **/
  public LocationAddress countryName(String countryName) {
    this.countryName = countryName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("countryName")
  public String getCountryName() {
    return countryName;
  }
  public void setCountryName(String countryName) {
    this.countryName = countryName;
  }

  
  /**
   **/
  public LocationAddress state(String state) {
    this.state = state;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("state")
  public String getState() {
    return state;
  }
  public void setState(String state) {
    this.state = state;
  }

  
  /**
   **/
  public LocationAddress street1(String street1) {
    this.street1 = street1;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("street1")
  public String getStreet1() {
    return street1;
  }
  public void setStreet1(String street1) {
    this.street1 = street1;
  }

  
  /**
   **/
  public LocationAddress street2(String street2) {
    this.street2 = street2;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("street2")
  public String getStreet2() {
    return street2;
  }
  public void setStreet2(String street2) {
    this.street2 = street2;
  }

  
  /**
   **/
  public LocationAddress zipcode(String zipcode) {
    this.zipcode = zipcode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("zipcode")
  public String getZipcode() {
    return zipcode;
  }
  public void setZipcode(String zipcode) {
    this.zipcode = zipcode;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocationAddress locationAddress = (LocationAddress) o;
    return Objects.equals(this.city, locationAddress.city) &&
        Objects.equals(this.country, locationAddress.country) &&
        Objects.equals(this.countryName, locationAddress.countryName) &&
        Objects.equals(this.state, locationAddress.state) &&
        Objects.equals(this.street1, locationAddress.street1) &&
        Objects.equals(this.street2, locationAddress.street2) &&
        Objects.equals(this.zipcode, locationAddress.zipcode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, country, countryName, state, street1, street2, zipcode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationAddress {\n");
    
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    countryName: ").append(toIndentedString(countryName)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    street1: ").append(toIndentedString(street1)).append("\n");
    sb.append("    street2: ").append(toIndentedString(street2)).append("\n");
    sb.append("    zipcode: ").append(toIndentedString(zipcode)).append("\n");
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

