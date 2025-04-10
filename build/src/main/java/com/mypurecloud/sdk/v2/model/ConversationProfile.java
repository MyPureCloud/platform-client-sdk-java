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
import com.mypurecloud.sdk.v2.ApiClient;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ConversationProfile
 */

public class ConversationProfile  implements Serializable {
  

  private static class LanguageCodeEnumDeserializer extends StdDeserializer<LanguageCodeEnum> {
    public LanguageCodeEnumDeserializer() {
      super(LanguageCodeEnumDeserializer.class);
    }

    @Override
    public LanguageCodeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return LanguageCodeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The language code supported by the conversation profile belonging to a particular project for Dialogflow.
   */
 @JsonDeserialize(using = LanguageCodeEnumDeserializer.class)
  public enum LanguageCodeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    EN("en"),
    EN_AU("en-AU"),
    EN_CA("en-CA"),
    EN_GB("en-GB"),
    EN_IN("en-IN"),
    EN_US("en-US");

    private String value;

    LanguageCodeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static LanguageCodeEnum fromString(String key) {
      if (key == null) return null;

      for (LanguageCodeEnum value : LanguageCodeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return LanguageCodeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private LanguageCodeEnum languageCode = null;
  private String name = null;

  public ConversationProfile() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The language code supported by the conversation profile belonging to a particular project for Dialogflow.
   **/
  public ConversationProfile languageCode(LanguageCodeEnum languageCode) {
    this.languageCode = languageCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The language code supported by the conversation profile belonging to a particular project for Dialogflow.")
  @JsonProperty("languageCode")
  public LanguageCodeEnum getLanguageCode() {
    return languageCode;
  }
  public void setLanguageCode(LanguageCodeEnum languageCode) {
    this.languageCode = languageCode;
  }


  /**
   * The name of the conversation profile belonging to a particular project for Dialogflow
   **/
  public ConversationProfile name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the conversation profile belonging to a particular project for Dialogflow")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationProfile conversationProfile = (ConversationProfile) o;

    return Objects.equals(this.languageCode, conversationProfile.languageCode) &&
            Objects.equals(this.name, conversationProfile.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(languageCode, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationProfile {\n");
    
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

