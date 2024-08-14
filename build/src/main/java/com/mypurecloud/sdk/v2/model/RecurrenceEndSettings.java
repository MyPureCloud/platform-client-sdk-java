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
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * RecurrenceEndSettings
 */

public class RecurrenceEndSettings  implements Serializable {
  
  private Date lastDate = null;
  private Boolean noEndDate = null;

  
  /**
   * The end date of the recurrence for the activity plan, in ISO-8601 format. Only one of lastDate or noEndDate may be set
   **/
  public RecurrenceEndSettings lastDate(Date lastDate) {
    this.lastDate = lastDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The end date of the recurrence for the activity plan, in ISO-8601 format. Only one of lastDate or noEndDate may be set")
  @JsonProperty("lastDate")
  public Date getLastDate() {
    return lastDate;
  }
  public void setLastDate(Date lastDate) {
    this.lastDate = lastDate;
  }


  /**
   * Whether this activity plan should continue indefinitely. If set to true, lastDate must not be set
   **/
  public RecurrenceEndSettings noEndDate(Boolean noEndDate) {
    this.noEndDate = noEndDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether this activity plan should continue indefinitely. If set to true, lastDate must not be set")
  @JsonProperty("noEndDate")
  public Boolean getNoEndDate() {
    return noEndDate;
  }
  public void setNoEndDate(Boolean noEndDate) {
    this.noEndDate = noEndDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecurrenceEndSettings recurrenceEndSettings = (RecurrenceEndSettings) o;

    return Objects.equals(this.lastDate, recurrenceEndSettings.lastDate) &&
            Objects.equals(this.noEndDate, recurrenceEndSettings.noEndDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastDate, noEndDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecurrenceEndSettings {\n");
    
    sb.append("    lastDate: ").append(toIndentedString(lastDate)).append("\n");
    sb.append("    noEndDate: ").append(toIndentedString(noEndDate)).append("\n");
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

