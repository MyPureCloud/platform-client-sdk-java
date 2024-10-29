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
import com.mypurecloud.sdk.v2.model.NamedEntityTypeItem;
import com.mypurecloud.sdk.v2.model.NamedEntityTypeMechanismExample;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * NamedEntityTypeMechanism
 */

public class NamedEntityTypeMechanism  implements Serializable {
  
  private List<NamedEntityTypeItem> items = new ArrayList<NamedEntityTypeItem>();
  private Boolean restricted = null;

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
   * The type of the mechanism.
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    AI("AI"),
    DYNAMICLIST("DynamicList"),
    LIST("List"),
    REGEX("Regex"),
    UNKNOWN("Unknown");

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

  private static class SubTypeEnumDeserializer extends StdDeserializer<SubTypeEnum> {
    public SubTypeEnumDeserializer() {
      super(SubTypeEnumDeserializer.class);
    }

    @Override
    public SubTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return SubTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Subtype of detection mechanism
   */
 @JsonDeserialize(using = SubTypeEnumDeserializer.class)
  public enum SubTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ALPHANUMERIC("Alphanumeric"),
    NUMBERSEQUENCE("NumberSequence"),
    FREEFORM("FreeForm");

    private String value;

    SubTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static SubTypeEnum fromString(String key) {
      if (key == null) return null;

      for (SubTypeEnum value : SubTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return SubTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private SubTypeEnum subType = null;
  private Integer maxLength = null;
  private List<NamedEntityTypeMechanismExample> examples = new ArrayList<NamedEntityTypeMechanismExample>();

  
  /**
   * The items that define the named entity type.
   **/
  public NamedEntityTypeMechanism items(List<NamedEntityTypeItem> items) {
    this.items = items;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The items that define the named entity type.")
  @JsonProperty("items")
  public List<NamedEntityTypeItem> getItems() {
    return items;
  }
  public void setItems(List<NamedEntityTypeItem> items) {
    this.items = items;
  }


  /**
   * Whether the named entity type is restricted to the items provided. Default: false
   **/
  public NamedEntityTypeMechanism restricted(Boolean restricted) {
    this.restricted = restricted;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether the named entity type is restricted to the items provided. Default: false")
  @JsonProperty("restricted")
  public Boolean getRestricted() {
    return restricted;
  }
  public void setRestricted(Boolean restricted) {
    this.restricted = restricted;
  }


  /**
   * The type of the mechanism.
   **/
  public NamedEntityTypeMechanism type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The type of the mechanism.")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * Subtype of detection mechanism
   **/
  public NamedEntityTypeMechanism subType(SubTypeEnum subType) {
    this.subType = subType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Subtype of detection mechanism")
  @JsonProperty("subType")
  public SubTypeEnum getSubType() {
    return subType;
  }
  public void setSubType(SubTypeEnum subType) {
    this.subType = subType;
  }


  /**
   * The maximum length of the entity resolved value
   **/
  public NamedEntityTypeMechanism maxLength(Integer maxLength) {
    this.maxLength = maxLength;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The maximum length of the entity resolved value")
  @JsonProperty("maxLength")
  public Integer getMaxLength() {
    return maxLength;
  }
  public void setMaxLength(Integer maxLength) {
    this.maxLength = maxLength;
  }


  /**
   * Examples for entity detection
   **/
  public NamedEntityTypeMechanism examples(List<NamedEntityTypeMechanismExample> examples) {
    this.examples = examples;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Examples for entity detection")
  @JsonProperty("examples")
  public List<NamedEntityTypeMechanismExample> getExamples() {
    return examples;
  }
  public void setExamples(List<NamedEntityTypeMechanismExample> examples) {
    this.examples = examples;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NamedEntityTypeMechanism namedEntityTypeMechanism = (NamedEntityTypeMechanism) o;

    return Objects.equals(this.items, namedEntityTypeMechanism.items) &&
            Objects.equals(this.restricted, namedEntityTypeMechanism.restricted) &&
            Objects.equals(this.type, namedEntityTypeMechanism.type) &&
            Objects.equals(this.subType, namedEntityTypeMechanism.subType) &&
            Objects.equals(this.maxLength, namedEntityTypeMechanism.maxLength) &&
            Objects.equals(this.examples, namedEntityTypeMechanism.examples);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, restricted, type, subType, maxLength, examples);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NamedEntityTypeMechanism {\n");
    
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    restricted: ").append(toIndentedString(restricted)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    subType: ").append(toIndentedString(subType)).append("\n");
    sb.append("    maxLength: ").append(toIndentedString(maxLength)).append("\n");
    sb.append("    examples: ").append(toIndentedString(examples)).append("\n");
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

