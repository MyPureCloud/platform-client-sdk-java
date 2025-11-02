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
import com.mypurecloud.sdk.v2.model.ConversationSchemaAttribute;
import com.mypurecloud.sdk.v2.model.ConversationSchemaReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ConversationSchemaData
 */

public class ConversationSchemaData  implements Serializable {
  
  private ConversationSchemaReference schema = null;
  private List<ConversationSchemaAttribute> attributes = null;

  private static class OperatorEnumDeserializer extends StdDeserializer<OperatorEnum> {
    public OperatorEnumDeserializer() {
      super(OperatorEnumDeserializer.class);
    }

    @Override
    public OperatorEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return OperatorEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Operator to apply for multiple attributes, default: MatchAll
   */
 @JsonDeserialize(using = OperatorEnumDeserializer.class)
  public enum OperatorEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    MATCHANY("MatchAny"),
    MATCHALL("MatchAll");

    private String value;

    OperatorEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static OperatorEnum fromString(String key) {
      if (key == null) return null;

      for (OperatorEnum value : OperatorEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return OperatorEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private OperatorEnum operator = null;

  public ConversationSchemaData() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      attributes = new ArrayList<ConversationSchemaAttribute>();
    }
  }

  
  /**
   * Schema that defines attributes.
   **/
  public ConversationSchemaData schema(ConversationSchemaReference schema) {
    this.schema = schema;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Schema that defines attributes.")
  @JsonProperty("schema")
  public ConversationSchemaReference getSchema() {
    return schema;
  }
  public void setSchema(ConversationSchemaReference schema) {
    this.schema = schema;
  }


  /**
   * Attributes to use for filtering; number of elements: min: 1, max: 5.
   **/
  public ConversationSchemaData attributes(List<ConversationSchemaAttribute> attributes) {
    this.attributes = attributes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Attributes to use for filtering; number of elements: min: 1, max: 5.")
  @JsonProperty("attributes")
  public List<ConversationSchemaAttribute> getAttributes() {
    return attributes;
  }
  public void setAttributes(List<ConversationSchemaAttribute> attributes) {
    this.attributes = attributes;
  }


  /**
   * Operator to apply for multiple attributes, default: MatchAll
   **/
  public ConversationSchemaData operator(OperatorEnum operator) {
    this.operator = operator;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Operator to apply for multiple attributes, default: MatchAll")
  @JsonProperty("operator")
  public OperatorEnum getOperator() {
    return operator;
  }
  public void setOperator(OperatorEnum operator) {
    this.operator = operator;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationSchemaData conversationSchemaData = (ConversationSchemaData) o;

    return Objects.equals(this.schema, conversationSchemaData.schema) &&
            Objects.equals(this.attributes, conversationSchemaData.attributes) &&
            Objects.equals(this.operator, conversationSchemaData.operator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schema, attributes, operator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationSchemaData {\n");
    
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
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

