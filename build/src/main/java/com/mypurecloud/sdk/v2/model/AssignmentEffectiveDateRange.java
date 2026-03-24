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
import java.time.LocalDate;

import java.io.Serializable;
/**
 * AssignmentEffectiveDateRange
 */

public class AssignmentEffectiveDateRange  implements Serializable {
  
  private LocalDate startDate = null;
  private LocalDate endDate = null;

  public AssignmentEffectiveDateRange() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Effective start date of the user assignment in ISO-8601 format or empty value. Empty value means no limit on start-date.
   **/
  public AssignmentEffectiveDateRange startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Effective start date of the user assignment in ISO-8601 format or empty value. Empty value means no limit on start-date.")
  @JsonProperty("startDate")
  public LocalDate getStartDate() {
    return startDate;
  }
  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }


  /**
   * Effective end date of the user assignment in ISO-8601 format or empty value. Empty value means no limit on end-date.
   **/
  public AssignmentEffectiveDateRange endDate(LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Effective end date of the user assignment in ISO-8601 format or empty value. Empty value means no limit on end-date.")
  @JsonProperty("endDate")
  public LocalDate getEndDate() {
    return endDate;
  }
  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssignmentEffectiveDateRange assignmentEffectiveDateRange = (AssignmentEffectiveDateRange) o;

    return Objects.equals(this.startDate, assignmentEffectiveDateRange.startDate) &&
            Objects.equals(this.endDate, assignmentEffectiveDateRange.endDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, endDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssignmentEffectiveDateRange {\n");
    
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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

