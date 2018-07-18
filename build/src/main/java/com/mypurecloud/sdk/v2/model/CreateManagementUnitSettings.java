package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.AdherenceSettings;
import com.mypurecloud.sdk.v2.model.SchedulingSettings;
import com.mypurecloud.sdk.v2.model.ShortTermForecastingSettings;
import com.mypurecloud.sdk.v2.model.TimeOffRequestSettings;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Management Unit Settings
 */
@ApiModel(description = "Management Unit Settings")

public class CreateManagementUnitSettings  implements Serializable {
  
  private AdherenceSettings adherence = null;
  private ShortTermForecastingSettings shortTermForecasting = null;
  private TimeOffRequestSettings timeOff = null;
  private SchedulingSettings scheduling = null;

  
  /**
   * Adherence settings for this management unit
   **/
  public CreateManagementUnitSettings adherence(AdherenceSettings adherence) {
    this.adherence = adherence;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Adherence settings for this management unit")
  @JsonProperty("adherence")
  public AdherenceSettings getAdherence() {
    return adherence;
  }
  public void setAdherence(AdherenceSettings adherence) {
    this.adherence = adherence;
  }

  
  /**
   * Short term forecasting settings for this management unit
   **/
  public CreateManagementUnitSettings shortTermForecasting(ShortTermForecastingSettings shortTermForecasting) {
    this.shortTermForecasting = shortTermForecasting;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Short term forecasting settings for this management unit")
  @JsonProperty("shortTermForecasting")
  public ShortTermForecastingSettings getShortTermForecasting() {
    return shortTermForecasting;
  }
  public void setShortTermForecasting(ShortTermForecastingSettings shortTermForecasting) {
    this.shortTermForecasting = shortTermForecasting;
  }

  
  /**
   * Time off request settings for this management unit
   **/
  public CreateManagementUnitSettings timeOff(TimeOffRequestSettings timeOff) {
    this.timeOff = timeOff;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Time off request settings for this management unit")
  @JsonProperty("timeOff")
  public TimeOffRequestSettings getTimeOff() {
    return timeOff;
  }
  public void setTimeOff(TimeOffRequestSettings timeOff) {
    this.timeOff = timeOff;
  }

  
  /**
   * Scheduling settings for this management unit
   **/
  public CreateManagementUnitSettings scheduling(SchedulingSettings scheduling) {
    this.scheduling = scheduling;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Scheduling settings for this management unit")
  @JsonProperty("scheduling")
  public SchedulingSettings getScheduling() {
    return scheduling;
  }
  public void setScheduling(SchedulingSettings scheduling) {
    this.scheduling = scheduling;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateManagementUnitSettings createManagementUnitSettings = (CreateManagementUnitSettings) o;
    return Objects.equals(this.adherence, createManagementUnitSettings.adherence) &&
        Objects.equals(this.shortTermForecasting, createManagementUnitSettings.shortTermForecasting) &&
        Objects.equals(this.timeOff, createManagementUnitSettings.timeOff) &&
        Objects.equals(this.scheduling, createManagementUnitSettings.scheduling);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adherence, shortTermForecasting, timeOff, scheduling);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateManagementUnitSettings {\n");
    
    sb.append("    adherence: ").append(toIndentedString(adherence)).append("\n");
    sb.append("    shortTermForecasting: ").append(toIndentedString(shortTermForecasting)).append("\n");
    sb.append("    timeOff: ").append(toIndentedString(timeOff)).append("\n");
    sb.append("    scheduling: ").append(toIndentedString(scheduling)).append("\n");
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

