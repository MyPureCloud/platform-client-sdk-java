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
import com.mypurecloud.sdk.v2.model.ConversationSchemaData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ConversationAttributeFilter
 */

public class ConversationAttributeFilter  implements Serializable {
  
  private List<ConversationSchemaData> schemas = null;

  public ConversationAttributeFilter() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      schemas = new ArrayList<ConversationSchemaData>();
    }
  }

  
  /**
   * Schemas and attributes to filter for.
   **/
  public ConversationAttributeFilter schemas(List<ConversationSchemaData> schemas) {
    this.schemas = schemas;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Schemas and attributes to filter for.")
  @JsonProperty("schemas")
  public List<ConversationSchemaData> getSchemas() {
    return schemas;
  }
  public void setSchemas(List<ConversationSchemaData> schemas) {
    this.schemas = schemas;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationAttributeFilter conversationAttributeFilter = (ConversationAttributeFilter) o;

    return Objects.equals(this.schemas, conversationAttributeFilter.schemas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationAttributeFilter {\n");
    
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
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

