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
import com.mypurecloud.sdk.v2.model.FlowHealthIntentVersionInfo;
import com.mypurecloud.sdk.v2.model.HealthInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * FlowHealthIntent
 */

public class FlowHealthIntent  implements Serializable {
  
  private String id = null;
  private String name = null;
  private FlowHealthIntentVersionInfo flowVersionInfo = null;

  private static class LanguageEnumDeserializer extends StdDeserializer<LanguageEnum> {
    public LanguageEnumDeserializer() {
      super(LanguageEnumDeserializer.class);
    }

    @Override
    public LanguageEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return LanguageEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Language provided for this intent's health.
   */
 @JsonDeserialize(using = LanguageEnumDeserializer.class)
  public enum LanguageEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    EN_US("en-us"),
    EN_GB("en-gb"),
    EN_AU("en-au"),
    EN_ZA("en-za"),
    EN_NZ("en-nz"),
    EN_IE("en-ie"),
    FR_CA("fr-ca"),
    FR_FR("fr-fr"),
    ES_US("es-us"),
    ES_ES("es-es"),
    ES_MX("es-mx"),
    DE_DE("de-de"),
    IT_IT("it-it"),
    PT_BR("pt-br"),
    PT_PT("pt-pt"),
    NL_NL("nl-nl");

    private String value;

    LanguageEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static LanguageEnum fromString(String key) {
      if (key == null) return null;

      for (LanguageEnum value : LanguageEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return LanguageEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private LanguageEnum language = null;
  private HealthInfo health = null;
  private String selfUri = null;

  public FlowHealthIntent() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   **/
  public FlowHealthIntent name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * Info about given flow version.
   **/
  public FlowHealthIntent flowVersionInfo(FlowHealthIntentVersionInfo flowVersionInfo) {
    this.flowVersionInfo = flowVersionInfo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Info about given flow version.")
  @JsonProperty("flowVersionInfo")
  public FlowHealthIntentVersionInfo getFlowVersionInfo() {
    return flowVersionInfo;
  }
  public void setFlowVersionInfo(FlowHealthIntentVersionInfo flowVersionInfo) {
    this.flowVersionInfo = flowVersionInfo;
  }


  /**
   * Language provided for this intent's health.
   **/
  public FlowHealthIntent language(LanguageEnum language) {
    this.language = language;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Language provided for this intent's health.")
  @JsonProperty("language")
  public LanguageEnum getLanguage() {
    return language;
  }
  public void setLanguage(LanguageEnum language) {
    this.language = language;
  }


  /**
   * Health computation details for given language.
   **/
  public FlowHealthIntent health(HealthInfo health) {
    this.health = health;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Health computation details for given language.")
  @JsonProperty("health")
  public HealthInfo getHealth() {
    return health;
  }
  public void setHealth(HealthInfo health) {
    this.health = health;
  }


  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlowHealthIntent flowHealthIntent = (FlowHealthIntent) o;

    return Objects.equals(this.id, flowHealthIntent.id) &&
            Objects.equals(this.name, flowHealthIntent.name) &&
            Objects.equals(this.flowVersionInfo, flowHealthIntent.flowVersionInfo) &&
            Objects.equals(this.language, flowHealthIntent.language) &&
            Objects.equals(this.health, flowHealthIntent.health) &&
            Objects.equals(this.selfUri, flowHealthIntent.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, flowVersionInfo, language, health, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlowHealthIntent {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    flowVersionInfo: ").append(toIndentedString(flowVersionInfo)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    health: ").append(toIndentedString(health)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

