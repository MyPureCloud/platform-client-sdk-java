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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * DocumentBodyListBlockProperties
 */

public class DocumentBodyListBlockProperties  implements Serializable {
  

  private static class UnorderedTypeEnumDeserializer extends StdDeserializer<UnorderedTypeEnum> {
    public UnorderedTypeEnumDeserializer() {
      super(UnorderedTypeEnumDeserializer.class);
    }

    @Override
    public UnorderedTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return UnorderedTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The type of icon for the unordered list.
   */
 @JsonDeserialize(using = UnorderedTypeEnumDeserializer.class)
  public enum UnorderedTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    NORMAL("Normal"),
    SQUARE("Square"),
    CIRCLE("Circle"),
    NONE("None");

    private String value;

    UnorderedTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static UnorderedTypeEnum fromString(String key) {
      if (key == null) return null;

      for (UnorderedTypeEnum value : UnorderedTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return UnorderedTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private UnorderedTypeEnum unorderedType = null;

  private static class OrderedTypeEnumDeserializer extends StdDeserializer<OrderedTypeEnum> {
    public OrderedTypeEnumDeserializer() {
      super(OrderedTypeEnumDeserializer.class);
    }

    @Override
    public OrderedTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return OrderedTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The type of icon for the ordered list.
   */
 @JsonDeserialize(using = OrderedTypeEnumDeserializer.class)
  public enum OrderedTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    NUMBER("Number"),
    LOWERALPHA("LowerAlpha"),
    LOWERGREEK("LowerGreek"),
    LOWERROMAN("LowerRoman"),
    UPPERALPHA("UpperAlpha"),
    UPPERROMAN("UpperRoman"),
    NONE("None");

    private String value;

    OrderedTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static OrderedTypeEnum fromString(String key) {
      if (key == null) return null;

      for (OrderedTypeEnum value : OrderedTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return OrderedTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private OrderedTypeEnum orderedType = null;

  
  /**
   * The type of icon for the unordered list.
   **/
  public DocumentBodyListBlockProperties unorderedType(UnorderedTypeEnum unorderedType) {
    this.unorderedType = unorderedType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type of icon for the unordered list.")
  @JsonProperty("unorderedType")
  public UnorderedTypeEnum getUnorderedType() {
    return unorderedType;
  }
  public void setUnorderedType(UnorderedTypeEnum unorderedType) {
    this.unorderedType = unorderedType;
  }


  /**
   * The type of icon for the ordered list.
   **/
  public DocumentBodyListBlockProperties orderedType(OrderedTypeEnum orderedType) {
    this.orderedType = orderedType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type of icon for the ordered list.")
  @JsonProperty("orderedType")
  public OrderedTypeEnum getOrderedType() {
    return orderedType;
  }
  public void setOrderedType(OrderedTypeEnum orderedType) {
    this.orderedType = orderedType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentBodyListBlockProperties documentBodyListBlockProperties = (DocumentBodyListBlockProperties) o;

    return Objects.equals(this.unorderedType, documentBodyListBlockProperties.unorderedType) &&
            Objects.equals(this.orderedType, documentBodyListBlockProperties.orderedType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unorderedType, orderedType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentBodyListBlockProperties {\n");
    
    sb.append("    unorderedType: ").append(toIndentedString(unorderedType)).append("\n");
    sb.append("    orderedType: ").append(toIndentedString(orderedType)).append("\n");
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

