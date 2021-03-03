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
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ReplacementTerm
 */

public class ReplacementTerm  implements Serializable {
  

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
   * Gets or Sets type
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    NAME("NAME"),
    ADDRESS("ADDRESS"),
    PHONE("PHONE"),
    EMAIL("EMAIL"),
    TWITTER("TWITTER");

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
  private String existingValue = null;
  private String updatedValue = null;

  
  /**
   **/
  public ReplacementTerm type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  
  /**
   **/
  public ReplacementTerm existingValue(String existingValue) {
    this.existingValue = existingValue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("existingValue")
  public String getExistingValue() {
    return existingValue;
  }
  public void setExistingValue(String existingValue) {
    this.existingValue = existingValue;
  }

  
  /**
   **/
  public ReplacementTerm updatedValue(String updatedValue) {
    this.updatedValue = updatedValue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("updatedValue")
  public String getUpdatedValue() {
    return updatedValue;
  }
  public void setUpdatedValue(String updatedValue) {
    this.updatedValue = updatedValue;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReplacementTerm replacementTerm = (ReplacementTerm) o;
    return Objects.equals(this.type, replacementTerm.type) &&
        Objects.equals(this.existingValue, replacementTerm.existingValue) &&
        Objects.equals(this.updatedValue, replacementTerm.updatedValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, existingValue, updatedValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReplacementTerm {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    existingValue: ").append(toIndentedString(existingValue)).append("\n");
    sb.append("    updatedValue: ").append(toIndentedString(updatedValue)).append("\n");
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

