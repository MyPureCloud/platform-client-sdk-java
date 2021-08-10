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
 * GamificationStatus
 */

public class GamificationStatus  implements Serializable {
  
  private Boolean isActive = null;
  private LocalDate dateStart = null;
  private Boolean automaticUserAssignment = null;

  
  /**
   * Gamification status of the organization.
   **/
  public GamificationStatus isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Gamification status of the organization.")
  @JsonProperty("isActive")
  public Boolean getIsActive() {
    return isActive;
  }
  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  
  /**
   * Gamification start date. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public GamificationStatus dateStart(LocalDate dateStart) {
    this.dateStart = dateStart;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Gamification start date. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("dateStart")
  public LocalDate getDateStart() {
    return dateStart;
  }
  public void setDateStart(LocalDate dateStart) {
    this.dateStart = dateStart;
  }

  
  /**
   * Automatic assignment of users to the default profile
   **/
  public GamificationStatus automaticUserAssignment(Boolean automaticUserAssignment) {
    this.automaticUserAssignment = automaticUserAssignment;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Automatic assignment of users to the default profile")
  @JsonProperty("automaticUserAssignment")
  public Boolean getAutomaticUserAssignment() {
    return automaticUserAssignment;
  }
  public void setAutomaticUserAssignment(Boolean automaticUserAssignment) {
    this.automaticUserAssignment = automaticUserAssignment;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GamificationStatus gamificationStatus = (GamificationStatus) o;
    return Objects.equals(this.isActive, gamificationStatus.isActive) &&
        Objects.equals(this.dateStart, gamificationStatus.dateStart) &&
        Objects.equals(this.automaticUserAssignment, gamificationStatus.automaticUserAssignment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isActive, dateStart, automaticUserAssignment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GamificationStatus {\n");
    
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    dateStart: ").append(toIndentedString(dateStart)).append("\n");
    sb.append("    automaticUserAssignment: ").append(toIndentedString(automaticUserAssignment)).append("\n");
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

