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
import com.mypurecloud.sdk.v2.model.GuideVersionResources;
import com.mypurecloud.sdk.v2.model.Variable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * GeneratedGuideContent
 */

public class GeneratedGuideContent  implements Serializable {
  
  private String instruction = null;
  private List<Variable> variables = null;
  private GuideVersionResources resources = null;

  public GeneratedGuideContent() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      variables = new ArrayList<Variable>();
    }
  }

  
  @ApiModelProperty(example = "null", value = "The generated instruction content, which can be used when creating a guide version.")
  @JsonProperty("instruction")
  public String getInstruction() {
    return instruction;
  }


  @ApiModelProperty(example = "null", value = "The generated variables content, which can be used when creating a guide version.")
  @JsonProperty("variables")
  public List<Variable> getVariables() {
    return variables;
  }


  @ApiModelProperty(example = "null", value = "The generated resources content, which can be used when creating a guide version.")
  @JsonProperty("resources")
  public GuideVersionResources getResources() {
    return resources;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeneratedGuideContent generatedGuideContent = (GeneratedGuideContent) o;

    return Objects.equals(this.instruction, generatedGuideContent.instruction) &&
            Objects.equals(this.variables, generatedGuideContent.variables) &&
            Objects.equals(this.resources, generatedGuideContent.resources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instruction, variables, resources);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeneratedGuideContent {\n");
    
    sb.append("    instruction: ").append(toIndentedString(instruction)).append("\n");
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
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

