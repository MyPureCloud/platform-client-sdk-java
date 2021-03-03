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
import com.mypurecloud.sdk.v2.model.NamedEntityTypeMechanism;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * NamedEntityTypeDefinition
 */

public class NamedEntityTypeDefinition  implements Serializable {
  
  private String name = null;
  private String description = null;
  private NamedEntityTypeMechanism mechanism = null;

  
  /**
   * The name of the entity type.
   **/
  public NamedEntityTypeDefinition name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the entity type.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Description of the of the named entity type.
   **/
  public NamedEntityTypeDefinition description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Description of the of the named entity type.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * The mechanism enabling detection of the named entity type.
   **/
  public NamedEntityTypeDefinition mechanism(NamedEntityTypeMechanism mechanism) {
    this.mechanism = mechanism;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The mechanism enabling detection of the named entity type.")
  @JsonProperty("mechanism")
  public NamedEntityTypeMechanism getMechanism() {
    return mechanism;
  }
  public void setMechanism(NamedEntityTypeMechanism mechanism) {
    this.mechanism = mechanism;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NamedEntityTypeDefinition namedEntityTypeDefinition = (NamedEntityTypeDefinition) o;
    return Objects.equals(this.name, namedEntityTypeDefinition.name) &&
        Objects.equals(this.description, namedEntityTypeDefinition.description) &&
        Objects.equals(this.mechanism, namedEntityTypeDefinition.mechanism);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, mechanism);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NamedEntityTypeDefinition {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    mechanism: ").append(toIndentedString(mechanism)).append("\n");
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

