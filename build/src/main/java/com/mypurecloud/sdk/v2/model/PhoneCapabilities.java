package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * PhoneCapabilities
 */

public class PhoneCapabilities  implements Serializable {
  
  private Boolean provisions = null;
  private Boolean registers = null;
  private Boolean dualRegisters = null;
  private String hardwareIdType = null;
  private Boolean allowReboot = null;
  private Boolean noRebalance = null;

  
  /**
   **/
  public PhoneCapabilities provisions(Boolean provisions) {
    this.provisions = provisions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("provisions")
  public Boolean getProvisions() {
    return provisions;
  }
  public void setProvisions(Boolean provisions) {
    this.provisions = provisions;
  }


  /**
   **/
  public PhoneCapabilities registers(Boolean registers) {
    this.registers = registers;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("registers")
  public Boolean getRegisters() {
    return registers;
  }
  public void setRegisters(Boolean registers) {
    this.registers = registers;
  }


  /**
   **/
  public PhoneCapabilities dualRegisters(Boolean dualRegisters) {
    this.dualRegisters = dualRegisters;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dualRegisters")
  public Boolean getDualRegisters() {
    return dualRegisters;
  }
  public void setDualRegisters(Boolean dualRegisters) {
    this.dualRegisters = dualRegisters;
  }


  /**
   **/
  public PhoneCapabilities hardwareIdType(String hardwareIdType) {
    this.hardwareIdType = hardwareIdType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("hardwareIdType")
  public String getHardwareIdType() {
    return hardwareIdType;
  }
  public void setHardwareIdType(String hardwareIdType) {
    this.hardwareIdType = hardwareIdType;
  }


  /**
   **/
  public PhoneCapabilities allowReboot(Boolean allowReboot) {
    this.allowReboot = allowReboot;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("allowReboot")
  public Boolean getAllowReboot() {
    return allowReboot;
  }
  public void setAllowReboot(Boolean allowReboot) {
    this.allowReboot = allowReboot;
  }


  /**
   **/
  public PhoneCapabilities noRebalance(Boolean noRebalance) {
    this.noRebalance = noRebalance;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("noRebalance")
  public Boolean getNoRebalance() {
    return noRebalance;
  }
  public void setNoRebalance(Boolean noRebalance) {
    this.noRebalance = noRebalance;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhoneCapabilities phoneCapabilities = (PhoneCapabilities) o;
    return Objects.equals(this.provisions, phoneCapabilities.provisions) &&
        Objects.equals(this.registers, phoneCapabilities.registers) &&
        Objects.equals(this.dualRegisters, phoneCapabilities.dualRegisters) &&
        Objects.equals(this.hardwareIdType, phoneCapabilities.hardwareIdType) &&
        Objects.equals(this.allowReboot, phoneCapabilities.allowReboot) &&
        Objects.equals(this.noRebalance, phoneCapabilities.noRebalance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(provisions, registers, dualRegisters, hardwareIdType, allowReboot, noRebalance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhoneCapabilities {\n");
    
    sb.append("    provisions: ").append(toIndentedString(provisions)).append("\n");
    sb.append("    registers: ").append(toIndentedString(registers)).append("\n");
    sb.append("    dualRegisters: ").append(toIndentedString(dualRegisters)).append("\n");
    sb.append("    hardwareIdType: ").append(toIndentedString(hardwareIdType)).append("\n");
    sb.append("    allowReboot: ").append(toIndentedString(allowReboot)).append("\n");
    sb.append("    noRebalance: ").append(toIndentedString(noRebalance)).append("\n");
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

