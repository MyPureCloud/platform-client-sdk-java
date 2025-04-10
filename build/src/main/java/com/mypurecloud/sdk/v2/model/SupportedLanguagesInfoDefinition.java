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
import com.mypurecloud.sdk.v2.model.SupportedEntityTypeStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * SupportedLanguagesInfoDefinition
 */

public class SupportedLanguagesInfoDefinition  implements Serializable {
  
  private String language = null;
  private Boolean intentClassification = null;

  private static class StatusEnumDeserializer extends StdDeserializer<StatusEnum> {
    public StatusEnumDeserializer() {
      super(StatusEnumDeserializer.class);
    }

    @Override
    public StatusEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return StatusEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The language release status
   */
 @JsonDeserialize(using = StatusEnumDeserializer.class)
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    EARLY_PREVIEW("EARLY_PREVIEW"),
    PREVIEW("PREVIEW"),
    GA("GA");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StatusEnum fromString(String key) {
      if (key == null) return null;

      for (StatusEnum value : StatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StatusEnum status = null;
  private List<String> supportedEntityTypes = null;
  private SupportedEntityTypeStatus supportedEntityTypeConfiguration = null;

  public SupportedLanguagesInfoDefinition() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      supportedEntityTypes = new ArrayList<String>();
    }
  }

  
  /**
   * The given supported Language
   **/
  public SupportedLanguagesInfoDefinition language(String language) {
    this.language = language;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The given supported Language")
  @JsonProperty("language")
  public String getLanguage() {
    return language;
  }
  public void setLanguage(String language) {
    this.language = language;
  }


  /**
   * The boolean status of if intent classification is supported in this language
   **/
  public SupportedLanguagesInfoDefinition intentClassification(Boolean intentClassification) {
    this.intentClassification = intentClassification;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The boolean status of if intent classification is supported in this language")
  @JsonProperty("intentClassification")
  public Boolean getIntentClassification() {
    return intentClassification;
  }
  public void setIntentClassification(Boolean intentClassification) {
    this.intentClassification = intentClassification;
  }


  /**
   * The language release status
   **/
  public SupportedLanguagesInfoDefinition status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The language release status")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  /**
   * The supported entity types for this language
   **/
  public SupportedLanguagesInfoDefinition supportedEntityTypes(List<String> supportedEntityTypes) {
    this.supportedEntityTypes = supportedEntityTypes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The supported entity types for this language")
  @JsonProperty("supportedEntityTypes")
  public List<String> getSupportedEntityTypes() {
    return supportedEntityTypes;
  }
  public void setSupportedEntityTypes(List<String> supportedEntityTypes) {
    this.supportedEntityTypes = supportedEntityTypes;
  }


  /**
   * The configuration for the supported entity types
   **/
  public SupportedLanguagesInfoDefinition supportedEntityTypeConfiguration(SupportedEntityTypeStatus supportedEntityTypeConfiguration) {
    this.supportedEntityTypeConfiguration = supportedEntityTypeConfiguration;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The configuration for the supported entity types")
  @JsonProperty("supportedEntityTypeConfiguration")
  public SupportedEntityTypeStatus getSupportedEntityTypeConfiguration() {
    return supportedEntityTypeConfiguration;
  }
  public void setSupportedEntityTypeConfiguration(SupportedEntityTypeStatus supportedEntityTypeConfiguration) {
    this.supportedEntityTypeConfiguration = supportedEntityTypeConfiguration;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SupportedLanguagesInfoDefinition supportedLanguagesInfoDefinition = (SupportedLanguagesInfoDefinition) o;

    return Objects.equals(this.language, supportedLanguagesInfoDefinition.language) &&
            Objects.equals(this.intentClassification, supportedLanguagesInfoDefinition.intentClassification) &&
            Objects.equals(this.status, supportedLanguagesInfoDefinition.status) &&
            Objects.equals(this.supportedEntityTypes, supportedLanguagesInfoDefinition.supportedEntityTypes) &&
            Objects.equals(this.supportedEntityTypeConfiguration, supportedLanguagesInfoDefinition.supportedEntityTypeConfiguration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(language, intentClassification, status, supportedEntityTypes, supportedEntityTypeConfiguration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SupportedLanguagesInfoDefinition {\n");
    
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    intentClassification: ").append(toIndentedString(intentClassification)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    supportedEntityTypes: ").append(toIndentedString(supportedEntityTypes)).append("\n");
    sb.append("    supportedEntityTypeConfiguration: ").append(toIndentedString(supportedEntityTypeConfiguration)).append("\n");
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

