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
 * PhoneNumber
 */

public class PhoneNumber  implements Serializable {
  
  private String display = null;
  private Long extension = null;
  private Boolean acceptsSMS = null;
  private String userInput = null;
  private String e164 = null;
  private String countryCode = null;

  
  /**
   **/
  public PhoneNumber display(String display) {
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
  public PhoneNumber extension(Long extension) {
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
  public PhoneNumber acceptsSMS(Boolean acceptsSMS) {
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
  public PhoneNumber userInput(String userInput) {
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
  public PhoneNumber e164(String e164) {
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
  public PhoneNumber countryCode(String countryCode) {
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
    PhoneNumber phoneNumber = (PhoneNumber) o;
    return Objects.equals(this.display, phoneNumber.display) &&
        Objects.equals(this.extension, phoneNumber.extension) &&
        Objects.equals(this.acceptsSMS, phoneNumber.acceptsSMS) &&
        Objects.equals(this.userInput, phoneNumber.userInput) &&
        Objects.equals(this.e164, phoneNumber.e164) &&
        Objects.equals(this.countryCode, phoneNumber.countryCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(display, extension, acceptsSMS, userInput, e164, countryCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhoneNumber {\n");
    
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    acceptsSMS: ").append(toIndentedString(acceptsSMS)).append("\n");
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

