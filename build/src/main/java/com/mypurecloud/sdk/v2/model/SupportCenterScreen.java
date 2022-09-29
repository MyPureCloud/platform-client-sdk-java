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
import com.mypurecloud.sdk.v2.model.SupportCenterModuleSetting;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * SupportCenterScreen
 */

public class SupportCenterScreen  implements Serializable {
  

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
   * The type of the screen
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    HOME("Home"),
    CATEGORY("Category"),
    SEARCHRESULTS("SearchResults"),
    ARTICLE("Article");

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
  private List<SupportCenterModuleSetting> moduleSettings = null;

  
  /**
   * The type of the screen
   **/
  public SupportCenterScreen type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type of the screen")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * Module settings for the screen
   **/
  public SupportCenterScreen moduleSettings(List<SupportCenterModuleSetting> moduleSettings) {
    this.moduleSettings = moduleSettings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Module settings for the screen")
  @JsonProperty("moduleSettings")
  public List<SupportCenterModuleSetting> getModuleSettings() {
    return moduleSettings;
  }
  public void setModuleSettings(List<SupportCenterModuleSetting> moduleSettings) {
    this.moduleSettings = moduleSettings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SupportCenterScreen supportCenterScreen = (SupportCenterScreen) o;

    return Objects.equals(this.type, supportCenterScreen.type) &&
            Objects.equals(this.moduleSettings, supportCenterScreen.moduleSettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, moduleSettings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SupportCenterScreen {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    moduleSettings: ").append(toIndentedString(moduleSettings)).append("\n");
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

