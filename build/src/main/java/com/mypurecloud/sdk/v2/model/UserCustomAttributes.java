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
import com.mypurecloud.sdk.v2.model.DataSchema;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * UserCustomAttributes
 */

public class UserCustomAttributes  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String userId = null;
  private DataSchema schema = null;
  private Map<String, Object> attributes = null;
  private String selfUri = null;

  public UserCustomAttributes() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   **/
  public UserCustomAttributes name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The user's Id which the attributes are being assigned to.
   **/
  public UserCustomAttributes userId(String userId) {
    this.userId = userId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user's Id which the attributes are being assigned to.")
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }


  /**
   * The schema that dictates which attributes can be included.
   **/
  public UserCustomAttributes schema(DataSchema schema) {
    this.schema = schema;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The schema that dictates which attributes can be included.")
  @JsonProperty("schema")
  public DataSchema getSchema() {
    return schema;
  }
  public void setSchema(DataSchema schema) {
    this.schema = schema;
  }


  /**
   * The map of attribute values.
   **/
  public UserCustomAttributes attributes(Map<String, Object> attributes) {
    this.attributes = attributes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The map of attribute values.")
  @JsonProperty("attributes")
  public Map<String, Object> getAttributes() {
    return attributes;
  }
  public void setAttributes(Map<String, Object> attributes) {
    this.attributes = attributes;
  }


  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserCustomAttributes userCustomAttributes = (UserCustomAttributes) o;

    return Objects.equals(this.id, userCustomAttributes.id) &&
            Objects.equals(this.name, userCustomAttributes.name) &&
            Objects.equals(this.userId, userCustomAttributes.userId) &&
            Objects.equals(this.schema, userCustomAttributes.schema) &&
            Objects.equals(this.attributes, userCustomAttributes.attributes) &&
            Objects.equals(this.selfUri, userCustomAttributes.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, userId, schema, attributes, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserCustomAttributes {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

