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
import com.mypurecloud.sdk.v2.model.ConversationSchemaReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ConversationAttributeProperties
 */

public class ConversationAttributeProperties  implements Serializable {
  
  private ConversationSchemaReference schema = null;
  private String name = null;

  public ConversationAttributeProperties() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Schema that defines attributes.
   **/
  public ConversationAttributeProperties schema(ConversationSchemaReference schema) {
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
   * Attribute name.
   **/
  public ConversationAttributeProperties name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Attribute name.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationAttributeProperties conversationAttributeProperties = (ConversationAttributeProperties) o;

    return Objects.equals(this.schema, conversationAttributeProperties.schema) &&
            Objects.equals(this.name, conversationAttributeProperties.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schema, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationAttributeProperties {\n");
    
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

