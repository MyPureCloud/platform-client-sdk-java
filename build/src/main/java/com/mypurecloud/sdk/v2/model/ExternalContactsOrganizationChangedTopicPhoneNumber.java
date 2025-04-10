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
 * ExternalContactsOrganizationChangedTopicPhoneNumber
 */

public class ExternalContactsOrganizationChangedTopicPhoneNumber  implements Serializable {
  
  private String display = null;
  private Long extension = null;
  private Boolean acceptsSMS = null;
  private String userInput = null;
  private String e164 = null;
  private String countryCode = null;
  private String normalizationCountryCode = null;

  public ExternalContactsOrganizationChangedTopicPhoneNumber() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public ExternalContactsOrganizationChangedTopicPhoneNumber display(String display) {
    this.display = display;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("display")
  public String getDisplay() {
    return display;
  }
  public void setDisplay(String display) {
    this.display = display;
  }


  /**
   **/
  public ExternalContactsOrganizationChangedTopicPhoneNumber extension(Long extension) {
    this.extension = extension;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("extension")
  public Long getExtension() {
    return extension;
  }
  public void setExtension(Long extension) {
    this.extension = extension;
  }


  /**
   **/
  public ExternalContactsOrganizationChangedTopicPhoneNumber acceptsSMS(Boolean acceptsSMS) {
    this.acceptsSMS = acceptsSMS;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("acceptsSMS")
  public Boolean getAcceptsSMS() {
    return acceptsSMS;
  }
  public void setAcceptsSMS(Boolean acceptsSMS) {
    this.acceptsSMS = acceptsSMS;
  }


  /**
   **/
  public ExternalContactsOrganizationChangedTopicPhoneNumber userInput(String userInput) {
    this.userInput = userInput;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("userInput")
  public String getUserInput() {
    return userInput;
  }
  public void setUserInput(String userInput) {
    this.userInput = userInput;
  }


  /**
   **/
  public ExternalContactsOrganizationChangedTopicPhoneNumber e164(String e164) {
    this.e164 = e164;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("e164")
  public String getE164() {
    return e164;
  }
  public void setE164(String e164) {
    this.e164 = e164;
  }


  /**
   **/
  public ExternalContactsOrganizationChangedTopicPhoneNumber countryCode(String countryCode) {
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


  /**
   **/
  public ExternalContactsOrganizationChangedTopicPhoneNumber normalizationCountryCode(String normalizationCountryCode) {
    this.normalizationCountryCode = normalizationCountryCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("normalizationCountryCode")
  public String getNormalizationCountryCode() {
    return normalizationCountryCode;
  }
  public void setNormalizationCountryCode(String normalizationCountryCode) {
    this.normalizationCountryCode = normalizationCountryCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalContactsOrganizationChangedTopicPhoneNumber externalContactsOrganizationChangedTopicPhoneNumber = (ExternalContactsOrganizationChangedTopicPhoneNumber) o;

    return Objects.equals(this.display, externalContactsOrganizationChangedTopicPhoneNumber.display) &&
            Objects.equals(this.extension, externalContactsOrganizationChangedTopicPhoneNumber.extension) &&
            Objects.equals(this.acceptsSMS, externalContactsOrganizationChangedTopicPhoneNumber.acceptsSMS) &&
            Objects.equals(this.userInput, externalContactsOrganizationChangedTopicPhoneNumber.userInput) &&
            Objects.equals(this.e164, externalContactsOrganizationChangedTopicPhoneNumber.e164) &&
            Objects.equals(this.countryCode, externalContactsOrganizationChangedTopicPhoneNumber.countryCode) &&
            Objects.equals(this.normalizationCountryCode, externalContactsOrganizationChangedTopicPhoneNumber.normalizationCountryCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(display, extension, acceptsSMS, userInput, e164, countryCode, normalizationCountryCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalContactsOrganizationChangedTopicPhoneNumber {\n");
    
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    acceptsSMS: ").append(toIndentedString(acceptsSMS)).append("\n");
    sb.append("    userInput: ").append(toIndentedString(userInput)).append("\n");
    sb.append("    e164: ").append(toIndentedString(e164)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    normalizationCountryCode: ").append(toIndentedString(normalizationCountryCode)).append("\n");
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

