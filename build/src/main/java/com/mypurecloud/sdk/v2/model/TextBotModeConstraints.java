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
import com.mypurecloud.sdk.v2.model.TextBotTextModeConstraints;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Mode constraints to observe when operating on a bot flow.
 */
@ApiModel(description = "Mode constraints to observe when operating on a bot flow.")

public class TextBotModeConstraints  implements Serializable {
  
  private TextBotTextModeConstraints text = null;

  
  /**
   * Mode constraints that apply to text scenarios.
   **/
  public TextBotModeConstraints text(TextBotTextModeConstraints text) {
    this.text = text;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Mode constraints that apply to text scenarios.")
  @JsonProperty("text")
  public TextBotTextModeConstraints getText() {
    return text;
  }
  public void setText(TextBotTextModeConstraints text) {
    this.text = text;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextBotModeConstraints textBotModeConstraints = (TextBotModeConstraints) o;
    return Objects.equals(this.text, textBotModeConstraints.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextBotModeConstraints {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

