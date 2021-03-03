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
 * RequestMapping
 */

public class RequestMapping  implements Serializable {
  
  private String name = null;

  private static class AttributeTypeEnumDeserializer extends StdDeserializer<AttributeTypeEnum> {
    public AttributeTypeEnumDeserializer() {
      super(AttributeTypeEnumDeserializer.class);
    }

    @Override
    public AttributeTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return AttributeTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Type of the value supplied
   */
 @JsonDeserialize(using = AttributeTypeEnumDeserializer.class)
  public enum AttributeTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    STRING("String"),
    NUMBER("Number"),
    INTEGER("Integer"),
    BOOLEAN("Boolean");

    private String value;

    AttributeTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static AttributeTypeEnum fromString(String key) {
      if (key == null) return null;

      for (AttributeTypeEnum value : AttributeTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return AttributeTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private AttributeTypeEnum attributeType = null;

  private static class MappingTypeEnumDeserializer extends StdDeserializer<MappingTypeEnum> {
    public MappingTypeEnumDeserializer() {
      super(MappingTypeEnumDeserializer.class);
    }

    @Override
    public MappingTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return MappingTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Method of finding value to use with Attribute
   */
 @JsonDeserialize(using = MappingTypeEnumDeserializer.class)
  public enum MappingTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    LOOKUP("Lookup"),
    HARDCODED("HardCoded");

    private String value;

    MappingTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static MappingTypeEnum fromString(String key) {
      if (key == null) return null;

      for (MappingTypeEnum value : MappingTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return MappingTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private MappingTypeEnum mappingType = null;
  private String value = null;

  
  /**
   * Name of the Integration Action Attribute to supply the value for
   **/
  public RequestMapping name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Name of the Integration Action Attribute to supply the value for")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Type of the value supplied
   **/
  public RequestMapping attributeType(AttributeTypeEnum attributeType) {
    this.attributeType = attributeType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Type of the value supplied")
  @JsonProperty("attributeType")
  public AttributeTypeEnum getAttributeType() {
    return attributeType;
  }
  public void setAttributeType(AttributeTypeEnum attributeType) {
    this.attributeType = attributeType;
  }

  
  /**
   * Method of finding value to use with Attribute
   **/
  public RequestMapping mappingType(MappingTypeEnum mappingType) {
    this.mappingType = mappingType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Method of finding value to use with Attribute")
  @JsonProperty("mappingType")
  public MappingTypeEnum getMappingType() {
    return mappingType;
  }
  public void setMappingType(MappingTypeEnum mappingType) {
    this.mappingType = mappingType;
  }

  
  /**
   * Value to supply for the specified Attribute
   **/
  public RequestMapping value(String value) {
    this.value = value;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Value to supply for the specified Attribute")
  @JsonProperty("value")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestMapping requestMapping = (RequestMapping) o;
    return Objects.equals(this.name, requestMapping.name) &&
        Objects.equals(this.attributeType, requestMapping.attributeType) &&
        Objects.equals(this.mappingType, requestMapping.mappingType) &&
        Objects.equals(this.value, requestMapping.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, attributeType, mappingType, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestMapping {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    attributeType: ").append(toIndentedString(attributeType)).append("\n");
    sb.append("    mappingType: ").append(toIndentedString(mappingType)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

