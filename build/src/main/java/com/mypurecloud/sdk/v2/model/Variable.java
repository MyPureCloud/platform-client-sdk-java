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
 * Variable
 */

public class Variable  implements Serializable {
  
  private String name = null;

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
   * The data type of the variable.
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    STRING("String"),
    INTEGER("Integer"),
    NUMBER("Number"),
    BOOLEAN("Boolean");

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

  private static class ScopeEnumDeserializer extends StdDeserializer<ScopeEnum> {
    public ScopeEnumDeserializer() {
      super(ScopeEnumDeserializer.class);
    }

    @Override
    public ScopeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ScopeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The scope that determines the variable's usage context within Guides runtime.
   */
 @JsonDeserialize(using = ScopeEnumDeserializer.class)
  public enum ScopeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    INPUT("Input"),
    OUTPUT("Output"),
    INPUTANDOUTPUT("InputAndOutput");

    private String value;

    ScopeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ScopeEnum fromString(String key) {
      if (key == null) return null;

      for (ScopeEnum value : ScopeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ScopeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ScopeEnum scope = null;
  private String description = null;

  public Variable() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The name of the variable.
   **/
  public Variable name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the variable.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The data type of the variable.
   **/
  public Variable type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The data type of the variable.")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * The scope that determines the variable's usage context within Guides runtime.
   **/
  public Variable scope(ScopeEnum scope) {
    this.scope = scope;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The scope that determines the variable's usage context within Guides runtime.")
  @JsonProperty("scope")
  public ScopeEnum getScope() {
    return scope;
  }
  public void setScope(ScopeEnum scope) {
    this.scope = scope;
  }


  /**
   * The description of the variable used by Guides runtime for input/output handling.
   **/
  public Variable description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The description of the variable used by Guides runtime for input/output handling.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Variable variable = (Variable) o;

    return Objects.equals(this.name, variable.name) &&
            Objects.equals(this.type, variable.type) &&
            Objects.equals(this.scope, variable.scope) &&
            Objects.equals(this.description, variable.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, scope, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Variable {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

