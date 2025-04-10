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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * AudioState
 */

public class AudioState  implements Serializable {
  
  private Boolean canHear = null;
  private Boolean canSpeak = null;

  public AudioState() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Indicates that this communication's audio allows its participant to hear others.
   **/
  public AudioState canHear(Boolean canHear) {
    this.canHear = canHear;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates that this communication's audio allows its participant to hear others.")
  @JsonProperty("canHear")
  public Boolean getCanHear() {
    return canHear;
  }
  public void setCanHear(Boolean canHear) {
    this.canHear = canHear;
  }


  /**
   * Indicates that this communication's audio allows others to hear this participant.
   **/
  public AudioState canSpeak(Boolean canSpeak) {
    this.canSpeak = canSpeak;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates that this communication's audio allows others to hear this participant.")
  @JsonProperty("canSpeak")
  public Boolean getCanSpeak() {
    return canSpeak;
  }
  public void setCanSpeak(Boolean canSpeak) {
    this.canSpeak = canSpeak;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AudioState audioState = (AudioState) o;

    return Objects.equals(this.canHear, audioState.canHear) &&
            Objects.equals(this.canSpeak, audioState.canSpeak);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canHear, canSpeak);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudioState {\n");
    
    sb.append("    canHear: ").append(toIndentedString(canHear)).append("\n");
    sb.append("    canSpeak: ").append(toIndentedString(canSpeak)).append("\n");
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

