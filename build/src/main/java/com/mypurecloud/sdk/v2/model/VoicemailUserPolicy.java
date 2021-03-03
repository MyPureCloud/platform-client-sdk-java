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
import java.util.Date;

import java.io.Serializable;
/**
 * VoicemailUserPolicy
 */

public class VoicemailUserPolicy  implements Serializable {
  
  private Boolean enabled = null;
  private Integer alertTimeoutSeconds = null;
  private String pin = null;
  private Date modifiedDate = null;
  private Boolean sendEmailNotifications = null;

  
  @ApiModelProperty(example = "null", value = "Whether the user has voicemail enabled")
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }

  
  /**
   * The number of seconds to ring the user's phone before a call is transfered to voicemail
   **/
  public VoicemailUserPolicy alertTimeoutSeconds(Integer alertTimeoutSeconds) {
    this.alertTimeoutSeconds = alertTimeoutSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of seconds to ring the user's phone before a call is transfered to voicemail")
  @JsonProperty("alertTimeoutSeconds")
  public Integer getAlertTimeoutSeconds() {
    return alertTimeoutSeconds;
  }
  public void setAlertTimeoutSeconds(Integer alertTimeoutSeconds) {
    this.alertTimeoutSeconds = alertTimeoutSeconds;
  }

  
  /**
   * The user's PIN to access their voicemail. This property is only used for updates and never provided otherwise to ensure security
   **/
  public VoicemailUserPolicy pin(String pin) {
    this.pin = pin;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user's PIN to access their voicemail. This property is only used for updates and never provided otherwise to ensure security")
  @JsonProperty("pin")
  public String getPin() {
    return pin;
  }
  public void setPin(String pin) {
    this.pin = pin;
  }

  
  @ApiModelProperty(example = "null", value = "The date the policy was last modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("modifiedDate")
  public Date getModifiedDate() {
    return modifiedDate;
  }

  
  /**
   * Whether email notifications are sent to the user when a new voicemail is received
   **/
  public VoicemailUserPolicy sendEmailNotifications(Boolean sendEmailNotifications) {
    this.sendEmailNotifications = sendEmailNotifications;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether email notifications are sent to the user when a new voicemail is received")
  @JsonProperty("sendEmailNotifications")
  public Boolean getSendEmailNotifications() {
    return sendEmailNotifications;
  }
  public void setSendEmailNotifications(Boolean sendEmailNotifications) {
    this.sendEmailNotifications = sendEmailNotifications;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VoicemailUserPolicy voicemailUserPolicy = (VoicemailUserPolicy) o;
    return Objects.equals(this.enabled, voicemailUserPolicy.enabled) &&
        Objects.equals(this.alertTimeoutSeconds, voicemailUserPolicy.alertTimeoutSeconds) &&
        Objects.equals(this.pin, voicemailUserPolicy.pin) &&
        Objects.equals(this.modifiedDate, voicemailUserPolicy.modifiedDate) &&
        Objects.equals(this.sendEmailNotifications, voicemailUserPolicy.sendEmailNotifications);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, alertTimeoutSeconds, pin, modifiedDate, sendEmailNotifications);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoicemailUserPolicy {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    alertTimeoutSeconds: ").append(toIndentedString(alertTimeoutSeconds)).append("\n");
    sb.append("    pin: ").append(toIndentedString(pin)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    sendEmailNotifications: ").append(toIndentedString(sendEmailNotifications)).append("\n");
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

