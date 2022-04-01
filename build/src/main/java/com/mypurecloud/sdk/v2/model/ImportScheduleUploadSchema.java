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
import com.mypurecloud.sdk.v2.model.BuImportAgentScheduleUploadSchema;
import com.mypurecloud.sdk.v2.model.BuShortTermForecastReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ImportScheduleUploadSchema
 */

public class ImportScheduleUploadSchema  implements Serializable {
  
  private String description = null;
  private Integer weekCount = null;
  private Boolean published = null;
  private BuShortTermForecastReference shortTermForecast = null;
  private BuHeadcountForecast headcountForecast = null;
  private List<BuImportAgentScheduleUploadSchema> agentSchedules = new ArrayList<BuImportAgentScheduleUploadSchema>();

  
  /**
   * The description for the imported schedule
   **/
  public ImportScheduleUploadSchema description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The description for the imported schedule")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * The number of weeks the imported schedule will cover
   **/
  public ImportScheduleUploadSchema weekCount(Integer weekCount) {
    this.weekCount = weekCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of weeks the imported schedule will cover")
  @JsonProperty("weekCount")
  public Integer getWeekCount() {
    return weekCount;
  }
  public void setWeekCount(Integer weekCount) {
    this.weekCount = weekCount;
  }

  
  /**
   * Whether the imported schedule should be immediately published
   **/
  public ImportScheduleUploadSchema published(Boolean published) {
    this.published = published;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether the imported schedule should be immediately published")
  @JsonProperty("published")
  public Boolean getPublished() {
    return published;
  }
  public void setPublished(Boolean published) {
    this.published = published;
  }

  
  /**
   * The short term forecast to associate with the imported schedule
   **/
  public ImportScheduleUploadSchema shortTermForecast(BuShortTermForecastReference shortTermForecast) {
    this.shortTermForecast = shortTermForecast;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The short term forecast to associate with the imported schedule")
  @JsonProperty("shortTermForecast")
  public BuShortTermForecastReference getShortTermForecast() {
    return shortTermForecast;
  }
  public void setShortTermForecast(BuShortTermForecastReference shortTermForecast) {
    this.shortTermForecast = shortTermForecast;
  }

  
  /**
   * The headcount forecast to associate with the imported schedule
   **/
  public ImportScheduleUploadSchema headcountForecast(BuHeadcountForecast headcountForecast) {
    this.headcountForecast = headcountForecast;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The headcount forecast to associate with the imported schedule")
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
  public ImportScheduleUploadSchema agentSchedules(List<BuImportAgentScheduleUploadSchema> agentSchedules) {
    this.agentSchedules = agentSchedules;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Individual agent schedules")
  @JsonProperty("agentSchedules")
  public List<BuImportAgentScheduleUploadSchema> getAgentSchedules() {
    return agentSchedules;
  }
  public void setAgentSchedules(List<BuImportAgentScheduleUploadSchema> agentSchedules) {
    this.agentSchedules = agentSchedules;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImportScheduleUploadSchema importScheduleUploadSchema = (ImportScheduleUploadSchema) o;
    return Objects.equals(this.description, importScheduleUploadSchema.description) &&
        Objects.equals(this.weekCount, importScheduleUploadSchema.weekCount) &&
        Objects.equals(this.published, importScheduleUploadSchema.published) &&
        Objects.equals(this.shortTermForecast, importScheduleUploadSchema.shortTermForecast) &&
        Objects.equals(this.headcountForecast, importScheduleUploadSchema.headcountForecast) &&
        Objects.equals(this.agentSchedules, importScheduleUploadSchema.agentSchedules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, weekCount, published, shortTermForecast, headcountForecast, agentSchedules);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportScheduleUploadSchema {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    weekCount: ").append(toIndentedString(weekCount)).append("\n");
    sb.append("    published: ").append(toIndentedString(published)).append("\n");
    sb.append("    shortTermForecast: ").append(toIndentedString(shortTermForecast)).append("\n");
    sb.append("    headcountForecast: ").append(toIndentedString(headcountForecast)).append("\n");
    sb.append("    agentSchedules: ").append(toIndentedString(agentSchedules)).append("\n");
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

