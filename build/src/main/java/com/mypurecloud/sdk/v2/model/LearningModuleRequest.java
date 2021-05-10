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
import com.mypurecloud.sdk.v2.model.LearningModuleInformStepRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Learning module request
 */
@ApiModel(description = "Learning module request")

public class LearningModuleRequest  implements Serializable {
  
  private String name = null;
  private String description = null;
  private Integer completionTimeInDays = null;
  private List<LearningModuleInformStepRequest> informSteps = new ArrayList<LearningModuleInformStepRequest>();

  
  /**
   * The name of learning module
   **/
  public LearningModuleRequest name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of learning module")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The description of learning module
   **/
  public LearningModuleRequest description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The description of learning module")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * The completion time of learning module in days
   **/
  public LearningModuleRequest completionTimeInDays(Integer completionTimeInDays) {
    this.completionTimeInDays = completionTimeInDays;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The completion time of learning module in days")
  @JsonProperty("completionTimeInDays")
  public Integer getCompletionTimeInDays() {
    return completionTimeInDays;
  }
  public void setCompletionTimeInDays(Integer completionTimeInDays) {
    this.completionTimeInDays = completionTimeInDays;
  }

  
  /**
   * The list of inform steps in a learning module
   **/
  public LearningModuleRequest informSteps(List<LearningModuleInformStepRequest> informSteps) {
    this.informSteps = informSteps;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of inform steps in a learning module")
  @JsonProperty("informSteps")
  public List<LearningModuleInformStepRequest> getInformSteps() {
    return informSteps;
  }
  public void setInformSteps(List<LearningModuleInformStepRequest> informSteps) {
    this.informSteps = informSteps;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LearningModuleRequest learningModuleRequest = (LearningModuleRequest) o;
    return Objects.equals(this.name, learningModuleRequest.name) &&
        Objects.equals(this.description, learningModuleRequest.description) &&
        Objects.equals(this.completionTimeInDays, learningModuleRequest.completionTimeInDays) &&
        Objects.equals(this.informSteps, learningModuleRequest.informSteps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, completionTimeInDays, informSteps);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LearningModuleRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    completionTimeInDays: ").append(toIndentedString(completionTimeInDays)).append("\n");
    sb.append("    informSteps: ").append(toIndentedString(informSteps)).append("\n");
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

