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
import com.mypurecloud.sdk.v2.model.TextBotPromptSegment;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Prompt information related to a bot flow turn.
 */
@ApiModel(description = "Prompt information related to a bot flow turn.")

public class TextBotModeOutputPrompts  implements Serializable {
  
  private List<TextBotPromptSegment> segments = new ArrayList<TextBotPromptSegment>();

  
  /**
   * The list of prompt segments.
   **/
  public TextBotModeOutputPrompts segments(List<TextBotPromptSegment> segments) {
    this.segments = segments;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The list of prompt segments.")
  @JsonProperty("segments")
  public List<TextBotPromptSegment> getSegments() {
    return segments;
  }
  public void setSegments(List<TextBotPromptSegment> segments) {
    this.segments = segments;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextBotModeOutputPrompts textBotModeOutputPrompts = (TextBotModeOutputPrompts) o;
    return Objects.equals(this.segments, textBotModeOutputPrompts.segments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(segments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextBotModeOutputPrompts {\n");
    
    sb.append("    segments: ").append(toIndentedString(segments)).append("\n");
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

