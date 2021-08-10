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
import com.mypurecloud.sdk.v2.model.TextBotModeOutputPrompts;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Prompt information related to a bot flow turn.
 */
@ApiModel(description = "Prompt information related to a bot flow turn.")

public class TextBotOutputPrompts  implements Serializable {
  
  private String outputLanguage = null;
  private TextBotModeOutputPrompts textPrompts = null;

  
  /**
   * The ISO code of the output language for this prompt item.
   **/
  public TextBotOutputPrompts outputLanguage(String outputLanguage) {
    this.outputLanguage = outputLanguage;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ISO code of the output language for this prompt item.")
  @JsonProperty("outputLanguage")
  public String getOutputLanguage() {
    return outputLanguage;
  }
  public void setOutputLanguage(String outputLanguage) {
    this.outputLanguage = outputLanguage;
  }

  
  /**
   * Text output prompts, if any.
   **/
  public TextBotOutputPrompts textPrompts(TextBotModeOutputPrompts textPrompts) {
    this.textPrompts = textPrompts;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Text output prompts, if any.")
  @JsonProperty("textPrompts")
  public TextBotModeOutputPrompts getTextPrompts() {
    return textPrompts;
  }
  public void setTextPrompts(TextBotModeOutputPrompts textPrompts) {
    this.textPrompts = textPrompts;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextBotOutputPrompts textBotOutputPrompts = (TextBotOutputPrompts) o;
    return Objects.equals(this.outputLanguage, textBotOutputPrompts.outputLanguage) &&
        Objects.equals(this.textPrompts, textBotOutputPrompts.textPrompts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(outputLanguage, textPrompts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextBotOutputPrompts {\n");
    
    sb.append("    outputLanguage: ").append(toIndentedString(outputLanguage)).append("\n");
    sb.append("    textPrompts: ").append(toIndentedString(textPrompts)).append("\n");
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

