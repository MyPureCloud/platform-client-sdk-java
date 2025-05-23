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
import com.mypurecloud.sdk.v2.model.LocaleHealth;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * FlowHealthIntentInfo
 */

public class FlowHealthIntentInfo  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Map<String, LocaleHealth> languageHealth = null;
  private String selfUri = null;

  public FlowHealthIntentInfo() {
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
  public FlowHealthIntentInfo name(String name) {
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
   * Health computation info for each language.
   **/
  public FlowHealthIntentInfo languageHealth(Map<String, LocaleHealth> languageHealth) {
    this.languageHealth = languageHealth;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Health computation info for each language.")
  @JsonProperty("languageHealth")
  public Map<String, LocaleHealth> getLanguageHealth() {
    return languageHealth;
  }
  public void setLanguageHealth(Map<String, LocaleHealth> languageHealth) {
    this.languageHealth = languageHealth;
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
    FlowHealthIntentInfo flowHealthIntentInfo = (FlowHealthIntentInfo) o;

    return Objects.equals(this.id, flowHealthIntentInfo.id) &&
            Objects.equals(this.name, flowHealthIntentInfo.name) &&
            Objects.equals(this.languageHealth, flowHealthIntentInfo.languageHealth) &&
            Objects.equals(this.selfUri, flowHealthIntentInfo.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, languageHealth, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlowHealthIntentInfo {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    languageHealth: ").append(toIndentedString(languageHealth)).append("\n");
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

