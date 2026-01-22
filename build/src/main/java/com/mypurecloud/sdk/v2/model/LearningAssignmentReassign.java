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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * LearningAssignmentReassign
 */

public class LearningAssignmentReassign  implements Serializable {
  
  private Date recommendedCompletionDate = null;
  private Integer lengthInMinutes = null;
  private Boolean addToSchedule = null;

  public LearningAssignmentReassign() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The recommended completion date of assignment. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public LearningAssignmentReassign recommendedCompletionDate(Date recommendedCompletionDate) {
    this.recommendedCompletionDate = recommendedCompletionDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The recommended completion date of assignment. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("recommendedCompletionDate")
  public Date getRecommendedCompletionDate() {
    return recommendedCompletionDate;
  }
  public void setRecommendedCompletionDate(Date recommendedCompletionDate) {
    this.recommendedCompletionDate = recommendedCompletionDate;
  }


  /**
   * The length in minutes of assignment
   **/
  public LearningAssignmentReassign lengthInMinutes(Integer lengthInMinutes) {
    this.lengthInMinutes = lengthInMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The length in minutes of assignment")
  @JsonProperty("lengthInMinutes")
  public Integer getLengthInMinutes() {
    return lengthInMinutes;
  }
  public void setLengthInMinutes(Integer lengthInMinutes) {
    this.lengthInMinutes = lengthInMinutes;
  }


  /**
   * If True, adds the assignment to their schedule
   **/
  public LearningAssignmentReassign addToSchedule(Boolean addToSchedule) {
    this.addToSchedule = addToSchedule;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If True, adds the assignment to their schedule")
  @JsonProperty("addToSchedule")
  public Boolean getAddToSchedule() {
    return addToSchedule;
  }
  public void setAddToSchedule(Boolean addToSchedule) {
    this.addToSchedule = addToSchedule;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LearningAssignmentReassign learningAssignmentReassign = (LearningAssignmentReassign) o;

    return Objects.equals(this.recommendedCompletionDate, learningAssignmentReassign.recommendedCompletionDate) &&
            Objects.equals(this.lengthInMinutes, learningAssignmentReassign.lengthInMinutes) &&
            Objects.equals(this.addToSchedule, learningAssignmentReassign.addToSchedule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recommendedCompletionDate, lengthInMinutes, addToSchedule);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LearningAssignmentReassign {\n");
    
    sb.append("    recommendedCompletionDate: ").append(toIndentedString(recommendedCompletionDate)).append("\n");
    sb.append("    lengthInMinutes: ").append(toIndentedString(lengthInMinutes)).append("\n");
    sb.append("    addToSchedule: ").append(toIndentedString(addToSchedule)).append("\n");
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

