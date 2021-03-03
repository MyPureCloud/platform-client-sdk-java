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
import com.mypurecloud.sdk.v2.model.WfmBusinessUnitReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;

import java.io.Serializable;
/**
 * WfmScheduleReference
 */

public class WfmScheduleReference  implements Serializable {
  
  private String id = null;
  private WfmBusinessUnitReference businessUnit = null;
  private LocalDate weekDate = null;
  private String selfUri = null;

  
  /**
   * The ID of the WFM schedule
   **/
  public WfmScheduleReference id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the WFM schedule")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * A reference to a Workforce Management Business Unit
   **/
  public WfmScheduleReference businessUnit(WfmBusinessUnitReference businessUnit) {
    this.businessUnit = businessUnit;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A reference to a Workforce Management Business Unit")
  @JsonProperty("businessUnit")
  public WfmBusinessUnitReference getBusinessUnit() {
    return businessUnit;
  }
  public void setBusinessUnit(WfmBusinessUnitReference businessUnit) {
    this.businessUnit = businessUnit;
  }

  
  /**
   * The start week date for this schedule. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public WfmScheduleReference weekDate(LocalDate weekDate) {
    this.weekDate = weekDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The start week date for this schedule. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("weekDate")
  public LocalDate getWeekDate() {
    return weekDate;
  }
  public void setWeekDate(LocalDate weekDate) {
    this.weekDate = weekDate;
  }

  
  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WfmScheduleReference wfmScheduleReference = (WfmScheduleReference) o;
    return Objects.equals(this.id, wfmScheduleReference.id) &&
        Objects.equals(this.businessUnit, wfmScheduleReference.businessUnit) &&
        Objects.equals(this.weekDate, wfmScheduleReference.weekDate) &&
        Objects.equals(this.selfUri, wfmScheduleReference.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, businessUnit, weekDate, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmScheduleReference {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    businessUnit: ").append(toIndentedString(businessUnit)).append("\n");
    sb.append("    weekDate: ").append(toIndentedString(weekDate)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

