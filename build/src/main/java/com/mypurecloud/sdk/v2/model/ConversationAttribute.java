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
import com.mypurecloud.sdk.v2.model.ConversationAttributeSchema;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ConversationAttribute
 */

public class ConversationAttribute  implements Serializable {
  
  private ConversationAttributeSchema schema = null;
  private String attributeName = null;

  public ConversationAttribute() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public ConversationAttribute(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The Conversation Custom Attributes schema that the variable is bound to.
   **/
  public ConversationAttribute schema(ConversationAttributeSchema schema) {
    this.schema = schema;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The Conversation Custom Attributes schema that the variable is bound to.")
  @JsonProperty("schema")
  public ConversationAttributeSchema getSchema() {
    return schema;
  }
  public void setSchema(ConversationAttributeSchema schema) {
    this.schema = schema;
  }


  /**
   * The name of the attribute within the schema that the variable value is bound to.
   **/
  public ConversationAttribute attributeName(String attributeName) {
    this.attributeName = attributeName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the attribute within the schema that the variable value is bound to.")
  @JsonProperty("attributeName")
  public String getAttributeName() {
    return attributeName;
  }
  public void setAttributeName(String attributeName) {
    this.attributeName = attributeName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationAttribute conversationAttribute = (ConversationAttribute) o;

    return Objects.equals(this.schema, conversationAttribute.schema) &&
            Objects.equals(this.attributeName, conversationAttribute.attributeName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schema, attributeName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationAttribute {\n");
    
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
    sb.append("    attributeName: ").append(toIndentedString(attributeName)).append("\n");
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

