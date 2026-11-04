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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

import java.io.Serializable;
/**
 * SelfScheduleAgentManagementUnitSettings
 */

public class SelfScheduleAgentManagementUnitSettings  implements Serializable {
  
  private Boolean enabled = null;
  private Integer minimumMinutesBeforeEarliestScheduleChange = null;

  private static class MovableActivityCategoriesEnumDeserializer extends StdDeserializer<MovableActivityCategoriesEnum> {
    public MovableActivityCategoriesEnumDeserializer() {
      super(MovableActivityCategoriesEnumDeserializer.class);
    }

    @Override
    public MovableActivityCategoriesEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return MovableActivityCategoriesEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets movableActivityCategories
   */
 @JsonDeserialize(using = MovableActivityCategoriesEnumDeserializer.class)
  public enum MovableActivityCategoriesEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ONQUEUEWORK("OnQueueWork"),
    BREAK("Break"),
    MEAL("Meal"),
    MEETING("Meeting"),
    OFFQUEUEWORK("OffQueueWork"),
    TIMEOFF("TimeOff"),
    TRAINING("Training"),
    UNAVAILABLE("Unavailable");

    private String value;

    MovableActivityCategoriesEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static MovableActivityCategoriesEnum fromString(String key) {
      if (key == null) return null;

      for (MovableActivityCategoriesEnum value : MovableActivityCategoriesEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return MovableActivityCategoriesEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<MovableActivityCategoriesEnum> movableActivityCategories = null;
  private List<String> movableActivityCodeIds = null;

  public SelfScheduleAgentManagementUnitSettings() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      movableActivityCategories = new ArrayList<MovableActivityCategoriesEnum>();
      movableActivityCodeIds = new ArrayList<String>();
    }
  }

  public SelfScheduleAgentManagementUnitSettings(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      movableActivityCategories = new ArrayList<MovableActivityCategoriesEnum>();
      movableActivityCodeIds = new ArrayList<String>();
    }
  }

  
  /**
   * Whether agent self-scheduling is enabled for this management unit
   **/
  public SelfScheduleAgentManagementUnitSettings enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Whether agent self-scheduling is enabled for this management unit")
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  /**
   * The minimum number of minutes before the new activity start time to which the agent is allowed to self-schedule
   **/
  public SelfScheduleAgentManagementUnitSettings minimumMinutesBeforeEarliestScheduleChange(Integer minimumMinutesBeforeEarliestScheduleChange) {
    this.minimumMinutesBeforeEarliestScheduleChange = minimumMinutesBeforeEarliestScheduleChange;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The minimum number of minutes before the new activity start time to which the agent is allowed to self-schedule")
  @JsonProperty("minimumMinutesBeforeEarliestScheduleChange")
  public Integer getMinimumMinutesBeforeEarliestScheduleChange() {
    return minimumMinutesBeforeEarliestScheduleChange;
  }
  public void setMinimumMinutesBeforeEarliestScheduleChange(Integer minimumMinutesBeforeEarliestScheduleChange) {
    this.minimumMinutesBeforeEarliestScheduleChange = minimumMinutesBeforeEarliestScheduleChange;
  }


  /**
   * Movable activity categories enabled for self-schedule
   **/
  public SelfScheduleAgentManagementUnitSettings movableActivityCategories(List<MovableActivityCategoriesEnum> movableActivityCategories) {
    this.movableActivityCategories = movableActivityCategories;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Movable activity categories enabled for self-schedule")
  @JsonProperty("movableActivityCategories")
  public List<MovableActivityCategoriesEnum> getMovableActivityCategories() {
    return movableActivityCategories;
  }
  public void setMovableActivityCategories(List<MovableActivityCategoriesEnum> movableActivityCategories) {
    this.movableActivityCategories = movableActivityCategories;
  }


  /**
   * Movable activity codes enabled for self-schedule
   **/
  public SelfScheduleAgentManagementUnitSettings movableActivityCodeIds(List<String> movableActivityCodeIds) {
    this.movableActivityCodeIds = movableActivityCodeIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Movable activity codes enabled for self-schedule")
  @JsonProperty("movableActivityCodeIds")
  public List<String> getMovableActivityCodeIds() {
    return movableActivityCodeIds;
  }
  public void setMovableActivityCodeIds(List<String> movableActivityCodeIds) {
    this.movableActivityCodeIds = movableActivityCodeIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SelfScheduleAgentManagementUnitSettings selfScheduleAgentManagementUnitSettings = (SelfScheduleAgentManagementUnitSettings) o;

    return Objects.equals(this.enabled, selfScheduleAgentManagementUnitSettings.enabled) &&
            Objects.equals(this.minimumMinutesBeforeEarliestScheduleChange, selfScheduleAgentManagementUnitSettings.minimumMinutesBeforeEarliestScheduleChange) &&
            Objects.equals(this.movableActivityCategories, selfScheduleAgentManagementUnitSettings.movableActivityCategories) &&
            Objects.equals(this.movableActivityCodeIds, selfScheduleAgentManagementUnitSettings.movableActivityCodeIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, minimumMinutesBeforeEarliestScheduleChange, movableActivityCategories, movableActivityCodeIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SelfScheduleAgentManagementUnitSettings {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    minimumMinutesBeforeEarliestScheduleChange: ").append(toIndentedString(minimumMinutesBeforeEarliestScheduleChange)).append("\n");
    sb.append("    movableActivityCategories: ").append(toIndentedString(movableActivityCategories)).append("\n");
    sb.append("    movableActivityCodeIds: ").append(toIndentedString(movableActivityCodeIds)).append("\n");
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

