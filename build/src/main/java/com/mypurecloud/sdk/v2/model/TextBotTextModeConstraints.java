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
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Mode constraints to observe when operating on a bot flow.
 */
@ApiModel(description = "Mode constraints to observe when operating on a bot flow.")

public class TextBotTextModeConstraints  implements Serializable {
  
  private List<String> languagePreferences = new ArrayList<String>();
  private Integer noInputTimeoutMilliseconds = null;

  
  /**
   * The list of language preferences by their ISO language code.
   **/
  public TextBotTextModeConstraints languagePreferences(List<String> languagePreferences) {
    this.languagePreferences = languagePreferences;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The list of language preferences by their ISO language code.")
  @JsonProperty("languagePreferences")
  public List<String> getLanguagePreferences() {
    return languagePreferences;
  }
  public void setLanguagePreferences(List<String> languagePreferences) {
    this.languagePreferences = languagePreferences;
  }


  /**
   * The amount of time, in milliseconds, before the client should send the 'NoInput' event  to trigger the \"no input\" bot response and handling on digital channels.  Note: This optional field will only be returned for 'Digital Bot Flow' turns.
   **/
  public TextBotTextModeConstraints noInputTimeoutMilliseconds(Integer noInputTimeoutMilliseconds) {
    this.noInputTimeoutMilliseconds = noInputTimeoutMilliseconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The amount of time, in milliseconds, before the client should send the 'NoInput' event  to trigger the \"no input\" bot response and handling on digital channels.  Note: This optional field will only be returned for 'Digital Bot Flow' turns.")
  @JsonProperty("noInputTimeoutMilliseconds")
  public Integer getNoInputTimeoutMilliseconds() {
    return noInputTimeoutMilliseconds;
  }
  public void setNoInputTimeoutMilliseconds(Integer noInputTimeoutMilliseconds) {
    this.noInputTimeoutMilliseconds = noInputTimeoutMilliseconds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextBotTextModeConstraints textBotTextModeConstraints = (TextBotTextModeConstraints) o;

    return Objects.equals(this.languagePreferences, textBotTextModeConstraints.languagePreferences) &&
            Objects.equals(this.noInputTimeoutMilliseconds, textBotTextModeConstraints.noInputTimeoutMilliseconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(languagePreferences, noInputTimeoutMilliseconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextBotTextModeConstraints {\n");
    
    sb.append("    languagePreferences: ").append(toIndentedString(languagePreferences)).append("\n");
    sb.append("    noInputTimeoutMilliseconds: ").append(toIndentedString(noInputTimeoutMilliseconds)).append("\n");
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

