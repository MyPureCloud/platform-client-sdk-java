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
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.WfmUserScheduleAdherenceUpdatedMuTopicActivityCodeReference;
import com.mypurecloud.sdk.v2.model.WfmUserScheduleAdherenceUpdatedMuTopicQueueReference;
import com.mypurecloud.sdk.v2.model.WfmUserScheduleAdherenceUpdatedMuTopicRealTimeAdherenceExplanation;
import com.mypurecloud.sdk.v2.model.WfmUserScheduleAdherenceUpdatedMuTopicUriReference;
import com.mypurecloud.sdk.v2.model.WfmUserScheduleAdherenceUpdatedMuTopicUserNextActivityReminder;
import com.mypurecloud.sdk.v2.model.WfmUserScheduleAdherenceUpdatedMuTopicUserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * WfmUserScheduleAdherenceUpdatedMuTopicUserScheduleAdherenceUpdate
 */

public class WfmUserScheduleAdherenceUpdatedMuTopicUserScheduleAdherenceUpdate  implements Serializable {
  
  private WfmUserScheduleAdherenceUpdatedMuTopicUserReference user = null;
  private String managementUnitId = null;
  private WfmUserScheduleAdherenceUpdatedMuTopicUriReference team = null;
  private String scheduledActivityCategory = null;
  private WfmUserScheduleAdherenceUpdatedMuTopicActivityCodeReference scheduledActivityCode = null;
  private String systemPresence = null;
  private String organizationSecondaryPresenceId = null;

  private static class RoutingStatusEnumDeserializer extends StdDeserializer<RoutingStatusEnum> {
    public RoutingStatusEnumDeserializer() {
      super(RoutingStatusEnumDeserializer.class);
    }

    @Override
    public RoutingStatusEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return RoutingStatusEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets routingStatus
   */
 @JsonDeserialize(using = RoutingStatusEnumDeserializer.class)
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

  private static class AdherenceStateEnumDeserializer extends StdDeserializer<AdherenceStateEnum> {
    public AdherenceStateEnumDeserializer() {
      super(AdherenceStateEnumDeserializer.class);
    }

    @Override
    public AdherenceStateEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return AdherenceStateEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets adherenceState
   */
 @JsonDeserialize(using = AdherenceStateEnumDeserializer.class)
  public enum AdherenceStateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    INADHERENCE("InAdherence"),
    OUTOFADHERENCE("OutOfAdherence"),
    UNSCHEDULED("Unscheduled"),
    UNKNOWN("Unknown"),
    IGNORED("Ignored"),
    EXPLAINED("Explained");

    private String value;

    AdherenceStateEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static AdherenceStateEnum fromString(String key) {
      if (key == null) return null;

      for (AdherenceStateEnum value : AdherenceStateEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return AdherenceStateEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private AdherenceStateEnum adherenceState = null;
  private String impact = null;
  private WfmUserScheduleAdherenceUpdatedMuTopicRealTimeAdherenceExplanation adherenceExplanation = null;
  private Date adherenceChangeTime = null;
  private Date presenceUpdateTime = null;
  private List<WfmUserScheduleAdherenceUpdatedMuTopicQueueReference> activeQueues = null;
  private Date activeQueuesModifiedTime = null;
  private Boolean removedFromManagementUnit = null;
  private Boolean suppressOnTimeReminder = null;
  private List<WfmUserScheduleAdherenceUpdatedMuTopicUserNextActivityReminder> nextActivityReminders = null;

  public WfmUserScheduleAdherenceUpdatedMuTopicUserScheduleAdherenceUpdate() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      activeQueues = new ArrayList<WfmUserScheduleAdherenceUpdatedMuTopicQueueReference>();
      nextActivityReminders = new ArrayList<WfmUserScheduleAdherenceUpdatedMuTopicUserNextActivityReminder>();
    }
  }

  
  /**
   **/
  public WfmUserScheduleAdherenceUpdatedMuTopicUserScheduleAdherenceUpdate user(WfmUserScheduleAdherenceUpdatedMuTopicUserReference user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("user")
  public WfmUserScheduleAdherenceUpdatedMuTopicUserReference getUser() {
    return user;
  }
  public void setUser(WfmUserScheduleAdherenceUpdatedMuTopicUserReference user) {
    this.user = user;
  }


  /**
   **/
  public WfmUserScheduleAdherenceUpdatedMuTopicUserScheduleAdherenceUpdate managementUnitId(String managementUnitId) {
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
  public WfmUserScheduleAdherenceUpdatedMuTopicUserScheduleAdherenceUpdate team(WfmUserScheduleAdherenceUpdatedMuTopicUriReference team) {
    this.team = team;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("team")
  public WfmUserScheduleAdherenceUpdatedMuTopicUriReference getTeam() {
    return team;
  }
  public void setTeam(WfmUserScheduleAdherenceUpdatedMuTopicUriReference team) {
    this.team = team;
  }


  /**
   **/
  public WfmUserScheduleAdherenceUpdatedMuTopicUserScheduleAdherenceUpdate scheduledActivityCategory(String scheduledActivityCategory) {
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
  public WfmUserScheduleAdherenceUpdatedMuTopicUserScheduleAdherenceUpdate scheduledActivityCode(WfmUserScheduleAdherenceUpdatedMuTopicActivityCodeReference scheduledActivityCode) {
    this.scheduledActivityCode = scheduledActivityCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("scheduledActivityCode")
  public WfmUserScheduleAdherenceUpdatedMuTopicActivityCodeReference getScheduledActivityCode() {
    return scheduledActivityCode;
  }
  public void setScheduledActivityCode(WfmUserScheduleAdherenceUpdatedMuTopicActivityCodeReference scheduledActivityCode) {
    this.scheduledActivityCode = scheduledActivityCode;
  }


  /**
   **/
  public WfmUserScheduleAdherenceUpdatedMuTopicUserScheduleAdherenceUpdate systemPresence(String systemPresence) {
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
  public WfmUserScheduleAdherenceUpdatedMuTopicUserScheduleAdherenceUpdate organizationSecondaryPresenceId(String organizationSecondaryPresenceId) {
    this.organizationSecondaryPresenceId = organizationSecondaryPresenceId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("organizationSecondaryPresenceId")
  public String getOrganizationSecondaryPresenceId() {
    return organizationSecondaryPresenceId;
  }
  public void setOrganizationSecondaryPresenceId(String organizationSecondaryPresenceId) {
    this.organizationSecondaryPresenceId = organizationSecondaryPresenceId;
  }


  /**
   **/
  public WfmUserScheduleAdherenceUpdatedMuTopicUserScheduleAdherenceUpdate routingStatus(RoutingStatusEnum routingStatus) {
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
  public WfmUserScheduleAdherenceUpdatedMuTopicUserScheduleAdherenceUpdate actualActivityCategory(String actualActivityCategory) {
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
  public WfmUserScheduleAdherenceUpdatedMuTopicUserScheduleAdherenceUpdate isOutOfOffice(Boolean isOutOfOffice) {
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
  public WfmUserScheduleAdherenceUpdatedMuTopicUserScheduleAdherenceUpdate adherenceState(AdherenceStateEnum adherenceState) {
    this.adherenceState = adherenceState;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("adherenceState")
  public AdherenceStateEnum getAdherenceState() {
    return adherenceState;
  }
  public void setAdherenceState(AdherenceStateEnum adherenceState) {
    this.adherenceState = adherenceState;
  }


  /**
   **/
  public WfmUserScheduleAdherenceUpdatedMuTopicUserScheduleAdherenceUpdate impact(String impact) {
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
  public WfmUserScheduleAdherenceUpdatedMuTopicUserScheduleAdherenceUpdate adherenceExplanation(WfmUserScheduleAdherenceUpdatedMuTopicRealTimeAdherenceExplanation adherenceExplanation) {
    this.adherenceExplanation = adherenceExplanation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("adherenceExplanation")
  public WfmUserScheduleAdherenceUpdatedMuTopicRealTimeAdherenceExplanation getAdherenceExplanation() {
    return adherenceExplanation;
  }
  public void setAdherenceExplanation(WfmUserScheduleAdherenceUpdatedMuTopicRealTimeAdherenceExplanation adherenceExplanation) {
    this.adherenceExplanation = adherenceExplanation;
  }


  /**
   **/
  public WfmUserScheduleAdherenceUpdatedMuTopicUserScheduleAdherenceUpdate adherenceChangeTime(Date adherenceChangeTime) {
    this.adherenceChangeTime = adherenceChangeTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("adherenceChangeTime")
  public Date getAdherenceChangeTime() {
    return adherenceChangeTime;
  }
  public void setAdherenceChangeTime(Date adherenceChangeTime) {
    this.adherenceChangeTime = adherenceChangeTime;
  }


  /**
   **/
  public WfmUserScheduleAdherenceUpdatedMuTopicUserScheduleAdherenceUpdate presenceUpdateTime(Date presenceUpdateTime) {
    this.presenceUpdateTime = presenceUpdateTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("presenceUpdateTime")
  public Date getPresenceUpdateTime() {
    return presenceUpdateTime;
  }
  public void setPresenceUpdateTime(Date presenceUpdateTime) {
    this.presenceUpdateTime = presenceUpdateTime;
  }


  /**
   **/
  public WfmUserScheduleAdherenceUpdatedMuTopicUserScheduleAdherenceUpdate activeQueues(List<WfmUserScheduleAdherenceUpdatedMuTopicQueueReference> activeQueues) {
    this.activeQueues = activeQueues;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("activeQueues")
  public List<WfmUserScheduleAdherenceUpdatedMuTopicQueueReference> getActiveQueues() {
    return activeQueues;
  }
  public void setActiveQueues(List<WfmUserScheduleAdherenceUpdatedMuTopicQueueReference> activeQueues) {
    this.activeQueues = activeQueues;
  }


  /**
   **/
  public WfmUserScheduleAdherenceUpdatedMuTopicUserScheduleAdherenceUpdate activeQueuesModifiedTime(Date activeQueuesModifiedTime) {
    this.activeQueuesModifiedTime = activeQueuesModifiedTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("activeQueuesModifiedTime")
  public Date getActiveQueuesModifiedTime() {
    return activeQueuesModifiedTime;
  }
  public void setActiveQueuesModifiedTime(Date activeQueuesModifiedTime) {
    this.activeQueuesModifiedTime = activeQueuesModifiedTime;
  }


  /**
   **/
  public WfmUserScheduleAdherenceUpdatedMuTopicUserScheduleAdherenceUpdate removedFromManagementUnit(Boolean removedFromManagementUnit) {
    this.removedFromManagementUnit = removedFromManagementUnit;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("removedFromManagementUnit")
  public Boolean getRemovedFromManagementUnit() {
    return removedFromManagementUnit;
  }
  public void setRemovedFromManagementUnit(Boolean removedFromManagementUnit) {
    this.removedFromManagementUnit = removedFromManagementUnit;
  }


  /**
   **/
  public WfmUserScheduleAdherenceUpdatedMuTopicUserScheduleAdherenceUpdate suppressOnTimeReminder(Boolean suppressOnTimeReminder) {
    this.suppressOnTimeReminder = suppressOnTimeReminder;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("suppressOnTimeReminder")
  public Boolean getSuppressOnTimeReminder() {
    return suppressOnTimeReminder;
  }
  public void setSuppressOnTimeReminder(Boolean suppressOnTimeReminder) {
    this.suppressOnTimeReminder = suppressOnTimeReminder;
  }


  /**
   **/
  public WfmUserScheduleAdherenceUpdatedMuTopicUserScheduleAdherenceUpdate nextActivityReminders(List<WfmUserScheduleAdherenceUpdatedMuTopicUserNextActivityReminder> nextActivityReminders) {
    this.nextActivityReminders = nextActivityReminders;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("nextActivityReminders")
  public List<WfmUserScheduleAdherenceUpdatedMuTopicUserNextActivityReminder> getNextActivityReminders() {
    return nextActivityReminders;
  }
  public void setNextActivityReminders(List<WfmUserScheduleAdherenceUpdatedMuTopicUserNextActivityReminder> nextActivityReminders) {
    this.nextActivityReminders = nextActivityReminders;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WfmUserScheduleAdherenceUpdatedMuTopicUserScheduleAdherenceUpdate wfmUserScheduleAdherenceUpdatedMuTopicUserScheduleAdherenceUpdate = (WfmUserScheduleAdherenceUpdatedMuTopicUserScheduleAdherenceUpdate) o;

    return Objects.equals(this.user, wfmUserScheduleAdherenceUpdatedMuTopicUserScheduleAdherenceUpdate.user) &&
            Objects.equals(this.managementUnitId, wfmUserScheduleAdherenceUpdatedMuTopicUserScheduleAdherenceUpdate.managementUnitId) &&
            Objects.equals(this.team, wfmUserScheduleAdherenceUpdatedMuTopicUserScheduleAdherenceUpdate.team) &&
            Objects.equals(this.scheduledActivityCategory, wfmUserScheduleAdherenceUpdatedMuTopicUserScheduleAdherenceUpdate.scheduledActivityCategory) &&
            Objects.equals(this.scheduledActivityCode, wfmUserScheduleAdherenceUpdatedMuTopicUserScheduleAdherenceUpdate.scheduledActivityCode) &&
            Objects.equals(this.systemPresence, wfmUserScheduleAdherenceUpdatedMuTopicUserScheduleAdherenceUpdate.systemPresence) &&
            Objects.equals(this.organizationSecondaryPresenceId, wfmUserScheduleAdherenceUpdatedMuTopicUserScheduleAdherenceUpdate.organizationSecondaryPresenceId) &&
            Objects.equals(this.routingStatus, wfmUserScheduleAdherenceUpdatedMuTopicUserScheduleAdherenceUpdate.routingStatus) &&
            Objects.equals(this.actualActivityCategory, wfmUserScheduleAdherenceUpdatedMuTopicUserScheduleAdherenceUpdate.actualActivityCategory) &&
            Objects.equals(this.isOutOfOffice, wfmUserScheduleAdherenceUpdatedMuTopicUserScheduleAdherenceUpdate.isOutOfOffice) &&
            Objects.equals(this.adherenceState, wfmUserScheduleAdherenceUpdatedMuTopicUserScheduleAdherenceUpdate.adherenceState) &&
            Objects.equals(this.impact, wfmUserScheduleAdherenceUpdatedMuTopicUserScheduleAdherenceUpdate.impact) &&
            Objects.equals(this.adherenceExplanation, wfmUserScheduleAdherenceUpdatedMuTopicUserScheduleAdherenceUpdate.adherenceExplanation) &&
            Objects.equals(this.adherenceChangeTime, wfmUserScheduleAdherenceUpdatedMuTopicUserScheduleAdherenceUpdate.adherenceChangeTime) &&
            Objects.equals(this.presenceUpdateTime, wfmUserScheduleAdherenceUpdatedMuTopicUserScheduleAdherenceUpdate.presenceUpdateTime) &&
            Objects.equals(this.activeQueues, wfmUserScheduleAdherenceUpdatedMuTopicUserScheduleAdherenceUpdate.activeQueues) &&
            Objects.equals(this.activeQueuesModifiedTime, wfmUserScheduleAdherenceUpdatedMuTopicUserScheduleAdherenceUpdate.activeQueuesModifiedTime) &&
            Objects.equals(this.removedFromManagementUnit, wfmUserScheduleAdherenceUpdatedMuTopicUserScheduleAdherenceUpdate.removedFromManagementUnit) &&
            Objects.equals(this.suppressOnTimeReminder, wfmUserScheduleAdherenceUpdatedMuTopicUserScheduleAdherenceUpdate.suppressOnTimeReminder) &&
            Objects.equals(this.nextActivityReminders, wfmUserScheduleAdherenceUpdatedMuTopicUserScheduleAdherenceUpdate.nextActivityReminders);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, managementUnitId, team, scheduledActivityCategory, scheduledActivityCode, systemPresence, organizationSecondaryPresenceId, routingStatus, actualActivityCategory, isOutOfOffice, adherenceState, impact, adherenceExplanation, adherenceChangeTime, presenceUpdateTime, activeQueues, activeQueuesModifiedTime, removedFromManagementUnit, suppressOnTimeReminder, nextActivityReminders);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmUserScheduleAdherenceUpdatedMuTopicUserScheduleAdherenceUpdate {\n");
    
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    managementUnitId: ").append(toIndentedString(managementUnitId)).append("\n");
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
    sb.append("    scheduledActivityCategory: ").append(toIndentedString(scheduledActivityCategory)).append("\n");
    sb.append("    scheduledActivityCode: ").append(toIndentedString(scheduledActivityCode)).append("\n");
    sb.append("    systemPresence: ").append(toIndentedString(systemPresence)).append("\n");
    sb.append("    organizationSecondaryPresenceId: ").append(toIndentedString(organizationSecondaryPresenceId)).append("\n");
    sb.append("    routingStatus: ").append(toIndentedString(routingStatus)).append("\n");
    sb.append("    actualActivityCategory: ").append(toIndentedString(actualActivityCategory)).append("\n");
    sb.append("    isOutOfOffice: ").append(toIndentedString(isOutOfOffice)).append("\n");
    sb.append("    adherenceState: ").append(toIndentedString(adherenceState)).append("\n");
    sb.append("    impact: ").append(toIndentedString(impact)).append("\n");
    sb.append("    adherenceExplanation: ").append(toIndentedString(adherenceExplanation)).append("\n");
    sb.append("    adherenceChangeTime: ").append(toIndentedString(adherenceChangeTime)).append("\n");
    sb.append("    presenceUpdateTime: ").append(toIndentedString(presenceUpdateTime)).append("\n");
    sb.append("    activeQueues: ").append(toIndentedString(activeQueues)).append("\n");
    sb.append("    activeQueuesModifiedTime: ").append(toIndentedString(activeQueuesModifiedTime)).append("\n");
    sb.append("    removedFromManagementUnit: ").append(toIndentedString(removedFromManagementUnit)).append("\n");
    sb.append("    suppressOnTimeReminder: ").append(toIndentedString(suppressOnTimeReminder)).append("\n");
    sb.append("    nextActivityReminders: ").append(toIndentedString(nextActivityReminders)).append("\n");
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

