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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * SkillCombinationInfo
 */

public class SkillCombinationInfo  implements Serializable {
  
  private List<String> skillCombination = new ArrayList<String>();
  private Long totalCount = null;
  private Long remainingCount = null;

  
  /**
   * A skill combination in the contact queue
   **/
  public SkillCombinationInfo skillCombination(List<String> skillCombination) {
    this.skillCombination = skillCombination;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A skill combination in the contact queue")
  @JsonProperty("skillCombination")
  public List<String> getSkillCombination() {
    return skillCombination;
  }
  public void setSkillCombination(List<String> skillCombination) {
    this.skillCombination = skillCombination;
  }


  @ApiModelProperty(example = "null", value = "Number of total contacts in the contact queue for this skill combination")
  @JsonProperty("totalCount")
  public Long getTotalCount() {
    return totalCount;
  }


  @ApiModelProperty(example = "null", value = "Number of remaining contacts in the contact queue for this skill combination")
  @JsonProperty("remainingCount")
  public Long getRemainingCount() {
    return remainingCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SkillCombinationInfo skillCombinationInfo = (SkillCombinationInfo) o;

    return Objects.equals(this.skillCombination, skillCombinationInfo.skillCombination) &&
            Objects.equals(this.totalCount, skillCombinationInfo.totalCount) &&
            Objects.equals(this.remainingCount, skillCombinationInfo.remainingCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(skillCombination, totalCount, remainingCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SkillCombinationInfo {\n");
    
    sb.append("    skillCombination: ").append(toIndentedString(skillCombination)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    remainingCount: ").append(toIndentedString(remainingCount)).append("\n");
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

