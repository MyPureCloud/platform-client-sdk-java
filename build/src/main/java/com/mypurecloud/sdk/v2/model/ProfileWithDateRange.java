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
import com.mypurecloud.sdk.v2.model.Division;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;

import java.io.Serializable;
/**
 * ProfileWithDateRange
 */

public class ProfileWithDateRange  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Division division = null;
  private LocalDate dateStartWorkday = null;
  private LocalDate dateEndWorkday = null;
  private String selfUri = null;

  public ProfileWithDateRange() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Profile ID
   **/
  public ProfileWithDateRange id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Profile ID")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   **/
  public ProfileWithDateRange name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The division to which this entity belongs.
   **/
  public ProfileWithDateRange division(Division division) {
    this.division = division;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The division to which this entity belongs.")
  @JsonProperty("division")
  public Division getDivision() {
    return division;
  }
  public void setDivision(Division division) {
    this.division = division;
  }


  /**
   * Start workday used as the date range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public ProfileWithDateRange dateStartWorkday(LocalDate dateStartWorkday) {
    this.dateStartWorkday = dateStartWorkday;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Start workday used as the date range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("dateStartWorkday")
  public LocalDate getDateStartWorkday() {
    return dateStartWorkday;
  }
  public void setDateStartWorkday(LocalDate dateStartWorkday) {
    this.dateStartWorkday = dateStartWorkday;
  }


  /**
   * End workday used as the date range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public ProfileWithDateRange dateEndWorkday(LocalDate dateEndWorkday) {
    this.dateEndWorkday = dateEndWorkday;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "End workday used as the date range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("dateEndWorkday")
  public LocalDate getDateEndWorkday() {
    return dateEndWorkday;
  }
  public void setDateEndWorkday(LocalDate dateEndWorkday) {
    this.dateEndWorkday = dateEndWorkday;
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
    ProfileWithDateRange profileWithDateRange = (ProfileWithDateRange) o;

    return Objects.equals(this.id, profileWithDateRange.id) &&
            Objects.equals(this.name, profileWithDateRange.name) &&
            Objects.equals(this.division, profileWithDateRange.division) &&
            Objects.equals(this.dateStartWorkday, profileWithDateRange.dateStartWorkday) &&
            Objects.equals(this.dateEndWorkday, profileWithDateRange.dateEndWorkday) &&
            Objects.equals(this.selfUri, profileWithDateRange.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, division, dateStartWorkday, dateEndWorkday, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfileWithDateRange {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    division: ").append(toIndentedString(division)).append("\n");
    sb.append("    dateStartWorkday: ").append(toIndentedString(dateStartWorkday)).append("\n");
    sb.append("    dateEndWorkday: ").append(toIndentedString(dateEndWorkday)).append("\n");
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

