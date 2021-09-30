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
import com.mypurecloud.sdk.v2.model.NamedEntityTypeBinding;
import com.mypurecloud.sdk.v2.model.NluUtterance;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * IntentDefinition
 */

public class IntentDefinition  implements Serializable {
  
  private String name = null;
  private List<NamedEntityTypeBinding> entityTypeBindings = new ArrayList<NamedEntityTypeBinding>();
  private List<String> entityNameReferences = new ArrayList<String>();
  private List<NluUtterance> utterances = new ArrayList<NluUtterance>();

  
  /**
   * The name of the intent.
   **/
  public IntentDefinition name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the intent.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The bindings for the named entity types used in this intent.This field is mutually exclusive with entityNameReferences and entities
   **/
  public IntentDefinition entityTypeBindings(List<NamedEntityTypeBinding> entityTypeBindings) {
    this.entityTypeBindings = entityTypeBindings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The bindings for the named entity types used in this intent.This field is mutually exclusive with entityNameReferences and entities")
  @JsonProperty("entityTypeBindings")
  public List<NamedEntityTypeBinding> getEntityTypeBindings() {
    return entityTypeBindings;
  }
  public void setEntityTypeBindings(List<NamedEntityTypeBinding> entityTypeBindings) {
    this.entityTypeBindings = entityTypeBindings;
  }

  
  @ApiModelProperty(example = "null", value = "The references for the named entity used in this intent.This field is mutually exclusive with entityTypeBindings")
  @JsonProperty("entityNameReferences")
  public List<String> getEntityNameReferences() {
    return entityNameReferences;
  }

  
  /**
   * The utterances that act as training phrases for the intent.
   **/
  public IntentDefinition utterances(List<NluUtterance> utterances) {
    this.utterances = utterances;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The utterances that act as training phrases for the intent.")
  @JsonProperty("utterances")
  public List<NluUtterance> getUtterances() {
    return utterances;
  }
  public void setUtterances(List<NluUtterance> utterances) {
    this.utterances = utterances;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntentDefinition intentDefinition = (IntentDefinition) o;
    return Objects.equals(this.name, intentDefinition.name) &&
        Objects.equals(this.entityTypeBindings, intentDefinition.entityTypeBindings) &&
        Objects.equals(this.entityNameReferences, intentDefinition.entityNameReferences) &&
        Objects.equals(this.utterances, intentDefinition.utterances);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, entityTypeBindings, entityNameReferences, utterances);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntentDefinition {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    entityTypeBindings: ").append(toIndentedString(entityTypeBindings)).append("\n");
    sb.append("    entityNameReferences: ").append(toIndentedString(entityNameReferences)).append("\n");
    sb.append("    utterances: ").append(toIndentedString(utterances)).append("\n");
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

