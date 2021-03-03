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
import com.mypurecloud.sdk.v2.model.CallForwardingEventCall;
import com.mypurecloud.sdk.v2.model.CallForwardingEventUser;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * CallForwardingEventCallForwarding
 */

public class CallForwardingEventCallForwarding  implements Serializable {
  
  private CallForwardingEventUser user = null;
  private Boolean enabled = null;
  private List<CallForwardingEventCall> calls = new ArrayList<CallForwardingEventCall>();
  private String voicemail = null;
  private Date modifiedDate = null;

  
  /**
   **/
  public CallForwardingEventCallForwarding user(CallForwardingEventUser user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("user")
  public CallForwardingEventUser getUser() {
    return user;
  }
  public void setUser(CallForwardingEventUser user) {
    this.user = user;
  }

  
  /**
   **/
  public CallForwardingEventCallForwarding enabled(Boolean enabled) {
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
  public CallForwardingEventCallForwarding calls(List<CallForwardingEventCall> calls) {
    this.calls = calls;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("calls")
  public List<CallForwardingEventCall> getCalls() {
    return calls;
  }
  public void setCalls(List<CallForwardingEventCall> calls) {
    this.calls = calls;
  }

  
  /**
   **/
  public CallForwardingEventCallForwarding voicemail(String voicemail) {
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
  public CallForwardingEventCallForwarding modifiedDate(Date modifiedDate) {
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
    CallForwardingEventCallForwarding callForwardingEventCallForwarding = (CallForwardingEventCallForwarding) o;
    return Objects.equals(this.user, callForwardingEventCallForwarding.user) &&
        Objects.equals(this.enabled, callForwardingEventCallForwarding.enabled) &&
        Objects.equals(this.calls, callForwardingEventCallForwarding.calls) &&
        Objects.equals(this.voicemail, callForwardingEventCallForwarding.voicemail) &&
        Objects.equals(this.modifiedDate, callForwardingEventCallForwarding.modifiedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, enabled, calls, voicemail, modifiedDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallForwardingEventCallForwarding {\n");
    
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

