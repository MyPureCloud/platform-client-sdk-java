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
import com.mypurecloud.sdk.v2.model.ManagementUnitReference;
import com.mypurecloud.sdk.v2.model.RecurrenceSettings;
import com.mypurecloud.sdk.v2.model.UserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * ActivityPlanListItem
 */

public class ActivityPlanListItem  implements Serializable {
  
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
  private RecurrenceSettings recurrenceSettings = null;

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
  private Date lastRunDate = null;
  private UserReference lastRunBy = null;
  private Date createdDate = null;
  private UserReference createdBy = null;
  private Date modifiedDate = null;
  private UserReference modifiedBy = null;
  private String selfUri = null;

  public ActivityPlanListItem() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      managementUnits = new ArrayList<ManagementUnitReference>();
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
  public ActivityPlanListItem name(String name) {
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
   * The management units to which this activity plan applies. Empty list or null means this activity plan applies to all management units in the business unit
   **/
  public ActivityPlanListItem managementUnits(List<ManagementUnitReference> managementUnits) {
    this.managementUnits = managementUnits;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The management units to which this activity plan applies. Empty list or null means this activity plan applies to all management units in the business unit")
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
  public ActivityPlanListItem description(String description) {
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
   * The activity code to which this activity plan applies. Note: It is recommended to load and cache the entire list of activity codes rather than look up individual codes
   **/
  public ActivityPlanListItem activityCode(ActivityCodeReference activityCode) {
    this.activityCode = activityCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The activity code to which this activity plan applies. Note: It is recommended to load and cache the entire list of activity codes rather than look up individual codes")
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
  public ActivityPlanListItem type(TypeEnum type) {
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
   * The optimization objective of this activity plan
   **/
  public ActivityPlanListItem optimizationObjective(OptimizationObjectiveEnum optimizationObjective) {
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
   * Recurrence settings for this activity plan
   **/
  public ActivityPlanListItem recurrenceSettings(RecurrenceSettings recurrenceSettings) {
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
   * The state of this activity plan
   **/
  public ActivityPlanListItem state(StateEnum state) {
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
   * The date on which the activity plan was last manually run, in ISO-8601 format
   **/
  public ActivityPlanListItem lastRunDate(Date lastRunDate) {
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
  public ActivityPlanListItem lastRunBy(UserReference lastRunBy) {
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


  /**
   * The date the activity plan was created, in ISO-8601 format
   **/
  public ActivityPlanListItem createdDate(Date createdDate) {
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
  public ActivityPlanListItem createdBy(UserReference createdBy) {
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
  public ActivityPlanListItem modifiedDate(Date modifiedDate) {
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
  public ActivityPlanListItem modifiedBy(UserReference modifiedBy) {
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
    ActivityPlanListItem activityPlanListItem = (ActivityPlanListItem) o;

    return Objects.equals(this.id, activityPlanListItem.id) &&
            Objects.equals(this.name, activityPlanListItem.name) &&
            Objects.equals(this.managementUnits, activityPlanListItem.managementUnits) &&
            Objects.equals(this.description, activityPlanListItem.description) &&
            Objects.equals(this.activityCode, activityPlanListItem.activityCode) &&
            Objects.equals(this.type, activityPlanListItem.type) &&
            Objects.equals(this.optimizationObjective, activityPlanListItem.optimizationObjective) &&
            Objects.equals(this.recurrenceSettings, activityPlanListItem.recurrenceSettings) &&
            Objects.equals(this.state, activityPlanListItem.state) &&
            Objects.equals(this.lastRunDate, activityPlanListItem.lastRunDate) &&
            Objects.equals(this.lastRunBy, activityPlanListItem.lastRunBy) &&
            Objects.equals(this.createdDate, activityPlanListItem.createdDate) &&
            Objects.equals(this.createdBy, activityPlanListItem.createdBy) &&
            Objects.equals(this.modifiedDate, activityPlanListItem.modifiedDate) &&
            Objects.equals(this.modifiedBy, activityPlanListItem.modifiedBy) &&
            Objects.equals(this.selfUri, activityPlanListItem.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, managementUnits, description, activityCode, type, optimizationObjective, recurrenceSettings, state, lastRunDate, lastRunBy, createdDate, createdBy, modifiedDate, modifiedBy, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivityPlanListItem {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    managementUnits: ").append(toIndentedString(managementUnits)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    activityCode: ").append(toIndentedString(activityCode)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    optimizationObjective: ").append(toIndentedString(optimizationObjective)).append("\n");
    sb.append("    recurrenceSettings: ").append(toIndentedString(recurrenceSettings)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    lastRunDate: ").append(toIndentedString(lastRunDate)).append("\n");
    sb.append("    lastRunBy: ").append(toIndentedString(lastRunBy)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
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

