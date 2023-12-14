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
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.SupportCenterCompactCategoryModuleTemplate;
import com.mypurecloud.sdk.v2.model.SupportCenterDetailedCategoryModuleTemplate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * SupportCenterModuleSetting
 */

public class SupportCenterModuleSetting  implements Serializable {
  

  private static class TypeEnumDeserializer extends StdDeserializer<TypeEnum> {
    public TypeEnumDeserializer() {
      super(TypeEnumDeserializer.class);
    }

    @Override
    public TypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return TypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Screen module type
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    SEARCH("Search"),
    CATEGORIES("Categories"),
    FAQ("FAQ"),
    CONTACT("Contact"),
    RESULTS("Results"),
    ARTICLE("Article"),
    TOPVIEWEDARTICLES("TopViewedArticles");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static TypeEnum fromString(String key) {
      if (key == null) return null;

      for (TypeEnum value : TypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return TypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private TypeEnum type = null;
  private Boolean enabled = null;
  private SupportCenterCompactCategoryModuleTemplate compactCategoryModuleTemplate = null;
  private SupportCenterDetailedCategoryModuleTemplate detailedCategoryModuleTemplate = null;

  
  /**
   * Screen module type
   **/
  public SupportCenterModuleSetting type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Screen module type")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * Whether or not knowledge portal (previously support center) screen module is enabled
   **/
  public SupportCenterModuleSetting enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether or not knowledge portal (previously support center) screen module is enabled")
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  /**
   * Compact category module template
   **/
  public SupportCenterModuleSetting compactCategoryModuleTemplate(SupportCenterCompactCategoryModuleTemplate compactCategoryModuleTemplate) {
    this.compactCategoryModuleTemplate = compactCategoryModuleTemplate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Compact category module template")
  @JsonProperty("compactCategoryModuleTemplate")
  public SupportCenterCompactCategoryModuleTemplate getCompactCategoryModuleTemplate() {
    return compactCategoryModuleTemplate;
  }
  public void setCompactCategoryModuleTemplate(SupportCenterCompactCategoryModuleTemplate compactCategoryModuleTemplate) {
    this.compactCategoryModuleTemplate = compactCategoryModuleTemplate;
  }


  /**
   * Detailed category module template
   **/
  public SupportCenterModuleSetting detailedCategoryModuleTemplate(SupportCenterDetailedCategoryModuleTemplate detailedCategoryModuleTemplate) {
    this.detailedCategoryModuleTemplate = detailedCategoryModuleTemplate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Detailed category module template")
  @JsonProperty("detailedCategoryModuleTemplate")
  public SupportCenterDetailedCategoryModuleTemplate getDetailedCategoryModuleTemplate() {
    return detailedCategoryModuleTemplate;
  }
  public void setDetailedCategoryModuleTemplate(SupportCenterDetailedCategoryModuleTemplate detailedCategoryModuleTemplate) {
    this.detailedCategoryModuleTemplate = detailedCategoryModuleTemplate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SupportCenterModuleSetting supportCenterModuleSetting = (SupportCenterModuleSetting) o;

    return Objects.equals(this.type, supportCenterModuleSetting.type) &&
            Objects.equals(this.enabled, supportCenterModuleSetting.enabled) &&
            Objects.equals(this.compactCategoryModuleTemplate, supportCenterModuleSetting.compactCategoryModuleTemplate) &&
            Objects.equals(this.detailedCategoryModuleTemplate, supportCenterModuleSetting.detailedCategoryModuleTemplate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, enabled, compactCategoryModuleTemplate, detailedCategoryModuleTemplate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SupportCenterModuleSetting {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    compactCategoryModuleTemplate: ").append(toIndentedString(compactCategoryModuleTemplate)).append("\n");
    sb.append("    detailedCategoryModuleTemplate: ").append(toIndentedString(detailedCategoryModuleTemplate)).append("\n");
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

