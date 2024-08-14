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

import java.io.Serializable;
/**
 * ReviewAssessmentResults
 */

public class ReviewAssessmentResults  implements Serializable {
  
  private Boolean byAssignees = null;
  private Boolean byViewers = null;

  
  /**
   * If true, learning assignment results can be seen in detail by assignees
   **/
  public ReviewAssessmentResults byAssignees(Boolean byAssignees) {
    this.byAssignees = byAssignees;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If true, learning assignment results can be seen in detail by assignees")
  @JsonProperty("byAssignees")
  public Boolean getByAssignees() {
    return byAssignees;
  }
  public void setByAssignees(Boolean byAssignees) {
    this.byAssignees = byAssignees;
  }


  /**
   * If true, learning assignment results can be seen in detail by people who are eligible to view
   **/
  public ReviewAssessmentResults byViewers(Boolean byViewers) {
    this.byViewers = byViewers;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If true, learning assignment results can be seen in detail by people who are eligible to view")
  @JsonProperty("byViewers")
  public Boolean getByViewers() {
    return byViewers;
  }
  public void setByViewers(Boolean byViewers) {
    this.byViewers = byViewers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReviewAssessmentResults reviewAssessmentResults = (ReviewAssessmentResults) o;

    return Objects.equals(this.byAssignees, reviewAssessmentResults.byAssignees) &&
            Objects.equals(this.byViewers, reviewAssessmentResults.byViewers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(byAssignees, byViewers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReviewAssessmentResults {\n");
    
    sb.append("    byAssignees: ").append(toIndentedString(byAssignees)).append("\n");
    sb.append("    byViewers: ").append(toIndentedString(byViewers)).append("\n");
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

