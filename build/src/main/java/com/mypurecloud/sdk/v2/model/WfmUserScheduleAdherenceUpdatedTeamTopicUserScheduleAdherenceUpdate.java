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
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.WfmUserScheduleAdherenceUpdatedTeamTopicQueueReference;
import com.mypurecloud.sdk.v2.model.WfmUserScheduleAdherenceUpdatedTeamTopicUriReference;
import com.mypurecloud.sdk.v2.model.WfmUserScheduleAdherenceUpdatedTeamTopicUserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * WfmUserScheduleAdherenceUpdatedTeamTopicUserScheduleAdherenceUpdate
 */

public class WfmUserScheduleAdherenceUpdatedTeamTopicUserScheduleAdherenceUpdate  implements Serializable {
  
  private WfmUserScheduleAdherenceUpdatedTeamTopicUserReference user = null;
  private String managementUnitId = null;
  private WfmUserScheduleAdherenceUpdatedTeamTopicUriReference team = null;
  private String scheduledActivityCategory = null;
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
    IGNORED("Ignored");

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
  private Date adherenceChangeTime = null;
  private Date presenceUpdateTime = null;
  private List<WfmUserScheduleAdherenceUpdatedTeamTopicQueueReference> activeQueues = new ArrayList<WfmUserScheduleAdherenceUpdatedTeamTopicQueueReference>();
  private Date activeQueuesModifiedTime = null;
  private Boolean removedFromManagementUnit = null;

  
  /**
   **/
  public WfmUserScheduleAdherenceUpdatedTeamTopicUserScheduleAdherenceUpdate user(WfmUserScheduleAdherenceUpdatedTeamTopicUserReference user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("user")
  public WfmUserScheduleAdherenceUpdatedTeamTopicUserReference getUser() {
    return user;
  }
  public void setUser(WfmUserScheduleAdherenceUpdatedTeamTopicUserReference user) {
    this.user = user;
  }

  
  /**
   **/
  public WfmUserScheduleAdherenceUpdatedTeamTopicUserScheduleAdherenceUpdate managementUnitId(String managementUnitId) {
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
  public WfmUserScheduleAdherenceUpdatedTeamTopicUserScheduleAdherenceUpdate team(WfmUserScheduleAdherenceUpdatedTeamTopicUriReference team) {
    this.team = team;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("team")
  public WfmUserScheduleAdherenceUpdatedTeamTopicUriReference getTeam() {
    return team;
  }
  public void setTeam(WfmUserScheduleAdherenceUpdatedTeamTopicUriReference team) {
    this.team = team;
  }

  
  /**
   **/
  public WfmUserScheduleAdherenceUpdatedTeamTopicUserScheduleAdherenceUpdate scheduledActivityCategory(String scheduledActivityCategory) {
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
  public WfmUserScheduleAdherenceUpdatedTeamTopicUserScheduleAdherenceUpdate systemPresence(String systemPresence) {
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
  public WfmUserScheduleAdherenceUpdatedTeamTopicUserScheduleAdherenceUpdate organizationSecondaryPresenceId(String organizationSecondaryPresenceId) {
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
  public WfmUserScheduleAdherenceUpdatedTeamTopicUserScheduleAdherenceUpdate routingStatus(RoutingStatusEnum routingStatus) {
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
  public WfmUserScheduleAdherenceUpdatedTeamTopicUserScheduleAdherenceUpdate actualActivityCategory(String actualActivityCategory) {
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
  public WfmUserScheduleAdherenceUpdatedTeamTopicUserScheduleAdherenceUpdate isOutOfOffice(Boolean isOutOfOffice) {
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
  public WfmUserScheduleAdherenceUpdatedTeamTopicUserScheduleAdherenceUpdate adherenceState(AdherenceStateEnum adherenceState) {
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
  public WfmUserScheduleAdherenceUpdatedTeamTopicUserScheduleAdherenceUpdate impact(String impact) {
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
  public WfmUserScheduleAdherenceUpdatedTeamTopicUserScheduleAdherenceUpdate adherenceChangeTime(Date adherenceChangeTime) {
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
  public WfmUserScheduleAdherenceUpdatedTeamTopicUserScheduleAdherenceUpdate presenceUpdateTime(Date presenceUpdateTime) {
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
  public WfmUserScheduleAdherenceUpdatedTeamTopicUserScheduleAdherenceUpdate activeQueues(List<WfmUserScheduleAdherenceUpdatedTeamTopicQueueReference> activeQueues) {
    this.activeQueues = activeQueues;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("activeQueues")
  public List<WfmUserScheduleAdherenceUpdatedTeamTopicQueueReference> getActiveQueues() {
    return activeQueues;
  }
  public void setActiveQueues(List<WfmUserScheduleAdherenceUpdatedTeamTopicQueueReference> activeQueues) {
    this.activeQueues = activeQueues;
  }

  
  /**
   **/
  public WfmUserScheduleAdherenceUpdatedTeamTopicUserScheduleAdherenceUpdate activeQueuesModifiedTime(Date activeQueuesModifiedTime) {
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
  public WfmUserScheduleAdherenceUpdatedTeamTopicUserScheduleAdherenceUpdate removedFromManagementUnit(Boolean removedFromManagementUnit) {
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WfmUserScheduleAdherenceUpdatedTeamTopicUserScheduleAdherenceUpdate wfmUserScheduleAdherenceUpdatedTeamTopicUserScheduleAdherenceUpdate = (WfmUserScheduleAdherenceUpdatedTeamTopicUserScheduleAdherenceUpdate) o;
    return Objects.equals(this.user, wfmUserScheduleAdherenceUpdatedTeamTopicUserScheduleAdherenceUpdate.user) &&
        Objects.equals(this.managementUnitId, wfmUserScheduleAdherenceUpdatedTeamTopicUserScheduleAdherenceUpdate.managementUnitId) &&
        Objects.equals(this.team, wfmUserScheduleAdherenceUpdatedTeamTopicUserScheduleAdherenceUpdate.team) &&
        Objects.equals(this.scheduledActivityCategory, wfmUserScheduleAdherenceUpdatedTeamTopicUserScheduleAdherenceUpdate.scheduledActivityCategory) &&
        Objects.equals(this.systemPresence, wfmUserScheduleAdherenceUpdatedTeamTopicUserScheduleAdherenceUpdate.systemPresence) &&
        Objects.equals(this.organizationSecondaryPresenceId, wfmUserScheduleAdherenceUpdatedTeamTopicUserScheduleAdherenceUpdate.organizationSecondaryPresenceId) &&
        Objects.equals(this.routingStatus, wfmUserScheduleAdherenceUpdatedTeamTopicUserScheduleAdherenceUpdate.routingStatus) &&
        Objects.equals(this.actualActivityCategory, wfmUserScheduleAdherenceUpdatedTeamTopicUserScheduleAdherenceUpdate.actualActivityCategory) &&
        Objects.equals(this.isOutOfOffice, wfmUserScheduleAdherenceUpdatedTeamTopicUserScheduleAdherenceUpdate.isOutOfOffice) &&
        Objects.equals(this.adherenceState, wfmUserScheduleAdherenceUpdatedTeamTopicUserScheduleAdherenceUpdate.adherenceState) &&
        Objects.equals(this.impact, wfmUserScheduleAdherenceUpdatedTeamTopicUserScheduleAdherenceUpdate.impact) &&
        Objects.equals(this.adherenceChangeTime, wfmUserScheduleAdherenceUpdatedTeamTopicUserScheduleAdherenceUpdate.adherenceChangeTime) &&
        Objects.equals(this.presenceUpdateTime, wfmUserScheduleAdherenceUpdatedTeamTopicUserScheduleAdherenceUpdate.presenceUpdateTime) &&
        Objects.equals(this.activeQueues, wfmUserScheduleAdherenceUpdatedTeamTopicUserScheduleAdherenceUpdate.activeQueues) &&
        Objects.equals(this.activeQueuesModifiedTime, wfmUserScheduleAdherenceUpdatedTeamTopicUserScheduleAdherenceUpdate.activeQueuesModifiedTime) &&
        Objects.equals(this.removedFromManagementUnit, wfmUserScheduleAdherenceUpdatedTeamTopicUserScheduleAdherenceUpdate.removedFromManagementUnit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, managementUnitId, team, scheduledActivityCategory, systemPresence, organizationSecondaryPresenceId, routingStatus, actualActivityCategory, isOutOfOffice, adherenceState, impact, adherenceChangeTime, presenceUpdateTime, activeQueues, activeQueuesModifiedTime, removedFromManagementUnit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmUserScheduleAdherenceUpdatedTeamTopicUserScheduleAdherenceUpdate {\n");
    
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    managementUnitId: ").append(toIndentedString(managementUnitId)).append("\n");
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
    sb.append("    scheduledActivityCategory: ").append(toIndentedString(scheduledActivityCategory)).append("\n");
    sb.append("    systemPresence: ").append(toIndentedString(systemPresence)).append("\n");
    sb.append("    organizationSecondaryPresenceId: ").append(toIndentedString(organizationSecondaryPresenceId)).append("\n");
    sb.append("    routingStatus: ").append(toIndentedString(routingStatus)).append("\n");
    sb.append("    actualActivityCategory: ").append(toIndentedString(actualActivityCategory)).append("\n");
    sb.append("    isOutOfOffice: ").append(toIndentedString(isOutOfOffice)).append("\n");
    sb.append("    adherenceState: ").append(toIndentedString(adherenceState)).append("\n");
    sb.append("    impact: ").append(toIndentedString(impact)).append("\n");
    sb.append("    adherenceChangeTime: ").append(toIndentedString(adherenceChangeTime)).append("\n");
    sb.append("    presenceUpdateTime: ").append(toIndentedString(presenceUpdateTime)).append("\n");
    sb.append("    activeQueues: ").append(toIndentedString(activeQueues)).append("\n");
    sb.append("    activeQueuesModifiedTime: ").append(toIndentedString(activeQueuesModifiedTime)).append("\n");
    sb.append("    removedFromManagementUnit: ").append(toIndentedString(removedFromManagementUnit)).append("\n");
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

