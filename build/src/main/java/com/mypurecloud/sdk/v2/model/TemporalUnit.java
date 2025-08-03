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
import com.mypurecloud.sdk.v2.model.Duration;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * TemporalUnit
 */

public class TemporalUnit  implements Serializable {
  
  private Boolean durationEstimated = null;
  private Duration duration = null;
  private Boolean timeBased = null;
  private Boolean dateBased = null;

  public TemporalUnit() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public TemporalUnit durationEstimated(Boolean durationEstimated) {
    this.durationEstimated = durationEstimated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("durationEstimated")
  public Boolean getDurationEstimated() {
    return durationEstimated;
  }
  public void setDurationEstimated(Boolean durationEstimated) {
    this.durationEstimated = durationEstimated;
  }


  /**
   **/
  public TemporalUnit duration(Duration duration) {
    this.duration = duration;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("duration")
  public Duration getDuration() {
    return duration;
  }
  public void setDuration(Duration duration) {
    this.duration = duration;
  }


  /**
   **/
  public TemporalUnit timeBased(Boolean timeBased) {
    this.timeBased = timeBased;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("timeBased")
  public Boolean getTimeBased() {
    return timeBased;
  }
  public void setTimeBased(Boolean timeBased) {
    this.timeBased = timeBased;
  }


  /**
   **/
  public TemporalUnit dateBased(Boolean dateBased) {
    this.dateBased = dateBased;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dateBased")
  public Boolean getDateBased() {
    return dateBased;
  }
  public void setDateBased(Boolean dateBased) {
    this.dateBased = dateBased;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemporalUnit temporalUnit = (TemporalUnit) o;

    return Objects.equals(this.durationEstimated, temporalUnit.durationEstimated) &&
            Objects.equals(this.duration, temporalUnit.duration) &&
            Objects.equals(this.timeBased, temporalUnit.timeBased) &&
            Objects.equals(this.dateBased, temporalUnit.dateBased);
  }

  @Override
  public int hashCode() {
    return Objects.hash(durationEstimated, duration, timeBased, dateBased);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemporalUnit {\n");
    
    sb.append("    durationEstimated: ").append(toIndentedString(durationEstimated)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    timeBased: ").append(toIndentedString(timeBased)).append("\n");
    sb.append("    dateBased: ").append(toIndentedString(dateBased)).append("\n");
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

