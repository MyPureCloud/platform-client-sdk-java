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
import com.mypurecloud.sdk.v2.model.LearningModuleRuleParts;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * LearningModuleRule
 */

public class LearningModuleRule  implements Serializable {
  
  private String id = null;
  private Boolean isActive = null;
  private List<LearningModuleRuleParts> parts = new ArrayList<LearningModuleRuleParts>();
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   * If true, rule is active
   **/
  public LearningModuleRule isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "If true, rule is active")
  @JsonProperty("isActive")
  public Boolean getIsActive() {
    return isActive;
  }
  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  
  /**
   * The parts of a learning module rule
   **/
  public LearningModuleRule parts(List<LearningModuleRuleParts> parts) {
    this.parts = parts;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The parts of a learning module rule")
  @JsonProperty("parts")
  public List<LearningModuleRuleParts> getParts() {
    return parts;
  }
  public void setParts(List<LearningModuleRuleParts> parts) {
    this.parts = parts;
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
    LearningModuleRule learningModuleRule = (LearningModuleRule) o;
    return Objects.equals(this.id, learningModuleRule.id) &&
        Objects.equals(this.isActive, learningModuleRule.isActive) &&
        Objects.equals(this.parts, learningModuleRule.parts) &&
        Objects.equals(this.selfUri, learningModuleRule.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, isActive, parts, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LearningModuleRule {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    parts: ").append(toIndentedString(parts)).append("\n");
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

