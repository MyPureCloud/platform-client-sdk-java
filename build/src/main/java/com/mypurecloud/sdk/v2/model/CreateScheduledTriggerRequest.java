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
import com.mypurecloud.sdk.v2.model.TriggerSchedule;
import com.mypurecloud.sdk.v2.model.TriggerTarget;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * CreateScheduledTriggerRequest
 */

public class CreateScheduledTriggerRequest  implements Serializable {
  
  private TriggerTarget target = null;
  private Boolean enabled = null;
  private String name = null;
  private TriggerSchedule schedule = null;
  private String description = null;

  public CreateScheduledTriggerRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The target to invoke when the scheduled trigger fires
   **/
  public CreateScheduledTriggerRequest target(TriggerTarget target) {
    this.target = target;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The target to invoke when the scheduled trigger fires")
  @JsonProperty("target")
  public TriggerTarget getTarget() {
    return target;
  }
  public void setTarget(TriggerTarget target) {
    this.target = target;
  }


  /**
   * Boolean indicating if scheduled trigger is enabled
   **/
  public CreateScheduledTriggerRequest enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Boolean indicating if scheduled trigger is enabled")
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  /**
   * The name of the scheduled trigger. Can be up to 162 characters in length.
   **/
  public CreateScheduledTriggerRequest name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the scheduled trigger. Can be up to 162 characters in length.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The schedule configuration for when this trigger should fire
   **/
  public CreateScheduledTriggerRequest schedule(TriggerSchedule schedule) {
    this.schedule = schedule;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The schedule configuration for when this trigger should fire")
  @JsonProperty("schedule")
  public TriggerSchedule getSchedule() {
    return schedule;
  }
  public void setSchedule(TriggerSchedule schedule) {
    this.schedule = schedule;
  }


  /**
   * Description of the trigger. Can be up to 512 characters in length.
   **/
  public CreateScheduledTriggerRequest description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Description of the trigger. Can be up to 512 characters in length.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateScheduledTriggerRequest createScheduledTriggerRequest = (CreateScheduledTriggerRequest) o;

    return Objects.equals(this.target, createScheduledTriggerRequest.target) &&
            Objects.equals(this.enabled, createScheduledTriggerRequest.enabled) &&
            Objects.equals(this.name, createScheduledTriggerRequest.name) &&
            Objects.equals(this.schedule, createScheduledTriggerRequest.schedule) &&
            Objects.equals(this.description, createScheduledTriggerRequest.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(target, enabled, name, schedule, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateScheduledTriggerRequest {\n");
    
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

