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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * A2A agent card skill.
 */
@ApiModel(description = "A2A agent card skill.")

public class AgenticVirtualAgentAgentCardSkill  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String description = null;
  private List<String> tags = null;
  private List<String> examples = null;
  private List<String> inputModes = null;
  private List<String> outputModes = null;

  public AgenticVirtualAgentAgentCardSkill() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      tags = new ArrayList<String>();
      examples = new ArrayList<String>();
      inputModes = new ArrayList<String>();
      outputModes = new ArrayList<String>();
    }
  }

  public AgenticVirtualAgentAgentCardSkill(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      tags = new ArrayList<String>();
      examples = new ArrayList<String>();
      inputModes = new ArrayList<String>();
      outputModes = new ArrayList<String>();
    }
  }

  
  /**
   * Unique identifier for the skill.
   **/
  public AgenticVirtualAgentAgentCardSkill id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Unique identifier for the skill.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * Human-readable name of the skill.
   **/
  public AgenticVirtualAgentAgentCardSkill name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Human-readable name of the skill.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * Detailed explanation of what the skill does.
   **/
  public AgenticVirtualAgentAgentCardSkill description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Detailed explanation of what the skill does.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * Keywords for categorization and discovery.
   **/
  public AgenticVirtualAgentAgentCardSkill tags(List<String> tags) {
    this.tags = tags;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Keywords for categorization and discovery.")
  @JsonProperty("tags")
  public List<String> getTags() {
    return tags;
  }
  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  /**
   * Sample prompts or use cases.
   **/
  public AgenticVirtualAgentAgentCardSkill examples(List<String> examples) {
    this.examples = examples;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Sample prompts or use cases.")
  @JsonProperty("examples")
  public List<String> getExamples() {
    return examples;
  }
  public void setExamples(List<String> examples) {
    this.examples = examples;
  }


  /**
   * Supported input media types.
   **/
  public AgenticVirtualAgentAgentCardSkill inputModes(List<String> inputModes) {
    this.inputModes = inputModes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Supported input media types.")
  @JsonProperty("inputModes")
  public List<String> getInputModes() {
    return inputModes;
  }
  public void setInputModes(List<String> inputModes) {
    this.inputModes = inputModes;
  }


  /**
   * Supported output media types.
   **/
  public AgenticVirtualAgentAgentCardSkill outputModes(List<String> outputModes) {
    this.outputModes = outputModes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Supported output media types.")
  @JsonProperty("outputModes")
  public List<String> getOutputModes() {
    return outputModes;
  }
  public void setOutputModes(List<String> outputModes) {
    this.outputModes = outputModes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgenticVirtualAgentAgentCardSkill agenticVirtualAgentAgentCardSkill = (AgenticVirtualAgentAgentCardSkill) o;

    return Objects.equals(this.id, agenticVirtualAgentAgentCardSkill.id) &&
            Objects.equals(this.name, agenticVirtualAgentAgentCardSkill.name) &&
            Objects.equals(this.description, agenticVirtualAgentAgentCardSkill.description) &&
            Objects.equals(this.tags, agenticVirtualAgentAgentCardSkill.tags) &&
            Objects.equals(this.examples, agenticVirtualAgentAgentCardSkill.examples) &&
            Objects.equals(this.inputModes, agenticVirtualAgentAgentCardSkill.inputModes) &&
            Objects.equals(this.outputModes, agenticVirtualAgentAgentCardSkill.outputModes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, tags, examples, inputModes, outputModes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgenticVirtualAgentAgentCardSkill {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    examples: ").append(toIndentedString(examples)).append("\n");
    sb.append("    inputModes: ").append(toIndentedString(inputModes)).append("\n");
    sb.append("    outputModes: ").append(toIndentedString(outputModes)).append("\n");
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

