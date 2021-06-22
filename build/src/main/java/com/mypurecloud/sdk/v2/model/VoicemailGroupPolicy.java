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
import com.fasterxml.jackson.annotation.JsonValue;
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
  private Boolean disableEmailPii = null;
  private Integer rotateCallsSecs = null;
  private Integer stopRingingAfterRotations = null;
  private String overflowGroupId = null;

  private static class GroupAlertTypeEnumDeserializer extends StdDeserializer<GroupAlertTypeEnum> {
    public GroupAlertTypeEnumDeserializer() {
      super(GroupAlertTypeEnumDeserializer.class);
    }

    @Override
    public GroupAlertTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return GroupAlertTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Specifies if the members in this group should be contacted randomly, in a specific order, or by round-robin.
   */
 @JsonDeserialize(using = GroupAlertTypeEnumDeserializer.class)
  public enum GroupAlertTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    RANDOM("RANDOM"),
    ROUND_ROBIN("ROUND_ROBIN"),
    SEQUENTIAL("SEQUENTIAL");

    private String value;

    GroupAlertTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static GroupAlertTypeEnum fromString(String key) {
      if (key == null) return null;

      for (GroupAlertTypeEnum value : GroupAlertTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return GroupAlertTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private GroupAlertTypeEnum groupAlertType = null;

  
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
   * Removes any PII from group emails. This is overridden by the analogous organization configuration value. This is always true if HIPAA is enabled or unknown for an organization.
   **/
  public VoicemailGroupPolicy disableEmailPii(Boolean disableEmailPii) {
    this.disableEmailPii = disableEmailPii;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Removes any PII from group emails. This is overridden by the analogous organization configuration value. This is always true if HIPAA is enabled or unknown for an organization.")
  @JsonProperty("disableEmailPii")
  public Boolean getDisableEmailPii() {
    return disableEmailPii;
  }
  public void setDisableEmailPii(Boolean disableEmailPii) {
    this.disableEmailPii = disableEmailPii;
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

  
  /**
   *  A fallback group to contact when all of the members in this group did not answer the call.
   **/
  public VoicemailGroupPolicy overflowGroupId(String overflowGroupId) {
    this.overflowGroupId = overflowGroupId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = " A fallback group to contact when all of the members in this group did not answer the call.")
  @JsonProperty("overflowGroupId")
  public String getOverflowGroupId() {
    return overflowGroupId;
  }
  public void setOverflowGroupId(String overflowGroupId) {
    this.overflowGroupId = overflowGroupId;
  }

  
  /**
   * Specifies if the members in this group should be contacted randomly, in a specific order, or by round-robin.
   **/
  public VoicemailGroupPolicy groupAlertType(GroupAlertTypeEnum groupAlertType) {
    this.groupAlertType = groupAlertType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Specifies if the members in this group should be contacted randomly, in a specific order, or by round-robin.")
  @JsonProperty("groupAlertType")
  public GroupAlertTypeEnum getGroupAlertType() {
    return groupAlertType;
  }
  public void setGroupAlertType(GroupAlertTypeEnum groupAlertType) {
    this.groupAlertType = groupAlertType;
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
        Objects.equals(this.disableEmailPii, voicemailGroupPolicy.disableEmailPii) &&
        Objects.equals(this.rotateCallsSecs, voicemailGroupPolicy.rotateCallsSecs) &&
        Objects.equals(this.stopRingingAfterRotations, voicemailGroupPolicy.stopRingingAfterRotations) &&
        Objects.equals(this.overflowGroupId, voicemailGroupPolicy.overflowGroupId) &&
        Objects.equals(this.groupAlertType, voicemailGroupPolicy.groupAlertType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, group, enabled, sendEmailNotifications, disableEmailPii, rotateCallsSecs, stopRingingAfterRotations, overflowGroupId, groupAlertType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoicemailGroupPolicy {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    sendEmailNotifications: ").append(toIndentedString(sendEmailNotifications)).append("\n");
    sb.append("    disableEmailPii: ").append(toIndentedString(disableEmailPii)).append("\n");
    sb.append("    rotateCallsSecs: ").append(toIndentedString(rotateCallsSecs)).append("\n");
    sb.append("    stopRingingAfterRotations: ").append(toIndentedString(stopRingingAfterRotations)).append("\n");
    sb.append("    overflowGroupId: ").append(toIndentedString(overflowGroupId)).append("\n");
    sb.append("    groupAlertType: ").append(toIndentedString(groupAlertType)).append("\n");
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

