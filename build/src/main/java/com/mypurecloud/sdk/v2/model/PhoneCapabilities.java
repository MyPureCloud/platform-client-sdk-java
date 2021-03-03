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
import java.util.ArrayList;
import java.util.List;

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
  private Boolean noCloudProvisioning = null;

  private static class MediaCodecsEnumDeserializer extends StdDeserializer<MediaCodecsEnum> {
    public MediaCodecsEnumDeserializer() {
      super(MediaCodecsEnumDeserializer.class);
    }

    @Override
    public MediaCodecsEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return MediaCodecsEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets mediaCodecs
   */
 @JsonDeserialize(using = MediaCodecsEnumDeserializer.class)
  public enum MediaCodecsEnum {
    AUDIO_OPUS("audio/opus"),
    AUDIO_PCMU("audio/pcmu"),
    AUDIO_PCMA("audio/pcma"),
    AUDIO_G729("audio/g729"),
    AUDIO_G722("audio/g722");

    private String value;

    MediaCodecsEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static MediaCodecsEnum fromString(String key) {
      if (key == null) return null;

      for (MediaCodecsEnum value : MediaCodecsEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return MediaCodecsEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<MediaCodecsEnum> mediaCodecs = new ArrayList<MediaCodecsEnum>();
  private Boolean cdm = null;

  
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

  
  /**
   **/
  public PhoneCapabilities noCloudProvisioning(Boolean noCloudProvisioning) {
    this.noCloudProvisioning = noCloudProvisioning;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("noCloudProvisioning")
  public Boolean getNoCloudProvisioning() {
    return noCloudProvisioning;
  }
  public void setNoCloudProvisioning(Boolean noCloudProvisioning) {
    this.noCloudProvisioning = noCloudProvisioning;
  }

  
  /**
   **/
  public PhoneCapabilities mediaCodecs(List<MediaCodecsEnum> mediaCodecs) {
    this.mediaCodecs = mediaCodecs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("mediaCodecs")
  public List<MediaCodecsEnum> getMediaCodecs() {
    return mediaCodecs;
  }
  public void setMediaCodecs(List<MediaCodecsEnum> mediaCodecs) {
    this.mediaCodecs = mediaCodecs;
  }

  
  /**
   **/
  public PhoneCapabilities cdm(Boolean cdm) {
    this.cdm = cdm;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("cdm")
  public Boolean getCdm() {
    return cdm;
  }
  public void setCdm(Boolean cdm) {
    this.cdm = cdm;
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
        Objects.equals(this.noRebalance, phoneCapabilities.noRebalance) &&
        Objects.equals(this.noCloudProvisioning, phoneCapabilities.noCloudProvisioning) &&
        Objects.equals(this.mediaCodecs, phoneCapabilities.mediaCodecs) &&
        Objects.equals(this.cdm, phoneCapabilities.cdm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(provisions, registers, dualRegisters, hardwareIdType, allowReboot, noRebalance, noCloudProvisioning, mediaCodecs, cdm);
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
    sb.append("    noCloudProvisioning: ").append(toIndentedString(noCloudProvisioning)).append("\n");
    sb.append("    mediaCodecs: ").append(toIndentedString(mediaCodecs)).append("\n");
    sb.append("    cdm: ").append(toIndentedString(cdm)).append("\n");
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

