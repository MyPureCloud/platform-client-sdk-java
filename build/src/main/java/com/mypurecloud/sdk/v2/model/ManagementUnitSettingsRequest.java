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
import com.mypurecloud.sdk.v2.model.AdherenceSettings;
import com.mypurecloud.sdk.v2.model.SchedulingSettingsRequest;
import com.mypurecloud.sdk.v2.model.ShiftTradeSettings;
import com.mypurecloud.sdk.v2.model.ShortTermForecastingSettings;
import com.mypurecloud.sdk.v2.model.TimeOffSettingsRequest;
import com.mypurecloud.sdk.v2.model.WfmVersionedEntityMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ManagementUnitSettingsRequest
 */

public class ManagementUnitSettingsRequest  implements Serializable {
  
  private AdherenceSettings adherence = null;
  private ShortTermForecastingSettings shortTermForecasting = null;
  private TimeOffSettingsRequest timeOff = null;
  private SchedulingSettingsRequest scheduling = null;
  private ShiftTradeSettings shiftTrading = null;
  private WfmVersionedEntityMetadata metadata = null;

  public ManagementUnitSettingsRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Adherence settings for this management unit
   **/
  public ManagementUnitSettingsRequest adherence(AdherenceSettings adherence) {
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
  public ManagementUnitSettingsRequest shortTermForecasting(ShortTermForecastingSettings shortTermForecasting) {
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
  public ManagementUnitSettingsRequest timeOff(TimeOffSettingsRequest timeOff) {
    this.timeOff = timeOff;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Time off request settings for this management unit")
  @JsonProperty("timeOff")
  public TimeOffSettingsRequest getTimeOff() {
    return timeOff;
  }
  public void setTimeOff(TimeOffSettingsRequest timeOff) {
    this.timeOff = timeOff;
  }


  /**
   * Scheduling settings for this management unit
   **/
  public ManagementUnitSettingsRequest scheduling(SchedulingSettingsRequest scheduling) {
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
  public ManagementUnitSettingsRequest shiftTrading(ShiftTradeSettings shiftTrading) {
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
  public ManagementUnitSettingsRequest metadata(WfmVersionedEntityMetadata metadata) {
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
    ManagementUnitSettingsRequest managementUnitSettingsRequest = (ManagementUnitSettingsRequest) o;

    return Objects.equals(this.adherence, managementUnitSettingsRequest.adherence) &&
            Objects.equals(this.shortTermForecasting, managementUnitSettingsRequest.shortTermForecasting) &&
            Objects.equals(this.timeOff, managementUnitSettingsRequest.timeOff) &&
            Objects.equals(this.scheduling, managementUnitSettingsRequest.scheduling) &&
            Objects.equals(this.shiftTrading, managementUnitSettingsRequest.shiftTrading) &&
            Objects.equals(this.metadata, managementUnitSettingsRequest.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adherence, shortTermForecasting, timeOff, scheduling, shiftTrading, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManagementUnitSettingsRequest {\n");
    
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

