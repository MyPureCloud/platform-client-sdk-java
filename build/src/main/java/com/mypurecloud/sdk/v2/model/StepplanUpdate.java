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
import com.mypurecloud.sdk.v2.model.WorkitemSettings;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * StepplanUpdate
 */

public class StepplanUpdate  implements Serializable {
  
  private String name = null;
  private String description = null;
  private WorkitemSettings workitemSettings = null;

  private static class ActivityTypeEnumDeserializer extends StdDeserializer<ActivityTypeEnum> {
    public ActivityTypeEnumDeserializer() {
      super(ActivityTypeEnumDeserializer.class);
    }

    @Override
    public ActivityTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ActivityTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The activityType of the Stepplan.
   */
 @JsonDeserialize(using = ActivityTypeEnumDeserializer.class)
  public enum ActivityTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("Unknown"),
    NONE("None"),
    WORKITEM("Workitem");

    private String value;

    ActivityTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ActivityTypeEnum fromString(String key) {
      if (key == null) return null;

      for (ActivityTypeEnum value : ActivityTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ActivityTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ActivityTypeEnum activityType = null;

  public StepplanUpdate() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public StepplanUpdate(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The name of the Stepplan. Valid length between 3 and 256 characters.
   **/
  public StepplanUpdate name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of the Stepplan. Valid length between 3 and 256 characters.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The description of the Stepplan. Maximum length of 512 characters.
   **/
  public StepplanUpdate description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The description of the Stepplan. Maximum length of 512 characters.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * The workitemSettings of the Stepplan.
   **/
  public StepplanUpdate workitemSettings(WorkitemSettings workitemSettings) {
    this.workitemSettings = workitemSettings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The workitemSettings of the Stepplan.")
  @JsonProperty("workitemSettings")
  public WorkitemSettings getWorkitemSettings() {
    return workitemSettings;
  }
  public void setWorkitemSettings(WorkitemSettings workitemSettings) {
    this.workitemSettings = workitemSettings;
  }


  /**
   * The activityType of the Stepplan.
   **/
  public StepplanUpdate activityType(ActivityTypeEnum activityType) {
    this.activityType = activityType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The activityType of the Stepplan.")
  @JsonProperty("activityType")
  public ActivityTypeEnum getActivityType() {
    return activityType;
  }
  public void setActivityType(ActivityTypeEnum activityType) {
    this.activityType = activityType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StepplanUpdate stepplanUpdate = (StepplanUpdate) o;

    return Objects.equals(this.name, stepplanUpdate.name) &&
            Objects.equals(this.description, stepplanUpdate.description) &&
            Objects.equals(this.workitemSettings, stepplanUpdate.workitemSettings) &&
            Objects.equals(this.activityType, stepplanUpdate.activityType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, workitemSettings, activityType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StepplanUpdate {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    workitemSettings: ").append(toIndentedString(workitemSettings)).append("\n");
    sb.append("    activityType: ").append(toIndentedString(activityType)).append("\n");
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

