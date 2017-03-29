package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.DocumentDataV2NotificationWorkspace;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * UserScheduleAdherenceUpdateNotification
 */

public class UserScheduleAdherenceUpdateNotification  implements Serializable {
  
  private DocumentDataV2NotificationWorkspace user = null;
  private String managementUnitId = null;
  private String scheduledActivityCategory = null;
  private String systemPresence = null;

  /**
   * Gets or Sets routingStatus
   */
  public enum RoutingStatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    _EMPTY_("__EMPTY__"),
    OFF_QUEUE("OFF_QUEUE"),
    IDLE("IDLE"),
    INTERACTING("INTERACTING"),
    NOT_RESPONDING("NOT_RESPONDING"),
    COMMUNICATING("COMMUNICATING"),
    OFFLINE("OFFLINE");

    private String value;

    RoutingStatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static RoutingStatusEnum fromString(String key) {
      if (key == null) return null;

      for (RoutingStatusEnum value : RoutingStatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return RoutingStatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private RoutingStatusEnum routingStatus = null;
  private String actualActivityCategory = null;
  private Boolean isOutOfOffice = null;
  private String adherenceState = null;
  private String impact = null;
  private String adherenceChangeTime = null;

  
  /**
   **/
  public UserScheduleAdherenceUpdateNotification user(DocumentDataV2NotificationWorkspace user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("user")
  public DocumentDataV2NotificationWorkspace getUser() {
    return user;
  }
  public void setUser(DocumentDataV2NotificationWorkspace user) {
    this.user = user;
  }


  /**
   **/
  public UserScheduleAdherenceUpdateNotification managementUnitId(String managementUnitId) {
    this.managementUnitId = managementUnitId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("managementUnitId")
  public String getManagementUnitId() {
    return managementUnitId;
  }
  public void setManagementUnitId(String managementUnitId) {
    this.managementUnitId = managementUnitId;
  }


  /**
   **/
  public UserScheduleAdherenceUpdateNotification scheduledActivityCategory(String scheduledActivityCategory) {
    this.scheduledActivityCategory = scheduledActivityCategory;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("scheduledActivityCategory")
  public String getScheduledActivityCategory() {
    return scheduledActivityCategory;
  }
  public void setScheduledActivityCategory(String scheduledActivityCategory) {
    this.scheduledActivityCategory = scheduledActivityCategory;
  }


  /**
   **/
  public UserScheduleAdherenceUpdateNotification systemPresence(String systemPresence) {
    this.systemPresence = systemPresence;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("systemPresence")
  public String getSystemPresence() {
    return systemPresence;
  }
  public void setSystemPresence(String systemPresence) {
    this.systemPresence = systemPresence;
  }


  /**
   **/
  public UserScheduleAdherenceUpdateNotification routingStatus(RoutingStatusEnum routingStatus) {
    this.routingStatus = routingStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("routingStatus")
  public RoutingStatusEnum getRoutingStatus() {
    return routingStatus;
  }
  public void setRoutingStatus(RoutingStatusEnum routingStatus) {
    this.routingStatus = routingStatus;
  }


  /**
   **/
  public UserScheduleAdherenceUpdateNotification actualActivityCategory(String actualActivityCategory) {
    this.actualActivityCategory = actualActivityCategory;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("actualActivityCategory")
  public String getActualActivityCategory() {
    return actualActivityCategory;
  }
  public void setActualActivityCategory(String actualActivityCategory) {
    this.actualActivityCategory = actualActivityCategory;
  }


  /**
   **/
  public UserScheduleAdherenceUpdateNotification isOutOfOffice(Boolean isOutOfOffice) {
    this.isOutOfOffice = isOutOfOffice;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("isOutOfOffice")
  public Boolean getIsOutOfOffice() {
    return isOutOfOffice;
  }
  public void setIsOutOfOffice(Boolean isOutOfOffice) {
    this.isOutOfOffice = isOutOfOffice;
  }


  /**
   **/
  public UserScheduleAdherenceUpdateNotification adherenceState(String adherenceState) {
    this.adherenceState = adherenceState;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("adherenceState")
  public String getAdherenceState() {
    return adherenceState;
  }
  public void setAdherenceState(String adherenceState) {
    this.adherenceState = adherenceState;
  }


  /**
   **/
  public UserScheduleAdherenceUpdateNotification impact(String impact) {
    this.impact = impact;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("impact")
  public String getImpact() {
    return impact;
  }
  public void setImpact(String impact) {
    this.impact = impact;
  }


  /**
   **/
  public UserScheduleAdherenceUpdateNotification adherenceChangeTime(String adherenceChangeTime) {
    this.adherenceChangeTime = adherenceChangeTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("adherenceChangeTime")
  public String getAdherenceChangeTime() {
    return adherenceChangeTime;
  }
  public void setAdherenceChangeTime(String adherenceChangeTime) {
    this.adherenceChangeTime = adherenceChangeTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserScheduleAdherenceUpdateNotification userScheduleAdherenceUpdateNotification = (UserScheduleAdherenceUpdateNotification) o;
    return Objects.equals(this.user, userScheduleAdherenceUpdateNotification.user) &&
        Objects.equals(this.managementUnitId, userScheduleAdherenceUpdateNotification.managementUnitId) &&
        Objects.equals(this.scheduledActivityCategory, userScheduleAdherenceUpdateNotification.scheduledActivityCategory) &&
        Objects.equals(this.systemPresence, userScheduleAdherenceUpdateNotification.systemPresence) &&
        Objects.equals(this.routingStatus, userScheduleAdherenceUpdateNotification.routingStatus) &&
        Objects.equals(this.actualActivityCategory, userScheduleAdherenceUpdateNotification.actualActivityCategory) &&
        Objects.equals(this.isOutOfOffice, userScheduleAdherenceUpdateNotification.isOutOfOffice) &&
        Objects.equals(this.adherenceState, userScheduleAdherenceUpdateNotification.adherenceState) &&
        Objects.equals(this.impact, userScheduleAdherenceUpdateNotification.impact) &&
        Objects.equals(this.adherenceChangeTime, userScheduleAdherenceUpdateNotification.adherenceChangeTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, managementUnitId, scheduledActivityCategory, systemPresence, routingStatus, actualActivityCategory, isOutOfOffice, adherenceState, impact, adherenceChangeTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserScheduleAdherenceUpdateNotification {\n");
    
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    managementUnitId: ").append(toIndentedString(managementUnitId)).append("\n");
    sb.append("    scheduledActivityCategory: ").append(toIndentedString(scheduledActivityCategory)).append("\n");
    sb.append("    systemPresence: ").append(toIndentedString(systemPresence)).append("\n");
    sb.append("    routingStatus: ").append(toIndentedString(routingStatus)).append("\n");
    sb.append("    actualActivityCategory: ").append(toIndentedString(actualActivityCategory)).append("\n");
    sb.append("    isOutOfOffice: ").append(toIndentedString(isOutOfOffice)).append("\n");
    sb.append("    adherenceState: ").append(toIndentedString(adherenceState)).append("\n");
    sb.append("    impact: ").append(toIndentedString(impact)).append("\n");
    sb.append("    adherenceChangeTime: ").append(toIndentedString(adherenceChangeTime)).append("\n");
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

