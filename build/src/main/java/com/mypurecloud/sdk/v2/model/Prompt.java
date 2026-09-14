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
import com.mypurecloud.sdk.v2.model.Operation;
import com.mypurecloud.sdk.v2.model.PromptAsset;
import com.mypurecloud.sdk.v2.model.WritableStarrableDivision;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Prompt
 */

public class Prompt  implements Serializable {
  
  private String id = null;
  private String name = null;
  private WritableStarrableDivision division = null;
  private String description = null;
  private List<PromptAsset> resources = null;
  private Operation currentOperation = null;
  private String selfUri = null;

  public Prompt() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      resources = new ArrayList<PromptAsset>();
    }
  }

  public Prompt(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      resources = new ArrayList<PromptAsset>();
    }
  }

  
  /**
   * The prompt identifier
   **/
  public Prompt id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The prompt identifier")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * The prompt name.
   **/
  public Prompt name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The prompt name.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The division to which this entity belongs.
   **/
  public Prompt division(WritableStarrableDivision division) {
    this.division = division;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The division to which this entity belongs.")
  @JsonProperty("division")
  public WritableStarrableDivision getDivision() {
    return division;
  }
  public void setDivision(WritableStarrableDivision division) {
    this.division = division;
  }


  /**
   **/
  public Prompt description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  @ApiModelProperty(example = "null", value = "List of resources associated with this prompt")
  @JsonProperty("resources")
  public List<PromptAsset> getResources() {
    return resources;
  }


  @ApiModelProperty(example = "null", value = "Current prompt operation status")
  @JsonProperty("currentOperation")
  public Operation getCurrentOperation() {
    return currentOperation;
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
    Prompt prompt = (Prompt) o;

    return Objects.equals(this.id, prompt.id) &&
            Objects.equals(this.name, prompt.name) &&
            Objects.equals(this.division, prompt.division) &&
            Objects.equals(this.description, prompt.description) &&
            Objects.equals(this.resources, prompt.resources) &&
            Objects.equals(this.currentOperation, prompt.currentOperation) &&
            Objects.equals(this.selfUri, prompt.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, division, description, resources, currentOperation, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Prompt {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    division: ").append(toIndentedString(division)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    currentOperation: ").append(toIndentedString(currentOperation)).append("\n");
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

