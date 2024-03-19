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
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * DocumentQueryPredicate
 */

public class DocumentQueryPredicate  implements Serializable {
  

  private static class FieldsEnumDeserializer extends StdDeserializer<FieldsEnum> {
    public FieldsEnumDeserializer() {
      super(FieldsEnumDeserializer.class);
    }

    @Override
    public FieldsEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return FieldsEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets fields
   */
 @JsonDeserialize(using = FieldsEnumDeserializer.class)
  public enum FieldsEnum {
    ALTERNATIVES("alternatives"),
    CATEGORYID("categoryId"),
    CATEGORYNAME("categoryName"),
    CONTEXTID("contextId"),
    CONTEXTNAME("contextName"),
    CONTEXTVALUEID("contextValueId"),
    CONTEXTVALUENAME("contextValueName"),
    DOCUMENTID("documentId"),
    LABELID("labelId"),
    LABELNAME("labelName"),
    TITLE("title"),
    VARIATIONID("variationId"),
    VISIBLE("visible"),
    STATE("state");

    private String value;

    FieldsEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static FieldsEnum fromString(String key) {
      if (key == null) return null;

      for (FieldsEnum value : FieldsEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return FieldsEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<FieldsEnum> fields = new ArrayList<FieldsEnum>();
  private List<String> values = new ArrayList<String>();

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
   * Specifies the matching criteria between the fields and values.
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    EQUALS("Equals"),
    NOTEQUALS("NotEquals"),
    CONTAINS("Contains"),
    MATCHALL("MatchAll"),
    MATCHANY("MatchAny");

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

  
  /**
   * Specifies the document fields to be matched against.
   **/
  public DocumentQueryPredicate fields(List<FieldsEnum> fields) {
    this.fields = fields;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Specifies the document fields to be matched against.")
  @JsonProperty("fields")
  public List<FieldsEnum> getFields() {
    return fields;
  }
  public void setFields(List<FieldsEnum> fields) {
    this.fields = fields;
  }


  /**
   * Specifies the values of the fields to be matched against.
   **/
  public DocumentQueryPredicate values(List<String> values) {
    this.values = values;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Specifies the values of the fields to be matched against.")
  @JsonProperty("values")
  public List<String> getValues() {
    return values;
  }
  public void setValues(List<String> values) {
    this.values = values;
  }


  /**
   * Specifies the matching criteria between the fields and values.
   **/
  public DocumentQueryPredicate type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Specifies the matching criteria between the fields and values.")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentQueryPredicate documentQueryPredicate = (DocumentQueryPredicate) o;

    return Objects.equals(this.fields, documentQueryPredicate.fields) &&
            Objects.equals(this.values, documentQueryPredicate.values) &&
            Objects.equals(this.type, documentQueryPredicate.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fields, values, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentQueryPredicate {\n");
    
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

