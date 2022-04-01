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
import com.mypurecloud.sdk.v2.model.BuHeadcountForecast;
import com.mypurecloud.sdk.v2.model.BuShortTermForecastReference;
import com.mypurecloud.sdk.v2.model.BuUpdateAgentScheduleUploadSchema;
import com.mypurecloud.sdk.v2.model.WfmVersionedEntityMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * UpdateScheduleUploadSchema
 */

public class UpdateScheduleUploadSchema  implements Serializable {
  
  private String description = null;
  private Boolean published = null;
  private BuShortTermForecastReference shortTermForecast = null;
  private BuHeadcountForecast headcountForecast = null;
  private List<BuUpdateAgentScheduleUploadSchema> agentSchedules = new ArrayList<BuUpdateAgentScheduleUploadSchema>();
  private WfmVersionedEntityMetadata metadata = null;

  
  /**
   * The description to set for the schedule
   **/
  public UpdateScheduleUploadSchema description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The description to set for the schedule")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * Whether to publish the schedule. Note: a schedule cannot be un-published unless another schedule is published over it
   **/
  public UpdateScheduleUploadSchema published(Boolean published) {
    this.published = published;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether to publish the schedule. Note: a schedule cannot be un-published unless another schedule is published over it")
  @JsonProperty("published")
  public Boolean getPublished() {
    return published;
  }
  public void setPublished(Boolean published) {
    this.published = published;
  }

  
  /**
   * The short term forecast to associate with the schedule
   **/
  public UpdateScheduleUploadSchema shortTermForecast(BuShortTermForecastReference shortTermForecast) {
    this.shortTermForecast = shortTermForecast;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The short term forecast to associate with the schedule")
  @JsonProperty("shortTermForecast")
  public BuShortTermForecastReference getShortTermForecast() {
    return shortTermForecast;
  }
  public void setShortTermForecast(BuShortTermForecastReference shortTermForecast) {
    this.shortTermForecast = shortTermForecast;
  }

  
  /**
   * The headcount forecast to associate with the schedule
   **/
  public UpdateScheduleUploadSchema headcountForecast(BuHeadcountForecast headcountForecast) {
    this.headcountForecast = headcountForecast;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The headcount forecast to associate with the schedule")
  @JsonProperty("headcountForecast")
  public BuHeadcountForecast getHeadcountForecast() {
    return headcountForecast;
  }
  public void setHeadcountForecast(BuHeadcountForecast headcountForecast) {
    this.headcountForecast = headcountForecast;
  }

  
  /**
   * Individual agent schedules
   **/
  public UpdateScheduleUploadSchema agentSchedules(List<BuUpdateAgentScheduleUploadSchema> agentSchedules) {
    this.agentSchedules = agentSchedules;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Individual agent schedules")
  @JsonProperty("agentSchedules")
  public List<BuUpdateAgentScheduleUploadSchema> getAgentSchedules() {
    return agentSchedules;
  }
  public void setAgentSchedules(List<BuUpdateAgentScheduleUploadSchema> agentSchedules) {
    this.agentSchedules = agentSchedules;
  }

  
  /**
   * Version metadata for this schedule
   **/
  public UpdateScheduleUploadSchema metadata(WfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Version metadata for this schedule")
  @JsonProperty("metadata")
  public WfmVersionedEntityMetadata getMetadata() {
    return metadata;
  }
  public void setMetadata(WfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateScheduleUploadSchema updateScheduleUploadSchema = (UpdateScheduleUploadSchema) o;
    return Objects.equals(this.description, updateScheduleUploadSchema.description) &&
        Objects.equals(this.published, updateScheduleUploadSchema.published) &&
        Objects.equals(this.shortTermForecast, updateScheduleUploadSchema.shortTermForecast) &&
        Objects.equals(this.headcountForecast, updateScheduleUploadSchema.headcountForecast) &&
        Objects.equals(this.agentSchedules, updateScheduleUploadSchema.agentSchedules) &&
        Objects.equals(this.metadata, updateScheduleUploadSchema.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, published, shortTermForecast, headcountForecast, agentSchedules, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateScheduleUploadSchema {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    published: ").append(toIndentedString(published)).append("\n");
    sb.append("    shortTermForecast: ").append(toIndentedString(shortTermForecast)).append("\n");
    sb.append("    headcountForecast: ").append(toIndentedString(headcountForecast)).append("\n");
    sb.append("    agentSchedules: ").append(toIndentedString(agentSchedules)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

