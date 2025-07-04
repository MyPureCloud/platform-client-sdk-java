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
import com.mypurecloud.sdk.v2.model.BuShortTermForecastReference;
import com.mypurecloud.sdk.v2.model.ScheduleGenerationResultSummary;
import com.mypurecloud.sdk.v2.model.WfmVersionedEntityMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;

import java.io.Serializable;
/**
 * BuScheduleListItem
 */

public class BuScheduleListItem  implements Serializable {
  
  private String id = null;
  private LocalDate weekDate = null;
  private Integer weekCount = null;
  private String description = null;
  private Boolean published = null;
  private BuShortTermForecastReference shortTermForecast = null;
  private ScheduleGenerationResultSummary generationResults = null;
  private WfmVersionedEntityMetadata metadata = null;
  private String selfUri = null;

  public BuScheduleListItem() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The ID of the schedule
   **/
  public BuScheduleListItem id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of the schedule")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * The start week date for this schedule. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public BuScheduleListItem weekDate(LocalDate weekDate) {
    this.weekDate = weekDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The start week date for this schedule. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("weekDate")
  public LocalDate getWeekDate() {
    return weekDate;
  }
  public void setWeekDate(LocalDate weekDate) {
    this.weekDate = weekDate;
  }


  /**
   * The number of weeks spanned by this schedule
   **/
  public BuScheduleListItem weekCount(Integer weekCount) {
    this.weekCount = weekCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of weeks spanned by this schedule")
  @JsonProperty("weekCount")
  public Integer getWeekCount() {
    return weekCount;
  }
  public void setWeekCount(Integer weekCount) {
    this.weekCount = weekCount;
  }


  /**
   * The description of this schedule
   **/
  public BuScheduleListItem description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The description of this schedule")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * Whether this schedule is published
   **/
  public BuScheduleListItem published(Boolean published) {
    this.published = published;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether this schedule is published")
  @JsonProperty("published")
  public Boolean getPublished() {
    return published;
  }
  public void setPublished(Boolean published) {
    this.published = published;
  }


  /**
   * The forecast used for this schedule, if applicable
   **/
  public BuScheduleListItem shortTermForecast(BuShortTermForecastReference shortTermForecast) {
    this.shortTermForecast = shortTermForecast;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The forecast used for this schedule, if applicable")
  @JsonProperty("shortTermForecast")
  public BuShortTermForecastReference getShortTermForecast() {
    return shortTermForecast;
  }
  public void setShortTermForecast(BuShortTermForecastReference shortTermForecast) {
    this.shortTermForecast = shortTermForecast;
  }


  /**
   * Generation result summary for this schedule, if applicable
   **/
  public BuScheduleListItem generationResults(ScheduleGenerationResultSummary generationResults) {
    this.generationResults = generationResults;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Generation result summary for this schedule, if applicable")
  @JsonProperty("generationResults")
  public ScheduleGenerationResultSummary getGenerationResults() {
    return generationResults;
  }
  public void setGenerationResults(ScheduleGenerationResultSummary generationResults) {
    this.generationResults = generationResults;
  }


  /**
   * Version metadata for this schedule
   **/
  public BuScheduleListItem metadata(WfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Version metadata for this schedule")
  @JsonProperty("metadata")
  public WfmVersionedEntityMetadata getMetadata() {
    return metadata;
  }
  public void setMetadata(WfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
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
    BuScheduleListItem buScheduleListItem = (BuScheduleListItem) o;

    return Objects.equals(this.id, buScheduleListItem.id) &&
            Objects.equals(this.weekDate, buScheduleListItem.weekDate) &&
            Objects.equals(this.weekCount, buScheduleListItem.weekCount) &&
            Objects.equals(this.description, buScheduleListItem.description) &&
            Objects.equals(this.published, buScheduleListItem.published) &&
            Objects.equals(this.shortTermForecast, buScheduleListItem.shortTermForecast) &&
            Objects.equals(this.generationResults, buScheduleListItem.generationResults) &&
            Objects.equals(this.metadata, buScheduleListItem.metadata) &&
            Objects.equals(this.selfUri, buScheduleListItem.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, weekDate, weekCount, description, published, shortTermForecast, generationResults, metadata, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuScheduleListItem {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    weekDate: ").append(toIndentedString(weekDate)).append("\n");
    sb.append("    weekCount: ").append(toIndentedString(weekCount)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    published: ").append(toIndentedString(published)).append("\n");
    sb.append("    shortTermForecast: ").append(toIndentedString(shortTermForecast)).append("\n");
    sb.append("    generationResults: ").append(toIndentedString(generationResults)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

