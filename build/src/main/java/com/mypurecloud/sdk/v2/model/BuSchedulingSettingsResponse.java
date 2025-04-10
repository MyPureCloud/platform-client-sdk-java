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
import com.mypurecloud.sdk.v2.model.SchedulerMessageTypeSeverity;
import com.mypurecloud.sdk.v2.model.WfmServiceGoalImpactSettings;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * BuSchedulingSettingsResponse
 */

public class BuSchedulingSettingsResponse  implements Serializable {
  
  private List<SchedulerMessageTypeSeverity> messageSeverities = null;

  private static class SyncTimeOffPropertiesEnumDeserializer extends StdDeserializer<SyncTimeOffPropertiesEnum> {
    public SyncTimeOffPropertiesEnumDeserializer() {
      super(SyncTimeOffPropertiesEnumDeserializer.class);
    }

    @Override
    public SyncTimeOffPropertiesEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return SyncTimeOffPropertiesEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets syncTimeOffProperties
   */
 @JsonDeserialize(using = SyncTimeOffPropertiesEnumDeserializer.class)
  public enum SyncTimeOffPropertiesEnum {
    PAYABLEMINUTES("PayableMinutes");

    private String value;

    SyncTimeOffPropertiesEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static SyncTimeOffPropertiesEnum fromString(String key) {
      if (key == null) return null;

      for (SyncTimeOffPropertiesEnum value : SyncTimeOffPropertiesEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return SyncTimeOffPropertiesEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<SyncTimeOffPropertiesEnum> syncTimeOffProperties = null;
  private WfmServiceGoalImpactSettings serviceGoalImpact = null;
  private Boolean allowWorkPlanPerMinuteGranularity = null;

  private static class ActivitySmoothingTypeEnumDeserializer extends StdDeserializer<ActivitySmoothingTypeEnum> {
    public ActivitySmoothingTypeEnumDeserializer() {
      super(ActivitySmoothingTypeEnumDeserializer.class);
    }

    @Override
    public ActivitySmoothingTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ActivitySmoothingTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The activity smoothing type for schedule generation in this business unit
   */
 @JsonDeserialize(using = ActivitySmoothingTypeEnumDeserializer.class)
  public enum ActivitySmoothingTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    REDUCECONCURRENTACTIVITIESACROSSBU("ReduceConcurrentActivitiesAcrossBu"),
    REDUCECONCURRENTACTIVITIESACROSSMU("ReduceConcurrentActivitiesAcrossMu"),
    CONSISTENTSERVICELEVEL("ConsistentServiceLevel");

    private String value;

    ActivitySmoothingTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ActivitySmoothingTypeEnum fromString(String key) {
      if (key == null) return null;

      for (ActivitySmoothingTypeEnum value : ActivitySmoothingTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ActivitySmoothingTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ActivitySmoothingTypeEnum activitySmoothingType = null;
  private Boolean induceScheduleVariability = null;

  public BuSchedulingSettingsResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      messageSeverities = new ArrayList<SchedulerMessageTypeSeverity>();
      syncTimeOffProperties = new ArrayList<SyncTimeOffPropertiesEnum>();
    }
  }

  
  /**
   * Schedule generation message severity configuration
   **/
  public BuSchedulingSettingsResponse messageSeverities(List<SchedulerMessageTypeSeverity> messageSeverities) {
    this.messageSeverities = messageSeverities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Schedule generation message severity configuration")
  @JsonProperty("messageSeverities")
  public List<SchedulerMessageTypeSeverity> getMessageSeverities() {
    return messageSeverities;
  }
  public void setMessageSeverities(List<SchedulerMessageTypeSeverity> messageSeverities) {
    this.messageSeverities = messageSeverities;
  }


  /**
   * Synchronize set of time off properties from scheduled activities to time off requests when the schedule is published.
   **/
  public BuSchedulingSettingsResponse syncTimeOffProperties(List<SyncTimeOffPropertiesEnum> syncTimeOffProperties) {
    this.syncTimeOffProperties = syncTimeOffProperties;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Synchronize set of time off properties from scheduled activities to time off requests when the schedule is published.")
  @JsonProperty("syncTimeOffProperties")
  public List<SyncTimeOffPropertiesEnum> getSyncTimeOffProperties() {
    return syncTimeOffProperties;
  }
  public void setSyncTimeOffProperties(List<SyncTimeOffPropertiesEnum> syncTimeOffProperties) {
    this.syncTimeOffProperties = syncTimeOffProperties;
  }


  /**
   * Configures the max percent increase and decrease of service goals for this business unit
   **/
  public BuSchedulingSettingsResponse serviceGoalImpact(WfmServiceGoalImpactSettings serviceGoalImpact) {
    this.serviceGoalImpact = serviceGoalImpact;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Configures the max percent increase and decrease of service goals for this business unit")
  @JsonProperty("serviceGoalImpact")
  public WfmServiceGoalImpactSettings getServiceGoalImpact() {
    return serviceGoalImpact;
  }
  public void setServiceGoalImpact(WfmServiceGoalImpactSettings serviceGoalImpact) {
    this.serviceGoalImpact = serviceGoalImpact;
  }


  /**
   * Indicates whether or not per minute granularity for scheduling will be enabled for this business unit. Defaults to false.
   **/
  public BuSchedulingSettingsResponse allowWorkPlanPerMinuteGranularity(Boolean allowWorkPlanPerMinuteGranularity) {
    this.allowWorkPlanPerMinuteGranularity = allowWorkPlanPerMinuteGranularity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates whether or not per minute granularity for scheduling will be enabled for this business unit. Defaults to false.")
  @JsonProperty("allowWorkPlanPerMinuteGranularity")
  public Boolean getAllowWorkPlanPerMinuteGranularity() {
    return allowWorkPlanPerMinuteGranularity;
  }
  public void setAllowWorkPlanPerMinuteGranularity(Boolean allowWorkPlanPerMinuteGranularity) {
    this.allowWorkPlanPerMinuteGranularity = allowWorkPlanPerMinuteGranularity;
  }


  /**
   * The activity smoothing type for schedule generation in this business unit
   **/
  public BuSchedulingSettingsResponse activitySmoothingType(ActivitySmoothingTypeEnum activitySmoothingType) {
    this.activitySmoothingType = activitySmoothingType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The activity smoothing type for schedule generation in this business unit")
  @JsonProperty("activitySmoothingType")
  public ActivitySmoothingTypeEnum getActivitySmoothingType() {
    return activitySmoothingType;
  }
  public void setActivitySmoothingType(ActivitySmoothingTypeEnum activitySmoothingType) {
    this.activitySmoothingType = activitySmoothingType;
  }


  /**
   * Indicates whether to provide variability in schedule generation
   **/
  public BuSchedulingSettingsResponse induceScheduleVariability(Boolean induceScheduleVariability) {
    this.induceScheduleVariability = induceScheduleVariability;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Indicates whether to provide variability in schedule generation")
  @JsonProperty("induceScheduleVariability")
  public Boolean getInduceScheduleVariability() {
    return induceScheduleVariability;
  }
  public void setInduceScheduleVariability(Boolean induceScheduleVariability) {
    this.induceScheduleVariability = induceScheduleVariability;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuSchedulingSettingsResponse buSchedulingSettingsResponse = (BuSchedulingSettingsResponse) o;

    return Objects.equals(this.messageSeverities, buSchedulingSettingsResponse.messageSeverities) &&
            Objects.equals(this.syncTimeOffProperties, buSchedulingSettingsResponse.syncTimeOffProperties) &&
            Objects.equals(this.serviceGoalImpact, buSchedulingSettingsResponse.serviceGoalImpact) &&
            Objects.equals(this.allowWorkPlanPerMinuteGranularity, buSchedulingSettingsResponse.allowWorkPlanPerMinuteGranularity) &&
            Objects.equals(this.activitySmoothingType, buSchedulingSettingsResponse.activitySmoothingType) &&
            Objects.equals(this.induceScheduleVariability, buSchedulingSettingsResponse.induceScheduleVariability);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageSeverities, syncTimeOffProperties, serviceGoalImpact, allowWorkPlanPerMinuteGranularity, activitySmoothingType, induceScheduleVariability);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuSchedulingSettingsResponse {\n");
    
    sb.append("    messageSeverities: ").append(toIndentedString(messageSeverities)).append("\n");
    sb.append("    syncTimeOffProperties: ").append(toIndentedString(syncTimeOffProperties)).append("\n");
    sb.append("    serviceGoalImpact: ").append(toIndentedString(serviceGoalImpact)).append("\n");
    sb.append("    allowWorkPlanPerMinuteGranularity: ").append(toIndentedString(allowWorkPlanPerMinuteGranularity)).append("\n");
    sb.append("    activitySmoothingType: ").append(toIndentedString(activitySmoothingType)).append("\n");
    sb.append("    induceScheduleVariability: ").append(toIndentedString(induceScheduleVariability)).append("\n");
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

