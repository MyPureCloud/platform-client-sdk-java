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
import com.mypurecloud.sdk.v2.model.ActivityCodeReference;
import com.mypurecloud.sdk.v2.model.ActivityPlanServiceGoalImpactOverrides;
import com.mypurecloud.sdk.v2.model.FixedAvailability;
import com.mypurecloud.sdk.v2.model.GroupSettings;
import com.mypurecloud.sdk.v2.model.ManagementUnitReference;
import com.mypurecloud.sdk.v2.model.RecurrenceSettings;
import com.mypurecloud.sdk.v2.model.SchedulingPeriod;
import com.mypurecloud.sdk.v2.model.UserReference;
import com.mypurecloud.sdk.v2.model.UserSearchRule;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * ActivityPlanResponse
 */

public class ActivityPlanResponse  implements Serializable {
  
  private String id = null;
  private String name = null;
  private List<ManagementUnitReference> managementUnits = null;
  private String description = null;
  private ActivityCodeReference activityCode = null;

  private static class TypeEnumDeserializer extends StdDeserializer<TypeEnum> {
    public TypeEnumDeserializer() {
      super(TypeEnumDeserializer.class);
    }

    @Override
    public TypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return TypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The type of the activity plan
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    INDIVIDUAL("Individual"),
    GROUP("Group");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static TypeEnum fromString(String key) {
      if (key == null) return null;

      for (TypeEnum value : TypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return TypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private TypeEnum type = null;
  private SchedulingPeriod initialSchedulePeriod = null;
  private Integer lengthMinutes = null;
  private GroupSettings groupSettings = null;
  private RecurrenceSettings recurrenceSettings = null;
  private UserSearchRule attendeesSearchRule = null;
  private Boolean facilitated = null;
  private UserSearchRule facilitatorsSearchRule = null;
  private Integer transitionTimeMinutes = null;
  private ActivityPlanServiceGoalImpactOverrides serviceGoalImpactOverrides = null;

  private static class OptimizationObjectiveEnumDeserializer extends StdDeserializer<OptimizationObjectiveEnum> {
    public OptimizationObjectiveEnumDeserializer() {
      super(OptimizationObjectiveEnumDeserializer.class);
    }

    @Override
    public OptimizationObjectiveEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return OptimizationObjectiveEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The optimization objective of this activity plan
   */
 @JsonDeserialize(using = OptimizationObjectiveEnumDeserializer.class)
  public enum OptimizationObjectiveEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    FAVORSERVICEGOALS("FavorServiceGoals"),
    FAVORSCHEDULINGALL("FavorSchedulingAll");

    private String value;

    OptimizationObjectiveEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static OptimizationObjectiveEnum fromString(String key) {
      if (key == null) return null;

      for (OptimizationObjectiveEnum value : OptimizationObjectiveEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return OptimizationObjectiveEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private OptimizationObjectiveEnum optimizationObjective = null;
  private List<FixedAvailability> fixedAvailability = null;

  private static class StateEnumDeserializer extends StdDeserializer<StateEnum> {
    public StateEnumDeserializer() {
      super(StateEnumDeserializer.class);
    }

    @Override
    public StateEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return StateEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The state of this activity plan
   */
 @JsonDeserialize(using = StateEnumDeserializer.class)
  public enum StateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ACTIVE("Active"),
    INACTIVE("Inactive");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StateEnum fromString(String key) {
      if (key == null) return null;

      for (StateEnum value : StateEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StateEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StateEnum state = null;
  private Boolean countsAsPaidTime = null;
  private Date createdDate = null;
  private UserReference createdBy = null;
  private Date modifiedDate = null;
  private UserReference modifiedBy = null;
  private Date lastRunDate = null;
  private UserReference lastRunBy = null;
  private String selfUri = null;

  public ActivityPlanResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      managementUnits = new ArrayList<ManagementUnitReference>();
      fixedAvailability = new ArrayList<FixedAvailability>();
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * The name of the activity plan
   **/
  public ActivityPlanResponse name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the activity plan")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The management units to which this activity plan applies. Empty list or null means this activity plan applies to the entire business unit
   **/
  public ActivityPlanResponse managementUnits(List<ManagementUnitReference> managementUnits) {
    this.managementUnits = managementUnits;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The management units to which this activity plan applies. Empty list or null means this activity plan applies to the entire business unit")
  @JsonProperty("managementUnits")
  public List<ManagementUnitReference> getManagementUnits() {
    return managementUnits;
  }
  public void setManagementUnits(List<ManagementUnitReference> managementUnits) {
    this.managementUnits = managementUnits;
  }


  /**
   * The description of this activity plan
   **/
  public ActivityPlanResponse description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The description of this activity plan")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * The activity code associated with this activity plan. It is recommended to load and cache the entire list of activity codes rather than look up individual codes
   **/
  public ActivityPlanResponse activityCode(ActivityCodeReference activityCode) {
    this.activityCode = activityCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The activity code associated with this activity plan. It is recommended to load and cache the entire list of activity codes rather than look up individual codes")
  @JsonProperty("activityCode")
  public ActivityCodeReference getActivityCode() {
    return activityCode;
  }
  public void setActivityCode(ActivityCodeReference activityCode) {
    this.activityCode = activityCode;
  }


  /**
   * The type of the activity plan
   **/
  public ActivityPlanResponse type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The type of the activity plan")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * The initial schedule period of the activity plan
   **/
  public ActivityPlanResponse initialSchedulePeriod(SchedulingPeriod initialSchedulePeriod) {
    this.initialSchedulePeriod = initialSchedulePeriod;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The initial schedule period of the activity plan")
  @JsonProperty("initialSchedulePeriod")
  public SchedulingPeriod getInitialSchedulePeriod() {
    return initialSchedulePeriod;
  }
  public void setInitialSchedulePeriod(SchedulingPeriod initialSchedulePeriod) {
    this.initialSchedulePeriod = initialSchedulePeriod;
  }


  /**
   * The length of the activity in minutes
   **/
  public ActivityPlanResponse lengthMinutes(Integer lengthMinutes) {
    this.lengthMinutes = lengthMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The length of the activity in minutes")
  @JsonProperty("lengthMinutes")
  public Integer getLengthMinutes() {
    return lengthMinutes;
  }
  public void setLengthMinutes(Integer lengthMinutes) {
    this.lengthMinutes = lengthMinutes;
  }


  /**
   * Group settings for this activity plan
   **/
  public ActivityPlanResponse groupSettings(GroupSettings groupSettings) {
    this.groupSettings = groupSettings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Group settings for this activity plan")
  @JsonProperty("groupSettings")
  public GroupSettings getGroupSettings() {
    return groupSettings;
  }
  public void setGroupSettings(GroupSettings groupSettings) {
    this.groupSettings = groupSettings;
  }


  /**
   * Recurrence settings for this activity plan
   **/
  public ActivityPlanResponse recurrenceSettings(RecurrenceSettings recurrenceSettings) {
    this.recurrenceSettings = recurrenceSettings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Recurrence settings for this activity plan")
  @JsonProperty("recurrenceSettings")
  public RecurrenceSettings getRecurrenceSettings() {
    return recurrenceSettings;
  }
  public void setRecurrenceSettings(RecurrenceSettings recurrenceSettings) {
    this.recurrenceSettings = recurrenceSettings;
  }


  /**
   * Attendee search rule for this activity plan
   **/
  public ActivityPlanResponse attendeesSearchRule(UserSearchRule attendeesSearchRule) {
    this.attendeesSearchRule = attendeesSearchRule;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Attendee search rule for this activity plan")
  @JsonProperty("attendeesSearchRule")
  public UserSearchRule getAttendeesSearchRule() {
    return attendeesSearchRule;
  }
  public void setAttendeesSearchRule(UserSearchRule attendeesSearchRule) {
    this.attendeesSearchRule = attendeesSearchRule;
  }


  /**
   * Whether the sessions created by this activity plan should be facilitated
   **/
  public ActivityPlanResponse facilitated(Boolean facilitated) {
    this.facilitated = facilitated;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Whether the sessions created by this activity plan should be facilitated")
  @JsonProperty("facilitated")
  public Boolean getFacilitated() {
    return facilitated;
  }
  public void setFacilitated(Boolean facilitated) {
    this.facilitated = facilitated;
  }


  /**
   * Facilitator search rule for this activity plan
   **/
  public ActivityPlanResponse facilitatorsSearchRule(UserSearchRule facilitatorsSearchRule) {
    this.facilitatorsSearchRule = facilitatorsSearchRule;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Facilitator search rule for this activity plan")
  @JsonProperty("facilitatorsSearchRule")
  public UserSearchRule getFacilitatorsSearchRule() {
    return facilitatorsSearchRule;
  }
  public void setFacilitatorsSearchRule(UserSearchRule facilitatorsSearchRule) {
    this.facilitatorsSearchRule = facilitatorsSearchRule;
  }


  /**
   * Transition time in minutes between facilitated sessions
   **/
  public ActivityPlanResponse transitionTimeMinutes(Integer transitionTimeMinutes) {
    this.transitionTimeMinutes = transitionTimeMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Transition time in minutes between facilitated sessions")
  @JsonProperty("transitionTimeMinutes")
  public Integer getTransitionTimeMinutes() {
    return transitionTimeMinutes;
  }
  public void setTransitionTimeMinutes(Integer transitionTimeMinutes) {
    this.transitionTimeMinutes = transitionTimeMinutes;
  }


  /**
   * Allowable service goal impact override settings for this activity plan
   **/
  public ActivityPlanResponse serviceGoalImpactOverrides(ActivityPlanServiceGoalImpactOverrides serviceGoalImpactOverrides) {
    this.serviceGoalImpactOverrides = serviceGoalImpactOverrides;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Allowable service goal impact override settings for this activity plan")
  @JsonProperty("serviceGoalImpactOverrides")
  public ActivityPlanServiceGoalImpactOverrides getServiceGoalImpactOverrides() {
    return serviceGoalImpactOverrides;
  }
  public void setServiceGoalImpactOverrides(ActivityPlanServiceGoalImpactOverrides serviceGoalImpactOverrides) {
    this.serviceGoalImpactOverrides = serviceGoalImpactOverrides;
  }


  /**
   * The optimization objective of this activity plan
   **/
  public ActivityPlanResponse optimizationObjective(OptimizationObjectiveEnum optimizationObjective) {
    this.optimizationObjective = optimizationObjective;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The optimization objective of this activity plan")
  @JsonProperty("optimizationObjective")
  public OptimizationObjectiveEnum getOptimizationObjective() {
    return optimizationObjective;
  }
  public void setOptimizationObjective(OptimizationObjectiveEnum optimizationObjective) {
    this.optimizationObjective = optimizationObjective;
  }


  /**
   * Fixed availability configuration for this activity plan
   **/
  public ActivityPlanResponse fixedAvailability(List<FixedAvailability> fixedAvailability) {
    this.fixedAvailability = fixedAvailability;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Fixed availability configuration for this activity plan")
  @JsonProperty("fixedAvailability")
  public List<FixedAvailability> getFixedAvailability() {
    return fixedAvailability;
  }
  public void setFixedAvailability(List<FixedAvailability> fixedAvailability) {
    this.fixedAvailability = fixedAvailability;
  }


  /**
   * The state of this activity plan
   **/
  public ActivityPlanResponse state(StateEnum state) {
    this.state = state;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The state of this activity plan")
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }


  /**
   * Whether the activity should count as paid time
   **/
  public ActivityPlanResponse countsAsPaidTime(Boolean countsAsPaidTime) {
    this.countsAsPaidTime = countsAsPaidTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Whether the activity should count as paid time")
  @JsonProperty("countsAsPaidTime")
  public Boolean getCountsAsPaidTime() {
    return countsAsPaidTime;
  }
  public void setCountsAsPaidTime(Boolean countsAsPaidTime) {
    this.countsAsPaidTime = countsAsPaidTime;
  }


  /**
   * The date the activity plan was created, in ISO-8601 format
   **/
  public ActivityPlanResponse createdDate(Date createdDate) {
    this.createdDate = createdDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The date the activity plan was created, in ISO-8601 format")
  @JsonProperty("createdDate")
  public Date getCreatedDate() {
    return createdDate;
  }
  public void setCreatedDate(Date createdDate) {
    this.createdDate = createdDate;
  }


  /**
   * The user who created this activity plan
   **/
  public ActivityPlanResponse createdBy(UserReference createdBy) {
    this.createdBy = createdBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The user who created this activity plan")
  @JsonProperty("createdBy")
  public UserReference getCreatedBy() {
    return createdBy;
  }
  public void setCreatedBy(UserReference createdBy) {
    this.createdBy = createdBy;
  }


  /**
   * The date the activity plan was modified, in ISO-8601 format
   **/
  public ActivityPlanResponse modifiedDate(Date modifiedDate) {
    this.modifiedDate = modifiedDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The date the activity plan was modified, in ISO-8601 format")
  @JsonProperty("modifiedDate")
  public Date getModifiedDate() {
    return modifiedDate;
  }
  public void setModifiedDate(Date modifiedDate) {
    this.modifiedDate = modifiedDate;
  }


  /**
   * The last user to modify this activity plan. The id may be 'System' if it was an automated process
   **/
  public ActivityPlanResponse modifiedBy(UserReference modifiedBy) {
    this.modifiedBy = modifiedBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The last user to modify this activity plan. The id may be 'System' if it was an automated process")
  @JsonProperty("modifiedBy")
  public UserReference getModifiedBy() {
    return modifiedBy;
  }
  public void setModifiedBy(UserReference modifiedBy) {
    this.modifiedBy = modifiedBy;
  }


  /**
   * The date on which the activity plan was last manually run, in ISO-8601 format
   **/
  public ActivityPlanResponse lastRunDate(Date lastRunDate) {
    this.lastRunDate = lastRunDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The date on which the activity plan was last manually run, in ISO-8601 format")
  @JsonProperty("lastRunDate")
  public Date getLastRunDate() {
    return lastRunDate;
  }
  public void setLastRunDate(Date lastRunDate) {
    this.lastRunDate = lastRunDate;
  }


  /**
   * The last user to run this activity plan
   **/
  public ActivityPlanResponse lastRunBy(UserReference lastRunBy) {
    this.lastRunBy = lastRunBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The last user to run this activity plan")
  @JsonProperty("lastRunBy")
  public UserReference getLastRunBy() {
    return lastRunBy;
  }
  public void setLastRunBy(UserReference lastRunBy) {
    this.lastRunBy = lastRunBy;
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
    ActivityPlanResponse activityPlanResponse = (ActivityPlanResponse) o;

    return Objects.equals(this.id, activityPlanResponse.id) &&
            Objects.equals(this.name, activityPlanResponse.name) &&
            Objects.equals(this.managementUnits, activityPlanResponse.managementUnits) &&
            Objects.equals(this.description, activityPlanResponse.description) &&
            Objects.equals(this.activityCode, activityPlanResponse.activityCode) &&
            Objects.equals(this.type, activityPlanResponse.type) &&
            Objects.equals(this.initialSchedulePeriod, activityPlanResponse.initialSchedulePeriod) &&
            Objects.equals(this.lengthMinutes, activityPlanResponse.lengthMinutes) &&
            Objects.equals(this.groupSettings, activityPlanResponse.groupSettings) &&
            Objects.equals(this.recurrenceSettings, activityPlanResponse.recurrenceSettings) &&
            Objects.equals(this.attendeesSearchRule, activityPlanResponse.attendeesSearchRule) &&
            Objects.equals(this.facilitated, activityPlanResponse.facilitated) &&
            Objects.equals(this.facilitatorsSearchRule, activityPlanResponse.facilitatorsSearchRule) &&
            Objects.equals(this.transitionTimeMinutes, activityPlanResponse.transitionTimeMinutes) &&
            Objects.equals(this.serviceGoalImpactOverrides, activityPlanResponse.serviceGoalImpactOverrides) &&
            Objects.equals(this.optimizationObjective, activityPlanResponse.optimizationObjective) &&
            Objects.equals(this.fixedAvailability, activityPlanResponse.fixedAvailability) &&
            Objects.equals(this.state, activityPlanResponse.state) &&
            Objects.equals(this.countsAsPaidTime, activityPlanResponse.countsAsPaidTime) &&
            Objects.equals(this.createdDate, activityPlanResponse.createdDate) &&
            Objects.equals(this.createdBy, activityPlanResponse.createdBy) &&
            Objects.equals(this.modifiedDate, activityPlanResponse.modifiedDate) &&
            Objects.equals(this.modifiedBy, activityPlanResponse.modifiedBy) &&
            Objects.equals(this.lastRunDate, activityPlanResponse.lastRunDate) &&
            Objects.equals(this.lastRunBy, activityPlanResponse.lastRunBy) &&
            Objects.equals(this.selfUri, activityPlanResponse.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, managementUnits, description, activityCode, type, initialSchedulePeriod, lengthMinutes, groupSettings, recurrenceSettings, attendeesSearchRule, facilitated, facilitatorsSearchRule, transitionTimeMinutes, serviceGoalImpactOverrides, optimizationObjective, fixedAvailability, state, countsAsPaidTime, createdDate, createdBy, modifiedDate, modifiedBy, lastRunDate, lastRunBy, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivityPlanResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    managementUnits: ").append(toIndentedString(managementUnits)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    activityCode: ").append(toIndentedString(activityCode)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    initialSchedulePeriod: ").append(toIndentedString(initialSchedulePeriod)).append("\n");
    sb.append("    lengthMinutes: ").append(toIndentedString(lengthMinutes)).append("\n");
    sb.append("    groupSettings: ").append(toIndentedString(groupSettings)).append("\n");
    sb.append("    recurrenceSettings: ").append(toIndentedString(recurrenceSettings)).append("\n");
    sb.append("    attendeesSearchRule: ").append(toIndentedString(attendeesSearchRule)).append("\n");
    sb.append("    facilitated: ").append(toIndentedString(facilitated)).append("\n");
    sb.append("    facilitatorsSearchRule: ").append(toIndentedString(facilitatorsSearchRule)).append("\n");
    sb.append("    transitionTimeMinutes: ").append(toIndentedString(transitionTimeMinutes)).append("\n");
    sb.append("    serviceGoalImpactOverrides: ").append(toIndentedString(serviceGoalImpactOverrides)).append("\n");
    sb.append("    optimizationObjective: ").append(toIndentedString(optimizationObjective)).append("\n");
    sb.append("    fixedAvailability: ").append(toIndentedString(fixedAvailability)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    countsAsPaidTime: ").append(toIndentedString(countsAsPaidTime)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    lastRunDate: ").append(toIndentedString(lastRunDate)).append("\n");
    sb.append("    lastRunBy: ").append(toIndentedString(lastRunBy)).append("\n");
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

