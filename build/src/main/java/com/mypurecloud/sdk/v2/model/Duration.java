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
import com.mypurecloud.sdk.v2.model.TemporalUnit;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Duration
 */

public class Duration  implements Serializable {
  
  private Long seconds = null;
  private Boolean zero = null;
  private Integer nano = null;
  private Boolean negative = null;
  private List<TemporalUnit> units = null;

  public Duration() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      units = new ArrayList<TemporalUnit>();
    }
  }

  
  /**
   **/
  public Duration seconds(Long seconds) {
    this.seconds = seconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("seconds")
  public Long getSeconds() {
    return seconds;
  }
  public void setSeconds(Long seconds) {
    this.seconds = seconds;
  }


  /**
   **/
  public Duration zero(Boolean zero) {
    this.zero = zero;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("zero")
  public Boolean getZero() {
    return zero;
  }
  public void setZero(Boolean zero) {
    this.zero = zero;
  }


  /**
   **/
  public Duration nano(Integer nano) {
    this.nano = nano;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("nano")
  public Integer getNano() {
    return nano;
  }
  public void setNano(Integer nano) {
    this.nano = nano;
  }


  /**
   **/
  public Duration negative(Boolean negative) {
    this.negative = negative;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("negative")
  public Boolean getNegative() {
    return negative;
  }
  public void setNegative(Boolean negative) {
    this.negative = negative;
  }


  /**
   **/
  public Duration units(List<TemporalUnit> units) {
    this.units = units;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("units")
  public List<TemporalUnit> getUnits() {
    return units;
  }
  public void setUnits(List<TemporalUnit> units) {
    this.units = units;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Duration duration = (Duration) o;

    return Objects.equals(this.seconds, duration.seconds) &&
            Objects.equals(this.zero, duration.zero) &&
            Objects.equals(this.nano, duration.nano) &&
            Objects.equals(this.negative, duration.negative) &&
            Objects.equals(this.units, duration.units);
  }

  @Override
  public int hashCode() {
    return Objects.hash(seconds, zero, nano, negative, units);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Duration {\n");
    
    sb.append("    seconds: ").append(toIndentedString(seconds)).append("\n");
    sb.append("    zero: ").append(toIndentedString(zero)).append("\n");
    sb.append("    nano: ").append(toIndentedString(nano)).append("\n");
    sb.append("    negative: ").append(toIndentedString(negative)).append("\n");
    sb.append("    units: ").append(toIndentedString(units)).append("\n");
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

