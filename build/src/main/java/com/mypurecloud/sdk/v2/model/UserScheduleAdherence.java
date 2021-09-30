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
import com.mypurecloud.sdk.v2.model.ManagementUnit;
import com.mypurecloud.sdk.v2.model.QueueReference;
import com.mypurecloud.sdk.v2.model.Team;
import com.mypurecloud.sdk.v2.model.UserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * UserScheduleAdherence
 */

public class UserScheduleAdherence  implements Serializable {
  
  private String id = null;
  private String name = null;
  private UserReference user = null;
  private ManagementUnit managementUnit = null;
  private Team team = null;

  private static class ScheduledActivityCategoryEnumDeserializer extends StdDeserializer<ScheduledActivityCategoryEnum> {
    public ScheduledActivityCategoryEnumDeserializer() {
      super(ScheduledActivityCategoryEnumDeserializer.class);
    }

    @Override
    public ScheduledActivityCategoryEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ScheduledActivityCategoryEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Activity for which the user is scheduled
   */
 @JsonDeserialize(using = ScheduledActivityCategoryEnumDeserializer.class)
  public enum ScheduledActivityCategoryEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ONQUEUEWORK("OnQueueWork"),
    BREAK("Break"),
    MEAL("Meal"),
    MEETING("Meeting"),
    OFFQUEUEWORK("OffQueueWork"),
    TIMEOFF("TimeOff"),
    TRAINING("Training"),
    UNAVAILABLE("Unavailable"),
    UNSCHEDULED("Unscheduled");

    private String value;

    ScheduledActivityCategoryEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ScheduledActivityCategoryEnum fromString(String key) {
      if (key == null) return null;

      for (ScheduledActivityCategoryEnum value : ScheduledActivityCategoryEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ScheduledActivityCategoryEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ScheduledActivityCategoryEnum scheduledActivityCategory = null;

  private static class SystemPresenceEnumDeserializer extends StdDeserializer<SystemPresenceEnum> {
    public SystemPresenceEnumDeserializer() {
      super(SystemPresenceEnumDeserializer.class);
    }

    @Override
    public SystemPresenceEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return SystemPresenceEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Actual underlying system presence value
   */
 @JsonDeserialize(using = SystemPresenceEnumDeserializer.class)
  public enum SystemPresenceEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    AVAILABLE("Available"),
    AWAY("Away"),
    BUSY("Busy"),
    OFFLINE("Offline"),
    IDLE("Idle"),
    ONQUEUE("OnQueue"),
    MEAL("Meal"),
    TRAINING("Training"),
    MEETING("Meeting"),
    BREAK("Break");

    private String value;

    SystemPresenceEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static SystemPresenceEnum fromString(String key) {
      if (key == null) return null;

      for (SystemPresenceEnum value : SystemPresenceEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return SystemPresenceEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private SystemPresenceEnum systemPresence = null;
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
   * Actual underlying routing status, used to determine whether a user is actually in adherence when OnQueue
   */
 @JsonDeserialize(using = RoutingStatusEnumDeserializer.class)
  public enum RoutingStatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    OFF_QUEUE("OFF_QUEUE"),
    IDLE("IDLE"),
    INTERACTING("INTERACTING"),
    NOT_RESPONDING("NOT_RESPONDING"),
    COMMUNICATING("COMMUNICATING");

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

  private static class ActualActivityCategoryEnumDeserializer extends StdDeserializer<ActualActivityCategoryEnum> {
    public ActualActivityCategoryEnumDeserializer() {
      super(ActualActivityCategoryEnumDeserializer.class);
    }

    @Override
    public ActualActivityCategoryEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ActualActivityCategoryEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Activity in which the user is actually engaged
   */
 @JsonDeserialize(using = ActualActivityCategoryEnumDeserializer.class)
  public enum ActualActivityCategoryEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ONQUEUEWORK("OnQueueWork"),
    BREAK("Break"),
    MEAL("Meal"),
    MEETING("Meeting"),
    OFFQUEUEWORK("OffQueueWork"),
    TIMEOFF("TimeOff"),
    TRAINING("Training"),
    UNAVAILABLE("Unavailable"),
    UNSCHEDULED("Unscheduled");

    private String value;

    ActualActivityCategoryEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ActualActivityCategoryEnum fromString(String key) {
      if (key == null) return null;

      for (ActualActivityCategoryEnum value : ActualActivityCategoryEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ActualActivityCategoryEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ActualActivityCategoryEnum actualActivityCategory = null;
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
   * The user's current adherence state
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

  private static class ImpactEnumDeserializer extends StdDeserializer<ImpactEnum> {
    public ImpactEnumDeserializer() {
      super(ImpactEnumDeserializer.class);
    }

    @Override
    public ImpactEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ImpactEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The impact of the user's current adherenceState
   */
 @JsonDeserialize(using = ImpactEnumDeserializer.class)
  public enum ImpactEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    POSITIVE("Positive"),
    NEGATIVE("Negative"),
    NEUTRAL("Neutral"),
    UNKNOWN("Unknown");

    private String value;

    ImpactEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ImpactEnum fromString(String key) {
      if (key == null) return null;

      for (ImpactEnum value : ImpactEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ImpactEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ImpactEnum impact = null;
  private Date timeOfAdherenceChange = null;
  private Date presenceUpdateTime = null;
  private List<QueueReference> activeQueues = new ArrayList<QueueReference>();
  private Date activeQueuesModifiedTime = null;
  private Boolean removedFromManagementUnit = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public UserScheduleAdherence name(String name) {
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

  
  @ApiModelProperty(example = "null", value = "The user for whom this status applies")
  @JsonProperty("user")
  public UserReference getUser() {
    return user;
  }

  
  @ApiModelProperty(example = "null", value = "The management unit to which this user belongs")
  @JsonProperty("managementUnit")
  public ManagementUnit getManagementUnit() {
    return managementUnit;
  }

  
  @ApiModelProperty(example = "null", value = "The team to which this user belongs")
  @JsonProperty("team")
  public Team getTeam() {
    return team;
  }

  
  @ApiModelProperty(example = "null", value = "Activity for which the user is scheduled")
  @JsonProperty("scheduledActivityCategory")
  public ScheduledActivityCategoryEnum getScheduledActivityCategory() {
    return scheduledActivityCategory;
  }

  
  @ApiModelProperty(example = "null", value = "Actual underlying system presence value")
  @JsonProperty("systemPresence")
  public SystemPresenceEnum getSystemPresence() {
    return systemPresence;
  }

  
  @ApiModelProperty(example = "null", value = "Organization Secondary Presence Id.")
  @JsonProperty("organizationSecondaryPresenceId")
  public String getOrganizationSecondaryPresenceId() {
    return organizationSecondaryPresenceId;
  }

  
  @ApiModelProperty(example = "null", value = "Actual underlying routing status, used to determine whether a user is actually in adherence when OnQueue")
  @JsonProperty("routingStatus")
  public RoutingStatusEnum getRoutingStatus() {
    return routingStatus;
  }

  
  @ApiModelProperty(example = "null", value = "Activity in which the user is actually engaged")
  @JsonProperty("actualActivityCategory")
  public ActualActivityCategoryEnum getActualActivityCategory() {
    return actualActivityCategory;
  }

  
  @ApiModelProperty(example = "null", value = "Whether the user is marked OutOfOffice")
  @JsonProperty("isOutOfOffice")
  public Boolean getIsOutOfOffice() {
    return isOutOfOffice;
  }

  
  @ApiModelProperty(example = "null", value = "The user's current adherence state")
  @JsonProperty("adherenceState")
  public AdherenceStateEnum getAdherenceState() {
    return adherenceState;
  }

  
  @ApiModelProperty(example = "null", value = "The impact of the user's current adherenceState")
  @JsonProperty("impact")
  public ImpactEnum getImpact() {
    return impact;
  }

  
  @ApiModelProperty(example = "null", value = "Time when the user entered the current adherenceState in ISO-8601 format")
  @JsonProperty("timeOfAdherenceChange")
  public Date getTimeOfAdherenceChange() {
    return timeOfAdherenceChange;
  }

  
  @ApiModelProperty(example = "null", value = "Time when presence was last updated.  Used to calculate time in current status. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("presenceUpdateTime")
  public Date getPresenceUpdateTime() {
    return presenceUpdateTime;
  }

  
  @ApiModelProperty(example = "null", value = "The list of queues to which this user is joined")
  @JsonProperty("activeQueues")
  public List<QueueReference> getActiveQueues() {
    return activeQueues;
  }

  
  @ApiModelProperty(example = "null", value = "Time when the list of active queues for this user was last updated. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("activeQueuesModifiedTime")
  public Date getActiveQueuesModifiedTime() {
    return activeQueuesModifiedTime;
  }

  
  @ApiModelProperty(example = "null", value = "For notification purposes. Used to indicate that a user was removed from the management unit")
  @JsonProperty("removedFromManagementUnit")
  public Boolean getRemovedFromManagementUnit() {
    return removedFromManagementUnit;
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
    UserScheduleAdherence userScheduleAdherence = (UserScheduleAdherence) o;
    return Objects.equals(this.id, userScheduleAdherence.id) &&
        Objects.equals(this.name, userScheduleAdherence.name) &&
        Objects.equals(this.user, userScheduleAdherence.user) &&
        Objects.equals(this.managementUnit, userScheduleAdherence.managementUnit) &&
        Objects.equals(this.team, userScheduleAdherence.team) &&
        Objects.equals(this.scheduledActivityCategory, userScheduleAdherence.scheduledActivityCategory) &&
        Objects.equals(this.systemPresence, userScheduleAdherence.systemPresence) &&
        Objects.equals(this.organizationSecondaryPresenceId, userScheduleAdherence.organizationSecondaryPresenceId) &&
        Objects.equals(this.routingStatus, userScheduleAdherence.routingStatus) &&
        Objects.equals(this.actualActivityCategory, userScheduleAdherence.actualActivityCategory) &&
        Objects.equals(this.isOutOfOffice, userScheduleAdherence.isOutOfOffice) &&
        Objects.equals(this.adherenceState, userScheduleAdherence.adherenceState) &&
        Objects.equals(this.impact, userScheduleAdherence.impact) &&
        Objects.equals(this.timeOfAdherenceChange, userScheduleAdherence.timeOfAdherenceChange) &&
        Objects.equals(this.presenceUpdateTime, userScheduleAdherence.presenceUpdateTime) &&
        Objects.equals(this.activeQueues, userScheduleAdherence.activeQueues) &&
        Objects.equals(this.activeQueuesModifiedTime, userScheduleAdherence.activeQueuesModifiedTime) &&
        Objects.equals(this.removedFromManagementUnit, userScheduleAdherence.removedFromManagementUnit) &&
        Objects.equals(this.selfUri, userScheduleAdherence.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, user, managementUnit, team, scheduledActivityCategory, systemPresence, organizationSecondaryPresenceId, routingStatus, actualActivityCategory, isOutOfOffice, adherenceState, impact, timeOfAdherenceChange, presenceUpdateTime, activeQueues, activeQueuesModifiedTime, removedFromManagementUnit, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserScheduleAdherence {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    managementUnit: ").append(toIndentedString(managementUnit)).append("\n");
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
    sb.append("    scheduledActivityCategory: ").append(toIndentedString(scheduledActivityCategory)).append("\n");
    sb.append("    systemPresence: ").append(toIndentedString(systemPresence)).append("\n");
    sb.append("    organizationSecondaryPresenceId: ").append(toIndentedString(organizationSecondaryPresenceId)).append("\n");
    sb.append("    routingStatus: ").append(toIndentedString(routingStatus)).append("\n");
    sb.append("    actualActivityCategory: ").append(toIndentedString(actualActivityCategory)).append("\n");
    sb.append("    isOutOfOffice: ").append(toIndentedString(isOutOfOffice)).append("\n");
    sb.append("    adherenceState: ").append(toIndentedString(adherenceState)).append("\n");
    sb.append("    impact: ").append(toIndentedString(impact)).append("\n");
    sb.append("    timeOfAdherenceChange: ").append(toIndentedString(timeOfAdherenceChange)).append("\n");
    sb.append("    presenceUpdateTime: ").append(toIndentedString(presenceUpdateTime)).append("\n");
    sb.append("    activeQueues: ").append(toIndentedString(activeQueues)).append("\n");
    sb.append("    activeQueuesModifiedTime: ").append(toIndentedString(activeQueuesModifiedTime)).append("\n");
    sb.append("    removedFromManagementUnit: ").append(toIndentedString(removedFromManagementUnit)).append("\n");
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

