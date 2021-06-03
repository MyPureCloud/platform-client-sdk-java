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
import com.mypurecloud.sdk.v2.model.SchedulingSettingsResponse;
import com.mypurecloud.sdk.v2.model.ShiftTradeSettings;
import com.mypurecloud.sdk.v2.model.ShortTermForecastingSettings;
import com.mypurecloud.sdk.v2.model.TimeOffRequestSettings;
import com.mypurecloud.sdk.v2.model.WfmVersionedEntityMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ManagementUnitSettingsResponse
 */

public class ManagementUnitSettingsResponse  implements Serializable {
  
  private AdherenceSettings adherence = null;
  private ShortTermForecastingSettings shortTermForecasting = null;
  private TimeOffRequestSettings timeOff = null;
  private SchedulingSettingsResponse scheduling = null;
  private ShiftTradeSettings shiftTrading = null;
  private WfmVersionedEntityMetadata metadata = null;

  
  /**
   * Adherence settings for this management unit
   **/
  public ManagementUnitSettingsResponse adherence(AdherenceSettings adherence) {
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
  public ManagementUnitSettingsResponse shortTermForecasting(ShortTermForecastingSettings shortTermForecasting) {
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
  public ManagementUnitSettingsResponse timeOff(TimeOffRequestSettings timeOff) {
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
   * Scheduling settings for this management unit. These settings are only available if you have the permission wfm:managementUnit:view
   **/
  public ManagementUnitSettingsResponse scheduling(SchedulingSettingsResponse scheduling) {
    this.scheduling = scheduling;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Scheduling settings for this management unit. These settings are only available if you have the permission wfm:managementUnit:view")
  @JsonProperty("scheduling")
  public SchedulingSettingsResponse getScheduling() {
    return scheduling;
  }
  public void setScheduling(SchedulingSettingsResponse scheduling) {
    this.scheduling = scheduling;
  }

  
  /**
   * Shift trade settings for this management unit
   **/
  public ManagementUnitSettingsResponse shiftTrading(ShiftTradeSettings shiftTrading) {
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

  
  /**
   * Version info metadata for the associated management unit
   **/
  public ManagementUnitSettingsResponse metadata(WfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Version info metadata for the associated management unit")
  @JsonProperty("metadata")
  public WfmVersionedEntityMetadata getMetadata() {
    return metadata;
  }
  public void setMetadata(WfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ManagementUnitSettingsResponse managementUnitSettingsResponse = (ManagementUnitSettingsResponse) o;
    return Objects.equals(this.adherence, managementUnitSettingsResponse.adherence) &&
        Objects.equals(this.shortTermForecasting, managementUnitSettingsResponse.shortTermForecasting) &&
        Objects.equals(this.timeOff, managementUnitSettingsResponse.timeOff) &&
        Objects.equals(this.scheduling, managementUnitSettingsResponse.scheduling) &&
        Objects.equals(this.shiftTrading, managementUnitSettingsResponse.shiftTrading) &&
        Objects.equals(this.metadata, managementUnitSettingsResponse.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adherence, shortTermForecasting, timeOff, scheduling, shiftTrading, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManagementUnitSettingsResponse {\n");
    
    sb.append("    adherence: ").append(toIndentedString(adherence)).append("\n");
    sb.append("    shortTermForecasting: ").append(toIndentedString(shortTermForecasting)).append("\n");
    sb.append("    timeOff: ").append(toIndentedString(timeOff)).append("\n");
    sb.append("    scheduling: ").append(toIndentedString(scheduling)).append("\n");
    sb.append("    shiftTrading: ").append(toIndentedString(shiftTrading)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

