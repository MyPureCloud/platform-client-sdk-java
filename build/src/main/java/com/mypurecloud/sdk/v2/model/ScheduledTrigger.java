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
 * Defines a process automation scheduled trigger.
 */
@ApiModel(description = "Defines a process automation scheduled trigger.")

public class ScheduledTrigger  implements Serializable {
  
  private String id = null;
  private String name = null;
  private TriggerTarget target = null;
  private Long version = null;
  private Boolean enabled = null;
  private TriggerSchedule schedule = null;
  private String description = null;
  private String selfUri = null;

  public ScheduledTrigger() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * The name of the scheduled trigger. Can be up to 162 characters in length.
   **/
  public ScheduledTrigger name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of the scheduled trigger. Can be up to 162 characters in length.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The target to invoke when the scheduled trigger fires
   **/
  public ScheduledTrigger target(TriggerTarget target) {
    this.target = target;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The target to invoke when the scheduled trigger fires")
  @JsonProperty("target")
  public TriggerTarget getTarget() {
    return target;
  }
  public void setTarget(TriggerTarget target) {
    this.target = target;
  }


  /**
   * Version of this scheduled trigger
   **/
  public ScheduledTrigger version(Long version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Version of this scheduled trigger")
  @JsonProperty("version")
  public Long getVersion() {
    return version;
  }
  public void setVersion(Long version) {
    this.version = version;
  }


  /**
   * Whether or not the scheduled trigger is enabled
   **/
  public ScheduledTrigger enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether or not the scheduled trigger is enabled")
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  /**
   * The schedule configuration for when this trigger should fire
   **/
  public ScheduledTrigger schedule(TriggerSchedule schedule) {
    this.schedule = schedule;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The schedule configuration for when this trigger should fire")
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
  public ScheduledTrigger description(String description) {
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
    ScheduledTrigger scheduledTrigger = (ScheduledTrigger) o;

    return Objects.equals(this.id, scheduledTrigger.id) &&
            Objects.equals(this.name, scheduledTrigger.name) &&
            Objects.equals(this.target, scheduledTrigger.target) &&
            Objects.equals(this.version, scheduledTrigger.version) &&
            Objects.equals(this.enabled, scheduledTrigger.enabled) &&
            Objects.equals(this.schedule, scheduledTrigger.schedule) &&
            Objects.equals(this.description, scheduledTrigger.description) &&
            Objects.equals(this.selfUri, scheduledTrigger.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, target, version, enabled, schedule, description, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduledTrigger {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

