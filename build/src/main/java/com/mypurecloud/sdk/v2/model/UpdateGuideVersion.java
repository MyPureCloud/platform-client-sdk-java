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
import com.mypurecloud.sdk.v2.model.AuthoringKnowledgeSettings;
import com.mypurecloud.sdk.v2.model.GuideVersionResources;
import com.mypurecloud.sdk.v2.model.Variable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Request body for updating a guide version
 */
@ApiModel(description = "Request body for updating a guide version")

public class UpdateGuideVersion  implements Serializable {
  
  private String instruction = null;
  private List<Variable> variables = null;
  private GuideVersionResources resources = null;
  private AuthoringKnowledgeSettings knowledgeSettings = null;

  public UpdateGuideVersion() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      variables = new ArrayList<Variable>();
    }
  }

  
  /**
   * The instruction given to this version of the guide, for how it should behave when interacting with a User.
   **/
  public UpdateGuideVersion instruction(String instruction) {
    this.instruction = instruction;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The instruction given to this version of the guide, for how it should behave when interacting with a User.")
  @JsonProperty("instruction")
  public String getInstruction() {
    return instruction;
  }
  public void setInstruction(String instruction) {
    this.instruction = instruction;
  }


  /**
   * The variables associated with this version of the guide. Includes input variables (provided) and output variables (captured during execution).
   **/
  public UpdateGuideVersion variables(List<Variable> variables) {
    this.variables = variables;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The variables associated with this version of the guide. Includes input variables (provided) and output variables (captured during execution).")
  @JsonProperty("variables")
  public List<Variable> getVariables() {
    return variables;
  }
  public void setVariables(List<Variable> variables) {
    this.variables = variables;
  }


  /**
   * The resources associated with this version of the guide.
   **/
  public UpdateGuideVersion resources(GuideVersionResources resources) {
    this.resources = resources;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The resources associated with this version of the guide.")
  @JsonProperty("resources")
  public GuideVersionResources getResources() {
    return resources;
  }
  public void setResources(GuideVersionResources resources) {
    this.resources = resources;
  }


  /**
   * The knowledge settings associated with this version of the guide.
   **/
  public UpdateGuideVersion knowledgeSettings(AuthoringKnowledgeSettings knowledgeSettings) {
    this.knowledgeSettings = knowledgeSettings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The knowledge settings associated with this version of the guide.")
  @JsonProperty("knowledgeSettings")
  public AuthoringKnowledgeSettings getKnowledgeSettings() {
    return knowledgeSettings;
  }
  public void setKnowledgeSettings(AuthoringKnowledgeSettings knowledgeSettings) {
    this.knowledgeSettings = knowledgeSettings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateGuideVersion updateGuideVersion = (UpdateGuideVersion) o;

    return Objects.equals(this.instruction, updateGuideVersion.instruction) &&
            Objects.equals(this.variables, updateGuideVersion.variables) &&
            Objects.equals(this.resources, updateGuideVersion.resources) &&
            Objects.equals(this.knowledgeSettings, updateGuideVersion.knowledgeSettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instruction, variables, resources, knowledgeSettings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateGuideVersion {\n");
    
    sb.append("    instruction: ").append(toIndentedString(instruction)).append("\n");
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    knowledgeSettings: ").append(toIndentedString(knowledgeSettings)).append("\n");
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

