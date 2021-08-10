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

import java.io.Serializable;
/**
 * Data for a single bot flow transcript.
 */
@ApiModel(description = "Data for a single bot flow transcript.")

public class TextBotTranscript  implements Serializable {
  
  private String text = null;
  private Float confidence = null;

  
  /**
   * The text of the transcript item.
   **/
  public TextBotTranscript text(String text) {
    this.text = text;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The text of the transcript item.")
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }

  
  /**
   * The confidence factor, expressed as a decimal between 0.0 and 1.0, of the transcript item.
   **/
  public TextBotTranscript confidence(Float confidence) {
    this.confidence = confidence;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The confidence factor, expressed as a decimal between 0.0 and 1.0, of the transcript item.")
  @JsonProperty("confidence")
  public Float getConfidence() {
    return confidence;
  }
  public void setConfidence(Float confidence) {
    this.confidence = confidence;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextBotTranscript textBotTranscript = (TextBotTranscript) o;
    return Objects.equals(this.text, textBotTranscript.text) &&
        Objects.equals(this.confidence, textBotTranscript.confidence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, confidence);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextBotTranscript {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
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

