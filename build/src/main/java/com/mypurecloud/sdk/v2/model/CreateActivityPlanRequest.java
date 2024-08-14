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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.ActivityPlanServiceGoalImpactOverrides;
import com.mypurecloud.sdk.v2.model.FixedAvailability;
import com.mypurecloud.sdk.v2.model.GroupSettings;
import com.mypurecloud.sdk.v2.model.RecurrenceSettings;
import com.mypurecloud.sdk.v2.model.SchedulingPeriod;
import com.mypurecloud.sdk.v2.model.UserSearchRule;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * CreateActivityPlanRequest
 */

public class CreateActivityPlanRequest  implements Serializable {
  
  private String name = null;
  private List<String> managementUnitIds = new ArrayList<String>();
  private String description = null;
  private String activityCodeId = null;

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
  private Integer lengthMinutes = null;
  private SchedulingPeriod initialSchedulePeriod = null;
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
  private List<FixedAvailability> fixedAvailability = new ArrayList<FixedAvailability>();

  
  /**
   * The name of the activity plan
   **/
  public CreateActivityPlanRequest name(String name) {
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
  public CreateActivityPlanRequest managementUnitIds(List<String> managementUnitIds) {
    this.managementUnitIds = managementUnitIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The management units to which this activity plan applies. Empty list or null means this activity plan applies to the entire business unit")
  @JsonProperty("managementUnitIds")
  public List<String> getManagementUnitIds() {
    return managementUnitIds;
  }
  public void setManagementUnitIds(List<String> managementUnitIds) {
    this.managementUnitIds = managementUnitIds;
  }


  /**
   * The description of the activity plan
   **/
  public CreateActivityPlanRequest description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The description of the activity plan")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * The activity code associated with the activity plan
   **/
  public CreateActivityPlanRequest activityCodeId(String activityCodeId) {
    this.activityCodeId = activityCodeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The activity code associated with the activity plan")
  @JsonProperty("activityCodeId")
  public String getActivityCodeId() {
    return activityCodeId;
  }
  public void setActivityCodeId(String activityCodeId) {
    this.activityCodeId = activityCodeId;
  }


  /**
   * The type of the activity plan
   **/
  public CreateActivityPlanRequest type(TypeEnum type) {
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
   * The length in minutes of the activity plan
   **/
  public CreateActivityPlanRequest lengthMinutes(Integer lengthMinutes) {
    this.lengthMinutes = lengthMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The length in minutes of the activity plan")
  @JsonProperty("lengthMinutes")
  public Integer getLengthMinutes() {
    return lengthMinutes;
  }
  public void setLengthMinutes(Integer lengthMinutes) {
    this.lengthMinutes = lengthMinutes;
  }


  /**
   * The initial scheduling period for the activity plan
   **/
  public CreateActivityPlanRequest initialSchedulePeriod(SchedulingPeriod initialSchedulePeriod) {
    this.initialSchedulePeriod = initialSchedulePeriod;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The initial scheduling period for the activity plan")
  @JsonProperty("initialSchedulePeriod")
  public SchedulingPeriod getInitialSchedulePeriod() {
    return initialSchedulePeriod;
  }
  public void setInitialSchedulePeriod(SchedulingPeriod initialSchedulePeriod) {
    this.initialSchedulePeriod = initialSchedulePeriod;
  }


  /**
   * Group settings for the activity plan
   **/
  public CreateActivityPlanRequest groupSettings(GroupSettings groupSettings) {
    this.groupSettings = groupSettings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Group settings for the activity plan")
  @JsonProperty("groupSettings")
  public GroupSettings getGroupSettings() {
    return groupSettings;
  }
  public void setGroupSettings(GroupSettings groupSettings) {
    this.groupSettings = groupSettings;
  }


  /**
   * Settings controlling recurrence for the activity plan. If not set the activity plan will only occur once
   **/
  public CreateActivityPlanRequest recurrenceSettings(RecurrenceSettings recurrenceSettings) {
    this.recurrenceSettings = recurrenceSettings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Settings controlling recurrence for the activity plan. If not set the activity plan will only occur once")
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
  public CreateActivityPlanRequest attendeesSearchRule(UserSearchRule attendeesSearchRule) {
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
  public CreateActivityPlanRequest facilitated(Boolean facilitated) {
    this.facilitated = facilitated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether the sessions created by this activity plan should be facilitated")
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
  public CreateActivityPlanRequest facilitatorsSearchRule(UserSearchRule facilitatorsSearchRule) {
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
  public CreateActivityPlanRequest transitionTimeMinutes(Integer transitionTimeMinutes) {
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
   * Allowable service goal impact override settings for this activity plan. If not set the business unit setting will be used
   **/
  public CreateActivityPlanRequest serviceGoalImpactOverrides(ActivityPlanServiceGoalImpactOverrides serviceGoalImpactOverrides) {
    this.serviceGoalImpactOverrides = serviceGoalImpactOverrides;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Allowable service goal impact override settings for this activity plan. If not set the business unit setting will be used")
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
  public CreateActivityPlanRequest optimizationObjective(OptimizationObjectiveEnum optimizationObjective) {
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
   * The state of this activity plan
   **/
  public CreateActivityPlanRequest state(StateEnum state) {
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
  public CreateActivityPlanRequest countsAsPaidTime(Boolean countsAsPaidTime) {
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
   * Fixed availability configuration for the activity plan
   **/
  public CreateActivityPlanRequest fixedAvailability(List<FixedAvailability> fixedAvailability) {
    this.fixedAvailability = fixedAvailability;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Fixed availability configuration for the activity plan")
  @JsonProperty("fixedAvailability")
  public List<FixedAvailability> getFixedAvailability() {
    return fixedAvailability;
  }
  public void setFixedAvailability(List<FixedAvailability> fixedAvailability) {
    this.fixedAvailability = fixedAvailability;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateActivityPlanRequest createActivityPlanRequest = (CreateActivityPlanRequest) o;

    return Objects.equals(this.name, createActivityPlanRequest.name) &&
            Objects.equals(this.managementUnitIds, createActivityPlanRequest.managementUnitIds) &&
            Objects.equals(this.description, createActivityPlanRequest.description) &&
            Objects.equals(this.activityCodeId, createActivityPlanRequest.activityCodeId) &&
            Objects.equals(this.type, createActivityPlanRequest.type) &&
            Objects.equals(this.lengthMinutes, createActivityPlanRequest.lengthMinutes) &&
            Objects.equals(this.initialSchedulePeriod, createActivityPlanRequest.initialSchedulePeriod) &&
            Objects.equals(this.groupSettings, createActivityPlanRequest.groupSettings) &&
            Objects.equals(this.recurrenceSettings, createActivityPlanRequest.recurrenceSettings) &&
            Objects.equals(this.attendeesSearchRule, createActivityPlanRequest.attendeesSearchRule) &&
            Objects.equals(this.facilitated, createActivityPlanRequest.facilitated) &&
            Objects.equals(this.facilitatorsSearchRule, createActivityPlanRequest.facilitatorsSearchRule) &&
            Objects.equals(this.transitionTimeMinutes, createActivityPlanRequest.transitionTimeMinutes) &&
            Objects.equals(this.serviceGoalImpactOverrides, createActivityPlanRequest.serviceGoalImpactOverrides) &&
            Objects.equals(this.optimizationObjective, createActivityPlanRequest.optimizationObjective) &&
            Objects.equals(this.state, createActivityPlanRequest.state) &&
            Objects.equals(this.countsAsPaidTime, createActivityPlanRequest.countsAsPaidTime) &&
            Objects.equals(this.fixedAvailability, createActivityPlanRequest.fixedAvailability);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, managementUnitIds, description, activityCodeId, type, lengthMinutes, initialSchedulePeriod, groupSettings, recurrenceSettings, attendeesSearchRule, facilitated, facilitatorsSearchRule, transitionTimeMinutes, serviceGoalImpactOverrides, optimizationObjective, state, countsAsPaidTime, fixedAvailability);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateActivityPlanRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    managementUnitIds: ").append(toIndentedString(managementUnitIds)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    activityCodeId: ").append(toIndentedString(activityCodeId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    lengthMinutes: ").append(toIndentedString(lengthMinutes)).append("\n");
    sb.append("    initialSchedulePeriod: ").append(toIndentedString(initialSchedulePeriod)).append("\n");
    sb.append("    groupSettings: ").append(toIndentedString(groupSettings)).append("\n");
    sb.append("    recurrenceSettings: ").append(toIndentedString(recurrenceSettings)).append("\n");
    sb.append("    attendeesSearchRule: ").append(toIndentedString(attendeesSearchRule)).append("\n");
    sb.append("    facilitated: ").append(toIndentedString(facilitated)).append("\n");
    sb.append("    facilitatorsSearchRule: ").append(toIndentedString(facilitatorsSearchRule)).append("\n");
    sb.append("    transitionTimeMinutes: ").append(toIndentedString(transitionTimeMinutes)).append("\n");
    sb.append("    serviceGoalImpactOverrides: ").append(toIndentedString(serviceGoalImpactOverrides)).append("\n");
    sb.append("    optimizationObjective: ").append(toIndentedString(optimizationObjective)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    countsAsPaidTime: ").append(toIndentedString(countsAsPaidTime)).append("\n");
    sb.append("    fixedAvailability: ").append(toIndentedString(fixedAvailability)).append("\n");
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

