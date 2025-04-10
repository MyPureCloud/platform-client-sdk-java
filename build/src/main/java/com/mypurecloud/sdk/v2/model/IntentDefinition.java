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
import com.mypurecloud.sdk.v2.model.AdditionalLanguagesIntent;
import com.mypurecloud.sdk.v2.model.NamedEntityTypeBinding;
import com.mypurecloud.sdk.v2.model.NluUtterance;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * IntentDefinition
 */

public class IntentDefinition  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String description = null;
  private List<NamedEntityTypeBinding> entityTypeBindings = null;
  private List<String> entityNameReferences = null;
  private List<NluUtterance> utterances = null;
  private Map<String, AdditionalLanguagesIntent> additionalLanguages = null;

  public IntentDefinition() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      entityTypeBindings = new ArrayList<NamedEntityTypeBinding>();
      entityNameReferences = new ArrayList<String>();
      utterances = new ArrayList<NluUtterance>();
    }
  }

  
  @ApiModelProperty(example = "null", value = "ID of the intent.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


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
   * The description of the intent.
   **/
  public IntentDefinition description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The description of the intent.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
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


  /**
   * Additional languages for intents
   **/
  public IntentDefinition additionalLanguages(Map<String, AdditionalLanguagesIntent> additionalLanguages) {
    this.additionalLanguages = additionalLanguages;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Additional languages for intents")
  @JsonProperty("additionalLanguages")
  public Map<String, AdditionalLanguagesIntent> getAdditionalLanguages() {
    return additionalLanguages;
  }
  public void setAdditionalLanguages(Map<String, AdditionalLanguagesIntent> additionalLanguages) {
    this.additionalLanguages = additionalLanguages;
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

    return Objects.equals(this.id, intentDefinition.id) &&
            Objects.equals(this.name, intentDefinition.name) &&
            Objects.equals(this.description, intentDefinition.description) &&
            Objects.equals(this.entityTypeBindings, intentDefinition.entityTypeBindings) &&
            Objects.equals(this.entityNameReferences, intentDefinition.entityNameReferences) &&
            Objects.equals(this.utterances, intentDefinition.utterances) &&
            Objects.equals(this.additionalLanguages, intentDefinition.additionalLanguages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, entityTypeBindings, entityNameReferences, utterances, additionalLanguages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntentDefinition {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    entityTypeBindings: ").append(toIndentedString(entityTypeBindings)).append("\n");
    sb.append("    entityNameReferences: ").append(toIndentedString(entityNameReferences)).append("\n");
    sb.append("    utterances: ").append(toIndentedString(utterances)).append("\n");
    sb.append("    additionalLanguages: ").append(toIndentedString(additionalLanguages)).append("\n");
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

