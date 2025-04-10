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
 * PasswordRequirements
 */

public class PasswordRequirements  implements Serializable {
  
  private Integer minimumLength = null;
  private Integer minimumDigits = null;
  private Integer minimumLetters = null;
  private Integer minimumUpper = null;
  private Integer minimumLower = null;
  private Integer minimumSpecials = null;
  private Integer minimumAgeSeconds = null;
  private Integer expirationDays = null;

  public PasswordRequirements() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public PasswordRequirements minimumLength(Integer minimumLength) {
    this.minimumLength = minimumLength;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("minimumLength")
  public Integer getMinimumLength() {
    return minimumLength;
  }
  public void setMinimumLength(Integer minimumLength) {
    this.minimumLength = minimumLength;
  }


  /**
   **/
  public PasswordRequirements minimumDigits(Integer minimumDigits) {
    this.minimumDigits = minimumDigits;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("minimumDigits")
  public Integer getMinimumDigits() {
    return minimumDigits;
  }
  public void setMinimumDigits(Integer minimumDigits) {
    this.minimumDigits = minimumDigits;
  }


  /**
   **/
  public PasswordRequirements minimumLetters(Integer minimumLetters) {
    this.minimumLetters = minimumLetters;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("minimumLetters")
  public Integer getMinimumLetters() {
    return minimumLetters;
  }
  public void setMinimumLetters(Integer minimumLetters) {
    this.minimumLetters = minimumLetters;
  }


  /**
   **/
  public PasswordRequirements minimumUpper(Integer minimumUpper) {
    this.minimumUpper = minimumUpper;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("minimumUpper")
  public Integer getMinimumUpper() {
    return minimumUpper;
  }
  public void setMinimumUpper(Integer minimumUpper) {
    this.minimumUpper = minimumUpper;
  }


  /**
   **/
  public PasswordRequirements minimumLower(Integer minimumLower) {
    this.minimumLower = minimumLower;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("minimumLower")
  public Integer getMinimumLower() {
    return minimumLower;
  }
  public void setMinimumLower(Integer minimumLower) {
    this.minimumLower = minimumLower;
  }


  /**
   **/
  public PasswordRequirements minimumSpecials(Integer minimumSpecials) {
    this.minimumSpecials = minimumSpecials;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("minimumSpecials")
  public Integer getMinimumSpecials() {
    return minimumSpecials;
  }
  public void setMinimumSpecials(Integer minimumSpecials) {
    this.minimumSpecials = minimumSpecials;
  }


  /**
   **/
  public PasswordRequirements minimumAgeSeconds(Integer minimumAgeSeconds) {
    this.minimumAgeSeconds = minimumAgeSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("minimumAgeSeconds")
  public Integer getMinimumAgeSeconds() {
    return minimumAgeSeconds;
  }
  public void setMinimumAgeSeconds(Integer minimumAgeSeconds) {
    this.minimumAgeSeconds = minimumAgeSeconds;
  }


  /**
   **/
  public PasswordRequirements expirationDays(Integer expirationDays) {
    this.expirationDays = expirationDays;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("expirationDays")
  public Integer getExpirationDays() {
    return expirationDays;
  }
  public void setExpirationDays(Integer expirationDays) {
    this.expirationDays = expirationDays;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PasswordRequirements passwordRequirements = (PasswordRequirements) o;

    return Objects.equals(this.minimumLength, passwordRequirements.minimumLength) &&
            Objects.equals(this.minimumDigits, passwordRequirements.minimumDigits) &&
            Objects.equals(this.minimumLetters, passwordRequirements.minimumLetters) &&
            Objects.equals(this.minimumUpper, passwordRequirements.minimumUpper) &&
            Objects.equals(this.minimumLower, passwordRequirements.minimumLower) &&
            Objects.equals(this.minimumSpecials, passwordRequirements.minimumSpecials) &&
            Objects.equals(this.minimumAgeSeconds, passwordRequirements.minimumAgeSeconds) &&
            Objects.equals(this.expirationDays, passwordRequirements.expirationDays);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minimumLength, minimumDigits, minimumLetters, minimumUpper, minimumLower, minimumSpecials, minimumAgeSeconds, expirationDays);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PasswordRequirements {\n");
    
    sb.append("    minimumLength: ").append(toIndentedString(minimumLength)).append("\n");
    sb.append("    minimumDigits: ").append(toIndentedString(minimumDigits)).append("\n");
    sb.append("    minimumLetters: ").append(toIndentedString(minimumLetters)).append("\n");
    sb.append("    minimumUpper: ").append(toIndentedString(minimumUpper)).append("\n");
    sb.append("    minimumLower: ").append(toIndentedString(minimumLower)).append("\n");
    sb.append("    minimumSpecials: ").append(toIndentedString(minimumSpecials)).append("\n");
    sb.append("    minimumAgeSeconds: ").append(toIndentedString(minimumAgeSeconds)).append("\n");
    sb.append("    expirationDays: ").append(toIndentedString(expirationDays)).append("\n");
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

