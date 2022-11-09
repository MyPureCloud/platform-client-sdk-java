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
 * SkillGroupMemberDivisions
 */

public class SkillGroupMemberDivisions  implements Serializable {
  
  private List<String> addDivisionIds = new ArrayList<String>();
  private List<String> removeDivisionIds = new ArrayList<String>();

  
  /**
   **/
  public SkillGroupMemberDivisions addDivisionIds(List<String> addDivisionIds) {
    this.addDivisionIds = addDivisionIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("addDivisionIds")
  public List<String> getAddDivisionIds() {
    return addDivisionIds;
  }
  public void setAddDivisionIds(List<String> addDivisionIds) {
    this.addDivisionIds = addDivisionIds;
  }


  /**
   **/
  public SkillGroupMemberDivisions removeDivisionIds(List<String> removeDivisionIds) {
    this.removeDivisionIds = removeDivisionIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("removeDivisionIds")
  public List<String> getRemoveDivisionIds() {
    return removeDivisionIds;
  }
  public void setRemoveDivisionIds(List<String> removeDivisionIds) {
    this.removeDivisionIds = removeDivisionIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SkillGroupMemberDivisions skillGroupMemberDivisions = (SkillGroupMemberDivisions) o;

    return Objects.equals(this.addDivisionIds, skillGroupMemberDivisions.addDivisionIds) &&
            Objects.equals(this.removeDivisionIds, skillGroupMemberDivisions.removeDivisionIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addDivisionIds, removeDivisionIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SkillGroupMemberDivisions {\n");
    
    sb.append("    addDivisionIds: ").append(toIndentedString(addDivisionIds)).append("\n");
    sb.append("    removeDivisionIds: ").append(toIndentedString(removeDivisionIds)).append("\n");
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

