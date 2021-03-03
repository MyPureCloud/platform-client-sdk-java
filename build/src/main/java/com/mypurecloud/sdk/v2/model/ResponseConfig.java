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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * Defines response components of the Action Request.
 */
@ApiModel(description = "Defines response components of the Action Request.")

public class ResponseConfig  implements Serializable {
  
  private Map<String, String> translationMap = null;
  private Map<String, String> translationMapDefaults = null;
  private String successTemplate = null;
  private String successTemplateUri = null;

  
  /**
   * Map 'attribute name' and 'JSON path' pairs used to extract data from REST response.
   **/
  public ResponseConfig translationMap(Map<String, String> translationMap) {
    this.translationMap = translationMap;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Map 'attribute name' and 'JSON path' pairs used to extract data from REST response.")
  @JsonProperty("translationMap")
  public Map<String, String> getTranslationMap() {
    return translationMap;
  }
  public void setTranslationMap(Map<String, String> translationMap) {
    this.translationMap = translationMap;
  }

  
  /**
   * Map 'attribute name' and 'default value' pairs used as fallback values if JSON path extraction fails for specified key.
   **/
  public ResponseConfig translationMapDefaults(Map<String, String> translationMapDefaults) {
    this.translationMapDefaults = translationMapDefaults;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Map 'attribute name' and 'default value' pairs used as fallback values if JSON path extraction fails for specified key.")
  @JsonProperty("translationMapDefaults")
  public Map<String, String> getTranslationMapDefaults() {
    return translationMapDefaults;
  }
  public void setTranslationMapDefaults(Map<String, String> translationMapDefaults) {
    this.translationMapDefaults = translationMapDefaults;
  }

  
  /**
   * Velocity template to build response to return from Action.
   **/
  public ResponseConfig successTemplate(String successTemplate) {
    this.successTemplate = successTemplate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Velocity template to build response to return from Action.")
  @JsonProperty("successTemplate")
  public String getSuccessTemplate() {
    return successTemplate;
  }
  public void setSuccessTemplate(String successTemplate) {
    this.successTemplate = successTemplate;
  }

  
  /**
   * URI to retrieve success template.
   **/
  public ResponseConfig successTemplateUri(String successTemplateUri) {
    this.successTemplateUri = successTemplateUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "URI to retrieve success template.")
  @JsonProperty("successTemplateUri")
  public String getSuccessTemplateUri() {
    return successTemplateUri;
  }
  public void setSuccessTemplateUri(String successTemplateUri) {
    this.successTemplateUri = successTemplateUri;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseConfig responseConfig = (ResponseConfig) o;
    return Objects.equals(this.translationMap, responseConfig.translationMap) &&
        Objects.equals(this.translationMapDefaults, responseConfig.translationMapDefaults) &&
        Objects.equals(this.successTemplate, responseConfig.successTemplate) &&
        Objects.equals(this.successTemplateUri, responseConfig.successTemplateUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(translationMap, translationMapDefaults, successTemplate, successTemplateUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseConfig {\n");
    
    sb.append("    translationMap: ").append(toIndentedString(translationMap)).append("\n");
    sb.append("    translationMapDefaults: ").append(toIndentedString(translationMapDefaults)).append("\n");
    sb.append("    successTemplate: ").append(toIndentedString(successTemplate)).append("\n");
    sb.append("    successTemplateUri: ").append(toIndentedString(successTemplateUri)).append("\n");
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

