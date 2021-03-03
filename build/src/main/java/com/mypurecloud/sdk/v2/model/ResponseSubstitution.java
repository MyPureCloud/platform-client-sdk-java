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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Contains information about the substitutions associated with a response.
 */
@ApiModel(description = "Contains information about the substitutions associated with a response.")

public class ResponseSubstitution  implements Serializable {
  
  private String id = null;
  private String description = null;
  private String defaultValue = null;

  
  /**
   * Response substitution identifier.
   **/
  public ResponseSubstitution id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Response substitution identifier.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * Response substitution description.
   **/
  public ResponseSubstitution description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Response substitution description.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * Response substitution default value.
   **/
  public ResponseSubstitution defaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Response substitution default value.")
  @JsonProperty("defaultValue")
  public String getDefaultValue() {
    return defaultValue;
  }
  public void setDefaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseSubstitution responseSubstitution = (ResponseSubstitution) o;
    return Objects.equals(this.id, responseSubstitution.id) &&
        Objects.equals(this.description, responseSubstitution.description) &&
        Objects.equals(this.defaultValue, responseSubstitution.defaultValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, description, defaultValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseSubstitution {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
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

