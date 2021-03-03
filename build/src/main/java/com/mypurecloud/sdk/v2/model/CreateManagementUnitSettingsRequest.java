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
import com.mypurecloud.sdk.v2.model.AdherenceSettings;
import com.mypurecloud.sdk.v2.model.SchedulingSettingsRequest;
import com.mypurecloud.sdk.v2.model.ShiftTradeSettings;
import com.mypurecloud.sdk.v2.model.ShortTermForecastingSettings;
import com.mypurecloud.sdk.v2.model.TimeOffRequestSettings;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Management Unit Settings
 */
@ApiModel(description = "Management Unit Settings")

public class CreateManagementUnitSettingsRequest  implements Serializable {
  
  private AdherenceSettings adherence = null;
  private ShortTermForecastingSettings shortTermForecasting = null;
  private TimeOffRequestSettings timeOff = null;
  private SchedulingSettingsRequest scheduling = null;
  private ShiftTradeSettings shiftTrading = null;

  
  /**
   * Adherence settings for this management unit
   **/
  public CreateManagementUnitSettingsRequest adherence(AdherenceSettings adherence) {
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
   * Short term forecasting settings for this management unit.  Moving to Business Unit
   **/
  public CreateManagementUnitSettingsRequest shortTermForecasting(ShortTermForecastingSettings shortTermForecasting) {
    this.shortTermForecasting = shortTermForecasting;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Short term forecasting settings for this management unit.  Moving to Business Unit")
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
  public CreateManagementUnitSettingsRequest timeOff(TimeOffRequestSettings timeOff) {
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
  public CreateManagementUnitSettingsRequest scheduling(SchedulingSettingsRequest scheduling) {
    this.scheduling = scheduling;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Scheduling settings for this management unit")
  @JsonProperty("scheduling")
  public SchedulingSettingsRequest getScheduling() {
    return scheduling;
  }
  public void setScheduling(SchedulingSettingsRequest scheduling) {
    this.scheduling = scheduling;
  }

  
  /**
   * Shift trade settings for this management unit
   **/
  public CreateManagementUnitSettingsRequest shiftTrading(ShiftTradeSettings shiftTrading) {
    this.shiftTrading = shiftTrading;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Shift trade settings for this management unit")
  @JsonProperty("shiftTrading")
  public ShiftTradeSettings getShiftTrading() {
    return shiftTrading;
  }
  public void setShiftTrading(ShiftTradeSettings shiftTrading) {
    this.shiftTrading = shiftTrading;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateManagementUnitSettingsRequest createManagementUnitSettingsRequest = (CreateManagementUnitSettingsRequest) o;
    return Objects.equals(this.adherence, createManagementUnitSettingsRequest.adherence) &&
        Objects.equals(this.shortTermForecasting, createManagementUnitSettingsRequest.shortTermForecasting) &&
        Objects.equals(this.timeOff, createManagementUnitSettingsRequest.timeOff) &&
        Objects.equals(this.scheduling, createManagementUnitSettingsRequest.scheduling) &&
        Objects.equals(this.shiftTrading, createManagementUnitSettingsRequest.shiftTrading);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adherence, shortTermForecasting, timeOff, scheduling, shiftTrading);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateManagementUnitSettingsRequest {\n");
    
    sb.append("    adherence: ").append(toIndentedString(adherence)).append("\n");
    sb.append("    shortTermForecasting: ").append(toIndentedString(shortTermForecasting)).append("\n");
    sb.append("    timeOff: ").append(toIndentedString(timeOff)).append("\n");
    sb.append("    scheduling: ").append(toIndentedString(scheduling)).append("\n");
    sb.append("    shiftTrading: ").append(toIndentedString(shiftTrading)).append("\n");
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

