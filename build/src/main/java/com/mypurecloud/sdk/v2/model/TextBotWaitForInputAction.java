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
import com.mypurecloud.sdk.v2.model.TextBotModeConstraints;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Settings for a next-action of waiting for additional user input and sending the data as an input action to the bot flow.
 */
@ApiModel(description = "Settings for a next-action of waiting for additional user input and sending the data as an input action to the bot flow.")

public class TextBotWaitForInputAction  implements Serializable {
  
  private TextBotModeConstraints modeConstraints = null;

  
  /**
   * The mode constraints for the user input.
   **/
  public TextBotWaitForInputAction modeConstraints(TextBotModeConstraints modeConstraints) {
    this.modeConstraints = modeConstraints;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The mode constraints for the user input.")
  @JsonProperty("modeConstraints")
  public TextBotModeConstraints getModeConstraints() {
    return modeConstraints;
  }
  public void setModeConstraints(TextBotModeConstraints modeConstraints) {
    this.modeConstraints = modeConstraints;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextBotWaitForInputAction textBotWaitForInputAction = (TextBotWaitForInputAction) o;
    return Objects.equals(this.modeConstraints, textBotWaitForInputAction.modeConstraints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modeConstraints);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextBotWaitForInputAction {\n");
    
    sb.append("    modeConstraints: ").append(toIndentedString(modeConstraints)).append("\n");
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

