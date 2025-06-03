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
import com.mypurecloud.sdk.v2.model.BotConnectorIntent;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * A version description for a Bot.
 */
@ApiModel(description = "A version description for a Bot.")

public class BotVersion  implements Serializable {
  
  private String version = null;
  private List<String> supportedLanguages = null;
  private List<BotConnectorIntent> intents = null;

  public BotVersion() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      supportedLanguages = new ArrayList<String>();
      intents = new ArrayList<BotConnectorIntent>();
    }
  }

  
  /**
   * The name of the version.
   **/
  public BotVersion version(String version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of the version.")
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }
  public void setVersion(String version) {
    this.version = version;
  }


  /**
   * The supported languages for this bot. EG 'en-us' or 'es', etc; These language codes are W3C language identification tags (ISO 639-1 for the language name and ISO 3166 for the country code)
   **/
  public BotVersion supportedLanguages(List<String> supportedLanguages) {
    this.supportedLanguages = supportedLanguages;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The supported languages for this bot. EG 'en-us' or 'es', etc; These language codes are W3C language identification tags (ISO 639-1 for the language name and ISO 3166 for the country code)")
  @JsonProperty("supportedLanguages")
  public List<String> getSupportedLanguages() {
    return supportedLanguages;
  }
  public void setSupportedLanguages(List<String> supportedLanguages) {
    this.supportedLanguages = supportedLanguages;
  }


  /**
   * A list of potential intents this bot will return, limit of 50
   **/
  public BotVersion intents(List<BotConnectorIntent> intents) {
    this.intents = intents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of potential intents this bot will return, limit of 50")
  @JsonProperty("intents")
  public List<BotConnectorIntent> getIntents() {
    return intents;
  }
  public void setIntents(List<BotConnectorIntent> intents) {
    this.intents = intents;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BotVersion botVersion = (BotVersion) o;

    return Objects.equals(this.version, botVersion.version) &&
            Objects.equals(this.supportedLanguages, botVersion.supportedLanguages) &&
            Objects.equals(this.intents, botVersion.intents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, supportedLanguages, intents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BotVersion {\n");
    
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    supportedLanguages: ").append(toIndentedString(supportedLanguages)).append("\n");
    sb.append("    intents: ").append(toIndentedString(intents)).append("\n");
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

