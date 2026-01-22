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
 * LearningAssignmentReschedule
 */

public class LearningAssignmentReschedule  implements Serializable {
  
  private Date dateRecommendedForCompletion = null;
  private Integer lengthInMinutes = null;
  private Boolean addToSchedule = null;

  public LearningAssignmentReschedule() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The recommended completion date of the assignment. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public LearningAssignmentReschedule dateRecommendedForCompletion(Date dateRecommendedForCompletion) {
    this.dateRecommendedForCompletion = dateRecommendedForCompletion;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The recommended completion date of the assignment. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateRecommendedForCompletion")
  public Date getDateRecommendedForCompletion() {
    return dateRecommendedForCompletion;
  }
  public void setDateRecommendedForCompletion(Date dateRecommendedForCompletion) {
    this.dateRecommendedForCompletion = dateRecommendedForCompletion;
  }


  /**
   * The length in minutes of the assignment
   **/
  public LearningAssignmentReschedule lengthInMinutes(Integer lengthInMinutes) {
    this.lengthInMinutes = lengthInMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The length in minutes of the assignment")
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
  public LearningAssignmentReschedule addToSchedule(Boolean addToSchedule) {
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
    LearningAssignmentReschedule learningAssignmentReschedule = (LearningAssignmentReschedule) o;

    return Objects.equals(this.dateRecommendedForCompletion, learningAssignmentReschedule.dateRecommendedForCompletion) &&
            Objects.equals(this.lengthInMinutes, learningAssignmentReschedule.lengthInMinutes) &&
            Objects.equals(this.addToSchedule, learningAssignmentReschedule.addToSchedule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateRecommendedForCompletion, lengthInMinutes, addToSchedule);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LearningAssignmentReschedule {\n");
    
    sb.append("    dateRecommendedForCompletion: ").append(toIndentedString(dateRecommendedForCompletion)).append("\n");
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

