package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * FreeSeatingConfiguration
 */

public class FreeSeatingConfiguration  implements Serializable {
  
  private Boolean enabled = null;
  private Integer ttlMinutes = null;

  
  /**
   * Whether or not free-seating is enabled for the organization
   **/
  public FreeSeatingConfiguration enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether or not free-seating is enabled for the organization")
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  
  /**
   * The amount of time in minutes until an offline user is disassociated from their station
   **/
  public FreeSeatingConfiguration ttlMinutes(Integer ttlMinutes) {
    this.ttlMinutes = ttlMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The amount of time in minutes until an offline user is disassociated from their station")
  @JsonProperty("ttlMinutes")
  public Integer getTtlMinutes() {
    return ttlMinutes;
  }
  public void setTtlMinutes(Integer ttlMinutes) {
    this.ttlMinutes = ttlMinutes;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FreeSeatingConfiguration freeSeatingConfiguration = (FreeSeatingConfiguration) o;
    return Objects.equals(this.enabled, freeSeatingConfiguration.enabled) &&
        Objects.equals(this.ttlMinutes, freeSeatingConfiguration.ttlMinutes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, ttlMinutes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FreeSeatingConfiguration {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    ttlMinutes: ").append(toIndentedString(ttlMinutes)).append("\n");
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

