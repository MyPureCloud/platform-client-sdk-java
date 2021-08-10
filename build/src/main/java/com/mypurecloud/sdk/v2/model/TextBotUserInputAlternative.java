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
import com.mypurecloud.sdk.v2.model.TextBotTranscript;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * User input data used in a bot flow turn.
 */
@ApiModel(description = "User input data used in a bot flow turn.")

public class TextBotUserInputAlternative  implements Serializable {
  
  private TextBotTranscript transcript = null;

  
  /**
   * The user input transcript.
   **/
  public TextBotUserInputAlternative transcript(TextBotTranscript transcript) {
    this.transcript = transcript;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The user input transcript.")
  @JsonProperty("transcript")
  public TextBotTranscript getTranscript() {
    return transcript;
  }
  public void setTranscript(TextBotTranscript transcript) {
    this.transcript = transcript;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextBotUserInputAlternative textBotUserInputAlternative = (TextBotUserInputAlternative) o;
    return Objects.equals(this.transcript, textBotUserInputAlternative.transcript);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transcript);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextBotUserInputAlternative {\n");
    
    sb.append("    transcript: ").append(toIndentedString(transcript)).append("\n");
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

