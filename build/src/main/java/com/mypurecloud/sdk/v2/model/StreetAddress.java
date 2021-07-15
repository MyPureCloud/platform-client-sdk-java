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
 * StreetAddress
 */

public class StreetAddress  implements Serializable {
  
  private String country = null;
  private String a1 = null;
  private String a3 = null;
  private String RD = null;
  private String HNO = null;
  private String LOC = null;
  private String NAM = null;
  private String PC = null;

  
  /**
   * 2 Letter Country code, like US or GB
   **/
  public StreetAddress country(String country) {
    this.country = country;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "2 Letter Country code, like US or GB")
  @JsonProperty("country")
  public String getCountry() {
    return country;
  }
  public void setCountry(String country) {
    this.country = country;
  }

  
  /**
   * State or Province
   **/
  public StreetAddress a1(String a1) {
    this.a1 = a1;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "State or Province")
  @JsonProperty("A1")
  public String getA1() {
    return a1;
  }
  public void setA1(String a1) {
    this.a1 = a1;
  }

  
  /**
   * City or township
   **/
  public StreetAddress a3(String a3) {
    this.a3 = a3;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "City or township")
  @JsonProperty("A3")
  public String getA3() {
    return a3;
  }
  public void setA3(String a3) {
    this.a3 = a3;
  }

  
  /**
   * Number and street
   **/
  public StreetAddress RD(String RD) {
    this.RD = RD;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Number and street")
  @JsonProperty("RD")
  public String getRD() {
    return RD;
  }
  public void setRD(String RD) {
    this.RD = RD;
  }

  
  /**
   * House Number
   **/
  public StreetAddress HNO(String HNO) {
    this.HNO = HNO;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "House Number")
  @JsonProperty("HNO")
  public String getHNO() {
    return HNO;
  }
  public void setHNO(String HNO) {
    this.HNO = HNO;
  }

  
  /**
   * extra location info like suite 300
   **/
  public StreetAddress LOC(String LOC) {
    this.LOC = LOC;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "extra location info like suite 300")
  @JsonProperty("LOC")
  public String getLOC() {
    return LOC;
  }
  public void setLOC(String LOC) {
    this.LOC = LOC;
  }

  
  /**
   * Name of the customer
   **/
  public StreetAddress NAM(String NAM) {
    this.NAM = NAM;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Name of the customer")
  @JsonProperty("NAM")
  public String getNAM() {
    return NAM;
  }
  public void setNAM(String NAM) {
    this.NAM = NAM;
  }

  
  /**
   * Postal code
   **/
  public StreetAddress PC(String PC) {
    this.PC = PC;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Postal code")
  @JsonProperty("PC")
  public String getPC() {
    return PC;
  }
  public void setPC(String PC) {
    this.PC = PC;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StreetAddress streetAddress = (StreetAddress) o;
    return Objects.equals(this.country, streetAddress.country) &&
        Objects.equals(this.a1, streetAddress.a1) &&
        Objects.equals(this.a3, streetAddress.a3) &&
        Objects.equals(this.RD, streetAddress.RD) &&
        Objects.equals(this.HNO, streetAddress.HNO) &&
        Objects.equals(this.LOC, streetAddress.LOC) &&
        Objects.equals(this.NAM, streetAddress.NAM) &&
        Objects.equals(this.PC, streetAddress.PC);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, a1, a3, RD, HNO, LOC, NAM, PC);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StreetAddress {\n");
    
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    a1: ").append(toIndentedString(a1)).append("\n");
    sb.append("    a3: ").append(toIndentedString(a3)).append("\n");
    sb.append("    RD: ").append(toIndentedString(RD)).append("\n");
    sb.append("    HNO: ").append(toIndentedString(HNO)).append("\n");
    sb.append("    LOC: ").append(toIndentedString(LOC)).append("\n");
    sb.append("    NAM: ").append(toIndentedString(NAM)).append("\n");
    sb.append("    PC: ").append(toIndentedString(PC)).append("\n");
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

