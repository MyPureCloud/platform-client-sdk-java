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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.VipBackup;
import com.mypurecloud.sdk.v2.model.VipCallMediaSettings;
import com.mypurecloud.sdk.v2.model.VipMediaSettings;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * VipRouting
 */

public class VipRouting  implements Serializable {
  
  private VipCallMediaSettings vipCallMediaSettings = null;
  private VipMediaSettings vipEmailMediaSettings = null;
  private VipMediaSettings vipMessageMediaSettings = null;
  private Integer vipMaxOwnershipTimeSeconds = null;
  private VipBackup vipBackup = null;

  
  /**
   * VIP Settings specific to Call media.
   **/
  public VipRouting vipCallMediaSettings(VipCallMediaSettings vipCallMediaSettings) {
    this.vipCallMediaSettings = vipCallMediaSettings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "VIP Settings specific to Call media.")
  @JsonProperty("vipCallMediaSettings")
  public VipCallMediaSettings getVipCallMediaSettings() {
    return vipCallMediaSettings;
  }
  public void setVipCallMediaSettings(VipCallMediaSettings vipCallMediaSettings) {
    this.vipCallMediaSettings = vipCallMediaSettings;
  }


  /**
   * VIP Settings specific to Email media.
   **/
  public VipRouting vipEmailMediaSettings(VipMediaSettings vipEmailMediaSettings) {
    this.vipEmailMediaSettings = vipEmailMediaSettings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "VIP Settings specific to Email media.")
  @JsonProperty("vipEmailMediaSettings")
  public VipMediaSettings getVipEmailMediaSettings() {
    return vipEmailMediaSettings;
  }
  public void setVipEmailMediaSettings(VipMediaSettings vipEmailMediaSettings) {
    this.vipEmailMediaSettings = vipEmailMediaSettings;
  }


  /**
   * VIP Settings specific to Message media.
   **/
  public VipRouting vipMessageMediaSettings(VipMediaSettings vipMessageMediaSettings) {
    this.vipMessageMediaSettings = vipMessageMediaSettings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "VIP Settings specific to Message media.")
  @JsonProperty("vipMessageMediaSettings")
  public VipMediaSettings getVipMessageMediaSettings() {
    return vipMessageMediaSettings;
  }
  public void setVipMessageMediaSettings(VipMediaSettings vipMessageMediaSettings) {
    this.vipMessageMediaSettings = vipMessageMediaSettings;
  }


  /**
   * The max amount of time a VIP interaction will wait for the VIP user before going to the selected backup option (in seconds). Allowable range 10 seconds - 864000 seconds (ten days).
   **/
  public VipRouting vipMaxOwnershipTimeSeconds(Integer vipMaxOwnershipTimeSeconds) {
    this.vipMaxOwnershipTimeSeconds = vipMaxOwnershipTimeSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The max amount of time a VIP interaction will wait for the VIP user before going to the selected backup option (in seconds). Allowable range 10 seconds - 864000 seconds (ten days).")
  @JsonProperty("vipMaxOwnershipTimeSeconds")
  public Integer getVipMaxOwnershipTimeSeconds() {
    return vipMaxOwnershipTimeSeconds;
  }
  public void setVipMaxOwnershipTimeSeconds(Integer vipMaxOwnershipTimeSeconds) {
    this.vipMaxOwnershipTimeSeconds = vipMaxOwnershipTimeSeconds;
  }


  /**
   * VIP queue default VIP Backup settings for unanswered VIP interactions to fallback to. VIP Backup set for a specific VIP user has preference before queue default.
   **/
  public VipRouting vipBackup(VipBackup vipBackup) {
    this.vipBackup = vipBackup;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "VIP queue default VIP Backup settings for unanswered VIP interactions to fallback to. VIP Backup set for a specific VIP user has preference before queue default.")
  @JsonProperty("vipBackup")
  public VipBackup getVipBackup() {
    return vipBackup;
  }
  public void setVipBackup(VipBackup vipBackup) {
    this.vipBackup = vipBackup;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VipRouting vipRouting = (VipRouting) o;

    return Objects.equals(this.vipCallMediaSettings, vipRouting.vipCallMediaSettings) &&
            Objects.equals(this.vipEmailMediaSettings, vipRouting.vipEmailMediaSettings) &&
            Objects.equals(this.vipMessageMediaSettings, vipRouting.vipMessageMediaSettings) &&
            Objects.equals(this.vipMaxOwnershipTimeSeconds, vipRouting.vipMaxOwnershipTimeSeconds) &&
            Objects.equals(this.vipBackup, vipRouting.vipBackup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vipCallMediaSettings, vipEmailMediaSettings, vipMessageMediaSettings, vipMaxOwnershipTimeSeconds, vipBackup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VipRouting {\n");
    
    sb.append("    vipCallMediaSettings: ").append(toIndentedString(vipCallMediaSettings)).append("\n");
    sb.append("    vipEmailMediaSettings: ").append(toIndentedString(vipEmailMediaSettings)).append("\n");
    sb.append("    vipMessageMediaSettings: ").append(toIndentedString(vipMessageMediaSettings)).append("\n");
    sb.append("    vipMaxOwnershipTimeSeconds: ").append(toIndentedString(vipMaxOwnershipTimeSeconds)).append("\n");
    sb.append("    vipBackup: ").append(toIndentedString(vipBackup)).append("\n");
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

