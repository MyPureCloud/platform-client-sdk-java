package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.ManagementUnitSettings;
import com.mypurecloud.sdk.v2.model.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * Management Unit object for Workforce Management
 */
@ApiModel(description = "Management Unit object for Workforce Management")

public class ManagementUnit  implements Serializable {
  
  private String id = null;
  private String name = null;

  /**
   * Start day of week for scheduling and forecasting purposes
   */
  public enum StartDayOfWeekEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    SUNDAY("Sunday"),
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday");

    private String value;

    StartDayOfWeekEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StartDayOfWeekEnum fromString(String key) {
      if (key == null) return null;

      for (StartDayOfWeekEnum value : StartDayOfWeekEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StartDayOfWeekEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StartDayOfWeekEnum startDayOfWeek = null;
  private String timeZone = null;
  private ManagementUnitSettings settings = null;
  private Integer version = null;
  private Date dateModified = null;
  private User modifiedBy = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public ManagementUnit name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Start day of week for scheduling and forecasting purposes
   **/
  public ManagementUnit startDayOfWeek(StartDayOfWeekEnum startDayOfWeek) {
    this.startDayOfWeek = startDayOfWeek;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Start day of week for scheduling and forecasting purposes")
  @JsonProperty("startDayOfWeek")
  public StartDayOfWeekEnum getStartDayOfWeek() {
    return startDayOfWeek;
  }
  public void setStartDayOfWeek(StartDayOfWeekEnum startDayOfWeek) {
    this.startDayOfWeek = startDayOfWeek;
  }

  
  /**
   * The time zone for the management unit in standard Olson Format (See https://en.wikipedia.org/wiki/Tz_database)
   **/
  public ManagementUnit timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The time zone for the management unit in standard Olson Format (See https://en.wikipedia.org/wiki/Tz_database)")
  @JsonProperty("timeZone")
  public String getTimeZone() {
    return timeZone;
  }
  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }

  
  /**
   * The configuration settings for this management unit
   **/
  public ManagementUnit settings(ManagementUnitSettings settings) {
    this.settings = settings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The configuration settings for this management unit")
  @JsonProperty("settings")
  public ManagementUnitSettings getSettings() {
    return settings;
  }
  public void setSettings(ManagementUnitSettings settings) {
    this.settings = settings;
  }

  
  /**
   * The version of the underlying entity
   **/
  public ManagementUnit version(Integer version) {
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
  public ManagementUnit dateModified(Date dateModified) {
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
  public ManagementUnit modifiedBy(User modifiedBy) {
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

  
  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ManagementUnit managementUnit = (ManagementUnit) o;
    return Objects.equals(this.id, managementUnit.id) &&
        Objects.equals(this.name, managementUnit.name) &&
        Objects.equals(this.startDayOfWeek, managementUnit.startDayOfWeek) &&
        Objects.equals(this.timeZone, managementUnit.timeZone) &&
        Objects.equals(this.settings, managementUnit.settings) &&
        Objects.equals(this.version, managementUnit.version) &&
        Objects.equals(this.dateModified, managementUnit.dateModified) &&
        Objects.equals(this.modifiedBy, managementUnit.modifiedBy) &&
        Objects.equals(this.selfUri, managementUnit.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, startDayOfWeek, timeZone, settings, version, dateModified, modifiedBy, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManagementUnit {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    startDayOfWeek: ").append(toIndentedString(startDayOfWeek)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

