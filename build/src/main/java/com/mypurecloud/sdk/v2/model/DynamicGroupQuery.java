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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.DynamicGroupSkillCondition;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * DynamicGroupQuery
 */

public class DynamicGroupQuery  implements Serializable {
  
  private List<DynamicGroupSkillCondition> skillConditions = new ArrayList<DynamicGroupSkillCondition>();

  
  /**
   * The skill conditions that need to be used for this dynamic group
   **/
  public DynamicGroupQuery skillConditions(List<DynamicGroupSkillCondition> skillConditions) {
    this.skillConditions = skillConditions;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The skill conditions that need to be used for this dynamic group")
  @JsonProperty("skillConditions")
  public List<DynamicGroupSkillCondition> getSkillConditions() {
    return skillConditions;
  }
  public void setSkillConditions(List<DynamicGroupSkillCondition> skillConditions) {
    this.skillConditions = skillConditions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DynamicGroupQuery dynamicGroupQuery = (DynamicGroupQuery) o;

    return Objects.equals(this.skillConditions, dynamicGroupQuery.skillConditions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(skillConditions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DynamicGroupQuery {\n");
    
    sb.append("    skillConditions: ").append(toIndentedString(skillConditions)).append("\n");
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

