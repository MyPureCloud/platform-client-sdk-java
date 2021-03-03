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
import com.mypurecloud.sdk.v2.model.HeadcountForecast;
import com.mypurecloud.sdk.v2.model.ShortTermForecastReference;
import com.mypurecloud.sdk.v2.model.UserSchedule;
import com.mypurecloud.sdk.v2.model.WeekScheduleGenerationResult;
import com.mypurecloud.sdk.v2.model.WfmVersionedEntityMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * Week schedule information
 */
@ApiModel(description = "Week schedule information")

public class WeekSchedule  implements Serializable {
  
  private String id = null;
  private String selfUri = null;
  private String weekDate = null;
  private String description = null;
  private Boolean published = null;
  private WeekScheduleGenerationResult generationResults = null;
  private ShortTermForecastReference shortTermForecast = null;
  private WfmVersionedEntityMetadata metadata = null;
  private Map<String, UserSchedule> userSchedules = null;
  private HeadcountForecast headcountForecast = null;
  private Integer agentSchedulesVersion = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }

  
  /**
   * First day of this week schedule in yyyy-MM-dd format
   **/
  public WeekSchedule weekDate(String weekDate) {
    this.weekDate = weekDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "First day of this week schedule in yyyy-MM-dd format")
  @JsonProperty("weekDate")
  public String getWeekDate() {
    return weekDate;
  }
  public void setWeekDate(String weekDate) {
    this.weekDate = weekDate;
  }

  
  /**
   * Description of the week schedule
   **/
  public WeekSchedule description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Description of the week schedule")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * Whether the week schedule is published
   **/
  public WeekSchedule published(Boolean published) {
    this.published = published;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether the week schedule is published")
  @JsonProperty("published")
  public Boolean getPublished() {
    return published;
  }
  public void setPublished(Boolean published) {
    this.published = published;
  }

  
  /**
   * Summary of the results from the schedule run
   **/
  public WeekSchedule generationResults(WeekScheduleGenerationResult generationResults) {
    this.generationResults = generationResults;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Summary of the results from the schedule run")
  @JsonProperty("generationResults")
  public WeekScheduleGenerationResult getGenerationResults() {
    return generationResults;
  }
  public void setGenerationResults(WeekScheduleGenerationResult generationResults) {
    this.generationResults = generationResults;
  }

  
  /**
   * Short term forecast associated with this schedule
   **/
  public WeekSchedule shortTermForecast(ShortTermForecastReference shortTermForecast) {
    this.shortTermForecast = shortTermForecast;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Short term forecast associated with this schedule")
  @JsonProperty("shortTermForecast")
  public ShortTermForecastReference getShortTermForecast() {
    return shortTermForecast;
  }
  public void setShortTermForecast(ShortTermForecastReference shortTermForecast) {
    this.shortTermForecast = shortTermForecast;
  }

  
  /**
   * Version metadata for this work plan
   **/
  public WeekSchedule metadata(WfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Version metadata for this work plan")
  @JsonProperty("metadata")
  public WfmVersionedEntityMetadata getMetadata() {
    return metadata;
  }
  public void setMetadata(WfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
  }

  
  /**
   * User schedules in the week
   **/
  public WeekSchedule userSchedules(Map<String, UserSchedule> userSchedules) {
    this.userSchedules = userSchedules;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "User schedules in the week")
  @JsonProperty("userSchedules")
  public Map<String, UserSchedule> getUserSchedules() {
    return userSchedules;
  }
  public void setUserSchedules(Map<String, UserSchedule> userSchedules) {
    this.userSchedules = userSchedules;
  }

  
  /**
   * Headcount information for the week schedule
   **/
  public WeekSchedule headcountForecast(HeadcountForecast headcountForecast) {
    this.headcountForecast = headcountForecast;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Headcount information for the week schedule")
  @JsonProperty("headcountForecast")
  public HeadcountForecast getHeadcountForecast() {
    return headcountForecast;
  }
  public void setHeadcountForecast(HeadcountForecast headcountForecast) {
    this.headcountForecast = headcountForecast;
  }

  
  /**
   * Version of agent schedules in the week schedule
   **/
  public WeekSchedule agentSchedulesVersion(Integer agentSchedulesVersion) {
    this.agentSchedulesVersion = agentSchedulesVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Version of agent schedules in the week schedule")
  @JsonProperty("agentSchedulesVersion")
  public Integer getAgentSchedulesVersion() {
    return agentSchedulesVersion;
  }
  public void setAgentSchedulesVersion(Integer agentSchedulesVersion) {
    this.agentSchedulesVersion = agentSchedulesVersion;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WeekSchedule weekSchedule = (WeekSchedule) o;
    return Objects.equals(this.id, weekSchedule.id) &&
        Objects.equals(this.selfUri, weekSchedule.selfUri) &&
        Objects.equals(this.weekDate, weekSchedule.weekDate) &&
        Objects.equals(this.description, weekSchedule.description) &&
        Objects.equals(this.published, weekSchedule.published) &&
        Objects.equals(this.generationResults, weekSchedule.generationResults) &&
        Objects.equals(this.shortTermForecast, weekSchedule.shortTermForecast) &&
        Objects.equals(this.metadata, weekSchedule.metadata) &&
        Objects.equals(this.userSchedules, weekSchedule.userSchedules) &&
        Objects.equals(this.headcountForecast, weekSchedule.headcountForecast) &&
        Objects.equals(this.agentSchedulesVersion, weekSchedule.agentSchedulesVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, selfUri, weekDate, description, published, generationResults, shortTermForecast, metadata, userSchedules, headcountForecast, agentSchedulesVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WeekSchedule {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
    sb.append("    weekDate: ").append(toIndentedString(weekDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    published: ").append(toIndentedString(published)).append("\n");
    sb.append("    generationResults: ").append(toIndentedString(generationResults)).append("\n");
    sb.append("    shortTermForecast: ").append(toIndentedString(shortTermForecast)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    userSchedules: ").append(toIndentedString(userSchedules)).append("\n");
    sb.append("    headcountForecast: ").append(toIndentedString(headcountForecast)).append("\n");
    sb.append("    agentSchedulesVersion: ").append(toIndentedString(agentSchedulesVersion)).append("\n");
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

