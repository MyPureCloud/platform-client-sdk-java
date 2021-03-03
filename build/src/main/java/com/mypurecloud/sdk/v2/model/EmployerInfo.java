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

import java.io.Serializable;
/**
 * EmployerInfo
 */

public class EmployerInfo  implements Serializable {
  
  private String officialName = null;
  private String employeeId = null;
  private String employeeType = null;
  private String dateHire = null;

  
  /**
   **/
  public EmployerInfo officialName(String officialName) {
    this.officialName = officialName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("officialName")
  public String getOfficialName() {
    return officialName;
  }
  public void setOfficialName(String officialName) {
    this.officialName = officialName;
  }

  
  /**
   **/
  public EmployerInfo employeeId(String employeeId) {
    this.employeeId = employeeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("employeeId")
  public String getEmployeeId() {
    return employeeId;
  }
  public void setEmployeeId(String employeeId) {
    this.employeeId = employeeId;
  }

  
  /**
   **/
  public EmployerInfo employeeType(String employeeType) {
    this.employeeType = employeeType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("employeeType")
  public String getEmployeeType() {
    return employeeType;
  }
  public void setEmployeeType(String employeeType) {
    this.employeeType = employeeType;
  }

  
  /**
   **/
  public EmployerInfo dateHire(String dateHire) {
    this.dateHire = dateHire;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dateHire")
  public String getDateHire() {
    return dateHire;
  }
  public void setDateHire(String dateHire) {
    this.dateHire = dateHire;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmployerInfo employerInfo = (EmployerInfo) o;
    return Objects.equals(this.officialName, employerInfo.officialName) &&
        Objects.equals(this.employeeId, employerInfo.employeeId) &&
        Objects.equals(this.employeeType, employerInfo.employeeType) &&
        Objects.equals(this.dateHire, employerInfo.dateHire);
  }

  @Override
  public int hashCode() {
    return Objects.hash(officialName, employeeId, employeeType, dateHire);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployerInfo {\n");
    
    sb.append("    officialName: ").append(toIndentedString(officialName)).append("\n");
    sb.append("    employeeId: ").append(toIndentedString(employeeId)).append("\n");
    sb.append("    employeeType: ").append(toIndentedString(employeeType)).append("\n");
    sb.append("    dateHire: ").append(toIndentedString(dateHire)).append("\n");
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

