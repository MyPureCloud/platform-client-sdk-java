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
import com.mypurecloud.sdk.v2.model.SkillsToRemove;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Actions
 */

public class Actions  implements Serializable {
  
  private List<SkillsToRemove> skillsToRemove = new ArrayList<SkillsToRemove>();

  
  /**
   **/
  public Actions skillsToRemove(List<SkillsToRemove> skillsToRemove) {
    this.skillsToRemove = skillsToRemove;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("skillsToRemove")
  public List<SkillsToRemove> getSkillsToRemove() {
    return skillsToRemove;
  }
  public void setSkillsToRemove(List<SkillsToRemove> skillsToRemove) {
    this.skillsToRemove = skillsToRemove;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Actions actions = (Actions) o;
    return Objects.equals(this.skillsToRemove, actions.skillsToRemove);
  }

  @Override
  public int hashCode() {
    return Objects.hash(skillsToRemove);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Actions {\n");
    
    sb.append("    skillsToRemove: ").append(toIndentedString(skillsToRemove)).append("\n");
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

