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
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * AdjustableLiveSpeakerDetection
 */

public class AdjustableLiveSpeakerDetection  implements Serializable {
  

  private static class ModeEnumDeserializer extends StdDeserializer<ModeEnum> {
    public ModeEnumDeserializer() {
      super(ModeEnumDeserializer.class);
    }

    @Override
    public ModeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ModeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Modes to tune between speed to live speaker detection vs accuracy.
   */
 @JsonDeserialize(using = ModeEnumDeserializer.class)
  public enum ModeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("unknown"),
    DISABLED("disabled"),
    LOW("low"),
    MEDIUM("medium"),
    HIGH("high");

    private String value;

    ModeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ModeEnum fromString(String key) {
      if (key == null) return null;

      for (ModeEnum value : ModeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ModeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ModeEnum mode = null;
  private String preconnectDuration = null;
  private String eventName = null;
  private Boolean isPersonLikely = null;
  private Integer totalRingbacks = null;
  private Boolean lineConnected = null;

  
  /**
   * Modes to tune between speed to live speaker detection vs accuracy.
   **/
  public AdjustableLiveSpeakerDetection mode(ModeEnum mode) {
    this.mode = mode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Modes to tune between speed to live speaker detection vs accuracy.")
  @JsonProperty("mode")
  public ModeEnum getMode() {
    return mode;
  }
  public void setMode(ModeEnum mode) {
    this.mode = mode;
  }


  /**
   * ISO 8601 formatted relative duration (e.g., PT30.8427419S for 30.8 seconds), calculated on line connect.
   **/
  public AdjustableLiveSpeakerDetection preconnectDuration(String preconnectDuration) {
    this.preconnectDuration = preconnectDuration;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ISO 8601 formatted relative duration (e.g., PT30.8427419S for 30.8 seconds), calculated on line connect.")
  @JsonProperty("preconnectDuration")
  public String getPreconnectDuration() {
    return preconnectDuration;
  }
  public void setPreconnectDuration(String preconnectDuration) {
    this.preconnectDuration = preconnectDuration;
  }


  /**
   * The name of the event that triggered the ALSD evaluation (e.g., line.connect, speech.generic).
   **/
  public AdjustableLiveSpeakerDetection eventName(String eventName) {
    this.eventName = eventName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of the event that triggered the ALSD evaluation (e.g., line.connect, speech.generic).")
  @JsonProperty("eventName")
  public String getEventName() {
    return eventName;
  }
  public void setEventName(String eventName) {
    this.eventName = eventName;
  }


  /**
   * The output of the ALSD detector, evaluating whether there is likely a person on the call based on the above inputs, and if so, a person is detected early (person disposition name and speech.person analyzer result) and the associated action taken (e.g., speech.person postconnect entry in the disposition table has the action to transfer to a queue).
   **/
  public AdjustableLiveSpeakerDetection isPersonLikely(Boolean isPersonLikely) {
    this.isPersonLikely = isPersonLikely;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The output of the ALSD detector, evaluating whether there is likely a person on the call based on the above inputs, and if so, a person is detected early (person disposition name and speech.person analyzer result) and the associated action taken (e.g., speech.person postconnect entry in the disposition table has the action to transfer to a queue).")
  @JsonProperty("isPersonLikely")
  public Boolean getIsPersonLikely() {
    return isPersonLikely;
  }
  public void setIsPersonLikely(Boolean isPersonLikely) {
    this.isPersonLikely = isPersonLikely;
  }


  /**
   * Number of tone.ring.* analyzer events detected during the call (expected mostly during pre-connect but the last ringback tone detection could potentially complete after line connect, which will increment totalRingbacks still).
   **/
  public AdjustableLiveSpeakerDetection totalRingbacks(Integer totalRingbacks) {
    this.totalRingbacks = totalRingbacks;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of tone.ring.* analyzer events detected during the call (expected mostly during pre-connect but the last ringback tone detection could potentially complete after line connect, which will increment totalRingbacks still).")
  @JsonProperty("totalRingbacks")
  public Integer getTotalRingbacks() {
    return totalRingbacks;
  }
  public void setTotalRingbacks(Integer totalRingbacks) {
    this.totalRingbacks = totalRingbacks;
  }


  /**
   * Protocol line connect received (answered by a person, machine, busy, fax).
   **/
  public AdjustableLiveSpeakerDetection lineConnected(Boolean lineConnected) {
    this.lineConnected = lineConnected;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Protocol line connect received (answered by a person, machine, busy, fax).")
  @JsonProperty("lineConnected")
  public Boolean getLineConnected() {
    return lineConnected;
  }
  public void setLineConnected(Boolean lineConnected) {
    this.lineConnected = lineConnected;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdjustableLiveSpeakerDetection adjustableLiveSpeakerDetection = (AdjustableLiveSpeakerDetection) o;

    return Objects.equals(this.mode, adjustableLiveSpeakerDetection.mode) &&
            Objects.equals(this.preconnectDuration, adjustableLiveSpeakerDetection.preconnectDuration) &&
            Objects.equals(this.eventName, adjustableLiveSpeakerDetection.eventName) &&
            Objects.equals(this.isPersonLikely, adjustableLiveSpeakerDetection.isPersonLikely) &&
            Objects.equals(this.totalRingbacks, adjustableLiveSpeakerDetection.totalRingbacks) &&
            Objects.equals(this.lineConnected, adjustableLiveSpeakerDetection.lineConnected);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mode, preconnectDuration, eventName, isPersonLikely, totalRingbacks, lineConnected);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdjustableLiveSpeakerDetection {\n");
    
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    preconnectDuration: ").append(toIndentedString(preconnectDuration)).append("\n");
    sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
    sb.append("    isPersonLikely: ").append(toIndentedString(isPersonLikely)).append("\n");
    sb.append("    totalRingbacks: ").append(toIndentedString(totalRingbacks)).append("\n");
    sb.append("    lineConnected: ").append(toIndentedString(lineConnected)).append("\n");
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

