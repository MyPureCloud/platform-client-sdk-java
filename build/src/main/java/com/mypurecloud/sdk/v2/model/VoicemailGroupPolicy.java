package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.Group;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * VoicemailGroupPolicy
 */

public class VoicemailGroupPolicy  implements Serializable {
  
  private String name = null;
  private Group group = null;
  private Boolean enabled = null;
  private Boolean sendEmailNotifications = null;
  private Integer rotateCallsSecs = null;
  private Integer stopRingingAfterRotations = null;

  
  /**
   **/
  public VoicemailGroupPolicy name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The group associated with the policy
   **/
  public VoicemailGroupPolicy group(Group group) {
    this.group = group;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The group associated with the policy")
  @JsonProperty("group")
  public Group getGroup() {
    return group;
  }
  public void setGroup(Group group) {
    this.group = group;
  }


  /**
   * Whether voicemail is enabled for the group
   **/
  public VoicemailGroupPolicy enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether voicemail is enabled for the group")
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  /**
   * Whether email notifications are sent to group members when a new voicemail is received
   **/
  public VoicemailGroupPolicy sendEmailNotifications(Boolean sendEmailNotifications) {
    this.sendEmailNotifications = sendEmailNotifications;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether email notifications are sent to group members when a new voicemail is received")
  @JsonProperty("sendEmailNotifications")
  public Boolean getSendEmailNotifications() {
    return sendEmailNotifications;
  }
  public void setSendEmailNotifications(Boolean sendEmailNotifications) {
    this.sendEmailNotifications = sendEmailNotifications;
  }


  /**
   * How many seconds to ring before rotating to the next member in the group
   **/
  public VoicemailGroupPolicy rotateCallsSecs(Integer rotateCallsSecs) {
    this.rotateCallsSecs = rotateCallsSecs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "How many seconds to ring before rotating to the next member in the group")
  @JsonProperty("rotateCallsSecs")
  public Integer getRotateCallsSecs() {
    return rotateCallsSecs;
  }
  public void setRotateCallsSecs(Integer rotateCallsSecs) {
    this.rotateCallsSecs = rotateCallsSecs;
  }


  /**
   * How many rotations to go through
   **/
  public VoicemailGroupPolicy stopRingingAfterRotations(Integer stopRingingAfterRotations) {
    this.stopRingingAfterRotations = stopRingingAfterRotations;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "How many rotations to go through")
  @JsonProperty("stopRingingAfterRotations")
  public Integer getStopRingingAfterRotations() {
    return stopRingingAfterRotations;
  }
  public void setStopRingingAfterRotations(Integer stopRingingAfterRotations) {
    this.stopRingingAfterRotations = stopRingingAfterRotations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VoicemailGroupPolicy voicemailGroupPolicy = (VoicemailGroupPolicy) o;
    return Objects.equals(this.name, voicemailGroupPolicy.name) &&
        Objects.equals(this.group, voicemailGroupPolicy.group) &&
        Objects.equals(this.enabled, voicemailGroupPolicy.enabled) &&
        Objects.equals(this.sendEmailNotifications, voicemailGroupPolicy.sendEmailNotifications) &&
        Objects.equals(this.rotateCallsSecs, voicemailGroupPolicy.rotateCallsSecs) &&
        Objects.equals(this.stopRingingAfterRotations, voicemailGroupPolicy.stopRingingAfterRotations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, group, enabled, sendEmailNotifications, rotateCallsSecs, stopRingingAfterRotations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoicemailGroupPolicy {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    sendEmailNotifications: ").append(toIndentedString(sendEmailNotifications)).append("\n");
    sb.append("    rotateCallsSecs: ").append(toIndentedString(rotateCallsSecs)).append("\n");
    sb.append("    stopRingingAfterRotations: ").append(toIndentedString(stopRingingAfterRotations)).append("\n");
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

