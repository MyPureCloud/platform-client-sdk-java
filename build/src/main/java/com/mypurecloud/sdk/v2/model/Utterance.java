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
 * Utterance
 */

public class Utterance  implements Serializable {
  
  private String utteranceText = null;

  
  /**
   * Utterance text
   **/
  public Utterance utteranceText(String utteranceText) {
    this.utteranceText = utteranceText;
    return this;
  }
  
  @ApiModelProperty(example = "I want to pay bill.", value = "Utterance text")
  @JsonProperty("utteranceText")
  public String getUtteranceText() {
    return utteranceText;
  }
  public void setUtteranceText(String utteranceText) {
    this.utteranceText = utteranceText;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Utterance utterance = (Utterance) o;
    return Objects.equals(this.utteranceText, utterance.utteranceText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(utteranceText);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Utterance {\n");
    
    sb.append("    utteranceText: ").append(toIndentedString(utteranceText)).append("\n");
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

