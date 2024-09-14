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
 * Detected language of this message.
 */
@ApiModel(description = "Detected language of this message.")

public class ConversationEnrichmentLanguage  implements Serializable {
  
  private String language = null;

  
  /**
   * The ISO 639-3 detected language code of this message.
   **/
  public ConversationEnrichmentLanguage language(String language) {
    this.language = language;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ISO 639-3 detected language code of this message.")
  @JsonProperty("language")
  public String getLanguage() {
    return language;
  }
  public void setLanguage(String language) {
    this.language = language;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationEnrichmentLanguage conversationEnrichmentLanguage = (ConversationEnrichmentLanguage) o;

    return Objects.equals(this.language, conversationEnrichmentLanguage.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(language);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationEnrichmentLanguage {\n");
    
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
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

