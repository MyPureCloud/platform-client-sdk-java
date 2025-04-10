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
 * PhoneNumber
 */

public class PhoneNumber  implements Serializable {
  
  private String display = null;
  private Long extension = null;
  private Boolean acceptsSMS = null;
  private String normalizationCountryCode = null;
  private String userInput = null;
  private String e164 = null;
  private String countryCode = null;

  public PhoneNumber() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The displayed form of the phone number string. Users should input the phone number in this field, but it will be altered by the API on write. If the phone number can be read as E164, the value will be replaced with international formatted-version of the number. If the number cannot be read as E164, the value will be preserved as-is. In both cases, the provided input string will be copied to the userInput field.
   **/
  public PhoneNumber display(String display) {
    this.display = display;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The displayed form of the phone number string. Users should input the phone number in this field, but it will be altered by the API on write. If the phone number can be read as E164, the value will be replaced with international formatted-version of the number. If the number cannot be read as E164, the value will be preserved as-is. In both cases, the provided input string will be copied to the userInput field.")
  @JsonProperty("display")
  public String getDisplay() {
    return display;
  }
  public void setDisplay(String display) {
    this.display = display;
  }


  /**
   * An optional extension for the provided phone number.
   **/
  public PhoneNumber extension(Long extension) {
    this.extension = extension;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "An optional extension for the provided phone number.")
  @JsonProperty("extension")
  public Long getExtension() {
    return extension;
  }
  public void setExtension(Long extension) {
    this.extension = extension;
  }


  /**
   * Whether this phone number can accept SMS messages.
   **/
  public PhoneNumber acceptsSMS(Boolean acceptsSMS) {
    this.acceptsSMS = acceptsSMS;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether this phone number can accept SMS messages.")
  @JsonProperty("acceptsSMS")
  public Boolean getAcceptsSMS() {
    return acceptsSMS;
  }
  public void setAcceptsSMS(Boolean acceptsSMS) {
    this.acceptsSMS = acceptsSMS;
  }


  /**
   * The country code that will be used for E164 conversion of a provided phone number. If the country code is omitted from the provided phone number, the country code provided in this field will be used during the E164 conversion attempt. If this field is left empty, the default country code for any provided phone number that does not explicitly include a country code is assumed to be +1 (North America).
   **/
  public PhoneNumber normalizationCountryCode(String normalizationCountryCode) {
    this.normalizationCountryCode = normalizationCountryCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The country code that will be used for E164 conversion of a provided phone number. If the country code is omitted from the provided phone number, the country code provided in this field will be used during the E164 conversion attempt. If this field is left empty, the default country code for any provided phone number that does not explicitly include a country code is assumed to be +1 (North America).")
  @JsonProperty("normalizationCountryCode")
  public String getNormalizationCountryCode() {
    return normalizationCountryCode;
  }
  public void setNormalizationCountryCode(String normalizationCountryCode) {
    this.normalizationCountryCode = normalizationCountryCode;
  }


  /**
   * The user-inputted phone number string that was provided to the display field on write. This field is not user-writeable and will always be set by the system.
   **/
  public PhoneNumber userInput(String userInput) {
    this.userInput = userInput;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user-inputted phone number string that was provided to the display field on write. This field is not user-writeable and will always be set by the system.")
  @JsonProperty("userInput")
  public String getUserInput() {
    return userInput;
  }
  public void setUserInput(String userInput) {
    this.userInput = userInput;
  }


  /**
   * The E164-formatted form of the provided phone number. This field is not user-writeable and will only be set when the provided phone number could be read as E164.
   **/
  public PhoneNumber e164(String e164) {
    this.e164 = e164;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The E164-formatted form of the provided phone number. This field is not user-writeable and will only be set when the provided phone number could be read as E164.")
  @JsonProperty("e164")
  public String getE164() {
    return e164;
  }
  public void setE164(String e164) {
    this.e164 = e164;
  }


  /**
   * The detected country code from the provided phone number. This field is not user-writeable and will only be set when the provided phone number could be read as E164.
   **/
  public PhoneNumber countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The detected country code from the provided phone number. This field is not user-writeable and will only be set when the provided phone number could be read as E164.")
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
    PhoneNumber phoneNumber = (PhoneNumber) o;

    return Objects.equals(this.display, phoneNumber.display) &&
            Objects.equals(this.extension, phoneNumber.extension) &&
            Objects.equals(this.acceptsSMS, phoneNumber.acceptsSMS) &&
            Objects.equals(this.normalizationCountryCode, phoneNumber.normalizationCountryCode) &&
            Objects.equals(this.userInput, phoneNumber.userInput) &&
            Objects.equals(this.e164, phoneNumber.e164) &&
            Objects.equals(this.countryCode, phoneNumber.countryCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(display, extension, acceptsSMS, normalizationCountryCode, userInput, e164, countryCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhoneNumber {\n");
    
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    acceptsSMS: ").append(toIndentedString(acceptsSMS)).append("\n");
    sb.append("    normalizationCountryCode: ").append(toIndentedString(normalizationCountryCode)).append("\n");
    sb.append("    userInput: ").append(toIndentedString(userInput)).append("\n");
    sb.append("    e164: ").append(toIndentedString(e164)).append("\n");
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

