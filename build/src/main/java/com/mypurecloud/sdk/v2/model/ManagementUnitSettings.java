package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.AdherenceSettings;
import com.mypurecloud.sdk.v2.model.SchedulingSettings;
import com.mypurecloud.sdk.v2.model.ShortTermForecastingSettings;
import com.mypurecloud.sdk.v2.model.TimeOffRequestSettings;
import com.mypurecloud.sdk.v2.model.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * Management Unit Settings
 */
@ApiModel(description = "Management Unit Settings")

public class ManagementUnitSettings  implements Serializable {
  
  private AdherenceSettings adherence = null;
  private ShortTermForecastingSettings shortTermForecasting = null;
  private TimeOffRequestSettings timeOff = null;
  private SchedulingSettings scheduling = null;
  private Integer version = null;
  private Date dateModified = null;
  private User modifiedBy = null;

  
  /**
   * Adherence settings for this management unit
   **/
  public ManagementUnitSettings adherence(AdherenceSettings adherence) {
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
  public ManagementUnitSettings shortTermForecasting(ShortTermForecastingSettings shortTermForecasting) {
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
  public ManagementUnitSettings timeOff(TimeOffRequestSettings timeOff) {
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
  public ManagementUnitSettings scheduling(SchedulingSettings scheduling) {
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

  
  /**
   * The version of the underlying entity
   **/
  public ManagementUnitSettings version(Integer version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The version of the underlying entity")
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
  }

  
  /**
   * The date and time at which this entity was last modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  public ManagementUnitSettings dateModified(Date dateModified) {
    this.dateModified = dateModified;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The date and time at which this entity was last modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }
  public void setDateModified(Date dateModified) {
    this.dateModified = dateModified;
  }

  
  /**
   * The user who last modified this entity
   **/
  public ManagementUnitSettings modifiedBy(User modifiedBy) {
    this.modifiedBy = modifiedBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user who last modified this entity")
  @JsonProperty("modifiedBy")
  public User getModifiedBy() {
    return modifiedBy;
  }
  public void setModifiedBy(User modifiedBy) {
    this.modifiedBy = modifiedBy;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ManagementUnitSettings managementUnitSettings = (ManagementUnitSettings) o;
    return Objects.equals(this.adherence, managementUnitSettings.adherence) &&
        Objects.equals(this.shortTermForecasting, managementUnitSettings.shortTermForecasting) &&
        Objects.equals(this.timeOff, managementUnitSettings.timeOff) &&
        Objects.equals(this.scheduling, managementUnitSettings.scheduling) &&
        Objects.equals(this.version, managementUnitSettings.version) &&
        Objects.equals(this.dateModified, managementUnitSettings.dateModified) &&
        Objects.equals(this.modifiedBy, managementUnitSettings.modifiedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adherence, shortTermForecasting, timeOff, scheduling, version, dateModified, modifiedBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManagementUnitSettings {\n");
    
    sb.append("    adherence: ").append(toIndentedString(adherence)).append("\n");
    sb.append("    shortTermForecasting: ").append(toIndentedString(shortTermForecasting)).append("\n");
    sb.append("    timeOff: ").append(toIndentedString(timeOff)).append("\n");
    sb.append("    scheduling: ").append(toIndentedString(scheduling)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
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

