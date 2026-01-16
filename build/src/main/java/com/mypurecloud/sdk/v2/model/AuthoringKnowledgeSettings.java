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
 * AuthoringKnowledgeSettings
 */

public class AuthoringKnowledgeSettings  implements Serializable {
  
  private String knowledgeId = null;
  private String description = null;

  private static class KnowledgeTypeEnumDeserializer extends StdDeserializer<KnowledgeTypeEnum> {
    public KnowledgeTypeEnumDeserializer() {
      super(KnowledgeTypeEnumDeserializer.class);
    }

    @Override
    public KnowledgeTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return KnowledgeTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The type of the knowledge settings (Standard or Enhanced)
   */
 @JsonDeserialize(using = KnowledgeTypeEnumDeserializer.class)
  public enum KnowledgeTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    STANDARD("Standard"),
    ENHANCED("Enhanced");

    private String value;

    KnowledgeTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static KnowledgeTypeEnum fromString(String key) {
      if (key == null) return null;

      for (KnowledgeTypeEnum value : KnowledgeTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return KnowledgeTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private KnowledgeTypeEnum knowledgeType = null;
  private Boolean inheritFromExternal = null;

  public AuthoringKnowledgeSettings() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The ID of the knowledge settings to use
   **/
  public AuthoringKnowledgeSettings knowledgeId(String knowledgeId) {
    this.knowledgeId = knowledgeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of the knowledge settings to use")
  @JsonProperty("knowledgeId")
  public String getKnowledgeId() {
    return knowledgeId;
  }
  public void setKnowledgeId(String knowledgeId) {
    this.knowledgeId = knowledgeId;
  }


  /**
   * Description of the knowledge settings
   **/
  public AuthoringKnowledgeSettings description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Description of the knowledge settings")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * The type of the knowledge settings (Standard or Enhanced)
   **/
  public AuthoringKnowledgeSettings knowledgeType(KnowledgeTypeEnum knowledgeType) {
    this.knowledgeType = knowledgeType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type of the knowledge settings (Standard or Enhanced)")
  @JsonProperty("knowledgeType")
  public KnowledgeTypeEnum getKnowledgeType() {
    return knowledgeType;
  }
  public void setKnowledgeType(KnowledgeTypeEnum knowledgeType) {
    this.knowledgeType = knowledgeType;
  }


  /**
   * Whether to inherit knowledge settings from externalIf disabled, query detection is always enabled on the guide.
   **/
  public AuthoringKnowledgeSettings inheritFromExternal(Boolean inheritFromExternal) {
    this.inheritFromExternal = inheritFromExternal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether to inherit knowledge settings from externalIf disabled, query detection is always enabled on the guide.")
  @JsonProperty("inheritFromExternal")
  public Boolean getInheritFromExternal() {
    return inheritFromExternal;
  }
  public void setInheritFromExternal(Boolean inheritFromExternal) {
    this.inheritFromExternal = inheritFromExternal;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthoringKnowledgeSettings authoringKnowledgeSettings = (AuthoringKnowledgeSettings) o;

    return Objects.equals(this.knowledgeId, authoringKnowledgeSettings.knowledgeId) &&
            Objects.equals(this.description, authoringKnowledgeSettings.description) &&
            Objects.equals(this.knowledgeType, authoringKnowledgeSettings.knowledgeType) &&
            Objects.equals(this.inheritFromExternal, authoringKnowledgeSettings.inheritFromExternal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(knowledgeId, description, knowledgeType, inheritFromExternal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthoringKnowledgeSettings {\n");
    
    sb.append("    knowledgeId: ").append(toIndentedString(knowledgeId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    knowledgeType: ").append(toIndentedString(knowledgeType)).append("\n");
    sb.append("    inheritFromExternal: ").append(toIndentedString(inheritFromExternal)).append("\n");
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

