package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * TimeZone
 */

public class TimeZone  implements Serializable {
  
  private String displayName = null;
  private String id = null;
  private Integer rawOffset = null;
  private Integer dstsavings = null;

  
  /**
   **/
  public TimeZone displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("displayName")
  public String getDisplayName() {
    return displayName;
  }
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  
  /**
   **/
  public TimeZone id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   **/
  public TimeZone rawOffset(Integer rawOffset) {
    this.rawOffset = rawOffset;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("rawOffset")
  public Integer getRawOffset() {
    return rawOffset;
  }
  public void setRawOffset(Integer rawOffset) {
    this.rawOffset = rawOffset;
  }

  
  /**
   **/
  public TimeZone dstsavings(Integer dstsavings) {
    this.dstsavings = dstsavings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dstsavings")
  public Integer getDstsavings() {
    return dstsavings;
  }
  public void setDstsavings(Integer dstsavings) {
    this.dstsavings = dstsavings;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeZone timeZone = (TimeZone) o;
    return Objects.equals(this.displayName, timeZone.displayName) &&
        Objects.equals(this.id, timeZone.id) &&
        Objects.equals(this.rawOffset, timeZone.rawOffset) &&
        Objects.equals(this.dstsavings, timeZone.dstsavings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, id, rawOffset, dstsavings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeZone {\n");
    
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    rawOffset: ").append(toIndentedString(rawOffset)).append("\n");
    sb.append("    dstsavings: ").append(toIndentedString(dstsavings)).append("\n");
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

