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
import com.mypurecloud.sdk.v2.model.AudioState;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * InitialConfiguration
 */

public class InitialConfiguration  implements Serializable {
  
  private AudioState audioState = null;
  private Boolean alerting = null;
  private Boolean inbound = null;
  private String invitedBy = null;
  private Boolean recordingActive = null;
  private Map<String, String> additionalInfo = null;

  public InitialConfiguration() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Indicates the initial audio state for the communication.
   **/
  public InitialConfiguration audioState(AudioState audioState) {
    this.audioState = audioState;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates the initial audio state for the communication.")
  @JsonProperty("audioState")
  public AudioState getAudioState() {
    return audioState;
  }
  public void setAudioState(AudioState audioState) {
    this.audioState = audioState;
  }


  /**
   * Indicates that this communication's initial state is alerting. If false, the communication started in a connected state.
   **/
  public InitialConfiguration alerting(Boolean alerting) {
    this.alerting = alerting;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates that this communication's initial state is alerting. If false, the communication started in a connected state.")
  @JsonProperty("alerting")
  public Boolean getAlerting() {
    return alerting;
  }
  public void setAlerting(Boolean alerting) {
    this.alerting = alerting;
  }


  /**
   * Indicates the direction of this communication with respect to the contact center. `true` means the communication is INBOUND. `false` means the communication is OUTBOUND.
   **/
  public InitialConfiguration inbound(Boolean inbound) {
    this.inbound = inbound;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates the direction of this communication with respect to the contact center. `true` means the communication is INBOUND. `false` means the communication is OUTBOUND.")
  @JsonProperty("inbound")
  public Boolean getInbound() {
    return inbound;
  }
  public void setInbound(Boolean inbound) {
    this.inbound = inbound;
  }


  /**
   * The id of the communication (the \"peer\") that \"invited\" this communication, if this occurred.
   **/
  public InitialConfiguration invitedBy(String invitedBy) {
    this.invitedBy = invitedBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The id of the communication (the \"peer\") that \"invited\" this communication, if this occurred.")
  @JsonProperty("invitedBy")
  public String getInvitedBy() {
    return invitedBy;
  }
  public void setInvitedBy(String invitedBy) {
    this.invitedBy = invitedBy;
  }


  /**
   * Indicates whether recording is active for this communication at creation.
   **/
  public InitialConfiguration recordingActive(Boolean recordingActive) {
    this.recordingActive = recordingActive;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates whether recording is active for this communication at creation.")
  @JsonProperty("recordingActive")
  public Boolean getRecordingActive() {
    return recordingActive;
  }
  public void setRecordingActive(Boolean recordingActive) {
    this.recordingActive = recordingActive;
  }


  /**
   * Additional metadata about this session which should be recorded by the platform but which will not be indexed or searchable. Primarily for diagnostic value. Any information that needs to be accessible through other components like Analytics should be moved to dedicated fields.
   **/
  public InitialConfiguration additionalInfo(Map<String, String> additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Additional metadata about this session which should be recorded by the platform but which will not be indexed or searchable. Primarily for diagnostic value. Any information that needs to be accessible through other components like Analytics should be moved to dedicated fields.")
  @JsonProperty("additionalInfo")
  public Map<String, String> getAdditionalInfo() {
    return additionalInfo;
  }
  public void setAdditionalInfo(Map<String, String> additionalInfo) {
    this.additionalInfo = additionalInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitialConfiguration initialConfiguration = (InitialConfiguration) o;

    return Objects.equals(this.audioState, initialConfiguration.audioState) &&
            Objects.equals(this.alerting, initialConfiguration.alerting) &&
            Objects.equals(this.inbound, initialConfiguration.inbound) &&
            Objects.equals(this.invitedBy, initialConfiguration.invitedBy) &&
            Objects.equals(this.recordingActive, initialConfiguration.recordingActive) &&
            Objects.equals(this.additionalInfo, initialConfiguration.additionalInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audioState, alerting, inbound, invitedBy, recordingActive, additionalInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitialConfiguration {\n");
    
    sb.append("    audioState: ").append(toIndentedString(audioState)).append("\n");
    sb.append("    alerting: ").append(toIndentedString(alerting)).append("\n");
    sb.append("    inbound: ").append(toIndentedString(inbound)).append("\n");
    sb.append("    invitedBy: ").append(toIndentedString(invitedBy)).append("\n");
    sb.append("    recordingActive: ").append(toIndentedString(recordingActive)).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
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

