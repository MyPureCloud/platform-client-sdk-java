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
import com.mypurecloud.sdk.v2.model.Wrapup;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * MediaParticipantRequest
 */

public class MediaParticipantRequest  implements Serializable {
  
  private Wrapup wrapup = null;

  private static class StateEnumDeserializer extends StdDeserializer<StateEnum> {
    public StateEnumDeserializer() {
      super(StateEnumDeserializer.class);
    }

    @Override
    public StateEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return StateEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The state to update to set for this participant's communications.  Possible values are: 'connected' and 'disconnected'.
   */
 @JsonDeserialize(using = StateEnumDeserializer.class)
  public enum StateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ALERTING("alerting"),
    DIALING("dialing"),
    CONTACTING("contacting"),
    OFFERING("offering"),
    CONNECTED("connected"),
    DISCONNECTED("disconnected"),
    TERMINATED("terminated"),
    CONVERTING("converting"),
    UPLOADING("uploading"),
    TRANSMITTING("transmitting"),
    NONE("none");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StateEnum fromString(String key) {
      if (key == null) return null;

      for (StateEnum value : StateEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StateEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StateEnum state = null;
  private Boolean recording = null;
  private Boolean muted = null;
  private Boolean confined = null;
  private Boolean held = null;
  private Boolean wrapupSkipped = null;

  
  /**
   * Wrap-up to assign to this participant.
   **/
  public MediaParticipantRequest wrapup(Wrapup wrapup) {
    this.wrapup = wrapup;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Wrap-up to assign to this participant.")
  @JsonProperty("wrapup")
  public Wrapup getWrapup() {
    return wrapup;
  }
  public void setWrapup(Wrapup wrapup) {
    this.wrapup = wrapup;
  }

  
  /**
   * The state to update to set for this participant's communications.  Possible values are: 'connected' and 'disconnected'.
   **/
  public MediaParticipantRequest state(StateEnum state) {
    this.state = state;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The state to update to set for this participant's communications.  Possible values are: 'connected' and 'disconnected'.")
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }

  
  /**
   * True to enable recording of this participant, otherwise false to disable recording.
   **/
  public MediaParticipantRequest recording(Boolean recording) {
    this.recording = recording;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "True to enable recording of this participant, otherwise false to disable recording.")
  @JsonProperty("recording")
  public Boolean getRecording() {
    return recording;
  }
  public void setRecording(Boolean recording) {
    this.recording = recording;
  }

  
  /**
   * True to mute this conversation participant.
   **/
  public MediaParticipantRequest muted(Boolean muted) {
    this.muted = muted;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "True to mute this conversation participant.")
  @JsonProperty("muted")
  public Boolean getMuted() {
    return muted;
  }
  public void setMuted(Boolean muted) {
    this.muted = muted;
  }

  
  /**
   * True to confine this conversation participant.  Should only be used for ad-hoc conferences
   **/
  public MediaParticipantRequest confined(Boolean confined) {
    this.confined = confined;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "True to confine this conversation participant.  Should only be used for ad-hoc conferences")
  @JsonProperty("confined")
  public Boolean getConfined() {
    return confined;
  }
  public void setConfined(Boolean confined) {
    this.confined = confined;
  }

  
  /**
   * True to hold this conversation participant.
   **/
  public MediaParticipantRequest held(Boolean held) {
    this.held = held;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "True to hold this conversation participant.")
  @JsonProperty("held")
  public Boolean getHeld() {
    return held;
  }
  public void setHeld(Boolean held) {
    this.held = held;
  }

  
  /**
   * True to skip wrap-up for this participant.
   **/
  public MediaParticipantRequest wrapupSkipped(Boolean wrapupSkipped) {
    this.wrapupSkipped = wrapupSkipped;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "True to skip wrap-up for this participant.")
  @JsonProperty("wrapupSkipped")
  public Boolean getWrapupSkipped() {
    return wrapupSkipped;
  }
  public void setWrapupSkipped(Boolean wrapupSkipped) {
    this.wrapupSkipped = wrapupSkipped;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediaParticipantRequest mediaParticipantRequest = (MediaParticipantRequest) o;
    return Objects.equals(this.wrapup, mediaParticipantRequest.wrapup) &&
        Objects.equals(this.state, mediaParticipantRequest.state) &&
        Objects.equals(this.recording, mediaParticipantRequest.recording) &&
        Objects.equals(this.muted, mediaParticipantRequest.muted) &&
        Objects.equals(this.confined, mediaParticipantRequest.confined) &&
        Objects.equals(this.held, mediaParticipantRequest.held) &&
        Objects.equals(this.wrapupSkipped, mediaParticipantRequest.wrapupSkipped);
  }

  @Override
  public int hashCode() {
    return Objects.hash(wrapup, state, recording, muted, confined, held, wrapupSkipped);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaParticipantRequest {\n");
    
    sb.append("    wrapup: ").append(toIndentedString(wrapup)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    recording: ").append(toIndentedString(recording)).append("\n");
    sb.append("    muted: ").append(toIndentedString(muted)).append("\n");
    sb.append("    confined: ").append(toIndentedString(confined)).append("\n");
    sb.append("    held: ").append(toIndentedString(held)).append("\n");
    sb.append("    wrapupSkipped: ").append(toIndentedString(wrapupSkipped)).append("\n");
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

