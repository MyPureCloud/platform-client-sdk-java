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
 * BuImportTimeOffLimitValue
 */

public class BuImportTimeOffLimitValue  implements Serializable {
  
  private Date importDateTime = null;
  private Integer importMinutes = null;

  public BuImportTimeOffLimitValue() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public BuImportTimeOffLimitValue(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The time-off limit interval UTC date time in ISO8601.
   **/
  public BuImportTimeOffLimitValue importDateTime(Date importDateTime) {
    this.importDateTime = importDateTime;
    return this;
  }
  
  @ApiModelProperty(example = "2025-02-01T05:00Z", required = true, value = "The time-off limit interval UTC date time in ISO8601.")
  @JsonProperty("importDateTime")
  public Date getImportDateTime() {
    return importDateTime;
  }
  public void setImportDateTime(Date importDateTime) {
    this.importDateTime = importDateTime;
  }


  /**
   * The limit value in minutes specified for a given date and time interval
   **/
  public BuImportTimeOffLimitValue importMinutes(Integer importMinutes) {
    this.importMinutes = importMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The limit value in minutes specified for a given date and time interval")
  @JsonProperty("importMinutes")
  public Integer getImportMinutes() {
    return importMinutes;
  }
  public void setImportMinutes(Integer importMinutes) {
    this.importMinutes = importMinutes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuImportTimeOffLimitValue buImportTimeOffLimitValue = (BuImportTimeOffLimitValue) o;

    return Objects.equals(this.importDateTime, buImportTimeOffLimitValue.importDateTime) &&
            Objects.equals(this.importMinutes, buImportTimeOffLimitValue.importMinutes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(importDateTime, importMinutes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuImportTimeOffLimitValue {\n");
    
    sb.append("    importDateTime: ").append(toIndentedString(importDateTime)).append("\n");
    sb.append("    importMinutes: ").append(toIndentedString(importMinutes)).append("\n");
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

