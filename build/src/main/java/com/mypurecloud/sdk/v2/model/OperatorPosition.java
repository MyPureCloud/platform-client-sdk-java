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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * OperatorPosition
 */

public class OperatorPosition  implements Serializable {
  
  private Integer voiceSecondsPosition = null;
  private Integer digitalWordsPosition = null;

  
  /**
   * Number of seconds (for voice interactions) from operand match
   **/
  public OperatorPosition voiceSecondsPosition(Integer voiceSecondsPosition) {
    this.voiceSecondsPosition = voiceSecondsPosition;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of seconds (for voice interactions) from operand match")
  @JsonProperty("voiceSecondsPosition")
  public Integer getVoiceSecondsPosition() {
    return voiceSecondsPosition;
  }
  public void setVoiceSecondsPosition(Integer voiceSecondsPosition) {
    this.voiceSecondsPosition = voiceSecondsPosition;
  }


  /**
   * Number of words (for digital interactions) from operand match
   **/
  public OperatorPosition digitalWordsPosition(Integer digitalWordsPosition) {
    this.digitalWordsPosition = digitalWordsPosition;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of words (for digital interactions) from operand match")
  @JsonProperty("digitalWordsPosition")
  public Integer getDigitalWordsPosition() {
    return digitalWordsPosition;
  }
  public void setDigitalWordsPosition(Integer digitalWordsPosition) {
    this.digitalWordsPosition = digitalWordsPosition;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperatorPosition operatorPosition = (OperatorPosition) o;

    return Objects.equals(this.voiceSecondsPosition, operatorPosition.voiceSecondsPosition) &&
            Objects.equals(this.digitalWordsPosition, operatorPosition.digitalWordsPosition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(voiceSecondsPosition, digitalWordsPosition);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperatorPosition {\n");
    
    sb.append("    voiceSecondsPosition: ").append(toIndentedString(voiceSecondsPosition)).append("\n");
    sb.append("    digitalWordsPosition: ").append(toIndentedString(digitalWordsPosition)).append("\n");
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

