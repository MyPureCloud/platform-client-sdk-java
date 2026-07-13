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
import com.mypurecloud.sdk.v2.model.ListWrapperFixedAvailability;
import com.mypurecloud.sdk.v2.model.RecurrenceSettingsBase;
import com.mypurecloud.sdk.v2.model.ValueWrapperActivityPlanServiceGoalImpactOverrides;
import com.mypurecloud.sdk.v2.model.ValueWrapperGroupSettings;
import com.mypurecloud.sdk.v2.model.ValueWrapperUserSearchRule;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * UpdateActivityPlanRequest
 */

public class UpdateActivityPlanRequest  implements Serializable {
  
  private String name = null;
  private String description = null;
  private ValueWrapperGroupSettings groupSettings = null;
  private ValueWrapperUserSearchRule attendeesSearchRule = null;
  private ValueWrapperUserSearchRule facilitatorsSearchRule = null;
  private Integer transitionTimeMinutes = null;
  private ValueWrapperActivityPlanServiceGoalImpactOverrides serviceGoalImpactOverrides = null;

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
  private ListWrapperFixedAvailability fixedAvailability = null;
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
  private Boolean countsAsPaidTime = null;
  private RecurrenceSettingsBase recurrenceSettings = null;

  public UpdateActivityPlanRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public UpdateActivityPlanRequest(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The name of the activity plan
   **/
  public UpdateActivityPlanRequest name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of the activity plan")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The description of the activity plan
   **/
  public UpdateActivityPlanRequest description(String description) {
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
   * Group settings for the activity plan
   **/
  public UpdateActivityPlanRequest groupSettings(ValueWrapperGroupSettings groupSettings) {
    this.groupSettings = groupSettings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Group settings for the activity plan")
  @JsonProperty("groupSettings")
  public ValueWrapperGroupSettings getGroupSettings() {
    return groupSettings;
  }
  public void setGroupSettings(ValueWrapperGroupSettings groupSettings) {
    this.groupSettings = groupSettings;
  }


  /**
   * Attendee search rule for this activity plan
   **/
  public UpdateActivityPlanRequest attendeesSearchRule(ValueWrapperUserSearchRule attendeesSearchRule) {
    this.attendeesSearchRule = attendeesSearchRule;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Attendee search rule for this activity plan")
  @JsonProperty("attendeesSearchRule")
  public ValueWrapperUserSearchRule getAttendeesSearchRule() {
    return attendeesSearchRule;
  }
  public void setAttendeesSearchRule(ValueWrapperUserSearchRule attendeesSearchRule) {
    this.attendeesSearchRule = attendeesSearchRule;
  }


  /**
   * Facilitator search rule for this activity plan
   **/
  public UpdateActivityPlanRequest facilitatorsSearchRule(ValueWrapperUserSearchRule facilitatorsSearchRule) {
    this.facilitatorsSearchRule = facilitatorsSearchRule;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Facilitator search rule for this activity plan")
  @JsonProperty("facilitatorsSearchRule")
  public ValueWrapperUserSearchRule getFacilitatorsSearchRule() {
    return facilitatorsSearchRule;
  }
  public void setFacilitatorsSearchRule(ValueWrapperUserSearchRule facilitatorsSearchRule) {
    this.facilitatorsSearchRule = facilitatorsSearchRule;
  }


  /**
   * Transition time in minutes between facilitated sessions
   **/
  public UpdateActivityPlanRequest transitionTimeMinutes(Integer transitionTimeMinutes) {
    this.transitionTimeMinutes = transitionTimeMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Transition time in minutes between facilitated sessions")
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
  public UpdateActivityPlanRequest serviceGoalImpactOverrides(ValueWrapperActivityPlanServiceGoalImpactOverrides serviceGoalImpactOverrides) {
    this.serviceGoalImpactOverrides = serviceGoalImpactOverrides;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Allowable service goal impact override settings for this activity plan")
  @JsonProperty("serviceGoalImpactOverrides")
  public ValueWrapperActivityPlanServiceGoalImpactOverrides getServiceGoalImpactOverrides() {
    return serviceGoalImpactOverrides;
  }
  public void setServiceGoalImpactOverrides(ValueWrapperActivityPlanServiceGoalImpactOverrides serviceGoalImpactOverrides) {
    this.serviceGoalImpactOverrides = serviceGoalImpactOverrides;
  }


  /**
   * The optimization objective of this activity plan
   **/
  public UpdateActivityPlanRequest optimizationObjective(OptimizationObjectiveEnum optimizationObjective) {
    this.optimizationObjective = optimizationObjective;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The optimization objective of this activity plan")
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
  public UpdateActivityPlanRequest state(StateEnum state) {
    this.state = state;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The state of this activity plan")
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }


  /**
   * Fixed availability configuration for the activity plan
   **/
  public UpdateActivityPlanRequest fixedAvailability(ListWrapperFixedAvailability fixedAvailability) {
    this.fixedAvailability = fixedAvailability;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Fixed availability configuration for the activity plan")
  @JsonProperty("fixedAvailability")
  public ListWrapperFixedAvailability getFixedAvailability() {
    return fixedAvailability;
  }
  public void setFixedAvailability(ListWrapperFixedAvailability fixedAvailability) {
    this.fixedAvailability = fixedAvailability;
  }


  /**
   * The activity code associated with the activity plan
   **/
  public UpdateActivityPlanRequest activityCodeId(String activityCodeId) {
    this.activityCodeId = activityCodeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The activity code associated with the activity plan")
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
  public UpdateActivityPlanRequest type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type of the activity plan")
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
  public UpdateActivityPlanRequest lengthMinutes(Integer lengthMinutes) {
    this.lengthMinutes = lengthMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The length in minutes of the activity plan")
  @JsonProperty("lengthMinutes")
  public Integer getLengthMinutes() {
    return lengthMinutes;
  }
  public void setLengthMinutes(Integer lengthMinutes) {
    this.lengthMinutes = lengthMinutes;
  }


  /**
   * Whether the activity should count as paid time
   **/
  public UpdateActivityPlanRequest countsAsPaidTime(Boolean countsAsPaidTime) {
    this.countsAsPaidTime = countsAsPaidTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether the activity should count as paid time")
  @JsonProperty("countsAsPaidTime")
  public Boolean getCountsAsPaidTime() {
    return countsAsPaidTime;
  }
  public void setCountsAsPaidTime(Boolean countsAsPaidTime) {
    this.countsAsPaidTime = countsAsPaidTime;
  }


  /**
   * Settings controlling recurrence for the activity plan. If not set the activity plan will only occur once
   **/
  public UpdateActivityPlanRequest recurrenceSettings(RecurrenceSettingsBase recurrenceSettings) {
    this.recurrenceSettings = recurrenceSettings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Settings controlling recurrence for the activity plan. If not set the activity plan will only occur once")
  @JsonProperty("recurrenceSettings")
  public RecurrenceSettingsBase getRecurrenceSettings() {
    return recurrenceSettings;
  }
  public void setRecurrenceSettings(RecurrenceSettingsBase recurrenceSettings) {
    this.recurrenceSettings = recurrenceSettings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateActivityPlanRequest updateActivityPlanRequest = (UpdateActivityPlanRequest) o;

    return Objects.equals(this.name, updateActivityPlanRequest.name) &&
            Objects.equals(this.description, updateActivityPlanRequest.description) &&
            Objects.equals(this.groupSettings, updateActivityPlanRequest.groupSettings) &&
            Objects.equals(this.attendeesSearchRule, updateActivityPlanRequest.attendeesSearchRule) &&
            Objects.equals(this.facilitatorsSearchRule, updateActivityPlanRequest.facilitatorsSearchRule) &&
            Objects.equals(this.transitionTimeMinutes, updateActivityPlanRequest.transitionTimeMinutes) &&
            Objects.equals(this.serviceGoalImpactOverrides, updateActivityPlanRequest.serviceGoalImpactOverrides) &&
            Objects.equals(this.optimizationObjective, updateActivityPlanRequest.optimizationObjective) &&
            Objects.equals(this.state, updateActivityPlanRequest.state) &&
            Objects.equals(this.fixedAvailability, updateActivityPlanRequest.fixedAvailability) &&
            Objects.equals(this.activityCodeId, updateActivityPlanRequest.activityCodeId) &&
            Objects.equals(this.type, updateActivityPlanRequest.type) &&
            Objects.equals(this.lengthMinutes, updateActivityPlanRequest.lengthMinutes) &&
            Objects.equals(this.countsAsPaidTime, updateActivityPlanRequest.countsAsPaidTime) &&
            Objects.equals(this.recurrenceSettings, updateActivityPlanRequest.recurrenceSettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, groupSettings, attendeesSearchRule, facilitatorsSearchRule, transitionTimeMinutes, serviceGoalImpactOverrides, optimizationObjective, state, fixedAvailability, activityCodeId, type, lengthMinutes, countsAsPaidTime, recurrenceSettings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateActivityPlanRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    groupSettings: ").append(toIndentedString(groupSettings)).append("\n");
    sb.append("    attendeesSearchRule: ").append(toIndentedString(attendeesSearchRule)).append("\n");
    sb.append("    facilitatorsSearchRule: ").append(toIndentedString(facilitatorsSearchRule)).append("\n");
    sb.append("    transitionTimeMinutes: ").append(toIndentedString(transitionTimeMinutes)).append("\n");
    sb.append("    serviceGoalImpactOverrides: ").append(toIndentedString(serviceGoalImpactOverrides)).append("\n");
    sb.append("    optimizationObjective: ").append(toIndentedString(optimizationObjective)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    fixedAvailability: ").append(toIndentedString(fixedAvailability)).append("\n");
    sb.append("    activityCodeId: ").append(toIndentedString(activityCodeId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    lengthMinutes: ").append(toIndentedString(lengthMinutes)).append("\n");
    sb.append("    countsAsPaidTime: ").append(toIndentedString(countsAsPaidTime)).append("\n");
    sb.append("    recurrenceSettings: ").append(toIndentedString(recurrenceSettings)).append("\n");
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

