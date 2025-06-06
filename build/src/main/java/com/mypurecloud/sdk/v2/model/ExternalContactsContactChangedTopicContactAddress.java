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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ExternalContactsContactChangedTopicContactAddress
 */

public class ExternalContactsContactChangedTopicContactAddress  implements Serializable {
  
  private String address1 = null;
  private String address2 = null;
  private String city = null;
  private String state = null;
  private String postalCode = null;
  private String countryCode = null;

  public ExternalContactsContactChangedTopicContactAddress() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public ExternalContactsContactChangedTopicContactAddress address1(String address1) {
    this.address1 = address1;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("address1")
  public String getAddress1() {
    return address1;
  }
  public void setAddress1(String address1) {
    this.address1 = address1;
  }


  /**
   **/
  public ExternalContactsContactChangedTopicContactAddress address2(String address2) {
    this.address2 = address2;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("address2")
  public String getAddress2() {
    return address2;
  }
  public void setAddress2(String address2) {
    this.address2 = address2;
  }


  /**
   **/
  public ExternalContactsContactChangedTopicContactAddress city(String city) {
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
  public ExternalContactsContactChangedTopicContactAddress state(String state) {
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
  public ExternalContactsContactChangedTopicContactAddress postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("postalCode")
  public String getPostalCode() {
    return postalCode;
  }
  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  /**
   **/
  public ExternalContactsContactChangedTopicContactAddress countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("countryCode")
  public String getCountryCode() {
    return countryCode;
  }
  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalContactsContactChangedTopicContactAddress externalContactsContactChangedTopicContactAddress = (ExternalContactsContactChangedTopicContactAddress) o;

    return Objects.equals(this.address1, externalContactsContactChangedTopicContactAddress.address1) &&
            Objects.equals(this.address2, externalContactsContactChangedTopicContactAddress.address2) &&
            Objects.equals(this.city, externalContactsContactChangedTopicContactAddress.city) &&
            Objects.equals(this.state, externalContactsContactChangedTopicContactAddress.state) &&
            Objects.equals(this.postalCode, externalContactsContactChangedTopicContactAddress.postalCode) &&
            Objects.equals(this.countryCode, externalContactsContactChangedTopicContactAddress.countryCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address1, address2, city, state, postalCode, countryCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalContactsContactChangedTopicContactAddress {\n");
    
    sb.append("    address1: ").append(toIndentedString(address1)).append("\n");
    sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
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

