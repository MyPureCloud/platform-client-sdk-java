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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * SubjectDivisions
 */

public class SubjectDivisions  implements Serializable {
  
  private List<String> subjectIds = new ArrayList<String>();
  private List<String> divisionIds = new ArrayList<String>();

  
  /**
   * A collection of subject IDs to associate with the given divisions
   **/
  public SubjectDivisions subjectIds(List<String> subjectIds) {
    this.subjectIds = subjectIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A collection of subject IDs to associate with the given divisions")
  @JsonProperty("subjectIds")
  public List<String> getSubjectIds() {
    return subjectIds;
  }
  public void setSubjectIds(List<String> subjectIds) {
    this.subjectIds = subjectIds;
  }

  
  /**
   * A collection of division IDs to associate with the given subjects
   **/
  public SubjectDivisions divisionIds(List<String> divisionIds) {
    this.divisionIds = divisionIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A collection of division IDs to associate with the given subjects")
  @JsonProperty("divisionIds")
  public List<String> getDivisionIds() {
    return divisionIds;
  }
  public void setDivisionIds(List<String> divisionIds) {
    this.divisionIds = divisionIds;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubjectDivisions subjectDivisions = (SubjectDivisions) o;
    return Objects.equals(this.subjectIds, subjectDivisions.subjectIds) &&
        Objects.equals(this.divisionIds, subjectDivisions.divisionIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subjectIds, divisionIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubjectDivisions {\n");
    
    sb.append("    subjectIds: ").append(toIndentedString(subjectIds)).append("\n");
    sb.append("    divisionIds: ").append(toIndentedString(divisionIds)).append("\n");
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

