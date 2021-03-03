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
import com.mypurecloud.sdk.v2.model.BusinessUnitReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;

import java.io.Serializable;
/**
 * BuScheduleReferenceForMuRoute
 */

public class BuScheduleReferenceForMuRoute  implements Serializable {
  
  private String id = null;
  private LocalDate weekDate = null;
  private BusinessUnitReference businessUnit = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   * The start week date for this schedule. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public BuScheduleReferenceForMuRoute weekDate(LocalDate weekDate) {
    this.weekDate = weekDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The start week date for this schedule. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("weekDate")
  public LocalDate getWeekDate() {
    return weekDate;
  }
  public void setWeekDate(LocalDate weekDate) {
    this.weekDate = weekDate;
  }

  
  /**
   * The start week date for this schedule
   **/
  public BuScheduleReferenceForMuRoute businessUnit(BusinessUnitReference businessUnit) {
    this.businessUnit = businessUnit;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The start week date for this schedule")
  @JsonProperty("businessUnit")
  public BusinessUnitReference getBusinessUnit() {
    return businessUnit;
  }
  public void setBusinessUnit(BusinessUnitReference businessUnit) {
    this.businessUnit = businessUnit;
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
    BuScheduleReferenceForMuRoute buScheduleReferenceForMuRoute = (BuScheduleReferenceForMuRoute) o;
    return Objects.equals(this.id, buScheduleReferenceForMuRoute.id) &&
        Objects.equals(this.weekDate, buScheduleReferenceForMuRoute.weekDate) &&
        Objects.equals(this.businessUnit, buScheduleReferenceForMuRoute.businessUnit) &&
        Objects.equals(this.selfUri, buScheduleReferenceForMuRoute.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, weekDate, businessUnit, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuScheduleReferenceForMuRoute {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    weekDate: ").append(toIndentedString(weekDate)).append("\n");
    sb.append("    businessUnit: ").append(toIndentedString(businessUnit)).append("\n");
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

