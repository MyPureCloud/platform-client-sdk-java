package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.CallForwardingNotificationCalls;
import com.mypurecloud.sdk.v2.model.DocumentDataV2NotificationWorkspace;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * CallForwardingNotification
 */

public class CallForwardingNotification  implements Serializable {
  
  private DocumentDataV2NotificationWorkspace user = null;
  private Boolean enabled = null;
  private List<CallForwardingNotificationCalls> calls = new ArrayList<CallForwardingNotificationCalls>();
  private String voicemail = null;
  private Date modifiedDate = null;

  
  /**
   **/
  public CallForwardingNotification user(DocumentDataV2NotificationWorkspace user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("user")
  public DocumentDataV2NotificationWorkspace getUser() {
    return user;
  }
  public void setUser(DocumentDataV2NotificationWorkspace user) {
    this.user = user;
  }

  
  /**
   **/
  public CallForwardingNotification enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  
  /**
   **/
  public CallForwardingNotification calls(List<CallForwardingNotificationCalls> calls) {
    this.calls = calls;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("calls")
  public List<CallForwardingNotificationCalls> getCalls() {
    return calls;
  }
  public void setCalls(List<CallForwardingNotificationCalls> calls) {
    this.calls = calls;
  }

  
  /**
   **/
  public CallForwardingNotification voicemail(String voicemail) {
    this.voicemail = voicemail;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("voicemail")
  public String getVoicemail() {
    return voicemail;
  }
  public void setVoicemail(String voicemail) {
    this.voicemail = voicemail;
  }

  
  /**
   **/
  public CallForwardingNotification modifiedDate(Date modifiedDate) {
    this.modifiedDate = modifiedDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("modifiedDate")
  public Date getModifiedDate() {
    return modifiedDate;
  }
  public void setModifiedDate(Date modifiedDate) {
    this.modifiedDate = modifiedDate;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CallForwardingNotification callForwardingNotification = (CallForwardingNotification) o;
    return Objects.equals(this.user, callForwardingNotification.user) &&
        Objects.equals(this.enabled, callForwardingNotification.enabled) &&
        Objects.equals(this.calls, callForwardingNotification.calls) &&
        Objects.equals(this.voicemail, callForwardingNotification.voicemail) &&
        Objects.equals(this.modifiedDate, callForwardingNotification.modifiedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, enabled, calls, voicemail, modifiedDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallForwardingNotification {\n");
    
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    calls: ").append(toIndentedString(calls)).append("\n");
    sb.append("    voicemail: ").append(toIndentedString(voicemail)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
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

