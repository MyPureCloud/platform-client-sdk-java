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
import com.mypurecloud.sdk.v2.model.WfmBuScheduleTopicBuManagementUnitScheduleSummary;
import com.mypurecloud.sdk.v2.model.WfmBuScheduleTopicBuScheduleGenerationResultSummary;
import com.mypurecloud.sdk.v2.model.WfmBuScheduleTopicBuShortTermForecastReference;
import com.mypurecloud.sdk.v2.model.WfmBuScheduleTopicWfmVersionedEntityMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * WfmBuScheduleTopicBuScheduleMetadata
 */

public class WfmBuScheduleTopicBuScheduleMetadata  implements Serializable {
  
  private String id = null;
  private Integer weekCount = null;
  private String description = null;
  private Boolean published = null;
  private WfmBuScheduleTopicBuShortTermForecastReference shortTermForecast = null;
  private List<WfmBuScheduleTopicBuManagementUnitScheduleSummary> managementUnits = new ArrayList<WfmBuScheduleTopicBuManagementUnitScheduleSummary>();
  private WfmBuScheduleTopicBuScheduleGenerationResultSummary generationResults = null;
  private WfmBuScheduleTopicWfmVersionedEntityMetadata metadata = null;

  
  /**
   **/
  public WfmBuScheduleTopicBuScheduleMetadata id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   **/
  public WfmBuScheduleTopicBuScheduleMetadata weekCount(Integer weekCount) {
    this.weekCount = weekCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("weekCount")
  public Integer getWeekCount() {
    return weekCount;
  }
  public void setWeekCount(Integer weekCount) {
    this.weekCount = weekCount;
  }

  
  /**
   **/
  public WfmBuScheduleTopicBuScheduleMetadata description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   **/
  public WfmBuScheduleTopicBuScheduleMetadata published(Boolean published) {
    this.published = published;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("published")
  public Boolean getPublished() {
    return published;
  }
  public void setPublished(Boolean published) {
    this.published = published;
  }

  
  /**
   **/
  public WfmBuScheduleTopicBuScheduleMetadata shortTermForecast(WfmBuScheduleTopicBuShortTermForecastReference shortTermForecast) {
    this.shortTermForecast = shortTermForecast;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("shortTermForecast")
  public WfmBuScheduleTopicBuShortTermForecastReference getShortTermForecast() {
    return shortTermForecast;
  }
  public void setShortTermForecast(WfmBuScheduleTopicBuShortTermForecastReference shortTermForecast) {
    this.shortTermForecast = shortTermForecast;
  }

  
  /**
   **/
  public WfmBuScheduleTopicBuScheduleMetadata managementUnits(List<WfmBuScheduleTopicBuManagementUnitScheduleSummary> managementUnits) {
    this.managementUnits = managementUnits;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("managementUnits")
  public List<WfmBuScheduleTopicBuManagementUnitScheduleSummary> getManagementUnits() {
    return managementUnits;
  }
  public void setManagementUnits(List<WfmBuScheduleTopicBuManagementUnitScheduleSummary> managementUnits) {
    this.managementUnits = managementUnits;
  }

  
  /**
   **/
  public WfmBuScheduleTopicBuScheduleMetadata generationResults(WfmBuScheduleTopicBuScheduleGenerationResultSummary generationResults) {
    this.generationResults = generationResults;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("generationResults")
  public WfmBuScheduleTopicBuScheduleGenerationResultSummary getGenerationResults() {
    return generationResults;
  }
  public void setGenerationResults(WfmBuScheduleTopicBuScheduleGenerationResultSummary generationResults) {
    this.generationResults = generationResults;
  }

  
  /**
   **/
  public WfmBuScheduleTopicBuScheduleMetadata metadata(WfmBuScheduleTopicWfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("metadata")
  public WfmBuScheduleTopicWfmVersionedEntityMetadata getMetadata() {
    return metadata;
  }
  public void setMetadata(WfmBuScheduleTopicWfmVersionedEntityMetadata metadata) {
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
    WfmBuScheduleTopicBuScheduleMetadata wfmBuScheduleTopicBuScheduleMetadata = (WfmBuScheduleTopicBuScheduleMetadata) o;
    return Objects.equals(this.id, wfmBuScheduleTopicBuScheduleMetadata.id) &&
        Objects.equals(this.weekCount, wfmBuScheduleTopicBuScheduleMetadata.weekCount) &&
        Objects.equals(this.description, wfmBuScheduleTopicBuScheduleMetadata.description) &&
        Objects.equals(this.published, wfmBuScheduleTopicBuScheduleMetadata.published) &&
        Objects.equals(this.shortTermForecast, wfmBuScheduleTopicBuScheduleMetadata.shortTermForecast) &&
        Objects.equals(this.managementUnits, wfmBuScheduleTopicBuScheduleMetadata.managementUnits) &&
        Objects.equals(this.generationResults, wfmBuScheduleTopicBuScheduleMetadata.generationResults) &&
        Objects.equals(this.metadata, wfmBuScheduleTopicBuScheduleMetadata.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, weekCount, description, published, shortTermForecast, managementUnits, generationResults, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmBuScheduleTopicBuScheduleMetadata {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    weekCount: ").append(toIndentedString(weekCount)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    published: ").append(toIndentedString(published)).append("\n");
    sb.append("    shortTermForecast: ").append(toIndentedString(shortTermForecast)).append("\n");
    sb.append("    managementUnits: ").append(toIndentedString(managementUnits)).append("\n");
    sb.append("    generationResults: ").append(toIndentedString(generationResults)).append("\n");
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

