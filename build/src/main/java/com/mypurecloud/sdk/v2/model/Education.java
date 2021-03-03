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
import java.time.LocalDate;

import java.io.Serializable;
/**
 * Education
 */

public class Education  implements Serializable {
  
  private String school = null;
  private String fieldOfStudy = null;
  private String notes = null;
  private LocalDate dateStart = null;
  private LocalDate dateEnd = null;

  
  /**
   **/
  public Education school(String school) {
    this.school = school;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("school")
  public String getSchool() {
    return school;
  }
  public void setSchool(String school) {
    this.school = school;
  }

  
  /**
   **/
  public Education fieldOfStudy(String fieldOfStudy) {
    this.fieldOfStudy = fieldOfStudy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("fieldOfStudy")
  public String getFieldOfStudy() {
    return fieldOfStudy;
  }
  public void setFieldOfStudy(String fieldOfStudy) {
    this.fieldOfStudy = fieldOfStudy;
  }

  
  /**
   * Notes about education has a 2000 character limit
   **/
  public Education notes(String notes) {
    this.notes = notes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Notes about education has a 2000 character limit")
  @JsonProperty("notes")
  public String getNotes() {
    return notes;
  }
  public void setNotes(String notes) {
    this.notes = notes;
  }

  
  /**
   * Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public Education dateStart(LocalDate dateStart) {
    this.dateStart = dateStart;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("dateStart")
  public LocalDate getDateStart() {
    return dateStart;
  }
  public void setDateStart(LocalDate dateStart) {
    this.dateStart = dateStart;
  }

  
  /**
   * Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public Education dateEnd(LocalDate dateEnd) {
    this.dateEnd = dateEnd;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("dateEnd")
  public LocalDate getDateEnd() {
    return dateEnd;
  }
  public void setDateEnd(LocalDate dateEnd) {
    this.dateEnd = dateEnd;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Education education = (Education) o;
    return Objects.equals(this.school, education.school) &&
        Objects.equals(this.fieldOfStudy, education.fieldOfStudy) &&
        Objects.equals(this.notes, education.notes) &&
        Objects.equals(this.dateStart, education.dateStart) &&
        Objects.equals(this.dateEnd, education.dateEnd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(school, fieldOfStudy, notes, dateStart, dateEnd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Education {\n");
    
    sb.append("    school: ").append(toIndentedString(school)).append("\n");
    sb.append("    fieldOfStudy: ").append(toIndentedString(fieldOfStudy)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    dateStart: ").append(toIndentedString(dateStart)).append("\n");
    sb.append("    dateEnd: ").append(toIndentedString(dateEnd)).append("\n");
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

